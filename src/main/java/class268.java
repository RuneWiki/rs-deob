import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class268 {

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "Ljava/lang/String;")
    public static String field4334 = "Checking for updates - ";

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "I")
    public static int field4331;

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "I")
    public static int field4332;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "I")
    public static int field4333;

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "I")
    public static int field4335;

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "Lgi;")
    public static class164 field4337;

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "Lgi;")
    public static class164 field4338;

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "Lhg;")
    public static class190 field4336;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIILrg;)V")
    public static final void method1787(int arg0, int arg1, int arg2, class248 arg3) {
        field4331++;
        if (arg3.field3946 == 1) {
            class207.field3311++;
            class205.method1420(arg3.field4074, 0L, 101, 0, arg3.field3968, -1, "", (short) 28);
        }
        if (arg3.field3946 == 2 && !class101.field1579) {
            String var4 = class157.method1063(arg3, -1);
            if (var4 != null) {
                class205.method1420(var4, 0L, 106, -1, arg3.field3968, -1, "<col=00ff00>" + arg3.field4008, (short) 24);
                class72.field1151++;
            }
        }
        if (arg3.field3946 == 3) {
            class133.field2133++;
            class205.method1420(class174.field2916, 0L, 124, 0, arg3.field3968, -1, "", (short) 37);
        }
        if (arg1 <= 65) {
            return;
        }
        if (arg3.field3946 == 4) {
            class205.method1420(arg3.field4074, 0L, 119, 0, arg3.field3968, -1, "", (short) 49);
            class22.field413++;
        }
        if (arg3.field3946 == 5) {
            class295.field4809++;
            class205.method1420(arg3.field4074, 0L, 104, 0, arg3.field3968, -1, "", (short) 50);
        }
        if (arg3.field3946 == 6 && class221.field3485 == null) {
            class205.method1420(arg3.field4074, 0L, 119, -1, arg3.field3968, -1, "", (short) 23);
            class220.field3457++;
        }
        if (arg3.field4038 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg3.field4029; var6++) {
                for (int var7 = 0; var7 < arg3.field3911; var7++) {
                    int var8 = (arg3.field4030 + 32) * var7;
                    int var9 = (arg3.field4045 + 32) * var6;
                    if (var5 < 20) {
                        var9 += arg3.field3890[var5];
                        var8 += arg3.field4063[var5];
                    }
                    if (arg0 >= var8 && arg2 >= var9 && arg0 < (var8 + 32) && arg2 < var9 + 32) {
                        class218.field3434 = var5;
                        class90.field1410 = arg3;
                        if (arg3.field4041[var5] > 0) {
                            class22 var10 = client.method1126(arg3);
                            class158 var11 = class107.method754(-20563, arg3.field4041[var5] - 1);
                            if (class45.field669 == 1 && var10.method184(true)) {
                                if (class272.field4386 != arg3.field3968 || class119.field1878 != var5) {
                                    class109.field1687++;
                                    class205.method1420(class33.field537, (long) var11.field2557, 101, var5, arg3.field3968, -1, class259.field4248 + " -> <col=ff9040>" + var11.field2532, (short) 8);
                                }
                            } else if (class101.field1579 && var10.method184(true)) {
                                class11 var12 = class133.field2135 == -1 ? null : class177.method1251(class133.field2135, (byte) -97);
                                if ((class44.field652 & 0x10) != 0 && (var12 == null || var11.method1073(class133.field2135, var12.field204, -116) != var12.field204)) {
                                    class218.field3427++;
                                    class205.method1420(class205.field3297, (long) var11.field2557, 106, var5, arg3.field3968, class189.field3096, class211.field3367 + " -> <col=ff9040>" + var11.field2532, (short) 43);
                                }
                            } else {
                                class231.field3619++;
                                String[] var13 = var11.field2565;
                                if (class95.field1512) {
                                    var13 = class84.method599(var13, (byte) -114);
                                }
                                if (var10.method184(true)) {
                                    for (int var14 = 4; var14 >= 3; var14--) {
                                        if (var13 != null && var13[var14] != null) {
                                            class113.field1724++;
                                            byte var15;
                                            if (var14 == 3) {
                                                var15 = 57;
                                            } else {
                                                var15 = 6;
                                            }
                                            class205.method1420(var13[var14], (long) var11.field2557, 104, var5, arg3.field3968, -1, "<col=ff9040>" + var11.field2532, var15);
                                        }
                                    }
                                }
                                if (var10.method175(25)) {
                                    class205.method1420(class33.field537, (long) var11.field2557, 116, var5, arg3.field3968, class90.field1409, "<col=ff9040>" + var11.field2532, (short) 10);
                                    class300.field4925++;
                                }
                                if (var10.method184(true) && var13 != null) {
                                    for (int var16 = 2; var16 >= 0; var16--) {
                                        if (var13[var16] != null) {
                                            byte var17 = 0;
                                            if (var16 == 0) {
                                                var17 = 40;
                                            }
                                            if (var16 == 1) {
                                                var17 = 41;
                                            }
                                            if (var16 == 2) {
                                                var17 = 18;
                                            }
                                            class252.field4134++;
                                            class205.method1420(var13[var16], (long) var11.field2557, 121, var5, arg3.field3968, -1, "<col=ff9040>" + var11.field2532, var17);
                                        }
                                    }
                                }
                                String[] var18 = arg3.field4058;
                                if (class95.field1512) {
                                    var18 = class84.method599(var18, (byte) -120);
                                }
                                if (var18 != null) {
                                    for (int var19 = 4; var19 >= 0; var19--) {
                                        if (var18[var19] != null) {
                                            class252.field4141++;
                                            byte var20 = 0;
                                            if (var19 == 0) {
                                                var20 = 32;
                                            }
                                            if (var19 == 1) {
                                                var20 = 29;
                                            }
                                            if (var19 == 2) {
                                                var20 = 1;
                                            }
                                            if (var19 == 3) {
                                                var20 = 17;
                                            }
                                            if (var19 == 4) {
                                                var20 = 2;
                                            }
                                            class205.method1420(var18[var19], (long) var11.field2557, 105, var5, arg3.field3968, -1, "<col=ff9040>" + var11.field2532, var20);
                                        }
                                    }
                                }
                                class205.method1420(class98.field1552, (long) var11.field2557, 104, var5, arg3.field3968, class63.field1026, "<col=ff9040>" + var11.field2532, (short) 1010);
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg3.field3952) {
            return;
        }
        if (!class101.field1579) {
            for (int var21 = 9; var21 >= 5; var21--) {
                String var25 = class125.method860(var21, -1, arg3);
                if (var25 != null) {
                    class174.field2906++;
                    class205.method1420(var25, (long) (var21 + 1), 122, arg3.field4019, arg3.field3968, class275.method1875(var21, 48, arg3), arg3.field4064, (short) 1005);
                }
            }
            String var22 = class157.method1063(arg3, -1);
            if (var22 != null) {
                class72.field1151++;
                class205.method1420(var22, 0L, 123, arg3.field4019, arg3.field3968, -1, arg3.field4064, (short) 24);
            }
            for (int var23 = 4; var23 >= 0; var23--) {
                String var24 = class125.method860(var23, -1, arg3);
                if (var24 != null) {
                    class205.method1420(var24, (long) (var23 + 1), 121, arg3.field4019, arg3.field3968, class275.method1875(var23, 60, arg3), arg3.field4064, (short) 36);
                    class174.field2906++;
                }
            }
            if (client.method1126(arg3).method183((byte) 126)) {
                class220.field3457++;
                if (arg3.field3947 != null) {
                    class205.method1420(arg3.field3947, 0L, 127, arg3.field4019, arg3.field3968, -1, "", (short) 23);
                    return;
                }
                class205.method1420(class65.field1044, 0L, 120, arg3.field4019, arg3.field3968, -1, "", (short) 23);
                return;
            }
            return;
        }
        if (client.method1126(arg3).method177((byte) 107) && (class44.field652 & 0x20) != 0) {
            class205.method1420(class205.field3297, 0L, 122, arg3.field4019, arg3.field3968, class189.field3096, class211.field3367 + " -> " + arg3.field4064, (short) 33);
            class253.field4147++;
            return;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Z)V")
    public static final void method1788(boolean arg0) {
        class200.method1379(-842114134, arg0);
        System.gc();
        field4332++;
        class143.method983(25, 16590);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIII)I")
    public static final int method1789(int arg0, int arg1, int arg2, int arg3) {
        field4335++;
        int var4 = -97 / ((-arg1 - 29) / 37);
        if (arg3 > arg2) {
            return arg3;
        } else if (arg0 >= arg2) {
            return arg2;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V")
    public static void method1790(int arg0) {
        field4337 = null;
        if (arg0 > 103) {
            field4338 = null;
            field4336 = null;
            field4334 = null;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(III)Llb;")
    public static final class138 method1791(int arg0, int arg1, int arg2) {
        class116 var3 = class307.field4991[arg0][arg1][arg2];
        return var3 == null ? null : var3.field1775;
    }
}
