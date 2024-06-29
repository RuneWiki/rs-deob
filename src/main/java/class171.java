import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class171 {

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "I")
    public static int field2757 = 127;

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "Z")
    public static boolean field2761 = false;

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "Lef;")
    public static class221 field2758 = new class221();

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "Ljava/lang/String;")
    public static String field2764 = "level: ";

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "I")
    public static int field2760;

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "I")
    public static int field2762;

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "I")
    public static int field2763;

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "Lbb;")
    public static class92 field2759;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Z)V")
    public static void method1272(boolean arg0) {
        field2764 = null;
        field2759 = null;
        field2758 = null;
        if (arg0) {
            field2764 = null;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(CLjava/lang/String;I)I")
    public static final int method1273(char arg0, String arg1, int arg2) {
        int var3 = arg1.length();
        if (arg2 != -500) {
            method1273((char) 65491, (String) null, 45);
        }
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            if (arg0 == arg1.charAt(var5)) {
                var4++;
            }
        }
        field2762++;
        return var4;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIIBIII)V")
    public static final void method1274(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        class129.field1984 = 0;
        field2760++;
        int var7 = -40 / ((21 - arg3) / 34);
        for (int var8 = -1; var8 < class21.field235 + class121.field1772; var8++) {
            class128 var24;
            if (var8 == -1) {
                var24 = class186.field2993;
            } else if (var8 >= class121.field1772) {
                var24 = class169.field2730[class39.field556[var8 - class121.field1772]];
            } else {
                var24 = class92.field1374[class207.field3326[var8]];
            }
            if (var24 != null && var24.method123((byte) 85)) {
                if (var24 instanceof class18) {
                    class245 var25 = ((class18) var24).field205;
                    if (var25.field3972 != null) {
                        var25 = var25.method1758(true);
                    }
                    if (var25 == null) {
                        continue;
                    }
                }
                if (var8 >= class121.field1772) {
                    class245 var31 = ((class18) var24).field205;
                    if (var31.field3972 != null) {
                        var31 = var31.method1758(true);
                    }
                    if (var31.field3969 >= 0 && var31.field3969 < class94.field1403.length) {
                        int var32;
                        if (var31.field3990 == -1) {
                            var32 = var24.method919((byte) 115) + 15;
                        } else {
                            var32 = var31.field3990 + 15;
                        }
                        class92.method720(13013, arg0 >> 1, var24, arg4 >> 1, arg5, var32, arg6);
                        if (class268.field4332 > -1) {
                            class94.field1403[var31.field3969].method60(arg1 + class268.field4332 - 12, class297.field4697 + arg2 - 30);
                        }
                    }
                    class297[] var33 = class96.field1425;
                    for (int var34 = 0; var34 < var33.length; var34++) {
                        class297 var49 = var33[var34];
                        if (var49 != null && var49.field4693 == 1 && class39.field556[var8 - class121.field1772] == var49.field4700 && (class264.field4290 % 20) < 10) {
                            int var50;
                            if (var31.field3990 == -1) {
                                var50 = var24.method919((byte) 125) + 15;
                            } else {
                                var50 = var31.field3990 + 15;
                            }
                            class92.method720(13013, arg0 >> 1, var24, arg4 >> 1, arg5, var50, arg6);
                            if (class268.field4332 > -1) {
                                class243.field3910[var49.field4699].method60(arg1 + class268.field4332 - 12, arg2 - (-class297.field4697 - -28));
                            }
                        }
                    }
                } else {
                    int var26 = 30;
                    class29 var27 = (class29) var24;
                    if (var27.field352 != -1 || var27.field337 != -1) {
                        class92.method720(13013, arg0 >> 1, var24, arg4 >> 1, arg5, var24.method919((byte) 110) + 15, arg6);
                        if (class268.field4332 > -1) {
                            if (var27.field352 != -1) {
                                class71.field1038[var27.field352].method60(class268.field4332 + arg1 - 12, arg2 - -class297.field4697 + -var26);
                                var26 += 25;
                            }
                            if (var27.field337 != -1) {
                                class94.field1403[var27.field337].method60(arg1 + class268.field4332 - 12, class297.field4697 + arg2 - var26);
                                var26 += 25;
                            }
                        }
                    }
                    if (var8 >= 0) {
                        int var28 = 0;
                        class297[] var29 = class96.field1425;
                        while (var28 < var29.length) {
                            class297 var30 = var29[var28];
                            if (var30 != null && var30.field4693 == 10 && class207.field3326[var8] == var30.field4700) {
                                class92.method720(13013, arg0 >> 1, var24, arg4 >> 1, arg5, var24.method919((byte) 117) + 15, arg6);
                                if (class268.field4332 > -1) {
                                    class243.field3910[var30.field4699].method60(arg1 + class268.field4332 - 12, arg2 - var26 + class297.field4697);
                                }
                            }
                            var28++;
                        }
                    }
                }
                if (var24.field1872 != null && (var8 >= class121.field1772 || class125.field1823 == 0 || class125.field1823 == 3 || class125.field1823 == 1 && class53.method402((byte) 111, ((class29) var24).field344))) {
                    class92.method720(13013, arg0 >> 1, var24, arg4 >> 1, arg5, var24.method919((byte) 125), arg6);
                    if (class268.field4332 > -1 && class126.field1861 > class129.field1984) {
                        class126.field1858[class129.field1984] = class285.field4511.method1257(var24.field1872) / 2;
                        class126.field1855[class129.field1984] = class285.field4511.field2750;
                        class126.field1853[class129.field1984] = class268.field4332;
                        class126.field1852[class129.field1984] = class297.field4697;
                        class126.field1848[class129.field1984] = var24.field1955;
                        class126.field1846[class129.field1984] = var24.field1912;
                        class126.field1864[class129.field1984] = var24.field1961;
                        class126.field1860[class129.field1984] = var24.field1872;
                        class129.field1984++;
                    }
                }
                if (class264.field4290 < var24.field1919) {
                    class204 var35 = class220.field3528[0];
                    class204 var36 = class220.field3528[1];
                    int var37;
                    if ((var24 instanceof class18)) {
                        class18 var38 = (class18) var24;
                        class204[] var39 = (class204[]) class161.field2635.method1553((long) var38.field205.field4037, (byte) -95);
                        if (var39 == null) {
                            var39 = class193.method1435(0, var38.field205.field4037, 38, class90.field1337);
                            if (var39 != null) {
                                class161.field2635.method1551(var39, 0, (long) var38.field205.field4037);
                            }
                        }
                        class245 var40 = var38.field205;
                        if (var39 != null && var39.length == 2) {
                            var35 = var39[0];
                            var36 = var39[1];
                        }
                        if (var40.field3990 == -1) {
                            var37 = var24.method919((byte) 107);
                        } else {
                            var37 = var40.field3990;
                        }
                    } else {
                        var37 = var24.method919((byte) 125);
                    }
                    class92.method720(13013, arg0 >> 1, var24, arg4 >> 1, arg5, var35.field3271 + var37 + 10, arg6);
                    if (class268.field4332 > -1) {
                        int var41 = class268.field4332 + arg1 - (var35.field3270 >> 1);
                        int var42 = class297.field4697 + arg2 - 3;
                        var35.method60(var41, var42);
                        int var43 = var35.field3271;
                        int var44 = var24.field1972 * var35.field3270 / 255;
                        class70.method504(var41, var42, var41 + var44, var42 + var43);
                        var36.method60(var41, var42);
                        class70.method500(arg1, arg2, arg0 + arg1, arg2 + arg4);
                    }
                }
                for (int var45 = 0; var45 < 4; var45++) {
                    if (class264.field4290 < var24.field1924[var45]) {
                        int var46;
                        if ((var24 instanceof class18)) {
                            class18 var47 = (class18) var24;
                            class245 var48 = var47.field205;
                            if (var48.field3990 == -1) {
                                var46 = var24.method919((byte) 113) / 2;
                            } else {
                                var46 = var48.field3990 / 2;
                            }
                        } else {
                            var46 = var24.method919((byte) 118) / 2;
                        }
                        class92.method720(13013, arg0 >> 1, var24, arg4 >> 1, arg5, var46, arg6);
                        if (class268.field4332 > -1) {
                            if (var45 == 1) {
                                class297.field4697 -= 20;
                            }
                            if (var45 == 2) {
                                class297.field4697 -= 10;
                                class268.field4332 -= 15;
                            }
                            if (var45 == 3) {
                                class268.field4332 += 15;
                                class297.field4697 -= 10;
                            }
                            class48.field696[var24.field1947[var45]].method60(class268.field4332 + arg1 - 12, class297.field4697 + arg2 + -12);
                            class238.field3808.method1260(Integer.toString(var24.field1887[var45]), class268.field4332 + arg1 - 1, arg2 - -class297.field4697 + 3, 16777215, 0);
                        }
                    }
                }
            }
        }
        for (int var9 = 0; var9 < class129.field1984; var9++) {
            int var10 = class126.field1853[var9];
            int var11 = class126.field1852[var9];
            int var12 = class126.field1858[var9];
            boolean var13 = true;
            int var14 = class126.field1855[var9];
            while (var13) {
                var13 = false;
                for (int var23 = 0; var23 < var9; var23++) {
                    if (var11 + 2 > class126.field1852[var23] + -class126.field1855[var23] && (class126.field1852[var23] + 2) > (var11 - var14) && (var10 - var12) < (class126.field1858[var23] + class126.field1853[var23]) && var10 + var12 > class126.field1853[var23] + -class126.field1858[var23] && var11 > class126.field1852[var23] - class126.field1855[var23]) {
                        var11 = class126.field1852[var23] - class126.field1855[var23];
                        var13 = true;
                    }
                }
            }
            class268.field4332 = class126.field1853[var9];
            class297.field4697 = class126.field1852[var9] = var11;
            String var15 = class126.field1860[var9];
            if (class121.field1766 == 0) {
                int var16 = 16776960;
                if (class126.field1848[var9] < 6) {
                    var16 = class182.field2933[class126.field1848[var9]];
                }
                if (class126.field1848[var9] == 6) {
                    var16 = class230.field3707 % 20 >= 10 ? 16776960 : 16711680;
                }
                if (class126.field1848[var9] == 7) {
                    var16 = (class230.field3707 % 20) >= 10 ? 65535 : 255;
                }
                if (class126.field1848[var9] == 8) {
                    var16 = class230.field3707 % 20 < 10 ? 45056 : 8454016;
                }
                if (class126.field1848[var9] == 9) {
                    int var17 = 150 - class126.field1864[var9];
                    if (var17 < 50) {
                        var16 = var17 * 1280 + 16711680;
                    } else if (var17 < 100) {
                        var16 = 16776960 - (var17 - 50) * 327680;
                    } else if (var17 < 150) {
                        var16 = var17 * 5 + 65280 - 500;
                    }
                }
                if (class126.field1848[var9] == 10) {
                    int var18 = 150 - class126.field1864[var9];
                    if (var18 < 50) {
                        var16 = (var18 * 5) + 16711680;
                    } else if (var18 < 100) {
                        var16 = 16711935 - ((var18 - 50) * 327680);
                    } else if (var18 < 150) {
                        var16 = (var18 * 327680) + 255 - (var18 * 5 + -500) - 32768000;
                    }
                }
                if (class126.field1848[var9] == 11) {
                    int var19 = 150 - class126.field1864[var9];
                    if (var19 < 50) {
                        var16 = 16777215 - (var19 * 327685);
                    } else if (var19 < 100) {
                        var16 = (var19 - 50) * 327685 + 65280;
                    } else if (var19 < 150) {
                        var16 = 49545215 - (var19 * 327680);
                    }
                }
                if (class126.field1846[var9] == 0) {
                    class285.field4511.method1260(var15, arg1 + class268.field4332, class297.field4697 + arg2, var16, 0);
                }
                if (class126.field1846[var9] == 1) {
                    class285.field4511.method1264(var15, arg1 + class268.field4332, class297.field4697 + arg2, var16, 0, class230.field3707);
                }
                if (class126.field1846[var9] == 2) {
                    class285.field4511.method1259(var15, class268.field4332 + arg1, arg2 - -class297.field4697, var16, 0, class230.field3707);
                }
                if (class126.field1846[var9] == 3) {
                    class285.field4511.method1249(var15, class268.field4332 + arg1, class297.field4697 + arg2, var16, 0, class230.field3707, 150 - class126.field1864[var9]);
                }
                if (class126.field1846[var9] == 4) {
                    int var20 = (150 - class126.field1864[var9]) * (class285.field4511.method1257(var15) + 100) / 150;
                    class70.method504(arg1 + class268.field4332 - 50, arg2, arg1 - (-class268.field4332 - 50), arg2 + arg4);
                    class285.field4511.method1254(var15, class268.field4332 + arg1 + 50 - var20, class297.field4697 + arg2, var16, 0);
                    class70.method500(arg1, arg2, arg0 + arg1, arg2 + arg4);
                }
                if (class126.field1846[var9] == 5) {
                    int var21 = 150 - class126.field1864[var9];
                    int var22 = 0;
                    class70.method504(arg1, class297.field4697 + arg2 - (class285.field4511.field2750 + 1), arg0 + arg1, arg2 + class297.field4697 + 5);
                    if (var21 < 25) {
                        var22 = var21 - 25;
                    } else if (var21 > 125) {
                        var22 = var21 - 125;
                    }
                    class285.field4511.method1260(var15, class268.field4332 + arg1, class297.field4697 + var22 + arg2, var16, 0);
                    class70.method500(arg1, arg2, arg0 + arg1, arg2 + arg4);
                }
            } else {
                class285.field4511.method1260(var15, class268.field4332 + arg1, arg2 - -class297.field4697, 16776960, 0);
            }
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(JIIIZ)Ljava/lang/String;")
    public static final String method1275(long arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2763++;
        StringBuffer var6 = new StringBuffer(26);
        char var7 = '.';
        boolean var8 = false;
        char var9 = ',';
        if (arg2 >= -36) {
            method1275(50L, -40, 41, -54, true);
        }
        if (arg0 < 0L) {
            var8 = true;
            arg0 = -arg0;
        }
        if (arg3 == 0) {
            var9 = '.';
            var7 = ',';
        }
        if (arg1 > 0) {
            for (int var10 = 0; var10 < arg1; var10++) {
                int var11 = (int) arg0;
                arg0 /= 10L;
                var6.append((char) (var11 + 48 - ((int) arg0 * 10)));
            }
            var6.append(var9);
        }
        if (arg3 == 2) {
            var7 = ' ';
        }
        int var12 = 0;
        while (true) {
            int var13 = (int) arg0;
            arg0 /= 10L;
            var6.append((char) (var13 + 48 - (int) arg0 * 10));
            if (arg0 == 0L) {
                if (var8) {
                    var6.append('-');
                }
                return var6.reverse().toString();
            }
            if (arg4) {
                var12++;
                if ((var12 % 3) == 0) {
                    var6.append(var7);
                }
            }
        }
    }
}
