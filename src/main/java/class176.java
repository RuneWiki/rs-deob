import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class176 {

    @OriginalMember(owner = "client!hg", name = "t", descriptor = "Lhe;")
    public static class19 field3063 = new class19(16);

    @OriginalMember(owner = "client!hg", name = "y", descriptor = "[Lp;")
    public static class280[] field3068 = new class280[8];

    @OriginalMember(owner = "client!hg", name = "B", descriptor = "I")
    public static int field3071 = 0;

    @OriginalMember(owner = "client!hg", name = "x", descriptor = "[I")
    public static int[] field3067 = new int[100];

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "I")
    public static int field3044;

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "I")
    public static int field3045;

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "I")
    public static int field3048;

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "I")
    public static int field3049;

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "I")
    public static int field3050;

    @OriginalMember(owner = "client!hg", name = "h", descriptor = "I")
    public static int field3051;

    @OriginalMember(owner = "client!hg", name = "i", descriptor = "I")
    public static int field3052;

    @OriginalMember(owner = "client!hg", name = "j", descriptor = "I")
    public static int field3053;

    @OriginalMember(owner = "client!hg", name = "k", descriptor = "I")
    public static int field3054;

    @OriginalMember(owner = "client!hg", name = "m", descriptor = "I")
    public static int field3056;

    @OriginalMember(owner = "client!hg", name = "n", descriptor = "I")
    public static int field3057;

    @OriginalMember(owner = "client!hg", name = "o", descriptor = "I")
    public int field3058;

    @OriginalMember(owner = "client!hg", name = "p", descriptor = "I")
    public static int field3059;

    @OriginalMember(owner = "client!hg", name = "r", descriptor = "I")
    public static int field3061;

    @OriginalMember(owner = "client!hg", name = "w", descriptor = "I")
    public static int field3066;

    @OriginalMember(owner = "client!hg", name = "z", descriptor = "I")
    public static int field3069;

    @OriginalMember(owner = "client!hg", name = "q", descriptor = "J")
    private long field3060;

    @OriginalMember(owner = "client!hg", name = "s", descriptor = "J")
    private long field3062;

    @OriginalMember(owner = "client!hg", name = "A", descriptor = "Lda;")
    public static class184 field3070;

    @OriginalMember(owner = "client!hg", name = "v", descriptor = "Lpc;")
    public static class21 field3065;

    @OriginalMember(owner = "client!hg", name = "u", descriptor = "Z")
    public boolean field3064;

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "[I")
    private int[] field3046;

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "[I")
    private int[] field3047;

    @OriginalMember(owner = "client!hg", name = "l", descriptor = "[Lde;")
    public static class108[] field3055;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(III)Lsc;")
    public static final class245 method1204(int arg0, int arg1, int arg2) {
        class162 var3 = class220.field3787[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class245 var4 = var3.field2839;
            var3.field2839 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Z)V")
    private final void method1205(boolean arg0) {
        long var2 = this.field3062;
        this.field3062 = -1L;
        field3044++;
        long[] var4 = class109.field1823;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field3062 = this.field3062 >>> 8 ^ var4[(int) ((this.field3062 ^ (long) (this.field3047[var5] >> 24)) & 0xFFL)];
            this.field3062 = var4[(int) (((long) (this.field3047[var5] >> 16) ^ this.field3062) & 0xFFL)] ^ this.field3062 >>> 8;
            this.field3062 = var4[(int) ((this.field3062 ^ (long) (this.field3047[var5] >> 8)) & 0xFFL)] ^ this.field3062 >>> 8;
            this.field3062 = this.field3062 >>> 8 ^ var4[(int) ((this.field3062 ^ (long) this.field3047[var5]) & 0xFFL)];
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field3062 = this.field3062 >>> 8 ^ var4[(int) (((long) this.field3046[var6] ^ this.field3062) & 0xFFL)];
        }
        if (!arg0) {
            this.method1208((class78) null, 92, -64, -93, (byte) -122);
        }
        this.field3062 = var4[(int) (((long) (this.field3064 ? 1 : 0) ^ this.field3062) & 0xFFL)] ^ this.field3062 >>> 8;
        if (var2 != 0L && this.field3062 != var2) {
            class193.field3413.method1482(var2, 1625459090);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Ltg;Z)V")
    public static final void method1206(class180 arg0, boolean arg1) {
        field3066++;
        class185.field3259 = arg0.method1234((byte) -88, class225.field3889);
        if (arg1) {
            field3065 = null;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(BII)V")
    public final void method1207(byte arg0, int arg1, int arg2) {
        int var4 = class78.field1295[arg1];
        field3051++;
        if (arg0 != 115) {
            this.method1210(true, -91);
        }
        if (this.field3047[var4] != 0 && class197.method1348((byte) 91, arg2) != null) {
            this.field3047[var4] = class160.method1143(Integer.MIN_VALUE, arg2);
            this.method1205(true);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lph;IIIB)Lik;")
    public final class256 method1208(class78 arg0, int arg1, int arg2, int arg3, byte arg4) {
        field3061++;
        long var6 = (long) arg1 | (long) arg1 << 32 | (long) (arg2 << 16);
        if (arg4 != 110) {
            field3067 = null;
        }
        class256 var8 = (class256) class97.field1552.method1480((byte) 50, var6);
        if (var8 == null) {
            class114[] var9 = new class114[2];
            int var10 = 0;
            if (!class197.method1348((byte) 91, arg1).method937((byte) -35) || !class197.method1348((byte) 91, arg2).method937((byte) -35)) {
                return null;
            }
            class114 var11 = class197.method1348((byte) 91, arg1).method932((byte) -22);
            if (var11 != null) {
                var9[var10++] = var11;
            }
            class114 var12 = class197.method1348((byte) 91, arg2).method932((byte) -22);
            if (var12 != null) {
                var9[var10++] = var12;
            }
            class114 var13 = new class114(var9, var10);
            for (int var14 = 0; var14 < 5; var14++) {
                if (this.field3046[var14] < class134.field2369[var14].length) {
                    var13.method835(class241.field4220[var14], class134.field2369[var14][this.field3046[var14]]);
                }
                if (class133.field2359[var14].length > this.field3046[var14]) {
                    var13.method835(class257.field4544[var14], class133.field2359[var14][this.field3046[var14]]);
                }
            }
            var8 = var13.method806(64, 768, -50, -10, -50);
            class97.field1552.method1483((byte) -110, var6, var8);
        }
        if (arg0 != null) {
            var8 = arg0.method572((byte) -116, arg3, var8);
        }
        return var8;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Ltg;ZLtg;)V")
    public static final void method1209(class180 arg0, boolean arg1, class180 arg2) {
        class164.field2876 = arg0;
        field3045++;
        class112.field1850 = arg2;
        if (!arg1) {
            method1216(37, -81, -120, 13, -115, 72, 63, -9, -116, 110, (byte) -78);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ZI)V")
    public final void method1210(boolean arg0, int arg1) {
        field3059++;
        if (arg1 != 1) {
            field3065 = null;
        }
        this.field3064 = arg0;
        this.method1205(true);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)V")
    public static void method1211(int arg0) {
        field3063 = null;
        if (arg0 != 0) {
            return;
        }
        field3067 = null;
        field3055 = null;
        field3068 = null;
        field3065 = null;
        field3070 = null;
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(III)V")
    public final void method1212(int arg0, int arg1, int arg2) {
        this.field3046[arg2] = arg0;
        field3057++;
        if (arg1 <= 61) {
            this.field3062 = -79L;
        }
        this.method1205(true);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IZLph;)Lik;")
    public final class256 method1213(int arg0, boolean arg1, class78 arg2) {
        field3052++;
        if (this.field3058 != -1) {
            return class265.method1785(this.field3058, true).method1714(-15170, arg0, arg2);
        }
        class256 var4 = (class256) class97.field1552.method1480((byte) 50, this.field3062);
        if (var4 == null) {
            boolean var5 = false;
            for (int var6 = 0; var6 < 12; var6++) {
                int var15 = this.field3047[var6];
                if ((var15 & 0x40000000) == 0) {
                    if ((var15 & Integer.MIN_VALUE) != 0 && !class197.method1348((byte) 91, var15 & 0x3FFFFFFF).method937((byte) -35)) {
                        var5 = true;
                    }
                } else if (!class23.method177((byte) -79, var15 & 0x3FFFFFFF).method1463(true, this.field3064)) {
                    var5 = true;
                }
            }
            if (var5) {
                return null;
            }
            int var7 = 0;
            class114[] var8 = new class114[12];
            for (int var9 = 0; var9 < 12; var9++) {
                int var12 = this.field3047[var9];
                if ((var12 & 0x40000000) != 0) {
                    class114 var14 = class23.method177((byte) -95, var12 & 0x3FFFFFFF).method1469(false, this.field3064);
                    if (var14 != null) {
                        var8[var7++] = var14;
                    }
                } else if ((var12 & Integer.MIN_VALUE) != 0) {
                    class114 var13 = class197.method1348((byte) 91, var12 & 0x3FFFFFFF).method932((byte) -22);
                    if (var13 != null) {
                        var8[var7++] = var13;
                    }
                }
            }
            class114 var10 = new class114(var8, var7);
            for (int var11 = 0; var11 < 5; var11++) {
                if (this.field3046[var11] < class134.field2369[var11].length) {
                    var10.method835(class241.field4220[var11], class134.field2369[var11][this.field3046[var11]]);
                }
                if (this.field3046[var11] < class133.field2359[var11].length) {
                    var10.method835(class257.field4544[var11], class133.field2359[var11][this.field3046[var11]]);
                }
            }
            var4 = var10.method806(64, 768, -50, -10, -50);
            class97.field1552.method1483((byte) -118, this.field3062, var4);
        }
        if (arg2 != null) {
            var4 = arg2.method572((byte) -64, arg0, var4);
        }
        if (arg1) {
            method1204(-11, 78, -127);
        }
        return var4;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IZ[I[IB)V")
    public final void method1214(int arg0, boolean arg1, int[] arg2, int[] arg3, byte arg4) {
        if (arg3 == null) {
            arg3 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class17.field323; var7++) {
                    class136 var8 = class197.method1348((byte) 91, var7);
                    if (var8 != null && !var8.field2395 && var8.field2391 == (var6 + (arg1 ? 7 : 0))) {
                        arg3[class78.field1295[var6]] = class160.method1143(var7, Integer.MIN_VALUE);
                        break;
                    }
                }
            }
        }
        int var9 = 87 / ((-arg4 - 59) / 55);
        this.field3058 = arg0;
        this.field3047 = arg3;
        this.field3064 = arg1;
        field3054++;
        this.field3046 = arg2;
        this.method1205(true);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ILtg;II)Lti;")
    public static final class5 method1215(int arg0, class180 arg1, int arg2, int arg3) {
        field3050++;
        if (class90.method648(arg3, arg0, arg1, -41)) {
            if (arg2 != 12) {
                field3071 = -34;
            }
            return class41.method319(arg2 ^ 0xC);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIIIIIIIIIB)V")
    public static final void method1216(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, byte arg10) {
        int var11 = arg3 - arg7;
        if (arg3 < class47.field779) {
            var11++;
        }
        int var12 = arg6 - arg2;
        field3049++;
        if (arg10 != -16) {
            method1209((class180) null, true, (class180) null);
        }
        if (class74.field1222 > arg6) {
            var12++;
        }
        int var10000;
        for (int var13 = 0; var13 < var11; var13++) {
            int var44 = arg1 + ((var13 + 1) * arg8) >> 16;
            int var45 = arg8 * var13 + arg1 >> 16;
            int var46 = var44 - var45;
            if (var46 > 0) {
                int var47 = arg7 + var13 >> 6;
                if (var47 >= 0 && (class243.field4265.length - 1) >= var47) {
                    int[][] var48 = class243.field4265[var47];
                    int var49 = arg9 + var44;
                    byte[][] var50 = class80.field1313[var47];
                    int var51 = arg9 + var45;
                    byte[][] var52 = class113.field2029[var47];
                    byte[][] var53 = class74.field1236[var47];
                    byte[][] var54 = class55.field902[var47];
                    byte[][] var55 = class55.field906[var47];
                    for (int var56 = 0; var56 < var12; var56++) {
                        int var57 = arg5 + (arg4 * var56) >> 16;
                        int var58 = (var56 + 1) * arg4 + arg5 >> 16;
                        int var59 = var58 - var57;
                        if (var59 > 0) {
                            int var60 = arg0 + var58;
                            int var61 = arg2 + var56 >> 6;
                            int var62 = arg0 + var57;
                            int var63 = arg2 + var56 & 0x3F;
                            int var64 = arg7 + var13 & 0x3F;
                            int var65 = (var63 << 6) + var64;
                            int var66;
                            if (var61 < 0 || var61 > (var48.length - 1) || var48[var61] == null) {
                                if (class90.field1460.field1715 != -1) {
                                    var66 = class90.field1460.field1715;
                                } else if ((var13 + arg7 & 0x4) == (arg2 + var56 & 0x4)) {
                                    var66 = class116.field2097[class126.field2213 + 1];
                                } else {
                                    var66 = 4936552;
                                }
                                if (var61 < 0 || var61 > (var48.length - 1)) {
                                    if (var66 == 0) {
                                        var66 = 1;
                                    }
                                    class151.method1057(var51, var62, var46, var59, var66);
                                    continue;
                                }
                            } else {
                                var66 = var48[var61][var65];
                            }
                            int var67 = var50[var61] == null ? 0 : class116.field2097[var50[var61][var65] & 0xFF];
                            int var68 = var53[var61] == null ? 0 : class116.field2097[var53[var61][var65] & 0xFF];
                            if (var66 == 0) {
                                var66 = 1;
                            }
                            if (var67 == 0 && var68 == 0) {
                                class151.method1057(var51, var62, var46, var59, var66);
                            } else {
                                if (var67 != 0) {
                                    if (var67 == -1) {
                                        var67 = 1;
                                    }
                                    byte var69 = var55[var61] == null ? 0 : var55[var61][var65];
                                    int var70 = var69 & 0xFC;
                                    if (var70 == 0 || var46 <= 1 || var59 <= 1) {
                                        class151.method1057(var51, var62, var46, var59, var67);
                                    } else {
                                        class46.method346(class151.field2616, var62, var59, var46, var70 >> 2, true, var66, var69 & 0x3, (byte) 115, var67, var51);
                                    }
                                }
                                if (var68 != 0) {
                                    byte var71 = var52[var61][var65];
                                    if (var68 == -1) {
                                        var68 = var66;
                                    }
                                    int var72 = var71 & 0xFC;
                                    if (var72 == 0 || var46 <= 1 || var59 <= 1) {
                                        class151.method1057(var51, var62, var46, var59, var68);
                                    }
                                    class46.method346(class151.field2616, var62, var59, var46, var72 >> 2, var67 == 0, 0, var71 & 0x3, (byte) 121, var68, var51);
                                }
                            }
                            if (var54[var61] != null) {
                                int var73 = var54[var61][var65] & 0xFF;
                                if (var73 != 0) {
                                    int var74 = 13421772;
                                    if (var73 >= 5 && var73 <= 8 || var73 >= 13 && var73 <= 16 || var73 >= 21 && var73 <= 24 || var73 == 27 || var73 == 28) {
                                        var73 -= 4;
                                        var74 = 13369344;
                                    }
                                    int var75;
                                    if (var46 == 1) {
                                        var75 = var51;
                                    } else {
                                        var75 = var49 - 1;
                                    }
                                    int var76;
                                    if (var59 == 1) {
                                        var76 = var62;
                                    } else {
                                        var76 = var60 - 1;
                                    }
                                    if (var73 == 1) {
                                        class151.method1067(var51, var62, var59, var74);
                                    } else if (var73 == 2) {
                                        class151.method1050(var51, var62, var46, var74);
                                    } else if (var73 == 3) {
                                        class151.method1067(var75, var62, var59, var74);
                                    } else if (var73 == 4) {
                                        class151.method1050(var51, var76, var46, var74);
                                    } else if (var73 == 9) {
                                        class151.method1067(var51, var62, var59, 16777215);
                                        class151.method1050(var51, var62, var46, var74);
                                    } else if (var73 == 10) {
                                        class151.method1067(var75, var62, var59, 16777215);
                                        class151.method1050(var51, var62, var46, var74);
                                    } else if (var73 == 11) {
                                        class151.method1067(var75, var62, var59, 16777215);
                                        class151.method1050(var51, var76, var46, var74);
                                    } else if (var73 == 12) {
                                        class151.method1067(var51, var62, var59, 16777215);
                                        class151.method1050(var51, var76, var46, var74);
                                    } else if (var73 == 17) {
                                        class151.method1050(var51, var62, 1, var74);
                                    } else if (var73 == 18) {
                                        class151.method1050(var75, var62, 1, var74);
                                    } else if (var73 == 19) {
                                        class151.method1050(var75, var76, 1, var74);
                                    } else if (var73 == 20) {
                                        class151.method1050(var51, var76, 1, var74);
                                    } else if (var73 == 25) {
                                        for (int var77 = 0; var77 < var59; var77++) {
                                            class151.method1050(var51 + var77, -var77 + var76, 1, var74);
                                        }
                                    } else if (var73 == 26) {
                                        for (int var78 = 0; var78 < var59; var78++) {
                                            class151.method1050(var51 + var78, var62 + var78, 1, var74);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    var10000 = arg9 + var44;
                    int var80 = arg9 + var45;
                    for (int var81 = 0; var81 < var12; var81++) {
                        int var82;
                        if (class90.field1460.field1715 != -1) {
                            var82 = class90.field1460.field1715;
                        } else if ((arg2 + var81 & 0x4) == (arg7 + var13 & 0x4)) {
                            var82 = class116.field2097[class126.field2213 + 1];
                        } else {
                            var82 = 4936552;
                        }
                        if (var82 == 0) {
                            var82 = 1;
                        }
                        int var83 = ((var81 + 1) * arg4 + arg5 >> 16) + arg0;
                        int var84 = (arg4 * var81 + arg5 >> 16) + arg0;
                        int var85 = var83 - var84;
                        class151.method1057(var80, var84, var46, var85, var82);
                    }
                }
            }
        }
        for (int var14 = -2; var14 < var11 + 2; var14++) {
            int var15 = arg1 + (arg8 * var14) >> 16;
            int var16 = (var14 + 1) * arg8 + arg1 >> 16;
            int var17 = var16 - var15;
            if (var17 > 0) {
                int var18 = arg9 + var15;
                int var19 = arg7 + var14 >> 6;
                var10000 = arg9 + var16;
                if (var19 >= 0 && var19 <= class229.field3960.length - 1) {
                    short[][] var21 = class229.field3960[var19];
                    for (int var22 = -2; var22 < (var12 + 2); var22++) {
                        int var23 = arg4 * var22 + arg5 >> 16;
                        int var24 = (var22 + 1) * arg4 + arg5 >> 16;
                        int var25 = var24 - var23;
                        if (var25 > 0) {
                            var10000 = arg0 + var24;
                            int var27 = arg0 + var23;
                            int var28 = var22 + arg2 >> 6;
                            if (var28 >= 0 && var21.length - 1 >= var28) {
                                int var29 = ((arg2 + var22 & 0x3F) << 6) + (arg7 + var14 & 0x3F);
                                if (var21[var28] != null) {
                                    int var30 = var21[var28][var29] >> 14 & 0x3;
                                    int var31 = var21[var28][var29] & 0x3FFF;
                                    if (var31 != 0) {
                                        if (var30 == 0) {
                                            int var32 = class62.field1004[var31 - 1].field1349 * var17 / 4;
                                            int var33 = class62.field1004[var31 - 1].field1345 * var25 / 4;
                                            if (var32 != 0 && var33 != 0) {
                                                int var34 = class62.field1004[var31 - 1].field1353 * var25 / 4;
                                                class62.field1004[var31 - 1].method63(var18, var27 - var34, var32, var33);
                                            }
                                        } else if (var30 == 1) {
                                            int var41 = class255.field4501[var31 - 1].field1345 * var25 / 4;
                                            int var42 = class255.field4501[var31 - 1].field1349 * var17 / 4;
                                            if (var42 != 0 && var41 != 0) {
                                                int var43 = class255.field4501[var31 - 1].field1353 * var25 / 4;
                                                class255.field4501[var31 - 1].method63(var18, var27 - var43, var42, var41);
                                            }
                                        } else if (var30 == 2) {
                                            int var35 = class104.field1735[var31 - 1].field1349 * var17 / 4;
                                            int var36 = class104.field1735[var31 - 1].field1345 * var25 / 4;
                                            if (var35 != 0 && var36 != 0) {
                                                int var37 = class104.field1735[var31 - 1].field1353 * var25 / 4;
                                                class104.field1735[var31 - 1].method63(var18, var27 - var37, var35, var36);
                                            }
                                        } else if (var30 == 3) {
                                            int var38 = class267.field4695[var31 - 1].field1345 * var25 / 4;
                                            int var39 = class267.field4695[var31 - 1].field1349 * var17 / 4;
                                            if (var39 != 0 && var38 != 0) {
                                                int var40 = class267.field4695[var31 - 1].field1353 * var25 / 4;
                                                class267.field4695[var31 - 1].method63(var18, var27 - var40, var39, var38);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(B)I")
    public final int method1217(byte arg0) {
        if (arg0 == -126) {
            field3056++;
            return this.field3058 == -1 ? (this.field3047[11] << 5) + this.field3047[1] + (this.field3047[0] << 15) + (this.field3047[8] << 10) + (this.field3046[0] << 25) + (this.field3046[4] << 20) : class265.method1785(this.field3058, true).field4526 + 305419896;
        } else {
            return -35;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IZIILph;Lph;)Lik;")
    public final class256 method1218(int arg0, boolean arg1, int arg2, int arg3, class78 arg4, class78 arg5) {
        field3053++;
        if (this.field3058 != -1) {
            return class265.method1785(this.field3058, true).method1725(arg3 ^ 0xEC6, arg0, arg2, arg4, arg5);
        }
        long var7 = this.field3062;
        int[] var9 = this.field3047;
        if (arg4 != null && (arg4.field1294 >= 0 || arg4.field1278 >= 0)) {
            var9 = new int[12];
            for (int var10 = 0; var10 < 12; var10++) {
                var9[var10] = this.field3047[var10];
            }
            if (arg4.field1294 >= 0) {
                if (arg4.field1294 == 65535) {
                    var9[5] = 0;
                    var7 ^= 0xFFFFFFFF00000000L;
                } else {
                    var9[5] = class160.method1143(arg4.field1294, 1073741824);
                    var7 ^= (long) var9[5] << 32;
                }
            }
            if (arg4.field1278 >= 0) {
                if (arg4.field1278 == 65535) {
                    var9[3] = 0;
                    var7 ^= 0xFFFFFFFFL;
                } else {
                    var9[3] = class160.method1143(1073741824, arg4.field1278);
                    var7 ^= (long) var9[3];
                }
            }
        }
        if (arg3 != -3783) {
            this.method1218(-5, true, -119, -9, (class78) null, (class78) null);
        }
        class256 var11 = (class256) class193.field3413.method1480((byte) 50, var7);
        if (var11 == null) {
            boolean var12 = false;
            for (int var13 = 0; var13 < 12; var13++) {
                int var22 = var9[var13];
                if ((var22 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var22) != 0 && !class197.method1348((byte) 91, var22 & 0x3FFFFFFF).method936((byte) -122)) {
                        var12 = true;
                    }
                } else if (!class23.method177((byte) -127, var22 & 0x3FFFFFFF).method1467(arg3 ^ 0xFFFFF10F, this.field3064)) {
                    var12 = true;
                }
            }
            if (var12) {
                if (this.field3060 != -1L) {
                    var11 = (class256) class193.field3413.method1480((byte) 50, this.field3060);
                }
                if (var11 == null) {
                    return null;
                }
            }
            if (var11 == null) {
                int var14 = 0;
                class114[] var15 = new class114[12];
                for (int var16 = 0; var16 < 12; var16++) {
                    int var19 = var9[var16];
                    if ((var19 & 0x40000000) != 0) {
                        class114 var20 = class23.method177((byte) -128, var19 & 0x3FFFFFFF).method1474((byte) -85, this.field3064);
                        if (var20 != null) {
                            var15[var14++] = var20;
                        }
                    } else if ((var19 & Integer.MIN_VALUE) != 0) {
                        class114 var21 = class197.method1348((byte) 91, var19 & 0x3FFFFFFF).method931(-21705);
                        if (var21 != null) {
                            var15[var14++] = var21;
                        }
                    }
                }
                class114 var17 = new class114(var15, var14);
                for (int var18 = 0; var18 < 5; var18++) {
                    if (class134.field2369[var18].length > this.field3046[var18]) {
                        var17.method835(class241.field4220[var18], class134.field2369[var18][this.field3046[var18]]);
                    }
                    if (this.field3046[var18] < class133.field2359[var18].length) {
                        var17.method835(class257.field4544[var18], class133.field2359[var18][this.field3046[var18]]);
                    }
                }
                var11 = var17.method806(64, 850, -30, -50, -30);
                if (arg1) {
                    class193.field3413.method1483((byte) -116, var7, var11);
                    this.field3060 = var7;
                }
            }
        }
        if (arg4 == null && arg5 == null) {
            return var11;
        }
        class256 var23;
        if (arg4 != null && arg5 != null) {
            var23 = arg4.method573(arg2, var11, arg5, arg0, true);
        } else if (arg4 == null) {
            var23 = arg5.method582((byte) 109, var11, arg2);
        } else {
            var23 = arg4.method582((byte) 88, var11, arg0);
        }
        return var23;
    }
}
