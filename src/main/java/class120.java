import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class120 extends class110 {

    @OriginalMember(owner = "client!nc", name = "y", descriptor = "[I")
    public int[] field2426 = new int[] { -1 };

    @OriginalMember(owner = "client!nc", name = "B", descriptor = "[I")
    public int[] field2429 = new int[1];

    @OriginalMember(owner = "client!nc", name = "s", descriptor = "Leh;")
    public static class47 field2420 = class195.method1282((byte) -4, "(U0a )2 in: ");

    @OriginalMember(owner = "client!nc", name = "A", descriptor = "Leh;")
    public static class47 field2428 = class195.method1282((byte) -4, " loggt sich ein)3");

    @OriginalMember(owner = "client!nc", name = "t", descriptor = "Lpa;")
    public static class136 field2421 = new class136(64);

    @OriginalMember(owner = "client!nc", name = "C", descriptor = "Lea;")
    public static class40 field2430 = new class40();

    @OriginalMember(owner = "client!nc", name = "D", descriptor = "Leh;")
    private static class47 field2431 = class195.method1282((byte) -4, "Please subscribe)1 or use a different world)3");

    @OriginalMember(owner = "client!nc", name = "F", descriptor = "I")
    public static volatile int field2433 = -1;

    @OriginalMember(owner = "client!nc", name = "G", descriptor = "I")
    public static int field2434 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!nc", name = "E", descriptor = "Leh;")
    public static class47 field2432 = field2431;

    @OriginalMember(owner = "client!nc", name = "H", descriptor = "Leh;")
    public static class47 field2435 = class195.method1282((byte) -4, "Bitte warten Sie)3)3)3");

    @OriginalMember(owner = "client!nc", name = "u", descriptor = "I")
    public static int field2422;

    @OriginalMember(owner = "client!nc", name = "v", descriptor = "I")
    public static int field2423;

    @OriginalMember(owner = "client!nc", name = "w", descriptor = "I")
    public static int field2424;

    @OriginalMember(owner = "client!nc", name = "x", descriptor = "I")
    public static int field2425;

    @OriginalMember(owner = "client!nc", name = "z", descriptor = "I")
    public static int field2427;

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "(I)V")
    public static final void method926(int arg0) {
        field2424++;
        try {
            if (class99.field2089 == 0) {
                if (class61.field1323 != null) {
                    class61.field1323.method678((byte) -90);
                    class61.field1323 = null;
                }
                class167.field3250 = null;
                class99.field2089 = 1;
                class186.field3556 = false;
                class185.field3537 = 0;
            }
            if (class99.field2089 == 1) {
                if (class167.field3250 == null) {
                    class167.field3250 = class142.field2782.method1055(class148.field2909, 1, class94.field1945);
                }
                if (class167.field3250.field2543 == 2) {
                    throw new IOException();
                }
                if (class167.field3250.field2543 == 1) {
                    class61.field1323 = new class79((Socket) class167.field3250.field2548, class142.field2782);
                    class99.field2089 = 2;
                    class167.field3250 = null;
                }
            }
            if (class99.field2089 == 2) {
                long var1 = class176.field3377 = class161.field3142.method399(111);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class60.field1174.field1454 = 0;
                class60.field1174.method609(14, (byte) -101);
                class60.field1174.method609(var3, (byte) -110);
                class61.field1323.method679(2, (byte) 107, class60.field1174.field1495, 0);
                class22.field418.field1454 = 0;
                class99.field2089 = 3;
            }
            if (class99.field2089 == 3) {
                if (class191.field3711 != null) {
                    class191.field3711.method900(-8);
                }
                if (class54.field1044 != null) {
                    class54.field1044.method900(-8);
                }
                int var4 = class61.field1323.method681(-125);
                if (class191.field3711 != null) {
                    class191.field3711.method900(-8);
                }
                if (class54.field1044 != null) {
                    class54.field1044.method900(-8);
                }
                if (var4 != 0) {
                    class109.method876((byte) 104, var4);
                    return;
                }
                class22.field418.field1454 = 0;
                class99.field2089 = 4;
            }
            if (class99.field2089 == 4) {
                if (class22.field418.field1454 < 8) {
                    int var5 = class61.field1323.method680(0);
                    if (var5 > 8 - class22.field418.field1454) {
                        var5 = 8 - class22.field418.field1454;
                    }
                    if (var5 > 0) {
                        class61.field1323.method682(class22.field418.field1454, class22.field418.field1495, 17031, var5);
                        class22.field418.field1454 += var5;
                    }
                }
                if (class22.field418.field1454 == 8) {
                    class22.field418.field1454 = 0;
                    class8.field166 = class22.field418.method570((byte) 10);
                    class99.field2089 = 5;
                }
            }
            if (arg0 >= 39) {
                if (class99.field2089 == 5) {
                    class60.field1174.field1454 = 0;
                    int[] var6 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class8.field166 >> 32), (int) class8.field166 };
                    class60.field1174.method609(10, (byte) -106);
                    class60.field1174.method606(var6[0], -1424429928);
                    class60.field1174.method606(var6[1], -1424429928);
                    class60.field1174.method606(var6[2], -1424429928);
                    class60.field1174.method606(var6[3], -1424429928);
                    class60.field1174.method600(32601, class161.field3142.method399(114));
                    class60.field1174.method597(class161.field3126, (byte) -121);
                    class60.field1174.method588(class174.field3359, (byte) -66, class167.field3235);
                    class98.field2072.field1454 = 0;
                    if (class158.field3078 == 40) {
                        class98.field2072.method609(18, (byte) -110);
                    } else {
                        class98.field2072.method609(16, (byte) -105);
                    }
                    class98.field2072.method609(class60.field1174.field1454 + 93, (byte) -127);
                    class98.field2072.method606(481, -1424429928);
                    class98.field2072.method609(class204.field4029 ? 1 : 0, (byte) -98);
                    class95.method757(28, class98.field2072);
                    class98.field2072.method606(class206.field4048.field208, -1424429928);
                    class98.field2072.method606(class91.field1908.field208, -1424429928);
                    class98.field2072.method606(class124.field2508.field208, -1424429928);
                    class98.field2072.method606(class165.field3205.field208, -1424429928);
                    class98.field2072.method606(class147.field2882.field208, -1424429928);
                    class98.field2072.method606(class87.field1862.field208, -1424429928);
                    class98.field2072.method606(class189.field3667.field208, -1424429928);
                    class98.field2072.method606(class47.field936.field208, -1424429928);
                    class98.field2072.method606(class3.field45.field208, -1424429928);
                    class98.field2072.method606(class202.field3918.field208, -1424429928);
                    class98.field2072.method606(class25.field491.field208, -1424429928);
                    class98.field2072.method606(class72.field1548.field208, -1424429928);
                    class98.field2072.method606(class147.field2880.field208, -1424429928);
                    class98.field2072.method606(class8.field155.field208, -1424429928);
                    class98.field2072.method606(class79.field1693.field208, -1424429928);
                    class98.field2072.method606(class152.field2988.field208, -1424429928);
                    class98.field2072.method571(class60.field1174.field1495, -1, class60.field1174.field1454, 0);
                    class61.field1323.method679(class98.field2072.field1454, (byte) 31, class98.field2072.field1495, 0);
                    class60.field1174.method659(var6, 20748);
                    for (int var7 = 0; var7 < 4; var7++) {
                        var6[var7] += 50;
                    }
                    class22.field418.method659(var6, 20748);
                    class99.field2089 = 6;
                }
                if (class99.field2089 == 6 && class61.field1323.method680(0) > 0) {
                    int var8 = class61.field1323.method681(-109);
                    if (var8 == 21 && class158.field3078 == 20) {
                        class99.field2089 = 7;
                    } else if (var8 == 2) {
                        class99.field2089 = 9;
                    } else if (var8 == 15 && class158.field3078 == 40) {
                        class2.method7((byte) 80);
                        return;
                    } else if (var8 == 23 && class105.field2209 < 1) {
                        class105.field2209++;
                        class99.field2089 = 0;
                    } else {
                        class109.method876((byte) 117, var8);
                        return;
                    }
                }
                if (class99.field2089 == 7 && class61.field1323.method680(0) > 0) {
                    class181.field3466 = class61.field1323.method681(-115) * 60 + 180;
                    class99.field2089 = 8;
                }
                if (class99.field2089 == 8) {
                    class185.field3537 = 0;
                    class51.method453(class73.field1564, class195.field3802, class5.method24(new class47[] { class167.method1133(class181.field3466 / 60, (byte) -116), class68.field1478 }, (byte) 115), -88);
                    if (--class181.field3466 <= 0) {
                        class99.field2089 = 0;
                    }
                } else {
                    if (class99.field2089 == 9 && class61.field1323.method680(0) >= 9) {
                        class37.field745 = class61.field1323.method681(-108);
                        class31.field595 = class61.field1323.method681(-106);
                        class155.field3044 = class61.field1323.method681(-118) == 1;
                        class180.field3443 = class61.field1323.method681(-113);
                        class180.field3443 <<= 0x8;
                        class180.field3443 += class61.field1323.method681(-105);
                        class26.field510 = class61.field1323.method681(-112);
                        class61.field1323.method682(0, class22.field418.field1495, 17031, 1);
                        class22.field418.field1454 = 0;
                        class184.field3529 = class22.field418.method656(-101);
                        class61.field1323.method682(0, class22.field418.field1495, 17031, 2);
                        class22.field418.field1454 = 0;
                        class14.field304 = class22.field418.method569(26496);
                        class99.field2089 = 10;
                    }
                    if (class99.field2089 != 10) {
                        class185.field3537++;
                        if (class185.field3537 > 2000) {
                            if (class105.field2209 < 1) {
                                class99.field2089 = 0;
                                class105.field2209++;
                                if (class85.field1800 == class148.field2909) {
                                    class148.field2909 = class27.field520;
                                } else {
                                    class148.field2909 = class85.field1800;
                                }
                            } else {
                                class109.method876((byte) 82, -3);
                            }
                        }
                    } else if (class61.field1323.method680(0) >= class14.field304) {
                        class22.field418.field1454 = 0;
                        class61.field1323.method682(0, class22.field418.field1495, 17031, class14.field304);
                        class185.method1229((byte) -12);
                        class138.field2715 = -1;
                        class178.method1188(false, 16617);
                        class184.field3529 = -1;
                    }
                }
            }
        } catch (IOException var9) {
            if (class105.field2209 < 1) {
                class105.field2209++;
                if (class85.field1800 == class148.field2909) {
                    class148.field2909 = class27.field520;
                } else {
                    class148.field2909 = class85.field1800;
                }
                class99.field2089 = 0;
            } else {
                class109.method876((byte) 83, -2);
            }
        }
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(Z)V")
    public static final void method927(boolean arg0) {
        class20.method204(class26.field511, (byte) -5);
        class192.field3719++;
        field2427++;
        if (class124.field2492 && class201.field3908) {
            int var1 = class84.field1788;
            int var2 = var1 - class141.field2755;
            int var3 = class41.field814;
            int var4 = var3 - class180.field3447;
            if (class193.field3740 > var2) {
                var2 = class193.field3740;
            }
            if (class193.field3740 + class63.field1344.field1187 < class26.field511.field1187 + var2) {
                var2 = class193.field3740 + class63.field1344.field1187 - class26.field511.field1187;
            }
            if (class40.field787 > var4) {
                var4 = class40.field787;
            }
            int var5 = var2 - class140.field2740;
            int var6 = class26.field511.field1317;
            if (class40.field787 + class63.field1344.field1303 < var4 - -class26.field511.field1303) {
                var4 = class40.field787 + class63.field1344.field1303 - class26.field511.field1303;
            }
            int var7 = var4 - class109.field2257;
            if (!arg0) {
                field2432 = null;
            }
            int var8 = var2 + class63.field1344.field1316 - class193.field3740;
            if (class26.field511.field1297 < class192.field3719 && (var6 < var5 || -var6 > var5 || var7 > var6 || -var6 > var7)) {
                class68.field1500 = true;
            }
            int var9 = var4 + class63.field1344.field1250 - class40.field787;
            if (class26.field511.field1210 != null && class68.field1500) {
                class43 var10 = new class43();
                var10.field871 = class26.field511.field1210;
                var10.field873 = var9;
                var10.field859 = class26.field511;
                var10.field870 = var8;
                class188.method1242(var10, 98);
            }
            if (class156.field3054 == 0) {
                if (class68.field1500) {
                    if (class26.field511.field1268 != null) {
                        class43 var11 = new class43();
                        var11.field871 = class26.field511.field1268;
                        var11.field870 = var8;
                        var11.field862 = class86.field1830;
                        var11.field873 = var9;
                        var11.field859 = class26.field511;
                        class188.method1242(var11, 86);
                    }
                    if (class86.field1830 != null && class110.method882((byte) -88, class26.field511) != null) {
                        class40.field797++;
                        class60.field1174.method657(28182, 48);
                        class60.field1174.method590(class26.field511.field1263, -1848441912);
                        class60.field1174.method583(-68041368, class86.field1830.field1263);
                        class60.field1174.method572(69, class86.field1830.field1211);
                        class60.field1174.method572(49, class26.field511.field1211);
                    }
                } else if ((class6.field95 == 1 || class44.method367(0, class95.field1971 - 1)) && class95.field1971 > 2) {
                    class84.method697((byte) 106);
                } else if (class95.field1971 > 0) {
                    class151.method1062(class95.field1971 - 1, -2366);
                }
                class26.field511 = null;
            }
        } else if (class192.field3719 > 1) {
            class26.field511 = null;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZLjh;Ljh;)V")
    public static final void method928(boolean arg0, class89 arg1, class89 arg2) {
        field2425++;
        if (class195.field3804 == null) {
            class195.field3804 = class87.method711(class161.field3127, class180.field3453, class3.field45, -12568);
        }
        if (class178.field3402 == null) {
            class178.field3402 = class68.method587(class161.field3127, (byte) 107, class3.field45, class108.field2243);
        }
        if (class64.field1399 == null) {
            class64.field1399 = class68.method587(class161.field3127, (byte) 90, class3.field45, class68.field1490);
        }
        if (class40.field791 == null) {
            class40.field791 = class68.method587(class161.field3127, (byte) 87, class3.field45, class79.field1695);
        }
        class169.method1149(0, 23, 765, 480, 0);
        class169.method1146(0, 0, 125, 23, 12425273, 9135624);
        class169.method1146(125, 0, 640, 23, 5197647, 2697513);
        if (!arg0) {
            return;
        }
        arg2.method98(class40.field786, 62, 15, 0, -1);
        if (class40.field791 != null) {
            class40.field791[1].method327(140, 1);
            arg1.method122(class16.field329, 152, 10, 16777215, -1);
            class40.field791[0].method327(140, 12);
            arg1.method122(class25.field477, 152, 21, 16777215, -1);
        }
        if (class64.field1399 != null) {
            short var3 = 280;
            if (class110.field2286[0] == 0 && class125.field2515[0] == 0) {
                class64.field1399[2].method327(var3, 4);
            } else {
                class64.field1399[0].method327(var3, 4);
            }
            short var4 = 390;
            if (class110.field2286[0] == 0 && class125.field2515[0] == 1) {
                class64.field1399[3].method327(var3 + 15, 4);
            } else {
                class64.field1399[1].method327(var3 + 15, 4);
            }
            arg2.method122(class31.field583, var3 + 32, 17, 16777215, -1);
            if (class110.field2286[0] == 1 && class125.field2515[0] == 0) {
                class64.field1399[2].method327(var4, 4);
            } else {
                class64.field1399[0].method327(var4, 4);
            }
            if (class110.field2286[0] == 1 && class125.field2515[0] == 1) {
                class64.field1399[3].method327(var4 + 15, 4);
            } else {
                class64.field1399[1].method327(var4 + 15, 4);
            }
            short var5 = 500;
            short var6 = 610;
            arg2.method122(class159.field3096, var4 + 32, 17, 16777215, -1);
            if (class110.field2286[0] == 2 && class125.field2515[0] == 0) {
                class64.field1399[2].method327(var5, 4);
            } else {
                class64.field1399[0].method327(var5, 4);
            }
            if (class110.field2286[0] == 2 && class125.field2515[0] == 1) {
                class64.field1399[3].method327(var5 + 15, 4);
            } else {
                class64.field1399[1].method327(var5 + 15, 4);
            }
            arg2.method122(class202.field3919, var5 + 32, 17, 16777215, -1);
            if (class110.field2286[0] == 3 && class125.field2515[0] == 0) {
                class64.field1399[2].method327(var6, 4);
            } else {
                class64.field1399[0].method327(var6, 4);
            }
            if (class110.field2286[0] == 3 && class125.field2515[0] == 1) {
                class64.field1399[3].method327(var6 + 15, 4);
            } else {
                class64.field1399[1].method327(var6 + 15, 4);
            }
            arg2.method122(class126.field2533, var6 + 32, 17, 16777215, -1);
        }
        class169.method1149(708, 4, 50, 16, 0);
        arg1.method98(class123.field2487, 733, 16, 16777215, -1);
        class118.field2393 = -1;
        if (class195.field3804 == null) {
            return;
        }
        byte var7 = 88;
        int var8 = 765 / (var7 + 1);
        byte var9 = 19;
        int var10 = 480 / (var9 + 1);
        int var11;
        int var12;
        do {
            var11 = var10;
            var12 = var8;
            if (class96.field2044 <= (var8 - 1) * var10) {
                var8--;
            }
            if (class96.field2044 <= (var10 - 1) * var8) {
                var10--;
            }
            if (class96.field2044 <= (var10 - 1) * var8) {
                var10--;
            }
        } while (var10 != var11 || var8 != var12);
        int var13 = (765 - var7 * var8) / (var8 + 1);
        int var14 = (480 - var9 * var10) / (var10 + 1);
        if (var13 > 5) {
            var13 = 5;
        }
        if (var14 > 5) {
            var14 = 5;
        }
        int var15 = (765 - var7 * var8 - (var8 + -1) * var13) / 2;
        int var16 = (480 - (var10 - 1) * var14 - var9 * var10) / 2;
        int var17 = var16 + 23;
        int var18 = 0;
        int var19 = var15;
        for (int var20 = 0; var20 < class96.field2044; var20++) {
            class149 var21 = class69.field1520[var20];
            boolean var22 = true;
            class47 var23 = class167.method1133(var21.field2929, (byte) 81);
            if (var21.field2929 == -1) {
                var23 = class202.field3954;
                var22 = false;
            } else if (var21.field2929 > 1980) {
                var23 = class114.field2328;
                var22 = false;
            }
            if (var19 <= class84.field1788 && var17 <= class41.field814 && class84.field1788 < var7 + var19 && class41.field814 < var9 + var17 && var22) {
                class118.field2393 = var20;
                class195.field3804[var21.field2916 ? 1 : 0].method434(var19, var17, 128, 16777215);
            } else {
                class195.field3804[var21.field2916 ? 1 : 0].method429(var19, var17);
            }
            if (class178.field3402 != null) {
                class178.field3402[var21.field2925 + (var21.field2916 ? 8 : 0)].method327(var19 + 29, var17);
            }
            arg2.method98(class167.method1133(var21.field2917, (byte) 116), var19 + 15, var9 / 2 + (var17 - -5), 0, -1);
            arg1.method98(var23, var19 + 60, var17 - -(var9 / 2) + 5, 268435455, -1);
            var17 += var9 + var14;
            int var10000 = ~var10;
            var18++;
            if (var10000 >= ~var18) {
                var17 = var16 + 23;
                var19 += var7 + var13;
                var18 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIILkb;Lkb;IIIIJ)V")
    public static final void method929(int arg0, int arg1, int arg2, int arg3, class92 arg4, class92 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 == null) {
            return;
        }
        class117 var12 = new class117();
        var12.field2370 = arg10;
        var12.field2383 = arg1 * 128 + 64;
        var12.field2376 = arg2 * 128 + 64;
        var12.field2386 = arg3;
        var12.field2374 = arg4;
        var12.field2380 = arg5;
        var12.field2368 = arg6;
        var12.field2387 = arg7;
        var12.field2375 = arg8;
        var12.field2378 = arg9;
        for (int var13 = arg0; var13 >= 0; var13--) {
            if (class173.field3351[var13][arg1][arg2] == null) {
                class173.field3351[var13][arg1][arg2] = new class152(var13, arg1, arg2);
            }
        }
        class173.field3351[arg0][arg1][arg2].field2990 = var12;
    }

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "(I)V")
    public static void method930(int arg0) {
        field2430 = null;
        field2428 = null;
        int var1 = -122 / ((arg0 + 62) / 46);
        field2435 = null;
        field2431 = null;
        field2420 = null;
        field2421 = null;
        field2432 = null;
    }
}
