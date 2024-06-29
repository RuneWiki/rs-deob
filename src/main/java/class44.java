import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class44 {

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "I")
    private int field882 = 0;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
    public int field881 = 500;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "[I")
    private int[] field885 = new int[5];

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
    public int field886 = 0;

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "I")
    private int field888 = 100;

    @OriginalMember(owner = "client!ec", name = "r", descriptor = "[I")
    private int[] field898 = new int[5];

    @OriginalMember(owner = "client!ec", name = "j", descriptor = "[I")
    private int[] field890 = new int[5];

    @OriginalMember(owner = "client!ec", name = "q", descriptor = "[I")
    private static int[] field897 = new int[32768];

    @OriginalMember(owner = "client!ec", name = "s", descriptor = "[I")
    private static int[] field899;

    @OriginalMember(owner = "client!ec", name = "p", descriptor = "[I")
    private static int[] field896;

    @OriginalMember(owner = "client!ec", name = "u", descriptor = "[I")
    private static int[] field901;

    @OriginalMember(owner = "client!ec", name = "w", descriptor = "[I")
    private static int[] field903;

    @OriginalMember(owner = "client!ec", name = "v", descriptor = "[I")
    private static int[] field902;

    @OriginalMember(owner = "client!ec", name = "x", descriptor = "[I")
    private static int[] field904;

    @OriginalMember(owner = "client!ec", name = "y", descriptor = "[I")
    private static int[] field905;

    @OriginalMember(owner = "client!ec", name = "k", descriptor = "Lg;")
    private class61 field891;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "Lii;")
    private class88 field883;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "Lii;")
    private class88 field884;

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "Lii;")
    private class88 field887;

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "Lii;")
    private class88 field889;

    @OriginalMember(owner = "client!ec", name = "l", descriptor = "Lii;")
    private class88 field892;

    @OriginalMember(owner = "client!ec", name = "m", descriptor = "Lii;")
    private class88 field893;

    @OriginalMember(owner = "client!ec", name = "n", descriptor = "Lii;")
    private class88 field894;

    @OriginalMember(owner = "client!ec", name = "o", descriptor = "Lii;")
    private class88 field895;

    @OriginalMember(owner = "client!ec", name = "t", descriptor = "Lii;")
    private class88 field900;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)[I")
    public final int[] method309(int arg0, int arg1) {
        class85.method556(field896, 0, arg0);
        if (arg1 < 10) {
            return field896;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field893.method566();
        this.field900.method566();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field895 != null) {
            this.field895.method566();
            this.field884.method566();
            var5 = (int) ((double) (this.field895.field1713 - this.field895.field1714) * 32.768D / var3);
            var6 = (int) ((double) this.field895.field1714 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field883 != null) {
            this.field883.method566();
            this.field892.method566();
            var8 = (int) ((double) (this.field883.field1713 - this.field883.field1714) * 32.768D / var3);
            var9 = (int) ((double) this.field883.field1714 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field898[var11] != 0) {
                field904[var11] = 0;
                field903[var11] = (int) ((double) this.field890[var11] * var3);
                field901[var11] = (this.field898[var11] << 14) / 100;
                field905[var11] = (int) ((double) (this.field893.field1713 - this.field893.field1714) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field885[var11]) / var3);
                field902[var11] = (int) ((double) this.field893.field1714 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field893.method564(arg0);
            int var40 = this.field900.method564(arg0);
            if (this.field895 != null) {
                int var41 = this.field895.method564(arg0);
                int var42 = this.field884.method564(arg0);
                var39 += this.method310(var7, var42, this.field895.field1710) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field883 != null) {
                int var43 = this.field883.method564(arg0);
                int var44 = this.field892.method564(arg0);
                var40 = var40 * ((this.method310(var10, var44, this.field883.field1710) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field898[var45] != 0) {
                    int var46 = field903[var45] + var12;
                    if (var46 < arg0) {
                        field896[var46] += this.method310(field904[var45], field901[var45] * var40 >> 15, this.field893.field1710);
                        field904[var45] += (field905[var45] * var39 >> 16) + field902[var45];
                    }
                }
            }
        }
        if (this.field887 != null) {
            this.field887.method566();
            this.field889.method566();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field887.method564(arg0);
                int var18 = this.field889.method564(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field887.field1713 - this.field887.field1714) * var17 >> 8) + this.field887.field1714;
                } else {
                    var19 = ((this.field887.field1713 - this.field887.field1714) * var18 >> 8) + this.field887.field1714;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field896[var16] = 0;
                }
            }
        }
        if (this.field882 > 0 && this.field888 > 0) {
            int var20 = (int) ((double) this.field882 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field896[var21] += field896[var21 - var20] * this.field888 / 100;
            }
        }
        if (this.field891.field1204[0] > 0 || this.field891.field1204[1] > 0) {
            this.field894.method566();
            int var22 = this.field894.method564(arg0 + 1);
            int var23 = this.field891.method385(0, (float) var22 / 65536.0F);
            int var24 = this.field891.method385(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field896[var23 + var25] * (long) class61.field1205 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field896[var23 + var25 - var36 - 1] * (long) class61.field1207[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field896[var25 - var37 - 1] * (long) class61.field1207[1][var37] >> 16);
                    }
                    field896[var25] = var35;
                    var22 = this.field894.method564(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field896[var23 + var25] * (long) class61.field1205 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field896[var23 + var25 - var33 - 1] * (long) class61.field1207[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field896[var25 - var34 - 1] * (long) class61.field1207[1][var34] >> 16);
                        }
                        field896[var25] = var32;
                        var22 = this.field894.method564(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field896[var23 + var25 - var29 - 1] * (long) class61.field1207[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field896[var25 - var30 - 1] * (long) class61.field1207[1][var30] >> 16);
                            }
                            field896[var25] = var28;
                            this.field894.method564(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field891.method385(0, (float) var22 / 65536.0F);
                    var24 = this.field891.method385(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field896[var38] < -32768) {
                field896[var38] = -32768;
            }
            if (field896[var38] > 32767) {
                field896[var38] = 32767;
            }
        }
        return field896;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(III)I")
    private final int method310(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field899[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field897[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "()V")
    public static void method311() {
        field896 = null;
        field897 = null;
        field899 = null;
        field904 = null;
        field903 = null;
        field901 = null;
        field905 = null;
        field902 = null;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lmb;)V")
    public final void method312(class121 arg0) {
        this.field893 = new class88();
        this.field893.method567(arg0);
        this.field900 = new class88();
        this.field900.method567(arg0);
        int var2 = arg0.method751((byte) 123);
        if (var2 != 0) {
            arg0.field2222--;
            this.field895 = new class88();
            this.field895.method567(arg0);
            this.field884 = new class88();
            this.field884.method567(arg0);
        }
        int var3 = arg0.method751((byte) 103);
        if (var3 != 0) {
            arg0.field2222--;
            this.field883 = new class88();
            this.field883.method567(arg0);
            this.field892 = new class88();
            this.field892.method567(arg0);
        }
        int var4 = arg0.method751((byte) -101);
        if (var4 != 0) {
            arg0.field2222--;
            this.field887 = new class88();
            this.field887.method567(arg0);
            this.field889 = new class88();
            this.field889.method567(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method734(-1);
            if (var6 == 0) {
                break;
            }
            this.field898[var5] = var6;
            this.field885[var5] = arg0.method771((byte) 67);
            this.field890[var5] = arg0.method734(-1);
        }
        this.field882 = arg0.method734(-1);
        this.field888 = arg0.method734(-1);
        this.field881 = arg0.method755((byte) -81);
        this.field886 = arg0.method755((byte) -104);
        this.field891 = new class61();
        this.field894 = new class88();
        this.field891.method387(arg0, this.field894);
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field897[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field899 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field899[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field896 = new int[220500];
        field901 = new int[5];
        field903 = new int[5];
        field902 = new int[5];
        field904 = new int[5];
        field905 = new int[5];
    }
}
