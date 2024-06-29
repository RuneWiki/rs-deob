import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class270 {

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "Ljd;")
    public static class86 field4751 = class122.method868("cross", true);

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "Ljd;")
    public static class86 field4749 = class122.method868("k", true);

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "[I")
    public static int[] field4752 = new int[256];

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "I")
    public static int field4746;

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "I")
    public static int field4747;

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "I")
    public static int field4750;

    @OriginalMember(owner = "client!ch", name = "h", descriptor = "I")
    public static int field4753;

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "Lna;")
    public static class31 field4748;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Z)V")
    public static void method1848(boolean arg0) {
        field4751 = null;
        if (!arg0) {
            method1848(true);
        }
        field4748 = null;
        field4752 = null;
        field4749 = null;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1849(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4750++;
        class237.field4279 = 0;
        for (int var7 = -1; var7 < (class209.field3786 + class61.field1207); var7++) {
            class33 var23;
            if (var7 == -1) {
                var23 = class124.field2412;
            } else if (var7 >= class209.field3786) {
                var23 = class233.field4217[class189.field3350[var7 - class209.field3786]];
            } else {
                var23 = class186.field3294[class142.field2689[var7]];
            }
            if (var23 != null && var23.method238(-24869)) {
                if (var23 instanceof class170) {
                    class11 var24 = ((class170) var23).field3130;
                    if (var24.field348 != null) {
                        var24 = var24.method87(true);
                    }
                    if (var24 == null) {
                        continue;
                    }
                }
                if (var7 >= class209.field3786) {
                    class11 var25 = ((class170) var23).field3130;
                    if (var25.field348 != null) {
                        var25 = var25.method87(true);
                    }
                    if (var25.field357 >= 0 && class237.field4278.length > var25.field357) {
                        int var26;
                        if (var25.field384 == -1) {
                            var26 = var23.method241(arg5 ^ 0xBF) + 15;
                        } else {
                            var26 = var25.field384 + 15;
                        }
                        class162.method1179(var26, arg4, arg1 >> 1, arg0, arg6 >> 1, 27838, var23);
                        if (class54.field1103 > -1) {
                            class237.field4278[var25.field357].method668(class54.field1103 + arg3 - 12, arg2 - (-class56.field1153 - -30));
                        }
                    }
                    class20[] var27 = class180.field3247;
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        class20 var29 = var27[var28];
                        if (var29 != null && var29.field516 == 1 && class189.field3350[var7 - class209.field3786] == var29.field531 && class236.field4265 % 20 < 10) {
                            int var30;
                            if (var25.field384 == -1) {
                                var30 = var23.method241(64) + 15;
                            } else {
                                var30 = var25.field384 + 15;
                            }
                            class162.method1179(var30, arg4, arg1 >> 1, arg0, arg6 >> 1, arg5 ^ 0x6C41, var23);
                            if (class54.field1103 > -1) {
                                class271.field4756[var29.field529].method668(class54.field1103 + arg3 - 12, class56.field1153 - 28 + arg2);
                            }
                        }
                    }
                } else {
                    int var31 = 30;
                    class224 var32 = (class224) var23;
                    if (var32.field4031 != -1 || var32.field4058 != -1) {
                        class162.method1179(var23.method241(arg5 ^ 0xBF) + 15, arg4, arg1 >> 1, arg0, arg6 >> 1, 27838, var23);
                        if (class54.field1103 > -1) {
                            if (var32.field4031 != -1) {
                                class51.field1072[var32.field4031].method668(arg3 + class54.field1103 - 12, -var31 + arg2 - -class56.field1153);
                                var31 += 25;
                            }
                            if (var32.field4058 != -1) {
                                class237.field4278[var32.field4058].method668(class54.field1103 + arg3 - 12, arg2 - (-class56.field1153 - -var31));
                                var31 += 25;
                            }
                        }
                    }
                    if (var7 >= 0) {
                        class20[] var33 = class180.field3247;
                        for (int var34 = 0; var34 < var33.length; var34++) {
                            class20 var35 = var33[var34];
                            if (var35 != null && var35.field516 == 10 && class142.field2689[var7] == var35.field531) {
                                class162.method1179(var23.method241(arg5 ^ 0xBF) + 15, arg4, arg1 >> 1, arg0, arg6 >> 1, 27838, var23);
                                if (class54.field1103 > -1) {
                                    class271.field4756[var35.field529].method668(class54.field1103 + arg3 - 12, -var31 + arg2 + class56.field1153);
                                }
                            }
                        }
                    }
                }
                if (var23.field725 != null && (var7 >= class209.field3786 || class227.field4119 == 0 || class227.field4119 == 3 || class227.field4119 == 1 && class141.method1002(((class224) var23).field4029, (byte) -45))) {
                    class162.method1179(var23.method241(64), arg4, arg1 >> 1, arg0, arg6 >> 1, 27838, var23);
                    if (class54.field1103 > -1 && class164.field3078 > class237.field4279) {
                        class164.field3071[class237.field4279] = class141.field2684.method1767(var23.field725) / 2;
                        class164.field3079[class237.field4279] = class141.field2684.field4612;
                        class164.field3082[class237.field4279] = class54.field1103;
                        class164.field3067[class237.field4279] = class56.field1153;
                        class164.field3073[class237.field4279] = var23.field689;
                        class164.field3072[class237.field4279] = var23.field698;
                        class164.field3084[class237.field4279] = var23.field714;
                        class164.field3069[class237.field4279] = var23.field725;
                        class237.field4279++;
                    }
                }
                if (class236.field4265 < var23.field681) {
                    class90 var36 = class102.field1972[0];
                    class90 var37 = class102.field1972[1];
                    int var41;
                    if (var23 instanceof class170) {
                        class170 var38 = (class170) var23;
                        class90[] var39 = (class90[]) class152.field2873.method701((byte) -120, (long) var38.field3130.field366);
                        if (var39 == null) {
                            var39 = class242.method1656(0, var38.field3130.field366, -13248, class56.field1141);
                            if (var39 != null) {
                                class152.field2873.method696((long) var38.field3130.field366, var39, (byte) -96);
                            }
                        }
                        if (var39 != null && var39.length == 2) {
                            var36 = var39[0];
                            var37 = var39[1];
                        }
                        class11 var40 = var38.field3130;
                        if (var40.field384 == -1) {
                            var41 = var23.method241(arg5 - 191);
                        } else {
                            var41 = var40.field384;
                        }
                    } else {
                        var41 = var23.method241(arg5 ^ 0xBF);
                    }
                    class162.method1179(var41 - (-var36.field1835 - 10), arg4, arg1 >> 1, arg0, arg6 >> 1, 27838, var23);
                    if (class54.field1103 > -1) {
                        int var42 = arg3 + class54.field1103 - (var36.field1846 >> 1);
                        int var43 = arg2 + class56.field1153 - 3;
                        var36.method668(var42, var43);
                        int var44 = var23.field737 * var36.field1846 / 255;
                        int var45 = var36.field1835;
                        class131.method939(var42, var43, var42 + var44, var43 + var45);
                        var37.method668(var42, var43);
                        class131.method936(arg3, arg2, arg3 + arg6, arg1 + arg2);
                    }
                }
                for (int var46 = 0; var46 < 4; var46++) {
                    if (class236.field4265 < var23.field706[var46]) {
                        int var49;
                        if (var23 instanceof class170) {
                            class170 var47 = (class170) var23;
                            class11 var48 = var47.field3130;
                            if (var48.field384 == -1) {
                                var49 = var23.method241(64) / 2;
                            } else {
                                var49 = var48.field384 / 2;
                            }
                        } else {
                            var49 = var23.method241(64) / 2;
                        }
                        class162.method1179(var49, arg4, arg1 >> 1, arg0, arg6 >> 1, 27838, var23);
                        if (class54.field1103 > -1) {
                            if (var46 == 1) {
                                class56.field1153 -= 20;
                            }
                            if (var46 == 2) {
                                class54.field1103 -= 15;
                                class56.field1153 -= 10;
                            }
                            if (var46 == 3) {
                                class56.field1153 -= 10;
                                class54.field1103 += 15;
                            }
                            class14.field434[var23.field717[var46]].method668(class54.field1103 + arg3 - 12, arg2 - -class56.field1153 + -12);
                            class45.field1014.method1758(class4.method26(false, var23.field731[var46]), arg3 + class54.field1103 - 1, arg2 - -class56.field1153 - -3, 16777215, 0);
                        }
                    }
                }
            }
        }
        if (arg5 != 255) {
            field4752 = null;
        }
        for (int var8 = 0; var8 < class237.field4279; var8++) {
            int var9 = class164.field3067[var8];
            int var10 = class164.field3079[var8];
            int var11 = class164.field3071[var8];
            boolean var12 = true;
            int var13 = class164.field3082[var8];
            while (var12) {
                var12 = false;
                for (int var22 = 0; var22 < var8; var22++) {
                    if ((var9 + 2) > (class164.field3067[var22] - class164.field3079[var22]) && class164.field3067[var22] + 2 > -var10 + var9 && (class164.field3082[var22] + class164.field3071[var22]) > (var13 - var11) && var13 + var11 > class164.field3082[var22] + -class164.field3071[var22] && class164.field3067[var22] - class164.field3079[var22] < var9) {
                        var9 = class164.field3067[var22] - class164.field3079[var22];
                        var12 = true;
                    }
                }
            }
            class54.field1103 = class164.field3082[var8];
            class56.field1153 = class164.field3067[var8] = var9;
            class86 var14 = class164.field3069[var8];
            if (class233.field4218 == 0) {
                int var15 = 16776960;
                if (class164.field3073[var8] < 6) {
                    var15 = class218.field3923[class164.field3073[var8]];
                }
                if (class164.field3073[var8] == 6) {
                    var15 = class119.field2338 % 20 >= 10 ? 16776960 : 16711680;
                }
                if (class164.field3073[var8] == 7) {
                    var15 = class119.field2338 % 20 >= 10 ? 65535 : 255;
                }
                if (class164.field3073[var8] == 8) {
                    var15 = class119.field2338 % 20 < 10 ? 45056 : 8454016;
                }
                if (class164.field3073[var8] == 9) {
                    int var16 = 150 - class164.field3084[var8];
                    if (var16 < 50) {
                        var15 = var16 * 1280 + 16711680;
                    } else if (var16 < 100) {
                        var15 = 16776960 - ((var16 - 50) * 327680);
                    } else if (var16 < 150) {
                        var15 = (var16 - 100) * 5 + 65280;
                    }
                }
                if (class164.field3073[var8] == 10) {
                    int var17 = 150 - class164.field3084[var8];
                    if (var17 < 50) {
                        var15 = var17 * 5 + 16711680;
                    } else if (var17 < 100) {
                        var15 = 16384000 + 16711935 - (var17 * 327680);
                    } else if (var17 < 150) {
                        var15 = (var17 * 327680) + 255 + 500 - (var17 * 5 + 32768000);
                    }
                }
                if (class164.field3073[var8] == 11) {
                    int var18 = 150 - class164.field3084[var8];
                    if (var18 < 50) {
                        var15 = 16777215 - (var18 * 327685);
                    } else if (var18 < 100) {
                        var15 = -(-(var18 * 327685) - 65280) - 16384250;
                    } else if (var18 < 150) {
                        var15 = 16777215 + 32768000 - var18 * 327680;
                    }
                }
                if (class164.field3072[var8] == 0) {
                    class141.field2684.method1758(var14, class54.field1103 + arg3, class56.field1153 + arg2, var15, 0);
                }
                if (class164.field3072[var8] == 1) {
                    class141.field2684.method1765(var14, class54.field1103 + arg3, class56.field1153 + arg2, var15, 0, class119.field2338);
                }
                if (class164.field3072[var8] == 2) {
                    class141.field2684.method1768(var14, arg3 + class54.field1103, class56.field1153 + arg2, var15, 0, class119.field2338);
                }
                if (class164.field3072[var8] == 3) {
                    class141.field2684.method1760(var14, class54.field1103 + arg3, class56.field1153 + arg2, var15, 0, class119.field2338, 150 - class164.field3084[var8]);
                }
                if (class164.field3072[var8] == 4) {
                    int var19 = (150 - class164.field3084[var8]) * (class141.field2684.method1767(var14) + 100) / 150;
                    class131.method939(class54.field1103 + arg3 - 50, arg2, arg3 + class54.field1103 + 50, arg1 + arg2);
                    class141.field2684.method1772(var14, arg3 + class54.field1103 + 50 - var19, arg2 - -class56.field1153, var15, 0);
                    class131.method936(arg3, arg2, arg3 + arg6, arg1 + arg2);
                }
                if (class164.field3072[var8] == 5) {
                    int var20 = 150 - class164.field3084[var8];
                    int var21 = 0;
                    if (var20 < 25) {
                        var21 = var20 - 25;
                    } else if (var20 > 125) {
                        var21 = var20 - 125;
                    }
                    class131.method939(arg3, arg2 + class56.field1153 - class141.field2684.field4612 - 1, arg3 + arg6, class56.field1153 + arg2 + 5);
                    class141.field2684.method1758(var14, class54.field1103 + arg3, class56.field1153 + arg2 + var21, var15, 0);
                    class131.method936(arg3, arg2, arg3 + arg6, arg1 + arg2);
                }
            } else {
                class141.field2684.method1758(var14, arg3 + class54.field1103, class56.field1153 + arg2, 16776960, 0);
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)I")
    public static final int method1850(int arg0) {
        field4746++;
        if (arg0 != 4817) {
            field4748 = null;
        }
        return class260.field4657;
    }
}
