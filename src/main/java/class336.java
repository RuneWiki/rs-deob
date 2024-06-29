import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class336 {

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "[I")
    public static int[] field5181 = new int[14];

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "I")
    public static int field5179 = 0;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "I")
    public static int field5176;

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "I")
    public static int field5180;

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "I")
    public static int field5182;

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "I")
    public static int field5183;

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "I")
    public static int field5184;

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "I")
    public static int field5185;

    @OriginalMember(owner = "client!ra", name = "l", descriptor = "I")
    private int field5187;

    @OriginalMember(owner = "client!ra", name = "n", descriptor = "I")
    public static int field5189;

    @OriginalMember(owner = "client!ra", name = "p", descriptor = "I")
    public static int field5191;

    @OriginalMember(owner = "client!ra", name = "q", descriptor = "I")
    public static int field5192;

    @OriginalMember(owner = "client!ra", name = "r", descriptor = "I")
    public static int field5193;

    @OriginalMember(owner = "client!ra", name = "u", descriptor = "I")
    public static int field5196;

    @OriginalMember(owner = "client!ra", name = "v", descriptor = "I")
    public static int field5197;

    @OriginalMember(owner = "client!ra", name = "w", descriptor = "I")
    public int field5198;

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "J")
    private long field5177;

    @OriginalMember(owner = "client!ra", name = "s", descriptor = "J")
    private long field5194;

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "Lre;")
    public static class292 field5178;

    @OriginalMember(owner = "client!ra", name = "o", descriptor = "Z")
    public boolean field5190;

    @OriginalMember(owner = "client!ra", name = "m", descriptor = "[I")
    public int[] field5188;

    @OriginalMember(owner = "client!ra", name = "t", descriptor = "[I")
    private int[] field5195;

    @OriginalMember(owner = "client!ra", name = "k", descriptor = "[[I")
    private int[][] field5186;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(III)V", line = 8)
    public final void method2308(int arg0, int arg1, int arg2) {
        int var4 = class220.field3096[arg0];
        field5189++;
        if (this.field5195[var4] == 0) {
            return;
        }
        if (arg2 < 89) {
            method2312(-107, (byte[]) null, false);
        }
        if (class303.method2126(70, arg1) != null) {
            this.field5195[var4] = class48.method283(arg1, Integer.MIN_VALUE);
            this.method2319(255);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(BI[IZ[II)V", line = 39)
    public final void method2309(byte arg0, int arg1, int[] arg2, boolean arg3, int[] arg4, int arg5) {
        field5176++;
        if (this.field5187 != arg1) {
            this.field5187 = arg1;
            this.field5186 = (int[][]) null;
        }
        if (arg4 == null) {
            arg4 = new int[12];
            for (int var7 = 0; var7 < 8; var7++) {
                for (int var8 = 0; var8 < class97.field1259; var8++) {
                    class129 var9 = class303.method2126(114, var8);
                    if (var9 != null && !var9.field1776 && (arg3 ? class94.field1233[var7] : class305.field4730[var7]) == var9.field1777) {
                        arg4[class220.field3096[var7]] = class48.method283(Integer.MIN_VALUE, var8);
                        break;
                    }
                }
            }
        }
        this.field5195 = arg4;
        this.field5188 = arg2;
        this.field5190 = arg3;
        int var10 = -50 / ((-arg0 - 61) / 46);
        this.field5198 = arg5;
        this.method2319(255);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(BZ)V", line = 89)
    public final void method2310(byte arg0, boolean arg1) {
        field5180++;
        this.field5190 = arg1;
        if (arg0 == 57) {
            this.method2319(arg0 ^ 0xC6);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIB)V", line = 101)
    public final void method2311(int arg0, int arg1, byte arg2) {
        this.field5188[arg1] = arg0;
        field5183++;
        if (arg2 > -105) {
            field5181 = (int[]) null;
        }
        this.method2319(255);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I[BZ)Ljava/lang/Object;", line = 113)
    public static final Object method2312(int arg0, byte[] arg1, boolean arg2) {
        field5191++;
        if (arg0 < 54) {
            return (Object) null;
        } else if (arg1 == null) {
            return null;
        } else {
            if (arg1.length > 136 && !class127.field1742) {
                try {
                    class160 var3 = (class160) Class.forName("ca").getDeclaredConstructor().newInstance();
                    var3.method611(27493, arg1);
                    return var3;
                } catch (Throwable var5) {
                    class127.field1742 = true;
                }
            }
            return arg2 ? class1.method1(121, arg1) : arg1;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V", line = 151)
    public static void method2313(int arg0) {
        field5178 = null;
        field5181 = null;
        if (arg0 != -18315) {
            method2312(97, (byte[]) null, false);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIIIIILqm;)Luc;", line = 163)
    public final class201 method2314(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class247 arg7) {
        field5185++;
        long var9 = (long) arg4 | (long) (arg3 << 16) | (long) arg1 << 32;
        class201 var11 = (class201) class264.field4165.method1239((byte) -104, var9);
        if (arg0 != 768) {
            this.method2316((class247) null, (class204[]) null, -45, 123, -46, -87, -104, (class247) null, false, -1, -50);
        }
        if (var11 == null) {
            int var12 = 0;
            class207[] var13 = new class207[3];
            if (!class303.method2126(9, arg4).method868((byte) -56) || !class303.method2126(75, arg3).method868((byte) -34) || !class303.method2126(88, arg1).method868((byte) 113)) {
                return null;
            }
            class207 var14 = class303.method2126(91, arg4).method863((byte) 106);
            if (var14 != null) {
                var13[var12++] = var14;
            }
            class207 var15 = class303.method2126(12, arg3).method863((byte) 73);
            if (var15 != null) {
                var13[var12++] = var15;
            }
            class207 var16 = class303.method2126(48, arg1).method863((byte) 65);
            if (var16 != null) {
                var13[var12++] = var16;
            }
            class207 var17 = new class207(var13, var12);
            for (int var18 = 0; var18 < 5; var18++) {
                if (this.field5188[var18] < class299.field4668[var18].length) {
                    var17.method1409(class320.field4915[var18], class299.field4668[var18][this.field5188[var18]]);
                }
                if (class153.field2109[var18].length > this.field5188[var18]) {
                    var17.method1409(class44.field530[var18], class153.field2109[var18][this.field5188[var18]]);
                }
            }
            var11 = var17.method1407(64, 768, -50, -10, -50);
            class264.field4165.method1243(var11, var9, arg0 - 30050);
        }
        if (arg7 != null) {
            var11 = arg7.method1776(var11, arg6, arg5, arg2, false);
        }
        return var11;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lqm;IIII)Luc;", line = 230)
    public final class201 method2315(class247 arg0, int arg1, int arg2, int arg3, int arg4) {
        field5182++;
        if (~this.field5198 != arg3) {
            return class120.method815(-113, this.field5198).method2018(-68, arg1, arg2, arg0, arg4);
        }
        class201 var6 = (class201) class264.field4165.method1239((byte) -33, this.field5194);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < 12; var8++) {
                int var9 = this.field5195[var8];
                if ((var9 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var9) != 0 && !class303.method2126(28, var9 & 0x3FFFFFFF).method868((byte) 100)) {
                        var7 = true;
                    }
                } else if (!class60.method353(var9 & 0x3FFFFFFF, (byte) -50).method557(true, this.field5190)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            int var10 = 0;
            class207[] var11 = new class207[12];
            for (int var12 = 0; var12 < 12; var12++) {
                int var13 = this.field5195[var12];
                if ((var13 & 0x40000000) != 0) {
                    class207 var15 = class60.method353(var13 & 0x3FFFFFFF, (byte) -40).method552(arg3 ^ 0xFFFF8D72, this.field5190);
                    if (var15 != null) {
                        var11[var10++] = var15;
                    }
                } else if ((Integer.MIN_VALUE & var13) != 0) {
                    class207 var14 = class303.method2126(106, var13 & 0x3FFFFFFF).method863((byte) 61);
                    if (var14 != null) {
                        var11[var10++] = var14;
                    }
                }
            }
            class207 var16 = new class207(var11, var10);
            for (int var17 = 0; var17 < 5; var17++) {
                if (class299.field4668[var17].length > this.field5188[var17]) {
                    var16.method1409(class320.field4915[var17], class299.field4668[var17][this.field5188[var17]]);
                }
                if (this.field5188[var17] < class153.field2109[var17].length) {
                    var16.method1409(class44.field530[var17], class153.field2109[var17][this.field5188[var17]]);
                }
            }
            var6 = var16.method1407(64, 768, -50, -10, -50);
            class264.field4165.method1243(var6, this.field5194, -29282);
        }
        if (arg0 != null) {
            var6 = arg0.method1776(var6, arg4, arg1, arg2, false);
        }
        return var6;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lqm;[Lcm;IIIIILqm;ZII)Luc;", line = 343)
    public final class201 method2316(class247 arg0, class204[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class247 arg7, boolean arg8, int arg9, int arg10) {
        field5196++;
        if (this.field5198 != -1) {
            return class120.method815(arg2 ^ 0x7E88, this.field5198).method2015(arg9, arg0, arg10, arg2 ^ 0x7E2F, arg1, arg4, arg6, arg7, arg5, arg3);
        }
        long var12 = this.field5194;
        int[] var14 = this.field5195;
        if (arg7 != null && (arg7.field3732 >= 0 || arg7.field3731 >= 0)) {
            var14 = new int[12];
            for (int var15 = 0; var15 < 12; var15++) {
                var14[var15] = this.field5195[var15];
            }
            if (arg7.field3732 >= 0) {
                if (arg7.field3732 == 65535) {
                    var12 ^= 0xFFFFFFFF00000000L;
                    var14[5] = 0;
                } else {
                    var14[5] = class48.method283(1073741824, arg7.field3732);
                    var12 ^= (long) var14[5] << 32;
                }
            }
            if (arg7.field3731 >= 0) {
                if (arg7.field3731 == 65535) {
                    var12 ^= 0xFFFFFFFFL;
                    var14[3] = 0;
                } else {
                    var14[3] = class48.method283(1073741824, arg7.field3731);
                    var12 ^= (long) var14[3];
                }
            }
        }
        class201 var16 = (class201) class285.field4489.method1239((byte) -23, var12);
        if (var16 == null) {
            boolean var17 = false;
            for (int var18 = 0; var18 < 12; var18++) {
                int var19 = var14[var18];
                if ((var19 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var19) != 0 && !class303.method2126(arg2 ^ 0x7E90, var19 & 0x3FFFFFFF).method862(68)) {
                        var17 = true;
                    }
                } else if (!class60.method353(var19 & 0x3FFFFFFF, (byte) -69).method564(this.field5190, 114)) {
                    var17 = true;
                }
            }
            if (var17) {
                if (this.field5177 != -1L) {
                    var16 = (class201) class285.field4489.method1239((byte) -101, this.field5177);
                }
                if (var16 == null) {
                    return null;
                }
            }
            if (var16 == null) {
                class207[] var20 = new class207[12];
                for (int var21 = 0; var21 < 12; var21++) {
                    int var22 = var14[var21];
                    if ((var22 & 0x40000000) != 0) {
                        class207 var23 = class60.method353(var22 & 0x3FFFFFFF, (byte) -119).method562((byte) 38, this.field5190);
                        if (var23 != null) {
                            var20[var21] = var23;
                        }
                    } else if ((var22 & Integer.MIN_VALUE) != 0) {
                        class207 var24 = class303.method2126(52, var22 & 0x3FFFFFFF).method864((byte) -63);
                        if (var24 != null) {
                            var20[var21] = var24;
                        }
                    }
                }
                class191 var25 = null;
                if (this.field5187 != -1) {
                    var25 = class72.method439(this.field5187, (byte) 121);
                }
                if (var25 != null && var25.field2747 != null) {
                    for (int var26 = 0; var26 < var25.field2747.length; var26++) {
                        if (var25.field2747[var26] != null && var20[var26] != null) {
                            int var27 = var25.field2747[var26][0];
                            int var28 = var25.field2747[var26][2];
                            int var29 = var25.field2747[var26][1];
                            int var30 = var25.field2747[var26][4];
                            int var31 = var25.field2747[var26][3];
                            int var32 = var25.field2747[var26][5];
                            if (this.field5186 == null) {
                                this.field5186 = new int[var25.field2747.length][];
                            }
                            if (this.field5186[var26] == null) {
                                int[] var33 = this.field5186[var26] = new int[15];
                                if (var31 == 0 && var30 == 0 && var32 == 0) {
                                    var33[12] = -var27;
                                    var33[14] = -var28;
                                    var33[13] = -var29;
                                    var33[0] = var33[4] = var33[8] = 32768;
                                } else {
                                    int var34 = class215.field3017[var31] >> 1;
                                    int var35 = class215.field3024[var31] >> 1;
                                    int var36 = class215.field3017[var30] >> 1;
                                    int var37 = class215.field3017[var32] >> 1;
                                    int var38 = class215.field3024[var30] >> 1;
                                    int var39 = class215.field3024[var32] >> 1;
                                    int var40 = var35 * var37 + 16384 >> 15;
                                    var33[8] = var34 * var36 + 16384 >> 15;
                                    int var41 = var35 * var39 + 16384 >> 15;
                                    var33[2] = var34 * var38 + 16384 >> 15;
                                    var33[7] = -var38 * -var39 + var36 * var40 + 16384 >> 15;
                                    var33[3] = var34 * var39 + 16384 >> 15;
                                    var33[5] = -var35;
                                    var33[0] = var38 * var41 + (var36 * var37 + 16384) >> 15;
                                    var33[4] = var34 * var37 + 16384 >> 15;
                                    var33[6] = -var38 * var37 + var36 * var41 + 16384 >> 15;
                                    var33[1] = var38 * var40 + -var39 * var36 + 16384 >> 15;
                                    var33[14] = var33[8] * -var28 + var33[5] * -var29 + var33[2] * -var27 + 16384 >> 15;
                                    var33[12] = var33[6] * -var28 + var33[3] * -var29 + var33[0] * -var27 + 16384 >> 15;
                                    var33[13] = var33[1] * -var27 + (var33[4] * -var29) - (-(var33[7] * -var28) + -16384) >> 15;
                                }
                                var33[10] = var29;
                                var33[11] = var28;
                                var33[9] = var27;
                            }
                            if (var31 != 0 || var30 != 0 || var32 != 0) {
                                var20[var26].method1413(var31, var30, var32);
                            }
                            if (var27 != 0 || var29 != 0 || var28 != 0) {
                                var20[var26].method1412(var27, var29, var28);
                            }
                        }
                    }
                }
                class207 var42 = new class207(var20, var20.length);
                for (int var43 = 0; var43 < 5; var43++) {
                    if (class299.field4668[var43].length > this.field5188[var43]) {
                        var42.method1409(class320.field4915[var43], class299.field4668[var43][this.field5188[var43]]);
                    }
                    if (this.field5188[var43] < class153.field2109[var43].length) {
                        var42.method1409(class44.field530[var43], class153.field2109[var43][this.field5188[var43]]);
                    }
                }
                var16 = var42.method1407(64, 850, -30, -50, -30);
                if (class250.field3787) {
                    ((class108) var16).method732(false, false, true, true, false, false, true);
                }
                if (arg8) {
                    class285.field4489.method1243(var16, var12, -29282);
                    this.field5177 = var12;
                }
            }
        }
        boolean var44 = false;
        boolean var45 = false;
        boolean var46 = false;
        int var47 = arg1 == null ? 0 : arg1.length;
        boolean var48 = false;
        for (int var49 = 0; var49 < var47; var49++) {
            if (arg1[var49] != null) {
                class247 var50 = class185.method1289(arg1[var49].field2870, (byte) 119);
                if (var50.field3734 != null) {
                    var44 = true;
                    class345.field5351[var49] = var50;
                    int var51 = arg1[var49].field2866;
                    int var52 = var50.field3734[var51];
                    int var53 = arg1[var49].field2865;
                    class216.field3033[var49] = class216.method1494(-116, var52 >>> 16);
                    int var54 = var52 & 0xFFFF;
                    class291.field4575[var49] = var54;
                    if (class216.field3033[var49] != null) {
                        var46 |= class216.field3033[var49].method785(-8572, var54);
                        var45 |= class216.field3033[var49].method787(var54, false);
                        var48 |= var50.field3758;
                    }
                    if ((var50.field3755 || class37.field445) && var53 != -1 && var50.field3734.length > var53) {
                        class47.field548[var49] = var50.field3746[var51];
                        class339.field5268[var49] = arg1[var49].field2863;
                        int var55 = var50.field3734[var53];
                        class152.field2092[var49] = class216.method1494(arg2 - 32399, var55 >>> 16);
                        int var56 = var55 & 0xFFFF;
                        class235.field3421[var49] = var56;
                        if (class152.field2092[var49] != null) {
                            var46 |= class152.field2092[var49].method785(-8572, var56);
                            var45 |= class152.field2092[var49].method787(var56, false);
                        }
                    } else {
                        class47.field548[var49] = 0;
                        class339.field5268[var49] = 0;
                        class152.field2092[var49] = null;
                        class235.field3421[var49] = -1;
                    }
                }
            }
        }
        if (!var44 && arg7 == null && arg0 == null) {
            return var16;
        }
        int var57 = 0;
        class115 var58 = null;
        int var59 = -1;
        class115 var60 = null;
        int var61 = -1;
        if (arg7 != null) {
            int var62 = arg7.field3734[arg4];
            int var63 = var62 >>> 16;
            var58 = class216.method1494(48, var63);
            var61 = var62 & 0xFFFF;
            if (var58 != null) {
                var46 |= var58.method785(-8572, var61);
                var45 |= var58.method787(var61, false);
                var48 |= arg7.field3758;
            }
            if ((arg7.field3755 || class37.field445) && arg9 != -1 && arg7.field3734.length > arg9) {
                int var64 = arg7.field3734[arg9];
                var57 = arg7.field3746[arg4];
                int var65 = var64 >>> 16;
                var59 = var64 & 0xFFFF;
                if (var63 == var65) {
                    var60 = var58;
                } else {
                    var60 = class216.method1494(-116, var59 >>> 16);
                }
                if (var60 != null) {
                    var46 |= var60.method785(-8572, var59);
                    var45 |= var60.method787(var59, false);
                }
            }
        }
        int var66 = -1;
        int var67 = -1;
        class115 var68 = null;
        int var69 = 0;
        if (arg2 != 32431) {
            this.method2309((byte) 47, 67, (int[]) null, true, (int[]) null, -120);
        }
        class115 var70 = null;
        if (arg0 != null) {
            int var71 = arg0.field3734[arg6];
            int var72 = var71 >>> 16;
            var68 = class216.method1494(13, var72);
            var66 = var71 & 0xFFFF;
            if (var68 != null) {
                var46 |= var68.method785(arg2 - 41003, var66);
                var45 |= var68.method787(var66, false);
                var48 |= arg0.field3758;
            }
            if ((arg0.field3755 || class37.field445) && arg5 != -1 && arg0.field3734.length > arg5) {
                int var73 = arg0.field3734[arg5];
                var69 = arg0.field3746[arg6];
                int var74 = var73 >>> 16;
                var67 = var73 & 0xFFFF;
                if (var72 == var74) {
                    var70 = var68;
                } else {
                    var70 = class216.method1494(60, var67 >>> 16);
                }
                if (var70 != null) {
                    var46 |= var70.method785(-8572, var67);
                    var45 |= var70.method787(var67, false);
                }
            }
        }
        class201 var75 = var16.method716(!var45, !var46, !var48);
        int var76 = 0;
        int var77 = 1;
        while (var47 > var76) {
            if (class216.field3033[var76] != null) {
                var75.method1378(class216.field3033[var76], class291.field4575[var76], class152.field2092[var76], class235.field3421[var76], class339.field5268[var76] - 1, class47.field548[var76], var77, class345.field5351[var76].field3758, this.field5186[var76]);
            }
            var77 <<= 0x1;
            var76++;
        }
        if (var58 != null && var68 != null) {
            var75.method1379(var58, var61, var60, var59, arg3 - 1, var57, var68, var66, var70, var67, arg10 - 1, var69, arg7.field3756, arg7.field3758 | arg0.field3758);
        } else if (var58 != null) {
            var75.method1381(var58, var61, var60, var59, arg3 - 1, var57, arg7.field3758);
        } else if (var68 != null) {
            var75.method1381(var68, var66, var70, var67, arg10 - 1, var69, arg0.field3758);
        }
        for (int var78 = 0; var78 < var47; var78++) {
            class216.field3033[var78] = null;
            class152.field2092[var78] = null;
            class345.field5351[var78] = null;
        }
        return var75;
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)I", line = 820)
    public final int method2317(int arg0) {
        if (arg0 < 6) {
            return -126;
        } else {
            field5192++;
            return this.field5198 == -1 ? (this.field5195[11] << 5) + this.field5195[1] + (this.field5195[8] << 10) + ((this.field5188[0] << 25) - -(this.field5188[4] << 20) - -(this.field5195[0] << 15)) : class120.method815(-124, this.field5198).field4432 + 305419896;
        }
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(III)I", line = 840)
    public static final int method2318(int arg0, int arg1, int arg2) {
        if (arg1 < arg2) {
            int var3 = arg1;
            arg1 = arg2;
            arg2 = var3;
        }
        field5184++;
        int var4 = 78 / ((arg0 - 57) / 34);
        while (arg2 != 0) {
            int var5 = arg1 % arg2;
            arg1 = arg2;
            arg2 = var5;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "(I)V", line = 869)
    private final void method2319(int arg0) {
        long var2 = this.field5194;
        field5193++;
        this.field5194 = -1L;
        long[] var4 = class17.field230;
        this.field5194 = var4[(int) ((long) arg0 & ((long) (this.field5187 >> 8) ^ this.field5194))] ^ this.field5194 >>> 8;
        this.field5194 = this.field5194 >>> 8 ^ var4[(int) ((this.field5194 ^ (long) this.field5187) & 0xFFL)];
        for (int var5 = 0; var5 < 12; var5++) {
            this.field5194 = this.field5194 >>> 8 ^ var4[(int) (((long) (this.field5195[var5] >> 24) ^ this.field5194) & 0xFFL)];
            this.field5194 = var4[(int) ((this.field5194 ^ (long) (this.field5195[var5] >> 16)) & 0xFFL)] ^ this.field5194 >>> 8;
            this.field5194 = this.field5194 >>> 8 ^ var4[(int) ((this.field5194 ^ (long) (this.field5195[var5] >> 8)) & 0xFFL)];
            this.field5194 = var4[(int) ((this.field5194 ^ (long) this.field5195[var5]) & 0xFFL)] ^ this.field5194 >>> 8;
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field5194 = var4[(int) ((this.field5194 ^ (long) this.field5188[var6]) & 0xFFL)] ^ this.field5194 >>> 8;
        }
        this.field5194 = this.field5194 >>> 8 ^ var4[(int) (((long) (this.field5190 ? 1 : 0) ^ this.field5194) & 0xFFL)];
        if (var2 != 0L && this.field5194 != var2) {
            class285.field4489.method1242(arg0 - 256, var2);
        }
    }
}
