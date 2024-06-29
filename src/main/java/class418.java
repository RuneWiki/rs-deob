import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class418 {

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "I")
    public int field6022;

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "Lbg;")
    public static class310 field6018 = new class310(60, 8);

    @OriginalMember(owner = "client!wa", name = "k", descriptor = "Lrp;")
    public static class288 field6026 = new class288(200);

    @OriginalMember(owner = "client!wa", name = "l", descriptor = "[I")
    public static int[] field6027 = new int[1];

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "I")
    public static int field6016;

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "I")
    public static int field6017;

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "I")
    public static int field6019;

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "I")
    public static int field6020;

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "I")
    public static int field6021;

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "I")
    public static int field6023;

    @OriginalMember(owner = "client!wa", name = "j", descriptor = "I")
    public static int field6025;

    @OriginalMember(owner = "client!wa", name = "i", descriptor = "[Z")
    public static boolean[] field6024;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIBII)Z", line = 4)
    public static final boolean method2447(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        if (arg3 != 1) {
            method2449(91, 119, 51, false, 113, -13, -30, -81, null, -12, 66, null, -23, -6, null);
        }
        field6017++;
        for (int var6 = arg4; var6 <= arg5; var6++) {
            for (int var7 = arg1; var7 <= arg2; var7++) {
                if (class368.field5403[var6][var7] == arg0 && class218.field3348[var6][var7] <= 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(B)V", line = 37)
    public static void method2448(byte arg0) {
        field6018 = null;
        if (arg0 != 31) {
            method2450((byte) -43);
        }
        field6024 = null;
        field6026 = null;
        field6027 = null;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIZIIII[IIILea;II[I)I", line = 50)
    public static final int method2449(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, int arg9, int arg10, class367 arg11, int arg12, int arg13, int[] arg14) {
        field6025++;
        if (arg9 != 10) {
            field6026 = null;
        }
        for (int var15 = 0; var15 < 128; var15++) {
            for (int var35 = 0; var35 < 128; var35++) {
                class397.field5789[var15][var35] = 0;
                class88.field1530[var15][var35] = 99999999;
            }
        }
        boolean var16;
        if (arg7 == 1) {
            var16 = class400.method2375(arg10, arg0, arg6, arg4, arg5, arg13, arg1, arg12, 8, arg2, arg11);
        } else if (arg7 == 2) {
            var16 = class491.method2951(arg4, arg5, arg12, arg0, arg10, arg11, arg13, arg1, arg2, true, arg6);
        } else {
            var16 = class481.method2906(arg10, arg11, arg1, arg5, arg0, arg2, arg7, arg12, arg13, (byte) -44, arg4, arg6);
        }
        int var17 = arg5 - 64;
        int var18 = arg1 - 64;
        int var19 = class47.field717;
        int var20 = class324.field4869;
        if (!var16) {
            if (!arg3) {
                return -1;
            }
            int var21 = Integer.MAX_VALUE;
            int var22 = Integer.MAX_VALUE;
            byte var23 = 10;
            for (int var24 = arg12 - var23; var24 <= arg12 + var23; var24++) {
                for (int var25 = arg2 - var23; var25 <= (arg2 + var23); var25++) {
                    int var26 = var24 - var17;
                    int var27 = var25 - var18;
                    if (var26 >= 0 && var27 >= 0 && var26 < 128 && var27 < 128 && class88.field1530[var26][var27] < 100) {
                        int var28 = 0;
                        if (arg12 > var24) {
                            var28 = arg12 - var24;
                        } else if (var24 > (arg0 + arg12 - 1)) {
                            var28 = var24 + 1 - arg0 - arg12;
                        }
                        int var29 = 0;
                        if (var25 < arg2) {
                            var29 = arg2 - var25;
                        } else if (var25 > (arg2 + arg13 - 1)) {
                            var29 = -arg13 - (-var25 - 1) - arg2;
                        }
                        int var30 = var28 * var28 + var29 * var29;
                        if (var21 > var30 || var21 == var30 && var22 > class88.field1530[var26][var27]) {
                            var19 = var24;
                            var20 = var25;
                            var21 = var30;
                            var22 = class88.field1530[var26][var27];
                        }
                    }
                }
            }
            if (var21 == Integer.MAX_VALUE) {
                return -1;
            }
        }
        if (arg5 == var19 && arg1 == var20) {
            return 0;
        }
        byte var31 = 0;
        class165.field2566[var31] = var19;
        int var37 = var31 + 1;
        class230.field3499[var31] = var20;
        int var32;
        int var33 = var32 = class397.field5789[var19 - var17][var20 - var18];
        while (arg5 != var19 || arg1 != var20) {
            if (var32 != var33) {
                class165.field2566[var37] = var19;
                var32 = var33;
                class230.field3499[var37++] = var20;
            }
            if ((var33 & 0x1) != 0) {
                var20++;
            } else if ((var33 & 0x4) != 0) {
                var20--;
            }
            if ((var33 & 0x2) != 0) {
                var19++;
            } else if ((var33 & 0x8) != 0) {
                var19--;
            }
            var33 = class397.field5789[var19 - var17][var20 - var18];
        }
        int var34 = 0;
        while (var37-- > 0) {
            arg14[var34] = class165.field2566[var37];
            arg8[var34++] = class230.field3499[var37];
            if (var34 >= arg14.length) {
                break;
            }
        }
        return var34;
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(B)V", line = 228)
    public static final void method2450(byte arg0) {
        field6023++;
        if (arg0 >= -2) {
            field6026 = null;
        }
        for (int var1 = 0; var1 < class255.field3888; var1++) {
            class456 var2 = class432.field6354[var1];
            boolean var3 = false;
            if (var2.field6990 == null) {
                var2.field6984--;
                if ((var2.field6987 == 2 ? -1500 : -10) <= var2.field6984) {
                    if (var2.field6987 == 1 && var2.field6993 == null) {
                        var2.field6993 = class104.method766(class131.field2087, var2.field6986, 0);
                        if (var2.field6993 == null) {
                            continue;
                        }
                        var2.field6984 += var2.field6993.method768();
                    } else if (var2.field6987 == 2 && (var2.field6988 == null || var2.field6996 == null)) {
                        if (var2.field6988 == null) {
                            var2.field6988 = class71.method522(class226.field3466, var2.field6986);
                        }
                        if (var2.field6988 == null) {
                            continue;
                        }
                        if (var2.field6996 == null) {
                            var2.field6996 = var2.field6988.method525(new int[] { 22050 });
                            if (var2.field6996 == null) {
                                continue;
                            }
                        }
                    }
                    if (var2.field6984 < 0) {
                        int var4;
                        if (var2.field6994 == 0) {
                            var4 = class463.field7116.field2941 * var2.field6989 >> 8;
                        } else {
                            int var5 = (var2.field6994 & 0x39BC2EA) >> 24;
                            if (class286.field4329.field3217 == var5) {
                                int var6 = (var2.field6994 & 0xFF) << 7;
                                int var7 = var2.field6994 >> 16 & 0xFF;
                                int var8 = (var7 << 7) - (class286.field4329.field3218 - 64);
                                if (var8 < 0) {
                                    var8 = -var8;
                                }
                                int var9 = var2.field6994 >> 8 & 0xFF;
                                int var10 = (var9 << 7) - (class286.field4329.field3222 - 64);
                                if (var10 < 0) {
                                    var10 = -var10;
                                }
                                int var11 = var8 + var10 - 128;
                                if (var11 > var6) {
                                    var2.field6984 = -99999;
                                    continue;
                                }
                                if (var11 < 0) {
                                    var11 = 0;
                                }
                                var4 = (var6 - var11) * class463.field7116.field2952 * var2.field6989 / var6 >> 8;
                            } else {
                                var4 = 0;
                            }
                        }
                        if (var4 > 0) {
                            class393 var12 = null;
                            if (var2.field6987 == 1) {
                                var12 = var2.field6993.method767().method2337(class225.field3461);
                            } else if (var2.field6987 == 2) {
                                var12 = var2.field6996;
                            }
                            class464 var13 = var2.field6990 = class464.method2789(var12, 100, var4);
                            var13.method2773(var2.field6991 - 1);
                            class178.field2786.method2097(var13);
                        }
                    }
                } else {
                    var3 = true;
                }
            } else if (!var2.field6990.method1124(-118)) {
                var3 = true;
            }
            if (var3) {
                class255.field3888--;
                for (int var14 = var1; var14 < class255.field3888; var14++) {
                    class432.field6354[var14] = class432.field6354[var14 + 1];
                }
                var1--;
            }
        }
        if (class127.field2053 && !class62.method431(955)) {
            if (class463.field7116.field2960 != 0 && class338.field5058 != -1) {
                class88.method657(class471.field7207, class463.field7116.field2960, 0, (byte) 70, false, class338.field5058);
            }
            class127.field2053 = false;
        } else if (class463.field7116.field2960 != 0 && class338.field5058 != -1 && !class62.method431(955)) {
            class400.method2379((byte) -75, class61.field1030);
            class134.field2106++;
            class230.field3508.method253(-121, class338.field5058);
            class338.field5058 = -1;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lqq;B)V", line = 404)
    public static final void method2451(class318 arg0, byte arg1) {
        field6019++;
        int var2 = class170.field2647;
        int var3 = -60 % ((arg1 - 7) / 53);
        int var4 = class120.field2001;
        int var5 = class218.field3358;
        int var6 = class481.field7344 - 3;
        byte var7 = 20;
        if (class405.field5890 == null || class21.field274 == null) {
            if (class472.field7225.method2729(class480.field7320, -9055) && class472.field7225.method2729(class55.field862, -9055)) {
                class405.field5890 = arg0.method1952(class351.method2132(class472.field7225, class480.field7320, 0), true);
                class351 var8 = class351.method2132(class472.field7225, class55.field862, 0);
                class21.field274 = arg0.method1952(var8, true);
                var8.method2138();
                class47.field722 = arg0.method1952(var8, true);
            } else {
                arg0.method1971(var2, var4, var5, var7, class282.field4271 | 255 - class116.field1959 << 24, 1);
            }
        }
        if (class405.field5890 != null && class21.field274 != null) {
            int var9 = (var5 - class21.field274.method1001() * 2) / class405.field5890.method1001();
            for (int var10 = 0; var10 < var9; var10++) {
                class405.field5890.method994(class21.field274.method1001() + var2 + class405.field5890.method1001() * var10, var4);
            }
            class21.field274.method994(var2, var4);
            class47.field722.method994(var2 + var5 - class47.field722.method1001(), var4);
        }
        class493.field7514.method2938(class397.field5786 | 0xFF000000, var4 + 14, var2 - -3, 32768, class14.field152.method2473(class406.field5898, -124), -1);
        arg0.method1971(var2, var4 + var7, var5, var6 - var7, -class116.field1959 + 255 << 24 | class282.field4271, 1);
        int var11 = class251.field3835.method1686(25478);
        int var12 = class251.field3835.method1690(8);
        int var13 = 0;
        for (class2 var14 = (class2) class329.field4932.method8((byte) -98); var14 != null; var14 = (class2) class329.field4932.method17((byte) 74)) {
            int var31 = (class330.field4948 - var13 - 1) * 16 + var4 + var7 + 13;
            if (var11 > var2 && var2 + var5 > var11 && var12 > var31 - 13 && var31 + 4 > var12 && var14.field13) {
                arg0.method1971(var2, var31 - 12, var5, 16, 255 - class501.field7590 << 24 | class87.field1524, 1);
            }
            var13++;
        }
        if ((class341.field5097 == null || class473.field7232 == null || class142.field2313 == null) && class472.field7225.method2729(class483.field7378, -9055) && class472.field7225.method2729(class261.field3963, -9055) && class472.field7225.method2729(class431.field6349, -9055)) {
            class351 var15 = class351.method2132(class472.field7225, class261.field3963, 0);
            class473.field7232 = arg0.method1952(var15, true);
            var15.method2138();
            class501.field7592 = arg0.method1952(var15, true);
            class341.field5097 = arg0.method1952(class351.method2132(class472.field7225, class483.field7378, 0), true);
            class351 var16 = class351.method2132(class472.field7225, class431.field6349, 0);
            class142.field2313 = arg0.method1952(var16, true);
            var16.method2138();
            class486.field7406 = arg0.method1952(var16, true);
        }
        if (class341.field5097 != null && class473.field7232 != null && class142.field2313 != null) {
            int var17 = (var5 - (class142.field2313.method1001() * 2)) / class341.field5097.method1001();
            for (int var18 = 0; var18 < var17; var18++) {
                class341.field5097.method994(class142.field2313.method1001() + (var2 + (class341.field5097.method1001() * var18)), -class341.field5097.method993() + var4 + var6);
            }
            int var19 = (var6 - var7 - class142.field2313.method993()) / class473.field7232.method993();
            for (int var20 = 0; var20 < var19; var20++) {
                class473.field7232.method994(var2, var4 - (-var7 - var20 * class473.field7232.method993()));
                class501.field7592.method994(var5 + var2 - class501.field7592.method1001(), var20 * class473.field7232.method993() + var4 + var7);
            }
            class142.field2313.method994(var2, var6 + var4 - class142.field2313.method993());
            class486.field7406.method994(var2 + var5 - class142.field2313.method1001(), -class142.field2313.method993() + var4 + var6);
        }
        int var21 = 0;
        for (class2 var22 = (class2) class329.field4932.method8((byte) -98); var22 != null; var22 = (class2) class329.field4932.method17((byte) 91)) {
            int var23 = (class330.field4948 - var21 - 1) * 16 + (var4 + var7 + 13);
            int var24 = class397.field5786 | 0xFF000000;
            if (var11 > var2 && (var2 + var5) > var11 && var12 > var23 - 13 && var23 + 4 > var12 && var22.field13) {
                var24 = class505.field7631 | 0xFF000000;
            }
            int[] var25 = null;
            if (class395.method2344(-14262, var22.field17)) {
                var25 = class288.field4362.method3030((byte) 122, (int) var22.field12).field2836;
            } else if (var22.field19 != -1) {
                var25 = class288.field4362.method3030((byte) 104, var22.field19).field2836;
            } else if (class448.method2681(23208, var22.field17)) {
                class249 var26 = class195.field3085[(int) var22.field12];
                if (var26 != null) {
                    class245 var27 = var26.field3819;
                    if (var27.field3703 != null) {
                        var27 = var27.method1477(class273.field4144, -12819);
                    }
                    if (var27 != null) {
                        var25 = var27.field3744;
                    }
                }
            } else if (class34.method200(var22.field17, 65)) {
                Object var28 = null;
                class56 var29;
                if (var22.field17 == 1009) {
                    var29 = class128.field2070.method916((byte) -15, (int) var22.field12);
                } else {
                    var29 = class128.field2070.method916((byte) -15, (int) (var22.field12 >>> 32 & 0x7FFFFFFFL));
                }
                if (var29.field892 != null) {
                    var29 = var29.method393(class273.field4144, (byte) -124);
                }
                if (var29 != null) {
                    var25 = var29.field879;
                }
            }
            String var30 = class442.method2635((byte) 92, var22);
            if (var25 != null) {
                var30 = var30 + class99.method746(var25, (byte) 53);
            }
            class493.field7514.method2943(true, var24, class302.field4562, class156.field2452, var2 + 3, var23, var30, 0);
            var21++;
            if (var22.field18) {
                class330.field4946.method994((var2 + class512.field7764.method2349(var30, 0)) + 5, var23 - 12);
            }
        }
        class177.method1110(class481.field7344, class170.field2647, class120.field2001, class218.field3358, 0);
    }

    @OriginalMember(owner = "client!wa", name = "toString", descriptor = "()Ljava/lang/String;", line = 605)
    public final String toString() {
        field6016++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)I", line = 613)
    public final int method2452(int arg0) {
        field6020++;
        if (arg0 != 25351) {
            field6027 = null;
        }
        return this.field6022;
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 623)
    public class418(String arg0, int arg1) {
        this.field6022 = arg1;
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(I)I", line = 635)
    public static final int method2453(int arg0) {
        field6021++;
        if ((double) class492.field7478 == 3.0D) {
            return 37;
        }
        if (arg0 != 0) {
            method2453(51);
        }
        if ((double) class492.field7478 == 4.0D) {
            return 50;
        } else if ((double) class492.field7478 == 6.0D) {
            return 75;
        } else if ((double) class492.field7478 == 8.0D) {
            return 100;
        } else {
            return 200;
        }
    }
}
