import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class144 {

    @OriginalMember(owner = "client!q", name = "a", descriptor = "B")
    private byte field2787;

    @OriginalMember(owner = "client!q", name = "o", descriptor = "I")
    public int field2801;

    @OriginalMember(owner = "client!q", name = "u", descriptor = "I")
    public int field2807;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "I")
    public int field2788;

    @OriginalMember(owner = "client!q", name = "c", descriptor = "I")
    public int field2789;

    @OriginalMember(owner = "client!q", name = "k", descriptor = "I")
    public int field2797;

    @OriginalMember(owner = "client!q", name = "i", descriptor = "Lsd;")
    public static class166 field2795 = class135.method935("<col=00ff80>", 0);

    @OriginalMember(owner = "client!q", name = "l", descriptor = "Lsd;")
    public static class166 field2798 = class135.method935("::fpsoff", 0);

    @OriginalMember(owner = "client!q", name = "g", descriptor = "Lsd;")
    public static class166 field2793 = class135.method935("Lade Benutzeroberfl-=che )2 ", 0);

    @OriginalMember(owner = "client!q", name = "n", descriptor = "Lsd;")
    public static class166 field2800 = class135.method935(" loggt sich aus)3", 0);

    @OriginalMember(owner = "client!q", name = "s", descriptor = "Lsd;")
    public static class166 field2805 = class135.method935("Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3", 0);

    @OriginalMember(owner = "client!q", name = "q", descriptor = "I")
    public static int field2803 = -1;

    @OriginalMember(owner = "client!q", name = "e", descriptor = "[Llb;")
    public static class101[] field2791 = new class101[4];

    @OriginalMember(owner = "client!q", name = "t", descriptor = "Lsd;")
    public static class166 field2806 = class135.method935("(U0a )2 in: ", 0);

    @OriginalMember(owner = "client!q", name = "d", descriptor = "I")
    public static int field2790;

    @OriginalMember(owner = "client!q", name = "f", descriptor = "I")
    public static int field2792;

    @OriginalMember(owner = "client!q", name = "h", descriptor = "I")
    public static int field2794;

    @OriginalMember(owner = "client!q", name = "j", descriptor = "I")
    public static int field2796;

    @OriginalMember(owner = "client!q", name = "m", descriptor = "I")
    public static int field2799;

    @OriginalMember(owner = "client!q", name = "p", descriptor = "I")
    public static int field2802;

    @OriginalMember(owner = "client!q", name = "r", descriptor = "I")
    public static int field2804;

    @OriginalMember(owner = "client!q", name = "v", descriptor = "I")
    public static int field2808;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I)I")
    public final int method983(int arg0) {
        field2808++;
        if (arg0 != 240) {
            method984(null, 24, 63);
        }
        return this.field2787 & 0x7;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Lud;II)V")
    public static final void method984(class184 arg0, int arg1, int arg2) {
        field2799++;
        class16.method88(arg0.field3513, -11931, arg1, arg0.field3526);
        int var3 = 21 % ((arg2 + 15) / 39);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIZLsd;I)V")
    public static final void method985(int arg0, int arg1, boolean arg2, class166 arg3, int arg4) {
        field2794++;
        class193 var5 = class121.method875(arg1, arg4, 114);
        if (var5 == null) {
            return;
        }
        if (var5.field3707 != null) {
            class137 var6 = new class137();
            var6.field2668 = var5.field3707;
            var6.field2664 = arg3;
            var6.field2673 = var5;
            var6.field2665 = arg0;
            class166.method1126((byte) -113, var6);
        }
        boolean var7 = true;
        if (var5.field3823 > 0) {
            var7 = class135.method934(-300, var5);
        }
        if (!var7 || !class69.method561(arg0 - 1, arg2, class140.method955(-86, var5))) {
            return;
        }
        if (arg0 == 1) {
            class156.field2989.method705(180, (byte) 9);
            class130.field2544++;
            class156.field2989.method438(423055928, arg4);
            class156.field2989.method407((byte) -122, arg1);
        }
        if (arg0 == 2) {
            class195.field3869++;
            class156.field2989.method705(45, (byte) 9);
            class156.field2989.method438(423055928, arg4);
            class156.field2989.method407((byte) -121, arg1);
        }
        if (arg0 == 3) {
            class156.field2989.method705(166, (byte) 9);
            class156.field2989.method438(423055928, arg4);
            class156.field2989.method407((byte) -125, arg1);
            class139.field2711++;
        }
        if (arg0 == 4) {
            class84.field1685++;
            class156.field2989.method705(157, (byte) 9);
            class156.field2989.method438(423055928, arg4);
            class156.field2989.method407((byte) -119, arg1);
        }
        if (arg0 == 5) {
            class156.field2989.method705(3, (byte) 9);
            class156.field2989.method438(423055928, arg4);
            class156.field2989.method407((byte) -128, arg1);
            class135.field2628++;
        }
        if (arg0 == 6) {
            field2804++;
            class156.field2989.method705(29, (byte) 9);
            class156.field2989.method438(423055928, arg4);
            class156.field2989.method407((byte) -126, arg1);
        }
        if (arg0 == 7) {
            class156.field2989.method705(135, (byte) 9);
            class132.field2569++;
            class156.field2989.method438(423055928, arg4);
            class156.field2989.method407((byte) -119, arg1);
        }
        if (arg0 == 8) {
            class156.field2989.method705(130, (byte) 9);
            class156.field2989.method438(423055928, arg4);
            class179.field3376++;
            class156.field2989.method407((byte) -123, arg1);
        }
        if (arg0 == 9) {
            class156.field2989.method705(60, (byte) 9);
            class69.field1404++;
            class156.field2989.method438(423055928, arg4);
            class156.field2989.method407((byte) -126, arg1);
        }
        if (arg0 == 10) {
            class156.field2989.method705(143, (byte) 9);
            class8.field153++;
            class156.field2989.method438(423055928, arg4);
            class156.field2989.method407((byte) -120, arg1);
        }
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(I)V")
    public static void method986(int arg0) {
        field2791 = null;
        field2795 = null;
        field2806 = null;
        field2805 = null;
        field2800 = null;
        field2793 = null;
        if (arg0 != 128) {
            method984(null, 49, 1);
        }
        field2798 = null;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(BII[I)I")
    public static final int method987(byte arg0, int arg1, int arg2, int[] arg3) {
        field2802++;
        if (arg0 != -106) {
            method986(39);
        }
        return arg3[0] * arg2 + arg3[1] * arg1;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "([Lpf;Li;B)V")
    public static final void method988(class141[] arg0, class73 arg1, byte arg2) {
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var111 = 0; var111 < 104; var111++) {
                for (int var112 = 0; var112 < 104; var112++) {
                    if ((class122.field2387[var3][var111][var112] & 0x1) == 1) {
                        int var113 = var3;
                        if ((class122.field2387[1][var111][var112] & 0x2) == 2) {
                            var113 = var3 - 1;
                        }
                        if (var113 >= 0) {
                            arg0[var113].method973(var112, (byte) 79, var111);
                        }
                    }
                }
            }
        }
        field2792++;
        class160.field3071 += (int) (Math.random() * 5.0D) - 2;
        if (class160.field3071 < -16) {
            class160.field3071 = -16;
        }
        if (class160.field3071 > 16) {
            class160.field3071 = 16;
        }
        class169.field3236 += (int) (Math.random() * 5.0D) - 2;
        if (class169.field3236 < -8) {
            class169.field3236 = -8;
        }
        if (class169.field3236 > 8) {
            class169.field3236 = 8;
        }
        for (int var4 = 0; var4 < 4; var4++) {
            byte[][] var47 = class74.field1538[var4];
            int var48 = (int) Math.sqrt(5100.0D);
            int var49 = var48 * 768 >> 8;
            for (int var50 = 1; var50 < 103; var50++) {
                for (int var101 = 1; var101 < 103; var101++) {
                    byte var102 = 96;
                    int var103 = class74.field1511[var4][var101 + 1][var50] - class74.field1511[var4][var101 - 1][var50];
                    int var104 = class74.field1511[var4][var101][var50 + 1] - class74.field1511[var4][var101][var50 - 1];
                    int var105 = (int) Math.sqrt((double) (var103 * var103 + var104 * var104 + 65536));
                    int var106 = (var103 << 8) / var105;
                    int var107 = 65536 / var105;
                    int var108 = (var104 << 8) / var105;
                    int var109 = (var107 * -10 + var106 * -50 + var108 * -50) / var49 + var102;
                    int var110 = (var47[var101 - 1][var50] >> 2) + (var47[var101][var50] >> 1) + (var47[var101][var50 + -1] >> 2) + (var47[var101][var50 + 1] >> 3) + (var47[var101 + 1][var50] >> 3);
                    class156.field2991[var101][var50] = var109 - var110;
                }
            }
            for (int var51 = 0; var51 < 104; var51++) {
                class138.field2685[var51] = 0;
                class108.field2099[var51] = 0;
                class206.field4055[var51] = 0;
                class25.field452[var51] = 0;
                class110.field2123[var51] = 0;
            }
            for (int var52 = -5; var52 < 109; var52++) {
                for (int var55 = 0; var55 < 104; var55++) {
                    int var95 = var52 + 5;
                    int var10002;
                    if (var95 >= 0 && var95 < 104) {
                        int var96 = class102.field1981[var4][var95][var55] & 0xFF;
                        if (var96 > 0) {
                            class5 var97 = class88.method699((byte) -61, var96 - 1);
                            class138.field2685[var55] += var97.field91;
                            class108.field2099[var55] += var97.field99;
                            class206.field4055[var55] += var97.field102;
                            class25.field452[var55] += var97.field90;
                            var10002 = class110.field2123[var55]++;
                        }
                    }
                    int var98 = var52 - 5;
                    if (var98 >= 0 && var98 < 104) {
                        int var99 = class102.field1981[var4][var98][var55] & 0xFF;
                        if (var99 > 0) {
                            class5 var100 = class88.method699((byte) -61, var99 - 1);
                            class138.field2685[var55] -= var100.field91;
                            class108.field2099[var55] -= var100.field99;
                            class206.field4055[var55] -= var100.field102;
                            class25.field452[var55] -= var100.field90;
                            var10002 = class110.field2123[var55]--;
                        }
                    }
                }
                if (var52 >= 1 && var52 < 103) {
                    int var56 = 0;
                    int var57 = 0;
                    int var58 = 0;
                    int var59 = 0;
                    int var60 = 0;
                    for (int var61 = -5; var61 < 109; var61++) {
                        int var62 = var61 + 5;
                        if (var62 >= 0 && var62 < 104) {
                            var56 += class138.field2685[var62];
                            var60 += class110.field2123[var62];
                            var57 += class108.field2099[var62];
                            var58 += class25.field452[var62];
                            var59 += class206.field4055[var62];
                        }
                        int var63 = var61 - 5;
                        if (var63 >= 0 && var63 < 104) {
                            var58 -= class25.field452[var63];
                            var60 -= class110.field2123[var63];
                            var59 -= class206.field4055[var63];
                            var57 -= class108.field2099[var63];
                            var56 -= class138.field2685[var63];
                        }
                        if (var61 >= 1 && var61 < 103 && (!class97.field1858 || (class122.field2387[0][var52][var61] & 0x2) != 0 || (class122.field2387[var4][var52][var61] & 0x10) == 0 && class113.method827(var61, -63, var52, var4) == class37.field682)) {
                            if (class120.field2351 > var4) {
                                class120.field2351 = var4;
                            }
                            int var64 = class102.field1981[var4][var52][var61] & 0xFF;
                            int var65 = class190.field3620[var4][var52][var61] & 0xFF;
                            if (var64 > 0 || var65 > 0) {
                                int var66 = class74.field1511[var4][var52][var61];
                                int var67 = class74.field1511[var4][var52 + 1][var61];
                                int var68 = class74.field1511[var4][var52 + 1][var61 + 1];
                                int var69 = class156.field2991[var52 + 1][var61];
                                int var70 = class74.field1511[var4][var52][var61 + 1];
                                int var71 = class156.field2991[var52][var61];
                                int var72 = class156.field2991[var52 + 1][var61 + 1];
                                int var73 = class156.field2991[var52][var61 + 1];
                                int var74 = -1;
                                int var75 = -1;
                                if (var64 > 0) {
                                    int var76 = var56 * 256 / var58;
                                    int var77 = var57 / var60;
                                    int var78 = var59 / var60;
                                    var74 = class172.method1190(var77, var76, var78, (byte) 117);
                                    int var79 = class160.field3071 + var78;
                                    if (var79 < 0) {
                                        var79 = 0;
                                    } else if (var79 > 255) {
                                        var79 = 255;
                                    }
                                    int var80 = var76 + class169.field3236 & 0xFF;
                                    var75 = class172.method1190(var77, var80, var79, (byte) 119);
                                }
                                if (var4 > 0) {
                                    boolean var81 = true;
                                    if (var64 == 0 && class187.field3572[var4][var52][var61] != 0) {
                                        var81 = false;
                                    }
                                    if (var65 > 0 && !class112.method822(var65 - 1, 26072).field36) {
                                        var81 = false;
                                    }
                                    if (var81 && var66 == var67 && var66 == var68 && var66 == var70) {
                                        class5.field98[var4][var52][var61] = class6.method42(class5.field98[var4][var52][var61], 2340);
                                    }
                                }
                                int var82 = 0;
                                if (var75 != -1) {
                                    var82 = class40.field713[class10.method62(-28756, 96, var75)];
                                }
                                if (var65 == 0) {
                                    arg1.method593(var4, var52, var61, 0, 0, -1, var66, var67, var68, var70, class10.method62(-28756, var71, var74), class10.method62(-28756, var69, var74), class10.method62(-28756, var72, var74), class10.method62(-28756, var73, var74), 0, 0, 0, 0, var82, 0);
                                } else {
                                    int var83 = class187.field3572[var4][var52][var61] + 1;
                                    byte var84 = class150.field2917[var4][var52][var61];
                                    class3 var85 = class112.method822(var65 - 1, 26072);
                                    int var86 = var85.field39;
                                    if (var86 >= 0 && !class40.field721.method813((byte) 115, var86)) {
                                        var86 = -1;
                                    }
                                    int var87;
                                    int var88;
                                    if (var86 >= 0) {
                                        var88 = -1;
                                        var87 = class40.field721.method819(var86, -26173);
                                    } else if (var85.field31 == 16711935) {
                                        var87 = -2;
                                        var86 = -1;
                                        var88 = -2;
                                    } else {
                                        var88 = class172.method1190(var85.field30, var85.field44, var85.field38, (byte) 124);
                                        int var89 = class169.field3236 + var85.field44 & 0xFF;
                                        int var90 = class160.field3071 + var85.field38;
                                        if (var90 < 0) {
                                            var90 = 0;
                                        } else if (var90 > 255) {
                                            var90 = 255;
                                        }
                                        var87 = class172.method1190(var85.field30, var89, var90, (byte) 117);
                                    }
                                    int var91 = 0;
                                    if (var87 != -2) {
                                        var91 = class40.field713[class204.method1339(var87, 2, 96)];
                                    }
                                    if (var85.field50 != -1) {
                                        int var92 = var85.field40 + class169.field3236 & 0xFF;
                                        int var93 = class160.field3071 + var85.field43;
                                        if (var93 < 0) {
                                            var93 = 0;
                                        } else if (var93 > 255) {
                                            var93 = 255;
                                        }
                                        int var94 = class172.method1190(var85.field32, var92, var93, (byte) 116);
                                        var91 = class40.field713[class204.method1339(var94, arg2 ^ 0xFFFFFFD5, 96)];
                                    }
                                    arg1.method593(var4, var52, var61, var83, var84, var86, var66, var67, var68, var70, class10.method62(-28756, var71, var74), class10.method62(arg2 ^ 0x707B, var69, var74), class10.method62(-28756, var72, var74), class10.method62(arg2 ^ 0x707B, var73, var74), class204.method1339(var88, arg2 + 43, var71), class204.method1339(var88, 2, var69), class204.method1339(var88, 2, var72), class204.method1339(var88, 2, var73), var82, var91);
                                }
                            }
                        }
                    }
                }
            }
            for (int var53 = 1; var53 < 103; var53++) {
                for (int var54 = 1; var54 < 103; var54++) {
                    arg1.method613(var4, var54, var53, class113.method827(var53, arg2 + 163, var54, var4));
                }
            }
            class102.field1981[var4] = null;
            class190.field3620[var4] = null;
            class187.field3572[var4] = null;
            class150.field2917[var4] = null;
            class74.field1538[var4] = null;
        }
        arg1.method588(-50, -10, -50);
        if (arg2 != -41) {
            return;
        }
        for (int var5 = 0; var5 < 104; var5++) {
            for (int var46 = 0; var46 < 104; var46++) {
                if ((class122.field2387[1][var5][var46] & 0x2) == 2) {
                    arg1.method609(var5, var46);
                }
            }
        }
        int var6 = 2;
        int var7 = 1;
        int var8 = 4;
        for (int var9 = 0; var9 < 4; var9++) {
            if (var9 > 0) {
                var7 <<= 0x3;
                var6 <<= 0x3;
                var8 <<= 0x3;
            }
            for (int var10 = 0; var10 <= var9; var10++) {
                for (int var11 = 0; var11 <= 104; var11++) {
                    for (int var12 = 0; var12 <= 104; var12++) {
                        if ((var7 & class5.field98[var10][var12][var11]) != 0) {
                            int var13 = var11;
                            int var14 = var10;
                            int var15 = var11;
                            while (var13 > 0 && (var7 & class5.field98[var10][var12][var13 - 1]) != 0) {
                                var13--;
                            }
                            while (var15 < 104 && (class5.field98[var10][var12][var15 + 1] & var7) != 0) {
                                var15++;
                            }
                            label362: while (var14 > 0) {
                                for (int var16 = var13; var16 <= var15; var16++) {
                                    if ((var7 & class5.field98[var14 - 1][var12][var16]) == 0) {
                                        break label362;
                                    }
                                }
                                var14--;
                            }
                            int var17;
                            label350: for (var17 = var10; var17 < var9; var17++) {
                                for (int var18 = var13; var18 <= var15; var18++) {
                                    if ((var7 & class5.field98[var17 + 1][var12][var18]) == 0) {
                                        break label350;
                                    }
                                }
                            }
                            int var19 = (var15 + 1 - var13) * (-var14 + var17 + 1);
                            if (var19 >= 8) {
                                short var20 = 240;
                                int var21 = class74.field1511[var17][var12][var13] - var20;
                                int var22 = class74.field1511[var14][var12][var13];
                                class73.method621(var9, 1, var12 * 128, var12 * 128, var13 * 128, var15 * 128 + 128, var21, var22);
                                for (int var23 = var14; var23 <= var17; var23++) {
                                    for (int var24 = var13; var24 <= var15; var24++) {
                                        class5.field98[var23][var12][var24] = class22.method151(class5.field98[var23][var12][var24], ~var7);
                                    }
                                }
                            }
                        }
                        if ((class5.field98[var10][var12][var11] & var6) != 0) {
                            int var25;
                            for (var25 = var12; var25 > 0 && (var6 & class5.field98[var10][var25 - 1][var11]) != 0; var25--) {
                            }
                            int var26 = var10;
                            int var27;
                            for (var27 = var12; var27 < 104 && (var6 & class5.field98[var10][var27 + 1][var11]) != 0; var27++) {
                            }
                            int var28 = var10;
                            label415: while (var26 > 0) {
                                for (int var29 = var25; var29 <= var27; var29++) {
                                    if ((class5.field98[var26 - 1][var29][var11] & var6) == 0) {
                                        break label415;
                                    }
                                }
                                var26--;
                            }
                            label404: while (var9 > var28) {
                                for (int var30 = var25; var30 <= var27; var30++) {
                                    if ((class5.field98[var28 + 1][var30][var11] & var6) == 0) {
                                        break label404;
                                    }
                                }
                                var28++;
                            }
                            int var31 = (var28 + 1 - var26) * (-var25 + 1 + var27);
                            if (var31 >= 8) {
                                short var32 = 240;
                                int var33 = class74.field1511[var28][var25][var11] - var32;
                                int var34 = class74.field1511[var26][var25][var11];
                                class73.method621(var9, 2, var25 * 128, var27 * 128 + 128, var11 * 128, var11 * 128, var33, var34);
                                for (int var35 = var26; var35 <= var28; var35++) {
                                    for (int var36 = var25; var36 <= var27; var36++) {
                                        class5.field98[var35][var36][var11] = class22.method151(class5.field98[var35][var36][var11], ~var6);
                                    }
                                }
                            }
                        }
                        if ((class5.field98[var10][var12][var11] & var8) != 0) {
                            int var37 = var12;
                            int var38 = var12;
                            int var39 = var11;
                            int var40;
                            for (var40 = var11; var40 < 104 && (class5.field98[var10][var12][var40 + 1] & var8) != 0; var40++) {
                            }
                            while (var39 > 0 && (var8 & class5.field98[var10][var12][var39 - 1]) != 0) {
                                var39--;
                            }
                            label470: while (var37 > 0) {
                                for (int var41 = var39; var41 <= var40; var41++) {
                                    if ((class5.field98[var10][var37 - 1][var41] & var8) == 0) {
                                        break label470;
                                    }
                                }
                                var37--;
                            }
                            label459: while (var38 < 104) {
                                for (int var42 = var39; var42 <= var40; var42++) {
                                    if ((class5.field98[var10][var38 + 1][var42] & var8) == 0) {
                                        break label459;
                                    }
                                }
                                var38++;
                            }
                            if ((var40 + 1 - var39) * (var38 + 1 + -var37) >= 4) {
                                int var43 = class74.field1511[var10][var37][var39];
                                class73.method621(var9, 4, var37 * 128, var38 * 128 + 128, var39 * 128, var40 * 128 + 128, var43, var43);
                                for (int var44 = var37; var44 <= var38; var44++) {
                                    for (int var45 = var39; var45 <= var40; var45++) {
                                        class5.field98[var10][var44][var45] = class22.method151(class5.field98[var10][var44][var45], ~var8);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!q", name = "c", descriptor = "(I)I")
    public final int method989(int arg0) {
        if (arg0 == 5) {
            field2790++;
            return (this.field2787 & 0x8) == 8 ? 1 : 0;
        } else {
            return 14;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method990(int arg0, Component arg1) {
        field2796++;
        arg1.removeMouseListener(class129.field2532);
        arg1.removeMouseMotionListener(class129.field2532);
        arg1.removeFocusListener(class129.field2532);
        class103.field2020 = arg0;
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "()V")
    public class144() {
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "(Lff;)V")
    public class144(class53 arg0) {
        this.field2787 = arg0.method388(-29381);
        this.field2801 = arg0.method405(2);
        this.field2807 = arg0.method419(-4);
        this.field2788 = arg0.method419(-4);
        this.field2789 = arg0.method419(-4);
        this.field2797 = arg0.method419(-4);
    }
}
