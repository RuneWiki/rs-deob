import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class435 extends class436 {

    @OriginalMember(owner = "client!pg", name = "H", descriptor = "I")
    private int field6241 = 32768;

    @OriginalMember(owner = "client!pg", name = "K", descriptor = "I")
    public static int field6244 = 0;

    @OriginalMember(owner = "client!pg", name = "J", descriptor = "I")
    public static int field6243 = 1;

    @OriginalMember(owner = "client!pg", name = "Q", descriptor = "Ljava/lang/String;")
    public static String field6249 = "glow1:";

    @OriginalMember(owner = "client!pg", name = "N", descriptor = "[[S")
    public static short[][] field6246 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!pg", name = "T", descriptor = "J")
    public static long field6252 = 0L;

    @OriginalMember(owner = "client!pg", name = "G", descriptor = "I")
    public static int field6240;

    @OriginalMember(owner = "client!pg", name = "I", descriptor = "I")
    public static int field6242;

    @OriginalMember(owner = "client!pg", name = "L", descriptor = "I")
    public static int field6245;

    @OriginalMember(owner = "client!pg", name = "O", descriptor = "I")
    public static int field6247;

    @OriginalMember(owner = "client!pg", name = "R", descriptor = "I")
    public static int field6250;

    @OriginalMember(owner = "client!pg", name = "S", descriptor = "Lqj;")
    public static class296 field6251;

    @OriginalMember(owner = "client!pg", name = "P", descriptor = "[Lsm;")
    public static class156[] field6248;

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(II)[[I", line = 7)
    public final int[][] method85(int arg0, int arg1) {
        ++field6245;
        int[][] var3 = super.field6259.method1848((byte) 63, arg1);
        if (super.field6259.field3950) {
            int[] var4 = this.method2729(1, 0, arg1);
            int[] var5 = this.method2729(2, 0, arg1);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; ~class43.field653 < ~var9; ++var9) {
                int var10 = (1045406 & var4[var9] * 255) >> 12;
                int var11 = var5[var9] * this.field6241 >> 12;
                int var12 = class288.field3991[var10] * var11 >> 12;
                int var13 = class441.field6396[var10] * var11 >> 12;
                int var14 = class278.field3758 & (var12 >> 12) + var9;
                int var15 = (var13 >> 12) + arg1 & class190.field2634;
                int[][] var16 = this.method2731(var15, false, 0);
                var6[var9] = var16[0][var14];
                var7[var9] = var16[1][var14];
                var8[var9] = var16[2][var14];
            }
        }
        if (arg0 != -13348) {
            field6251 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IILeb;)V", line = 64)
    public final void method18(int arg0, int arg1, class371 arg2) {
        if (arg1 != 0) {
            if (arg1 == 1) {
                super.field6256 = ~arg2.method2429(0) == -2;
            }
        } else {
            this.field6241 = arg2.method2403((byte) 55) << 4;
        }
        ++field6242;
        if (arg0 != 34) {
            method2727(20, (byte[][][]) null, 56, (byte) -102, -19, 106);
        }
    }

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "(I)V", line = 100)
    public final void method44(int arg0) {
        if (arg0 != -14) {
            field6251 = null;
        }
        class105.method721(false);
        ++field6250;
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "()V", line = 125)
    public class435() {
        super(3, false);
    }

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "(I)V", line = 128)
    public static void method2726(int arg0) {
        field6251 = null;
        field6248 = null;
        field6249 = null;
        field6246 = null;
        int var1 = -121 / ((arg0 - -57) / 55);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(I[[[BIBII)V", line = 151)
    public static final void method2727(int arg0, byte[][][] arg1, int arg2, byte arg3, int arg4, int arg5) {
        ++class352.field4922;
        class13.field162 = 0;
        for (int var6 = class223.field3011; var6 < class176.field2480; ++var6) {
            class142[][] var17 = class5.field79[var6];
            for (int var18 = class265.field3623; var18 < class350.field4887; ++var18) {
                for (int var19 = class179.field2506; var19 < class426.field6112; ++var19) {
                    class142 var20 = var17[var18][var19];
                    if (var20 != null) {
                        if (!class3.field39[var18 - class451.field6574 + class245.field3380][var19 - class48.field738 + class245.field3380] || arg1 != null && var6 >= arg2 && arg1[var6][var18][var19] == arg3) {
                            var20.field2050 = false;
                            var20.field2033 = false;
                            var20.field2032 = 0;
                            if (var18 >= class451.field6574 - 16 && var18 <= class451.field6574 + 16 && var19 >= class48.field738 - 16 && var19 <= class48.field738 + 16 && (var20.field2031 != null || var20.field2044 != null || var20.field2052 != null || var20.field2035 != null || var20.field2047 != null || var20.field2043 != null)) {
                                class165.field2357.method1159(var20, -20264);
                            }
                        } else {
                            var20.field2050 = true;
                            var20.field2033 = true;
                            if (var20.field2043 != null) {
                                var20.field2056 = true;
                            } else {
                                var20.field2056 = false;
                            }
                            ++class13.field162;
                        }
                    }
                }
            }
        }
        boolean var7 = field6248 == class249.field3456;
        for (int var8 = class223.field3011; var8 < class176.field2480; ++var8) {
            float var9 = var7 ? 251.5F : 201.5F - (float) var8 * 50.0F - 0.5F;
            if (class352.field4917.method1790() && var8 >= arg2 && arg1 != null) {
                int var10 = class3.field39.length;
                if (class3.field39.length + class265.field3623 > class386.field5629) {
                    var10 -= class3.field39.length + class265.field3623 - class386.field5629;
                }
                int var11 = class3.field39[0].length;
                if (class3.field39[0].length + class179.field2506 > class371.field5311) {
                    var11 -= class3.field39[0].length + class179.field2506 - class371.field5311;
                }
                int var12 = class8.field127;
                while (true) {
                    if (var12 >= var10) {
                        class165.field2357.method1156(class249.field3456[var8], true, (byte) -80, var8, var9);
                        break;
                    }
                    int var13 = class265.field3623 + var12 - class8.field127;
                    for (int var14 = class299.field4136; var14 < var11; ++var14) {
                        class4.field43[var12][var14] = false;
                        if (class3.field39[var12][var14]) {
                            int var15 = class179.field2506 + var14 - class299.field4136;
                            for (int var16 = var8; var16 >= 0; --var16) {
                                if (class5.field79[var16][var13][var15] != null && class5.field79[var16][var13][var15].field2053 == var8) {
                                    class4.field43[var12][var14] = class5.field79[var16][var13][var15].field2050;
                                    break;
                                }
                            }
                        }
                    }
                    ++var12;
                }
            } else {
                class165.field2357.method1156(class249.field3456[var8], false, (byte) -115, var8, var9);
            }
            class165.field2357.method1152((byte) -85);
        }
        if (!class30.method233(true)) {
            class30.method233(false);
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(II)[I", line = 288)
    public final int[] method14(int arg0, int arg1) {
        ++field6247;
        int[] var3 = super.field6258.method2688((byte) -96, arg0);
        if (arg1 != 18338) {
            field6249 = null;
        }
        if (super.field6258.field6138) {
            int[] var4 = this.method2729(1, 0, arg0);
            int[] var5 = this.method2729(2, arg1 ^ 18338, arg0);
            for (int var6 = 0; var6 < class43.field653; ++var6) {
                int var7 = var4[var6] >> 4 & 255;
                int var8 = var5[var6] * this.field6241 >> 12;
                int var9 = class288.field3991[var7] * var8 >> 12;
                int var10 = class441.field6396[var7] * var8 >> 12;
                int var11 = (var9 >> 12) + var6 & class278.field3758;
                int var12 = (var10 >> 12) + arg0 & class190.field2634;
                int[] var13 = this.method2729(0, 0, var12);
                var3[var6] = var13[var11];
            }
        }
        return var3;
    }
}
