import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("IIXKZWNC")
public class class32 {

    @OriginalMember(owner = "IIXKZWNC", name = "a", descriptor = "Z")
    private boolean field1075 = false;

    @OriginalMember(owner = "IIXKZWNC", name = "b", descriptor = "I")
    private int field1076 = 798;

    @OriginalMember(owner = "IIXKZWNC", name = "c", descriptor = "I")
    private int field1077 = 23;

    @OriginalMember(owner = "IIXKZWNC", name = "d", descriptor = "I")
    private int field1078 = 23;

    @OriginalMember(owner = "IIXKZWNC", name = "e", descriptor = "[I")
    public int[] field1079 = new int[2];

    @OriginalMember(owner = "IIXKZWNC", name = "f", descriptor = "[[[I")
    public int[][][] field1080 = new int[2][2][4];

    @OriginalMember(owner = "IIXKZWNC", name = "g", descriptor = "[[[I")
    public int[][][] field1081 = new int[2][2][4];

    @OriginalMember(owner = "IIXKZWNC", name = "h", descriptor = "[I")
    public int[] field1082 = new int[2];

    @OriginalMember(owner = "IIXKZWNC", name = "i", descriptor = "[[F")
    public static float[][] field1083 = new float[2][8];

    @OriginalMember(owner = "IIXKZWNC", name = "j", descriptor = "[[I")
    public static int[][] field1084 = new int[2][8];

    @OriginalMember(owner = "IIXKZWNC", name = "k", descriptor = "F")
    public static float field1085;

    @OriginalMember(owner = "IIXKZWNC", name = "l", descriptor = "I")
    public static int field1086;

    @OriginalMember(owner = "IIXKZWNC", name = "a", descriptor = "(FIII)F")
    private float method394(float arg0, int arg1, int arg2, int arg3) {
        int var5 = 18 / arg3;
        float var6 = (float) (this.field1081[arg2][1][arg1] - this.field1081[arg2][0][arg1]) * arg0 + (float) this.field1081[arg2][0][arg1];
        float var7 = var6 * 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, (double) (-var7 / 20.0F));
    }

    @OriginalMember(owner = "IIXKZWNC", name = "a", descriptor = "(IF)F")
    private float method395(int arg0, float arg1) {
        float var3 = (float) Math.pow(2.0D, (double) arg1) * 32.703197F;
        if (this.field1078 != arg0) {
            this.field1075 = !this.field1075;
        }
        return var3 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "IIXKZWNC", name = "a", descriptor = "(IFII)F")
    private float method396(int arg0, float arg1, int arg2, int arg3) {
        float var5 = (float) (this.field1080[arg3][1][arg2] - this.field1080[arg3][0][arg2]) * arg1 + (float) this.field1080[arg3][0][arg2];
        float var6 = var5 * 1.2207031E-4F;
        if (arg0 != -37121) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        return this.method395(this.field1077, var6);
    }

    @OriginalMember(owner = "IIXKZWNC", name = "a", descriptor = "(FZI)I")
    public int method397(float arg0, boolean arg1, int arg2) {
        if (arg2 == 0) {
            float var4 = (float) (this.field1082[1] - this.field1082[0]) * arg0 + (float) this.field1082[0];
            float var5 = var4 * 0.0030517578F;
            field1085 = (float) Math.pow(0.1D, (double) (var5 / 20.0F));
            field1086 = (int) (field1085 * 65536.0F);
        }
        if (this.field1079[arg2] == 0) {
            return 0;
        }
        float var6 = this.method394(arg0, 0, arg2, 798);
        if (!arg1) {
            this.field1075 = !this.field1075;
        }
        field1083[arg2][0] = var6 * -2.0F * (float) Math.cos((double) this.method396(-37121, arg0, 0, arg2));
        field1083[arg2][1] = var6 * var6;
        for (int var7 = 1; var7 < this.field1079[arg2]; var7++) {
            float var10 = this.method394(arg0, var7, arg2, 798);
            float var11 = var10 * -2.0F * (float) Math.cos((double) this.method396(-37121, arg0, var7, arg2));
            float var12 = var10 * var10;
            field1083[arg2][var7 * 2 + 1] = field1083[arg2][var7 * 2 - 1] * var12;
            field1083[arg2][var7 * 2] = field1083[arg2][var7 * 2 - 1] * var11 + field1083[arg2][var7 * 2 - 2] * var12;
            for (int var13 = var7 * 2 - 1; var13 >= 2; var13--) {
                field1083[arg2][var13] += field1083[arg2][var13 - 1] * var11 + field1083[arg2][var13 - 2] * var12;
            }
            field1083[arg2][1] += field1083[arg2][0] * var11 + var12;
            field1083[arg2][0] += var11;
        }
        if (arg2 == 0) {
            for (int var8 = 0; var8 < this.field1079[0] * 2; var8++) {
                field1083[0][var8] *= field1085;
            }
        }
        for (int var9 = 0; var9 < this.field1079[arg2] * 2; var9++) {
            field1084[arg2][var9] = (int) (field1083[arg2][var9] * 65536.0F);
        }
        return this.field1079[arg2] * 2;
    }

    @OriginalMember(owner = "IIXKZWNC", name = "a", descriptor = "(LVQRBOQUI;ILCKBTFRZM;)V")
    public final void method398(class67 arg0, int arg1, class5 arg2) {
        int var4 = arg2.method44();
        this.field1079[0] = var4 >> 4;
        this.field1079[1] = var4 & 0xF;
        if (arg1 >= 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        if (var4 == 0) {
            this.field1082[0] = this.field1082[1] = 0;
            return;
        }
        this.field1082[0] = arg2.method46();
        this.field1082[1] = arg2.method46();
        int var6 = arg2.method44();
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var10 = 0; var10 < this.field1079[var7]; var10++) {
                this.field1080[var7][0][var10] = arg2.method46();
                this.field1081[var7][0][var10] = arg2.method46();
            }
        }
        for (int var8 = 0; var8 < 2; var8++) {
            for (int var9 = 0; var9 < this.field1079[var8]; var9++) {
                if ((var6 & 0x1 << var8 * 4 << var9) == 0) {
                    this.field1080[var8][1][var9] = this.field1080[var8][0][var9];
                    this.field1081[var8][1][var9] = this.field1081[var8][0][var9];
                } else {
                    this.field1080[var8][1][var9] = arg2.method46();
                    this.field1081[var8][1][var9] = arg2.method46();
                }
            }
        }
        if (var6 != 0 || this.field1082[1] != this.field1082[0]) {
            arg0.method579(7, arg2);
        }
    }

    @OriginalMember(owner = "IIXKZWNC", name = "<init>", descriptor = "()V")
    public class32() {
        if (class45.field1265) {
        }
    }
}
