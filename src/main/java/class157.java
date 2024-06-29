import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class157 extends class107 {

    @OriginalMember(owner = "client!id", name = "F", descriptor = "Ljava/lang/String;")
    public static String field2507 = "Select";

    @OriginalMember(owner = "client!id", name = "K", descriptor = "Ljava/lang/String;")
    public static String field2512 = "glow2:";

    @OriginalMember(owner = "client!id", name = "N", descriptor = "I")
    public static int field2515 = 2;

    @OriginalMember(owner = "client!id", name = "R", descriptor = "Ljava/lang/String;")
    public static String field2519 = " from your friend list first.";

    @OriginalMember(owner = "client!id", name = "D", descriptor = "I")
    public static int field2505;

    @OriginalMember(owner = "client!id", name = "E", descriptor = "I")
    public static int field2506;

    @OriginalMember(owner = "client!id", name = "G", descriptor = "I")
    public static int field2508;

    @OriginalMember(owner = "client!id", name = "H", descriptor = "I")
    public static int field2509;

    @OriginalMember(owner = "client!id", name = "J", descriptor = "I")
    public static int field2511;

    @OriginalMember(owner = "client!id", name = "L", descriptor = "I")
    public static int field2513;

    @OriginalMember(owner = "client!id", name = "M", descriptor = "I")
    public static int field2514;

    @OriginalMember(owner = "client!id", name = "O", descriptor = "I")
    public static int field2516;

    @OriginalMember(owner = "client!id", name = "P", descriptor = "I")
    public static int field2517;

    @OriginalMember(owner = "client!id", name = "Q", descriptor = "I")
    public static int field2518;

    @OriginalMember(owner = "client!id", name = "I", descriptor = "Lgi;")
    public static class164 field2510;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIZIIII)V")
    public static final void method1059(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field2514;
        if (class34.field561 <= -arg6 + arg3 && arg3 + arg6 <= class148.field2371 && arg1 - arg6 >= class52.field766 && arg1 - -arg6 <= class191.field3112) {
            class210.method1449(arg1, arg4, arg5, arg3, -2, arg6, arg0);
        } else {
            class88.method615(arg6, arg4, arg0, arg3, arg1, arg5, (byte) 91);
        }
        if (!arg2) {
            method1059(119, -53, false, 43, 80, 21, -109);
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIILrg;III)V")
    public static final void method1060(int arg0, int arg1, int arg2, class248 arg3, int arg4, int arg5, int arg6) {
        ++field2506;
        if (arg6 != 1) {
            field2510 = null;
        }
        class125 var7 = class223.method1550((byte) -119, arg1);
        if (var7 != null && var7.field1977 && var7.method865(arg6 + 24524)) {
            if (var7.field2000 != null) {
                int[] var8 = new int[var7.field2000.length];
                for (int var9 = 0; ~(var8.length / 2) < ~var9; ++var9) {
                    int var11 = (int) class114.field1742 + class278.field4540 & 2047;
                    int var12 = class136.field2191[var11];
                    int var13 = class136.field2193[var11];
                    int var14 = var13 * 256 / (class150.field2394 + 256);
                    int var15 = var12 * 256 / (class150.field2394 - -256);
                    var8[var9 * 2] = ((arg5 - -(var7.field2000[var9 * 2] * 4)) * var14 + (var7.field2000[var9 * 2 + 1] * 4 + arg2) * var15 >> 16) + arg0 - -(arg3.field4016 / 2);
                    var8[var9 * 2 + 1] = arg3.field4057 / 2 + (arg4 - ((arg2 - -(var7.field2000[var9 * 2 - -1] * 4)) * var14 - (var7.field2000[var9 * 2] * 4 + arg5) * var15 >> 16));
                }
                class160.method1101(var8, var7.field2012, var7.field2012 >>> 24, arg3.field3993, arg3.field3934);
                for (int var10 = 0; ~(var8.length / 2 + -1) < ~var10; ++var10) {
                    class94.method683(var8[var10 * 2], var8[var10 * 2 - -1], var8[(var10 + 1) * 2], var8[(var10 + 1) * 2 - -1], var7.field2005, var7.field2005 >>> 24, arg3.field3993, arg3.field3934);
                }
                class94.method683(var8[var8.length + -2], var8[var8.length + -1], var8[0], var8[1], var7.field2005, var7.field2005 >>> 24, arg3.field3993, arg3.field3934);
            }
            class197 var16 = null;
            if (~var7.field1982 != 0) {
                var16 = var7.method864(111, false, false);
                if (var16 != null) {
                    class86.method609(arg4, arg3, arg6 + -18487, arg0, var16, arg2, arg5);
                }
            }
            if (var7.field1999 != null) {
                int var17 = 0;
                if (var16 != null) {
                    var17 = var16.field3181;
                }
                class73 var18 = class183.field3043;
                if (~var7.field2007 == -2) {
                    var18 = class207.field3313;
                }
                if (var7.field2007 == 2) {
                    var18 = class170.field2792;
                }
                class290.method1996(arg2, arg4, var17, arg0, var7.field1990, arg5, var7.field1999, var18, true, arg3);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!id", name = "e", descriptor = "(B)V")
    public static void method1061(byte arg0) {
        field2507 = null;
        field2510 = null;
        field2519 = null;
        if (arg0 < 71) {
            method1061((byte) 86);
        }
        field2512 = null;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IZI)V")
    public static final void method1062(int arg0, boolean arg1, int arg2) {
        ++field2516;
        if (arg1) {
            method1066(-115, 69, 107, -36, 9, -59);
        }
        class291 var3 = class61.method389(arg0, 5, 0);
        var3.method2009(-75);
        var3.field4763 = arg2;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lrg;I)Ljava/lang/String;")
    public static final String method1063(class248 arg0, int arg1) {
        ++field2511;
        if (client.method1126(arg0).method176(2) == 0) {
            return null;
        } else if (arg0.field3951 != null && ~arg0.field3951.trim().length() != -1) {
            if (arg1 != -1) {
                method1061((byte) 40);
            }
            return arg0.field3951;
        } else {
            return class61.field881 ? "Hidden-use" : null;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ZIII)V")
    public static final void method1064(boolean arg0, int arg1, int arg2, int arg3) {
        ++field2508;
        class25 var4 = class265.method1781(arg2, false, arg1, arg3);
        if (var4 != null) {
            class247.field3882 = new String[var4.field465];
            class213.field3382 = new int[var4.field459];
            if (var4.field462 == 15 || ~var4.field462 == -18 || ~var4.field462 == -17) {
                int var5 = 0;
                int var6 = 0;
                if (class132.field2117 != null) {
                    var6 = class132.field2117.field3916;
                    var5 = class132.field2117.field4037;
                }
                class213.field3382[0] = -var5 + class287.field4640;
                class213.field3382[1] = -var6 + class55.field797;
            }
            class92.method643(200000, var4, -126);
            if (!arg0) {
                method1065(12, -128, -54);
            }
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ILfj;B)V")
    public final void method195(int arg0, class274 arg1, byte arg2) {
        ++field2505;
        if (arg0 == 0) {
            super.field1660 = arg1.method1849(255) == 1;
        }
        if (arg2 != 28) {
            field2512 = null;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IB)[[I")
    public final int[][] method190(int arg0, byte arg1) {
        ++field2517;
        if (arg1 != -117) {
            field2519 = null;
        }
        int[][] var3 = super.field1662.method1302(arg0, (byte) 26);
        if (super.field1662.field3063) {
            int[] var4 = this.method756(2, arg0, -29053);
            int[][] var5 = this.method759(0, -128, arg0);
            int[][] var6 = this.method759(1, -128, arg0);
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var5[0];
            int[] var10 = var3[0];
            int[] var11 = var5[2];
            int[] var12 = var6[0];
            int[] var13 = var5[1];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; var16 < class24.field443; ++var16) {
                int var17 = var4[var16];
                if (var17 != 4096) {
                    if (~var17 == -1) {
                        var10[var16] = var12[var16];
                        var7[var16] = var14[var16];
                        var8[var16] = var15[var16];
                    } else {
                        int var18 = -var17 + 4096;
                        var10[var16] = var9[var16] * var17 + var12[var16] * var18 >> 12;
                        var7[var16] = var13[var16] * var17 - -(var14[var16] * var18) >> 12;
                        var8[var16] = var11[var16] * var17 + var15[var16] * var18 >> 12;
                    }
                } else {
                    var10[var16] = var9[var16];
                    var7[var16] = var13[var16];
                    var8[var16] = var11[var16];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "()V")
    public class157() {
        super(3, false);
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(II)[I")
    public final int[] method189(int arg0, int arg1) {
        ++field2518;
        int[] var3 = super.field1661.method894(118, arg1);
        if (super.field1661.field2115) {
            int[] var4 = this.method756(0, arg1, -29053);
            int[] var5 = this.method756(1, arg1, -29053);
            int[] var6 = this.method756(2, arg1, -29053);
            for (int var7 = 0; ~var7 > ~class24.field443; ++var7) {
                int var8 = var6[var7];
                if (~var8 == -4097) {
                    var3[var7] = var4[var7];
                } else if (var8 != 0) {
                    var3[var7] = (4096 - var8) * var5[var7] + var4[var7] * var8 >> 12;
                } else {
                    var3[var7] = var5[var7];
                }
            }
        }
        int var9 = 105 / ((-34 - arg0) / 49);
        return var3;
    }

    @OriginalMember(owner = "client!id", name = "c", descriptor = "(III)I")
    public static final int method1065(int arg0, int arg1, int arg2) {
        ++field2509;
        if (arg0 <= 76) {
            return 78;
        } else {
            int var3 = class125.method859(arg2 + 45365, arg1 + 91923, (byte) 88, 4) + (-128 - -(class125.method859(arg2 + 10294, arg1 + 37821, (byte) 88, 2) + -128 >> 1)) + (-128 + class125.method859(arg2, arg1, (byte) 88, 1) >> 2);
            int var4 = (int) ((double) var3 * 0.3D) - -35;
            if (var4 >= 10) {
                if (var4 > 60) {
                    var4 = 60;
                }
            } else {
                var4 = 10;
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIIII)V")
    public static final void method1066(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2513;
        class309.method2096(arg5, arg1 + arg4, (byte) -117, class232.field3629[arg2], -arg4 + arg1);
        if (arg3 <= 39) {
            method1064(true, -9, 16, 123);
        }
        int var6 = 0;
        int var7 = arg4 * arg4;
        int var8 = arg0;
        int var9 = var7 << 1;
        int var10 = arg0 << 1;
        int var11 = arg0 * arg0;
        int var12 = var11 << 1;
        int var13 = (-var10 + 1) * var7 + var12;
        int var14 = -((var10 - 1) * var9) + var11;
        int var15 = var7 << 2;
        int var16 = var11 << 2;
        int var17 = ((var6 << 1) + 3) * var12;
        int var18 = ((arg0 << 1) + -3) * var9;
        int var19 = (var6 - -1) * var16;
        int var20 = (arg0 + -1) * var15;
        while (var8 > 0) {
            --var8;
            int var21 = -var8 + arg2;
            if (var13 < 0) {
                while (var13 < 0) {
                    var13 += var17;
                    var17 += var16;
                    ++var6;
                    var14 += var19;
                    var19 += var16;
                }
            }
            if (~var14 > -1) {
                var13 += var17;
                ++var6;
                var17 += var16;
                var14 += var19;
                var19 += var16;
            }
            int var22 = arg2 - -var8;
            var13 += -var20;
            var14 += -var18;
            var18 -= var15;
            int var23 = arg1 + var6;
            var20 -= var15;
            int var24 = -var6 + arg1;
            class309.method2096(arg5, var23, (byte) -117, class232.field3629[var21], var24);
            class309.method2096(arg5, var23, (byte) -117, class232.field3629[var22], var24);
        }
    }
}
