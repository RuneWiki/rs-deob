import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class162 {

    @OriginalMember(owner = "client!il", name = "u", descriptor = "Lcf;")
    public static class93 field2868 = class147.method1066("Veuillez patienter)3)3)3", -48);

    @OriginalMember(owner = "client!il", name = "x", descriptor = "Lcf;")
    public static class93 field2871 = class147.method1066("Fps:", -48);

    @OriginalMember(owner = "client!il", name = "b", descriptor = "I")
    public static int field2849;

    @OriginalMember(owner = "client!il", name = "c", descriptor = "I")
    public static int field2850;

    @OriginalMember(owner = "client!il", name = "d", descriptor = "I")
    public static int field2851;

    @OriginalMember(owner = "client!il", name = "f", descriptor = "I")
    public static int field2853;

    @OriginalMember(owner = "client!il", name = "i", descriptor = "I")
    public static int field2856;

    @OriginalMember(owner = "client!il", name = "j", descriptor = "I")
    public static int field2857;

    @OriginalMember(owner = "client!il", name = "k", descriptor = "I")
    public static int field2858;

    @OriginalMember(owner = "client!il", name = "l", descriptor = "I")
    public static int field2859;

    @OriginalMember(owner = "client!il", name = "o", descriptor = "I")
    public static int field2862;

    @OriginalMember(owner = "client!il", name = "q", descriptor = "I")
    private int field2864;

    @OriginalMember(owner = "client!il", name = "r", descriptor = "I")
    public static int field2865;

    @OriginalMember(owner = "client!il", name = "v", descriptor = "I")
    public int field2869;

    @OriginalMember(owner = "client!il", name = "y", descriptor = "I")
    public static int field2872;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "J")
    private long field2848;

    @OriginalMember(owner = "client!il", name = "h", descriptor = "J")
    private long field2855;

    @OriginalMember(owner = "client!il", name = "w", descriptor = "Lhg;")
    public static class177 field2870;

    @OriginalMember(owner = "client!il", name = "m", descriptor = "Lah;")
    public static class277 field2860;

    @OriginalMember(owner = "client!il", name = "n", descriptor = "Z")
    public boolean field2861;

    @OriginalMember(owner = "client!il", name = "e", descriptor = "[I")
    private int[] field2852;

    @OriginalMember(owner = "client!il", name = "s", descriptor = "[I")
    private int[] field2866;

    @OriginalMember(owner = "client!il", name = "t", descriptor = "[I")
    public static int[] field2867;

    @OriginalMember(owner = "client!il", name = "g", descriptor = "[[I")
    private int[][] field2854;

    @OriginalMember(owner = "client!il", name = "p", descriptor = "[[I")
    public static int[][] field2863;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Lna;ILna;IIIIZII[Lqk;)Lbk;")
    public final class20 method1167(class31 arg0, int arg1, class31 arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, class208[] arg10) {
        field2853++;
        if (this.field2869 != -1) {
            return class5.method19((byte) -59, this.field2869).method1047(arg9, arg10, (byte) 79, arg4, arg3, arg5, arg6, arg0, arg2, arg8);
        }
        int[] var12 = this.field2866;
        long var13 = this.field2855;
        if (arg0 != null && (arg0.field467 >= 0 || arg0.field480 >= 0)) {
            var12 = new int[12];
            for (int var15 = 0; var15 < 12; var15++) {
                var12[var15] = this.field2866[var15];
            }
            if (arg0.field467 >= 0) {
                if (arg0.field467 == 65535) {
                    var12[5] = 0;
                    var13 ^= 0xFFFFFFFF00000000L;
                } else {
                    var12[5] = class270.method1797(arg0.field467, 1073741824);
                    var13 ^= (long) var12[5] << 32;
                }
            }
            if (arg0.field480 >= 0) {
                if (arg0.field480 == 65535) {
                    var13 ^= 0xFFFFFFFFL;
                    var12[3] = 0;
                } else {
                    var12[3] = class270.method1797(arg0.field480, 1073741824);
                    var13 ^= (long) var12[3];
                }
            }
        }
        class20 var16 = (class20) class129.field2272.method302(var13, arg1);
        if (var16 == null) {
            boolean var17 = false;
            for (int var18 = 0; var18 < 12; var18++) {
                int var43 = var12[var18];
                if ((var43 & 0x40000000) == 0) {
                    if ((var43 & Integer.MIN_VALUE) != 0 && !class199.method1425(var43 & 0x3FFFFFFF, 3).method256(0)) {
                        var17 = true;
                    }
                } else if (!class89.method617(var43 & 0x3FFFFFFF, 0).method167(this.field2861, 12)) {
                    var17 = true;
                }
            }
            if (var17) {
                if (this.field2848 != -1L) {
                    var16 = (class20) class129.field2272.method302(this.field2848, 0);
                }
                if (var16 == null) {
                    return null;
                }
            }
            if (var16 == null) {
                class64[] var19 = new class64[12];
                for (int var20 = 0; var20 < 12; var20++) {
                    int var40 = var12[var20];
                    if ((var40 & 0x40000000) != 0) {
                        class64 var41 = class89.method617(var40 & 0x3FFFFFFF, arg1).method164(true, this.field2861);
                        if (var41 != null) {
                            var19[var20] = var41;
                        }
                    } else if ((var40 & Integer.MIN_VALUE) != 0) {
                        class64 var42 = class199.method1425(var40 & 0x3FFFFFFF, 3).method254((byte) -120);
                        if (var42 != null) {
                            var19[var20] = var42;
                        }
                    }
                }
                class50 var21 = null;
                if (this.field2864 != -1) {
                    var21 = class51.method282(arg1 ^ 0x7F, this.field2864);
                }
                if (var21 != null && var21.field813 != null) {
                    for (int var22 = 0; var22 < var21.field813.length; var22++) {
                        if (var21.field813[var22] != null && var19[var22] != null) {
                            int var23 = var21.field813[var22][0];
                            int var24 = var21.field813[var22][1];
                            int var25 = var21.field813[var22][2];
                            int var26 = var21.field813[var22][3];
                            int var27 = var21.field813[var22][4];
                            int var28 = var21.field813[var22][5];
                            if (this.field2854 == null) {
                                this.field2854 = new int[var21.field813.length][];
                            }
                            if (this.field2854[var22] == null) {
                                int[] var29 = this.field2854[var22] = new int[15];
                                if (var26 == 0 && var27 == 0 && var28 == 0) {
                                    var29[14] = -var25;
                                    var29[0] = var29[4] = var29[8] = 32768;
                                    var29[12] = -var23;
                                    var29[13] = -var24;
                                } else {
                                    int var30 = class179.field3158[var26] >> 1;
                                    int var31 = class179.field3155[var26] >> 1;
                                    int var32 = class179.field3158[var27] >> 1;
                                    int var33 = class179.field3155[var27] >> 1;
                                    int var34 = class179.field3155[var28] >> 1;
                                    int var35 = class179.field3158[var28] >> 1;
                                    var29[2] = var30 * var33 + 16384 >> 15;
                                    var29[4] = var30 * var35 + 16384 >> 15;
                                    var29[5] = -var31;
                                    int var36 = var31 * var35 + 16384 >> 15;
                                    var29[8] = var30 * var32 + 16384 >> 15;
                                    var29[1] = -var34 * var32 + var33 * var36 + 16384 >> 15;
                                    var29[14] = var29[8] * -var25 + var29[5] * -var24 + var29[2] * -var23 + 16384 >> 15;
                                    var29[7] = -var33 * -var34 + (var32 * var36) + 16384 >> 15;
                                    var29[3] = var30 * var34 + 16384 >> 15;
                                    int var37 = var31 * var34 + 16384 >> 15;
                                    var29[6] = -var33 * var35 + var32 * var37 + 16384 >> 15;
                                    var29[13] = var29[7] * -var25 + var29[1] * -var23 + var29[4] * -var24 + 16384 >> 15;
                                    var29[0] = var33 * var37 + var32 * var35 + 16384 >> 15;
                                    var29[12] = var29[3] * -var24 + var29[6] * -var25 + var29[0] * -var23 + 16384 >> 15;
                                }
                                var29[11] = var25;
                                var29[10] = var24;
                                var29[9] = var23;
                            }
                            if (var26 != 0 || var27 != 0 || var28 != 0) {
                                var19[var22].method429(var26, var27, var28);
                            }
                            if (var23 != 0 || var24 != 0 || var25 != 0) {
                                var19[var22].method420(var23, var24, var25);
                            }
                        }
                    }
                }
                class64 var38 = new class64(var19, var19.length);
                for (int var39 = 0; var39 < 5; var39++) {
                    if (client.field2730[var39].length > this.field2852[var39]) {
                        var38.method433(class258.field4645[var39], client.field2730[var39][this.field2852[var39]]);
                    }
                    if (this.field2852[var39] < class83.field1519[var39].length) {
                        var38.method433(class208.field3734[var39], class83.field1519[var39][this.field2852[var39]]);
                    }
                }
                var16 = var38.method436(64, 850, -30, -50, -30);
                if (arg7) {
                    class129.field2272.method297(var13, var16, 10414);
                    this.field2848 = var13;
                }
            }
        }
        boolean var44 = false;
        boolean var45 = false;
        boolean var46 = false;
        boolean var47 = false;
        int var48 = arg10 == null ? 0 : arg10.length;
        for (int var49 = 0; var49 < var48; var49++) {
            if (arg10[var49] != null) {
                class31 var72 = class131.method964(arg10[var49].field3729, true);
                if (var72.field479 != null) {
                    class110.field1880[var49] = var72;
                    var44 = true;
                    int var73 = arg10[var49].field3724;
                    int var74 = arg10[var49].field3730;
                    int var75 = var72.field479[var73];
                    class153.field2694[var49] = class65.method452(class175.method1248(arg1, -120), var75 >>> 16);
                    int var76 = var75 & 0xFFFF;
                    class29.field431[var49] = var76;
                    if (class153.field2694[var49] != null) {
                        var46 |= class153.field2694[var49].method1005(-24204, var76);
                        var45 |= class153.field2694[var49].method1006(var76, false);
                        var47 |= var72.field466;
                    }
                    if ((var72.field472 || class148.field2612) && var74 != -1 && var74 < var72.field479.length) {
                        class186.field3436[var49] = var72.field486[var73];
                        class70.field1266[var49] = arg10[var49].field3719;
                        int var77 = var72.field479[var74];
                        class141.field2454[var49] = class65.method452(arg1 - 117, var77 >>> 16);
                        int var78 = var77 & 0xFFFF;
                        class230.field4116[var49] = var78;
                        if (class141.field2454[var49] != null) {
                            var46 |= class141.field2454[var49].method1005(-24204, var78);
                            var45 |= class141.field2454[var49].method1006(var78, false);
                        }
                    } else {
                        class186.field3436[var49] = 0;
                        class70.field1266[var49] = 0;
                        class141.field2454[var49] = null;
                        class230.field4116[var49] = -1;
                    }
                }
            }
        }
        if (!var44 && arg0 == null && arg2 == null) {
            return var16;
        }
        int var50 = -1;
        int var51 = -1;
        int var52 = arg1;
        class138 var53 = null;
        class138 var54 = null;
        if (arg0 != null) {
            int var55 = arg0.field479[arg9];
            int var56 = var55 >>> 16;
            var51 = var55 & 0xFFFF;
            var53 = class65.method452(-122, var56);
            if (var53 != null) {
                var46 |= var53.method1005(arg1 - 24204, var51);
                var45 |= var53.method1006(var51, false);
                var47 |= arg0.field466;
            }
            if ((arg0.field472 || class148.field2612) && arg6 != -1 && arg0.field479.length > arg6) {
                var52 = arg0.field486[arg9];
                int var57 = arg0.field479[arg6];
                int var58 = var57 >>> 16;
                var50 = var57 & 0xFFFF;
                if (var56 == var58) {
                    var54 = var53;
                } else {
                    var54 = class65.method452(arg1 ^ 0xFFFFFF85, var50 >>> 16);
                }
                if (var54 != null) {
                    var46 |= var54.method1005(arg1 ^ 0xFFFFA174, var50);
                    var45 |= var54.method1006(var50, false);
                }
            }
        }
        int var59 = -1;
        int var60 = -1;
        int var61 = 0;
        class138 var62 = null;
        class138 var63 = null;
        if (arg2 != null) {
            int var64 = arg2.field479[arg8];
            int var65 = var64 >>> 16;
            var59 = var64 & 0xFFFF;
            var63 = class65.method452(-117, var65);
            if (var63 != null) {
                var46 |= var63.method1005(-24204, var59);
                var45 |= var63.method1006(var59, false);
                var47 |= arg2.field466;
            }
            if ((arg2.field472 || class148.field2612) && arg5 != -1 && arg5 < arg2.field479.length) {
                int var66 = arg2.field479[arg5];
                int var67 = var66 >>> 16;
                var61 = arg2.field486[arg8];
                var60 = var66 & 0xFFFF;
                if (var65 == var67) {
                    var62 = var63;
                } else {
                    var62 = class65.method452(-120, var60 >>> 16);
                }
                if (var62 != null) {
                    var46 |= var62.method1005(-24204, var60);
                    var45 |= var62.method1006(var60, false);
                }
            }
        }
        class20 var68 = var16.method94(!var45, !var46, !var47);
        int var69 = 0;
        int var70 = 1;
        while (var48 > var69) {
            if (class153.field2694[var69] != null) {
                var68.method110(class153.field2694[var69], class29.field431[var69], class141.field2454[var69], class230.field4116[var69], class70.field1266[var69] - 1, class186.field3436[var69], var70, class110.field1880[var69].field466, this.field2854[var69]);
            }
            var69++;
            var70 <<= 0x1;
        }
        if (var53 != null && var63 != null) {
            var68.method108(var53, var51, var54, var50, arg4 - 1, var52, var63, var59, var62, var60, arg3 - 1, var61, arg0.field482, arg2.field466 | arg0.field466);
        } else if (var53 != null) {
            var68.method115(var53, var51, var54, var50, arg4 - 1, var52, arg0.field466);
        } else if (var63 != null) {
            var68.method115(var63, var59, var62, var60, arg3 - 1, var61, arg2.field466);
        }
        for (int var71 = 0; var71 < var48; var71++) {
            class153.field2694[var71] = null;
            class141.field2454[var71] = null;
            class110.field1880[var71] = null;
        }
        return var68;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(I)I")
    public final int method1168(int arg0) {
        field2859++;
        if (arg0 != 12) {
            this.method1168(69);
        }
        return this.field2869 == -1 ? (this.field2852[0] << 25) + (this.field2852[4] << 20) - (-(this.field2866[0] << 15) - ((this.field2866[8] << 10) + ((this.field2866[11] << 5) - -this.field2866[1]))) : class5.method19((byte) -59, this.field2869).field2552 + 305419896;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IILna;II)Lbk;")
    public final class20 method1169(int arg0, int arg1, class31 arg2, int arg3, int arg4) {
        field2865++;
        if (arg0 != 1073741823) {
            method1176((byte) 49);
        }
        if (this.field2869 != -1) {
            return class5.method19((byte) -59, this.field2869).method1049((byte) -1, arg3, arg2, arg1, arg4);
        }
        class20 var6 = (class20) class5.field68.method302(this.field2855, 0);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < 12; var8++) {
                int var17 = this.field2866[var8];
                if ((var17 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var17) != 0 && !class199.method1425(var17 & 0x3FFFFFFF, 3).method255((byte) -57)) {
                        var7 = true;
                    }
                } else if (!class89.method617(var17 & 0x3FFFFFFF, arg0 ^ 0x3FFFFFFF).method174(false, this.field2861)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class64[] var9 = new class64[12];
            int var10 = 0;
            for (int var11 = 0; var11 < 12; var11++) {
                int var14 = this.field2866[var11];
                if ((var14 & 0x40000000) != 0) {
                    class64 var16 = class89.method617(var14 & 0x3FFFFFFF, arg0 ^ 0x3FFFFFFF).method170(-1, this.field2861);
                    if (var16 != null) {
                        var9[var10++] = var16;
                    }
                } else if ((var14 & Integer.MIN_VALUE) != 0) {
                    class64 var15 = class199.method1425(var14 & 0x3FFFFFFF, 3).method249(arg0 - 1073741943);
                    if (var15 != null) {
                        var9[var10++] = var15;
                    }
                }
            }
            class64 var12 = new class64(var9, var10);
            for (int var13 = 0; var13 < 5; var13++) {
                if (this.field2852[var13] < client.field2730[var13].length) {
                    var12.method433(class258.field4645[var13], client.field2730[var13][this.field2852[var13]]);
                }
                if (this.field2852[var13] < class83.field1519[var13].length) {
                    var12.method433(class208.field3734[var13], class83.field1519[var13][this.field2852[var13]]);
                }
            }
            var6 = var12.method436(64, 768, -50, -10, -50);
            class5.field68.method297(this.field2855, var6, 10414);
        }
        if (arg2 != null) {
            var6 = arg2.method179(arg3, var6, arg1, arg4, (byte) 95);
        }
        return var6;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Z)V")
    private final void method1170(boolean arg0) {
        long var2 = this.field2855;
        long[] var4 = class204.field3677;
        this.field2855 = -1L;
        this.field2855 = this.field2855 >>> 8 ^ var4[(int) ((this.field2855 ^ (long) (this.field2864 >> 8)) & 0xFFL)];
        field2850++;
        this.field2855 = var4[(int) ((this.field2855 ^ (long) this.field2864) & 0xFFL)] ^ this.field2855 >>> 8;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2855 = var4[(int) (((long) (this.field2866[var5] >> 24) ^ this.field2855) & 0xFFL)] ^ this.field2855 >>> 8;
            this.field2855 = this.field2855 >>> 8 ^ var4[(int) ((this.field2855 ^ (long) (this.field2866[var5] >> 16)) & 0xFFL)];
            this.field2855 = this.field2855 >>> 8 ^ var4[(int) ((this.field2855 ^ (long) (this.field2866[var5] >> 8)) & 0xFFL)];
            this.field2855 = var4[(int) (((long) this.field2866[var5] ^ this.field2855) & 0xFFL)] ^ this.field2855 >>> 8;
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2855 = var4[(int) (((long) this.field2852[var6] ^ this.field2855) & 0xFFL)] ^ this.field2855 >>> 8;
        }
        if (arg0) {
            this.method1168(-57);
        }
        this.field2855 = var4[(int) (((long) (this.field2861 ? 1 : 0) ^ this.field2855) & 0xFFL)] ^ this.field2855 >>> 8;
        if (var2 != 0L && this.field2855 != var2) {
            class129.field2272.method295(var2, -126);
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(ZZ)V")
    public final void method1171(boolean arg0, boolean arg1) {
        field2849++;
        this.field2861 = arg1;
        this.method1170(arg0);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(II)Z")
    public static final boolean method1172(int arg0, int arg1) {
        if (arg0 != 1) {
            method1172(118, -23);
        }
        field2857++;
        return (arg1 & -arg1) == arg1;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IIB)V")
    public final void method1173(int arg0, int arg1, byte arg2) {
        field2856++;
        int var4 = class152.field2674[arg0];
        if (this.field2866[var4] == 0) {
            return;
        }
        int var5 = 87 % ((-arg2 - 20) / 61);
        if (class199.method1425(arg1, 3) != null) {
            this.field2866[var4] = class270.method1797(arg1, Integer.MIN_VALUE);
            this.method1170(false);
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(I[IZI[II)V")
    public final void method1174(int arg0, int[] arg1, boolean arg2, int arg3, int[] arg4, int arg5) {
        field2858++;
        if (this.field2864 != arg0) {
            this.field2854 = null;
            this.field2864 = arg0;
        }
        if (arg4 == null) {
            arg4 = new int[12];
            for (int var7 = 0; var7 < 8; var7++) {
                for (int var8 = 0; var8 < class103.field1793; var8++) {
                    class45 var9 = class199.method1425(var8, 3);
                    if (var9 != null && !var9.field719 && (arg2 ? class135.field2368[var7] : class113.field1935[var7]) == var9.field716) {
                        arg4[class152.field2674[var7]] = class270.method1797(Integer.MIN_VALUE, var8);
                        break;
                    }
                }
            }
        }
        this.field2861 = arg2;
        this.field2852 = arg1;
        if (arg3 != -10710) {
            method1176((byte) 31);
        }
        this.field2866 = arg4;
        this.field2869 = arg5;
        this.method1170(false);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IBI)V")
    public final void method1175(int arg0, byte arg1, int arg2) {
        this.field2852[arg0] = arg2;
        if (arg1 != 27) {
            this.method1171(false, false);
        }
        this.method1170(false);
        field2872++;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(B)V")
    public static void method1176(byte arg0) {
        field2863 = null;
        field2867 = null;
        field2870 = null;
        field2860 = null;
        field2871 = null;
        field2868 = null;
        if (arg0 != 49) {
            field2863 = null;
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IILna;IIIII)Lbk;")
    public final class20 method1177(int arg0, int arg1, class31 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        long var9 = (long) arg4 << 32 | (long) (arg6 << 16) | (long) arg5;
        field2851++;
        class20 var11 = (class20) class5.field68.method302(var9, 0);
        if (arg1 != -2657) {
            this.field2869 = -111;
        }
        if (var11 == null) {
            int var12 = 0;
            class64[] var13 = new class64[3];
            if (!class199.method1425(arg5, 3).method255((byte) -57) || !class199.method1425(arg6, arg1 + 2660).method255((byte) -57) || !class199.method1425(arg4, 3).method255((byte) -57)) {
                return null;
            }
            class64 var14 = class199.method1425(arg5, arg1 + 2660).method249(-128);
            if (var14 != null) {
                var13[var12++] = var14;
            }
            class64 var15 = class199.method1425(arg6, 3).method249(-128);
            if (var15 != null) {
                var13[var12++] = var15;
            }
            class64 var16 = class199.method1425(arg4, 3).method249(-120);
            if (var16 != null) {
                var13[var12++] = var16;
            }
            class64 var17 = new class64(var13, var12);
            for (int var18 = 0; var18 < 5; var18++) {
                if (client.field2730[var18].length > this.field2852[var18]) {
                    var17.method433(class258.field4645[var18], client.field2730[var18][this.field2852[var18]]);
                }
                if (class83.field1519[var18].length > this.field2852[var18]) {
                    var17.method433(class208.field3734[var18], class83.field1519[var18][this.field2852[var18]]);
                }
            }
            var11 = var17.method436(64, 768, -50, -10, -50);
            class5.field68.method297(var9, var11, 10414);
        }
        if (arg2 != null) {
            var11 = arg2.method179(arg3, var11, arg0, arg7, (byte) 58);
        }
        return var11;
    }
}
