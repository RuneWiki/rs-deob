import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class18 {

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "Leh;")
    public static class47 field358 = class195.method1282((byte) -4, "Die Adresse dieses Computers wurde gesperrt)1");

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "I")
    public static int field362 = 0;

    @OriginalMember(owner = "client!bg", name = "k", descriptor = "Leh;")
    public static class47 field366 = class195.method1282((byte) -4, "Spieler");

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "I")
    public static int field356;

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "I")
    public static int field357;

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "I")
    public int field359;

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "I")
    public int field360;

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "I")
    public static int field361;

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "I")
    public static int field363;

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "I")
    public static int field364;

    @OriginalMember(owner = "client!bg", name = "j", descriptor = "I")
    public static int field365;

    @OriginalMember(owner = "client!bg", name = "l", descriptor = "I")
    public int field367;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V")
    public static final void method195(int arg0) {
        class204.field4029 = false;
        if (arg0 >= -6) {
            field366 = null;
        }
        field363++;
        class106.field2224 = false;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lph;")
    public static final class143 method196(Throwable arg0, String arg1) {
        field365++;
        class143 var2;
        if (arg0 instanceof class143) {
            var2 = (class143) arg0;
            var2.field2813 = var2.field2813 + ' ' + arg1;
        } else {
            var2 = new class143(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(I)V")
    public static final void method197(int arg0) {
        class74.field1626.method993(arg0);
        class204.field4014.method993(1);
        field364++;
    }

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "(I)V")
    public static void method198(int arg0) {
        field358 = null;
        field366 = null;
        if (arg0 < 75) {
            method196(null, null);
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIIIIZ)Lfb;")
    public static final class50 method199(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field356++;
        long var6 = ((long) arg3 << 40) + (long) arg0 + ((long) arg4 << 16) + ((long) arg2 << 38);
        if (!arg5) {
            class50 var8 = (class50) class141.field2771.method986((byte) 50, var6);
            if (var8 != null) {
                return var8;
            }
        }
        class73 var9 = class87.method713(32, arg0);
        if (arg4 > 1 && var9.field1602 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg4 >= var9.field1597[var11] && var9.field1597[var11] != 0) {
                    var10 = var9.field1602[var11];
                }
            }
            if (var10 != -1) {
                var9 = class87.method713(124, var10);
            }
        }
        class7 var12 = var9.method636((byte) -97);
        if (var12 == null) {
            return null;
        }
        class50 var13 = null;
        if (var9.field1601 != -1) {
            var13 = method199(var9.field1598, -117, 1, 0, 10, true);
            if (var13 == null) {
                return null;
            }
        }
        int var14 = 52 / ((arg1 + 41) / 53);
        int[] var15 = class169.field3268;
        int var16 = class169.field3269;
        int var17 = class169.field3271;
        int[] var18 = new int[4];
        class169.method1143(var18);
        class50 var19 = new class50(36, 32);
        class169.method1154(var19.field978, 36, 32);
        class169.method1150();
        class17.method179();
        class17.method180(16, 16);
        int var20 = var9.field1588;
        if (arg5) {
            var20 = (int) ((double) var20 * 1.5D);
        } else if (arg2 == 2) {
            var20 = (int) ((double) var20 * 1.04D);
        }
        class17.field346 = false;
        int var21 = class17.field350[var9.field1608] * var20 >> 16;
        int var22 = class17.field341[var9.field1608] * var20 >> 16;
        var12.method266();
        var12.method51(0, var9.field1579, var9.field1592, var9.field1608, var9.field1587, var22 + var9.field1569 - var12.field1928 / 2, var9.field1569 + var21);
        if (arg2 >= 1) {
            var19.method428(1);
        }
        if (arg2 >= 2) {
            var19.method428(16777215);
        }
        if (arg3 != 0) {
            var19.method446(arg3);
        }
        class169.method1154(var19.field978, 36, 32);
        if (var9.field1601 != -1) {
            var13.method439(0, 0);
        }
        if (!arg5 && (var9.field1610 == 1 || arg4 != 1) && arg4 != -1) {
            class83.field1768.method122(class185.method1232(arg4, (byte) 107), 0, 9, 16776960, 1);
        }
        if (!arg5) {
            class141.field2771.method987(var6, var19, 28842);
        }
        class169.method1154(var15, var17, var16);
        class169.method1152(var18);
        class17.method179();
        class17.field346 = true;
        return var19;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIIII)V")
    public static final void method200(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class199.field3884 = 0;
        for (int var5 = -1; var5 < class130.field2575 + class80.field1727; var5++) {
            class170 var21;
            if (var5 == -1) {
                var21 = class123.field2489;
            } else if (var5 < class130.field2575) {
                var21 = class40.field795[class146.field2853[var5]];
            } else {
                var21 = class133.field2626[class136.field2666[var5 - class130.field2575]];
            }
            if (var21 != null && var21.method280(-127)) {
                if (var21 instanceof class72) {
                    class56 var22 = ((class72) var21).field1547;
                    if (var22.field1074 != null) {
                        var22 = var22.method485((byte) -76);
                    }
                    if (var22 == null) {
                        continue;
                    }
                }
                if (var5 >= class130.field2575) {
                    class56 var23 = ((class72) var21).field1547;
                    if (var23.field1074 != null) {
                        var23 = var23.method485((byte) -76);
                    }
                    if (var23.field1072 >= 0 && class137.field2688.length > var23.field1072) {
                        class116.method911((byte) 15, var21.method1162(arg1 + 55660) + 15, var21);
                        if (class158.field3068 > -1) {
                            class137.field2688[var23.field1072].method439(class158.field3068 + arg4 - 12, class179.field3432 + arg2 + -30);
                        }
                    }
                    if (class95.field1958 == 1 && class136.field2666[var5 - class130.field2575] == class26.field497 && field362 % 20 < 10) {
                        class116.method911((byte) 58, var21.method1162(arg1 + 55660) + 15, var21);
                        if (class158.field3068 > -1) {
                            class137.field2683[0].method439(class158.field3068 + arg4 - 12, arg2 - 28 + class179.field3432);
                        }
                    }
                } else {
                    int var24 = 30;
                    class32 var25 = (class32) var21;
                    if (var25.field612 != -1 || var25.field617 != -1) {
                        class116.method911((byte) 126, var21.method1162(30589) + 15, var21);
                        if (class158.field3068 > -1) {
                            if (var25.field612 != -1) {
                                class122.field2472[var25.field612].method439(class158.field3068 + arg4 - 12, -var24 + arg2 + class179.field3432);
                                var24 += 25;
                            }
                            if (var25.field617 != -1) {
                                class137.field2688[var25.field617].method439(class158.field3068 + arg4 - 12, class179.field3432 + arg2 + -var24);
                                var24 += 25;
                            }
                        }
                    }
                    if (var5 >= 0 && class95.field1958 == 10 && class146.field2853[var5] == class82.field1762) {
                        class116.method911((byte) 76, var21.method1162(arg1 ^ 0xFFFFE96C) + 15, var21);
                        if (class158.field3068 > -1) {
                            class137.field2683[1].method439(arg4 + class158.field3068 - 12, arg2 - (-class179.field3432 + var24));
                        }
                    }
                }
                if (var21.field3335 != null && (var5 >= class130.field2575 || class124.field2507 == 0 || class124.field2507 == 3 || class124.field2507 == 1 && class74.method649(((class32) var21).field598, arg1 + 25005))) {
                    class116.method911((byte) 93, var21.method1162(30589), var21);
                    if (class158.field3068 > -1 && class199.field3884 < class146.field2869) {
                        class146.field2859[class199.field3884] = class52.field1014.method116(var21.field3335) / 2;
                        class146.field2841[class199.field3884] = class52.field1014.field263;
                        class146.field2877[class199.field3884] = class158.field3068;
                        class146.field2862[class199.field3884] = class179.field3432;
                        class146.field2863[class199.field3884] = var21.field3274;
                        class146.field2871[class199.field3884] = var21.field3312;
                        class146.field2847[class199.field3884] = var21.field3325;
                        class146.field2876[class199.field3884] = var21.field3335;
                        class199.field3884++;
                    }
                }
                if (var21.field3299 > field362) {
                    class116.method911((byte) 7, var21.method1162(30589) + 15, var21);
                    if (class158.field3068 > -1) {
                        class169.method1149(arg4 + class158.field3068 - 15, class179.field3432 + arg2 - 3, var21.field3295, 5, 65280);
                        class169.method1149(class158.field3068 + arg4 + var21.field3295 - 15, arg2 + -3 + class179.field3432, 30 - var21.field3295, 5, 16711680);
                    }
                }
                for (int var26 = 0; var26 < 4; var26++) {
                    if (var21.field3315[var26] > field362) {
                        class116.method911((byte) 123, var21.method1162(30589) / 2, var21);
                        if (class158.field3068 > -1) {
                            if (var26 == 1) {
                                class179.field3432 -= 20;
                            }
                            if (var26 == 2) {
                                class179.field3432 -= 10;
                                class158.field3068 -= 15;
                            }
                            if (var26 == 3) {
                                class179.field3432 -= 10;
                                class158.field3068 += 15;
                            }
                            class148.field2897[var21.field3327[var26]].method439(class158.field3068 + arg4 - 12, class179.field3432 + arg2 + -12);
                            class167.field3238.method98(class167.method1133(var21.field3316[var26], (byte) -97), class158.field3068 + arg4 - 1, class179.field3432 + arg2 + 3, 16777215, 0);
                        }
                    }
                }
            }
        }
        field361++;
        for (int var6 = 0; var6 < class199.field3884; var6++) {
            int var7 = class146.field2862[var6];
            int var8 = class146.field2877[var6];
            int var9 = class146.field2841[var6];
            boolean var10 = true;
            int var11 = class146.field2859[var6];
            while (var10) {
                var10 = false;
                for (int var20 = 0; var20 < var6; var20++) {
                    if (var7 + 2 > class146.field2862[var20] + -class146.field2841[var20] && var7 - var9 < class146.field2862[var20] + 2 && var8 - var11 < class146.field2877[var20] - -class146.field2859[var20] && class146.field2877[var20] - class146.field2859[var20] < var8 - -var11 && var7 > class146.field2862[var20] - class146.field2841[var20]) {
                        var7 = class146.field2862[var20] - class146.field2841[var20];
                        var10 = true;
                    }
                }
            }
            class158.field3068 = class146.field2877[var6];
            class179.field3432 = class146.field2862[var6] = var7;
            class47 var12 = class146.field2876[var6];
            if (class85.field1809 == 0) {
                int var13 = 16776960;
                if (class146.field2863[var6] < 6) {
                    var13 = class125.field2514[class146.field2863[var6]];
                }
                if (class146.field2863[var6] == 6) {
                    var13 = class53.field1033 % 20 < 10 ? 16711680 : 16776960;
                }
                if (class146.field2863[var6] == 7) {
                    var13 = class53.field1033 % 20 < 10 ? 255 : 65535;
                }
                if (class146.field2863[var6] == 8) {
                    var13 = class53.field1033 % 20 < 10 ? 45056 : 8454016;
                }
                if (class146.field2863[var6] == 9) {
                    int var14 = 150 - class146.field2847[var6];
                    if (var14 < 50) {
                        var13 = var14 * 1280 + 16711680;
                    } else if (var14 < 100) {
                        var13 = 33160960 - var14 * 327680;
                    } else if (var14 < 150) {
                        var13 = (var14 - 100) * 5 + 65280;
                    }
                }
                if (class146.field2863[var6] == 10) {
                    int var15 = 150 - class146.field2847[var6];
                    if (var15 < 50) {
                        var13 = var15 * 5 + 16711680;
                    } else if (var15 < 100) {
                        var13 = 16711935 + 16384000 - var15 * 327680;
                    } else if (var15 < 150) {
                        var13 = var15 * 327680 - (var15 + -100) * 5 - 32767745;
                    }
                }
                if (class146.field2863[var6] == 11) {
                    int var16 = 150 - class146.field2847[var6];
                    if (var16 < 50) {
                        var13 = 16777215 - var16 * 327685;
                    } else if (var16 < 100) {
                        var13 = var16 * 327685 + 65280 - 16384250;
                    } else if (var16 < 150) {
                        var13 = 16777215 + 32768000 - var16 * 327680;
                    }
                }
                if (class146.field2871[var6] == 0) {
                    class52.field1014.method98(var12, class158.field3068 + arg4, class179.field3432 + arg2, var13, 0);
                }
                if (class146.field2871[var6] == 1) {
                    class52.field1014.method107(var12, class158.field3068 + arg4, class179.field3432 + arg2, var13, 0, class53.field1033);
                }
                if (class146.field2871[var6] == 2) {
                    class52.field1014.method106(var12, class158.field3068 + arg4, arg2 - -class179.field3432, var13, 0, class53.field1033);
                }
                if (class146.field2871[var6] == 3) {
                    class52.field1014.method94(var12, class158.field3068 + arg4, class179.field3432 + arg2, var13, 0, class53.field1033, 150 - class146.field2847[var6]);
                }
                if (class146.field2871[var6] == 4) {
                    int var17 = (150 - class146.field2847[var6]) * (class52.field1014.method116(var12) + 100) / 150;
                    class169.method1138(class158.field3068 + arg4 - 50, arg2, arg4 + class158.field3068 + 50, arg2 + arg3);
                    class52.field1014.method122(var12, arg4 + class158.field3068 + 50 - var17, class179.field3432 + arg2, var13, 0);
                    class169.method1147(arg4, arg2, arg4 + arg0, arg2 + arg3);
                }
                if (class146.field2871[var6] == 5) {
                    int var18 = 0;
                    int var19 = 150 - class146.field2847[var6];
                    if (var19 < 25) {
                        var18 = var19 - 25;
                    } else if (var19 > 125) {
                        var18 = var19 - 125;
                    }
                    class169.method1138(arg4, class179.field3432 + arg2 - class52.field1014.field263 - 1, arg4 - -arg0, class179.field3432 + arg2 + 5);
                    class52.field1014.method98(var12, class158.field3068 + arg4, class179.field3432 + arg2 + var18, var13, 0);
                    class169.method1147(arg4, arg2, arg0 + arg4, arg2 + arg3);
                }
            } else {
                class52.field1014.method98(var12, class158.field3068 + arg4, class179.field3432 + arg2, 16776960, 0);
            }
        }
        if (arg1 != -25071) {
            method199(82, -67, -104, -105, -48, false);
        }
    }
}
