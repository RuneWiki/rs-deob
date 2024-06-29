import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class125 {

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "Z")
    public static boolean field2912 = false;

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "Lkc;")
    public static class67 field2914 = class19.method144("@whi@ )4 ", 99);

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "Lkc;")
    public static class67 field2917 = class19.method144("sideicons", 86);

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "Lkc;")
    public static class67 field2915 = class19.method144("Fehler beim Laden Ihres Spielcharakters)3", 76);

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "Lkc;")
    public static class67 field2909 = class19.method144(":duelreq:", 99);

    @OriginalMember(owner = "client!ua", name = "k", descriptor = "Lkc;")
    public static class67 field2918 = class19.method144("Zu viele Anmelde)2Versuche von Ihrer Adresse", 97);

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "Lgd;")
    public static class44 field2913 = new class44(10);

    @OriginalMember(owner = "client!ua", name = "p", descriptor = "Lkc;")
    private static class67 field2923 = class19.method144("No response from server)3", 122);

    @OriginalMember(owner = "client!ua", name = "r", descriptor = "Lkc;")
    public static class67 field2925 = field2923;

    @OriginalMember(owner = "client!ua", name = "o", descriptor = "Lgd;")
    public static class44 field2922 = new class44(200);

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "I")
    public static int field2908;

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "I")
    public static int field2910;

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "I")
    public static int field2916;

    @OriginalMember(owner = "client!ua", name = "l", descriptor = "I")
    public static int field2919;

    @OriginalMember(owner = "client!ua", name = "n", descriptor = "I")
    public static int field2921;

    @OriginalMember(owner = "client!ua", name = "s", descriptor = "I")
    public static int field2926;

    @OriginalMember(owner = "client!ua", name = "q", descriptor = "Lbf;")
    public static class14 field2924;

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "Lob;")
    public static class90 field2911;

    @OriginalMember(owner = "client!ua", name = "m", descriptor = "Z")
    public static boolean field2920;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(BI)Z", line = 12)
    public static final boolean method974(byte arg0, int arg1) {
        field2916++;
        int var2 = 108 / ((-arg0 - 58) / 55);
        return (arg1 >> 31 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V", line = 26)
    public static final void method975(int arg0) {
        class111.field2540 = 0;
        field2919++;
        for (int var1 = -1; var1 < class81.field1948 + class130.field3042; var1++) {
            class50 var18;
            if (var1 == -1) {
                var18 = class69.field1640;
            } else if (var1 < class81.field1948) {
                var18 = class44.field1067[class119.field2820[var1]];
            } else {
                var18 = class9.field189[class65.field1530[var1 - class81.field1948]];
            }
            if (var18 != null && var18.method420((byte) -120)) {
                if (var18 instanceof class66) {
                    class73 var19 = ((class66) var18).field1542;
                    if (var19.field1734 != null) {
                        var19 = var19.method587(1);
                    }
                    if (var19 == null) {
                        continue;
                    }
                }
                if (class81.field1948 <= var1) {
                    class73 var22 = ((class66) var18).field1542;
                    if (var22.field1745 >= 0 && class134.field3206.length > var22.field1745) {
                        class24.method187(var18, -65536, var18.field1213 + 15);
                        if (class45.field1096 > -1) {
                            class134.field3206[var22.field1745].method661(class45.field1096 - 12, class66.field1554 - 30);
                        }
                    }
                    if (class54.field1289 == 1 && class65.field1530[var1 - class81.field1948] == class137.field3269 && class135.field3243 % 20 < 10) {
                        class24.method187(var18, -65536, var18.field1213 + 15);
                        if (class45.field1096 > -1) {
                            class22.field491[0].method661(class45.field1096 - 12, class66.field1554 + -28);
                        }
                    }
                } else {
                    int var20 = 30;
                    class103 var21 = (class103) var18;
                    if (var21.field2319 != -1 || var21.field2323 != -1) {
                        class24.method187(var18, -65536, var18.field1213 + 15);
                        if (class45.field1096 > -1) {
                            if (var21.field2319 != -1) {
                                class7.field147[var21.field2319].method661(class45.field1096 - 12, -var20 + class66.field1554);
                                var20 += 25;
                            }
                            if (var21.field2323 != -1) {
                                class134.field3206[var21.field2323].method661(class45.field1096 - 12, -var20 + class66.field1554);
                                var20 += 25;
                            }
                        }
                    }
                    if (var1 >= 0 && class54.field1289 == 10 && class119.field2820[var1] == class126.field2949) {
                        class24.method187(var18, -65536, var18.field1213 + 15);
                        if (class45.field1096 > -1) {
                            class22.field491[1].method661(class45.field1096 - 12, -var20 + class66.field1554);
                        }
                    }
                }
                if (var18.field1219 != null && (class81.field1948 <= var1 || class20.field410 == 0 || class20.field410 == 3 || class20.field410 == 1 && class33.method286(((class103) var18).field2329, 119))) {
                    class24.method187(var18, -65536, var18.field1213);
                    if (class45.field1096 > -1 && class81.field1915 > class111.field2540) {
                        class81.field1939[class111.field2540] = class117.field2789.method231(var18.field1219) / 2;
                        class81.field1945[class111.field2540] = class117.field2789.field592;
                        class81.field1913[class111.field2540] = class45.field1096;
                        class81.field1925[class111.field2540] = class66.field1554;
                        class81.field1922[class111.field2540] = var18.field1257;
                        class81.field1919[class111.field2540] = var18.field1195;
                        class81.field1918[class111.field2540] = var18.field1251;
                        class81.field1924[class111.field2540] = var18.field1219;
                        class111.field2540++;
                    }
                }
                if (var18.field1202 > class135.field3243) {
                    class24.method187(var18, -65536, var18.field1213 + 15);
                    if (class45.field1096 > -1) {
                        int var23 = var18.field1236 * 30 / var18.field1239;
                        if (var23 > 30) {
                            var23 = 30;
                        }
                        class68.method569(class45.field1096 - 15, class66.field1554 - 3, var23, 5, 65280);
                        class68.method569(class45.field1096 + var23 - 15, class66.field1554 - 3, 30 - var23, 5, 16711680);
                    }
                }
                for (int var24 = 0; var24 < 4; var24++) {
                    if (class135.field3243 < var18.field1256[var24]) {
                        class24.method187(var18, -65536, var18.field1213 / 2);
                        if (class45.field1096 > -1) {
                            if (var24 == 1) {
                                class66.field1554 -= 20;
                            }
                            if (var24 == 2) {
                                class45.field1096 -= 15;
                                class66.field1554 -= 10;
                            }
                            if (var24 == 3) {
                                class66.field1554 -= 10;
                                class45.field1096 += 15;
                            }
                            class133.field3176[var18.field1229[var24]].method661(class45.field1096 - 12, class66.field1554 + -12);
                            class32.field687.method227(class71.method586(arg0 + 107, var18.field1223[var24]), class45.field1096, class66.field1554 + 4, 0);
                            class32.field687.method227(class71.method586(103, var18.field1223[var24]), class45.field1096 - 1, class66.field1554 + 3, 16777215);
                        }
                    }
                }
            }
        }
        if (arg0 != -4) {
            method976(82);
        }
        for (int var2 = 0; var2 < class111.field2540; var2++) {
            int var3 = class81.field1925[var2];
            int var4 = class81.field1913[var2];
            int var5 = class81.field1939[var2];
            int var6 = class81.field1945[var2];
            boolean var7 = true;
            while (var7) {
                var7 = false;
                for (int var17 = 0; var17 < var2; var17++) {
                    if (class81.field1925[var17] - class81.field1945[var17] < var3 - -2 && class81.field1925[var17] + 2 > -var6 + var3 && var4 - var5 < class81.field1939[var17] + class81.field1913[var17] && var4 + var5 > class81.field1913[var17] + -class81.field1939[var17] && var3 > class81.field1925[var17] - class81.field1945[var17]) {
                        var7 = true;
                        var3 = class81.field1925[var17] - class81.field1945[var17];
                    }
                }
            }
            class45.field1096 = class81.field1913[var2];
            class66.field1554 = class81.field1925[var2] = var3;
            class67 var8 = class81.field1924[var2];
            if (class100.field2233 == 0) {
                int var9 = 16776960;
                if (class81.field1922[var2] < 6) {
                    var9 = class54.field1285[class81.field1922[var2]];
                }
                if (class81.field1922[var2] == 6) {
                    var9 = class91.field2115 % 20 >= 10 ? 16776960 : 16711680;
                }
                if (class81.field1922[var2] == 7) {
                    var9 = class91.field2115 % 20 >= 10 ? 65535 : 255;
                }
                if (class81.field1922[var2] == 8) {
                    var9 = class91.field2115 % 20 >= 10 ? 8454016 : 45056;
                }
                if (class81.field1922[var2] == 9) {
                    int var10 = 150 - class81.field1918[var2];
                    if (var10 < 50) {
                        var9 = var10 * 1280 + 16711680;
                    } else if (var10 < 100) {
                        var9 = 16776960 - (var10 - 50) * 327680;
                    } else if (var10 < 150) {
                        var9 = (var10 - 100) * 5 + 65280;
                    }
                }
                if (class81.field1922[var2] == 10) {
                    int var11 = 150 - class81.field1918[var2];
                    if (var11 < 50) {
                        var9 = var11 * 5 + 16711680;
                    } else if (var11 < 100) {
                        var9 = 16711935 - (var11 - 50) * 327680;
                    } else if (var11 < 150) {
                        var9 = var11 * 327680 - (var11 - 100) * 5 - 32767745;
                    }
                }
                if (class81.field1922[var2] == 11) {
                    int var12 = 150 - class81.field1918[var2];
                    if (var12 < 50) {
                        var9 = 16777215 - var12 * 327685;
                    } else if (var12 < 100) {
                        var9 = var12 * 327685 + 65280 - 16384250;
                    } else if (var12 < 150) {
                        var9 = 49545215 - var12 * 327680;
                    }
                }
                if (class81.field1919[var2] == 0) {
                    class117.field2789.method227(var8, class45.field1096, class66.field1554 + 1, 0);
                    class117.field2789.method227(var8, class45.field1096, class66.field1554, var9);
                }
                if (class81.field1919[var2] == 1) {
                    class117.field2789.method240(var8, class45.field1096, class66.field1554 + 1, 0, class91.field2115);
                    class117.field2789.method240(var8, class45.field1096, class66.field1554, var9, class91.field2115);
                }
                if (class81.field1919[var2] == 2) {
                    class117.field2789.method237(var8, class45.field1096, class66.field1554 + 1, 0, class91.field2115);
                    class117.field2789.method237(var8, class45.field1096, class66.field1554, var9, class91.field2115);
                }
                if (class81.field1919[var2] == 3) {
                    class117.field2789.method236(var8, class45.field1096, class66.field1554 + 1, 0, class91.field2115, 150 - class81.field1918[var2]);
                    class117.field2789.method236(var8, class45.field1096, class66.field1554, var9, class91.field2115, 150 - class81.field1918[var2]);
                }
                if (class81.field1919[var2] == 4) {
                    int var13 = class117.field2789.method231(var8);
                    int var14 = (150 - class81.field1918[var2]) * (var13 + 100) / 150;
                    class68.method555(class45.field1096 - 50, 0, class45.field1096 + 50, 334);
                    class117.field2789.method229(var8, class45.field1096 + 50 - var14, class66.field1554 + 1, 0);
                    class117.field2789.method229(var8, class45.field1096 + 50 - var14, class66.field1554, var9);
                    class68.method567();
                }
                if (class81.field1919[var2] == 5) {
                    int var15 = 0;
                    int var16 = 150 - class81.field1918[var2];
                    class68.method555(0, class66.field1554 - class117.field2789.field592 - 1, 512, class66.field1554 + 5);
                    if (var16 < 25) {
                        var15 = var16 - 25;
                    } else if (var16 > 125) {
                        var15 = var16 - 125;
                    }
                    class117.field2789.method227(var8, class45.field1096, class66.field1554 + var15 + 1, 0);
                    class117.field2789.method227(var8, class45.field1096, class66.field1554 + var15, var9);
                    class68.method567();
                }
            } else {
                class117.field2789.method227(var8, class45.field1096, class66.field1554 + 1, 0);
                class117.field2789.method227(var8, class45.field1096, class66.field1554, 16776960);
            }
        }
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(I)V", line = 411)
    public static final void method976(int arg0) {
        field2908++;
        if (arg0 != 30045) {
            method978(true);
        }
        class18.field346.method378((byte) -105);
        class94.field2145.method378((byte) -80);
        class44.field1083.method378((byte) -115);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V", line = 450)
    public static void method977(byte arg0) {
        field2925 = null;
        field2913 = null;
        field2914 = null;
        field2918 = null;
        field2923 = null;
        field2922 = null;
        field2915 = null;
        if (arg0 != 47) {
            method976(-123);
        }
        field2909 = null;
        field2924 = null;
        field2917 = null;
        field2911 = null;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Z)V", line = 478)
    public static final void method978(boolean arg0) {
        field2910++;
        if (arg0) {
            field2924 = null;
        }
        while (class112.field2558.method710(class133.field3166, (byte) 117) >= 11) {
            int var1 = class112.field2558.method709(11, (byte) 86);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class44.field1067[var1] == null) {
                class44.field1067[var1] = new class103();
                var2 = true;
                if (class69.field1636[var1] != null) {
                    class44.field1067[var1].method785(class69.field1636[var1], -1);
                }
            }
            class119.field2820[class81.field1948++] = var1;
            class103 var3 = class44.field1067[var1];
            var3.field1217 = class135.field3243;
            int var4 = class112.field2558.method709(1, (byte) 86);
            if (var4 == 1) {
                class138.field3308[class69.field1649++] = var1;
            }
            int var5 = class112.field2558.method709(1, (byte) 86);
            int var6 = class42.field1027[class112.field2558.method709(3, (byte) 86)];
            if (var2) {
                var3.field1199 = var6;
            }
            int var7 = class112.field2558.method709(5, (byte) 86);
            if (var7 > 15) {
                var7 -= 32;
            }
            int var8 = class112.field2558.method709(5, (byte) 86);
            if (var8 > 15) {
                var8 -= 32;
            }
            var3.method415(class69.field1640.field1263[0] + var7, class69.field1640.field1198[0] + var8, var5 == 1, false);
        }
        class112.field2558.method716((byte) 77);
    }
}
