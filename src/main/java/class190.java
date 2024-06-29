import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public class class190 {

    @OriginalMember(owner = "client!sq", name = "u", descriptor = "I")
    public int field2942 = -1;

    @OriginalMember(owner = "client!sq", name = "q", descriptor = "I")
    public static int field2938 = 1403;

    @OriginalMember(owner = "client!sq", name = "e", descriptor = "Lfba;")
    public static class27 field2926 = new class27(23, 3);

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "I")
    public static int field2922;

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "I")
    public static int field2923;

    @OriginalMember(owner = "client!sq", name = "c", descriptor = "I")
    public static int field2924;

    @OriginalMember(owner = "client!sq", name = "d", descriptor = "I")
    public static int field2925;

    @OriginalMember(owner = "client!sq", name = "h", descriptor = "I")
    public static int field2929;

    @OriginalMember(owner = "client!sq", name = "j", descriptor = "I")
    public static int field2931;

    @OriginalMember(owner = "client!sq", name = "m", descriptor = "I")
    public static int field2934;

    @OriginalMember(owner = "client!sq", name = "n", descriptor = "I")
    public static int field2935;

    @OriginalMember(owner = "client!sq", name = "o", descriptor = "I")
    public static int field2936;

    @OriginalMember(owner = "client!sq", name = "p", descriptor = "I")
    private int field2937;

    @OriginalMember(owner = "client!sq", name = "s", descriptor = "I")
    public static int field2940;

    @OriginalMember(owner = "client!sq", name = "w", descriptor = "I")
    public static int field2944;

    @OriginalMember(owner = "client!sq", name = "f", descriptor = "J")
    private long field2927;

    @OriginalMember(owner = "client!sq", name = "r", descriptor = "J")
    private long field2939;

    @OriginalMember(owner = "client!sq", name = "t", descriptor = "Z")
    public boolean field2941;

    @OriginalMember(owner = "client!sq", name = "g", descriptor = "[I")
    private int[] field2928;

    @OriginalMember(owner = "client!sq", name = "i", descriptor = "[I")
    public int[] field2930;

    @OriginalMember(owner = "client!sq", name = "l", descriptor = "[Lfn;")
    private class148[] field2933;

    @OriginalMember(owner = "client!sq", name = "v", descriptor = "[[B")
    public static byte[][] field2943;

    @OriginalMember(owner = "client!sq", name = "k", descriptor = "[[[B")
    public static byte[][][] field2932;

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(III)V", line = 3)
    public final void method1325(int arg0, int arg1, int arg2) {
        this.field2930[arg1] = arg2;
        if (arg0 != 23276) {
            field2943 = null;
        }
        field2940++;
        this.method1326(1803495432);
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(I)V", line = 17)
    private final void method1326(int arg0) {
        if (arg0 != 1803495432) {
            return;
        }
        field2925++;
        this.field2927 = -1L;
        long[] var2 = class556.field7929;
        this.field2927 = this.field2927 >>> 8 ^ var2[(int) (((long) (this.field2937 >> 8) ^ this.field2927) & 0xFFL)];
        this.field2927 = var2[(int) ((this.field2927 ^ (long) this.field2937) & 0xFFL)] ^ this.field2927 >>> 8;
        for (int var3 = 0; var3 < this.field2928.length; var3++) {
            this.field2927 = this.field2927 >>> 8 ^ var2[(int) ((this.field2927 ^ (long) (this.field2928[var3] >> 24)) & 0xFFL)];
            this.field2927 = var2[(int) (((long) (this.field2928[var3] >> 16) ^ this.field2927) & 0xFFL)] ^ this.field2927 >>> 8;
            this.field2927 = this.field2927 >>> 8 ^ var2[(int) ((this.field2927 ^ (long) (this.field2928[var3] >> 8)) & 0xFFL)];
            this.field2927 = this.field2927 >>> 8 ^ var2[(int) (((long) this.field2928[var3] ^ this.field2927) & 0xFFL)];
        }
        if (this.field2933 != null) {
            for (int var4 = 0; var4 < this.field2933.length; var4++) {
                if (this.field2933[var4] != null) {
                    int[] var5;
                    int[] var6;
                    if (this.field2941) {
                        var5 = this.field2933[var4].field2138;
                        var6 = this.field2933[var4].field2141;
                    } else {
                        var5 = this.field2933[var4].field2134;
                        var6 = this.field2933[var4].field2136;
                    }
                    if (var5 != null) {
                        for (int var7 = 0; var7 < var5.length; var7++) {
                            this.field2927 = this.field2927 >>> 8 ^ var2[(int) ((this.field2927 ^ (long) (var5[var7] >> 8)) & 0xFFL)];
                            this.field2927 = var2[(int) ((this.field2927 ^ (long) var5[var7]) & 0xFFL)] ^ this.field2927 >>> 8;
                        }
                    }
                    if (var6 != null) {
                        for (int var8 = 0; var8 < var6.length; var8++) {
                            this.field2927 = this.field2927 >>> 8 ^ var2[(int) ((this.field2927 ^ (long) (var6[var8] >> 8)) & 0xFFL)];
                            this.field2927 = var2[(int) (((long) var6[var8] ^ this.field2927) & 0xFFL)] ^ this.field2927 >>> 8;
                        }
                    }
                    if (this.field2933[var4].field2137 != null) {
                        for (int var9 = 0; var9 < this.field2933[var4].field2137.length; var9++) {
                            this.field2927 = this.field2927 >>> 8 ^ var2[(int) ((this.field2927 ^ (long) (this.field2933[var4].field2137[var9] >> 8)) & 0xFFL)];
                            this.field2927 = this.field2927 >>> 8 ^ var2[(int) (((long) this.field2933[var4].field2137[var9] ^ this.field2927) & 0xFFL)];
                        }
                    }
                    if (this.field2933[var4].field2140 != null) {
                        for (int var10 = 0; var10 < this.field2933[var4].field2140.length; var10++) {
                            this.field2927 = this.field2927 >>> 8 ^ var2[(int) (((long) (this.field2933[var4].field2140[var10] >> 8) ^ this.field2927) & 0xFFL)];
                            this.field2927 = var2[(int) ((this.field2927 ^ (long) this.field2933[var4].field2140[var10]) & 0xFFL)] ^ this.field2927 >>> 8;
                        }
                    }
                }
            }
        }
        for (int var11 = 0; var11 < 5; var11++) {
            this.field2927 = this.field2927 >>> 8 ^ var2[(int) ((this.field2927 ^ (long) this.field2930[var11]) & 0xFFL)];
        }
        this.field2927 = this.field2927 >>> 8 ^ var2[(int) ((this.field2927 ^ (long) (this.field2941 ? 1 : 0)) & 0xFFL)];
    }

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "(I)V", line = 147)
    public static final void method1327(int arg0) {
        field2931++;
        class629.field8820.method2135(true);
        if (arg0 != -22101) {
            field2943 = null;
        }
        class152.field2154.method2652(-30663);
        class256.field3768.method2052(50);
        class629.field8819.setBackground(Color.black);
        class648.field9063 = -1;
        class629.field8820 = class342.method2167(class629.field8819, true);
        class152.field2154 = class45.method325(0, true, class629.field8819);
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(ILkf;Lpf;I[Luga;ILha;Lbk;Ljv;ILpf;ZIILob;Lib;I[ILnj;II)Lka;", line = 167)
    public final class496 method1328(int arg0, class265 arg1, class607 arg2, int arg3, class220[] arg4, int arg5, class65 arg6, class395 arg7, class86 arg8, int arg9, class607 arg10, boolean arg11, int arg12, int arg13, class769 arg14, class163 arg15, int arg16, int[] arg17, class257 arg18, int arg19, int arg20) {
        field2936++;
        if (~this.field2942 != arg16) {
            return arg7.method2439((byte) 73, this.field2942).method847(null, arg9, arg1, arg10, arg17, arg8, arg2, arg12, false, arg13, arg0, arg14, arg20, arg19, arg5, arg6, arg4, arg3);
        }
        int var22 = arg12;
        long var23 = this.field2927;
        int[] var25 = this.field2928;
        boolean var26 = false;
        boolean var27 = false;
        if (arg10 != null && (arg10.field8510 >= 0 || arg10.field8507 >= 0)) {
            var25 = new int[this.field2928.length];
            for (int var28 = 0; var28 < var25.length; var28++) {
                var25[var28] = this.field2928[var28];
            }
            if (arg10.field8510 >= 0) {
                if (arg10.field8510 == 65535) {
                    var25[5] = 0;
                    var26 = true;
                    var23 ^= 0xFFFFFFFF00000000L;
                } else {
                    var25[5] = class746.method4158(1073741824, arg10.field8510);
                    var23 ^= (long) var25[5] << 32;
                }
            }
            if (arg10.field8507 >= 0) {
                var27 = true;
                if (arg10.field8507 == 65535) {
                    var25[3] = 0;
                    var23 ^= 0xFFFFFFFFL;
                } else {
                    var25[3] = class746.method4158(arg10.field8507, 1073741824);
                    var23 ^= var25[3];
                }
            }
        }
        boolean var29 = false;
        boolean var30 = false;
        boolean var31 = false;
        boolean var32 = arg10 != null || arg2 != null;
        int var33 = arg4 == null ? 0 : arg4.length;
        for (int var34 = 0; var34 < var33; var34++) {
            class88.field995[var34] = null;
            if (arg4[var34] != null) {
                class607 var35 = arg8.method651(arg4[var34].field3412, (byte) 96);
                if (var35.field8492 != null) {
                    var32 = true;
                    class296.field4299[var34] = var35;
                    int var36 = arg4[var34].field3411;
                    int var37 = arg4[var34].field3415;
                    int var38 = var35.field8492[var36];
                    class88.field995[var34] = arg8.method648((byte) 120, var38 >>> 16);
                    int var39 = var38 & 0xFFFF;
                    class576.field8123[var34] = var39;
                    if (class88.field995[var34] != null) {
                        var30 |= class88.field995[var34].method2303(~arg16, var39);
                        var29 |= class88.field995[var34].method2304(-755, var39);
                        var31 |= class88.field995[var34].method2300((byte) -126, var39);
                    }
                    if ((var35.field8504 || class778.field10685) && var37 != -1 && var35.field8492.length > var37) {
                        class142.field2101[var34] = var35.field8494[var36];
                        class569.field8029[var34] = arg4[var34].field3408;
                        int var40 = var35.field8492[var37];
                        class541.field7793[var34] = arg8.method648((byte) 65, var40 >>> 16);
                        int var41 = var40 & 0xFFFF;
                        class235.field3540[var34] = var41;
                        if (class541.field7793[var34] != null) {
                            var30 |= class541.field7793[var34].method2303(~arg16, var41);
                            var29 |= class541.field7793[var34].method2304(-755, var41);
                            var31 |= class541.field7793[var34].method2300((byte) 61, var41);
                        }
                    } else {
                        class142.field2101[var34] = 0;
                        class569.field8029[var34] = 0;
                        class541.field7793[var34] = null;
                        class235.field3540[var34] = -1;
                    }
                }
            }
        }
        int var42 = -1;
        int var43 = -1;
        int var44 = 0;
        class369 var45 = null;
        class369 var46 = null;
        int var47 = -1;
        int var48 = -1;
        int var49 = 0;
        class369 var50 = null;
        class369 var51 = null;
        if (var32) {
            if (arg10 != null) {
                int var52 = arg10.field8492[arg5];
                int var53 = var52 >>> 16;
                var42 = var52 & 0xFFFF;
                var45 = arg8.method648((byte) 36, var53);
                if (var45 != null) {
                    var30 |= var45.method2303(-1, var42);
                    var29 |= var45.method2304(-755, var42);
                    var31 |= var45.method2300((byte) 122, var42);
                }
                if ((arg10.field8504 || class778.field10685) && arg0 != -1 && arg10.field8492.length > arg0) {
                    int var54 = arg10.field8492[arg0];
                    var44 = arg10.field8494[arg5];
                    int var55 = var54 >>> 16;
                    var46 = var53 == var55 ? var45 : arg8.method648((byte) 108, var55);
                    var43 = var54 & 0xFFFF;
                    if (var46 != null) {
                        var30 |= var46.method2303(arg16 - 1, var43);
                        var29 |= var46.method2304(-755, var43);
                        var31 |= var46.method2300((byte) 51, var43);
                    }
                }
            }
            var22 = arg12 | 0x20;
            if (arg2 != null) {
                int var56 = arg2.field8492[arg13];
                int var57 = var56 >>> 16;
                var47 = var56 & 0xFFFF;
                var50 = arg8.method648((byte) 118, var57);
                if (var50 != null) {
                    var30 |= var50.method2303(-1, var47);
                    var29 |= var50.method2304(-755, var47);
                    var31 |= var50.method2300((byte) -23, var47);
                }
                if ((arg2.field8504 || class778.field10685) && arg9 != -1 && arg2.field8492.length > arg9) {
                    int var58 = arg2.field8492[arg9];
                    var49 = arg2.field8494[arg13];
                    int var59 = var58 >>> 16;
                    var51 = var57 == var59 ? var50 : arg8.method648((byte) 38, var59);
                    var48 = var58 & 0xFFFF;
                    if (var51 != null) {
                        var30 |= var51.method2303(-1, var48);
                        var29 |= var51.method2304(-755, var48);
                        var31 |= var51.method2300((byte) -115, var48);
                    }
                }
            }
            if (var30) {
                var22 |= 0x80;
            }
            if (var29) {
                var22 |= 0x100;
            }
            if (var31) {
                var22 |= 0x400;
            }
        }
        class652 var60 = class670.field9316;
        class496 var61;
        synchronized (class670.field9316) {
            var61 = (class496) class670.field9316.method3742((byte) 67, var23);
        }
        class539 var62 = null;
        if (this.field2937 != -1) {
            var62 = arg1.method1719(this.field2937, 32);
        }
        if (var61 == null || arg6.method512(var61.method68(), var22) != 0) {
            if (var61 != null) {
                var22 = arg6.method542(var22, var61.method68());
            }
            boolean var64 = false;
            int var65 = 0;
            while (true) {
                if (var25.length <= var65) {
                    if (var64) {
                        if (this.field2939 != -1L) {
                            class652 var88 = class670.field9316;
                            synchronized (class670.field9316) {
                                var61 = (class496) class670.field9316.method3742((byte) 67, this.field2939);
                            }
                        }
                        if (var61 == null || arg6.method512(var61.method68(), var22) != 0) {
                            return null;
                        }
                    } else {
                        class100[] var69 = new class100[var25.length];
                        for (int var70 = 0; var70 < var25.length; var70++) {
                            int var71 = var25[var70];
                            class148 var72 = null;
                            boolean var73 = var70 == 5 && var26 || var70 == 3 && var27;
                            if ((var71 & 0x40000000) != 0) {
                                if (!var73 && this.field2933 != null && this.field2933[var70] != null) {
                                    var72 = this.field2933[var70];
                                }
                                class100 var75 = arg18.method1681(var71 & 0x3FFFFFFF, 127).method3888((byte) 71, this.field2941, var72);
                                if (var75 != null) {
                                    var69[var70] = var75;
                                }
                            } else if ((var71 & Integer.MIN_VALUE) != 0) {
                                class100 var74 = arg15.method1226(20755, var71 & 0x3FFFFFFF).method957((byte) -49);
                                if (var74 != null) {
                                    var69[var70] = var74;
                                }
                            }
                        }
                        if (var62 != null && var62.field7785 != null) {
                            for (int var76 = 0; var76 < var62.field7785.length; var76++) {
                                if (var69[var76] != null) {
                                    int var77 = 0;
                                    int var78 = 0;
                                    int var79 = 0;
                                    int var80 = 0;
                                    int var81 = 0;
                                    int var82 = 0;
                                    if (var62.field7785[var76] != null) {
                                        var78 = var62.field7785[var76][1];
                                        var77 = var62.field7785[var76][0];
                                        var80 = var62.field7785[var76][3] << 3;
                                        var81 = var62.field7785[var76][4] << 3;
                                        var82 = var62.field7785[var76][5] << 3;
                                        var79 = var62.field7785[var76][2];
                                    }
                                    if (var80 != 0 || var81 != 0 || var82 != 0) {
                                        var69[var76].method719(0, var81, var82, var80);
                                    }
                                    if (var77 != 0 || var78 != 0 || var79 != 0) {
                                        var69[var76].method722((byte) -105, var79, var78, var77);
                                    }
                                }
                            }
                        }
                        int var83 = var22 | 0x4000;
                        class100 var84 = new class100(var69, var69.length);
                        var61 = arg6.method480(var84, var83, class252.field3716, 64, 850);
                        for (int var85 = 0; var85 < 5; var85++) {
                            for (int var86 = 0; var86 < class668.field9301.length; var86++) {
                                if (this.field2930[var85] < class668.field9301[var86][var85].length) {
                                    var61.method91(class8.field78[var86][var85], class668.field9301[var86][var85][this.field2930[var85]]);
                                }
                            }
                        }
                        if (arg11) {
                            var61.method111(var22);
                            class652 var87 = class670.field9316;
                            synchronized (class670.field9316) {
                                class670.field9316.method3739(var23, (byte) 48, var61);
                            }
                            this.field2939 = var23;
                        }
                    }
                    break;
                }
                int var66 = var25[var65];
                class148 var67 = null;
                boolean var68 = var65 == 5 && var26 || var65 == 3 && var27;
                if ((var66 & 0x40000000) != 0) {
                    if (!var68 && this.field2933 != null && this.field2933[var65] != null) {
                        var67 = this.field2933[var65];
                    }
                    if (!arg18.method1681(var66 & 0x3FFFFFFF, 119).method3893(this.field2941, -1, var67)) {
                        var64 = true;
                    }
                } else if ((Integer.MIN_VALUE & var66) != 0 && !arg15.method1226(arg16 + 20755, var66 & 0x3FFFFFFF).method963(0)) {
                    var64 = true;
                }
                var65++;
            }
        }
        class496 var89 = var61.method93((byte) 4, var22, true);
        boolean var90 = false;
        if (arg17 != null) {
            for (int var91 = 0; var91 < arg17.length; var91++) {
                if (arg17[var91] != -1) {
                    var90 = true;
                }
            }
        }
        if (!var32 && !var90) {
            return var89;
        }
        class326[] var92 = null;
        if (var62 != null) {
            var92 = var62.method3238(arg6, 14593);
        }
        if (var90 && var92 != null) {
            for (int var93 = 0; var93 < arg17.length; var93++) {
                if (var92[var93] != null) {
                    var89.method105(var92[var93], 0x1 << var93, true);
                }
            }
        }
        int var94 = 0;
        int var95 = 1;
        while (var94 < var33) {
            if (class88.field995[var94] != null) {
                var89.method3015(0, class88.field995[var94], false, arg16 + 51, class541.field7793[var94], null, var95, class569.field8029[var94] - 1, class576.field8123[var94], class235.field3540[var94], class142.field2101[var94]);
            }
            var95 <<= 0x1;
            var94++;
        }
        if (var90) {
            for (int var96 = 0; var96 < arg17.length; var96++) {
                if (arg17[var96] != -1) {
                    int var97 = arg17[var96] - arg3;
                    int var98 = var97 & 0x3FFF;
                    class326 var99 = arg6.method505();
                    var99.method1868(var98);
                    var89.method105(var99, 0x1 << var96, false);
                }
            }
        }
        if (var90 && var92 != null) {
            for (int var100 = 0; var100 < arg17.length; var100++) {
                if (var92[var100] != null) {
                    var89.method105(var92[var100], 0x1 << var100, false);
                }
            }
        }
        if (var45 != null && var50 != null) {
            var89.method3011(false, var50, var43, var46, var42, var48, arg19 - 1, var49, arg20 - 1, var45, arg10.field8509, var51, 124, var44, var47);
        } else if (var45 != null) {
            var89.method3014(var46, var42, arg20 - 1, var43, var44, false, (byte) -109, var45, 0);
        } else if (var50 != null) {
            var89.method3014(var51, var47, arg19 - 1, var48, var49, false, (byte) -109, var50, 0);
        }
        for (int var101 = 0; var101 < var33; var101++) {
            class88.field995[var101] = null;
            class541.field7793[var101] = null;
            class296.field4299[var101] = null;
        }
        return var89;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IILib;IILjv;Lpf;Lha;IIII)Lka;", line = 736)
    public final class496 method1329(int arg0, int arg1, class163 arg2, int arg3, int arg4, class86 arg5, class607 arg6, class65 arg7, int arg8, int arg9, int arg10, int arg11) {
        field2924++;
        int var13 = arg11;
        if (arg6 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            int var21 = arg6.field8492[arg8];
            var13 = arg11 | 0x20;
            Object var22 = null;
            int var23 = var21 >>> 16;
            class369 var24 = arg5.method648((byte) 80, var23);
            int var25 = var21 & 0xFFFF;
            if (var24 != null) {
                var15 |= var24.method2303(arg3 ^ 0x28CF, var25);
                var14 |= var24.method2304(-755, var25);
                var17 |= var24.method2300((byte) 4, var25);
                var16 |= arg6.field8516;
            }
            if ((arg6.field8504 || class778.field10685) && arg0 != -1 && arg6.field8492.length > arg0) {
                int var26 = arg6.field8492[arg0];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class369 var29;
                if (var23 == var27) {
                    var29 = var24;
                } else {
                    var29 = arg5.method648((byte) 64, var28 >>> 16);
                }
                if (var29 != null) {
                    var15 |= var29.method2303(-1, var28);
                    var14 |= var29.method2304(-755, var28);
                    var17 |= var29.method2300((byte) -1, var28);
                }
            }
            if (var15) {
                var13 |= 0x80;
            }
            if (var14) {
                var13 |= 0x100;
            }
            if (var16) {
                var13 |= 0x200;
            }
            if (var17) {
                var13 |= 0x400;
            }
        }
        long var30 = (long) (arg10 << 16) | (long) arg9 << 32 | (long) arg1;
        class652 var32 = class640.field8972;
        class496 var33;
        synchronized (class640.field8972) {
            var33 = (class496) class640.field8972.method3742((byte) 67, var30);
        }
        if (arg3 != -10448) {
            return null;
        }
        if (var33 == null || arg7.method512(var33.method68(), var13) != 0) {
            if (var33 != null) {
                var13 = arg7.method542(var13, var33.method68());
            }
            class100[] var35 = new class100[3];
            int var36 = 0;
            if (!arg2.method1226(20755, arg1).method954(arg3 + 10330) || !arg2.method1226(20755, arg10).method954(-127) || !arg2.method1226(20755, arg9).method954(66)) {
                return null;
            }
            class100 var37 = arg2.method1226(arg3 + 31203, arg1).method961(true);
            if (var37 != null) {
                var35[var36++] = var37;
            }
            class100 var38 = arg2.method1226(20755, arg10).method961(true);
            if (var38 != null) {
                var35[var36++] = var38;
            }
            class100 var39 = arg2.method1226(arg3 ^ 0xFFFF8623, arg9).method961(true);
            if (var39 != null) {
                var35[var36++] = var39;
            }
            int var40 = var13 | 0x4000;
            class100 var41 = new class100(var35, var36);
            var33 = arg7.method480(var41, var40, class252.field3716, 64, 768);
            for (int var42 = 0; var42 < 5; var42++) {
                for (int var43 = 0; var43 < class668.field9301.length; var43++) {
                    if (this.field2930[var42] < class668.field9301[var43][var42].length) {
                        var33.method91(class8.field78[var43][var42], class668.field9301[var43][var42][this.field2930[var42]]);
                    }
                }
            }
            var33.method111(var13);
            class652 var44 = class640.field8972;
            synchronized (class640.field8972) {
                class640.field8972.method3739(var30, (byte) 83, var33);
            }
        }
        if (arg6 == null) {
            return var33;
        } else {
            class496 var45 = var33.method93((byte) 4, var13, true);
            return arg6.method3520(var45, arg11, arg4, arg8, true, arg0);
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(ILnj;II)V", line = 893)
    public final void method1330(int arg0, class257 arg1, int arg2, int arg3) {
        field2934++;
        if (arg2 == arg3) {
            this.field2928[arg0] = 0;
        } else if (arg1.method1681(arg3, arg2 ^ 0xFFFFFFA9) != null) {
            this.field2928[arg0] = class746.method4158(1073741824, arg3);
            this.method1326(arg2 ^ 0x9480D7F7);
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(B)V", line = 917)
    public static void method1331(byte arg0) {
        field2932 = null;
        if (arg0 <= -69) {
            field2943 = null;
            field2926 = null;
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(I[Lfn;IIZ[I[I)V", line = 931)
    public final void method1332(int arg0, class148[] arg1, int arg2, int arg3, boolean arg4, int[] arg5, int[] arg6) {
        if (this.field2937 != arg0) {
            this.field2937 = arg0;
        }
        this.field2941 = arg4;
        field2922++;
        this.field2928 = arg5;
        this.field2933 = arg1;
        this.field2930 = arg6;
        if (arg2 >= -86) {
            field2932 = null;
        }
        this.field2942 = arg3;
        this.method1326(1803495432);
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lib;III)V", line = 953)
    public final void method1333(class163 arg0, int arg1, int arg2, int arg3) {
        field2935++;
        if (arg3 < 49) {
            this.method1325(-74, -108, 24);
        }
        int var5 = class205.field3185[arg1];
        if (arg0.method1226(20755, arg2) != null) {
            this.field2928[var5] = class746.method4158(Integer.MIN_VALUE, arg2);
            this.method1326(1803495432);
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(ILjv;Lbk;Lnj;Lob;Lha;IIBLib;ILpf;)Lka;", line = 972)
    public final class496 method1334(int arg0, class86 arg1, class395 arg2, class257 arg3, class769 arg4, class65 arg5, int arg6, int arg7, byte arg8, class163 arg9, int arg10, class607 arg11) {
        field2923++;
        if (this.field2942 != -1) {
            return arg2.method2439((byte) 73, this.field2942).method836(arg7, arg10, 102, arg6, arg11, null, arg5, arg1, arg0, arg4);
        }
        int var13 = arg6;
        if (arg11 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            Object var21 = null;
            var13 = arg6 | 0x20;
            int var22 = arg11.field8492[arg10];
            int var23 = var22 >>> 16;
            int var24 = var22 & 0xFFFF;
            class369 var25 = arg1.method648((byte) 73, var23);
            if (var25 != null) {
                var15 |= var25.method2303(-1, var24);
                var14 |= var25.method2304(-755, var24);
                var17 |= var25.method2300((byte) -115, var24);
                var16 |= arg11.field8516;
            }
            if ((arg11.field8504 || class778.field10685) && arg0 != -1 && arg0 < arg11.field8492.length) {
                int var26 = arg11.field8492[arg0];
                int var27 = var26 >>> 16;
                class369 var28 = var23 == var27 ? var25 : arg1.method648((byte) 33, var27);
                int var29 = var26 & 0xFFFF;
                if (var28 != null) {
                    var15 |= var28.method2303(-1, var29);
                    var14 |= var28.method2304(-755, var29);
                    var17 |= var28.method2300((byte) 25, var29);
                }
            }
            if (var15) {
                var13 |= 0x80;
            }
            if (var14) {
                var13 |= 0x100;
            }
            if (var16) {
                var13 |= 0x200;
            }
            if (var17) {
                var13 |= 0x400;
            }
        }
        class652 var30 = class640.field8972;
        class496 var31;
        synchronized (class640.field8972) {
            if (arg8 <= 92) {
                this.method1325(-104, 68, -125);
            }
            var31 = (class496) class640.field8972.method3742((byte) 67, this.field2927);
        }
        if (var31 == null || arg5.method512(var31.method68(), var13) != 0) {
            if (var31 != null) {
                var13 = arg5.method542(var13, var31.method68());
            }
            boolean var33 = false;
            for (int var34 = 0; var34 < this.field2928.length; var34++) {
                int var35 = this.field2928[var34];
                class148 var36 = null;
                if ((var35 & 0x40000000) != 0) {
                    if (this.field2933 != null && this.field2933[var34] != null) {
                        var36 = this.field2933[var34];
                    }
                    if (!arg3.method1681(var35 & 0x3FFFFFFF, 115).method3882(this.field2941, false, var36)) {
                        var33 = true;
                    }
                } else if ((var35 & Integer.MIN_VALUE) != 0 && !arg9.method1226(20755, var35 & 0x3FFFFFFF).method954(-114)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class100[] var37 = new class100[this.field2928.length];
            int var38 = 0;
            for (int var39 = 0; var39 < this.field2928.length; var39++) {
                int var40 = this.field2928[var39];
                class148 var41 = null;
                if ((var40 & 0x40000000) != 0) {
                    if (this.field2933 != null && this.field2933[var39] != null) {
                        var41 = this.field2933[var39];
                    }
                    class100 var42 = arg3.method1681(var40 & 0x3FFFFFFF, 98).method3890((byte) 111, this.field2941, var41);
                    if (var42 != null) {
                        var37[var38++] = var42;
                    }
                } else if ((Integer.MIN_VALUE & var40) != 0) {
                    class100 var43 = arg9.method1226(20755, var40 & 0x3FFFFFFF).method961(true);
                    if (var43 != null) {
                        var37[var38++] = var43;
                    }
                }
            }
            int var44 = var13 | 0x4000;
            class100 var45 = new class100(var37, var38);
            var31 = arg5.method480(var45, var44, class252.field3716, 64, 768);
            for (int var46 = 0; var46 < 5; var46++) {
                for (int var47 = 0; var47 < class668.field9301.length; var47++) {
                    if (class668.field9301[var47][var46].length > this.field2930[var46]) {
                        var31.method91(class8.field78[var47][var46], class668.field9301[var47][var46][this.field2930[var46]]);
                    }
                }
            }
            var31.method111(var13);
            class652 var48 = class640.field8972;
            synchronized (class640.field8972) {
                class640.field8972.method3739(this.field2927, (byte) 114, var31);
            }
        }
        if (arg11 == null) {
            return var31;
        } else {
            var31.method93((byte) 4, var13, true);
            return arg11.method3520(var31, arg6, arg7, arg10, true, arg0);
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IZ)V", line = 1192)
    public final void method1335(int arg0, boolean arg1) {
        this.field2941 = arg1;
        field2929++;
        if (arg0 != 0) {
            this.method1325(38, 98, 69);
        }
        this.method1326(1803495432);
    }
}
