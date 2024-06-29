import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public abstract class class143 {

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "I")
    public static int field2270 = 0;

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "Lhb;")
    public static class155 field2269 = new class155(512);

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "I")
    public static int field2267;

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "I")
    public static int field2268;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)[B")
    public abstract byte[] method1001(int arg0);

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IILag;I)V")
    public static final void method1002(int arg0, int arg1, class211 arg2, int arg3) {
        field2267++;
        if (arg2.field3367 == 1) {
            class187.field3043++;
            class266.method1789("", 0, arg2.field3375, arg2.field3415, 0L, -1, -82, (short) 26);
        }
        if (arg2.field3367 == 2 && !class139.field2211) {
            String var4 = class257.method1729(arg2, 80);
            if (var4 != null) {
                class266.method1789("<col=00ff00>" + arg2.field3378, -1, arg2.field3375, var4, 0L, -1, -96, (short) 49);
                class238.field3812++;
            }
        }
        if (arg2.field3367 == 3) {
            class259.field4173++;
            class266.method1789("", 0, arg2.field3375, class77.field1266, 0L, -1, 120, (short) 6);
        }
        if (arg1 != 8045) {
            field2268 = -65;
        }
        if (arg2.field3367 == 4) {
            class139.field2224++;
            class266.method1789("", 0, arg2.field3375, arg2.field3415, 0L, -1, -124, (short) 15);
        }
        if (arg2.field3367 == 5) {
            class266.method1789("", 0, arg2.field3375, arg2.field3415, 0L, -1, -42, (short) 35);
            class144.field2275++;
        }
        if (arg2.field3367 == 6 && class61.field994 == null) {
            class289.field4617++;
            class266.method1789("", -1, arg2.field3375, arg2.field3415, 0L, -1, 118, (short) 25);
        }
        if (arg2.field3385 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg2.field3502; var6++) {
                for (int var7 = 0; var7 < arg2.field3389; var7++) {
                    int var8 = (arg2.field3432 + 32) * var7;
                    int var9 = (arg2.field3330 + 32) * var6;
                    if (var5 < 20) {
                        var8 += arg2.field3454[var5];
                        var9 += arg2.field3409[var5];
                    }
                    if (var8 <= arg0 && arg3 >= var9 && (var8 + 32) > arg0 && arg3 < var9 + 32) {
                        class168.field2732 = var5;
                        class109.field1737 = arg2;
                        if (arg2.field3361[var5] > 0) {
                            class223 var10 = client.method2015(arg2);
                            class115 var11 = class81.method562(arg2.field3361[var5] - 1, arg1 ^ 0xFFFFAF17);
                            if (class46.field778 == 1 && var10.method1530(111)) {
                                if (class251.field3972 != arg2.field3375 || class52.field869 != var5) {
                                    class266.method1789(class14.field159 + " -> <col=ff9040>" + var11.field1799, var5, arg2.field3375, class100.field1625, (long) var11.field1833, -1, 116, (short) 16);
                                    class61.field1003++;
                                }
                            } else if (class139.field2211 && var10.method1530(86)) {
                                class60 var12 = class46.field767 == -1 ? null : class186.method1335(class46.field767, 18773);
                                if ((class258.field4168 & 0x10) != 0 && (var12 == null || var11.method805(class46.field767, 0, var12.field974) != var12.field974)) {
                                    class266.method1789(class203.field3235 + " -> <col=ff9040>" + var11.field1799, var5, arg2.field3375, class19.field230, (long) var11.field1833, field2268, 114, (short) 39);
                                    class259.field4190++;
                                }
                            } else {
                                String[] var13 = var11.field1800;
                                if (class117.field1896) {
                                    var13 = class236.method1600(arg1 + 7457, var13);
                                }
                                class99.field1587++;
                                if (var10.method1530(72)) {
                                    for (int var14 = 4; var14 >= 3; var14--) {
                                        if (var13 != null && var13[var14] != null) {
                                            class286.field4573++;
                                            byte var15;
                                            if (var14 == 3) {
                                                var15 = 51;
                                            } else {
                                                var15 = 36;
                                            }
                                            class266.method1789("<col=ff9040>" + var11.field1799, var5, arg2.field3375, var13[var14], (long) var11.field1833, -1, 115, var15);
                                        }
                                    }
                                }
                                if (var10.method1536((byte) -106)) {
                                    class246.field3909++;
                                    class266.method1789("<col=ff9040>" + var11.field1799, var5, arg2.field3375, class100.field1625, (long) var11.field1833, class161.field2557, 120, (short) 58);
                                }
                                if (var10.method1530(91) && var13 != null) {
                                    for (int var16 = 2; var16 >= 0; var16--) {
                                        if (var13[var16] != null) {
                                            class30.field373++;
                                            byte var17 = 0;
                                            if (var16 == 0) {
                                                var17 = 29;
                                            }
                                            if (var16 == 1) {
                                                var17 = 18;
                                            }
                                            if (var16 == 2) {
                                                var17 = 22;
                                            }
                                            class266.method1789("<col=ff9040>" + var11.field1799, var5, arg2.field3375, var13[var16], (long) var11.field1833, -1, arg1 - 8075, var17);
                                        }
                                    }
                                }
                                String[] var18 = arg2.field3419;
                                if (class117.field1896) {
                                    var18 = class236.method1600(15502, var18);
                                }
                                if (var18 != null) {
                                    for (int var19 = 4; var19 >= 0; var19--) {
                                        if (var18[var19] != null) {
                                            class17.field204++;
                                            byte var20 = 0;
                                            if (var19 == 0) {
                                                var20 = 34;
                                            }
                                            if (var19 == 1) {
                                                var20 = 43;
                                            }
                                            if (var19 == 2) {
                                                var20 = 13;
                                            }
                                            if (var19 == 3) {
                                                var20 = 28;
                                            }
                                            if (var19 == 4) {
                                                var20 = 40;
                                            }
                                            class266.method1789("<col=ff9040>" + var11.field1799, var5, arg2.field3375, var18[var19], (long) var11.field1833, -1, arg1 - 8169, var20);
                                        }
                                    }
                                }
                                class266.method1789("<col=ff9040>" + var11.field1799, var5, arg2.field3375, class67.field1113, (long) var11.field1833, class155.field2421, -88, (short) 1002);
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg2.field3337) {
            return;
        }
        if (!class139.field2211) {
            for (int var21 = 9; var21 >= 5; var21--) {
                String var25 = class78.method528(var21, (byte) 95, arg2);
                if (var25 != null) {
                    class266.method1789(arg2.field3399, arg2.field3413, arg2.field3375, var25, (long) (var21 + 1), class68.method477(var21, arg1 ^ 0xFFFFF602, arg2), -123, (short) 1005);
                    class285.field4528++;
                }
            }
            String var22 = class257.method1729(arg2, 78);
            if (var22 != null) {
                class266.method1789(arg2.field3399, arg2.field3413, arg2.field3375, var22, 0L, -1, arg1 - 7920, (short) 49);
                class238.field3812++;
            }
            for (int var23 = 4; var23 >= 0; var23--) {
                String var24 = class78.method528(var23, (byte) 95, arg2);
                if (var24 != null) {
                    class266.method1789(arg2.field3399, arg2.field3413, arg2.field3375, var24, (long) (var23 + 1), class68.method477(var23, -5777, arg2), -75, (short) 12);
                    class285.field4528++;
                }
            }
            if (client.method2015(arg2).method1524((byte) -100)) {
                class289.field4617++;
                if (arg2.field3336 == null) {
                    class266.method1789("", arg2.field3413, arg2.field3375, class189.field3058, 0L, -1, -94, (short) 25);
                    return;
                }
                class266.method1789("", arg2.field3413, arg2.field3375, arg2.field3336, 0L, -1, arg1 ^ -8018, (short) 25);
                return;
            }
            return;
        }
        if (client.method2015(arg2).method1523(-1) && (class258.field4168 & 0x20) != 0) {
            class42.field608++;
            class266.method1789(class203.field3235 + " -> " + arg2.field3399, arg2.field3413, arg2.field3375, class19.field230, 0L, field2268, arg1 - 8092, (short) 9);
            return;
        }
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(I)V")
    public static void method1003(int arg0) {
        field2269 = null;
        if (arg0 != 36) {
            method1002(115, 26, (class211) null, -24);
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "([BI)V")
    public abstract void method1004(byte[] arg0, int arg1);
}
