import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class230 {

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "I")
    public static int field3611;

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "I")
    public static int field3613;

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "I")
    private int field3614;

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "I")
    public static int field3615;

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "I")
    public static int field3617;

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "I")
    public static int field3618;

    @OriginalMember(owner = "client!jc", name = "l", descriptor = "I")
    public static int field3622;

    @OriginalMember(owner = "client!jc", name = "m", descriptor = "I")
    public static int field3623;

    @OriginalMember(owner = "client!jc", name = "n", descriptor = "I")
    public static int field3624;

    @OriginalMember(owner = "client!jc", name = "o", descriptor = "I")
    public static int field3625;

    @OriginalMember(owner = "client!jc", name = "q", descriptor = "I")
    public static int field3627;

    @OriginalMember(owner = "client!jc", name = "r", descriptor = "I")
    public int field3628;

    @OriginalMember(owner = "client!jc", name = "s", descriptor = "I")
    public static int field3629;

    @OriginalMember(owner = "client!jc", name = "t", descriptor = "I")
    public static int field3630;

    @OriginalMember(owner = "client!jc", name = "i", descriptor = "J")
    private long field3619;

    @OriginalMember(owner = "client!jc", name = "j", descriptor = "J")
    private long field3620;

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "Z")
    public boolean field3612;

    @OriginalMember(owner = "client!jc", name = "k", descriptor = "[I")
    private int[] field3621;

    @OriginalMember(owner = "client!jc", name = "p", descriptor = "[I")
    public int[] field3626;

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "[[I")
    private int[][] field3616;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZB)V", line = 4)
    public final void method1517(boolean arg0, byte arg1) {
        field3611++;
        if (arg1 <= -114) {
            this.field3612 = arg0;
            this.method1525(0);
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILdn;IIIIII)Lbg;", line = 21)
    public final class309 method1518(int arg0, class260 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg2 != 1073741823) {
            this.field3628 = -6;
        }
        long var9 = (long) arg3 | (long) arg6 << 32 | (long) (arg0 << 16);
        field3627++;
        class309 var11 = (class309) class151.field2463.method1881(true, var9);
        if (var11 == null) {
            class3[] var12 = new class3[3];
            int var13 = 0;
            if (!class112.method723((byte) -110, arg3).method105(0) || !class112.method723((byte) -110, arg0).method105(0) || !class112.method723((byte) -110, arg6).method105(arg2 - 1073741823)) {
                return null;
            }
            class3 var14 = class112.method723((byte) -110, arg3).method102(-22282);
            if (var14 != null) {
                var12[var13++] = var14;
            }
            class3 var15 = class112.method723((byte) -110, arg0).method102(-22282);
            if (var15 != null) {
                var12[var13++] = var15;
            }
            class3 var16 = class112.method723((byte) -110, arg6).method102(arg2 - 1073764105);
            if (var16 != null) {
                var12[var13++] = var16;
            }
            class3 var17 = new class3(var12, var13);
            for (int var18 = 0; var18 < 5; var18++) {
                if (this.field3626[var18] < class44.field859[var18].length) {
                    var17.method48(class232.field3640[var18], class44.field859[var18][this.field3626[var18]]);
                }
                if (this.field3626[var18] < class40.field770[var18].length) {
                    var17.method48(class218.field3461[var18], class40.field770[var18][this.field3626[var18]]);
                }
            }
            var11 = var17.method28(64, 768, -50, -10, -50);
            class151.field2463.method1880(var11, var9, 101);
        }
        if (arg1 != null) {
            var11 = arg1.method1746(var11, (byte) 43, arg5, arg7, arg4);
        }
        return var11;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIB)V", line = 93)
    public final void method1519(int arg0, int arg1, byte arg2) {
        field3618++;
        int var4 = class163.field2631[arg0];
        if (this.field3621[var4] == 0 || class112.method723((byte) -110, arg1) == null) {
            return;
        }
        this.field3621[var4] = class212.method1434(arg1, Integer.MIN_VALUE);
        if (arg2 != 44) {
            this.field3628 = -110;
        }
        this.method1525(arg2 ^ 0x2C);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Z[II[III)V", line = 116)
    public final void method1520(boolean arg0, int[] arg1, int arg2, int[] arg3, int arg4, int arg5) {
        field3624++;
        if (this.field3614 != arg4) {
            this.field3616 = (int[][]) null;
            this.field3614 = arg4;
        }
        if (arg3 == null) {
            arg3 = new int[12];
            for (int var7 = 0; var7 < 8; var7++) {
                for (int var8 = 0; var8 < class254.field3970; var8++) {
                    class14 var9 = class112.method723((byte) -110, var8);
                    if (var9 != null && !var9.field266 && var9.field259 == (arg0 ? class313.field4758[var7] : class228.field3608[var7])) {
                        arg3[class163.field2631[var7]] = class212.method1434(var8, Integer.MIN_VALUE);
                        break;
                    }
                }
            }
        }
        this.field3621 = arg3;
        this.field3612 = arg0;
        this.field3628 = arg2;
        this.field3626 = arg1;
        this.method1525(arg5 ^ arg5);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIILdn;IBLdn;Z[Lqf;II)Lbg;", line = 168)
    public final class309 method1521(int arg0, int arg1, int arg2, class260 arg3, int arg4, byte arg5, class260 arg6, boolean arg7, class341[] arg8, int arg9, int arg10) {
        field3625++;
        if (this.field3628 != -1) {
            return class19.method130(this.field3628, -5881).method330(arg8, arg10, arg4, arg9, arg3, arg6, arg1, arg0, -73, arg2);
        }
        long var12 = this.field3620;
        int[] var14 = this.field3621;
        if (arg6 != null && (arg6.field4069 >= 0 || arg6.field4058 >= 0)) {
            var14 = new int[12];
            for (int var15 = 0; var15 < 12; var15++) {
                var14[var15] = this.field3621[var15];
            }
            if (arg6.field4069 >= 0) {
                if (arg6.field4069 == 65535) {
                    var14[5] = 0;
                    var12 ^= 0xFFFFFFFF00000000L;
                } else {
                    var14[5] = class212.method1434(1073741824, arg6.field4069);
                    var12 ^= (long) var14[5] << 32;
                }
            }
            if (arg6.field4058 >= 0) {
                if (arg6.field4058 == 65535) {
                    var12 ^= 0xFFFFFFFFL;
                    var14[3] = 0;
                } else {
                    var14[3] = class212.method1434(arg6.field4058, 1073741824);
                    var12 ^= (long) var14[3];
                }
            }
        }
        class309 var16 = (class309) class35.field699.method1881(true, var12);
        if (var16 == null) {
            boolean var17 = false;
            for (int var18 = 0; var18 < 12; var18++) {
                int var19 = var14[var18];
                if ((var19 & 0x40000000) == 0) {
                    if ((var19 & Integer.MIN_VALUE) != 0 && !class112.method723((byte) -110, var19 & 0x3FFFFFFF).method103(-1)) {
                        var17 = true;
                    }
                } else if (!class95.method636(22111, var19 & 0x3FFFFFFF).method2322(this.field3612, -109)) {
                    var17 = true;
                }
            }
            if (var17) {
                if (this.field3619 != -1L) {
                    var16 = (class309) class35.field699.method1881(true, this.field3619);
                }
                if (var16 == null) {
                    return null;
                }
            }
            if (var16 == null) {
                class3[] var20 = new class3[12];
                for (int var21 = 0; var21 < 12; var21++) {
                    int var22 = var14[var21];
                    if ((var22 & 0x40000000) != 0) {
                        class3 var24 = class95.method636(22111, var22 & 0x3FFFFFFF).method2326(this.field3612, false);
                        if (var24 != null) {
                            var20[var21] = var24;
                        }
                    } else if ((var22 & Integer.MIN_VALUE) != 0) {
                        class3 var23 = class112.method723((byte) -110, var22 & 0x3FFFFFFF).method106(1);
                        if (var23 != null) {
                            var20[var21] = var23;
                        }
                    }
                }
                class322 var25 = null;
                if (this.field3614 != -1) {
                    var25 = class186.method1188(32, this.field3614);
                }
                if (var25 != null && var25.field4912 != null) {
                    for (int var26 = 0; var26 < var25.field4912.length; var26++) {
                        if (var25.field4912[var26] != null && var20[var26] != null) {
                            int var27 = var25.field4912[var26][0];
                            int var28 = var25.field4912[var26][1];
                            int var29 = var25.field4912[var26][3];
                            int var30 = var25.field4912[var26][2];
                            int var31 = var25.field4912[var26][5];
                            int var32 = var25.field4912[var26][4];
                            if (this.field3616 == null) {
                                this.field3616 = new int[var25.field4912.length][];
                            }
                            if (this.field3616[var26] == null) {
                                int[] var33 = this.field3616[var26] = new int[15];
                                if (var29 == 0 && var32 == 0 && var31 == 0) {
                                    var33[13] = -var28;
                                    var33[12] = -var27;
                                    var33[0] = var33[4] = var33[8] = 32768;
                                    var33[14] = -var30;
                                } else {
                                    int var34 = class284.field4395[var29] >> 1;
                                    int var35 = class284.field4398[var32] >> 1;
                                    int var36 = class284.field4395[var32] >> 1;
                                    int var37 = class284.field4398[var29] >> 1;
                                    int var38 = class284.field4398[var31] >> 1;
                                    int var39 = class284.field4395[var31] >> 1;
                                    var33[4] = var37 * var38 + 16384 >> 15;
                                    int var40 = var34 * var38 + 16384 >> 15;
                                    int var41 = var34 * var39 + 16384 >> 15;
                                    var33[5] = -var34;
                                    var33[7] = var35 * var40 + -var36 * -var39 + 16384 >> 15;
                                    var33[0] = var36 * var41 + (var35 * var38 + 16384) >> 15;
                                    var33[8] = var35 * var37 + 16384 >> 15;
                                    var33[1] = -var39 * var35 + var36 * var40 + 16384 >> 15;
                                    var33[3] = var37 * var39 + 16384 >> 15;
                                    var33[6] = var35 * var41 + -var36 * var38 + 16384 >> 15;
                                    var33[13] = var33[1] * -var27 + var33[4] * -var28 + var33[7] * -var30 + 16384 >> 15;
                                    var33[2] = var36 * var37 + 16384 >> 15;
                                    var33[14] = var33[8] * -var30 + var33[5] * -var28 + var33[2] * -var27 + 16384 >> 15;
                                    var33[12] = var33[6] * -var30 + (var33[0] * -var27 + (var33[3] * -var28)) + 16384 >> 15;
                                }
                                var33[11] = var30;
                                var33[9] = var27;
                                var33[10] = var28;
                            }
                            if (var29 != 0 || var32 != 0 || var31 != 0) {
                                var20[var26].method43(var29, var32, var31);
                            }
                            if (var27 != 0 || var28 != 0 || var30 != 0) {
                                var20[var26].method51(var27, var28, var30);
                            }
                        }
                    }
                }
                class3 var42 = new class3(var20, var20.length);
                for (int var43 = 0; var43 < 5; var43++) {
                    if (class44.field859[var43].length > this.field3626[var43]) {
                        var42.method48(class232.field3640[var43], class44.field859[var43][this.field3626[var43]]);
                    }
                    if (this.field3626[var43] < class40.field770[var43].length) {
                        var42.method48(class218.field3461[var43], class40.field770[var43][this.field3626[var43]]);
                    }
                }
                var16 = var42.method28(64, 850, -30, -50, -30);
                if (class249.field3893) {
                    ((class184) var16).method1159(false, false, true, true, false, false, true);
                }
                if (arg7) {
                    class35.field699.method1880(var16, var12, 123);
                    this.field3619 = var12;
                }
            }
        }
        int var44 = -123 % ((35 - arg5) / 63);
        boolean var45 = false;
        boolean var46 = false;
        boolean var47 = false;
        int var48 = arg8 == null ? 0 : arg8.length;
        boolean var49 = false;
        for (int var50 = 0; var50 < var48; var50++) {
            if (arg8[var50] != null) {
                class260 var51 = class279.method1882(25397, arg8[var50].field5300);
                if (var51.field4044 != null) {
                    var45 = true;
                    class95.field1704[var50] = var51;
                    int var52 = arg8[var50].field5287;
                    int var53 = arg8[var50].field5295;
                    int var54 = var51.field4044[var53];
                    class252.field3943[var50] = class87.method615(0, var54 >>> 16);
                    int var55 = var54 & 0xFFFF;
                    class235.field3700[var50] = var55;
                    if (class252.field3943[var50] != null) {
                        var47 |= class252.field3943[var50].method1970(var55, false);
                        var46 |= class252.field3943[var50].method1971(-55, var55);
                        var49 |= var51.field4042;
                    }
                    if ((var51.field4061 || class194.field3131) && var52 != -1 && var51.field4044.length > var52) {
                        class269.field4164[var50] = var51.field4041[var53];
                        class276.field4230[var50] = arg8[var50].field5289;
                        int var56 = var51.field4044[var52];
                        class215.field3437[var50] = class87.method615(0, var56 >>> 16);
                        int var57 = var56 & 0xFFFF;
                        class103.field1785[var50] = var57;
                        if (class215.field3437[var50] != null) {
                            var47 |= class215.field3437[var50].method1970(var57, false);
                            var46 |= class215.field3437[var50].method1971(-44, var57);
                        }
                    } else {
                        class269.field4164[var50] = 0;
                        class276.field4230[var50] = 0;
                        class215.field3437[var50] = null;
                        class103.field1785[var50] = -1;
                    }
                }
            }
        }
        if (!var45 && arg6 == null && arg3 == null) {
            return var16;
        }
        int var58 = -1;
        int var59 = 0;
        class294 var60 = null;
        class294 var61 = null;
        int var62 = -1;
        if (arg6 != null) {
            int var63 = arg6.field4044[arg9];
            int var64 = var63 >>> 16;
            var58 = var63 & 0xFFFF;
            var60 = class87.method615(0, var64);
            if (var60 != null) {
                var47 |= var60.method1970(var58, false);
                var46 |= var60.method1971(122, var58);
                var49 |= arg6.field4042;
            }
            if ((arg6.field4061 || class194.field3131) && arg10 != -1 && arg10 < arg6.field4044.length) {
                int var65 = arg6.field4044[arg10];
                var59 = arg6.field4041[arg9];
                int var66 = var65 >>> 16;
                var62 = var65 & 0xFFFF;
                if (var64 == var66) {
                    var61 = var60;
                } else {
                    var61 = class87.method615(0, var62 >>> 16);
                }
                if (var61 != null) {
                    var47 |= var61.method1970(var62, false);
                    var46 |= var61.method1971(125, var62);
                }
            }
        }
        int var67 = -1;
        int var68 = -1;
        int var69 = 0;
        class294 var70 = null;
        class294 var71 = null;
        if (arg3 != null) {
            int var72 = arg3.field4044[arg4];
            int var73 = var72 >>> 16;
            var67 = var72 & 0xFFFF;
            var71 = class87.method615(0, var73);
            if (var71 != null) {
                var47 |= var71.method1970(var67, false);
                var46 |= var71.method1971(121, var67);
                var49 |= arg3.field4042;
            }
            if ((arg3.field4061 || class194.field3131) && arg1 != -1 && arg1 < arg3.field4044.length) {
                int var74 = arg3.field4044[arg1];
                var69 = arg3.field4041[arg4];
                int var75 = var74 >>> 16;
                var68 = var74 & 0xFFFF;
                if (var73 == var75) {
                    var70 = var71;
                } else {
                    var70 = class87.method615(0, var68 >>> 16);
                }
                if (var70 != null) {
                    var47 |= var70.method1970(var68, false);
                    var46 |= var70.method1971(-102, var68);
                }
            }
        }
        class309 var76 = var16.method168(!var46, !var47, !var49);
        int var77 = 1;
        for (int var78 = 0; var78 < var48; var78++) {
            if (class252.field3943[var78] != null) {
                var76.method2070(class252.field3943[var78], class235.field3700[var78], class215.field3437[var78], class103.field1785[var78], class276.field4230[var78] - 1, class269.field4164[var78], var77, class95.field1704[var78].field4042, this.field3616[var78]);
            }
            var77 <<= 0x1;
        }
        if (var60 != null && var71 != null) {
            var76.method2064(var60, var58, var61, var62, arg0 - 1, var59, var71, var67, var70, var68, arg2 - 1, var69, arg6.field4036, arg3.field4042 | arg6.field4042);
        } else if (var60 != null) {
            var76.method2068(var60, var58, var61, var62, arg0 - 1, var59, arg6.field4042);
        } else if (var71 != null) {
            var76.method2068(var71, var67, var70, var68, arg2 - 1, var69, arg3.field4042);
        }
        for (int var79 = 0; var79 < var48; var79++) {
            class252.field3943[var79] = null;
            class215.field3437[var79] = null;
            class95.field1704[var79] = null;
        }
        return var76;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIILdn;I)Lbg;", line = 652)
    public final class309 method1522(int arg0, int arg1, int arg2, class260 arg3, int arg4) {
        field3613++;
        if (this.field3628 != -1) {
            return class19.method130(this.field3628, -5881).method329(arg0, arg2, 255, arg4, arg3);
        }
        int var6 = -76 % ((arg1 - 44) / 56);
        class309 var7 = (class309) class151.field2463.method1881(true, this.field3620);
        if (var7 == null) {
            boolean var8 = false;
            for (int var9 = 0; var9 < 12; var9++) {
                int var10 = this.field3621[var9];
                if ((var10 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var10) != 0 && !class112.method723((byte) -110, var10 & 0x3FFFFFFF).method105(0)) {
                        var8 = true;
                    }
                } else if (!class95.method636(22111, var10 & 0x3FFFFFFF).method2325(60, this.field3612)) {
                    var8 = true;
                }
            }
            if (var8) {
                return null;
            }
            class3[] var11 = new class3[12];
            int var12 = 0;
            for (int var13 = 0; var13 < 12; var13++) {
                int var14 = this.field3621[var13];
                if ((var14 & 0x40000000) != 0) {
                    class3 var16 = class95.method636(22111, var14 & 0x3FFFFFFF).method2328(this.field3612, false);
                    if (var16 != null) {
                        var11[var12++] = var16;
                    }
                } else if ((var14 & Integer.MIN_VALUE) != 0) {
                    class3 var15 = class112.method723((byte) -110, var14 & 0x3FFFFFFF).method102(-22282);
                    if (var15 != null) {
                        var11[var12++] = var15;
                    }
                }
            }
            class3 var17 = new class3(var11, var12);
            for (int var18 = 0; var18 < 5; var18++) {
                if (class44.field859[var18].length > this.field3626[var18]) {
                    var17.method48(class232.field3640[var18], class44.field859[var18][this.field3626[var18]]);
                }
                if (class40.field770[var18].length > this.field3626[var18]) {
                    var17.method48(class218.field3461[var18], class40.field770[var18][this.field3626[var18]]);
                }
            }
            var7 = var17.method28(64, 768, -50, -10, -50);
            class151.field2463.method1880(var7, this.field3620, 112);
        }
        if (arg3 != null) {
            var7 = arg3.method1746(var7, (byte) 68, arg4, arg2, arg0);
        }
        return var7;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(III)V", line = 764)
    public final void method1523(int arg0, int arg1, int arg2) {
        field3629++;
        this.field3626[arg0] = arg2;
        this.method1525(arg1);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZLjava/lang/String;)V", line = 776)
    public static final void method1524(boolean arg0, String arg1) {
        field3615++;
        if (arg0) {
            method1526(-66);
        }
        int var2 = class122.method786((byte) 74, arg1);
        if (var2 != -1) {
            int[] var3 = class104.field1803.method2274(class222.field3517.field3665[var2] & 0x3FFF, (class222.field3517.field3665[var2] & 0x31A38CBF) >> 28, (class222.field3517.field3665[var2] & 0xFFFDA07) >> 14, true);
            class256.method1714(-18606, var3[1], var3[2]);
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V", line = 799)
    private final void method1525(int arg0) {
        field3617++;
        long[] var2 = class142.field2342;
        long var3 = this.field3620;
        this.field3620 = -1L;
        this.field3620 = var2[(int) (((long) (this.field3614 >> 8) ^ this.field3620) & 0xFFL)] ^ this.field3620 >>> 8;
        this.field3620 = this.field3620 >>> 8 ^ var2[(int) (((long) this.field3614 ^ this.field3620) & 0xFFL)];
        for (int var5 = 0; var5 < 12; var5++) {
            this.field3620 = this.field3620 >>> 8 ^ var2[(int) (((long) (this.field3621[var5] >> 24) ^ this.field3620) & 0xFFL)];
            this.field3620 = var2[(int) ((this.field3620 ^ (long) (this.field3621[var5] >> 16)) & 0xFFL)] ^ this.field3620 >>> 8;
            this.field3620 = var2[(int) ((this.field3620 ^ (long) (this.field3621[var5] >> 8)) & 0xFFL)] ^ this.field3620 >>> 8;
            this.field3620 = var2[(int) ((this.field3620 ^ (long) this.field3621[var5]) & 0xFFL)] ^ this.field3620 >>> 8;
        }
        for (int var6 = arg0; var6 < 5; var6++) {
            this.field3620 = this.field3620 >>> 8 ^ var2[(int) (((long) this.field3626[var6] ^ this.field3620) & 0xFFL)];
        }
        this.field3620 = var2[(int) (((long) (this.field3612 ? 1 : 0) ^ this.field3620) & 0xFFL)] ^ this.field3620 >>> 8;
        if (var3 != 0L && this.field3620 != var3) {
            class35.field699.method1885((byte) -82, var3);
        }
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)V", line = 846)
    public static final void method1526(int arg0) {
        class187.field3031 = null;
        class158.field2593 = null;
        class221.field3507 = null;
        class266.field4112 = null;
        class71.field1497 = null;
        class303.field4585 = null;
        class62.field1197 = null;
        class256.field4001 = null;
        class71.field1494 = null;
        class225.field3554 = null;
        class214.field3428 = null;
        class33.field674 = null;
        class283.field4385 = null;
        class12.field240 = null;
        class324.field4950 = null;
        if (arg0 != 24884) {
            field3630 = 53;
        }
        field3622++;
        class61.field1177 = null;
        class200.field3199 = null;
        class344.field5343 = null;
        class61.field1179 = null;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Z)I", line = 875)
    public final int method1527(boolean arg0) {
        if (arg0) {
            field3623++;
            return this.field3628 == -1 ? (this.field3621[0] << 15) + (this.field3621[8] << 10) + (this.field3626[4] << 20) + (this.field3626[0] << 25) + (this.field3621[11] << 5) + this.field3621[1] : class19.method130(this.field3628, -5881).field895 + 305419896;
        } else {
            return 60;
        }
    }
}
