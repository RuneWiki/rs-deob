import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("DRRJWDRT")
public class class16 {

    @OriginalMember(owner = "DRRJWDRT", name = "a", descriptor = "I")
    private int field642 = 148;

    @OriginalMember(owner = "DRRJWDRT", name = "b", descriptor = "I")
    private int field643 = -34888;

    @OriginalMember(owner = "DRRJWDRT", name = "c", descriptor = "[I")
    public int[] field644 = new int[2];

    @OriginalMember(owner = "DRRJWDRT", name = "d", descriptor = "[[[I")
    public int[][][] field645 = new int[2][2][4];

    @OriginalMember(owner = "DRRJWDRT", name = "e", descriptor = "[[[I")
    public int[][][] field646 = new int[2][2][4];

    @OriginalMember(owner = "DRRJWDRT", name = "f", descriptor = "[I")
    public int[] field647 = new int[2];

    @OriginalMember(owner = "DRRJWDRT", name = "g", descriptor = "[[F")
    public static float[][] field648 = new float[2][8];

    @OriginalMember(owner = "DRRJWDRT", name = "h", descriptor = "[[I")
    public static int[][] field649 = new int[2][8];

    @OriginalMember(owner = "DRRJWDRT", name = "i", descriptor = "F")
    public static float field650;

    @OriginalMember(owner = "DRRJWDRT", name = "j", descriptor = "I")
    public static int field651;

    @OriginalMember(owner = "DRRJWDRT", name = "a", descriptor = "(IFII)F")
    private float method259(int arg0, float arg1, int arg2, int arg3) {
        float var5 = (float) (this.field646[arg0][1][arg3] - this.field646[arg0][0][arg3]) * arg1 + (float) this.field646[arg0][0][arg3];
        if (arg2 <= 0) {
            this.field643 = 62;
        }
        float var6 = var5 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var6 / 20.0F));
    }

    @OriginalMember(owner = "DRRJWDRT", name = "a", descriptor = "(FI)F")
    private float method260(float arg0, int arg1) {
        float var3 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
        int var4 = 84 / arg1;
        return var3 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "DRRJWDRT", name = "a", descriptor = "(IIIF)F")
    private float method261(int arg0, int arg1, int arg2, float arg3) {
        if (arg1 != 8) {
            throw new NullPointerException();
        }
        float var5 = (float) (this.field645[arg0][1][arg2] - this.field645[arg0][0][arg2]) * arg3 + (float) this.field645[arg0][0][arg2];
        float var6 = var5 * 1.2207031E-4F;
        return this.method260(var6, 187);
    }

    @OriginalMember(owner = "DRRJWDRT", name = "a", descriptor = "(ZIF)I")
    public int method262(boolean arg0, int arg1, float arg2) {
        if (arg1 == 0) {
            float var4 = (float) (this.field647[1] - this.field647[0]) * arg2 + (float) this.field647[0];
            float var5 = var4 * 0.0030517578F;
            field650 = (float) Math.pow(0.1D, (double) (var5 / 20.0F));
            field651 = (int) (field650 * 65536.0F);
        }
        if (this.field644[arg1] == 0) {
            return 0;
        }
        float var6 = this.method259(arg1, arg2, 148, 0);
        if (!arg0) {
            return 3;
        }
        field648[arg1][0] = var6 * -2.0F * (float) Math.cos((double) this.method261(arg1, 8, 0, arg2));
        field648[arg1][1] = var6 * var6;
        for (int var7 = 1; var7 < this.field644[arg1]; var7++) {
            float var10 = this.method259(arg1, arg2, 148, var7);
            float var11 = var10 * -2.0F * (float) Math.cos((double) this.method261(arg1, 8, var7, arg2));
            float var12 = var10 * var10;
            field648[arg1][var7 * 2 + 1] = field648[arg1][var7 * 2 - 1] * var12;
            field648[arg1][var7 * 2] = field648[arg1][var7 * 2 - 1] * var11 + field648[arg1][var7 * 2 - 2] * var12;
            for (int var13 = var7 * 2 - 1; var13 >= 2; var13--) {
                field648[arg1][var13] += field648[arg1][var13 - 1] * var11 + field648[arg1][var13 - 2] * var12;
            }
            field648[arg1][1] += field648[arg1][0] * var11 + var12;
            field648[arg1][0] += var11;
        }
        if (arg1 == 0) {
            for (int var8 = 0; var8 < this.field644[0] * 2; var8++) {
                field648[0][var8] *= field650;
            }
        }
        for (int var9 = 0; var9 < this.field644[arg1] * 2; var9++) {
            field649[arg1][var9] = (int) (field648[arg1][var9] * 65536.0F);
        }
        return this.field644[arg1] * 2;
    }

    @OriginalMember(owner = "DRRJWDRT", name = "a", descriptor = "(LDNFIVRJB;BLCFARFRSG;)V")
    public final void method263(class15 arg0, byte arg1, class8 arg2) {
        int var4 = arg2.method30();
        this.field644[0] = var4 >> 4;
        this.field644[1] = var4 & 0xF;
        if (arg1 != 5) {
            return;
        }
        boolean var5 = false;
        if (var4 == 0) {
            this.field647[0] = this.field647[1] = 0;
            return;
        }
        this.field647[0] = arg2.method32();
        this.field647[1] = arg2.method32();
        int var6 = arg2.method30();
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var10 = 0; var10 < this.field644[var7]; var10++) {
                this.field645[var7][0][var10] = arg2.method32();
                this.field646[var7][0][var10] = arg2.method32();
            }
        }
        for (int var8 = 0; var8 < 2; var8++) {
            for (int var9 = 0; var9 < this.field644[var8]; var9++) {
                if ((var6 & 0x1 << var8 * 4 << var9) == 0) {
                    this.field645[var8][1][var9] = this.field645[var8][0][var9];
                    this.field646[var8][1][var9] = this.field646[var8][0][var9];
                } else {
                    this.field645[var8][1][var9] = arg2.method32();
                    this.field646[var8][1][var9] = arg2.method32();
                }
            }
        }
        if (var6 != 0 || this.field647[1] != this.field647[0]) {
            arg0.method256(29122, arg2);
        }
    }

    @OriginalMember(owner = "DRRJWDRT", name = "<init>", descriptor = "()V")
    public class16() {
        if (class67.field1668) {
        }
    }
}
