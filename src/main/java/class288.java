import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public abstract class class288 extends class393 {

    @OriginalMember(owner = "client!qm", name = "p", descriptor = "[Ljava/lang/String;")
    public static String[] field4178 = new String[100];

    @OriginalMember(owner = "client!qm", name = "r", descriptor = "Ljava/lang/String;")
    public static String field4180 = null;

    @OriginalMember(owner = "client!qm", name = "u", descriptor = "I")
    public static int field4183 = 0;

    @OriginalMember(owner = "client!qm", name = "m", descriptor = "I")
    public static int field4175;

    @OriginalMember(owner = "client!qm", name = "n", descriptor = "I")
    public static int field4176;

    @OriginalMember(owner = "client!qm", name = "o", descriptor = "I")
    public static int field4177;

    @OriginalMember(owner = "client!qm", name = "q", descriptor = "I")
    public static int field4179;

    @OriginalMember(owner = "client!qm", name = "s", descriptor = "I")
    public static int field4181;

    @OriginalMember(owner = "client!qm", name = "t", descriptor = "I")
    public static int field4182;

    @OriginalMember(owner = "client!qm", name = "v", descriptor = "I")
    public static int field4184;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIIII)V")
    public static final void method1818(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class166 var5 = (class166) class70.field965.method2649(arg2 ^ arg2); var5 != null; var5 = (class166) class70.field965.method2656(arg2 ^ 0x40)) {
            class413.method2679(arg0, arg1, var5, arg4, 119, arg3);
        }
        field4175++;
        for (class166 var6 = (class166) class54.field805.method2649(0); var6 != null; var6 = (class166) class54.field805.method2656(0)) {
            byte var11 = 1;
            class183 var12 = var6.field2179.method140(arg2 ^ 0x37);
            if (var6.field2179.field236) {
                var11 = 0;
            } else if (var6.field2179.field229 == var12.field2460 || var6.field2179.field229 == var12.field2444 || var6.field2179.field229 == var12.field2441 || var6.field2179.field229 == var12.field2469) {
                var11 = 2;
            } else if (var6.field2179.field229 == var12.field2458 || var6.field2179.field229 == var12.field2471 || var6.field2179.field229 == var12.field2461 || var6.field2179.field229 == var12.field2470) {
                var11 = 3;
            }
            if (var6.field2172 != var11) {
                int var13 = class52.method356(arg2 - 148, var6.field2179);
                if (var6.field2170 != var13) {
                    if (var6.field2162 != null) {
                        class405.field6092.method166(var6.field2162);
                        var6.field2162 = null;
                    }
                    var6.field2170 = var13;
                }
                var6.field2172 = var11;
            }
            var6.field2184 = var6.field2179.field5284;
            var6.field2180 = var6.field2179.field5284 + (var6.field2179.method130((byte) -121) * 64);
            var6.field2176 = var6.field2179.field5298;
            var6.field2182 = var6.field2179.field5298 + var6.field2179.method130((byte) -38) * 64;
            class413.method2679(arg0, arg1, var6, arg4, arg2 ^ 0x7E, arg3);
        }
        for (class166 var7 = (class166) class84.field1175.method953(0); var7 != null; var7 = (class166) class84.field1175.method951(0)) {
            byte var8 = 1;
            class183 var9 = var7.field2167.method140(99);
            if (var7.field2167.field236) {
                var8 = 0;
            } else if (var7.field2167.field229 == var9.field2460 || var7.field2167.field229 == var9.field2444 || var7.field2167.field229 == var9.field2441 || var7.field2167.field229 == var9.field2469) {
                var8 = 2;
            } else if (var7.field2167.field229 == var9.field2458 || var7.field2167.field229 == var9.field2471 || var7.field2167.field229 == var9.field2461 || var7.field2167.field229 == var9.field2470) {
                var8 = 3;
            }
            if (var7.field2172 != var8) {
                int var10 = class197.method1231(var7.field2167, 10);
                if (var7.field2170 != var10) {
                    if (var7.field2162 != null) {
                        class405.field6092.method166(var7.field2162);
                        var7.field2162 = null;
                    }
                    var7.field2170 = var10;
                }
                var7.field2172 = var8;
            }
            var7.field2184 = var7.field2167.field5284;
            var7.field2180 = var7.field2167.field5284 + var7.field2167.method130((byte) -63) * 64;
            var7.field2176 = var7.field2167.field5298;
            var7.field2182 = var7.field2167.field5298 + (var7.field2167.method130((byte) -92) * 64);
            class413.method2679(arg0, arg1, var7, arg4, arg2 - 142, arg3);
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(BI)V")
    public static final void method1819(byte arg0, int arg1) {
        field4179++;
        class363 var2 = (class363) class157.field2069.method954(68, (long) arg1);
        if (var2 != null && arg0 == -121) {
            var2.method2574((byte) 118);
        }
    }

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "(B)V")
    public static void method1820(byte arg0) {
        field4180 = null;
        if (arg0 != -53) {
            method1823(106, 9);
        }
        field4178 = null;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(ZZI)V")
    public static final void method1821(boolean arg0, boolean arg1, int arg2) {
        if (arg0) {
            class374.field5635--;
            if (class374.field5635 == 0) {
                class198.field2830 = null;
            }
        }
        if (arg2 != -1) {
            field4180 = null;
        }
        if (arg1) {
            class180.field2390--;
            if (class180.field2390 == 0) {
                class300.field4317 = null;
            }
        }
        field4184++;
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(IIII)V")
    public static final void method1822(int arg0, int arg1, int arg2, int arg3) {
        field4181++;
        class256 var4 = class363.method2385(11, arg3, (byte) 1);
        var4.method1614(arg1 - 64);
        var4.field3756 = arg0;
        var4.field3746 = arg2;
        if (arg1 != 64) {
            method1821(true, true, -7);
        }
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(II)I")
    public static final int method1823(int arg0, int arg1) {
        if (arg0 != -10210) {
            field4178 = null;
        }
        field4177++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1824(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4176++;
        class277.method1767(arg2, (byte) 126);
        int var7 = 0;
        int var8 = arg2 - arg3;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg2;
        if (arg0 > -90) {
            field4178 = null;
        }
        int var10 = -arg2;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        if (class180.field2375 <= arg1 && class50.field695 >= arg1) {
            int[] var15 = class227.field3201[arg1];
            int var16 = class143.method950(-15543, class297.field4268, class203.field2942, arg4 - arg2);
            int var17 = class143.method950(-15543, class297.field4268, class203.field2942, arg2 + arg4);
            int var18 = class143.method950(-15543, class297.field4268, class203.field2942, arg4 - var8);
            int var19 = class143.method950(-15543, class297.field4268, class203.field2942, arg4 + var8);
            class370.method2440(var18, var15, arg5, var16, 61);
            class370.method2440(var19, var15, arg6, var18, 92);
            class370.method2440(var17, var15, arg5, var19, 86);
        }
        while (var9 > var7) {
            var13 += 2;
            var14 += 2;
            var12 += var14;
            var10 += var13;
            if (var12 >= 0 && var11 >= 1) {
                var11--;
                class348.field5172[var11] = var7;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                int var20 = arg1 - var9;
                int var21 = arg1 + var9;
                if (class180.field2375 <= var21 && var20 <= class50.field695) {
                    if (var9 >= var8) {
                        int var22 = class143.method950(-15543, class297.field4268, class203.field2942, arg4 + var7);
                        int var23 = class143.method950(-15543, class297.field4268, class203.field2942, arg4 - var7);
                        if (class50.field695 >= var21) {
                            class370.method2440(var22, class227.field3201[var21], arg5, var23, 113);
                        }
                        if (class180.field2375 <= var20) {
                            class370.method2440(var22, class227.field3201[var20], arg5, var23, 100);
                        }
                    } else {
                        int var24 = class348.field5172[var9];
                        int var25 = class143.method950(-15543, class297.field4268, class203.field2942, arg4 + var7);
                        int var26 = class143.method950(-15543, class297.field4268, class203.field2942, arg4 - var7);
                        int var27 = class143.method950(-15543, class297.field4268, class203.field2942, arg4 + var24);
                        int var28 = class143.method950(-15543, class297.field4268, class203.field2942, arg4 - var24);
                        if (var21 <= class50.field695) {
                            int[] var29 = class227.field3201[var21];
                            class370.method2440(var28, var29, arg5, var26, 78);
                            class370.method2440(var27, var29, arg6, var28, 71);
                            class370.method2440(var25, var29, arg5, var27, 84);
                        }
                        if (class180.field2375 <= var20) {
                            int[] var30 = class227.field3201[var20];
                            class370.method2440(var28, var30, arg5, var26, 75);
                            class370.method2440(var27, var30, arg6, var28, 63);
                            class370.method2440(var25, var30, arg5, var27, 76);
                        }
                    }
                }
            }
            int var31 = arg1 - var7;
            int var32 = arg1 + var7;
            if (var32 >= class180.field2375 && class50.field695 >= var31) {
                int var33 = arg4 + var9;
                int var34 = arg4 - var9;
                if (var33 >= class203.field2942 && var34 <= class297.field4268) {
                    int var35 = class143.method950(-15543, class297.field4268, class203.field2942, var33);
                    int var36 = class143.method950(-15543, class297.field4268, class203.field2942, var34);
                    if (var8 > var7) {
                        int var37 = var7 > var11 ? class348.field5172[var7] : var11;
                        int var38 = class143.method950(-15543, class297.field4268, class203.field2942, arg4 + var37);
                        int var39 = class143.method950(-15543, class297.field4268, class203.field2942, arg4 - var37);
                        if (var32 <= class50.field695) {
                            int[] var40 = class227.field3201[var32];
                            class370.method2440(var39, var40, arg5, var36, 127);
                            class370.method2440(var38, var40, arg6, var39, 73);
                            class370.method2440(var35, var40, arg5, var38, 77);
                        }
                        if (var31 >= class180.field2375) {
                            int[] var41 = class227.field3201[var31];
                            class370.method2440(var39, var41, arg5, var36, 111);
                            class370.method2440(var38, var41, arg6, var39, 103);
                            class370.method2440(var35, var41, arg5, var38, 81);
                        }
                    } else {
                        if (var32 <= class50.field695) {
                            class370.method2440(var35, class227.field3201[var32], arg5, var36, 80);
                        }
                        if (class180.field2375 <= var31) {
                            class370.method2440(var35, class227.field3201[var31], arg5, var36, 94);
                        }
                    }
                }
            }
        }
    }
}
