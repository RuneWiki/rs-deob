import java.awt.Component;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public abstract class class43 {

    @OriginalMember(owner = "client!le", name = "b", descriptor = "Lid;")
    private static class149 field656 = class60.method382("Use", (byte) 11);

    @OriginalMember(owner = "client!le", name = "f", descriptor = "Lid;")
    public static class149 field660 = field656;

    @OriginalMember(owner = "client!le", name = "c", descriptor = "I")
    public static int field657 = 0;

    @OriginalMember(owner = "client!le", name = "i", descriptor = "Lid;")
    public static class149 field663 = class60.method382("<br>", (byte) 33);

    @OriginalMember(owner = "client!le", name = "h", descriptor = "[B")
    public static byte[] field662 = new byte[520];

    @OriginalMember(owner = "client!le", name = "k", descriptor = "Lid;")
    private static class149 field665 = class60.method382("Prepared sound engine", (byte) 127);

    @OriginalMember(owner = "client!le", name = "j", descriptor = "Lid;")
    public static class149 field664 = field665;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "I")
    public static int field655;

    @OriginalMember(owner = "client!le", name = "d", descriptor = "I")
    public static int field658;

    @OriginalMember(owner = "client!le", name = "e", descriptor = "I")
    public static int field659;

    @OriginalMember(owner = "client!le", name = "g", descriptor = "I")
    public static int field661;

    @OriginalMember(owner = "client!le", name = "l", descriptor = "I")
    public static int field666;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(B)I")
    public abstract int method245(byte arg0);

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ILob;)V")
    public static final void method246(int arg0, class131 arg1) {
        field658++;
        if (arg1.field2305 == 0) {
            return;
        }
        int var2 = -75 % ((-arg0 - 75) / 46);
        class264 var3 = arg1.method923((byte) -65);
        if (arg1.field2399 != -1 && arg1.field2399 < 32768) {
            class20 var4 = class38.field572[arg1.field2399];
            if (var4 != null) {
                int var5 = arg1.field2347 - var4.field2347;
                int var6 = arg1.field2340 - var4.field2340;
                if (var5 != 0 || var6 != 0) {
                    arg1.field2335 = (int) (Math.atan2((double) var5, (double) var6) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg1.field2399 >= 32768) {
            int var7 = arg1.field2399 - 32768;
            if (class258.field4514 == var7) {
                var7 = 2047;
            }
            class127 var8 = class107.field1851[var7];
            if (var8 != null) {
                int var9 = arg1.field2340 - var8.field2340;
                int var10 = arg1.field2347 - var8.field2347;
                if (var10 != 0 || var9 != 0) {
                    arg1.field2335 = (int) (Math.atan2((double) var10, (double) var9) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg1.field2392 != 0 || arg1.field2352 != 0) && (arg1.field2327 == 0 || arg1.field2401 > 0)) {
            int var11 = arg1.field2347 - (arg1.field2392 - class125.field2199 - class125.field2199) * 64;
            int var12 = arg1.field2340 - (arg1.field2352 - class115.field1969 - class115.field1969) * 64;
            if (var11 != 0 || var12 != 0) {
                arg1.field2335 = (int) (Math.atan2((double) var11, (double) var12) * 325.949D) & 0x7FF;
            }
            arg1.field2392 = 0;
            arg1.field2352 = 0;
        }
        int var13 = arg1.field2335 - arg1.field2354 & 0x7FF;
        if (var13 == 0) {
            arg1.field2370 = 0;
            arg1.field2398 = 0;
        } else if (var3.field4725 == 0) {
            arg1.field2398++;
            if (var13 <= 1024) {
                arg1.field2354 += arg1.field2305;
                boolean var14 = true;
                if (var13 < arg1.field2305 || var13 > 2048 - arg1.field2305) {
                    arg1.field2354 = arg1.field2335;
                    var14 = false;
                }
                if (arg1.field2334 == var3.field4718 && (arg1.field2398 > 25 || var14)) {
                    if (var3.field4691 == -1) {
                        arg1.field2334 = var3.field4715;
                    } else {
                        arg1.field2334 = var3.field4691;
                    }
                }
            } else {
                arg1.field2354 -= arg1.field2305;
                boolean var15 = true;
                if (arg1.field2305 > var13 || var13 > (2048 - arg1.field2305)) {
                    arg1.field2354 = arg1.field2335;
                    var15 = false;
                }
                if (arg1.field2334 == var3.field4718 && (arg1.field2398 > 25 || var15)) {
                    if (var3.field4731 == -1) {
                        arg1.field2334 = var3.field4715;
                    } else {
                        arg1.field2334 = var3.field4731;
                    }
                }
            }
            arg1.field2354 &= 0x7FF;
        } else {
            if (arg1.field2334 == var3.field4718 && arg1.field2398 > 25) {
                if (var3.field4691 == -1) {
                    arg1.field2334 = var3.field4715;
                } else {
                    arg1.field2334 = var3.field4691;
                }
            }
            int var16 = arg1.field2335 << 5;
            if (arg1.field2364 != var16) {
                arg1.field2321 = 0;
                int var17 = var16 - arg1.field2391 & 0xFFFF;
                arg1.field2364 = var16;
                int var18 = arg1.field2370 * arg1.field2370 / (var3.field4725 * 2);
                if (arg1.field2370 > 0 && var17 >= var18 && var17 - var18 < 32768) {
                    arg1.field2383 = var17 / 2;
                    arg1.field2386 = true;
                    int var19 = var3.field4695 * var3.field4695 / (var3.field4725 * 2);
                    if (var19 > 32767) {
                        var19 = 32767;
                    }
                    if (arg1.field2383 > var19) {
                        arg1.field2383 = var17 - var19;
                    }
                } else if (arg1.field2370 < 0 && (65536 - var17) >= var18 && (65536 - var17 - var18) < 32768) {
                    arg1.field2386 = true;
                    arg1.field2383 = (65536 - var17) / 2;
                    int var20 = var3.field4695 * var3.field4695 / (var3.field4725 * 2);
                    if (var20 > 32767) {
                        var20 = 32767;
                    }
                    if (var20 < arg1.field2383) {
                        arg1.field2383 = 65536 - var17 - var20;
                    }
                } else {
                    arg1.field2386 = false;
                }
            }
            if (arg1.field2370 == 0) {
                int var21 = arg1.field2364 - arg1.field2391 & 0xFFFF;
                if (var21 >= var3.field4725) {
                    arg1.field2321 = 0;
                    int var22 = var3.field4695 * var3.field4695 / (var3.field4725 * 2);
                    arg1.field2386 = true;
                    if (var22 > 32767) {
                        var22 = 32767;
                    }
                    if (var21 >= 32768) {
                        arg1.field2370 = -var3.field4725;
                        arg1.field2383 = (65536 - var21) / 2;
                        if (arg1.field2383 > var22) {
                            arg1.field2383 = 65536 - var21 - var22;
                        }
                    } else {
                        arg1.field2370 = var3.field4725;
                        arg1.field2383 = var21 / 2;
                        if (var22 < arg1.field2383) {
                            arg1.field2383 = var21 - var22;
                        }
                    }
                } else {
                    arg1.field2391 = arg1.field2364;
                }
            } else if (arg1.field2370 <= 0) {
                if (arg1.field2383 <= arg1.field2321) {
                    arg1.field2386 = false;
                }
                if (!arg1.field2386) {
                    arg1.field2370 += var3.field4725;
                    if (arg1.field2370 > 0) {
                        arg1.field2370 = 0;
                    }
                } else if ((-var3.field4695) < arg1.field2370) {
                    arg1.field2370 -= var3.field4725;
                }
            } else {
                if (arg1.field2321 >= arg1.field2383) {
                    arg1.field2386 = false;
                }
                if (!arg1.field2386) {
                    arg1.field2370 -= var3.field4725;
                    if (arg1.field2370 < 0) {
                        arg1.field2370 = 0;
                    }
                } else if (arg1.field2370 < var3.field4695) {
                    arg1.field2370 += var3.field4725;
                }
            }
            arg1.field2391 += arg1.field2370;
            if (arg1.field2370 > 0) {
                arg1.field2321 += arg1.field2370;
            } else {
                arg1.field2321 -= arg1.field2370;
            }
            arg1.field2391 &= 0xFFFF;
            arg1.field2354 = arg1.field2391 >> 5;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V")
    public static final void method247(int arg0) {
        field661++;
        if (class91.field1614 == 0 || class91.field1614 == 5) {
            return;
        }
        try {
            if (++class128.field2256 > 2000) {
                if (class164.field3047 != null) {
                    class164.field3047.method1398((byte) -16);
                    class164.field3047 = null;
                }
                if (class52.field941 >= 1) {
                    class91.field1614 = 0;
                    class140.field2558 = -5;
                    return;
                }
                if (class32.field469 == class184.field3321) {
                    class32.field469 = class169.field3130;
                } else {
                    class32.field469 = class184.field3321;
                }
                class91.field1614 = 1;
                class128.field2256 = 0;
                class52.field941++;
            }
            if (class91.field1614 == 1) {
                class36.field542 = class272.field4900.method174(class32.field469, false, class44.field673);
                class91.field1614 = 2;
            }
            if (class91.field1614 == 2) {
                if (class36.field542.field3358 == 2) {
                    throw new IOException();
                }
                if (class36.field542.field3358 != 1) {
                    return;
                }
                class164.field3047 = new class205((Socket) class36.field542.field3357, class272.field4900);
                class36.field542 = null;
                long var1 = class198.field3594 = class171.field3155.method1023((byte) -16);
                class208.field3720.field1340 = 0;
                class208.field3720.method494((byte) 4, 14);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class208.field3720.method494((byte) 4, var3);
                class164.field3047.method1400(0, class208.field3720.field1321, 2, (byte) 64);
                if (class116.field1991 != null) {
                    class116.field1991.method974(0);
                }
                if (class79.field1476 != null) {
                    class79.field1476.method974(0);
                }
                int var4 = class164.field3047.method1397(arg0 + 45932);
                if (class116.field1991 != null) {
                    class116.field1991.method974(0);
                }
                if (class79.field1476 != null) {
                    class79.field1476.method974(0);
                }
                if (var4 != 0) {
                    class140.field2558 = var4;
                    class91.field1614 = 0;
                    class164.field3047.method1398((byte) -45);
                    class164.field3047 = null;
                    return;
                }
                class91.field1614 = 3;
            }
            if (class91.field1614 == 3) {
                if (class164.field3047.method1392(arg0 ^ 0x6F5A) < 8) {
                    return;
                }
                class164.field3047.method1395((byte) -115, class11.field150.field1321, 0, 8);
                class11.field150.field1340 = 0;
                class152.field2773 = class11.field150.method478(-9426);
                int[] var5 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class152.field2773 >> 32), (int) class152.field2773 };
                class208.field3720.field1340 = 0;
                class208.field3720.method494((byte) 4, 10);
                class208.field3720.method517(var5[0], 118);
                class208.field3720.method517(var5[1], 117);
                class208.field3720.method517(var5[2], 117);
                class208.field3720.method517(var5[3], arg0 ^ 0xFFFF908E);
                class208.field3720.method496(2, class171.field3155.method1023((byte) -16));
                class208.field3720.method523(class171.field3154, (byte) 0);
                class208.field3720.method480(class92.field1631, (byte) 127, class264.field4723);
                class22.field311.field1340 = 0;
                if (class107.field1845 == 40) {
                    class22.field311.method494((byte) 4, 18);
                } else {
                    class22.field311.method494((byte) 4, 16);
                }
                class22.field311.method518(16711680, 159 - (-class208.field3720.field1340 - class286.method1962(18241, class159.field2927)));
                class22.field311.method517(530, 117);
                class22.field311.method494((byte) 4, class14.field208);
                class22.field311.method494((byte) 4, class279.field4987 ? 1 : 0);
                class22.field311.method494((byte) 4, 0);
                class22.field311.method494((byte) 4, class79.method600(113));
                class22.field311.method518(16711680, class218.field3851);
                class22.field311.method518(arg0 ^ 0xFF0090F6, class240.field4197);
                class22.field311.method494((byte) 4, class180.field3242);
                class272.method1890(class22.field311, (byte) -115);
                class22.field311.method523(class159.field2927, (byte) 0);
                class22.field311.method517(class216.field3807, 118);
                class22.field311.method517(class65.method404(109), 121);
                class63.field1134 = true;
                class22.field311.method518(arg0 ^ 0xFF0090F6, class87.field1585);
                class22.field311.method517(class101.field1774.method1548((byte) 118), 122);
                class22.field311.method517(class175.field3211.method1548((byte) 39), arg0 ^ 0xFFFF908C);
                class22.field311.method517(class94.field1653.method1548((byte) 108), 121);
                class22.field311.method517(class133.field2423.method1548((byte) -46), 126);
                class22.field311.method517(class226.field3964.method1548((byte) 111), arg0 ^ 0xFFFF9081);
                class22.field311.method517(class221.field3874.method1548((byte) -67), 126);
                class22.field311.method517(class230.field4010.method1548((byte) 109), 119);
                class22.field311.method517(class269.field4851.method1548((byte) 122), 124);
                class22.field311.method517(class270.field4864.method1548((byte) 119), 120);
                class22.field311.method517(class30.field445.method1548((byte) 22), arg0 ^ 0xFFFF9088);
                class22.field311.method517(class164.field3058.method1548((byte) -103), 123);
                class22.field311.method517(class74.field1294.method1548((byte) 126), arg0 ^ 0xFFFF9089);
                class22.field311.method517(class162.field3003.method1548((byte) 15), 121);
                class22.field311.method517(class158.field2912.method1548((byte) 123), 127);
                class22.field311.method517(class36.field537.method1548((byte) -79), 127);
                class22.field311.method517(class233.field4107.method1548((byte) 0), arg0 ^ 0xFFFF9081);
                class22.field311.method517(class14.field209.method1548((byte) 108), 122);
                class22.field311.method517(class7.field77.method1548((byte) -101), 123);
                class22.field311.method517(class189.field3381.method1548((byte) -34), 125);
                class22.field311.method517(class40.field623.method1548((byte) 110), arg0 + 28543);
                class22.field311.method517(class287.field5093.method1548((byte) -32), 121);
                class22.field311.method517(class254.field4443.method1548((byte) -108), 125);
                class22.field311.method517(class245.field4309.method1548((byte) -74), 120);
                class22.field311.method517(class169.field3133.method1548((byte) 112), arg0 ^ 0xFFFF9083);
                class22.field311.method517(class45.field689.method1548((byte) 110), 126);
                class22.field311.method517(class1.field5.method1548((byte) 114), 125);
                class22.field311.method517(class193.field3461.method1548((byte) 1), 120);
                class22.field311.method517(class206.field3697.method1548((byte) 120), 120);
                class22.field311.method490(113, class208.field3720.field1321, class208.field3720.field1340, 0);
                class164.field3047.method1400(0, class22.field311.field1321, class22.field311.field1340, (byte) 111);
                class208.field3720.method158(var5, arg0 + 28419);
                for (int var6 = 0; var6 < 4; var6++) {
                    var5[var6] += 50;
                }
                class11.field150.method158(var5, arg0 + 28391);
                class91.field1614 = 4;
            }
            if (class91.field1614 == 4) {
                if (class164.field3047.method1392(-60) < 1) {
                    return;
                }
                int var7 = class164.field3047.method1397(17506);
                if (var7 == 21) {
                    class91.field1614 = 7;
                } else if (var7 == 29) {
                    class91.field1614 = 10;
                } else if (var7 == 1) {
                    class91.field1614 = 5;
                    class140.field2558 = var7;
                    return;
                } else if (var7 == 2) {
                    class91.field1614 = 8;
                } else if (var7 == 15) {
                    class91.field1614 = 0;
                    class140.field2558 = var7;
                    return;
                } else if (var7 == 23 && class52.field941 < 1) {
                    class52.field941++;
                    class128.field2256 = 0;
                    class91.field1614 = 1;
                    class164.field3047.method1398((byte) 119);
                    class164.field3047 = null;
                    return;
                } else {
                    class140.field2558 = var7;
                    class91.field1614 = 0;
                    class164.field3047.method1398((byte) 118);
                    class164.field3047 = null;
                    return;
                }
            }
            if (arg0 != -28426) {
                field665 = null;
            }
            if (class91.field1614 == 6) {
                class208.field3720.field1340 = 0;
                class208.field3720.method162(2, 17);
                class164.field3047.method1400(0, class208.field3720.field1321, class208.field3720.field1340, (byte) 80);
                class91.field1614 = 4;
            } else if (class91.field1614 == 7) {
                if (class164.field3047.method1392(125) >= 1) {
                    class162.field3012 = class164.field3047.method1397(17506) * 60 + 180;
                    class91.field1614 = 0;
                    class140.field2558 = 21;
                    class164.field3047.method1398((byte) -67);
                    class164.field3047 = null;
                }
            } else if (class91.field1614 != 10) {
                if (class91.field1614 == 8) {
                    if (class164.field3047.method1392(-91) < 14) {
                        return;
                    }
                    class164.field3047.method1395((byte) -115, class11.field150.field1321, 0, 14);
                    class11.field150.field1340 = 0;
                    class258.field4519 = class11.field150.method489((byte) -90);
                    class181.field3258 = class11.field150.method489((byte) -51);
                    class79.field1472 = class11.field150.method489((byte) 91) == 1;
                    class236.field4137 = class11.field150.method489((byte) -61) == 1;
                    class47.field826 = class11.field150.method489((byte) -6) == 1;
                    class129.field2292 = class11.field150.method489((byte) -85) == 1;
                    class272.field4895 = class11.field150.method489((byte) -69) == 1;
                    class258.field4514 = class11.field150.method485(arg0 + 26040);
                    class185.field3334 = class11.field150.method489((byte) 111) == 1;
                    class256.field4470 = class11.field150.method489((byte) -112) == 1;
                    class149.method1044(class256.field4470, 0);
                    class147.method1011((byte) -112, class256.field4470);
                    if (!class279.field4987) {
                        if ((!class79.field1472 || class47.field826) && !class185.field3334) {
                            try {
                                class240.field4186.method1027(class272.field4900.field436, (byte) -119);
                            } catch (Throwable var9) {
                            }
                        } else {
                            try {
                                class124.field2191.method1027(class272.field4900.field436, (byte) -90);
                            } catch (Throwable var8) {
                            }
                        }
                    }
                    class246.field4327 = class11.field150.method156(-23542);
                    class68.field1188 = class11.field150.method485(-2386);
                    class91.field1614 = 9;
                }
                if (class91.field1614 == 9 && class164.field3047.method1392(-94) >= class68.field1188) {
                    class11.field150.field1340 = 0;
                    class164.field3047.method1395((byte) -115, class11.field150.field1321, 0, class68.field1188);
                    class140.field2558 = 2;
                    class91.field1614 = 0;
                    class272.method1887(0);
                    class141.field2600 = -1;
                    class135.method945(true, false);
                    class246.field4327 = -1;
                }
            } else if (class164.field3047.method1392(-21) >= 1) {
                class261.field4634 = class164.field3047.method1397(17506);
                class140.field2558 = 29;
                class91.field1614 = 0;
                class164.field3047.method1398((byte) -98);
                class164.field3047 = null;
            }
        } catch (IOException var10) {
            if (class164.field3047 != null) {
                class164.field3047.method1398((byte) 123);
                class164.field3047 = null;
            }
            if (class52.field941 >= 1) {
                class140.field2558 = -4;
                class91.field1614 = 0;
            } else {
                if (class32.field469 == class184.field3321) {
                    class32.field469 = class169.field3130;
                } else {
                    class32.field469 = class184.field3321;
                }
                class128.field2256 = 0;
                class91.field1614 = 1;
                class52.field941++;
            }
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ZLjava/awt/Component;)V")
    public abstract void method248(boolean arg0, Component arg1);

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(I)V")
    public static void method249(int arg0) {
        if (arg0 != -32768) {
            field663 = null;
        }
        field664 = null;
        field662 = null;
        field663 = null;
        field660 = null;
        field656 = null;
        field665 = null;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(BI)V")
    public static final void method250(byte arg0, int arg1) {
        class102.field1795.method1289(arg1, 73);
        if (arg0 == -41) {
            field655++;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public abstract void method251(byte arg0, Component arg1);

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIIIIII)Z")
    public static final boolean method252(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(III)Lnf;")
    public static final class158 method253(int arg0, int arg1, int arg2) {
        class231 var3 = class261.field4664[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class158 var4 = var3.field4056;
            var3.field4056 = null;
            return var4;
        }
    }
}
