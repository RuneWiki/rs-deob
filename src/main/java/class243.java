import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class243 {

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "Lvl;")
    public static class164 field3995 = new class164(16);

    @OriginalMember(owner = "client!jc", name = "j", descriptor = "Z")
    public static boolean field4004 = true;

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "I")
    public static int field3996;

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "I")
    public static int field3997;

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "I")
    public static int field3998;

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "I")
    public int field4000;

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "I")
    public static int field4001;

    @OriginalMember(owner = "client!jc", name = "i", descriptor = "I")
    public static int field4003;

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "Lpc;")
    public class131 field3999;

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "[I")
    public int[] field4002;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(BLwf;)Z", line = 6)
    public static final boolean method1848(byte arg0, class250 arg1) {
        field3996++;
        if (arg1.field4129 == null) {
            return false;
        }
        if (arg0 <= 88) {
            field3997 = -90;
        }
        for (int var2 = 0; var2 < arg1.field4129.length; var2++) {
            int var3 = class307.method2187(var2, arg1, (byte) 59);
            int var4 = arg1.field4219[var2];
            if (arg1.field4129[var2] == 2) {
                if (var3 >= var4) {
                    return false;
                }
            } else if (arg1.field4129[var2] == 3) {
                if (var4 >= var3) {
                    return false;
                }
            } else if (arg1.field4129[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILqm;)V", line = 64)
    public static final void method1849(int arg0, class227 arg1) {
        field4003++;
        if (arg0 != 22) {
            field4004 = false;
        }
        if ((arg1.field3793.length - arg1.field3760) < 1) {
            return;
        }
        int var2 = arg1.method1720((byte) -59);
        if (var2 < 0 || var2 > 11) {
            return;
        }
        byte var3;
        if (var2 == 11) {
            var3 = 33;
        } else if (var2 == 10) {
            var3 = 32;
        } else if (var2 == 9) {
            var3 = 31;
        } else if (var2 == 8) {
            var3 = 30;
        } else if (var2 == 7) {
            var3 = 29;
        } else if (var2 == 6) {
            var3 = 28;
        } else if (var2 == 5) {
            var3 = 28;
        } else if (var2 == 4) {
            var3 = 24;
        } else if (var2 == 3) {
            var3 = 23;
        } else if (var2 == 2) {
            var3 = 22;
        } else if (var2 == 1) {
            var3 = 23;
        } else {
            var3 = 19;
        }
        if (arg1.field3793.length - arg1.field3760 < var3) {
            return;
        }
        class166.field2649 = arg1.method1720((byte) -13);
        if (class166.field2649 < 1) {
            class166.field2649 = 1;
        } else if (class166.field2649 > 4) {
            class166.field2649 = 4;
        }
        class73.method614(false, arg1.method1720((byte) -104) == 1);
        class160.field2561 = arg1.method1720((byte) -99) == 1;
        class292.field4726 = arg1.method1720((byte) -44) == 1;
        class44.field690 = arg1.method1720((byte) -80) == 1;
        class241.field3979 = arg1.method1720((byte) -82) == 1;
        field4004 = arg1.method1720((byte) -53) == 1;
        class75.field1272 = arg1.method1720((byte) -66) == 1;
        client.field717 = arg1.method1720((byte) -21) == 1;
        class131.field2214 = arg1.method1720((byte) -33);
        if (class131.field2214 > 2) {
            class131.field2214 = 2;
        }
        if (var2 < 2) {
            class3.field36 = arg1.method1720((byte) -58) == 1;
            arg1.method1720((byte) -11);
        } else {
            class3.field36 = arg1.method1720((byte) -66) == 1;
        }
        class193.field3083 = arg1.method1720((byte) -30) == 1;
        class198.field3165 = arg1.method1720((byte) -72) == 1;
        class340.field5436 = arg1.method1720((byte) -64);
        if (class340.field5436 > 2) {
            class340.field5436 = 2;
        }
        class267.field4482 = class340.field5436;
        class248.field4052 = arg1.method1720((byte) -75) == 1;
        class45.field704 = arg1.method1720((byte) -78);
        if (class45.field704 > 127) {
            class45.field704 = 127;
        }
        class235.field3899 = arg1.method1720((byte) -60);
        class272.field4520 = arg1.method1720((byte) -93);
        if (class272.field4520 > 127) {
            class272.field4520 = 127;
        }
        if (var2 >= 1) {
            class137.field2274 = arg1.method1765(true);
            class231.field3837 = arg1.method1765(true);
        }
        if (var2 >= 3 && var2 < 6) {
            arg1.method1720((byte) -105);
        }
        if (var2 >= 4) {
            int var4 = arg1.method1720((byte) -88);
            if (class10.field81 < 96) {
                var4 = 0;
            }
            class158.method1224(var4);
        }
        if (var2 >= 5) {
            class237.field3923 = arg1.method1715((byte) -79);
        }
        if (var2 >= 6) {
            class267.field4462 = arg1.method1720((byte) -113);
        }
        if (var2 >= 7) {
            class257.field4304 = arg1.method1720((byte) -121) == 1;
        }
        if (var2 >= 8) {
            class336.field5314 = arg1.method1720((byte) -114) == 1;
        }
        if (var2 >= 9) {
            class127.field2147 = arg1.method1720((byte) -40);
        }
        if (var2 >= 10) {
            class238.field3932 = arg1.method1720((byte) -105) != 0;
        }
        if (var2 >= 11) {
            class14.field152 = arg1.method1720((byte) -92) != 0;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V", line = 232)
    public static void method1850(int arg0) {
        if (arg0 != 32) {
            method1853(false);
        }
        field3995 = null;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(III)Lqa;", line = 245)
    public static final class338 method1851(int arg0, int arg1, int arg2) {
        class36 var3 = class129.field2184[arg0][arg1][arg2];
        return var3 == null ? null : var3.field533;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lcf;Lth;BLth;)V", line = 261)
    public static final void method1852(class72 arg0, class57 arg1, byte arg2, class57 arg3) {
        class296.field4756 = arg1;
        field4001++;
        class35.field513 = arg3;
        class204.field3230 = arg0;
        if (class296.field4756 != null) {
            class64.field1137 = class296.field4756.method482(27535, 1);
        }
        if (arg2 != -125) {
            method1848((byte) -116, (class250) null);
        }
        if (class35.field513 != null) {
            class325.field5163 = class35.field513.method482(27535, 1);
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Z)V", line = 291)
    public static final void method1853(boolean arg0) {
        while (true) {
            class216 var1 = (class216) class272.field4512.method2307((byte) 127);
            if (var1 == null) {
                if (arg0) {
                    field3995 = (class164) null;
                }
                field3998++;
                return;
            }
            class220 var3;
            if (var1.field3466 < 0) {
                int var2 = -var1.field3466 - 1;
                if (class261.field4399 == var2) {
                    var3 = class6.field55;
                } else {
                    var3 = class56.field924[var2];
                }
            } else {
                int var4 = var1.field3466 - 1;
                var3 = class165.field2621[var4];
            }
            if (var3 != null) {
                class29 var5 = class166.method1292(0, var1.field3449);
                if (class186.field2991 < 3) {
                }
                int var6;
                int var7;
                if (var1.field3451 == 1 || var1.field3451 == 3) {
                    var7 = var5.field342;
                    var6 = var5.field414;
                } else {
                    var6 = var5.field342;
                    var7 = var5.field414;
                }
                int var8 = var1.field3462 + (var6 >> 1);
                int var9 = (var7 >> 1) + var1.field3468;
                int var10 = (var7 + 1 >> 1) + var1.field3468;
                int var11 = (var6 + 1 >> 1) + var1.field3462;
                int[][] var12 = class101.field1656[class186.field2991];
                int var13 = var12[var9][var8] + var12[var10][var8] + var12[var9][var11] + var12[var10][var11] >> 2;
                int var14 = class285.field4651[var1.field3464];
                class161 var15 = null;
                if (var14 == 0) {
                    class338 var19 = method1851(class186.field2991, var1.field3468, var1.field3462);
                    if (var19 != null) {
                        var15 = var19.field5392;
                    }
                } else if (var14 == 1) {
                    class339 var16 = class76.method633(class186.field2991, var1.field3468, var1.field3462);
                    if (var16 != null) {
                        var15 = var16.field5400;
                    }
                } else if (var14 == 2) {
                    class209 var18 = class353.method2496(class186.field2991, var1.field3468, var1.field3462);
                    if (var18 != null) {
                        var15 = var18.field3287;
                    }
                } else if (var14 == 3) {
                    class184 var17 = class291.method2109(class186.field2991, var1.field3468, var1.field3462);
                    if (var17 != null) {
                        var15 = var17.field2968;
                    }
                }
                if (var15 != null) {
                    class186.method1461(0, var1.field3450 + 1, var1.field3462, var14, var1.field3455 + 1, class186.field2991, 0, -1, var1.field3468, 0);
                    int var20 = var1.field3452;
                    var3.field3507 = var1.field3462 * 128 + var6 * 64;
                    var3.field3585 = var13;
                    var3.field3516 = var1.field3468 * 128 + (var7 * 64);
                    var3.field3486 = class332.field5261 + var1.field3450;
                    int var21 = var1.field3459;
                    var3.field3478 = var15;
                    int var22 = var1.field3460;
                    if (var20 < var22) {
                        int var23 = var22;
                        var22 = var20;
                        var20 = var23;
                    }
                    var3.field3505 = var1.field3468 + var20;
                    int var24 = var1.field3453;
                    if (var24 < var21) {
                        int var25 = var21;
                        var21 = var24;
                        var24 = var25;
                    }
                    var3.field3485 = var1.field3462 + var21;
                    var3.field3523 = class332.field5261 + var1.field3455;
                    var3.field3513 = var1.field3462 + var24;
                    var3.field3574 = var1.field3468 + var22;
                }
            }
        }
    }
}
