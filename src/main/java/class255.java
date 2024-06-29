import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class255 {

    @OriginalMember(owner = "client!id", name = "s", descriptor = "[I")
    public static int[] field3872 = new int[200];

    @OriginalMember(owner = "client!id", name = "r", descriptor = "[I")
    public static int[] field3871 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!id", name = "c", descriptor = "I")
    public static int field3856;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "I")
    private int field3857;

    @OriginalMember(owner = "client!id", name = "e", descriptor = "I")
    public static int field3858;

    @OriginalMember(owner = "client!id", name = "g", descriptor = "I")
    public static int field3860;

    @OriginalMember(owner = "client!id", name = "j", descriptor = "I")
    public static int field3863;

    @OriginalMember(owner = "client!id", name = "k", descriptor = "I")
    public static int field3864;

    @OriginalMember(owner = "client!id", name = "l", descriptor = "I")
    public static int field3865;

    @OriginalMember(owner = "client!id", name = "o", descriptor = "I")
    public static int field3868;

    @OriginalMember(owner = "client!id", name = "p", descriptor = "I")
    public static int field3869;

    @OriginalMember(owner = "client!id", name = "q", descriptor = "I")
    public static int field3870;

    @OriginalMember(owner = "client!id", name = "t", descriptor = "I")
    public int field3873;

    @OriginalMember(owner = "client!id", name = "u", descriptor = "I")
    public static int field3874;

    @OriginalMember(owner = "client!id", name = "v", descriptor = "I")
    public static int field3875;

    @OriginalMember(owner = "client!id", name = "f", descriptor = "J")
    private long field3859;

    @OriginalMember(owner = "client!id", name = "h", descriptor = "J")
    private long field3861;

    @OriginalMember(owner = "client!id", name = "n", descriptor = "Z")
    public boolean field3867;

    @OriginalMember(owner = "client!id", name = "i", descriptor = "[I")
    private int[] field3862;

    @OriginalMember(owner = "client!id", name = "m", descriptor = "[I")
    private int[] field3866;

    @OriginalMember(owner = "client!id", name = "b", descriptor = "[[I")
    private int[][] field3855;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "[[[I")
    public static int[][][] field3854;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(III)V", line = 5)
    public final void method1725(int arg0, int arg1, int arg2) {
        this.field3866[arg2] = arg1;
        if (arg0 < 5) {
            this.field3866 = (int[]) null;
        }
        field3865++;
        this.method1726(false);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Z)V", line = 20)
    private final void method1726(boolean arg0) {
        long var2 = this.field3861;
        this.field3861 = -1L;
        long[] var4 = class135.field2060;
        this.field3861 = var4[(int) ((this.field3861 ^ (long) (this.field3857 >> 8)) & 0xFFL)] ^ this.field3861 >>> 8;
        field3870++;
        this.field3861 = this.field3861 >>> 8 ^ var4[(int) ((this.field3861 ^ (long) this.field3857) & 0xFFL)];
        for (int var5 = 0; var5 < 12; var5++) {
            this.field3861 = var4[(int) ((this.field3861 ^ (long) (this.field3862[var5] >> 24)) & 0xFFL)] ^ this.field3861 >>> 8;
            this.field3861 = this.field3861 >>> 8 ^ var4[(int) (((long) (this.field3862[var5] >> 16) ^ this.field3861) & 0xFFL)];
            this.field3861 = this.field3861 >>> 8 ^ var4[(int) ((this.field3861 ^ (long) (this.field3862[var5] >> 8)) & 0xFFL)];
            this.field3861 = this.field3861 >>> 8 ^ var4[(int) (((long) this.field3862[var5] ^ this.field3861) & 0xFFL)];
        }
        if (arg0) {
            this.field3873 = -124;
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field3861 = this.field3861 >>> 8 ^ var4[(int) ((this.field3861 ^ (long) this.field3866[var6]) & 0xFFL)];
        }
        this.field3861 = var4[(int) (((long) (this.field3867 ? 1 : 0) ^ this.field3861) & 0xFFL)] ^ this.field3861 >>> 8;
        if (var2 != 0L && this.field3861 != var2) {
            class265.field4064.method2172(false, var2);
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ZI[Lsb;Lof;IILof;IIII)Lnj;", line = 67)
    public final class100 method1727(boolean arg0, int arg1, class122[] arg2, class272 arg3, int arg4, int arg5, class272 arg6, int arg7, int arg8, int arg9, int arg10) {
        field3868++;
        if (this.field3873 != -1) {
            return class235.method1615(this.field3873, arg4 ^ 0x1AD040C9).method380((byte) 78, arg3, arg10, arg8, arg2, arg5, arg7, arg9, arg6, arg1);
        }
        long var12 = this.field3861;
        int[] var14 = this.field3862;
        if (arg6 != null && (arg6.field4180 >= 0 || arg6.field4174 >= 0)) {
            var14 = new int[12];
            for (int var15 = 0; var15 < 12; var15++) {
                var14[var15] = this.field3862[var15];
            }
            if (arg6.field4180 >= 0) {
                if (arg6.field4180 == 65535) {
                    var14[5] = 0;
                    var12 ^= 0xFFFFFFFF00000000L;
                } else {
                    var14[5] = class140.method1009(1073741824, arg6.field4180);
                    var12 ^= (long) var14[5] << 32;
                }
            }
            if (arg6.field4174 >= 0) {
                if (arg6.field4174 == 65535) {
                    var12 ^= 0xFFFFFFFFL;
                    var14[3] = 0;
                } else {
                    var14[3] = class140.method1009(arg6.field4174, 1073741824);
                    var12 ^= (long) var14[3];
                }
            }
        }
        class100 var16 = (class100) class265.field4064.method2180(var12, (byte) 31);
        if (var16 == null) {
            boolean var17 = false;
            for (int var18 = 0; var18 < 12; var18++) {
                int var19 = var14[var18];
                if ((var19 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var19) != 0 && !class20.method124(var19 & 0x3FFFFFFF, (byte) 127).method1399(0)) {
                        var17 = true;
                    }
                } else if (!class325.method2219(var19 & 0x3FFFFFFF, -9379).method1712(arg4 ^ 0x1AD044A1, this.field3867)) {
                    var17 = true;
                }
            }
            if (var17) {
                if (this.field3859 != -1L) {
                    var16 = (class100) class265.field4064.method2180(this.field3859, (byte) 31);
                }
                if (var16 == null) {
                    return null;
                }
            }
            if (var16 == null) {
                class119[] var20 = new class119[12];
                for (int var21 = 0; var21 < 12; var21++) {
                    int var22 = var14[var21];
                    if ((var22 & 0x40000000) != 0) {
                        class119 var24 = class325.method2219(var22 & 0x3FFFFFFF, -9379).method1717(this.field3867, 80);
                        if (var24 != null) {
                            var20[var21] = var24;
                        }
                    } else if ((var22 & Integer.MIN_VALUE) != 0) {
                        class119 var23 = class20.method124(var22 & 0x3FFFFFFF, (byte) 124).method1400(false);
                        if (var23 != null) {
                            var20[var21] = var23;
                        }
                    }
                }
                class242 var25 = null;
                if (this.field3857 != -1) {
                    var25 = class126.method920(this.field3857, (byte) 10);
                }
                if (var25 != null && var25.field3631 != null) {
                    for (int var26 = 0; var26 < var25.field3631.length; var26++) {
                        if (var25.field3631[var26] != null && var20[var26] != null) {
                            int var27 = var25.field3631[var26][1];
                            int var28 = var25.field3631[var26][0];
                            int var29 = var25.field3631[var26][2];
                            int var30 = var25.field3631[var26][3];
                            int var31 = var25.field3631[var26][5];
                            int var32 = var25.field3631[var26][4];
                            if (this.field3855 == null) {
                                this.field3855 = new int[var25.field3631.length][];
                            }
                            if (this.field3855[var26] == null) {
                                int[] var33 = this.field3855[var26] = new int[15];
                                if (var30 == 0 && var32 == 0 && var31 == 0) {
                                    var33[14] = -var29;
                                    var33[0] = var33[4] = var33[8] = 32768;
                                    var33[12] = -var28;
                                    var33[13] = -var27;
                                } else {
                                    int var34 = class148.field2229[var30] >> 1;
                                    int var35 = class148.field2229[var32] >> 1;
                                    int var36 = class148.field2239[var30] >> 1;
                                    int var37 = class148.field2239[var32] >> 1;
                                    int var38 = class148.field2229[var31] >> 1;
                                    int var39 = class148.field2239[var31] >> 1;
                                    var33[5] = -var36;
                                    var33[3] = var34 * var39 + 16384 >> 15;
                                    var33[4] = var34 * var38 + 16384 >> 15;
                                    var33[8] = var34 * var35 + 16384 >> 15;
                                    int var40 = var36 * var39 + 16384 >> 15;
                                    var33[6] = -var37 * var38 + var35 * var40 + 16384 >> 15;
                                    int var41 = var36 * var38 + 16384 >> 15;
                                    var33[2] = var34 * var37 + 16384 >> 15;
                                    var33[14] = var33[2] * -var28 + var33[8] * -var29 + var33[5] * -var27 + 16384 >> 15;
                                    var33[0] = var35 * var38 + (var37 * var40) + 16384 >> 15;
                                    var33[7] = -var37 * -var39 + (var35 * var41) + 16384 >> 15;
                                    var33[12] = var33[6] * -var29 + var33[0] * -var28 + (var33[3] * -var27) + 16384 >> 15;
                                    var33[1] = -var39 * var35 + var37 * var41 + 16384 >> 15;
                                    var33[13] = var33[1] * -var28 + 16384 - (-(var33[4] * -var27) - var33[7] * -var29) >> 15;
                                }
                                var33[10] = var27;
                                var33[9] = var28;
                                var33[11] = var29;
                            }
                            if (var30 != 0 || var32 != 0 || var31 != 0) {
                                var20[var26].method867(var30, var32, var31);
                            }
                            if (var28 != 0 || var27 != 0 || var29 != 0) {
                                var20[var26].method852(var28, var27, var29);
                            }
                        }
                    }
                }
                class119 var42 = new class119(var20, var20.length);
                for (int var43 = 0; var43 < 5; var43++) {
                    if (this.field3866[var43] < class110.field1706[var43].length) {
                        var42.method864(class250.field3731[var43], class110.field1706[var43][this.field3866[var43]]);
                    }
                    if (this.field3866[var43] < class140.field2118[var43].length) {
                        var42.method864(class178.field2634[var43], class140.field2118[var43][this.field3866[var43]]);
                    }
                }
                var16 = var42.method853(64, 850, -30, -50, -30);
                if (class117.field1817) {
                    ((class83) var16).method574(false, false, true, true, false, false, true);
                }
                if (arg0) {
                    class265.field4064.method2175(var12, var16, 124);
                    this.field3859 = var12;
                }
            }
        }
        boolean var44 = false;
        boolean var45 = false;
        if (arg4 != 449856673) {
            return (class100) null;
        }
        boolean var46 = false;
        boolean var47 = false;
        int var48 = arg2 == null ? 0 : arg2.length;
        for (int var49 = 0; var49 < var48; var49++) {
            if (arg2[var49] != null) {
                class272 var50 = class72.method468(arg2[var49].field1905, arg4 ^ 0xE52FBB53);
                if (var50.field4160 != null) {
                    var44 = true;
                    class172.field2581[var49] = var50;
                    int var51 = arg2[var49].field1908;
                    int var52 = arg2[var49].field1903;
                    int var53 = var50.field4160[var51];
                    class249.field3709[var49] = class149.method1076(var53 >>> 16, 1);
                    int var54 = var53 & 0xFFFF;
                    class198.field2975[var49] = var54;
                    if (class249.field3709[var49] != null) {
                        var45 |= class249.field3709[var49].method985(var54, 2);
                        var46 |= class249.field3709[var49].method984(var54, (byte) 111);
                        var47 |= var50.field4169;
                    }
                    if ((var50.field4170 || class145.field2191) && var52 != -1 && var52 < var50.field4160.length) {
                        class212.field3226[var49] = var50.field4184[var51];
                        class45.field568[var49] = arg2[var49].field1900;
                        int var55 = var50.field4160[var52];
                        class320.field4832[var49] = class149.method1076(var55 >>> 16, 1);
                        int var56 = var55 & 0xFFFF;
                        class107.field1670[var49] = var56;
                        if (class320.field4832[var49] != null) {
                            var45 |= class320.field4832[var49].method985(var56, 2);
                            var46 |= class320.field4832[var49].method984(var56, (byte) -77);
                        }
                    } else {
                        class212.field3226[var49] = 0;
                        class45.field568[var49] = 0;
                        class320.field4832[var49] = null;
                        class107.field1670[var49] = -1;
                    }
                }
            }
        }
        if (!var44 && arg6 == null && arg3 == null) {
            return var16;
        }
        int var57 = -1;
        int var58 = -1;
        int var59 = 0;
        class134 var60 = null;
        class134 var61 = null;
        if (arg6 != null) {
            int var62 = arg6.field4160[arg7];
            int var63 = var62 >>> 16;
            var57 = var62 & 0xFFFF;
            var60 = class149.method1076(var63, arg4 ^ 0x1AD044A0);
            if (var60 != null) {
                var45 |= var60.method985(var57, 2);
                var46 |= var60.method984(var57, (byte) -4);
                var47 |= arg6.field4169;
            }
            if ((arg6.field4170 || class145.field2191) && arg5 != -1 && arg6.field4160.length > arg5) {
                var59 = arg6.field4184[arg7];
                int var64 = arg6.field4160[arg5];
                int var65 = var64 >>> 16;
                var58 = var64 & 0xFFFF;
                if (var63 == var65) {
                    var61 = var60;
                } else {
                    var61 = class149.method1076(var58 >>> 16, 1);
                }
                if (var61 != null) {
                    var45 |= var61.method985(var58, 2);
                    var46 |= var61.method984(var58, (byte) -94);
                }
            }
        }
        int var66 = -1;
        int var67 = -1;
        int var68 = 0;
        class134 var69 = null;
        class134 var70 = null;
        if (arg3 != null) {
            int var71 = arg3.field4160[arg8];
            int var72 = var71 >>> 16;
            var70 = class149.method1076(var72, 1);
            var66 = var71 & 0xFFFF;
            if (var70 != null) {
                var45 |= var70.method985(var66, arg4 - 449856671);
                var46 |= var70.method984(var66, (byte) 119);
                var47 |= arg3.field4169;
            }
            if ((arg3.field4170 || class145.field2191) && arg9 != -1 && arg3.field4160.length > arg9) {
                int var73 = arg3.field4160[arg9];
                var68 = arg3.field4184[arg8];
                int var74 = var73 >>> 16;
                var67 = var73 & 0xFFFF;
                if (var72 == var74) {
                    var69 = var70;
                } else {
                    var69 = class149.method1076(var67 >>> 16, arg4 ^ 0x1AD044A0);
                }
                if (var69 != null) {
                    var45 |= var69.method985(var67, 2);
                    var46 |= var69.method984(var67, (byte) -3);
                }
            }
        }
        class100 var75 = var16.method491(!var46, !var45, !var47);
        int var76 = 0;
        int var77 = 1;
        while (var48 > var76) {
            if (class249.field3709[var76] != null) {
                var75.method706(class249.field3709[var76], class198.field2975[var76], class320.field4832[var76], class107.field1670[var76], class45.field568[var76] - 1, class212.field3226[var76], var77, class172.field2581[var76].field4169, this.field3855[var76]);
            }
            var76++;
            var77 <<= 0x1;
        }
        if (var60 != null && var70 != null) {
            var75.method708(var60, var57, var61, var58, arg10 - 1, var59, var70, var66, var69, var67, arg1 - 1, var68, arg6.field4163, arg6.field4169 | arg3.field4169);
        } else if (var60 != null) {
            var75.method704(var60, var57, var61, var58, arg10 - 1, var59, arg6.field4169);
        } else if (var70 != null) {
            var75.method704(var70, var66, var69, var67, arg1 - 1, var68, arg3.field4169);
        }
        for (int var78 = 0; var78 < var48; var78++) {
            class249.field3709[var78] = null;
            class320.field4832[var78] = null;
            class172.field2581[var78] = null;
        }
        return var75;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIILof;I)Lnj;", line = 552)
    public final class100 method1728(int arg0, int arg1, int arg2, class272 arg3, int arg4) {
        field3856++;
        if (this.field3873 != -1) {
            return class235.method1615(this.field3873, arg0 ^ 0x468).method385(arg3, arg2, arg4, -28321, arg1);
        }
        class100 var6 = (class100) class73.field951.method2180(this.field3861, (byte) 31);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < 12; var8++) {
                int var9 = this.field3862[var8];
                if ((var9 & 0x40000000) == 0) {
                    if ((var9 & Integer.MIN_VALUE) != 0 && !class20.method124(var9 & 0x3FFFFFFF, (byte) 125).method1396((byte) 0)) {
                        var7 = true;
                    }
                } else if (!class325.method2219(var9 & 0x3FFFFFFF, -9379).method1713(this.field3867, arg0 - 2651)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class119[] var10 = new class119[12];
            int var11 = 0;
            for (int var12 = 0; var12 < 12; var12++) {
                int var13 = this.field3862[var12];
                if ((var13 & 0x40000000) != 0) {
                    class119 var14 = class325.method2219(var13 & 0x3FFFFFFF, -9379).method1716(-127, this.field3867);
                    if (var14 != null) {
                        var10[var11++] = var14;
                    }
                } else if ((var13 & Integer.MIN_VALUE) != 0) {
                    class119 var15 = class20.method124(var13 & 0x3FFFFFFF, (byte) 125).method1402(0);
                    if (var15 != null) {
                        var10[var11++] = var15;
                    }
                }
            }
            class119 var16 = new class119(var10, var11);
            for (int var17 = 0; var17 < 5; var17++) {
                if (class110.field1706[var17].length > this.field3866[var17]) {
                    var16.method864(class250.field3731[var17], class110.field1706[var17][this.field3866[var17]]);
                }
                if (this.field3866[var17] < class140.field2118[var17].length) {
                    var16.method864(class178.field2634[var17], class140.field2118[var17][this.field3866[var17]]);
                }
            }
            var6 = var16.method853(64, 768, -50, -10, -50);
            class73.field951.method2175(this.field3861, var6, 127);
        }
        if (arg3 != null) {
            var6 = arg3.method1918((byte) 54, arg4, var6, arg2, arg1);
        }
        if (arg0 != 0) {
            this.method1726(true);
        }
        return var6;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIII)V", line = 669)
    public static final void method1729(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class252 var5 = (class252) class162.field2444.method1109(-98); var5 != null; var5 = (class252) class162.field2444.method1115((byte) 97)) {
            class269.method1895(arg3, 121, arg0, var5, arg1, arg2);
        }
        field3864++;
        for (class252 var6 = (class252) class316.field4775.method1109(106); var6 != null; var6 = (class252) class316.field4775.method1115((byte) 97)) {
            byte var7 = 1;
            class242 var8 = var6.field3765.method699(0);
            if (var6.field3765.field1507 == var8.field3597) {
                var7 = 0;
            } else if (var6.field3765.field1507 == var8.field3603 || var6.field3765.field1507 == var8.field3604 || var6.field3765.field1507 == var8.field3600 || var6.field3765.field1507 == var8.field3607) {
                var7 = 2;
            } else if (var6.field3765.field1507 == var8.field3601 || var6.field3765.field1507 == var8.field3621 || var6.field3765.field1507 == var8.field3628 || var6.field3765.field1507 == var8.field3611) {
                var7 = 3;
            }
            if (var6.field3770 != var7) {
                int var9 = class145.method1039(var6.field3765, 110);
                if (var6.field3755 != var9) {
                    if (var6.field3776 != null) {
                        class72.field936.method2230(var6.field3776);
                        var6.field3776 = null;
                    }
                    var6.field3755 = var9;
                }
                var6.field3770 = var7;
            }
            var6.field3764 = var6.field3765.field1566;
            var6.field3760 = var6.field3765.field1566 + (var6.field3765.method696((byte) 117) * 64);
            var6.field3762 = var6.field3765.field1505;
            var6.field3766 = var6.field3765.field1505 + var6.field3765.method696((byte) 117) * 64;
            class269.method1895(arg3, 122, arg0, var6, arg1, arg2);
        }
        if (arg4 < 111) {
            return;
        }
        for (class252 var10 = (class252) class141.field2129.method1321((byte) -67); var10 != null; var10 = (class252) class141.field2129.method1330((byte) -94)) {
            byte var11 = 1;
            class242 var12 = var10.field3753.method699(0);
            if (var10.field3753.field1507 == var12.field3597) {
                var11 = 0;
            } else if (var10.field3753.field1507 == var12.field3603 || var10.field3753.field1507 == var12.field3604 || var10.field3753.field1507 == var12.field3600 || var10.field3753.field1507 == var12.field3607) {
                var11 = 2;
            } else if (var10.field3753.field1507 == var12.field3601 || var10.field3753.field1507 == var12.field3621 || var10.field3753.field1507 == var12.field3628 || var10.field3753.field1507 == var12.field3611) {
                var11 = 3;
            }
            if (var10.field3770 != var11) {
                int var13 = class152.method1094(var10.field3753, -1753104468);
                if (var10.field3755 != var13) {
                    if (var10.field3776 != null) {
                        class72.field936.method2230(var10.field3776);
                        var10.field3776 = null;
                    }
                    var10.field3755 = var13;
                }
                var10.field3770 = var11;
            }
            var10.field3764 = var10.field3753.field1566;
            var10.field3760 = var10.field3753.field1566 + var10.field3753.method696((byte) 117) * 64;
            var10.field3762 = var10.field3753.field1505;
            var10.field3766 = var10.field3753.field1505 + (var10.field3753.method696((byte) 117) * 64);
            class269.method1895(arg3, 114, arg0, var10, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ZB)V", line = 783)
    public final void method1730(boolean arg0, byte arg1) {
        this.field3867 = arg0;
        if (arg1 != 58) {
            this.field3857 = 110;
        }
        this.method1726(false);
        field3875++;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(B)I", line = 795)
    public final int method1731(byte arg0) {
        if (arg0 != -116) {
            this.method1726(true);
        }
        field3858++;
        return this.field3873 == -1 ? (this.field3866[0] << 25) + (this.field3862[11] << 5) + this.field3862[1] + (this.field3866[4] << 20) - (-(this.field3862[0] << 15) - (this.field3862[8] << 10)) : class235.method1615(this.field3873, 1128).field725 + 305419896;
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(III)V", line = 816)
    public final void method1732(int arg0, int arg1, int arg2) {
        if (arg1 != -8180) {
            this.method1735(67, 38, (int[]) null, 85, (int[]) null, true);
        }
        field3863++;
        int var4 = class253.field3841[arg2];
        if (this.field3862[var4] != 0 && class20.method124(arg0, (byte) 126) != null) {
            this.field3862[var4] = class140.method1009(arg0, Integer.MIN_VALUE);
            this.method1726(false);
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIIIILof;I)Lnj;", line = 858)
    public final class100 method1733(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class272 arg6, int arg7) {
        if (arg7 != -1842912672) {
            return (class100) null;
        }
        long var9 = (long) arg4 | (long) (arg0 << 16) | (long) arg1 << 32;
        field3860++;
        class100 var11 = (class100) class73.field951.method2180(var9, (byte) 31);
        if (var11 == null) {
            class119[] var12 = new class119[3];
            int var13 = 0;
            if (!class20.method124(arg4, (byte) 127).method1396((byte) 10) || !class20.method124(arg0, (byte) 125).method1396((byte) -112) || !class20.method124(arg1, (byte) 127).method1396((byte) -111)) {
                return null;
            }
            class119 var14 = class20.method124(arg4, (byte) 125).method1402(0);
            if (var14 != null) {
                var12[var13++] = var14;
            }
            class119 var15 = class20.method124(arg0, (byte) 124).method1402(0);
            if (var15 != null) {
                var12[var13++] = var15;
            }
            class119 var16 = class20.method124(arg1, (byte) 125).method1402(arg7 + 1842912672);
            if (var16 != null) {
                var12[var13++] = var16;
            }
            class119 var17 = new class119(var12, var13);
            for (int var18 = 0; var18 < 5; var18++) {
                if (class110.field1706[var18].length > this.field3866[var18]) {
                    var17.method864(class250.field3731[var18], class110.field1706[var18][this.field3866[var18]]);
                }
                if (class140.field2118[var18].length > this.field3866[var18]) {
                    var17.method864(class178.field2634[var18], class140.field2118[var18][this.field3866[var18]]);
                }
            }
            var11 = var17.method853(64, 768, -50, -10, -50);
            class73.field951.method2175(var9, var11, -64);
        }
        if (arg6 != null) {
            var11 = arg6.method1918((byte) 28, arg5, var11, arg2, arg3);
        }
        return var11;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V", line = 926)
    public static void method1734(int arg0) {
        field3872 = null;
        field3871 = null;
        field3854 = (int[][][]) null;
        if (arg0 <= 63) {
            field3874 = 113;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(II[II[IZ)V", line = 938)
    public final void method1735(int arg0, int arg1, int[] arg2, int arg3, int[] arg4, boolean arg5) {
        if (arg3 != -1842912672) {
            return;
        }
        field3869++;
        if (this.field3857 != arg0) {
            this.field3857 = arg0;
            this.field3855 = (int[][]) null;
        }
        if (arg4 == null) {
            arg4 = new int[12];
            for (int var7 = 0; var7 < 8; var7++) {
                for (int var8 = 0; var8 < class301.field4605; var8++) {
                    class204 var9 = class20.method124(var8, (byte) 125);
                    if (var9 != null && !var9.field3068 && (arg5 ? class286.field4314[var7] : class82.field1154[var7]) == var9.field3059) {
                        arg4[class253.field3841[var7]] = class140.method1009(var8, Integer.MIN_VALUE);
                        break;
                    }
                }
            }
        }
        this.field3873 = arg1;
        this.field3862 = arg4;
        this.field3867 = arg5;
        this.field3866 = arg2;
        this.method1726(false);
    }
}
