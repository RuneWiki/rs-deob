import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class209 {

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "Lna;")
    public static class26 field3234 = class69.method505("(U4", (byte) -120);

    @OriginalMember(owner = "client!hh", name = "k", descriptor = "Lna;")
    public static class26 field3244 = class69.method505("::wm0", (byte) -120);

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "Lna;")
    public static class26 field3235 = class69.method505("::tele ", (byte) -120);

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "I")
    public static int field3236;

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "I")
    public static int field3237;

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "I")
    public int field3238;

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "I")
    public static int field3239;

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "I")
    public static int field3240;

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "I")
    public static int field3241;

    @OriginalMember(owner = "client!hh", name = "j", descriptor = "I")
    public static int field3243;

    @OriginalMember(owner = "client!hh", name = "m", descriptor = "I")
    private int field3246;

    @OriginalMember(owner = "client!hh", name = "n", descriptor = "I")
    public static int field3247;

    @OriginalMember(owner = "client!hh", name = "o", descriptor = "I")
    public static int field3248;

    @OriginalMember(owner = "client!hh", name = "s", descriptor = "I")
    public static int field3252;

    @OriginalMember(owner = "client!hh", name = "u", descriptor = "I")
    public static int field3254;

    @OriginalMember(owner = "client!hh", name = "v", descriptor = "I")
    public static int field3255;

    @OriginalMember(owner = "client!hh", name = "i", descriptor = "J")
    private long field3242;

    @OriginalMember(owner = "client!hh", name = "q", descriptor = "J")
    private long field3250;

    @OriginalMember(owner = "client!hh", name = "x", descriptor = "Z")
    public boolean field3257;

    @OriginalMember(owner = "client!hh", name = "l", descriptor = "[I")
    private int[] field3245;

    @OriginalMember(owner = "client!hh", name = "p", descriptor = "[I")
    public static int[] field3249;

    @OriginalMember(owner = "client!hh", name = "r", descriptor = "[I")
    public static int[] field3251;

    @OriginalMember(owner = "client!hh", name = "t", descriptor = "[I")
    private int[] field3253;

    @OriginalMember(owner = "client!hh", name = "w", descriptor = "[[I")
    private int[][] field3256;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIILtk;III)Lak;", line = 9)
    public final class311 method1395(int arg0, int arg1, int arg2, int arg3, class249 arg4, int arg5, int arg6, int arg7) {
        if (arg7 != -2012759707) {
            this.field3238 = -32;
        }
        field3239++;
        long var9 = (long) arg2 | (long) (arg6 << 16) | (long) arg1 << 32;
        class311 var11 = (class311) class295.field4909.method1989(var9, (byte) 121);
        if (var11 == null) {
            class169[] var12 = new class169[3];
            int var13 = 0;
            if (!class72.method515(arg2, 0).method2005(arg7 ^ 0x8807F34A) || !class72.method515(arg6, 0).method2005(18991) || !class72.method515(arg1, 0).method2005(18991)) {
                return null;
            }
            class169 var14 = class72.method515(arg2, 0).method1998(true);
            if (var14 != null) {
                var12[var13++] = var14;
            }
            class169 var15 = class72.method515(arg6, 0).method1998(true);
            if (var15 != null) {
                var12[var13++] = var15;
            }
            class169 var16 = class72.method515(arg1, 0).method1998(true);
            if (var16 != null) {
                var12[var13++] = var16;
            }
            class169 var17 = new class169(var12, var13);
            for (int var18 = 0; var18 < 5; var18++) {
                if (this.field3253[var18] < class316.field5408[var18].length) {
                    var17.method1167(class186.field2889[var18], class316.field5408[var18][this.field3253[var18]]);
                }
                if (class225.field3576[var18].length > this.field3253[var18]) {
                    var17.method1167(class228.field3621[var18], class225.field3576[var18][this.field3253[var18]]);
                }
            }
            var11 = var17.method1159(64, 768, -50, -10, -50);
            class295.field4909.method1978((byte) -111, var11, var9);
        }
        if (arg4 != null) {
            var11 = arg4.method1709(var11, (byte) -86, arg0, arg3, arg5);
        }
        return var11;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V", line = 80)
    private final void method1396(int arg0) {
        field3248++;
        long var2 = this.field3250;
        this.field3250 = -1L;
        long[] var4 = class251.field4098;
        this.field3250 = var4[(int) (((long) (this.field3246 >> 8) ^ this.field3250) & 0xFFL)] ^ this.field3250 >>> 8;
        this.field3250 = var4[(int) ((this.field3250 ^ (long) this.field3246) & 0xFFL)] ^ this.field3250 >>> 8;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field3250 = this.field3250 >>> 8 ^ var4[(int) ((this.field3250 ^ (long) (this.field3245[var5] >> 24)) & 0xFFL)];
            this.field3250 = this.field3250 >>> 8 ^ var4[(int) ((this.field3250 ^ (long) (this.field3245[var5] >> 16)) & 0xFFL)];
            this.field3250 = var4[(int) (((long) (this.field3245[var5] >> 8) ^ this.field3250) & 0xFFL)] ^ this.field3250 >>> 8;
            this.field3250 = this.field3250 >>> 8 ^ var4[(int) ((this.field3250 ^ (long) this.field3245[var5]) & 0xFFL)];
        }
        if (arg0 != 459557008) {
            this.field3253 = (int[]) null;
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field3250 = var4[(int) (((long) this.field3253[var6] ^ this.field3250) & 0xFFL)] ^ this.field3250 >>> 8;
        }
        this.field3250 = var4[(int) (((long) (this.field3257 ? 1 : 0) ^ this.field3250) & 0xFFL)] ^ this.field3250 >>> 8;
        if (var2 != 0L && this.field3250 != var2) {
            class22.field315.method1981(var2, (byte) -124);
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ZZ)V", line = 124)
    public final void method1397(boolean arg0, boolean arg1) {
        field3237++;
        if (!arg1) {
            field3249 = (int[]) null;
        }
        this.field3257 = arg0;
        this.method1396(459557008);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(II)V", line = 139)
    public static final void method1398(int arg0, int arg1) {
        field3243++;
        if (class71.method509(arg1, 104)) {
            if (arg0 > -100) {
                method1406(52);
            }
            class140.method935(23206, -1, class86.field1416[arg1]);
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "([IIZI[II)V", line = 155)
    public final void method1399(int[] arg0, int arg1, boolean arg2, int arg3, int[] arg4, int arg5) {
        field3240++;
        if (this.field3246 != arg5) {
            this.field3246 = arg5;
            this.field3256 = (int[][]) null;
        }
        if (arg4 == null) {
            arg4 = new int[12];
            for (int var7 = 0; var7 < 8; var7++) {
                for (int var8 = 0; var8 < class39.field655; var8++) {
                    class284 var9 = class72.method515(var8, 0);
                    if (var9 != null && !var9.field4767 && var9.field4751 == (arg2 ? class181.field2825[var7] : class301.field5190[var7])) {
                        arg4[class81.field1267[var7]] = class240.method1652(Integer.MIN_VALUE, var8);
                        break;
                    }
                }
            }
        }
        this.field3238 = arg1;
        this.field3257 = arg2;
        if (arg3 == 0) {
            this.field3253 = arg0;
            this.field3245 = arg4;
            this.method1396(arg3 + 459557008);
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IZI)V", line = 205)
    public final void method1400(int arg0, boolean arg1, int arg2) {
        this.field3253[arg0] = arg2;
        field3241++;
        this.method1396(459557008);
        if (arg1) {
            this.method1397(false, false);
        }
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)I", line = 223)
    public final int method1401(int arg0) {
        field3255++;
        if (arg0 != -24861) {
            field3249 = (int[]) null;
        }
        return this.field3238 == -1 ? (this.field3245[8] << 10) + ((this.field3253[0] << 25) + (this.field3253[4] << 20)) - (-(this.field3245[0] << 15) - ((this.field3245[11] << 5) + this.field3245[1])) : class96.method720(this.field3238, arg0 + 51973).field2943 + 305419896;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(III)V", line = 239)
    public final void method1402(int arg0, int arg1, int arg2) {
        field3252++;
        int var4 = class81.field1267[arg0];
        if (this.field3245[var4] != 0 && class72.method515(arg1, arg2) != null) {
            this.field3245[var4] = class240.method1652(arg1, Integer.MIN_VALUE);
            this.method1396(459557008);
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "([Lub;ILtk;Ltk;IIIIZII)Lak;", line = 257)
    public final class311 method1403(class21[] arg0, int arg1, class249 arg2, class249 arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10) {
        field3254++;
        int var12 = 102 % ((arg6 + 39) / 61);
        if (this.field3238 != -1) {
            return class96.method720(this.field3238, 27112).method1278(arg0, arg5, (byte) -128, arg10, arg1, arg7, arg9, arg2, arg4, arg3);
        }
        int[] var13 = this.field3245;
        long var14 = this.field3250;
        if (arg3 != null && (arg3.field4056 >= 0 || arg3.field4049 >= 0)) {
            var13 = new int[12];
            for (int var16 = 0; var16 < 12; var16++) {
                var13[var16] = this.field3245[var16];
            }
            if (arg3.field4056 >= 0) {
                if (arg3.field4056 == 65535) {
                    var14 ^= 0xFFFFFFFF00000000L;
                    var13[5] = 0;
                } else {
                    var13[5] = class240.method1652(1073741824, arg3.field4056);
                    var14 ^= (long) var13[5] << 32;
                }
            }
            if (arg3.field4049 >= 0) {
                if (arg3.field4049 == 65535) {
                    var13[3] = 0;
                    var14 ^= 0xFFFFFFFFL;
                } else {
                    var13[3] = class240.method1652(1073741824, arg3.field4049);
                    var14 ^= (long) var13[3];
                }
            }
        }
        class311 var17 = (class311) class22.field315.method1989(var14, (byte) 121);
        if (var17 == null) {
            boolean var18 = false;
            for (int var19 = 0; var19 < 12; var19++) {
                int var20 = var13[var19];
                if ((var20 & 0x40000000) == 0) {
                    if ((var20 & Integer.MIN_VALUE) != 0 && !class72.method515(var20 & 0x3FFFFFFF, 0).method1999(101)) {
                        var18 = true;
                    }
                } else if (!class45.method341(var20 & 0x3FFFFFFF, (byte) 92).method1458((byte) 95, this.field3257)) {
                    var18 = true;
                }
            }
            if (var18) {
                if (this.field3242 != -1L) {
                    var17 = (class311) class22.field315.method1989(this.field3242, (byte) 121);
                }
                if (var17 == null) {
                    return null;
                }
            }
            if (var17 == null) {
                class169[] var21 = new class169[12];
                for (int var22 = 0; var22 < 12; var22++) {
                    int var23 = var13[var22];
                    if ((var23 & 0x40000000) != 0) {
                        class169 var25 = class45.method341(var23 & 0x3FFFFFFF, (byte) 115).method1467(this.field3257, 80);
                        if (var25 != null) {
                            var21[var22] = var25;
                        }
                    } else if ((Integer.MIN_VALUE & var23) != 0) {
                        class169 var24 = class72.method515(var23 & 0x3FFFFFFF, 0).method2004((byte) -26);
                        if (var24 != null) {
                            var21[var22] = var24;
                        }
                    }
                }
                class236 var26 = null;
                if (this.field3246 != -1) {
                    var26 = class35.method300(false, this.field3246);
                }
                if (var26 != null && var26.field3741 != null) {
                    for (int var27 = 0; var27 < var26.field3741.length; var27++) {
                        if (var26.field3741[var27] != null && var21[var27] != null) {
                            int var28 = var26.field3741[var27][0];
                            int var29 = var26.field3741[var27][1];
                            int var30 = var26.field3741[var27][2];
                            int var31 = var26.field3741[var27][4];
                            int var32 = var26.field3741[var27][3];
                            int var33 = var26.field3741[var27][5];
                            if (this.field3256 == null) {
                                this.field3256 = new int[var26.field3741.length][];
                            }
                            if (this.field3256[var27] == null) {
                                int[] var34 = this.field3256[var27] = new int[15];
                                if (var32 == 0 && var31 == 0 && var33 == 0) {
                                    var34[12] = -var28;
                                    var34[13] = -var29;
                                    var34[0] = var34[4] = var34[8] = 32768;
                                    var34[14] = -var30;
                                } else {
                                    int var35 = class200.field3115[var32] >> 1;
                                    int var36 = class200.field3104[var32] >> 1;
                                    int var37 = class200.field3115[var31] >> 1;
                                    int var38 = class200.field3104[var31] >> 1;
                                    int var39 = class200.field3115[var33] >> 1;
                                    int var40 = class200.field3104[var33] >> 1;
                                    var34[4] = var35 * var39 + 16384 >> 15;
                                    var34[5] = -var36;
                                    var34[3] = var35 * var40 + 16384 >> 15;
                                    var34[2] = var35 * var38 + 16384 >> 15;
                                    var34[8] = var35 * var37 + 16384 >> 15;
                                    int var41 = var36 * var40 + 16384 >> 15;
                                    var34[0] = var37 * var39 + var38 * var41 + 16384 >> 15;
                                    var34[14] = var34[2] * -var28 + var34[8] * -var30 + var34[5] * -var29 + 16384 >> 15;
                                    var34[6] = var37 * var41 + (-var38 * var39 + 16384) >> 15;
                                    int var42 = var36 * var39 + 16384 >> 15;
                                    var34[7] = var37 * var42 + -var38 * -var40 + 16384 >> 15;
                                    var34[1] = var38 * var42 + (-var40 * var37 + 16384) >> 15;
                                    var34[12] = var34[3] * -var29 + var34[0] * -var28 + var34[6] * -var30 + 16384 >> 15;
                                    var34[13] = var34[7] * -var30 + var34[4] * -var29 + var34[1] * -var28 + 16384 >> 15;
                                }
                                var34[9] = var28;
                                var34[11] = var30;
                                var34[10] = var29;
                            }
                            if (var32 != 0 || var31 != 0 || var33 != 0) {
                                var21[var27].method1164(var32, var31, var33);
                            }
                            if (var28 != 0 || var29 != 0 || var30 != 0) {
                                var21[var27].method1152(var28, var29, var30);
                            }
                        }
                    }
                }
                class169 var43 = new class169(var21, var21.length);
                for (int var44 = 0; var44 < 5; var44++) {
                    if (class316.field5408[var44].length > this.field3253[var44]) {
                        var43.method1167(class186.field2889[var44], class316.field5408[var44][this.field3253[var44]]);
                    }
                    if (class225.field3576[var44].length > this.field3253[var44]) {
                        var43.method1167(class228.field3621[var44], class225.field3576[var44][this.field3253[var44]]);
                    }
                }
                var17 = var43.method1159(64, 850, -30, -50, -30);
                if (class255.field4184) {
                    ((class239) var17).method1626(false, false, true, true, false, false, true);
                }
                if (arg8) {
                    class22.field315.method1978((byte) -115, var17, var14);
                    this.field3242 = var14;
                }
            }
        }
        boolean var45 = false;
        boolean var46 = false;
        int var47 = arg0 == null ? 0 : arg0.length;
        boolean var48 = false;
        boolean var49 = false;
        for (int var50 = 0; var50 < var47; var50++) {
            if (arg0[var50] != null) {
                class249 var51 = client.method1731(arg0[var50].field290, (byte) -20);
                if (var51.field4051 != null) {
                    var45 = true;
                    class269.field4439[var50] = var51;
                    int var52 = arg0[var50].field294;
                    int var53 = arg0[var50].field292;
                    int var54 = var51.field4051[var52];
                    class10.field131[var50] = class224.method1492(var54 >>> 16, 0);
                    int var55 = var54 & 0xFFFF;
                    class86.field1415[var50] = var55;
                    if (class10.field131[var50] != null) {
                        var48 |= class10.field131[var50].method894(var55, (byte) 119);
                        var46 |= class10.field131[var50].method892(1317095745, var55);
                        var49 |= var51.field4048;
                    }
                    if ((var51.field4046 || class301.field5188) && var53 != -1 && var53 < var51.field4051.length) {
                        class307.field5287[var50] = var51.field4076[var52];
                        class46.field734[var50] = arg0[var50].field300;
                        int var56 = var51.field4051[var53];
                        class222.field3515[var50] = class224.method1492(var56 >>> 16, 0);
                        int var57 = var56 & 0xFFFF;
                        class68.field1061[var50] = var57;
                        if (class222.field3515[var50] != null) {
                            var48 |= class222.field3515[var50].method894(var57, (byte) 117);
                            var46 |= class222.field3515[var50].method892(1317095745, var57);
                        }
                    } else {
                        class307.field5287[var50] = 0;
                        class46.field734[var50] = 0;
                        class222.field3515[var50] = null;
                        class68.field1061[var50] = -1;
                    }
                }
            }
        }
        if (!var45 && arg3 == null && arg2 == null) {
            return var17;
        }
        int var58 = -1;
        int var59 = -1;
        int var60 = 0;
        class132 var61 = null;
        class132 var62 = null;
        if (arg3 != null) {
            int var63 = arg3.field4051[arg9];
            int var64 = var63 >>> 16;
            var62 = class224.method1492(var64, 0);
            var58 = var63 & 0xFFFF;
            if (var62 != null) {
                var48 |= var62.method894(var58, (byte) 124);
                var46 |= var62.method892(1317095745, var58);
                var49 |= arg3.field4048;
            }
            if ((arg3.field4046 || class301.field5188) && arg1 != -1 && arg3.field4051.length > arg1) {
                int var65 = arg3.field4051[arg1];
                int var66 = var65 >>> 16;
                var59 = var65 & 0xFFFF;
                var60 = arg3.field4076[arg9];
                if (var64 == var66) {
                    var61 = var62;
                } else {
                    var61 = class224.method1492(var59 >>> 16, 0);
                }
                if (var61 != null) {
                    var48 |= var61.method894(var59, (byte) 122);
                    var46 |= var61.method892(1317095745, var59);
                }
            }
        }
        int var67 = -1;
        int var68 = -1;
        class132 var69 = null;
        class132 var70 = null;
        int var71 = 0;
        if (arg2 != null) {
            int var72 = arg2.field4051[arg10];
            int var73 = var72 >>> 16;
            var67 = var72 & 0xFFFF;
            var69 = class224.method1492(var73, 0);
            if (var69 != null) {
                var48 |= var69.method894(var67, (byte) 123);
                var46 |= var69.method892(1317095745, var67);
                var49 |= arg2.field4048;
            }
            if ((arg2.field4046 || class301.field5188) && arg5 != -1 && arg2.field4051.length > arg5) {
                var71 = arg2.field4076[arg10];
                int var74 = arg2.field4051[arg5];
                int var75 = var74 >>> 16;
                var68 = var74 & 0xFFFF;
                if (var73 == var75) {
                    var70 = var69;
                } else {
                    var70 = class224.method1492(var68 >>> 16, 0);
                }
                if (var70 != null) {
                    var48 |= var70.method894(var68, (byte) 122);
                    var46 |= var70.method892(1317095745, var68);
                }
            }
        }
        class311 var76 = var17.method1615(!var46, !var48, !var49);
        int var77 = 0;
        int var78 = 1;
        while (var77 < var47) {
            if (class10.field131[var77] != null) {
                var76.method2168(class10.field131[var77], class86.field1415[var77], class222.field3515[var77], class68.field1061[var77], class46.field734[var77] - 1, class307.field5287[var77], var78, class269.field4439[var77].field4048, this.field3256[var77]);
            }
            var77++;
            var78 <<= 0x1;
        }
        if (var62 != null && var69 != null) {
            var76.method2169(var62, var58, var61, var59, arg7 - 1, var60, var69, var67, var70, var68, arg4 - 1, var71, arg3.field4058, arg3.field4048 | arg2.field4048);
        } else if (var62 != null) {
            var76.method2167(var62, var58, var61, var59, arg7 - 1, var60, arg3.field4048);
        } else if (var69 != null) {
            var76.method2167(var69, var67, var70, var68, arg4 - 1, var71, arg2.field4048);
        }
        for (int var79 = 0; var79 < var47; var79++) {
            class10.field131[var79] = null;
            class222.field3515[var79] = null;
            class269.field4439[var79] = null;
        }
        return var76;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IBIIIIIIIIIZI)Z", line = 728)
    public static final boolean method1404(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, boolean arg11, int arg12) {
        for (int var13 = 0; var13 < 104; var13++) {
            for (int var14 = 0; var14 < 104; var14++) {
                class124.field1923[var13][var14] = 0;
                class314.field5375[var13][var14] = 99999999;
            }
        }
        int var15 = arg9;
        int var16 = arg12;
        field3247++;
        class124.field1923[arg9][arg12] = 99;
        class314.field5375[arg9][arg12] = 0;
        byte var17 = 0;
        if (arg1 != 34) {
            return true;
        }
        class190.field2988[var17] = arg9;
        int var41 = var17 + 1;
        class7.field79[var17] = arg12;
        int var18 = 0;
        boolean var19 = false;
        int[][] var20 = class218.field3479[class279.field4651].field3605;
        label401: while (var41 != var18) {
            var15 = class190.field2988[var18];
            var16 = class7.field79[var18];
            var18 = var18 + 1 & 0xFFF;
            if (arg6 == var15 && arg0 == var16) {
                var19 = true;
                break;
            }
            if (arg7 != 0) {
                if ((arg7 < 5 || arg7 == 10) && class218.field3479[class279.field4651].method1523(arg0, var15, false, var16, arg6, arg7 - 1, arg5, arg4)) {
                    var19 = true;
                    break;
                }
                if (arg7 < 10 && class218.field3479[class279.field4651].method1527(arg0, arg7 - 1, arg6, var16, arg5, arg4, var15, 95)) {
                    var19 = true;
                    break;
                }
            }
            if (arg2 != 0 && arg10 != 0 && class218.field3479[class279.field4651].method1533(true, arg6, var16, var15, arg5, arg2, arg8, arg0, arg10)) {
                var19 = true;
                break;
            }
            int var21 = class314.field5375[var15][var16] + 1;
            if (var15 > 0 && class124.field1923[var15 - 1][var16] == 0 && (var20[var15 - 1][var16] & 0x12C010E) == 0 && (var20[var15 - 1][arg5 + var16 - 1] & 0x12C0138) == 0) {
                int var22 = 1;
                while (true) {
                    if (arg5 - 1 <= var22) {
                        class190.field2988[var41] = var15 - 1;
                        class7.field79[var41] = var16;
                        class124.field1923[var15 - 1][var16] = 2;
                        var41 = var41 + 1 & 0xFFF;
                        class314.field5375[var15 - 1][var16] = var21;
                        break;
                    }
                    if ((var20[var15 - 1][var16 + var22] & 0x12C013E) != 0) {
                        break;
                    }
                    var22++;
                }
            }
            if (var15 < 102 && class124.field1923[var15 + 1][var16] == 0 && (var20[arg5 + var15][var16] & 0x12C0183) == 0 && (var20[arg5 + var15][arg5 + var16 - 1] & 0x12C01E0) == 0) {
                int var23 = 1;
                while (true) {
                    if (var23 >= arg5 - 1) {
                        class190.field2988[var41] = var15 + 1;
                        class7.field79[var41] = var16;
                        class124.field1923[var15 + 1][var16] = 8;
                        class314.field5375[var15 + 1][var16] = var21;
                        var41 = var41 + 1 & 0xFFF;
                        break;
                    }
                    if ((var20[arg5 + var15][var16 + var23] & 0x12C01E3) != 0) {
                        break;
                    }
                    var23++;
                }
            }
            if (var16 > 0 && class124.field1923[var15][var16 - 1] == 0 && (var20[var15][var16 - 1] & 0x12C010E) == 0 && (var20[arg5 + var15 - 1][var16 - 1] & 0x12C0183) == 0) {
                int var24 = 1;
                while (true) {
                    if (arg5 - 1 <= var24) {
                        class190.field2988[var41] = var15;
                        class7.field79[var41] = var16 - 1;
                        class124.field1923[var15][var16 - 1] = 1;
                        var41 = var41 + 1 & 0xFFF;
                        class314.field5375[var15][var16 - 1] = var21;
                        break;
                    }
                    if ((var20[var15 + var24][var16 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var24++;
                }
            }
            if (var16 < 102 && class124.field1923[var15][var16 + 1] == 0 && (var20[var15][arg5 + var16] & 0x12C0138) == 0 && (var20[var15 + arg5 - 1][arg5 + var16] & 0x12C01E0) == 0) {
                int var25 = 1;
                while (true) {
                    if (var25 >= (arg5 - 1)) {
                        class190.field2988[var41] = var15;
                        class7.field79[var41] = var16 + 1;
                        class124.field1923[var15][var16 + 1] = 4;
                        class314.field5375[var15][var16 + 1] = var21;
                        var41 = var41 + 1 & 0xFFF;
                        break;
                    }
                    if ((var20[var15 + var25][arg5 + var16] & 0x12C01F8) != 0) {
                        break;
                    }
                    var25++;
                }
            }
            if (var15 > 0 && var16 > 0 && class124.field1923[var15 - 1][var16 - 1] == 0 && (var20[var15 - 1][var16 + arg5 - 1 - 1] & 0x12C0138) == 0 && (var20[var15 - 1][var16 - 1] & 0x12C010E) == 0 && (var20[var15 + arg5 - 1 - 1][var16 - 1] & 0x12C0183) == 0) {
                int var26 = 1;
                while (true) {
                    if (arg5 - 1 <= var26) {
                        class190.field2988[var41] = var15 - 1;
                        class7.field79[var41] = var16 - 1;
                        var41 = var41 + 1 & 0xFFF;
                        class124.field1923[var15 - 1][var16 - 1] = 3;
                        class314.field5375[var15 - 1][var16 - 1] = var21;
                        break;
                    }
                    if ((var20[var15 - 1][var16 + var26 - 1] & 0x12C013E) != 0 || (var20[var26 + var15 - 1][var16 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var26++;
                }
            }
            if (var15 < 102 && var16 > 0 && class124.field1923[var15 + 1][var16 - 1] == 0 && (var20[var15 + 1][var16 - 1] & 0x12C010E) == 0 && (var20[arg5 + var15][var16 - 1] & 0x12C0183) == 0 && (var20[var15 + arg5][arg5 + var16 - 1 - 1] & 0x12C01E0) == 0) {
                int var27 = 1;
                while (true) {
                    if (var27 >= (arg5 - 1)) {
                        class190.field2988[var41] = var15 + 1;
                        class7.field79[var41] = var16 - 1;
                        var41 = var41 + 1 & 0xFFF;
                        class124.field1923[var15 + 1][var16 - 1] = 9;
                        class314.field5375[var15 + 1][var16 - 1] = var21;
                        break;
                    }
                    if ((var20[arg5 + var15][var16 - (1 - var27)] & 0x12C01E3) != 0 || (var20[var15 + var27 + 1][var16 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var27++;
                }
            }
            if (var15 > 0 && var16 < 102 && class124.field1923[var15 - 1][var16 + 1] == 0 && (var20[var15 - 1][var16 + 1] & 0x12C010E) == 0 && (var20[var15 - 1][arg5 + var16] & 0x12C0138) == 0 && (var20[var15][arg5 + var16] & 0x12C01E0) == 0) {
                int var28 = 1;
                while (true) {
                    if (arg5 - 1 <= var28) {
                        class190.field2988[var41] = var15 - 1;
                        class7.field79[var41] = var16 + 1;
                        var41 = var41 + 1 & 0xFFF;
                        class124.field1923[var15 - 1][var16 + 1] = 6;
                        class314.field5375[var15 - 1][var16 + 1] = var21;
                        break;
                    }
                    if ((var20[var15 - 1][var16 + var28 + 1] & 0x12C013E) != 0 || (var20[var15 + var28 - 1][arg5 + var16] & 0x12C01F8) != 0) {
                        break;
                    }
                    var28++;
                }
            }
            if (var15 < 102 && var16 < 102 && class124.field1923[var15 + 1][var16 + 1] == 0 && (var20[var15 + 1][arg5 + var16] & 0x12C0138) == 0 && (var20[var15 + arg5][arg5 + var16] & 0x12C01E0) == 0 && (var20[arg5 + var15][var16 + 1] & 0x12C0183) == 0) {
                for (int var29 = 1; var29 < arg5 - 1; var29++) {
                    if ((var20[var15 + var29 + 1][var16 + arg5] & 0x12C01F8) != 0 || (var20[arg5 + var15][var16 + var29 + 1] & 0x12C01E3) != 0) {
                        continue label401;
                    }
                }
                class190.field2988[var41] = var15 + 1;
                class7.field79[var41] = var16 + 1;
                class124.field1923[var15 + 1][var16 + 1] = 12;
                class314.field5375[var15 + 1][var16 + 1] = var21;
                var41 = var41 + 1 & 0xFFF;
            }
        }
        class271.field4529 = 0;
        if (!var19) {
            if (!arg11) {
                return false;
            }
            int var30 = 1000;
            int var31 = 100;
            byte var32 = 10;
            for (int var33 = arg6 - var32; var33 <= arg6 + var32; var33++) {
                for (int var34 = arg0 - var32; var34 <= (arg0 + var32); var34++) {
                    if (var33 >= 0 && var34 >= 0 && var33 < 104 && var34 < 104 && class314.field5375[var33][var34] < 100) {
                        int var35 = 0;
                        if (arg6 > var33) {
                            var35 = arg6 - var33;
                        } else if ((arg6 - (1 - arg2)) < var33) {
                            var35 = var33 + 1 - arg6 - arg2;
                        }
                        int var36 = 0;
                        if (var34 < arg0) {
                            var36 = arg0 - var34;
                        } else if ((arg0 + arg10 - 1) < var34) {
                            var36 = var34 + 1 - arg0 - arg10;
                        }
                        int var37 = var35 * var35 + var36 * var36;
                        if (var37 < var30 || var30 == var37 && var31 > class314.field5375[var33][var34]) {
                            var31 = class314.field5375[var33][var34];
                            var15 = var33;
                            var30 = var37;
                            var16 = var34;
                        }
                    }
                }
            }
            if (var30 == 1000) {
                return false;
            }
            if (arg9 == var15 && arg12 == var16) {
                return false;
            }
            class271.field4529 = 1;
        }
        byte var38 = 0;
        class190.field2988[var38] = var15;
        int var42 = var38 + 1;
        class7.field79[var38] = var16;
        int var39;
        int var40 = var39 = class124.field1923[var15][var16];
        while (arg9 != var15 || arg12 != var16) {
            if (var39 != var40) {
                class190.field2988[var42] = var15;
                var39 = var40;
                class7.field79[var42++] = var16;
            }
            if ((var40 & 0x2) != 0) {
                var15++;
            } else if ((var40 & 0x8) != 0) {
                var15--;
            }
            if ((var40 & 0x1) != 0) {
                var16++;
            } else if ((var40 & 0x4) != 0) {
                var16--;
            }
            var40 = class124.field1923[var15][var16];
        }
        if (var42 > 0) {
            class309.method2162(93, var42, arg3);
            return true;
        } else if (arg3 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IBLtk;II)Lak;", line = 1218)
    public final class311 method1405(int arg0, byte arg1, class249 arg2, int arg3, int arg4) {
        field3236++;
        if (this.field3238 != -1) {
            return class96.method720(this.field3238, 27112).method1284(arg2, arg0, arg4, -109, arg3);
        }
        class311 var6 = (class311) class295.field4909.method1989(this.field3250, (byte) 121);
        if (arg1 < 122) {
            this.field3253 = (int[]) null;
        }
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < 12; var8++) {
                int var9 = this.field3245[var8];
                if ((var9 & 0x40000000) == 0) {
                    if ((var9 & Integer.MIN_VALUE) != 0 && !class72.method515(var9 & 0x3FFFFFFF, 0).method2005(18991)) {
                        var7 = true;
                    }
                } else if (!class45.method341(var9 & 0x3FFFFFFF, (byte) 127).method1452(this.field3257, false)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class169[] var10 = new class169[12];
            int var11 = 0;
            for (int var12 = 0; var12 < 12; var12++) {
                int var13 = this.field3245[var12];
                if ((var13 & 0x40000000) != 0) {
                    class169 var15 = class45.method341(var13 & 0x3FFFFFFF, (byte) 89).method1466(this.field3257, (byte) -109);
                    if (var15 != null) {
                        var10[var11++] = var15;
                    }
                } else if ((Integer.MIN_VALUE & var13) != 0) {
                    class169 var14 = class72.method515(var13 & 0x3FFFFFFF, 0).method1998(true);
                    if (var14 != null) {
                        var10[var11++] = var14;
                    }
                }
            }
            class169 var16 = new class169(var10, var11);
            for (int var17 = 0; var17 < 5; var17++) {
                if (class316.field5408[var17].length > this.field3253[var17]) {
                    var16.method1167(class186.field2889[var17], class316.field5408[var17][this.field3253[var17]]);
                }
                if (class225.field3576[var17].length > this.field3253[var17]) {
                    var16.method1167(class228.field3621[var17], class225.field3576[var17][this.field3253[var17]]);
                }
            }
            var6 = var16.method1159(64, 768, -50, -10, -50);
            class295.field4909.method1978((byte) -102, var6, this.field3250);
        }
        if (arg2 != null) {
            var6 = arg2.method1709(var6, (byte) 120, arg4, arg0, arg3);
        }
        return var6;
    }

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "(I)V", line = 1333)
    public static void method1406(int arg0) {
        field3235 = null;
        field3234 = null;
        if (arg0 == 8160) {
            field3249 = null;
            field3244 = null;
            field3251 = null;
        }
    }
}
