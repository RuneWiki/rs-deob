import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("dc")
public class Tone {

    @OriginalMember(owner = "dc", name = "i", descriptor = "[I")
    private int[] field894 = new int[5];

    @OriginalMember(owner = "dc", name = "j", descriptor = "[I")
    private int[] field895 = new int[5];

    @OriginalMember(owner = "dc", name = "k", descriptor = "[I")
    private int[] field896 = new int[5];

    @OriginalMember(owner = "dc", name = "m", descriptor = "I")
    private int field898 = 100;

    @OriginalMember(owner = "dc", name = "n", descriptor = "I")
    public int field899 = 500;

    @OriginalMember(owner = "dc", name = "s", descriptor = "[I")
    private static int[] field904 = new int[5];

    @OriginalMember(owner = "dc", name = "t", descriptor = "[I")
    private static int[] field905 = new int[5];

    @OriginalMember(owner = "dc", name = "u", descriptor = "[I")
    private static int[] field906 = new int[5];

    @OriginalMember(owner = "dc", name = "v", descriptor = "[I")
    private static int[] field907 = new int[5];

    @OriginalMember(owner = "dc", name = "w", descriptor = "[I")
    private static int[] field908 = new int[5];

    @OriginalMember(owner = "dc", name = "l", descriptor = "I")
    private int field897;

    @OriginalMember(owner = "dc", name = "o", descriptor = "I")
    public int field900;

    @OriginalMember(owner = "dc", name = "x", descriptor = "I")
    public static int field909;

    @OriginalMember(owner = "dc", name = "a", descriptor = "Lbc;")
    private Envelope field886;

    @OriginalMember(owner = "dc", name = "b", descriptor = "Lbc;")
    private Envelope field887;

    @OriginalMember(owner = "dc", name = "c", descriptor = "Lbc;")
    private Envelope field888;

    @OriginalMember(owner = "dc", name = "d", descriptor = "Lbc;")
    private Envelope field889;

    @OriginalMember(owner = "dc", name = "e", descriptor = "Lbc;")
    private Envelope field890;

    @OriginalMember(owner = "dc", name = "f", descriptor = "Lbc;")
    private Envelope field891;

    @OriginalMember(owner = "dc", name = "g", descriptor = "Lbc;")
    private Envelope field892;

    @OriginalMember(owner = "dc", name = "h", descriptor = "Lbc;")
    private Envelope field893;

    @OriginalMember(owner = "dc", name = "p", descriptor = "[I")
    private static int[] field901;

    @OriginalMember(owner = "dc", name = "q", descriptor = "[I")
    private static int[] field902;

    @OriginalMember(owner = "dc", name = "r", descriptor = "[I")
    private static int[] field903;

    @OriginalMember(owner = "dc", name = "a", descriptor = "()V")
    public static final void method318() {
        field902 = new int[32768];
        for (int var0 = 0; var0 < 32768; var0++) {
            if (Math.random() > 0.5D) {
                field902[var0] = 1;
            } else {
                field902[var0] = -1;
            }
        }
        field903 = new int[32768];
        for (int var1 = 0; var1 < 32768; var1++) {
            field903[var1] = (int) (Math.sin((double) var1 / 5215.1903D) * 16384.0D);
        }
        field901 = new int[220500];
    }

    @OriginalMember(owner = "dc", name = "a", descriptor = "(II)[I")
    public final int[] method319(int arg0, int arg1) {
        for (int var3 = 0; var3 < arg0; var3++) {
            field901[var3] = 0;
        }
        if (arg1 < 10) {
            return field901;
        }
        double var4 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field886.method310(true);
        this.field887.method310(true);
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (this.field888 != null) {
            this.field888.method310(true);
            this.field889.method310(true);
            var6 = (int) ((double) (this.field888.field870 - this.field888.field869) * 32.768D / var4);
            var7 = (int) ((double) this.field888.field869 * 32.768D / var4);
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (this.field890 != null) {
            this.field890.method310(true);
            this.field891.method310(true);
            var9 = (int) ((double) (this.field890.field870 - this.field890.field869) * 32.768D / var4);
            var10 = (int) ((double) this.field890.field869 * 32.768D / var4);
        }
        for (int var12 = 0; var12 < 5; var12++) {
            if (this.field894[var12] != 0) {
                field904[var12] = 0;
                field905[var12] = (int) ((double) this.field896[var12] * var4);
                field906[var12] = (this.field894[var12] << 14) / 100;
                field907[var12] = (int) ((double) (this.field886.field870 - this.field886.field869) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field895[var12]) / var4);
                field908[var12] = (int) ((double) this.field886.field869 * 32.768D / var4);
            }
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            int var24 = this.field886.method311(0, arg0);
            int var25 = this.field887.method311(0, arg0);
            if (this.field888 != null) {
                int var26 = this.field888.method311(0, arg0);
                int var27 = this.field889.method311(0, arg0);
                var24 += this.method320(var8, true, var27, this.field888.field871) >> 1;
                var8 += (var6 * var26 >> 16) + var7;
            }
            if (this.field890 != null) {
                int var28 = this.field890.method311(0, arg0);
                int var29 = this.field891.method311(0, arg0);
                var25 = var25 * ((this.method320(var11, true, var29, this.field890.field871) >> 1) + 32768) >> 15;
                var11 += (var9 * var28 >> 16) + var10;
            }
            for (int var30 = 0; var30 < 5; var30++) {
                if (this.field894[var30] != 0) {
                    int var31 = field905[var30] + var13;
                    if (var31 < arg0) {
                        field901[var31] += this.method320(field904[var30], true, field906[var30] * var25 >> 15, this.field886.field871);
                        field904[var30] += (field907[var30] * var24 >> 16) + field908[var30];
                    }
                }
            }
        }
        if (this.field892 != null) {
            this.field892.method310(true);
            this.field893.method310(true);
            int var14 = 0;
            boolean var15 = false;
            boolean var16 = true;
            for (int var17 = 0; var17 < arg0; var17++) {
                int var18 = this.field892.method311(0, arg0);
                int var19 = this.field893.method311(0, arg0);
                int var20;
                if (var16) {
                    var20 = ((this.field892.field870 - this.field892.field869) * var18 >> 8) + this.field892.field869;
                } else {
                    var20 = ((this.field892.field870 - this.field892.field869) * var19 >> 8) + this.field892.field869;
                }
                var14 += 256;
                if (var14 >= var20) {
                    var14 = 0;
                    var16 = !var16;
                }
                if (var16) {
                    field901[var17] = 0;
                }
            }
        }
        if (this.field897 > 0 && this.field898 > 0) {
            int var21 = (int) ((double) this.field897 * var4);
            for (int var22 = var21; var22 < arg0; var22++) {
                field901[var22] += field901[var22 - var21] * this.field898 / 100;
            }
        }
        for (int var23 = 0; var23 < arg0; var23++) {
            if (field901[var23] < -32768) {
                field901[var23] = -32768;
            }
            if (field901[var23] > 32767) {
                field901[var23] = 32767;
            }
        }
        return field901;
    }

    @OriginalMember(owner = "dc", name = "a", descriptor = "(IZII)I")
    private final int method320(int arg0, boolean arg1, int arg2, int arg3) {
        if (!arg1) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        if (arg3 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg2 : -arg2;
        } else if (arg3 == 2) {
            return field903[arg0 & 0x7FFF] * arg2 >> 14;
        } else if (arg3 == 3) {
            return ((arg0 & 0x7FFF) * arg2 >> 14) - arg2;
        } else if (arg3 == 4) {
            return field902[arg0 / 2607 & 0x7FFF] * arg2;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "dc", name = "a", descriptor = "(ILmb;)V")
    public final void method321(int arg0, Packet arg1) {
        if (arg0 != 3251) {
            throw new NullPointerException();
        }
        this.field886 = new Envelope();
        this.field886.method309(3251, arg1);
        this.field887 = new Envelope();
        this.field887.method309(3251, arg1);
        int var3 = arg1.method231();
        if (var3 != 0) {
            arg1.field698--;
            this.field888 = new Envelope();
            this.field888.method309(3251, arg1);
            this.field889 = new Envelope();
            this.field889.method309(3251, arg1);
        }
        int var4 = arg1.method231();
        if (var4 != 0) {
            arg1.field698--;
            this.field890 = new Envelope();
            this.field890.method309(3251, arg1);
            this.field891 = new Envelope();
            this.field891.method309(3251, arg1);
        }
        int var5 = arg1.method231();
        if (var5 != 0) {
            arg1.field698--;
            this.field892 = new Envelope();
            this.field892.method309(3251, arg1);
            this.field893 = new Envelope();
            this.field893.method309(3251, arg1);
        }
        for (int var6 = 0; var6 < 10; var6++) {
            int var7 = arg1.method245();
            if (var7 == 0) {
                break;
            }
            this.field894[var6] = var7;
            this.field895[var6] = arg1.method244();
            this.field896[var6] = arg1.method245();
        }
        this.field897 = arg1.method245();
        this.field898 = arg1.method245();
        this.field899 = arg1.method233();
        this.field900 = arg1.method233();
    }
}
