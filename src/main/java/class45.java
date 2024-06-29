import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class45 {

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "I")
    private int field1023 = 100;

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "[I")
    private int[] field1026 = new int[5];

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "I")
    private int field1028 = 0;

    @OriginalMember(owner = "client!gb", name = "k", descriptor = "[I")
    private int[] field1032 = new int[5];

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "I")
    public int field1027 = 0;

    @OriginalMember(owner = "client!gb", name = "v", descriptor = "I")
    public int field1043 = 500;

    @OriginalMember(owner = "client!gb", name = "o", descriptor = "[I")
    private int[] field1036 = new int[5];

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "[I")
    private static int[] field1024 = new int[32768];

    @OriginalMember(owner = "client!gb", name = "p", descriptor = "[I")
    private static int[] field1037;

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "[I")
    private static int[] field1025;

    @OriginalMember(owner = "client!gb", name = "q", descriptor = "[I")
    private static int[] field1038;

    @OriginalMember(owner = "client!gb", name = "u", descriptor = "[I")
    private static int[] field1042;

    @OriginalMember(owner = "client!gb", name = "t", descriptor = "[I")
    private static int[] field1041;

    @OriginalMember(owner = "client!gb", name = "r", descriptor = "[I")
    private static int[] field1039;

    @OriginalMember(owner = "client!gb", name = "x", descriptor = "[I")
    private static int[] field1045;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "Loe;")
    private class102 field1022;

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "Loe;")
    private class102 field1029;

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "Loe;")
    private class102 field1030;

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "Loe;")
    private class102 field1031;

    @OriginalMember(owner = "client!gb", name = "l", descriptor = "Loe;")
    private class102 field1033;

    @OriginalMember(owner = "client!gb", name = "n", descriptor = "Loe;")
    private class102 field1035;

    @OriginalMember(owner = "client!gb", name = "s", descriptor = "Loe;")
    private class102 field1040;

    @OriginalMember(owner = "client!gb", name = "w", descriptor = "Loe;")
    private class102 field1044;

    @OriginalMember(owner = "client!gb", name = "y", descriptor = "Loe;")
    private class102 field1046;

    @OriginalMember(owner = "client!gb", name = "m", descriptor = "Lqd;")
    private class115 field1034;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(III)I")
    private final int method359(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field1037[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field1024[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(II)[I")
    public final int[] method360(int arg0, int arg1) {
        class138.method1131(field1025, 0, arg0);
        if (arg1 < 10) {
            return field1025;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field1031.method815();
        this.field1040.method815();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field1046 != null) {
            this.field1046.method815();
            this.field1033.method815();
            var5 = (int) ((double) (this.field1046.field2437 - this.field1046.field2438) * 32.768D / var3);
            var6 = (int) ((double) this.field1046.field2438 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field1029 != null) {
            this.field1029.method815();
            this.field1044.method815();
            var8 = (int) ((double) (this.field1029.field2437 - this.field1029.field2438) * 32.768D / var3);
            var9 = (int) ((double) this.field1029.field2438 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field1032[var11] != 0) {
                field1039[var11] = 0;
                field1045[var11] = (int) ((double) this.field1036[var11] * var3);
                field1042[var11] = (this.field1032[var11] << 14) / 100;
                field1038[var11] = (int) ((double) (this.field1031.field2437 - this.field1031.field2438) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1026[var11]) / var3);
                field1041[var11] = (int) ((double) this.field1031.field2438 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field1031.method814(arg0);
            int var40 = this.field1040.method814(arg0);
            if (this.field1046 != null) {
                int var41 = this.field1046.method814(arg0);
                int var42 = this.field1033.method814(arg0);
                var39 += this.method359(var7, var42, this.field1046.field2435) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field1029 != null) {
                int var43 = this.field1029.method814(arg0);
                int var44 = this.field1044.method814(arg0);
                var40 = var40 * ((this.method359(var10, var44, this.field1029.field2435) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field1032[var45] != 0) {
                    int var46 = field1045[var45] + var12;
                    if (var46 < arg0) {
                        field1025[var46] += this.method359(field1039[var45], field1042[var45] * var40 >> 15, this.field1031.field2435);
                        field1039[var45] += (field1038[var45] * var39 >> 16) + field1041[var45];
                    }
                }
            }
        }
        if (this.field1022 != null) {
            this.field1022.method815();
            this.field1030.method815();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field1022.method814(arg0);
                int var18 = this.field1030.method814(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field1022.field2437 - this.field1022.field2438) * var17 >> 8) + this.field1022.field2438;
                } else {
                    var19 = ((this.field1022.field2437 - this.field1022.field2438) * var18 >> 8) + this.field1022.field2438;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field1025[var16] = 0;
                }
            }
        }
        if (this.field1028 > 0 && this.field1023 > 0) {
            int var20 = (int) ((double) this.field1028 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field1025[var21] += field1025[var21 - var20] * this.field1023 / 100;
            }
        }
        if (this.field1034.field2638[0] > 0 || this.field1034.field2638[1] > 0) {
            this.field1035.method815();
            int var22 = this.field1035.method814(arg0 + 1);
            int var23 = this.field1034.method908(0, (float) var22 / 65536.0F);
            int var24 = this.field1034.method908(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field1025[var23 + var25] * (long) class115.field2642 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field1025[var23 + var25 - var36 - 1] * (long) class115.field2637[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field1025[var25 - var37 - 1] * (long) class115.field2637[1][var37] >> 16);
                    }
                    field1025[var25] = var35;
                    var22 = this.field1035.method814(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field1025[var23 + var25] * (long) class115.field2642 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field1025[var23 + var25 - var33 - 1] * (long) class115.field2637[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field1025[var25 - var34 - 1] * (long) class115.field2637[1][var34] >> 16);
                        }
                        field1025[var25] = var32;
                        var22 = this.field1035.method814(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field1025[var23 + var25 - var29 - 1] * (long) class115.field2637[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field1025[var25 - var30 - 1] * (long) class115.field2637[1][var30] >> 16);
                            }
                            field1025[var25] = var28;
                            this.field1035.method814(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field1034.method908(0, (float) var22 / 65536.0F);
                    var24 = this.field1034.method908(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field1025[var38] < -32768) {
                field1025[var38] = -32768;
            }
            if (field1025[var38] > 32767) {
                field1025[var38] = 32767;
            }
        }
        return field1025;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "()V")
    public static void method361() {
        field1025 = null;
        field1024 = null;
        field1037 = null;
        field1039 = null;
        field1045 = null;
        field1042 = null;
        field1038 = null;
        field1041 = null;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lsb;)V")
    public final void method362(class127 arg0) {
        this.field1031 = new class102();
        this.field1031.method817(arg0);
        this.field1040 = new class102();
        this.field1040.method817(arg0);
        int var2 = arg0.method1011(91);
        if (var2 != 0) {
            arg0.field2995--;
            this.field1046 = new class102();
            this.field1046.method817(arg0);
            this.field1033 = new class102();
            this.field1033.method817(arg0);
        }
        int var3 = arg0.method1011(33);
        if (var3 != 0) {
            arg0.field2995--;
            this.field1029 = new class102();
            this.field1029.method817(arg0);
            this.field1044 = new class102();
            this.field1044.method817(arg0);
        }
        int var4 = arg0.method1011(28);
        if (var4 != 0) {
            arg0.field2995--;
            this.field1022 = new class102();
            this.field1022.method817(arg0);
            this.field1030 = new class102();
            this.field1030.method817(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method1027(false);
            if (var6 == 0) {
                break;
            }
            this.field1032[var5] = var6;
            this.field1026[var5] = arg0.method1021(65536);
            this.field1036[var5] = arg0.method1027(false);
        }
        this.field1028 = arg0.method1027(false);
        this.field1023 = arg0.method1027(false);
        this.field1043 = arg0.method1020(false);
        this.field1027 = arg0.method1020(false);
        this.field1034 = new class115();
        this.field1035 = new class102();
        this.field1034.method907(arg0, this.field1035);
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field1024[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field1037 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field1037[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field1025 = new int[220500];
        field1038 = new int[5];
        field1042 = new int[5];
        field1041 = new int[5];
        field1039 = new int[5];
        field1045 = new int[5];
    }
}
