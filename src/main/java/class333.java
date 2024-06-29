import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public class class333 {

    @OriginalMember(owner = "client!qp", name = "p", descriptor = "I")
    public int field5245 = -1;

    @OriginalMember(owner = "client!qp", name = "q", descriptor = "I")
    public static int field5246 = 0;

    @OriginalMember(owner = "client!qp", name = "h", descriptor = "I")
    public static int field5237 = 1;

    @OriginalMember(owner = "client!qp", name = "f", descriptor = "F")
    public static float field5235;

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "I")
    public static int field5230;

    @OriginalMember(owner = "client!qp", name = "c", descriptor = "I")
    public static int field5232;

    @OriginalMember(owner = "client!qp", name = "i", descriptor = "I")
    public static int field5238;

    @OriginalMember(owner = "client!qp", name = "j", descriptor = "I")
    public static int field5239;

    @OriginalMember(owner = "client!qp", name = "l", descriptor = "I")
    public static int field5241;

    @OriginalMember(owner = "client!qp", name = "m", descriptor = "I")
    public static int field5242;

    @OriginalMember(owner = "client!qp", name = "o", descriptor = "I")
    private int field5244;

    @OriginalMember(owner = "client!qp", name = "r", descriptor = "I")
    public static int field5247;

    @OriginalMember(owner = "client!qp", name = "t", descriptor = "I")
    public static int field5249;

    @OriginalMember(owner = "client!qp", name = "u", descriptor = "I")
    public static int field5250;

    @OriginalMember(owner = "client!qp", name = "v", descriptor = "I")
    public static int field5251;

    @OriginalMember(owner = "client!qp", name = "g", descriptor = "J")
    private long field5236;

    @OriginalMember(owner = "client!qp", name = "s", descriptor = "J")
    private long field5248;

    @OriginalMember(owner = "client!qp", name = "d", descriptor = "Lgo;")
    public static class334 field5233;

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "Z")
    public boolean field5231;

    @OriginalMember(owner = "client!qp", name = "k", descriptor = "[I")
    private int[] field5240;

    @OriginalMember(owner = "client!qp", name = "n", descriptor = "[I")
    public int[] field5243;

    @OriginalMember(owner = "client!qp", name = "e", descriptor = "[[I")
    private int[][] field5234;

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(IZIIIILkg;Lza;Ltl;ILsq;I)Le;", line = 3)
    public final class530 method2093(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, class217 arg6, class491 arg7, class91 arg8, int arg9, class145 arg10, int arg11) {
        field5242++;
        int var13 = arg2;
        if (arg10 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            Object var21 = null;
            var13 = arg2 | 0x20;
            int var22 = arg10.field2377[arg5];
            int var23 = var22 >>> 16;
            class48 var24 = arg8.method637(var23, arg1);
            int var25 = var22 & 0xFFFF;
            if (var24 != null) {
                var15 |= var24.method340(-2, var25);
                var14 |= var24.method346(false, var25);
                var17 |= var24.method348(82, var25);
                var16 |= arg10.field2362;
            }
            if ((arg10.field2358 || class230.field4004) && arg4 != -1 && arg4 < arg10.field2377.length) {
                int var26 = arg10.field2377[arg4];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class48 var29;
                if (var23 == var27) {
                    var29 = var24;
                } else {
                    var29 = arg8.method637(var28 >>> 16, false);
                }
                if (var29 != null) {
                    var15 |= var29.method340(-2, var28);
                    var14 |= var29.method346(false, var28);
                    var17 |= var29.method348(82, var28);
                }
            }
            if (var15) {
                var13 |= 0x80;
            }
            if (var14) {
                var13 |= 0x100;
            }
            if (var16) {
                var13 |= 0x200;
            }
            if (var17) {
                var13 |= 0x400;
            }
        }
        long var30 = (long) (arg11 << 16) | (long) arg0 << 32 | (long) arg3;
        class231 var32 = class241.field4158;
        class530 var33;
        synchronized (class241.field4158) {
            if (arg1) {
                this.field5236 = -125L;
            }
            var33 = (class530) class241.field4158.method1593((byte) 111, var30);
        }
        if (var33 == null || arg7.method902(var33.method741(), var13) != 0) {
            if (var33 != null) {
                var13 = arg7.method878(var13, var33.method741());
            }
            class227[] var35 = new class227[3];
            int var36 = 0;
            if (!arg6.method1502(arg3, (byte) -118).method2119(127) || !arg6.method1502(arg11, (byte) -118).method2119(123) || !arg6.method1502(arg0, (byte) -118).method2119(121)) {
                return null;
            }
            class227 var37 = arg6.method1502(arg3, (byte) -118).method2121(5);
            if (var37 != null) {
                var35[var36++] = var37;
            }
            class227 var38 = arg6.method1502(arg11, (byte) -118).method2121(5);
            if (var38 != null) {
                var35[var36++] = var38;
            }
            class227 var39 = arg6.method1502(arg0, (byte) -118).method2121(5);
            if (var39 != null) {
                var35[var36++] = var39;
            }
            int var40 = var13 | 0x4000;
            class227 var41 = new class227(var35, var36);
            var33 = arg7.method875(var41, var40, class216.field3755, 64, 768);
            for (int var42 = 0; var42 < 5; var42++) {
                if (class73.field1253[var42].length > this.field5243[var42]) {
                    var33.method728(class300.field4816[var42], class73.field1253[var42][this.field5243[var42]]);
                }
                if (class146.field2389[var42].length > this.field5243[var42]) {
                    var33.method728(class175.field2775[var42], class146.field2389[var42][this.field5243[var42]]);
                }
            }
            var33.method762(var13);
            class231 var43 = class241.field4158;
            synchronized (class241.field4158) {
                class241.field4158.method1595(var33, var30, (byte) 90);
            }
        }
        if (arg10 == null) {
            return var33;
        } else {
            class530 var44 = var33.method739((byte) 4, var13, true);
            return arg10.method1059(arg4, arg9, var44, arg5, arg2, 256);
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(Lck;Lim;IIILdj;ILsq;[Lsl;ZIILsq;Lkg;Lza;Ltl;IILvk;)Le;", line = 155)
    public final class530 method2094(class156 arg0, class294 arg1, int arg2, int arg3, int arg4, class344 arg5, int arg6, class145 arg7, class63[] arg8, boolean arg9, int arg10, int arg11, class145 arg12, class217 arg13, class491 arg14, class91 arg15, int arg16, int arg17, class302 arg18) {
        field5250++;
        if (this.field5245 != -1) {
            return arg0.method1085(this.field5245, 537461692).method2996(arg1, arg3, arg12, arg14, arg10, arg16 - 136, arg11, arg2, arg8, arg7, arg4, arg6, arg18, arg17, arg15);
        }
        int var20 = arg11;
        long var21 = this.field5248;
        int[] var23 = this.field5240;
        if (arg12 != null && (arg12.field2368 >= 0 || arg12.field2376 >= 0)) {
            var23 = new int[12];
            for (int var24 = 0; var24 < 12; var24++) {
                var23[var24] = this.field5240[var24];
            }
            if (arg12.field2368 >= 0) {
                if (arg12.field2368 == 65535) {
                    var21 ^= 0xFFFFFFFF00000000L;
                    var23[5] = 0;
                } else {
                    var23[5] = class338.method2141(arg12.field2368, 1073741824);
                    var21 ^= (long) var23[5] << 32;
                }
            }
            if (arg12.field2376 >= 0) {
                if (arg12.field2376 == 65535) {
                    var23[3] = 0;
                    var21 ^= 0xFFFFFFFFL;
                } else {
                    var23[3] = class338.method2141(arg12.field2376, 1073741824);
                    var21 ^= var23[3];
                }
            }
        }
        boolean var25 = false;
        boolean var26 = false;
        boolean var27 = false;
        boolean var28 = arg12 != null || arg7 != null;
        int var29 = arg8 == null ? 0 : arg8.length;
        for (int var30 = 0; var30 < var29; var30++) {
            class345.field5415[var30] = null;
            if (arg8[var30] != null) {
                class145 var31 = arg15.method634(arg16 ^ 0xB4341901, arg8[var30].field939);
                if (var31.field2377 != null) {
                    var28 = true;
                    class173.field2771[var30] = var31;
                    int var32 = arg8[var30].field942;
                    int var33 = arg8[var30].field945;
                    int var34 = var31.field2377[var32];
                    class345.field5415[var30] = arg15.method637(var34 >>> 16, false);
                    int var35 = var34 & 0xFFFF;
                    class301.field4833[var30] = var35;
                    if (class345.field5415[var30] != null) {
                        var26 |= class345.field5415[var30].method340(-2, var35);
                        var25 |= class345.field5415[var30].method346(false, var35);
                        var27 |= class345.field5415[var30].method348(arg16 + 82, var35);
                    }
                    if ((var31.field2358 || class230.field4004) && var33 != -1 && var31.field2377.length > var33) {
                        class337.field5289[var30] = var31.field2375[var32];
                        class453.field6764[var30] = arg8[var30].field940;
                        int var36 = var31.field2377[var33];
                        class78.field1364[var30] = arg15.method637(var36 >>> 16, false);
                        int var37 = var36 & 0xFFFF;
                        class217.field3770[var30] = var37;
                        if (class78.field1364[var30] != null) {
                            var26 |= class78.field1364[var30].method340(-2, var37);
                            var25 |= class78.field1364[var30].method346(false, var37);
                            var27 |= class78.field1364[var30].method348(82, var37);
                        }
                    } else {
                        class337.field5289[var30] = 0;
                        class453.field6764[var30] = 0;
                        class78.field1364[var30] = null;
                        class217.field3770[var30] = -1;
                    }
                }
            }
        }
        int var38 = -1;
        int var39 = -1;
        int var40 = 0;
        class48 var41 = null;
        class48 var42 = null;
        int var43 = -1;
        int var44 = -1;
        int var45 = 0;
        class48 var46 = null;
        class48 var47 = null;
        if (var28) {
            if (arg12 != null) {
                int var48 = arg12.field2377[arg4];
                int var49 = var48 >>> 16;
                var38 = var48 & 0xFFFF;
                var41 = arg15.method637(var49, false);
                if (var41 != null) {
                    var26 |= var41.method340(-2, var38);
                    var25 |= var41.method346(false, var38);
                    var27 |= var41.method348(82, var38);
                }
                if ((arg12.field2358 || class230.field4004) && arg10 != -1 && arg10 < arg12.field2377.length) {
                    int var50 = arg12.field2377[arg10];
                    var40 = arg12.field2375[arg4];
                    int var51 = var50 >>> 16;
                    var42 = var49 == var51 ? var41 : arg15.method637(var51, false);
                    var39 = var50 & 0xFFFF;
                    if (var42 != null) {
                        var26 |= var42.method340(-2, var39);
                        var25 |= var42.method346(false, var39);
                        var27 |= var42.method348(82, var39);
                    }
                }
            }
            var20 = arg11 | 0x20;
            if (arg7 != null) {
                int var52 = arg7.field2377[arg3];
                int var53 = var52 >>> 16;
                var46 = arg15.method637(var53, false);
                var43 = var52 & 0xFFFF;
                if (var46 != null) {
                    var26 |= var46.method340(-2, var43);
                    var25 |= var46.method346(false, var43);
                    var27 |= var46.method348(82, var43);
                }
                if ((arg7.field2358 || class230.field4004) && arg2 != -1 && arg2 < arg7.field2377.length) {
                    int var54 = arg7.field2377[arg2];
                    var45 = arg7.field2375[arg3];
                    int var55 = var54 >>> 16;
                    var44 = var54 & 0xFFFF;
                    var47 = var53 == var55 ? var46 : arg15.method637(var55, false);
                    if (var47 != null) {
                        var26 |= var47.method340(-2, var44);
                        var25 |= var47.method346(false, var44);
                        var27 |= var47.method348(82, var44);
                    }
                }
            }
            if (var26) {
                var20 |= 0x80;
            }
            if (var25) {
                var20 |= 0x100;
            }
            if (var27) {
                var20 |= 0x400;
            }
        }
        class231 var56 = class322.field5060;
        class530 var57;
        synchronized (class322.field5060) {
            var57 = (class530) class322.field5060.method1593((byte) -123, var21);
        }
        class49 var58 = null;
        if (this.field5244 != -1) {
            var58 = arg18.method1934(125, this.field5244);
        }
        if (var57 == null || arg14.method902(var57.method741(), var20) != 0 || var58 != null && var58.field814 != null && this.field5234 == null) {
            if (var57 != null) {
                var20 = arg14.method878(var20, var57.method741());
            }
            boolean var60 = false;
            int var61 = 0;
            while (true) {
                if (var61 >= 12) {
                    if (var60) {
                        if (this.field5236 != -1L) {
                            class231 var63 = class322.field5060;
                            synchronized (class322.field5060) {
                                var57 = (class530) class322.field5060.method1593((byte) 122, this.field5236);
                            }
                        }
                        if (var57 == null || arg14.method902(var57.method741(), var20) != 0 || var58 != null && var58.field814 != null && this.field5234 == null) {
                            return null;
                        }
                    } else {
                        class227[] var64 = new class227[12];
                        for (int var65 = 0; var65 < 12; var65++) {
                            int var66 = var23[var65];
                            if ((var66 & 0x40000000) != 0) {
                                class227 var68 = arg5.method2221(var66 & 0x3FFFFFFF, -1).method717((byte) -53, this.field5231);
                                if (var68 != null) {
                                    var64[var65] = var68;
                                }
                            } else if ((var66 & Integer.MIN_VALUE) != 0) {
                                class227 var67 = arg13.method1502(var66 & 0x3FFFFFFF, (byte) -118).method2127(true);
                                if (var67 != null) {
                                    var64[var65] = var67;
                                }
                            }
                        }
                        if (var58 != null && var58.field814 != null) {
                            for (int var69 = 0; var69 < var58.field814.length; var69++) {
                                if (var58.field814[var69] != null && var64[var69] != null) {
                                    int var70 = var58.field814[var69][0];
                                    int var71 = var58.field814[var69][1];
                                    int var72 = var58.field814[var69][2];
                                    int var73 = var58.field814[var69][3] << 3;
                                    int var74 = var58.field814[var69][4] << 3;
                                    int var75 = var58.field814[var69][5] << 3;
                                    if (this.field5234 == null) {
                                        this.field5234 = new int[var58.field814.length][];
                                    }
                                    if (this.field5234[var69] == null) {
                                        int[] var76 = this.field5234[var69] = new int[15];
                                        if (var73 == 0 && var74 == 0 && var75 == 0) {
                                            var76[0] = var76[4] = var76[8] = 32768;
                                            var76[14] = -var72;
                                            var76[12] = -var70;
                                            var76[13] = -var71;
                                        } else {
                                            int var77 = class46.field755[var73];
                                            int var78 = class46.field757[var73];
                                            int var79 = class46.field755[var74];
                                            int var80 = class46.field757[var74];
                                            int var81 = class46.field755[var75];
                                            int var82 = class46.field757[var75];
                                            int var83 = var78 * var81 + 16384 >> 15;
                                            int var84 = var78 * var82 + 16384 >> 15;
                                            var76[8] = var77 * var79 + 16384 >> 15;
                                            var76[1] = -var82 * var79 + var80 * var83 + 16384 >> 15;
                                            var76[7] = -var80 * -var82 + var79 * var83 + 16384 >> 15;
                                            var76[5] = -var78;
                                            var76[4] = var77 * var81 + 16384 >> 15;
                                            var76[2] = var77 * var80 + 16384 >> 15;
                                            var76[0] = var79 * var81 + var80 * var84 + 16384 >> 15;
                                            var76[6] = -var80 * var81 + var79 * var84 + 16384 >> 15;
                                            var76[3] = var77 * var82 + 16384 >> 15;
                                            var76[13] = var76[7] * -var72 + var76[4] * -var71 + var76[1] * -var70 + 16384 >> 15;
                                            var76[14] = var76[5] * -var71 + var76[8] * -var72 + var76[2] * -var70 + 16384 >> 15;
                                            var76[12] = var76[0] * -var70 + var76[3] * -var71 + (var76[6] * -var72) + 16384 >> 15;
                                        }
                                        var76[9] = var70;
                                        var76[11] = var72;
                                        var76[10] = var71;
                                    }
                                    if (var73 != 0 || var74 != 0 || var75 != 0) {
                                        var64[var69].method1576(var74, var73, var75, false);
                                    }
                                    if (var70 != 0 || var71 != 0 || var72 != 0) {
                                        var64[var69].method1567(var72, var70, (byte) 100, var71);
                                    }
                                }
                            }
                        }
                        int var85 = var20 | 0x4000;
                        class227 var86 = new class227(var64, var64.length);
                        var57 = arg14.method875(var86, var85, class216.field3755, 64, 850);
                        for (int var87 = 0; var87 < 5; var87++) {
                            if (class73.field1253[var87].length > this.field5243[var87]) {
                                var57.method728(class300.field4816[var87], class73.field1253[var87][this.field5243[var87]]);
                            }
                            if (this.field5243[var87] < class146.field2389[var87].length) {
                                var57.method728(class175.field2775[var87], class146.field2389[var87][this.field5243[var87]]);
                            }
                        }
                        if (arg9) {
                            var57.method762(var20);
                            class231 var88 = class322.field5060;
                            synchronized (class322.field5060) {
                                class322.field5060.method1595(var57, var21, (byte) 93);
                            }
                            this.field5236 = var21;
                        }
                    }
                    break;
                }
                int var62 = var23[var61];
                if ((var62 & 0x40000000) == 0) {
                    if ((var62 & Integer.MIN_VALUE) != 0 && !arg13.method1502(var62 & 0x3FFFFFFF, (byte) -118).method2125((byte) 117)) {
                        var60 = true;
                    }
                } else if (!arg5.method2221(var62 & 0x3FFFFFFF, -1).method716(this.field5231, arg16 ^ 0xFFFFFFC5)) {
                    var60 = true;
                }
                var61++;
            }
        }
        class530 var89 = var57.method739((byte) 4, var20, true);
        if (!var28) {
            return var89;
        }
        int var90 = 0;
        int var91 = 1;
        while (var29 > var90) {
            if (class345.field5415[var90] != null) {
                var89.method3136(class337.field5289[var90], class301.field4833[var90], 0, this.field5234 == null ? null : this.field5234[var90], class78.field1364[var90], false, class345.field5415[var90], class453.field6764[var90] - 1, var91, 125, class217.field3770[var90]);
            }
            var91 <<= 0x1;
            var90++;
        }
        if (var41 != null && var46 != null) {
            var89.method3135(var43, arg6 - 1, var44, arg12.field2356, var39, var45, var38, var47, 0, var42, var40, false, arg17 - 1, var41, var46);
        } else if (var41 != null) {
            var89.method3138(var41, var40, var38, var39, false, var42, 0, 0, arg6 - 1);
        } else if (var46 != null) {
            var89.method3138(var46, var45, var43, var44, false, var47, 0, 0, arg17 - 1);
        }
        for (int var92 = arg16; var92 < var29; var92++) {
            class345.field5415[var92] = null;
            class78.field1364[var92] = null;
            class173.field2771[var92] = null;
        }
        return var89;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(Z)V", line = 652)
    private final void method2095(boolean arg0) {
        field5238++;
        this.field5248 = -1L;
        long[] var2 = class397.field6075;
        if (!arg0) {
            this.field5231 = false;
        }
        this.field5248 = this.field5248 >>> 8 ^ var2[(int) ((this.field5248 ^ (long) (this.field5244 >> 8)) & 0xFFL)];
        this.field5248 = this.field5248 >>> 8 ^ var2[(int) (((long) this.field5244 ^ this.field5248) & 0xFFL)];
        for (int var3 = 0; var3 < 12; var3++) {
            this.field5248 = this.field5248 >>> 8 ^ var2[(int) ((this.field5248 ^ (long) (this.field5240[var3] >> 24)) & 0xFFL)];
            this.field5248 = var2[(int) (((long) (this.field5240[var3] >> 16) ^ this.field5248) & 0xFFL)] ^ this.field5248 >>> 8;
            this.field5248 = this.field5248 >>> 8 ^ var2[(int) (((long) (this.field5240[var3] >> 8) ^ this.field5248) & 0xFFL)];
            this.field5248 = var2[(int) ((this.field5248 ^ (long) this.field5240[var3]) & 0xFFL)] ^ this.field5248 >>> 8;
        }
        for (int var4 = 0; var4 < 5; var4++) {
            this.field5248 = this.field5248 >>> 8 ^ var2[(int) ((this.field5248 ^ (long) this.field5243[var4]) & 0xFFL)];
        }
        this.field5248 = var2[(int) (((long) (this.field5231 ? 1 : 0) ^ this.field5248) & 0xFFL)] ^ this.field5248 >>> 8;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(Lza;IILtl;Lkg;Lsq;ILim;IILdj;Lck;)Le;", line = 692)
    public final class530 method2096(class491 arg0, int arg1, int arg2, class91 arg3, class217 arg4, class145 arg5, int arg6, class294 arg7, int arg8, int arg9, class344 arg10, class156 arg11) {
        field5247++;
        if (this.field5245 != -1) {
            return arg11.method1085(this.field5245, 537461692).method2997(arg8, arg3, arg1, arg7, arg2, arg0, arg9, (byte) 79, arg5);
        }
        int var13 = arg9;
        if (arg5 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            Object var21 = null;
            int var22 = arg5.field2377[arg1];
            var13 = arg9 | 0x20;
            int var23 = var22 >>> 16;
            class48 var24 = arg3.method637(var23, false);
            int var25 = var22 & 0xFFFF;
            if (var24 != null) {
                var15 |= var24.method340(-2, var25);
                var14 |= var24.method346(false, var25);
                var17 |= var24.method348(82, var25);
                var16 |= arg5.field2362;
            }
            if ((arg5.field2358 || class230.field4004) && arg8 != -1 && arg5.field2377.length > arg8) {
                int var26 = arg5.field2377[arg8];
                int var27 = var26 >>> 16;
                class48 var28 = var23 == var27 ? var24 : arg3.method637(var27, false);
                int var29 = var26 & 0xFFFF;
                if (var28 != null) {
                    var15 |= var28.method340(-2, var29);
                    var14 |= var28.method346(false, var29);
                    var17 |= var28.method348(82, var29);
                }
            }
            if (var15) {
                var13 |= 0x80;
            }
            if (var14) {
                var13 |= 0x100;
            }
            if (var16) {
                var13 |= 0x200;
            }
            if (var17) {
                var13 |= 0x400;
            }
        }
        class231 var30 = class241.field4158;
        class530 var31;
        synchronized (class241.field4158) {
            var31 = (class530) class241.field4158.method1593((byte) 120, this.field5248);
        }
        if (var31 == null || arg0.method902(var31.method741(), var13) != 0) {
            if (var31 != null) {
                var13 = arg0.method878(var13, var31.method741());
            }
            boolean var33 = false;
            for (int var34 = 0; var34 < 12; var34++) {
                int var35 = this.field5240[var34];
                if ((var35 & 0x40000000) == 0) {
                    if ((var35 & Integer.MIN_VALUE) != 0 && !arg4.method1502(var35 & 0x3FFFFFFF, (byte) -118).method2119(125)) {
                        var33 = true;
                    }
                } else if (!arg10.method2221(var35 & 0x3FFFFFFF, -1).method705(18296, this.field5231)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class227[] var36 = new class227[12];
            int var37 = 0;
            for (int var38 = 0; var38 < 12; var38++) {
                int var39 = this.field5240[var38];
                if ((var39 & 0x40000000) != 0) {
                    class227 var40 = arg10.method2221(var39 & 0x3FFFFFFF, -1).method721(this.field5231, -42);
                    if (var40 != null) {
                        var36[var37++] = var40;
                    }
                } else if ((var39 & Integer.MIN_VALUE) != 0) {
                    class227 var41 = arg4.method1502(var39 & 0x3FFFFFFF, (byte) -118).method2121(5);
                    if (var41 != null) {
                        var36[var37++] = var41;
                    }
                }
            }
            int var42 = var13 | 0x4000;
            class227 var43 = new class227(var36, var37);
            var31 = arg0.method875(var43, var42, class216.field3755, 64, 768);
            for (int var44 = 0; var44 < 5; var44++) {
                if (class73.field1253[var44].length > this.field5243[var44]) {
                    var31.method728(class300.field4816[var44], class73.field1253[var44][this.field5243[var44]]);
                }
                if (this.field5243[var44] < class146.field2389[var44].length) {
                    var31.method728(class175.field2775[var44], class146.field2389[var44][this.field5243[var44]]);
                }
            }
            var31.method762(var13);
            class231 var45 = class241.field4158;
            synchronized (class241.field4158) {
                class241.field4158.method1595(var31, this.field5248, (byte) -105);
            }
        }
        int var46 = -39 / ((-arg6 - 41) / 49);
        if (arg5 == null) {
            return var31;
        } else {
            var31.method739((byte) 4, var13, true);
            return arg5.method1059(arg8, arg2, var31, arg1, arg9, 256);
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(ILjava/lang/String;)V", line = 887)
    public static final void method2097(int arg0, String arg1) {
        field5241++;
        if (class383.field5913 == null) {
            class48.method339((byte) -113);
        }
        String[] var2 = class241.method1661('\n', -20326, arg1);
        if (arg0 <= 101) {
            return;
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            for (int var4 = class307.field4888; var4 > 0; var4--) {
                class383.field5913[var4] = class383.field5913[var4 - 1];
            }
            class383.field5913[0] = var2[var3];
            if (class307.field4888 < (class383.field5913.length - 1)) {
                class307.field4888++;
                if (class265.field4425 > 0) {
                    class265.field4425++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(ZBII[I[I)V", line = 931)
    public final void method2098(boolean arg0, byte arg1, int arg2, int arg3, int[] arg4, int[] arg5) {
        this.field5243 = arg4;
        if (arg1 != -56) {
            this.field5231 = true;
        }
        if (this.field5244 != arg2) {
            this.field5244 = arg2;
            this.field5234 = null;
        }
        field5249++;
        this.field5240 = arg5;
        this.field5231 = arg0;
        this.field5245 = arg3;
        this.method2095(true);
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(IIIIIZZ)V", line = 955)
    public static final void method2099(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        class276.field4534 = arg0;
        class70.field1217 = 0x1 << class276.field4534;
        class331.field5211 = class70.field1217 >> 1;
        class220.field3806 = (int) Math.sqrt((double) (class331.field5211 * class331.field5211 + class331.field5211 * class331.field5211));
        class117.field2089 = class70.field1217 >> 2;
        class194.field3027 = class70.field1217;
        class236.field4089 = arg2;
        class276.field4537 = arg3;
        class31.field502 = arg4;
        class417.field6321 = new class465[arg1][class236.field4089][class276.field4537];
        class511.field7488 = new class220[arg1];
        if (arg5) {
            class526.field7761 = new int[class236.field4089][class276.field4537];
            class374.field5819 = new byte[class236.field4089][class276.field4537];
            class495.field7234 = new short[class236.field4089][class276.field4537];
            class213.field3395 = new class465[1][class236.field4089][class276.field4537];
            class320.field5039 = new class220[1];
        } else {
            class526.field7761 = null;
            class374.field5819 = null;
            class495.field7234 = null;
            class213.field3395 = null;
            class320.field5039 = null;
        }
        if (arg6) {
            class355.field5541 = new long[arg1][arg2][arg3];
            class435.field6486 = new class429[65535];
            class16.field188 = new boolean[65535];
            class38.field572 = 0;
        } else {
            class355.field5541 = null;
            class435.field6486 = null;
            class16.field188 = null;
            class38.field572 = 0;
        }
        class475.method2808(false);
        class252.field4299 = new class194[1000];
        class244.field4189 = 0;
        class128.field2200 = new class194[1000];
        class387.field5963 = 0;
        class76.field1314 = new int[arg1][class236.field4089 + 1][class276.field4537 + 1];
        class271.field4497 = new class290[5000];
        class510.field7453 = 0;
        class141.field2332 = new boolean[class31.field502 + class31.field502 + 1][class31.field502 + class31.field502 + 1];
        class205.field3249 = new boolean[class31.field502 + class31.field502 + 2][class31.field502 + class31.field502 + 2];
        class424.field6390 = null;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(I)V", line = 1011)
    public static void method2100(int arg0) {
        field5233 = null;
        if (arg0 <= 96) {
            method2097(92, null);
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(ILkg;II)V", line = 1025)
    public final void method2101(int arg0, class217 arg1, int arg2, int arg3) {
        field5232++;
        int var5 = class281.field4598[arg2];
        if (this.field5240[var5] == 0) {
            return;
        }
        int var6 = -53 / ((arg3 + 35) / 38);
        if (arg1.method1502(arg0, (byte) -118) != null) {
            this.field5240[var5] = class338.method2141(Integer.MIN_VALUE, arg0);
            this.method2095(true);
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(ZI)V", line = 1046)
    public final void method2102(boolean arg0, int arg1) {
        field5239++;
        this.field5231 = arg0;
        if (arg1 != 24369) {
            field5237 = -88;
        }
        this.method2095(true);
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(III)V", line = 1067)
    public final void method2103(int arg0, int arg1, int arg2) {
        this.field5243[arg1] = arg0;
        if (arg2 != 0) {
            this.method2103(19, 39, -115);
        }
        field5230++;
        this.method2095(true);
    }

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "(ZI)V", line = 1085)
    public static final void method2104(boolean arg0, int arg1) {
        field5251++;
        class404.field6135 = 0;
        class65.field961 = 0;
        class227.method1568(-22574);
        class36.method271(false, arg0);
        class460.method2741(-2866);
        boolean var2 = false;
        int var3 = 0;
        if (arg1 > -40) {
            method2099(-7, 36, -85, -25, 109, true, true);
        }
        while (var3 < class404.field6135) {
            int var5 = class29.field476[var3];
            class505 var6 = (class505) class147.field2396.method2516((long) var5, -1);
            class265 var7 = var6.field7355;
            if (class387.field5967 && class300.method1921(var5, (byte) -67)) {
                class212.method1396((byte) -58);
            }
            if (class504.field7348 != var7.field3058) {
                if (var7.field4430.method2998(-1)) {
                    class265.method1766(true, var7);
                }
                var7.method1764(-1, null);
                var2 = true;
                var6.method1821((byte) -112);
            }
            var3++;
        }
        if (var2) {
            class353.field5506 = class147.field2396.method2521((byte) 118);
            class147.field2396.method2523(91, class393.field6008);
        }
        if (class195.field3050 != class506.field7365.field301) {
            throw new RuntimeException("gnp1 pos:" + class506.field7365.field301 + " psize:" + class195.field3050);
        }
        for (int var4 = 0; var4 < class86.field1471; var4++) {
            if (class147.field2396.method2516((long) class371.field5734[var4], -1) == null) {
                throw new RuntimeException("gnp2 pos:" + var4 + " size:" + class86.field1471);
            }
        }
    }
}
