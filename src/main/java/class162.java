import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class162 extends class320 {

    @OriginalMember(owner = "client!hg", name = "H", descriptor = "[Ljc;")
    public class189[] field2576;

    @OriginalMember(owner = "client!hg", name = "A", descriptor = "[I")
    public static int[] field2570 = new int[14];

    @OriginalMember(owner = "client!hg", name = "I", descriptor = "Ljava/lang/String;")
    public static String field2577 = "Loaded defaults";

    @OriginalMember(owner = "client!hg", name = "N", descriptor = "I")
    public static int field2582 = 0;

    @OriginalMember(owner = "client!hg", name = "C", descriptor = "I")
    public static int field2571;

    @OriginalMember(owner = "client!hg", name = "D", descriptor = "I")
    public static int field2572;

    @OriginalMember(owner = "client!hg", name = "F", descriptor = "I")
    public static int field2574;

    @OriginalMember(owner = "client!hg", name = "J", descriptor = "I")
    public static int field2578;

    @OriginalMember(owner = "client!hg", name = "K", descriptor = "I")
    public static int field2579;

    @OriginalMember(owner = "client!hg", name = "L", descriptor = "I")
    public static int field2580;

    @OriginalMember(owner = "client!hg", name = "M", descriptor = "I")
    public static int field2581;

    @OriginalMember(owner = "client!hg", name = "G", descriptor = "Lrn;")
    public static class18 field2575;

    @OriginalMember(owner = "client!hg", name = "E", descriptor = "Z")
    public static boolean field2573;

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "(I)V", line = 6)
    public static final void method1295(int arg0) {
        field2578++;
        class294.field4575 = new class317();
        if (arg0 >= -7) {
            method1297(-70, (class342) null, 76, (byte) 49, -30);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIIIIIIIIIIII)V", line = 20)
    public static final void method1296(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        field2571++;
        class311 var13 = new class311();
        if (arg0 != 0) {
            return;
        }
        var13.field4814 = arg11;
        var13.field4835 = arg10;
        var13.field4817 = arg3;
        var13.field4829 = arg5;
        var13.field4815 = arg12;
        var13.field4836 = arg7;
        var13.field4833 = arg4;
        var13.field4831 = arg1;
        var13.field4828 = arg6;
        var13.field4813 = arg8;
        var13.field4809 = arg2;
        var13.field4819 = arg9;
        class166.field2638.method2245(var13, 47);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ILrg;IBI)V", line = 49)
    public static final void method1297(int arg0, class342 arg1, int arg2, byte arg3, int arg4) {
        field2581++;
        int var5 = 95 % ((arg3 - 6) / 39);
        class102.method886(true);
        if (class240.field3737) {
            class213.method1595(arg0, arg4, arg1.field5374 + arg0, arg1.field5339 + arg4);
        } else {
            class60.method598(arg0, arg4, arg1.field5374 + arg0, arg1.field5339 + arg4);
        }
        if (class151.field2462 != 2 && class151.field2462 != 5 && class248.field3851 != null) {
            int var6;
            int var7;
            int var8;
            int var9;
            if (class314.field4858 == 4) {
                var6 = class64.field979;
                var7 = (int) class313.field4846 & 0x7FF;
                var8 = class62.field950;
                var9 = 256;
            } else {
                var8 = class173.field2746.field1286;
                var6 = class173.field2746.field1359;
                var7 = (int) class313.field4846 + class290.field4513 & 0x7FF;
                var9 = class236.field3676 + 256;
            }
            int var10 = var6 / 32 + 48;
            int var11 = 464 - (var8 / 32);
            if (class240.field3737) {
                ((class2) class248.field3851).method16(arg0, arg4, arg1.field5374, arg1.field5339, var10, var11, var7, var9, (class2) arg1.method2399(false, 0));
            } else {
                ((class361) class248.field3851).method525(arg0, arg4, arg1.field5374, arg1.field5339, var10, var11, var7, var9, arg1.field5272, arg1.field5428);
            }
            if (class327.field5027 != null) {
                for (int var12 = 0; var12 < class327.field5027.field920; var12++) {
                    if (class327.field5027.field922[var12] != null && (class327.field5027.field914[var12] >> 28) == class119.field1826) {
                        int var13 = (class327.field5027.field914[var12] >> 14 & 0x3FFF) - class358.field5696;
                        int var14 = (class327.field5027.field914[var12] & 0x3FFF) - class49.field755;
                        if (var13 >= 0 && var13 < 104 && var14 >= 0 && var14 < 104) {
                            int var15 = var13 * 4 + 2 - var6 / 32;
                            int var16 = var14 * 4 + (2 - var8 / 32);
                            class74.method691(var15, arg4, arg1, class327.field5027.field922[var12].field349, arg0, var16, -25135);
                        }
                    }
                }
            }
            for (int var17 = 0; var17 < class254.field3913; var17++) {
                int var18 = class283.field4378[var17] * 4 - (var6 / 32 - 2);
                int var19 = class339.field5218[var17] * 4 + 2 - (var8 / 32);
                class212 var20 = class43.method437(45, class324.field4989[var17]);
                if (var20.field3289 != null) {
                    var20 = var20.method1568((byte) -116);
                    if (var20 == null || var20.field3336 == -1) {
                        continue;
                    }
                }
                class74.method691(var18, arg4, arg1, var20.field3336, arg0, var19, -25135);
            }
            for (int var21 = 0; var21 < 104; var21++) {
                for (int var22 = 0; var22 < 104; var22++) {
                    class317 var23 = class349.field5540[class119.field1826][var21][var22];
                    if (var23 != null) {
                        int var24 = var21 * 4 + 2 - (var6 / 32);
                        int var25 = var22 * 4 + 2 - (var8 / 32);
                        class217.method1621(arg4, var24, arg0, arg1, class160.field2557[0], -24, var25);
                    }
                }
            }
            for (int var26 = 0; var26 < class6.field80; var26++) {
                class244 var27 = class110.field1683[class126.field2114[var26]];
                if (var27 != null && var27.method811(256)) {
                    class130 var28 = var27.field3802;
                    if (var28 != null && var28.field2149 != null) {
                        var28 = var28.method1120((byte) -124);
                    }
                    if (var28 != null && var28.field2202 && var28.field2205) {
                        int var29 = var27.field1359 / 32 - (var6 / 32);
                        int var30 = var27.field1286 / 32 - (var8 / 32);
                        if (var28.field2209 == -1) {
                            class217.method1621(arg4, var29, arg0, arg1, class160.field2557[1], -94, var30);
                        } else {
                            class74.method691(var29, arg4, arg1, var28.field2209, arg0, var30, -25135);
                        }
                    }
                }
            }
            for (int var31 = 0; var31 < class66.field995; var31++) {
                class171 var32 = class177.field2795[class345.field5495[var31]];
                if (var32 != null && var32.method811(256)) {
                    int var33 = var32.field1359 / 32 - (var6 / 32);
                    int var34 = var32.field1286 / 32 - (var8 / 32);
                    boolean var35 = false;
                    for (int var36 = 0; var36 < class131.field2215; var36++) {
                        if (var32.field2706.equals(class83.field1197[var36]) && class55.field807[var36] != 0) {
                            var35 = true;
                            break;
                        }
                    }
                    boolean var37 = false;
                    for (int var38 = 0; var38 < class167.field2647; var38++) {
                        if (var32.field2706.equals(class13.field191[var38].field581)) {
                            var37 = true;
                            break;
                        }
                    }
                    boolean var39 = false;
                    if (class173.field2746.field2696 != 0 && var32.field2696 != 0 && class173.field2746.field2696 == var32.field2696) {
                        var39 = true;
                    }
                    if (var35) {
                        class217.method1621(arg4, var33, arg0, arg1, class160.field2557[3], -45, var34);
                    } else if (var37) {
                        class217.method1621(arg4, var33, arg0, arg1, class160.field2557[5], -24, var34);
                    } else if (var39) {
                        class217.method1621(arg4, var33, arg0, arg1, class160.field2557[4], -98, var34);
                    } else {
                        class217.method1621(arg4, var33, arg0, arg1, class160.field2557[2], -90, var34);
                    }
                }
            }
            class68[] var40 = class301.field4677;
            for (int var41 = 0; var41 < var40.length; var41++) {
                class68 var42 = var40[var41];
                if (var42 != null && var42.field1036 != 0 && (class360.field5718 % 20) < 10) {
                    if (var42.field1036 == 1 && var42.field1035 >= 0 && var42.field1035 < class110.field1683.length) {
                        class244 var43 = class110.field1683[var42.field1035];
                        if (var43 != null) {
                            int var44 = var43.field1359 / 32 - var6 / 32;
                            int var45 = var43.field1286 / 32 - (var8 / 32);
                            class338.method2373(var44, var42.field1044, 360000, arg0, arg4, 0, var45, arg1);
                        }
                    }
                    if (var42.field1036 == 2) {
                        int var46 = (var42.field1051 - class358.field5696) * 4 + 2 - (var6 / 32);
                        int var47 = var42.field1043 * 4;
                        int var48 = (var42.field1041 - class49.field755) * 4 + 2 - (var8 / 32);
                        int var49 = var47 * var47;
                        class338.method2373(var46, var42.field1044, var49, arg0, arg4, 0, var48, arg1);
                    }
                    if (var42.field1036 == 10 && var42.field1035 >= 0 && class177.field2795.length > var42.field1035) {
                        class171 var50 = class177.field2795[var42.field1035];
                        if (var50 != null) {
                            int var51 = var50.field1359 / 32 - (var6 / 32);
                            int var52 = var50.field1286 / 32 - (var8 / 32);
                            class338.method2373(var51, var42.field1044, 360000, arg0, arg4, 0, var52, arg1);
                        }
                    }
                }
            }
            if (class314.field4858 != 4) {
                if (class266.field4126 != 0) {
                    int var53 = class266.field4126 * 4 + class173.field2746.method808(114) * 2 + 2 - var6 / 32 - 2;
                    int var54 = class278.field4291 * 4 + (class173.field2746.method808(-17) + -1) * 2 + 2 - (var8 / 32);
                    class217.method1621(arg4, var53, arg0, arg1, class342.field5410[class29.field472 ? 1 : 0], -122, var54);
                }
                if (class240.field3737) {
                    class213.method1593(arg1.field5374 / 2 + arg0 - 1, arg1.field5339 / 2 + arg4 + -1, 3, 3, 16777215);
                } else {
                    class60.method611(arg1.field5374 / 2 + arg0 - 1, arg1.field5339 / 2 + arg4 + -1, 3, 3, 16777215);
                }
            }
        } else if (class240.field3737) {
            class215 var55 = arg1.method2399(false, 0);
            if (var55 != null) {
                var55.method17(arg0, arg4);
            }
        } else {
            class60.method612(arg0, arg4, 0, arg1.field5272, arg1.field5428);
        }
        class349.field5544[arg2] = true;
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(II)Z", line = 376)
    public final boolean method1298(int arg0, int arg1) {
        if (arg1 != 32) {
            method1300((byte) 116);
        }
        field2580++;
        return this.field2576[arg0].field2973;
    }

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "(II)Z", line = 387)
    public final boolean method1299(int arg0, int arg1) {
        field2572++;
        return arg1 == 18329 ? this.field2576[arg0].field2963 : true;
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(Lrn;Lrn;IZ)V", line = 400)
    public class162(class18 arg0, class18 arg1, int arg2, boolean arg3) {
        class317 var5 = new class317();
        int var6 = arg0.method197((byte) 127, arg2);
        this.field2576 = new class189[var6];
        int[] var7 = arg0.method183(false, arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method187(arg2, var7[var8], -1);
            int var10 = var9[1] & 0xFF | (var9[0] & 0xFF) << 8;
            class293 var11 = null;
            for (class293 var12 = (class293) var5.method2244((byte) -125); var12 != null; var12 = (class293) var5.method2241(-1)) {
                if (var12.field4552 == var10) {
                    var11 = var12;
                    break;
                }
            }
            if (var11 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method204(0, (byte) 120, var10);
                } else {
                    var13 = arg1.method204(var10, (byte) 27, 0);
                }
                var11 = new class293(var10, var13);
                var5.method2245(var11, 33);
            }
            this.field2576[var7[var8]] = new class189(var9, var11);
        }
    }

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "(B)V", line = 464)
    public static void method1300(byte arg0) {
        field2577 = null;
        field2575 = null;
        field2570 = null;
        if (arg0 != -111) {
            method1295(26);
        }
    }
}
