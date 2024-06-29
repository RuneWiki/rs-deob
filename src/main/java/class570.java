import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class570 {

    @OriginalMember(owner = "client!qj", name = "g", descriptor = "[Lmg;")
    public static class246[] field8021 = new class246[37];

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "Lo;")
    public static class208 field8018 = new class208(6, 0, 4, 2);

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "I")
    public static int field8015;

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "I")
    public static int field8016;

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "I")
    public static int field8017;

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "I")
    public static int field8019;

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "I")
    public static int field8020;

    @OriginalMember(owner = "client!qj", name = "h", descriptor = "Lcaa;")
    public static class602 field8022;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(B)V")
    public static final void method3352(byte arg0) {
        class210.field2919++;
        if (arg0 >= -113) {
            field8018 = null;
        }
        field8015++;
        class116 var1 = class248.method1672(class84.field1023, class408.field5737, -20647);
        var1.field1575.method3005(255, class647.method3714(98));
        var1.field1575.method2986(class742.field10226, 105);
        var1.field1575.method2986(class249.field3700, -15);
        var1.field1575.method3005(255, class688.field9602.field8529.method4329((byte) -98));
        class443.method2655(0, var1);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)V")
    public static void method3353(int arg0) {
        field8021 = null;
        field8022 = null;
        if (arg0 != -25562) {
            field8016 = -86;
        }
        field8018 = null;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIIIIIIIIILsn;)Z")
    public static final boolean method3354(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class739 arg10) {
        field8017++;
        int var11 = arg8;
        int var12 = arg6;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg8 - var13;
        if (arg3 != -1) {
            method3355((byte) -88, false);
        }
        class135.field1727[var13][var14] = 99;
        int var16 = arg6 - var14;
        class666.field9358[var13][var14] = 0;
        byte var17 = 0;
        int var18 = 0;
        class723.field10017[var17] = arg8;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class663.field9330[var10001] = arg6;
        int[][] var19 = arg10.field10184;
        while (var26 != var18) {
            var11 = class723.field10017[var18];
            var12 = class663.field9330[var18];
            int var20 = var12 - var16;
            var18 = var18 + 1 & 0xFFF;
            int var21 = var11 - var15;
            int var22 = var11 - arg10.field10176;
            int var23 = var12 - arg10.field10196;
            if (arg0 == -4) {
                if (arg5 == var11 && arg1 == var12) {
                    class730.field10104 = var11;
                    class386.field5509 = var12;
                    return true;
                }
            } else if (arg0 == -3) {
                if (class615.method3550(2, var12, arg1, 56, arg7, 2, arg5, arg4, var11)) {
                    class730.field10104 = var11;
                    class386.field5509 = var12;
                    return true;
                }
            } else if (arg0 == -2) {
                if (arg10.method4093(arg1, arg4, 2, var11, arg9, 2, (byte) -33, arg5, arg7, var12)) {
                    class386.field5509 = var12;
                    class730.field10104 = var11;
                    return true;
                }
            } else if (arg0 == -1) {
                if (arg10.method4097(var12, var11, arg7, 2, arg1, arg3 ^ 0x7C, arg4, arg9, arg5)) {
                    class730.field10104 = var11;
                    class386.field5509 = var12;
                    return true;
                }
            } else if (arg0 == 0 || arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 9) {
                if (arg10.method4090(arg1, var12, arg2, 2, arg0, 32768, var11, arg5)) {
                    class730.field10104 = var11;
                    class386.field5509 = var12;
                    return true;
                }
            } else if (arg10.method4087(2, var11, arg0, arg5, var12, arg2, (byte) 105, arg1)) {
                class386.field5509 = var12;
                class730.field10104 = var11;
                return true;
            }
            int var25 = class666.field9358[var21][var20] + 1;
            if (var21 > 0 && class135.field1727[var21 - 1][var20] == 0 && (var19[var22 - 1][var23] & 0x43A40000) == 0 && (var19[var22 - 1][var23 + 1] & 0x4E240000) == 0) {
                class723.field10017[var26] = var11 - 1;
                class663.field9330[var26] = var12;
                class135.field1727[var21 - 1][var20] = 2;
                var26 = var26 + 1 & 0xFFF;
                class666.field9358[var21 - 1][var20] = var25;
            }
            if (var21 < 126 && class135.field1727[var21 + 1][var20] == 0 && (var19[var22 + 2][var23] & 0x60E40000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78240000) == 0) {
                class723.field10017[var26] = var11 + 1;
                class663.field9330[var26] = var12;
                class135.field1727[var21 + 1][var20] = 8;
                var26 = var26 + 1 & 0xFFF;
                class666.field9358[var21 + 1][var20] = var25;
            }
            if (var20 > 0 && class135.field1727[var21][var20 - 1] == 0 && (var19[var22][var23 - 1] & 0x43A40000) == 0 && (var19[var22 + 1][var23 - 1] & 0x60E40000) == 0) {
                class723.field10017[var26] = var11;
                class663.field9330[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class135.field1727[var21][var20 - 1] = 1;
                class666.field9358[var21][var20 - 1] = var25;
            }
            if (var20 < 126 && class135.field1727[var21][var20 + 1] == 0 && (var19[var22][var23 + 2] & 0x4E240000) == 0 && (var19[var22 + 1][var23 + 2] & 0x78240000) == 0) {
                class723.field10017[var26] = var11;
                class663.field9330[var26] = var12 + 1;
                class135.field1727[var21][var20 + 1] = 4;
                var26 = var26 + 1 & 0xFFF;
                class666.field9358[var21][var20 + 1] = var25;
            }
            if (var21 > 0 && var20 > 0 && class135.field1727[var21 - 1][var20 - 1] == 0 && (var19[var22 - 1][var23] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 - 1] & 0x43A40000) == 0 && (var19[var22][var23 - 1] & 0x63E40000) == 0) {
                class723.field10017[var26] = var11 - 1;
                class663.field9330[var26] = var12 - 1;
                class135.field1727[var21 - 1][var20 - 1] = 3;
                var26 = var26 + 1 & 0xFFF;
                class666.field9358[var21 - 1][var20 - 1] = var25;
            }
            if (var21 < 126 && var20 > 0 && class135.field1727[var21 + 1][var20 - 1] == 0 && (var19[var22 + 1][var23 - 1] & 0x63E40000) == 0 && (var19[var22 + 2][var23 - 1] & 0x60E40000) == 0 && (var19[var22 + 2][var23] & 0x78E40000) == 0) {
                class723.field10017[var26] = var11 + 1;
                class663.field9330[var26] = var12 - 1;
                class135.field1727[var21 + 1][var20 - 1] = 9;
                var26 = var26 + 1 & 0xFFF;
                class666.field9358[var21 + 1][var20 - 1] = var25;
            }
            if (var21 > 0 && var20 < 126 && class135.field1727[var21 - 1][var20 + 1] == 0 && (var19[var22 - 1][var23 + 1] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 + 2] & 0x4E240000) == 0 && (var19[var22][var23 + 2] & 0x7E240000) == 0) {
                class723.field10017[var26] = var11 - 1;
                class663.field9330[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class135.field1727[var21 - 1][var20 + 1] = 6;
                class666.field9358[var21 - 1][var20 + 1] = var25;
            }
            if (var21 < 126 && var20 < 126 && class135.field1727[var21 + 1][var20 + 1] == 0 && (var19[var22 + 1][var23 + 2] & 0x7E240000) == 0 && (var19[var22 + 2][var23 + 2] & 0x78240000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78E40000) == 0) {
                class723.field10017[var26] = var11 + 1;
                class663.field9330[var26] = var12 + 1;
                class135.field1727[var21 + 1][var20 + 1] = 12;
                var26 = var26 + 1 & 0xFFF;
                class666.field9358[var21 + 1][var20 + 1] = var25;
            }
        }
        class386.field5509 = var12;
        class730.field10104 = var11;
        return false;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(BZ)V")
    public static final void method3355(byte arg0, boolean arg1) {
        if (class679.field9490 != null) {
            class679.field9490.method3634(22654);
            class679.field9490 = null;
        }
        field8020++;
        class567.field7992 = 0;
        class106.method750(true);
        class296.method1944();
        for (int var2 = 0; var2 < 4; var2++) {
            client.field1305[var2].method4089(-1);
        }
        class25.method108(false, (byte) -112);
        System.gc();
        class158.method1017(2, (byte) -127);
        class4.field22 = -1;
        class15.field90 = false;
        class644.method3690(110);
        class350.method2208(true, 0);
        class444.field6151 = 0;
        class236.field3535 = 0;
        class683.field9565 = 0;
        class216.field2971 = 0;
        class372.field5352 = 0;
        class728.field10063 = 0;
        for (int var3 = 0; var3 < class115.field1569.length; var3++) {
            class115.field1569[var3] = null;
        }
        class574.method3367(-1);
        for (int var4 = 0; var4 < 2048; var4++) {
            class413.field5787[var4] = null;
        }
        class429.field5988 = 0;
        class450.field6288.method3672(0);
        class744.field10275 = 0;
        int var5 = 23 / ((59 - arg0) / 34);
        class752.field10377.method3672(0);
        class180.method1147(false);
        class218.field2994 = 0;
        class173.field2192.method3393((byte) 86);
        class39.method309((byte) 121);
        class170.method1096((byte) -7);
        class706.field9819 = null;
        class499.field6843 = null;
        class314.field4511 = null;
        class405.field5711 = 0L;
        class706.field9820 = null;
        class288.field4222 = null;
        if (arg1) {
            class285.method1884(true, 12);
            return;
        }
        class285.method1884(true, 3);
        try {
            class552.method3253(class511.field7007, 115, "loggedout");
        } catch (Throwable var6) {
        }
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(I)V")
    public static final void method3356(int arg0) {
        class43.method336(-1, class81.field906);
        field8019++;
        class161.field2084++;
        if (class86.field1036 && class475.field6583) {
            int var1 = 0;
            int var2 = 0;
            if (class55.field651) {
                var1 = class236.method1611(-5110);
                var2 = class339.method2149((byte) -111);
            }
            int var3 = var1 + class205.field2881.method354((byte) -20);
            int var4 = class205.field2881.method351(-25269) + var2;
            int var5 = var3 - class539.field7463;
            int var6 = var4 - class189.field2371;
            if (class518.field7144 > var5) {
                var5 = class518.field7144;
            }
            if (class518.field7144 + class434.field6028.field1560 < class81.field906.field1560 + var5) {
                var5 = class518.field7144 + class434.field6028.field1560 - class81.field906.field1560;
            }
            if (class474.field6579 > var6) {
                var6 = class474.field6579;
            }
            if (arg0 != -2) {
                method3356(-72);
            }
            if ((class474.field6579 + class434.field6028.field1517) < (class81.field906.field1517 + var6)) {
                var6 = class474.field6579 + class434.field6028.field1517 - class81.field906.field1517;
            }
            int var7 = var5 + class434.field6028.field1559 - class518.field7144;
            int var8 = class434.field6028.field1495 + var6 - class474.field6579;
            if (class205.field2881.method356((byte) -113)) {
                if (class81.field906.field1565 < class161.field2084) {
                    int var10 = var5 - class48.field560;
                    int var11 = var6 - class372.field5347;
                    if (var10 > class81.field906.field1545 || var10 < (-class81.field906.field1545) || var11 > class81.field906.field1545 || (-class81.field906.field1545) > var11) {
                        class653.field9112 = true;
                    }
                }
                if (class81.field906.field1514 != null && class653.field9112) {
                    class114 var12 = new class114();
                    var12.field1372 = var8;
                    var12.field1383 = var7;
                    var12.field1384 = class81.field906.field1514;
                    var12.field1378 = class81.field906;
                    class700.method3959(var12);
                }
            } else {
                if (class653.field9112) {
                    class76.method561(arg0 ^ 0x1);
                    if (class81.field906.field1509 != null) {
                        class114 var9 = new class114();
                        var9.field1384 = class81.field906.field1509;
                        var9.field1376 = class31.field296;
                        var9.field1378 = class81.field906;
                        var9.field1383 = var7;
                        var9.field1372 = var8;
                        class700.method3959(var9);
                    }
                    if (class31.field296 != null && client.method786(class81.field906) != null) {
                        class531.method3152((byte) 98, class31.field296, class81.field906);
                    }
                } else if ((class232.field3488 == 1 || class361.method2270((byte) -124)) && class640.field8992 > 2) {
                    class149.method991(class372.field5347 + class189.field2371, class539.field7463 - -class48.field560, 28694);
                } else if (class392.method2421((byte) -128)) {
                    class149.method991(class372.field5347 + class189.field2371, class539.field7463 + class48.field560, 28694);
                }
                class81.field906 = null;
            }
        } else if (class161.field2084 > 1) {
            class81.field906 = null;
        }
    }
}
