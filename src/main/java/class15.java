import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class15 {

    @OriginalMember(owner = "client!wh", name = "w", descriptor = "I")
    public int field263 = -1;

    @OriginalMember(owner = "client!wh", name = "h", descriptor = "I")
    public static int field248 = 1;

    @OriginalMember(owner = "client!wh", name = "k", descriptor = "Lnm;")
    public static class292 field251 = new class292(0, 0);

    @OriginalMember(owner = "client!wh", name = "v", descriptor = "Ltm;")
    public static class112 field262 = new class112("level: ", "Stufe: ", "niveau ", "nível: ");

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "I")
    public static int field241;

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "I")
    public static int field242;

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "I")
    public static int field244;

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "I")
    public static int field246;

    @OriginalMember(owner = "client!wh", name = "i", descriptor = "I")
    public static int field249;

    @OriginalMember(owner = "client!wh", name = "l", descriptor = "I")
    public static int field252;

    @OriginalMember(owner = "client!wh", name = "n", descriptor = "I")
    public static int field254;

    @OriginalMember(owner = "client!wh", name = "o", descriptor = "I")
    private int field255;

    @OriginalMember(owner = "client!wh", name = "r", descriptor = "I")
    public static int field258;

    @OriginalMember(owner = "client!wh", name = "s", descriptor = "I")
    public static int field259;

    @OriginalMember(owner = "client!wh", name = "t", descriptor = "I")
    public static int field260;

    @OriginalMember(owner = "client!wh", name = "u", descriptor = "I")
    public static int field261;

    @OriginalMember(owner = "client!wh", name = "y", descriptor = "I")
    public static int field265;

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "J")
    private long field245;

    @OriginalMember(owner = "client!wh", name = "m", descriptor = "J")
    private long field253;

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "La;")
    public static class420 field247;

    @OriginalMember(owner = "client!wh", name = "q", descriptor = "Z")
    public boolean field257;

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "[I")
    public int[] field243;

    @OriginalMember(owner = "client!wh", name = "p", descriptor = "[I")
    private int[] field256;

    @OriginalMember(owner = "client!wh", name = "x", descriptor = "[I")
    public static int[] field264;

    @OriginalMember(owner = "client!wh", name = "j", descriptor = "[[I")
    private int[][] field250;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)V", line = 5)
    private final void method143(int arg0) {
        field261++;
        this.field245 = -1L;
        if (arg0 >= -10) {
            return;
        }
        long[] var2 = class160.field2303;
        this.field245 = this.field245 >>> 8 ^ var2[(int) ((this.field245 ^ (long) (this.field255 >> 8)) & 0xFFL)];
        this.field245 = this.field245 >>> 8 ^ var2[(int) (((long) this.field255 ^ this.field245) & 0xFFL)];
        for (int var3 = 0; var3 < 12; var3++) {
            this.field245 = this.field245 >>> 8 ^ var2[(int) ((this.field245 ^ (long) (this.field256[var3] >> 24)) & 0xFFL)];
            this.field245 = var2[(int) ((this.field245 ^ (long) (this.field256[var3] >> 16)) & 0xFFL)] ^ this.field245 >>> 8;
            this.field245 = var2[(int) (((long) (this.field256[var3] >> 8) ^ this.field245) & 0xFFL)] ^ this.field245 >>> 8;
            this.field245 = this.field245 >>> 8 ^ var2[(int) (((long) this.field256[var3] ^ this.field245) & 0xFFL)];
        }
        for (int var4 = 0; var4 < 5; var4++) {
            this.field245 = this.field245 >>> 8 ^ var2[(int) ((this.field245 ^ (long) this.field243[var4]) & 0xFFL)];
        }
        this.field245 = this.field245 >>> 8 ^ var2[(int) (((long) (this.field257 ? 1 : 0) ^ this.field245) & 0xFFL)];
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(BILcr;I)V", line = 45)
    public final void method144(byte arg0, int arg1, class195 arg2, int arg3) {
        field241++;
        if (arg0 != -88) {
            this.field250 = null;
        }
        int var5 = class329.field4537[arg1];
        if (this.field256[var5] != 0 && arg2.method1241(-18336, arg3) != null) {
            this.field256[var5] = class366.method2215(arg3, Integer.MIN_VALUE);
            this.method143(-120);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILfh;ILwr;ILp;ILqg;Lcr;Lkm;ILml;)Lab;", line = 69)
    public final class232 method145(int arg0, class311 arg1, int arg2, class41 arg3, int arg4, class157 arg5, int arg6, class372 arg7, class195 arg8, class487 arg9, int arg10, class215 arg11) {
        field254++;
        if (this.field263 != -1) {
            return arg11.method1359(this.field263, true).method779(arg7, arg4, arg0, false, arg1, arg2, arg5, arg6, arg9);
        }
        int var13 = arg2;
        if (arg10 >= -28) {
            this.method148(-101, -22, -19, (class157) null, 87, -76, (class372) null, (class195) null, -117, 13, -16, (class487) null);
        }
        if (arg7 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = true;
            boolean var18 = true;
            Object var19 = null;
            var13 = arg2 | 0x20;
            Object var20 = null;
            int var21 = arg7.field5278[arg4];
            int var22 = var21 >>> 16;
            class13 var23 = arg5.method949(var22, 97);
            int var24 = var21 & 0xFFFF;
            if (var23 != null) {
                var15 |= var23.method114(false, var24);
                var14 |= var23.method111(24279, var24);
                var16 |= arg7.field5262;
            }
            if ((arg7.field5261 || class399.field5582) && arg6 != -1 && arg6 < arg7.field5278.length) {
                int var25 = arg7.field5278[arg6];
                int var26 = var25 >>> 16;
                class13 var27 = var22 == var26 ? var23 : arg5.method949(var26, 52);
                int var28 = var25 & 0xFFFF;
                if (var27 != null) {
                    var15 |= var27.method114(false, var28);
                    var14 |= var27.method111(24279, var28);
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
        }
        class104 var29 = class21.field367;
        class232 var30;
        synchronized (class21.field367) {
            var30 = (class232) class21.field367.method659(this.field245, (byte) -1);
        }
        if (var30 == null || arg9.method1102(var30.method50(), var13) != 0) {
            if (var30 != null) {
                var13 = arg9.method1067(var13, var30.method50());
            }
            boolean var32 = false;
            for (int var33 = 0; var33 < 12; var33++) {
                int var34 = this.field256[var33];
                if ((var34 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var34) != 0 && !arg8.method1241(-18336, var34 & 0x3FFFFFFF).method2281(70)) {
                        var32 = true;
                    }
                } else if (!arg3.method344(var34 & 0x3FFFFFFF, 31757).method996(30857, this.field257)) {
                    var32 = true;
                }
            }
            if (var32) {
                return null;
            }
            class85[] var35 = new class85[12];
            int var36 = 0;
            for (int var37 = 0; var37 < 12; var37++) {
                int var38 = this.field256[var37];
                if ((var38 & 0x40000000) != 0) {
                    class85 var40 = arg3.method344(var38 & 0x3FFFFFFF, 31757).method998(this.field257, (byte) -123);
                    if (var40 != null) {
                        var35[var36++] = var40;
                    }
                } else if ((var38 & Integer.MIN_VALUE) != 0) {
                    class85 var39 = arg8.method1241(-18336, var38 & 0x3FFFFFFF).method2282(-1);
                    if (var39 != null) {
                        var35[var36++] = var39;
                    }
                }
            }
            int var41 = var13 | 0x2000;
            class85 var42 = new class85(var35, var36);
            var30 = arg9.method1088(var42, var41, class317.field4308, 64, 768);
            for (int var43 = 0; var43 < 5; var43++) {
                if (class444.field6137[var43].length > this.field243[var43]) {
                    var30.method24(class282.field3879[var43], class444.field6137[var43][this.field243[var43]]);
                }
                if (this.field243[var43] < class214.field3037[var43].length) {
                    var30.method24(class132.field1856[var43], class214.field3037[var43][this.field243[var43]]);
                }
            }
            var30.method56(var13);
            class104 var44 = class21.field367;
            synchronized (class21.field367) {
                class21.field367.method653(89, this.field245, var30);
            }
        }
        if (arg7 == null) {
            return var30;
        } else {
            var30.method51((byte) 4, var13, true);
            return arg7.method2230(arg4, arg0, arg6, -120, var30, arg2);
        }
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(I)V", line = 256)
    public static void method146(int arg0) {
        field251 = null;
        field264 = null;
        field262 = null;
        field247 = null;
        if (arg0 != 1) {
            field251 = null;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZII[I[IZ)V", line = 275)
    public final void method147(boolean arg0, int arg1, int arg2, int[] arg3, int[] arg4, boolean arg5) {
        field246++;
        if (this.field255 != arg2) {
            this.field250 = null;
            this.field255 = arg2;
        }
        this.field256 = arg3;
        this.field243 = arg4;
        this.field257 = arg5;
        this.field263 = arg1;
        if (arg0) {
            this.method143(-75);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIILp;IILqg;Lcr;IIILkm;)Lab;", line = 304)
    public final class232 method148(int arg0, int arg1, int arg2, class157 arg3, int arg4, int arg5, class372 arg6, class195 arg7, int arg8, int arg9, int arg10, class487 arg11) {
        field244++;
        int var13 = arg10;
        if (arg6 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = true;
            boolean var18 = true;
            Object var19 = null;
            Object var20 = null;
            int var21 = arg6.field5278[arg9];
            var13 = arg10 | 0x20;
            int var22 = var21 >>> 16;
            int var23 = var21 & 0xFFFF;
            class13 var24 = arg3.method949(var22, 78);
            if (var24 != null) {
                var15 |= var24.method114(false, var23);
                var14 |= var24.method111(24279, var23);
                var16 |= arg6.field5262;
            }
            if ((arg6.field5261 || class399.field5582) && arg0 != -1 && arg6.field5278.length > arg0) {
                int var25 = arg6.field5278[arg0];
                int var26 = var25 >>> 16;
                int var27 = var25 & 0xFFFF;
                class13 var28;
                if (var22 == var26) {
                    var28 = var24;
                } else {
                    var28 = arg3.method949(var27 >>> 16, 95);
                }
                if (var28 != null) {
                    var15 |= var28.method114(false, var27);
                    var14 |= var28.method111(24279, var27);
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
        }
        long var29 = (long) arg8 | (long) arg5 << 32 | (long) (arg4 << 16);
        if (arg2 <= 96) {
            this.method144((byte) -102, 93, (class195) null, 76);
        }
        class104 var31 = class21.field367;
        class232 var32;
        synchronized (class21.field367) {
            var32 = (class232) class21.field367.method659(var29, (byte) -1);
        }
        if (var32 == null || arg11.method1102(var32.method50(), var13) != 0) {
            if (var32 != null) {
                var13 = arg11.method1067(var13, var32.method50());
            }
            class85[] var34 = new class85[3];
            int var35 = 0;
            if (!arg7.method1241(-18336, arg8).method2281(70) || !arg7.method1241(-18336, arg4).method2281(70) || !arg7.method1241(-18336, arg5).method2281(70)) {
                return null;
            }
            class85 var36 = arg7.method1241(-18336, arg8).method2282(-1);
            if (var36 != null) {
                var34[var35++] = var36;
            }
            class85 var37 = arg7.method1241(-18336, arg4).method2282(-1);
            if (var37 != null) {
                var34[var35++] = var37;
            }
            class85 var38 = arg7.method1241(-18336, arg5).method2282(-1);
            if (var38 != null) {
                var34[var35++] = var38;
            }
            class85 var39 = new class85(var34, var35);
            int var40 = var13 | 0x2000;
            var32 = arg11.method1088(var39, var40, class317.field4308, 64, 768);
            for (int var41 = 0; var41 < 5; var41++) {
                if (class444.field6137[var41].length > this.field243[var41]) {
                    var32.method24(class282.field3879[var41], class444.field6137[var41][this.field243[var41]]);
                }
                if (class214.field3037[var41].length > this.field243[var41]) {
                    var32.method24(class132.field1856[var41], class214.field3037[var41][this.field243[var41]]);
                }
            }
            var32.method56(var13);
            class104 var42 = class21.field367;
            synchronized (class21.field367) {
                class21.field367.method653(39, var29, var32);
            }
        }
        if (arg6 == null) {
            return var32;
        } else {
            class232 var43 = var32.method51((byte) 4, var13, true);
            return arg6.method2230(arg9, arg1, arg0, -73, var43, arg10);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(III)V", line = 453)
    public final void method149(int arg0, int arg1, int arg2) {
        field252++;
        this.field243[arg2] = arg1;
        this.method143(-55);
        if (arg0 != 10834) {
            method146(113);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZB)V", line = 468)
    public final void method150(boolean arg0, byte arg1) {
        if (arg1 > 49) {
            this.field257 = arg0;
            field242++;
            this.method143(-57);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IILcr;Lml;Lwr;Lp;II[Lhb;Lqg;ILqg;ILfh;Ldg;ILkm;IZ)Lab;", line = 485)
    public final class232 method151(int arg0, int arg1, class195 arg2, class215 arg3, class41 arg4, class157 arg5, int arg6, int arg7, class60[] arg8, class372 arg9, int arg10, class372 arg11, int arg12, class311 arg13, class477 arg14, int arg15, class487 arg16, int arg17, boolean arg18) {
        field258++;
        if (this.field263 != -1) {
            return arg3.method1359(this.field263, true).method774(arg1, arg0, arg17, arg15, arg8, arg13, arg5, arg6, -121, arg14, arg7, arg11, arg10, arg16, arg9);
        }
        int var20 = arg1;
        long var21 = this.field245;
        int[] var23 = this.field256;
        if (arg9 != null && (arg9.field5276 >= 0 || arg9.field5256 >= 0)) {
            var23 = new int[12];
            for (int var24 = 0; var24 < 12; var24++) {
                var23[var24] = this.field256[var24];
            }
            if (arg9.field5276 >= 0) {
                if (arg9.field5276 == 65535) {
                    var23[5] = 0;
                    var21 ^= 0xFFFFFFFF00000000L;
                } else {
                    var23[5] = class366.method2215(1073741824, arg9.field5276);
                    var21 ^= (long) var23[5] << 32;
                }
            }
            if (arg9.field5256 >= 0) {
                if (arg9.field5256 == 65535) {
                    var23[3] = 0;
                    var21 ^= 0xFFFFFFFFL;
                } else {
                    var23[3] = class366.method2215(1073741824, arg9.field5256);
                    var21 ^= (long) var23[3];
                }
            }
        }
        boolean var25 = false;
        boolean var26 = false;
        boolean var27 = arg9 != null || arg11 != null;
        int var28 = arg8 == null ? 0 : arg8.length;
        for (int var29 = 0; var29 < var28; var29++) {
            class242.field3421[var29] = null;
            if (arg8[var29] != null) {
                class372 var30 = arg5.method950(true, arg8[var29].field941);
                if (var30.field5278 != null) {
                    var27 = true;
                    class266.field3710[var29] = var30;
                    int var31 = arg8[var29].field937;
                    int var32 = arg8[var29].field938;
                    int var33 = var30.field5278[var31];
                    class242.field3421[var29] = arg5.method949(var33 >>> 16, class382.method2292(arg12, 1073741719));
                    int var34 = var33 & 0xFFFF;
                    class456.field6320[var29] = var34;
                    if (class242.field3421[var29] != null) {
                        var26 |= class242.field3421[var29].method114(false, var34);
                        var25 |= class242.field3421[var29].method111(24279, var34);
                    }
                    if ((var30.field5261 || class399.field5582) && var32 != -1 && var30.field5278.length > var32) {
                        class99.field1401[var29] = var30.field5283[var31];
                        class356.field4979[var29] = arg8[var29].field939;
                        int var35 = var30.field5278[var32];
                        class399.field5583[var29] = arg5.method949(var35 >>> 16, 103);
                        int var36 = var35 & 0xFFFF;
                        class444.field6138[var29] = var36;
                        if (class399.field5583[var29] != null) {
                            var26 |= class399.field5583[var29].method114(false, var36);
                            var25 |= class399.field5583[var29].method111(24279, var36);
                        }
                    } else {
                        class99.field1401[var29] = 0;
                        class356.field4979[var29] = 0;
                        class399.field5583[var29] = null;
                        class444.field6138[var29] = -1;
                    }
                }
            }
        }
        int var37 = -1;
        if (arg12 != 1073741823) {
            this.field243 = null;
        }
        int var38 = -1;
        int var39 = 0;
        class13 var40 = null;
        class13 var41 = null;
        int var42 = -1;
        int var43 = -1;
        int var44 = 0;
        class13 var45 = null;
        class13 var46 = null;
        if (var27) {
            var20 = arg1 | 0x20;
            if (arg9 != null) {
                int var47 = arg9.field5278[arg15];
                int var48 = var47 >>> 16;
                var40 = arg5.method949(var48, 73);
                var37 = var47 & 0xFFFF;
                if (var40 != null) {
                    var26 |= var40.method114(false, var37);
                    var25 |= var40.method111(24279, var37);
                }
                if ((arg9.field5261 || class399.field5582) && arg6 != -1 && arg9.field5278.length > arg6) {
                    int var49 = arg9.field5278[arg6];
                    var39 = arg9.field5283[arg15];
                    int var50 = var49 >>> 16;
                    var41 = var48 == var50 ? var40 : arg5.method949(var50, 80);
                    var38 = var49 & 0xFFFF;
                    if (var41 != null) {
                        var26 |= var41.method114(false, var38);
                        var25 |= var41.method111(arg12 - 1073717544, var38);
                    }
                }
            }
            if (arg11 != null) {
                int var51 = arg11.field5278[arg0];
                int var52 = var51 >>> 16;
                var42 = var51 & 0xFFFF;
                var45 = arg5.method949(var52, 64);
                if (var45 != null) {
                    var26 |= var45.method114(false, var42);
                    var25 |= var45.method111(24279, var42);
                }
                if ((arg11.field5261 || class399.field5582) && arg10 != -1 && arg10 < arg11.field5278.length) {
                    int var53 = arg11.field5278[arg10];
                    var44 = arg11.field5283[arg0];
                    int var54 = var53 >>> 16;
                    var43 = var53 & 0xFFFF;
                    var46 = var52 == var54 ? var45 : arg5.method949(var54, arg12 ^ 0x3FFFFFAD);
                    if (var46 != null) {
                        var26 |= var46.method114(false, var43);
                        var25 |= var46.method111(24279, var43);
                    }
                }
            }
            if (var26) {
                var20 |= 0x80;
            }
            if (var25) {
                var20 |= 0x100;
            }
        }
        class104 var55 = class267.field3716;
        class232 var56;
        synchronized (class267.field3716) {
            var56 = (class232) class267.field3716.method659(var21, (byte) -1);
        }
        class318 var57 = null;
        if (this.field255 != -1) {
            var57 = arg14.method2806(this.field255, -79);
        }
        if (var56 == null || arg16.method1102(var56.method50(), var20) != 0 || var57 != null && var57.field4356 != null && this.field250 == null) {
            if (var56 != null) {
                var20 = arg16.method1067(var20, var56.method50());
            }
            boolean var59 = false;
            int var60 = 0;
            while (true) {
                if (var60 >= 12) {
                    if (var59) {
                        if (this.field253 != -1L) {
                            class104 var62 = class267.field3716;
                            synchronized (class267.field3716) {
                                var56 = (class232) class267.field3716.method659(this.field253, (byte) -1);
                            }
                        }
                        if (var56 == null || arg16.method1102(var56.method50(), var20) != 0 || var57 != null && var57.field4356 != null && this.field250 == null) {
                            return null;
                        }
                    } else {
                        class85[] var63 = new class85[12];
                        for (int var64 = 0; var64 < 12; var64++) {
                            int var65 = var23[var64];
                            if ((var65 & 0x40000000) != 0) {
                                class85 var67 = arg4.method344(var65 & 0x3FFFFFFF, arg12 - 1073710066).method1009(this.field257, arg12 - 1073741921);
                                if (var67 != null) {
                                    var63[var64] = var67;
                                }
                            } else if ((var65 & Integer.MIN_VALUE) != 0) {
                                class85 var66 = arg2.method1241(-18336, var65 & 0x3FFFFFFF).method2287((byte) -66);
                                if (var66 != null) {
                                    var63[var64] = var66;
                                }
                            }
                        }
                        if (var57 != null && var57.field4356 != null) {
                            for (int var68 = 0; var68 < var57.field4356.length; var68++) {
                                if (var57.field4356[var68] != null && var63[var68] != null) {
                                    int var69 = var57.field4356[var68][0];
                                    int var70 = var57.field4356[var68][1];
                                    int var71 = var57.field4356[var68][2];
                                    int var72 = var57.field4356[var68][3] << 3;
                                    int var73 = var57.field4356[var68][4] << 3;
                                    int var74 = var57.field4356[var68][5] << 3;
                                    if (this.field250 == null) {
                                        this.field250 = new int[var57.field4356.length][];
                                    }
                                    if (this.field250[var68] == null) {
                                        int[] var75 = this.field250[var68] = new int[15];
                                        if (var72 == 0 && var73 == 0 && var74 == 0) {
                                            var75[0] = var75[4] = var75[8] = 32768;
                                            var75[12] = -var69;
                                            var75[13] = -var70;
                                            var75[14] = -var71;
                                        } else {
                                            int var76 = class432.field5957[var72];
                                            int var77 = class432.field5955[var72];
                                            int var78 = class432.field5957[var73];
                                            int var79 = class432.field5955[var73];
                                            int var80 = class432.field5957[var74];
                                            int var81 = class432.field5955[var74];
                                            int var82 = var77 * var80 + 16384 >> 15;
                                            int var83 = var77 * var81 + 16384 >> 15;
                                            var75[6] = -var79 * var80 + var78 * var83 + 16384 >> 15;
                                            var75[4] = var76 * var80 + 16384 >> 15;
                                            var75[8] = var76 * var78 + 16384 >> 15;
                                            var75[5] = -var77;
                                            var75[0] = var78 * var80 + var79 * var83 + 16384 >> 15;
                                            var75[2] = var76 * var79 + 16384 >> 15;
                                            var75[3] = var76 * var81 + 16384 >> 15;
                                            var75[1] = var79 * var82 + -var81 * var78 + 16384 >> 15;
                                            var75[7] = var78 * var82 + -var79 * -var81 + 16384 >> 15;
                                            var75[12] = var75[6] * -var71 + var75[0] * -var69 + (var75[3] * -var70) + 16384 >> 15;
                                            var75[13] = var75[1] * -var69 + (var75[4] * -var70) + (var75[7] * -var71 - -16384) >> 15;
                                            var75[14] = var75[2] * -var69 + var75[5] * -var70 + var75[8] * -var71 + 16384 >> 15;
                                        }
                                        var75[10] = var70;
                                        var75[9] = var69;
                                        var75[11] = var71;
                                    }
                                    if (var72 != 0 || var73 != 0 || var74 != 0) {
                                        var63[var68].method585(var73, false, var72, var74);
                                    }
                                    if (var69 != 0 || var70 != 0 || var71 != 0) {
                                        var63[var68].method591(var69, (byte) -53, var71, var70);
                                    }
                                }
                            }
                        }
                        class85 var84 = new class85(var63, var63.length);
                        int var85 = var20 | 0x2000;
                        var56 = arg16.method1088(var84, var85, class317.field4308, 64, 850);
                        for (int var86 = 0; var86 < 5; var86++) {
                            if (this.field243[var86] < class444.field6137[var86].length) {
                                var56.method24(class282.field3879[var86], class444.field6137[var86][this.field243[var86]]);
                            }
                            if (class214.field3037[var86].length > this.field243[var86]) {
                                var56.method24(class132.field1856[var86], class214.field3037[var86][this.field243[var86]]);
                            }
                        }
                        if (arg18) {
                            var56.method56(var20);
                            class104 var87 = class267.field3716;
                            synchronized (class267.field3716) {
                                class267.field3716.method653(arg12 - 1073741701, var21, var56);
                            }
                            this.field253 = var21;
                        }
                    }
                    break;
                }
                int var61 = var23[var60];
                if ((var61 & 0x40000000) == 0) {
                    if ((var61 & Integer.MIN_VALUE) != 0 && !arg2.method1241(arg12 - 1073760159, var61 & 0x3FFFFFFF).method2283((byte) 87)) {
                        var59 = true;
                    }
                } else if (!arg4.method344(var61 & 0x3FFFFFFF, 31757).method999(30849, this.field257)) {
                    var59 = true;
                }
                var60++;
            }
        }
        class232 var88 = var56.method51((byte) 4, var20, true);
        if (!var27) {
            return var88;
        }
        int var89 = 0;
        int var90 = 1;
        while (var89 < var28) {
            if (class242.field3421[var89] != null) {
                var88.method1461(class242.field3421[var89], class444.field6138[var89], var90, class399.field5583[var89], class356.field4979[var89] - 1, this.field250 == null ? null : this.field250[var89], class99.field1401[var89], 0, class456.field6320[var89], false, 0);
            }
            var89++;
            var90 <<= 0x1;
        }
        if (var40 != null && var45 != null) {
            var88.method1459(arg9.field5282, var45, arg17 - 1, arg7 - 1, var44, (byte) 68, var43, var40, var39, var46, var37, var38, var41, false, var42);
        } else if (var40 != null) {
            var88.method1457(var40, var37, var38, false, var39, var41, arg17 - 1, (byte) -91, 0);
        } else if (var45 != null) {
            var88.method1457(var45, var42, var43, false, var44, var46, arg7 - 1, (byte) -91, 0);
        }
        for (int var91 = 0; var91 < var28; var91++) {
            class242.field3421[var91] = null;
            class399.field5583[var91] = null;
            class266.field3710[var91] = null;
        }
        return var88;
    }

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "(I)V", line = 977)
    public static final void method152(int arg0) {
        field265++;
        class8.field141 = -1;
        if (arg0 <= 105) {
            method152(23);
        }
        class132.field1861 = null;
    }
}
