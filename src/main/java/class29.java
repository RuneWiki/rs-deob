import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class29 {

    @OriginalMember(owner = "client!ci", name = "g", descriptor = "Ltg;")
    public static class184 field490 = class135.method812("Welt", 3);

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "Ltg;")
    private static class184 field489 = class135.method812("Loading title screen )2 ", 3);

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "Ltg;")
    private static class184 field487 = class135.method812("You are standing in a members)2only area)3", 3);

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "Ltg;")
    public static class184 field484 = field487;

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "Ltg;")
    public static class184 field488 = field489;

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "client!ci", name = "h", descriptor = "I")
    public static int field491;

    @OriginalMember(owner = "client!ci", name = "j", descriptor = "I")
    public static int field493;

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "Lah;")
    public static class9 field486;

    @OriginalMember(owner = "client!ci", name = "i", descriptor = "[[[B")
    public static byte[][][] field492;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)I")
    public static final int method178(int arg0) {
        if (arg0 > -114) {
            method180(-13);
        }
        field491++;
        int var1 = 3;
        if (class119.field2147 < 310) {
            int var2 = class59.field1096 >> 7;
            int var3 = class46.field872.field635 >> 7;
            int var4 = class46.field872.field614 >> 7;
            int var5;
            if (var2 < var3) {
                var5 = var3 - var2;
            } else {
                var5 = var2 - var3;
            }
            int var6 = class78.field1418 >> 7;
            int var7;
            if (var4 > var6) {
                var7 = var4 - var6;
            } else {
                var7 = var6 - var4;
            }
            if ((class46.field878[class47.field892][var2][var6] & 0x4) != 0) {
                var1 = class47.field892;
            }
            if (var7 >= var5) {
                int var8 = 32768;
                int var9 = var5 * 65536 / var7;
                while (var4 != var6) {
                    var8 += var9;
                    if (var6 < var4) {
                        var6++;
                    } else if (var4 < var6) {
                        var6--;
                    }
                    if ((class46.field878[class47.field892][var2][var6] & 0x4) != 0) {
                        var1 = class47.field892;
                    }
                    if (var8 >= 65536) {
                        var8 -= 65536;
                        if (var3 > var2) {
                            var2++;
                        } else if (var3 < var2) {
                            var2--;
                        }
                        if ((class46.field878[class47.field892][var2][var6] & 0x4) != 0) {
                            var1 = class47.field892;
                        }
                    }
                }
            } else {
                int var10 = var7 * 65536 / var5;
                int var11 = 32768;
                while (var2 != var3) {
                    if (var2 < var3) {
                        var2++;
                    } else if (var2 > var3) {
                        var2--;
                    }
                    if ((class46.field878[class47.field892][var2][var6] & 0x4) != 0) {
                        var1 = class47.field892;
                    }
                    var11 += var10;
                    if (var11 >= 65536) {
                        var11 -= 65536;
                        if (var6 < var4) {
                            var6++;
                        } else if (var4 < var6) {
                            var6--;
                        }
                        if ((class46.field878[class47.field892][var2][var6] & 0x4) != 0) {
                            var1 = class47.field892;
                        }
                    }
                }
            }
        }
        if ((class46.field878[class47.field892][class46.field872.field635 >> 7][class46.field872.field614 >> 7] & 0x4) != 0) {
            var1 = class47.field892;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIIBI)V")
    public static final void method179(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        class136.field2478 = 0;
        for (int var5 = -1; var5 < class38.field711 + class26.field466; var5++) {
            class35 var21;
            if (var5 == -1) {
                var21 = class46.field872;
            } else if (class26.field466 <= var5) {
                var21 = class52.field948[class97.field1782[var5 - class26.field466]];
            } else {
                var21 = class57.field1024[class200.field3880[var5]];
            }
            if (var21 != null && var21.method213(-30610)) {
                if (var21 instanceof class158) {
                    class41 var22 = ((class158) var21).field2832;
                    if (var22.field785 != null) {
                        var22 = var22.method240(-27284);
                    }
                    if (var22 == null) {
                        continue;
                    }
                }
                if (var5 >= class26.field466) {
                    class41 var23 = ((class158) var21).field2832;
                    if (var23.field785 != null) {
                        var23 = var23.method240(-27284);
                    }
                    if (var23.field783 >= 0 && var23.field783 < class167.field3070.length) {
                        class44.method254(var21, var21.method214(127) + 15, (byte) -50);
                        if (class20.field383 > -1) {
                            class167.field3070[var23.field783].method835(arg4 + class20.field383 - 12, arg1 - -class88.field1655 + -30);
                        }
                    }
                    class179[] var24 = class2.field57;
                    for (int var25 = 0; var25 < var24.length; var25++) {
                        class179 var26 = var24[var25];
                        if (var26 != null && var26.field3413 == 1 && class97.field1782[var5 - class26.field466] == var26.field3408 && class161.field2903 % 20 < 10) {
                            class44.method254(var21, var21.method214(109) + 15, (byte) -50);
                            if (class20.field383 > -1) {
                                class120.field2159[var26.field3411].method835(class20.field383 + arg4 - 12, arg1 - -class88.field1655 + -28);
                            }
                        }
                    }
                } else {
                    int var27 = 30;
                    class67 var28 = (class67) var21;
                    if (var28.field1283 != -1 || var28.field1290 != -1) {
                        class44.method254(var21, var21.method214(126) + 15, (byte) -50);
                        if (class20.field383 > -1) {
                            if (var28.field1283 != -1) {
                                class153.field2746[var28.field1283].method835(class20.field383 + arg4 - 12, class88.field1655 + arg1 + -var27);
                                var27 += 25;
                            }
                            if (var28.field1290 != -1) {
                                class167.field3070[var28.field1290].method835(class20.field383 + arg4 - 12, -var27 + arg1 - -class88.field1655);
                                var27 += 25;
                            }
                        }
                    }
                    if (var5 >= 0) {
                        class179[] var29 = class2.field57;
                        for (int var30 = 0; var30 < var29.length; var30++) {
                            class179 var31 = var29[var30];
                            if (var31 != null && var31.field3413 == 10 && class200.field3880[var5] == var31.field3408) {
                                class44.method254(var21, var21.method214(-100) + 15, (byte) -50);
                                if (class20.field383 > -1) {
                                    class120.field2159[var31.field3411].method835(arg4 + class20.field383 - 12, class88.field1655 + arg1 + -var27);
                                }
                            }
                        }
                    }
                }
                if (var21.field611 != null && (var5 >= class26.field466 || class79.field1431 == 0 || class79.field1431 == 3 || class79.field1431 == 1 && class112.method694(((class67) var21).field1299, -683524792))) {
                    class44.method254(var21, var21.method214(102), (byte) -50);
                    if (class20.field383 > -1 && class136.field2478 < class151.field2719) {
                        class151.field2723[class136.field2478] = class125.field2261.method1353(var21.field611) / 2;
                        class151.field2712[class136.field2478] = class125.field2261.field4067;
                        class151.field2708[class136.field2478] = class20.field383;
                        class151.field2710[class136.field2478] = class88.field1655;
                        class151.field2703[class136.field2478] = var21.field602;
                        class151.field2715[class136.field2478] = var21.field625;
                        class151.field2707[class136.field2478] = var21.field628;
                        class151.field2711[class136.field2478] = var21.field611;
                        class136.field2478++;
                    }
                }
                if (var21.field640 > class161.field2903) {
                    class44.method254(var21, var21.method214(110) + 15, (byte) -50);
                    if (class20.field383 > -1) {
                        class4.method27(class20.field383 + arg4 - 15, arg1 + -3 + class88.field1655, var21.field601, 5, 65280);
                        class4.method27(class20.field383 + arg4 + var21.field601 - 15, class88.field1655 + arg1 + -3, 30 - var21.field601, 5, 16711680);
                    }
                }
                for (int var32 = 0; var32 < 4; var32++) {
                    if (class161.field2903 < var21.field667[var32]) {
                        class44.method254(var21, var21.method214(-46) / 2, (byte) -50);
                        if (class20.field383 > -1) {
                            if (var32 == 1) {
                                class88.field1655 -= 20;
                            }
                            if (var32 == 2) {
                                class20.field383 -= 15;
                                class88.field1655 -= 10;
                            }
                            if (var32 == 3) {
                                class88.field1655 -= 10;
                                class20.field383 += 15;
                            }
                            class9.field166[var21.field668[var32]].method835(class20.field383 + arg4 - 12, arg1 - 12 + class88.field1655);
                            class122.field2185.method1365(class170.method1060(var21.field637[var32], -122), arg4 + class20.field383 - 1, class88.field1655 + arg1 + 3, 16777215, 0);
                        }
                    }
                }
            }
        }
        for (int var6 = 0; var6 < class136.field2478; var6++) {
            int var7 = class151.field2708[var6];
            int var8 = class151.field2710[var6];
            int var9 = class151.field2723[var6];
            int var10 = class151.field2712[var6];
            boolean var11 = true;
            while (var11) {
                var11 = false;
                for (int var20 = 0; var20 < var6; var20++) {
                    if (var8 + 2 > class151.field2710[var20] - class151.field2712[var20] && var8 - var10 < class151.field2710[var20] + 2 && class151.field2723[var20] + class151.field2708[var20] > -var9 + var7 && var7 + var9 > class151.field2708[var20] - class151.field2723[var20] && class151.field2710[var20] - class151.field2712[var20] < var8) {
                        var8 = class151.field2710[var20] - class151.field2712[var20];
                        var11 = true;
                    }
                }
            }
            class20.field383 = class151.field2708[var6];
            class88.field1655 = class151.field2710[var6] = var8;
            class184 var12 = class151.field2711[var6];
            if (class55.field979 == 0) {
                int var13 = 16776960;
                if (class151.field2703[var6] < 6) {
                    var13 = class72.field1349[class151.field2703[var6]];
                }
                if (class151.field2703[var6] == 6) {
                    var13 = class105.field1904 % 20 < 10 ? 16711680 : 16776960;
                }
                if (class151.field2703[var6] == 7) {
                    var13 = class105.field1904 % 20 < 10 ? 255 : 65535;
                }
                if (class151.field2703[var6] == 8) {
                    var13 = class105.field1904 % 20 < 10 ? 45056 : 8454016;
                }
                if (class151.field2703[var6] == 9) {
                    int var14 = 150 - class151.field2707[var6];
                    if (var14 < 50) {
                        var13 = var14 * 1280 + 16711680;
                    } else if (var14 < 100) {
                        var13 = 16776960 - (var14 - 50) * 327680;
                    } else if (var14 < 150) {
                        var13 = (var14 - 100) * 5 + 65280;
                    }
                }
                if (class151.field2703[var6] == 10) {
                    int var15 = 150 - class151.field2707[var6];
                    if (var15 < 50) {
                        var13 = var15 * 5 + 16711680;
                    } else if (var15 < 100) {
                        var13 = 16711935 + 16384000 - var15 * 327680;
                    } else if (var15 < 150) {
                        var13 = (var15 - 100) * 327680 + 500 + 255 - var15 * 5;
                    }
                }
                if (class151.field2703[var6] == 11) {
                    int var16 = 150 - class151.field2707[var6];
                    if (var16 < 50) {
                        var13 = 16777215 - var16 * 327685;
                    } else if (var16 < 100) {
                        var13 = var16 * 327685 + 65280 - 16384250;
                    } else if (var16 < 150) {
                        var13 = 16777215 + 32768000 - var16 * 327680;
                    }
                }
                if (class151.field2715[var6] == 0) {
                    class125.field2261.method1365(var12, arg4 + class20.field383, class88.field1655 + arg1, var13, 0);
                }
                if (class151.field2715[var6] == 1) {
                    class125.field2261.method1348(var12, class20.field383 + arg4, arg1 - -class88.field1655, var13, 0, class105.field1904);
                }
                if (class151.field2715[var6] == 2) {
                    class125.field2261.method1346(var12, class20.field383 + arg4, class88.field1655 + arg1, var13, 0, class105.field1904);
                }
                if (class151.field2715[var6] == 3) {
                    class125.field2261.method1354(var12, class20.field383 + arg4, class88.field1655 + arg1, var13, 0, class105.field1904, 150 - class151.field2707[var6]);
                }
                if (class151.field2715[var6] == 4) {
                    int var17 = (150 - class151.field2707[var6]) * (class125.field2261.method1353(var12) + 100) / 150;
                    class4.method22(class20.field383 + arg4 - 50, arg1, arg4 + class20.field383 + 50, arg1 + arg2);
                    class125.field2261.method1366(var12, arg4 + class20.field383 + 50 - var17, class88.field1655 + arg1, var13, 0);
                    class4.method31(arg4, arg1, arg0 + arg4, arg1 - -arg2);
                }
                if (class151.field2715[var6] == 5) {
                    int var18 = 150 - class151.field2707[var6];
                    class4.method22(arg4, class88.field1655 + arg1 - class125.field2261.field4067 - 1, arg0 + arg4, class88.field1655 + arg1 + 5);
                    int var19 = 0;
                    if (var18 < 25) {
                        var19 = var18 - 25;
                    } else if (var18 > 125) {
                        var19 = var18 - 125;
                    }
                    class125.field2261.method1365(var12, class20.field383 + arg4, class88.field1655 + var19 + arg1, var13, 0);
                    class4.method31(arg4, arg1, arg4 + arg0, arg1 + arg2);
                }
            } else {
                class125.field2261.method1365(var12, class20.field383 + arg4, class88.field1655 + arg1, 16776960, 0);
            }
        }
        field493++;
        if (arg3 > -120) {
            field489 = null;
        }
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(I)V")
    public static void method180(int arg0) {
        field490 = null;
        field488 = null;
        if (arg0 != 22682) {
            return;
        }
        field484 = null;
        field492 = null;
        field487 = null;
        field486 = null;
        field489 = null;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "([BI)[B")
    public static final byte[] method181(byte[] arg0, int arg1) {
        if (arg1 != 32768000) {
            method179(-124, -41, 14, (byte) 87, 50);
        }
        int var2 = arg0.length;
        field485++;
        byte[] var3 = new byte[var2];
        class93.method539(arg0, 0, var3, 0, var2);
        return var3;
    }
}
