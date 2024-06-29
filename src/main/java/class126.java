import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class126 {

    @OriginalMember(owner = "client!sc", name = "w", descriptor = "[I")
    private int[] field3015;

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "Lu;")
    public static class135 field3000 = class87.method676((byte) -96, "Bitte benutzen Sie eine andere Welt)3");

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "I")
    public static int field2998 = 0;

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "Lu;")
    private static class135 field3003 = class87.method676((byte) -90, "@or1@");

    @OriginalMember(owner = "client!sc", name = "q", descriptor = "I")
    public static int field3009 = 0;

    @OriginalMember(owner = "client!sc", name = "s", descriptor = "Lu;")
    private static class135 field3011 = class87.method676((byte) -120, "No response from server)3");

    @OriginalMember(owner = "client!sc", name = "l", descriptor = "Z")
    public static boolean field3004 = false;

    @OriginalMember(owner = "client!sc", name = "o", descriptor = "Lu;")
    public static class135 field3007 = class87.method676((byte) -74, "gelb:");

    @OriginalMember(owner = "client!sc", name = "t", descriptor = "Lu;")
    private static class135 field3012 = class87.method676((byte) -63, "Please try again)3");

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "Lu;")
    public static class135 field2999 = field3012;

    @OriginalMember(owner = "client!sc", name = "n", descriptor = "Lu;")
    public static class135 field3006 = field3011;

    @OriginalMember(owner = "client!sc", name = "v", descriptor = "I")
    public static int field3014 = 0;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
    public static int field2993;

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "I")
    public static int field2994;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
    public static int field2996;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
    public static int field2997;

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "I")
    public static int field3001;

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "I")
    public static int field3002;

    @OriginalMember(owner = "client!sc", name = "m", descriptor = "I")
    public static int field3005;

    @OriginalMember(owner = "client!sc", name = "r", descriptor = "I")
    public static int field3010;

    @OriginalMember(owner = "client!sc", name = "u", descriptor = "I")
    public static int field3013;

    @OriginalMember(owner = "client!sc", name = "x", descriptor = "I")
    public static int field3016;

    @OriginalMember(owner = "client!sc", name = "p", descriptor = "Lre;")
    public static class122 field3008;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "[Lae;")
    public static class6[] field2995;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)I")
    public final int method980(int arg0, int arg1) {
        field3013++;
        if (arg1 < 106) {
            this.field3015 = null;
        }
        int var3 = this.field3015.length - 2;
        int var4 = arg0 << 1 & var3;
        while (true) {
            int var5 = this.field3015[var4];
            if (arg0 == var5) {
                return this.field3015[var4 + 1];
            }
            if (var5 == -1) {
                return -1;
            }
            var4 = var3 & var4 + 2;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(BII)Lu;")
    public static final class135 method981(byte arg0, int arg1, int arg2) {
        field2997++;
        int var3 = arg2 - arg1;
        int var4 = 17 / ((arg0 - 67) / 43);
        if (var3 < -9) {
            return class115.field2750;
        } else if (var3 < -6) {
            return class26.field630;
        } else if (var3 < -3) {
            return class42.field997;
        } else if (var3 < 0) {
            return field3003;
        } else if (var3 > 9) {
            return class85.field2017;
        } else if (var3 > 6) {
            return class97.field2357;
        } else if (var3 > 3) {
            return class38.field873;
        } else if (var3 > 0) {
            return class56.field1354;
        } else {
            return class25.field620;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ZII)I")
    public static final int method982(boolean arg0, int arg1, int arg2) {
        field2994++;
        class69 var3 = (class69) class103.field2490.method842((long) arg2, 126);
        if (var3 == null) {
            return -1;
        } else {
            if (!arg0) {
                field3009 = 61;
            }
            return arg1 >= 0 && var3.field1692.length > arg1 ? var3.field1692[arg1] : -1;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IZB)Lu;")
    public static final class135 method983(int arg0, boolean arg1, byte arg2) {
        int var3 = -48 % ((arg2 - 10) / 56);
        field2993++;
        return class52.method398(arg1, arg0, -1001, 10);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "([Lob;ILsd;)V")
    public static final void method984(class99[] arg0, int arg1, class127 arg2) {
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var110 = 0; var110 < 104; var110++) {
                for (int var111 = 0; var111 < 104; var111++) {
                    if ((client.field525[var3][var110][var111] & 0x1) == 1) {
                        int var112 = var3;
                        if ((client.field525[1][var110][var111] & 0x2) == 2) {
                            var112 = var3 - 1;
                        }
                        if (var112 >= 0) {
                            arg0[var112].method813(var111, var110, arg1 ^ 0xFED38973);
                        }
                    }
                }
            }
        }
        field3016++;
        client.field513 += (int) (Math.random() * 5.0D) - 2;
        if (client.field513 < -16) {
            client.field513 = -16;
        }
        if (client.field513 > 16) {
            client.field513 = 16;
        }
        class115.field2762 += (int) (Math.random() * 5.0D) - 2;
        if (class115.field2762 < -8) {
            class115.field2762 = -8;
        }
        if (class115.field2762 > 8) {
            class115.field2762 = 8;
        }
        for (int var4 = 0; var4 < 4; var4++) {
            byte[][] var47 = class52.field1241[var4];
            int var48 = (int) Math.sqrt(5100.0D);
            int var49 = var48 * 768 >> 8;
            for (int var50 = 1; var50 < 103; var50++) {
                for (int var101 = 1; var101 < 103; var101++) {
                    int var102 = class68.field1682[var4][var101][var50 + 1] - class68.field1682[var4][var101][var50 - 1];
                    int var103 = class68.field1682[var4][var101 + 1][var50] - class68.field1682[var4][var101 - 1][var50];
                    int var104 = (int) Math.sqrt((double) (var102 * var102 + var103 * var103 + 65536));
                    int var105 = 65536 / var104;
                    int var106 = (var102 << 8) / var104;
                    int var107 = (var47[var101][var50 - 1] >> 2) + (var47[var101 - 1][var50] >> 2) + (var47[var101 - -1][var50] >> 3) + (var47[var101][var50 + 1] >> 3) + (var47[var101][var50] >> 1);
                    int var108 = (var103 << 8) / var104;
                    int var109 = (var106 * -50 + var105 * -10 + var108 * -50) / var49 + 96;
                    class32.field759[var101][var50] = var109 - var107;
                }
            }
            for (int var51 = 0; var51 < 104; var51++) {
                class122.field2924[var51] = 0;
                class113.field2726[var51] = 0;
                class116.field2800[var51] = 0;
                class135.field3237[var51] = 0;
                class152.field3754[var51] = 0;
            }
            for (int var52 = -5; var52 < 109; var52++) {
                for (int var55 = 0; var55 < 104; var55++) {
                    int var95 = var52 + 5;
                    int var10002;
                    if (var95 >= 0 && var95 < 104) {
                        int var96 = class44.field1055[var4][var95][var55] & 0xFF;
                        if (var96 > 0) {
                            class28 var97 = class93.method758(15318, var96 - 1);
                            class122.field2924[var55] += var97.field683;
                            class113.field2726[var55] += var97.field686;
                            class116.field2800[var55] += var97.field662;
                            class135.field3237[var55] += var97.field680;
                            var10002 = class152.field3754[var55]++;
                        }
                    }
                    int var98 = var52 - 5;
                    if (var98 >= 0 && var98 < 104) {
                        int var99 = class44.field1055[var4][var98][var55] & 0xFF;
                        if (var99 > 0) {
                            class28 var100 = class93.method758(arg1 ^ 0xFFFFB3AD, var99 - 1);
                            class122.field2924[var55] -= var100.field683;
                            class113.field2726[var55] -= var100.field686;
                            class116.field2800[var55] -= var100.field662;
                            class135.field3237[var55] -= var100.field680;
                            var10002 = class152.field3754[var55]--;
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
                            var56 += class113.field2726[var62];
                            var57 += class116.field2800[var62];
                            var60 += class135.field3237[var62];
                            var58 += class122.field2924[var62];
                            var59 += class152.field3754[var62];
                        }
                        int var63 = var61 - 5;
                        if (var63 >= 0 && var63 < 104) {
                            var57 -= class116.field2800[var63];
                            var60 -= class135.field3237[var63];
                            var59 -= class152.field3754[var63];
                            var56 -= class113.field2726[var63];
                            var58 -= class122.field2924[var63];
                        }
                        if (var61 >= 1 && var61 < 103 && (!class100.field2422 || (client.field525[0][var52][var61] & 0x2) != 0 || (client.field525[var4][var52][var61] & 0x10) == 0 && class75.method608(var4, var52, var61, 113) == class86.field2045)) {
                            if (var4 < class128.field3095) {
                                class128.field3095 = var4;
                            }
                            int var64 = class44.field1055[var4][var52][var61] & 0xFF;
                            int var65 = class132.field3197[var4][var52][var61] & 0xFF;
                            if (var64 > 0 || var65 > 0) {
                                int var66 = class68.field1682[var4][var52][var61];
                                int var67 = class68.field1682[var4][var52 + 1][var61];
                                int var68 = class68.field1682[var4][var52][var61 + 1];
                                int var69 = class32.field759[var52][var61];
                                int var70 = class32.field759[var52 + 1][var61];
                                int var71 = class68.field1682[var4][var52 + 1][var61 + 1];
                                int var72 = class32.field759[var52 + 1][var61 + 1];
                                int var73 = class32.field759[var52][var61 + 1];
                                int var74 = -1;
                                int var75 = -1;
                                if (var64 > 0) {
                                    int var76 = var58 * 256 / var60;
                                    int var77 = var56 / var59;
                                    int var78 = var57 / var59;
                                    var74 = class86.method673(1, var77, var78, var76);
                                    int var79 = client.field513 + var78;
                                    int var80 = var76 + class115.field2762 & 0xFF;
                                    if (var79 < 0) {
                                        var79 = 0;
                                    } else if (var79 > 255) {
                                        var79 = 255;
                                    }
                                    var75 = class86.method673(1, var77, var79, var80);
                                }
                                if (var4 > 0) {
                                    boolean var81 = true;
                                    if (var64 == 0 && class107.field2576[var4][var52][var61] != 0) {
                                        var81 = false;
                                    }
                                    if (var65 > 0 && !class62.method512(-4, var65 - 1).field2300) {
                                        var81 = false;
                                    }
                                    if (var81 && var66 == var67 && var66 == var71 && var66 == var68) {
                                        class132.field3199[var4][var52][var61] = class44.method346(class132.field3199[var4][var52][var61], 2340);
                                    }
                                }
                                int var82 = 0;
                                if (var75 != -1) {
                                    var82 = class51.field1206[class145.method1191(-6, 96, var75)];
                                }
                                if (var65 == 0) {
                                    arg2.method1027(var4, var52, var61, 0, 0, -1, var66, var67, var71, var68, class145.method1191(-6, var69, var74), class145.method1191(-6, var70, var74), class145.method1191(arg1 + 30591, var72, var74), class145.method1191(arg1 ^ 0x7781, var73, var74), 0, 0, 0, 0, var82, 0);
                                } else {
                                    int var83 = class107.field2576[var4][var52][var61] + 1;
                                    byte var84 = class97.field2354[var4][var52][var61];
                                    class95 var85 = class62.method512(-4, var65 - 1);
                                    int var86 = var85.field2299;
                                    int var87;
                                    int var88;
                                    if (var86 >= 0) {
                                        var87 = class51.field1209.method413(-4078, var86);
                                        var88 = -1;
                                    } else if (var85.field2305 == 16711935) {
                                        var88 = -2;
                                        var86 = -1;
                                        var87 = -2;
                                    } else {
                                        var88 = class86.method673(1, var85.field2307, var85.field2314, var85.field2316);
                                        int var89 = class115.field2762 + var85.field2316 & 0xFF;
                                        int var90 = var85.field2314 + client.field513;
                                        if (var90 < 0) {
                                            var90 = 0;
                                        } else if (var90 > 255) {
                                            var90 = 255;
                                        }
                                        var87 = class86.method673(1, var85.field2307, var90, var89);
                                    }
                                    int var91 = 0;
                                    if (var87 != -2) {
                                        var91 = class51.field1206[class146.method1193(96, var87, false)];
                                    }
                                    if (var85.field2311 != -1) {
                                        int var92 = client.field513 + var85.field2320;
                                        if (var92 < 0) {
                                            var92 = 0;
                                        } else if (var92 > 255) {
                                            var92 = 255;
                                        }
                                        int var93 = class115.field2762 + var85.field2296 & 0xFF;
                                        int var94 = class86.method673(1, var85.field2310, var92, var93);
                                        var91 = class51.field1206[class146.method1193(96, var94, false)];
                                    }
                                    arg2.method1027(var4, var52, var61, var83, var84, var86, var66, var67, var71, var68, class145.method1191(-6, var69, var74), class145.method1191(-6, var70, var74), class145.method1191(arg1 ^ 0x7781, var72, var74), class145.method1191(-6, var73, var74), class146.method1193(var69, var88, false), class146.method1193(var70, var88, false), class146.method1193(var72, var88, false), class146.method1193(var73, var88, false), var82, var91);
                                }
                            }
                        }
                    }
                }
            }
            for (int var53 = 1; var53 < 103; var53++) {
                for (int var54 = 1; var54 < 103; var54++) {
                    arg2.method1026(var4, var54, var53, class75.method608(var4, var54, var53, arg1 ^ 0xFFFF882C));
                }
            }
            class44.field1055[var4] = null;
            class132.field3197[var4] = null;
            class107.field2576[var4] = null;
            class97.field2354[var4] = null;
            class52.field1241[var4] = null;
        }
        arg2.method1014(-50, -10, -50);
        for (int var5 = 0; var5 < 104; var5++) {
            for (int var46 = 0; var46 < 104; var46++) {
                if ((client.field525[1][var5][var46] & 0x2) == 2) {
                    arg2.method990(var5, var46);
                }
            }
        }
        if (arg1 != -30597) {
            method983(-16, false, (byte) 63);
        }
        int var6 = 1;
        int var7 = 2;
        int var8 = 4;
        for (int var9 = 0; var9 < 4; var9++) {
            if (var9 > 0) {
                var8 <<= 0x3;
                var7 <<= 0x3;
                var6 <<= 0x3;
            }
            for (int var10 = 0; var10 <= var9; var10++) {
                for (int var11 = 0; var11 <= 104; var11++) {
                    for (int var12 = 0; var12 <= 104; var12++) {
                        if ((class132.field3199[var10][var12][var11] & var6) != 0) {
                            int var13 = var11;
                            int var14;
                            for (var14 = var11; var14 > 0 && (var6 & class132.field3199[var10][var12][var14 - 1]) != 0; var14--) {
                            }
                            int var15 = var10;
                            int var16 = var10;
                            while (var13 < 104 && (class132.field3199[var10][var12][var13 + 1] & var6) != 0) {
                                var13++;
                            }
                            label354: while (var15 > 0) {
                                for (int var17 = var14; var17 <= var13; var17++) {
                                    if ((var6 & class132.field3199[var15 - 1][var12][var17]) == 0) {
                                        break label354;
                                    }
                                }
                                var15--;
                            }
                            label343: while (var9 > var16) {
                                for (int var18 = var14; var18 <= var13; var18++) {
                                    if ((var6 & class132.field3199[var16 + 1][var12][var18]) == 0) {
                                        break label343;
                                    }
                                }
                                var16++;
                            }
                            int var19 = (var13 + 1 - var14) * (var16 + 1 - var15);
                            if (var19 >= 8) {
                                short var20 = 240;
                                int var21 = class68.field1682[var16][var12][var14] - var20;
                                int var22 = class68.field1682[var15][var12][var14];
                                class127.method1031(var9, 1, var12 * 128, var12 * 128, var14 * 128, var13 * 128 + 128, var21, var22);
                                for (int var23 = var15; var23 <= var16; var23++) {
                                    for (int var24 = var14; var24 <= var13; var24++) {
                                        class132.field3199[var23][var12][var24] = class4.method19(class132.field3199[var23][var12][var24], ~var6);
                                    }
                                }
                            }
                        }
                        if ((var7 & class132.field3199[var10][var12][var11]) != 0) {
                            int var25 = var12;
                            int var26 = var10;
                            while (var25 < 104 && (var7 & class132.field3199[var10][var25 + 1][var11]) != 0) {
                                var25++;
                            }
                            int var27 = var12;
                            int var28 = var10;
                            while (var27 > 0 && (var7 & class132.field3199[var10][var27 - 1][var11]) != 0) {
                                var27--;
                            }
                            label408: while (var26 > 0) {
                                for (int var29 = var27; var29 <= var25; var29++) {
                                    if ((class132.field3199[var26 - 1][var29][var11] & var7) == 0) {
                                        break label408;
                                    }
                                }
                                var26--;
                            }
                            label397: while (var28 < var9) {
                                for (int var30 = var27; var30 <= var25; var30++) {
                                    if ((var7 & class132.field3199[var28 + 1][var30][var11]) == 0) {
                                        break label397;
                                    }
                                }
                                var28++;
                            }
                            int var31 = (var25 + 1 - var27) * (var28 + 1 - var26);
                            if (var31 >= 8) {
                                short var32 = 240;
                                int var33 = class68.field1682[var28][var27][var11] - var32;
                                int var34 = class68.field1682[var26][var27][var11];
                                class127.method1031(var9, 2, var27 * 128, var25 * 128 + 128, var11 * 128, var11 * 128, var33, var34);
                                for (int var35 = var26; var35 <= var28; var35++) {
                                    for (int var36 = var27; var36 <= var25; var36++) {
                                        class132.field3199[var35][var36][var11] = class4.method19(class132.field3199[var35][var36][var11], ~var7);
                                    }
                                }
                            }
                        }
                        if ((var8 & class132.field3199[var10][var12][var11]) != 0) {
                            int var37 = var12;
                            int var38 = var12;
                            int var39 = var11;
                            int var40;
                            for (var40 = var11; var40 > 0 && (class132.field3199[var10][var12][var40 - 1] & var8) != 0; var40--) {
                            }
                            while (var39 < 104 && (class132.field3199[var10][var12][var39 + 1] & var8) != 0) {
                                var39++;
                            }
                            label462: while (var38 > 0) {
                                for (int var41 = var40; var41 <= var39; var41++) {
                                    if ((class132.field3199[var10][var38 - 1][var41] & var8) == 0) {
                                        break label462;
                                    }
                                }
                                var38--;
                            }
                            label451: while (var37 < 104) {
                                for (int var42 = var40; var42 <= var39; var42++) {
                                    if ((var8 & class132.field3199[var10][var37 + 1][var42]) == 0) {
                                        break label451;
                                    }
                                }
                                var37++;
                            }
                            if ((var37 + 1 - var38) * (-var40 - -1 + var39) >= 4) {
                                int var43 = class68.field1682[var10][var38][var40];
                                class127.method1031(var9, 4, var38 * 128, var37 * 128 + 128, var40 * 128, var39 * 128 + 128, var43, var43);
                                for (int var44 = var38; var44 <= var37; var44++) {
                                    for (int var45 = var40; var45 <= var39; var45++) {
                                        class132.field3199[var10][var44][var45] = class4.method19(class132.field3199[var10][var44][var45], ~var8);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V")
    public static final void method985(int arg0) {
        field2996++;
        class79.field1857.method234(-22666);
        class139.field3380.method234(-22666);
        class32.field745.method234(-22666);
        if (arg0 != 7187) {
            field3009 = 5;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Z)V")
    public static void method986(boolean arg0) {
        field2999 = null;
        field3007 = null;
        field3011 = null;
        field3000 = null;
        field3003 = null;
        field3012 = null;
        if (arg0) {
            method988(-13);
        }
        field2995 = null;
        field3006 = null;
        field3008 = null;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILr;I)V")
    public static final void method987(int arg0, class117 arg1, int arg2) {
        field3002++;
        if (arg2 < 6) {
            field3009 = 126;
        }
        while (true) {
            class68 var3 = (class68) class3.field91.method182((byte) 50);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field1658; var5++) {
                if (var3.field1669[var5] != null) {
                    if (var3.field1669[var5].field1592 == 2) {
                        var3.field1660[var5] = -5;
                    }
                    if (var3.field1669[var5].field1592 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field1671[var5] != null) {
                    if (var3.field1671[var5].field1592 == 2) {
                        var3.field1660[var5] = -6;
                    }
                    if (var3.field1671[var5].field1592 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg1.method929(arg0, -14044);
            arg1.method452(0, 255);
            int var6 = arg1.field1485;
            arg1.method463(42, var3.field1672);
            for (int var7 = 0; var7 < var3.field1658; var7++) {
                if (var3.field1660[var7] == 0) {
                    try {
                        int var8 = var3.field1676[var7];
                        if (var8 == 0) {
                            Field var9 = (Field) var3.field1669[var7].field1596;
                            int var10 = var9.getInt(null);
                            arg1.method452(0, 255);
                            arg1.method463(96, var10);
                        } else if (var8 == 1) {
                            Field var13 = (Field) var3.field1669[var7].field1596;
                            var13.setInt(null, var3.field1690[var7]);
                            arg1.method452(0, 255);
                        } else if (var8 == 2) {
                            Field var11 = (Field) var3.field1669[var7].field1596;
                            int var12 = var11.getModifiers();
                            arg1.method452(0, 255);
                            arg1.method463(121, var12);
                        }
                        if (var8 == 3) {
                            Method var16 = (Method) var3.field1671[var7].field1596;
                            byte[][] var17 = var3.field1679[var7];
                            Object[] var18 = new Object[var17.length];
                            for (int var19 = 0; var19 < var17.length; var19++) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var16.invoke(null, var18);
                            if (var21 == null) {
                                arg1.method452(0, 255);
                            } else if (var21 instanceof Number) {
                                arg1.method452(1, 255);
                                arg1.method461(11739, ((Number) var21).longValue());
                            } else if (var21 instanceof class135) {
                                arg1.method452(2, 255);
                                arg1.method460((class135) var21, 19);
                            } else {
                                arg1.method452(4, 255);
                            }
                        } else if (var8 == 4) {
                            Method var14 = (Method) var3.field1671[var7].field1596;
                            int var15 = var14.getModifiers();
                            arg1.method452(0, 255);
                            arg1.method463(61, var15);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg1.method452(-10, 255);
                    } catch (InvalidClassException var23) {
                        arg1.method452(-11, 255);
                    } catch (StreamCorruptedException var24) {
                        arg1.method452(-12, 255);
                    } catch (OptionalDataException var25) {
                        arg1.method452(-13, 255);
                    } catch (IllegalAccessException var26) {
                        arg1.method452(-14, 255);
                    } catch (IllegalArgumentException var27) {
                        arg1.method452(-15, 255);
                    } catch (InvocationTargetException var28) {
                        arg1.method452(-16, 255);
                    } catch (SecurityException var29) {
                        arg1.method452(-17, 255);
                    } catch (IOException var30) {
                        arg1.method452(-18, 255);
                    } catch (NullPointerException var31) {
                        arg1.method452(-19, 255);
                    } catch (Exception var32) {
                        arg1.method452(-20, 255);
                    } catch (Throwable var33) {
                        arg1.method452(-21, 255);
                    }
                } else {
                    arg1.method452(var3.field1660[var7], 255);
                }
            }
            arg1.method473((byte) -81, var6);
            arg1.method476(arg1.field1485 - var6, false);
            var3.method302(4071);
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)V")
    public static final void method988(int arg0) {
        field3005++;
        if (arg0 != 4) {
            method982(true, -11, -20);
        }
        if (class46.field1106 == 104) {
            int var1;
            if (class22.field545 == -1) {
                var1 = class58.field1418;
            } else {
                var1 = class22.field545;
            }
            if (class58.field1418 != class22.field545) {
                var1--;
                if (var1 < 0) {
                    var1 = 19;
                }
                if (class29.field704[var1] != null) {
                    class113.field2744 = class29.field704[var1];
                    class65.field1634 = true;
                    class22.field545 = var1;
                }
            }
        }
        if (class46.field1106 != 105 || class22.field545 == -1) {
            return;
        }
        class22.field545++;
        if (class22.field545 >= 20) {
            class22.field545 = 0;
        }
        if (class58.field1418 == class22.field545) {
            class22.field545 = -1;
            class65.field1634 = true;
            class113.field2744 = class113.field2742;
            return;
        }
        if (class29.field704[class22.field545] != null) {
            class113.field2744 = class29.field704[class22.field545];
            class65.field1634 = true;
            return;
        }
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "([I)V")
    public class126(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field3015 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field3015[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field3015[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field3015[var5 + var5] = arg0[var4];
            this.field3015[var5 + var5 + 1] = var4++;
        }
    }
}
