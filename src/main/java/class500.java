import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class500 {

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "I")
    public int field7173 = -1;

    @OriginalMember(owner = "client!ed", name = "o", descriptor = "Z")
    public static volatile boolean field7178 = true;

    @OriginalMember(owner = "client!ed", name = "l", descriptor = "[[I")
    public static int[][] field7175 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!ed", name = "t", descriptor = "[[B")
    public static byte[][] field7183 = new byte[250][];

    @OriginalMember(owner = "client!ed", name = "v", descriptor = "I")
    public static int field7185 = 0;

    @OriginalMember(owner = "client!ed", name = "k", descriptor = "Lob;")
    public static class521 field7174 = new class521(56, 2);

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "I")
    public static int field7164;

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "I")
    public static int field7165;

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "I")
    public static int field7167;

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "I")
    public static int field7168;

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "I")
    private int field7169;

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "I")
    public static int field7172;

    @OriginalMember(owner = "client!ed", name = "m", descriptor = "I")
    public static int field7176;

    @OriginalMember(owner = "client!ed", name = "n", descriptor = "I")
    public static int field7177;

    @OriginalMember(owner = "client!ed", name = "q", descriptor = "I")
    public static int field7180;

    @OriginalMember(owner = "client!ed", name = "u", descriptor = "I")
    public static int field7184;

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "J")
    private long field7170;

    @OriginalMember(owner = "client!ed", name = "p", descriptor = "J")
    private long field7179;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "Z")
    public boolean field7166;

    @OriginalMember(owner = "client!ed", name = "r", descriptor = "[I")
    private int[] field7181;

    @OriginalMember(owner = "client!ed", name = "s", descriptor = "[I")
    public int[] field7182;

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "[[I")
    private int[][] field7171;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(BII)V", line = 6)
    public final void method2954(byte arg0, int arg1, int arg2) {
        this.field7182[arg1] = arg2;
        field7168++;
        this.method2955(arg0 ^ 0xFFFFFFC4);
        if (arg0 != 43) {
            this.field7173 = 77;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V", line = 19)
    private final void method2955(int arg0) {
        field7180++;
        this.field7170 = -1L;
        long[] var2 = class111.field1546;
        this.field7170 = var2[(int) ((this.field7170 ^ (long) (this.field7169 >> 8)) & 0xFFL)] ^ this.field7170 >>> 8;
        this.field7170 = this.field7170 >>> 8 ^ var2[(int) ((this.field7170 ^ (long) this.field7169) & 0xFFL)];
        int var3 = -124 % ((66 - arg0) / 58);
        for (int var4 = 0; var4 < 12; var4++) {
            this.field7170 = var2[(int) (((long) (this.field7181[var4] >> 24) ^ this.field7170) & 0xFFL)] ^ this.field7170 >>> 8;
            this.field7170 = this.field7170 >>> 8 ^ var2[(int) ((this.field7170 ^ (long) (this.field7181[var4] >> 16)) & 0xFFL)];
            this.field7170 = var2[(int) ((this.field7170 ^ (long) (this.field7181[var4] >> 8)) & 0xFFL)] ^ this.field7170 >>> 8;
            this.field7170 = var2[(int) (((long) this.field7181[var4] ^ this.field7170) & 0xFFL)] ^ this.field7170 >>> 8;
        }
        for (int var5 = 0; var5 < 5; var5++) {
            this.field7170 = var2[(int) ((this.field7170 ^ (long) this.field7182[var5]) & 0xFFL)] ^ this.field7170 >>> 8;
        }
        this.field7170 = var2[(int) (((long) (this.field7166 ? 1 : 0) ^ this.field7170) & 0xFFL)] ^ this.field7170 >>> 8;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "([IIZ[IZI)V", line = 56)
    public final void method2956(int[] arg0, int arg1, boolean arg2, int[] arg3, boolean arg4, int arg5) {
        this.field7181 = arg0;
        if (this.field7169 != arg1) {
            this.field7171 = null;
            this.field7169 = arg1;
        }
        field7177++;
        this.field7166 = arg4;
        this.field7182 = arg3;
        if (!arg2) {
            this.method2960(null, null, (byte) -91, null, 66, 65, -89, null, null, null, 120, null, 102, null, null, 14, 101, null, true);
        }
        this.field7173 = arg5;
        this.method2955(125);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ZB)V", line = 77)
    public final void method2957(boolean arg0, byte arg1) {
        field7167++;
        this.field7166 = arg0;
        this.method2955(-73);
        int var3 = 6 % ((35 - arg1) / 46);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(BIIILya;Lov;Lmg;ILbd;Lsm;Lit;Ljq;)Lt;", line = 93)
    public final class475 method2958(byte arg0, int arg1, int arg2, int arg3, class38 arg4, class126 arg5, class103 arg6, int arg7, class45 arg8, class189 arg9, class459 arg10, class357 arg11) {
        int var13 = 68 / ((27 - arg0) / 42);
        field7164++;
        if (this.field7173 != -1) {
            return arg10.method2782(this.field7173, (byte) -87).method262(arg2, arg5, arg9, arg3, 0, arg4, arg7, arg11, arg1);
        }
        int var14 = arg3;
        if (arg9 != null) {
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = false;
            boolean var19 = true;
            boolean var20 = true;
            Object var21 = null;
            var14 = arg3 | 0x20;
            int var22 = arg9.field3181[arg1];
            Object var23 = null;
            int var24 = var22 >>> 16;
            class22 var25 = arg11.method2239(var24, (byte) 76);
            int var26 = var22 & 0xFFFF;
            if (var25 != null) {
                var16 |= var25.method165(var26, true);
                var15 |= var25.method166(14360, var26);
                var18 |= var25.method164(256, var26);
                var17 |= arg9.field3195;
            }
            if ((arg9.field3190 || class55.field685) && arg7 != -1 && arg9.field3181.length > arg7) {
                int var27 = arg9.field3181[arg7];
                int var28 = var27 >>> 16;
                int var29 = var27 & 0xFFFF;
                class22 var30 = var24 == var28 ? var25 : arg11.method2239(var28, (byte) 121);
                if (var30 != null) {
                    var16 |= var30.method165(var29, true);
                    var15 |= var30.method166(14360, var29);
                    var18 |= var30.method164(256, var29);
                }
            }
            if (var16) {
                var14 |= 0x80;
            }
            if (var15) {
                var14 |= 0x100;
            }
            if (var17) {
                var14 |= 0x200;
            }
            if (var18) {
                var14 |= 0x400;
            }
        }
        class13 var31 = class315.field4745;
        class475 var32;
        synchronized (class315.field4745) {
            var32 = (class475) class315.field4745.method87(this.field7170, -2062335807);
        }
        if (var32 == null || arg4.method314(var32.method433(), var14) != 0) {
            if (var32 != null) {
                var14 = arg4.method317(var14, var32.method433());
            }
            boolean var34 = false;
            for (int var35 = 0; var35 < 12; var35++) {
                int var36 = this.field7181[var35];
                if ((var36 & 0x40000000) == 0) {
                    if ((var36 & Integer.MIN_VALUE) != 0 && !arg6.method815((byte) 31, var36 & 0x3FFFFFFF).method1455((byte) 50)) {
                        var34 = true;
                    }
                } else if (!arg8.method467((byte) -101, var36 & 0x3FFFFFFF).method3149(this.field7166, 0)) {
                    var34 = true;
                }
            }
            if (var34) {
                return null;
            }
            class374[] var37 = new class374[12];
            int var38 = 0;
            for (int var39 = 0; var39 < 12; var39++) {
                int var40 = this.field7181[var39];
                if ((var40 & 0x40000000) != 0) {
                    class374 var42 = arg8.method467((byte) -101, var40 & 0x3FFFFFFF).method3146((byte) 123, this.field7166);
                    if (var42 != null) {
                        var37[var38++] = var42;
                    }
                } else if ((Integer.MIN_VALUE & var40) != 0) {
                    class374 var41 = arg6.method815((byte) 31, var40 & 0x3FFFFFFF).method1457(101);
                    if (var41 != null) {
                        var37[var38++] = var41;
                    }
                }
            }
            int var43 = var14 | 0x4000;
            class374 var44 = new class374(var37, var38);
            var32 = arg4.method330(var44, var43, class373.field5557, 64, 768);
            for (int var45 = 0; var45 < 5; var45++) {
                if (class239.field3824[var45].length > this.field7182[var45]) {
                    var32.method436(class18.field230[var45], class239.field3824[var45][this.field7182[var45]]);
                }
                if (this.field7182[var45] < class282.field4289[var45].length) {
                    var32.method436(class309.field4660[var45], class282.field4289[var45][this.field7182[var45]]);
                }
            }
            var32.method435(var14);
            class13 var46 = class315.field4745;
            synchronized (class315.field4745) {
                class315.field4745.method84(this.field7170, var32, (byte) 27);
            }
        }
        if (arg9 == null) {
            return var32;
        } else {
            var32.method449((byte) 4, var14, true);
            return arg9.method1324(-117, arg2, arg3, arg7, arg1, var32);
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)I", line = 287)
    public static final int method2959(int arg0, int arg1) {
        return class76.field1100 == null ? 0 : class76.field1100[arg0][arg1] & 0xFFFF;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Ljq;Lsm;BLit;IIILya;Lfh;[Lsq;ILbd;ILsm;Lov;IILmg;Z)Lt;", line = 293)
    public final class475 method2960(class357 arg0, class189 arg1, byte arg2, class459 arg3, int arg4, int arg5, int arg6, class38 arg7, class464 arg8, class121[] arg9, int arg10, class45 arg11, int arg12, class189 arg13, class126 arg14, int arg15, int arg16, class103 arg17, boolean arg18) {
        field7172++;
        if (this.field7173 != -1) {
            return arg3.method2782(this.field7173, (byte) -87).method260(arg5, arg9, arg13, arg15, arg10, arg16, arg0, 64, arg7, arg6, arg1, arg12, arg4, arg14, arg8);
        }
        int var20 = arg15;
        long var21 = this.field7170;
        int[] var23 = this.field7181;
        if (arg1 != null && (arg1.field3178 >= 0 || arg1.field3191 >= 0)) {
            var23 = new int[12];
            for (int var24 = 0; var24 < 12; var24++) {
                var23[var24] = this.field7181[var24];
            }
            if (arg1.field3178 >= 0) {
                if (arg1.field3178 == 65535) {
                    var21 ^= 0xFFFFFFFF00000000L;
                    var23[5] = 0;
                } else {
                    var23[5] = class264.method1763(1073741824, arg1.field3178);
                    var21 ^= (long) var23[5] << 32;
                }
            }
            if (arg1.field3191 >= 0) {
                if (arg1.field3191 == 65535) {
                    var23[3] = 0;
                    var21 ^= 0xFFFFFFFFL;
                } else {
                    var23[3] = class264.method1763(arg1.field3191, 1073741824);
                    var21 ^= var23[3];
                }
            }
        }
        boolean var25 = false;
        boolean var26 = false;
        boolean var27 = false;
        boolean var28 = arg1 != null || arg13 != null;
        int var29 = arg9 == null ? 0 : arg9.length;
        for (int var30 = 0; var30 < var29; var30++) {
            class63.field776[var30] = null;
            if (arg9[var30] != null) {
                class189 var31 = arg0.method2238(arg9[var30].field1815, (byte) 78);
                if (var31.field3181 != null) {
                    var28 = true;
                    class53.field659[var30] = var31;
                    int var32 = arg9[var30].field1823;
                    int var33 = arg9[var30].field1816;
                    int var34 = var31.field3181[var32];
                    class63.field776[var30] = arg0.method2239(var34 >>> 16, (byte) -21);
                    int var35 = var34 & 0xFFFF;
                    class322.field4829[var30] = var35;
                    if (class63.field776[var30] != null) {
                        var26 |= class63.field776[var30].method165(var35, true);
                        var25 |= class63.field776[var30].method166(14360, var35);
                        var27 |= class63.field776[var30].method164(256, var35);
                    }
                    if ((var31.field3190 || class55.field685) && var33 != -1 && var33 < var31.field3181.length) {
                        class98.field1412[var30] = var31.field3204[var32];
                        class98.field1395[var30] = arg9[var30].field1822;
                        int var36 = var31.field3181[var33];
                        class481.field6920[var30] = arg0.method2239(var36 >>> 16, (byte) 114);
                        int var37 = var36 & 0xFFFF;
                        class167.field2468[var30] = var37;
                        if (class481.field6920[var30] != null) {
                            var26 |= class481.field6920[var30].method165(var37, true);
                            var25 |= class481.field6920[var30].method166(14360, var37);
                            var27 |= class481.field6920[var30].method164(256, var37);
                        }
                    } else {
                        class98.field1412[var30] = 0;
                        class98.field1395[var30] = 0;
                        class481.field6920[var30] = null;
                        class167.field2468[var30] = -1;
                    }
                }
            }
        }
        int var38 = -1;
        int var39 = -1;
        int var40 = 0;
        class22 var41 = null;
        class22 var42 = null;
        int var43 = -1;
        int var44 = -1;
        int var45 = 0;
        class22 var46 = null;
        class22 var47 = null;
        if (var28) {
            var20 = arg15 | 0x20;
            if (arg1 != null) {
                int var48 = arg1.field3181[arg5];
                int var49 = var48 >>> 16;
                var38 = var48 & 0xFFFF;
                var41 = arg0.method2239(var49, (byte) -55);
                if (var41 != null) {
                    var26 |= var41.method165(var38, true);
                    var25 |= var41.method166(14360, var38);
                    var27 |= var41.method164(256, var38);
                }
                if ((arg1.field3190 || class55.field685) && arg6 != -1 && arg1.field3181.length > arg6) {
                    var40 = arg1.field3204[arg5];
                    int var50 = arg1.field3181[arg6];
                    int var51 = var50 >>> 16;
                    var42 = var49 == var51 ? var41 : arg0.method2239(var51, (byte) -72);
                    var39 = var50 & 0xFFFF;
                    if (var42 != null) {
                        var26 |= var42.method165(var39, true);
                        var25 |= var42.method166(14360, var39);
                        var27 |= var42.method164(256, var39);
                    }
                }
            }
            if (arg13 != null) {
                int var52 = arg13.field3181[arg10];
                int var53 = var52 >>> 16;
                var43 = var52 & 0xFFFF;
                var46 = arg0.method2239(var53, (byte) -55);
                if (var46 != null) {
                    var26 |= var46.method165(var43, true);
                    var25 |= var46.method166(14360, var43);
                    var27 |= var46.method164(256, var43);
                }
                if ((arg13.field3190 || class55.field685) && arg12 != -1 && arg12 < arg13.field3181.length) {
                    var45 = arg13.field3204[arg10];
                    int var54 = arg13.field3181[arg12];
                    int var55 = var54 >>> 16;
                    var44 = var54 & 0xFFFF;
                    var47 = var53 == var55 ? var46 : arg0.method2239(var55, (byte) 105);
                    if (var47 != null) {
                        var26 |= var47.method165(var44, true);
                        var25 |= var47.method166(14360, var44);
                        var27 |= var47.method164(256, var44);
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
        class13 var56 = class425.field6331;
        class475 var57;
        synchronized (class425.field6331) {
            var57 = (class475) class425.field6331.method87(var21, -2062335807);
        }
        class376 var58 = null;
        if (this.field7169 != -1) {
            var58 = arg8.method2808(this.field7169, 18334);
        }
        if (var57 == null || arg7.method314(var57.method433(), var20) != 0 || var58 != null && var58.field5667 != null && this.field7171 == null) {
            if (var57 != null) {
                var20 = arg7.method317(var20, var57.method433());
            }
            boolean var60 = false;
            int var61 = 0;
            while (true) {
                if (var61 >= 12) {
                    if (var60) {
                        if (this.field7179 != -1L) {
                            class13 var88 = class425.field6331;
                            synchronized (class425.field6331) {
                                var57 = (class475) class425.field6331.method87(this.field7179, -2062335807);
                            }
                        }
                        if (var57 == null || arg7.method314(var57.method433(), var20) != 0 || var58 != null && var58.field5667 != null && this.field7171 == null) {
                            return null;
                        }
                    } else {
                        class374[] var63 = new class374[12];
                        for (int var64 = 0; var64 < 12; var64++) {
                            int var65 = var23[var64];
                            if ((var65 & 0x40000000) != 0) {
                                class374 var67 = arg11.method467((byte) -101, var65 & 0x3FFFFFFF).method3148(0, this.field7166);
                                if (var67 != null) {
                                    var63[var64] = var67;
                                }
                            } else if ((Integer.MIN_VALUE & var65) != 0) {
                                class374 var66 = arg17.method815((byte) 31, var65 & 0x3FFFFFFF).method1453((byte) 126);
                                if (var66 != null) {
                                    var63[var64] = var66;
                                }
                            }
                        }
                        if (var58 != null && var58.field5667 != null) {
                            for (int var68 = 0; var68 < var58.field5667.length; var68++) {
                                if (var58.field5667[var68] != null && var63[var68] != null) {
                                    int var69 = var58.field5667[var68][0];
                                    int var70 = var58.field5667[var68][1];
                                    int var71 = var58.field5667[var68][2];
                                    int var72 = var58.field5667[var68][3] << 3;
                                    int var73 = var58.field5667[var68][4] << 3;
                                    int var74 = var58.field5667[var68][5] << 3;
                                    if (this.field7171 == null) {
                                        this.field7171 = new int[var58.field5667.length][];
                                    }
                                    if (this.field7171[var68] == null) {
                                        int[] var75 = this.field7171[var68] = new int[15];
                                        if (var72 == 0 && var73 == 0 && var74 == 0) {
                                            var75[13] = -var70;
                                            var75[14] = -var71;
                                            var75[12] = -var69;
                                            var75[0] = var75[4] = var75[8] = 32768;
                                        } else {
                                            int var76 = class281.field4279[var72];
                                            int var77 = class281.field4278[var72];
                                            int var78 = class281.field4279[var73];
                                            int var79 = class281.field4278[var73];
                                            int var80 = class281.field4279[var74];
                                            int var81 = class281.field4278[var74];
                                            int var82 = var77 * var80 + 16384 >> 15;
                                            int var83 = var77 * var81 + 16384 >> 15;
                                            var75[3] = var76 * var81 + 16384 >> 15;
                                            var75[1] = var79 * var82 + -var81 * var78 + 16384 >> 15;
                                            var75[5] = -var77;
                                            var75[8] = var76 * var78 + 16384 >> 15;
                                            var75[4] = var76 * var80 + 16384 >> 15;
                                            var75[6] = -var79 * var80 + var78 * var83 + 16384 >> 15;
                                            var75[0] = var78 * var80 + (var79 * var83) + 16384 >> 15;
                                            var75[7] = -var79 * -var81 + var78 * var82 + 16384 >> 15;
                                            var75[2] = var76 * var79 + 16384 >> 15;
                                            var75[12] = var75[6] * -var71 + var75[0] * -var69 + (var75[3] * -var70) + 16384 >> 15;
                                            var75[14] = var75[8] * -var71 + var75[2] * -var69 + var75[5] * -var70 + 16384 >> 15;
                                            var75[13] = var75[7] * -var71 + var75[1] * -var69 + var75[4] * -var70 + 16384 >> 15;
                                        }
                                        var75[10] = var70;
                                        var75[11] = var71;
                                        var75[9] = var69;
                                    }
                                    if (var72 != 0 || var73 != 0 || var74 != 0) {
                                        var63[var68].method2342(var72, var73, var74, (byte) 16);
                                    }
                                    if (var69 != 0 || var70 != 0 || var71 != 0) {
                                        var63[var68].method2352(var69, var71, 0, var70);
                                    }
                                }
                            }
                        }
                        class374 var84 = new class374(var63, var63.length);
                        int var85 = var20 | 0x4000;
                        var57 = arg7.method330(var84, var85, class373.field5557, 64, 850);
                        for (int var86 = 0; var86 < 5; var86++) {
                            if (class239.field3824[var86].length > this.field7182[var86]) {
                                var57.method436(class18.field230[var86], class239.field3824[var86][this.field7182[var86]]);
                            }
                            if (this.field7182[var86] < class282.field4289[var86].length) {
                                var57.method436(class309.field4660[var86], class282.field4289[var86][this.field7182[var86]]);
                            }
                        }
                        if (arg18) {
                            var57.method435(var20);
                            class13 var87 = class425.field6331;
                            synchronized (class425.field6331) {
                                class425.field6331.method84(var21, var57, (byte) 27);
                            }
                            this.field7179 = var21;
                        }
                    }
                    break;
                }
                int var62 = var23[var61];
                if ((var62 & 0x40000000) == 0) {
                    if ((var62 & Integer.MIN_VALUE) != 0 && !arg17.method815((byte) 31, var62 & 0x3FFFFFFF).method1454(-3938)) {
                        var60 = true;
                    }
                } else if (!arg11.method467((byte) -101, var62 & 0x3FFFFFFF).method3151(0, this.field7166)) {
                    var60 = true;
                }
                var61++;
            }
        }
        class475 var89 = var57.method449((byte) 4, var20, true);
        if (!var28) {
            return var89;
        }
        int var90 = -117 / ((26 - arg2) / 49);
        int var91 = 0;
        int var92 = 1;
        while (var29 > var91) {
            if (class63.field776[var91] != null) {
                var89.method2866(class167.field2468[var91], class98.field1395[var91] - 1, 2, class98.field1412[var91], class481.field6920[var91], 0, this.field7171 == null ? null : this.field7171[var91], var92, class63.field776[var91], class322.field4829[var91], false);
            }
            var91++;
            var92 <<= 0x1;
        }
        if (var41 != null && var46 != null) {
            var89.method2862(var39, var44, var43, arg16 - 1, var45, var47, var46, arg1.field3198, arg4 - 1, var41, var42, (byte) -108, var38, var40, false);
        } else if (var41 != null) {
            var89.method2860(var42, arg16 - 1, 0, (byte) 106, var40, false, var38, var39, var41);
        } else if (var46 != null) {
            var89.method2860(var47, arg4 - 1, 0, (byte) 60, var45, false, var43, var44, var46);
        }
        for (int var93 = 0; var93 < var29; var93++) {
            class63.field776[var93] = null;
            class481.field6920[var93] = null;
            class53.field659[var93] = null;
        }
        return var89;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIILmg;)V", line = 800)
    public final void method2961(int arg0, int arg1, int arg2, class103 arg3) {
        field7165++;
        int var5 = class458.field6667[arg2];
        if (arg1 != -21379) {
            this.method2956(null, -34, true, null, false, 31);
        }
        if (this.field7181[var5] != 0 && arg3.method815((byte) 31, arg0) != null) {
            this.field7181[var5] = class264.method1763(arg0, Integer.MIN_VALUE);
            this.method2955(126);
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(BLsm;ILjq;ILya;IIIILmg;I)Lt;", line = 824)
    public final class475 method2962(byte arg0, class189 arg1, int arg2, class357 arg3, int arg4, class38 arg5, int arg6, int arg7, int arg8, int arg9, class103 arg10, int arg11) {
        field7184++;
        int var13 = arg8;
        if (arg1 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            var13 = arg8 | 0x20;
            int var21 = arg1.field3181[arg11];
            Object var22 = null;
            int var23 = var21 >>> 16;
            int var24 = var21 & 0xFFFF;
            class22 var25 = arg3.method2239(var23, (byte) -74);
            if (var25 != null) {
                var15 |= var25.method165(var24, true);
                var14 |= var25.method166(14360, var24);
                var17 |= var25.method164(256, var24);
                var16 |= arg1.field3195;
            }
            if ((arg1.field3190 || class55.field685) && arg6 != -1 && arg1.field3181.length > arg6) {
                int var26 = arg1.field3181[arg6];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class22 var29;
                if (var23 == var27) {
                    var29 = var25;
                } else {
                    var29 = arg3.method2239(var28 >>> 16, (byte) 126);
                }
                if (var29 != null) {
                    var15 |= var29.method165(var28, true);
                    var14 |= var29.method166(14360, var28);
                    var17 |= var29.method164(256, var28);
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
        long var30 = (long) (arg7 << 16) | (long) arg4 << 32 | (long) arg9;
        class13 var32 = class315.field4745;
        class475 var33;
        synchronized (class315.field4745) {
            var33 = (class475) class315.field4745.method87(var30, -2062335807);
        }
        if (var33 == null || arg5.method314(var33.method433(), var13) != 0) {
            if (var33 != null) {
                var13 = arg5.method317(var13, var33.method433());
            }
            class374[] var35 = new class374[3];
            int var36 = 0;
            if (!arg10.method815((byte) 31, arg9).method1455((byte) 50) || !arg10.method815((byte) 31, arg7).method1455((byte) 50) || !arg10.method815((byte) 31, arg4).method1455((byte) 50)) {
                return null;
            }
            class374 var37 = arg10.method815((byte) 31, arg9).method1457(101);
            if (var37 != null) {
                var35[var36++] = var37;
            }
            class374 var38 = arg10.method815((byte) 31, arg7).method1457(101);
            if (var38 != null) {
                var35[var36++] = var38;
            }
            class374 var39 = arg10.method815((byte) 31, arg4).method1457(101);
            if (var39 != null) {
                var35[var36++] = var39;
            }
            class374 var40 = new class374(var35, var36);
            int var41 = var13 | 0x4000;
            var33 = arg5.method330(var40, var41, class373.field5557, 64, 768);
            for (int var42 = 0; var42 < 5; var42++) {
                if (this.field7182[var42] < class239.field3824[var42].length) {
                    var33.method436(class18.field230[var42], class239.field3824[var42][this.field7182[var42]]);
                }
                if (class282.field4289[var42].length > this.field7182[var42]) {
                    var33.method436(class309.field4660[var42], class282.field4289[var42][this.field7182[var42]]);
                }
            }
            var33.method435(var13);
            class13 var43 = class315.field4745;
            synchronized (class315.field4745) {
                class315.field4745.method84(var30, var33, (byte) 27);
            }
        }
        if (arg1 == null) {
            return var33;
        } else if (arg0 >= -73) {
            return null;
        } else {
            class475 var44 = var33.method449((byte) 4, var13, true);
            return arg1.method1324(-101, arg2, arg8, arg6, arg11, var44);
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)V", line = 983)
    public static void method2963(byte arg0) {
        if (arg0 == 2) {
            field7183 = null;
            field7174 = null;
            field7175 = null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "([BI)Lrg;", line = 1005)
    public static final class457 method2964(byte[] arg0, int arg1) {
        field7176++;
        class457 var2 = new class457();
        if (arg1 != -6) {
            method2963((byte) -35);
        }
        class217 var3 = new class217(arg0);
        var3.field3556 = var3.field3572.length - 2;
        int var4 = var3.method1511(108);
        int var5 = var3.field3572.length - var4 - 12 - 2;
        var3.field3556 = var5;
        int var6 = var3.method1556(111);
        var2.field6654 = var3.method1511(74);
        var2.field6645 = var3.method1511(arg1 - 16);
        var2.field6658 = var3.method1511(-61);
        var2.field6657 = var3.method1511(98);
        int var7 = var3.method1515((byte) 124);
        if (var7 > 0) {
            var2.field6650 = new class412[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                int var9 = var3.method1511(-47);
                class412 var10 = new class412(class396.method2493((byte) 66, var9));
                var2.field6650[var8] = var10;
                while ((var9--) > 0) {
                    int var11 = var3.method1556(arg1 + 118);
                    int var12 = var3.method1556(102);
                    var10.method2591((long) var11, new class308(var12), (byte) 28);
                }
            }
        }
        var3.field3556 = 0;
        var2.field6652 = var3.method1505((byte) 116);
        var2.field6651 = new int[var6];
        var2.field6647 = new int[var6];
        var2.field6648 = new String[var6];
        int var13 = 0;
        while (var3.field3556 < var5) {
            int var14 = var3.method1511(109);
            if (var14 == 3) {
                var2.field6648[var13] = var3.method1550((byte) 28).intern();
            } else if (var14 >= 100 || var14 == 21 || var14 == 38 || var14 == 39) {
                var2.field6647[var13] = var3.method1515((byte) 122);
            } else {
                var2.field6647[var13] = var3.method1556(arg1 + 116);
            }
            var2.field6651[var13++] = var14;
        }
        return var2;
    }
}
