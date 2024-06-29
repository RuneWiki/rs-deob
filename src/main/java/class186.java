import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class186 {

    @OriginalMember(owner = "client!tc", name = "p", descriptor = "[I")
    public static int[] field2934 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "[Z")
    public static boolean[] field2926 = new boolean[100];

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "I")
    public static int field2919;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "I")
    public static int field2920;

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "I")
    public static int field2922;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "I")
    public int field2924;

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "I")
    public static int field2925;

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "I")
    public static int field2927;

    @OriginalMember(owner = "client!tc", name = "k", descriptor = "I")
    private int field2929;

    @OriginalMember(owner = "client!tc", name = "l", descriptor = "I")
    public static int field2930;

    @OriginalMember(owner = "client!tc", name = "m", descriptor = "I")
    public static int field2931;

    @OriginalMember(owner = "client!tc", name = "n", descriptor = "I")
    public static int field2932;

    @OriginalMember(owner = "client!tc", name = "s", descriptor = "I")
    public static int field2937;

    @OriginalMember(owner = "client!tc", name = "t", descriptor = "I")
    public static int field2938;

    @OriginalMember(owner = "client!tc", name = "o", descriptor = "J")
    private long field2933;

    @OriginalMember(owner = "client!tc", name = "r", descriptor = "J")
    private long field2936;

    @OriginalMember(owner = "client!tc", name = "q", descriptor = "Z")
    public boolean field2935;

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "[I")
    public int[] field2921;

    @OriginalMember(owner = "client!tc", name = "j", descriptor = "[I")
    private int[] field2928;

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "[[I")
    private int[][] field2923;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)I")
    public final int method1322(int arg0) {
        if (arg0 > -28) {
            return -23;
        } else {
            field2931++;
            return this.field2924 == -1 ? (this.field2928[8] << 10) + (this.field2928[11] << 5) + (this.field2921[4] << 20) + (this.field2921[0] << 25) + (this.field2928[0] << 15) + this.field2928[1] : class175.method1250(this.field2924, (byte) -91).field1512 + 305419896;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIBLpk;III)Lhd;")
    public final class11 method1323(int arg0, int arg1, int arg2, byte arg3, class103 arg4, int arg5, int arg6, int arg7) {
        int var9 = -111 % ((-arg3 - 58) / 48);
        field2925++;
        long var10 = (long) arg1 | (long) arg2 << 32 | (long) (arg0 << 16);
        class11 var12 = (class11) class80.field1226.method1173(var10, true);
        if (var12 == null) {
            class271[] var13 = new class271[3];
            int var14 = 0;
            if (!class185.method1321(3, arg1).method1134(-109) || !class185.method1321(3, arg0).method1134(127) || !class185.method1321(3, arg2).method1134(125)) {
                return null;
            }
            class271 var15 = class185.method1321(3, arg1).method1132(false);
            if (var15 != null) {
                var13[var14++] = var15;
            }
            class271 var16 = class185.method1321(3, arg0).method1132(false);
            if (var16 != null) {
                var13[var14++] = var16;
            }
            class271 var17 = class185.method1321(3, arg2).method1132(false);
            if (var17 != null) {
                var13[var14++] = var17;
            }
            class271 var18 = new class271(var13, var14);
            for (int var19 = 0; var19 < 5; var19++) {
                if (class74.field1145[var19].length > this.field2921[var19]) {
                    var18.method1847(class127.field1912[var19], class74.field1145[var19][this.field2921[var19]]);
                }
                if (class163.field2467[var19].length > this.field2921[var19]) {
                    var18.method1847(class107.field1673[var19], class163.field2467[var19][this.field2921[var19]]);
                }
            }
            var12 = var18.method1844(64, 768, -50, -10, -50);
            class80.field1226.method1167((byte) -109, var12, var10);
        }
        if (arg4 != null) {
            var12 = arg4.method788(arg5, var12, arg6, 11218, arg7);
        }
        return var12;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ZI)V")
    public static final void method1324(boolean arg0, int arg1) {
        class229.field3640.method1166((byte) 23, arg1);
        field2922++;
        if (arg0) {
            field2926 = null;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(BZ)V")
    public final void method1325(byte arg0, boolean arg1) {
        if (arg0 != -43) {
            this.field2928 = null;
        }
        field2919++;
        this.field2935 = arg1;
        this.method1327(true);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)V")
    public static void method1326(byte arg0) {
        field2934 = null;
        field2926 = null;
        if (arg0 != -75) {
            method1324(true, 40);
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Z)V")
    private final void method1327(boolean arg0) {
        field2932++;
        long var2 = this.field2936;
        this.field2936 = -1L;
        long[] var4 = class298.field4800;
        this.field2936 = this.field2936 >>> 8 ^ var4[(int) (((long) (this.field2929 >> 8) ^ this.field2936) & 0xFFL)];
        this.field2936 = this.field2936 >>> 8 ^ var4[(int) (((long) this.field2929 ^ this.field2936) & 0xFFL)];
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2936 = var4[(int) ((this.field2936 ^ (long) (this.field2928[var5] >> 24)) & 0xFFL)] ^ this.field2936 >>> 8;
            this.field2936 = var4[(int) ((this.field2936 ^ (long) (this.field2928[var5] >> 16)) & 0xFFL)] ^ this.field2936 >>> 8;
            this.field2936 = var4[(int) ((this.field2936 ^ (long) (this.field2928[var5] >> 8)) & 0xFFL)] ^ this.field2936 >>> 8;
            this.field2936 = var4[(int) (((long) this.field2928[var5] ^ this.field2936) & 0xFFL)] ^ this.field2936 >>> 8;
        }
        if (!arg0) {
            method1326((byte) 80);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2936 = var4[(int) ((this.field2936 ^ (long) this.field2921[var6]) & 0xFFL)] ^ this.field2936 >>> 8;
        }
        this.field2936 = this.field2936 >>> 8 ^ var4[(int) (((long) (this.field2935 ? 1 : 0) ^ this.field2936) & 0xFFL)];
        if (var2 != 0L && this.field2936 != var2) {
            class188.field2959.method1168(var2, 20);
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(III)V")
    public final void method1328(int arg0, int arg1, int arg2) {
        if (arg1 != -5934) {
            return;
        }
        int var4 = class198.field3083[arg0];
        field2920++;
        if (this.field2928[var4] != 0 && class185.method1321(3, arg2) != null) {
            this.field2928[var4] = class44.method377(Integer.MIN_VALUE, arg2);
            this.method1327(true);
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lpk;IILpk;I[Lhi;IIIZI)Lhd;")
    public final class11 method1329(class103 arg0, int arg1, int arg2, class103 arg3, int arg4, class234[] arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
        field2927++;
        if (this.field2924 != -1) {
            return class175.method1250(this.field2924, (byte) -123).method747(arg3, arg2, arg4, arg1, arg5, arg0, arg10, false, arg6, arg7);
        }
        long var12 = this.field2936;
        int[] var14 = this.field2928;
        if (arg3 != null && (arg3.field1601 >= 0 || arg3.field1615 >= 0)) {
            var14 = new int[12];
            for (int var15 = 0; var15 < 12; var15++) {
                var14[var15] = this.field2928[var15];
            }
            if (arg3.field1601 >= 0) {
                if (arg3.field1601 == 65535) {
                    var14[5] = 0;
                    var12 ^= 0xFFFFFFFF00000000L;
                } else {
                    var14[5] = class44.method377(arg3.field1601, 1073741824);
                    var12 ^= (long) var14[5] << 32;
                }
            }
            if (arg3.field1615 >= 0) {
                if (arg3.field1615 == 65535) {
                    var12 ^= 0xFFFFFFFFL;
                    var14[3] = 0;
                } else {
                    var14[3] = class44.method377(arg3.field1615, 1073741824);
                    var12 ^= (long) var14[3];
                }
            }
        }
        if (arg8 != 5) {
            return null;
        }
        class11 var16 = (class11) class188.field2959.method1173(var12, true);
        if (var16 == null) {
            boolean var17 = false;
            for (int var18 = 0; var18 < 12; var18++) {
                int var43 = var14[var18];
                if ((var43 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var43) != 0 && !class185.method1321(3, var43 & 0x3FFFFFFF).method1135(-22626)) {
                        var17 = true;
                    }
                } else if (!class123.method929(22497, var43 & 0x3FFFFFFF).method1266(this.field2935, arg8 ^ 0x5)) {
                    var17 = true;
                }
            }
            if (var17) {
                if (this.field2933 != -1L) {
                    var16 = (class11) class188.field2959.method1173(this.field2933, true);
                }
                if (var16 == null) {
                    return null;
                }
            }
            if (var16 == null) {
                class271[] var19 = new class271[12];
                for (int var20 = 0; var20 < 12; var20++) {
                    int var40 = var14[var20];
                    if ((var40 & 0x40000000) != 0) {
                        class271 var42 = class123.method929(22497, var40 & 0x3FFFFFFF).method1273(this.field2935, (byte) -90);
                        if (var42 != null) {
                            var19[var20] = var42;
                        }
                    } else if ((Integer.MIN_VALUE & var40) != 0) {
                        class271 var41 = class185.method1321(3, var40 & 0x3FFFFFFF).method1131(arg8 ^ 0x63);
                        if (var41 != null) {
                            var19[var20] = var41;
                        }
                    }
                }
                class241 var21 = null;
                if (this.field2929 != -1) {
                    var21 = class31.method280(arg8 ^ 0xFFFFD763, this.field2929);
                }
                if (var21 != null && var21.field3849 != null) {
                    for (int var22 = 0; var22 < var21.field3849.length; var22++) {
                        if (var21.field3849[var22] != null && var19[var22] != null) {
                            int var23 = var21.field3849[var22][0];
                            int var24 = var21.field3849[var22][1];
                            int var25 = var21.field3849[var22][3];
                            int var26 = var21.field3849[var22][4];
                            int var27 = var21.field3849[var22][2];
                            int var28 = var21.field3849[var22][5];
                            if (this.field2923 == null) {
                                this.field2923 = new int[var21.field3849.length][];
                            }
                            if (this.field2923[var22] == null) {
                                int[] var29 = this.field2923[var22] = new int[15];
                                if (var25 == 0 && var26 == 0 && var28 == 0) {
                                    var29[14] = -var27;
                                    var29[13] = -var24;
                                    var29[0] = var29[4] = var29[8] = 32768;
                                    var29[12] = -var23;
                                } else {
                                    int var30 = class224.field3597[var25] >> 1;
                                    int var31 = class224.field3597[var26] >> 1;
                                    int var32 = class224.field3601[var26] >> 1;
                                    int var33 = class224.field3601[var28] >> 1;
                                    int var34 = class224.field3597[var28] >> 1;
                                    int var35 = class224.field3601[var25] >> 1;
                                    var29[4] = var30 * var34 + 16384 >> 15;
                                    var29[3] = var30 * var33 + 16384 >> 15;
                                    var29[8] = var30 * var31 + 16384 >> 15;
                                    var29[2] = var30 * var32 + 16384 >> 15;
                                    var29[5] = -var35;
                                    int var36 = var33 * var35 + 16384 >> 15;
                                    var29[14] = var29[5] * -var24 + (var29[2] * -var23 + (var29[8] * -var27)) + 16384 >> 15;
                                    var29[6] = -var32 * var34 + (var31 * var36) + 16384 >> 15;
                                    var29[0] = var31 * var34 + var32 * var36 + 16384 >> 15;
                                    int var37 = var34 * var35 + 16384 >> 15;
                                    var29[12] = var29[3] * -var24 + var29[6] * -var27 + var29[0] * -var23 + 16384 >> 15;
                                    var29[7] = -var32 * -var33 + (var31 * var37) + 16384 >> 15;
                                    var29[1] = var32 * var37 + -var33 * var31 + 16384 >> 15;
                                    var29[13] = var29[1] * -var23 + (var29[4] * -var24) + var29[7] * -var27 + 16384 >> 15;
                                }
                                var29[9] = var23;
                                var29[10] = var24;
                                var29[11] = var27;
                            }
                            if (var25 != 0 || var26 != 0 || var28 != 0) {
                                var19[var22].method1855(var25, var26, var28);
                            }
                            if (var23 != 0 || var24 != 0 || var27 != 0) {
                                var19[var22].method1850(var23, var24, var27);
                            }
                        }
                    }
                }
                class271 var38 = new class271(var19, var19.length);
                for (int var39 = 0; var39 < 5; var39++) {
                    if (class74.field1145[var39].length > this.field2921[var39]) {
                        var38.method1847(class127.field1912[var39], class74.field1145[var39][this.field2921[var39]]);
                    }
                    if (this.field2921[var39] < class163.field2467[var39].length) {
                        var38.method1847(class107.field1673[var39], class163.field2467[var39][this.field2921[var39]]);
                    }
                }
                var16 = var38.method1844(64, 850, -30, -50, -30);
                if (arg9) {
                    class188.field2959.method1167((byte) 100, var16, var12);
                    this.field2933 = var12;
                }
            }
        }
        boolean var44 = false;
        boolean var45 = false;
        boolean var46 = false;
        boolean var47 = false;
        int var48 = arg5 == null ? 0 : arg5.length;
        for (int var49 = 0; var49 < var48; var49++) {
            if (arg5[var49] != null) {
                class103 var72 = class250.method1700(arg5[var49].field3696, -108);
                if (var72.field1606 != null) {
                    var44 = true;
                    class148.field2204[var49] = var72;
                    int var73 = arg5[var49].field3699;
                    int var74 = arg5[var49].field3695;
                    int var75 = var72.field1606[var73];
                    class54.field850[var49] = class208.method1454((byte) 27, var75 >>> 16);
                    int var76 = var75 & 0xFFFF;
                    class231.field3660[var49] = var76;
                    if (class54.field850[var49] != null) {
                        var46 |= class54.field850[var49].method415(var76, (byte) -101);
                        var45 |= class54.field850[var49].method416(true, var76);
                        var47 |= var72.field1605;
                    }
                    if ((var72.field1613 || class305.field4896) && var74 != -1 && var74 < var72.field1606.length) {
                        class308.field4931[var49] = var72.field1602[var73];
                        class308.field4937[var49] = arg5[var49].field3701;
                        int var77 = var72.field1606[var74];
                        class73.field1124[var49] = class208.method1454((byte) -122, var77 >>> 16);
                        int var78 = var77 & 0xFFFF;
                        class240.field3828[var49] = var78;
                        if (class73.field1124[var49] != null) {
                            var46 |= class73.field1124[var49].method415(var78, (byte) 27);
                            var45 |= class73.field1124[var49].method416(true, var78);
                        }
                    } else {
                        class308.field4931[var49] = 0;
                        class308.field4937[var49] = 0;
                        class73.field1124[var49] = null;
                        class240.field3828[var49] = -1;
                    }
                }
            }
        }
        if (!var44 && arg3 == null && arg0 == null) {
            return var16;
        }
        int var50 = -1;
        int var51 = -1;
        int var52 = 0;
        class50 var53 = null;
        class50 var54 = null;
        if (arg3 != null) {
            int var55 = arg3.field1606[arg7];
            int var56 = var55 >>> 16;
            var50 = var55 & 0xFFFF;
            var54 = class208.method1454((byte) -127, var56);
            if (var54 != null) {
                var46 |= var54.method415(var50, (byte) -83);
                var45 |= var54.method416(true, var50);
                var47 |= arg3.field1605;
            }
            if ((arg3.field1613 || class305.field4896) && arg6 != -1 && arg3.field1606.length > arg6) {
                var52 = arg3.field1602[arg7];
                int var57 = arg3.field1606[arg6];
                int var58 = var57 >>> 16;
                var51 = var57 & 0xFFFF;
                if (var56 == var58) {
                    var53 = var54;
                } else {
                    var53 = class208.method1454((byte) -128, var51 >>> 16);
                }
                if (var53 != null) {
                    var46 |= var53.method415(var51, (byte) 59);
                    var45 |= var53.method416(true, var51);
                }
            }
        }
        int var59 = -1;
        int var60 = -1;
        int var61 = 0;
        class50 var62 = null;
        class50 var63 = null;
        if (arg0 != null) {
            int var64 = arg0.field1606[arg2];
            int var65 = var64 >>> 16;
            var63 = class208.method1454((byte) -106, var65);
            var60 = var64 & 0xFFFF;
            if (var63 != null) {
                var46 |= var63.method415(var60, (byte) 41);
                var45 |= var63.method416(true, var60);
                var47 |= arg0.field1605;
            }
            if ((arg0.field1613 || class305.field4896) && arg1 != -1 && arg0.field1606.length > arg1) {
                int var66 = arg0.field1606[arg1];
                var61 = arg0.field1602[arg2];
                int var67 = var66 >>> 16;
                var59 = var66 & 0xFFFF;
                if (var65 == var67) {
                    var62 = var63;
                } else {
                    var62 = class208.method1454((byte) 69, var59 >>> 16);
                }
                if (var62 != null) {
                    var46 |= var62.method415(var59, (byte) 108);
                    var45 |= var62.method416(true, var59);
                }
            }
        }
        class11 var68 = var16.method90(!var45, !var46, !var47);
        int var69 = 0;
        int var70 = 1;
        while (var48 > var69) {
            if (class54.field850[var69] != null) {
                var68.method80(class54.field850[var69], class231.field3660[var69], class73.field1124[var69], class240.field3828[var69], class308.field4937[var69] - 1, class308.field4931[var69], var70, class148.field2204[var69].field1605, this.field2923[var69]);
            }
            var69++;
            var70 <<= 0x1;
        }
        if (var54 != null && var63 != null) {
            var68.method95(var54, var50, var53, var51, arg4 - 1, var52, var63, var60, var62, var59, arg10 - 1, var61, arg3.field1614, arg0.field1605 | arg3.field1605);
        } else if (var54 != null) {
            var68.method71(var54, var50, var53, var51, arg4 - 1, var52, arg3.field1605);
        } else if (var63 != null) {
            var68.method71(var63, var60, var62, var59, arg10 - 1, var61, arg0.field1605);
        }
        for (int var71 = 0; var71 < var48; var71++) {
            class54.field850[var71] = null;
            class73.field1124[var71] = null;
            class148.field2204[var71] = null;
        }
        return var68;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(BII)V")
    public final void method1330(byte arg0, int arg1, int arg2) {
        field2930++;
        this.field2921[arg1] = arg2;
        if (arg0 >= -112) {
            this.method1329((class103) null, 51, -99, (class103) null, -23, (class234[]) null, 80, 75, 93, false, 107);
        }
        this.method1327(true);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IBLpk;II)Lhd;")
    public final class11 method1331(int arg0, byte arg1, class103 arg2, int arg3, int arg4) {
        field2938++;
        if (this.field2924 != -1) {
            return class175.method1250(this.field2924, (byte) -77).method738(arg2, arg4, -55, arg0, arg3);
        }
        class11 var6 = (class11) class80.field1226.method1173(this.field2936, true);
        if (arg1 != 119) {
            this.field2929 = 80;
        }
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < 12; var8++) {
                int var17 = this.field2928[var8];
                if ((var17 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var17) != 0 && !class185.method1321(arg1 - 116, var17 & 0x3FFFFFFF).method1134(-1)) {
                        var7 = true;
                    }
                } else if (!class123.method929(22497, var17 & 0x3FFFFFFF).method1269(-105, this.field2935)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class271[] var9 = new class271[12];
            int var10 = 0;
            for (int var11 = 0; var11 < 12; var11++) {
                int var14 = this.field2928[var11];
                if ((var14 & 0x40000000) != 0) {
                    class271 var15 = class123.method929(22497, var14 & 0x3FFFFFFF).method1284(88, this.field2935);
                    if (var15 != null) {
                        var9[var10++] = var15;
                    }
                } else if ((Integer.MIN_VALUE & var14) != 0) {
                    class271 var16 = class185.method1321(3, var14 & 0x3FFFFFFF).method1132(false);
                    if (var16 != null) {
                        var9[var10++] = var16;
                    }
                }
            }
            class271 var12 = new class271(var9, var10);
            for (int var13 = 0; var13 < 5; var13++) {
                if (class74.field1145[var13].length > this.field2921[var13]) {
                    var12.method1847(class127.field1912[var13], class74.field1145[var13][this.field2921[var13]]);
                }
                if (this.field2921[var13] < class163.field2467[var13].length) {
                    var12.method1847(class107.field1673[var13], class163.field2467[var13][this.field2921[var13]]);
                }
            }
            var6 = var12.method1844(64, 768, -50, -10, -50);
            class80.field1226.method1167((byte) -55, var6, this.field2936);
        }
        if (arg2 != null) {
            var6 = arg2.method788(arg3, var6, arg0, arg1 ^ 0x2BA5, arg4);
        }
        return var6;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "([IZB[III)V")
    public final void method1332(int[] arg0, boolean arg1, byte arg2, int[] arg3, int arg4, int arg5) {
        field2937++;
        if (arg2 != -33) {
            return;
        }
        if (this.field2929 != arg4) {
            this.field2929 = arg4;
            this.field2923 = null;
        }
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var7 = 0; var7 < 8; var7++) {
                for (int var8 = 0; var8 < class27.field465; var8++) {
                    class157 var9 = class185.method1321(arg2 + 36, var8);
                    if (var9 != null && !var9.field2351 && (arg1 ? client.field2388[var7] : class206.field3170[var7]) == var9.field2338) {
                        arg0[class198.field3083[var7]] = class44.method377(Integer.MIN_VALUE, var8);
                        break;
                    }
                }
            }
        }
        this.field2924 = arg5;
        this.field2935 = arg1;
        this.field2928 = arg0;
        this.field2921 = arg3;
        this.method1327(true);
    }
}
