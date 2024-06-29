import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public abstract class class18 {

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "Lpe;")
    public static class109 field441 = class141.method1120("Lade Konfiguration )2 ", 0);

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "[Z")
    public static boolean[] field446 = new boolean[5];

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "Lpe;")
    private static class109 field439 = class141.method1120("wishes to duel with you)3", 0);

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "Lpe;")
    public static class109 field444 = field439;

    @OriginalMember(owner = "client!cc", name = "r", descriptor = "Lpe;")
    public static class109 field455 = class141.method1120("W-=hlen Sie eine Option", 0);

    @OriginalMember(owner = "client!cc", name = "k", descriptor = "Lcd;")
    public static class19 field448 = new class19();

    @OriginalMember(owner = "client!cc", name = "t", descriptor = "Lpe;")
    public static class109 field457 = class141.method1120("gelb:", 0);

    @OriginalMember(owner = "client!cc", name = "u", descriptor = "I")
    public static int field458 = 0;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "I")
    public static int field438;

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
    public static int field440;

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "I")
    public static int field442;

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "I")
    public int field445;

    @OriginalMember(owner = "client!cc", name = "j", descriptor = "I")
    public static int field447;

    @OriginalMember(owner = "client!cc", name = "n", descriptor = "I")
    public int field451;

    @OriginalMember(owner = "client!cc", name = "q", descriptor = "I")
    public static int field454;

    @OriginalMember(owner = "client!cc", name = "p", descriptor = "Lre;")
    public static class123 field453;

    @OriginalMember(owner = "client!cc", name = "s", descriptor = "Lre;")
    public static class123 field456;

    @OriginalMember(owner = "client!cc", name = "m", descriptor = "Lna;")
    public static class91 field450;

    @OriginalMember(owner = "client!cc", name = "l", descriptor = "Ljava/awt/Image;")
    public Image field449;

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "[I")
    public int[] field443;

    @OriginalMember(owner = "client!cc", name = "o", descriptor = "[Le;")
    public static class29[] field452;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I[Lla;Lle;)V")
    public static final void method183(int arg0, class77[] arg1, class81 arg2) {
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var110 = 0; var110 < 104; var110++) {
                for (int var111 = 0; var111 < 104; var111++) {
                    if ((class107.field2249[var3][var110][var111] & 0x1) == 1) {
                        int var112 = var3;
                        if ((class107.field2249[1][var110][var111] & 0x2) == 2) {
                            var112 = var3 - 1;
                        }
                        if (var112 >= 0) {
                            arg1[var112].method616(15113, var110, var111);
                        }
                    }
                }
            }
        }
        class24.field575 += (int) (Math.random() * 5.0D) - 2;
        field447++;
        if (arg0 != -27932) {
            return;
        }
        class153.field3371 += (int) (Math.random() * 5.0D) - 2;
        if (class153.field3371 < -16) {
            class153.field3371 = -16;
        }
        if (class24.field575 < -8) {
            class24.field575 = -8;
        }
        if (class153.field3371 > 16) {
            class153.field3371 = 16;
        }
        if (class24.field575 > 8) {
            class24.field575 = 8;
        }
        for (int var4 = 0; var4 < 4; var4++) {
            byte[][] var47 = class126.field2796[var4];
            int var48 = (int) Math.sqrt(5100.0D);
            int var49 = var48 * 768 >> 8;
            for (int var50 = 1; var50 < 103; var50++) {
                for (int var101 = 1; var101 < 103; var101++) {
                    int var102 = class83.field1775[var4][var101][var50 + 1] - class83.field1775[var4][var101][var50 - 1];
                    int var103 = class83.field1775[var4][var101 + 1][var50] - class83.field1775[var4][var101 - 1][var50];
                    int var104 = (int) Math.sqrt((double) (var103 * var103 + var102 * var102 + 65536));
                    int var105 = (var102 << 8) / var104;
                    int var106 = 65536 / var104;
                    int var107 = (var103 << 8) / var104;
                    int var108 = (var107 * -50 + var105 * -50 + var106 * -10) / var49 + 96;
                    int var109 = (var47[var101 - 1][var50] >> 2) + (var47[var101][var50 - 1] >> 2) + (var47[var101][var50] >> 1) - (-(var47[var101][var50 + 1] >> 3) - (var47[var101 + 1][var50] >> 3));
                    class131.field2883[var101][var50] = var108 - var109;
                }
            }
            for (int var51 = 0; var51 < 104; var51++) {
                class12.field273[var51] = 0;
                class101.field2108[var51] = 0;
                class89.field1885[var51] = 0;
                class14.field377[var51] = 0;
                class112.field2400[var51] = 0;
            }
            for (int var52 = -5; var52 < 109; var52++) {
                for (int var55 = 0; var55 < 104; var55++) {
                    int var95 = var52 + 5;
                    int var10002;
                    if (var95 >= 0 && var95 < 104) {
                        int var96 = class135.field2939[var4][var95][var55] & 0xFF;
                        if (var96 > 0) {
                            class23 var97 = class134.method1069(var96 - 1, (byte) 79);
                            class12.field273[var55] += var97.field549;
                            class101.field2108[var55] += var97.field553;
                            class89.field1885[var55] += var97.field556;
                            class14.field377[var55] += var97.field542;
                            var10002 = class112.field2400[var55]++;
                        }
                    }
                    int var98 = var52 - 5;
                    if (var98 >= 0 && var98 < 104) {
                        int var99 = class135.field2939[var4][var98][var55] & 0xFF;
                        if (var99 > 0) {
                            class23 var100 = class134.method1069(var99 - 1, (byte) 79);
                            class12.field273[var55] -= var100.field549;
                            class101.field2108[var55] -= var100.field553;
                            class89.field1885[var55] -= var100.field556;
                            class14.field377[var55] -= var100.field542;
                            var10002 = class112.field2400[var55]--;
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
                        int var62 = var61 - 5;
                        int var63 = var61 + 5;
                        if (var63 >= 0 && var63 < 104) {
                            var59 += class112.field2400[var63];
                            var60 += class14.field377[var63];
                            var57 += class101.field2108[var63];
                            var58 += class89.field1885[var63];
                            var56 += class12.field273[var63];
                        }
                        if (var62 >= 0 && var62 < 104) {
                            var58 -= class89.field1885[var62];
                            var56 -= class12.field273[var62];
                            var60 -= class14.field377[var62];
                            var57 -= class101.field2108[var62];
                            var59 -= class112.field2400[var62];
                        }
                        if (var61 >= 1 && var61 < 103 && (!class62.field1269 || (class107.field2249[0][var52][var61] & 0x2) != 0 || (class107.field2249[var4][var52][var61] & 0x10) == 0 && class11.method99(var61, 85, var52, var4) == class46.field970)) {
                            if (class16.field407 > var4) {
                                class16.field407 = var4;
                            }
                            int var64 = class82.field1765[var4][var52][var61] & 0xFF;
                            int var65 = class135.field2939[var4][var52][var61] & 0xFF;
                            if (var65 > 0 || var64 > 0) {
                                int var66 = class83.field1775[var4][var52][var61];
                                int var67 = class83.field1775[var4][var52 + 1][var61];
                                int var68 = class83.field1775[var4][var52][var61 + 1];
                                int var69 = class83.field1775[var4][var52 + 1][var61 + 1];
                                int var70 = class131.field2883[var52][var61];
                                int var71 = class131.field2883[var52 + 1][var61];
                                int var72 = class131.field2883[var52 + 1][var61 + 1];
                                int var73 = class131.field2883[var52][var61 + 1];
                                int var74 = -1;
                                int var75 = -1;
                                if (var65 > 0) {
                                    int var76 = var57 / var59;
                                    int var77 = var56 * 256 / var60;
                                    int var78 = var58 / var59;
                                    var75 = class55.method437(var78, arg0 + 27934, var77, var76);
                                    int var79 = class153.field3371 + var78;
                                    if (var79 < 0) {
                                        var79 = 0;
                                    } else if (var79 > 255) {
                                        var79 = 255;
                                    }
                                    int var80 = class24.field575 + var77 & 0xFF;
                                    var74 = class55.method437(var79, 2, var80, var76);
                                }
                                if (var4 > 0) {
                                    boolean var81 = true;
                                    if (var65 == 0 && class153.field3374[var4][var52][var61] != 0) {
                                        var81 = false;
                                    }
                                    if (var64 > 0 && !class42.method383(var64 - 1, 120).field1434) {
                                        var81 = false;
                                    }
                                    if (var81 && var66 == var67 && var66 == var69 && var66 == var68) {
                                        class6.field133[var4][var52][var61] = class137.method1089(class6.field133[var4][var52][var61], 2340);
                                    }
                                }
                                int var82 = 0;
                                if (var74 != -1) {
                                    var82 = class105.field2226[class107.method865(96, var74, -91)];
                                }
                                if (var64 == 0) {
                                    arg2.method691(var4, var52, var61, 0, 0, -1, var66, var67, var69, var68, class107.method865(var70, var75, -79), class107.method865(var71, var75, -114), class107.method865(var72, var75, -72), class107.method865(var73, var75, -87), 0, 0, 0, 0, var82, 0);
                                } else {
                                    int var83 = class153.field3374[var4][var52][var61] + 1;
                                    byte var84 = class67.field1359[var4][var52][var61];
                                    class71 var85 = class42.method383(var64 - 1, arg0 + 28040);
                                    int var86 = var85.field1438;
                                    int var87;
                                    int var88;
                                    if (var86 >= 0) {
                                        var87 = -1;
                                        var88 = class105.field2217.method6(var86, arg0 ^ 0x1373);
                                    } else if (var85.field1449 == 16711935) {
                                        var86 = -1;
                                        var87 = -2;
                                        var88 = -2;
                                    } else {
                                        var87 = class55.method437(var85.field1454, 2, var85.field1432, var85.field1447);
                                        int var89 = class153.field3371 + var85.field1454;
                                        int var90 = var85.field1432 + class24.field575 & 0xFF;
                                        if (var89 < 0) {
                                            var89 = 0;
                                        } else if (var89 > 255) {
                                            var89 = 255;
                                        }
                                        var88 = class55.method437(var89, 2, var90, var85.field1447);
                                    }
                                    int var91 = 0;
                                    if (var88 != -2) {
                                        var91 = class105.field2226[class95.method785(-104, 96, var88)];
                                    }
                                    if (var85.field1446 != -1) {
                                        int var92 = class153.field3371 + var85.field1442;
                                        int var93 = class24.field575 + var85.field1443 & 0xFF;
                                        if (var92 < 0) {
                                            var92 = 0;
                                        } else if (var92 > 255) {
                                            var92 = 255;
                                        }
                                        int var94 = class55.method437(var92, 2, var93, var85.field1431);
                                        var91 = class105.field2226[class95.method785(63, 96, var94)];
                                    }
                                    arg2.method691(var4, var52, var61, var83, var84, var86, var66, var67, var69, var68, class107.method865(var70, var75, -115), class107.method865(var71, var75, -78), class107.method865(var72, var75, -118), class107.method865(var73, var75, -117), class95.method785(-99, var70, var87), class95.method785(arg0 + 27812, var71, var87), class95.method785(79, var72, var87), class95.method785(-121, var73, var87), var82, var91);
                                }
                            }
                        }
                    }
                }
            }
            for (int var53 = 1; var53 < 103; var53++) {
                for (int var54 = 1; var54 < 103; var54++) {
                    arg2.method664(var4, var54, var53, class11.method99(var53, arg0 ^ 0xFFFF92B8, var54, var4));
                }
            }
            class135.field2939[var4] = null;
            class82.field1765[var4] = null;
            class153.field3374[var4] = null;
            class67.field1359[var4] = null;
            class126.field2796[var4] = null;
        }
        arg2.method699(-50, -10, -50);
        for (int var5 = 0; var5 < 104; var5++) {
            for (int var46 = 0; var46 < 104; var46++) {
                if ((class107.field2249[1][var5][var46] & 0x2) == 2) {
                    arg2.method683(var5, var46);
                }
            }
        }
        int var6 = 1;
        int var7 = 2;
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
                        if ((class6.field133[var10][var12][var11] & var6) != 0) {
                            int var13 = var11;
                            int var14 = var10;
                            int var15 = var11;
                            while (var13 < 104 && (class6.field133[var10][var12][var13 + 1] & var6) != 0) {
                                var13++;
                            }
                            while (var15 > 0 && (class6.field133[var10][var12][var15 - 1] & var6) != 0) {
                                var15--;
                            }
                            int var16 = var10;
                            label355: while (var14 > 0) {
                                for (int var17 = var15; var17 <= var13; var17++) {
                                    if ((var6 & class6.field133[var14 - 1][var12][var17]) == 0) {
                                        break label355;
                                    }
                                }
                                var14--;
                            }
                            label344: while (var16 < var9) {
                                for (int var18 = var15; var18 <= var13; var18++) {
                                    if ((var6 & class6.field133[var16 + 1][var12][var18]) == 0) {
                                        break label344;
                                    }
                                }
                                var16++;
                            }
                            int var19 = (var16 + 1 - var14) * (var13 + 1 + -var15);
                            if (var19 >= 8) {
                                short var20 = 240;
                                int var21 = class83.field1775[var16][var12][var15] - var20;
                                int var22 = class83.field1775[var14][var12][var15];
                                class81.method687(var9, 1, var12 * 128, var12 * 128, var15 * 128, var13 * 128 + 128, var21, var22);
                                for (int var23 = var14; var23 <= var16; var23++) {
                                    for (int var24 = var15; var24 <= var13; var24++) {
                                        class6.field133[var23][var12][var24] = class4.method34(class6.field133[var23][var12][var24], ~var6);
                                    }
                                }
                            }
                        }
                        if ((var7 & class6.field133[var10][var12][var11]) != 0) {
                            int var25 = var12;
                            int var26 = var12;
                            while (var25 > 0 && (class6.field133[var10][var25 - 1][var11] & var7) != 0) {
                                var25--;
                            }
                            int var27 = var10;
                            while (var26 < 104 && (var7 & class6.field133[var10][var26 + 1][var11]) != 0) {
                                var26++;
                            }
                            int var28;
                            label409: for (var28 = var10; var28 > 0; var28--) {
                                for (int var29 = var25; var29 <= var26; var29++) {
                                    if ((class6.field133[var28 - 1][var29][var11] & var7) == 0) {
                                        break label409;
                                    }
                                }
                            }
                            label398: while (var9 > var27) {
                                for (int var30 = var25; var30 <= var26; var30++) {
                                    if ((var7 & class6.field133[var27 + 1][var30][var11]) == 0) {
                                        break label398;
                                    }
                                }
                                var27++;
                            }
                            int var31 = (var26 + 1 - var25) * (-var28 + var27 + 1);
                            if (var31 >= 8) {
                                short var32 = 240;
                                int var33 = class83.field1775[var27][var25][var11] - var32;
                                int var34 = class83.field1775[var28][var25][var11];
                                class81.method687(var9, 2, var25 * 128, var26 * 128 + 128, var11 * 128, var11 * 128, var33, var34);
                                for (int var35 = var28; var35 <= var27; var35++) {
                                    for (int var36 = var25; var36 <= var26; var36++) {
                                        class6.field133[var35][var36][var11] = class4.method34(class6.field133[var35][var36][var11], ~var7);
                                    }
                                }
                            }
                        }
                        if ((class6.field133[var10][var12][var11] & var8) != 0) {
                            int var37 = var12;
                            int var38 = var12;
                            int var39 = var11;
                            int var40;
                            for (var40 = var11; var40 < 104 && (class6.field133[var10][var12][var40 + 1] & var8) != 0; var40++) {
                            }
                            while (var39 > 0 && (var8 & class6.field133[var10][var12][var39 - 1]) != 0) {
                                var39--;
                            }
                            label464: while (var37 > 0) {
                                for (int var41 = var39; var41 <= var40; var41++) {
                                    if ((class6.field133[var10][var37 - 1][var41] & var8) == 0) {
                                        break label464;
                                    }
                                }
                                var37--;
                            }
                            label453: while (var38 < 104) {
                                for (int var42 = var39; var42 <= var40; var42++) {
                                    if ((class6.field133[var10][var38 + 1][var42] & var8) == 0) {
                                        break label453;
                                    }
                                }
                                var38++;
                            }
                            if ((var40 + 1 - var39) * (-var37 + var38 + 1) >= 4) {
                                int var43 = class83.field1775[var10][var37][var39];
                                class81.method687(var9, 4, var37 * 128, var38 * 128 + 128, var39 * 128, var40 * 128 + 128, var43, var43);
                                for (int var44 = var37; var44 <= var38; var44++) {
                                    for (int var45 = var39; var45 <= var40; var45++) {
                                        class6.field133[var10][var44][var45] = class4.method34(class6.field133[var10][var44][var45], ~var8);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)V")
    public final void method184(byte arg0) {
        if (arg0 != 80) {
            field448 = null;
        }
        class140.method1101(this.field443, this.field451, this.field445);
        field442++;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IBLjava/awt/Component;I)V")
    public abstract void method72(int arg0, byte arg1, Component arg2, int arg3);

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IILjava/awt/Graphics;III)V")
    public abstract void method78(int arg0, int arg1, Graphics arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIII)I")
    public static final int method185(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 & 0x3;
        field454++;
        int var5 = -84 % ((arg1 - 67) / 37);
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return arg2;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            return 7 - arg2;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
    public abstract void method73(Graphics arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V")
    public static void method186(int arg0) {
        field455 = null;
        field439 = null;
        field448 = null;
        field446 = null;
        field450 = null;
        field456 = null;
        field444 = null;
        if (arg0 == -21515) {
            field457 = null;
            field453 = null;
            field452 = null;
            field441 = null;
        }
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "()V")
    protected class18() {
    }
}
