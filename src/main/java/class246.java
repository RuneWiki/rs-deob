import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class246 {

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "I")
    public static int field3866 = 0;

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "Z")
    public static boolean field3867 = false;

    @OriginalMember(owner = "client!tb", name = "k", descriptor = "Ljava/lang/String;")
    public static String field3873 = "M";

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "I")
    public static int field3863;

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "I")
    public static int field3864;

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "I")
    public static int field3868;

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "I")
    public static int field3869;

    @OriginalMember(owner = "client!tb", name = "j", descriptor = "I")
    public static int field3872;

    @OriginalMember(owner = "client!tb", name = "m", descriptor = "I")
    public static int field3875;

    @OriginalMember(owner = "client!tb", name = "n", descriptor = "I")
    public static int field3876;

    @OriginalMember(owner = "client!tb", name = "o", descriptor = "I")
    public static int field3877;

    @OriginalMember(owner = "client!tb", name = "p", descriptor = "I")
    public static int field3878;

    @OriginalMember(owner = "client!tb", name = "q", descriptor = "I")
    public int field3879;

    @OriginalMember(owner = "client!tb", name = "s", descriptor = "I")
    public static int field3881;

    @OriginalMember(owner = "client!tb", name = "t", descriptor = "I")
    public static int field3882;

    @OriginalMember(owner = "client!tb", name = "u", descriptor = "I")
    public static int field3883;

    @OriginalMember(owner = "client!tb", name = "w", descriptor = "I")
    public static int field3885;

    @OriginalMember(owner = "client!tb", name = "x", descriptor = "I")
    public static int field3886;

    @OriginalMember(owner = "client!tb", name = "y", descriptor = "I")
    private int field3887;

    @OriginalMember(owner = "client!tb", name = "z", descriptor = "I")
    public static int field3888;

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "J")
    private long field3870;

    @OriginalMember(owner = "client!tb", name = "l", descriptor = "J")
    private long field3874;

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "Z")
    public boolean field3865;

    @OriginalMember(owner = "client!tb", name = "r", descriptor = "[I")
    public int[] field3880;

    @OriginalMember(owner = "client!tb", name = "v", descriptor = "[I")
    private int[] field3884;

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "[[I")
    private int[][] field3871;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ZIIIZILro;ILro;I[Lb;I)Lbf;", line = 4)
    public final class362 method1739(boolean arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, class111 arg6, int arg7, class111 arg8, int arg9, class69[] arg10, int arg11) {
        field3878++;
        if (this.field3879 != -1) {
            return class178.method1229(this.field3879, 8).method969(arg9, arg8, arg7, arg6, arg2, arg10, arg3, -1, arg1, arg5);
        }
        int[] var13 = this.field3884;
        long var14 = this.field3874;
        if (arg8 != null && (arg8.field1545 >= 0 || arg8.field1536 >= 0)) {
            var13 = new int[12];
            for (int var16 = 0; var16 < 12; var16++) {
                var13[var16] = this.field3884[var16];
            }
            if (arg8.field1545 >= 0) {
                if (arg8.field1545 == 65535) {
                    var13[5] = 0;
                    var14 ^= 0xFFFFFFFF00000000L;
                } else {
                    var13[5] = class77.method492(1073741824, arg8.field1545);
                    var14 ^= (long) var13[5] << 32;
                }
            }
            if (arg8.field1536 >= 0) {
                if (arg8.field1536 == 65535) {
                    var13[3] = 0;
                    var14 ^= 0xFFFFFFFFL;
                } else {
                    var13[3] = class77.method492(arg8.field1536, 1073741824);
                    var14 ^= (long) var13[3];
                }
            }
        }
        class362 var17 = (class362) class197.field3006.method380(0, var14);
        if (var17 == null) {
            boolean var18 = false;
            for (int var19 = 0; var19 < 12; var19++) {
                int var20 = var13[var19];
                if ((var20 & 0x40000000) == 0) {
                    if ((var20 & Integer.MIN_VALUE) != 0 && !class186.method1280(-127, var20 & 0x3FFFFFFF).method331(true)) {
                        var18 = true;
                    }
                } else if (!class190.method1302(var20 & 0x3FFFFFFF, (byte) 52).method2186(arg11 ^ 0xFFFFCE7E, this.field3865)) {
                    var18 = true;
                }
            }
            if (var18) {
                if (this.field3870 != -1L) {
                    var17 = (class362) class197.field3006.method380(0, this.field3870);
                }
                if (var17 == null) {
                    return null;
                }
            }
            if (var17 == null) {
                class193[] var21 = new class193[12];
                for (int var22 = 0; var22 < 12; var22++) {
                    int var23 = var13[var22];
                    if ((var23 & 0x40000000) != 0) {
                        class193 var25 = class190.method1302(var23 & 0x3FFFFFFF, (byte) -122).method2174(this.field3865, 79);
                        if (var25 != null) {
                            var21[var22] = var25;
                        }
                    } else if ((Integer.MIN_VALUE & var23) != 0) {
                        class193 var24 = class186.method1280(-127, var23 & 0x3FFFFFFF).method326(1);
                        if (var24 != null) {
                            var21[var22] = var24;
                        }
                    }
                }
                class282 var26 = null;
                if (this.field3887 != -1) {
                    var26 = class29.method213(this.field3887, arg11 ^ 0xFFFFCE6E);
                }
                if (var26 != null && var26.field4485 != null) {
                    for (int var27 = 0; var27 < var26.field4485.length; var27++) {
                        if (var26.field4485[var27] != null && var21[var27] != null) {
                            int var28 = var26.field4485[var27][1];
                            int var29 = var26.field4485[var27][0];
                            int var30 = var26.field4485[var27][2];
                            int var31 = var26.field4485[var27][4];
                            int var32 = var26.field4485[var27][5];
                            int var33 = var26.field4485[var27][3];
                            if (this.field3871 == null) {
                                this.field3871 = new int[var26.field4485.length][];
                            }
                            if (this.field3871[var27] == null) {
                                int[] var34 = this.field3871[var27] = new int[15];
                                if (var33 == 0 && var31 == 0 && var32 == 0) {
                                    var34[0] = var34[4] = var34[8] = 32768;
                                    var34[14] = -var30;
                                    var34[13] = -var28;
                                    var34[12] = -var29;
                                } else {
                                    int var35 = class104.field1435[var33] >> 1;
                                    int var36 = class104.field1435[var31] >> 1;
                                    int var37 = class104.field1426[var31] >> 1;
                                    int var38 = class104.field1426[var33] >> 1;
                                    int var39 = class104.field1426[var32] >> 1;
                                    int var40 = var38 * var39 + 16384 >> 15;
                                    int var41 = class104.field1435[var32] >> 1;
                                    int var42 = var38 * var41 + 16384 >> 15;
                                    var34[5] = -var38;
                                    var34[3] = var35 * var39 + 16384 >> 15;
                                    var34[0] = var36 * var41 + var37 * var40 + 16384 >> 15;
                                    var34[2] = var35 * var37 + 16384 >> 15;
                                    var34[6] = -var37 * var41 + var36 * var40 + 16384 >> 15;
                                    var34[1] = -var39 * var36 + (var37 * var42) + 16384 >> 15;
                                    var34[4] = var35 * var41 + 16384 >> 15;
                                    var34[7] = var36 * var42 + -var37 * -var39 + 16384 >> 15;
                                    var34[13] = var34[1] * -var29 + var34[4] * -var28 + (var34[7] * -var30) + 16384 >> 15;
                                    var34[12] = var34[0] * -var29 + (var34[3] * -var28) + var34[6] * -var30 + 16384 >> 15;
                                    var34[8] = var35 * var36 + 16384 >> 15;
                                    var34[14] = var34[8] * -var30 + var34[5] * -var28 + var34[2] * -var29 + 16384 >> 15;
                                }
                                var34[10] = var28;
                                var34[11] = var30;
                                var34[9] = var29;
                            }
                            if (var33 != 0 || var31 != 0 || var32 != 0) {
                                var21[var27].method1332(var33, var31, var32);
                            }
                            if (var29 != 0 || var28 != 0 || var30 != 0) {
                                var21[var27].method1316(var29, var28, var30);
                            }
                        }
                    }
                }
                class193 var43 = new class193(var21, var21.length);
                for (int var44 = 0; var44 < 5; var44++) {
                    if (class130.field1881[var44].length > this.field3880[var44]) {
                        var43.method1339(class54.field618[var44], class130.field1881[var44][this.field3880[var44]]);
                    }
                    if (this.field3880[var44] < class127.field1862[var44].length) {
                        var43.method1339(class79.field1059[var44], class127.field1862[var44][this.field3880[var44]]);
                    }
                }
                var17 = var43.method1324(64, 850, -30, -50, -30);
                if (class272.field4317) {
                    ((class124) var17).method812(false, false, true, true, false, false, true);
                }
                if (arg0) {
                    class197.field3006.method377(var14, var17, arg11 ^ 0x31B1);
                    this.field3870 = var14;
                }
            }
        }
        boolean var45 = false;
        boolean var46 = false;
        boolean var47 = false;
        int var48 = arg10 == null ? 0 : arg10.length;
        boolean var49 = false;
        for (int var50 = 0; var50 < var48; var50++) {
            if (arg10[var50] != null) {
                class111 var51 = class289.method2067((byte) -111, arg10[var50].field867);
                if (var51.field1533 != null) {
                    class54.field626[var50] = var51;
                    var47 = true;
                    int var52 = arg10[var50].field864;
                    int var53 = arg10[var50].field862;
                    int var54 = var51.field1533[var53];
                    class214.field3256[var50] = class352.method2437(-924, var54 >>> 16);
                    int var55 = var54 & 0xFFFF;
                    class184.field2767[var50] = var55;
                    if (class214.field3256[var50] != null) {
                        var49 |= class214.field3256[var50].method2088(var55, (byte) 39);
                        var45 |= class214.field3256[var50].method2091(-122, var55);
                        var46 |= var51.field1529;
                    }
                    if ((var51.field1530 || class325.field5215) && var52 != -1 && var51.field1533.length > var52) {
                        class218.field3273[var50] = var51.field1524[var53];
                        class89.field1180[var50] = arg10[var50].field858;
                        int var56 = var51.field1533[var52];
                        class115.field1598[var50] = class352.method2437(-924, var56 >>> 16);
                        int var57 = var56 & 0xFFFF;
                        class116.field1608[var50] = var57;
                        if (class115.field1598[var50] != null) {
                            var49 |= class115.field1598[var50].method2088(var57, (byte) 39);
                            var45 |= class115.field1598[var50].method2091(arg11 ^ 0x318C, var57);
                        }
                    } else {
                        class218.field3273[var50] = 0;
                        class89.field1180[var50] = 0;
                        class115.field1598[var50] = null;
                        class116.field1608[var50] = -1;
                    }
                }
            }
        }
        if (!var47 && arg8 == null && arg6 == null) {
            if (arg4) {
                return var17.method810(false, false, false);
            } else {
                return var17;
            }
        } else if (arg11 == -12722) {
            int var58 = -1;
            int var59 = 0;
            int var60 = -1;
            class293 var61 = null;
            class293 var62 = null;
            if (arg8 != null) {
                int var63 = arg8.field1533[arg7];
                int var64 = var63 >>> 16;
                var58 = var63 & 0xFFFF;
                var61 = class352.method2437(arg11 + 11798, var64);
                if (var61 != null) {
                    var49 |= var61.method2088(var58, (byte) 39);
                    var45 |= var61.method2091(-89, var58);
                    var46 |= arg8.field1529;
                }
                if ((arg8.field1530 || class325.field5215) && arg3 != -1 && arg3 < arg8.field1533.length) {
                    var59 = arg8.field1524[arg7];
                    int var65 = arg8.field1533[arg3];
                    int var66 = var65 >>> 16;
                    var60 = var65 & 0xFFFF;
                    if (var64 == var66) {
                        var62 = var61;
                    } else {
                        var62 = class352.method2437(-924, var60 >>> 16);
                    }
                    if (var62 != null) {
                        var49 |= var62.method2088(var60, (byte) 39);
                        var45 |= var62.method2091(-109, var60);
                    }
                }
            }
            int var67 = -1;
            int var68 = 0;
            class293 var69 = null;
            int var70 = -1;
            class293 var71 = null;
            if (arg6 != null) {
                int var72 = arg6.field1533[arg1];
                int var73 = var72 >>> 16;
                var69 = class352.method2437(-924, var73);
                var67 = var72 & 0xFFFF;
                if (var69 != null) {
                    var49 |= var69.method2088(var67, (byte) 39);
                    var45 |= var69.method2091(-97, var67);
                    var46 |= arg6.field1529;
                }
                if ((arg6.field1530 || class325.field5215) && arg9 != -1 && arg9 < arg6.field1533.length) {
                    int var74 = arg6.field1533[arg9];
                    var68 = arg6.field1524[arg1];
                    int var75 = var74 >>> 16;
                    var70 = var74 & 0xFFFF;
                    if (var73 == var75) {
                        var71 = var69;
                    } else {
                        var71 = class352.method2437(-924, var70 >>> 16);
                    }
                    if (var71 != null) {
                        var49 |= var71.method2088(var70, (byte) 39);
                        var45 |= var71.method2091(-43, var70);
                    }
                }
            }
            class362 var76 = var17.method810(!var45, !var49, !var46);
            int var77 = 0;
            int var78 = 1;
            while (var77 < var48) {
                if (class214.field3256[var77] != null) {
                    var76.method2522(class214.field3256[var77], class184.field2767[var77], class115.field1598[var77], class116.field1608[var77], class89.field1180[var77] - 1, class218.field3273[var77], var78, class54.field626[var77].field1529, this.field3871[var77]);
                }
                var78 <<= 0x1;
                var77++;
            }
            if (var61 != null && var69 != null) {
                var76.method2523(var61, var58, var62, var60, arg2 - 1, var59, var69, var67, var71, var70, arg5 - 1, var68, arg8.field1522, arg8.field1529 | arg6.field1529);
            } else if (var61 != null) {
                var76.method2524(var61, var58, var62, var60, arg2 - 1, var59, arg8.field1529);
            } else if (var69 != null) {
                var76.method2524(var69, var67, var71, var70, arg5 - 1, var68, arg6.field1529);
            }
            for (int var79 = 0; var79 < var48; var79++) {
                class214.field3256[var79] = null;
                class115.field1598[var79] = null;
                class54.field626[var79] = null;
            }
            return var76;
        } else {
            return (class362) null;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ZI)V", line = 492)
    public final void method1740(boolean arg0, int arg1) {
        this.field3865 = arg0;
        this.method1745(-258477544);
        if (arg1 > 66) {
            field3875++;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIZ)V", line = 507)
    public final void method1741(int arg0, int arg1, boolean arg2) {
        field3877++;
        int var4 = class119.field1656[arg0];
        if (this.field3884[var4] != 0 && class186.method1280(-127, arg1) != null && arg2) {
            this.field3884[var4] = class77.method492(arg1, Integer.MIN_VALUE);
            this.method1745(-258477544);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "([I[IIZII)V", line = 527)
    public final void method1742(int[] arg0, int[] arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field3881++;
        if (arg4 != 340979472) {
            return;
        }
        if (this.field3887 != arg2) {
            this.field3871 = (int[][]) null;
            this.field3887 = arg2;
        }
        if (arg1 == null) {
            arg1 = new int[12];
            for (int var7 = 0; var7 < 8; var7++) {
                for (int var8 = 0; var8 < class55.field660; var8++) {
                    class55 var9 = class186.method1280(-127, var8);
                    if (var9 != null && !var9.field638 && (arg3 ? class106.field1459[var7] : class95.field1303[var7]) == var9.field654) {
                        arg1[class119.field1656[var7]] = class77.method492(var8, Integer.MIN_VALUE);
                        break;
                    }
                }
            }
        }
        this.field3879 = arg5;
        this.field3865 = arg3;
        this.field3884 = arg1;
        this.field3880 = arg0;
        this.method1745(-258477544);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IILro;IIIII)Lbf;", line = 595)
    public final class362 method1743(int arg0, int arg1, class111 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3888++;
        if (arg1 != -50) {
            method1749(-109);
        }
        long var9 = (long) arg6 << 32 | (long) (arg3 << 16) | (long) arg5;
        class362 var11 = (class362) class188.field2830.method380(0, var9);
        if (var11 == null) {
            int var12 = 0;
            class193[] var13 = new class193[3];
            if (!class186.method1280(-127, arg5).method330(arg1 ^ 0xFFFFFFFA) || !class186.method1280(arg1 - 78, arg3).method330(-60) || !class186.method1280(-128, arg6).method330(arg1 ^ 0xFFFFFFE2)) {
                return null;
            }
            class193 var14 = class186.method1280(-128, arg5).method329(true);
            if (var14 != null) {
                var13[var12++] = var14;
            }
            class193 var15 = class186.method1280(-128, arg3).method329(true);
            if (var15 != null) {
                var13[var12++] = var15;
            }
            class193 var16 = class186.method1280(-128, arg6).method329(true);
            if (var16 != null) {
                var13[var12++] = var16;
            }
            class193 var17 = new class193(var13, var12);
            for (int var18 = 0; var18 < 5; var18++) {
                if (this.field3880[var18] < class130.field1881[var18].length) {
                    var17.method1339(class54.field618[var18], class130.field1881[var18][this.field3880[var18]]);
                }
                if (class127.field1862[var18].length > this.field3880[var18]) {
                    var17.method1339(class79.field1059[var18], class127.field1862[var18][this.field3880[var18]]);
                }
            }
            var11 = var17.method1324(64, 768, -50, -10, -50);
            class188.field2830.method377(var9, var11, arg1 + 49);
        }
        if (arg2 != null) {
            var11 = arg2.method717(arg4, true, arg0, var11, arg7);
        }
        return var11;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(III)V", line = 662)
    public final void method1744(int arg0, int arg1, int arg2) {
        field3872++;
        if (arg2 == 1073741824) {
            this.field3880[arg0] = arg1;
            this.method1745(-258477544);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V", line = 676)
    private final void method1745(int arg0) {
        if (arg0 != -258477544) {
            this.method1745(-61);
        }
        field3883++;
        long[] var2 = class27.field323;
        long var3 = this.field3874;
        this.field3874 = -1L;
        this.field3874 = this.field3874 >>> 8 ^ var2[(int) ((this.field3874 ^ (long) (this.field3887 >> 8)) & 0xFFL)];
        this.field3874 = var2[(int) (((long) this.field3887 ^ this.field3874) & 0xFFL)] ^ this.field3874 >>> 8;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field3874 = this.field3874 >>> 8 ^ var2[(int) (((long) (this.field3884[var5] >> 24) ^ this.field3874) & 0xFFL)];
            this.field3874 = this.field3874 >>> 8 ^ var2[(int) ((this.field3874 ^ (long) (this.field3884[var5] >> 16)) & 0xFFL)];
            this.field3874 = this.field3874 >>> 8 ^ var2[(int) ((this.field3874 ^ (long) (this.field3884[var5] >> 8)) & 0xFFL)];
            this.field3874 = this.field3874 >>> 8 ^ var2[(int) ((this.field3874 ^ (long) this.field3884[var5]) & 0xFFL)];
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field3874 = var2[(int) ((this.field3874 ^ (long) this.field3880[var6]) & 0xFFL)] ^ this.field3874 >>> 8;
        }
        this.field3874 = this.field3874 >>> 8 ^ var2[(int) (((long) (this.field3865 ? 1 : 0) ^ this.field3874) & 0xFFL)];
        if (var3 != 0L && this.field3874 != var3) {
            class197.field3006.method382(var3, (byte) 84);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lro;BIII)Lbf;", line = 718)
    public final class362 method1746(class111 arg0, byte arg1, int arg2, int arg3, int arg4) {
        field3863++;
        if (this.field3879 != -1) {
            return class178.method1229(this.field3879, 8).method959(arg2, -76, arg3, arg4, arg0);
        }
        class362 var6 = (class362) class188.field2830.method380(0, this.field3874);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < 12; var8++) {
                int var9 = this.field3884[var8];
                if ((var9 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var9) != 0 && !class186.method1280(-127, var9 & 0x3FFFFFFF).method330(-128)) {
                        var7 = true;
                    }
                } else if (!class190.method1302(var9 & 0x3FFFFFFF, (byte) 13).method2175(this.field3865, (byte) 107)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class193[] var10 = new class193[12];
            int var11 = 0;
            for (int var12 = 0; var12 < 12; var12++) {
                int var13 = this.field3884[var12];
                if ((var13 & 0x40000000) != 0) {
                    class193 var14 = class190.method1302(var13 & 0x3FFFFFFF, (byte) -113).method2185((byte) -3, this.field3865);
                    if (var14 != null) {
                        var10[var11++] = var14;
                    }
                } else if ((var13 & Integer.MIN_VALUE) != 0) {
                    class193 var15 = class186.method1280(-127, var13 & 0x3FFFFFFF).method329(true);
                    if (var15 != null) {
                        var10[var11++] = var15;
                    }
                }
            }
            class193 var16 = new class193(var10, var11);
            for (int var17 = 0; var17 < 5; var17++) {
                if (this.field3880[var17] < class130.field1881[var17].length) {
                    var16.method1339(class54.field618[var17], class130.field1881[var17][this.field3880[var17]]);
                }
                if (class127.field1862[var17].length > this.field3880[var17]) {
                    var16.method1339(class79.field1059[var17], class127.field1862[var17][this.field3880[var17]]);
                }
            }
            var6 = var16.method1324(64, 768, -50, -10, -50);
            class188.field2830.method377(this.field3874, var6, -1);
        }
        if (arg1 < 125) {
            return (class362) null;
        } else {
            if (arg0 != null) {
                var6 = arg0.method717(arg4, true, arg2, var6, arg3);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(BIII)I", line = 834)
    public static final int method1747(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 != -84) {
            return 89;
        }
        field3869++;
        if ((class225.field3398[arg1][arg3][arg2] & 0x8) == 0) {
            return arg1 <= 0 || (class225.field3398[1][arg3][arg2] & 0x2) == 0 ? arg1 : arg1 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(BLwf;)V", line = 854)
    public static final void method1748(byte arg0, class67 arg1) {
        if (arg0 != 94) {
            return;
        }
        field3864++;
        class337 var2 = (class337) class168.field2574.method770(class294.method2093((byte) 100, arg1.field848), -123);
        if (var2 == null) {
            class218.method1517(0, arg1, (byte) 10, arg1.field3747[0], (class231) null, (class234) null, arg1.field3786[0], class219.field3290);
        } else {
            var2.method2328(128);
        }
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)V", line = 871)
    public static void method1749(int arg0) {
        field3873 = null;
        int var1 = 61 / ((arg0 + 9) / 58);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I[B)V", line = 895)
    public static final void method1750(int arg0, byte[] arg1) {
        field3886++;
        class143 var2 = new class143(arg1);
        var2.field2295 = arg1.length - 2;
        class10.field101 = var2.method1051(1);
        class110.field1518 = new int[class10.field101];
        class203.field3082 = new boolean[class10.field101];
        class279.field4392 = new byte[class10.field101][];
        class259.field4093 = new int[class10.field101];
        class33.field392 = new int[class10.field101];
        class14.field145 = new byte[class10.field101][];
        class245.field3855 = new int[class10.field101];
        var2.field2295 = arg1.length - (class10.field101 * 8) - 7;
        class122.field1683 = var2.method1051(1);
        class253.field4004 = var2.method1051(1);
        int var3 = (var2.method1043(true) & 0xFF) + 1;
        for (int var4 = 0; var4 < class10.field101; var4++) {
            class110.field1518[var4] = var2.method1051(class60.method368(arg0, 13));
        }
        for (int var5 = 0; var5 < class10.field101; var5++) {
            class33.field392[var5] = var2.method1051(class60.method368(arg0, 13));
        }
        for (int var6 = 0; var6 < class10.field101; var6++) {
            class245.field3855[var6] = var2.method1051(1);
        }
        for (int var7 = 0; var7 < class10.field101; var7++) {
            class259.field4093[var7] = var2.method1051(class60.method368(arg0, 13));
        }
        var2.field2295 = arg1.length - class10.field101 * 8 - ((var3 + -1) * 3) - 7;
        class251.field3978 = new int[var3];
        if (arg0 != 12) {
            return;
        }
        for (int var8 = 1; var8 < var3; var8++) {
            class251.field3978[var8] = var2.method1017((byte) 101);
            if (class251.field3978[var8] == 0) {
                class251.field3978[var8] = 1;
            }
        }
        var2.field2295 = 0;
        for (int var9 = 0; var9 < class10.field101; var9++) {
            int var10 = class259.field4093[var9];
            int var11 = class245.field3855[var9];
            boolean var12 = false;
            int var13 = var10 * var11;
            byte[] var14 = new byte[var13];
            class14.field145[var9] = var14;
            byte[] var15 = new byte[var13];
            class279.field4392[var9] = var15;
            int var16 = var2.method1043(true);
            if ((var16 & 0x1) == 0) {
                for (int var22 = 0; var22 < var13; var22++) {
                    var14[var22] = var2.method1028(class60.method368(arg0, 79030404));
                }
                if ((var16 & 0x2) != 0) {
                    for (int var23 = 0; var23 < var13; var23++) {
                        byte var24 = var15[var23] = var2.method1028(class60.method368(arg0, 79030404));
                        var12 |= var24 != -1;
                    }
                }
            } else {
                int var17 = 0;
                label91: while (true) {
                    if (var11 <= var17) {
                        if ((var16 & 0x2) == 0) {
                            break;
                        }
                        int var19 = 0;
                        while (true) {
                            if (var19 >= var11) {
                                break label91;
                            }
                            for (int var20 = 0; var20 < var10; var20++) {
                                byte var21 = var15[var19 + (var11 * var20)] = var2.method1028(arg0 + 79030396);
                                var12 |= var21 != -1;
                            }
                            var19++;
                        }
                    }
                    for (int var18 = 0; var18 < var10; var18++) {
                        var14[var11 * var18 + var17] = var2.method1028(class60.method368(arg0, 79030404));
                    }
                    var17++;
                }
            }
            class203.field3082[var9] = var12;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(II[[[Lwk;IIZ)Z", line = 1060)
    public static final boolean method1751(int arg0, int arg1, class196[][][] arg2, int arg3, int arg4, boolean arg5) {
        field3882++;
        byte var6 = arg5 ? 1 : (byte) (class182.field2745 & 0xFF);
        if (class349.field5569[class219.field3290][arg3][arg1] == var6) {
            return false;
        } else if ((class225.field3398[class219.field3290][arg3][arg1] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            if (arg4 != -1) {
                method1750(-86, (byte[]) null);
            }
            class291.field4585[var7] = arg3;
            int var31 = var7 + 1;
            class63.field761[var7] = arg1;
            class349.field5569[class219.field3290][arg3][arg1] = var6;
            int var8 = 0;
            while (var31 != var8) {
                int var9 = class291.field4585[var8] & 0xFFFF;
                int var10 = class291.field4585[var8] >> 24 & 0xFF;
                int var11 = (class291.field4585[var8] & 0xFF62ED) >> 16;
                int var12 = class63.field761[var8] & 0xFFFF;
                int var13 = (class63.field761[var8] & 0xFFCA53) >> 16;
                boolean var14 = false;
                if ((class225.field3398[class219.field3290][var9][var12] & 0x4) == 0) {
                    var14 = true;
                }
                var8 = var8 + 1 & 0xFFF;
                boolean var15 = false;
                label250: for (int var16 = class219.field3290 + 1; var16 <= 3; var16++) {
                    if ((class225.field3398[var16][var9][var12] & 0x8) == 0) {
                        if (var14 && arg2[var16][var9][var12] != null) {
                            if (arg2[var16][var9][var12].field2999 != null) {
                                int var17 = class227.method1580(arg4 + 128, var11);
                                if (arg2[var16][var9][var12].field2999.field1690 == var17 || arg2[var16][var9][var12].field2999.field1689 == var17) {
                                    continue;
                                }
                                if (var10 != 0) {
                                    int var18 = class227.method1580(arg4 ^ 0xFFFFFF89, var10);
                                    if (arg2[var16][var9][var12].field2999.field1690 == var18 || arg2[var16][var9][var12].field2999.field1689 == var18) {
                                        continue;
                                    }
                                }
                                if (var13 != 0) {
                                    int var19 = class227.method1580(117, var13);
                                    if (arg2[var16][var9][var12].field2999.field1690 == var19 || arg2[var16][var9][var12].field2999.field1689 == var19) {
                                        continue;
                                    }
                                }
                            }
                            if (arg2[var16][var9][var12].field2998 != null) {
                                for (int var20 = 0; var20 < arg2[var16][var9][var12].field2979; var20++) {
                                    int var21 = (int) (arg2[var16][var9][var12].field2998[var20].field502 >> 14 & 0x3FL);
                                    if (var21 == 21) {
                                        var21 = 19;
                                    }
                                    int var22 = (int) (arg2[var16][var9][var12].field2998[var20].field502 >> 20 & 0x3L);
                                    int var23 = var22 << 6 | var21;
                                    if (var11 == var23 || var10 != 0 && var10 == var23 || var13 != 0 && var13 == var23) {
                                        continue label250;
                                    }
                                }
                            }
                        }
                        var15 = true;
                        class196 var24 = arg2[var16][var9][var12];
                        if (var24 != null && var24.field2979 > 0) {
                            for (int var25 = 0; var25 < var24.field2979; var25++) {
                                class44 var26 = var24.field2998[var25];
                                if (var26.field504 != var26.field501 || var26.field498 != var26.field497) {
                                    for (int var27 = var26.field504; var27 <= var26.field501; var27++) {
                                        for (int var28 = var26.field497; var28 <= var26.field498; var28++) {
                                            class349.field5569[var16][var27][var28] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class349.field5569[var16][var9][var12] = var6;
                    }
                }
                if (var15) {
                    int var29 = var9 << 7;
                    int var30 = var12 << 7;
                    if (class72.field902[class219.field3290 + 1][var9][var12] > class274.field4338[arg0]) {
                        class274.field4338[arg0] = class72.field902[class219.field3290 + 1][var9][var12];
                    }
                    if (class201.field3054[arg0] > var29) {
                        class201.field3054[arg0] = var29;
                    } else if (class187.field2828[arg0] < var29) {
                        class187.field2828[arg0] = var29;
                    }
                    if (var30 < class131.field1894[arg0]) {
                        class131.field1894[arg0] = var30;
                    } else if (var30 > class238.field3664[arg0]) {
                        class238.field3664[arg0] = var30;
                    }
                }
                if (!var14) {
                    if (var9 >= 1 && class349.field5569[class219.field3290][var9 - 1][var12] != var6) {
                        class291.field4585[var31] = class77.method492(class77.method492(var9 - 1, 1179648), -754974720);
                        class63.field761[var31] = class77.method492(var12, 1245184);
                        class349.field5569[class219.field3290][var9 - 1][var12] = var6;
                        var31 = var31 + 1 & 0xFFF;
                    }
                    var12++;
                    if (var12 < 104) {
                        if (var9 - 1 >= 0 && class349.field5569[class219.field3290][var9 - 1][var12] != var6 && (class225.field3398[class219.field3290][var9][var12] & 0x4) == 0 && (class225.field3398[class219.field3290][var9 - 1][var12 - 1] & 0x4) == 0) {
                            class291.field4585[var31] = class77.method492(1375731712, class77.method492(var9 - 1, 1179648));
                            class63.field761[var31] = class77.method492(var12, 1245184);
                            class349.field5569[class219.field3290][var9 - 1][var12] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (class349.field5569[class219.field3290][var9][var12] != var6) {
                            class291.field4585[var31] = class77.method492(class77.method492(5373952, var9), 318767104);
                            class63.field761[var31] = class77.method492(var12, 5439488);
                            var31 = var31 + 1 & 0xFFF;
                            class349.field5569[class219.field3290][var9][var12] = var6;
                        }
                        if ((var9 + 1) < 104 && class349.field5569[class219.field3290][var9 + 1][var12] != var6 && (class225.field3398[class219.field3290][var9][var12] & 0x4) == 0 && (class225.field3398[class219.field3290][var9 + 1][var12 - 1] & 0x4) == 0) {
                            class291.field4585[var31] = class77.method492(-1845493760, class77.method492(var9 + 1, 5373952));
                            class63.field761[var31] = class77.method492(5439488, var12);
                            class349.field5569[class219.field3290][var9 + 1][var12] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                    }
                    var12--;
                    if ((var9 + 1) < 104 && class349.field5569[class219.field3290][var9 + 1][var12] != var6) {
                        class291.field4585[var31] = class77.method492(1392508928, class77.method492(9568256, var9 + 1));
                        class63.field761[var31] = class77.method492(var12, 9633792);
                        class349.field5569[class219.field3290][var9 + 1][var12] = var6;
                        var31 = var31 + 1 & 0xFFF;
                    }
                    var12--;
                    if (var12 >= 0) {
                        if ((var9 - 1) >= 0 && class349.field5569[class219.field3290][var9 - 1][var12] != var6 && (class225.field3398[class219.field3290][var9][var12] & 0x4) == 0 && (class225.field3398[class219.field3290][var9 - 1][var12 + 1] & 0x4) == 0) {
                            class291.field4585[var31] = class77.method492(301989888, class77.method492(var9 - 1, 13762560));
                            class63.field761[var31] = class77.method492(var12, 13828096);
                            var31 = var31 + 1 & 0xFFF;
                            class349.field5569[class219.field3290][var9 - 1][var12] = var6;
                        }
                        if (class349.field5569[class219.field3290][var9][var12] != var6) {
                            class291.field4585[var31] = class77.method492(class77.method492(13762560, var9), -1828716544);
                            class63.field761[var31] = class77.method492(var12, 13828096);
                            var31 = var31 + 1 & 0xFFF;
                            class349.field5569[class219.field3290][var9][var12] = var6;
                        }
                        if ((var9 + 1) < 104 && class349.field5569[class219.field3290][var9 + 1][var12] != var6 && (class225.field3398[class219.field3290][var9][var12] & 0x4) == 0 && (class225.field3398[class219.field3290][var9 + 1][var12 + 1] & 0x4) == 0) {
                            class291.field4585[var31] = class77.method492(class77.method492(var9 + 1, 9568256), -771751936);
                            class63.field761[var31] = class77.method492(var12, 9633792);
                            class349.field5569[class219.field3290][var9 + 1][var12] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                    }
                }
            }
            if (class274.field4338[arg0] != -1000000) {
                class274.field4338[arg0] += 10;
                class201.field3054[arg0] -= 50;
                class187.field2828[arg0] += 50;
                class238.field3664[arg0] += 50;
                class131.field1894[arg0] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(II)Lsb;", line = 1372)
    public static final class126 method1752(int arg0, int arg1) {
        class126 var2 = (class126) class267.field4201.method1998(-1114531641, (long) arg1);
        if (arg0 != 5439488) {
            field3873 = (String) null;
        }
        field3885++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class309.field4821.method100(arg1, 0, (byte) -107);
        if (var3 == null || var3.length <= 1) {
            return null;
        } else {
            class126 var4 = class42.method265(var3, (byte) -128);
            class267.field4201.method2000(var4, (byte) -128, (long) arg1);
            return var4;
        }
    }

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "(I)I", line = 1398)
    public final int method1753(int arg0) {
        if (arg0 != 346087929) {
            this.method1740(true, 106);
        }
        field3876++;
        return this.field3879 == -1 ? (this.field3884[0] << 15) + (this.field3880[4] << 20) + (this.field3884[8] << 10) + (this.field3880[0] << 25) + this.field3884[1] + (this.field3884[11] << 5) : class178.method1229(this.field3879, 8).field2094 + 305419896;
    }
}
