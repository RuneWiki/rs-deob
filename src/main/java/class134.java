import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class134 extends class11 {

    @OriginalMember(owner = "client!jk", name = "A", descriptor = "Lnv;")
    private class44 field1986 = new class44();

    @OriginalMember(owner = "client!jk", name = "x", descriptor = "Ltt;")
    public class249 field1983;

    @OriginalMember(owner = "client!jk", name = "w", descriptor = "[[I")
    private int[][] field1982;

    @OriginalMember(owner = "client!jk", name = "D", descriptor = "I")
    private int field1988;

    @OriginalMember(owner = "client!jk", name = "W", descriptor = "[[F")
    private float[][] field2007;

    @OriginalMember(owner = "client!jk", name = "T", descriptor = "[[F")
    private float[][] field2004;

    @OriginalMember(owner = "client!jk", name = "l", descriptor = "[[S")
    public short[][] field1971;

    @OriginalMember(owner = "client!jk", name = "M", descriptor = "[[[I")
    private int[][][] field1997;

    @OriginalMember(owner = "client!jk", name = "y", descriptor = "[[[I")
    private int[][][] field1984;

    @OriginalMember(owner = "client!jk", name = "u", descriptor = "[[[Lgh;")
    private class57[][][] field1980;

    @OriginalMember(owner = "client!jk", name = "m", descriptor = "[[[I")
    public int[][][] field1972;

    @OriginalMember(owner = "client!jk", name = "cb", descriptor = "[[B")
    private byte[][] field2013;

    @OriginalMember(owner = "client!jk", name = "i", descriptor = "[[[I")
    private int[][][] field1968;

    @OriginalMember(owner = "client!jk", name = "h", descriptor = "[[[I")
    public int[][][] field1967;

    @OriginalMember(owner = "client!jk", name = "z", descriptor = "[[B")
    private byte[][] field1985;

    @OriginalMember(owner = "client!jk", name = "P", descriptor = "I")
    public int field2000;

    @OriginalMember(owner = "client!jk", name = "s", descriptor = "I")
    private int field1978;

    @OriginalMember(owner = "client!jk", name = "S", descriptor = "[[F")
    private float[][] field2003;

    @OriginalMember(owner = "client!jk", name = "fb", descriptor = "Lvg;")
    private class56 field2016;

    @OriginalMember(owner = "client!jk", name = "E", descriptor = "Lhm;")
    private class383 field1989;

    @OriginalMember(owner = "client!jk", name = "F", descriptor = "Z")
    public static boolean field1990;

    @OriginalMember(owner = "client!jk", name = "R", descriptor = "[[Z")
    public static boolean[][] field2002;

    @OriginalMember(owner = "client!jk", name = "Z", descriptor = "I")
    public static int field2010;

    @OriginalMember(owner = "client!jk", name = "j", descriptor = "I")
    public static int field1969;

    @OriginalMember(owner = "client!jk", name = "k", descriptor = "I")
    public static int field1970;

    @OriginalMember(owner = "client!jk", name = "n", descriptor = "I")
    private int field1973;

    @OriginalMember(owner = "client!jk", name = "o", descriptor = "I")
    public static int field1974;

    @OriginalMember(owner = "client!jk", name = "p", descriptor = "I")
    public static int field1975;

    @OriginalMember(owner = "client!jk", name = "q", descriptor = "I")
    private int field1976;

    @OriginalMember(owner = "client!jk", name = "r", descriptor = "I")
    public static int field1977;

    @OriginalMember(owner = "client!jk", name = "t", descriptor = "I")
    public static int field1979;

    @OriginalMember(owner = "client!jk", name = "v", descriptor = "I")
    public static int field1981;

    @OriginalMember(owner = "client!jk", name = "B", descriptor = "I")
    public static int field1987;

    @OriginalMember(owner = "client!jk", name = "G", descriptor = "I")
    public static int field1991;

    @OriginalMember(owner = "client!jk", name = "I", descriptor = "I")
    public static int field1993;

    @OriginalMember(owner = "client!jk", name = "K", descriptor = "I")
    public static int field1995;

    @OriginalMember(owner = "client!jk", name = "L", descriptor = "I")
    public static int field1996;

    @OriginalMember(owner = "client!jk", name = "N", descriptor = "I")
    public static int field1998;

    @OriginalMember(owner = "client!jk", name = "O", descriptor = "I")
    public static int field1999;

    @OriginalMember(owner = "client!jk", name = "Q", descriptor = "I")
    public static int field2001;

    @OriginalMember(owner = "client!jk", name = "U", descriptor = "I")
    public static int field2005;

    @OriginalMember(owner = "client!jk", name = "X", descriptor = "I")
    private int field2008;

    @OriginalMember(owner = "client!jk", name = "bb", descriptor = "I")
    public static int field2012;

    @OriginalMember(owner = "client!jk", name = "gb", descriptor = "I")
    private int field2017;

    @OriginalMember(owner = "client!jk", name = "ib", descriptor = "I")
    public static int field2019;

    @OriginalMember(owner = "client!jk", name = "eb", descriptor = "Lql;")
    private class121 field2015;

    @OriginalMember(owner = "client!jk", name = "V", descriptor = "Lpp;")
    public class387 field2006;

    @OriginalMember(owner = "client!jk", name = "ab", descriptor = "Lpp;")
    public class387 field2011;

    @OriginalMember(owner = "client!jk", name = "db", descriptor = "Lpp;")
    private class387 field2014;

    @OriginalMember(owner = "client!jk", name = "hb", descriptor = "Lpp;")
    public class387 field2018;

    @OriginalMember(owner = "client!jk", name = "H", descriptor = "Lum;")
    public static class83 field1992;

    @OriginalMember(owner = "client!jk", name = "Y", descriptor = "[Lgh;")
    private class57[] field2009;

    @OriginalMember(owner = "client!jk", name = "J", descriptor = "[[[I")
    private int[][][] field1994;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(B)V")
    public static void method979(byte arg0) {
        if (arg0 == -10) {
            field1992 = null;
            field2002 = null;
        }
    }

    @OriginalMember(owner = "client!jk", name = "ba", descriptor = "(Li;IIIIZ)V")
    public final void method55(class200 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field1991;
        if (this.field1989 != null && arg0 != null) {
            int var7 = -(this.field1983.field3958 * arg2 >> 8) + arg1 >> this.field1983.field3929;
            int var8 = -(this.field1983.field3968 * arg2 >> 8) + arg3 >> this.field1983.field3929;
            this.field1989.method2441(var8, -1, var7, arg0);
        }
    }

    @OriginalMember(owner = "client!jk", name = "OA", descriptor = "(IILi;)Li;")
    public final class200 method54(int arg0, int arg1, class200 arg2) {
        ++field2001;
        if ((1 & this.field1985[arg0][arg1]) == 0) {
            return null;
        } else {
            int var4 = super.field127 >> this.field1983.field3929;
            class355 var5 = (class355) arg2;
            class355 var6;
            if (var5 != null && var5.method2263(var4, var4, true)) {
                var6 = var5;
                var5.method2269((byte) 35);
            } else {
                var6 = new class355(this.field1983, var4, var4);
            }
            var6.method2266(var4, false, var4, 0, 0);
            this.method982(arg0, var6, true, arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Li;IIIIZ)Z")
    public final boolean method66(class200 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field2019;
        if (this.field1989 != null && arg0 != null) {
            int var7 = -(this.field1983.field3958 * arg2 >> 8) + arg1 >> this.field1983.field3929;
            int var8 = -(this.field1983.field3968 * arg2 >> 8) + arg3 >> this.field1983.field3929;
            return this.field1989.method2436(-21986, var8, var7, arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jk", name = "H", descriptor = "(Li;IIIIZ)V")
    public final void method61(class200 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field1996;
        if (this.field1989 != null && arg0 != null) {
            int var7 = arg1 - (this.field1983.field3958 * arg2 >> 8) >> this.field1983.field3929;
            int var8 = -(this.field1983.field3968 * arg2 >> 8) + arg3 >> this.field1983.field3929;
            this.field1989.method2433(arg0, (byte) 68, var8, var7);
        }
    }

    @OriginalMember(owner = "client!jk", name = "ca", descriptor = "(II)I")
    public final int method68(int arg0, int arg1) {
        ++field1981;
        int var3 = arg0 >> super.field123;
        int var4 = arg1 >> super.field123;
        if (var3 >= 0 && var4 >= 0 && var3 <= super.field124 - 1 && var4 <= super.field122 + -1) {
            int var5 = arg0 & super.field127 + -1;
            int var6 = arg1 & super.field127 + -1;
            int var7 = (-var5 + super.field127) * this.field1982[var3][var4] + this.field1982[var3 + 1][var4] * var5 >> super.field123;
            int var8 = (super.field127 - var5) * this.field1982[var3][var4 - -1] + this.field1982[var3 + 1][var4 + 1] * var5 >> super.field123;
            return (super.field127 - var6) * var7 + var6 * var8 >> super.field123;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(III[[ZZ)V")
    public final void method67(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        this.method981(arg1, -1, arg0, 112, arg2, arg3, arg4);
        ++field1977;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(II)V")
    public final void method69(int arg0, int arg1) {
        ++field1995;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIILmn;I)V")
    public static final void method980(int arg0, int arg1, int arg2, class43 arg3, int arg4) {
        ++field2012;
        if (arg1 != 0) {
            method980(35, 109, -120, (class43) null, -72);
        }
        long var5 = (long) (arg4 | arg2 << 28 | arg0 << 14);
        class192 var7 = (class192) class249.field3827.method358((byte) 127, var5);
        if (var7 == null) {
            class192 var8 = new class192();
            class249.field3827.method357(var8, 1, var5);
            var8.field2952.method292((byte) 121, arg3);
        } else {
            class221 var9 = class300.field4608.method2088(arg3.field679, 118);
            int var10 = var9.field3365;
            if (var9.field3374 == 1) {
                var10 = (arg3.field680 + 1) * var10;
            }
            for (class43 var11 = (class43) var7.field2952.method295((byte) -77); var11 != null; var11 = (class43) var7.field2952.method296(true)) {
                class221 var12 = class300.field4608.method2088(var11.field679, arg1 + 118);
                int var13 = var12.field3365;
                if (~var12.field3374 == -2) {
                    var13 = (var11.field680 + 1) * var13;
                }
                if (~var10 < ~var13) {
                    class536.method3153(arg3, -43, var11);
                    return;
                }
            }
            var7.field2952.method292((byte) 121, arg3);
        }
    }

    @OriginalMember(owner = "client!jk", name = "aa", descriptor = "()V")
    public final void method64() {
        ++field1970;
        if (~this.field2008 >= -1) {
            this.field1989 = null;
        } else {
            byte[][] var1 = new byte[super.field124 + 1][super.field122 + 1];
            for (int var2 = 1; var2 < super.field124; ++var2) {
                for (int var103 = 1; super.field122 > var103; ++var103) {
                    var1[var2][var103] = (byte) ((this.field2013[var2][var103 + -1] >> 2) + (this.field2013[var2][var103] >> 1) + (this.field2013[var2 + -1][var103] >> 2) + (this.field2013[var2][var103 + 1] >> 3) + (this.field2013[var2 + 1][var103] >> 3));
                }
            }
            this.field2009 = new class57[this.field2016.method364(0)];
            this.field2016.method361((byte) 114, this.field2009);
            for (int var3 = 0; this.field2009.length > var3; ++var3) {
                this.field2009[var3].method373(this.field2008, 127);
            }
            int var4 = 24;
            if (this.field1994 != null) {
                var4 += 4;
            }
            if ((this.field2000 & 7) != 0) {
                var4 += 12;
            }
            NativeBuffer var5 = this.field1983.field3928.method2920(this.field2008 * var4);
            NativeStream var6 = new NativeStream(var5);
            class57[] var7 = new class57[this.field2008];
            int var8 = class187.method1301(this.field2008 / 4, false);
            if (var8 < 1) {
                var8 = 1;
            }
            class56 var9 = new class56(var8);
            class57[] var10 = new class57[this.field2017];
            for (int var11 = 0; super.field124 > var11; ++var11) {
                for (int var30 = 0; ~var30 > ~super.field122; ++var30) {
                    if (this.field1997[var11][var30] != null) {
                        class57[] var31 = this.field1980[var11][var30];
                        int[] var32 = this.field1972[var11][var30];
                        int[] var33 = this.field1967[var11][var30];
                        int[] var34 = this.field1984[var11][var30];
                        int[] var35 = this.field1997[var11][var30];
                        int[] var36 = this.field1968 != null ? this.field1968[var11][var30] : null;
                        int[] var37 = this.field1994 == null ? null : this.field1994[var11][var30];
                        if (var34 == null) {
                            var34 = var35;
                        }
                        float var38 = this.field2004[var11][var30];
                        float var39 = this.field2007[var11][var30];
                        float var40 = this.field2003[var11][var30];
                        float var41 = this.field2004[var11][var30 + 1];
                        float var42 = this.field2007[var11][var30 + 1];
                        float var43 = this.field2003[var11][var30 + 1];
                        float var44 = this.field2004[var11 - -1][var30 + 1];
                        float var45 = this.field2007[var11 - -1][var30 + 1];
                        float var46 = this.field2003[var11 + 1][var30 + 1];
                        float var47 = this.field2004[var11 - -1][var30];
                        float var48 = this.field2007[var11 + 1][var30];
                        float var49 = this.field2003[var11 - -1][var30];
                        int var50 = var1[var11][var30] & 255;
                        int var51 = 255 & var1[var11][var30 - -1];
                        int var52 = var1[var11 - -1][var30 + 1] & 255;
                        int var53 = 255 & var1[var11 + 1][var30];
                        int var54 = 0;
                        label341: for (int var55 = 0; ~var55 > ~var35.length; ++var55) {
                            class57 var101 = var31[var55];
                            for (int var102 = 0; ~var54 < ~var102; ++var102) {
                                if (var10[var102] == var101) {
                                    continue label341;
                                }
                            }
                            var10[var54++] = var101;
                        }
                        short[] var56 = this.field1971[super.field124 * var30 + var11] = new short[var35.length];
                        for (int var57 = 0; ~var35.length < ~var57; ++var57) {
                            int var58 = (var11 << super.field123) - -var32[var57];
                            int var59 = (var30 << super.field123) - -var33[var57];
                            int var60 = var58 >> this.field1988;
                            int var61 = var59 >> this.field1988;
                            int var62 = var35[var57];
                            int var63 = var34[var57];
                            int var64 = var36 == null ? 0 : var36[var57];
                            long var65 = (long) (var60 << 16) | (long) var63 << 48 | (long) var62 << 32 | (long) var61;
                            int var67 = var32[var57];
                            int var68 = var33[var57];
                            byte var69 = 74;
                            int var70 = 0;
                            float var71 = 1.0F;
                            float var72;
                            float var73;
                            int var74;
                            float var75;
                            if (~var67 == -1 && ~var68 == -1) {
                                var72 = var39;
                                var73 = var40;
                                var74 = var69 - var50;
                                var75 = var38;
                            } else if (~var67 == -1 && super.field127 == var68) {
                                var74 = var69 - var51;
                                var75 = var41;
                                var73 = var43;
                                var72 = var42;
                            } else if (~super.field127 == ~var67 && ~super.field127 == ~var68) {
                                var73 = var46;
                                var72 = var45;
                                var75 = var44;
                                var74 = var69 - var52;
                            } else if (~super.field127 == ~var67 && ~var68 == -1) {
                                var72 = var48;
                                var74 = var69 - var53;
                                var73 = var49;
                                var75 = var47;
                            } else {
                                float var76 = (float) var67 / (float) super.field127;
                                float var77 = (float) var68 / (float) super.field127;
                                float var78 = (var47 - var38) * var76 + var38;
                                float var79 = (-var39 + var48) * var76 + var39;
                                float var80 = (-var40 + var49) * var76 + var40;
                                float var81 = (-var41 + var44) * var76 + var41;
                                float var82 = (var45 - var42) * var76 + var42;
                                var75 = (-var78 + var81) * var77 + var78;
                                float var83 = (-var43 + var46) * var76 + var43;
                                var72 = (-var79 + var82) * var77 + var79;
                                var73 = (var83 - var80) * var77 + var80;
                                int var84 = var50 - -((var53 - var50) * var67 >> super.field123);
                                int var85 = ((-var51 + var52) * var67 >> super.field123) + var51;
                                var74 = var69 - (((-var84 + var85) * var68 >> super.field123) + var84);
                            }
                            if (~var62 != 0) {
                                int var86 = (127 & var62) * var74 >> 7;
                                if (~var86 > -3) {
                                    var86 = 2;
                                } else if (~var86 < -127) {
                                    var86 = 126;
                                }
                                if ((this.field2000 & 7) == 0) {
                                    float var87 = this.field1983.field3986[2] * var73 + this.field1983.field3986[1] * var72 + this.field1983.field3986[0] * var75;
                                    var71 = this.field1983.field3965 + (!(var87 > 0.0F) ? this.field1983.field4017 : this.field1983.field3983) * var87;
                                }
                                var70 = class203.field3141[var86 | var62 & 65408];
                            }
                            class130 var88 = null;
                            if (~(this.field1978 + -1 & var58) == -1 && ~(var59 & this.field1978 + -1) == -1) {
                                var88 = var9.method358((byte) -118, var65);
                            }
                            int var99;
                            if (var88 == null) {
                                int var90;
                                if (~var62 != ~var63) {
                                    int var89 = (127 & var63) * var74 >> 7;
                                    if (var89 >= 2) {
                                        if (~var89 < -127) {
                                            var89 = 126;
                                        }
                                    } else {
                                        var89 = 2;
                                    }
                                    var90 = class203.field3141[var63 & 65408 | var89];
                                    if (~(this.field2000 & 7) == -1) {
                                        float var91 = this.field1983.field3986[2] * var73 + this.field1983.field3986[1] * var72 + this.field1983.field3986[0] * var75;
                                        float var92 = (var71 > 0.0F ? this.field1983.field3983 : this.field1983.field4017) * var71 + this.field1983.field3965;
                                        int var93 = 255 & var90 >> 16;
                                        int var94 = 255 & var90 >> 8;
                                        int var95 = 255 & var90;
                                        int var96 = (int) ((float) var93 * var92);
                                        int var97 = (int) ((float) var94 * var92);
                                        if (~var96 <= -1) {
                                            if (var96 > 255) {
                                                var96 = 255;
                                            }
                                        } else {
                                            var96 = 0;
                                        }
                                        if (var97 < 0) {
                                            var97 = 0;
                                        } else if (var97 > 255) {
                                            var97 = 255;
                                        }
                                        int var98 = (int) ((float) var95 * var92);
                                        if (var98 < 0) {
                                            var98 = 0;
                                        } else if (~var98 < -256) {
                                            var98 = 255;
                                        }
                                        var90 = var97 << 8 | var96 << 16 | var98;
                                    }
                                } else {
                                    var90 = var70;
                                }
                                if (this.field1983.field3990) {
                                    var6.method2926((float) var58);
                                    var6.method2926((float) (this.method68(var58, var59) + var64));
                                    var6.method2926((float) var59);
                                    var6.method2923((byte) (var90 >> 16));
                                    var6.method2923((byte) (var90 >> 8));
                                    var6.method2923((byte) var90);
                                    var6.method2923(-1);
                                    var6.method2926((float) var58);
                                    var6.method2926((float) var59);
                                    if (this.field1994 != null) {
                                        var6.method2926((float) (var37 != null ? var37[var57] + -1 : 0));
                                    }
                                    if (~(this.field2000 & 7) != -1) {
                                        var6.method2926(var75);
                                        var6.method2926(var72);
                                        var6.method2926(var73);
                                    }
                                } else {
                                    var6.method2924((float) var58);
                                    var6.method2924((float) (var64 + this.method68(var58, var59)));
                                    var6.method2924((float) var59);
                                    var6.method2923((byte) (var90 >> 16));
                                    var6.method2923((byte) (var90 >> 8));
                                    var6.method2923((byte) var90);
                                    var6.method2923(-1);
                                    var6.method2924((float) var58);
                                    var6.method2924((float) var59);
                                    if (this.field1994 != null) {
                                        var6.method2924((float) (var37 == null ? 0 : var37[var57] + -1));
                                    }
                                    if (~(this.field2000 & 7) != -1) {
                                        var6.method2924(var75);
                                        var6.method2924(var72);
                                        var6.method2924(var73);
                                    }
                                }
                                var99 = this.field1976++;
                                var56[var57] = (short) var99;
                                if (~var62 != 0) {
                                    var7[var99] = var31[var57];
                                }
                                var9.method357(new class483(var56[var57]), 1, var65);
                            } else {
                                var56[var57] = ((class483) var88).field7074;
                                var99 = var56[var57] & 65535;
                                if (~var62 != 0 && var31[var57].field1932 < var7[var99].field1932) {
                                    var7[var99] = var31[var57];
                                }
                            }
                            for (int var100 = 0; ~var100 > ~var54; ++var100) {
                                var10[var100].method374(-257, var71, var74, var70, var99);
                            }
                            ++this.field1973;
                        }
                    }
                }
            }
            for (int var12 = 0; var12 < this.field1976; ++var12) {
                class57 var29 = var7[var12];
                if (var29 != null) {
                    var29.method370(var12, -29219);
                }
            }
            for (int var13 = 0; super.field124 > var13; ++var13) {
                for (int var18 = 0; ~var18 > ~super.field122; ++var18) {
                    short[] var19 = this.field1971[super.field124 * var18 + var13];
                    if (var19 != null) {
                        int var20 = 0;
                        int var21 = 0;
                        while (var19.length > var21) {
                            int var22 = 65535 & var19[var21++];
                            int var23 = 65535 & var19[var21++];
                            int var24 = var19[var21++] & 65535;
                            class57 var25 = var7[var22];
                            class57 var26 = var7[var23];
                            class57 var27 = var7[var24];
                            class57 var28 = null;
                            if (var25 != null) {
                                var25.method369(var13, var20, var18, 42);
                                var28 = var25;
                            }
                            if (var26 != null) {
                                var26.method369(var13, var20, var18, 84);
                                if (var28 == null || ~var28.field1932 < ~var26.field1932) {
                                    var28 = var26;
                                }
                            }
                            if (var27 != null) {
                                var27.method369(var13, var20, var18, -3);
                                if (var28 == null || ~var27.field1932 > ~var28.field1932) {
                                    var28 = var27;
                                }
                            }
                            if (var28 != null) {
                                if (var25 != null) {
                                    var28.method370(var22, -29219);
                                }
                                if (var26 != null) {
                                    var28.method370(var23, -29219);
                                }
                                if (var27 != null) {
                                    var28.method370(var24, -29219);
                                }
                                var28.method369(var13, var20, var18, 35);
                            }
                            ++var20;
                        }
                    }
                }
            }
            var6.method2929();
            this.field2015 = this.field1983.method1768(var4, (byte) -114, var5, false, var6.method2925());
            this.field2018 = new class387(this.field2015, 5126, 3, 0);
            this.field2014 = new class387(this.field2015, 5121, 4, 12);
            byte var14;
            if (this.field1994 != null) {
                this.field2011 = new class387(this.field2015, 5126, 3, 16);
                var14 = 28;
            } else {
                this.field2011 = new class387(this.field2015, 5126, 2, 16);
                var14 = 24;
            }
            if (~(this.field2000 & 7) != -1) {
                this.field2006 = new class387(this.field2015, 5126, 3, var14);
            }
            long[] var15 = new long[this.field2009.length];
            for (int var16 = 0; this.field2009.length > var16; ++var16) {
                class57 var17 = this.field2009[var16];
                var15[var16] = var17.field1932;
                var17.method375(this.field1976, 8);
            }
            class402.method2518(0, var15, this.field2009);
            if (this.field1989 != null) {
                this.field1989.method2435(-15120);
            }
        }
        this.field1972 = this.field1967 = null;
        this.field2004 = this.field2007 = this.field2003 = null;
        this.field2013 = null;
        this.field1997 = null;
        this.field1968 = null;
        this.field1994 = null;
        this.field1984 = null;
        this.field2016 = null;
        this.field1980 = null;
    }

    @OriginalMember(owner = "client!jk", name = "ua", descriptor = "(II)I")
    public final int method56(int arg0, int arg1) {
        ++field1969;
        return this.field1982[arg0][arg1];
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIIII[[ZZ)V")
    private final void method981(int arg0, int arg1, int arg2, int arg3, int arg4, boolean[][] arg5, boolean arg6) {
        ++field1975;
        if (this.field2009 != null) {
            float var8 = this.field1983.field4062;
            float var9 = this.field1983.field4058;
            int var10 = arg4 + 1 + arg4;
            int var11 = var10 * var10;
            if (~var11 < ~this.field1983.field4067.length) {
                this.field1983.field4067 = new int[var11];
            }
            if (~(this.field1973 * 2) < ~this.field1983.field3954.field2973.length) {
                this.field1983.field3954 = new class268(this.field1973 * 2);
            }
            int var12 = -arg4 + arg2;
            int var13 = var12;
            if (var12 < 0) {
                var12 = 0;
            }
            int var14 = arg0 - arg4;
            int var15 = var14;
            if (var14 < 0) {
                var14 = 0;
            }
            int var16 = arg2 + arg4;
            if (~(super.field124 - 1) > ~var16) {
                var16 = super.field124 - 1;
            }
            int var17 = arg0 + arg4;
            if (~(super.field122 + -1) > ~var17) {
                var17 = super.field122 + -1;
            }
            int var18 = 0;
            int[] var19 = this.field1983.field4067;
            for (int var20 = var12; ~var20 >= ~var16; ++var20) {
                boolean[] var26 = arg5[var20 - var13];
                for (int var27 = var14; var27 <= var17; ++var27) {
                    if (var26[-var15 + var27]) {
                        var19[var18++] = super.field124 * var27 - -var20;
                    }
                }
            }
            if (arg1 != -1) {
                this.field1983.method1723(-4, (float) arg1);
                this.field1983.method1730((byte) -56);
            } else {
                this.field1983.method1724(-28440);
            }
            this.field1983.method1708(-8, (7 & this.field2000) != 0);
            for (int var21 = 0; ~var21 > ~this.field2009.length; ++var21) {
                this.field2009[var21].method372(var18, var19, 7);
            }
            if (!this.field1986.method293((byte) 116)) {
                int var22 = this.field1983.field4064;
                int var23 = this.field1983.field3998;
                this.field1983.method534(0, var23, this.field1983.field4000);
                this.field1983.method606(var9, var8 + -4.0F);
                this.field1983.method1708(-8, false);
                this.field1983.method1706(-108, false);
                this.field1983.method1732(128, 9);
                this.field1983.method1725(50, -2);
                this.field1983.method1749(25752, this.field1983.field4054);
                this.field1983.method1741(8448, (byte) -90, 7681);
                this.field1983.method1780(770, 34166, 34176, 0);
                this.field1983.method1778(34167, 770, 1, 0);
                for (class130 var24 = this.field1986.method295((byte) 6); var24 != null; var24 = this.field1986.method296(true)) {
                    class91 var25 = (class91) var24;
                    var25.method779(arg4, (byte) -112, arg2, arg0, arg5);
                }
                this.field1983.method1780(768, 5890, 34176, 0);
                this.field1983.method1778(5890, 770, 1, 0);
                this.field1983.method1749(25752, (class169) null);
                this.field1983.method534(var22, var23, this.field1983.field4000);
            }
            if (this.field1989 != null) {
                this.field1983.method606(var9, var8 - 8.0F);
                this.field1983.method1724(-28440);
                this.field1983.method1748((class387) null, this.field2011, (class387) null, 0, this.field2018);
                this.field1989.method2442(arg4, arg0, -22033, arg5, arg6, arg2);
            }
            this.field1983.method606(var9, var8);
        }
        int var28 = 96 / ((arg3 - 68) / 37);
    }

    @OriginalMember(owner = "client!jk", name = "qa", descriptor = "(III)V")
    public final void method58(int arg0, int arg1, int arg2) {
        ++field1987;
        if (~(this.field2013[arg0][arg1] & 255) > ~arg2) {
            this.field2013[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(Ltt;IIII[[I[[II)V")
    public class134(class249 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7);
        this.field1983 = arg0;
        this.field1982 = arg5;
        this.field1988 = super.field123 + -2;
        this.field2007 = new float[super.field124 + 1][super.field122 + 1];
        this.field2004 = new float[super.field124 + 1][super.field122 + 1];
        this.field1971 = new short[arg3 * arg4][];
        this.field1997 = new int[arg3][arg4][];
        this.field1984 = new int[arg3][arg4][];
        this.field1980 = new class57[arg3][arg4][];
        this.field1972 = new int[arg3][arg4][];
        this.field2013 = new byte[arg3 + 1][arg4 - -1];
        this.field1968 = new int[arg3][arg4][];
        this.field1967 = new int[arg3][arg4][];
        this.field1985 = new byte[arg3][arg4];
        this.field2000 = arg2;
        this.field1978 = 1 << this.field1988;
        this.field2003 = new float[super.field124 + 1][super.field122 - -1];
        for (int var9 = 1; ~super.field122 < ~var9; ++var9) {
            for (int var10 = 1; ~super.field124 < ~var10; ++var10) {
                int var11 = arg6[var10 - -1][var9] + -arg6[var10 + -1][var9];
                int var12 = arg6[var10][var9 + 1] - arg6[var10][var9 + -1];
                float var13 = (float) (1.0D / Math.sqrt((double) (var12 * var12 + arg7 * arg7 * 4 + var11 * var11)));
                this.field2004[var10][var9] = (float) var11 * var13;
                this.field2007[var10][var9] = (float) (-arg7 * 2) * var13;
                this.field2003[var10][var9] = (float) var12 * var13;
            }
        }
        this.field2016 = new class56(128);
        if ((this.field2000 & 16) != 0) {
            this.field1989 = new class383(this.field1983, this);
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method63(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field1979;
        int var18 = arg9.length;
        int[] var19 = new int[var18 * 3];
        int[] var20 = new int[var18 * 3];
        int[] var21 = new int[var18 * 3];
        int[] var22 = new int[var18 * 3];
        int[] var23 = new int[var18 * 3];
        int[] var24 = new int[var18 * 3];
        int[] var25 = arg3 != null ? new int[var18 * 3] : null;
        int[] var26 = arg5 != null ? new int[var18 * 3] : null;
        int var27 = 0;
        for (int var28 = 0; ~var28 > ~var18; ++var28) {
            int var29 = arg6[var28];
            int var30 = arg7[var28];
            int var31 = arg8[var28];
            var19[var27] = arg2[var29];
            var20[var27] = arg4[var29];
            var21[var27] = arg9[var28];
            var23[var27] = arg11[var28];
            var24[var27] = arg12[var28];
            if (arg10 != null) {
                var22[var27] = arg10[var28];
            }
            if (arg3 != null) {
                var25[var27] = arg3[var29];
            }
            if (arg5 != null) {
                var26[var27] = arg5[var29];
            }
            ++var27;
            var19[var27] = arg2[var30];
            var20[var27] = arg4[var30];
            var21[var27] = arg9[var28];
            var23[var27] = arg11[var28];
            var24[var27] = arg12[var28];
            if (arg10 != null) {
                var22[var27] = arg10[var28];
            }
            if (arg3 != null) {
                var25[var27] = arg3[var30];
            }
            if (arg5 != null) {
                var26[var27] = arg5[var30];
            }
            ++var27;
            var19[var27] = arg2[var31];
            var20[var27] = arg4[var31];
            var21[var27] = arg9[var28];
            var23[var27] = arg11[var28];
            var24[var27] = arg12[var28];
            if (arg10 != null) {
                var22[var27] = arg10[var28];
            }
            if (arg3 != null) {
                var25[var27] = arg3[var31];
            }
            if (arg5 != null) {
                var26[var27] = arg5[var31];
            }
            ++var27;
        }
        this.method59(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(ILag;ZI)V")
    private final void method982(int arg0, class355 arg1, boolean arg2, int arg3) {
        ++field2005;
        int[] var5 = this.field1972[arg0][arg3];
        int[] var6 = this.field1967[arg0][arg3];
        int var7 = var5.length;
        if (this.field1983.field4066.length < var7) {
            this.field1983.field4066 = new int[var7];
            this.field1983.field4069 = new int[var7];
        }
        int[] var8 = this.field1983.field4066;
        int[] var9 = this.field1983.field4069;
        for (int var10 = 0; var7 > var10; ++var10) {
            var8[var10] = class307.method2028(255, var5[var10]) >> this.field1983.field3929;
            var9[var10] = class307.method2028(var6[var10], 255) >> this.field1983.field3929;
        }
        int var11 = 0;
        while (var11 < var7) {
            int var12 = var8[var11];
            int var13 = var9[var11++];
            int var14 = var8[var11];
            int var15 = var9[var11++];
            int var16 = var8[var11];
            int var17 = var9[var11++];
            if (~((-var14 + var12) * (-var17 + var15) - (var16 - var14) * (-var13 + var15)) < -1) {
                arg1.method2262(0, var13, var17, var16, var12, var15, var14);
            }
        }
        if (!arg2) {
            this.field2013 = null;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method62(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field1998;
        if (this.field2008 > 0) {
            this.field1983.method1784(-57);
            this.field1983.method1775((byte) -106, false);
            this.field1983.method1708(-8, false);
            this.field1983.method1739((byte) 90, false);
            this.field1983.method1706(-58, false);
            this.field1983.method1732(0, 9);
            this.field1983.method1725(-121, -2);
            this.field1983.method1749(25752, (class169) null);
            class228.field3455[11] = 0.0F;
            class228.field3455[7] = 0.0F;
            class228.field3455[14] = 0.0F;
            class228.field3455[2] = 0.0F;
            class228.field3455[3] = 0.0F;
            class228.field3455[15] = 1.0F;
            class228.field3455[1] = 0.0F;
            class228.field3455[13] = -(((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field1983.field3786) + 1.0F;
            class228.field3455[6] = 0.0F;
            class228.field3455[10] = 0.0F;
            class228.field3455[12] = -(((float) (arg2 * arg3) / 128.0F - (float) (arg0 * 2)) / (float) this.field1983.field3758) + -1.0F;
            class228.field3455[8] = 0.0F;
            class228.field3455[5] = (float) arg2 / ((float) super.field127 * 128.0F * (float) this.field1983.field3786);
            class228.field3455[4] = 0.0F;
            class228.field3455[0] = (float) arg2 / ((float) super.field127 * 128.0F * (float) this.field1983.field3758);
            class228.field3455[9] = 0.0F;
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadMatrixf(class228.field3455, 0);
            class228.field3455[3] = 0.0F;
            class228.field3455[5] = 0.0F;
            class228.field3455[8] = 0.0F;
            class228.field3455[11] = 0.0F;
            class228.field3455[6] = 1.0F;
            class228.field3455[10] = 0.0F;
            class228.field3455[12] = 0.0F;
            class228.field3455[2] = 0.0F;
            class228.field3455[1] = 0.0F;
            class228.field3455[15] = 1.0F;
            class228.field3455[14] = 0.0F;
            class228.field3455[9] = 1.0F;
            class228.field3455[4] = 0.0F;
            class228.field3455[13] = 0.0F;
            class228.field3455[7] = 0.0F;
            class228.field3455[0] = 1.0F;
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadMatrixf(class228.field3455, 0);
            if ((this.field2000 & 7) == 0) {
                this.field1983.method1708(-8, false);
            } else {
                this.field1983.method1708(-8, true);
                this.field1983.method1774(4611);
            }
            this.field1983.method1748(this.field2014, this.field2011, this.field2006, 0, this.field2018);
            if (~this.field1983.field3954.field2973.length <= ~(this.field1973 * 2)) {
                this.field1983.field3954.field2982 = 0;
            } else {
                this.field1983.field3954 = new class268(this.field1973 * 2);
            }
            int var9 = 0;
            class268 var10 = this.field1983.field3954;
            if (this.field1983.field3990) {
                for (int var11 = arg4; var11 < arg6; ++var11) {
                    int var12 = super.field124 * var11 + arg3;
                    for (int var13 = arg3; var13 < arg5; ++var13) {
                        if (arg7[-arg3 + var13][-arg4 + var11]) {
                            short[] var14 = this.field1971[var12];
                            if (var14 != null) {
                                for (int var15 = 0; var15 < var14.length; ++var15) {
                                    ++var9;
                                    var10.method1364(var14[var15] & 65535, true);
                                }
                            }
                        }
                        ++var12;
                    }
                }
            } else {
                for (int var16 = arg4; ~var16 > ~arg6; ++var16) {
                    int var18 = super.field124 * var16 + arg3;
                    for (int var19 = arg3; ~arg5 < ~var19; ++var19) {
                        if (arg7[-arg3 + var19][var16 - arg4]) {
                            short[] var20 = this.field1971[var18];
                            if (var20 != null) {
                                for (int var21 = 0; var21 < var20.length; ++var21) {
                                    var10.method1366(true, var20[var21] & 65535);
                                    ++var9;
                                }
                            }
                        }
                        ++var18;
                    }
                }
            }
            if (~var9 < -1) {
                class18 var17 = new class18(this.field1983, 5123, var10.field2973, var10.field2982);
                this.field1983.method1762(0, var17, (byte) 122, 4, var9);
            }
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lrd;[I)V")
    public final void method60(class344 arg0, int[] arg1) {
        this.field1986.method292((byte) 121, new class91(this.field1983, this, arg0, arg1));
        ++field1999;
    }

    @OriginalMember(owner = "client!jk", name = "pa", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method59(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        ++field1974;
        if (arg5 != null && this.field1994 == null) {
            this.field1994 = new int[super.field124][super.field122][];
        }
        if (arg3 != null && this.field1968 == null) {
            this.field1968 = new int[super.field124][super.field122][];
        }
        this.field1972[arg0][arg1] = arg2;
        this.field1967[arg0][arg1] = arg4;
        this.field1997[arg0][arg1] = arg6;
        this.field1984[arg0][arg1] = arg7;
        if (this.field1994 != null) {
            this.field1994[arg0][arg1] = arg5;
        }
        if (this.field1968 != null) {
            this.field1968[arg0][arg1] = arg3;
        }
        class57[] var15 = this.field1980[arg0][arg1] = new class57[arg6.length];
        for (int var16 = 0; var16 < arg6.length; ++var16) {
            long var17 = (long) arg8[var16] | (long) (arg9[var16] << 14) | (long) arg10 << 28 | (long) arg11 << 42 | (long) arg12 << 48;
            class130 var19;
            for (var19 = this.field2016.method358((byte) 31, var17); var19 != null; var19 = this.field2016.method366(-112)) {
                class57 var20 = (class57) var19;
                if (~arg8[var16] == ~var20.field865 && (float) arg9[var16] == var20.field873 && var20.field869 == arg10 && var20.field882 == arg11 && var20.field883 == arg12) {
                    break;
                }
            }
            if (var19 == null) {
                var15[var16] = new class57(this, arg8[var16], arg9[var16], arg10, arg11, arg12);
                this.field2016.method357(var15[var16], 1, var17);
            } else {
                var15[var16] = (class57) var19;
            }
        }
        if (arg13) {
            this.field1985[arg0][arg1] = (byte) class19.method118(this.field1985[arg0][arg1], 1);
        }
        if (~arg6.length < ~this.field2017) {
            this.field2017 = arg6.length;
        }
        this.field2008 += arg6.length;
    }

    static {
        new class179("That player is offline, or has privacy mode enabled.", "Dieser Spieler ist offline oder hat den Privatsphären-Modus aktiviert.", "Ce joueur est déconnecté ou en mode privé.", "O jogador está offline ou está com o modo de privacidade ativado.");
        field1990 = false;
        field2002 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };
        field2010 = -1;
    }
}
