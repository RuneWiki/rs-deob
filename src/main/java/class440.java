import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class440 extends class83 {

    @OriginalMember(owner = "client!ee", name = "K", descriptor = "I")
    public static int field6429;

    @OriginalMember(owner = "client!ee", name = "L", descriptor = "I")
    public static int field6430;

    @OriginalMember(owner = "client!ee", name = "M", descriptor = "I")
    public static int field6431;

    @OriginalMember(owner = "client!ee", name = "N", descriptor = "I")
    public static int field6432;

    @OriginalMember(owner = "client!ee", name = "P", descriptor = "I")
    public static int field6434;

    @OriginalMember(owner = "client!ee", name = "Q", descriptor = "I")
    public static int field6435;

    @OriginalMember(owner = "client!ee", name = "R", descriptor = "I")
    public static int field6436;

    @OriginalMember(owner = "client!ee", name = "S", descriptor = "I")
    public static int field6437;

    @OriginalMember(owner = "client!ee", name = "O", descriptor = "Llg;")
    public static class20 field6433;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IBLtq;)V")
    public final void method35(int arg0, byte arg1, class250 arg2) {
        int var4 = 42 / ((arg1 - -27) / 50);
        ++field6434;
        if (~arg0 == -1) {
            super.field924 = arg2.method1350(31351) == 1;
        }
    }

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "(Z)V")
    public static void method2723(boolean arg0) {
        if (!arg0) {
            method2723(true);
        }
        field6433 = null;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IZLam;ZIII)V")
    public static final void method2724(int arg0, boolean arg1, class286 arg2, boolean arg3, int arg4, int arg5, int arg6) {
        class412.field5953 = arg0;
        class252.field3445 = 1;
        class242.field3303 = arg1;
        ++field6431;
        class266.field3616 = arg2;
        if (arg3) {
            method2725(false, (byte[]) null);
        }
        class425.field6234 = arg5;
        class27.field259 = arg4;
        class109.field1333 = arg6;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method21(boolean arg0, int arg1) {
        if (!arg0) {
            method2727(25, (byte) -21);
        }
        ++field6432;
        int[][] var3 = super.field927.method1774((byte) -70, arg1);
        if (super.field927.field4104) {
            int[][] var4 = this.method449(0, true, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class420.field6139 > var11; ++var11) {
                var8[var11] = -var5[var11] + 4096;
                var9[var11] = 4096 - var6[var11];
                var10[var11] = -var7[var11] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Z[B)[B")
    public static final byte[] method2725(boolean arg0, byte[] arg1) {
        if (!arg0) {
            field6433 = null;
        }
        ++field6430;
        int var2 = arg1.length;
        byte[] var3 = new byte[var2];
        class358.method2183(arg1, 0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lfd;III)V")
    public static final void method2726(class194 arg0, int arg1, int arg2, int arg3) {
        ++field6437;
        if (~arg0.field2493 == -2) {
            class380.method2342(0, "", (byte) -122, 0L, -1, arg0.field2582, arg0.field2502, 42);
            ++class77.field870;
        }
        if (~arg0.field2493 == -3 && !class65.field682) {
            String var4 = class430.method2659(arg0, 9);
            if (var4 != null) {
                ++class410.field5932;
                class380.method2342(-1, "<col=00ff00>" + arg0.field2519, (byte) -106, 0L, -1, var4, arg0.field2502, 4);
            }
        }
        if (arg0.field2493 == 3) {
            ++class9.field83;
            class380.method2342(0, "", (byte) -110, 0L, -1, class168.field2129, arg0.field2502, 24);
        }
        if (arg2 <= 10) {
            field6433 = null;
        }
        if (arg0.field2493 == 4) {
            class380.method2342(0, "", (byte) -113, 0L, -1, arg0.field2582, arg0.field2502, 36);
            ++class138.field1771;
        }
        if (arg0.field2493 == 5) {
            ++class437.field6392;
            class380.method2342(0, "", (byte) -104, 0L, -1, arg0.field2582, arg0.field2502, 10);
        }
        if (~arg0.field2493 == -7 && class203.field2717 == null) {
            class380.method2342(-1, "", (byte) -95, 0L, -1, arg0.field2582, arg0.field2502, 44);
            ++class435.field6354;
        }
        if (arg0.field2492 == 2) {
            int var5 = 0;
            for (int var6 = 0; ~arg0.field2450 < ~var6; ++var6) {
                for (int var7 = 0; ~var7 > ~arg0.field2495; ++var7) {
                    int var8 = (arg0.field2602 + 32) * var7;
                    int var9 = (arg0.field2538 + 32) * var6;
                    if (~var5 > -21) {
                        var9 += arg0.field2618[var5];
                        var8 += arg0.field2532[var5];
                    }
                    if (~var8 >= ~arg3 && ~var9 >= ~arg1 && var8 + 32 > arg3 && ~(var9 + 32) < ~arg1) {
                        class212.field2878 = arg0;
                        class249.field3362 = var5;
                        if (~arg0.field2473[var5] < -1) {
                            class219 var10 = client.method1410(arg0);
                            class123 var11 = class65.method368(arg0.field2473[var5] + -1, -119);
                            if (~class171.field2155 == -2 && var10.method1177(-28939)) {
                                if (class108.field1325 != arg0.field2502 || ~class6.field57 != ~var5) {
                                    class380.method2342(var5, class114.field1425 + " -> <col=ff9040>" + var11.field1519, (byte) -128, (long) var11.field1572, class418.field6013, class12.field113, arg0.field2502, 51);
                                    ++class58.field594;
                                }
                            } else if (class65.field682 && var10.method1177(-28939)) {
                                class193 var12 = ~class291.field3960 == 0 ? null : class110.method580(class291.field3960, true);
                                if (~(class306.field4143 & 16) != -1 && (var12 == null || ~var11.method663(var12.field2441, class291.field3960, 1) != ~var12.field2441)) {
                                    ++class424.field6222;
                                    class380.method2342(var5, class77.field874 + " -> <col=ff9040>" + var11.field1519, (byte) -93, (long) var11.field1572, class383.field5467, class132.field1699, arg0.field2502, 59);
                                }
                            } else {
                                String[] var13 = var11.field1574;
                                if (var10.method1177(-28939)) {
                                    for (int var14 = 4; var14 >= 3; --var14) {
                                        if (var13 != null && var13[var14] != null) {
                                            byte var15;
                                            if (~var14 != -4) {
                                                var15 = 1;
                                            } else {
                                                var15 = 13;
                                            }
                                            int var16 = -1;
                                            if (~var11.field1513 == ~var14) {
                                                var16 = var11.field1554;
                                            }
                                            if (~var11.field1570 == ~var14) {
                                                var16 = var11.field1561;
                                            }
                                            ++class10.field90;
                                            class380.method2342(var5, "<col=ff9040>" + var11.field1519, (byte) -107, (long) var11.field1572, var16, var13[var14], arg0.field2502, var15);
                                        }
                                    }
                                }
                                if (var10.method1183(-6780)) {
                                    ++class54.field549;
                                    class380.method2342(var5, "<col=ff9040>" + var11.field1519, (byte) -92, (long) var11.field1572, class418.field6013, class12.field113, arg0.field2502, 16);
                                }
                                if (var10.method1177(-28939) && var13 != null) {
                                    for (int var17 = 2; var17 >= 0; --var17) {
                                        if (var13[var17] != null) {
                                            byte var18 = 0;
                                            if (~var17 == -1) {
                                                var18 = 15;
                                            }
                                            int var19 = -1;
                                            if (~var17 == -2) {
                                                var18 = 32;
                                            }
                                            if (~var11.field1513 == ~var17) {
                                                var19 = var11.field1554;
                                            }
                                            if (~var17 == -3) {
                                                var18 = 5;
                                            }
                                            if (~var11.field1570 == ~var17) {
                                                var19 = var11.field1561;
                                            }
                                            ++class164.field2096;
                                            class380.method2342(var5, "<col=ff9040>" + var11.field1519, (byte) -94, (long) var11.field1572, var19, var13[var17], arg0.field2502, var18);
                                        }
                                    }
                                }
                                String[] var20 = arg0.field2628;
                                if (var20 != null) {
                                    for (int var21 = 4; ~var21 <= -1; --var21) {
                                        if (var20[var21] != null) {
                                            byte var22 = 0;
                                            if (~var21 == -1) {
                                                var22 = 41;
                                            }
                                            int var23 = -1;
                                            if (~var21 == -2) {
                                                var22 = 26;
                                            }
                                            if (~var21 == -3) {
                                                var22 = 35;
                                            }
                                            if (var21 == 3) {
                                                var22 = 43;
                                            }
                                            if (var21 == 4) {
                                                var22 = 31;
                                            }
                                            if (~var11.field1513 == ~var21) {
                                                var23 = var11.field1554;
                                            }
                                            if (~var11.field1570 == ~var21) {
                                                var23 = var11.field1561;
                                            }
                                            ++class339.field4522;
                                            class380.method2342(var5, "<col=ff9040>" + var11.field1519, (byte) -113, (long) var11.field1572, var23, var20[var21], arg0.field2502, var22);
                                        }
                                    }
                                }
                                ++class231.field3177;
                                class380.method2342(var5, "<col=ff9040>" + var11.field1519, (byte) -98, (long) var11.field1572, class356.field5023, class434.field6349, arg0.field2502, 1001);
                            }
                        }
                    }
                    ++var5;
                }
            }
        }
        if (arg0.field2575) {
            if (!class65.field682) {
                for (int var24 = 9; var24 >= 5; --var24) {
                    String var28 = class211.method1149(arg0, var24, 28255);
                    if (var28 != null) {
                        class380.method2342(arg0.field2542, arg0.field2535, (byte) -106, (long) (var24 + 1), class125.method675(0, var24, arg0), var28, arg0.field2502, 1006);
                        ++class129.field1663;
                    }
                }
                String var25 = class430.method2659(arg0, 9);
                if (var25 != null) {
                    class380.method2342(arg0.field2542, arg0.field2535, (byte) -110, 0L, -1, var25, arg0.field2502, 4);
                    ++class410.field5932;
                }
                for (int var26 = 4; ~var26 <= -1; --var26) {
                    String var27 = class211.method1149(arg0, var26, 28255);
                    if (var27 != null) {
                        ++class129.field1663;
                        class380.method2342(arg0.field2542, arg0.field2535, (byte) -99, (long) (var26 - -1), class125.method675(0, var26, arg0), var27, arg0.field2502, 45);
                    }
                }
                if (client.method1410(arg0).method1179((byte) 57)) {
                    if (arg0.field2549 == null) {
                        class380.method2342(arg0.field2542, "", (byte) -95, 0L, -1, class1.field6, arg0.field2502, 44);
                    } else {
                        class380.method2342(arg0.field2542, "", (byte) -105, 0L, -1, arg0.field2549, arg0.field2502, 44);
                    }
                    ++class435.field6354;
                    return;
                }
                return;
            }
            if (client.method1410(arg0).method1181(false) && (32 & class306.field4143) != 0) {
                class380.method2342(arg0.field2542, class77.field874 + " -> " + arg0.field2535, (byte) -122, 0L, class383.field5467, class132.field1699, arg0.field2502, 18);
                ++class428.field6288;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IB)Z")
    public static final boolean method2727(int arg0, byte arg1) {
        if (arg1 != 34) {
            field6433 = null;
        }
        class243.field3305 = arg0 + 1 & 65535;
        ++field6429;
        class213.field2883 = true;
        return true;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(II)[I")
    public final int[] method37(int arg0, int arg1) {
        if (arg0 != 2) {
            return null;
        } else {
            ++field6436;
            int[] var3 = super.field916.method1813(arg1, (byte) 123);
            if (super.field916.field4174) {
                int[] var4 = this.method451(0, 98, arg1);
                for (int var5 = 0; class420.field6139 > var5; ++var5) {
                    var3[var5] = 4096 - var4[var5];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "(II)Lhi;")
    public static final class353 method2728(int arg0, int arg1) {
        ++field6435;
        class353 var2 = (class353) class421.field6158.method616(123, (long) arg1);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class36.field380.method1687(arg1, arg0, 255);
            class353 var4 = new class353();
            if (var3 != null) {
                var4.method2162(-2002421144, new class250(var3));
            }
            var4.method2164(arg0 ^ -134280);
            class421.field6158.method615((byte) -119, (long) arg1, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "()V")
    public class440() {
        super(1, false);
    }
}
