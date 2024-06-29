import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class207 {

    @OriginalMember(owner = "client!oj", name = "m", descriptor = "I")
    public static int field3190 = 0;

    @OriginalMember(owner = "client!oj", name = "s", descriptor = "I")
    public static int field3196 = -1;

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "I")
    public static int field3179;

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "I")
    public static int field3182;

    @OriginalMember(owner = "client!oj", name = "f", descriptor = "I")
    public static int field3183;

    @OriginalMember(owner = "client!oj", name = "h", descriptor = "I")
    public static int field3185;

    @OriginalMember(owner = "client!oj", name = "i", descriptor = "I")
    public static int field3186;

    @OriginalMember(owner = "client!oj", name = "j", descriptor = "I")
    public static int field3187;

    @OriginalMember(owner = "client!oj", name = "k", descriptor = "I")
    public static int field3188;

    @OriginalMember(owner = "client!oj", name = "l", descriptor = "I")
    public static int field3189;

    @OriginalMember(owner = "client!oj", name = "n", descriptor = "I")
    private int field3191;

    @OriginalMember(owner = "client!oj", name = "o", descriptor = "I")
    public static int field3192;

    @OriginalMember(owner = "client!oj", name = "q", descriptor = "I")
    public static int field3194;

    @OriginalMember(owner = "client!oj", name = "t", descriptor = "I")
    public int field3197;

    @OriginalMember(owner = "client!oj", name = "u", descriptor = "I")
    public static int field3198;

    @OriginalMember(owner = "client!oj", name = "v", descriptor = "I")
    public static int field3199;

    @OriginalMember(owner = "client!oj", name = "w", descriptor = "I")
    public static int field3200;

    @OriginalMember(owner = "client!oj", name = "y", descriptor = "I")
    public static int field3202;

    @OriginalMember(owner = "client!oj", name = "g", descriptor = "J")
    private long field3184;

    @OriginalMember(owner = "client!oj", name = "r", descriptor = "J")
    private long field3195;

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "Luh;")
    public static class95 field3180;

    @OriginalMember(owner = "client!oj", name = "x", descriptor = "Z")
    public boolean field3201;

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "[I")
    private int[] field3181;

    @OriginalMember(owner = "client!oj", name = "p", descriptor = "[I")
    public int[] field3193;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "[[I")
    private int[][] field3178;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IBIIILbg;II)Lhm;", line = 9)
    public final class52 method1533(int arg0, byte arg1, int arg2, int arg3, int arg4, class93 arg5, int arg6, int arg7) {
        int var9 = -115 % ((7 - arg1) / 61);
        field3200++;
        long var10 = (long) arg3 << 32 | (long) (arg2 << 16) | (long) arg6;
        class52 var12 = (class52) class63.field967.method654(-59, var10);
        if (var12 == null) {
            class40[] var13 = new class40[3];
            int var14 = 0;
            if (!class332.method2343(-100, arg6).method2164((byte) -7) || !class332.method2343(106, arg2).method2164((byte) -7) || !class332.method2343(65, arg3).method2164((byte) -7)) {
                return null;
            }
            class40 var15 = class332.method2343(-36, arg6).method2161(0);
            if (var15 != null) {
                var13[var14++] = var15;
            }
            class40 var16 = class332.method2343(69, arg2).method2161(0);
            if (var16 != null) {
                var13[var14++] = var16;
            }
            class40 var17 = class332.method2343(-56, arg3).method2161(0);
            if (var17 != null) {
                var13[var14++] = var17;
            }
            class40 var18 = new class40(var13, var14);
            for (int var19 = 0; var19 < 5; var19++) {
                if (class296.field4596[var19].length > this.field3193[var19]) {
                    var18.method421(class186.field2910[var19], class296.field4596[var19][this.field3193[var19]]);
                }
                if (class212.field3335[var19].length > this.field3193[var19]) {
                    var18.method421(class270.field4162[var19], class212.field3335[var19][this.field3193[var19]]);
                }
            }
            var12 = var18.method410(64, 768, -50, -10, -50);
            class63.field967.method652(118, var12, var10);
        }
        if (arg5 != null) {
            var12 = arg5.method833(arg4, -3, arg7, arg0, var12);
        }
        return var12;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(BII)V", line = 73)
    public final void method1534(byte arg0, int arg1, int arg2) {
        field3194++;
        this.field3193[arg1] = arg2;
        this.method1539(8693);
        if (arg0 != 32) {
            this.method1542(13, (int[]) null, (int[]) null, true, -2, (byte) -114);
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lbg;ZLbg;Z[Lqe;IIIIIII)Lhm;", line = 85)
    public final class52 method1535(class93 arg0, boolean arg1, class93 arg2, boolean arg3, class349[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field3183++;
        if (this.field3197 != -1) {
            return class343.method2417(this.field3197, (byte) -67).method1126(arg0, arg8, arg4, 93, arg11, arg5, arg2, arg6, arg7, arg10);
        }
        long var13 = this.field3195;
        int[] var15 = this.field3181;
        if (arg2 != null && (arg2.field1401 >= 0 || arg2.field1414 >= 0)) {
            var15 = new int[12];
            for (int var16 = 0; var16 < 12; var16++) {
                var15[var16] = this.field3181[var16];
            }
            if (arg2.field1401 >= 0) {
                if (arg2.field1401 == 65535) {
                    var15[5] = 0;
                    var13 ^= 0xFFFFFFFF00000000L;
                } else {
                    var15[5] = class41.method426(1073741824, arg2.field1401);
                    var13 ^= (long) var15[5] << 32;
                }
            }
            if (arg2.field1414 >= 0) {
                if (arg2.field1414 == 65535) {
                    var15[3] = 0;
                    var13 ^= 0xFFFFFFFFL;
                } else {
                    var15[3] = class41.method426(1073741824, arg2.field1414);
                    var13 ^= (long) var15[3];
                }
            }
        }
        class52 var17 = (class52) class224.field3496.method654(-94, var13);
        if (var17 == null) {
            boolean var18 = false;
            for (int var19 = 0; var19 < 12; var19++) {
                int var20 = var15[var19];
                if ((var20 & 0x40000000) == 0) {
                    if ((var20 & Integer.MIN_VALUE) != 0 && !class332.method2343(73, var20 & 0x3FFFFFFF).method2166(true)) {
                        var18 = true;
                    }
                } else if (!class48.method469(10, var20 & 0x3FFFFFFF).method1945(this.field3201, true)) {
                    var18 = true;
                }
            }
            if (var18) {
                if (this.field3184 != -1L) {
                    var17 = (class52) class224.field3496.method654(-46, this.field3184);
                }
                if (var17 == null) {
                    return null;
                }
            }
            if (var17 == null) {
                class40[] var21 = new class40[12];
                for (int var22 = 0; var22 < 12; var22++) {
                    int var23 = var15[var22];
                    if ((var23 & 0x40000000) != 0) {
                        class40 var25 = class48.method469(10, var23 & 0x3FFFFFFF).method1935(this.field3201, 102);
                        if (var25 != null) {
                            var21[var22] = var25;
                        }
                    } else if ((var23 & Integer.MIN_VALUE) != 0) {
                        class40 var24 = class332.method2343(-91, var23 & 0x3FFFFFFF).method2165(true);
                        if (var24 != null) {
                            var21[var22] = var24;
                        }
                    }
                }
                class109 var26 = null;
                if (this.field3191 != -1) {
                    var26 = class108.method943(91, this.field3191);
                }
                if (var26 != null && var26.field1670 != null) {
                    for (int var27 = 0; var27 < var26.field1670.length; var27++) {
                        if (var26.field1670[var27] != null && var21[var27] != null) {
                            int var28 = var26.field1670[var27][0];
                            int var29 = var26.field1670[var27][1];
                            int var30 = var26.field1670[var27][2];
                            int var31 = var26.field1670[var27][3];
                            int var32 = var26.field1670[var27][5];
                            int var33 = var26.field1670[var27][4];
                            if (this.field3178 == null) {
                                this.field3178 = new int[var26.field1670.length][];
                            }
                            if (this.field3178[var27] == null) {
                                int[] var34 = this.field3178[var27] = new int[15];
                                if (var31 == 0 && var33 == 0 && var32 == 0) {
                                    var34[12] = -var28;
                                    var34[13] = -var29;
                                    var34[0] = var34[4] = var34[8] = 32768;
                                    var34[14] = -var30;
                                } else {
                                    int var35 = class107.field1605[var31] >> 1;
                                    int var36 = class107.field1604[var33] >> 1;
                                    int var37 = class107.field1604[var31] >> 1;
                                    int var38 = class107.field1605[var32] >> 1;
                                    int var39 = class107.field1604[var32] >> 1;
                                    int var40 = class107.field1605[var33] >> 1;
                                    var34[8] = var35 * var40 + 16384 >> 15;
                                    var34[5] = -var37;
                                    var34[4] = var35 * var38 + 16384 >> 15;
                                    var34[3] = var35 * var39 + 16384 >> 15;
                                    int var41 = var37 * var38 + 16384 >> 15;
                                    var34[2] = var35 * var36 + 16384 >> 15;
                                    var34[7] = -var36 * -var39 + var40 * var41 + 16384 >> 15;
                                    var34[1] = -var39 * var40 + var36 * var41 + 16384 >> 15;
                                    int var42 = var37 * var39 + 16384 >> 15;
                                    var34[0] = var36 * var42 + var38 * var40 + 16384 >> 15;
                                    var34[14] = var34[2] * -var28 + 16384 - (-(var34[5] * -var29) + -(var34[8] * -var30)) >> 15;
                                    var34[6] = -var36 * var38 + var40 * var42 + 16384 >> 15;
                                    var34[13] = var34[7] * -var30 + var34[4] * -var29 + var34[1] * -var28 + 16384 >> 15;
                                    var34[12] = var34[0] * -var28 - (-(var34[3] * -var29) - (var34[6] * -var30) - 16384) >> 15;
                                }
                                var34[11] = var30;
                                var34[10] = var29;
                                var34[9] = var28;
                            }
                            if (var31 != 0 || var33 != 0 || var32 != 0) {
                                var21[var27].method404(var31, var33, var32);
                            }
                            if (var28 != 0 || var29 != 0 || var30 != 0) {
                                var21[var27].method395(var28, var29, var30);
                            }
                        }
                    }
                }
                class40 var43 = new class40(var21, var21.length);
                for (int var44 = 0; var44 < 5; var44++) {
                    if (this.field3193[var44] < class296.field4596[var44].length) {
                        var43.method421(class186.field2910[var44], class296.field4596[var44][this.field3193[var44]]);
                    }
                    if (this.field3193[var44] < class212.field3335[var44].length) {
                        var43.method421(class270.field4162[var44], class212.field3335[var44][this.field3193[var44]]);
                    }
                }
                var17 = var43.method410(64, 850, -30, -50, -30);
                if (class240.field3737) {
                    ((class56) var17).method544(false, false, true, true, false, false, true);
                }
                if (arg3) {
                    class224.field3496.method652(63, var17, var13);
                    this.field3184 = var13;
                }
            }
        }
        boolean var45 = false;
        boolean var46 = false;
        boolean var47 = false;
        boolean var48 = false;
        int var49 = arg4 == null ? 0 : arg4.length;
        for (int var50 = 0; var50 < var49; var50++) {
            if (arg4[var50] != null) {
                class93 var51 = class126.method1091((byte) 66, arg4[var50].field5542);
                if (var51.field1428 != null) {
                    class298.field4621[var50] = var51;
                    var45 = true;
                    int var52 = arg4[var50].field5535;
                    int var53 = arg4[var50].field5539;
                    int var54 = var51.field1428[var52];
                    class231.field3611[var50] = class178.method1396(var54 >>> 16, 0);
                    int var55 = var54 & 0xFFFF;
                    class102.field1532[var50] = var55;
                    if (class231.field3611[var50] != null) {
                        var46 |= class231.field3611[var50].method1298(var55, 32);
                        var48 |= class231.field3611[var50].method1299(var55, 18329);
                        var47 |= var51.field1421;
                    }
                    if ((var51.field1420 || class170.field2683) && var53 != -1 && var51.field1428.length > var53) {
                        class184.field2888[var50] = var51.field1429[var52];
                        class162.field2570[var50] = arg4[var50].field5547;
                        int var56 = var51.field1428[var53];
                        class209.field3212[var50] = class178.method1396(var56 >>> 16, 0);
                        int var57 = var56 & 0xFFFF;
                        class116.field1778[var50] = var57;
                        if (class209.field3212[var50] != null) {
                            var46 |= class209.field3212[var50].method1298(var57, 32);
                            var48 |= class209.field3212[var50].method1299(var57, 18329);
                        }
                    } else {
                        class184.field2888[var50] = 0;
                        class162.field2570[var50] = 0;
                        class209.field3212[var50] = null;
                        class116.field1778[var50] = -1;
                    }
                }
            }
        }
        if (var45 || arg2 != null || arg0 != null) {
            int var58 = -1;
            int var59 = -1;
            int var60 = 0;
            class162 var61 = null;
            class162 var62 = null;
            if (arg2 != null) {
                int var63 = arg2.field1428[arg10];
                int var64 = var63 >>> 16;
                var61 = class178.method1396(var64, 0);
                var58 = var63 & 0xFFFF;
                if (var61 != null) {
                    var46 |= var61.method1298(var58, 32);
                    var48 |= var61.method1299(var58, 18329);
                    var47 |= arg2.field1421;
                }
                if ((arg2.field1420 || class170.field2683) && arg5 != -1 && arg2.field1428.length > arg5) {
                    var60 = arg2.field1429[arg10];
                    int var65 = arg2.field1428[arg5];
                    int var66 = var65 >>> 16;
                    var59 = var65 & 0xFFFF;
                    if (var64 == var66) {
                        var62 = var61;
                    } else {
                        var62 = class178.method1396(var59 >>> 16, 0);
                    }
                    if (var62 != null) {
                        var46 |= var62.method1298(var59, 32);
                        var48 |= var62.method1299(var59, 18329);
                    }
                }
            }
            int var67 = -1;
            int var68 = 0;
            int var69 = -1;
            class162 var70 = null;
            class162 var71 = null;
            if (arg0 != null) {
                int var72 = arg0.field1428[arg11];
                int var73 = var72 >>> 16;
                var70 = class178.method1396(var73, 0);
                var69 = var72 & 0xFFFF;
                if (var70 != null) {
                    var46 |= var70.method1298(var69, 32);
                    var48 |= var70.method1299(var69, 18329);
                    var47 |= arg0.field1421;
                }
                if ((arg0.field1420 || class170.field2683) && arg6 != -1 && arg0.field1428.length > arg6) {
                    int var74 = arg0.field1428[arg6];
                    var68 = arg0.field1429[arg11];
                    int var75 = var74 >>> 16;
                    var67 = var74 & 0xFFFF;
                    if (var73 == var75) {
                        var71 = var70;
                    } else {
                        var71 = class178.method1396(var67 >>> 16, 0);
                    }
                    if (var71 != null) {
                        var46 |= var71.method1298(var67, 32);
                        var48 |= var71.method1299(var67, 18329);
                    }
                }
            }
            class52 var76 = var17.method516(!var48, !var46, !var47);
            int var77 = 0;
            int var78 = 1;
            while (var49 > var77) {
                if (class231.field3611[var77] != null) {
                    var76.method514(class231.field3611[var77], class102.field1532[var77], class209.field3212[var77], class116.field1778[var77], class162.field2570[var77] - 1, class184.field2888[var77], var78, class298.field4621[var77].field1421, this.field3178[var77]);
                }
                var78 <<= 0x1;
                var77++;
            }
            if (arg9 < 25) {
                this.method1537(true, 88);
            }
            if (var61 != null && var70 != null) {
                var76.method500(var61, var58, var62, var59, arg8 - 1, var60, var70, var69, var71, var67, arg7 - 1, var68, arg2.field1408, arg2.field1421 | arg0.field1421);
            } else if (var61 != null) {
                var76.method496(var61, var58, var62, var59, arg8 - 1, var60, arg2.field1421);
            } else if (var70 != null) {
                var76.method496(var70, var69, var71, var67, arg7 - 1, var68, arg0.field1421);
            }
            for (int var79 = 0; var79 < var49; var79++) {
                class231.field3611[var79] = null;
                class209.field3212[var79] = null;
                class298.field4621[var79] = null;
            }
            return var76;
        } else if (arg1) {
            return var17.method516(false, false, false);
        } else {
            return var17;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lbg;IIII)Lhm;", line = 564)
    public final class52 method1536(class93 arg0, int arg1, int arg2, int arg3, int arg4) {
        field3185++;
        if (this.field3197 != -1) {
            return class343.method2417(this.field3197, (byte) -79).method1125(arg1, arg0, arg4, (byte) -127, arg3);
        }
        class52 var6 = (class52) class63.field967.method654(81, this.field3195);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < 12; var8++) {
                int var9 = this.field3181[var8];
                if ((var9 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var9) != 0 && !class332.method2343(96, var9 & 0x3FFFFFFF).method2164((byte) -7)) {
                        var7 = true;
                    }
                } else if (!class48.method469(10, var9 & 0x3FFFFFFF).method1947(this.field3201, (byte) -7)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class40[] var10 = new class40[12];
            int var11 = 0;
            for (int var12 = 0; var12 < 12; var12++) {
                int var13 = this.field3181[var12];
                if ((var13 & 0x40000000) != 0) {
                    class40 var15 = class48.method469(10, var13 & 0x3FFFFFFF).method1933((byte) -102, this.field3201);
                    if (var15 != null) {
                        var10[var11++] = var15;
                    }
                } else if ((var13 & Integer.MIN_VALUE) != 0) {
                    class40 var14 = class332.method2343(72, var13 & 0x3FFFFFFF).method2161(0);
                    if (var14 != null) {
                        var10[var11++] = var14;
                    }
                }
            }
            class40 var16 = new class40(var10, var11);
            for (int var17 = 0; var17 < 5; var17++) {
                if (this.field3193[var17] < class296.field4596[var17].length) {
                    var16.method421(class186.field2910[var17], class296.field4596[var17][this.field3193[var17]]);
                }
                if (class212.field3335[var17].length > this.field3193[var17]) {
                    var16.method421(class270.field4162[var17], class212.field3335[var17][this.field3193[var17]]);
                }
            }
            var6 = var16.method410(64, 768, -50, -10, -50);
            class63.field967.method652(-84, var6, this.field3195);
        }
        if (arg2 >= -89) {
            return (class52) null;
        } else {
            if (arg0 != null) {
                var6 = arg0.method833(arg3, -3, arg4, arg1, var6);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(ZI)V", line = 680)
    public final void method1537(boolean arg0, int arg1) {
        field3182++;
        if (arg1 != Integer.MIN_VALUE) {
            field3190 = -81;
        }
        this.field3201 = arg0;
        this.method1539(arg1 ^ 0x800021F5);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)I", line = 708)
    public final int method1538(int arg0) {
        int var2 = -7 % ((arg0 + 69) / 54);
        field3187++;
        return this.field3197 == -1 ? (this.field3193[0] << 25) + (this.field3193[4] << 20) + (this.field3181[11] << 5) + this.field3181[1] - (-(this.field3181[0] << 15) - (this.field3181[8] << 10)) : 305419896 - -class343.method2417(this.field3197, (byte) 104).field2171;
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(I)V", line = 728)
    private final void method1539(int arg0) {
        field3199++;
        long var2 = this.field3195;
        this.field3195 = -1L;
        long[] var4 = class157.field2518;
        this.field3195 = this.field3195 >>> 8 ^ var4[(int) ((this.field3195 ^ (long) (this.field3191 >> 8)) & 0xFFL)];
        this.field3195 = this.field3195 >>> 8 ^ var4[(int) (((long) this.field3191 ^ this.field3195) & 0xFFL)];
        if (arg0 != 8693) {
            return;
        }
        for (int var5 = 0; var5 < 12; var5++) {
            this.field3195 = this.field3195 >>> 8 ^ var4[(int) (((long) (this.field3181[var5] >> 24) ^ this.field3195) & 0xFFL)];
            this.field3195 = this.field3195 >>> 8 ^ var4[(int) (((long) (this.field3181[var5] >> 16) ^ this.field3195) & 0xFFL)];
            this.field3195 = var4[(int) ((this.field3195 ^ (long) (this.field3181[var5] >> 8)) & 0xFFL)] ^ this.field3195 >>> 8;
            this.field3195 = var4[(int) (((long) this.field3181[var5] ^ this.field3195) & 0xFFL)] ^ this.field3195 >>> 8;
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field3195 = var4[(int) (((long) this.field3193[var6] ^ this.field3195) & 0xFFL)] ^ this.field3195 >>> 8;
        }
        this.field3195 = this.field3195 >>> 8 ^ var4[(int) (((long) (this.field3201 ? 1 : 0) ^ this.field3195) & 0xFFL)];
        if (var2 != 0L && this.field3195 != var2) {
            class224.field3496.method653((byte) 44, var2);
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIB)V", line = 779)
    public final void method1540(int arg0, int arg1, byte arg2) {
        int var4 = class324.field4982[arg1];
        field3202++;
        if (this.field3181[var4] == 0 || class332.method2343(124, arg0) == null) {
            return;
        }
        this.field3181[var4] = class41.method426(Integer.MIN_VALUE, arg0);
        this.method1539(8693);
        if (arg2 != 27) {
            this.field3178 = (int[][]) ((int[][]) null);
        }
    }

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "(I)V", line = 806)
    public static void method1541(int arg0) {
        field3180 = null;
        if (arg0 != -1288916689) {
            method1541(116);
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I[I[IZIB)V", line = 816)
    public final void method1542(int arg0, int[] arg1, int[] arg2, boolean arg3, int arg4, byte arg5) {
        field3198++;
        if (this.field3191 != arg0) {
            this.field3178 = (int[][]) null;
            this.field3191 = arg0;
        }
        if (arg2 == null) {
            arg2 = new int[12];
            for (int var7 = 0; var7 < 8; var7++) {
                for (int var8 = 0; var8 < class253.field3904; var8++) {
                    class300 var9 = class332.method2343(120, var8);
                    if (var9 != null && !var9.field4665 && var9.field4662 == (arg3 ? class202.field3113[var7] : class34.field531[var7])) {
                        arg2[class324.field4982[var7]] = class41.method426(Integer.MIN_VALUE, var8);
                        break;
                    }
                }
            }
        }
        this.field3201 = arg3;
        this.field3181 = arg2;
        this.field3197 = arg4;
        this.field3193 = arg1;
        int var10 = -82 % ((arg5 + 47) / 37);
        this.method1539(8693);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIZII)V", line = 867)
    public static final void method1543(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field3189++;
        if (arg1 < 8) {
            field3190 = -112;
        }
        class260.field3993 = 0L;
        int var5 = class113.method969(1);
        if (arg4 == 3 || var5 == 3) {
            arg2 = true;
        }
        if (class323.field4961.startsWith("mac") && arg4 > 0) {
            arg2 = true;
        }
        boolean var6 = false;
        if (var5 > 0 != arg4 > 0) {
            var6 = true;
        }
        if (arg2 && arg4 > 0) {
            var6 = true;
        }
        class268.method1971(arg2, var5, arg0, (byte) 86, var6, arg4, arg3);
    }
}
