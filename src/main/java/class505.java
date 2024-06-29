import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kga")
public class class505 {

    @OriginalMember(owner = "client!kga", name = "l", descriptor = "I")
    public int field7141 = -1;

    @OriginalMember(owner = "client!kga", name = "n", descriptor = "I")
    public static int field7143 = 0;

    @OriginalMember(owner = "client!kga", name = "m", descriptor = "I")
    public static int field7142 = 2;

    @OriginalMember(owner = "client!kga", name = "x", descriptor = "I")
    public static int field7153 = 0;

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "I")
    public static int field7130;

    @OriginalMember(owner = "client!kga", name = "b", descriptor = "I")
    public static int field7131;

    @OriginalMember(owner = "client!kga", name = "c", descriptor = "I")
    public static int field7132;

    @OriginalMember(owner = "client!kga", name = "g", descriptor = "I")
    public static int field7136;

    @OriginalMember(owner = "client!kga", name = "j", descriptor = "I")
    public static int field7139;

    @OriginalMember(owner = "client!kga", name = "k", descriptor = "I")
    private int field7140;

    @OriginalMember(owner = "client!kga", name = "p", descriptor = "I")
    public static int field7145;

    @OriginalMember(owner = "client!kga", name = "q", descriptor = "I")
    public static int field7146;

    @OriginalMember(owner = "client!kga", name = "r", descriptor = "I")
    public static int field7147;

    @OriginalMember(owner = "client!kga", name = "s", descriptor = "I")
    public static int field7148;

    @OriginalMember(owner = "client!kga", name = "t", descriptor = "I")
    public static int field7149;

    @OriginalMember(owner = "client!kga", name = "v", descriptor = "I")
    public static int field7151;

    @OriginalMember(owner = "client!kga", name = "w", descriptor = "I")
    public static int field7152;

    @OriginalMember(owner = "client!kga", name = "i", descriptor = "J")
    private long field7138;

    @OriginalMember(owner = "client!kga", name = "o", descriptor = "J")
    private long field7144;

    @OriginalMember(owner = "client!kga", name = "u", descriptor = "Z")
    public boolean field7150;

    @OriginalMember(owner = "client!kga", name = "f", descriptor = "[I")
    public int[] field7135;

    @OriginalMember(owner = "client!kga", name = "h", descriptor = "[I")
    private int[] field7137;

    @OriginalMember(owner = "client!kga", name = "d", descriptor = "[[B")
    public static byte[][] field7133;

    @OriginalMember(owner = "client!kga", name = "e", descriptor = "[[I")
    private int[][] field7134;

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(Lpu;I)V", line = 4)
    public static final void method2900(class522 arg0, int arg1) {
        class46.field721 = arg0;
        if (arg1 == 280013408) {
            field7148++;
        }
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(III)V", line = 17)
    public final void method2901(int arg0, int arg1, int arg2) {
        field7147++;
        this.field7135[arg0] = arg1;
        this.method2906((byte) -99);
        if (arg2 <= 66) {
            this.method2911(-33, -14, null, -124);
        }
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(ZC)I", line = 35)
    public static final int method2902(boolean arg0, char arg1) {
        field7132++;
        if (arg0) {
            method2902(false, (char) 65413);
        }
        return arg1 >= '\u0000' && class127.field1893.length > arg1 ? class127.field1893[arg1] : -1;
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(II[IZ[II)V", line = 60)
    public final void method2903(int arg0, int arg1, int[] arg2, boolean arg3, int[] arg4, int arg5) {
        field7130++;
        this.field7141 = arg5;
        this.field7137 = arg4;
        if (arg1 > -15) {
            this.method2908(-28, 36, (byte) -126, -41, 30, null, null, -58, null, null, -42, -99);
        }
        this.field7135 = arg2;
        this.field7150 = arg3;
        if (this.field7140 != arg0) {
            this.field7134 = null;
            this.field7140 = arg0;
        }
        this.method2906((byte) -125);
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(Lga;ILqj;ILud;ILrk;Ldh;IILr;Lln;)Lda;", line = 83)
    public final class55 method2904(class367 arg0, int arg1, class470 arg2, int arg3, class33 arg4, int arg5, class30 arg6, class290 arg7, int arg8, int arg9, class166 arg10, class344 arg11) {
        field7149++;
        if (this.field7141 != -1) {
            return arg4.method362(this.field7141, (byte) 90).method3358(arg11, arg9, arg10, arg3, arg2, arg5, arg6, arg8, (byte) -128);
        }
        if (arg1 != 256) {
            field7143 = -51;
        }
        int var13 = arg8;
        if (arg6 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            var13 = arg8 | 0x20;
            Object var21 = null;
            int var22 = arg6.field456[arg5];
            int var23 = var22 >>> 16;
            int var24 = var22 & 0xFFFF;
            class98 var25 = arg11.method2135(-91, var23);
            if (var25 != null) {
                var15 |= var25.method800(25595, var24);
                var14 |= var25.method798(var24, (byte) 3);
                var17 |= var25.method805(true, var24);
                var16 |= arg6.field468;
            }
            if ((arg6.field452 || class498.field7060) && arg9 != -1 && arg9 < arg6.field456.length) {
                int var26 = arg6.field456[arg9];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class98 var29 = var23 == var27 ? var25 : arg11.method2135(-105, var27);
                if (var29 != null) {
                    var15 |= var29.method800(arg1 ^ 0x62FB, var28);
                    var14 |= var29.method798(var28, (byte) 3);
                    var17 |= var29.method805(true, var28);
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
        class382 var30 = class622.field8668;
        class55 var31;
        synchronized (class622.field8668) {
            var31 = (class55) class622.field8668.method2287(1, this.field7144);
        }
        if (var31 == null || arg10.method172(var31.method517(), var13) != 0) {
            if (var31 != null) {
                var13 = arg10.method160(var13, var31.method517());
            }
            boolean var33 = false;
            for (int var34 = 0; var34 < 12; var34++) {
                int var35 = this.field7137[var34];
                if ((var35 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var35) != 0 && !arg7.method1852(var35 & 0x3FFFFFFF, 5823).method3708((byte) 95)) {
                        var33 = true;
                    }
                } else if (!arg0.method2228(var35 & 0x3FFFFFFF, 0).method1244(this.field7150, 126)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class461[] var36 = new class461[12];
            int var37 = 0;
            for (int var38 = 0; var38 < 12; var38++) {
                int var39 = this.field7137[var38];
                if ((var39 & 0x40000000) != 0) {
                    class461 var40 = arg0.method2228(var39 & 0x3FFFFFFF, arg1 ^ 0x100).method1252(arg1 - 135, this.field7150);
                    if (var40 != null) {
                        var36[var37++] = var40;
                    }
                } else if ((var39 & Integer.MIN_VALUE) != 0) {
                    class461 var41 = arg7.method1852(var39 & 0x3FFFFFFF, 5823).method3704((byte) 115);
                    if (var41 != null) {
                        var36[var37++] = var41;
                    }
                }
            }
            class461 var42 = new class461(var36, var37);
            int var43 = var13 | 0x4000;
            var31 = arg10.method171(var42, var43, class312.field4618, 64, 768);
            for (int var44 = 0; var44 < 5; var44++) {
                for (int var45 = 0; var45 < class118.field1796.length; var45++) {
                    if (class118.field1796[var45][var44].length > this.field7135[var44]) {
                        var31.method500(class72.field1265[var45][var44], class118.field1796[var45][var44][this.field7135[var44]]);
                    }
                }
            }
            var31.method536(var13);
            class382 var46 = class622.field8668;
            synchronized (class622.field8668) {
                class622.field8668.method2291(var31, this.field7144, 1);
            }
        }
        if (arg6 == null) {
            return var31;
        } else {
            var31.method532((byte) 4, var13, true);
            return arg6.method347(arg3, arg9, var31, arg8, arg5, true);
        }
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(Lrk;ILga;Lqj;[Lpba;IILr;IILln;ZLsh;Ldh;Lrk;IBILud;)Lda;", line = 287)
    public final class55 method2905(class30 arg0, int arg1, class367 arg2, class470 arg3, class300[] arg4, int arg5, int arg6, class166 arg7, int arg8, int arg9, class344 arg10, boolean arg11, class62 arg12, class290 arg13, class30 arg14, int arg15, byte arg16, int arg17, class33 arg18) {
        field7131++;
        if (this.field7141 != -1) {
            return arg18.method362(this.field7141, (byte) 87).method3352(arg7, arg4, arg14, arg12, arg0, arg8, arg9, arg3, arg1, arg5, arg10, arg17, arg15, arg6, (byte) -124);
        }
        int var20 = arg6;
        long var21 = this.field7144;
        int[] var23 = this.field7137;
        if (arg14 != null && (arg14.field463 >= 0 || arg14.field475 >= 0)) {
            var23 = new int[12];
            for (int var24 = 0; var24 < 12; var24++) {
                var23[var24] = this.field7137[var24];
            }
            if (arg14.field463 >= 0) {
                if (arg14.field463 == 65535) {
                    var21 ^= 0xFFFFFFFF00000000L;
                    var23[5] = 0;
                } else {
                    var23[5] = class486.method2826(arg14.field463, 1073741824);
                    var21 ^= (long) var23[5] << 32;
                }
            }
            if (arg14.field475 >= 0) {
                if (arg14.field475 == 65535) {
                    var23[3] = 0;
                    var21 ^= 0xFFFFFFFFL;
                } else {
                    var23[3] = class486.method2826(1073741824, arg14.field475);
                    var21 ^= var23[3];
                }
            }
        }
        if (arg16 != -123) {
            this.field7150 = false;
        }
        boolean var25 = false;
        boolean var26 = false;
        boolean var27 = false;
        boolean var28 = arg14 != null || arg0 != null;
        int var29 = arg4 == null ? 0 : arg4.length;
        for (int var30 = 0; var30 < var29; var30++) {
            class72.field1269[var30] = null;
            if (arg4[var30] != null) {
                class30 var31 = arg10.method2140(arg4[var30].field4466, arg16 + 246);
                if (var31.field456 != null) {
                    class47.field729[var30] = var31;
                    var28 = true;
                    int var32 = arg4[var30].field4465;
                    int var33 = arg4[var30].field4475;
                    int var34 = var31.field456[var32];
                    class72.field1269[var30] = arg10.method2135(-128, var34 >>> 16);
                    int var35 = var34 & 0xFFFF;
                    class167.field2423[var30] = var35;
                    if (class72.field1269[var30] != null) {
                        var26 |= class72.field1269[var30].method800(25595, var35);
                        var25 |= class72.field1269[var30].method798(var35, (byte) 3);
                        var27 |= class72.field1269[var30].method805(true, var35);
                    }
                    if ((var31.field452 || class498.field7060) && var33 != -1 && var31.field456.length > var33) {
                        class451.field6493[var30] = var31.field450[var32];
                        class434.field6343[var30] = arg4[var30].field4471;
                        int var36 = var31.field456[var33];
                        class140.field2076[var30] = arg10.method2135(-104, var36 >>> 16);
                        int var37 = var36 & 0xFFFF;
                        class64.field1200[var30] = var37;
                        if (class140.field2076[var30] != null) {
                            var26 |= class140.field2076[var30].method800(25595, var37);
                            var25 |= class140.field2076[var30].method798(var37, (byte) 3);
                            var27 |= class140.field2076[var30].method805(true, var37);
                        }
                    } else {
                        class451.field6493[var30] = 0;
                        class434.field6343[var30] = 0;
                        class140.field2076[var30] = null;
                        class64.field1200[var30] = -1;
                    }
                }
            }
        }
        int var38 = -1;
        int var39 = -1;
        int var40 = 0;
        class98 var41 = null;
        class98 var42 = null;
        int var43 = -1;
        int var44 = -1;
        int var45 = 0;
        class98 var46 = null;
        class98 var47 = null;
        if (var28) {
            var20 = arg6 | 0x20;
            if (arg14 != null) {
                int var48 = arg14.field456[arg5];
                int var49 = var48 >>> 16;
                var38 = var48 & 0xFFFF;
                var41 = arg10.method2135(-108, var49);
                if (var41 != null) {
                    var26 |= var41.method800(25595, var38);
                    var25 |= var41.method798(var38, (byte) 3);
                    var27 |= var41.method805(true, var38);
                }
                if ((arg14.field452 || class498.field7060) && arg17 != -1 && arg17 < arg14.field456.length) {
                    var40 = arg14.field450[arg5];
                    int var50 = arg14.field456[arg17];
                    int var51 = var50 >>> 16;
                    var39 = var50 & 0xFFFF;
                    var42 = var49 == var51 ? var41 : arg10.method2135(-79, var51);
                    if (var42 != null) {
                        var26 |= var42.method800(arg16 + 25718, var39);
                        var25 |= var42.method798(var39, (byte) 3);
                        var27 |= var42.method805(true, var39);
                    }
                }
            }
            if (arg0 != null) {
                int var52 = arg0.field456[arg15];
                int var53 = var52 >>> 16;
                var43 = var52 & 0xFFFF;
                var46 = arg10.method2135(-123, var53);
                if (var46 != null) {
                    var26 |= var46.method800(arg16 + 25718, var43);
                    var25 |= var46.method798(var43, (byte) 3);
                    var27 |= var46.method805(true, var43);
                }
                if ((arg0.field452 || class498.field7060) && arg8 != -1 && arg8 < arg0.field456.length) {
                    int var54 = arg0.field456[arg8];
                    var45 = arg0.field450[arg15];
                    int var55 = var54 >>> 16;
                    var47 = var53 == var55 ? var46 : arg10.method2135(-106, var55);
                    var44 = var54 & 0xFFFF;
                    if (var47 != null) {
                        var26 |= var47.method800(arg16 ^ 0xFFFF9C7E, var44);
                        var25 |= var47.method798(var44, (byte) 3);
                        var27 |= var47.method805(true, var44);
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
        class382 var56 = class341.field5007;
        class55 var57;
        synchronized (class341.field5007) {
            var57 = (class55) class341.field5007.method2287(1, var21);
        }
        class87 var58 = null;
        if (this.field7140 != -1) {
            var58 = arg12.method648(this.field7140, 32);
        }
        if (var57 == null || arg7.method172(var57.method517(), var20) != 0 || var58 != null && var58.field1450 != null && this.field7134 == null) {
            if (var57 != null) {
                var20 = arg7.method160(var20, var57.method517());
            }
            boolean var60 = false;
            for (int var61 = 0; var61 < 12; var61++) {
                int var62 = var23[var61];
                if ((var62 & 0x40000000) == 0) {
                    if ((var62 & Integer.MIN_VALUE) != 0 && !arg13.method1852(var62 & 0x3FFFFFFF, 5823).method3709(126)) {
                        var60 = true;
                    }
                } else if (!arg2.method2228(var62 & 0x3FFFFFFF, 0).method1256(-64, this.field7150)) {
                    var60 = true;
                }
            }
            if (var60) {
                if (this.field7138 != -1L) {
                    class382 var63 = class341.field5007;
                    synchronized (class341.field5007) {
                        var57 = (class55) class341.field5007.method2287(arg16 + 124, this.field7138);
                    }
                }
                if (var57 == null || arg7.method172(var57.method517(), var20) != 0 || var58 != null && var58.field1450 != null && this.field7134 == null) {
                    return null;
                }
            } else {
                class461[] var64 = new class461[12];
                for (int var65 = 0; var65 < 12; var65++) {
                    int var66 = var23[var65];
                    if ((var66 & 0x40000000) != 0) {
                        class461 var68 = arg2.method2228(var66 & 0x3FFFFFFF, 0).method1253(true, this.field7150);
                        if (var68 != null) {
                            var64[var65] = var68;
                        }
                    } else if ((Integer.MIN_VALUE & var66) != 0) {
                        class461 var67 = arg13.method1852(var66 & 0x3FFFFFFF, 5823).method3707(0);
                        if (var67 != null) {
                            var64[var65] = var67;
                        }
                    }
                }
                if (var58 != null && var58.field1450 != null) {
                    for (int var69 = 0; var69 < var58.field1450.length; var69++) {
                        if (var58.field1450[var69] != null && var64[var69] != null) {
                            int var70 = var58.field1450[var69][0];
                            int var71 = var58.field1450[var69][1];
                            int var72 = var58.field1450[var69][2];
                            int var73 = var58.field1450[var69][3] << 3;
                            int var74 = var58.field1450[var69][4] << 3;
                            int var75 = var58.field1450[var69][5] << 3;
                            if (this.field7134 == null) {
                                this.field7134 = new int[var58.field1450.length][];
                            }
                            if (this.field7134[var69] == null) {
                                int[] var76 = this.field7134[var69] = new int[15];
                                if (var73 == 0 && var74 == 0 && var75 == 0) {
                                    var76[0] = var76[4] = var76[8] = 32768;
                                    var76[14] = -var72;
                                    var76[13] = -var71;
                                    var76[12] = -var70;
                                } else {
                                    int var77 = class189.field2721[var73];
                                    int var78 = class189.field2719[var73];
                                    int var79 = class189.field2721[var74];
                                    int var80 = class189.field2719[var74];
                                    int var81 = class189.field2721[var75];
                                    int var82 = class189.field2719[var75];
                                    int var83 = var78 * var81 + 8192 >> 14;
                                    int var84 = var78 * var82 + 8192 >> 14;
                                    var76[5] = -var78;
                                    var76[7] = -var80 * -var82 + var79 * var83 + 8192 >> 14;
                                    var76[1] = -var82 * var79 + var80 * var83 + 8192 >> 14;
                                    var76[2] = var77 * var80 + 8192 >> 14;
                                    var76[4] = var77 * var81 + 8192 >> 14;
                                    var76[0] = var79 * var81 + (var80 * var84) + 8192 >> 14;
                                    var76[3] = var77 * var82 + 8192 >> 14;
                                    var76[6] = -var80 * var81 + var79 * var84 + 8192 >> 14;
                                    var76[8] = var77 * var79 + 8192 >> 14;
                                    var76[12] = var76[6] * -var72 + var76[3] * -var71 + var76[0] * -var70 + 8192 >> 14;
                                    var76[14] = var76[5] * -var71 + var76[2] * -var70 + (var76[8] * -var72) + 8192 >> 14;
                                    var76[13] = var76[1] * -var70 + (var76[4] * -var71 - (-(var76[7] * -var72) - 8192)) >> 14;
                                }
                                var76[10] = var71;
                                var76[9] = var70;
                                var76[11] = var72;
                            }
                            if (var73 != 0 || var74 != 0 || var75 != 0) {
                                var64[var69].method2714(var73, var75, var74, -93);
                            }
                            if (var70 != 0 || var71 != 0 || var72 != 0) {
                                var64[var69].method2720(var71, var72, var70, arg16 + 123);
                            }
                        }
                    }
                }
                int var85 = var20 | 0x4000;
                class461 var86 = new class461(var64, var64.length);
                var57 = arg7.method171(var86, var85, class312.field4618, 64, 850);
                for (int var87 = 0; var87 < 5; var87++) {
                    for (int var88 = 0; var88 < class118.field1796.length; var88++) {
                        if (class118.field1796[var88][var87].length > this.field7135[var87]) {
                            var57.method500(class72.field1265[var88][var87], class118.field1796[var88][var87][this.field7135[var87]]);
                        }
                    }
                }
                if (arg11) {
                    var57.method536(var20);
                    class382 var89 = class341.field5007;
                    synchronized (class341.field5007) {
                        class341.field5007.method2291(var57, var21, arg16 + 124);
                    }
                    this.field7138 = var21;
                }
            }
        }
        class55 var90 = var57.method532((byte) 4, var20, true);
        if (!var28) {
            return var90;
        }
        int var91 = 0;
        int var92 = 1;
        while (var91 < var29) {
            if (class72.field1269[var91] != null) {
                var90.method594(class72.field1269[var91], 0, class451.field6493[var91], arg16 ^ 0xFFFFFF85, this.field7134 == null ? null : this.field7134[var91], var92, class434.field6343[var91] - 1, class140.field2076[var91], false, class167.field2423[var91], class64.field1200[var91]);
            }
            var91++;
            var92 <<= 0x1;
        }
        if (var41 != null && var46 != null) {
            var90.method602(false, var44, var40, var38, 65535, arg9 - 1, var42, arg14.field455, var47, var46, var39, arg1 - 1, var45, var41, var43);
        } else if (var41 != null) {
            var90.method595(arg1 - 1, var40, var42, -110, 0, false, var38, var39, var41);
        } else if (var46 != null) {
            var90.method595(arg9 - 1, var45, var47, -89, 0, false, var43, var44, var46);
        }
        for (int var93 = 0; var93 < var29; var93++) {
            class72.field1269[var93] = null;
            class140.field2076[var93] = null;
            class47.field729[var93] = null;
        }
        return var90;
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(B)V", line = 791)
    private final void method2906(byte arg0) {
        field7146++;
        this.field7144 = -1L;
        long[] var2 = class597.field8433;
        this.field7144 = this.field7144 >>> 8 ^ var2[(int) ((this.field7144 ^ (long) (this.field7140 >> 8)) & 0xFFL)];
        this.field7144 = var2[(int) ((this.field7144 ^ (long) this.field7140) & 0xFFL)] ^ this.field7144 >>> 8;
        int var3 = 0;
        if (arg0 >= -29) {
            return;
        }
        while (var3 < 12) {
            this.field7144 = this.field7144 >>> 8 ^ var2[(int) ((this.field7144 ^ (long) (this.field7137[var3] >> 24)) & 0xFFL)];
            this.field7144 = var2[(int) ((this.field7144 ^ (long) (this.field7137[var3] >> 16)) & 0xFFL)] ^ this.field7144 >>> 8;
            this.field7144 = this.field7144 >>> 8 ^ var2[(int) ((this.field7144 ^ (long) (this.field7137[var3] >> 8)) & 0xFFL)];
            this.field7144 = var2[(int) (((long) this.field7137[var3] ^ this.field7144) & 0xFFL)] ^ this.field7144 >>> 8;
            var3++;
        }
        for (int var4 = 0; var4 < 5; var4++) {
            this.field7144 = var2[(int) (((long) this.field7135[var4] ^ this.field7144) & 0xFFL)] ^ this.field7144 >>> 8;
        }
        this.field7144 = var2[(int) ((this.field7144 ^ (long) (this.field7150 ? 1 : 0)) & 0xFFL)] ^ this.field7144 >>> 8;
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(IIILdh;)V", line = 829)
    public final void method2907(int arg0, int arg1, int arg2, class290 arg3) {
        field7151++;
        int var5 = class26.field390[arg1];
        if (arg3.method1852(arg0, 5823) != null) {
            this.field7137[var5] = class486.method2826(arg2, arg0);
            this.method2906((byte) -104);
        }
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(IIBIILln;Lrk;ILdh;Lr;II)Lda;", line = 851)
    public final class55 method2908(int arg0, int arg1, byte arg2, int arg3, int arg4, class344 arg5, class30 arg6, int arg7, class290 arg8, class166 arg9, int arg10, int arg11) {
        field7139++;
        int var13 = arg4;
        if (arg6 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            Object var21 = null;
            var13 = arg4 | 0x20;
            int var22 = arg6.field456[arg11];
            int var23 = var22 >>> 16;
            class98 var24 = arg5.method2135(arg2 - 162, var23);
            int var25 = var22 & 0xFFFF;
            if (var24 != null) {
                var15 |= var24.method800(arg2 ^ 0x63B6, var25);
                var14 |= var24.method798(var25, (byte) 3);
                var17 |= var24.method805(true, var25);
                var16 |= arg6.field468;
            }
            if ((arg6.field452 || class498.field7060) && arg3 != -1 && arg6.field456.length > arg3) {
                int var26 = arg6.field456[arg3];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class98 var29;
                if (var23 == var27) {
                    var29 = var24;
                } else {
                    var29 = arg5.method2135(-108, var28 >>> 16);
                }
                if (var29 != null) {
                    var15 |= var29.method800(arg2 + 25518, var28);
                    var14 |= var29.method798(var28, (byte) 3);
                    var17 |= var29.method805(true, var28);
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
        if (arg2 != 77) {
            return null;
        }
        long var30 = (long) arg0 | (long) arg10 << 32 | (long) (arg7 << 16);
        class382 var32 = class622.field8668;
        class55 var33;
        synchronized (class622.field8668) {
            var33 = (class55) class622.field8668.method2287(1, var30);
        }
        if (var33 == null || arg9.method172(var33.method517(), var13) != 0) {
            if (var33 != null) {
                var13 = arg9.method160(var13, var33.method517());
            }
            class461[] var35 = new class461[3];
            int var36 = 0;
            if (!arg8.method1852(arg0, 5823).method3708((byte) -128) || !arg8.method1852(arg7, 5823).method3708((byte) -120) || !arg8.method1852(arg10, 5823).method3708((byte) -122)) {
                return null;
            }
            class461 var37 = arg8.method1852(arg0, 5823).method3704((byte) 115);
            if (var37 != null) {
                var35[var36++] = var37;
            }
            class461 var38 = arg8.method1852(arg7, 5823).method3704((byte) 118);
            if (var38 != null) {
                var35[var36++] = var38;
            }
            class461 var39 = arg8.method1852(arg10, 5823).method3704((byte) 113);
            if (var39 != null) {
                var35[var36++] = var39;
            }
            class461 var40 = new class461(var35, var36);
            int var41 = var13 | 0x4000;
            var33 = arg9.method171(var40, var41, class312.field4618, 64, 768);
            for (int var42 = 0; var42 < 5; var42++) {
                for (int var43 = 0; var43 < class118.field1796.length; var43++) {
                    if (class118.field1796[var43][var42].length > this.field7135[var42]) {
                        var33.method500(class72.field1265[var43][var42], class118.field1796[var43][var42][this.field7135[var42]]);
                    }
                }
            }
            var33.method536(var13);
            class382 var44 = class622.field8668;
            synchronized (class622.field8668) {
                class622.field8668.method2291(var33, var30, 1);
            }
        }
        if (arg6 == null) {
            return var33;
        } else {
            class55 var45 = var33.method532((byte) 4, var13, true);
            return arg6.method347(arg1, arg3, var45, arg4, arg11, true);
        }
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(IZ)V", line = 1007)
    public final void method2909(int arg0, boolean arg1) {
        if (arg0 == 12) {
            this.field7150 = arg1;
            field7145++;
            this.method2906((byte) -118);
        }
    }

    @OriginalMember(owner = "client!kga", name = "b", descriptor = "(B)V", line = 1022)
    public static void method2910(byte arg0) {
        field7133 = null;
        if (arg0 < 110) {
            method2900(null, 43);
        }
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(IILga;I)V", line = 1036)
    public final void method2911(int arg0, int arg1, class367 arg2, int arg3) {
        field7136++;
        if (arg3 != -1) {
            method2900(null, 43);
        }
        if (arg1 == -1) {
            this.field7137[arg0] = 0;
        } else if (arg2.method2228(arg1, 0) != null) {
            this.field7137[arg0] = class486.method2826(arg1, 1073741824);
            this.method2906((byte) -109);
        }
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "([Lkfa;ILok;)Lhca;", line = 1062)
    public static final class452 method2912(class558[] arg0, int arg1, class228 arg2) {
        field7152++;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (arg0[var3] == null || arg0[var3].field7878 <= 0L) {
                return null;
            }
        }
        long var4 = OpenGL.glCreateProgramObjectARB();
        for (int var6 = 0; var6 < arg0.length; var6++) {
            OpenGL.glAttachObjectARB(var4, arg0[var6].field7878);
        }
        OpenGL.glLinkProgramARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35714, class511.field7192, arg1);
        if (class511.field7192[0] == 0) {
            if (class511.field7192[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class511.field7192, 1);
            if (class511.field7192[1] > 1) {
                byte[] var7 = new byte[class511.field7192[1]];
                OpenGL.glGetInfoLogARB(var4, class511.field7192[1], class511.field7192, 0, var7, 0);
                System.out.println(new String(var7));
            }
            if (class511.field7192[0] == 0) {
                for (int var8 = 0; var8 < arg0.length; var8++) {
                    OpenGL.glDetachObjectARB(var4, arg0[var8].field7878);
                }
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class452(arg2, var4, arg0);
    }
}
