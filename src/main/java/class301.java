import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class301 {

    @OriginalMember(owner = "client!cn", name = "n", descriptor = "I")
    public int field4392 = -1;

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "[I")
    public static int[] field4381 = new int[256];

    @OriginalMember(owner = "client!cn", name = "g", descriptor = "[I")
    public static int[] field4385 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!cn", name = "u", descriptor = "[Ljava/lang/String;")
    public static String[] field4399 = new String[100];

    @OriginalMember(owner = "client!cn", name = "v", descriptor = "Lpm;")
    public static class349 field4400;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "I")
    public static int field4379;

    @OriginalMember(owner = "client!cn", name = "d", descriptor = "I")
    public static int field4382;

    @OriginalMember(owner = "client!cn", name = "f", descriptor = "I")
    public static int field4384;

    @OriginalMember(owner = "client!cn", name = "i", descriptor = "I")
    public static int field4387;

    @OriginalMember(owner = "client!cn", name = "k", descriptor = "I")
    public static int field4389;

    @OriginalMember(owner = "client!cn", name = "l", descriptor = "I")
    public static int field4390;

    @OriginalMember(owner = "client!cn", name = "p", descriptor = "I")
    public static int field4394;

    @OriginalMember(owner = "client!cn", name = "r", descriptor = "I")
    private int field4396;

    @OriginalMember(owner = "client!cn", name = "s", descriptor = "I")
    public static int field4397;

    @OriginalMember(owner = "client!cn", name = "t", descriptor = "I")
    public static int field4398;

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "J")
    private long field4380;

    @OriginalMember(owner = "client!cn", name = "o", descriptor = "J")
    private long field4393;

    @OriginalMember(owner = "client!cn", name = "j", descriptor = "Lkn;")
    public static class442 field4388;

    @OriginalMember(owner = "client!cn", name = "e", descriptor = "Z")
    public boolean field4383;

    @OriginalMember(owner = "client!cn", name = "m", descriptor = "[I")
    private int[] field4391;

    @OriginalMember(owner = "client!cn", name = "q", descriptor = "[I")
    public int[] field4395;

    @OriginalMember(owner = "client!cn", name = "h", descriptor = "[[I")
    private int[][] field4386;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(Z)V")
    private final void method2021(boolean arg0) {
        if (arg0) {
            this.field4386 = null;
        }
        field4382++;
        long[] var2 = class86.field1116;
        this.field4380 = -1L;
        this.field4380 = var2[(int) (((long) (this.field4396 >> 8) ^ this.field4380) & 0xFFL)] ^ this.field4380 >>> 8;
        this.field4380 = var2[(int) ((this.field4380 ^ (long) this.field4396) & 0xFFL)] ^ this.field4380 >>> 8;
        for (int var3 = 0; var3 < 12; var3++) {
            this.field4380 = this.field4380 >>> 8 ^ var2[(int) ((this.field4380 ^ (long) (this.field4391[var3] >> 24)) & 0xFFL)];
            this.field4380 = this.field4380 >>> 8 ^ var2[(int) ((this.field4380 ^ (long) (this.field4391[var3] >> 16)) & 0xFFL)];
            this.field4380 = var2[(int) (((long) (this.field4391[var3] >> 8) ^ this.field4380) & 0xFFL)] ^ this.field4380 >>> 8;
            this.field4380 = this.field4380 >>> 8 ^ var2[(int) (((long) this.field4391[var3] ^ this.field4380) & 0xFFL)];
        }
        for (int var4 = 0; var4 < 5; var4++) {
            this.field4380 = var2[(int) ((this.field4380 ^ (long) this.field4395[var4]) & 0xFFL)] ^ this.field4380 >>> 8;
        }
        this.field4380 = this.field4380 >>> 8 ^ var2[(int) (((long) (this.field4383 ? 1 : 0) ^ this.field4380) & 0xFFL)];
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIILvq;IIILb;II)Lni;")
    public final class305 method2022(int arg0, int arg1, int arg2, class269 arg3, int arg4, int arg5, int arg6, class183 arg7, int arg8, int arg9) {
        if (arg1 != 28492) {
            return null;
        }
        field4390++;
        int var11 = arg5;
        if (arg7 != null) {
            boolean var12 = false;
            boolean var13 = false;
            boolean var14 = false;
            boolean var15 = true;
            boolean var16 = true;
            Object var17 = null;
            var11 = arg5 | 0x20;
            Object var18 = null;
            int var19 = arg7.field2609[arg8];
            int var20 = var19 >>> 16;
            int var21 = var19 & 0xFFFF;
            class385 var22 = class226.method1583((byte) 13, var20);
            if (var22 != null) {
                var13 |= var22.method2444(var21, -693);
                var12 |= var22.method2447(var21, 0);
                var14 |= arg7.field2590;
            }
            if ((arg7.field2595 || class333.field4837) && arg0 != -1 && arg7.field2609.length > arg0) {
                int var23 = arg7.field2609[arg0];
                int var24 = var23 >>> 16;
                int var25 = var23 & 0xFFFF;
                class385 var26;
                if (var20 == var24) {
                    var26 = var22;
                } else {
                    var26 = class226.method1583((byte) 13, var25 >>> 16);
                }
                if (var26 != null) {
                    var13 |= var26.method2444(var25, -693);
                    var12 |= var26.method2447(var25, 0);
                }
            }
            if (var13) {
                var11 |= 0x80;
            }
            if (var12) {
                var11 |= 0x100;
            }
            if (var14) {
                var11 |= 0x200;
            }
        }
        long var27 = (long) arg4 | (long) arg9 << 32 | (long) (arg6 << 16);
        class15 var29 = class258.field3826;
        class305 var30;
        synchronized (class258.field3826) {
            var30 = (class305) class258.field3826.method99(true, var27);
        }
        if (var30 == null || arg3.method944(var30.method247(), var11) != 0) {
            if (var30 != null) {
                var11 = arg3.method863(var11, var30.method247());
            }
            class406[] var32 = new class406[3];
            int var33 = 0;
            if (!class284.method1954(12338, arg4).method2479(19) || !class284.method1954(12338, arg6).method2479(19) || !class284.method1954(arg1 ^ 0x5F7E, arg9).method2479(19)) {
                return null;
            }
            class406 var34 = class284.method1954(12338, arg4).method2483(0);
            if (var34 != null) {
                var32[var33++] = var34;
            }
            class406 var35 = class284.method1954(12338, arg6).method2483(0);
            if (var35 != null) {
                var32[var33++] = var35;
            }
            class406 var36 = class284.method1954(12338, arg9).method2483(0);
            if (var36 != null) {
                var32[var33++] = var36;
            }
            int var37 = var11 | 0x2000;
            class406 var38 = new class406(var32, var33);
            var30 = arg3.method905(var38, var37, class135.field2093, 64, 768);
            for (int var39 = 0; var39 < 5; var39++) {
                if (class358.field5175[var39].length > this.field4395[var39]) {
                    var30.method196(class199.field2848[var39], class358.field5175[var39][this.field4395[var39]]);
                }
                if (this.field4395[var39] < class191.field2778[var39].length) {
                    var30.method196(class423.field6040[var39], class191.field2778[var39][this.field4395[var39]]);
                }
            }
            var30.method233(var11);
            class15 var40 = class258.field3826;
            synchronized (class258.field3826) {
                class258.field3826.method90(var30, var27, 0);
            }
        }
        if (arg7 == null) {
            return var30;
        } else {
            class305 var41 = var30.method200((byte) 1, var11, true);
            return arg7.method1318(var41, arg0, arg8, arg5, false, arg2);
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(I[Luk;Lvq;IIILb;IIIIZLb;)Lni;")
    public final class305 method2023(int arg0, class142[] arg1, class269 arg2, int arg3, int arg4, int arg5, class183 arg6, int arg7, int arg8, int arg9, int arg10, boolean arg11, class183 arg12) {
        field4397++;
        if (this.field4392 != -1) {
            return class171.method1222(this.field4392, 127).method2266(arg4, arg3, arg10, arg7, arg5, arg9, arg2, arg1, arg0, (byte) -118, arg6, arg12);
        }
        int var14 = arg5;
        long var15 = this.field4380;
        int[] var17 = this.field4391;
        if (arg6 != null && (arg6.field2604 >= 0 || arg6.field2591 >= 0)) {
            var17 = new int[12];
            for (int var18 = 0; var18 < 12; var18++) {
                var17[var18] = this.field4391[var18];
            }
            if (arg6.field2604 >= 0) {
                if (arg6.field2604 == 65535) {
                    var17[5] = 0;
                    var15 ^= 0xFFFFFFFF00000000L;
                } else {
                    var17[5] = class332.method2176(arg6.field2604, 1073741824);
                    var15 ^= (long) var17[5] << 32;
                }
            }
            if (arg6.field2591 >= 0) {
                if (arg6.field2591 == 65535) {
                    var17[3] = 0;
                    var15 ^= 0xFFFFFFFFL;
                } else {
                    var17[3] = class332.method2176(1073741824, arg6.field2591);
                    var15 ^= (long) var17[3];
                }
            }
        }
        boolean var19 = false;
        boolean var20 = false;
        boolean var21 = arg6 != null || arg12 != null;
        int var22 = arg1 == null ? 0 : arg1.length;
        int var23 = 88 / ((-arg8 - 12) / 62);
        for (int var24 = 0; var24 < var22; var24++) {
            class415.field5937[var24] = null;
            if (arg1[var24] != null) {
                class183 var25 = class110.method671(-21965, arg1[var24].field2147);
                if (var25.field2609 != null) {
                    var21 = true;
                    class232.field3436[var24] = var25;
                    int var26 = arg1[var24].field2155;
                    int var27 = arg1[var24].field2149;
                    int var28 = var25.field2609[var26];
                    class415.field5937[var24] = class226.method1583((byte) 13, var28 >>> 16);
                    int var29 = var28 & 0xFFFF;
                    class119.field1614[var24] = var29;
                    if (class415.field5937[var24] != null) {
                        var20 |= class415.field5937[var24].method2444(var29, -693);
                        var19 |= class415.field5937[var24].method2447(var29, 0);
                    }
                    if ((var25.field2595 || class333.field4837) && var27 != -1 && var27 < var25.field2609.length) {
                        class381.field5416[var24] = var25.field2600[var26];
                        class354.field5136[var24] = arg1[var24].field2148;
                        int var30 = var25.field2609[var27];
                        class310.field4502[var24] = class226.method1583((byte) 13, var30 >>> 16);
                        int var31 = var30 & 0xFFFF;
                        class73.field953[var24] = var31;
                        if (class310.field4502[var24] != null) {
                            var20 |= class310.field4502[var24].method2444(var31, -693);
                            var19 |= class310.field4502[var24].method2447(var31, 0);
                        }
                    } else {
                        class381.field5416[var24] = 0;
                        class354.field5136[var24] = 0;
                        class310.field4502[var24] = null;
                        class73.field953[var24] = -1;
                    }
                }
            }
        }
        int var32 = -1;
        int var33 = -1;
        int var34 = 0;
        class385 var35 = null;
        class385 var36 = null;
        int var37 = -1;
        int var38 = -1;
        int var39 = 0;
        class385 var40 = null;
        class385 var41 = null;
        if (var21) {
            if (arg6 != null) {
                int var42 = arg6.field2609[arg3];
                int var43 = var42 >>> 16;
                var32 = var42 & 0xFFFF;
                var35 = class226.method1583((byte) 13, var43);
                if (var35 != null) {
                    var20 |= var35.method2444(var32, -693);
                    var19 |= var35.method2447(var32, 0);
                }
                if ((arg6.field2595 || class333.field4837) && arg10 != -1 && arg6.field2609.length > arg10) {
                    var34 = arg6.field2600[arg3];
                    int var44 = arg6.field2609[arg10];
                    int var45 = var44 >>> 16;
                    var36 = var43 == var45 ? var35 : class226.method1583((byte) 13, var45);
                    var33 = var44 & 0xFFFF;
                    if (var36 != null) {
                        var20 |= var36.method2444(var33, -693);
                        var19 |= var36.method2447(var33, 0);
                    }
                }
            }
            var14 = arg5 | 0x20;
            if (arg12 != null) {
                int var46 = arg12.field2609[arg4];
                int var47 = var46 >>> 16;
                var37 = var46 & 0xFFFF;
                var40 = class226.method1583((byte) 13, var47);
                if (var40 != null) {
                    var20 |= var40.method2444(var37, -693);
                    var19 |= var40.method2447(var37, 0);
                }
                if ((arg12.field2595 || class333.field4837) && arg7 != -1 && arg7 < arg12.field2609.length) {
                    var39 = arg12.field2600[arg4];
                    int var48 = arg12.field2609[arg7];
                    int var49 = var48 >>> 16;
                    var38 = var48 & 0xFFFF;
                    var41 = var47 == var49 ? var40 : class226.method1583((byte) 13, var49);
                    if (var41 != null) {
                        var20 |= var41.method2444(var38, -693);
                        var19 |= var41.method2447(var38, 0);
                    }
                }
            }
            if (var20) {
                var14 |= 0x80;
            }
            if (var19) {
                var14 |= 0x100;
            }
        }
        class15 var50 = class332.field4822;
        class305 var51;
        synchronized (class332.field4822) {
            var51 = (class305) class332.field4822.method99(true, var15);
        }
        class3 var52 = null;
        if (this.field4396 != -1) {
            var52 = class101.method590(-1179708536, this.field4396);
        }
        if (var51 == null || arg2.method944(var51.method247(), var14) != 0 || var52 != null && var52.field39 != null && this.field4386 == null) {
            if (var51 != null) {
                var14 = arg2.method863(var14, var51.method247());
            }
            boolean var54 = false;
            int var55 = 0;
            while (true) {
                if (var55 >= 12) {
                    if (var54) {
                        if (this.field4393 != -1L) {
                            class15 var82 = class332.field4822;
                            synchronized (class332.field4822) {
                                var51 = (class305) class332.field4822.method99(true, this.field4393);
                            }
                        }
                        if (var51 == null || arg2.method944(var51.method247(), var14) != 0 || var52 != null && var52.field39 != null && this.field4386 == null) {
                            return null;
                        }
                    } else {
                        class406[] var57 = new class406[12];
                        for (int var58 = 0; var58 < 12; var58++) {
                            int var59 = var17[var58];
                            if ((var59 & 0x40000000) != 0) {
                                class406 var61 = class167.method1202(true, var59 & 0x3FFFFFFF).method2594((byte) -73, this.field4383);
                                if (var61 != null) {
                                    var57[var58] = var61;
                                }
                            } else if ((Integer.MIN_VALUE & var59) != 0) {
                                class406 var60 = class284.method1954(12338, var59 & 0x3FFFFFFF).method2477((byte) 85);
                                if (var60 != null) {
                                    var57[var58] = var60;
                                }
                            }
                        }
                        if (var52 != null && var52.field39 != null) {
                            for (int var62 = 0; var62 < var52.field39.length; var62++) {
                                if (var52.field39[var62] != null && var57[var62] != null) {
                                    int var63 = var52.field39[var62][0];
                                    int var64 = var52.field39[var62][1];
                                    int var65 = var52.field39[var62][2];
                                    int var66 = var52.field39[var62][3] << 3;
                                    int var67 = var52.field39[var62][4] << 3;
                                    int var68 = var52.field39[var62][5] << 3;
                                    if (this.field4386 == null) {
                                        this.field4386 = new int[var52.field39.length][];
                                    }
                                    if (this.field4386[var62] == null) {
                                        int[] var69 = this.field4386[var62] = new int[15];
                                        if (var66 == 0 && var67 == 0 && var68 == 0) {
                                            var69[14] = -var65;
                                            var69[0] = var69[4] = var69[8] = 32768;
                                            var69[12] = -var63;
                                            var69[13] = -var64;
                                        } else {
                                            int var70 = class447.field6390[var66];
                                            int var71 = class447.field6381[var66];
                                            int var72 = class447.field6390[var67];
                                            int var73 = class447.field6381[var67];
                                            int var74 = class447.field6390[var68];
                                            int var75 = class447.field6381[var68];
                                            int var76 = var71 * var74 + 16384 >> 15;
                                            int var77 = var71 * var75 + 16384 >> 15;
                                            var69[8] = var70 * var72 + 16384 >> 15;
                                            var69[2] = var70 * var73 + 16384 >> 15;
                                            var69[1] = -var75 * var72 + (var73 * var76 + 16384) >> 15;
                                            var69[6] = -var73 * var74 + (var72 * var77) + 16384 >> 15;
                                            var69[5] = -var71;
                                            var69[7] = -var73 * -var75 + (var72 * var76) + 16384 >> 15;
                                            var69[4] = var70 * var74 + 16384 >> 15;
                                            var69[0] = var73 * var77 + var72 * var74 + 16384 >> 15;
                                            var69[3] = var70 * var75 + 16384 >> 15;
                                            var69[12] = var69[3] * -var64 + (var69[6] * -var65) + var69[0] * -var63 + 16384 >> 15;
                                            var69[14] = var69[2] * -var63 + var69[5] * -var64 + var69[8] * -var65 + 16384 >> 15;
                                            var69[13] = var69[4] * -var64 + var69[7] * -var65 + var69[1] * -var63 + 16384 >> 15;
                                        }
                                        var69[11] = var65;
                                        var69[9] = var63;
                                        var69[10] = var64;
                                    }
                                    if (var66 != 0 || var67 != 0 || var68 != 0) {
                                        var57[var62].method2549(var66, var68, var67, 17);
                                    }
                                    if (var63 != 0 || var64 != 0 || var65 != 0) {
                                        var57[var62].method2545(var64, var65, 4, var63);
                                    }
                                }
                            }
                        }
                        int var78 = var14 | 0x2000;
                        class406 var79 = new class406(var57, var57.length);
                        var51 = arg2.method905(var79, var78, class135.field2093, 64, 850);
                        for (int var80 = 0; var80 < 5; var80++) {
                            if (class358.field5175[var80].length > this.field4395[var80]) {
                                var51.method196(class199.field2848[var80], class358.field5175[var80][this.field4395[var80]]);
                            }
                            if (this.field4395[var80] < class191.field2778[var80].length) {
                                var51.method196(class423.field6040[var80], class191.field2778[var80][this.field4395[var80]]);
                            }
                        }
                        if (arg11) {
                            var51.method233(var14);
                            class15 var81 = class332.field4822;
                            synchronized (class332.field4822) {
                                class332.field4822.method90(var51, var15, 0);
                            }
                            this.field4393 = var15;
                        }
                    }
                    break;
                }
                int var56 = var17[var55];
                if ((var56 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var56) != 0 && !class284.method1954(12338, var56 & 0x3FFFFFFF).method2485(116)) {
                        var54 = true;
                    }
                } else if (!class167.method1202(true, var56 & 0x3FFFFFFF).method2581(this.field4383, (byte) -17)) {
                    var54 = true;
                }
                var55++;
            }
        }
        class305 var83 = var51.method200((byte) 1, var14, true);
        if (!var21) {
            return var83;
        }
        int var84 = 0;
        int var85 = 1;
        while (var22 > var84) {
            if (class415.field5937[var84] != null) {
                var83.method2059(0, false, class310.field4502[var84], class119.field1614[var84], class415.field5937[var84], class73.field953[var84], class354.field5136[var84] - 1, this.field4386 == null ? null : this.field4386[var84], var85, 0, class381.field5416[var84]);
            }
            var84++;
            var85 <<= 0x1;
        }
        if (var35 != null && var40 != null) {
            var83.method2057(var37, var39, var32, var35, var36, arg6.field2603, var41, -1, var38, var40, var33, var34, arg9 - 1, arg0 - 1, false);
        } else if (var35 != null) {
            var83.method2056(0, var33, var35, var36, (byte) -82, var34, arg0 - 1, false, var32);
        } else if (var40 != null) {
            var83.method2056(0, var38, var40, var41, (byte) -82, var39, arg9 - 1, false, var37);
        }
        for (int var86 = 0; var86 < var22; var86++) {
            class415.field5937[var86] = null;
            class310.field4502[var86] = null;
            class232.field3436[var86] = null;
        }
        return var83;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(ZII)V")
    public final void method2024(boolean arg0, int arg1, int arg2) {
        field4398++;
        if (!arg0) {
            this.method2022(-22, 81, 37, (class269) null, -85, 62, 85, (class183) null, -9, -113);
        }
        int var4 = class444.field6342[arg2];
        if (this.field4391[var4] != 0 && class284.method1954(12338, arg1) != null) {
            this.field4391[var4] = class332.method2176(Integer.MIN_VALUE, arg1);
            this.method2021(false);
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(B)V")
    public static void method2025(byte arg0) {
        field4399 = null;
        int var1 = -5 / ((-arg0 - 86) / 32);
        field4388 = null;
        field4381 = null;
        field4385 = null;
        field4400 = null;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(ILb;IIBILvq;)Lni;")
    public final class305 method2026(int arg0, class183 arg1, int arg2, int arg3, byte arg4, int arg5, class269 arg6) {
        if (arg4 <= 65) {
            return null;
        }
        field4379++;
        if (this.field4392 != -1) {
            return class171.method1222(this.field4392, 127).method2272(arg3, arg0, arg5, arg2, (byte) 123, arg1, arg6);
        }
        int var8 = arg5;
        if (arg1 != null) {
            boolean var9 = false;
            boolean var10 = false;
            boolean var11 = false;
            boolean var12 = true;
            boolean var13 = true;
            Object var14 = null;
            var8 = arg5 | 0x20;
            Object var15 = null;
            int var16 = arg1.field2609[arg2];
            int var17 = var16 >>> 16;
            int var18 = var16 & 0xFFFF;
            class385 var19 = class226.method1583((byte) 13, var17);
            if (var19 != null) {
                var10 |= var19.method2444(var18, -693);
                var9 |= var19.method2447(var18, 0);
                var11 |= arg1.field2590;
            }
            if ((arg1.field2595 || class333.field4837) && arg3 != -1 && arg3 < arg1.field2609.length) {
                int var20 = arg1.field2609[arg3];
                int var21 = var20 >>> 16;
                class385 var22 = var17 == var21 ? var19 : class226.method1583((byte) 13, var21);
                int var23 = var20 & 0xFFFF;
                if (var22 != null) {
                    var10 |= var22.method2444(var23, -693);
                    var9 |= var22.method2447(var23, 0);
                }
            }
            if (var10) {
                var8 |= 0x80;
            }
            if (var9) {
                var8 |= 0x100;
            }
            if (var11) {
                var8 |= 0x200;
            }
        }
        class15 var24 = class258.field3826;
        class305 var25;
        synchronized (class258.field3826) {
            var25 = (class305) class258.field3826.method99(true, this.field4380);
        }
        if (var25 == null || arg6.method944(var25.method247(), var8) != 0) {
            if (var25 != null) {
                var8 = arg6.method863(var8, var25.method247());
            }
            boolean var27 = false;
            for (int var28 = 0; var28 < 12; var28++) {
                int var29 = this.field4391[var28];
                if ((var29 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var29) != 0 && !class284.method1954(12338, var29 & 0x3FFFFFFF).method2479(19)) {
                        var27 = true;
                    }
                } else if (!class167.method1202(true, var29 & 0x3FFFFFFF).method2586(0, this.field4383)) {
                    var27 = true;
                }
            }
            if (var27) {
                return null;
            }
            class406[] var30 = new class406[12];
            int var31 = 0;
            for (int var32 = 0; var32 < 12; var32++) {
                int var33 = this.field4391[var32];
                if ((var33 & 0x40000000) != 0) {
                    class406 var35 = class167.method1202(true, var33 & 0x3FFFFFFF).method2583(this.field4383, 32199);
                    if (var35 != null) {
                        var30[var31++] = var35;
                    }
                } else if ((Integer.MIN_VALUE & var33) != 0) {
                    class406 var34 = class284.method1954(12338, var33 & 0x3FFFFFFF).method2483(0);
                    if (var34 != null) {
                        var30[var31++] = var34;
                    }
                }
            }
            int var36 = var8 | 0x2000;
            class406 var37 = new class406(var30, var31);
            var25 = arg6.method905(var37, var36, class135.field2093, 64, 768);
            for (int var38 = 0; var38 < 5; var38++) {
                if (this.field4395[var38] < class358.field5175[var38].length) {
                    var25.method196(class199.field2848[var38], class358.field5175[var38][this.field4395[var38]]);
                }
                if (this.field4395[var38] < class191.field2778[var38].length) {
                    var25.method196(class423.field6040[var38], class191.field2778[var38][this.field4395[var38]]);
                }
            }
            var25.method233(var8);
            class15 var39 = class258.field3826;
            synchronized (class258.field3826) {
                class258.field3826.method90(var25, this.field4380, 0);
            }
        }
        if (arg1 == null) {
            return var25;
        } else {
            var25.method200((byte) 1, var8, true);
            return arg1.method1318(var25, arg3, arg2, arg5, false, arg0);
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(ZI[III[I)V")
    public final void method2027(boolean arg0, int arg1, int[] arg2, int arg3, int arg4, int[] arg5) {
        if (arg3 != -9985) {
            field4381 = null;
        }
        if (this.field4396 != arg1) {
            this.field4396 = arg1;
            this.field4386 = null;
        }
        field4394++;
        if (arg5 == null) {
            arg5 = new int[12];
            for (int var7 = 0; var7 < 8; var7++) {
                for (int var8 = 0; var8 < class108.field1404; var8++) {
                    class394 var9 = class284.method1954(12338, var8);
                    if (var9 != null && !var9.field5550 && (arg0 ? class384.field5441[var7] : class1.field7[var7]) == var9.field5546) {
                        arg5[class444.field6342[var7]] = class332.method2176(var8, Integer.MIN_VALUE);
                        break;
                    }
                }
            }
        }
        this.field4395 = arg2;
        this.field4391 = arg5;
        this.field4392 = arg4;
        this.field4383 = arg0;
        this.method2021(false);
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(ZZ)V")
    public final void method2028(boolean arg0, boolean arg1) {
        this.field4383 = arg1;
        field4384++;
        this.method2021(arg0);
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(ILcn;IZLvq;IILug;IBZLvq;)Lvj;")
    public static final class256 method2029(int arg0, class301 arg1, int arg2, boolean arg3, class269 arg4, int arg5, int arg6, class335 arg7, int arg8, byte arg9, boolean arg10, class269 arg11) {
        field4389++;
        class256 var12 = class382.method2434(arg8, false, arg1, arg2, arg0, arg6, arg4, arg5);
        if (var12 != null) {
            return var12;
        }
        class409 var13 = class167.method1202(true, arg6);
        if (arg2 > 1 && var13.field5822 != null) {
            int var14 = -1;
            for (int var15 = 0; var15 < 10; var15++) {
                if (var13.field5828[var15] <= arg2 && var13.field5828[var15] != 0) {
                    var14 = var13.field5822[var15];
                }
            }
            if (var14 != -1) {
                var13 = class167.method1202(true, var14);
            }
        }
        class406 var16 = class294.method1986(0, -79, var13.field5819, class147.field2191);
        if (var16 == null) {
            return null;
        }
        if (var13.field5799 != null) {
            for (int var17 = 0; var17 < var13.field5799.length; var17++) {
                if (var13.field5809 == null || var13.field5809.length <= var17) {
                    var16.method2547(var13.field5799[var17], -108, var13.field5812[var17]);
                } else {
                    var16.method2547(var13.field5799[var17], -86, class377.field5368[var13.field5809[var17] & 0xFF]);
                }
            }
        }
        if (var13.field5855 != null) {
            for (int var18 = 0; var18 < var13.field5855.length; var18++) {
                var16.method2542(var13.field5855[var18], var13.field5829[var18], 0);
            }
        }
        if (arg1 != null) {
            for (int var19 = 0; var19 < 5; var19++) {
                if (arg1.field4395[var19] < class358.field5175[var19].length) {
                    var16.method2547(class199.field2848[var19], -87, class358.field5175[var19][arg1.field4395[var19]]);
                }
                if (class191.field2778[var19].length > arg1.field4395[var19]) {
                    var16.method2547(class423.field6040[var19], -102, class191.field2778[var19][arg1.field4395[var19]]);
                }
            }
        }
        int var20 = 1024;
        boolean var21 = false;
        if (var13.field5848 != 128 || var13.field5816 != 128 || var13.field5853 != 128) {
            var20 |= 0x7;
            var21 = true;
        }
        if (arg9 > -4) {
            field4399 = null;
        }
        class305 var22 = arg11.method905(var16, var20, 0, var13.field5844 + 64, var13.field5832 + 768);
        if (!var22.method244()) {
            return null;
        }
        if (var21) {
            var22.method215(var13.field5848, var13.field5816, var13.field5853);
        }
        class256 var23 = null;
        if (var13.field5840 != -1) {
            var23 = method2029(1, arg1, 10, true, arg4, 0, var13.field5845, arg7, 0, (byte) -45, true, arg11);
            if (var23 == null) {
                return null;
            }
        } else if (var13.field5856 != -1) {
            var23 = method2029(arg0, arg1, arg2, false, arg4, 0, var13.field5864, arg7, arg8, (byte) -14, true, arg11);
            if (var23 == null) {
                return null;
            }
        }
        int var24 = var13.field5821;
        arg11.method1003(16, 16, 512, 512);
        if (arg3) {
            var24 = (int) ((double) var24 * 1.5D);
        } else if (arg0 == 2) {
            var24 = (int) ((double) var24 * 1.04D);
        }
        class154 var25 = arg11.method1016();
        var25.method1137();
        arg11.method973(var25);
        arg11.method883(1.0F);
        arg11.method873(16777215, 1.0F, 1.0F, -50.0F, -10.0F, -50.0F);
        class154 var26 = arg11.method884();
        var26.method1144(-var13.field5818 << 3);
        var26.method1143(var13.field5815 << 3);
        var26.method1134(var13.field5861, (class447.field6381[var13.field5831 << 3] * var24 >> 15) + var13.field5865 - var22.method221() / 2, (class447.field6390[var13.field5831 << 3] * var24 >> 15) + var13.field5865);
        var26.method1140(var13.field5831 << 3);
        int var27 = arg11.method892();
        int var28 = arg11.method906();
        arg11.method980(50, Integer.MAX_VALUE);
        arg11.method897();
        arg11.method931();
        arg11.method1012(0, 0, 36, 32, 0, 0);
        var22.method230(var26, (class144) null, 1);
        arg11.method980(var27, var28);
        int[] var29 = arg11.method898(0, 0, 36, 32);
        if (arg0 >= 1) {
            var29 = class182.method1303(15, -16777215, var29);
            if (arg0 >= 2) {
                var29 = class182.method1303(100, -1, var29);
            }
        }
        if (arg8 != 0) {
            class6.method29(var29, (byte) -118, arg8);
        }
        arg11.method876(var29, 0, 36, 36, 32).method1772(0, 0);
        if (var13.field5840 != -1) {
            var23.method1772(0, 0);
        } else if (var13.field5856 != -1) {
            var23.method1772(0, 0);
        }
        if (arg5 == 1 || arg5 == 2 && (var13.field5846 == 1 || arg2 != 1) && arg2 != -1) {
            arg7.method2197(-256, -16777215, 0, (byte) -120, class221.method1555(arg2, true), 9);
        }
        int[] var30 = arg11.method898(0, 0, 36, 32);
        for (int var31 = 0; var31 < var30.length; var31++) {
            if ((var30[var31] & 0xFFFFFF) == 0) {
                var30[var31] = 0;
            } else {
                var30[var31] = class332.method2176(var30[var31], -16777216);
            }
        }
        class256 var32;
        if (arg10) {
            var32 = arg11.method876(var30, 0, 36, 36, 32);
        } else {
            var32 = arg4.method876(var30, 0, 36, 36, 32);
        }
        if (!arg10) {
            class100 var33 = new class100();
            var33.field1260 = arg4.field3936;
            var33.field1267 = arg5;
            var33.field1262 = arg6;
            var33.field1265 = arg1 != null;
            var33.field1272 = arg0;
            var33.field1259 = arg2;
            var33.field1266 = arg8;
            class356.field5154.method758(0, var33, var32);
        }
        return var32;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IBI)V")
    public final void method2030(int arg0, byte arg1, int arg2) {
        this.field4395[arg0] = arg2;
        field4387++;
        if (arg1 == 122) {
            this.method2021(false);
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field4381[var0] = var1;
        }
        field4400 = new class349("cyan:", "blaugrün:", "cyan:", "cyan:");
    }
}
