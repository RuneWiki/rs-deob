import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class17 {

    @OriginalMember(owner = "client!n", name = "p", descriptor = "I")
    public int field257 = -1;

    @OriginalMember(owner = "client!n", name = "c", descriptor = "I")
    public static int field244 = 0;

    @OriginalMember(owner = "client!n", name = "f", descriptor = "I")
    public static int field247 = 0;

    @OriginalMember(owner = "client!n", name = "j", descriptor = "I")
    public static int field251 = -1;

    @OriginalMember(owner = "client!n", name = "u", descriptor = "I")
    public static int field262 = -2;

    @OriginalMember(owner = "client!n", name = "b", descriptor = "I")
    public static int field243;

    @OriginalMember(owner = "client!n", name = "d", descriptor = "I")
    public static int field245;

    @OriginalMember(owner = "client!n", name = "e", descriptor = "I")
    public static int field246;

    @OriginalMember(owner = "client!n", name = "h", descriptor = "I")
    public static int field249;

    @OriginalMember(owner = "client!n", name = "i", descriptor = "I")
    public static int field250;

    @OriginalMember(owner = "client!n", name = "k", descriptor = "I")
    private int field252;

    @OriginalMember(owner = "client!n", name = "m", descriptor = "I")
    public static int field254;

    @OriginalMember(owner = "client!n", name = "n", descriptor = "I")
    public static int field255;

    @OriginalMember(owner = "client!n", name = "o", descriptor = "I")
    public static int field256;

    @OriginalMember(owner = "client!n", name = "q", descriptor = "I")
    public static int field258;

    @OriginalMember(owner = "client!n", name = "s", descriptor = "I")
    public static int field260;

    @OriginalMember(owner = "client!n", name = "v", descriptor = "I")
    public static int field263;

    @OriginalMember(owner = "client!n", name = "g", descriptor = "J")
    private long field248;

    @OriginalMember(owner = "client!n", name = "t", descriptor = "J")
    private long field261;

    @OriginalMember(owner = "client!n", name = "l", descriptor = "Z")
    public boolean field253;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "[I")
    private int[] field242;

    @OriginalMember(owner = "client!n", name = "r", descriptor = "[I")
    public int[] field259;

    @OriginalMember(owner = "client!n", name = "w", descriptor = "[[I")
    private int[][] field264;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Loa;Lur;IIILct;Lpb;Lct;ILpe;II[Lid;Loba;IBLai;ZLqh;)Lba;")
    public final class352 method84(class638 arg0, class493 arg1, int arg2, int arg3, int arg4, class131 arg5, class600 arg6, class131 arg7, int arg8, class558 arg9, int arg10, int arg11, class535[] arg12, class237 arg13, int arg14, byte arg15, class549 arg16, boolean arg17, class61 arg18) {
        field246++;
        if (this.field257 != -1) {
            return arg13.method1493(this.field257, (byte) -71).method1113(arg1, arg15 + 8188, arg7, arg8, arg0, arg5, arg12, arg11, arg4, arg10, arg3, arg2, arg18, arg16, arg14);
        }
        int var20 = arg10;
        long var21 = this.field248;
        int[] var23 = this.field242;
        if (arg7 != null && (arg7.field1811 >= 0 || arg7.field1815 >= 0)) {
            var23 = new int[12];
            for (int var24 = 0; var24 < 12; var24++) {
                var23[var24] = this.field242[var24];
            }
            if (arg7.field1811 >= 0) {
                if (arg7.field1811 == 65535) {
                    var21 ^= 0xFFFFFFFF00000000L;
                    var23[5] = 0;
                } else {
                    var23[5] = class266.method1624(1073741824, arg7.field1811);
                    var21 ^= (long) var23[5] << 32;
                }
            }
            if (arg7.field1815 >= 0) {
                if (arg7.field1815 == 65535) {
                    var21 ^= 0xFFFFFFFFL;
                    var23[3] = 0;
                } else {
                    var23[3] = class266.method1624(1073741824, arg7.field1815);
                    var21 ^= var23[3];
                }
            }
        }
        boolean var25 = false;
        boolean var26 = false;
        boolean var27 = false;
        boolean var28 = arg7 != null || arg5 != null;
        int var29 = arg12 == null ? 0 : arg12.length;
        for (int var30 = 0; var30 < var29; var30++) {
            class212.field3106[var30] = null;
            if (arg12[var30] != null) {
                class131 var31 = arg1.method2763(arg12[var30].field7288, 31696);
                if (var31.field1806 != null) {
                    var28 = true;
                    class437.field6171[var30] = var31;
                    int var32 = arg12[var30].field7287;
                    int var33 = arg12[var30].field7278;
                    int var34 = var31.field1806[var32];
                    class212.field3106[var30] = arg1.method2757(64, var34 >>> 16);
                    int var35 = var34 & 0xFFFF;
                    class354.field5077[var30] = var35;
                    if (class212.field3106[var30] != null) {
                        var26 |= class212.field3106[var30].method3303(true, var35);
                        var25 |= class212.field3106[var30].method3302(var35, false);
                        var27 |= class212.field3106[var30].method3304(57, var35);
                    }
                    if ((var31.field1788 || class492.field6791) && var33 != -1 && var31.field1806.length > var33) {
                        class638.field9063[var30] = var31.field1810[var32];
                        class144.field2143[var30] = arg12[var30].field7284;
                        int var36 = var31.field1806[var33];
                        class352.field5059[var30] = arg1.method2757(64, var36 >>> 16);
                        int var37 = var36 & 0xFFFF;
                        class449.field6277[var30] = var37;
                        if (class352.field5059[var30] != null) {
                            var26 |= class352.field5059[var30].method3303(true, var37);
                            var25 |= class352.field5059[var30].method3302(var37, false);
                            var27 |= class352.field5059[var30].method3304(25, var37);
                        }
                    } else {
                        class638.field9063[var30] = 0;
                        class144.field2143[var30] = 0;
                        class352.field5059[var30] = null;
                        class449.field6277[var30] = -1;
                    }
                }
            }
        }
        int var38 = -1;
        int var39 = -1;
        int var40 = 0;
        class597 var41 = null;
        class597 var42 = null;
        int var43 = -1;
        int var44 = -1;
        int var45 = 0;
        class597 var46 = null;
        class597 var47 = null;
        if (var28) {
            if (arg7 != null) {
                int var48 = arg7.field1806[arg2];
                int var49 = var48 >>> 16;
                var41 = arg1.method2757(64, var49);
                var38 = var48 & 0xFFFF;
                if (var41 != null) {
                    var26 |= var41.method3303(true, var38);
                    var25 |= var41.method3302(var38, false);
                    var27 |= var41.method3304(arg15 ^ 0x6F, var38);
                }
                if ((arg7.field1788 || class492.field6791) && arg8 != -1 && arg7.field1806.length > arg8) {
                    var40 = arg7.field1810[arg2];
                    int var50 = arg7.field1806[arg8];
                    int var51 = var50 >>> 16;
                    var39 = var50 & 0xFFFF;
                    var42 = var49 == var51 ? var41 : arg1.method2757(arg15 + 60, var51);
                    if (var42 != null) {
                        var26 |= var42.method3303(true, var39);
                        var25 |= var42.method3302(var39, false);
                        var27 |= var42.method3304(-109, var39);
                    }
                }
            }
            var20 = arg10 | 0x20;
            if (arg5 != null) {
                int var52 = arg5.field1806[arg3];
                int var53 = var52 >>> 16;
                var46 = arg1.method2757(64, var53);
                var43 = var52 & 0xFFFF;
                if (var46 != null) {
                    var26 |= var46.method3303(true, var43);
                    var25 |= var46.method3302(var43, false);
                    var27 |= var46.method3304(-88, var43);
                }
                if ((arg5.field1788 || class492.field6791) && arg11 != -1 && arg5.field1806.length > arg11) {
                    var45 = arg5.field1810[arg3];
                    int var54 = arg5.field1806[arg11];
                    int var55 = var54 >>> 16;
                    var44 = var54 & 0xFFFF;
                    var47 = var53 == var55 ? var46 : arg1.method2757(64, var55);
                    if (var47 != null) {
                        var26 |= var47.method3303(true, var44);
                        var25 |= var47.method3302(var44, false);
                        var27 |= var47.method3304(-104, var44);
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
        class328 var56 = class44.field661;
        class352 var57;
        synchronized (class44.field661) {
            var57 = (class352) class44.field661.method1986((byte) -103, var21);
        }
        class308 var58 = null;
        if (this.field252 != -1) {
            var58 = arg16.method3018(this.field252, 32);
        }
        if (var57 == null || arg0.method431(var57.method189(), var20) != 0 || var58 != null && var58.field4585 != null && this.field264 == null) {
            if (var57 != null) {
                var20 = arg0.method444(var20, var57.method189());
            }
            boolean var60 = false;
            int var61 = 0;
            while (true) {
                if (var61 >= 12) {
                    if (var60) {
                        if (this.field261 != -1L) {
                            class328 var63 = class44.field661;
                            synchronized (class44.field661) {
                                var57 = (class352) class44.field661.method1986((byte) -97, this.field261);
                            }
                        }
                        if (var57 == null || arg0.method431(var57.method189(), var20) != 0 || var58 != null && var58.field4585 != null && this.field264 == null) {
                            return null;
                        }
                    } else {
                        class661[] var64 = new class661[12];
                        for (int var65 = 0; var65 < 12; var65++) {
                            int var66 = var23[var65];
                            if ((var66 & 0x40000000) != 0) {
                                class661 var68 = arg9.method3064(var66 & 0x3FFFFFFF, arg15 - 108).method1573((byte) -127, this.field253);
                                if (var68 != null) {
                                    var64[var65] = var68;
                                }
                            } else if ((Integer.MIN_VALUE & var66) != 0) {
                                class661 var67 = arg6.method3324((byte) -87, var66 & 0x3FFFFFFF).method1154(12759);
                                if (var67 != null) {
                                    var64[var65] = var67;
                                }
                            }
                        }
                        if (var58 != null && var58.field4585 != null) {
                            for (int var69 = 0; var69 < var58.field4585.length; var69++) {
                                if (var58.field4585[var69] != null && var64[var69] != null) {
                                    int var70 = var58.field4585[var69][0];
                                    int var71 = var58.field4585[var69][1];
                                    int var72 = var58.field4585[var69][2];
                                    int var73 = var58.field4585[var69][3] << 3;
                                    int var74 = var58.field4585[var69][4] << 3;
                                    int var75 = var58.field4585[var69][5] << 3;
                                    if (this.field264 == null) {
                                        this.field264 = new int[var58.field4585.length][];
                                    }
                                    if (this.field264[var69] == null) {
                                        int[] var76 = this.field264[var69] = new int[15];
                                        if (var73 == 0 && var74 == 0 && var75 == 0) {
                                            var76[13] = -var71;
                                            var76[12] = -var70;
                                            var76[14] = -var72;
                                            var76[0] = var76[4] = var76[8] = 32768;
                                        } else {
                                            int var77 = class675.field9541[var73];
                                            int var78 = class675.field9542[var73];
                                            int var79 = class675.field9541[var74];
                                            int var80 = class675.field9542[var74];
                                            int var81 = class675.field9541[var75];
                                            int var82 = class675.field9542[var75];
                                            int var83 = var78 * var81 + 8192 >> 14;
                                            int var84 = var78 * var82 + 8192 >> 14;
                                            var76[6] = -var80 * var81 + var79 * var84 + 8192 >> 14;
                                            var76[4] = var77 * var81 + 8192 >> 14;
                                            var76[0] = var79 * var81 + var80 * var84 + 8192 >> 14;
                                            var76[8] = var77 * var79 + 8192 >> 14;
                                            var76[7] = -var80 * -var82 + var79 * var83 + 8192 >> 14;
                                            var76[5] = -var78;
                                            var76[3] = var77 * var82 + 8192 >> 14;
                                            var76[1] = var80 * var83 + -var82 * var79 + 8192 >> 14;
                                            var76[2] = var77 * var80 + 8192 >> 14;
                                            var76[12] = var76[6] * -var72 + var76[3] * -var71 + var76[0] * -var70 + 8192 >> 14;
                                            var76[13] = var76[4] * -var71 + var76[7] * -var72 + var76[1] * -var70 + 8192 >> 14;
                                            var76[14] = var76[2] * -var70 + (var76[5] * -var71) + (var76[8] * -var72) + 8192 >> 14;
                                        }
                                        var76[10] = var71;
                                        var76[9] = var70;
                                        var76[11] = var72;
                                    }
                                    if (var73 != 0 || var74 != 0 || var75 != 0) {
                                        var64[var69].method3663((byte) -128, var74, var75, var73);
                                    }
                                    if (var70 != 0 || var71 != 0 || var72 != 0) {
                                        var64[var69].method3662((byte) 58, var71, var72, var70);
                                    }
                                }
                            }
                        }
                        class661 var85 = new class661(var64, var64.length);
                        int var86 = var20 | 0x4000;
                        var57 = arg0.method379(var85, var86, class364.field5203, 64, 850);
                        for (int var87 = 0; var87 < 5; var87++) {
                            if (class471.field6577[var87].length > this.field259[var87]) {
                                var57.method213(class459.field6500[var87], class471.field6577[var87][this.field259[var87]]);
                            }
                            if (class227.field3262[var87].length > this.field259[var87]) {
                                var57.method213(class531.field7241[var87], class227.field3262[var87][this.field259[var87]]);
                            }
                        }
                        if (arg17) {
                            var57.method216(var20);
                            class328 var88 = class44.field661;
                            synchronized (class44.field661) {
                                class44.field661.method1985(var57, var21, (byte) -102);
                            }
                            this.field261 = var21;
                        }
                    }
                    break;
                }
                int var62 = var23[var61];
                if ((var62 & 0x40000000) == 0) {
                    if ((var62 & Integer.MIN_VALUE) != 0 && !arg6.method3324((byte) -47, var62 & 0x3FFFFFFF).method1149((byte) -96)) {
                        var60 = true;
                    }
                } else if (!arg9.method3064(var62 & 0x3FFFFFFF, -42).method1582((byte) -114, this.field253)) {
                    var60 = true;
                }
                var61++;
            }
        }
        class352 var89 = var57.method235(arg15, var20, true);
        if (!var28) {
            return var89;
        }
        int var90 = 0;
        int var91 = 1;
        while (var29 > var90) {
            if (class212.field3106[var90] != null) {
                var89.method2085(class354.field5077[var90], class352.field5059[var90], class449.field6277[var90], class144.field2143[var90] - 1, (byte) 122, false, 0, var91, class638.field9063[var90], class212.field3106[var90], this.field264 == null ? null : this.field264[var90]);
            }
            var90++;
            var91 <<= 0x1;
        }
        if (var41 != null && var46 != null) {
            var89.method2086(var42, var43, var38, arg4 - 1, var46, var39, arg7.field1812, var45, false, var41, var47, var44, false, var40, arg14 - 1);
        } else if (var41 != null) {
            var89.method2090(arg4 - 1, var38, false, var39, 0, var42, var40, 16383, var41);
        } else if (var46 != null) {
            var89.method2090(arg14 - 1, var43, false, var44, 0, var47, var45, arg15 ^ 0x3FFB, var46);
        }
        for (int var92 = 0; var92 < var29; var92++) {
            class212.field3106[var92] = null;
            class352.field5059[var92] = null;
            class437.field6171[var92] = null;
        }
        return var89;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V")
    private final void method85(int arg0) {
        field263++;
        long[] var2 = class667.field9397;
        this.field248 = -1L;
        this.field248 = this.field248 >>> 8 ^ var2[(int) (((long) (this.field252 >> 8) ^ this.field248) & 0xFFL)];
        this.field248 = this.field248 >>> 8 ^ var2[(int) (((long) this.field252 ^ this.field248) & 0xFFL)];
        if (arg0 != 1584359880) {
            this.method86((byte) 3, true);
        }
        for (int var3 = 0; var3 < 12; var3++) {
            this.field248 = var2[(int) ((this.field248 ^ (long) (this.field242[var3] >> 24)) & 0xFFL)] ^ this.field248 >>> 8;
            this.field248 = var2[(int) ((this.field248 ^ (long) (this.field242[var3] >> 16)) & 0xFFL)] ^ this.field248 >>> 8;
            this.field248 = this.field248 >>> 8 ^ var2[(int) ((this.field248 ^ (long) (this.field242[var3] >> 8)) & 0xFFL)];
            this.field248 = this.field248 >>> 8 ^ var2[(int) ((this.field248 ^ (long) this.field242[var3]) & 0xFFL)];
        }
        for (int var4 = 0; var4 < 5; var4++) {
            this.field248 = this.field248 >>> 8 ^ var2[(int) ((this.field248 ^ (long) this.field259[var4]) & 0xFFL)];
        }
        this.field248 = var2[(int) (((long) (this.field253 ? 1 : 0) ^ this.field248) & 0xFFL)] ^ this.field248 >>> 8;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(BZ)V")
    public final void method86(byte arg0, boolean arg1) {
        if (arg0 < 113) {
            this.method87(-91, -56, null, null, 124, null, (byte) 51, null, 103, -63, 66, -55);
        }
        this.field253 = arg1;
        field260++;
        this.method85(1584359880);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IILct;Lpb;ILoa;BLur;IIII)Lba;")
    public final class352 method87(int arg0, int arg1, class131 arg2, class600 arg3, int arg4, class638 arg5, byte arg6, class493 arg7, int arg8, int arg9, int arg10, int arg11) {
        field254++;
        int var13 = arg0;
        int var14 = 9 / ((arg6 - 31) / 32);
        if (arg2 != null) {
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = false;
            boolean var19 = true;
            boolean var20 = true;
            Object var21 = null;
            int var22 = arg2.field1806[arg4];
            Object var23 = null;
            var13 = arg0 | 0x20;
            int var24 = var22 >>> 16;
            int var25 = var22 & 0xFFFF;
            class597 var26 = arg7.method2757(64, var24);
            if (var26 != null) {
                var16 |= var26.method3303(true, var25);
                var15 |= var26.method3302(var25, false);
                var18 |= var26.method3304(71, var25);
                var17 |= arg2.field1792;
            }
            if ((arg2.field1788 || class492.field6791) && arg11 != -1 && arg2.field1806.length > arg11) {
                int var27 = arg2.field1806[arg11];
                int var28 = var27 >>> 16;
                int var29 = var27 & 0xFFFF;
                class597 var30;
                if (var24 == var28) {
                    var30 = var26;
                } else {
                    var30 = arg7.method2757(64, var29 >>> 16);
                }
                if (var30 != null) {
                    var16 |= var30.method3303(true, var29);
                    var15 |= var30.method3302(var29, false);
                    var18 |= var30.method3304(70, var29);
                }
            }
            if (var16) {
                var13 |= 0x80;
            }
            if (var15) {
                var13 |= 0x100;
            }
            if (var17) {
                var13 |= 0x200;
            }
            if (var18) {
                var13 |= 0x400;
            }
        }
        long var31 = (long) arg10 << 32 | (long) (arg8 << 16) | (long) arg1;
        class328 var33 = class533.field7259;
        class352 var34;
        synchronized (class533.field7259) {
            var34 = (class352) class533.field7259.method1986((byte) -121, var31);
        }
        if (var34 == null || arg5.method431(var34.method189(), var13) != 0) {
            if (var34 != null) {
                var13 = arg5.method444(var13, var34.method189());
            }
            class661[] var36 = new class661[3];
            int var37 = 0;
            if (!arg3.method3324((byte) -120, arg1).method1152((byte) 43) || !arg3.method3324((byte) -84, arg8).method1152((byte) -122) || !arg3.method3324((byte) -55, arg10).method1152((byte) -124)) {
                return null;
            }
            class661 var38 = arg3.method3324((byte) -91, arg1).method1156((byte) 118);
            if (var38 != null) {
                var36[var37++] = var38;
            }
            class661 var39 = arg3.method3324((byte) -93, arg8).method1156((byte) 103);
            if (var39 != null) {
                var36[var37++] = var39;
            }
            class661 var40 = arg3.method3324((byte) -125, arg10).method1156((byte) 121);
            if (var40 != null) {
                var36[var37++] = var40;
            }
            class661 var41 = new class661(var36, var37);
            int var42 = var13 | 0x4000;
            var34 = arg5.method379(var41, var42, class364.field5203, 64, 768);
            for (int var43 = 0; var43 < 5; var43++) {
                if (class471.field6577[var43].length > this.field259[var43]) {
                    var34.method213(class459.field6500[var43], class471.field6577[var43][this.field259[var43]]);
                }
                if (this.field259[var43] < class227.field3262[var43].length) {
                    var34.method213(class531.field7241[var43], class227.field3262[var43][this.field259[var43]]);
                }
            }
            var34.method216(var13);
            class328 var44 = class533.field7259;
            synchronized (class533.field7259) {
                class533.field7259.method1985(var34, var31, (byte) -102);
            }
        }
        if (arg2 == null) {
            return var34;
        } else {
            class352 var45 = var34.method235((byte) 4, var13, true);
            return arg2.method909(arg0, arg9, var45, arg11, -2221, arg4);
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IZI)V")
    public final void method88(int arg0, boolean arg1, int arg2) {
        this.field259[arg2] = arg0;
        field258++;
        this.method85(1584359880);
        if (arg1) {
            this.field264 = null;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(II)Z")
    public static final boolean method89(int arg0, int arg1) {
        field250++;
        if (arg1 != 508337774) {
            method89(-39, -83);
        }
        return (-arg0 & arg0) == arg0;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(BIILpb;)V")
    public final void method90(byte arg0, int arg1, int arg2, class600 arg3) {
        field245++;
        int var5 = class136.field1927[arg1];
        if (arg0 > 97 && this.field242[var5] != 0 && arg3.method3324((byte) -124, arg2) != null) {
            this.field242[var5] = class266.method1624(arg2, Integer.MIN_VALUE);
            this.method85(1584359880);
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(ZII[B)[B")
    public static final byte[] method91(boolean arg0, int arg1, int arg2, byte[] arg3) {
        if (arg0) {
            field256 = -36;
        }
        field249++;
        byte[] var4 = new byte[arg2];
        class282.method1706(arg3, arg1, var4, 0, arg2);
        return var4;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lqh;IILoa;Lur;IILpe;ILoba;Lct;Lpb;)Lba;")
    public final class352 method92(class61 arg0, int arg1, int arg2, class638 arg3, class493 arg4, int arg5, int arg6, class558 arg7, int arg8, class237 arg9, class131 arg10, class600 arg11) {
        field255++;
        if (arg6 != 8224) {
            this.field253 = true;
        }
        if (this.field257 != -1) {
            return arg9.method1493(this.field257, (byte) -71).method1121(arg4, arg10, (byte) 124, arg2, arg3, arg5, arg8, arg1, arg0);
        }
        int var13 = arg8;
        if (arg10 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            int var21 = arg10.field1806[arg1];
            var13 = arg8 | 0x20;
            Object var22 = null;
            int var23 = var21 >>> 16;
            int var24 = var21 & 0xFFFF;
            class597 var25 = arg4.method2757(64, var23);
            if (var25 != null) {
                var15 |= var25.method3303(true, var24);
                var14 |= var25.method3302(var24, false);
                var17 |= var25.method3304(arg6 ^ 0xFFFFDF82, var24);
                var16 |= arg10.field1792;
            }
            if ((arg10.field1788 || class492.field6791) && arg5 != -1 && arg10.field1806.length > arg5) {
                int var26 = arg10.field1806[arg5];
                int var27 = var26 >>> 16;
                class597 var28 = var23 == var27 ? var25 : arg4.method2757(arg6 - 8160, var27);
                int var29 = var26 & 0xFFFF;
                if (var28 != null) {
                    var15 |= var28.method3303(true, var29);
                    var14 |= var28.method3302(var29, false);
                    var17 |= var28.method3304(-93, var29);
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
        class328 var30 = class533.field7259;
        class352 var31;
        synchronized (class533.field7259) {
            var31 = (class352) class533.field7259.method1986((byte) -125, this.field248);
        }
        if (var31 == null || arg3.method431(var31.method189(), var13) != 0) {
            if (var31 != null) {
                var13 = arg3.method444(var13, var31.method189());
            }
            boolean var33 = false;
            for (int var34 = 0; var34 < 12; var34++) {
                int var35 = this.field242[var34];
                if ((var35 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var35) != 0 && !arg11.method3324((byte) -94, var35 & 0x3FFFFFFF).method1152((byte) -127)) {
                        var33 = true;
                    }
                } else if (!arg7.method3064(var35 & 0x3FFFFFFF, -126).method1581(-126, this.field253)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class661[] var36 = new class661[12];
            int var37 = 0;
            for (int var38 = 0; var38 < 12; var38++) {
                int var39 = this.field242[var38];
                if ((var39 & 0x40000000) != 0) {
                    class661 var40 = arg7.method3064(var39 & 0x3FFFFFFF, -72).method1587(this.field253, 28895);
                    if (var40 != null) {
                        var36[var37++] = var40;
                    }
                } else if ((var39 & Integer.MIN_VALUE) != 0) {
                    class661 var41 = arg11.method3324((byte) -127, var39 & 0x3FFFFFFF).method1156((byte) 120);
                    if (var41 != null) {
                        var36[var37++] = var41;
                    }
                }
            }
            int var42 = var13 | 0x4000;
            class661 var43 = new class661(var36, var37);
            var31 = arg3.method379(var43, var42, class364.field5203, 64, 768);
            for (int var44 = 0; var44 < 5; var44++) {
                if (this.field259[var44] < class471.field6577[var44].length) {
                    var31.method213(class459.field6500[var44], class471.field6577[var44][this.field259[var44]]);
                }
                if (this.field259[var44] < class227.field3262[var44].length) {
                    var31.method213(class531.field7241[var44], class227.field3262[var44][this.field259[var44]]);
                }
            }
            var31.method216(var13);
            class328 var45 = class533.field7259;
            synchronized (class533.field7259) {
                class533.field7259.method1985(var31, this.field248, (byte) -102);
            }
        }
        if (arg10 == null) {
            return var31;
        } else {
            var31.method235((byte) 4, var13, true);
            return arg10.method909(arg8, arg2, var31, arg5, arg6 ^ 0xFFFFD773, arg1);
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(I[I[IZII)V")
    public final void method93(int arg0, int[] arg1, int[] arg2, boolean arg3, int arg4, int arg5) {
        this.field242 = arg1;
        this.field257 = arg4;
        int var7 = 106 / ((arg5 - 18) / 45);
        field243++;
        if (this.field252 != arg0) {
            this.field264 = null;
            this.field252 = arg0;
        }
        this.field253 = arg3;
        this.field259 = arg2;
        this.method85(1584359880);
    }
}
