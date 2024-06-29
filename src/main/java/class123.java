import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class123 {

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "I")
    public static int field1825 = 0;

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "Lui;")
    public static class98 field1826 = new class98(2);

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "Ljava/lang/String;")
    public static String field1830 = "K";

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "I")
    public static int field1824;

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "I")
    public static int field1827;

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "I")
    public static int field1828;

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "[S")
    public static short[] field1829;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)V", line = 4)
    public static void method797(byte arg0) {
        field1826 = null;
        field1829 = null;
        field1830 = null;
        if (arg0 != 86) {
            field1826 = (class98) null;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(BIILsi;)V", line = 17)
    public static final void method798(byte arg0, int arg1, int arg2, class264 arg3) {
        field1828++;
        if (arg3.field4274 == 1) {
            class244.field3849++;
            class322.method2309("", 0, (short) 3, false, -1, arg3.field4319, arg3.field4204, 0L);
        }
        if (arg3.field4274 == 2 && !class107.field1532) {
            String var4 = class345.method2433((byte) -126, arg3);
            if (var4 != null) {
                class322.method2309("<col=00ff00>" + arg3.field4214, -1, (short) 28, false, -1, var4, arg3.field4204, 0L);
                class86.field1245++;
            }
        }
        if (arg3.field4274 == 3) {
            class322.method2309("", 0, (short) 57, false, -1, class166.field2621, arg3.field4204, 0L);
            class115.field1678++;
        }
        if (arg3.field4274 == 4) {
            class48.field694++;
            class322.method2309("", 0, (short) 47, false, -1, arg3.field4319, arg3.field4204, 0L);
        }
        if (arg0 <= 85) {
            return;
        }
        if (arg3.field4274 == 5) {
            class2.field15++;
            class322.method2309("", 0, (short) 11, false, -1, arg3.field4319, arg3.field4204, 0L);
        }
        if (arg3.field4274 == 6 && class172.field2695 == null) {
            class91.field1313++;
            class322.method2309("", -1, (short) 33, false, -1, arg3.field4319, arg3.field4204, 0L);
        }
        if (arg3.field4350 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg3.field4262; var6++) {
                for (int var7 = 0; var7 < arg3.field4188; var7++) {
                    int var8 = (arg3.field4322 + 32) * var7;
                    int var9 = (arg3.field4342 + 32) * var6;
                    if (var5 < 20) {
                        var9 += arg3.field4216[var5];
                        var8 += arg3.field4199[var5];
                    }
                    if (arg1 >= var8 && arg2 >= var9 && var8 + 32 > arg1 && var9 + 32 > arg2) {
                        class20.field247 = var5;
                        class342.field5505 = arg3;
                        if (arg3.field4330[var5] > 0) {
                            class77 var10 = client.method898(arg3);
                            class109 var11 = class322.method2311(arg3.field4330[var5] - 1, -101);
                            if (class56.field856 == 1 && var10.method517(-512512417)) {
                                if (class104.field1511 != arg3.field4204 || class264.field4353 != var5) {
                                    class45.field658++;
                                    class322.method2309(class37.field550 + " -> <col=ff9040>" + var11.field1596, var5, (short) 50, false, -1, class182.field2834, arg3.field4204, (long) var11.field1551);
                                }
                            } else if (class107.field1532 && var10.method517(-512512417)) {
                                class21 var12 = class41.field628 == -1 ? null : class74.method504(class41.field628, 93);
                                if ((class29.field447 & 0x10) != 0 && (var12 == null || var11.method719(class41.field628, (byte) 51, var12.field264) != var12.field264)) {
                                    class187.field2910++;
                                    class322.method2309(class167.field2630 + " -> <col=ff9040>" + var11.field1596, var5, (short) 5, false, class339.field5457, class120.field1776, arg3.field4204, (long) var11.field1551);
                                }
                            } else {
                                String[] var13 = var11.field1569;
                                if (class15.field203) {
                                    var13 = class16.method112(0, var13);
                                }
                                if (var10.method517(-512512417)) {
                                    for (int var14 = 4; var14 >= 3; var14--) {
                                        if (var13 != null && var13[var14] != null) {
                                            class139.field2215++;
                                            byte var15;
                                            if (var14 == 3) {
                                                var15 = 24;
                                            } else {
                                                var15 = 22;
                                            }
                                            class322.method2309("<col=ff9040>" + var11.field1596, var5, var15, false, -1, var13[var14], arg3.field4204, (long) var11.field1551);
                                        }
                                    }
                                }
                                class229.field3601++;
                                if (var10.method522((byte) -92)) {
                                    class148.field2382++;
                                    class322.method2309("<col=ff9040>" + var11.field1596, var5, (short) 46, false, class210.field3203, class182.field2834, arg3.field4204, (long) var11.field1551);
                                }
                                if (var10.method517(-512512417) && var13 != null) {
                                    for (int var16 = 2; var16 >= 0; var16--) {
                                        if (var13[var16] != null) {
                                            class283.field4647++;
                                            byte var17 = 0;
                                            if (var16 == 0) {
                                                var17 = 7;
                                            }
                                            if (var16 == 1) {
                                                var17 = 34;
                                            }
                                            if (var16 == 2) {
                                                var17 = 17;
                                            }
                                            class322.method2309("<col=ff9040>" + var11.field1596, var5, var17, false, -1, var13[var16], arg3.field4204, (long) var11.field1551);
                                        }
                                    }
                                }
                                String[] var18 = arg3.field4217;
                                if (class15.field203) {
                                    var18 = class16.method112(0, var18);
                                }
                                if (var18 != null) {
                                    for (int var19 = 4; var19 >= 0; var19--) {
                                        if (var18[var19] != null) {
                                            class222.field3431++;
                                            byte var20 = 0;
                                            if (var19 == 0) {
                                                var20 = 18;
                                            }
                                            if (var19 == 1) {
                                                var20 = 26;
                                            }
                                            if (var19 == 2) {
                                                var20 = 13;
                                            }
                                            if (var19 == 3) {
                                                var20 = 41;
                                            }
                                            if (var19 == 4) {
                                                var20 = 39;
                                            }
                                            class322.method2309("<col=ff9040>" + var11.field1596, var5, var20, false, -1, var18[var19], arg3.field4204, (long) var11.field1551);
                                        }
                                    }
                                }
                                class322.method2309("<col=ff9040>" + var11.field1596, var5, (short) 1002, false, class266.field4387, class141.field2276, arg3.field4204, (long) var11.field1551);
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg3.field4276) {
            return;
        }
        if (!class107.field1532) {
            for (int var21 = 9; var21 >= 5; var21--) {
                String var22 = class139.method980(arg3, (byte) 94, var21);
                if (var22 != null) {
                    client.field2077++;
                    class322.method2309(arg3.field4210, arg3.field4240, (short) 1004, false, class58.method429(-1, arg3, var21), var22, arg3.field4204, (long) (var21 + 1));
                }
            }
            String var23 = class345.method2433((byte) -116, arg3);
            if (var23 != null) {
                class322.method2309(arg3.field4210, arg3.field4240, (short) 28, false, -1, var23, arg3.field4204, 0L);
                class86.field1245++;
            }
            for (int var24 = 4; var24 >= 0; var24--) {
                String var25 = class139.method980(arg3, (byte) 84, var24);
                if (var25 != null) {
                    class322.method2309(arg3.field4210, arg3.field4240, (short) 16, false, class58.method429(-1, arg3, var24), var25, arg3.field4204, (long) (var24 + 1));
                    client.field2077++;
                }
            }
            if (client.method898(arg3).method530(-27106)) {
                if (arg3.field4219 == null) {
                    class322.method2309("", arg3.field4240, (short) 33, false, -1, class358.field5674, arg3.field4204, 0L);
                } else {
                    class322.method2309("", arg3.field4240, (short) 33, false, -1, arg3.field4219, arg3.field4204, 0L);
                }
                class91.field1313++;
            }
        } else if (client.method898(arg3).method521((byte) -98) && (class29.field447 & 0x20) != 0) {
            class8.field103++;
            class322.method2309(class167.field2630 + " -> " + arg3.field4210, arg3.field4240, (short) 49, false, class339.field5457, class120.field1776, arg3.field4204, 0L);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILjava/lang/String;)I", line = 334)
    public static final int method799(int arg0, String arg1) {
        field1827++;
        int var2 = arg1.length();
        int var3 = arg0;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = class26.method229(arg0 ^ 0x6E, arg1.charAt(var4)) + (var3 << 5) - var3;
        }
        return var3;
    }
}
