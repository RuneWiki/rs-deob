import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class115 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "Lmb;")
    public static class84 field2747 = class79.method672(true, " @whi@(X");

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
    public static int field2745 = 0;

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "Lmb;")
    private static class84 field2752 = class79.method672(true, "Your account is already logged in)3");

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "[Lkc;")
    public static class72[] field2746 = new class72[50];

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "Lmb;")
    public static class84 field2749 = field2752;

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "Lmb;")
    public static class84 field2748 = class79.method672(true, "System)2Update in: ");

    @OriginalMember(owner = "client!rc", name = "r", descriptor = "Z")
    public static boolean field2762 = false;

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "Lmb;")
    public static class84 field2751 = class79.method672(true, "l");

    @OriginalMember(owner = "client!rc", name = "p", descriptor = "I")
    public static int field2760 = 0;

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "Lmb;")
    public static class84 field2753 = class79.method672(true, "welle2:");

    @OriginalMember(owner = "client!rc", name = "v", descriptor = "Lmb;")
    private static class84 field2766 = class79.method672(true, "Please wait)3)3)3");

    @OriginalMember(owner = "client!rc", name = "D", descriptor = "Lmb;")
    public static class84 field2774 = field2766;

    @OriginalMember(owner = "client!rc", name = "u", descriptor = "[I")
    public static int[] field2765 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!rc", name = "F", descriptor = "Lmb;")
    public static class84 field2776 = field2766;

    @OriginalMember(owner = "client!rc", name = "t", descriptor = "Lmb;")
    public static class84 field2764 = class79.method672(true, "redstone2");

    @OriginalMember(owner = "client!rc", name = "G", descriptor = "Lmb;")
    private static class84 field2777 = class79.method672(true, "Please wait )2 attempting to reestablish");

    @OriginalMember(owner = "client!rc", name = "s", descriptor = "Lmb;")
    public static class84 field2763 = field2777;

    @OriginalMember(owner = "client!rc", name = "w", descriptor = "Lmb;")
    public static class84 field2767 = class79.method672(true, "compass");

    @OriginalMember(owner = "client!rc", name = "n", descriptor = "Lca;")
    public static class16 field2758 = new class16();

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "I")
    public static int field2750;

    @OriginalMember(owner = "client!rc", name = "k", descriptor = "I")
    public static int field2755;

    @OriginalMember(owner = "client!rc", name = "l", descriptor = "I")
    public static int field2756;

    @OriginalMember(owner = "client!rc", name = "m", descriptor = "I")
    public static int field2757;

    @OriginalMember(owner = "client!rc", name = "o", descriptor = "I")
    public static int field2759;

    @OriginalMember(owner = "client!rc", name = "q", descriptor = "I")
    public static int field2761;

    @OriginalMember(owner = "client!rc", name = "x", descriptor = "I")
    public static int field2768;

    @OriginalMember(owner = "client!rc", name = "y", descriptor = "I")
    public static int field2769;

    @OriginalMember(owner = "client!rc", name = "A", descriptor = "I")
    public static int field2771;

    @OriginalMember(owner = "client!rc", name = "B", descriptor = "I")
    public static int field2772;

    @OriginalMember(owner = "client!rc", name = "C", descriptor = "I")
    public static int field2773;

    @OriginalMember(owner = "client!rc", name = "E", descriptor = "I")
    public static int field2775;

    @OriginalMember(owner = "client!rc", name = "H", descriptor = "I")
    public static int field2778;

    @OriginalMember(owner = "client!rc", name = "I", descriptor = "I")
    public static int field2779;

    @OriginalMember(owner = "client!rc", name = "z", descriptor = "Lwe;")
    public static class147 field2770;

    @OriginalMember(owner = "client!rc", name = "j", descriptor = "[Lsc;")
    public static class121[] field2754;

    @OriginalMember(owner = "client!rc", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class88.field2209 != null) {
            class62.field1544 = 0;
            class6.field115 = arg0.getX();
            class83.field2046 = arg0.getY();
        }
        field2757++;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Li;I[Ljc;)V")
    public static final void method942(class56 arg0, int arg1, class65[] arg2) {
        field2771++;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var110 = 0; var110 < 104; var110++) {
                for (int var111 = 0; var111 < 104; var111++) {
                    if ((class62.field1540[var3][var110][var111] & 0x1) == 1) {
                        int var112 = var3;
                        if ((class62.field1540[1][var110][var111] & 0x2) == 2) {
                            var112 = var3 - 1;
                        }
                        if (var112 >= 0) {
                            arg2[var112].method589(var111, (byte) -114, var110);
                        }
                    }
                }
            }
        }
        class69.field1691 += (int) (Math.random() * 5.0D) - 2;
        class90.field2247 += (int) (Math.random() * 5.0D) - 2;
        if (class90.field2247 < -8) {
            class90.field2247 = -8;
        }
        if (class90.field2247 > 8) {
            class90.field2247 = 8;
        }
        if (class69.field1691 < -16) {
            class69.field1691 = -16;
        }
        if (class69.field1691 > 16) {
            class69.field1691 = 16;
        }
        for (int var4 = 0; var4 < 4; var4++) {
            byte[][] var47 = class65.field1604[var4];
            int var48 = (int) Math.sqrt(5100.0D);
            int var49 = var48 * 768 >> 8;
            for (int var50 = 1; var50 < 103; var50++) {
                for (int var101 = 1; var101 < 103; var101++) {
                    int var102 = class52.field1168[var4][var101 + 1][var50] - class52.field1168[var4][var101 - 1][var50];
                    int var103 = class52.field1168[var4][var101][var50 + 1] - class52.field1168[var4][var101][var50 - 1];
                    int var104 = (int) Math.sqrt((double) (var103 * var103 + var102 * var102 + 65536));
                    int var105 = 65536 / var104;
                    int var106 = (var102 << 8) / var104;
                    int var107 = (var103 << 8) / var104;
                    int var108 = (var106 * -50 + var105 * -10 + var107 * -50) / var49 + 96;
                    int var109 = (var47[var101][var50] >> 1) + ((var47[var101 - 1][var50] >> 2) + (var47[var101 + 1][var50] >> 3)) + (var47[var101][var50 + -1] >> 2) + (var47[var101][var50 + 1] >> 3);
                    class66.field1634[var101][var50] = var108 - var109;
                }
            }
            for (int var51 = 0; var51 < 104; var51++) {
                class2.field51[var51] = 0;
                class136.field3245[var51] = 0;
                class118.field2832[var51] = 0;
                class44.field977[var51] = 0;
                class90.field2265[var51] = 0;
            }
            for (int var52 = -5; var52 < 109; var52++) {
                for (int var55 = 0; var55 < 104; var55++) {
                    int var95 = var52 + 5;
                    int var10002;
                    if (var95 >= 0 && var95 < 104) {
                        int var96 = class136.field3263[var4][var95][var55] & 0xFF;
                        if (var96 > 0) {
                            class24 var97 = class19.method125((byte) -91, var96 - 1);
                            class2.field51[var55] += var97.field548;
                            class136.field3245[var55] += var97.field570;
                            class118.field2832[var55] += var97.field575;
                            class44.field977[var55] += var97.field552;
                            var10002 = class90.field2265[var55]++;
                        }
                    }
                    int var98 = var52 - 5;
                    if (var98 >= 0 && var98 < 104) {
                        int var99 = class136.field3263[var4][var98][var55] & 0xFF;
                        if (var99 > 0) {
                            class24 var100 = class19.method125((byte) -106, var99 - 1);
                            class2.field51[var55] -= var100.field548;
                            class136.field3245[var55] -= var100.field570;
                            class118.field2832[var55] -= var100.field575;
                            class44.field977[var55] -= var100.field552;
                            var10002 = class90.field2265[var55]--;
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
                            var59 += class90.field2265[var62];
                            var57 += class118.field2832[var62];
                            var56 += class2.field51[var62];
                            var60 += class44.field977[var62];
                            var58 += class136.field3245[var62];
                        }
                        int var63 = var61 - 5;
                        if (var63 >= 0 && var63 < 104) {
                            var59 -= class90.field2265[var63];
                            var56 -= class2.field51[var63];
                            var58 -= class136.field3245[var63];
                            var57 -= class118.field2832[var63];
                            var60 -= class44.field977[var63];
                        }
                        if (var61 >= 1 && var61 < 103 && (!class124.field3012 || (class62.field1540[0][var52][var61] & 0x2) != 0 || (class62.field1540[var4][var52][var61] & 0x10) == 0 && class145.method1182(var61, var4, var52, (byte) -65) == class119.field2842)) {
                            if (class41.field928 > var4) {
                                class41.field928 = var4;
                            }
                            int var64 = class136.field3263[var4][var52][var61] & 0xFF;
                            int var65 = class106.field2569[var4][var52][var61] & 0xFF;
                            if (var64 > 0 || var65 > 0) {
                                int var66 = class52.field1168[var4][var52][var61];
                                int var67 = class52.field1168[var4][var52 + 1][var61];
                                int var68 = class52.field1168[var4][var52 + 1][var61 + 1];
                                int var69 = class52.field1168[var4][var52][var61 + 1];
                                int var70 = class66.field1634[var52][var61];
                                int var71 = class66.field1634[var52 + 1][var61];
                                int var72 = class66.field1634[var52][var61 + 1];
                                int var73 = -1;
                                int var74 = class66.field1634[var52 + 1][var61 + 1];
                                int var75 = -1;
                                if (var64 > 0) {
                                    int var76 = var56 * 256 / var60;
                                    int var77 = var57 / var59;
                                    int var78 = var58 / var59;
                                    var73 = class140.method1138(var77, -1986147609, var78, var76);
                                    int var79 = class69.field1691 + var77;
                                    if (var79 < 0) {
                                        var79 = 0;
                                    } else if (var79 > 255) {
                                        var79 = 255;
                                    }
                                    int var80 = class90.field2247 + var76 & 0xFF;
                                    var75 = class140.method1138(var79, -1986147609, var78, var80);
                                }
                                if (var4 > 0) {
                                    boolean var81 = true;
                                    if (var64 == 0 && class41.field929[var4][var52][var61] != 0) {
                                        var81 = false;
                                    }
                                    if (var65 > 0 && !class53.method446((byte) 103, var65 - 1).field185) {
                                        var81 = false;
                                    }
                                    if (var81 && var66 == var67 && var66 == var68 && var66 == var69) {
                                        class52.field1163[var4][var52][var61] = class24.method166(class52.field1163[var4][var52][var61], 2340);
                                    }
                                }
                                int var82 = 0;
                                if (var75 != -1) {
                                    var82 = class104.field2518[class47.method346(-103, 96, var75)];
                                }
                                if (var65 == 0) {
                                    arg0.method456(var4, var52, var61, 0, 0, -1, var66, var67, var68, var69, class47.method346(-104, var70, var73), class47.method346(-115, var71, var73), class47.method346(-123, var74, var73), class47.method346(-111, var72, var73), 0, 0, 0, 0, var82, 0);
                                } else {
                                    byte var83 = class95.field2353[var4][var52][var61];
                                    int var84 = class41.field929[var4][var52][var61] + 1;
                                    class11 var85 = class53.method446((byte) 103, var65 - 1);
                                    int var86 = var85.field193;
                                    int var87;
                                    int var90;
                                    if (var86 >= 0) {
                                        var90 = class104.field2528.method70(-25101, var86);
                                        var87 = -1;
                                    } else if (var85.field189 == 16711935) {
                                        var90 = -2;
                                        var86 = -1;
                                        var87 = -2;
                                    } else {
                                        var87 = class140.method1138(var85.field204, -1986147609, var85.field195, var85.field188);
                                        int var88 = class90.field2247 + var85.field188 & 0xFF;
                                        int var89 = var85.field204 + class69.field1691;
                                        if (var89 < 0) {
                                            var89 = 0;
                                        } else if (var89 > 255) {
                                            var89 = 255;
                                        }
                                        var90 = class140.method1138(var89, -1986147609, var85.field195, var88);
                                    }
                                    int var91 = 0;
                                    if (var90 != -2) {
                                        var91 = class104.field2518[class140.method1135(96, (byte) -82, var90)];
                                    }
                                    if (var85.field203 != -1) {
                                        int var92 = class90.field2247 + var85.field199 & 0xFF;
                                        int var93 = var85.field178 + class69.field1691;
                                        if (var93 < 0) {
                                            var93 = 0;
                                        } else if (var93 > 255) {
                                            var93 = 255;
                                        }
                                        int var94 = class140.method1138(var93, -1986147609, var85.field196, var92);
                                        var91 = class104.field2518[class140.method1135(96, (byte) -82, var94)];
                                    }
                                    arg0.method456(var4, var52, var61, var84, var83, var86, var66, var67, var68, var69, class47.method346(-123, var70, var73), class47.method346(-114, var71, var73), class47.method346(-102, var74, var73), class47.method346(-122, var72, var73), class140.method1135(var70, (byte) -82, var87), class140.method1135(var71, (byte) -82, var87), class140.method1135(var74, (byte) -82, var87), class140.method1135(var72, (byte) -82, var87), var82, var91);
                                }
                            }
                        }
                    }
                }
            }
            for (int var53 = 1; var53 < 103; var53++) {
                for (int var54 = 1; var54 < 103; var54++) {
                    arg0.method498(var4, var54, var53, class145.method1182(var53, var4, var54, (byte) -46));
                }
            }
            class136.field3263[var4] = null;
            class106.field2569[var4] = null;
            class41.field929[var4] = null;
            class95.field2353[var4] = null;
            class65.field1604[var4] = null;
        }
        arg0.method500(-50, -10, -50);
        for (int var5 = 0; var5 < 104; var5++) {
            for (int var46 = 0; var46 < 104; var46++) {
                if ((class62.field1540[1][var5][var46] & 0x2) == 2) {
                    arg0.method476(var5, var46);
                }
            }
        }
        int var6 = 1;
        if (arg1 >= -111) {
            method944(6);
        }
        int var7 = 4;
        int var8 = 2;
        for (int var9 = 0; var9 < 4; var9++) {
            if (var9 > 0) {
                var8 <<= 0x3;
                var7 <<= 0x3;
                var6 <<= 0x3;
            }
            for (int var10 = 0; var10 <= var9; var10++) {
                for (int var11 = 0; var11 <= 104; var11++) {
                    for (int var12 = 0; var12 <= 104; var12++) {
                        if ((class52.field1163[var10][var12][var11] & var6) != 0) {
                            int var13;
                            for (var13 = var11; var13 < 104 && (class52.field1163[var10][var12][var13 + 1] & var6) != 0; var13++) {
                            }
                            int var14 = var10;
                            int var15 = var11;
                            int var16 = var10;
                            while (var15 > 0 && (var6 & class52.field1163[var10][var12][var15 - 1]) != 0) {
                                var15--;
                            }
                            label356: while (var14 > 0) {
                                for (int var17 = var15; var17 <= var13; var17++) {
                                    if ((class52.field1163[var14 - 1][var12][var17] & var6) == 0) {
                                        break label356;
                                    }
                                }
                                var14--;
                            }
                            label345: while (var9 > var16) {
                                for (int var18 = var15; var18 <= var13; var18++) {
                                    if ((var6 & class52.field1163[var16 + 1][var12][var18]) == 0) {
                                        break label345;
                                    }
                                }
                                var16++;
                            }
                            int var19 = (var13 + 1 - var15) * (var16 + 1 - var14);
                            if (var19 >= 8) {
                                short var20 = 240;
                                int var21 = class52.field1168[var16][var12][var15] - var20;
                                int var22 = class52.field1168[var14][var12][var15];
                                class56.method479(var9, 1, var12 * 128, var12 * 128, var15 * 128, var13 * 128 + 128, var21, var22);
                                for (int var23 = var14; var23 <= var16; var23++) {
                                    for (int var24 = var15; var24 <= var13; var24++) {
                                        class52.field1163[var23][var12][var24] = client.method144(class52.field1163[var23][var12][var24], ~var6);
                                    }
                                }
                            }
                        }
                        if ((class52.field1163[var10][var12][var11] & var8) != 0) {
                            int var25 = var12;
                            int var26 = var12;
                            while (var25 < 104 && (class52.field1163[var10][var25 + 1][var11] & var8) != 0) {
                                var25++;
                            }
                            while (var26 > 0 && (var8 & class52.field1163[var10][var26 - 1][var11]) != 0) {
                                var26--;
                            }
                            int var27 = var10;
                            int var28;
                            label410: for (var28 = var10; var28 > 0; var28--) {
                                for (int var29 = var26; var29 <= var25; var29++) {
                                    if ((var8 & class52.field1163[var28 - 1][var29][var11]) == 0) {
                                        break label410;
                                    }
                                }
                            }
                            label399: while (var27 < var9) {
                                for (int var30 = var26; var30 <= var25; var30++) {
                                    if ((class52.field1163[var27 + 1][var30][var11] & var8) == 0) {
                                        break label399;
                                    }
                                }
                                var27++;
                            }
                            int var31 = (var25 + 1 - var26) * (var27 + 1 - var28);
                            if (var31 >= 8) {
                                short var32 = 240;
                                int var33 = class52.field1168[var28][var26][var11];
                                int var34 = class52.field1168[var27][var26][var11] - var32;
                                class56.method479(var9, 2, var26 * 128, var25 * 128 + 128, var11 * 128, var11 * 128, var34, var33);
                                for (int var35 = var28; var35 <= var27; var35++) {
                                    for (int var36 = var26; var36 <= var25; var36++) {
                                        class52.field1163[var35][var36][var11] = client.method144(class52.field1163[var35][var36][var11], ~var8);
                                    }
                                }
                            }
                        }
                        if ((class52.field1163[var10][var12][var11] & var7) != 0) {
                            int var37;
                            for (var37 = var11; var37 > 0 && (var7 & class52.field1163[var10][var12][var37 - 1]) != 0; var37--) {
                            }
                            int var38 = var11;
                            int var39 = var12;
                            while (var38 < 104 && (class52.field1163[var10][var12][var38 + 1] & var7) != 0) {
                                var38++;
                            }
                            int var40;
                            label464: for (var40 = var12; var40 > 0; var40--) {
                                for (int var41 = var37; var41 <= var38; var41++) {
                                    if ((var7 & class52.field1163[var10][var40 - 1][var41]) == 0) {
                                        break label464;
                                    }
                                }
                            }
                            label453: while (var39 < 104) {
                                for (int var42 = var37; var42 <= var38; var42++) {
                                    if ((class52.field1163[var10][var39 + 1][var42] & var7) == 0) {
                                        break label453;
                                    }
                                }
                                var39++;
                            }
                            if ((var38 + 1 - var37) * (-var40 + 1 + var39) >= 4) {
                                int var43 = class52.field1168[var10][var40][var37];
                                class56.method479(var9, 4, var40 * 128, var39 * 128 + 128, var37 * 128, var38 * 128 + 128, var43, var43);
                                for (int var44 = var40; var44 <= var39; var44++) {
                                    for (int var45 = var37; var45 <= var38; var45++) {
                                        class52.field1163[var10][var44][var45] = client.method144(class52.field1163[var10][var44][var45], ~var7);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rc", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field2772++;
        if (class88.field2209 != null) {
            class62.field1544 = 0;
            class6.field115 = arg0.getX();
            class83.field2046 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!rc", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        field2778++;
        if (class88.field2209 != null) {
            class62.field1544 = 0;
            class6.field115 = -1;
            class83.field2046 = -1;
        }
    }

    @OriginalMember(owner = "client!rc", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field2755++;
        if (class88.field2209 != null) {
            class109.field2644 = 0;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Z)V")
    public static final void method943(boolean arg0) {
        field2779++;
        if (class125.field3030 != null) {
            class125.field3030.method38((byte) 61);
            class125.field3030 = null;
        }
        class87.method746((byte) -109);
        class133.field3173.method485();
        for (int var1 = 0; var1 < 4; var1++) {
            class65.field1603[var1].method592(73);
        }
        System.gc();
        class16.method97(5, 2);
        class90.field2244 = -1;
        class76.field1920 = arg0;
        class120.method972(1);
        class51.method387(119, 10);
    }

    @OriginalMember(owner = "client!rc", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field2761++;
        if (class88.field2209 != null) {
            class62.field1544 = 0;
            class109.field2644 = 0;
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!rc", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field2756++;
        if (class88.field2209 != null) {
            class62.field1544 = 0;
            class6.field115 = arg0.getX();
            class83.field2046 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V")
    public static final void method944(int arg0) {
        class11.field181 = null;
        class134.field3213 = null;
        class125.field3032 = null;
        class107.field2599 = null;
        if (arg0 >= -72) {
            field2745 = -103;
        }
        client.field459 = null;
        field2773++;
        class133.field3162 = null;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILmb;Lsd;Lmb;)[Lsc;")
    public static final class121[] method945(int arg0, class84 arg1, class122 arg2, class84 arg3) {
        field2750++;
        if (arg0 <= 25) {
            field2774 = null;
        }
        int var4 = arg2.method997(49, arg1);
        int var5 = arg2.method1004(false, arg3, var4);
        return class124.method1021(var4, arg2, -1601600880, var5);
    }

    @OriginalMember(owner = "client!rc", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        field2775++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!rc", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field2759++;
        if (class88.field2209 != null) {
            class62.field1544 = 0;
            class129.field3119 = arg0.getX();
            class86.field2120 = arg0.getY();
            class59.field1473 = class77.method657(3745);
            if (arg0.isMetaDown()) {
                class49.field1043 = 2;
                class109.field2644 = 2;
            } else {
                class49.field1043 = 1;
                class109.field2644 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(I)V")
    public static void method946(int arg0) {
        field2748 = null;
        field2753 = null;
        field2763 = null;
        field2752 = null;
        field2758 = null;
        field2747 = null;
        field2767 = null;
        field2749 = null;
        field2765 = null;
        field2746 = null;
        if (arg0 > -7) {
            method945(-39, null, null, null);
        }
        field2766 = null;
        field2777 = null;
        field2754 = null;
        field2751 = null;
        field2770 = null;
        field2774 = null;
        field2764 = null;
        field2776 = null;
    }

    @OriginalMember(owner = "client!rc", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field2769++;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILhb;)Lmb;")
    public static final class84 method947(int arg0, class51 arg1) {
        if (arg0 != 32767) {
            field2749 = null;
        }
        field2768++;
        return class41.method312(32767, (byte) 115, arg1);
    }
}
