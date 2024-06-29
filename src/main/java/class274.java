import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class274 {

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "I")
    public int field3888 = -1;

    @OriginalMember(owner = "client!qe", name = "k", descriptor = "Z")
    public static boolean field3890 = true;

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "I")
    public static int field3882;

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "I")
    public static int field3886;

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "I")
    public static int field3889;

    @OriginalMember(owner = "client!qe", name = "l", descriptor = "I")
    public static int field3891;

    @OriginalMember(owner = "client!qe", name = "m", descriptor = "I")
    public static int field3892;

    @OriginalMember(owner = "client!qe", name = "n", descriptor = "I")
    public static int field3893;

    @OriginalMember(owner = "client!qe", name = "o", descriptor = "I")
    private int field3894;

    @OriginalMember(owner = "client!qe", name = "p", descriptor = "I")
    public static int field3895;

    @OriginalMember(owner = "client!qe", name = "r", descriptor = "I")
    public static int field3897;

    @OriginalMember(owner = "client!qe", name = "s", descriptor = "I")
    public static int field3898;

    @OriginalMember(owner = "client!qe", name = "t", descriptor = "I")
    public static int field3899;

    @OriginalMember(owner = "client!qe", name = "u", descriptor = "I")
    public static int field3900;

    @OriginalMember(owner = "client!qe", name = "w", descriptor = "I")
    public static int field3902;

    @OriginalMember(owner = "client!qe", name = "x", descriptor = "I")
    public static int field3903;

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "J")
    private long field3887;

    @OriginalMember(owner = "client!qe", name = "q", descriptor = "J")
    private long field3896;

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "Ltq;")
    public static class376 field3881;

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "Ljava/lang/String;")
    public static String field3883;

    @OriginalMember(owner = "client!qe", name = "v", descriptor = "Z")
    public boolean field3901;

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "[I")
    private int[] field3884;

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "[I")
    public int[] field3885;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "[[I")
    private int[][] field3880;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)V", line = 4)
    public static final void method1805(int arg0, int arg1) {
        field3895++;
        if (arg1 != -1) {
            field3881 = null;
        }
        class20 var2 = class369.method2351((byte) 92, 6, arg0);
        var2.method148(arg1 - 11805);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ZIIIIILae;Lkb;II)Lbk;", line = 18)
    public final class210 method1806(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class134 arg6, class412 arg7, int arg8, int arg9) {
        field3886++;
        int var11 = arg4;
        if (arg7 != null) {
            boolean var12 = false;
            boolean var13 = false;
            boolean var14 = false;
            boolean var15 = true;
            boolean var16 = true;
            Object var17 = null;
            int var18 = arg7.field5925[arg2];
            var11 = arg4 | 0x20;
            Object var19 = null;
            int var20 = var18 >>> 16;
            class64 var21 = class229.method1526(var20, -16026);
            int var22 = var18 & 0xFFFF;
            if (var21 != null) {
                var13 |= var21.method362((byte) -85, var22);
                var12 |= var21.method366(255, var22);
                var14 |= arg7.field5926;
            }
            if ((arg7.field5935 || class404.field5818) && arg1 != -1 && arg1 < arg7.field5925.length) {
                int var23 = arg7.field5925[arg1];
                int var24 = var23 >>> 16;
                int var25 = var23 & 0xFFFF;
                class64 var26;
                if (var20 == var24) {
                    var26 = var21;
                } else {
                    var26 = class229.method1526(var25 >>> 16, -16026);
                }
                if (var26 != null) {
                    var13 |= var26.method362((byte) -85, var25);
                    var12 |= var26.method366(255, var25);
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
        long var27 = (long) arg9 << 32 | (long) (arg3 << 16) | (long) arg8;
        class237 var29 = class420.field6007;
        class210 var30;
        synchronized (class420.field6007) {
            var30 = (class210) class420.field6007.method1625(var27, 0);
        }
        if (var30 == null || arg6.method689(var30.method1410(), var11) != 0) {
            if (var30 != null) {
                var11 = arg6.method625(var11, var30.method1410());
            }
            class160[] var32 = new class160[3];
            int var33 = 0;
            if (!class305.method2006(-69, arg8).method1973(-1) || !class305.method2006(-106, arg3).method1973(-1) || !class305.method2006(-114, arg9).method1973(-1)) {
                return null;
            }
            class160 var34 = class305.method2006(-54, arg8).method1969((byte) -12);
            if (var34 != null) {
                var32[var33++] = var34;
            }
            class160 var35 = class305.method2006(-74, arg3).method1969((byte) -12);
            if (var35 != null) {
                var32[var33++] = var35;
            }
            class160 var36 = class305.method2006(-84, arg9).method1969((byte) -12);
            if (var36 != null) {
                var32[var33++] = var36;
            }
            int var37 = var11 | 0x2000;
            class160 var38 = new class160(var32, var33);
            var30 = arg6.method605(var38, var37, class399.field5701, 64, 768);
            for (int var39 = 0; var39 < 5; var39++) {
                if (this.field3885[var39] < class50.field601[var39].length) {
                    var30.method1392(class279.field3947[var39], class50.field601[var39][this.field3885[var39]]);
                }
                if (class202.field2904[var39].length > this.field3885[var39]) {
                    var30.method1392(class235.field3293[var39], class202.field2904[var39][this.field3885[var39]]);
                }
            }
            var30.method1387(var11);
            class237 var40 = class420.field6007;
            synchronized (class420.field6007) {
                class420.field6007.method1622((byte) 13, var30, var27);
            }
        }
        if (arg7 == null) {
            return var30;
        } else {
            class210 var41 = var30.method1411((byte) 1, var11, arg0);
            return arg7.method2627(-32, arg2, arg4, arg1, var41, arg5);
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)V", line = 158)
    public static final void method1807(byte arg0) {
        class393[] var1 = class262.field3740;
        synchronized (class262.field3740) {
            if (arg0 != 27) {
                field3881 = null;
            }
            int var2 = 0;
            while (true) {
                if (var2 >= class262.field3740.length) {
                    break;
                }
                class262.field3740[var2] = new class393();
                class452.field6476[var2] = 0;
                var2++;
            }
        }
        field3897++;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIIIII)Lbm;", line = 180)
    public static final class59 method1808(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3898++;
        long var7 = (long) arg2 * 76724863L ^ (long) arg3 * 97549L ^ (long) arg4 * 67481L ^ (long) arg6 * 475427L ^ (long) arg1 * 986053L ^ (long) arg0 * 32147369L;
        if (arg5 != 255) {
            field3883 = null;
        }
        class59 var9 = (class59) class105.field1254.method1625(var7, arg5 - 255);
        if (var9 == null) {
            class59 var10 = class305.field4288.method686(arg4, arg3, arg6, arg1, arg0, arg2);
            class105.field1254.method1622((byte) 13, var10, var7);
            return var10;
        } else {
            return var9;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILkb;Lae;I[Ljq;Lkb;ZIIIIII)Lbk;", line = 202)
    public final class210 method1809(int arg0, class412 arg1, class134 arg2, int arg3, class299[] arg4, class412 arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        field3893++;
        if (this.field3888 != -1) {
            return class403.method2568(this.field3888, (byte) 115).method839(arg9, arg11, arg3, arg10, arg1, arg2, arg7, arg12, arg5, arg4, arg0 ^ 0x632895EE, arg8);
        }
        int var14 = arg10;
        long var15 = this.field3896;
        int[] var17 = this.field3884;
        if (arg5 != null && (arg5.field5917 >= 0 || arg5.field5922 >= 0)) {
            var17 = new int[12];
            for (int var18 = 0; var18 < 12; var18++) {
                var17[var18] = this.field3884[var18];
            }
            if (arg5.field5917 >= 0) {
                if (arg5.field5917 == 65535) {
                    var17[5] = 0;
                    var15 ^= 0xFFFFFFFF00000000L;
                } else {
                    var17[5] = class429.method2704(arg5.field5917, 1073741824);
                    var15 ^= (long) var17[5] << 32;
                }
            }
            if (arg5.field5922 >= 0) {
                if (arg5.field5922 == 65535) {
                    var17[3] = 0;
                    var15 ^= 0xFFFFFFFFL;
                } else {
                    var17[3] = class429.method2704(1073741824, arg5.field5922);
                    var15 ^= (long) var17[3];
                }
            }
        }
        boolean var19 = false;
        boolean var20 = false;
        boolean var21 = arg5 != null || arg1 != null;
        int var22 = arg4 == null ? 0 : arg4.length;
        for (int var23 = 0; var23 < var22; var23++) {
            class168.field2345[var23] = null;
            if (arg4[var23] != null) {
                class412 var24 = class189.method1288(arg0 ^ 0xFFFFE001, arg4[var23].field4182);
                if (var24.field5925 != null) {
                    var21 = true;
                    class119.field1461[var23] = var24;
                    int var25 = arg4[var23].field4183;
                    int var26 = arg4[var23].field4185;
                    int var27 = var24.field5925[var25];
                    class168.field2345[var23] = class229.method1526(var27 >>> 16, -16026);
                    int var28 = var27 & 0xFFFF;
                    class370.field5219[var23] = var28;
                    if (class168.field2345[var23] != null) {
                        var20 |= class168.field2345[var23].method362((byte) -85, var28);
                        var19 |= class168.field2345[var23].method366(255, var28);
                    }
                    if ((var24.field5935 || class404.field5818) && var26 != -1 && var26 < var24.field5925.length) {
                        class394.field5558[var23] = var24.field5918[var25];
                        class341.field4841[var23] = arg4[var23].field4186;
                        int var29 = var24.field5925[var26];
                        class288.field4028[var23] = class229.method1526(var29 >>> 16, -16026);
                        int var30 = var29 & 0xFFFF;
                        class128.field1554[var23] = var30;
                        if (class288.field4028[var23] != null) {
                            var20 |= class288.field4028[var23].method362((byte) -85, var30);
                            var19 |= class288.field4028[var23].method366(arg0 ^ 0xFE, var30);
                        }
                    } else {
                        class394.field5558[var23] = 0;
                        class341.field4841[var23] = 0;
                        class288.field4028[var23] = null;
                        class128.field1554[var23] = -1;
                    }
                }
            }
        }
        int var31 = -1;
        int var32 = -1;
        int var33 = 0;
        class64 var34 = null;
        class64 var35 = null;
        int var36 = -1;
        int var37 = -1;
        int var38 = 0;
        class64 var39 = null;
        class64 var40 = null;
        if (var21) {
            var14 = arg10 | 0x20;
            if (arg5 != null) {
                int var41 = arg5.field5925[arg12];
                int var42 = var41 >>> 16;
                var34 = class229.method1526(var42, -16026);
                var31 = var41 & 0xFFFF;
                if (var34 != null) {
                    var20 |= var34.method362((byte) -85, var31);
                    var19 |= var34.method366(255, var31);
                }
                if ((arg5.field5935 || class404.field5818) && arg7 != -1 && arg7 < arg5.field5925.length) {
                    var33 = arg5.field5918[arg12];
                    int var43 = arg5.field5925[arg7];
                    int var44 = var43 >>> 16;
                    var35 = var42 == var44 ? var34 : class229.method1526(var44, -16026);
                    var32 = var43 & 0xFFFF;
                    if (var35 != null) {
                        var20 |= var35.method362((byte) -85, var32);
                        var19 |= var35.method366(255, var32);
                    }
                }
            }
            if (arg1 != null) {
                int var45 = arg1.field5925[arg8];
                int var46 = var45 >>> 16;
                var39 = class229.method1526(var46, arg0 - 16027);
                var36 = var45 & 0xFFFF;
                if (var39 != null) {
                    var20 |= var39.method362((byte) -85, var36);
                    var19 |= var39.method366(arg0 + 254, var36);
                }
                if ((arg1.field5935 || class404.field5818) && arg11 != -1 && arg1.field5925.length > arg11) {
                    int var47 = arg1.field5925[arg11];
                    var38 = arg1.field5918[arg8];
                    int var48 = var47 >>> 16;
                    var40 = var46 == var48 ? var39 : class229.method1526(var48, -16026);
                    var37 = var47 & 0xFFFF;
                    if (var40 != null) {
                        var20 |= var40.method362((byte) -85, var37);
                        var19 |= var40.method366(arg0 ^ 0xFE, var37);
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
        class237 var49 = class337.field4789;
        class210 var50;
        synchronized (class337.field4789) {
            var50 = (class210) class337.field4789.method1625(var15, 0);
        }
        class306 var51 = null;
        if (this.field3894 != -1) {
            var51 = class138.method853(this.field3894, (byte) -49);
        }
        if (var50 == null || arg2.method689(var50.method1410(), var14) != 0 || var51 != null && var51.field4298 != null && this.field3880 == null) {
            if (var50 != null) {
                var14 = arg2.method625(var14, var50.method1410());
            }
            boolean var53 = false;
            int var54 = 0;
            while (true) {
                if (var54 >= 12) {
                    if (var53) {
                        if (this.field3887 != -1L) {
                            class237 var56 = class337.field4789;
                            synchronized (class337.field4789) {
                                var50 = (class210) class337.field4789.method1625(this.field3887, 0);
                            }
                        }
                        if (var50 == null || arg2.method689(var50.method1410(), var14) != 0 || var51 != null && var51.field4298 != null && this.field3880 == null) {
                            return null;
                        }
                    } else {
                        class160[] var57 = new class160[12];
                        for (int var58 = 0; var58 < 12; var58++) {
                            int var59 = var17[var58];
                            if ((var59 & 0x40000000) != 0) {
                                class160 var60 = class50.method288(0, var59 & 0x3FFFFFFF).method1095(this.field3901, arg0 - 1);
                                if (var60 != null) {
                                    var57[var58] = var60;
                                }
                            } else if ((var59 & Integer.MIN_VALUE) != 0) {
                                class160 var61 = class305.method2006(-100, var59 & 0x3FFFFFFF).method1971((byte) -3);
                                if (var61 != null) {
                                    var57[var58] = var61;
                                }
                            }
                        }
                        if (var51 != null && var51.field4298 != null) {
                            for (int var62 = 0; var62 < var51.field4298.length; var62++) {
                                if (var51.field4298[var62] != null && var57[var62] != null) {
                                    int var63 = var51.field4298[var62][0];
                                    int var64 = var51.field4298[var62][1];
                                    int var65 = var51.field4298[var62][2];
                                    int var66 = var51.field4298[var62][3] << 3;
                                    int var67 = var51.field4298[var62][4] << 3;
                                    int var68 = var51.field4298[var62][5] << 3;
                                    if (this.field3880 == null) {
                                        this.field3880 = new int[var51.field4298.length][];
                                    }
                                    if (this.field3880[var62] == null) {
                                        int[] var69 = this.field3880[var62] = new int[15];
                                        if (var66 == 0 && var67 == 0 && var68 == 0) {
                                            var69[0] = var69[4] = var69[8] = 32768;
                                            var69[14] = -var65;
                                            var69[12] = -var63;
                                            var69[13] = -var64;
                                        } else {
                                            int var70 = class158.field2059[var66];
                                            int var71 = class158.field2055[var66];
                                            int var72 = class158.field2059[var67];
                                            int var73 = class158.field2055[var67];
                                            int var74 = class158.field2059[var68];
                                            int var75 = class158.field2055[var68];
                                            int var76 = var71 * var74 + 16384 >> 15;
                                            int var77 = var71 * var75 + 16384 >> 15;
                                            var69[3] = var70 * var75 + 16384 >> 15;
                                            var69[2] = var70 * var73 + 16384 >> 15;
                                            var69[8] = var70 * var72 + 16384 >> 15;
                                            var69[1] = -var75 * var72 + (var73 * var76 + 16384) >> 15;
                                            var69[7] = -var73 * -var75 + var72 * var76 + 16384 >> 15;
                                            var69[5] = -var71;
                                            var69[0] = var72 * var74 + var73 * var77 + 16384 >> 15;
                                            var69[6] = -var73 * var74 + var72 * var77 + 16384 >> 15;
                                            var69[4] = var70 * var74 + 16384 >> 15;
                                            var69[12] = var69[6] * -var65 + var69[3] * -var64 + var69[0] * -var63 + 16384 >> 15;
                                            var69[14] = var69[5] * -var64 + var69[8] * -var65 + var69[2] * -var63 + 16384 >> 15;
                                            var69[13] = var69[1] * -var63 + var69[4] * -var64 + var69[7] * -var65 + 16384 >> 15;
                                        }
                                        var69[9] = var63;
                                        var69[11] = var65;
                                        var69[10] = var64;
                                    }
                                    if (var66 != 0 || var67 != 0 || var68 != 0) {
                                        var57[var62].method1020(var66, var68, true, var67);
                                    }
                                    if (var63 != 0 || var64 != 0 || var65 != 0) {
                                        var57[var62].method1026(var65, var64, var63, true);
                                    }
                                }
                            }
                        }
                        int var78 = var14 | 0x2000;
                        class160 var79 = new class160(var57, var57.length);
                        var50 = arg2.method605(var79, var78, class399.field5701, 64, 850);
                        for (int var80 = 0; var80 < 5; var80++) {
                            if (class50.field601[var80].length > this.field3885[var80]) {
                                var50.method1392(class279.field3947[var80], class50.field601[var80][this.field3885[var80]]);
                            }
                            if (class202.field2904[var80].length > this.field3885[var80]) {
                                var50.method1392(class235.field3293[var80], class202.field2904[var80][this.field3885[var80]]);
                            }
                        }
                        if (arg6) {
                            var50.method1387(var14);
                            class237 var81 = class337.field4789;
                            synchronized (class337.field4789) {
                                class337.field4789.method1622((byte) 13, var50, var15);
                            }
                            this.field3887 = var15;
                        }
                    }
                    break;
                }
                int var55 = var17[var54];
                if ((var55 & 0x40000000) == 0) {
                    if ((var55 & Integer.MIN_VALUE) != 0 && !class305.method2006(-115, var55 & 0x3FFFFFFF).method1968(arg0 ^ 0x1)) {
                        var53 = true;
                    }
                } else if (!class50.method288(0, var55 & 0x3FFFFFFF).method1097(this.field3901, true)) {
                    var53 = true;
                }
                var54++;
            }
        }
        class210 var82 = var50.method1411((byte) 1, var14, true);
        if (!var21) {
            return var82;
        }
        int var83 = 0;
        int var84 = arg0;
        while (var83 < var22) {
            if (class168.field2345[var83] != null) {
                var82.method1397(class341.field4841[var83] - 1, var84, 0, false, 63, this.field3880 == null ? null : this.field3880[var83], class370.field5219[var83], class168.field2345[var83], class288.field4028[var83], class128.field1554[var83], class394.field5558[var83]);
            }
            var84 <<= 0x1;
            var83++;
        }
        if (var34 != null && var39 != null) {
            var82.method1391(var34, arg3 - 1, arg9 - 1, var40, var31, var37, var32, false, var35, true, arg5.field5911, var33, var39, var38, var36);
        } else if (var34 != null) {
            var82.method1384(var34, false, var35, arg3 - 1, 0, 0, var32, var31, var33);
        } else if (var39 != null) {
            var82.method1384(var39, false, var40, arg9 - 1, 0, 0, var37, var36, var38);
        }
        for (int var85 = 0; var85 < var22; var85++) {
            class168.field2345[var85] = null;
            class288.field4028[var85] = null;
            class119.field1461[var85] = null;
        }
        return var82;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V", line = 695)
    public static final void method1810(int arg0) {
        if (class247.field3530 && class441.field6334.method2208(false, 81) && class208.field2958 > 2) {
            class240.method1644(-122, (class302) class393.field5547.field1104.field5854.field5854);
        } else {
            class240.method1644(-119, (class302) class393.field5547.field1104.field5854);
        }
        field3903++;
        if (arg0 < 23) {
            field3881 = null;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(BII)V", line = 711)
    public final void method1811(byte arg0, int arg1, int arg2) {
        this.field3885[arg1] = arg2;
        if (arg0 != -108) {
            this.field3880 = null;
        }
        field3899++;
        this.method1818((byte) -124);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "([IBII[IZ)V", line = 723)
    public final void method1812(int[] arg0, byte arg1, int arg2, int arg3, int[] arg4, boolean arg5) {
        if (this.field3894 != arg2) {
            this.field3880 = null;
            this.field3894 = arg2;
        }
        field3889++;
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var7 = 0; var7 < 8; var7++) {
                for (int var8 = 0; var8 < class429.field6200; var8++) {
                    class298 var9 = class305.method2006(-114, var8);
                    if (var9 != null && !var9.field4167 && (arg5 ? class218.field3073[var7] : class126.field1537[var7]) == var9.field4176) {
                        arg0[class28.field345[var7]] = class429.method2704(var8, Integer.MIN_VALUE);
                        break;
                    }
                }
            }
        }
        this.field3888 = arg3;
        this.field3901 = arg5;
        this.field3885 = arg4;
        if (arg1 == -70) {
            this.field3884 = arg0;
            this.method1818((byte) -127);
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIB)V", line = 774)
    public final void method1813(int arg0, int arg1, byte arg2) {
        field3891++;
        int var4 = class28.field345[arg0];
        if (this.field3884[var4] != 0 && class305.method2006(-86, arg1) != null) {
            this.field3884[var4] = class429.method2704(arg1, Integer.MIN_VALUE);
            if (arg2 == -92) {
                this.method1818((byte) -119);
            }
        }
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(B)V", line = 802)
    public static void method1814(byte arg0) {
        field3881 = null;
        if (arg0 <= -112) {
            field3883 = null;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(BZ)V", line = 817)
    public final void method1815(byte arg0, boolean arg1) {
        if (arg0 < -45) {
            this.field3901 = arg1;
            field3882++;
            this.method1818((byte) -118);
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ZJ)V", line = 832)
    public static final void method1816(boolean arg0, long arg1) {
        if (!arg0) {
            field3881 = null;
        }
        field3902++;
        try {
            Thread.sleep(arg1);
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IILkb;ILae;IB)Lbk;", line = 846)
    public final class210 method1817(int arg0, int arg1, class412 arg2, int arg3, class134 arg4, int arg5, byte arg6) {
        field3900++;
        if (this.field3888 != -1) {
            return class403.method2568(this.field3888, (byte) -81).method834(arg0, arg2, true, arg4, arg1, arg3, arg5);
        }
        int var8 = arg3;
        if (arg2 != null) {
            boolean var9 = false;
            boolean var10 = false;
            boolean var11 = false;
            boolean var12 = true;
            boolean var13 = true;
            Object var14 = null;
            int var15 = arg2.field5925[arg5];
            Object var16 = null;
            var8 = arg3 | 0x20;
            int var17 = var15 >>> 16;
            class64 var18 = class229.method1526(var17, -16026);
            int var19 = var15 & 0xFFFF;
            if (var18 != null) {
                var10 |= var18.method362((byte) -85, var19);
                var9 |= var18.method366(255, var19);
                var11 |= arg2.field5926;
            }
            if ((arg2.field5935 || class404.field5818) && arg0 != -1 && arg2.field5925.length > arg0) {
                int var20 = arg2.field5925[arg0];
                int var21 = var20 >>> 16;
                class64 var22 = var17 == var21 ? var18 : class229.method1526(var21, -16026);
                int var23 = var20 & 0xFFFF;
                if (var22 != null) {
                    var10 |= var22.method362((byte) -85, var23);
                    var9 |= var22.method366(255, var23);
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
        class237 var24 = class420.field6007;
        class210 var25;
        synchronized (class420.field6007) {
            var25 = (class210) class420.field6007.method1625(this.field3896, 0);
            int var26 = -77 % ((arg6 + 64) / 39);
        }
        if (var25 == null || arg4.method689(var25.method1410(), var8) != 0) {
            if (var25 != null) {
                var8 = arg4.method625(var8, var25.method1410());
            }
            boolean var28 = false;
            for (int var29 = 0; var29 < 12; var29++) {
                int var30 = this.field3884[var29];
                if ((var30 & 0x40000000) == 0) {
                    if ((var30 & Integer.MIN_VALUE) != 0 && !class305.method2006(-70, var30 & 0x3FFFFFFF).method1973(-1)) {
                        var28 = true;
                    }
                } else if (!class50.method288(0, var30 & 0x3FFFFFFF).method1090(this.field3901, (byte) -92)) {
                    var28 = true;
                }
            }
            if (var28) {
                return null;
            }
            class160[] var31 = new class160[12];
            int var32 = 0;
            for (int var33 = 0; var33 < 12; var33++) {
                int var34 = this.field3884[var33];
                if ((var34 & 0x40000000) != 0) {
                    class160 var36 = class50.method288(0, var34 & 0x3FFFFFFF).method1089(-94, this.field3901);
                    if (var36 != null) {
                        var31[var32++] = var36;
                    }
                } else if ((Integer.MIN_VALUE & var34) != 0) {
                    class160 var35 = class305.method2006(-106, var34 & 0x3FFFFFFF).method1969((byte) -12);
                    if (var35 != null) {
                        var31[var32++] = var35;
                    }
                }
            }
            class160 var37 = new class160(var31, var32);
            int var38 = var8 | 0x2000;
            var25 = arg4.method605(var37, var38, class399.field5701, 64, 768);
            for (int var39 = 0; var39 < 5; var39++) {
                if (this.field3885[var39] < class50.field601[var39].length) {
                    var25.method1392(class279.field3947[var39], class50.field601[var39][this.field3885[var39]]);
                }
                if (class202.field2904[var39].length > this.field3885[var39]) {
                    var25.method1392(class235.field3293[var39], class202.field2904[var39][this.field3885[var39]]);
                }
            }
            var25.method1387(var8);
            class237 var40 = class420.field6007;
            synchronized (class420.field6007) {
                class420.field6007.method1622((byte) 13, var25, this.field3896);
            }
        }
        if (arg2 == null) {
            return var25;
        } else {
            var25.method1411((byte) 1, var8, true);
            return arg2.method2627(-101, arg5, arg3, arg0, var25, arg1);
        }
    }

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "(B)V", line = 1040)
    private final void method1818(byte arg0) {
        if (arg0 >= -115) {
            this.method1817(-87, 82, (class412) null, -71, (class134) null, 127, (byte) 26);
        }
        field3892++;
        this.field3896 = -1L;
        long[] var2 = class399.field5711;
        this.field3896 = this.field3896 >>> 8 ^ var2[(int) ((this.field3896 ^ (long) (this.field3894 >> 8)) & 0xFFL)];
        this.field3896 = var2[(int) ((this.field3896 ^ (long) this.field3894) & 0xFFL)] ^ this.field3896 >>> 8;
        for (int var3 = 0; var3 < 12; var3++) {
            this.field3896 = var2[(int) ((this.field3896 ^ (long) (this.field3884[var3] >> 24)) & 0xFFL)] ^ this.field3896 >>> 8;
            this.field3896 = var2[(int) (((long) (this.field3884[var3] >> 16) ^ this.field3896) & 0xFFL)] ^ this.field3896 >>> 8;
            this.field3896 = var2[(int) (((long) (this.field3884[var3] >> 8) ^ this.field3896) & 0xFFL)] ^ this.field3896 >>> 8;
            this.field3896 = var2[(int) ((this.field3896 ^ (long) this.field3884[var3]) & 0xFFL)] ^ this.field3896 >>> 8;
        }
        for (int var4 = 0; var4 < 5; var4++) {
            this.field3896 = this.field3896 >>> 8 ^ var2[(int) (((long) this.field3885[var4] ^ this.field3896) & 0xFFL)];
        }
        this.field3896 = var2[(int) ((this.field3896 ^ (long) (this.field3901 ? 1 : 0)) & 0xFFL)] ^ this.field3896 >>> 8;
    }
}
