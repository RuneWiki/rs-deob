import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("dc")
public class Tone {

    @OriginalMember(owner = "dc", name = "a", descriptor = "Z")
    private boolean field880 = false;

    @OriginalMember(owner = "dc", name = "j", descriptor = "[I")
    private int[] field889 = new int[5];

    @OriginalMember(owner = "dc", name = "k", descriptor = "[I")
    private int[] field890 = new int[5];

    @OriginalMember(owner = "dc", name = "l", descriptor = "[I")
    private int[] field891 = new int[5];

    @OriginalMember(owner = "dc", name = "n", descriptor = "I")
    private int field893 = 100;

    @OriginalMember(owner = "dc", name = "o", descriptor = "I")
    public int field894 = 500;

    @OriginalMember(owner = "dc", name = "t", descriptor = "[I")
    private static int[] field899 = new int[5];

    @OriginalMember(owner = "dc", name = "u", descriptor = "[I")
    private static int[] field900 = new int[5];

    @OriginalMember(owner = "dc", name = "v", descriptor = "[I")
    private static int[] field901 = new int[5];

    @OriginalMember(owner = "dc", name = "w", descriptor = "[I")
    private static int[] field902 = new int[5];

    @OriginalMember(owner = "dc", name = "x", descriptor = "[I")
    private static int[] field903 = new int[5];

    @OriginalMember(owner = "dc", name = "m", descriptor = "I")
    private int field892;

    @OriginalMember(owner = "dc", name = "p", descriptor = "I")
    public int field895;

    @OriginalMember(owner = "dc", name = "y", descriptor = "I")
    public static int field904;

    @OriginalMember(owner = "dc", name = "b", descriptor = "Lbc;")
    private Envelope field881;

    @OriginalMember(owner = "dc", name = "c", descriptor = "Lbc;")
    private Envelope field882;

    @OriginalMember(owner = "dc", name = "d", descriptor = "Lbc;")
    private Envelope field883;

    @OriginalMember(owner = "dc", name = "e", descriptor = "Lbc;")
    private Envelope field884;

    @OriginalMember(owner = "dc", name = "f", descriptor = "Lbc;")
    private Envelope field885;

    @OriginalMember(owner = "dc", name = "g", descriptor = "Lbc;")
    private Envelope field886;

    @OriginalMember(owner = "dc", name = "h", descriptor = "Lbc;")
    private Envelope field887;

    @OriginalMember(owner = "dc", name = "i", descriptor = "Lbc;")
    private Envelope field888;

    @OriginalMember(owner = "dc", name = "q", descriptor = "[I")
    private static int[] field896;

    @OriginalMember(owner = "dc", name = "r", descriptor = "[I")
    private static int[] field897;

    @OriginalMember(owner = "dc", name = "s", descriptor = "[I")
    private static int[] field898;

    @OriginalMember(owner = "dc", name = "a", descriptor = "()V")
    public static final void method314() {
        field897 = new int[32768];
        for (int var0 = 0; var0 < 32768; var0++) {
            if (Math.random() > 0.5D) {
                field897[var0] = 1;
            } else {
                field897[var0] = -1;
            }
        }
        field898 = new int[32768];
        for (int var1 = 0; var1 < 32768; var1++) {
            field898[var1] = (int) (Math.sin((double) var1 / 5215.1903D) * 16384.0D);
        }
        field896 = new int[220500];
    }

    @OriginalMember(owner = "dc", name = "a", descriptor = "(II)[I")
    public final int[] method315(int arg0, int arg1) {
        for (int var3 = 0; var3 < arg0; var3++) {
            field896[var3] = 0;
        }
        if (arg1 < 10) {
            return field896;
        }
        double var4 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field881.method306(true);
        this.field882.method306(true);
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (this.field883 != null) {
            this.field883.method306(true);
            this.field884.method306(true);
            var6 = (int) ((double) (this.field883.field862 - this.field883.field861) * 32.768D / var4);
            var7 = (int) ((double) this.field883.field861 * 32.768D / var4);
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (this.field885 != null) {
            this.field885.method306(true);
            this.field886.method306(true);
            var9 = (int) ((double) (this.field885.field862 - this.field885.field861) * 32.768D / var4);
            var10 = (int) ((double) this.field885.field861 * 32.768D / var4);
        }
        for (int var12 = 0; var12 < 5; var12++) {
            if (this.field889[var12] != 0) {
                field899[var12] = 0;
                field900[var12] = (int) ((double) this.field891[var12] * var4);
                field901[var12] = (this.field889[var12] << 14) / 100;
                field902[var12] = (int) ((double) (this.field881.field862 - this.field881.field861) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field890[var12]) / var4);
                field903[var12] = (int) ((double) this.field881.field861 * 32.768D / var4);
            }
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            int var24 = this.field881.method307(arg0, false);
            int var25 = this.field882.method307(arg0, false);
            if (this.field883 != null) {
                int var26 = this.field883.method307(arg0, false);
                int var27 = this.field884.method307(arg0, false);
                var24 += this.method316(var27, this.field883.field863, var8, 84) >> 1;
                var8 += (var6 * var26 >> 16) + var7;
            }
            if (this.field885 != null) {
                int var28 = this.field885.method307(arg0, false);
                int var29 = this.field886.method307(arg0, false);
                var25 = var25 * ((this.method316(var29, this.field885.field863, var11, 84) >> 1) + 32768) >> 15;
                var11 += (var9 * var28 >> 16) + var10;
            }
            for (int var30 = 0; var30 < 5; var30++) {
                if (this.field889[var30] != 0) {
                    int var31 = field900[var30] + var13;
                    if (var31 < arg0) {
                        field896[var31] += this.method316(field901[var30] * var25 >> 15, this.field881.field863, field899[var30], 84);
                        field899[var30] += (field902[var30] * var24 >> 16) + field903[var30];
                    }
                }
            }
        }
        if (this.field887 != null) {
            this.field887.method306(true);
            this.field888.method306(true);
            int var14 = 0;
            boolean var15 = false;
            boolean var16 = true;
            for (int var17 = 0; var17 < arg0; var17++) {
                int var18 = this.field887.method307(arg0, false);
                int var19 = this.field888.method307(arg0, false);
                int var20;
                if (var16) {
                    var20 = ((this.field887.field862 - this.field887.field861) * var18 >> 8) + this.field887.field861;
                } else {
                    var20 = ((this.field887.field862 - this.field887.field861) * var19 >> 8) + this.field887.field861;
                }
                var14 += 256;
                if (var14 >= var20) {
                    var14 = 0;
                    var16 = !var16;
                }
                if (var16) {
                    field896[var17] = 0;
                }
            }
        }
        if (this.field892 > 0 && this.field893 > 0) {
            int var21 = (int) ((double) this.field892 * var4);
            for (int var22 = var21; var22 < arg0; var22++) {
                field896[var22] += field896[var22 - var21] * this.field893 / 100;
            }
        }
        for (int var23 = 0; var23 < arg0; var23++) {
            if (field896[var23] < -32768) {
                field896[var23] = -32768;
            }
            if (field896[var23] > 32767) {
                field896[var23] = 32767;
            }
        }
        return field896;
    }

    @OriginalMember(owner = "dc", name = "a", descriptor = "(IIII)I")
    private final int method316(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 <= 0) {
            this.field880 = !this.field880;
        }
        if (arg1 == 1) {
            return (arg2 & 0x7FFF) < 16384 ? arg0 : -arg0;
        } else if (arg1 == 2) {
            return field898[arg2 & 0x7FFF] * arg0 >> 14;
        } else if (arg1 == 3) {
            return ((arg2 & 0x7FFF) * arg0 >> 14) - arg0;
        } else if (arg1 == 4) {
            return field897[arg2 / 2607 & 0x7FFF] * arg0;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "dc", name = "a", descriptor = "(ZLmb;)V")
    public final void method317(boolean arg0, Packet arg1) {
        this.field881 = new Envelope();
        this.field881.method305(false, arg1);
        this.field882 = new Envelope();
        this.field882.method305(false, arg1);
        int var3 = arg1.method231();
        if (var3 != 0) {
            arg1.field694--;
            this.field883 = new Envelope();
            this.field883.method305(false, arg1);
            this.field884 = new Envelope();
            this.field884.method305(false, arg1);
        }
        int var4 = arg1.method231();
        if (var4 != 0) {
            arg1.field694--;
            this.field885 = new Envelope();
            this.field885.method305(false, arg1);
            this.field886 = new Envelope();
            this.field886.method305(false, arg1);
        }
        int var5 = arg1.method231();
        if (var5 != 0) {
            arg1.field694--;
            this.field887 = new Envelope();
            this.field887.method305(false, arg1);
            this.field888 = new Envelope();
            this.field888.method305(false, arg1);
        }
        for (int var6 = 0; var6 < 10; var6++) {
            int var7 = arg1.method245();
            if (var7 == 0) {
                break;
            }
            this.field889[var6] = var7;
            this.field890[var6] = arg1.method244();
            this.field891[var6] = arg1.method245();
        }
        this.field892 = arg1.method245();
        this.field893 = arg1.method245();
        this.field894 = arg1.method233();
        if (arg0) {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
        this.field895 = arg1.method233();
    }
}
