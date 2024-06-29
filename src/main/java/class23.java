import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class23 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!da", name = "f", descriptor = "I")
    public static int field415 = 0;

    @OriginalMember(owner = "client!da", name = "l", descriptor = "Lje;")
    private static class67 field421 = class85.method592(255, "Your account has been disabled)3");

    @OriginalMember(owner = "client!da", name = "k", descriptor = "I")
    public static int field420 = 0;

    @OriginalMember(owner = "client!da", name = "c", descriptor = "I")
    public static int field412 = 7759444;

    @OriginalMember(owner = "client!da", name = "p", descriptor = "Lje;")
    public static class67 field425 = field421;

    @OriginalMember(owner = "client!da", name = "j", descriptor = "Lje;")
    public static class67 field419 = class85.method592(255, "Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q");

    @OriginalMember(owner = "client!da", name = "s", descriptor = "Lje;")
    private static class67 field428 = class85.method592(255, "Starting game engine)3)3)3");

    @OriginalMember(owner = "client!da", name = "h", descriptor = "Lje;")
    public static class67 field417 = field428;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "I")
    public static int field410;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "I")
    public static int field411;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "I")
    public static int field413;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "I")
    public static int field414;

    @OriginalMember(owner = "client!da", name = "g", descriptor = "I")
    public static int field416;

    @OriginalMember(owner = "client!da", name = "i", descriptor = "I")
    public static int field418;

    @OriginalMember(owner = "client!da", name = "m", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "client!da", name = "n", descriptor = "I")
    public static int field423;

    @OriginalMember(owner = "client!da", name = "r", descriptor = "I")
    public static int field427;

    @OriginalMember(owner = "client!da", name = "o", descriptor = "Loe;")
    public static class102 field424;

    @OriginalMember(owner = "client!da", name = "q", descriptor = "[Lkd;")
    public static class73[] field426;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BLkc;)V")
    public static final void method160(byte arg0, class72 arg1) {
        if (arg0 != -29) {
            field421 = null;
        }
        if (class152.field3482 == arg1.field1578) {
            class80.field1774[arg1.field1495] = true;
        }
        field416++;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([Lee;ZLhb;)V")
    public static final void method161(class34[] arg0, boolean arg1, class51 arg2) {
        field414++;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var110 = 0; var110 < 104; var110++) {
                for (int var111 = 0; var111 < 104; var111++) {
                    if ((class82.field1809[var3][var110][var111] & 0x1) == 1) {
                        int var112 = var3;
                        if ((class82.field1809[1][var110][var111] & 0x2) == 2) {
                            var112 = var3 - 1;
                        }
                        if (var112 >= 0) {
                            arg0[var112].method211(var111, 2097152, var110);
                        }
                    }
                }
            }
        }
        class138.field3116 += (int) (Math.random() * 5.0D) - 2;
        class148.field3394 += (int) (Math.random() * 5.0D) - 2;
        if (class148.field3394 < -8) {
            class148.field3394 = -8;
        }
        if (class148.field3394 > 8) {
            class148.field3394 = 8;
        }
        if (class138.field3116 < -16) {
            class138.field3116 = -16;
        }
        if (class138.field3116 > 16) {
            class138.field3116 = 16;
        }
        for (int var4 = 0; var4 < 4; var4++) {
            byte[][] var47 = class106.field2424[var4];
            int var48 = (int) Math.sqrt(5100.0D);
            int var49 = var48 * 768 >> 8;
            for (int var50 = 1; var50 < 103; var50++) {
                for (int var101 = 1; var101 < 103; var101++) {
                    int var102 = class142.field3253[var4][var101 + 1][var50] - class142.field3253[var4][var101 - 1][var50];
                    int var103 = class142.field3253[var4][var101][var50 + 1] - class142.field3253[var4][var101][var50 - 1];
                    int var104 = (int) Math.sqrt((double) (var103 * var103 + var102 * var102 + 65536));
                    int var105 = (var102 << 8) / var104;
                    int var106 = 65536 / var104;
                    int var107 = (var103 << 8) / var104;
                    int var108 = (var47[var101][var50 - 1] >> 2) + ((var47[var101][var50 + 1] >> 3) + (var47[var101 + 1][var50] >> 3) + (var47[var101 + -1][var50] >> 2) + (var47[var101][var50] >> 1));
                    int var109 = (var105 * -50 + var106 * -10 + var107 * -50) / var49 + 96;
                    class80.field1772[var101][var50] = var109 - var108;
                }
            }
            for (int var51 = 0; var51 < 104; var51++) {
                class103.field2300[var51] = 0;
                class84.field1858[var51] = 0;
                class49.field938[var51] = 0;
                class158.field3613[var51] = 0;
                class41.field783[var51] = 0;
            }
            for (int var52 = -5; var52 < 109; var52++) {
                for (int var55 = 0; var55 < 104; var55++) {
                    int var95 = var52 + 5;
                    int var10002;
                    if (var95 >= 0 && var95 < 104) {
                        int var96 = class79.field1745[var4][var95][var55] & 0xFF;
                        if (var96 > 0) {
                            class18 var97 = class46.method298(var96 - 1, false);
                            class103.field2300[var55] += var97.field333;
                            class84.field1858[var55] += var97.field331;
                            class49.field938[var55] += var97.field327;
                            class158.field3613[var55] += var97.field326;
                            var10002 = class41.field783[var55]++;
                        }
                    }
                    int var98 = var52 - 5;
                    if (var98 >= 0 && var98 < 104) {
                        int var99 = class79.field1745[var4][var98][var55] & 0xFF;
                        if (var99 > 0) {
                            class18 var100 = class46.method298(var99 - 1, !arg1);
                            class103.field2300[var55] -= var100.field333;
                            class84.field1858[var55] -= var100.field331;
                            class49.field938[var55] -= var100.field327;
                            class158.field3613[var55] -= var100.field326;
                            var10002 = class41.field783[var55]--;
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
                            var60 += class41.field783[var62];
                            var56 += class103.field2300[var62];
                            var58 += class49.field938[var62];
                            var59 += class158.field3613[var62];
                            var57 += class84.field1858[var62];
                        }
                        int var63 = var61 - 5;
                        if (var63 >= 0 && var63 < 104) {
                            var58 -= class49.field938[var63];
                            var57 -= class84.field1858[var63];
                            var59 -= class158.field3613[var63];
                            var56 -= class103.field2300[var63];
                            var60 -= class41.field783[var63];
                        }
                        if (var61 >= 1 && var61 < 103 && (!class41.field773 || (class82.field1809[0][var52][var61] & 0x2) != 0 || (class82.field1809[var4][var52][var61] & 0x10) == 0 && class140.method1053(var61, (byte) 88, var52, var4) == class2.field13)) {
                            if (class2.field21 > var4) {
                                class2.field21 = var4;
                            }
                            int var64 = class59.field1185[var4][var52][var61] & 0xFF;
                            int var65 = class79.field1745[var4][var52][var61] & 0xFF;
                            if (var65 > 0 || var64 > 0) {
                                int var66 = class142.field3253[var4][var52][var61];
                                int var67 = class142.field3253[var4][var52 + 1][var61];
                                int var68 = class142.field3253[var4][var52 + 1][var61 + 1];
                                int var69 = class80.field1772[var52][var61];
                                int var70 = class80.field1772[var52 + 1][var61];
                                int var71 = class142.field3253[var4][var52][var61 + 1];
                                int var72 = class80.field1772[var52 + 1][var61 + 1];
                                int var73 = -1;
                                int var74 = -1;
                                int var75 = class80.field1772[var52][var61 + 1];
                                if (var65 > 0) {
                                    int var76 = var56 * 256 / var59;
                                    int var77 = var57 / var60;
                                    int var78 = var58 / var60;
                                    var73 = class24.method163(var77, var78, 100, var76);
                                    int var79 = class138.field3116 + var78;
                                    if (var79 < 0) {
                                        var79 = 0;
                                    } else if (var79 > 255) {
                                        var79 = 255;
                                    }
                                    int var80 = class148.field3394 + var76 & 0xFF;
                                    var74 = class24.method163(var77, var79, 103, var80);
                                }
                                if (var4 > 0) {
                                    boolean var81 = true;
                                    if (var65 == 0 && class27.field491[var4][var52][var61] != 0) {
                                        var81 = false;
                                    }
                                    if (var64 > 0 && !class69.method504(125, var64 - 1).field2875) {
                                        var81 = false;
                                    }
                                    if (var81 && var66 == var67 && var66 == var68 && var66 == var71) {
                                        class80.field1757[var4][var52][var61] = class82.method579(class80.field1757[var4][var52][var61], 2340);
                                    }
                                }
                                int var82 = 0;
                                if (var74 != -1) {
                                    var82 = class96.field2162[class120.method951(var74, -1, 96)];
                                }
                                if (var64 == 0) {
                                    arg2.method374(var4, var52, var61, 0, 0, -1, var66, var67, var68, var71, class120.method951(var73, -1, var69), class120.method951(var73, -1, var70), class120.method951(var73, -1, var72), class120.method951(var73, -1, var75), 0, 0, 0, 0, var82, 0);
                                } else {
                                    int var83 = class27.field491[var4][var52][var61] + 1;
                                    byte var84 = class40.field713[var4][var52][var61];
                                    class131 var85 = class69.method504(-122, var64 - 1);
                                    int var86 = var85.field2887;
                                    int var87;
                                    int var90;
                                    if (var86 >= 0) {
                                        var87 = -1;
                                        var90 = class96.field2158.method4(-123, var86);
                                    } else if (var85.field2885 == 16711935) {
                                        var90 = -2;
                                        var86 = -1;
                                        var87 = -2;
                                    } else {
                                        var87 = class24.method163(var85.field2876, var85.field2884, -104, var85.field2882);
                                        int var88 = class148.field3394 + var85.field2882 & 0xFF;
                                        int var89 = class138.field3116 + var85.field2884;
                                        if (var89 < 0) {
                                            var89 = 0;
                                        } else if (var89 > 255) {
                                            var89 = 255;
                                        }
                                        var90 = class24.method163(var85.field2876, var89, 93, var88);
                                    }
                                    int var91 = 0;
                                    if (var90 != -2) {
                                        var91 = class96.field2162[class134.method1016(96, (byte) 85, var90)];
                                    }
                                    if (var85.field2888 != -1) {
                                        int var92 = class138.field3116 + var85.field2877;
                                        if (var92 < 0) {
                                            var92 = 0;
                                        } else if (var92 > 255) {
                                            var92 = 255;
                                        }
                                        int var93 = class148.field3394 + var85.field2872 & 0xFF;
                                        int var94 = class24.method163(var85.field2890, var92, -59, var93);
                                        var91 = class96.field2162[class134.method1016(96, (byte) 85, var94)];
                                    }
                                    arg2.method374(var4, var52, var61, var83, var84, var86, var66, var67, var68, var71, class120.method951(var73, -1, var69), class120.method951(var73, -1, var70), class120.method951(var73, -1, var72), class120.method951(var73, -1, var75), class134.method1016(var69, (byte) 85, var87), class134.method1016(var70, (byte) 85, var87), class134.method1016(var72, (byte) 85, var87), class134.method1016(var75, (byte) 85, var87), var82, var91);
                                }
                            }
                        }
                    }
                }
            }
            for (int var53 = 1; var53 < 103; var53++) {
                for (int var54 = 1; var54 < 103; var54++) {
                    arg2.method363(var4, var54, var53, class140.method1053(var53, (byte) 88, var54, var4));
                }
            }
            class79.field1745[var4] = null;
            class59.field1185[var4] = null;
            class27.field491[var4] = null;
            class40.field713[var4] = null;
            class106.field2424[var4] = null;
        }
        arg2.method376(-50, -10, -50);
        for (int var5 = 0; var5 < 104; var5++) {
            for (int var46 = 0; var46 < 104; var46++) {
                if ((class82.field1809[1][var5][var46] & 0x2) == 2) {
                    arg2.method333(var5, var46);
                }
            }
        }
        int var6 = 1;
        int var7 = 4;
        int var8 = 2;
        for (int var9 = 0; var9 < 4; var9++) {
            if (var9 > 0) {
                var6 <<= 0x3;
                var7 <<= 0x3;
                var8 <<= 0x3;
            }
            for (int var10 = 0; var10 <= var9; var10++) {
                for (int var11 = 0; var11 <= 104; var11++) {
                    for (int var12 = 0; var12 <= 104; var12++) {
                        if ((class80.field1757[var10][var12][var11] & var6) != 0) {
                            int var13 = var11;
                            int var14 = var11;
                            int var15 = var10;
                            int var16 = var10;
                            while (var13 > 0 && (class80.field1757[var10][var12][var13 - 1] & var6) != 0) {
                                var13--;
                            }
                            while (var14 < 104 && (var6 & class80.field1757[var10][var12][var14 + 1]) != 0) {
                                var14++;
                            }
                            label358: while (var15 > 0) {
                                for (int var17 = var13; var17 <= var14; var17++) {
                                    if ((class80.field1757[var15 - 1][var12][var17] & var6) == 0) {
                                        break label358;
                                    }
                                }
                                var15--;
                            }
                            label347: while (var9 > var16) {
                                for (int var18 = var13; var18 <= var14; var18++) {
                                    if ((var6 & class80.field1757[var16 + 1][var12][var18]) == 0) {
                                        break label347;
                                    }
                                }
                                var16++;
                            }
                            int var19 = (var14 + 1 - var13) * (var16 - (var15 - 1));
                            if (var19 >= 8) {
                                short var20 = 240;
                                int var21 = class142.field3253[var16][var12][var13] - var20;
                                int var22 = class142.field3253[var15][var12][var13];
                                class51.method350(var9, 1, var12 * 128, var12 * 128, var13 * 128, var14 * 128 + 128, var21, var22);
                                for (int var23 = var15; var23 <= var16; var23++) {
                                    for (int var24 = var13; var24 <= var14; var24++) {
                                        class80.field1757[var23][var12][var24] = class34.method213(class80.field1757[var23][var12][var24], ~var6);
                                    }
                                }
                            }
                        }
                        if ((class80.field1757[var10][var12][var11] & var8) != 0) {
                            int var25 = var12;
                            int var26 = var12;
                            int var27 = var10;
                            while (var26 < 104 && (var8 & class80.field1757[var10][var26 + 1][var11]) != 0) {
                                var26++;
                            }
                            while (var25 > 0 && (class80.field1757[var10][var25 - 1][var11] & var8) != 0) {
                                var25--;
                            }
                            int var28 = var10;
                            label411: while (var27 > 0) {
                                for (int var29 = var25; var29 <= var26; var29++) {
                                    if ((var8 & class80.field1757[var27 - 1][var29][var11]) == 0) {
                                        break label411;
                                    }
                                }
                                var27--;
                            }
                            label400: while (var28 < var9) {
                                for (int var30 = var25; var30 <= var26; var30++) {
                                    if ((class80.field1757[var28 + 1][var30][var11] & var8) == 0) {
                                        break label400;
                                    }
                                }
                                var28++;
                            }
                            int var31 = (var28 + 1 - var27) * (var26 + 1 - var25);
                            if (var31 >= 8) {
                                short var32 = 240;
                                int var33 = class142.field3253[var27][var25][var11];
                                int var34 = class142.field3253[var28][var25][var11] - var32;
                                class51.method350(var9, 2, var25 * 128, var26 * 128 + 128, var11 * 128, var11 * 128, var34, var33);
                                for (int var35 = var27; var35 <= var28; var35++) {
                                    for (int var36 = var25; var36 <= var26; var36++) {
                                        class80.field1757[var35][var36][var11] = class34.method213(class80.field1757[var35][var36][var11], ~var8);
                                    }
                                }
                            }
                        }
                        if ((var7 & class80.field1757[var10][var12][var11]) != 0) {
                            int var37 = var12;
                            int var38 = var12;
                            int var39 = var11;
                            int var40;
                            for (var40 = var11; var40 < 104 && (var7 & class80.field1757[var10][var12][var40 + 1]) != 0; var40++) {
                            }
                            while (var39 > 0 && (var7 & class80.field1757[var10][var12][var39 - 1]) != 0) {
                                var39--;
                            }
                            label465: while (var37 > 0) {
                                for (int var41 = var39; var41 <= var40; var41++) {
                                    if ((var7 & class80.field1757[var10][var37 - 1][var41]) == 0) {
                                        break label465;
                                    }
                                }
                                var37--;
                            }
                            label454: while (var38 < 104) {
                                for (int var42 = var39; var42 <= var40; var42++) {
                                    if ((class80.field1757[var10][var38 + 1][var42] & var7) == 0) {
                                        break label454;
                                    }
                                }
                                var38++;
                            }
                            if ((var38 + 1 - var37) * (var40 + 1 - var39) >= 4) {
                                int var43 = class142.field3253[var10][var37][var39];
                                class51.method350(var9, 4, var37 * 128, var38 * 128 + 128, var39 * 128, var40 * 128 + 128, var43, var43);
                                for (int var44 = var37; var44 <= var38; var44++) {
                                    for (int var45 = var39; var45 <= var40; var45++) {
                                        class80.field1757[var10][var44][var45] = class34.method213(class80.field1757[var10][var44][var45], ~var7);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!arg1) {
            method160((byte) -18, null);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(B)V")
    public static void method162(byte arg0) {
        field425 = null;
        field421 = null;
        field419 = null;
        int var1 = 16 % ((arg0 - 72) / 52);
        field426 = null;
        field428 = null;
        field417 = null;
        field424 = null;
    }

    @OriginalMember(owner = "client!da", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field410++;
    }

    @OriginalMember(owner = "client!da", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        field413++;
        if (class64.field1263 == null) {
            return;
        }
        class97.field2172 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < class147.field3369.length) {
            var3 = class147.field3369[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (class83.field1838 >= 0 && var3 >= 0) {
            class68.field1367[class83.field1838] = var3;
            class83.field1838 = class83.field1838 + 1 & 0x7F;
            if (class83.field1838 == class152.field3490) {
                class83.field1838 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = class126.field2760 + 1 & 0x7F;
            if (class121.field2718 != var4) {
                class144.field3317[class126.field2760] = var3;
                class25.field455[class126.field2760] = -1;
                class126.field2760 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!da", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        field411++;
        int var2 = class155.method1181(arg0, (byte) 127);
        if (var2 >= 0) {
            int var3 = class126.field2760 + 1 & 0x7F;
            if (class121.field2718 != var3) {
                class144.field3317[class126.field2760] = -1;
                class25.field455[class126.field2760] = var2;
                class126.field2760 = var3;
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!da", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field422++;
        if (class64.field1263 != null) {
            class83.field1838 = -1;
        }
    }

    @OriginalMember(owner = "client!da", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        field427++;
        if (class64.field1263 != null) {
            class97.field2172 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class147.field3369.length > var2) {
                var3 = class147.field3369[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class83.field1838 >= 0 && var3 >= 0) {
                class68.field1367[class83.field1838] = ~var3;
                class83.field1838 = class83.field1838 + 1 & 0x7F;
                if (class83.field1838 == class152.field3490) {
                    class83.field1838 = -1;
                }
            }
        }
        arg0.consume();
    }
}
