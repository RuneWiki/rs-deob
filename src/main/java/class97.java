import java.io.EOFException;
import java.io.IOException;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class97 {

    @OriginalMember(owner = "client!o", name = "j", descriptor = "J")
    private long field2309 = -1L;

    @OriginalMember(owner = "client!o", name = "u", descriptor = "J")
    private long field2320 = -1L;

    @OriginalMember(owner = "client!o", name = "v", descriptor = "I")
    private int field2321 = 0;

    @OriginalMember(owner = "client!o", name = "r", descriptor = "Lee;")
    private class34 field2317;

    @OriginalMember(owner = "client!o", name = "p", descriptor = "J")
    private long field2315;

    @OriginalMember(owner = "client!o", name = "o", descriptor = "J")
    private long field2314;

    @OriginalMember(owner = "client!o", name = "t", descriptor = "[B")
    private byte[] field2319;

    @OriginalMember(owner = "client!o", name = "b", descriptor = "J")
    private long field2301;

    @OriginalMember(owner = "client!o", name = "h", descriptor = "[B")
    private byte[] field2307;

    @OriginalMember(owner = "client!o", name = "l", descriptor = "I")
    public static int field2311 = 0;

    @OriginalMember(owner = "client!o", name = "g", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2306 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!o", name = "a", descriptor = "I")
    public static int field2300;

    @OriginalMember(owner = "client!o", name = "c", descriptor = "I")
    public static int field2302;

    @OriginalMember(owner = "client!o", name = "d", descriptor = "I")
    public static int field2303;

    @OriginalMember(owner = "client!o", name = "e", descriptor = "I")
    public static int field2304;

    @OriginalMember(owner = "client!o", name = "f", descriptor = "I")
    public static int field2305;

    @OriginalMember(owner = "client!o", name = "i", descriptor = "I")
    public static int field2308;

    @OriginalMember(owner = "client!o", name = "k", descriptor = "I")
    public static int field2310;

    @OriginalMember(owner = "client!o", name = "m", descriptor = "I")
    public static int field2312;

    @OriginalMember(owner = "client!o", name = "n", descriptor = "I")
    public static int field2313;

    @OriginalMember(owner = "client!o", name = "q", descriptor = "I")
    private int field2316;

    @OriginalMember(owner = "client!o", name = "s", descriptor = "I")
    public static int field2318;

    @OriginalMember(owner = "client!o", name = "w", descriptor = "J")
    private long field2322;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "([BBII)V")
    public final void method788(byte[] arg0, byte arg1, int arg2, int arg3) throws IOException {
        field2303++;
        int var5 = 21 % ((arg1 - 26) / 61);
        try {
            if (this.field2314 < this.field2301 + (long) arg2) {
                this.field2314 = (long) arg2 + this.field2301;
            }
            if (this.field2320 != -1L && (this.field2301 < this.field2320 || this.field2301 > (long) this.field2321 + this.field2320)) {
                this.method798((byte) -79);
            }
            if (this.field2320 != -1L && this.field2301 + (long) arg2 > (long) this.field2307.length + this.field2320) {
                int var6 = (int) (this.field2320 + (long) this.field2307.length - this.field2301);
                class125.method1039(arg0, arg3, this.field2307, (int) (this.field2301 - this.field2320), var6);
                this.field2301 += var6;
                arg2 -= var6;
                this.field2321 = this.field2307.length;
                arg3 += var6;
                this.method798((byte) -53);
            }
            if (arg2 > this.field2307.length) {
                if (this.field2322 != this.field2301) {
                    this.field2317.method310(this.field2301, (byte) 8);
                    this.field2322 = this.field2301;
                }
                long var7 = -1L;
                this.field2317.method311(arg2, arg3, 1, arg0);
                long var9 = -1L;
                this.field2322 += arg2;
                if (this.field2309 < this.field2301 + (long) arg2 && this.field2309 + (long) this.field2316 >= (long) arg2 + this.field2301) {
                    var7 = (long) arg2 + this.field2301;
                } else if ((long) this.field2316 + this.field2309 > this.field2301 && (long) this.field2316 + this.field2309 <= this.field2301 - -((long) arg2)) {
                    var7 = this.field2309 + (long) this.field2316;
                }
                if (this.field2301 >= this.field2309 && this.field2301 < (long) this.field2316 + this.field2309) {
                    var9 = this.field2301;
                } else if (this.field2309 >= this.field2301 && (long) arg2 + this.field2301 > this.field2309) {
                    var9 = this.field2309;
                }
                if (this.field2315 < this.field2322) {
                    this.field2315 = this.field2322;
                }
                if (var9 > -1L && var7 > var9) {
                    int var11 = (int) (var7 - var9);
                    class125.method1039(arg0, (int) (var9 + (long) arg3 - this.field2301), this.field2319, (int) (var9 - this.field2309), var11);
                }
                this.field2301 += arg2;
            } else if (arg2 > 0) {
                if (this.field2320 == -1L) {
                    this.field2320 = this.field2301;
                }
                class125.method1039(arg0, arg3, this.field2307, (int) (this.field2301 - this.field2320), arg2);
                this.field2301 += arg2;
                if (this.field2301 - this.field2320 > (long) this.field2321) {
                    this.field2321 = (int) (this.field2301 - this.field2320);
                }
            }
        } catch (IOException var13) {
            this.field2322 = -1L;
            throw var13;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ZJ)V")
    public final void method789(boolean arg0, long arg1) {
        if (!arg0) {
            method792(-112, null);
        }
        field2310++;
        if (arg1 >= 0L) {
            this.field2301 = arg1;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V")
    public static void method790(int arg0) {
        field2306 = null;
        if (arg0 < 126) {
            method793(null, 40, null);
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Z)J")
    public final long method791(boolean arg0) {
        field2308++;
        if (arg0) {
            field2306 = null;
        }
        return this.field2314;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ILof;)Laf;")
    public static final class7 method792(int arg0, class103 arg1) {
        field2304++;
        if (class105.method853(class7.method98(26454, arg1), arg0 ^ 0xFFFFFFDD) == 0) {
            return null;
        } else if (arg0 != -1) {
            return null;
        } else if (arg1.field2556 == null || arg1.field2556.method71(94).method92(25) == 0) {
            return class106.field2609 ? class98.field2324 : null;
        } else {
            return arg1.field2556;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lrf;I[Lmd;)V")
    public static final void method793(class124 arg0, int arg1, class87[] arg2) {
        field2305++;
        if (arg1 != -16) {
            method795((byte) -98, null, 90, 62);
        }
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var110 = 0; var110 < 104; var110++) {
                for (int var111 = 0; var111 < 104; var111++) {
                    if ((class25.field670[var3][var110][var111] & 0x1) == 1) {
                        int var112 = var3;
                        if ((class25.field670[1][var110][var111] & 0x2) == 2) {
                            var112 = var3 - 1;
                        }
                        if (var112 >= 0) {
                            arg2[var112].method716(var110, true, var111);
                        }
                    }
                }
            }
        }
        class11.field288 += (int) (Math.random() * 5.0D) - 2;
        class106.field2599 += (int) (Math.random() * 5.0D) - 2;
        if (class11.field288 < -16) {
            class11.field288 = -16;
        }
        if (class106.field2599 < -8) {
            class106.field2599 = -8;
        }
        if (class11.field288 > 16) {
            class11.field288 = 16;
        }
        if (class106.field2599 > 8) {
            class106.field2599 = 8;
        }
        for (int var4 = 0; var4 < 4; var4++) {
            byte[][] var47 = class127.field3057[var4];
            int var48 = (int) Math.sqrt(5100.0D);
            int var49 = var48 * 768 >> 8;
            for (int var50 = 1; var50 < 103; var50++) {
                for (int var101 = 1; var101 < 103; var101++) {
                    int var102 = class108.field2636[var4][var101 + 1][var50] - class108.field2636[var4][var101 - 1][var50];
                    int var103 = class108.field2636[var4][var101][var50 + 1] - class108.field2636[var4][var101][var50 - 1];
                    int var104 = (int) Math.sqrt((double) (var102 * var102 + var103 * var103 + 65536));
                    int var105 = (var102 << 8) / var104;
                    int var106 = 65536 / var104;
                    int var107 = (var103 << 8) / var104;
                    int var108 = (var47[var101 - 1][var50] >> 2) + (var47[var101 + 1][var50] >> 3) + (var47[var101][var50 + 1] >> 3) + (var47[var101][var50] >> 1) + (var47[var101][var50 - 1] >> 2);
                    int var109 = (var105 * -50 + var106 * -10 + var107 * -50) / var49 + 96;
                    class131.field3098[var101][var50] = var109 - var108;
                }
            }
            for (int var51 = 0; var51 < 104; var51++) {
                class89.field2061[var51] = 0;
                class13.field336[var51] = 0;
                class82.field1875[var51] = 0;
                class91.field2113[var51] = 0;
                class54.field1325[var51] = 0;
            }
            for (int var52 = -5; var52 < 109; var52++) {
                for (int var55 = 0; var55 < 104; var55++) {
                    int var95 = var52 + 5;
                    int var10002;
                    if (var95 >= 0 && var95 < 104) {
                        int var96 = class108.field2643[var4][var95][var55] & 0xFF;
                        if (var96 > 0) {
                            class9 var97 = class64.method523(var96 - 1, true);
                            class89.field2061[var55] += var97.field224;
                            class13.field336[var55] += var97.field229;
                            class82.field1875[var55] += var97.field236;
                            class91.field2113[var55] += var97.field222;
                            var10002 = class54.field1325[var55]++;
                        }
                    }
                    int var98 = var52 - 5;
                    if (var98 >= 0 && var98 < 104) {
                        int var99 = class108.field2643[var4][var98][var55] & 0xFF;
                        if (var99 > 0) {
                            class9 var100 = class64.method523(var99 - 1, true);
                            class89.field2061[var55] -= var100.field224;
                            class13.field336[var55] -= var100.field229;
                            class82.field1875[var55] -= var100.field236;
                            class91.field2113[var55] -= var100.field222;
                            var10002 = class54.field1325[var55]--;
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
                            var60 += class54.field1325[var62];
                            var58 += class91.field2113[var62];
                            var59 += class82.field1875[var62];
                            var57 += class13.field336[var62];
                            var56 += class89.field2061[var62];
                        }
                        int var63 = var61 - 5;
                        if (var63 >= 0 && var63 < 104) {
                            var59 -= class82.field1875[var63];
                            var60 -= class54.field1325[var63];
                            var57 -= class13.field336[var63];
                            var56 -= class89.field2061[var63];
                            var58 -= class91.field2113[var63];
                        }
                        if (var61 >= 1 && var61 < 103 && (!class91.field2106 || (class25.field670[0][var52][var61] & 0x2) != 0 || (class25.field670[var4][var52][var61] & 0x10) == 0 && class64.method525(var52, var61, var4, (byte) 56) == class45.field1078)) {
                            if (class86.field2019 > var4) {
                                class86.field2019 = var4;
                            }
                            int var64 = class53.field1278[var4][var52][var61] & 0xFF;
                            int var65 = class108.field2643[var4][var52][var61] & 0xFF;
                            if (var65 > 0 || var64 > 0) {
                                int var66 = class108.field2636[var4][var52][var61];
                                int var67 = class108.field2636[var4][var52 + 1][var61];
                                int var68 = class108.field2636[var4][var52][var61 + 1];
                                int var69 = class131.field3098[var52 + 1][var61];
                                int var70 = class108.field2636[var4][var52 + 1][var61 + 1];
                                int var71 = class131.field3098[var52][var61];
                                int var72 = class131.field3098[var52 + 1][var61 + 1];
                                int var73 = class131.field3098[var52][var61 + 1];
                                int var74 = -1;
                                int var75 = -1;
                                if (var65 > 0) {
                                    int var76 = var57 / var60;
                                    int var77 = var56 * 256 / var58;
                                    int var78 = var59 / var60;
                                    var74 = class73.method624(var77, (byte) -119, var76, var78);
                                    int var79 = class106.field2599 + var77 & 0xFF;
                                    int var80 = class11.field288 + var78;
                                    if (var80 < 0) {
                                        var80 = 0;
                                    } else if (var80 > 255) {
                                        var80 = 255;
                                    }
                                    var75 = class73.method624(var79, (byte) -97, var76, var80);
                                }
                                if (var4 > 0) {
                                    boolean var81 = true;
                                    if (var65 == 0 && class91.field2104[var4][var52][var61] != 0) {
                                        var81 = false;
                                    }
                                    if (var64 > 0 && !class49.method408(var64 - 1, 4).field429) {
                                        var81 = false;
                                    }
                                    if (var81 && var66 == var67 && var66 == var70 && var66 == var68) {
                                        class111.field2697[var4][var52][var61] = class141.method1150(class111.field2697[var4][var52][var61], 2340);
                                    }
                                }
                                int var82 = 0;
                                if (var75 != -1) {
                                    var82 = class134.field3171[class120.method926((byte) -49, 96, var75)];
                                }
                                if (var64 == 0) {
                                    arg0.method1022(var4, var52, var61, 0, 0, -1, var66, var67, var70, var68, class120.method926((byte) 111, var71, var74), class120.method926((byte) -59, var69, var74), class120.method926((byte) 107, var72, var74), class120.method926((byte) -114, var73, var74), 0, 0, 0, 0, var82, 0);
                                } else {
                                    byte var83 = class145.field3422[var4][var52][var61];
                                    int var84 = class91.field2104[var4][var52][var61] + 1;
                                    class18 var85 = class49.method408(var64 - 1, 4);
                                    int var86 = var85.field435;
                                    int var87;
                                    int var88;
                                    if (var86 >= 0) {
                                        var87 = -1;
                                        var88 = class134.field3161.method536(var86, 6995);
                                    } else if (var85.field424 == 16711935) {
                                        var88 = -2;
                                        var86 = -1;
                                        var87 = -2;
                                    } else {
                                        var87 = class73.method624(var85.field428, (byte) -108, var85.field409, var85.field413);
                                        int var89 = class11.field288 + var85.field413;
                                        if (var89 < 0) {
                                            var89 = 0;
                                        } else if (var89 > 255) {
                                            var89 = 255;
                                        }
                                        int var90 = class106.field2599 + var85.field428 & 0xFF;
                                        var88 = class73.method624(var90, (byte) -116, var85.field409, var89);
                                    }
                                    int var91 = 0;
                                    if (var88 != -2) {
                                        var91 = class134.field3171[class44.method384(28805, 96, var88)];
                                    }
                                    if (var85.field416 != -1) {
                                        int var92 = var85.field420 + class106.field2599 & 0xFF;
                                        int var93 = class11.field288 + var85.field417;
                                        if (var93 < 0) {
                                            var93 = 0;
                                        } else if (var93 > 255) {
                                            var93 = 255;
                                        }
                                        int var94 = class73.method624(var92, (byte) -126, var85.field422, var93);
                                        var91 = class134.field3171[class44.method384(28805, 96, var94)];
                                    }
                                    arg0.method1022(var4, var52, var61, var84, var83, var86, var66, var67, var70, var68, class120.method926((byte) 115, var71, var74), class120.method926((byte) -124, var69, var74), class120.method926((byte) 97, var72, var74), class120.method926((byte) 84, var73, var74), class44.method384(28805, var71, var87), class44.method384(28805, var69, var87), class44.method384(arg1 ^ 0xFFFF8F75, var72, var87), class44.method384(28805, var73, var87), var82, var91);
                                }
                            }
                        }
                    }
                }
            }
            for (int var53 = 1; var53 < 103; var53++) {
                for (int var54 = 1; var54 < 103; var54++) {
                    arg0.method993(var4, var54, var53, class64.method525(var54, var53, var4, (byte) 56));
                }
            }
            class108.field2643[var4] = null;
            class53.field1278[var4] = null;
            class91.field2104[var4] = null;
            class145.field3422[var4] = null;
            class127.field3057[var4] = null;
        }
        arg0.method1019(-50, -10, -50);
        for (int var5 = 0; var5 < 104; var5++) {
            for (int var46 = 0; var46 < 104; var46++) {
                if ((class25.field670[1][var5][var46] & 0x2) == 2) {
                    arg0.method1029(var5, var46);
                }
            }
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
                        if ((class111.field2697[var10][var12][var11] & var6) != 0) {
                            int var13 = var11;
                            int var14 = var10;
                            int var15;
                            for (var15 = var11; var15 > 0 && (class111.field2697[var10][var12][var15 - 1] & var6) != 0; var15--) {
                            }
                            while (var13 < 104 && (class111.field2697[var10][var12][var13 + 1] & var6) != 0) {
                                var13++;
                            }
                            int var16 = var10;
                            label355: while (var14 > 0) {
                                for (int var17 = var15; var17 <= var13; var17++) {
                                    if ((class111.field2697[var14 - 1][var12][var17] & var6) == 0) {
                                        break label355;
                                    }
                                }
                                var14--;
                            }
                            label344: while (var16 < var9) {
                                for (int var18 = var15; var18 <= var13; var18++) {
                                    if ((class111.field2697[var16 + 1][var12][var18] & var6) == 0) {
                                        break label344;
                                    }
                                }
                                var16++;
                            }
                            int var19 = (var13 + 1 - var15) * (var16 + 1 - var14);
                            if (var19 >= 8) {
                                short var20 = 240;
                                int var21 = class108.field2636[var14][var12][var15];
                                int var22 = class108.field2636[var16][var12][var15] - var20;
                                class124.method988(var9, 1, var12 * 128, var12 * 128, var15 * 128, var13 * 128 + 128, var22, var21);
                                for (int var23 = var14; var23 <= var16; var23++) {
                                    for (int var24 = var15; var24 <= var13; var24++) {
                                        class111.field2697[var23][var12][var24] = class84.method705(class111.field2697[var23][var12][var24], ~var6);
                                    }
                                }
                            }
                        }
                        if ((class111.field2697[var10][var12][var11] & var7) != 0) {
                            int var25 = var12;
                            int var26 = var10;
                            int var27 = var10;
                            while (var25 > 0 && (var7 & class111.field2697[var10][var25 - 1][var11]) != 0) {
                                var25--;
                            }
                            int var28;
                            for (var28 = var12; var28 < 104 && (var7 & class111.field2697[var10][var28 + 1][var11]) != 0; var28++) {
                            }
                            label409: while (var26 > 0) {
                                for (int var29 = var25; var29 <= var28; var29++) {
                                    if ((var7 & class111.field2697[var26 - 1][var29][var11]) == 0) {
                                        break label409;
                                    }
                                }
                                var26--;
                            }
                            label398: while (var9 > var27) {
                                for (int var30 = var25; var30 <= var28; var30++) {
                                    if ((class111.field2697[var27 + 1][var30][var11] & var7) == 0) {
                                        break label398;
                                    }
                                }
                                var27++;
                            }
                            int var31 = (var28 + 1 - var25) * (var27 + 1 - var26);
                            if (var31 >= 8) {
                                short var32 = 240;
                                int var33 = class108.field2636[var27][var25][var11] - var32;
                                int var34 = class108.field2636[var26][var25][var11];
                                class124.method988(var9, 2, var25 * 128, var28 * 128 + 128, var11 * 128, var11 * 128, var33, var34);
                                for (int var35 = var26; var35 <= var27; var35++) {
                                    for (int var36 = var25; var36 <= var28; var36++) {
                                        class111.field2697[var35][var36][var11] = class84.method705(class111.field2697[var35][var36][var11], ~var7);
                                    }
                                }
                            }
                        }
                        if ((var8 & class111.field2697[var10][var12][var11]) != 0) {
                            int var37 = var12;
                            int var38 = var12;
                            int var39;
                            for (var39 = var11; var39 < 104 && (var8 & class111.field2697[var10][var12][var39 + 1]) != 0; var39++) {
                            }
                            int var40;
                            for (var40 = var11; var40 > 0 && (class111.field2697[var10][var12][var40 - 1] & var8) != 0; var40--) {
                            }
                            label463: while (var37 > 0) {
                                for (int var41 = var40; var41 <= var39; var41++) {
                                    if ((var8 & class111.field2697[var10][var37 - 1][var41]) == 0) {
                                        break label463;
                                    }
                                }
                                var37--;
                            }
                            label452: while (var38 < 104) {
                                for (int var42 = var40; var42 <= var39; var42++) {
                                    if ((class111.field2697[var10][var38 + 1][var42] & var8) == 0) {
                                        break label452;
                                    }
                                }
                                var38++;
                            }
                            if ((var38 + 1 - var37) * (var39 + 1 - var40) >= 4) {
                                int var43 = class108.field2636[var10][var37][var40];
                                class124.method988(var9, 4, var37 * 128, var38 * 128 + 128, var40 * 128, var39 * 128 + 128, var43, var43);
                                for (int var44 = var37; var44 <= var38; var44++) {
                                    for (int var45 = var40; var45 <= var39; var45++) {
                                        class111.field2697[var10][var44][var45] = class84.method705(class111.field2697[var10][var44][var45], ~var8);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(II[BI)V")
    public final void method794(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field2318++;
        try {
            if (arg2.length < arg0 + arg1) {
                throw new ArrayIndexOutOfBoundsException(arg0 + arg1 - arg2.length);
            }
            if (this.field2320 != -1L && this.field2320 <= this.field2301 && (long) this.field2321 + this.field2320 >= (long) arg1 + this.field2301) {
                class125.method1039(this.field2307, (int) (this.field2301 - this.field2320), arg2, arg0, arg1);
                this.field2301 += arg1;
                return;
            }
            long var5 = this.field2301;
            int var7 = arg0;
            int var8 = arg1;
            if (arg3 != 0) {
                method795((byte) 3, null, 2, -5);
            }
            if (this.field2301 >= this.field2309 && (long) this.field2316 + this.field2309 > this.field2301) {
                int var9 = (int) ((long) this.field2316 + this.field2309 - this.field2301);
                if (arg1 < var9) {
                    var9 = arg1;
                }
                class125.method1039(this.field2319, (int) (this.field2301 - this.field2309), arg2, arg0, var9);
                arg1 -= var9;
                this.field2301 += var9;
                arg0 += var9;
            }
            if (this.field2319.length < arg1) {
                this.field2317.method310(this.field2301, (byte) 8);
                this.field2322 = this.field2301;
                while (arg1 > 0) {
                    int var11 = this.field2317.method307(arg0, (byte) -121, arg2, arg1);
                    if (var11 == -1) {
                        break;
                    }
                    this.field2322 += var11;
                    this.field2301 += var11;
                    arg1 -= var11;
                    arg0 += var11;
                }
            } else if (arg1 > 0) {
                this.method796(false);
                int var10 = arg1;
                if (this.field2316 < arg1) {
                    var10 = this.field2316;
                }
                arg1 -= var10;
                class125.method1039(this.field2319, 0, arg2, arg0, var10);
                this.field2301 += var10;
                arg0 += var10;
            }
            if (this.field2320 != -1L) {
                if (this.field2320 > this.field2301 && arg1 > 0) {
                    int var12 = (int) (this.field2320 - this.field2301) + arg0;
                    if (arg0 + arg1 < var12) {
                        var12 = arg0 + arg1;
                    }
                    while (var12 > arg0) {
                        arg2[arg0++] = 0;
                        this.field2301++;
                        arg1--;
                    }
                }
                long var13 = -1L;
                long var15 = -1L;
                if (var5 <= this.field2320 && var5 + (long) var8 > this.field2320) {
                    var13 = this.field2320;
                } else if (var5 >= this.field2320 && var5 < (long) this.field2321 + this.field2320) {
                    var13 = var5;
                }
                if (var5 < this.field2320 + (long) this.field2321 && (long) this.field2321 + this.field2320 <= (long) var8 + var5) {
                    var15 = (long) this.field2321 + this.field2320;
                } else if (this.field2320 < (long) var8 + var5 && (long) var8 + var5 <= (long) this.field2321 + this.field2320) {
                    var15 = var5 + (long) var8;
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class125.method1039(this.field2307, (int) (var13 - this.field2320), arg2, (int) (var13 - var5) + var7, var17);
                    if (this.field2301 < var15) {
                        arg1 = (int) ((long) arg1 + this.field2301 - var15);
                        this.field2301 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field2322 = -1L;
            throw var19;
        }
        if (arg1 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(BLnb;II)V")
    public static final void method795(byte arg0, class92 arg1, int arg2, int arg3) {
        int var4 = 1 % ((arg0 + 27) / 37);
        if (arg1.field478 == arg3 && arg3 != -1) {
            int var5 = class87.method710(arg3, 6491).field2165;
            if (var5 == 1) {
                arg1.field499 = 0;
                arg1.field457 = arg2;
                arg1.field487 = 0;
                arg1.field463 = 0;
            }
            if (var5 == 2) {
                arg1.field499 = 0;
            }
        } else if (arg3 == -1 || arg1.field478 == -1 || class87.method710(arg3, 6491).field2181 >= class87.method710(arg1.field478, 6491).field2181) {
            arg1.field478 = arg3;
            arg1.field463 = 0;
            arg1.field487 = 0;
            arg1.field499 = 0;
            arg1.field471 = arg1.field455;
            arg1.field457 = arg2;
        }
        field2302++;
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(Z)V")
    private final void method796(boolean arg0) throws IOException {
        field2313++;
        if (arg0) {
            this.method789(true, 127L);
        }
        this.field2316 = 0;
        if (this.field2322 != this.field2301) {
            this.field2317.method310(this.field2301, (byte) 8);
            this.field2322 = this.field2301;
        }
        this.field2309 = this.field2301;
        while (this.field2319.length > this.field2316) {
            int var2 = this.field2317.method307(this.field2316, (byte) -117, this.field2319, this.field2319.length - this.field2316);
            if (var2 == -1) {
                break;
            }
            this.field2322 += var2;
            this.field2316 += var2;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(B)V")
    public final void method797(byte arg0) throws IOException {
        this.method798((byte) -84);
        if (arg0 == 1) {
            this.field2317.method306(-104);
            field2300++;
        }
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(B)V")
    private final void method798(byte arg0) throws IOException {
        if (this.field2320 != -1L) {
            if (this.field2322 != this.field2320) {
                this.field2317.method310(this.field2320, (byte) 8);
                this.field2322 = this.field2320;
            }
            long var2 = -1L;
            this.field2317.method311(this.field2321, 0, 1, this.field2307);
            this.field2322 += this.field2321;
            long var4 = -1L;
            if (this.field2320 + (long) this.field2321 > this.field2309 && this.field2309 + (long) this.field2316 >= this.field2320 - -((long) this.field2321)) {
                var2 = (long) this.field2321 + this.field2320;
            } else if (this.field2320 < (long) this.field2316 + this.field2309 && (long) this.field2321 + this.field2320 >= (long) this.field2316 + this.field2309) {
                var2 = (long) this.field2316 + this.field2309;
            }
            if (this.field2320 >= this.field2309 && (long) this.field2316 + this.field2309 > this.field2320) {
                var4 = this.field2320;
            } else if (this.field2309 >= this.field2320 && this.field2309 < (long) this.field2321 + this.field2320) {
                var4 = this.field2309;
            }
            if (this.field2322 > this.field2315) {
                this.field2315 = this.field2322;
            }
            if (var4 > -1L && var4 < var2) {
                int var6 = (int) (var2 - var4);
                class125.method1039(this.field2307, (int) (var4 - this.field2320), this.field2319, (int) (var4 - this.field2309), var6);
            }
            this.field2321 = 0;
            this.field2320 = -1L;
        }
        field2312++;
        if (arg0 >= -26) {
            this.field2309 = -60L;
        }
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "(Lee;II)V")
    public class97(class34 arg0, int arg1, int arg2) throws IOException {
        this.field2317 = arg0;
        this.field2314 = this.field2315 = arg0.method309((byte) 122);
        this.field2319 = new byte[arg1];
        this.field2301 = 0L;
        this.field2307 = new byte[arg2];
    }
}
