import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!IOYFKQTX")
public class class29 {

    @OriginalMember(owner = "client!IOYFKQTX", name = "a", descriptor = "I")
    private int field985 = 47998;

    @OriginalMember(owner = "client!IOYFKQTX", name = "b", descriptor = "I")
    private int field986 = 5230;

    @OriginalMember(owner = "client!IOYFKQTX", name = "c", descriptor = "I")
    private int field987 = 4235;

    @OriginalMember(owner = "client!IOYFKQTX", name = "d", descriptor = "[I")
    public int[] field988 = new int[2];

    @OriginalMember(owner = "client!IOYFKQTX", name = "e", descriptor = "[[[I")
    public int[][][] field989 = new int[2][2][4];

    @OriginalMember(owner = "client!IOYFKQTX", name = "f", descriptor = "[[[I")
    public int[][][] field990 = new int[2][2][4];

    @OriginalMember(owner = "client!IOYFKQTX", name = "g", descriptor = "[I")
    public int[] field991 = new int[2];

    @OriginalMember(owner = "client!IOYFKQTX", name = "h", descriptor = "[[F")
    public static float[][] field992 = new float[2][8];

    @OriginalMember(owner = "client!IOYFKQTX", name = "i", descriptor = "[[I")
    public static int[][] field993 = new int[2][8];

    @OriginalMember(owner = "client!IOYFKQTX", name = "j", descriptor = "F")
    public static float field994;

    @OriginalMember(owner = "client!IOYFKQTX", name = "k", descriptor = "I")
    public static int field995;

    @OriginalMember(owner = "client!IOYFKQTX", name = "a", descriptor = "(IIIF)F")
    private float method361(int arg0, int arg1, int arg2, float arg3) {
        float var5 = (float) (this.field990[arg2][1][arg0] - this.field990[arg2][0][arg0]) * arg3 + (float) this.field990[arg2][0][arg0];
        float var6 = var5 * 0.0015258789F;
        if (this.field987 != arg1) {
            this.field987 = 305;
        }
        return 1.0F - (float) Math.pow(10.0D, (double) (-var6 / 20.0F));
    }

    @OriginalMember(owner = "client!IOYFKQTX", name = "a", descriptor = "(BF)F")
    private float method362(byte arg0, float arg1) {
        float var3 = (float) Math.pow(2.0D, (double) arg1) * 32.703197F;
        if (arg0 != 46) {
            throw new NullPointerException();
        }
        return var3 * 3.1415927F / 11025.0F;
    }

    @OriginalMember(owner = "client!IOYFKQTX", name = "a", descriptor = "(IIZF)F")
    private float method363(int arg0, int arg1, boolean arg2, float arg3) {
        float var5 = (float) (this.field989[arg1][1][arg0] - this.field989[arg1][0][arg0]) * arg3 + (float) this.field989[arg1][0][arg0];
        float var6 = var5 * 1.2207031E-4F;
        if (arg2) {
            this.field985 = 211;
        }
        return this.method362((byte) 46, var6);
    }

    @OriginalMember(owner = "client!IOYFKQTX", name = "a", descriptor = "(IFI)I")
    public int method364(int arg0, float arg1, int arg2) {
        if (arg0 == 0) {
            float var4 = (float) (this.field991[1] - this.field991[0]) * arg1 + (float) this.field991[0];
            float var5 = var4 * 0.0030517578F;
            field994 = (float) Math.pow(0.1D, (double) (var5 / 20.0F));
            field995 = (int) (field994 * 65536.0F);
        }
        if (this.field988[arg0] == 0) {
            return 0;
        }
        float var6 = this.method361(0, 4235, arg0, arg1);
        if (arg2 <= 0) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        field992[arg0][0] = var6 * -2.0F * (float) Math.cos((double) this.method363(0, arg0, false, arg1));
        field992[arg0][1] = var6 * var6;
        for (int var8 = 1; var8 < this.field988[arg0]; var8++) {
            float var11 = this.method361(var8, 4235, arg0, arg1);
            float var12 = var11 * -2.0F * (float) Math.cos((double) this.method363(var8, arg0, false, arg1));
            float var13 = var11 * var11;
            field992[arg0][var8 * 2 + 1] = field992[arg0][var8 * 2 - 1] * var13;
            field992[arg0][var8 * 2] = field992[arg0][var8 * 2 - 1] * var12 + field992[arg0][var8 * 2 - 2] * var13;
            for (int var14 = var8 * 2 - 1; var14 >= 2; var14--) {
                field992[arg0][var14] += field992[arg0][var14 - 1] * var12 + field992[arg0][var14 - 2] * var13;
            }
            field992[arg0][1] += field992[arg0][0] * var12 + var13;
            field992[arg0][0] += var12;
        }
        if (arg0 == 0) {
            for (int var9 = 0; var9 < this.field988[0] * 2; var9++) {
                field992[0][var9] *= field994;
            }
        }
        for (int var10 = 0; var10 < this.field988[arg0] * 2; var10++) {
            field993[arg0][var10] = (int) (field992[arg0][var10] * 65536.0F);
        }
        return this.field988[arg0] * 2;
    }

    @OriginalMember(owner = "client!IOYFKQTX", name = "a", descriptor = "(LANPSASQF;LEYMNCFMK;I)V")
    public final void method365(class2 arg0, class18 arg1, int arg2) {
        if (arg2 != 24145) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        int var5 = arg1.method239();
        this.field988[0] = var5 >> 4;
        this.field988[1] = var5 & 0xF;
        if (var5 == 0) {
            this.field991[0] = this.field991[1] = 0;
            return;
        }
        this.field991[0] = arg1.method241();
        this.field991[1] = arg1.method241();
        int var6 = arg1.method239();
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var10 = 0; var10 < this.field988[var7]; var10++) {
                this.field989[var7][0][var10] = arg1.method241();
                this.field990[var7][0][var10] = arg1.method241();
            }
        }
        for (int var8 = 0; var8 < 2; var8++) {
            for (int var9 = 0; var9 < this.field988[var8]; var9++) {
                if ((var6 & 0x1 << var8 * 4 << var9) == 0) {
                    this.field989[var8][1][var9] = this.field989[var8][0][var9];
                    this.field990[var8][1][var9] = this.field990[var8][0][var9];
                } else {
                    this.field989[var8][1][var9] = arg1.method241();
                    this.field990[var8][1][var9] = arg1.method241();
                }
            }
        }
        if (var6 != 0 || this.field991[1] != this.field991[0]) {
            arg0.method4(arg1, this.field986);
        }
    }

    @OriginalMember(owner = "client!IOYFKQTX", name = "<init>", descriptor = "()V")
    public class29() {
        if (class13.field714) {
        }
    }
}
