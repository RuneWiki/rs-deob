import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class435 {

    @OriginalMember(owner = "client!wi", name = "q", descriptor = "I")
    public int field5951 = -1;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "I")
    private int field5935;

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "I")
    public static int field5936;

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "I")
    public static int field5937;

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "I")
    public static int field5938;

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "I")
    public static int field5939;

    @OriginalMember(owner = "client!wi", name = "g", descriptor = "I")
    public static int field5941;

    @OriginalMember(owner = "client!wi", name = "h", descriptor = "I")
    public static int field5942;

    @OriginalMember(owner = "client!wi", name = "i", descriptor = "I")
    public static int field5943;

    @OriginalMember(owner = "client!wi", name = "j", descriptor = "I")
    public static int field5944;

    @OriginalMember(owner = "client!wi", name = "n", descriptor = "I")
    public static int field5948;

    @OriginalMember(owner = "client!wi", name = "o", descriptor = "I")
    public static int field5949;

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "J")
    private long field5940;

    @OriginalMember(owner = "client!wi", name = "p", descriptor = "J")
    private long field5950;

    @OriginalMember(owner = "client!wi", name = "m", descriptor = "Z")
    public boolean field5947;

    @OriginalMember(owner = "client!wi", name = "k", descriptor = "[I")
    private int[] field5945;

    @OriginalMember(owner = "client!wi", name = "r", descriptor = "[I")
    public int[] field5952;

    @OriginalMember(owner = "client!wi", name = "l", descriptor = "[[I")
    private int[][] field5946;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(ZILaba;II[Lpba;Loa;Lnaa;ILdv;Ldv;Luc;Lvd;IILfaa;ILgr;I)Lba;", line = 4)
    public final class358 method2466(boolean arg0, int arg1, class163 arg2, int arg3, int arg4, class307[] arg5, class651 arg6, class66 arg7, int arg8, class616 arg9, class616 arg10, class27 arg11, class36 arg12, int arg13, int arg14, class143 arg15, int arg16, class404 arg17, int arg18) {
        field5936++;
        if (this.field5951 != -1) {
            return arg12.method277(this.field5951, (byte) -52).method2402(arg14, arg17, 4, arg4, arg2, arg3, arg16, arg10, arg1, arg18, arg11, arg6, arg5, arg9, arg13);
        }
        int var20 = arg4;
        long var21 = this.field5940;
        int[] var23 = this.field5945;
        if (arg9 != null && (arg9.field8147 >= 0 || arg9.field8141 >= 0)) {
            var23 = new int[12];
            for (int var24 = 0; var24 < 12; var24++) {
                var23[var24] = this.field5945[var24];
            }
            if (arg9.field8147 >= 0) {
                if (arg9.field8147 == 65535) {
                    var21 ^= 0xFFFFFFFF00000000L;
                    var23[5] = 0;
                } else {
                    var23[5] = class220.method1393(arg9.field8147, 1073741824);
                    var21 ^= (long) var23[5] << 32;
                }
            }
            if (arg9.field8141 >= 0) {
                if (arg9.field8141 == 65535) {
                    var21 ^= 0xFFFFFFFFL;
                    var23[3] = 0;
                } else {
                    var23[3] = class220.method1393(1073741824, arg9.field8141);
                    var21 ^= var23[3];
                }
            }
        }
        boolean var25 = false;
        boolean var26 = false;
        boolean var27 = false;
        boolean var28 = arg9 != null || arg10 != null;
        int var29 = arg5 == null ? 0 : arg5.length;
        for (int var30 = 0; var30 < var29; var30++) {
            class225.field3178[var30] = null;
            if (arg5[var30] != null) {
                class616 var31 = arg11.method231(arg5[var30].field4235, -11764);
                if (var31.field8160 != null) {
                    class328.field4522[var30] = var31;
                    var28 = true;
                    int var32 = arg5[var30].field4236;
                    int var33 = arg5[var30].field4234;
                    int var34 = var31.field8160[var32];
                    class225.field3178[var30] = arg11.method229(-104, var34 >>> 16);
                    int var35 = var34 & 0xFFFF;
                    class566.field7490[var30] = var35;
                    if (class225.field3178[var30] != null) {
                        var26 |= class225.field3178[var30].method3855(1, var35);
                        var25 |= class225.field3178[var30].method3853(var35, (byte) 19);
                        var27 |= class225.field3178[var30].method3856(false, var35);
                    }
                    if ((var31.field8156 || class672.field9512) && var33 != -1 && var31.field8160.length > var33) {
                        class316.field4356[var30] = var31.field8163[var32];
                        class277.field3871[var30] = arg5[var30].field4233;
                        int var36 = var31.field8160[var33];
                        class482.field6433[var30] = arg11.method229(-41, var36 >>> 16);
                        int var37 = var36 & 0xFFFF;
                        class122.field2044[var30] = var37;
                        if (class482.field6433[var30] != null) {
                            var26 |= class482.field6433[var30].method3855(1, var37);
                            var25 |= class482.field6433[var30].method3853(var37, (byte) 19);
                            var27 |= class482.field6433[var30].method3856(false, var37);
                        }
                    } else {
                        class316.field4356[var30] = 0;
                        class277.field3871[var30] = 0;
                        class482.field6433[var30] = null;
                        class122.field2044[var30] = -1;
                    }
                }
            }
        }
        int var38 = -1;
        int var39 = -1;
        if (arg8 > -96) {
            return null;
        }
        int var40 = 0;
        class696 var41 = null;
        class696 var42 = null;
        int var43 = -1;
        int var44 = -1;
        int var45 = 0;
        class696 var46 = null;
        class696 var47 = null;
        if (var28) {
            if (arg9 != null) {
                int var48 = arg9.field8160[arg18];
                int var49 = var48 >>> 16;
                var41 = arg11.method229(-124, var49);
                var38 = var48 & 0xFFFF;
                if (var41 != null) {
                    var26 |= var41.method3855(1, var38);
                    var25 |= var41.method3853(var38, (byte) 19);
                    var27 |= var41.method3856(false, var38);
                }
                if ((arg9.field8156 || class672.field9512) && arg16 != -1 && arg16 < arg9.field8160.length) {
                    int var50 = arg9.field8160[arg16];
                    var40 = arg9.field8163[arg18];
                    int var51 = var50 >>> 16;
                    var42 = var49 == var51 ? var41 : arg11.method229(-108, var51);
                    var39 = var50 & 0xFFFF;
                    if (var42 != null) {
                        var26 |= var42.method3855(1, var39);
                        var25 |= var42.method3853(var39, (byte) 19);
                        var27 |= var42.method3856(false, var39);
                    }
                }
            }
            var20 = arg4 | 0x20;
            if (arg10 != null) {
                int var52 = arg10.field8160[arg14];
                int var53 = var52 >>> 16;
                var43 = var52 & 0xFFFF;
                var46 = arg11.method229(-65, var53);
                if (var46 != null) {
                    var26 |= var46.method3855(1, var43);
                    var25 |= var46.method3853(var43, (byte) 19);
                    var27 |= var46.method3856(false, var43);
                }
                if ((arg10.field8156 || class672.field9512) && arg3 != -1 && arg10.field8160.length > arg3) {
                    var45 = arg10.field8163[arg14];
                    int var54 = arg10.field8160[arg3];
                    int var55 = var54 >>> 16;
                    var47 = var53 == var55 ? var46 : arg11.method229(-105, var55);
                    var44 = var54 & 0xFFFF;
                    if (var47 != null) {
                        var26 |= var47.method3855(1, var44);
                        var25 |= var47.method3853(var44, (byte) 19);
                        var27 |= var47.method3856(false, var44);
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
        class666 var56 = class603.field8015;
        class358 var57;
        synchronized (class603.field8015) {
            var57 = (class358) class603.field8015.method3750(var21, false);
        }
        class543 var58 = null;
        if (this.field5935 != -1) {
            var58 = arg17.method2319(this.field5935, (byte) -88);
        }
        if (var57 == null || arg6.method376(var57.method1945(), var20) != 0 || var58 != null && var58.field7142 != null && this.field5946 == null) {
            if (var57 != null) {
                var20 = arg6.method460(var20, var57.method1945());
            }
            boolean var60 = false;
            for (int var61 = 0; var61 < 12; var61++) {
                int var62 = var23[var61];
                if ((var62 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var62) != 0 && !arg7.method534((byte) 70, var62 & 0x3FFFFFFF).method2822((byte) 126)) {
                        var60 = true;
                    }
                } else if (!arg15.method1047(var62 & 0x3FFFFFFF, -1).method3159(this.field5947, (byte) 57)) {
                    var60 = true;
                }
            }
            if (var60) {
                if (this.field5950 != -1L) {
                    class666 var63 = class603.field8015;
                    synchronized (class603.field8015) {
                        var57 = (class358) class603.field8015.method3750(this.field5950, false);
                    }
                }
                if (var57 == null || arg6.method376(var57.method1945(), var20) != 0 || var58 != null && var58.field7142 != null && this.field5946 == null) {
                    return null;
                }
            } else {
                class545[] var64 = new class545[12];
                for (int var65 = 0; var65 < 12; var65++) {
                    int var66 = var23[var65];
                    if ((var66 & 0x40000000) != 0) {
                        class545 var67 = arg15.method1047(var66 & 0x3FFFFFFF, -1).method3156(this.field5947, (byte) -95);
                        if (var67 != null) {
                            var64[var65] = var67;
                        }
                    } else if ((Integer.MIN_VALUE & var66) != 0) {
                        class545 var68 = arg7.method534((byte) 119, var66 & 0x3FFFFFFF).method2825(-19239);
                        if (var68 != null) {
                            var64[var65] = var68;
                        }
                    }
                }
                if (var58 != null && var58.field7142 != null) {
                    for (int var69 = 0; var69 < var58.field7142.length; var69++) {
                        if (var58.field7142[var69] != null && var64[var69] != null) {
                            int var70 = var58.field7142[var69][0];
                            int var71 = var58.field7142[var69][1];
                            int var72 = var58.field7142[var69][2];
                            int var73 = var58.field7142[var69][3] << 3;
                            int var74 = var58.field7142[var69][4] << 3;
                            int var75 = var58.field7142[var69][5] << 3;
                            if (this.field5946 == null) {
                                this.field5946 = new int[var58.field7142.length][];
                            }
                            if (this.field5946[var69] == null) {
                                int[] var76 = this.field5946[var69] = new int[15];
                                if (var73 == 0 && var74 == 0 && var75 == 0) {
                                    var76[0] = var76[4] = var76[8] = 32768;
                                    var76[12] = -var70;
                                    var76[13] = -var71;
                                    var76[14] = -var72;
                                } else {
                                    int var77 = class126.field2105[var73];
                                    int var78 = class126.field2116[var73];
                                    int var79 = class126.field2105[var74];
                                    int var80 = class126.field2116[var74];
                                    int var81 = class126.field2105[var75];
                                    int var82 = class126.field2116[var75];
                                    int var83 = var78 * var81 + 8192 >> 14;
                                    int var84 = var78 * var82 + 8192 >> 14;
                                    var76[4] = var77 * var81 + 8192 >> 14;
                                    var76[5] = -var78;
                                    var76[1] = -var82 * var79 + var80 * var83 + 8192 >> 14;
                                    var76[8] = var77 * var79 + 8192 >> 14;
                                    var76[6] = -var80 * var81 + (var79 * var84) + 8192 >> 14;
                                    var76[3] = var77 * var82 + 8192 >> 14;
                                    var76[2] = var77 * var80 + 8192 >> 14;
                                    var76[0] = var79 * var81 + var80 * var84 + 8192 >> 14;
                                    var76[7] = -var80 * -var82 + var79 * var83 + 8192 >> 14;
                                    var76[12] = var76[0] * -var70 + var76[6] * -var72 + (var76[3] * -var71) + 8192 >> 14;
                                    var76[14] = var76[2] * -var70 + 8192 - (-(var76[5] * -var71) + -(var76[8] * -var72)) >> 14;
                                    var76[13] = var76[7] * -var72 + var76[4] * -var71 + var76[1] * -var70 + 8192 >> 14;
                                }
                                var76[10] = var71;
                                var76[9] = var70;
                                var76[11] = var72;
                            }
                            if (var73 != 0 || var74 != 0 || var75 != 0) {
                                var64[var69].method3025(var75, (byte) -127, var74, var73);
                            }
                            if (var70 != 0 || var71 != 0 || var72 != 0) {
                                var64[var69].method3026(var72, var70, var71, (byte) -46);
                            }
                        }
                    }
                }
                class545 var85 = new class545(var64, var64.length);
                int var86 = var20 | 0x4000;
                var57 = arg6.method443(var85, var86, class571.field7582, 64, 850);
                for (int var87 = 0; var87 < 5; var87++) {
                    for (int var88 = 0; var88 < class103.field1527.length; var88++) {
                        if (class103.field1527[var88][var87].length > this.field5952[var87]) {
                            var57.method1929(class487.field6583[var88][var87], class103.field1527[var88][var87][this.field5952[var87]]);
                        }
                    }
                }
                if (arg0) {
                    var57.method1899(var20);
                    class666 var89 = class603.field8015;
                    synchronized (class603.field8015) {
                        class603.field8015.method3745(1, var21, var57);
                    }
                    this.field5950 = var21;
                }
            }
        }
        class358 var90 = var57.method1519((byte) 4, var20, true);
        if (!var28) {
            return var90;
        }
        int var91 = 0;
        int var92 = 1;
        while (var29 > var91) {
            if (class225.field3178[var91] != null) {
                var90.method2117(var92, false, class225.field3178[var91], class566.field7490[var91], class482.field6433[var91], class277.field3871[var91] - 1, 0, class122.field2044[var91], 0, this.field5946 == null ? null : this.field5946[var91], class316.field4356[var91]);
            }
            var92 <<= 0x1;
            var91++;
        }
        if (var41 != null && var46 != null) {
            var90.method2113(var39, false, var44, var45, var46, var40, arg1 - 1, arg13 - 1, var42, arg9.field8149, var38, var41, var43, false, var47);
        } else if (var41 != null) {
            var90.method2110(false, 0, var40, var39, -126, var42, var38, var41, arg13 - 1);
        } else if (var46 != null) {
            var90.method2110(false, 0, var45, var44, 60, var47, var43, var46, arg1 - 1);
        }
        for (int var93 = 0; var93 < var29; var93++) {
            class225.field3178[var93] = null;
            class482.field6433[var93] = null;
            class328.field4522[var93] = null;
        }
        return var90;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "([IIZBI[I)V", line = 511)
    public final void method2467(int[] arg0, int arg1, boolean arg2, byte arg3, int arg4, int[] arg5) {
        this.field5951 = arg1;
        this.field5947 = arg2;
        this.field5952 = arg0;
        field5937++;
        this.field5945 = arg5;
        if (this.field5935 != arg4) {
            this.field5935 = arg4;
            this.field5946 = null;
        }
        this.method2469(true);
        int var7 = -59 % ((56 - arg3) / 61);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(ILuc;IIILoa;IIILdv;Lnaa;I)Lba;", line = 531)
    public final class358 method2468(int arg0, class27 arg1, int arg2, int arg3, int arg4, class651 arg5, int arg6, int arg7, int arg8, class616 arg9, class66 arg10, int arg11) {
        field5942++;
        int var13 = arg8;
        if (arg0 != 512) {
            this.field5951 = 89;
        }
        if (arg9 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            var13 = arg8 | 0x20;
            Object var21 = null;
            int var22 = arg9.field8160[arg2];
            int var23 = var22 >>> 16;
            class696 var24 = arg1.method229(-111, var23);
            int var25 = var22 & 0xFFFF;
            if (var24 != null) {
                var15 |= var24.method3855(1, var25);
                var14 |= var24.method3853(var25, (byte) 19);
                var17 |= var24.method3856(false, var25);
                var16 |= arg9.field8165;
            }
            if ((arg9.field8156 || class672.field9512) && arg11 != -1 && arg9.field8160.length > arg11) {
                int var26 = arg9.field8160[arg11];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class696 var29;
                if (var23 == var27) {
                    var29 = var24;
                } else {
                    var29 = arg1.method229(-64, var28 >>> 16);
                }
                if (var29 != null) {
                    var15 |= var29.method3855(1, var28);
                    var14 |= var29.method3853(var28, (byte) 19);
                    var17 |= var29.method3856(false, var28);
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
        long var30 = (long) arg7 << 32 | (long) (arg6 << 16) | (long) arg4;
        class666 var32 = class174.field2680;
        class358 var33;
        synchronized (class174.field2680) {
            var33 = (class358) class174.field2680.method3750(var30, false);
        }
        if (var33 == null || arg5.method376(var33.method1945(), var13) != 0) {
            if (var33 != null) {
                var13 = arg5.method460(var13, var33.method1945());
            }
            class545[] var35 = new class545[3];
            int var36 = 0;
            if (!arg10.method534((byte) 79, arg4).method2824((byte) 101) || !arg10.method534((byte) 74, arg6).method2824((byte) 101) || !arg10.method534((byte) 110, arg7).method2824((byte) 101)) {
                return null;
            }
            class545 var37 = arg10.method534((byte) 106, arg4).method2823((byte) -113);
            if (var37 != null) {
                var35[var36++] = var37;
            }
            class545 var38 = arg10.method534((byte) 80, arg6).method2823((byte) -59);
            if (var38 != null) {
                var35[var36++] = var38;
            }
            class545 var39 = arg10.method534((byte) 78, arg7).method2823((byte) -57);
            if (var39 != null) {
                var35[var36++] = var39;
            }
            int var40 = var13 | 0x4000;
            class545 var41 = new class545(var35, var36);
            var33 = arg5.method443(var41, var40, class571.field7582, 64, 768);
            for (int var42 = 0; var42 < 5; var42++) {
                for (int var43 = 0; var43 < class103.field1527.length; var43++) {
                    if (class103.field1527[var43][var42].length > this.field5952[var42]) {
                        var33.method1929(class487.field6583[var43][var42], class103.field1527[var43][var42][this.field5952[var42]]);
                    }
                }
            }
            var33.method1899(var13);
            class666 var44 = class174.field2680;
            synchronized (class174.field2680) {
                class174.field2680.method3745(arg0 ^ 0x201, var30, var33);
            }
        }
        if (arg9 == null) {
            return var33;
        } else {
            class358 var45 = var33.method1519((byte) 4, var13, true);
            return arg9.method3373(arg2, (byte) 44, arg8, arg3, arg11, var45);
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Z)V", line = 692)
    private final void method2469(boolean arg0) {
        field5948++;
        this.field5940 = -1L;
        long[] var2 = class246.field3431;
        this.field5940 = var2[(int) (((long) (this.field5935 >> 8) ^ this.field5940) & 0xFFL)] ^ this.field5940 >>> 8;
        this.field5940 = var2[(int) ((this.field5940 ^ (long) this.field5935) & 0xFFL)] ^ this.field5940 >>> 8;
        for (int var3 = 0; var3 < 12; var3++) {
            this.field5940 = this.field5940 >>> 8 ^ var2[(int) ((this.field5940 ^ (long) (this.field5945[var3] >> 24)) & 0xFFL)];
            this.field5940 = var2[(int) ((this.field5940 ^ (long) (this.field5945[var3] >> 16)) & 0xFFL)] ^ this.field5940 >>> 8;
            this.field5940 = this.field5940 >>> 8 ^ var2[(int) ((this.field5940 ^ (long) (this.field5945[var3] >> 8)) & 0xFFL)];
            this.field5940 = this.field5940 >>> 8 ^ var2[(int) ((this.field5940 ^ (long) this.field5945[var3]) & 0xFFL)];
        }
        if (!arg0) {
            this.field5945 = null;
        }
        for (int var4 = 0; var4 < 5; var4++) {
            this.field5940 = this.field5940 >>> 8 ^ var2[(int) (((long) this.field5952[var4] ^ this.field5940) & 0xFFL)];
        }
        this.field5940 = var2[(int) ((this.field5940 ^ (long) (this.field5947 ? 1 : 0)) & 0xFFL)] ^ this.field5940 >>> 8;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(II)Z", line = 731)
    public static final boolean method2470(int arg0, int arg1) {
        if (arg1 == 1494483976) {
            field5938++;
            return arg0 == 0 || arg0 == 2 || arg0 == 4;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IILfaa;I)V", line = 743)
    public final void method2471(int arg0, int arg1, class143 arg2, int arg3) {
        field5943++;
        if (arg3 == -1) {
            this.field5945[arg1] = 0;
        } else if (arg2.method1047(arg3, -1) == null) {
            return;
        } else {
            this.field5945[arg1] = class220.method1393(1073741824, arg3);
            this.method2469(true);
        }
        if (arg0 > -102) {
            method2470(-65, -118);
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(III)V", line = 770)
    public final void method2472(int arg0, int arg1, int arg2) {
        field5939++;
        this.field5952[arg1] = arg2;
        if (arg0 > 36) {
            this.method2469(true);
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(ZI)V", line = 783)
    public final void method2473(boolean arg0, int arg1) {
        if (arg1 == 17733) {
            field5944++;
            this.field5947 = arg0;
            this.method2469(true);
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(ILoa;ILaba;ILuc;Lvd;ILdv;Lnaa;Lfaa;I)Lba;", line = 797)
    public final class358 method2474(int arg0, class651 arg1, int arg2, class163 arg3, int arg4, class27 arg5, class36 arg6, int arg7, class616 arg8, class66 arg9, class143 arg10, int arg11) {
        field5941++;
        if (this.field5951 != -1) {
            return arg6.method277(this.field5951, (byte) -52).method2391(arg4, arg5, arg8, (byte) -125, arg1, arg3, arg11, arg2, arg0);
        }
        int var13 = arg2;
        if (arg8 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            int var21 = arg8.field8160[arg4];
            Object var22 = null;
            var13 = arg2 | 0x20;
            int var23 = var21 >>> 16;
            int var24 = var21 & 0xFFFF;
            class696 var25 = arg5.method229(-88, var23);
            if (var25 != null) {
                var15 |= var25.method3855(arg7 ^ 0x41, var24);
                var14 |= var25.method3853(var24, (byte) 19);
                var17 |= var25.method3856(false, var24);
                var16 |= arg8.field8165;
            }
            if ((arg8.field8156 || class672.field9512) && arg11 != -1 && arg11 < arg8.field8160.length) {
                int var26 = arg8.field8160[arg11];
                int var27 = var26 >>> 16;
                class696 var28 = var23 == var27 ? var25 : arg5.method229(-76, var27);
                int var29 = var26 & 0xFFFF;
                if (var28 != null) {
                    var15 |= var28.method3855(1, var29);
                    var14 |= var28.method3853(var29, (byte) 19);
                    var17 |= var28.method3856(false, var29);
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
        class666 var30 = class174.field2680;
        class358 var31;
        synchronized (class174.field2680) {
            var31 = (class358) class174.field2680.method3750(this.field5940, false);
        }
        if (var31 == null || arg1.method376(var31.method1945(), var13) != 0) {
            if (var31 != null) {
                var13 = arg1.method460(var13, var31.method1945());
            }
            boolean var33 = false;
            for (int var34 = 0; var34 < 12; var34++) {
                int var35 = this.field5945[var34];
                if ((var35 & 0x40000000) == 0) {
                    if ((var35 & Integer.MIN_VALUE) != 0 && !arg9.method534((byte) 103, var35 & 0x3FFFFFFF).method2824((byte) 101)) {
                        var33 = true;
                    }
                } else if (!arg10.method1047(var35 & 0x3FFFFFFF, arg7 - 65).method3157(110, this.field5947)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class545[] var36 = new class545[12];
            int var37 = 0;
            for (int var38 = 0; var38 < 12; var38++) {
                int var39 = this.field5945[var38];
                if ((var39 & 0x40000000) != 0) {
                    class545 var41 = arg10.method1047(var39 & 0x3FFFFFFF, arg7 - 65).method3162(arg7 ^ 0xF4200, this.field5947);
                    if (var41 != null) {
                        var36[var37++] = var41;
                    }
                } else if ((Integer.MIN_VALUE & var39) != 0) {
                    class545 var40 = arg9.method534((byte) 119, var39 & 0x3FFFFFFF).method2823((byte) -83);
                    if (var40 != null) {
                        var36[var37++] = var40;
                    }
                }
            }
            int var42 = var13 | 0x4000;
            class545 var43 = new class545(var36, var37);
            var31 = arg1.method443(var43, var42, class571.field7582, 64, 768);
            for (int var44 = 0; var44 < 5; var44++) {
                for (int var45 = 0; var45 < class103.field1527.length; var45++) {
                    if (class103.field1527[var45][var44].length > this.field5952[var44]) {
                        var31.method1929(class487.field6583[var45][var44], class103.field1527[var45][var44][this.field5952[var44]]);
                    }
                }
            }
            var31.method1899(var13);
            class666 var46 = class174.field2680;
            synchronized (class174.field2680) {
                class174.field2680.method3745(1, this.field5940, var31);
            }
        }
        if (arg8 == null) {
            return var31;
        } else if (arg7 == 64) {
            var31.method1519((byte) 4, var13, true);
            return arg8.method3373(arg4, (byte) 44, arg2, arg0, arg11, var31);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(ILnaa;II)V", line = 996)
    public final void method2475(int arg0, class66 arg1, int arg2, int arg3) {
        if (arg0 != -25951) {
            this.field5947 = true;
        }
        field5949++;
        int var5 = class526.field7009[arg2];
        if (arg1.method534((byte) 83, arg3) != null) {
            this.field5945[var5] = class220.method1393(arg3, Integer.MIN_VALUE);
            this.method2469(true);
        }
    }
}
