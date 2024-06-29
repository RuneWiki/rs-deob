import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class27 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "Lai;")
    public static class10 field396 = class44.method278("leuchten1:", -101);

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "[I")
    public static int[] field404 = new int[100];

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "I")
    public static int field402 = -1;

    @OriginalMember(owner = "client!cf", name = "k", descriptor = "I")
    public static int field406 = 0;

    @OriginalMember(owner = "client!cf", name = "n", descriptor = "Lai;")
    public static class10 field409 = class44.method278("(U0a )2 in: ", 117);

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "I")
    public static int field397;

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "I")
    public static int field398;

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "I")
    public static int field399;

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "I")
    public static int field400;

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "I")
    public static int field401;

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "I")
    public static int field403;

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "I")
    public static int field405;

    @OriginalMember(owner = "client!cf", name = "m", descriptor = "I")
    public static int field408;

    @OriginalMember(owner = "client!cf", name = "o", descriptor = "I")
    public static int field410;

    @OriginalMember(owner = "client!cf", name = "p", descriptor = "I")
    public static int field411;

    @OriginalMember(owner = "client!cf", name = "q", descriptor = "I")
    public static int field412;

    @OriginalMember(owner = "client!cf", name = "l", descriptor = "Lc;")
    public static class21 field407;

    @OriginalMember(owner = "client!cf", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class98.field1819 != null) {
            class102.field1912 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class135.field2533.length > var2) {
                var3 = class135.field2533[var2];
                if ((var3 & 0x80) != 0) {
                    var3 = -1;
                }
            } else {
                var3 = -1;
            }
            if (class87.field1548 >= 0 && var3 >= 0) {
                class65.field1120[class87.field1548] = var3;
                class87.field1548 = class87.field1548 + 1 & 0x7F;
                if (class87.field1548 == class170.field3294) {
                    class87.field1548 = -1;
                }
            }
            if (var3 >= 0) {
                int var4 = class200.field3789 + 1 & 0x7F;
                if (class153.field2954 != var4) {
                    class93.field1685[class200.field3789] = var3;
                    class118.field2274[class200.field3789] = -1;
                    class200.field3789 = var4;
                }
            }
            int var5 = arg0.getModifiers();
            if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
                arg0.consume();
            }
        }
        field401++;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILka;[Ll;)V")
    public static final void method172(int arg0, class92 arg1, class100[] arg2) {
        field397++;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var112 = 0; var112 < 104; var112++) {
                for (int var113 = 0; var113 < 104; var113++) {
                    if ((class185.field3527[var3][var112][var113] & 0x1) == 1) {
                        int var114 = var3;
                        if ((class185.field3527[1][var112][var113] & 0x2) == 2) {
                            var114 = var3 - 1;
                        }
                        if (var114 >= 0) {
                            arg2[var114].method654(var112, true, var113);
                        }
                    }
                }
            }
        }
        class11.field197 += (int) (Math.random() * 5.0D) - 2;
        class5.field61 += (int) (Math.random() * 5.0D) - 2;
        if (class11.field197 < -16) {
            class11.field197 = -16;
        }
        if (class11.field197 > 16) {
            class11.field197 = 16;
        }
        int[][] var4 = new int[104][104];
        int var5 = class11.field197 >> 1;
        int[][] var6 = new int[104][104];
        if (class5.field61 < -8) {
            class5.field61 = -8;
        }
        if (class5.field61 > 8) {
            class5.field61 = 8;
        }
        int var7 = class5.field61 >> 2 << 10;
        for (int var8 = 0; var8 < 4; var8++) {
            byte[][] var51 = class46.field755[var8];
            int var52 = (int) Math.sqrt(5100.0D);
            int var53 = var52 * 768 >> 8;
            for (int var54 = 1; var54 < 103; var54++) {
                for (int var102 = 1; var102 < 103; var102++) {
                    byte var103 = 96;
                    int var104 = class186.field3556[var8][var102 + 1][var54] - class186.field3556[var8][var102 - 1][var54];
                    int var105 = class186.field3556[var8][var102][var54 + 1] - class186.field3556[var8][var102][var54 - 1];
                    int var106 = (int) Math.sqrt((double) (var104 * var104 + var105 * var105 + 65536));
                    int var107 = 65536 / var106;
                    int var108 = (var104 << 8) / var106;
                    int var109 = (var105 << 8) / var106;
                    int var110 = (var109 * -50 + var108 * -50 + var107 * -10) / var53 + var103;
                    int var111 = (var51[var102][var54 + 1] >> 3) + (var51[var102][var54 - 1] >> 2) + (var51[var102][var54] >> 1) + (var51[var102 + -1][var54] >> 2) + (var51[var102 + 1][var54] >> 3);
                    var4[var102][var54] = var110 - var111;
                }
            }
            for (int var55 = 0; var55 < 104; var55++) {
                class135.field2532[var55] = 0;
                class206.field4001[var55] = 0;
                class201.field3943[var55] = 0;
                class159.field3068[var55] = 0;
                class139.field2633[var55] = 0;
            }
            for (int var56 = -5; var56 < 104; var56++) {
                for (int var87 = 0; var87 < 104; var87++) {
                    int var96 = var56 + 5;
                    int var10002;
                    if (var96 < 104) {
                        int var97 = class153.field2934[var8][var96][var87] & 0xFF;
                        if (var97 > 0) {
                            class7 var98 = class148.method1021(-120, var97 - 1);
                            class135.field2532[var87] += var98.field89;
                            class206.field4001[var87] += var98.field96;
                            class201.field3943[var87] += var98.field88;
                            class159.field3068[var87] += var98.field91;
                            var10002 = class139.field2633[var87]++;
                        }
                    }
                    int var99 = var56 - 5;
                    if (var99 >= 0) {
                        int var100 = class153.field2934[var8][var99][var87] & 0xFF;
                        if (var100 > 0) {
                            class7 var101 = class148.method1021(arg0 - 207, var100 - 1);
                            class135.field2532[var87] -= var101.field89;
                            class206.field4001[var87] -= var101.field96;
                            class201.field3943[var87] -= var101.field88;
                            class159.field3068[var87] -= var101.field91;
                            var10002 = class139.field2633[var87]--;
                        }
                    }
                }
                if (var56 >= 0) {
                    int var88 = 0;
                    int var89 = 0;
                    int var90 = 0;
                    int var91 = 0;
                    int var92 = 0;
                    for (int var93 = -5; var93 < 104; var93++) {
                        int var94 = var93 - 5;
                        int var95 = var93 + 5;
                        if (var95 < 104) {
                            var92 += class159.field3068[var95];
                            var89 += class201.field3943[var95];
                            var90 += class139.field2633[var95];
                            var91 += class206.field4001[var95];
                            var88 += class135.field2532[var95];
                        }
                        if (var94 >= 0) {
                            var89 -= class201.field3943[var94];
                            var90 -= class139.field2633[var94];
                            var92 -= class159.field3068[var94];
                            var88 -= class135.field2532[var94];
                            var91 -= class206.field4001[var94];
                        }
                        if (var93 >= 0 && var90 > 0) {
                            var6[var56][var93] = class6.method16(var89 / var90, var91 / var90, var88 * 256 / var92, 3);
                        }
                    }
                }
            }
            for (int var57 = 1; var57 < 103; var57++) {
                for (int var60 = 1; var60 < 103; var60++) {
                    if (!class126.field2406 || (class185.field3527[0][var57][var60] & 0x2) != 0 || (class185.field3527[var8][var57][var60] & 0x10) == 0 && class101.method665(var60, (byte) -79, var57, var8) == class104.field1956) {
                        if (class165.field3171 > var8) {
                            class165.field3171 = var8;
                        }
                        int var61 = class153.field2934[var8][var57][var60] & 0xFF;
                        int var62 = class104.field1947[var8][var57][var60] & 0xFF;
                        if (var61 > 0 || var62 > 0) {
                            int var63 = class186.field3556[var8][var57][var60];
                            int var64 = class186.field3556[var8][var57 + 1][var60];
                            int var65 = class186.field3556[var8][var57 + 1][var60 + 1];
                            int var66 = class186.field3556[var8][var57][var60 + 1];
                            if (var8 > 0) {
                                boolean var67 = true;
                                if (var61 == 0 && class20.field298[var8][var57][var60] != 0) {
                                    var67 = false;
                                }
                                if (var62 > 0 && !class193.method1235(true, var62 - 1).field2774) {
                                    var67 = false;
                                }
                                if (var67 && var63 == var64 && var63 == var65 && var63 == var66) {
                                    class206.field4018[var8][var57][var60] = class66.method434(class206.field4018[var8][var57][var60], 2340);
                                }
                            }
                            int var68;
                            int var71;
                            if (var61 > 0) {
                                var68 = var6[var57][var60];
                                int var69 = (var68 & 0x7F) + var5;
                                if (var69 < 0) {
                                    var69 = 0;
                                } else if (var69 > 127) {
                                    var69 = 127;
                                }
                                int var70 = (var68 & 0x380) + (var7 + var68 & 0xFC00) + var69;
                                var71 = class113.field2126[class68.method446(96, var70, true)];
                            } else {
                                var68 = -1;
                                var71 = 0;
                            }
                            int var72 = var4[var57 + 1][var60];
                            int var73 = var4[var57][var60 + 1];
                            int var74 = var4[var57 + 1][var60 + 1];
                            int var75 = var4[var57][var60];
                            if (var62 == 0) {
                                arg1.method602(var8, var57, var60, 0, 0, -1, var63, var64, var65, var66, class68.method446(var75, var68, true), class68.method446(var72, var68, true), class68.method446(var74, var68, true), class68.method446(var73, var68, true), 0, 0, 0, 0, var71, 0);
                            } else {
                                int var76 = class20.field298[var8][var57][var60] + 1;
                                byte var77 = class82.field1433[var8][var57][var60];
                                class145 var78 = class193.method1235(true, var62 - 1);
                                int var79 = var78.field2776;
                                if (var79 >= 0 && !class113.field2122.method204(false, var79)) {
                                    var79 = -1;
                                }
                                int var80;
                                int var81;
                                if (var79 >= 0) {
                                    var80 = -1;
                                    var81 = class113.field2126[class28.method181(class113.field2122.method205(var79, (byte) -6), 96, 18956)];
                                } else if (var78.field2775 == -1) {
                                    var80 = -2;
                                    var81 = 0;
                                } else {
                                    var80 = var78.field2775;
                                    int var82 = (var80 & 0x7F) + var5;
                                    if (var82 < 0) {
                                        var82 = 0;
                                    } else if (var82 > 127) {
                                        var82 = 127;
                                    }
                                    int var83 = (var80 & 0x380) + (var7 + var80 & 0xFC00) + var82;
                                    var81 = class113.field2126[class28.method181(var83, 96, 18956)];
                                }
                                if (var78.field2772 >= 0) {
                                    int var84 = var78.field2772;
                                    int var85 = (var84 & 0x7F) + var5;
                                    if (var85 < 0) {
                                        var85 = 0;
                                    } else if (var85 > 127) {
                                        var85 = 127;
                                    }
                                    int var86 = (var84 + var7 & 0xFC00) + (var84 & 0x380) + var85;
                                    var81 = class113.field2126[class28.method181(var86, 96, arg0 ^ 0x4A73)];
                                }
                                arg1.method602(var8, var57, var60, var76, var77, var79, var63, var64, var65, var66, class68.method446(var75, var68, true), class68.method446(var72, var68, true), class68.method446(var74, var68, true), class68.method446(var73, var68, true), class28.method181(var80, var75, 18956), class28.method181(var80, var72, 18956), class28.method181(var80, var74, 18956), class28.method181(var80, var73, arg0 ^ 0x4A73), var71, var81);
                            }
                        }
                    }
                }
            }
            for (int var58 = 1; var58 < 103; var58++) {
                for (int var59 = 1; var59 < 103; var59++) {
                    arg1.method608(var8, var59, var58, class101.method665(var58, (byte) -79, var59, var8));
                }
            }
            class153.field2934[var8] = null;
            class104.field1947[var8] = null;
            class20.field298[var8] = null;
            class82.field1433[var8] = null;
            class46.field755[var8] = null;
        }
        arg1.method587(-50, -10, -50);
        int var9 = 0;
        if (arg0 != 127) {
            return;
        }
        while (var9 < 104) {
            for (int var50 = 0; var50 < 104; var50++) {
                if ((class185.field3527[1][var9][var50] & 0x2) == 2) {
                    arg1.method575(var9, var50);
                }
            }
            var9++;
        }
        int var10 = 1;
        int var11 = 2;
        int var12 = 4;
        for (int var13 = 0; var13 < 4; var13++) {
            if (var13 > 0) {
                var10 <<= 0x3;
                var12 <<= 0x3;
                var11 <<= 0x3;
            }
            for (int var14 = 0; var14 <= var13; var14++) {
                for (int var15 = 0; var15 <= 104; var15++) {
                    for (int var16 = 0; var16 <= 104; var16++) {
                        if ((class206.field4018[var14][var16][var15] & var10) != 0) {
                            int var17 = var15;
                            int var18 = var15;
                            int var19 = var14;
                            int var20 = var14;
                            while (var18 < 104 && (class206.field4018[var14][var16][var18 + 1] & var10) != 0) {
                                var18++;
                            }
                            while (var17 > 0 && (var10 & class206.field4018[var14][var16][var17 - 1]) != 0) {
                                var17--;
                            }
                            label355: while (var19 > 0) {
                                for (int var21 = var17; var21 <= var18; var21++) {
                                    if ((class206.field4018[var19 - 1][var16][var21] & var10) == 0) {
                                        break label355;
                                    }
                                }
                                var19--;
                            }
                            label344: while (var13 > var20) {
                                for (int var22 = var17; var22 <= var18; var22++) {
                                    if ((class206.field4018[var20 + 1][var16][var22] & var10) == 0) {
                                        break label344;
                                    }
                                }
                                var20++;
                            }
                            int var23 = (var18 + 1 - var17) * (-var19 + var20 + 1);
                            if (var23 >= 8) {
                                short var24 = 240;
                                int var25 = class186.field3556[var19][var16][var17];
                                int var26 = class186.field3556[var20][var16][var17] - var24;
                                class92.method603(var13, 1, var16 * 128, var16 * 128, var17 * 128, var18 * 128 + 128, var26, var25);
                                for (int var27 = var19; var27 <= var20; var27++) {
                                    for (int var28 = var17; var28 <= var18; var28++) {
                                        class206.field4018[var27][var16][var28] = class123.method861(class206.field4018[var27][var16][var28], ~var10);
                                    }
                                }
                            }
                        }
                        if ((var11 & class206.field4018[var14][var16][var15]) != 0) {
                            int var29 = var16;
                            int var30;
                            for (var30 = var16; var30 < 104 && (var11 & class206.field4018[var14][var30 + 1][var15]) != 0; var30++) {
                            }
                            while (var29 > 0 && (var11 & class206.field4018[var14][var29 - 1][var15]) != 0) {
                                var29--;
                            }
                            int var31 = var14;
                            int var32 = var14;
                            label408: while (var31 > 0) {
                                for (int var33 = var29; var33 <= var30; var33++) {
                                    if ((var11 & class206.field4018[var31 - 1][var33][var15]) == 0) {
                                        break label408;
                                    }
                                }
                                var31--;
                            }
                            label397: while (var13 > var32) {
                                for (int var34 = var29; var34 <= var30; var34++) {
                                    if ((var11 & class206.field4018[var32 + 1][var34][var15]) == 0) {
                                        break label397;
                                    }
                                }
                                var32++;
                            }
                            int var35 = (var30 + 1 - var29) * (-var31 + var32 + 1);
                            if (var35 >= 8) {
                                short var36 = 240;
                                int var37 = class186.field3556[var31][var29][var15];
                                int var38 = class186.field3556[var32][var29][var15] - var36;
                                class92.method603(var13, 2, var29 * 128, var30 * 128 + 128, var15 * 128, var15 * 128, var38, var37);
                                for (int var39 = var31; var39 <= var32; var39++) {
                                    for (int var40 = var29; var40 <= var30; var40++) {
                                        class206.field4018[var39][var40][var15] = class123.method861(class206.field4018[var39][var40][var15], ~var11);
                                    }
                                }
                            }
                        }
                        if ((class206.field4018[var14][var16][var15] & var12) != 0) {
                            int var41 = var16;
                            int var42 = var16;
                            int var43;
                            for (var43 = var15; var43 > 0 && (var12 & class206.field4018[var14][var16][var43 - 1]) != 0; var43--) {
                            }
                            int var44;
                            for (var44 = var15; var44 < 104 && (class206.field4018[var14][var16][var44 + 1] & var12) != 0; var44++) {
                            }
                            label462: while (var42 > 0) {
                                for (int var45 = var43; var45 <= var44; var45++) {
                                    if ((class206.field4018[var14][var42 - 1][var45] & var12) == 0) {
                                        break label462;
                                    }
                                }
                                var42--;
                            }
                            label451: while (var41 < 104) {
                                for (int var46 = var43; var46 <= var44; var46++) {
                                    if ((var12 & class206.field4018[var14][var41 + 1][var46]) == 0) {
                                        break label451;
                                    }
                                }
                                var41++;
                            }
                            if ((var41 + 1 - var42) * (var44 + 1 + -var43) >= 4) {
                                int var47 = class186.field3556[var14][var42][var43];
                                class92.method603(var13, 4, var42 * 128, var41 * 128 + 128, var43 * 128, var44 * 128 + 128, var47, var47);
                                for (int var48 = var42; var48 <= var41; var48++) {
                                    for (int var49 = var43; var49 <= var44; var49++) {
                                        class206.field4018[var14][var48][var49] = class123.method861(class206.field4018[var14][var48][var49], ~var12);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V")
    public static void method173(int arg0) {
        field409 = null;
        field396 = null;
        field407 = null;
        field404 = null;
        if (arg0 != 349335560) {
            method173(-26);
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(BI)Loa;")
    public static final class128 method174(byte arg0, int arg1) {
        field399++;
        class128 var2 = (class128) class43.field704.method222(arg0 + 148, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class137.field2581.method159((byte) 97, 0, arg1);
        if (var3 == null) {
            return null;
        }
        class128 var4 = new class128();
        if (arg0 != -26) {
            field396 = null;
        }
        int var5 = 0;
        class114 var6 = new class114(var3);
        var6.field2170 = var6.field2160.length - 12;
        int var7 = var6.method761(arg0 ^ 0xFFFFFF19);
        var4.field2418 = var6.method762((byte) 99);
        var4.field2425 = var6.method762((byte) 87);
        var4.field2421 = var6.method762((byte) 119);
        var4.field2430 = var6.method762((byte) 110);
        var6.field2170 = 0;
        var4.field2423 = var6.method810(false);
        var4.field2436 = new class10[var7];
        var4.field2426 = new int[var7];
        var4.field2432 = new int[var7];
        while (var6.field2160.length - 12 > var6.field2170) {
            int var8 = var6.method762((byte) 99);
            if (var8 == 3) {
                var4.field2436[var5] = var6.method764((byte) -119);
            } else if (var8 >= 100 || var8 == 21 || var8 == 38 || var8 == 39) {
                var4.field2426[var5] = var6.method767(true);
            } else {
                var4.field2426[var5] = var6.method761(255);
            }
            var4.field2432[var5++] = var8;
        }
        class43.field704.method225(-21284, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!cf", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        field400++;
        if (class98.field1819 != null) {
            class102.field1912 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class135.field2533.length > var2) {
                var3 = class135.field2533[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class87.field1548 >= 0 && var3 >= 0) {
                class65.field1120[class87.field1548] = ~var3;
                class87.field1548 = class87.field1548 + 1 & 0x7F;
                if (class87.field1548 == class170.field3294) {
                    class87.field1548 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILme;B)Lai;")
    public static final class10 method175(int arg0, class114 arg1, byte arg2) {
        if (arg2 <= 17) {
            return null;
        }
        field410++;
        try {
            class10 var3 = new class10();
            var3.field118 = arg1.method804((byte) -99);
            if (arg0 < var3.field118) {
                var3.field118 = arg0;
            }
            var3.field160 = new byte[var3.field118];
            arg1.field2170 += class101.field1894.method853(var3.field160, arg1.field2160, 15, var3.field118, 0, arg1.field2170);
            return var3;
        } catch (Exception var4) {
            return class116.field2230;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZLn;Z)V")
    public static final void method176(boolean arg0, class118 arg1, boolean arg2) {
        int var3 = arg1.field2272;
        int var4 = (int) arg1.field2291;
        field412++;
        arg1.method848(false);
        if (arg2) {
            class80.method490(var3, 0);
        }
        class38.method256(544783024, var3);
        class200 var5 = class66.method432(var4, !arg0);
        if (var5 != null) {
            class168.method1116(var5, -105);
        }
        class53.field946 = 0;
        class180.field3415 = false;
        class147.method1015(false, class160.field3086, class193.field3670, class118.field2279, class108.field2008);
        if (!arg0) {
            field404 = null;
        }
        if (field402 != -1) {
            class73.method460(1, field402, (byte) -110);
        }
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(I)[Lbf;")
    public static final class17[] method177(int arg0) {
        field403++;
        class17[] var1 = new class17[class37.field586];
        for (int var2 = 0; var2 < class37.field586; var2++) {
            class17 var3 = new class17();
            var3.field260 = class144.field2754;
            var3.field256 = class184.field3500;
            var3.field259 = class87.field1547[var2];
            var3.field255 = class18.field263[var2];
            var3.field257 = class100.field1857[var2];
            var3.field261 = class145.field2781[var2];
            byte[] var4 = class189.field3615[var2];
            int var5 = var3.field261 * var3.field257;
            var3.field258 = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                var3.field258[var6] = class140.field2639[class123.method861(255, var4[var6])];
            }
            var1[var2] = var3;
        }
        if (arg0 != -1) {
            field396 = null;
        }
        class56.method383(-113);
        return var1;
    }

    @OriginalMember(owner = "client!cf", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class98.field1819 != null) {
            class87.field1548 = -1;
        }
        field405++;
    }

    @OriginalMember(owner = "client!cf", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field398++;
    }

    @OriginalMember(owner = "client!cf", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        field411++;
        if (class98.field1819 != null) {
            int var2 = class42.method269(arg0, -8365);
            if (var2 >= 0) {
                int var3 = class200.field3789 + 1 & 0x7F;
                if (class153.field2954 != var3) {
                    class93.field1685[class200.field3789] = -1;
                    class118.field2274[class200.field3789] = var2;
                    class200.field3789 = var3;
                }
            }
        }
        arg0.consume();
    }
}
