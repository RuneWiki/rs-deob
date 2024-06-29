import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class157 {

    @OriginalMember(owner = "client!id", name = "b", descriptor = "[I")
    public static int[] field2477 = new int[100];

    @OriginalMember(owner = "client!id", name = "q", descriptor = "Lhb;")
    public static class233 field2492 = null;

    @OriginalMember(owner = "client!id", name = "o", descriptor = "I")
    public static int field2490 = 0;

    @OriginalMember(owner = "client!id", name = "s", descriptor = "[Lak;")
    public static class146[] field2494 = new class146[14];

    @OriginalMember(owner = "client!id", name = "z", descriptor = "[I")
    public static int[] field2501 = new int[2];

    @OriginalMember(owner = "client!id", name = "a", descriptor = "I")
    public static int field2476;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "I")
    public int field2479;

    @OriginalMember(owner = "client!id", name = "e", descriptor = "I")
    public static int field2480;

    @OriginalMember(owner = "client!id", name = "g", descriptor = "I")
    public static int field2482;

    @OriginalMember(owner = "client!id", name = "h", descriptor = "I")
    public static int field2483;

    @OriginalMember(owner = "client!id", name = "j", descriptor = "I")
    public static int field2485;

    @OriginalMember(owner = "client!id", name = "k", descriptor = "I")
    public static int field2486;

    @OriginalMember(owner = "client!id", name = "l", descriptor = "I")
    public static int field2487;

    @OriginalMember(owner = "client!id", name = "m", descriptor = "I")
    public static int field2488;

    @OriginalMember(owner = "client!id", name = "n", descriptor = "I")
    public static int field2489;

    @OriginalMember(owner = "client!id", name = "r", descriptor = "I")
    private int field2493;

    @OriginalMember(owner = "client!id", name = "t", descriptor = "I")
    public static int field2495;

    @OriginalMember(owner = "client!id", name = "u", descriptor = "I")
    public static int field2496;

    @OriginalMember(owner = "client!id", name = "w", descriptor = "I")
    public static int field2498;

    @OriginalMember(owner = "client!id", name = "A", descriptor = "I")
    public static int field2502;

    @OriginalMember(owner = "client!id", name = "f", descriptor = "J")
    private long field2481;

    @OriginalMember(owner = "client!id", name = "v", descriptor = "J")
    private long field2497;

    @OriginalMember(owner = "client!id", name = "x", descriptor = "Lfa;")
    public static class273 field2499;

    @OriginalMember(owner = "client!id", name = "c", descriptor = "Z")
    public boolean field2478;

    @OriginalMember(owner = "client!id", name = "p", descriptor = "[I")
    public int[] field2491;

    @OriginalMember(owner = "client!id", name = "y", descriptor = "[I")
    private int[] field2500;

    @OriginalMember(owner = "client!id", name = "i", descriptor = "[[I")
    private int[][] field2484;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V")
    public static void method1031(int arg0) {
        field2492 = null;
        field2494 = null;
        field2477 = null;
        field2501 = null;
        if (arg0 != -1305820368) {
            field2477 = null;
        }
        field2499 = null;
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(I)I")
    public final int method1032(int arg0) {
        if (arg0 != -16406) {
            field2499 = null;
        }
        field2487++;
        return this.field2479 == -1 ? (this.field2500[11] << 5) + (this.field2500[8] << 10) + (this.field2500[0] << 15) + ((this.field2491[0] << 25) - -(this.field2491[4] << 20)) + this.field2500[1] : class145.method974(-52, this.field2479).field1581 + 305419896;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IZI[II[I)V")
    public final void method1033(int arg0, boolean arg1, int arg2, int[] arg3, int arg4, int[] arg5) {
        field2502++;
        if (this.field2493 != arg0) {
            this.field2493 = arg0;
            this.field2484 = null;
        }
        if (arg3 == null) {
            arg3 = new int[12];
            for (int var7 = 0; var7 < 8; var7++) {
                for (int var8 = 0; var8 < class68.field995; var8++) {
                    class272 var9 = class286.method2014(var8, (byte) 61);
                    if (var9 != null && !var9.field4456 && var9.field4460 == (arg1 ? class313.field5049[var7] : class301.field4941[var7])) {
                        arg3[class258.field4249[var7]] = class82.method554(var8, Integer.MIN_VALUE);
                        break;
                    }
                }
            }
        }
        this.field2500 = arg3;
        this.field2479 = arg2;
        this.field2478 = arg1;
        if (arg4 < -89) {
            this.field2491 = arg5;
            this.method1035(116);
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ILfa;Lfa;)V")
    public static final void method1034(int arg0, class273 arg1, class273 arg2) {
        field2495++;
        if (arg0 <= 94) {
            method1031(87);
        }
        class51.field694 = arg2;
        class87.field1362 = arg1;
    }

    @OriginalMember(owner = "client!id", name = "c", descriptor = "(I)V")
    private final void method1035(int arg0) {
        long var2 = this.field2497;
        this.field2497 = -1L;
        field2489++;
        long[] var4 = class250.field3984;
        this.field2497 = this.field2497 >>> 8 ^ var4[(int) (((long) (this.field2493 >> 8) ^ this.field2497) & 0xFFL)];
        this.field2497 = var4[(int) (((long) this.field2493 ^ this.field2497) & 0xFFL)] ^ this.field2497 >>> 8;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2497 = this.field2497 >>> 8 ^ var4[(int) ((this.field2497 ^ (long) (this.field2500[var5] >> 24)) & 0xFFL)];
            this.field2497 = var4[(int) ((this.field2497 ^ (long) (this.field2500[var5] >> 16)) & 0xFFL)] ^ this.field2497 >>> 8;
            this.field2497 = var4[(int) (((long) (this.field2500[var5] >> 8) ^ this.field2497) & 0xFFL)] ^ this.field2497 >>> 8;
            this.field2497 = this.field2497 >>> 8 ^ var4[(int) (((long) this.field2500[var5] ^ this.field2497) & 0xFFL)];
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2497 = var4[(int) (((long) this.field2491[var6] ^ this.field2497) & 0xFFL)] ^ this.field2497 >>> 8;
        }
        this.field2497 = var4[(int) (((long) (this.field2478 ? 1 : 0) ^ this.field2497) & 0xFFL)] ^ this.field2497 >>> 8;
        int var7 = -18 / ((arg0 - 46) / 40);
        if (var2 != 0L && this.field2497 != var2) {
            class111.field1696.method148(1, var2);
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lma;I)Lbh;")
    public static final class8 method1036(class202 arg0, int arg1) {
        if (arg1 >= -25) {
            method1034(-66, (class273) null, (class273) null);
        }
        field2480++;
        return new class8(arg0.method1442(-1970239824), arg0.method1442(-1970239824), arg0.method1442(-1970239824), arg0.method1442(-1970239824), arg0.method1401((byte) -99), arg0.method1401((byte) -92), arg0.method1420((byte) 0));
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(III)V")
    public final void method1037(int arg0, int arg1, int arg2) {
        field2485++;
        int var4 = class258.field4249[arg1];
        int var5 = -15 / ((-arg2 - 5) / 39);
        if (this.field2500[var4] != 0 && class286.method2014(arg0, (byte) 61) != null) {
            this.field2500[var4] = class82.method554(Integer.MIN_VALUE, arg0);
            this.method1035(6);
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ILdj;III)Lrk;")
    public final class293 method1038(int arg0, class200 arg1, int arg2, int arg3, int arg4) {
        field2482++;
        if (this.field2479 != -1) {
            return class145.method974(-106, this.field2479).method693(arg1, 0, arg4, arg3, arg2);
        }
        class293 var6 = (class293) class6.field54.method149((byte) -73, this.field2497);
        if (arg0 >= -52) {
            return null;
        }
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < 12; var8++) {
                int var17 = this.field2500[var8];
                if ((var17 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var17) != 0 && !class286.method2014(var17 & 0x3FFFFFFF, (byte) 61).method1873(10889)) {
                        var7 = true;
                    }
                } else if (!class14.method92(var17 & 0x3FFFFFFF, false).method891((byte) -127, this.field2478)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class228[] var9 = new class228[12];
            int var10 = 0;
            for (int var11 = 0; var11 < 12; var11++) {
                int var14 = this.field2500[var11];
                if ((var14 & 0x40000000) != 0) {
                    class228 var16 = class14.method92(var14 & 0x3FFFFFFF, false).method888(-41, this.field2478);
                    if (var16 != null) {
                        var9[var10++] = var16;
                    }
                } else if ((var14 & Integer.MIN_VALUE) != 0) {
                    class228 var15 = class286.method2014(var14 & 0x3FFFFFFF, (byte) 61).method1869((byte) -41);
                    if (var15 != null) {
                        var9[var10++] = var15;
                    }
                }
            }
            class228 var12 = new class228(var9, var10);
            for (int var13 = 0; var13 < 5; var13++) {
                if (this.field2491[var13] < class226.field3581[var13].length) {
                    var12.method1611(class10.field127[var13], class226.field3581[var13][this.field2491[var13]]);
                }
                if (class27.field345[var13].length > this.field2491[var13]) {
                    var12.method1611(class310.field5015[var13], class27.field345[var13][this.field2491[var13]]);
                }
            }
            var6 = var12.method1594(64, 768, -50, -10, -50);
            class6.field54.method152(var6, this.field2497, true);
        }
        if (arg1 != null) {
            var6 = arg1.method1379(arg3, arg4, var6, arg2, (byte) -5);
        }
        return var6;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ILdj;IIIIII)Lrk;")
    public final class293 method1039(int arg0, class200 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2498++;
        long var9 = (long) arg3 | (long) (arg6 << 16) | (long) arg5 << 32;
        class293 var11 = (class293) class6.field54.method149((byte) -84, var9);
        if (arg7 != -50) {
            method1036((class202) null, -113);
        }
        if (var11 == null) {
            int var12 = 0;
            class228[] var13 = new class228[3];
            if (!class286.method2014(arg3, (byte) 61).method1873(10889) || !class286.method2014(arg6, (byte) 61).method1873(10889) || !class286.method2014(arg5, (byte) 61).method1873(10889)) {
                return null;
            }
            class228 var14 = class286.method2014(arg3, (byte) 61).method1869((byte) -41);
            if (var14 != null) {
                var13[var12++] = var14;
            }
            class228 var15 = class286.method2014(arg6, (byte) 61).method1869((byte) -41);
            if (var15 != null) {
                var13[var12++] = var15;
            }
            class228 var16 = class286.method2014(arg5, (byte) 61).method1869((byte) -41);
            if (var16 != null) {
                var13[var12++] = var16;
            }
            class228 var17 = new class228(var13, var12);
            for (int var18 = 0; var18 < 5; var18++) {
                if (class226.field3581[var18].length > this.field2491[var18]) {
                    var17.method1611(class10.field127[var18], class226.field3581[var18][this.field2491[var18]]);
                }
                if (class27.field345[var18].length > this.field2491[var18]) {
                    var17.method1611(class310.field5015[var18], class27.field345[var18][this.field2491[var18]]);
                }
            }
            var11 = var17.method1594(64, 768, -50, -10, -50);
            class6.field54.method152(var11, var9, true);
        }
        if (arg1 != null) {
            var11 = arg1.method1379(arg0, arg4, var11, arg2, (byte) -5);
        }
        return var11;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIB)V")
    public final void method1040(int arg0, int arg1, byte arg2) {
        field2496++;
        this.field2491[arg1] = arg0;
        if (arg2 < -106) {
            this.method1035(-77);
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(JB)V")
    public static final void method1041(long arg0, byte arg1) {
        if (!class74.field1123) {
            class202.field3253 += (float) arg0 * class292.field4822 / 40.0F;
            class79.field1255 += (float) arg0 * class295.field4847 / 40.0F;
        }
        int var3 = class309.field5006.field836 + class8.field75;
        field2476++;
        int var4 = class130.field1993 + class309.field5006.field850;
        if (arg1 > -77) {
            return;
        }
        if (class302.field4946 - var3 < -500 || (class302.field4946 - var3) > 500 || class118.field1804 - var4 < -500 || class118.field1804 - var4 > 500) {
            class302.field4946 = var3;
            class118.field1804 = var4;
        }
        if (class302.field4946 != var3) {
            int var5 = var3 - class302.field4946;
            int var6 = (int) ((long) var5 * arg0 / 320L);
            if (var5 > 0) {
                if (var6 == 0) {
                    var6 = 1;
                } else if (var5 < var6) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = -1;
            } else if (var6 < var5) {
                var6 = var5;
            }
            class302.field4946 += var6;
        }
        if (class118.field1804 != var4) {
            int var7 = var4 - class118.field1804;
            int var8 = (int) ((long) var7 * arg0 / 320L);
            if (var7 <= 0) {
                if (var8 == 0) {
                    var8 = -1;
                } else if (var8 < var7) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = 1;
            } else if (var8 > var7) {
                var8 = var7;
            }
            class118.field1804 += var8;
        }
        class130.method862((byte) 108);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ZI)V")
    public final void method1042(boolean arg0, int arg1) {
        this.field2478 = arg0;
        this.method1035(90);
        if (arg1 != 2982) {
            this.field2479 = 29;
        }
        field2483++;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "([Lih;ZLdj;ZIIIIIIILdj;)Lrk;")
    public final class293 method1043(class219[] arg0, boolean arg1, class200 arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class200 arg11) {
        field2486++;
        if (this.field2479 != -1) {
            return class145.method974(-104, this.field2479).method683(arg5, (byte) -37, arg9, arg10, arg8, arg11, arg7, arg6, arg2, arg0);
        }
        long var13 = this.field2497;
        int[] var15 = this.field2500;
        if (arg11 != null && (arg11.field3175 >= 0 || arg11.field3183 >= 0)) {
            var15 = new int[12];
            for (int var16 = 0; var16 < 12; var16++) {
                var15[var16] = this.field2500[var16];
            }
            if (arg11.field3175 >= 0) {
                if (arg11.field3175 == 65535) {
                    var13 ^= 0xFFFFFFFF00000000L;
                    var15[5] = 0;
                } else {
                    var15[5] = class82.method554(arg11.field3175, 1073741824);
                    var13 ^= (long) var15[5] << 32;
                }
            }
            if (arg11.field3183 >= 0) {
                if (arg11.field3183 == 65535) {
                    var13 ^= 0xFFFFFFFFL;
                    var15[3] = 0;
                } else {
                    var15[3] = class82.method554(1073741824, arg11.field3183);
                    var13 ^= (long) var15[3];
                }
            }
        }
        class293 var17 = (class293) class111.field1696.method149((byte) -99, var13);
        if (var17 == null) {
            boolean var18 = false;
            for (int var19 = 0; var19 < 12; var19++) {
                int var44 = var15[var19];
                if ((var44 & 0x40000000) == 0) {
                    if ((var44 & Integer.MIN_VALUE) != 0 && !class286.method2014(var44 & 0x3FFFFFFF, (byte) 61).method1865(true)) {
                        var18 = true;
                    }
                } else if (!class14.method92(var44 & 0x3FFFFFFF, false).method887(this.field2478, (byte) -91)) {
                    var18 = true;
                }
            }
            if (var18) {
                if (this.field2481 != -1L) {
                    var17 = (class293) class111.field1696.method149((byte) -89, this.field2481);
                }
                if (var17 == null) {
                    return null;
                }
            }
            if (var17 == null) {
                class228[] var20 = new class228[12];
                for (int var21 = 0; var21 < 12; var21++) {
                    int var41 = var15[var21];
                    if ((var41 & 0x40000000) != 0) {
                        class228 var43 = class14.method92(var41 & 0x3FFFFFFF, false).method893(arg4 + 12889, this.field2478);
                        if (var43 != null) {
                            var20[var21] = var43;
                        }
                    } else if ((Integer.MIN_VALUE & var41) != 0) {
                        class228 var42 = class286.method2014(var41 & 0x3FFFFFFF, (byte) 61).method1866(false);
                        if (var42 != null) {
                            var20[var21] = var42;
                        }
                    }
                }
                class261 var22 = null;
                if (this.field2493 != -1) {
                    var22 = class14.method90(126, this.field2493);
                }
                if (var22 != null && var22.field4307 != null) {
                    for (int var23 = 0; var23 < var22.field4307.length; var23++) {
                        if (var22.field4307[var23] != null && var20[var23] != null) {
                            int var24 = var22.field4307[var23][2];
                            int var25 = var22.field4307[var23][0];
                            int var26 = var22.field4307[var23][4];
                            int var27 = var22.field4307[var23][3];
                            int var28 = var22.field4307[var23][1];
                            int var29 = var22.field4307[var23][5];
                            if (this.field2484 == null) {
                                this.field2484 = new int[var22.field4307.length][];
                            }
                            if (this.field2484[var23] == null) {
                                int[] var30 = this.field2484[var23] = new int[15];
                                if (var27 == 0 && var26 == 0 && var29 == 0) {
                                    var30[0] = var30[4] = var30[8] = 32768;
                                    var30[12] = -var25;
                                    var30[13] = -var28;
                                    var30[14] = -var24;
                                } else {
                                    int var31 = class172.field2658[var27] >> 1;
                                    int var32 = class172.field2669[var27] >> 1;
                                    int var33 = class172.field2658[var29] >> 1;
                                    int var34 = class172.field2669[var26] >> 1;
                                    int var35 = class172.field2658[var26] >> 1;
                                    int var36 = class172.field2669[var29] >> 1;
                                    var30[5] = -var32;
                                    var30[8] = var31 * var35 + 16384 >> 15;
                                    var30[4] = var31 * var33 + 16384 >> 15;
                                    int var37 = var32 * var36 + 16384 >> 15;
                                    var30[3] = var31 * var36 + 16384 >> 15;
                                    int var38 = var32 * var33 + 16384 >> 15;
                                    var30[7] = -var34 * -var36 + var35 * var38 + 16384 >> 15;
                                    var30[0] = var33 * var35 + var34 * var37 + 16384 >> 15;
                                    var30[6] = -var34 * var33 + var35 * var37 + 16384 >> 15;
                                    var30[1] = -var36 * var35 + var34 * var38 + 16384 >> 15;
                                    var30[12] = var30[6] * -var24 + var30[3] * -var28 + (var30[0] * -var25 - -16384) >> 15;
                                    var30[13] = var30[7] * -var24 + var30[4] * -var28 + var30[1] * -var25 + 16384 >> 15;
                                    var30[2] = var31 * var34 + 16384 >> 15;
                                    var30[14] = var30[5] * -var28 + var30[2] * -var25 + var30[8] * -var24 + 16384 >> 15;
                                }
                                var30[10] = var28;
                                var30[9] = var25;
                                var30[11] = var24;
                            }
                            if (var27 != 0 || var26 != 0 || var29 != 0) {
                                var20[var23].method1603(var27, var26, var29);
                            }
                            if (var25 != 0 || var28 != 0 || var24 != 0) {
                                var20[var23].method1584(var25, var28, var24);
                            }
                        }
                    }
                }
                class228 var39 = new class228(var20, var20.length);
                for (int var40 = 0; var40 < 5; var40++) {
                    if (this.field2491[var40] < class226.field3581[var40].length) {
                        var39.method1611(class10.field127[var40], class226.field3581[var40][this.field2491[var40]]);
                    }
                    if (this.field2491[var40] < class27.field345[var40].length) {
                        var39.method1611(class310.field5015[var40], class27.field345[var40][this.field2491[var40]]);
                    }
                }
                var17 = var39.method1594(64, 850, -30, -50, -30);
                if (arg3) {
                    class111.field1696.method152(var17, var13, true);
                    this.field2481 = var13;
                }
            }
        }
        boolean var45 = false;
        boolean var46 = false;
        boolean var47 = false;
        int var48 = arg0 == null ? 0 : arg0.length;
        boolean var49 = false;
        int var50 = 0;
        if (arg4 != -12890) {
            field2490 = -93;
        }
        while (var48 > var50) {
            if (arg0[var50] != null) {
                class200 var73 = class196.method1359(arg0[var50].field3493, (byte) 21);
                if (var73.field3167 != null) {
                    var47 = true;
                    class144.field2262[var50] = var73;
                    int var74 = arg0[var50].field3495;
                    int var75 = arg0[var50].field3492;
                    int var76 = var73.field3167[var74];
                    class152.field2358[var50] = class31.method184(var76 >>> 16, (byte) -19);
                    int var77 = var76 & 0xFFFF;
                    class311.field5026[var50] = var77;
                    if (class152.field2358[var50] != null) {
                        var49 |= class152.field2358[var50].method977(var77, -122);
                        var45 |= class152.field2358[var50].method976(var77, arg4 ^ 0xFFFFCDA6);
                        var46 |= var73.field3181;
                    }
                    if ((var73.field3187 || class231.field3698) && var75 != -1 && var75 < var73.field3167.length) {
                        class284.field4757[var50] = var73.field3168[var74];
                        class107.field1664[var50] = arg0[var50].field3498;
                        int var78 = var73.field3167[var75];
                        class44.field612[var50] = class31.method184(var78 >>> 16, (byte) -19);
                        int var79 = var78 & 0xFFFF;
                        class232.field3709[var50] = var79;
                        if (class44.field612[var50] != null) {
                            var49 |= class44.field612[var50].method977(var79, -112);
                            var45 |= class44.field612[var50].method976(var79, 0);
                        }
                    } else {
                        class284.field4757[var50] = 0;
                        class107.field1664[var50] = 0;
                        class44.field612[var50] = null;
                        class232.field3709[var50] = -1;
                    }
                }
            }
            var50++;
        }
        if (var47 || arg11 != null || arg2 != null) {
            int var51 = -1;
            class146 var52 = null;
            int var53 = -1;
            int var54 = 0;
            class146 var55 = null;
            if (arg11 != null) {
                int var56 = arg11.field3167[arg8];
                int var57 = var56 >>> 16;
                var52 = class31.method184(var57, (byte) -19);
                var51 = var56 & 0xFFFF;
                if (var52 != null) {
                    var49 |= var52.method977(var51, -83);
                    var45 |= var52.method976(var51, 0);
                    var46 |= arg11.field3181;
                }
                if ((arg11.field3187 || class231.field3698) && arg9 != -1 && arg9 < arg11.field3167.length) {
                    int var58 = arg11.field3167[arg9];
                    var54 = arg11.field3168[arg8];
                    int var59 = var58 >>> 16;
                    var53 = var58 & 0xFFFF;
                    if (var57 == var59) {
                        var55 = var52;
                    } else {
                        var55 = class31.method184(var53 >>> 16, (byte) -19);
                    }
                    if (var55 != null) {
                        var49 |= var55.method977(var53, -113);
                        var45 |= var55.method976(var53, arg4 + 12890);
                    }
                }
            }
            int var60 = -1;
            int var61 = -1;
            int var62 = 0;
            class146 var63 = null;
            class146 var64 = null;
            if (arg2 != null) {
                int var65 = arg2.field3167[arg10];
                int var66 = var65 >>> 16;
                var61 = var65 & 0xFFFF;
                var63 = class31.method184(var66, (byte) -19);
                if (var63 != null) {
                    var49 |= var63.method977(var61, -128);
                    var45 |= var63.method976(var61, 0);
                    var46 |= arg2.field3181;
                }
                if ((arg2.field3187 || class231.field3698) && arg5 != -1 && arg2.field3167.length > arg5) {
                    var62 = arg2.field3168[arg10];
                    int var67 = arg2.field3167[arg5];
                    int var68 = var67 >>> 16;
                    var60 = var67 & 0xFFFF;
                    if (var66 == var68) {
                        var64 = var63;
                    } else {
                        var64 = class31.method184(var60 >>> 16, (byte) -19);
                    }
                    if (var64 != null) {
                        var49 |= var64.method977(var60, -86);
                        var45 |= var64.method976(var60, 0);
                    }
                }
            }
            class293 var69 = var17.method1325(!var45, !var49, !var46);
            int var70 = 0;
            int var71 = 1;
            while (var70 < var48) {
                if (class152.field2358[var70] != null) {
                    var69.method2046(class152.field2358[var70], class311.field5026[var70], class44.field612[var70], class232.field3709[var70], class107.field1664[var70] - 1, class284.field4757[var70], var71, class144.field2262[var70].field3181, this.field2484[var70]);
                }
                var70++;
                var71 <<= 0x1;
            }
            if (var52 != null && var63 != null) {
                var69.method2045(var52, var51, var55, var53, arg7 - 1, var54, var63, var61, var64, var60, arg6 - 1, var62, arg11.field3180, arg2.field3181 | arg11.field3181);
            } else if (var52 != null) {
                var69.method2049(var52, var51, var55, var53, arg7 - 1, var54, arg11.field3181);
            } else if (var63 != null) {
                var69.method2049(var63, var61, var64, var60, arg6 - 1, var62, arg2.field3181);
            }
            for (int var72 = 0; var72 < var48; var72++) {
                class152.field2358[var72] = null;
                class44.field612[var72] = null;
                class144.field2262[var72] = null;
            }
            return var69;
        } else if (arg1) {
            return var17.method1325(false, false, false);
        } else {
            return var17;
        }
    }
}
