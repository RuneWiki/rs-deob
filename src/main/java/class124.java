import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class124 implements Runnable {

    @OriginalMember(owner = "client!rf", name = "n", descriptor = "I")
    private int field2823 = 0;

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "Z")
    private boolean field2814 = false;

    @OriginalMember(owner = "client!rf", name = "h", descriptor = "Z")
    private boolean field2817 = false;

    @OriginalMember(owner = "client!rf", name = "r", descriptor = "I")
    private int field2827 = 0;

    @OriginalMember(owner = "client!rf", name = "o", descriptor = "Lfe;")
    private class41 field2824;

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "Ljava/net/Socket;")
    private Socket field2813;

    @OriginalMember(owner = "client!rf", name = "w", descriptor = "Ljava/io/InputStream;")
    private InputStream field2832;

    @OriginalMember(owner = "client!rf", name = "m", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field2822;

    @OriginalMember(owner = "client!rf", name = "i", descriptor = "I")
    public static int field2818 = 0;

    @OriginalMember(owner = "client!rf", name = "x", descriptor = "Lja;")
    public static class62 field2833 = class30.method243(43, "<col=ff9040>");

    @OriginalMember(owner = "client!rf", name = "k", descriptor = "Ljf;")
    public static class68 field2820 = new class68(32);

    @OriginalMember(owner = "client!rf", name = "A", descriptor = "[I")
    public static int[] field2836 = new int[500];

    @OriginalMember(owner = "client!rf", name = "z", descriptor = "Lja;")
    public static class62 field2835 = null;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "I")
    public static int field2810;

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "I")
    public static int field2812;

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "I")
    public static int field2815;

    @OriginalMember(owner = "client!rf", name = "j", descriptor = "I")
    public static int field2819;

    @OriginalMember(owner = "client!rf", name = "l", descriptor = "I")
    public static int field2821;

    @OriginalMember(owner = "client!rf", name = "p", descriptor = "I")
    public static int field2825;

    @OriginalMember(owner = "client!rf", name = "q", descriptor = "I")
    public static int field2826;

    @OriginalMember(owner = "client!rf", name = "s", descriptor = "I")
    public static int field2828;

    @OriginalMember(owner = "client!rf", name = "t", descriptor = "I")
    public static int field2829;

    @OriginalMember(owner = "client!rf", name = "u", descriptor = "I")
    public static int field2830;

    @OriginalMember(owner = "client!rf", name = "v", descriptor = "I")
    public static int field2831;

    @OriginalMember(owner = "client!rf", name = "y", descriptor = "I")
    public static int field2834;

    @OriginalMember(owner = "client!rf", name = "B", descriptor = "Lsb;")
    public static class126 field2837;

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "Lcf;")
    private class21 field2816;

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "[B")
    private byte[] field2811;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lic;IIIII)V")
    public static final void method973(class58 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2830++;
        int var6 = arg3 * arg3 + arg2 * arg2;
        if (var6 > 4225 && var6 < 90000) {
            int var7 = class62.field1495 + class50.field1162 & 0x7FF;
            int var8 = class66.field1658[var7];
            int var9 = var8 * 256 / (class128.field2909 + 256);
            int var10 = class66.field1647[var7];
            int var11 = var10 * 256 / (class128.field2909 + 256);
            int var12 = arg2 * var9 - arg3 * var11 >> 16;
            int var13 = arg2 * var11 + arg3 * var9 >> 16;
            double var14 = Math.atan2((double) var13, (double) var12);
            int var16 = (int) (Math.sin(var14) * 63.0D);
            int var17 = (int) (Math.cos(var14) * 57.0D);
            class134.field3069.method398(arg1 + var16 + 98 - 10, arg4 + 83 + -var17 - 20, 20, 20, 15, 15, var14, 256);
        } else {
            class36.method275(arg3, arg0, arg4, arg5 - 3196, arg1, arg2);
        }
        if (arg5 != 3200) {
            method976(null, -116);
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(III[B)V")
    public final void method974(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field2826++;
        if (this.field2814) {
            return;
        }
        while (arg0 > 0) {
            int var5 = this.field2832.read(arg3, arg1, arg0);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg0 -= var5;
            arg1 += var5;
        }
        if (arg2 >= -55) {
            method980((byte) -56);
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "([Lwe;Lka;I)V")
    public static final void method975(class155[] arg0, class69 arg1, int arg2) {
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var110 = 0; var110 < 104; var110++) {
                for (int var111 = 0; var111 < 104; var111++) {
                    if ((class155.field3581[var3][var110][var111] & 0x1) == 1) {
                        int var112 = var3;
                        if ((class155.field3581[1][var110][var111] & 0x2) == 2) {
                            var112 = var3 - 1;
                        }
                        if (var112 >= 0) {
                            arg0[var112].method1202(var111, -121, var110);
                        }
                    }
                }
            }
        }
        class54.field1346 += (int) (Math.random() * 5.0D) - 2;
        field2828++;
        class52.field1187 += (int) (Math.random() * 5.0D) - 2;
        if (class54.field1346 < -16) {
            class54.field1346 = -16;
        }
        if (class54.field1346 > 16) {
            class54.field1346 = 16;
        }
        if (class52.field1187 < -8) {
            class52.field1187 = -8;
        }
        if (arg2 > -113) {
            return;
        }
        if (class52.field1187 > 8) {
            class52.field1187 = 8;
        }
        for (int var4 = 0; var4 < 4; var4++) {
            byte[][] var47 = class15.field369[var4];
            int var48 = (int) Math.sqrt(5100.0D);
            int var49 = var48 * 768 >> 8;
            for (int var50 = 1; var50 < 103; var50++) {
                for (int var101 = 1; var101 < 103; var101++) {
                    int var102 = class7.field214[var4][var101][var50 + 1] - class7.field214[var4][var101][var50 - 1];
                    int var103 = class7.field214[var4][var101 + 1][var50] - class7.field214[var4][var101 - 1][var50];
                    int var104 = (int) Math.sqrt((double) (var102 * var102 + var103 * var103 + 65536));
                    int var105 = (var103 << 8) / var104;
                    int var106 = 65536 / var104;
                    int var107 = (var102 << 8) / var104;
                    int var108 = (var106 * -10 + var105 * -50 + var107 * -50) / var49 + 96;
                    int var109 = (var47[var101][var50 + 1] >> 3) + (var47[var101][var50 - 1] >> 2) + (var47[var101 + -1][var50] >> 2) + (var47[var101 - -1][var50] >> 3) + (var47[var101][var50] >> 1);
                    class81.field1964[var101][var50] = var108 - var109;
                }
            }
            for (int var51 = 0; var51 < 104; var51++) {
                class38.field888[var51] = 0;
                class153.field3575[var51] = 0;
                class26.field633[var51] = 0;
                class119.field2734[var51] = 0;
                class147.field3479[var51] = 0;
            }
            for (int var52 = -5; var52 < 109; var52++) {
                for (int var55 = 0; var55 < 104; var55++) {
                    int var95 = var52 + 5;
                    int var10002;
                    if (var95 >= 0 && var95 < 104) {
                        int var96 = class81.field1966[var4][var95][var55] & 0xFF;
                        if (var96 > 0) {
                            class96 var97 = class108.method863(var96 - 1, -306674912);
                            class38.field888[var55] += var97.field2230;
                            class153.field3575[var55] += var97.field2237;
                            class26.field633[var55] += var97.field2233;
                            class119.field2734[var55] += var97.field2229;
                            var10002 = class147.field3479[var55]++;
                        }
                    }
                    int var98 = var52 - 5;
                    if (var98 >= 0 && var98 < 104) {
                        int var99 = class81.field1966[var4][var98][var55] & 0xFF;
                        if (var99 > 0) {
                            class96 var100 = class108.method863(var99 - 1, -306674912);
                            class38.field888[var55] -= var100.field2230;
                            class153.field3575[var55] -= var100.field2237;
                            class26.field633[var55] -= var100.field2233;
                            class119.field2734[var55] -= var100.field2229;
                            var10002 = class147.field3479[var55]--;
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
                        int var63 = var61 - 5;
                        if (var62 >= 0 && var62 < 104) {
                            var60 += class147.field3479[var62];
                            var58 += class26.field633[var62];
                            var56 += class38.field888[var62];
                            var59 += class119.field2734[var62];
                            var57 += class153.field3575[var62];
                        }
                        if (var63 >= 0 && var63 < 104) {
                            var56 -= class38.field888[var63];
                            var57 -= class153.field3575[var63];
                            var58 -= class26.field633[var63];
                            var60 -= class147.field3479[var63];
                            var59 -= class119.field2734[var63];
                        }
                        if (var61 >= 1 && var61 < 103 && (!class144.field3361 || (class155.field3581[0][var52][var61] & 0x2) != 0 || (class155.field3581[var4][var52][var61] & 0x10) == 0 && class16.method112(var52, var61, var4, (byte) 66) == class53.field1221)) {
                            if (class84.field2016 > var4) {
                                class84.field2016 = var4;
                            }
                            int var64 = class81.field1966[var4][var52][var61] & 0xFF;
                            int var65 = class53.field1222[var4][var52][var61] & 0xFF;
                            if (var64 > 0 || var65 > 0) {
                                int var66 = class7.field214[var4][var52][var61];
                                int var67 = class7.field214[var4][var52 + 1][var61];
                                int var68 = class7.field214[var4][var52 + 1][var61 + 1];
                                int var69 = class7.field214[var4][var52][var61 + 1];
                                int var70 = class81.field1964[var52][var61];
                                int var71 = class81.field1964[var52 + 1][var61];
                                int var72 = class81.field1964[var52 + 1][var61 + 1];
                                int var73 = class81.field1964[var52][var61 + 1];
                                int var74 = -1;
                                int var75 = -1;
                                if (var64 > 0) {
                                    int var76 = var57 / var60;
                                    int var77 = var56 * 256 / var59;
                                    int var78 = var58 / var60;
                                    var74 = class115.method937(var76, var78, (byte) 112, var77);
                                    int var79 = class54.field1346 + var78;
                                    if (var79 < 0) {
                                        var79 = 0;
                                    } else if (var79 > 255) {
                                        var79 = 255;
                                    }
                                    int var80 = class52.field1187 + var77 & 0xFF;
                                    var75 = class115.method937(var76, var79, (byte) 121, var80);
                                }
                                if (var4 > 0) {
                                    boolean var81 = true;
                                    if (var64 == 0 && class79.field1930[var4][var52][var61] != 0) {
                                        var81 = false;
                                    }
                                    if (var65 > 0 && !class28.method224(7126, var65 - 1).field2391) {
                                        var81 = false;
                                    }
                                    if (var81 && var66 == var67 && var66 == var68 && var66 == var69) {
                                        class83.field1989[var4][var52][var61] = class85.method660(class83.field1989[var4][var52][var61], 2340);
                                    }
                                }
                                int var82 = 0;
                                if (var75 != -1) {
                                    var82 = class66.field1664[class100.method808(96, (byte) -98, var75)];
                                }
                                if (var65 == 0) {
                                    arg1.method586(var4, var52, var61, 0, 0, -1, var66, var67, var68, var69, class100.method808(var70, (byte) -98, var74), class100.method808(var71, (byte) -98, var74), class100.method808(var72, (byte) -98, var74), class100.method808(var73, (byte) -98, var74), 0, 0, 0, 0, var82, 0);
                                } else {
                                    int var83 = class79.field1930[var4][var52][var61] + 1;
                                    byte var84 = class34.field817[var4][var52][var61];
                                    class103 var85 = class28.method224(7126, var65 - 1);
                                    int var86 = var85.field2382;
                                    int var87;
                                    int var88;
                                    if (var86 >= 0) {
                                        var87 = -1;
                                        var88 = class66.field1651.method6(-31744, var86);
                                    } else if (var85.field2403 == 16711935) {
                                        var87 = -2;
                                        var88 = -2;
                                        var86 = -1;
                                    } else {
                                        var87 = class115.method937(var85.field2383, var85.field2397, (byte) 92, var85.field2400);
                                        int var89 = class52.field1187 + var85.field2400 & 0xFF;
                                        int var90 = class54.field1346 + var85.field2397;
                                        if (var90 < 0) {
                                            var90 = 0;
                                        } else if (var90 > 255) {
                                            var90 = 255;
                                        }
                                        var88 = class115.method937(var85.field2383, var90, (byte) 91, var89);
                                    }
                                    int var91 = 0;
                                    if (var88 != -2) {
                                        var91 = class66.field1664[class17.method115((byte) 118, var88, 96)];
                                    }
                                    if (var85.field2392 != -1) {
                                        int var92 = class52.field1187 + var85.field2393 & 0xFF;
                                        int var93 = class54.field1346 + var85.field2401;
                                        if (var93 < 0) {
                                            var93 = 0;
                                        } else if (var93 > 255) {
                                            var93 = 255;
                                        }
                                        int var94 = class115.method937(var85.field2387, var93, (byte) 111, var92);
                                        var91 = class66.field1664[class17.method115((byte) 124, var94, 96)];
                                    }
                                    arg1.method586(var4, var52, var61, var83, var84, var86, var66, var67, var68, var69, class100.method808(var70, (byte) -98, var74), class100.method808(var71, (byte) -98, var74), class100.method808(var72, (byte) -98, var74), class100.method808(var73, (byte) -98, var74), class17.method115((byte) -23, var87, var70), class17.method115((byte) 115, var87, var71), class17.method115((byte) 127, var87, var72), class17.method115((byte) -89, var87, var73), var82, var91);
                                }
                            }
                        }
                    }
                }
            }
            for (int var53 = 1; var53 < 103; var53++) {
                for (int var54 = 1; var54 < 103; var54++) {
                    arg1.method587(var4, var54, var53, class16.method112(var54, var53, var4, (byte) 75));
                }
            }
            class81.field1966[var4] = null;
            class53.field1222[var4] = null;
            class79.field1930[var4] = null;
            class34.field817[var4] = null;
            class15.field369[var4] = null;
        }
        arg1.method568(-50, -10, -50);
        for (int var5 = 0; var5 < 104; var5++) {
            for (int var46 = 0; var46 < 104; var46++) {
                if ((class155.field3581[1][var5][var46] & 0x2) == 2) {
                    arg1.method543(var5, var46);
                }
            }
        }
        int var6 = 1;
        int var7 = 2;
        int var8 = 4;
        for (int var9 = 0; var9 < 4; var9++) {
            if (var9 > 0) {
                var6 <<= 0x3;
                var8 <<= 0x3;
                var7 <<= 0x3;
            }
            for (int var10 = 0; var10 <= var9; var10++) {
                for (int var11 = 0; var11 <= 104; var11++) {
                    for (int var12 = 0; var12 <= 104; var12++) {
                        if ((var6 & class83.field1989[var10][var12][var11]) != 0) {
                            int var13;
                            for (var13 = var11; var13 > 0 && (class83.field1989[var10][var12][var13 - 1] & var6) != 0; var13--) {
                            }
                            int var14 = var11;
                            int var15 = var10;
                            int var16 = var10;
                            while (var14 < 104 && (class83.field1989[var10][var12][var14 + 1] & var6) != 0) {
                                var14++;
                            }
                            label354: while (var16 > 0) {
                                for (int var17 = var13; var17 <= var14; var17++) {
                                    if ((class83.field1989[var16 - 1][var12][var17] & var6) == 0) {
                                        break label354;
                                    }
                                }
                                var16--;
                            }
                            label343: while (var15 < var9) {
                                for (int var18 = var13; var18 <= var14; var18++) {
                                    if ((class83.field1989[var15 + 1][var12][var18] & var6) == 0) {
                                        break label343;
                                    }
                                }
                                var15++;
                            }
                            int var19 = (var15 + 1 - var16) * (var14 + 1 + -var13);
                            if (var19 >= 8) {
                                short var20 = 240;
                                int var21 = class7.field214[var16][var12][var13];
                                int var22 = class7.field214[var15][var12][var13] - var20;
                                class69.method545(var9, 1, var12 * 128, var12 * 128, var13 * 128, var14 * 128 + 128, var22, var21);
                                for (int var23 = var16; var23 <= var15; var23++) {
                                    for (int var24 = var13; var24 <= var14; var24++) {
                                        class83.field1989[var23][var12][var24] = class24.method192(class83.field1989[var23][var12][var24], ~var6);
                                    }
                                }
                            }
                        }
                        if ((class83.field1989[var10][var12][var11] & var7) != 0) {
                            int var25;
                            for (var25 = var12; var25 > 0 && (var7 & class83.field1989[var10][var25 - 1][var11]) != 0; var25--) {
                            }
                            int var26 = var12;
                            int var27 = var10;
                            int var28 = var10;
                            while (var26 < 104 && (var7 & class83.field1989[var10][var26 + 1][var11]) != 0) {
                                var26++;
                            }
                            label408: while (var28 > 0) {
                                for (int var29 = var25; var29 <= var26; var29++) {
                                    if ((var7 & class83.field1989[var28 - 1][var29][var11]) == 0) {
                                        break label408;
                                    }
                                }
                                var28--;
                            }
                            label397: while (var27 < var9) {
                                for (int var30 = var25; var30 <= var26; var30++) {
                                    if ((var7 & class83.field1989[var27 + 1][var30][var11]) == 0) {
                                        break label397;
                                    }
                                }
                                var27++;
                            }
                            int var31 = (var26 + 1 - var25) * (-var28 + 1 + var27);
                            if (var31 >= 8) {
                                short var32 = 240;
                                int var33 = class7.field214[var27][var25][var11] - var32;
                                int var34 = class7.field214[var28][var25][var11];
                                class69.method545(var9, 2, var25 * 128, var26 * 128 + 128, var11 * 128, var11 * 128, var33, var34);
                                for (int var35 = var28; var35 <= var27; var35++) {
                                    for (int var36 = var25; var36 <= var26; var36++) {
                                        class83.field1989[var35][var36][var11] = class24.method192(class83.field1989[var35][var36][var11], ~var7);
                                    }
                                }
                            }
                        }
                        if ((var8 & class83.field1989[var10][var12][var11]) != 0) {
                            int var37 = var12;
                            int var38 = var11;
                            int var39 = var12;
                            int var40;
                            for (var40 = var11; var40 > 0 && (var8 & class83.field1989[var10][var12][var40 - 1]) != 0; var40--) {
                            }
                            while (var38 < 104 && (class83.field1989[var10][var12][var38 + 1] & var8) != 0) {
                                var38++;
                            }
                            label462: while (var39 > 0) {
                                for (int var41 = var40; var41 <= var38; var41++) {
                                    if ((var8 & class83.field1989[var10][var39 - 1][var41]) == 0) {
                                        break label462;
                                    }
                                }
                                var39--;
                            }
                            label451: while (var37 < 104) {
                                for (int var42 = var40; var42 <= var38; var42++) {
                                    if ((class83.field1989[var10][var37 + 1][var42] & var8) == 0) {
                                        break label451;
                                    }
                                }
                                var37++;
                            }
                            if ((var38 + 1 - var40) * (-var39 + var37 + 1) >= 4) {
                                int var43 = class7.field214[var10][var39][var40];
                                class69.method545(var9, 4, var39 * 128, var37 * 128 + 128, var40 * 128, var38 * 128 + 128, var43, var43);
                                for (int var44 = var39; var44 <= var37; var44++) {
                                    for (int var45 = var40; var45 <= var38; var45++) {
                                        class83.field1989[var10][var44][var45] = class24.method192(class83.field1989[var10][var44][var45], ~var8);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lqc;I)V")
    public static final void method976(class113 arg0, int arg1) {
        field2831++;
        Object[] var2 = arg0.field2601;
        int var3 = (Integer) var2[0];
        class47 var4 = class40.method299(true, var3);
        if (var4 == null) {
            return;
        }
        class13.field309 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field1089;
        int[] var9 = var4.field1078;
        if (arg1 >= -88) {
            method973(null, 13, 103, -25, 87, 2);
        }
        byte var10 = -1;
        try {
            class122.field2791 = new class62[var4.field1074];
            class18.field411 = new int[var4.field1076];
            int var11 = 0;
            int var12 = 0;
            for (int var13 = 1; var13 < var2.length; var13++) {
                if (var2[var13] instanceof Integer) {
                    int var14 = (Integer) var2[var13];
                    if (var14 == -2147483647) {
                        var14 = arg0.field2608;
                    }
                    if (var14 == -2147483646) {
                        var14 = arg0.field2607;
                    }
                    if (var14 == -2147483645) {
                        var14 = arg0.field2610 == null ? -1 : arg0.field2610.field1291;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field2605;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field2610 == null ? -1 : arg0.field2610.field1257;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field2606 == null ? -1 : arg0.field2606.field1291;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field2606 == null ? -1 : arg0.field2606.field1257;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field2600;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field2599;
                    }
                    class18.field411[var12++] = var14;
                } else if (var2[var13] instanceof class62) {
                    class62 var15 = (class62) var2[var13];
                    if (var15.method475(53, class65.field1628)) {
                        var15 = arg0.field2612;
                    }
                    class122.field2791[var11++] = var15;
                }
            }
            int var16 = 0;
            label1947: while (true) {
                var16++;
                if (var16 > 200000) {
                    throw new RuntimeException("slow");
                }
                var7++;
                int var271 = var8[var7];
                if (var271 < 100) {
                    if (var271 == 0) {
                        class85.field2049[var5++] = var9[var7];
                        continue;
                    }
                    if (var271 == 1) {
                        int var17 = var9[var7];
                        class85.field2049[var5++] = class24.field598[var17];
                        continue;
                    }
                    if (var271 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class24.field598[var18] = class85.field2049[var5];
                        continue;
                    }
                    if (var271 == 3) {
                        class102.field2369[var6++] = var4.field1090[var7];
                        continue;
                    }
                    if (var271 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var271 == 7) {
                        var5 -= 2;
                        if (class85.field2049[var5 + 1] != class85.field2049[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var271 == 8) {
                        var5 -= 2;
                        if (class85.field2049[var5 + 1] == class85.field2049[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var271 == 9) {
                        var5 -= 2;
                        if (class85.field2049[var5 + 1] > class85.field2049[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var271 == 10) {
                        var5 -= 2;
                        if (class85.field2049[var5 + 1] < class85.field2049[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var271 == 21) {
                        if (class13.field309 == 0) {
                            return;
                        }
                        class39 var19 = class150.field3531[--class13.field309];
                        class122.field2791 = var19.field904;
                        var4 = var19.field902;
                        class18.field411 = var19.field905;
                        var7 = var19.field907;
                        var8 = var4.field1089;
                        var9 = var4.field1078;
                        continue;
                    }
                    if (var271 == 25) {
                        int var20 = var9[var7];
                        class85.field2049[var5++] = class3.method9((byte) 80, var20);
                        continue;
                    }
                    if (var271 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        class3.method13((byte) -79, class85.field2049[var5], var21);
                        continue;
                    }
                    if (var271 == 31) {
                        var5 -= 2;
                        if (class85.field2049[var5 + 1] >= class85.field2049[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var271 == 32) {
                        var5 -= 2;
                        if (class85.field2049[var5 + 1] <= class85.field2049[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var271 == 33) {
                        class85.field2049[var5++] = class18.field411[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var271 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        class18.field411[var10001] = class85.field2049[var5];
                        continue;
                    }
                    if (var271 == 35) {
                        class102.field2369[var6++] = class122.field2791[var9[var7]];
                        continue;
                    }
                    if (var271 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        class122.field2791[var10001] = class102.field2369[var6];
                        continue;
                    }
                    if (var271 == 37) {
                        int var22 = var9[var7];
                        var6 -= var22;
                        class62 var23 = class47.method333(var22, 97, var6, class102.field2369);
                        class102.field2369[var6++] = var23;
                        continue;
                    }
                    if (var271 == 38) {
                        var5--;
                        continue;
                    }
                    if (var271 == 39) {
                        var6--;
                        continue;
                    }
                    if (var271 == 40) {
                        int var24 = var9[var7];
                        class47 var25 = class40.method299(true, var24);
                        int[] var26 = new int[var25.field1076];
                        class62[] var27 = new class62[var25.field1074];
                        for (int var28 = 0; var28 < var25.field1075; var28++) {
                            var26[var28] = class85.field2049[var5 + var28 - var25.field1075];
                        }
                        for (int var29 = 0; var29 < var25.field1083; var29++) {
                            var27[var29] = class102.field2369[var6 + var29 - var25.field1083];
                        }
                        var6 -= var25.field1083;
                        var5 -= var25.field1075;
                        class39 var30 = new class39();
                        var30.field904 = class122.field2791;
                        var30.field907 = var7;
                        var30.field902 = var4;
                        var4 = var25;
                        var30.field905 = class18.field411;
                        class150.field3531[class13.field309++] = var30;
                        var8 = var25.field1089;
                        class122.field2791 = var27;
                        var7 = -1;
                        var9 = var25.field1078;
                        class18.field411 = var26;
                        continue;
                    }
                    if (var271 == 42) {
                        class85.field2049[var5++] = class139.field3224[var9[var7]];
                        continue;
                    }
                    if (var271 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        class139.field3224[var10001] = class85.field2049[var5];
                        continue;
                    }
                    if (var271 == 44) {
                        int var31 = var9[var7] >> 16;
                        int var32 = var9[var7] & 0xFFFF;
                        var5--;
                        int var33 = class85.field2049[var5];
                        if (var33 >= 0 && var33 <= 5000) {
                            class13.field300[var31] = var33;
                            byte var34 = -1;
                            if (var32 == 105) {
                                var34 = 0;
                            }
                            int var35 = 0;
                            while (true) {
                                if (var35 >= var33) {
                                    continue label1947;
                                }
                                class134.field3076[var31][var35] = var34;
                                var35++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var271 == 45) {
                        int var36 = var9[var7];
                        var5--;
                        int var37 = class85.field2049[var5];
                        if (var37 >= 0 && var37 < class13.field300[var36]) {
                            class85.field2049[var5++] = class134.field3076[var36][var37];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var271 == 46) {
                        var5 -= 2;
                        int var38 = var9[var7];
                        int var39 = class85.field2049[var5];
                        if (var39 >= 0 && class13.field300[var38] > var39) {
                            class134.field3076[var38][var39] = class85.field2049[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var271 == 47) {
                        class62 var40 = class86.field2061[var9[var7]];
                        if (var40 == null) {
                            var40 = class137.field3161;
                        }
                        class102.field2369[var6++] = var40;
                        continue;
                    }
                    if (var271 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        class86.field2061[var10001] = class102.field2369[var6];
                        continue;
                    }
                }
                boolean var41;
                if (var9[var7] == 1) {
                    var41 = true;
                } else {
                    var41 = false;
                }
                if (var271 < 1000) {
                    if (var271 == 100) {
                        var5 -= 3;
                        int var42 = class85.field2049[var5];
                        int var43 = class85.field2049[var5 + 1];
                        int var44 = class85.field2049[var5 + 2];
                        if (var43 == 0) {
                            throw new RuntimeException();
                        }
                        class54 var45 = class62.method456(var42, (byte) 98);
                        if (var45.field1325 == null) {
                            var45.field1325 = new class54[var44 + 1];
                        }
                        if (var45.field1325.length <= var44) {
                            class54[] var46 = new class54[var44 + 1];
                            for (int var47 = 0; var47 < var45.field1325.length; var47++) {
                                var46[var47] = var45.field1325[var47];
                            }
                            var45.field1325 = var46;
                        }
                        if (var44 > 0 && var45.field1325[var44 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var44 - 1));
                        }
                        class54 var48 = new class54();
                        var48.field1279 = var43;
                        var48.field1257 = var44;
                        var48.field1322 = true;
                        var48.field1234 = var48.field1291 = var45.field1291;
                        var45.field1325[var44] = var48;
                        if (var41) {
                            class28.field687 = var48;
                        } else {
                            class75.field1866 = var48;
                        }
                        client.method163(var45, -75);
                        continue;
                    }
                    if (var271 == 101) {
                        class54 var49 = var41 ? class28.field687 : class75.field1866;
                        class54 var50 = class62.method456(var49.field1291, (byte) 118);
                        var50.field1325[var49.field1257] = null;
                        client.method163(var50, -111);
                        continue;
                    }
                    if (var271 == 102) {
                        var5--;
                        class54 var51 = class62.method456(class85.field2049[var5], (byte) 64);
                        var51.field1325 = null;
                        client.method163(var51, -102);
                        continue;
                    }
                    if (var271 == 200) {
                        var5 -= 2;
                        int var52 = class85.field2049[var5];
                        int var53 = class85.field2049[var5 + 1];
                        class54 var54 = class68.method533((byte) 73, var53, var52);
                        if (var54 != null && var53 != -1) {
                            class85.field2049[var5++] = 1;
                            if (var41) {
                                class28.field687 = var54;
                            } else {
                                class75.field1866 = var54;
                            }
                            continue;
                        }
                        class85.field2049[var5++] = 0;
                        continue;
                    }
                } else if (var271 >= 1000 && var271 < 1100 || !(var271 < 2000 || var271 >= 2100)) {
                    class54 var55;
                    if (var271 < 2000) {
                        var55 = var41 ? class28.field687 : class75.field1866;
                    } else {
                        var271 -= 1000;
                        var5--;
                        var55 = class62.method456(class85.field2049[var5], (byte) 120);
                    }
                    if (var271 == 1000) {
                        var5 -= 2;
                        var55.field1317 = class85.field2049[var5];
                        var55.field1237 = class85.field2049[var5 + 1];
                        client.method163(var55, -77);
                        continue;
                    }
                    if (var271 == 1001) {
                        var5 -= 2;
                        var55.field1316 = class85.field2049[var5];
                        var55.field1345 = class85.field2049[var5 + 1];
                        client.method163(var55, -90);
                        continue;
                    }
                    if (var271 == 1003) {
                        var5--;
                        boolean var56 = class85.field2049[var5] == 1;
                        if (var55.field1265 != var56) {
                            var55.field1265 = var56;
                            client.method163(var55, -115);
                        }
                        continue;
                    }
                } else if (var271 >= 1100 && var271 < 1200 || var271 >= 2100 && var271 < 2200) {
                    class54 var57;
                    if (var271 < 2000) {
                        var57 = var41 ? class28.field687 : class75.field1866;
                    } else {
                        var5--;
                        var57 = class62.method456(class85.field2049[var5], (byte) 96);
                        var271 -= 1000;
                    }
                    if (var271 == 1100) {
                        var5 -= 2;
                        var57.field1303 = class85.field2049[var5];
                        if (var57.field1303 > var57.field1277 - var57.field1316) {
                            var57.field1303 = var57.field1277 - var57.field1316;
                        }
                        if (var57.field1303 < 0) {
                            var57.field1303 = 0;
                        }
                        var57.field1262 = class85.field2049[var5 + 1];
                        if (var57.field1262 > var57.field1328 - var57.field1345) {
                            var57.field1262 = var57.field1328 - var57.field1345;
                        }
                        if (var57.field1262 < 0) {
                            var57.field1262 = 0;
                        }
                        client.method163(var57, -82);
                        continue;
                    }
                    if (var271 == 1101) {
                        var5--;
                        var57.field1254 = class85.field2049[var5];
                        client.method163(var57, -95);
                        continue;
                    }
                    if (var271 == 1102) {
                        var5--;
                        var57.field1318 = class85.field2049[var5] == 1;
                        client.method163(var57, -97);
                        continue;
                    }
                    if (var271 == 1103) {
                        var5--;
                        var57.field1245 = class85.field2049[var5];
                        client.method163(var57, -124);
                        continue;
                    }
                    if (var271 == 1104) {
                        var5--;
                        var57.field1331 = class85.field2049[var5];
                        client.method163(var57, -89);
                        continue;
                    }
                    if (var271 == 1105) {
                        var5--;
                        var57.field1321 = class85.field2049[var5];
                        client.method163(var57, -108);
                        continue;
                    }
                    if (var271 == 1106) {
                        var5--;
                        var57.field1287 = class85.field2049[var5];
                        client.method163(var57, -102);
                        continue;
                    }
                    if (var271 == 1107) {
                        var5--;
                        var57.field1263 = class85.field2049[var5] == 1;
                        client.method163(var57, -98);
                        continue;
                    }
                    if (var271 == 1108) {
                        var57.field1235 = 1;
                        var5--;
                        var57.field1324 = class85.field2049[var5];
                        client.method163(var57, -91);
                        continue;
                    }
                    if (var271 == 1109) {
                        var5 -= 6;
                        var57.field1313 = class85.field2049[var5];
                        var57.field1261 = class85.field2049[var5 + 1];
                        var57.field1267 = class85.field2049[var5 + 2];
                        var57.field1282 = class85.field2049[var5 + 3];
                        var57.field1266 = class85.field2049[var5 + 4];
                        var57.field1312 = class85.field2049[var5 + 5];
                        client.method163(var57, -91);
                        continue;
                    }
                    if (var271 == 1110) {
                        var5--;
                        int var58 = class85.field2049[var5];
                        if (var57.field1247 != var58) {
                            var57.field1280 = 0;
                            var57.field1348 = 0;
                            var57.field1247 = var58;
                            client.method163(var57, -112);
                        }
                        continue;
                    }
                    if (var271 == 1111) {
                        var5--;
                        var57.field1315 = class85.field2049[var5] == 1;
                        client.method163(var57, -118);
                        continue;
                    }
                    if (var271 == 1112) {
                        var6--;
                        class62 var59 = class102.field2369[var6];
                        if (!var59.method475(90, var57.field1284)) {
                            var57.field1284 = var59;
                            client.method163(var57, -117);
                        }
                        continue;
                    }
                    if (var271 == 1113) {
                        var5--;
                        var57.field1239 = class85.field2049[var5];
                        client.method163(var57, -119);
                        continue;
                    }
                    if (var271 == 1114) {
                        var5 -= 3;
                        var57.field1310 = class85.field2049[var5];
                        var57.field1305 = class85.field2049[var5 + 1];
                        var57.field1230 = class85.field2049[var5 + 2];
                        client.method163(var57, -87);
                        continue;
                    }
                    if (var271 == 1115) {
                        var5--;
                        var57.field1271 = class85.field2049[var5] == 1;
                        client.method163(var57, -94);
                        continue;
                    }
                    if (var271 == 1116) {
                        var5--;
                        var57.field1339 = class85.field2049[var5];
                        client.method163(var57, -113);
                        continue;
                    }
                    if (var271 == 1117) {
                        var5--;
                        var57.field1363 = class85.field2049[var5];
                        client.method163(var57, -90);
                        continue;
                    }
                    if (var271 == 1118) {
                        var5--;
                        var57.field1314 = class85.field2049[var5] == 1;
                        client.method163(var57, -117);
                        continue;
                    }
                    if (var271 == 1119) {
                        var5--;
                        var57.field1289 = class85.field2049[var5] == 1;
                        client.method163(var57, -90);
                        continue;
                    }
                    if (var271 == 1120) {
                        var5 -= 2;
                        var57.field1277 = class85.field2049[var5];
                        var57.field1328 = class85.field2049[var5 + 1];
                        client.method163(var57, -75);
                        continue;
                    }
                } else if (var271 >= 1200 && var271 < 1300 || !(var271 < 2200 || var271 >= 2300)) {
                    class54 var60;
                    if (var271 < 2000) {
                        var60 = var41 ? class28.field687 : class75.field1866;
                    } else {
                        var271 -= 1000;
                        var5--;
                        var60 = class62.method456(class85.field2049[var5], (byte) 88);
                    }
                    client.method163(var60, -91);
                    if (var271 == 1200) {
                        var5 -= 2;
                        int var61 = class85.field2049[var5 + 1];
                        int var62 = class85.field2049[var5];
                        var60.field1270 = var61;
                        var60.field1250 = var62;
                        class23 var63 = class140.method1114(var62, false);
                        var60.field1282 = var63.field545;
                        var60.field1312 = var63.field579;
                        var60.field1261 = var63.field577;
                        if (var60.field1316 > 0) {
                            var60.field1312 = var60.field1312 * 32 / var60.field1316;
                        }
                        var60.field1313 = var63.field540;
                        var60.field1267 = var63.field554;
                        var60.field1266 = var63.field556;
                        continue;
                    }
                    if (var271 == 1201) {
                        var60.field1235 = 2;
                        var5--;
                        var60.field1324 = class85.field2049[var5];
                        continue;
                    }
                    if (var271 == 1202) {
                        var60.field1235 = 3;
                        var60.field1324 = class40.field936.field2626.method896((byte) 102);
                        continue;
                    }
                } else if ((var271 < 1300 || var271 >= 1400) && (var271 < 2300 || var271 >= 2400)) {
                    if (var271 >= 1400 && var271 < 1500 || var271 >= 2400 && var271 < 2500) {
                        int[] var68 = null;
                        class54 var69;
                        if (var271 >= 2000) {
                            var271 -= 1000;
                            var5--;
                            var69 = class62.method456(class85.field2049[var5], (byte) 72);
                        } else {
                            var69 = var41 ? class28.field687 : class75.field1866;
                        }
                        var6--;
                        class62 var70 = class102.field2369[var6];
                        if (var70.method460((byte) 38) > 0 && var70.method446((byte) -15, var70.method460((byte) 38) - 1) == 89) {
                            var5--;
                            int var71 = class85.field2049[var5];
                            if (var71 > 0) {
                                var68 = new int[var71];
                                while (var71-- > 0) {
                                    var5--;
                                    var68[var71] = class85.field2049[var5];
                                }
                            }
                            var70 = var70.method445(var70.method460((byte) 38) - 1, (byte) 39, 0);
                        }
                        Object[] var72 = new Object[var70.method460((byte) 38) + 1];
                        for (int var73 = var72.length - 1; var73 >= 1; var73--) {
                            if (var70.method446((byte) -15, var73 - 1) == 115) {
                                var6--;
                                var72[var73] = class102.field2369[var6];
                            } else {
                                var5--;
                                var72[var73] = Integer.valueOf(class85.field2049[var5]);
                            }
                        }
                        var5--;
                        int var74 = class85.field2049[var5];
                        if (var74 == -1) {
                            var72 = null;
                        } else {
                            var72[0] = Integer.valueOf(var74);
                        }
                        if (var271 == 1418) {
                            var69.field1323 = var72;
                        }
                        if (var271 == 1423) {
                            var69.field1364 = var72;
                        }
                        if (var271 == 1401) {
                            var69.field1333 = var72;
                        }
                        if (var271 == 1421) {
                            var69.field1352 = var72;
                        }
                        if (var271 == 1410) {
                            var69.field1256 = var72;
                        }
                        if (var271 == 1414) {
                            var69.field1308 = var68;
                            var69.field1236 = var72;
                        }
                        if (var271 == 1422) {
                            var69.field1232 = var72;
                        }
                        if (var271 == 1403) {
                            var69.field1300 = var72;
                        }
                        if (var271 == 1419) {
                            var69.field1285 = var72;
                        }
                        if (var271 == 1416) {
                            var69.field1320 = var72;
                        }
                        if (var271 == 1408) {
                            var69.field1248 = var72;
                        }
                        var69.field1336 = true;
                        if (var271 == 1405) {
                            var69.field1298 = var72;
                        }
                        if (var271 == 1407) {
                            var69.field1276 = var68;
                            var69.field1242 = var72;
                        }
                        if (var271 == 1404) {
                            var69.field1366 = var72;
                        }
                        if (var271 == 1420) {
                            var69.field1269 = var72;
                        }
                        if (var271 == 1400) {
                            var69.field1359 = var72;
                        }
                        if (var271 == 1412) {
                            var69.field1306 = var72;
                        }
                        if (var271 == 1406) {
                            var69.field1307 = var72;
                        }
                        if (var271 == 1402) {
                            var69.field1241 = var72;
                        }
                        if (var271 == 1411) {
                            var69.field1272 = var72;
                        }
                        if (var271 == 1415) {
                            var69.field1259 = var68;
                            var69.field1244 = var72;
                        }
                        if (var271 == 1417) {
                            var69.field1281 = var72;
                        }
                        if (var271 == 1409) {
                            var69.field1342 = var72;
                        }
                        continue;
                    }
                    if (var271 < 1600) {
                        class54 var75 = var41 ? class28.field687 : class75.field1866;
                        if (var271 == 1500) {
                            class85.field2049[var5++] = var75.field1317;
                            continue;
                        }
                        if (var271 == 1501) {
                            class85.field2049[var5++] = var75.field1237;
                            continue;
                        }
                        if (var271 == 1502) {
                            class85.field2049[var5++] = var75.field1316;
                            continue;
                        }
                        if (var271 == 1503) {
                            class85.field2049[var5++] = var75.field1345;
                            continue;
                        }
                        if (var271 == 1504) {
                            class85.field2049[var5++] = var75.field1265 ? 1 : 0;
                            continue;
                        }
                        if (var271 == 1505) {
                            class85.field2049[var5++] = var75.field1234;
                            continue;
                        }
                    } else if (var271 < 1700) {
                        class54 var263 = var41 ? class28.field687 : class75.field1866;
                        if (var271 == 1600) {
                            class85.field2049[var5++] = var263.field1303;
                            continue;
                        }
                        if (var271 == 1601) {
                            class85.field2049[var5++] = var263.field1262;
                            continue;
                        }
                        if (var271 == 1602) {
                            class102.field2369[var6++] = var263.field1284;
                            continue;
                        }
                        if (var271 == 1603) {
                            class85.field2049[var5++] = var263.field1277;
                            continue;
                        }
                        if (var271 == 1604) {
                            class85.field2049[var5++] = var263.field1328;
                            continue;
                        }
                        if (var271 == 1605) {
                            class85.field2049[var5++] = var263.field1312;
                            continue;
                        }
                        if (var271 == 1606) {
                            class85.field2049[var5++] = var263.field1267;
                            continue;
                        }
                        if (var271 == 1607) {
                            class85.field2049[var5++] = var263.field1266;
                            continue;
                        }
                        if (var271 == 1608) {
                            class85.field2049[var5++] = var263.field1282;
                            continue;
                        }
                    } else if (var271 < 1800) {
                        class54 var76 = var41 ? class28.field687 : class75.field1866;
                        if (var271 == 1700) {
                            class85.field2049[var5++] = var76.field1250;
                            continue;
                        }
                        if (var271 == 1701) {
                            if (var76.field1250 == -1) {
                                class85.field2049[var5++] = 0;
                            } else {
                                class85.field2049[var5++] = var76.field1270;
                            }
                            continue;
                        }
                        if (var271 == 1702) {
                            class85.field2049[var5++] = var76.field1257;
                            continue;
                        }
                    } else if (var271 < 1900) {
                        class54 var261 = var41 ? class28.field687 : class75.field1866;
                        if (var271 == 1800) {
                            class85.field2049[var5++] = class79.method627(77, class22.method171(var261, (byte) 63));
                            continue;
                        }
                        if (var271 == 1801) {
                            var5--;
                            int var262 = class85.field2049[var5];
                            int var273 = var262 - 1;
                            if (var261.field1229 != null && var273 < var261.field1229.length && var261.field1229[var273] != null) {
                                class102.field2369[var6++] = var261.field1229[var273];
                                continue;
                            }
                            class102.field2369[var6++] = class153.field3576;
                            continue;
                        }
                        if (var271 == 1802) {
                            if (var261.field1260 == null) {
                                class102.field2369[var6++] = class153.field3576;
                            } else {
                                class102.field2369[var6++] = var261.field1260;
                            }
                            continue;
                        }
                    } else if (var271 < 2600) {
                        var5--;
                        class54 var77 = class62.method456(class85.field2049[var5], (byte) 119);
                        if (var271 == 2500) {
                            class85.field2049[var5++] = var77.field1317;
                            continue;
                        }
                        if (var271 == 2501) {
                            class85.field2049[var5++] = var77.field1237;
                            continue;
                        }
                        if (var271 == 2502) {
                            class85.field2049[var5++] = var77.field1316;
                            continue;
                        }
                        if (var271 == 2503) {
                            class85.field2049[var5++] = var77.field1345;
                            continue;
                        }
                        if (var271 == 2504) {
                            class85.field2049[var5++] = var77.field1265 ? 1 : 0;
                            continue;
                        }
                        if (var271 == 2505) {
                            class85.field2049[var5++] = var77.field1234;
                            continue;
                        }
                    } else if (var271 < 2700) {
                        var5--;
                        class54 var78 = class62.method456(class85.field2049[var5], (byte) 80);
                        if (var271 == 2600) {
                            class85.field2049[var5++] = var78.field1303;
                            continue;
                        }
                        if (var271 == 2601) {
                            class85.field2049[var5++] = var78.field1262;
                            continue;
                        }
                        if (var271 == 2602) {
                            class102.field2369[var6++] = var78.field1284;
                            continue;
                        }
                        if (var271 == 2603) {
                            class85.field2049[var5++] = var78.field1277;
                            continue;
                        }
                        if (var271 == 2604) {
                            class85.field2049[var5++] = var78.field1328;
                            continue;
                        }
                        if (var271 == 2605) {
                            class85.field2049[var5++] = var78.field1312;
                            continue;
                        }
                        if (var271 == 2606) {
                            class85.field2049[var5++] = var78.field1267;
                            continue;
                        }
                        if (var271 == 2607) {
                            class85.field2049[var5++] = var78.field1266;
                            continue;
                        }
                        if (var271 == 2608) {
                            class85.field2049[var5++] = var78.field1282;
                            continue;
                        }
                    } else if (var271 < 2800) {
                        if (var271 == 2700) {
                            var5--;
                            class54 var79 = class62.method456(class85.field2049[var5], (byte) 115);
                            class85.field2049[var5++] = var79.field1250;
                            continue;
                        }
                        if (var271 == 2701) {
                            var5--;
                            class54 var80 = class62.method456(class85.field2049[var5], (byte) 96);
                            if (var80.field1250 == -1) {
                                class85.field2049[var5++] = 0;
                            } else {
                                class85.field2049[var5++] = var80.field1270;
                            }
                            continue;
                        }
                        if (var271 == 2702) {
                            var5--;
                            int var81 = class85.field2049[var5];
                            class81 var82 = (class81) class16.field372.method537(-1, (long) var81);
                            if (var82 == null) {
                                class85.field2049[var5++] = 0;
                            } else {
                                class85.field2049[var5++] = 1;
                            }
                            continue;
                        }
                    } else if (var271 < 2900) {
                        var5--;
                        class54 var83 = class62.method456(class85.field2049[var5], (byte) 107);
                        if (var271 == 2800) {
                            class85.field2049[var5++] = class79.method627(-107, class22.method171(var83, (byte) 60));
                            continue;
                        }
                        if (var271 == 2801) {
                            var5--;
                            int var84 = class85.field2049[var5];
                            int var272 = var84 - 1;
                            if (var83.field1229 != null && var272 < var83.field1229.length && var83.field1229[var272] != null) {
                                class102.field2369[var6++] = var83.field1229[var272];
                                continue;
                            }
                            class102.field2369[var6++] = class153.field3576;
                            continue;
                        }
                        if (var271 == 2802) {
                            if (var83.field1260 == null) {
                                class102.field2369[var6++] = class153.field3576;
                            } else {
                                class102.field2369[var6++] = var83.field1260;
                            }
                            continue;
                        }
                    } else if (var271 < 3200) {
                        if (var271 == 3100) {
                            var6--;
                            class62 var85 = class102.field2369[var6];
                            class43.method320(0, 0, var85, class153.field3576);
                            continue;
                        }
                        if (var271 == 3101) {
                            var5 -= 2;
                            class36.method279(class85.field2049[var5], true, class40.field936, class85.field2049[var5 + 1]);
                            continue;
                        }
                        if (var271 == 3102) {
                            var5--;
                            continue;
                        }
                        if (var271 == 3103) {
                            class136.method1090(-84);
                            continue;
                        }
                        if (var271 == 3104) {
                            class43.field1016++;
                            int var86 = 0;
                            var6--;
                            class62 var87 = class102.field2369[var6];
                            if (var87.method459((byte) 127)) {
                                var86 = var87.method439((byte) 95);
                            }
                            class136.field3140.method810(-2, 178);
                            class136.field3140.method1040(var86, -1308601992);
                            continue;
                        }
                        if (var271 == 3105) {
                            class22.field531++;
                            var6--;
                            class62 var88 = class102.field2369[var6];
                            class136.field3140.method810(-2, 49);
                            class136.field3140.method1008(var88.method448(37), (byte) 38);
                            continue;
                        }
                        if (var271 == 3106) {
                            class60.field1463++;
                            var6--;
                            class62 var89 = class102.field2369[var6];
                            class136.field3140.method810(-2, 156);
                            class136.field3140.method1010(var89.method460((byte) 38) + 1, 32768);
                            class136.field3140.method1021(-109, var89);
                            continue;
                        }
                        if (var271 == 3107) {
                            var5--;
                            int var90 = class85.field2049[var5];
                            var6--;
                            class62 var91 = class102.field2369[var6];
                            class75.method617(var90, 98, var91);
                            continue;
                        }
                        if (var271 == 3108) {
                            var5 -= 3;
                            int var92 = class85.field2049[var5];
                            int var93 = class85.field2049[var5 + 1];
                            int var94 = class85.field2049[var5 + 2];
                            class54 var95 = class62.method456(var94, (byte) 111);
                            class24.method195(-22572, var93, var95, var92);
                            continue;
                        }
                        if (var271 == 3109) {
                            var5 -= 2;
                            int var96 = class85.field2049[var5];
                            class54 var97 = var41 ? class28.field687 : class75.field1866;
                            int var98 = class85.field2049[var5 + 1];
                            class24.method195(-22572, var98, var97, var96);
                            continue;
                        }
                    } else if (var271 < 3300) {
                        if (var271 == 3200) {
                            var5 -= 3;
                            class140.method1115(class85.field2049[var5 + 1], class85.field2049[var5], class85.field2049[var5 + 2], -82);
                            continue;
                        }
                        if (var271 == 3201) {
                            var5--;
                            class32.method257(class85.field2049[var5], -1);
                            continue;
                        }
                        if (var271 == 3202) {
                            var5 -= 2;
                            class15.method107(class85.field2049[var5 + 1], class85.field2049[var5], false);
                            continue;
                        }
                    } else if (var271 < 3400) {
                        if (var271 == 3300) {
                            class85.field2049[var5++] = class86.field2060;
                            continue;
                        }
                        if (var271 == 3301) {
                            var5 -= 2;
                            int var239 = class85.field2049[var5 + 1];
                            int var240 = class85.field2049[var5];
                            class85.field2049[var5++] = class85.method659(116, var239, var240);
                            continue;
                        }
                        if (var271 == 3302) {
                            var5 -= 2;
                            int var241 = class85.field2049[var5];
                            int var242 = class85.field2049[var5 + 1];
                            class85.field2049[var5++] = class128.method990(var241, var242, true);
                            continue;
                        }
                        if (var271 == 3303) {
                            var5 -= 2;
                            int var243 = class85.field2049[var5 + 1];
                            int var244 = class85.field2049[var5];
                            class85.field2049[var5++] = class122.method965((byte) -113, var243, var244);
                            continue;
                        }
                        if (var271 == 3304) {
                            var5--;
                            int var245 = class85.field2049[var5];
                            class85.field2049[var5++] = class148.method1175(var245, -57).field976;
                            continue;
                        }
                        if (var271 == 3305) {
                            var5--;
                            int var246 = class85.field2049[var5];
                            class85.field2049[var5++] = class4.field40[var246];
                            continue;
                        }
                        if (var271 == 3306) {
                            var5--;
                            int var247 = class85.field2049[var5];
                            class85.field2049[var5++] = class45.field1035[var247];
                            continue;
                        }
                        if (var271 == 3307) {
                            var5--;
                            int var248 = class85.field2049[var5];
                            class85.field2049[var5++] = class38.field884[var248];
                            continue;
                        }
                        if (var271 == 3308) {
                            int var249 = class155.field3598;
                            int var250 = (class40.field936.field136 >> 7) + class40.field926;
                            int var251 = (class40.field936.field134 >> 7) + class27.field673;
                            class85.field2049[var5++] = (var250 << 14) + ((var249 << 28) + var251);
                            continue;
                        }
                        if (var271 == 3309) {
                            var5--;
                            int var252 = class85.field2049[var5];
                            class85.field2049[var5++] = class24.method192(16383, var252 >> 14);
                            continue;
                        }
                        if (var271 == 3310) {
                            var5--;
                            int var253 = class85.field2049[var5];
                            class85.field2049[var5++] = var253 >> 28;
                            continue;
                        }
                        if (var271 == 3311) {
                            var5--;
                            int var254 = class85.field2049[var5];
                            class85.field2049[var5++] = class24.method192(16383, var254);
                            continue;
                        }
                        if (var271 == 3312) {
                            class85.field2049[var5++] = class121.field2768 ? 1 : 0;
                            continue;
                        }
                        if (var271 == 3313) {
                            var5 -= 2;
                            int var255 = class85.field2049[var5 + 1];
                            int var256 = class85.field2049[var5] + 32768;
                            class85.field2049[var5++] = class85.method659(97, var255, var256);
                            continue;
                        }
                        if (var271 == 3314) {
                            var5 -= 2;
                            int var257 = class85.field2049[var5] + 32768;
                            int var258 = class85.field2049[var5 + 1];
                            class85.field2049[var5++] = class128.method990(var257, var258, true);
                            continue;
                        }
                        if (var271 == 3315) {
                            var5 -= 2;
                            int var259 = class85.field2049[var5] + 32768;
                            int var260 = class85.field2049[var5 + 1];
                            class85.field2049[var5++] = class122.method965((byte) -90, var260, var259);
                            continue;
                        }
                        if (var271 == 3316) {
                            if (class97.field2262 >= 2) {
                                class85.field2049[var5++] = class97.field2262;
                            } else {
                                class85.field2049[var5++] = 0;
                            }
                            continue;
                        }
                        if (var271 == 3317) {
                            class85.field2049[var5++] = class26.field625;
                            continue;
                        }
                        if (var271 == 3318) {
                            class85.field2049[var5++] = class59.field1449;
                            continue;
                        }
                        if (var271 == 3320) {
                            class85.field2049[var5++] = 1;
                            continue;
                        }
                        if (var271 == 3321) {
                            class85.field2049[var5++] = class1.field13;
                            continue;
                        }
                        if (var271 == 3322) {
                            class85.field2049[var5++] = class147.field3465;
                            continue;
                        }
                        if (var271 == 3323) {
                            if (class97.field2262 == 1) {
                                class85.field2049[var5++] = 1;
                            } else {
                                class85.field2049[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var271 < 3500) {
                        if (var271 == 3400) {
                            var5 -= 2;
                            int var99 = class85.field2049[var5];
                            int var100 = class85.field2049[var5 + 1];
                            class137 var101 = class42.method315(false, var99);
                            for (int var102 = 0; var102 < var101.field3147; var102++) {
                                if (var101.field3170[var102] == var100) {
                                    class102.field2369[var6++] = var101.field3160[var102];
                                    var101 = null;
                                    break;
                                }
                            }
                            if (var101 != null) {
                                class102.field2369[var6++] = var101.field3165;
                            }
                            continue;
                        }
                        if (var271 == 3408) {
                            var5 -= 4;
                            int var103 = class85.field2049[var5];
                            int var104 = class85.field2049[var5 + 1];
                            int var105 = class85.field2049[var5 + 2];
                            int var106 = class85.field2049[var5 + 3];
                            class137 var107 = class42.method315(false, var105);
                            if (var107.field3171 == var103 && var107.field3149 == var104) {
                                for (int var108 = 0; var108 < var107.field3147; var108++) {
                                    if (var107.field3170[var108] == var106) {
                                        if (var104 == 115) {
                                            class102.field2369[var6++] = var107.field3160[var108];
                                        } else {
                                            class85.field2049[var5++] = var107.field3163[var108];
                                        }
                                        var107 = null;
                                        break;
                                    }
                                }
                                if (var107 != null) {
                                    if (var104 == 115) {
                                        class102.field2369[var6++] = var107.field3165;
                                    } else {
                                        class85.field2049[var5++] = var107.field3151;
                                    }
                                }
                                continue;
                            }
                            if (var104 == 115) {
                                class102.field2369[var6++] = class137.field3161;
                            } else {
                                class85.field2049[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var271 < 3700) {
                        if (var271 == 3600) {
                            if (class7.field207 == 0) {
                                class85.field2049[var5++] = -2;
                            } else if (class7.field207 == 1) {
                                class85.field2049[var5++] = -1;
                            } else {
                                class85.field2049[var5++] = class54.field1334;
                            }
                            continue;
                        }
                        if (var271 == 3601) {
                            var5--;
                            int var109 = class85.field2049[var5];
                            if (class7.field207 == 2 && class54.field1334 > var109) {
                                class102.field2369[var6++] = class155.field3597[var109];
                                continue;
                            }
                            class102.field2369[var6++] = class153.field3576;
                            continue;
                        }
                        if (var271 == 3602) {
                            var5--;
                            int var110 = class85.field2049[var5];
                            if (class7.field207 == 2 && var110 < class54.field1334) {
                                class85.field2049[var5++] = class136.field3128[var110];
                                continue;
                            }
                            class85.field2049[var5++] = 0;
                            continue;
                        }
                        if (var271 == 3603) {
                            var5--;
                            int var111 = class85.field2049[var5];
                            if (class7.field207 == 2 && var111 < class54.field1334) {
                                class85.field2049[var5++] = class39.field918[var111];
                                continue;
                            }
                            class85.field2049[var5++] = 0;
                            continue;
                        }
                        if (var271 == 3604) {
                            var6--;
                            class62 var112 = class102.field2369[var6];
                            var5--;
                            int var113 = class85.field2049[var5];
                            class153.method1190((byte) 25, var113, var112);
                            continue;
                        }
                        if (var271 == 3605) {
                            var6--;
                            class62 var114 = class102.field2369[var6];
                            class144.method1139(var114.method448(37), (byte) -73);
                            continue;
                        }
                        if (var271 == 3606) {
                            var6--;
                            class62 var115 = class102.field2369[var6];
                            class138.method1103(false, var115.method448(37));
                            continue;
                        }
                        if (var271 == 3607) {
                            var6--;
                            class62 var116 = class102.field2369[var6];
                            class34.method262(-1, var116.method448(37));
                            continue;
                        }
                        if (var271 == 3608) {
                            var6--;
                            class62 var117 = class102.field2369[var6];
                            class28.method226(var117.method448(37), 0);
                            continue;
                        }
                        if (var271 == 3609) {
                            var6--;
                            class62 var118 = class102.field2369[var6];
                            if (var118.method450(class53.field1223, (byte) -98) || var118.method450(class140.field3241, (byte) -65)) {
                                var118 = var118.method471((byte) -110, 7);
                            }
                            class85.field2049[var5++] = class71.method599(0, var118) ? 1 : 0;
                            continue;
                        }
                        if (var271 == 3611) {
                            if (class120.field2762 == null) {
                                class102.field2369[var6++] = class153.field3576;
                            } else {
                                class102.field2369[var6++] = class120.field2762;
                            }
                            continue;
                        }
                        if (var271 == 3612) {
                            if (class120.field2762 == null) {
                                class85.field2049[var5++] = 0;
                            } else {
                                class85.field2049[var5++] = class115.field2629;
                            }
                            continue;
                        }
                        if (var271 == 3613) {
                            var5--;
                            int var119 = class85.field2049[var5];
                            if (class120.field2762 != null && var119 < class115.field2629) {
                                class102.field2369[var6++] = class39.field912[var119].field3026;
                                continue;
                            }
                            class102.field2369[var6++] = class153.field3576;
                            continue;
                        }
                        if (var271 == 3614) {
                            var5--;
                            int var120 = class85.field2049[var5];
                            if (class120.field2762 != null && class115.field2629 > var120) {
                                class85.field2049[var5++] = class39.field912[var120].field3022;
                                continue;
                            }
                            class85.field2049[var5++] = 0;
                            continue;
                        }
                        if (var271 == 3615) {
                            var5--;
                            int var121 = class85.field2049[var5];
                            if (class120.field2762 != null && var121 < class115.field2629) {
                                class85.field2049[var5++] = class39.field912[var121].field3030;
                                continue;
                            }
                            class85.field2049[var5++] = 0;
                            continue;
                        }
                        if (var271 == 3616) {
                            class85.field2049[var5++] = class36.field858;
                            continue;
                        }
                        if (var271 == 3617) {
                            var5--;
                            int var122 = class85.field2049[var5];
                            class9.method76(106, var122);
                            continue;
                        }
                        if (var271 == 3618) {
                            class85.field2049[var5++] = class126.field2853;
                            continue;
                        }
                        if (var271 == 3619) {
                            var6--;
                            class62 var123 = class102.field2369[var6];
                            class22.method170(var123.method448(37), 110);
                            continue;
                        }
                        if (var271 == 3620) {
                            class132.method1061((byte) -111);
                            continue;
                        }
                        if (var271 == 3621) {
                            if (class7.field207 == 0) {
                                class85.field2049[var5++] = -1;
                            } else {
                                class85.field2049[var5++] = class100.field2339;
                            }
                            continue;
                        }
                        if (var271 == 3622) {
                            var5--;
                            int var124 = class85.field2049[var5];
                            if (class7.field207 != 0 && var124 < class100.field2339) {
                                class102.field2369[var6++] = class111.method899(false, class47.field1077[var124]).method462(56);
                                continue;
                            }
                            class102.field2369[var6++] = class153.field3576;
                            continue;
                        }
                    } else if (var271 < 4100) {
                        if (var271 == 4000) {
                            var5 -= 2;
                            int var206 = class85.field2049[var5 + 1];
                            int var207 = class85.field2049[var5];
                            class85.field2049[var5++] = var207 + var206;
                            continue;
                        }
                        if (var271 == 4001) {
                            var5 -= 2;
                            int var208 = class85.field2049[var5 + 1];
                            int var209 = class85.field2049[var5];
                            class85.field2049[var5++] = var209 - var208;
                            continue;
                        }
                        if (var271 == 4002) {
                            var5 -= 2;
                            int var210 = class85.field2049[var5];
                            int var211 = class85.field2049[var5 + 1];
                            class85.field2049[var5++] = var210 * var211;
                            continue;
                        }
                        if (var271 == 4003) {
                            var5 -= 2;
                            int var212 = class85.field2049[var5 + 1];
                            int var213 = class85.field2049[var5];
                            class85.field2049[var5++] = var213 / var212;
                            continue;
                        }
                        if (var271 == 4004) {
                            var5--;
                            int var214 = class85.field2049[var5];
                            class85.field2049[var5++] = (int) (Math.random() * (double) var214);
                            continue;
                        }
                        if (var271 == 4005) {
                            var5--;
                            int var215 = class85.field2049[var5];
                            class85.field2049[var5++] = (int) ((double) (var215 + 1) * Math.random());
                            continue;
                        }
                        if (var271 == 4006) {
                            var5 -= 5;
                            int var216 = class85.field2049[var5];
                            int var217 = class85.field2049[var5 + 1];
                            int var218 = class85.field2049[var5 + 2];
                            int var219 = class85.field2049[var5 + 3];
                            int var220 = class85.field2049[var5 + 4];
                            class85.field2049[var5++] = (var217 - var216) * (-var218 + var220) / (var219 - var218) + var216;
                            continue;
                        }
                        if (var271 == 4007) {
                            var5 -= 2;
                            int var221 = class85.field2049[var5];
                            int var222 = class85.field2049[var5 + 1];
                            class85.field2049[var5++] = var221 * var222 / 100 + var221;
                            continue;
                        }
                        if (var271 == 4008) {
                            var5 -= 2;
                            int var223 = class85.field2049[var5];
                            int var224 = class85.field2049[var5 + 1];
                            class85.field2049[var5++] = class85.method660(var223, 0x1 << var224);
                            continue;
                        }
                        if (var271 == 4009) {
                            var5 -= 2;
                            int var225 = class85.field2049[var5 + 1];
                            int var226 = class85.field2049[var5];
                            class85.field2049[var5++] = class24.method192(var226, -(0x1 << var225) - 1);
                            continue;
                        }
                        if (var271 == 4010) {
                            var5 -= 2;
                            int var227 = class85.field2049[var5];
                            int var228 = class85.field2049[var5 + 1];
                            class85.field2049[var5++] = class24.method192(var227, 0x1 << var228) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var271 == 4011) {
                            var5 -= 2;
                            int var229 = class85.field2049[var5];
                            int var230 = class85.field2049[var5 + 1];
                            class85.field2049[var5++] = var229 % var230;
                            continue;
                        }
                        if (var271 == 4012) {
                            var5 -= 2;
                            int var231 = class85.field2049[var5];
                            int var232 = class85.field2049[var5 + 1];
                            if (var231 == 0) {
                                class85.field2049[var5++] = 0;
                            } else {
                                class85.field2049[var5++] = (int) Math.pow((double) var231, (double) var232);
                            }
                            continue;
                        }
                        if (var271 == 4013) {
                            var5 -= 2;
                            int var233 = class85.field2049[var5];
                            int var234 = class85.field2049[var5 + 1];
                            if (var233 == 0) {
                                class85.field2049[var5++] = 0;
                            } else if (var234 == 0) {
                                class85.field2049[var5++] = Integer.MAX_VALUE;
                            } else {
                                class85.field2049[var5++] = (int) Math.pow((double) var233, 1.0D / (double) var234);
                            }
                            continue;
                        }
                        if (var271 == 4014) {
                            var5 -= 2;
                            int var235 = class85.field2049[var5];
                            int var236 = class85.field2049[var5 + 1];
                            class85.field2049[var5++] = class24.method192(var235, var236);
                            continue;
                        }
                        if (var271 == 4015) {
                            var5 -= 2;
                            int var237 = class85.field2049[var5 + 1];
                            int var238 = class85.field2049[var5];
                            class85.field2049[var5++] = class85.method660(var237, var238);
                            continue;
                        }
                    } else if (var271 < 4200) {
                        if (var271 == 4100) {
                            var5--;
                            int var125 = class85.field2049[var5];
                            var6--;
                            class62 var126 = class102.field2369[var6];
                            class102.field2369[var6++] = class70.method594(new class62[] { var126, class31.method249(true, var125) }, 1229);
                            continue;
                        }
                        if (var271 == 4101) {
                            var6 -= 2;
                            class62 var127 = class102.field2369[var6];
                            class62 var128 = class102.field2369[var6 + 1];
                            class102.field2369[var6++] = class70.method594(new class62[] { var127, var128 }, 1229);
                            continue;
                        }
                        if (var271 == 4102) {
                            var6--;
                            class62 var129 = class102.field2369[var6];
                            var5--;
                            int var130 = class85.field2049[var5];
                            class102.field2369[var6++] = class70.method594(new class62[] { var129, class102.method817((byte) -34, var130, true) }, 1229);
                            continue;
                        }
                        if (var271 == 4103) {
                            var6--;
                            class62 var131 = class102.field2369[var6];
                            class102.field2369[var6++] = var131.method457(-64);
                            continue;
                        }
                        if (var271 == 4104) {
                            var5--;
                            int var132 = class85.field2049[var5];
                            long var133 = ((long) var132 + 11745L) * 86400000L;
                            class82.field1985.setTime(new Date(var133));
                            int var135 = class82.field1985.get(5);
                            int var136 = class82.field1985.get(2);
                            int var137 = class82.field1985.get(1);
                            class102.field2369[var6++] = class70.method594(new class62[] { class31.method249(true, var135), class45.field1032, class42.field969[var136], class45.field1032, class31.method249(true, var137) }, 1229);
                            continue;
                        }
                        if (var271 == 4105) {
                            var6 -= 2;
                            class62 var138 = class102.field2369[var6];
                            class62 var139 = class102.field2369[var6 + 1];
                            if (class40.field936.field2626 != null && class40.field936.field2626.field2526) {
                                class102.field2369[var6++] = var139;
                                continue;
                            }
                            class102.field2369[var6++] = var138;
                            continue;
                        }
                        if (var271 == 4106) {
                            var5--;
                            int var140 = class85.field2049[var5];
                            class102.field2369[var6++] = class31.method249(true, var140);
                            continue;
                        }
                        if (var271 == 4107) {
                            var6 -= 2;
                            class85.field2049[var5++] = class102.field2369[var6].method452(class102.field2369[var6 + 1], 255);
                            continue;
                        }
                        if (var271 == 4108) {
                            var5 -= 2;
                            var6--;
                            class62 var141 = class102.field2369[var6];
                            int var142 = class85.field2049[var5];
                            int var143 = class85.field2049[var5 + 1];
                            byte[] var144 = class57.field1401.method867(var143, 15, 0);
                            class89 var145 = new class89(var144);
                            class85.field2049[var5++] = var145.method693(var141, var142);
                            continue;
                        }
                        if (var271 == 4109) {
                            var5 -= 2;
                            int var146 = class85.field2049[var5 + 1];
                            var6--;
                            class62 var147 = class102.field2369[var6];
                            int var148 = class85.field2049[var5];
                            byte[] var149 = class57.field1401.method867(var146, 15, 0);
                            class89 var150 = new class89(var149);
                            class85.field2049[var5++] = var150.method687(var147, var148);
                            continue;
                        }
                        if (var271 == 4110) {
                            var6 -= 2;
                            class62 var151 = class102.field2369[var6];
                            class62 var152 = class102.field2369[var6 + 1];
                            var5--;
                            if (class85.field2049[var5] == 1) {
                                class102.field2369[var6++] = var151;
                            } else {
                                class102.field2369[var6++] = var152;
                            }
                            continue;
                        }
                        if (var271 == 4111) {
                            var6--;
                            class62 var153 = class102.field2369[var6];
                            class102.field2369[var6++] = class89.method679(var153);
                            continue;
                        }
                        if (var271 == 4112) {
                            var6--;
                            class62 var154 = class102.field2369[var6];
                            var5--;
                            int var155 = class85.field2049[var5];
                            class102.field2369[var6++] = var154.method440(var155, 0);
                            continue;
                        }
                        if (var271 == 4113) {
                            var5--;
                            int var156 = class85.field2049[var5];
                            class85.field2049[var5++] = class131.method1058(-128, var156) ? 1 : 0;
                            continue;
                        }
                        if (var271 == 4114) {
                            var5--;
                            int var157 = class85.field2049[var5];
                            class85.field2049[var5++] = class63.method479(var157, -113) ? 1 : 0;
                            continue;
                        }
                        if (var271 == 4115) {
                            var5--;
                            int var158 = class85.field2049[var5];
                            class85.field2049[var5++] = class38.method288(5, var158) ? 1 : 0;
                            continue;
                        }
                        if (var271 == 4116) {
                            var5--;
                            int var159 = class85.field2049[var5];
                            class85.field2049[var5++] = class118.method947(var159, (byte) -111) ? 1 : 0;
                            continue;
                        }
                        if (var271 == 4117) {
                            var6--;
                            class62 var160 = class102.field2369[var6];
                            if (var160 == null) {
                                class85.field2049[var5++] = 0;
                            } else {
                                class85.field2049[var5++] = var160.method460((byte) 38);
                            }
                            continue;
                        }
                        if (var271 == 4118) {
                            var5 -= 2;
                            int var161 = class85.field2049[var5];
                            var6--;
                            class62 var162 = class102.field2369[var6];
                            int var163 = class85.field2049[var5 + 1];
                            class102.field2369[var6++] = var162.method445(var163, (byte) -106, var161);
                            continue;
                        }
                        if (var271 == 4119) {
                            var6--;
                            class62 var164 = class102.field2369[var6];
                            class62 var165 = class148.method1178(var164.method460((byte) 38), 0);
                            boolean var166 = false;
                            for (int var167 = 0; var164.method460((byte) 38) > var167; var167++) {
                                int var168 = var164.method446((byte) -15, var167);
                                if (var168 == 60) {
                                    var166 = true;
                                } else if (var168 == 62) {
                                    var166 = false;
                                } else if (!var166) {
                                    var165.method453(6381, var168);
                                }
                            }
                            var165.method437((byte) 84);
                            class102.field2369[var6++] = var165;
                            continue;
                        }
                        if (var271 == 4120) {
                            var5--;
                            int var169 = class85.field2049[var5];
                            var6--;
                            class62 var170 = class102.field2369[var6];
                            class85.field2049[var5++] = var170.method441(var169, (byte) -36);
                            continue;
                        }
                    } else if (var271 < 4300) {
                        if (var271 == 4200) {
                            var5--;
                            int var192 = class85.field2049[var5];
                            class102.field2369[var6++] = class140.method1114(var192, false).field571;
                            continue;
                        }
                        if (var271 == 4201) {
                            var5 -= 2;
                            int var193 = class85.field2049[var5];
                            int var194 = class85.field2049[var5 + 1];
                            class23 var195 = class140.method1114(var193, false);
                            if (var194 >= 1 && var194 <= 5 && var195.field552[var194 - 1] != null) {
                                class102.field2369[var6++] = var195.field552[var194 - 1];
                                continue;
                            }
                            class102.field2369[var6++] = class153.field3576;
                            continue;
                        }
                        if (var271 == 4202) {
                            var5 -= 2;
                            int var196 = class85.field2049[var5];
                            int var197 = class85.field2049[var5 + 1];
                            class23 var198 = class140.method1114(var196, false);
                            if (var197 >= 1 && var197 <= 5 && var198.field581[var197 - 1] != null) {
                                class102.field2369[var6++] = var198.field581[var197 - 1];
                                continue;
                            }
                            class102.field2369[var6++] = class153.field3576;
                            continue;
                        }
                        if (var271 == 4203) {
                            var5--;
                            int var199 = class85.field2049[var5];
                            class85.field2049[var5++] = class140.method1114(var199, false).field578;
                            continue;
                        }
                        if (var271 == 4204) {
                            var5--;
                            int var200 = class85.field2049[var5];
                            class85.field2049[var5++] = class140.method1114(var200, false).field547 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var271 == 4205) {
                            var5--;
                            int var201 = class85.field2049[var5];
                            class23 var202 = class140.method1114(var201, false);
                            if (var202.field565 == -1 && var202.field535 >= 0) {
                                class85.field2049[var5++] = var202.field535;
                                continue;
                            }
                            class85.field2049[var5++] = var201;
                            continue;
                        }
                        if (var271 == 4206) {
                            var5--;
                            int var203 = class85.field2049[var5];
                            class23 var204 = class140.method1114(var203, false);
                            if (var204.field565 >= 0 && var204.field535 >= 0) {
                                class85.field2049[var5++] = var204.field535;
                                continue;
                            }
                            class85.field2049[var5++] = var203;
                            continue;
                        }
                        if (var271 == 4207) {
                            var5--;
                            int var205 = class85.field2049[var5];
                            class85.field2049[var5++] = class140.method1114(var205, false).field551 ? 1 : 0;
                            continue;
                        }
                    } else if (var271 < 5100) {
                        if (var271 == 5000) {
                            class85.field2049[var5++] = class85.field2047;
                            continue;
                        }
                        if (var271 == 5001) {
                            class102.field2374++;
                            var5 -= 3;
                            class85.field2047 = class85.field2049[var5];
                            class81.field1954 = class85.field2049[var5 + 1];
                            class121.field2771 = class85.field2049[var5 + 2];
                            class136.field3140.method810(-2, 38);
                            class136.field3140.method1010(class85.field2047, 32768);
                            class136.field3140.method1010(class81.field1954, 32768);
                            class136.field3140.method1010(class121.field2771, 32768);
                            continue;
                        }
                        if (var271 == 5002) {
                            var5 -= 2;
                            class28.field683++;
                            var6--;
                            class62 var171 = class102.field2369[var6];
                            int var172 = class85.field2049[var5 + 1];
                            int var173 = class85.field2049[var5];
                            class136.field3140.method810(-2, 37);
                            class136.field3140.method1008(var171.method448(37), (byte) 38);
                            class136.field3140.method1010(var173 - 1, 32768);
                            class136.field3140.method1010(var172, 32768);
                            continue;
                        }
                        if (var271 == 5003) {
                            var5--;
                            int var174 = class85.field2049[var5];
                            class62 var175 = null;
                            if (var174 < 100) {
                                var175 = class111.field2525[var174];
                            }
                            if (var175 == null) {
                                var175 = class153.field3576;
                            }
                            class102.field2369[var6++] = var175;
                            continue;
                        }
                        if (var271 == 5004) {
                            int var176 = -1;
                            var5--;
                            int var177 = class85.field2049[var5];
                            if (var177 < 100 && class111.field2525[var177] != null) {
                                var176 = class34.field820[var177];
                            }
                            class85.field2049[var5++] = var176;
                            continue;
                        }
                        if (var271 == 5005) {
                            class85.field2049[var5++] = class81.field1954;
                            continue;
                        }
                        if (var271 == 5008) {
                            var6--;
                            class62 var178 = class102.field2369[var6];
                            if (var178.method450(class141.field3310, (byte) -113)) {
                                class3.method11(var178, -1000);
                            } else {
                                class93.field2182++;
                                byte var179 = 0;
                                class62 var180 = var178.method457(-64);
                                if (var180.method450(class94.field2188, (byte) -114)) {
                                    var179 = 0;
                                    var178 = var178.method471((byte) -110, class94.field2188.method460((byte) 38));
                                } else if (var180.method450(class52.field1199, (byte) -89)) {
                                    var178 = var178.method471((byte) -110, class52.field1199.method460((byte) 38));
                                    var179 = 1;
                                } else if (var180.method450(class70.field1775, (byte) -80)) {
                                    var178 = var178.method471((byte) -110, class70.field1775.method460((byte) 38));
                                    var179 = 2;
                                } else if (var180.method450(class134.field3065, (byte) -97)) {
                                    var179 = 3;
                                    var178 = var178.method471((byte) -110, class134.field3065.method460((byte) 38));
                                } else if (var180.method450(class3.field26, (byte) -71)) {
                                    var178 = var178.method471((byte) -110, class3.field26.method460((byte) 38));
                                    var179 = 4;
                                } else if (var180.method450(class94.field2200, (byte) -117)) {
                                    var178 = var178.method471((byte) -110, class94.field2200.method460((byte) 38));
                                    var179 = 5;
                                } else if (var180.method450(class131.field3007, (byte) -113)) {
                                    var179 = 6;
                                    var178 = var178.method471((byte) -110, class131.field3007.method460((byte) 38));
                                } else if (var180.method450(class98.field2298, (byte) -80)) {
                                    var178 = var178.method471((byte) -110, class98.field2298.method460((byte) 38));
                                    var179 = 7;
                                } else if (var180.method450(class30.field750, (byte) -111)) {
                                    var178 = var178.method471((byte) -110, class30.field750.method460((byte) 38));
                                    var179 = 8;
                                } else if (var180.method450(class121.field2767, (byte) -65)) {
                                    var178 = var178.method471((byte) -110, class121.field2767.method460((byte) 38));
                                    var179 = 9;
                                } else if (var180.method450(class151.field3549, (byte) -65)) {
                                    var179 = 10;
                                    var178 = var178.method471((byte) -110, class151.field3549.method460((byte) 38));
                                } else if (var180.method450(class119.field2711, (byte) -102)) {
                                    var178 = var178.method471((byte) -110, class119.field2711.method460((byte) 38));
                                    var179 = 11;
                                } else if (class52.field1189 != 0) {
                                    if (var180.method450(class94.field2216, (byte) -71)) {
                                        var179 = 0;
                                        var178 = var178.method471((byte) -110, class94.field2216.method460((byte) 38));
                                    } else if (var180.method450(class52.field1202, (byte) -109)) {
                                        var179 = 1;
                                        var178 = var178.method471((byte) -110, class52.field1202.method460((byte) 38));
                                    } else if (var180.method450(class70.field1774, (byte) -91)) {
                                        var178 = var178.method471((byte) -110, class70.field1774.method460((byte) 38));
                                        var179 = 2;
                                    } else if (var180.method450(class134.field3058, (byte) -78)) {
                                        var178 = var178.method471((byte) -110, class134.field3058.method460((byte) 38));
                                        var179 = 3;
                                    } else if (var180.method450(class3.field23, (byte) -126)) {
                                        var178 = var178.method471((byte) -110, class3.field23.method460((byte) 38));
                                        var179 = 4;
                                    } else if (var180.method450(class94.field2189, (byte) -79)) {
                                        var178 = var178.method471((byte) -110, class94.field2189.method460((byte) 38));
                                        var179 = 5;
                                    } else if (var180.method450(class131.field3004, (byte) -77)) {
                                        var178 = var178.method471((byte) -110, class131.field3004.method460((byte) 38));
                                        var179 = 6;
                                    } else if (var180.method450(class98.field2296, (byte) -90)) {
                                        var179 = 7;
                                        var178 = var178.method471((byte) -110, class98.field2296.method460((byte) 38));
                                    } else if (var180.method450(class30.field736, (byte) -118)) {
                                        var178 = var178.method471((byte) -110, class30.field736.method460((byte) 38));
                                        var179 = 8;
                                    } else if (var180.method450(class121.field2770, (byte) -113)) {
                                        var178 = var178.method471((byte) -110, class121.field2770.method460((byte) 38));
                                        var179 = 9;
                                    } else if (var180.method450(class151.field3558, (byte) -80)) {
                                        var179 = 10;
                                        var178 = var178.method471((byte) -110, class151.field3558.method460((byte) 38));
                                    } else if (var180.method450(class119.field2708, (byte) -63)) {
                                        var178 = var178.method471((byte) -110, class119.field2708.method460((byte) 38));
                                        var179 = 11;
                                    }
                                }
                                class62 var181 = var178.method457(-64);
                                byte var182 = 0;
                                if (var181.method450(class51.field1170, (byte) -92)) {
                                    var182 = 1;
                                    var178 = var178.method471((byte) -110, class51.field1170.method460((byte) 38));
                                } else if (var181.method450(class118.field2683, (byte) -104)) {
                                    var182 = 2;
                                    var178 = var178.method471((byte) -110, class118.field2683.method460((byte) 38));
                                } else if (var181.method450(class90.field2140, (byte) -89)) {
                                    var182 = 3;
                                    var178 = var178.method471((byte) -110, class90.field2140.method460((byte) 38));
                                } else if (var181.method450(class48.field1132, (byte) -96)) {
                                    var178 = var178.method471((byte) -110, class48.field1132.method460((byte) 38));
                                    var182 = 4;
                                } else if (var181.method450(class132.field3021, (byte) -69)) {
                                    var182 = 5;
                                    var178 = var178.method471((byte) -110, class132.field3021.method460((byte) 38));
                                } else if (class52.field1189 != 0) {
                                    if (var181.method450(class51.field1184, (byte) -66)) {
                                        var178 = var178.method471((byte) -110, class51.field1184.method460((byte) 38));
                                        var182 = 1;
                                    } else if (var181.method450(class118.field2689, (byte) -111)) {
                                        var182 = 2;
                                        var178 = var178.method471((byte) -110, class118.field2689.method460((byte) 38));
                                    } else if (var181.method450(class90.field2155, (byte) -87)) {
                                        var178 = var178.method471((byte) -110, class90.field2155.method460((byte) 38));
                                        var182 = 3;
                                    } else if (var181.method450(class48.field1109, (byte) -88)) {
                                        var182 = 4;
                                        var178 = var178.method471((byte) -110, class48.field1109.method460((byte) 38));
                                    } else if (var181.method450(class132.field3024, (byte) -103)) {
                                        var182 = 5;
                                        var178 = var178.method471((byte) -110, class132.field3024.method460((byte) 38));
                                    }
                                }
                                class136.field3140.method810(-2, 139);
                                class136.field3140.method1010(0, 32768);
                                int var183 = class136.field3140.field2873;
                                class136.field3140.method1010(var179, 32768);
                                class136.field3140.method1010(var182, 32768);
                                class47.method335(var178, true, class136.field3140);
                                class136.field3140.method1033(class136.field3140.field2873 - var183, (byte) -54);
                            }
                            continue;
                        }
                        if (var271 == 5009) {
                            var6 -= 2;
                            class62 var184 = class102.field2369[var6];
                            class62 var185 = class102.field2369[var6 + 1];
                            class35.field835++;
                            class136.field3140.method810(-2, 190);
                            class136.field3140.method1010(0, 32768);
                            int var186 = class136.field3140.field2873;
                            class136.field3140.method1008(var184.method448(37), (byte) 38);
                            class47.method335(var185, true, class136.field3140);
                            class136.field3140.method1033(class136.field3140.field2873 - var186, (byte) -54);
                            continue;
                        }
                        if (var271 == 5010) {
                            var5--;
                            int var187 = class85.field2049[var5];
                            class62 var188 = null;
                            if (var187 < 100) {
                                var188 = class118.field2696[var187];
                            }
                            if (var188 == null) {
                                var188 = class153.field3576;
                            }
                            class102.field2369[var6++] = var188;
                            continue;
                        }
                        if (var271 == 5011) {
                            var5--;
                            int var189 = class85.field2049[var5];
                            class62 var190 = null;
                            if (var189 < 100) {
                                var190 = class122.field2797[var189];
                            }
                            if (var190 == null) {
                                var190 = class153.field3576;
                            }
                            class102.field2369[var6++] = var190;
                            continue;
                        }
                        if (var271 == 5015) {
                            class62 var191;
                            if (class40.field936 == null || class40.field936.field2653 == null) {
                                var191 = class7.field210;
                            } else {
                                var191 = class40.field936.field2653;
                            }
                            class102.field2369[var6++] = var191;
                            continue;
                        }
                        if (var271 == 5016) {
                            class85.field2049[var5++] = class121.field2771;
                            continue;
                        }
                    }
                } else {
                    class54 var64;
                    if (var271 < 2000) {
                        var64 = var41 ? class28.field687 : class75.field1866;
                    } else {
                        var271 -= 1000;
                        var5--;
                        var64 = class62.method456(class85.field2049[var5], (byte) 81);
                    }
                    if (var271 == 1300) {
                        var5--;
                        int var65 = class85.field2049[var5] - 1;
                        if (var65 >= 0 && var65 <= 9) {
                            var6--;
                            var64.method370(class102.field2369[var6], var65, -1);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var271 == 1301) {
                        var5 -= 2;
                        int var66 = class85.field2049[var5 + 1];
                        int var67 = class85.field2049[var5];
                        var64.field1286 = class68.method533((byte) -100, var66, var67);
                        continue;
                    }
                    if (var271 == 1302) {
                        var5--;
                        var64.field1288 = class85.field2049[var5] == 1;
                        continue;
                    }
                    if (var271 == 1303) {
                        var5--;
                        var64.field1264 = class85.field2049[var5];
                        continue;
                    }
                    if (var271 == 1304) {
                        var5--;
                        var64.field1353 = class85.field2049[var5];
                        continue;
                    }
                    if (var271 == 1305) {
                        var6--;
                        var64.field1260 = class102.field2369[var6];
                        continue;
                    }
                    if (var271 == 1306) {
                        var6--;
                        var64.field1246 = class102.field2369[var6];
                        continue;
                    }
                    if (var271 == 1307) {
                        var64.field1229 = null;
                        continue;
                    }
                }
                class62 var264 = class148.method1178(30, 0);
                if (var4.field1069 != null) {
                    var264.method451(class13.field305, -66).method451(var4.field1069, -66);
                    for (int var265 = class13.field309 - 1; var265 >= 0; var265--) {
                        var264.method451(class72.field1847, -66).method451(class150.field3531[var265].field902.field1069, -66);
                    }
                    if (class4.field39 != 0) {
                        class43.method320(0, 0, class70.method594(new class62[] { class82.field1982, var4.field1069 }, 1229), class153.field3576);
                    }
                }
                class93.method715(null, "CS2 - nosuchop:" + var271 + new String(var264.method472(1)), true);
                return;
            }
        } catch (Exception var270) {
            class62 var267 = class148.method1178(30, 0);
            if (var4.field1069 != null) {
                var267.method451(class13.field305, -66).method451(var4.field1069, -66);
                for (int var268 = class13.field309 - 1; var268 >= 0; var268--) {
                    var267.method451(class72.field1847, -66).method451(class150.field3531[var268].field902.field1069, -66);
                }
                if (var10 == 40) {
                    int var269 = var9[var7];
                    var267.method451(class141.field3288, -66).method451(class31.method249(true, var269), -66);
                }
                if (class4.field39 != 0) {
                    class43.method320(0, 0, class70.method594(new class62[] { class82.field1982, var4.field1069 }, 1229), class153.field3576);
                }
            }
            class93.method715(var270, "CS2 - scr:" + var4.field3493 + " op:" + var10 + new String(var267.method472(1)), true);
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(B)I")
    public final int method977(byte arg0) throws IOException {
        field2834++;
        if (this.field2814) {
            return 0;
        } else if (arg0 == 80) {
            return this.field2832.read();
        } else {
            return 56;
        }
    }

    @OriginalMember(owner = "client!rf", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (true) {
                label82: {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field2827 == this.field2823) {
                            if (this.field2814) {
                                break label82;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        if (this.field2823 < this.field2827) {
                            var2 = 5000 - this.field2827;
                        } else {
                            var2 = this.field2823 - this.field2827;
                        }
                        var3 = this.field2827;
                    }
                    if (var2 <= 0) {
                        continue;
                    }
                    try {
                        this.field2822.write(this.field2811, var3, var2);
                    } catch (IOException var9) {
                        this.field2817 = true;
                    }
                    this.field2827 = (this.field2827 + var2) % 5000;
                    try {
                        if (this.field2827 == this.field2823) {
                            this.field2822.flush();
                        }
                    } catch (IOException var8) {
                        this.field2817 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2832 != null) {
                        this.field2832.close();
                    }
                    if (this.field2822 != null) {
                        this.field2822.close();
                    }
                    if (this.field2813 != null) {
                        this.field2813.close();
                    }
                } catch (IOException var7) {
                }
                this.field2811 = null;
                break;
            }
        } catch (Exception var12) {
            class93.method715(var12, null, true);
        }
        field2825++;
    }

    @OriginalMember(owner = "client!rf", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method978(67);
        field2815++;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)V")
    public final void method978(int arg0) {
        field2810++;
        if (this.field2814) {
            return;
        }
        synchronized (this) {
            this.field2814 = true;
            if (arg0 < 25) {
                this.field2822 = null;
            }
            this.notifyAll();
        }
        if (this.field2816 != null) {
            while (this.field2816.field471 == 0) {
                class146.method1168(-19127, 1L);
            }
            if (this.field2816.field471 == 1) {
                try {
                    ((Thread) this.field2816.field473).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field2816 = null;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(II[BI)V")
    public final void method979(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field2821++;
        if (this.field2814) {
            return;
        }
        if (this.field2817) {
            this.field2817 = false;
            throw new IOException();
        }
        if (this.field2811 == null) {
            this.field2811 = new byte[5000];
        }
        synchronized (this) {
            if (arg1 == 19770) {
                for (int var6 = 0; var6 < arg0; var6++) {
                    this.field2811[this.field2823] = arg2[arg3 + var6];
                    this.field2823 = (this.field2823 + 1) % 5000;
                    if ((this.field2827 + 4900) % 5000 == this.field2823) {
                        throw new IOException();
                    }
                }
                if (this.field2816 == null) {
                    this.field2816 = this.field2824.method310(this, 3, (byte) -1);
                }
                this.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(B)V")
    public static void method980(byte arg0) {
        field2835 = null;
        field2833 = null;
        field2836 = null;
        field2837 = null;
        if (arg0 >= 112) {
            field2820 = null;
        }
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(I)Lpf;")
    public static final class110 method981(int arg0) {
        field2819++;
        if (arg0 != -1117) {
            return null;
        }
        try {
            return (class110) Class.forName("wc").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return new class97();
        }
    }

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "(I)I")
    public final int method982(int arg0) throws IOException {
        field2829++;
        if (this.field2814) {
            return 0;
        } else {
            if (arg0 >= -90) {
                field2835 = null;
            }
            return this.field2832.available();
        }
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(Ljava/net/Socket;Lfe;)V")
    public class124(Socket arg0, class41 arg1) throws IOException {
        this.field2824 = arg1;
        this.field2813 = arg0;
        this.field2813.setSoTimeout(30000);
        this.field2813.setTcpNoDelay(true);
        this.field2832 = this.field2813.getInputStream();
        this.field2822 = this.field2813.getOutputStream();
    }
}
