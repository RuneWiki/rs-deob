import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class270 {

    @OriginalMember(owner = "client!am", name = "b", descriptor = "I")
    public static int field4154 = 0;

    @OriginalMember(owner = "client!am", name = "g", descriptor = "Z")
    public static boolean field4159 = false;

    @OriginalMember(owner = "client!am", name = "p", descriptor = "I")
    public static int field4168 = 0;

    @OriginalMember(owner = "client!am", name = "m", descriptor = "F")
    public static float field4165;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "I")
    public static int field4153;

    @OriginalMember(owner = "client!am", name = "e", descriptor = "I")
    public static int field4157;

    @OriginalMember(owner = "client!am", name = "h", descriptor = "I")
    public int field4160;

    @OriginalMember(owner = "client!am", name = "i", descriptor = "I")
    public static int field4161;

    @OriginalMember(owner = "client!am", name = "j", descriptor = "I")
    public static int field4162;

    @OriginalMember(owner = "client!am", name = "k", descriptor = "I")
    private int field4163;

    @OriginalMember(owner = "client!am", name = "n", descriptor = "I")
    public static int field4166;

    @OriginalMember(owner = "client!am", name = "o", descriptor = "I")
    public static int field4167;

    @OriginalMember(owner = "client!am", name = "s", descriptor = "I")
    public static int field4171;

    @OriginalMember(owner = "client!am", name = "t", descriptor = "I")
    public static int field4172;

    @OriginalMember(owner = "client!am", name = "u", descriptor = "I")
    public static int field4173;

    @OriginalMember(owner = "client!am", name = "d", descriptor = "J")
    private long field4156;

    @OriginalMember(owner = "client!am", name = "f", descriptor = "J")
    private long field4158;

    @OriginalMember(owner = "client!am", name = "l", descriptor = "Z")
    public boolean field4164;

    @OriginalMember(owner = "client!am", name = "c", descriptor = "[I")
    private int[] field4155;

    @OriginalMember(owner = "client!am", name = "r", descriptor = "[I")
    public int[] field4170;

    @OriginalMember(owner = "client!am", name = "q", descriptor = "[[I")
    private int[][] field4169;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(BZ)V", line = 5)
    public final void method1914(byte arg0, boolean arg1) {
        if (arg0 < -68) {
            field4167++;
            this.field4164 = arg1;
            this.method1920((byte) -116);
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(III)V", line = 22)
    public final void method1915(int arg0, int arg1, int arg2) {
        this.field4170[arg0] = arg1;
        this.method1920((byte) -118);
        if (arg2 != 614742895) {
            this.field4155 = (int[]) null;
        }
        field4153++;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(B)I", line = 35)
    public final int method1916(byte arg0) {
        field4171++;
        if (arg0 != 21) {
            this.method1917(34, -34, (class38) null, -86, (class63[]) null, false, 29, -120, 68, (class38) null, 87);
        }
        return this.field4160 == -1 ? (this.field4155[11] << 5) + this.field4155[1] + (this.field4155[8] << 10) + (this.field4155[0] << 15) + (this.field4170[0] << 25) + (this.field4170[4] << 20) : class310.method2191(this.field4160, 90).field1361 + 305419896;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IILhn;I[Lil;ZIIILhn;I)Lie;", line = 61)
    public final class94 method1917(int arg0, int arg1, class38 arg2, int arg3, class63[] arg4, boolean arg5, int arg6, int arg7, int arg8, class38 arg9, int arg10) {
        field4172++;
        if (this.field4160 != -1) {
            return class310.method2191(this.field4160, 97).method671(arg8, arg1, arg6, true, arg2, arg9, arg7, arg3, arg4, arg10);
        }
        long var12 = this.field4158;
        int[] var14 = this.field4155;
        if (arg9 != null && (arg9.field562 >= 0 || arg9.field579 >= 0)) {
            var14 = new int[12];
            for (int var15 = 0; var15 < 12; var15++) {
                var14[var15] = this.field4155[var15];
            }
            if (arg9.field562 >= 0) {
                if (arg9.field562 == 65535) {
                    var14[5] = 0;
                    var12 ^= 0xFFFFFFFF00000000L;
                } else {
                    var14[5] = class251.method1740(1073741824, arg9.field562);
                    var12 ^= (long) var14[5] << 32;
                }
            }
            if (arg9.field579 >= 0) {
                if (arg9.field579 == 65535) {
                    var12 ^= 0xFFFFFFFFL;
                    var14[3] = 0;
                } else {
                    var14[3] = class251.method1740(1073741824, arg9.field579);
                    var12 ^= (long) var14[3];
                }
            }
        }
        class94 var16 = (class94) class9.field213.method2288(var12, (byte) 126);
        if (var16 == null) {
            boolean var17 = false;
            for (int var18 = 0; var18 < 12; var18++) {
                int var19 = var14[var18];
                if ((var19 & 0x40000000) == 0) {
                    if ((var19 & Integer.MIN_VALUE) != 0 && !class195.method1384(var19 & 0x3FFFFFFF, 112).method1759((byte) -32)) {
                        var17 = true;
                    }
                } else if (!class188.method1361(true, var19 & 0x3FFFFFFF).method1039(this.field4164, false)) {
                    var17 = true;
                }
            }
            if (var17) {
                if (this.field4156 != -1L) {
                    var16 = (class94) class9.field213.method2288(this.field4156, (byte) 86);
                }
                if (var16 == null) {
                    return null;
                }
            }
            if (var16 == null) {
                class7[] var20 = new class7[12];
                for (int var21 = 0; var21 < 12; var21++) {
                    int var22 = var14[var21];
                    if ((var22 & 0x40000000) != 0) {
                        class7 var24 = class188.method1361(true, var22 & 0x3FFFFFFF).method1041(this.field4164, false);
                        if (var24 != null) {
                            var20[var21] = var24;
                        }
                    } else if ((var22 & Integer.MIN_VALUE) != 0) {
                        class7 var23 = class195.method1384(var22 & 0x3FFFFFFF, 121).method1764(0);
                        if (var23 != null) {
                            var20[var21] = var23;
                        }
                    }
                }
                class66 var25 = null;
                if (this.field4163 != -1) {
                    var25 = class42.method383(32, this.field4163);
                }
                if (var25 != null && var25.field990 != null) {
                    for (int var26 = 0; var26 < var25.field990.length; var26++) {
                        if (var25.field990[var26] != null && var20[var26] != null) {
                            int var27 = var25.field990[var26][0];
                            int var28 = var25.field990[var26][2];
                            int var29 = var25.field990[var26][1];
                            int var30 = var25.field990[var26][5];
                            int var31 = var25.field990[var26][3];
                            int var32 = var25.field990[var26][4];
                            if (this.field4169 == null) {
                                this.field4169 = new int[var25.field990.length][];
                            }
                            if (this.field4169[var26] == null) {
                                int[] var33 = this.field4169[var26] = new int[15];
                                if (var31 == 0 && var32 == 0 && var30 == 0) {
                                    var33[0] = var33[4] = var33[8] = 32768;
                                    var33[13] = -var29;
                                    var33[12] = -var27;
                                    var33[14] = -var28;
                                } else {
                                    int var34 = class40.field619[var31] >> 1;
                                    int var35 = class40.field612[var31] >> 1;
                                    int var36 = class40.field619[var30] >> 1;
                                    int var37 = class40.field612[var30] >> 1;
                                    int var38 = var35 * var36 + 16384 >> 15;
                                    int var39 = class40.field612[var32] >> 1;
                                    int var40 = var35 * var37 + 16384 >> 15;
                                    int var41 = class40.field619[var32] >> 1;
                                    var33[0] = var36 * var41 - (-(var39 * var40) - 16384) >> 15;
                                    var33[2] = var34 * var39 + 16384 >> 15;
                                    var33[1] = -var37 * var41 + var38 * var39 + 16384 >> 15;
                                    var33[6] = -var39 * var36 - (-(var40 * var41) - 16384) >> 15;
                                    var33[4] = var34 * var36 + 16384 >> 15;
                                    var33[5] = -var35;
                                    var33[7] = -var37 * -var39 + (var38 * var41) + 16384 >> 15;
                                    var33[13] = var33[1] * -var27 + 16384 - (-(var33[4] * -var29) - (var33[7] * -var28)) >> 15;
                                    var33[8] = var34 * var41 + 16384 >> 15;
                                    var33[14] = var33[5] * -var29 + var33[8] * -var28 + var33[2] * -var27 + 16384 >> 15;
                                    var33[3] = var34 * var37 + 16384 >> 15;
                                    var33[12] = var33[0] * -var27 + (var33[3] * -var29) + (var33[6] * -var28) + 16384 >> 15;
                                }
                                var33[11] = var28;
                                var33[10] = var29;
                                var33[9] = var27;
                            }
                            if (var31 != 0 || var32 != 0 || var30 != 0) {
                                var20[var26].method132(var31, var32, var30);
                            }
                            if (var27 != 0 || var29 != 0 || var28 != 0) {
                                var20[var26].method125(var27, var29, var28);
                            }
                        }
                    }
                }
                class7 var42 = new class7(var20, var20.length);
                for (int var43 = 0; var43 < 5; var43++) {
                    if (class167.field2688[var43].length > this.field4170[var43]) {
                        var42.method128(class309.field4888[var43], class167.field2688[var43][this.field4170[var43]]);
                    }
                    if (class176.field2816[var43].length > this.field4170[var43]) {
                        var42.method128(class345.field5362[var43], class176.field2816[var43][this.field4170[var43]]);
                    }
                }
                var16 = var42.method121(64, 850, -30, -50, -30);
                if (class162.field2623) {
                    ((class206) var16).method1510(false, false, true, true, false, false, true);
                }
                if (arg5) {
                    class9.field213.method2281(0, var12, var16);
                    this.field4156 = var12;
                }
            }
        }
        boolean var44 = false;
        boolean var45 = false;
        boolean var46 = false;
        boolean var47 = false;
        int var48 = arg4 == null ? 0 : arg4.length;
        int var49 = 0;
        int var50 = 86 % ((-arg0 - 68) / 46);
        while (var48 > var49) {
            if (arg4[var49] != null) {
                class38 var51 = class63.method503(arg4[var49].field923, (byte) 110);
                if (var51.field584 != null) {
                    var44 = true;
                    class213.field3321[var49] = var51;
                    int var52 = arg4[var49].field919;
                    int var53 = arg4[var49].field917;
                    int var54 = var51.field584[var53];
                    class260.field3859[var49] = class66.method533(-115, var54 >>> 16);
                    int var55 = var54 & 0xFFFF;
                    class253.field3739[var49] = var55;
                    if (class260.field3859[var49] != null) {
                        var46 |= class260.field3859[var49].method514(50, var55);
                        var45 |= class260.field3859[var49].method510(97, var55);
                        var47 |= var51.field560;
                    }
                    if ((var51.field577 || class197.field3039) && var52 != -1 && var52 < var51.field584.length) {
                        class255.field3768[var49] = var51.field568[var53];
                        class3.field94[var49] = arg4[var49].field916;
                        int var56 = var51.field584[var52];
                        class113.field1829[var49] = class66.method533(-62, var56 >>> 16);
                        int var57 = var56 & 0xFFFF;
                        class99.field1581[var49] = var57;
                        if (class113.field1829[var49] != null) {
                            var46 |= class113.field1829[var49].method514(50, var57);
                            var45 |= class113.field1829[var49].method510(100, var57);
                        }
                    } else {
                        class255.field3768[var49] = 0;
                        class3.field94[var49] = 0;
                        class113.field1829[var49] = null;
                        class99.field1581[var49] = -1;
                    }
                }
            }
            var49++;
        }
        if (!var44 && arg9 == null && arg2 == null) {
            return var16;
        }
        int var58 = -1;
        int var59 = 0;
        int var60 = -1;
        class64 var61 = null;
        class64 var62 = null;
        if (arg9 != null) {
            int var63 = arg9.field584[arg1];
            int var64 = var63 >>> 16;
            var58 = var63 & 0xFFFF;
            var61 = class66.method533(115, var64);
            if (var61 != null) {
                var46 |= var61.method514(50, var58);
                var45 |= var61.method510(101, var58);
                var47 |= arg9.field560;
            }
            if ((arg9.field577 || class197.field3039) && arg8 != -1 && arg8 < arg9.field584.length) {
                int var65 = arg9.field584[arg8];
                var59 = arg9.field568[arg1];
                int var66 = var65 >>> 16;
                var60 = var65 & 0xFFFF;
                if (var64 == var66) {
                    var62 = var61;
                } else {
                    var62 = class66.method533(96, var60 >>> 16);
                }
                if (var62 != null) {
                    var46 |= var62.method514(50, var60);
                    var45 |= var62.method510(98, var60);
                }
            }
        }
        int var67 = -1;
        int var68 = 0;
        class64 var69 = null;
        class64 var70 = null;
        int var71 = -1;
        if (arg2 != null) {
            int var72 = arg2.field584[arg3];
            int var73 = var72 >>> 16;
            var67 = var72 & 0xFFFF;
            var69 = class66.method533(118, var73);
            if (var69 != null) {
                var46 |= var69.method514(50, var67);
                var45 |= var69.method510(100, var67);
                var47 |= arg2.field560;
            }
            if ((arg2.field577 || class197.field3039) && arg7 != -1 && arg2.field584.length > arg7) {
                int var74 = arg2.field584[arg7];
                var68 = arg2.field568[arg3];
                int var75 = var74 >>> 16;
                var71 = var74 & 0xFFFF;
                if (var73 == var75) {
                    var70 = var69;
                } else {
                    var70 = class66.method533(100, var71 >>> 16);
                }
                if (var70 != null) {
                    var46 |= var70.method514(50, var71);
                    var45 |= var70.method510(95, var71);
                }
            }
        }
        class94 var76 = var16.method743(!var45, !var46, !var47);
        int var77 = 0;
        int var78 = 1;
        while (var48 > var77) {
            if (class260.field3859[var77] != null) {
                var76.method770(class260.field3859[var77], class253.field3739[var77], class113.field1829[var77], class99.field1581[var77], class3.field94[var77] - 1, class255.field3768[var77], var78, class213.field3321[var77].field560, this.field4169[var77]);
            }
            var78 <<= 0x1;
            var77++;
        }
        if (var61 != null && var69 != null) {
            var76.method750(var61, var58, var62, var60, arg6 - 1, var59, var69, var67, var70, var71, arg10 - 1, var68, arg9.field573, arg2.field560 | arg9.field560);
        } else if (var61 != null) {
            var76.method751(var61, var58, var62, var60, arg6 - 1, var59, arg9.field560);
        } else if (var69 != null) {
            var76.method751(var69, var67, var70, var71, arg10 - 1, var68, arg2.field560);
        }
        for (int var79 = 0; var79 < var48; var79++) {
            class260.field3859[var79] = null;
            class113.field1829[var79] = null;
            class213.field3321[var79] = null;
        }
        return var76;
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(III)V", line = 552)
    public final void method1918(int arg0, int arg1, int arg2) {
        int var4 = class284.field4432[arg2];
        field4173++;
        if (this.field4155[var4] != 0 && class195.method1384(arg0, 126) != null) {
            this.field4155[var4] = class251.method1740(Integer.MIN_VALUE, arg0);
            if (arg1 == 0) {
                this.method1920((byte) -119);
            }
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IIIILhn;III)Lie;", line = 574)
    public final class94 method1919(int arg0, int arg1, int arg2, int arg3, class38 arg4, int arg5, int arg6, int arg7) {
        if (arg1 != -12930) {
            return (class94) null;
        }
        field4162++;
        long var9 = (long) arg7 << 32 | (long) (arg5 << 16) | (long) arg2;
        class94 var11 = (class94) class19.field359.method2288(var9, (byte) 84);
        if (var11 == null) {
            int var12 = 0;
            class7[] var13 = new class7[3];
            if (!class195.method1384(arg2, 113).method1765(arg1 + 13021) || !class195.method1384(arg5, 124).method1765(113) || !class195.method1384(arg7, arg1 + 13044).method1765(-86)) {
                return null;
            }
            class7 var14 = class195.method1384(arg2, 100).method1766(-26417);
            if (var14 != null) {
                var13[var12++] = var14;
            }
            class7 var15 = class195.method1384(arg5, 99).method1766(-26417);
            if (var15 != null) {
                var13[var12++] = var15;
            }
            class7 var16 = class195.method1384(arg7, arg1 ^ 0xFFFFCD13).method1766(-26417);
            if (var16 != null) {
                var13[var12++] = var16;
            }
            class7 var17 = new class7(var13, var12);
            for (int var18 = 0; var18 < 5; var18++) {
                if (this.field4170[var18] < class167.field2688[var18].length) {
                    var17.method128(class309.field4888[var18], class167.field2688[var18][this.field4170[var18]]);
                }
                if (class176.field2816[var18].length > this.field4170[var18]) {
                    var17.method128(class345.field5362[var18], class176.field2816[var18][this.field4170[var18]]);
                }
            }
            var11 = var17.method121(64, 768, -50, -10, -50);
            class19.field359.method2281(0, var9, var11);
        }
        if (arg4 != null) {
            var11 = arg4.method336(-2089655000, arg6, var11, arg3, arg0);
        }
        return var11;
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(B)V", line = 642)
    private final void method1920(byte arg0) {
        long var2 = this.field4158;
        field4161++;
        this.field4158 = -1L;
        long[] var4 = class68.field1022;
        this.field4158 = this.field4158 >>> 8 ^ var4[(int) ((this.field4158 ^ (long) (this.field4163 >> 8)) & 0xFFL)];
        this.field4158 = this.field4158 >>> 8 ^ var4[(int) ((this.field4158 ^ (long) this.field4163) & 0xFFL)];
        for (int var5 = 0; var5 < 12; var5++) {
            this.field4158 = this.field4158 >>> 8 ^ var4[(int) (((long) (this.field4155[var5] >> 24) ^ this.field4158) & 0xFFL)];
            this.field4158 = var4[(int) (((long) (this.field4155[var5] >> 16) ^ this.field4158) & 0xFFL)] ^ this.field4158 >>> 8;
            this.field4158 = this.field4158 >>> 8 ^ var4[(int) (((long) (this.field4155[var5] >> 8) ^ this.field4158) & 0xFFL)];
            this.field4158 = var4[(int) ((this.field4158 ^ (long) this.field4155[var5]) & 0xFFL)] ^ this.field4158 >>> 8;
        }
        if (arg0 >= -115) {
            return;
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field4158 = this.field4158 >>> 8 ^ var4[(int) (((long) this.field4170[var6] ^ this.field4158) & 0xFFL)];
        }
        this.field4158 = var4[(int) ((this.field4158 ^ (long) (this.field4164 ? 1 : 0)) & 0xFFL)] ^ this.field4158 >>> 8;
        if (var2 != 0L && this.field4158 != var2) {
            class9.field213.method2286(var2, (byte) -102);
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(I[IIZZ[I)V", line = 686)
    public final void method1921(int arg0, int[] arg1, int arg2, boolean arg3, boolean arg4, int[] arg5) {
        field4166++;
        if (this.field4163 != arg2) {
            this.field4169 = (int[][]) null;
            this.field4163 = arg2;
        }
        if (arg5 == null) {
            arg5 = new int[12];
            for (int var7 = 0; var7 < 8; var7++) {
                for (int var8 = 0; var8 < class338.field5224; var8++) {
                    class255 var9 = class195.method1384(var8, 100);
                    if (var9 != null && !var9.field3763 && var9.field3771 == (arg4 ? class108.field1763[var7] : class264.field3904[var7])) {
                        arg5[class284.field4432[var7]] = class251.method1740(var8, Integer.MIN_VALUE);
                        break;
                    }
                }
            }
        }
        if (!arg3) {
            this.field4156 = 73L;
        }
        this.field4164 = arg4;
        this.field4160 = arg0;
        this.field4170 = arg1;
        this.field4155 = arg5;
        this.method1920((byte) -117);
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Lhn;IBII)Lie;", line = 738)
    public final class94 method1922(class38 arg0, int arg1, byte arg2, int arg3, int arg4) {
        field4157++;
        if (this.field4160 != -1) {
            return class310.method2191(this.field4160, 84).method666(arg4, arg3, arg1, arg0, -1);
        } else if (arg2 == 94) {
            class94 var6 = (class94) class19.field359.method2288(this.field4158, (byte) 114);
            if (var6 == null) {
                boolean var7 = false;
                for (int var8 = 0; var8 < 12; var8++) {
                    int var9 = this.field4155[var8];
                    if ((var9 & 0x40000000) == 0) {
                        if ((var9 & Integer.MIN_VALUE) != 0 && !class195.method1384(var9 & 0x3FFFFFFF, 114).method1765(51)) {
                            var7 = true;
                        }
                    } else if (!class188.method1361(true, var9 & 0x3FFFFFFF).method1049(this.field4164, (byte) -61)) {
                        var7 = true;
                    }
                }
                if (var7) {
                    return null;
                }
                class7[] var10 = new class7[12];
                int var11 = 0;
                for (int var12 = 0; var12 < 12; var12++) {
                    int var13 = this.field4155[var12];
                    if ((var13 & 0x40000000) != 0) {
                        class7 var14 = class188.method1361(true, var13 & 0x3FFFFFFF).method1033(arg2 - 52, this.field4164);
                        if (var14 != null) {
                            var10[var11++] = var14;
                        }
                    } else if ((var13 & Integer.MIN_VALUE) != 0) {
                        class7 var15 = class195.method1384(var13 & 0x3FFFFFFF, arg2 ^ 0x25).method1766(-26417);
                        if (var15 != null) {
                            var10[var11++] = var15;
                        }
                    }
                }
                class7 var16 = new class7(var10, var11);
                for (int var17 = 0; var17 < 5; var17++) {
                    if (class167.field2688[var17].length > this.field4170[var17]) {
                        var16.method128(class309.field4888[var17], class167.field2688[var17][this.field4170[var17]]);
                    }
                    if (class176.field2816[var17].length > this.field4170[var17]) {
                        var16.method128(class345.field5362[var17], class176.field2816[var17][this.field4170[var17]]);
                    }
                }
                var6 = var16.method121(64, 768, -50, -10, -50);
                class19.field359.method2281(0, this.field4158, var6);
            }
            if (arg0 != null) {
                var6 = arg0.method336(-2089655000, arg1, var6, arg4, arg3);
            }
            return var6;
        } else {
            return (class94) null;
        }
    }
}
