import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class99 extends class45 {

    @OriginalMember(owner = "client!pj", name = "v", descriptor = "I")
    public static int field1424 = -2;

    @OriginalMember(owner = "client!pj", name = "z", descriptor = "Lqj;")
    public static class196 field1428 = class80.method502("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3", -48);

    @OriginalMember(owner = "client!pj", name = "w", descriptor = "I")
    public static int field1425;

    @OriginalMember(owner = "client!pj", name = "x", descriptor = "I")
    public static int field1426;

    @OriginalMember(owner = "client!pj", name = "y", descriptor = "I")
    public static int field1427;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(B)V")
    public static void method602(byte arg0) {
        field1428 = null;
        if (arg0 < 20) {
            method605(22, 121);
        }
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(Z)V")
    public static final void method603(boolean arg0) {
        field1426++;
        if (arg0) {
            return;
        }
        try {
            if (class42.field484 == 0) {
                if (class194.field3408 != null) {
                    class194.field3408.method481(true);
                    class194.field3408 = null;
                }
                class62.field859 = 0;
                class197.field3500 = null;
                class42.field484 = 1;
                class175.field2944 = false;
            }
            if (class42.field484 == 1) {
                if (class197.field3500 == null) {
                    class197.field3500 = class168.field2844.method1397(class56.field698, (byte) -40, class6.field47);
                }
                if (class197.field3500.field2140 == 2) {
                    throw new IOException();
                }
                if (class197.field3500.field2140 == 1) {
                    class194.field3408 = new class77((Socket) class197.field3500.field2135, class168.field2844);
                    class197.field3500 = null;
                    class42.field484 = 2;
                }
            }
            if (class42.field484 == 2) {
                long var1 = class22.field286 = class152.field2446.method1330(0);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class44.field520.field699 = 0;
                class44.field520.method329((byte) 48, 14);
                class44.field520.method329((byte) 55, var3);
                class194.field3408.method484(class44.field520.field693, 2, 0, 3);
                class229.field4077.field699 = 0;
                class42.field484 = 3;
            }
            if (class42.field484 == 3) {
                if (class5.field35 != null) {
                    class5.field35.method1091(2);
                }
                if (class142.field2180 != null) {
                    class142.field2180.method1091(2);
                }
                int var4 = class194.field3408.method480(106);
                if (class5.field35 != null) {
                    class5.field35.method1091(2);
                }
                if (class142.field2180 != null) {
                    class142.field2180.method1091(2);
                }
                if (var4 != 0) {
                    class157.method990(var4, -8069);
                    return;
                }
                class229.field4077.field699 = 0;
                class42.field484 = 4;
            }
            if (class42.field484 == 4) {
                if (class229.field4077.field699 < 8) {
                    int var5 = class194.field3408.method479(30000);
                    if (8 - class229.field4077.field699 < var5) {
                        var5 = 8 - class229.field4077.field699;
                    }
                    if (var5 > 0) {
                        class194.field3408.method482((byte) 80, class229.field4077.field699, var5, class229.field4077.field693);
                        class229.field4077.field699 += var5;
                    }
                }
                if (class229.field4077.field699 == 8) {
                    class229.field4077.field699 = 0;
                    class256.field4500 = class229.field4077.method319(18533);
                    class42.field484 = 5;
                }
            }
            if (class42.field484 == 5) {
                int[] var6 = new int[4];
                var6[2] = (int) (class256.field4500 >> 32);
                class44.field520.field699 = 0;
                var6[3] = (int) class256.field4500;
                var6[1] = (int) (Math.random() * 9.9999999E7D);
                var6[0] = (int) (Math.random() * 9.9999999E7D);
                class44.field520.method329((byte) 100, 10);
                class44.field520.method355((byte) 45, var6[0]);
                class44.field520.method355((byte) -78, var6[1]);
                class44.field520.method355((byte) -78, var6[2]);
                class44.field520.method355((byte) -127, var6[3]);
                class44.field520.method346(class152.field2446.method1330(0), (byte) 58);
                class44.field520.method330(class152.field2456, 12865);
                class44.field520.method361(class94.field1370, 22206, class19.field225);
                class45.field531.field699 = 0;
                if (class56.field741 == 40) {
                    class45.field531.method329((byte) 75, 18);
                } else {
                    class45.field531.method329((byte) 26, 16);
                }
                class45.field531.method310(class44.field520.field699 + class17.method94(class171.field2885, (byte) -12) + 149, -103);
                class45.field531.method355((byte) -111, 502);
                class45.field531.method329((byte) 102, 0);
                class45.field531.method310(class249.field4407, -89);
                class45.field531.method310(class61.field815, -120);
                class56.method331(1847479456, class45.field531);
                class45.field531.method330(class171.field2885, 12865);
                class45.field531.method355((byte) -111, class22.field279);
                class45.field531.method355((byte) 110, class214.method1476(-954688305));
                class164.field2652 = true;
                class45.field531.method355((byte) -94, class194.field3414.field2014);
                class45.field531.method355((byte) 98, class76.field1088.field2014);
                class45.field531.method355((byte) -80, class171.field2875.field2014);
                class45.field531.method355((byte) 65, class186.field3271.field2014);
                class45.field531.method355((byte) 76, class230.field4091.field2014);
                class45.field531.method355((byte) 56, class144.field2219.field2014);
                class45.field531.method355((byte) -110, class62.field847.field2014);
                class45.field531.method355((byte) 112, class40.field445.field2014);
                class45.field531.method355((byte) 25, class196.field3439.field2014);
                class45.field531.method355((byte) 125, class258.field4518.field2014);
                class45.field531.method355((byte) -66, class54.field673.field2014);
                class45.field531.method355((byte) 125, class243.field4334.field2014);
                class45.field531.method355((byte) -90, class149.field2385.field2014);
                class45.field531.method355((byte) 119, class160.field2573.field2014);
                class45.field531.method355((byte) -108, class29.field360.field2014);
                class45.field531.method355((byte) -123, class52.field647.field2014);
                class45.field531.method355((byte) -115, class18.field213.field2014);
                class45.field531.method355((byte) -89, class192.field3377.field2014);
                class45.field531.method355((byte) 78, class183.field3221.field2014);
                class45.field531.method355((byte) 89, class224.field4013.field2014);
                class45.field531.method355((byte) 19, class152.field2447.field2014);
                class45.field531.method355((byte) -75, class198.field3512.field2014);
                class45.field531.method355((byte) -101, class174.field2934.field2014);
                class45.field531.method355((byte) -107, class206.field3705.field2014);
                class45.field531.method355((byte) 87, class152.field2448.field2014);
                class45.field531.method355((byte) 36, class39.field441.field2014);
                class45.field531.method355((byte) -94, class78.field1130.field2014);
                class45.field531.method360(0, !arg0, class44.field520.field693, class44.field520.field699);
                class194.field3408.method484(class45.field531.field693, class45.field531.field699, 0, 3);
                class44.field520.method1171(0, var6);
                for (int var7 = 0; var7 < 4; var7++) {
                    var6[var7] += 50;
                }
                class229.field4077.method1171(0, var6);
                class42.field484 = 6;
            }
            if (class42.field484 == 6 && class194.field3408.method479(30000) > 0) {
                int var8 = class194.field3408.method480(116);
                if (var8 == 21 && class56.field741 == 20) {
                    class42.field484 = 7;
                } else if (var8 == 2) {
                    class42.field484 = 9;
                } else if (var8 == 15 && class56.field741 == 40) {
                    class138.method862(false);
                    return;
                } else if (var8 == 23 && class229.field4075 < 1) {
                    class42.field484 = 0;
                    class229.field4075++;
                } else {
                    class157.method990(var8, -8069);
                    return;
                }
            }
            if (class42.field484 == 7 && class194.field3408.method479(30000) > 0) {
                class164.field2647 = (class194.field3408.method480(118) + 3) * 60;
                class42.field484 = 8;
                class54.field681 = 21;
            }
            if (class42.field484 == 8) {
                if (--class164.field2647 <= 0) {
                    class42.field484 = 0;
                }
                class62.field859 = 0;
            } else {
                if (class42.field484 == 9 && class194.field3408.method479(30000) >= 9) {
                    class25.field320 = class194.field3408.method480(48);
                    class123.field1751 = class194.field3408.method480(126);
                    class33.field402 = class194.field3408.method480(71);
                    if (class33.field402 == 1) {
                        try {
                            class56.field694.method1331(class168.field2844.field3696, 0);
                        } catch (Throwable var10) {
                        }
                    } else {
                        try {
                            class148.field2335.method1331(class168.field2844.field3696, 0);
                        } catch (Throwable var9) {
                        }
                    }
                    class213.field3818 = class194.field3408.method480(-128);
                    class94.field1379 = class194.field3408.method480(45) == 1;
                    class31.field395 = class194.field3408.method480(-88);
                    class31.field395 <<= 0x8;
                    class31.field395 += class194.field3408.method480(-121);
                    class237.field4215 = class194.field3408.method480(-119);
                    class194.field3408.method482((byte) 121, 0, 1, class229.field4077.field693);
                    class229.field4077.field699 = 0;
                    class195.field3432 = class229.field4077.method1174(false);
                    class194.field3408.method482((byte) 53, 0, 2, class229.field4077.field693);
                    class229.field4077.field699 = 0;
                    class76.field1096 = class229.field4077.method318(true);
                    class42.field484 = 10;
                }
                if (class42.field484 != 10) {
                    class62.field859++;
                    if (class62.field859 > 2000) {
                        if (class229.field4075 < 1) {
                            if (class56.field698 == class218.field3909) {
                                class56.field698 = class258.field4522;
                            } else {
                                class56.field698 = class218.field3909;
                            }
                            class42.field484 = 0;
                            class229.field4075++;
                        } else {
                            class157.method990(-3, -8069);
                        }
                    }
                } else if (class194.field3408.method479(30000) >= class76.field1096) {
                    class229.field4077.field699 = 0;
                    class194.field3408.method482((byte) 66, 0, class76.field1096, class229.field4077.field693);
                    class84.method522((byte) -52);
                    class223.field4001 = -1;
                    class172.method1124(-430065760, false);
                    class195.field3432 = -1;
                }
            }
        } catch (IOException var11) {
            if (class229.field4075 < 1) {
                if (class56.field698 == class218.field3909) {
                    class56.field698 = class258.field4522;
                } else {
                    class56.field698 = class218.field3909;
                }
                class229.field4075++;
                class42.field484 = 0;
            } else {
                class157.method990(-2, -8069);
            }
        }
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(BI)V")
    public static final void method604(byte arg0, int arg1) {
        int var2 = -128 / ((arg0 - 39) / 51);
        class126.field1784 = arg1;
        field1425++;
        class120.field1737 = -1;
        class120.field1737 = -1;
        class24.method142(-5522);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(II)V")
    public static final void method605(int arg0, int arg1) {
        field1427++;
        class192.field3370 += arg0 * 128;
        if (arg1 != -25839) {
            return;
        }
        short var2 = 256;
        if (class192.field3370 > class199.field3538.length) {
            class192.field3370 -= class199.field3538.length;
            int var3 = (int) (Math.random() * 12.0D);
            class137.method858(class72.field1041[var3], (byte) 65);
        }
        int var4 = 0;
        int var5 = arg0 * 128;
        int var6 = (var2 - arg0) * 128;
        for (int var7 = 0; var7 < var6; var7++) {
            int var26 = class46.field553[var4 + var5] - class199.field3538[class199.field3538.length - 1 & class192.field3370 + var4] * arg0 / 6;
            if (var26 < 0) {
                var26 = 0;
            }
            class46.field553[var4++] = var26;
        }
        for (int var8 = var2 - arg0; var8 < var2; var8++) {
            int var23 = var8 * 128;
            for (int var24 = 0; var24 < 128; var24++) {
                int var25 = (int) (Math.random() * 100.0D);
                if (var25 < 50 && var24 > 10 && var24 < 118) {
                    class46.field553[var23 + var24] = 255;
                } else {
                    class46.field553[var23 + var24] = 0;
                }
            }
        }
        for (int var9 = 0; var9 < var2 - arg0; var9++) {
            class216.field3893[var9] = class216.field3893[var9 + arg0];
        }
        for (int var10 = var2 - arg0; var10 < var2; var10++) {
            class216.field3893[var10] = (int) (Math.sin((double) class138.field2124 / 14.0D) * 16.0D + Math.sin((double) class138.field2124 / 15.0D) * 14.0D + Math.sin((double) class138.field2124 / 16.0D) * 12.0D);
            class138.field2124++;
        }
        class13.field152 += arg0;
        int var11 = ((class171.field2879 & 0x1) + arg0) / 2;
        if (var11 <= 0) {
            return;
        }
        for (int var12 = 0; var12 < class13.field152; var12++) {
            int var21 = (int) (Math.random() * 124.0D) + 2;
            int var22 = (int) (Math.random() * 128.0D) + 128;
            class46.field553[var21 + (var22 << 7)] = 192;
        }
        class13.field152 = 0;
        for (int var13 = 0; var13 < var2; var13++) {
            int var18 = 0;
            int var19 = var13 * 128;
            for (int var20 = -var11; var20 < 128; var20++) {
                if (var20 + var11 < 128) {
                    var18 += class46.field553[var19 + var20 + var11];
                }
                if (var20 - var11 - 1 >= 0) {
                    var18 -= class46.field553[var20 + var19 - var11 - 1];
                }
                if (var20 >= 0) {
                    class168.field2832[var19 + var20] = var18 / (var11 * 2 + 1);
                }
            }
        }
        for (int var14 = 0; var14 < 128; var14++) {
            int var15 = 0;
            for (int var16 = -var11; var16 < var2; var16++) {
                int var17 = var16 * 128;
                if (var2 > var11 + var16) {
                    var15 += class168.field2832[var11 * 128 + var17 + var14];
                }
                if (var16 - var11 - 1 >= 0) {
                    var15 -= class168.field2832[var14 + var17 - (var11 + 1) * 128];
                }
                if (var16 >= 0) {
                    class46.field553[var14 + var17] = var15 / (var11 * 2 + 1);
                }
            }
        }
    }
}
