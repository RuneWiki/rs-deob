import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class31 {

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
    public static int field731 = -1;

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "Loc;")
    private static class99 field733 = class48.method402((byte) -104, "flash3:");

    @OriginalMember(owner = "client!ec", name = "l", descriptor = "Loc;")
    public static class99 field737 = field733;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "Loc;")
    public static class99 field727 = class48.method402((byte) -104, "Gegenstand f-Ur Mitglieder");

    @OriginalMember(owner = "client!ec", name = "m", descriptor = "Loc;")
    private static class99 field738 = class48.method402((byte) -104, "Select");

    @OriginalMember(owner = "client!ec", name = "q", descriptor = "I")
    public static int field742 = 0;

    @OriginalMember(owner = "client!ec", name = "w", descriptor = "I")
    public static int field748 = 0;

    @OriginalMember(owner = "client!ec", name = "x", descriptor = "Loc;")
    public static class99 field749 = class48.method402((byte) -104, "Unerwartete Antwort vom Anmelde)2Server)3");

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "Loc;")
    public static class99 field728 = field738;

    @OriginalMember(owner = "client!ec", name = "u", descriptor = "I")
    public static int field746 = 0;

    @OriginalMember(owner = "client!ec", name = "n", descriptor = "Loc;")
    public static class99 field739 = field733;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "I")
    public int field729;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
    public int field730;

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "I")
    public static int field732;

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "I")
    public int field734;

    @OriginalMember(owner = "client!ec", name = "j", descriptor = "I")
    public static int field735;

    @OriginalMember(owner = "client!ec", name = "k", descriptor = "I")
    public int field736;

    @OriginalMember(owner = "client!ec", name = "o", descriptor = "I")
    public static int field740;

    @OriginalMember(owner = "client!ec", name = "p", descriptor = "I")
    public static int field741;

    @OriginalMember(owner = "client!ec", name = "s", descriptor = "I")
    public int field744;

    @OriginalMember(owner = "client!ec", name = "t", descriptor = "I")
    public static int field745;

    @OriginalMember(owner = "client!ec", name = "v", descriptor = "I")
    public int field747;

    @OriginalMember(owner = "client!ec", name = "y", descriptor = "I")
    public int field750;

    @OriginalMember(owner = "client!ec", name = "z", descriptor = "I")
    public static int field751;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "[B")
    public byte[] field726;

    @OriginalMember(owner = "client!ec", name = "r", descriptor = "[B")
    public byte[] field743;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Loc;I)I")
    public static final int method267(class99 arg0, int arg1) {
        if (arg1 != 2) {
            field728 = null;
        }
        field745++;
        if (class77.field1921 == 1) {
            return 7;
        } else if (arg0.method851(0, class140.field3483)) {
            return 1;
        } else if (arg0.method851(0, class42.field1028)) {
            return 1;
        } else if (arg0.method851(0, class47.field1151)) {
            return 2;
        } else if (arg0.method851(0, class70.field1790)) {
            return 2;
        } else if (arg0.method851(0, class102.field2492)) {
            return 3;
        } else if (arg0.method851(0, class61.field1630)) {
            return 4;
        } else if (arg0.method851(0, class68.field1751)) {
            return 5;
        } else if (arg0.method851(arg1 - 2, class113.field2824)) {
            return 6;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)V")
    public static final void method268(byte arg0) {
        field732++;
        if (arg0 != 23) {
            field737 = null;
        }
        class21.field502.method998(true);
        class135.field3356.method998(true);
        class112.field2803.method998(true);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ZLqa;)V")
    public static final void method269(boolean arg0, class109 arg1) {
        field751++;
        if (!arg0) {
            method269(true, null);
        }
        if (class49.field1179 != 1) {
            return;
        }
        short var2 = 280;
        if (class23.field540 >= var2 && class23.field540 <= var2 + 14 && class4.field75 >= 4 && class4.field75 <= 18) {
            class118.method996(true, 0, 0);
            return;
        }
        if (class23.field540 >= var2 + 15 && var2 + 80 >= class23.field540 && class4.field75 >= 4 && class4.field75 <= 18) {
            class118.method996(arg0, 1, 0);
            return;
        }
        short var3 = 390;
        if (class23.field540 >= var3 && class23.field540 <= var3 + 14 && class4.field75 >= 4 && class4.field75 <= 18) {
            class118.method996(true, 0, 1);
            return;
        }
        if (class23.field540 >= var3 + 15 && var3 + 80 >= class23.field540 && class4.field75 >= 4 && class4.field75 <= 18) {
            class118.method996(true, 1, 1);
            return;
        }
        short var4 = 500;
        if (var4 <= class23.field540 && class23.field540 <= var4 + 14 && class4.field75 >= 4 && class4.field75 <= 18) {
            class118.method996(true, 0, 2);
            return;
        }
        if (class23.field540 >= var4 + 15 && class23.field540 <= var4 + 80 && class4.field75 >= 4 && class4.field75 <= 18) {
            class118.method996(true, 1, 2);
            return;
        }
        short var5 = 610;
        if (class23.field540 >= var5 && var5 + 14 >= class23.field540 && class4.field75 >= 4 && class4.field75 <= 18) {
            class118.method996(true, 0, 3);
            return;
        }
        if (var5 + 15 <= class23.field540 && class23.field540 <= var5 + 80 && class4.field75 >= 4 && class4.field75 <= 18) {
            class118.method996(true, 1, 3);
            return;
        }
        if (class23.field540 >= 708 && class4.field75 >= 4 && class23.field540 <= 758 && class4.field75 <= 20) {
            class4.field72 = false;
            class4.field70.method573(0, 0);
            class89.field2210.method573(382, 0);
            class143.field3567.method216(382 - class143.field3567.field569 / 2, 18);
            return;
        }
        if (class138.field3449 == -1) {
            return;
        }
        class80 var6 = class5.field104[class138.field3449];
        if (var6.field1985 == class143.field3554) {
            byte[] var7 = class20.method189(new class99[] { var6.field1979, class54.field1319 }, 9).method817(65);
            class122.field2968 = new String(var7, 0, var7.length);
            class4.field72 = false;
            if (class133.field3248 != 0) {
                class30.field720 = 43594;
                class72.field1829 = 43594;
                class133.field3248 = 0;
                class118.field2905 = 443;
            }
            class137.field3418 = var6.field1983;
            class4.field70.method573(0, 0);
            class89.field2210.method573(382, 0);
            class143.field3567.method216(382 - class143.field3567.field569 / 2, 18);
            return;
        }
        class99 var8 = class20.method189(new class99[] { class86.field2152, var6.field1979, class54.field1319, class137.field3423, class83.field2057, class5.method31(class27.field684 ? 1 : 0, 10), class97.field2335, class5.method31(class60.field1620, 10), class49.field1203, class5.method31(class30.field715, 10) }, 49);
        try {
            arg1.getAppletContext().showDocument(var8.method822(-22688), "_self");
            return;
        } catch (Exception var9) {
            return;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIIIII)Z")
    public static final boolean method270(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg3 != -9247) {
            field739 = null;
        }
        field740++;
        if (!class35.method306((byte) 103, arg6)) {
            return false;
        }
        class144.field3607 = null;
        boolean var7 = class74.method667(0, arg0, arg1, arg4, class132.field3230[arg6], arg5, -1, 19316, 0, arg2);
        if (class144.field3607 != null) {
            class74.method667(class104.field2524, arg0, arg1, arg4, class144.field3607, arg5, -1412584499, 19316, class140.field3479, arg2);
        }
        return var7;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V")
    public static final void method271(int arg0) {
        class25.field578 = 0;
        field741++;
        for (int var1 = -1; var1 < class86.field2151 + class101.field2446; var1++) {
            class127 var18;
            if (var1 == -1) {
                var18 = class69.field1770;
            } else if (var1 < class101.field2446) {
                var18 = class59.field1571[class67.field1729[var1]];
            } else {
                var18 = class149.field3691[class9.field232[var1 - class101.field2446]];
            }
            if (var18 != null && var18.method1032(-16)) {
                if (var18 instanceof class149) {
                    class46 var19 = ((class149) var18).field3689;
                    if (var19.field1104 != null) {
                        var19 = var19.method383((byte) -118);
                    }
                    if (var19 == null) {
                        continue;
                    }
                }
                if (var1 >= class101.field2446) {
                    class46 var22 = ((class149) var18).field3689;
                    if (var22.field1104 != null) {
                        var22 = var22.method383((byte) -124);
                    }
                    if (var22.field1105 >= 0 && var22.field1105 < class125.field3003.length) {
                        class54.method452(-15099, var18.field3087 + 15, var18);
                        if (class101.field2464 > -1) {
                            class125.field3003[var22.field1105].method584(class101.field2464 - 12, class135.field3375 + -30);
                        }
                    }
                    if (class121.field2963 == 1 && class9.field232[var1 - class101.field2446] == class107.field2627 && class101.field2444 % 20 < 10) {
                        class54.method452(-15099, var18.field3087 + 15, var18);
                        if (class101.field2464 > -1) {
                            class37.field937[0].method584(class101.field2464 - 12, class135.field3375 - 28);
                        }
                    }
                } else {
                    int var20 = 30;
                    class126 var21 = (class126) var18;
                    if (var21.field3038 != -1 || var21.field3026 != -1) {
                        class54.method452(-15099, var18.field3087 + 15, var18);
                        if (class101.field2464 > -1) {
                            if (var21.field3038 != -1) {
                                class79.field1966[var21.field3038].method584(class101.field2464 - 12, class135.field3375 - var20);
                                var20 += 25;
                            }
                            if (var21.field3026 != -1) {
                                class125.field3003[var21.field3026].method584(class101.field2464 - 12, -var20 + class135.field3375);
                                var20 += 25;
                            }
                        }
                    }
                    if (var1 >= 0 && class121.field2963 == 10 && class67.field1729[var1] == class130.field3188) {
                        class54.method452(-15099, var18.field3087 + 15, var18);
                        if (class101.field2464 > -1) {
                            class37.field937[1].method584(class101.field2464 - 12, -var20 + class135.field3375);
                        }
                    }
                }
                if (var18.field3121 != null && (var1 >= class101.field2446 || class113.field2826 == 0 || class113.field2826 == 3 || class113.field2826 == 1 && class2.method7(((class126) var18).field3034, (byte) -51))) {
                    class54.method452(arg0 - 15149, var18.field3087, var18);
                    if (class101.field2464 > -1 && class61.field1642 > class25.field578) {
                        class61.field1637[class25.field578] = class48.field1162.method974(var18.field3121) / 2;
                        class61.field1631[class25.field578] = class48.field1162.field2860;
                        class61.field1634[class25.field578] = class101.field2464;
                        class61.field1640[class25.field578] = class135.field3375;
                        class61.field1649[class25.field578] = var18.field3072;
                        class61.field1635[class25.field578] = var18.field3067;
                        class61.field1629[class25.field578] = var18.field3105;
                        class61.field1643[class25.field578] = var18.field3121;
                        class25.field578++;
                    }
                }
                if (class101.field2444 < var18.field3085) {
                    class54.method452(-15099, var18.field3087 + 15, var18);
                    if (class101.field2464 > -1) {
                        int var23 = var18.field3080 * 30 / var18.field3094;
                        if (var23 > 30) {
                            var23 = 30;
                        }
                        class96.method794(class101.field2464 - 15, class135.field3375 + -3, var23, 5, 65280);
                        class96.method794(class101.field2464 + var23 - 15, class135.field3375 + -3, 30 - var23, 5, 16711680);
                    }
                }
                for (int var24 = 0; var24 < 4; var24++) {
                    if (var18.field3076[var24] > class101.field2444) {
                        class54.method452(arg0 - 15149, var18.field3087 / 2, var18);
                        if (class101.field2464 > -1) {
                            if (var24 == 1) {
                                class135.field3375 -= 20;
                            }
                            if (var24 == 2) {
                                class101.field2464 -= 15;
                                class135.field3375 -= 10;
                            }
                            if (var24 == 3) {
                                class135.field3375 -= 10;
                                class101.field2464 += 15;
                            }
                            class21.field505[var18.field3124[var24]].method584(class101.field2464 - 12, class135.field3375 - 12);
                            class125.field2998.method988(class5.method31(var18.field3112[var24], arg0 ^ 0x38), class101.field2464, class135.field3375 + 4, 0);
                            class125.field2998.method988(class5.method31(var18.field3112[var24], 10), class101.field2464 - 1, class135.field3375 + 3, 16777215);
                        }
                    }
                }
            }
        }
        if (arg0 != 50) {
            method272((byte) -20);
        }
        for (int var2 = 0; var2 < class25.field578; var2++) {
            int var3 = class61.field1634[var2];
            int var4 = class61.field1640[var2];
            int var5 = class61.field1637[var2];
            int var6 = class61.field1631[var2];
            boolean var7 = true;
            while (var7) {
                var7 = false;
                for (int var17 = 0; var17 < var2; var17++) {
                    if (class61.field1640[var17] - class61.field1631[var17] < var4 + 2 && var4 - var6 < class61.field1640[var17] + 2 && class61.field1637[var17] + class61.field1634[var17] > -var5 + var3 && var3 + var5 > class61.field1634[var17] - class61.field1637[var17] && class61.field1640[var17] - class61.field1631[var17] < var4) {
                        var7 = true;
                        var4 = class61.field1640[var17] - class61.field1631[var17];
                    }
                }
            }
            class101.field2464 = class61.field1634[var2];
            class135.field3375 = class61.field1640[var2] = var4;
            class99 var8 = class61.field1643[var2];
            if (class15.field356 == 0) {
                int var9 = 16776960;
                if (class61.field1649[var2] < 6) {
                    var9 = class143.field3569[class61.field1649[var2]];
                }
                if (class61.field1649[var2] == 6) {
                    var9 = class81.field2012 % 20 >= 10 ? 16776960 : 16711680;
                }
                if (class61.field1649[var2] == 7) {
                    var9 = class81.field2012 % 20 < 10 ? 255 : 65535;
                }
                if (class61.field1649[var2] == 8) {
                    var9 = class81.field2012 % 20 < 10 ? 45056 : 8454016;
                }
                if (class61.field1649[var2] == 9) {
                    int var10 = 150 - class61.field1629[var2];
                    if (var10 < 50) {
                        var9 = var10 * 1280 + 16711680;
                    } else if (var10 < 100) {
                        var9 = 16384000 + 16776960 - var10 * 327680;
                    } else if (var10 < 150) {
                        var9 = (var10 - 100) * 5 + 65280;
                    }
                }
                if (class61.field1649[var2] == 10) {
                    int var11 = 150 - class61.field1629[var2];
                    if (var11 < 50) {
                        var9 = var11 * 5 + 16711680;
                    } else if (var11 < 100) {
                        var9 = 16711935 + 16384000 - var11 * 327680;
                    } else if (var11 < 150) {
                        var9 = var11 * 327680 + 755 - var11 * 5 - 32768000;
                    }
                }
                if (class61.field1649[var2] == 11) {
                    int var12 = 150 - class61.field1629[var2];
                    if (var12 < 50) {
                        var9 = 16777215 - var12 * 327685;
                    } else if (var12 < 100) {
                        var9 = var12 * 327685 + 65280 - 16384250;
                    } else if (var12 < 150) {
                        var9 = 16777215 + 32768000 - var12 * 327680;
                    }
                }
                if (class61.field1635[var2] == 0) {
                    class48.field1162.method988(var8, class101.field2464, class135.field3375 + 1, 0);
                    class48.field1162.method988(var8, class101.field2464, class135.field3375, var9);
                }
                if (class61.field1635[var2] == 1) {
                    class48.field1162.method969(var8, class101.field2464, class135.field3375 + 1, 0, class81.field2012);
                    class48.field1162.method969(var8, class101.field2464, class135.field3375, var9, class81.field2012);
                }
                if (class61.field1635[var2] == 2) {
                    class48.field1162.method985(var8, class101.field2464, class135.field3375 + 1, 0, class81.field2012);
                    class48.field1162.method985(var8, class101.field2464, class135.field3375, var9, class81.field2012);
                }
                if (class61.field1635[var2] == 3) {
                    class48.field1162.method975(var8, class101.field2464, class135.field3375 + 1, 0, class81.field2012, 150 - class61.field1629[var2]);
                    class48.field1162.method975(var8, class101.field2464, class135.field3375, var9, class81.field2012, 150 - class61.field1629[var2]);
                }
                if (class61.field1635[var2] == 4) {
                    int var13 = class48.field1162.method974(var8);
                    int var14 = (150 - class61.field1629[var2]) * (var13 + 100) / 150;
                    class96.method795(class101.field2464 - 50, 0, class101.field2464 + 50, 334);
                    class48.field1162.method968(var8, class101.field2464 + 50 - var14, class135.field3375 + 1, 0);
                    class48.field1162.method968(var8, class101.field2464 + 50 - var14, class135.field3375, var9);
                    class96.method799();
                }
                if (class61.field1635[var2] == 5) {
                    int var15 = 150 - class61.field1629[var2];
                    class96.method795(0, class135.field3375 - class48.field1162.field2860 - 1, 512, class135.field3375 + 5);
                    int var16 = 0;
                    if (var15 < 25) {
                        var16 = var15 - 25;
                    } else if (var15 > 125) {
                        var16 = var15 - 125;
                    }
                    class48.field1162.method988(var8, class101.field2464, class135.field3375 + var16 + 1, 0);
                    class48.field1162.method988(var8, class101.field2464, class135.field3375 + var16, var9);
                    class96.method799();
                }
            } else {
                class48.field1162.method988(var8, class101.field2464, class135.field3375 + 1, 0);
                class48.field1162.method988(var8, class101.field2464, class135.field3375, 16776960);
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(B)V")
    public static void method272(byte arg0) {
        field737 = null;
        field749 = null;
        field739 = null;
        field738 = null;
        field728 = null;
        field727 = null;
        field733 = null;
        if (arg0 > -74) {
            field738 = null;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILoc;)V")
    public static final void method273(int arg0, class99 arg1) {
        field735++;
        if (arg1 == null || arg1.method810(-58) == 0) {
            class18.field480 = 0;
            return;
        }
        class99 var2 = arg1;
        class99[] var3 = new class99[100];
        int var4 = 0;
        while (true) {
            int var5 = var2.method815(32, true);
            if (var5 == -1) {
                class99 var7 = var2.method846(arg0 - 1);
                if (var7.method810(-58) > 0) {
                    var3[var4++] = var7.method823(0);
                }
                class18.field480 = arg0;
                label47: for (int var8 = 0; var8 < class37.field941; var8++) {
                    class143 var9 = class1.method2((byte) 121, var8);
                    if (var9.field3548 == -1 && var9.field3551 != null) {
                        class99 var10 = var9.field3551.method823(0);
                        for (int var11 = 0; var11 < var4; var11++) {
                            if (var10.method830(var3[var11], 63) == -1) {
                                continue label47;
                            }
                        }
                        class36.field914[class18.field480] = var10;
                        class88.field2181[class18.field480] = var8;
                        class18.field480++;
                        if (class18.field480 >= class36.field914.length) {
                            return;
                        }
                    }
                }
                return;
            }
            class99 var6 = var2.method840(0, 102, var5).method846(-1);
            if (var6.method810(-58) > 0) {
                var3[var4++] = var6.method823(0);
            }
            var2 = var2.method813(var5 + 1, (byte) -65);
        }
    }
}
