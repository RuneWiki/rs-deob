import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public class class171 extends class544 {

    @OriginalMember(owner = "client!uo", name = "R", descriptor = "F")
    private float field2202 = -3.4028235E38F;

    @OriginalMember(owner = "client!uo", name = "X", descriptor = "F")
    private float field2208 = Float.MAX_VALUE;

    @OriginalMember(owner = "client!uo", name = "i", descriptor = "Lbv;")
    private class568 field2167 = new class568();

    @OriginalMember(owner = "client!uo", name = "x", descriptor = "Lre;")
    public class582 field2182;

    @OriginalMember(owner = "client!uo", name = "K", descriptor = "I")
    private int field2195;

    @OriginalMember(owner = "client!uo", name = "I", descriptor = "[[I")
    private int[][] field2193;

    @OriginalMember(owner = "client!uo", name = "s", descriptor = "[[[I")
    private int[][][] field2177;

    @OriginalMember(owner = "client!uo", name = "z", descriptor = "I")
    public int field2184;

    @OriginalMember(owner = "client!uo", name = "J", descriptor = "[[[Lml;")
    private class36[][][] field2194;

    @OriginalMember(owner = "client!uo", name = "ib", descriptor = "[[F")
    private float[][] field2219;

    @OriginalMember(owner = "client!uo", name = "O", descriptor = "[[S")
    public short[][] field2199;

    @OriginalMember(owner = "client!uo", name = "t", descriptor = "[[[I")
    public int[][][] field2178;

    @OriginalMember(owner = "client!uo", name = "db", descriptor = "[[B")
    private byte[][] field2214;

    @OriginalMember(owner = "client!uo", name = "C", descriptor = "[[[I")
    private int[][][] field2187;

    @OriginalMember(owner = "client!uo", name = "j", descriptor = "[[B")
    private byte[][] field2168;

    @OriginalMember(owner = "client!uo", name = "fb", descriptor = "[[F")
    private float[][] field2216;

    @OriginalMember(owner = "client!uo", name = "cb", descriptor = "[[F")
    private float[][] field2213;

    @OriginalMember(owner = "client!uo", name = "F", descriptor = "[[[I")
    public int[][][] field2190;

    @OriginalMember(owner = "client!uo", name = "w", descriptor = "[[[I")
    private int[][][] field2181;

    @OriginalMember(owner = "client!uo", name = "Y", descriptor = "I")
    private int field2209;

    @OriginalMember(owner = "client!uo", name = "Z", descriptor = "Lba;")
    private class607 field2210;

    @OriginalMember(owner = "client!uo", name = "D", descriptor = "Lla;")
    private class374 field2188;

    @OriginalMember(owner = "client!uo", name = "u", descriptor = "I")
    public static int field2179 = 500;

    @OriginalMember(owner = "client!uo", name = "E", descriptor = "Lim;")
    public static class353 field2189 = new class353(75, -2);

    @OriginalMember(owner = "client!uo", name = "k", descriptor = "I")
    public static int field2169;

    @OriginalMember(owner = "client!uo", name = "l", descriptor = "I")
    public static int field2170;

    @OriginalMember(owner = "client!uo", name = "m", descriptor = "I")
    public static int field2171;

    @OriginalMember(owner = "client!uo", name = "n", descriptor = "I")
    public static int field2172;

    @OriginalMember(owner = "client!uo", name = "o", descriptor = "I")
    public static int field2173;

    @OriginalMember(owner = "client!uo", name = "p", descriptor = "I")
    public static int field2174;

    @OriginalMember(owner = "client!uo", name = "q", descriptor = "I")
    public static int field2175;

    @OriginalMember(owner = "client!uo", name = "r", descriptor = "I")
    private int field2176;

    @OriginalMember(owner = "client!uo", name = "v", descriptor = "I")
    public static int field2180;

    @OriginalMember(owner = "client!uo", name = "y", descriptor = "I")
    public static int field2183;

    @OriginalMember(owner = "client!uo", name = "A", descriptor = "I")
    private int field2185;

    @OriginalMember(owner = "client!uo", name = "B", descriptor = "I")
    public static int field2186;

    @OriginalMember(owner = "client!uo", name = "G", descriptor = "I")
    public static int field2191;

    @OriginalMember(owner = "client!uo", name = "H", descriptor = "I")
    public static int field2192;

    @OriginalMember(owner = "client!uo", name = "N", descriptor = "I")
    public static int field2198;

    @OriginalMember(owner = "client!uo", name = "P", descriptor = "I")
    public static int field2200;

    @OriginalMember(owner = "client!uo", name = "Q", descriptor = "I")
    public static int field2201;

    @OriginalMember(owner = "client!uo", name = "S", descriptor = "I")
    public static int field2203;

    @OriginalMember(owner = "client!uo", name = "T", descriptor = "I")
    public static int field2204;

    @OriginalMember(owner = "client!uo", name = "U", descriptor = "I")
    public static int field2205;

    @OriginalMember(owner = "client!uo", name = "V", descriptor = "I")
    public static int field2206;

    @OriginalMember(owner = "client!uo", name = "gb", descriptor = "I")
    private int field2217;

    @OriginalMember(owner = "client!uo", name = "jb", descriptor = "I")
    private int field2220;

    @OriginalMember(owner = "client!uo", name = "ab", descriptor = "Lkq;")
    public class102 field2211;

    @OriginalMember(owner = "client!uo", name = "bb", descriptor = "Llca;")
    private class133 field2212;

    @OriginalMember(owner = "client!uo", name = "hb", descriptor = "Llca;")
    private class133 field2218;

    @OriginalMember(owner = "client!uo", name = "M", descriptor = "Lkr;")
    public static class329 field2197;

    @OriginalMember(owner = "client!uo", name = "L", descriptor = "Lfba;")
    public static class520 field2196;

    // $FF: synthetic field
    @OriginalMember(owner = "client!uo", name = "kb", descriptor = "Ljava/lang/Class;")
    public static Class field2221;

    @OriginalMember(owner = "client!uo", name = "eb", descriptor = "[Lml;")
    private class36[] field2215;

    @OriginalMember(owner = "client!uo", name = "W", descriptor = "[[[I")
    private int[][][] field2207;

    @OriginalMember(owner = "client!uo", name = "ba", descriptor = "(II)I")
    public final int method1031(int arg0, int arg1) {
        ++field2171;
        return this.field2193[arg0][arg1];
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lww;[I)V")
    public final void method1032(class592 arg0, int[] arg1) {
        this.field2167.method3181(new class451(this.field2182, this, arg0, arg1), true);
        ++field2169;
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lqa;Lra;IIZII)V")
    public static final void method1033(class167 arg0, class262 arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        if (arg4) {
            class55.field731.method632((class502.field6955 - class55.field731.method627()) / 2, (class604.field8711 + -class55.field731.method631()) / 2);
            class354.field4959.method632((class502.field6955 - class354.field4959.method627()) / 2, 18);
        }
        ++field2180;
        String var7 = "";
        if (class612.field8806 == class26.field453) {
            var7 = class225.field2872.method2157(class245.field3103, 4074);
        } else if (class532.field7433 == class26.field453) {
            var7 = class194.field2521.method2157(class245.field3103, 4074);
        }
        arg1.method1618(arg2, -1, class604.field8711 / 2 - 26, (byte) -122, class502.field6955 / 2, var7);
        int var8 = class604.field8711 / 2 + -18;
        if (arg6 >= 23) {
            arg0.method995(class502.field6955 / 2 + -152, var8, 304, 34, arg3, 0);
            arg0.method995(class502.field6955 / 2 + -151, var8 + 1, 302, 32, 0, 0);
            arg0.method997(class502.field6955 / 2 + -150, var8 + 2, class555.field7762 * 3, 30, arg5, 0);
            arg0.method997(class555.field7762 * 3 + class502.field6955 / 2 + -150, var8 - -2, -(class555.field7762 * 3) + 300, 30, 0, 0);
            arg1.method1618(arg2, -1, class604.field8711 / 2 + 4, (byte) -118, class502.field6955 / 2, class26.field448);
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lk;IIIIZ)Z")
    public final boolean method1034(class88 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field2170;
        if (this.field2188 != null && arg0 != null) {
            int var7 = -(this.field2182.field8317 * arg2 >> 8) + arg1 >> this.field2182.field8357;
            int var8 = -(this.field2182.field8345 * arg2 >> 8) + arg3 >> this.field2182.field8357;
            return this.field2188.method2287(1, var7, arg0, var8);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!uo", name = "X", descriptor = "(IILk;)Lk;")
    public final class88 method1035(int arg0, int arg1, class88 arg2) {
        ++field2201;
        if (~(this.field2168[arg0][arg1] & 1) == -1) {
            return null;
        } else {
            int var4 = super.field7582 >> this.field2182.field8357;
            class545 var5 = (class545) arg2;
            class545 var6;
            if (var5 != null && var5.method3012(var4, var4, 97)) {
                var6 = var5;
                var5.method3014((byte) -125);
            } else {
                var6 = new class545(this.field2182, var4, var4);
            }
            var6.method3017((byte) -128, 0, var4, var4, 0);
            this.method1036(false, arg1, var6, arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(ZILoca;I)V")
    private final void method1036(boolean arg0, int arg1, class545 arg2, int arg3) {
        ++field2205;
        int[] var5 = this.field2178[arg3][arg1];
        int[] var6 = this.field2190[arg3][arg1];
        int var7 = var5.length;
        if (~class446.field6169.length > ~var7) {
            class423.field5738 = new int[var7];
            class446.field6169 = new int[var7];
        }
        for (int var8 = 0; var8 < var7; ++var8) {
            class446.field6169[var8] = var5[var8] >> this.field2182.field8357;
            class423.field5738[var8] = var6[var8] >> this.field2182.field8357;
        }
        if (arg0) {
            this.method1044(102, -61, -29);
        }
        int var9 = 0;
        while (var7 > var9) {
            int var10 = class446.field6169[var9];
            int var11 = class423.field5738[var9++];
            int var12 = class446.field6169[var9];
            int var13 = class423.field5738[var9++];
            int var14 = class446.field6169[var9];
            int var15 = class423.field5738[var9++];
            if ((-var12 + var10) * (-var15 + var13) + -((-var11 + var13) * (-var12 + var14)) > 0) {
                arg2.method3018(var11, false, var13, var14, var12, var10, var15);
            }
        }
    }

    @OriginalMember(owner = "client!uo", name = "ya", descriptor = "(Lk;IIIIZ)V")
    public final void method1037(class88 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field2198;
        if (this.field2188 != null && arg0 != null) {
            int var7 = -(this.field2182.field8317 * arg2 >> 8) + arg1 >> this.field2182.field8357;
            int var8 = -(this.field2182.field8345 * arg2 >> 8) + arg3 >> this.field2182.field8357;
            this.field2188.method2285(var8, arg0, 21211, var7);
        }
    }

    @OriginalMember(owner = "client!uo", name = "<init>", descriptor = "(Lre;IIII[[I[[II)V")
    public class171(class582 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7);
        this.field2182 = arg0;
        this.field2195 = super.field7583 + -2;
        this.field2193 = arg5;
        this.field2177 = new int[arg3][arg4][];
        this.field2184 = arg2;
        this.field2194 = new class36[arg3][arg4][];
        this.field2219 = new float[super.field7581 + 1][super.field7585 - -1];
        this.field2199 = new short[arg3 * arg4][];
        this.field2178 = new int[arg3][arg4][];
        this.field2214 = new byte[arg3 - -1][arg4 + 1];
        this.field2187 = new int[arg3][arg4][];
        this.field2168 = new byte[arg3][arg4];
        this.field2216 = new float[super.field7581 + 1][super.field7585 + 1];
        this.field2213 = new float[super.field7581 + 1][super.field7585 - -1];
        this.field2190 = new int[arg3][arg4][];
        this.field2181 = new int[arg3][arg4][];
        this.field2209 = 1 << this.field2195;
        for (int var9 = 0; super.field7585 >= var9; ++var9) {
            for (int var10 = 0; ~super.field7581 <= ~var10; ++var10) {
                int var11 = this.field2193[var10][var9];
                if ((float) var11 < this.field2208) {
                    this.field2208 = (float) var11;
                }
                if ((float) var11 > this.field2202) {
                    this.field2202 = (float) var11;
                }
                if (var10 > 0 && var9 > 0 && var10 < super.field7581 && super.field7585 > var9) {
                    int var12 = arg6[var10 + 1][var9] + -arg6[var10 + -1][var9];
                    int var13 = arg6[var10][var9 - -1] + -arg6[var10][var9 + -1];
                    float var14 = (float) (1.0D / Math.sqrt((double) (var12 * var12 - (-(arg7 * 4 * arg7) - var13 * var13))));
                    this.field2216[var10][var9] = (float) var12 * var14;
                    this.field2219[var10][var9] = (float) (-arg7 * 2) * var14;
                    this.field2213[var10][var9] = (float) var13 * var14;
                }
            }
        }
        ++this.field2202;
        --this.field2208;
        this.field2210 = new class607(128);
        if ((this.field2184 & 16) != 0) {
            this.field2188 = new class374(this.field2182, this);
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(II)V")
    public final void method883(int arg0, int arg1) {
        ++field2204;
    }

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "(I)V")
    public static void method1038(int arg0) {
        field2189 = null;
        if (arg0 != -1) {
            method1033((class167) null, (class262) null, 106, -79, true, 43, 41);
        }
        field2197 = null;
        field2196 = null;
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(BIIIIIII)V")
    public static final void method1039(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field2173;
        if (arg0 != 118) {
            method1039((byte) -66, -126, 13, 9, 82, -104, 115, 40);
        }
        if (arg1 >= 0 && ~arg3 <= -1 && arg1 < class139.field1760 + -1 && ~arg3 > ~(class369.field5135 + -1)) {
            if (class199.field2605 == null) {
                return;
            }
            if (arg7 != 0) {
                if (~arg7 != -2) {
                    if (~arg7 == -3) {
                        class246 var8 = (class246) class49.method273(arg5, arg1, arg3, field2221 != null ? field2221 : (field2221 = method1049("vaa")));
                        if (var8 != null) {
                            if (arg6 == 11) {
                                arg6 = 10;
                            }
                            if (!(var8 instanceof class599)) {
                                class415.method2472(arg2, arg4, arg6, var8.method52(-17817), arg7, arg1, arg5, arg3, false);
                                return;
                            }
                            ((class599) var8).field8658.method2551((byte) 120, arg2);
                            return;
                        }
                    } else {
                        if (arg7 != 3) {
                            return;
                        }
                        class246 var9 = (class246) class380.method2313(arg5, arg1, arg3);
                        if (var9 == null) {
                            return;
                        }
                        if (!(var9 instanceof class197)) {
                            class415.method2472(arg2, arg4, arg6, var9.method52(arg0 + -17935), arg7, arg1, arg5, arg3, false);
                            return;
                        }
                        ((class197) var9).field2579.method2551((byte) 104, arg2);
                    }
                    return;
                } else {
                    class246 var10 = (class246) class234.method1474(arg5, arg1, arg3);
                    if (var10 == null) {
                        return;
                    }
                    if (var10 instanceof class403) {
                        ((class403) var10).field5506.method2551((byte) 115, arg2);
                        return;
                    }
                    int var11 = var10.method52(-17817);
                    if (~arg6 == -5 || ~arg6 == -6) {
                        class415.method2472(arg2, arg4, 4, var11, arg7, arg1, arg5, arg3, false);
                        return;
                    }
                    if (~arg6 == -7) {
                        class415.method2472(arg2, arg4 + 4, 4, var11, arg7, arg1, arg5, arg3, false);
                        return;
                    }
                    if (~arg6 == -8) {
                        class415.method2472(arg2, (arg4 + 2 & 3) + 4, 4, var11, arg7, arg1, arg5, arg3, false);
                        return;
                    }
                    if (~arg6 != -9) {
                        return;
                    }
                    class415.method2472(arg2, arg4 + 4, 4, var11, arg7, arg1, arg5, arg3, false);
                    class415.method2472(arg2, (3 & arg4 + 2) + 4, 4, var11, arg7, arg1, arg5, arg3, false);
                    return;
                }
            }
            class246 var12 = (class246) class146.method798(arg5, arg1, arg3);
            class246 var13 = (class246) class287.method1777(arg5, arg1, arg3);
            if (var12 != null && ~arg6 != -3) {
                if (var12 instanceof class453) {
                    ((class453) var12).field6417.method2551((byte) 106, arg2);
                } else {
                    class415.method2472(arg2, arg4, arg6, var12.method52(-17817), arg7, arg1, arg5, arg3, false);
                }
            }
            if (var13 != null) {
                if (!(var13 instanceof class453)) {
                    class415.method2472(arg2, arg4, arg6, var13.method52(arg0 ^ -17903), arg7, arg1, arg5, arg3, false);
                    return;
                }
                ((class453) var13).field6417.method2551((byte) 124, arg2);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!uo", name = "aa", descriptor = "(II)I")
    public final int method1040(int arg0, int arg1) {
        ++field2174;
        int var3 = arg0 >> super.field7583;
        int var4 = arg1 >> super.field7583;
        if (~var3 <= -1 && ~var4 <= -1 && super.field7581 + -1 >= var3 && ~var4 >= ~(super.field7585 + -1)) {
            int var5 = super.field7582 + -1 & arg0;
            int var6 = super.field7582 + -1 & arg1;
            int var7 = (super.field7582 - var5) * this.field2193[var3][var4] + this.field2193[var3 + 1][var4] * var5 >> super.field7583;
            int var8 = (super.field7582 - var5) * this.field2193[var3][var4 + 1] + this.field2193[var3 - -1][var4 + 1] * var5 >> super.field7583;
            return (-var6 + super.field7582) * var7 + var6 * var8 >> super.field7583;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!uo", name = "F", descriptor = "(Lk;IIIIZ)V")
    public final void method1041(class88 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field2175;
        if (this.field2188 != null && arg0 != null) {
            int var7 = -(this.field2182.field8317 * arg2 >> 8) + arg1 >> this.field2182.field8357;
            int var8 = -(this.field2182.field8345 * arg2 >> 8) + arg3 >> this.field2182.field8357;
            this.field2188.method2283(var8, arg0, var7, (byte) -27);
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lqa;Z)V")
    public static final void method1042(class167 arg0, boolean arg1) {
        if (arg1) {
            method1033((class167) null, (class262) null, 40, 101, true, 99, 42);
        }
        ++field2183;
        if (class641.field9319) {
            class9.method36(arg0, -38);
        } else {
            class588.method3393((byte) -124, arg0);
        }
    }

    @OriginalMember(owner = "client!uo", name = "IA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method1043(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        ++field2203;
        if (arg5 != null && this.field2207 == null) {
            this.field2207 = new int[super.field7581][super.field7585][];
        }
        if (arg3 != null && this.field2187 == null) {
            this.field2187 = new int[super.field7581][super.field7585][];
        }
        this.field2178[arg0][arg1] = arg2;
        this.field2190[arg0][arg1] = arg4;
        this.field2177[arg0][arg1] = arg6;
        this.field2181[arg0][arg1] = arg7;
        if (this.field2207 != null) {
            this.field2207[arg0][arg1] = arg5;
        }
        if (this.field2187 != null) {
            this.field2187[arg0][arg1] = arg3;
        }
        class36[] var15 = this.field2194[arg0][arg1] = new class36[arg6.length];
        for (int var16 = 0; ~var16 > ~arg6.length; ++var16) {
            long var17 = (long) arg8[var16] | (long) arg12 << 48 | (long) arg11 << 42 | (long) arg10 << 28 | (long) (arg9[var16] << 14);
            class108 var19;
            for (var19 = this.field2210.method3476(var17, (byte) 28); var19 != null; var19 = this.field2210.method3481(103)) {
                class36 var20 = (class36) var19;
                if (~arg8[var16] == ~var20.field559 && (float) arg9[var16] == var20.field557 && var20.field551 == arg10 && ~var20.field548 == ~arg11 && var20.field564 == arg12) {
                    break;
                }
            }
            if (var19 == null) {
                var15[var16] = new class36(this, arg8[var16], arg9[var16], arg10, arg11, arg12);
                this.field2210.method3475(-89, var15[var16], var17);
            } else {
                var15[var16] = (class36) var19;
            }
        }
        if (arg13) {
            this.field2168[arg0][arg1] = (byte) class292.method1790(this.field2168[arg0][arg1], 1);
        }
        if (~arg6.length < ~this.field2217) {
            this.field2217 = arg6.length;
        }
        this.field2220 += arg6.length;
    }

    @OriginalMember(owner = "client!uo", name = "Q", descriptor = "(III)V")
    public final void method1044(int arg0, int arg1, int arg2) {
        ++field2200;
        if (~(this.field2214[arg0][arg1] & 255) > ~arg2) {
            this.field2214[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(III[[ZZ)V")
    public final void method1045(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        ++field2172;
        this.method1048(arg4, arg1, -88, arg0, -1, arg2, arg3);
    }

    @OriginalMember(owner = "client!uo", name = "N", descriptor = "()V")
    public final void method1046() {
        ++field2192;
        if (~this.field2220 >= -1) {
            this.field2188 = null;
        } else {
            byte[][] var1 = new byte[super.field7581 + 1][super.field7585 + 1];
            for (int var2 = 1; ~super.field7581 < ~var2; ++var2) {
                for (int var107 = 1; super.field7585 > var107; ++var107) {
                    var1[var2][var107] = (byte) ((this.field2214[var2][var107 - -1] >> 3) + (this.field2214[var2][var107] >> 1) + (this.field2214[var2 - -1][var107] >> 3) + (this.field2214[var2][var107 - 1] >> 2) + (this.field2214[var2 + -1][var107] >> 2));
                }
            }
            class36[] var3 = new class36[this.field2210.method3480(-24064)];
            this.field2210.method3477(var3, (byte) -101);
            for (int var4 = 0; var4 < var3.length; ++var4) {
                var3[var4].method216(-1, this.field2220);
            }
            int var5 = 20;
            if (this.field2207 != null) {
                var5 += 4;
            }
            if ((this.field2184 & 7) != 0) {
                var5 += 12;
            }
            NativeHeapBuffer var6 = this.field2182.field8146.method3194(this.field2220 * 4, false);
            NativeHeapBuffer var7 = this.field2182.field8146.method3194(this.field2220 * var5, false);
            Stream var8 = new Stream(var7);
            Stream var9 = new Stream(var6);
            class36[] var10 = new class36[this.field2220];
            int var11 = class103.method565(32085, this.field2220 / 4);
            if (~var11 > -2) {
                var11 = 1;
            }
            class607 var12 = new class607(var11);
            class36[] var13 = new class36[this.field2217];
            for (int var14 = 0; ~var14 > ~super.field7581; ++var14) {
                for (int var34 = 0; ~var34 > ~super.field7585; ++var34) {
                    if (this.field2177[var14][var34] != null) {
                        class36[] var35 = this.field2194[var14][var34];
                        int[] var36 = this.field2178[var14][var34];
                        int[] var37 = this.field2190[var14][var34];
                        int[] var38 = this.field2181[var14][var34];
                        int[] var39 = this.field2177[var14][var34];
                        int[] var40 = this.field2187 != null ? this.field2187[var14][var34] : null;
                        if (var38 == null) {
                            var38 = var39;
                        }
                        int[] var41 = this.field2207 != null ? this.field2207[var14][var34] : null;
                        float var42 = this.field2216[var14][var34];
                        float var43 = this.field2219[var14][var34];
                        float var44 = this.field2213[var14][var34];
                        float var45 = this.field2216[var14][var34 - -1];
                        float var46 = this.field2219[var14][var34 + 1];
                        float var47 = this.field2213[var14][var34 + 1];
                        float var48 = this.field2216[var14 - -1][var34 + 1];
                        float var49 = this.field2219[var14 + 1][var34 + 1];
                        float var50 = this.field2213[var14 + 1][var34 + 1];
                        float var51 = this.field2216[var14 - -1][var34];
                        float var52 = this.field2219[var14 + 1][var34];
                        float var53 = this.field2213[var14 + 1][var34];
                        int var54 = 255 & var1[var14][var34];
                        int var55 = var1[var14][var34 + 1] & 255;
                        int var56 = 255 & var1[var14 + 1][var34 + 1];
                        int var57 = 255 & var1[var14 + 1][var34];
                        int var58 = 0;
                        label358: for (int var59 = 0; ~var59 > ~var39.length; ++var59) {
                            class36 var105 = var35[var59];
                            for (int var106 = 0; var58 > var106; ++var106) {
                                if (var13[var106] == var105) {
                                    continue label358;
                                }
                            }
                            var13[var58++] = var105;
                        }
                        short[] var60 = this.field2199[super.field7581 * var34 + var14] = new short[var39.length];
                        for (int var61 = 0; var39.length > var61; ++var61) {
                            int var62 = (var14 << super.field7583) + var36[var61];
                            int var63 = (var34 << super.field7583) - -var37[var61];
                            int var64 = var62 >> this.field2195;
                            int var65 = var63 >> this.field2195;
                            int var66 = var39[var61];
                            int var67 = var38[var61];
                            int var68 = var40 == null ? 0 : var40[var61];
                            long var69 = (long) var65 | (long) var66 << 32 | (long) var67 << 48 | (long) (var64 << 16);
                            int var71 = var36[var61];
                            int var72 = var37[var61];
                            byte var73 = 74;
                            int var74 = 0;
                            float var75;
                            float var76;
                            int var77;
                            float var78;
                            if (var71 == 0 && ~var72 == -1) {
                                var75 = var42;
                                var76 = var43;
                                var77 = var73 - var54;
                                var78 = var44;
                            } else if (~var71 == -1 && ~super.field7582 == ~var72) {
                                var77 = var73 - var55;
                                var75 = var45;
                                var76 = var46;
                                var78 = var47;
                            } else if (super.field7582 == var71 && super.field7582 == var72) {
                                var78 = var50;
                                var77 = var73 - var56;
                                var75 = var48;
                                var76 = var49;
                            } else if (super.field7582 == var71 && var72 == 0) {
                                var78 = var53;
                                var76 = var52;
                                var77 = var73 - var57;
                                var75 = var51;
                            } else {
                                float var79 = (float) var71 / (float) super.field7582;
                                float var80 = (float) var72 / (float) super.field7582;
                                float var81 = (var51 - var42) * var79 + var42;
                                float var82 = (var52 - var43) * var79 + var43;
                                float var83 = (var53 - var44) * var79 + var44;
                                float var84 = (-var45 + var48) * var79 + var45;
                                float var85 = (var49 - var46) * var79 + var46;
                                float var86 = (-var47 + var50) * var79 + var47;
                                var75 = (var84 - var81) * var80 + var81;
                                var76 = (-var82 + var85) * var80 + var82;
                                var78 = (-var83 + var86) * var80 + var83;
                                int var87 = ((var57 - var54) * var71 >> super.field7583) + var54;
                                int var88 = ((-var55 + var56) * var71 >> super.field7583) + var55;
                                var77 = var73 - (((-var87 + var88) * var72 >> super.field7583) + var87);
                            }
                            float var89 = 1.0F;
                            if (~var66 != 0) {
                                int var90 = (var66 & 127) * var77 >> 7;
                                if (~var90 <= -3) {
                                    if (var90 > 126) {
                                        var90 = 126;
                                    }
                                } else {
                                    var90 = 2;
                                }
                                var74 = class190.field2453[var90 | var66 & 65408];
                                if ((7 & this.field2184) == 0) {
                                    float var91 = this.field2182.field8377[2] * var78 + this.field2182.field8377[1] * var76 + this.field2182.field8377[0] * var75;
                                    var89 = var91 * (var91 > 0.0F ? this.field2182.field8385 : this.field2182.field8343) + this.field2182.field8355;
                                }
                            }
                            class108 var92 = null;
                            if ((var62 & this.field2209 + -1) == 0 && (var63 & this.field2209 + -1) == 0) {
                                var92 = var12.method3476(var69, (byte) 28);
                            }
                            int var93;
                            if (var92 != null) {
                                var60[var61] = ((class149) var92).field1928;
                                var93 = 65535 & var60[var61];
                                if (~var66 != 0 && var10[var93].field1401 > var35[var61].field1401) {
                                    var10[var93] = var35[var61];
                                }
                            } else {
                                int var94;
                                if (~var66 == ~var67) {
                                    var94 = var74;
                                } else {
                                    int var95 = (127 & var67) * var77 >> 7;
                                    if (~var95 > -3) {
                                        var95 = 2;
                                    } else if (var95 > 126) {
                                        var95 = 126;
                                    }
                                    var94 = class190.field2453[var95 | 65408 & var67];
                                    if ((7 & this.field2184) == 0) {
                                        float var96 = this.field2182.field8377[2] * var78 + this.field2182.field8377[1] * var76 + this.field2182.field8377[0] * var75;
                                        float var97 = this.field2182.field8355 + var89 * (var89 > 0.0F ? this.field2182.field8385 : this.field2182.field8343);
                                        int var98 = 255 & var94 >> 16;
                                        int var99 = 255 & var94 >> 8;
                                        int var100 = (int) ((float) var98 * var97);
                                        int var101 = var94 & 255;
                                        if (~var100 <= -1) {
                                            if (~var100 < -256) {
                                                var100 = 255;
                                            }
                                        } else {
                                            var100 = 0;
                                        }
                                        int var102 = (int) ((float) var99 * var97);
                                        if (var102 >= 0) {
                                            if (var102 > 255) {
                                                var102 = 255;
                                            }
                                        } else {
                                            var102 = 0;
                                        }
                                        int var103 = (int) ((float) var101 * var97);
                                        if (~var103 <= -1) {
                                            if (var103 > 255) {
                                                var103 = 255;
                                            }
                                        } else {
                                            var103 = 0;
                                        }
                                        var94 = var102 << 8 | var100 << 16 | var103;
                                    }
                                }
                                if (!Stream.method3209()) {
                                    var8.method3206((float) var62);
                                    var8.method3206((float) (this.method1040(var62, var63) + var68));
                                    var8.method3206((float) var63);
                                    var8.method3206((float) var62);
                                    var8.method3206((float) var63);
                                    if (this.field2207 != null) {
                                        var8.method3206((float) (var41 != null ? var41[var61] + -1 : 0));
                                    }
                                    if (~(this.field2184 & 7) != -1) {
                                        var8.method3206(var75);
                                        var8.method3206(var76);
                                        var8.method3206(var78);
                                    }
                                } else {
                                    var8.method3197((float) var62);
                                    var8.method3197((float) (this.method1040(var62, var63) + var68));
                                    var8.method3197((float) var63);
                                    var8.method3197((float) var62);
                                    var8.method3197((float) var63);
                                    if (this.field2207 != null) {
                                        var8.method3197((float) (var41 == null ? 0 : var41[var61] - 1));
                                    }
                                    if (~(this.field2184 & 7) != -1) {
                                        var8.method3197(var75);
                                        var8.method3197(var76);
                                        var8.method3197(var78);
                                    }
                                }
                                if (this.field2182.field8376 == 0) {
                                    var9.method3199(var94 | -16777216);
                                } else {
                                    var9.method3200(var94 | -16777216);
                                }
                                var93 = this.field2176++;
                                var60[var61] = (short) var93;
                                if (var66 != -1) {
                                    var10[var93] = var35[var61];
                                }
                                var12.method3475(-127, new class149(var60[var61]), var69);
                            }
                            for (int var104 = 0; var58 > var104; ++var104) {
                                var13[var104].method219(var77, var89, var74, -92, var93);
                            }
                            ++this.field2185;
                        }
                    }
                }
            }
            for (int var15 = 0; var15 < this.field2176; ++var15) {
                class36 var33 = var10[var15];
                if (var33 != null) {
                    var33.method215(-29973, var15);
                }
            }
            for (int var16 = 0; var16 < super.field7581; ++var16) {
                for (int var22 = 0; var22 < super.field7585; ++var22) {
                    short[] var23 = this.field2199[super.field7581 * var22 + var16];
                    if (var23 != null) {
                        int var24 = 0;
                        int var25 = 0;
                        while (~var23.length < ~var25) {
                            int var26 = 65535 & var23[var25++];
                            int var27 = 65535 & var23[var25++];
                            int var28 = 65535 & var23[var25++];
                            class36 var29 = var10[var26];
                            class36 var30 = var10[var27];
                            class36 var31 = var10[var28];
                            class36 var32 = null;
                            if (var29 != null) {
                                var29.method220((byte) 126, var16, var24, var22);
                                var32 = var29;
                            }
                            if (var30 != null) {
                                var30.method220((byte) 127, var16, var24, var22);
                                if (var32 == null || ~var30.field1401 > ~var32.field1401) {
                                    var32 = var30;
                                }
                            }
                            if (var31 != null) {
                                var31.method220((byte) 127, var16, var24, var22);
                                if (var32 == null || ~var31.field1401 > ~var32.field1401) {
                                    var32 = var31;
                                }
                            }
                            if (var32 != null) {
                                if (var29 != null) {
                                    var32.method215(-29973, var26);
                                }
                                if (var30 != null) {
                                    var32.method215(-29973, var27);
                                }
                                if (var31 != null) {
                                    var32.method215(-29973, var28);
                                }
                                var32.method220((byte) 127, var16, var24, var22);
                            }
                            ++var24;
                        }
                    }
                }
            }
            var8.method3207();
            var9.method3207();
            this.field2218 = this.field2182.method1197(10, false);
            this.field2218.method704(var6, this.field2176 * 4, (byte) 9, 4);
            this.field2212 = this.field2182.method1197(10, false);
            this.field2212.method704(var7, this.field2176 * var5, (byte) 114, var5);
            if (~(this.field2184 & 7) == -1) {
                if (this.field2207 == null) {
                    this.field2211 = this.field2182.method1178(new class410[] { new class410(new class76[] { class76.field1031, class76.field1038 }), new class410(class76.field1036) }, (byte) -13);
                } else {
                    this.field2211 = this.field2182.method1178(new class410[] { new class410(new class76[] { class76.field1031, class76.field1038, class76.field1037 }), new class410(class76.field1036) }, (byte) -13);
                }
            } else if (this.field2207 == null) {
                this.field2211 = this.field2182.method1178(new class410[] { new class410(new class76[] { class76.field1031, class76.field1038, class76.field1035 }), new class410(class76.field1036) }, (byte) -13);
            } else {
                this.field2211 = this.field2182.method1178(new class410[] { new class410(new class76[] { class76.field1031, class76.field1038, class76.field1037, class76.field1035 }), new class410(class76.field1036) }, (byte) -13);
            }
            int var17 = 0;
            for (int var18 = 0; var3.length > var18; ++var18) {
                if (~var3[var18].field549 < -1) {
                    var3[var17++] = var3[var18];
                }
            }
            this.field2215 = new class36[var17];
            long[] var19 = new long[var17];
            for (int var20 = 0; ~var17 < ~var20; ++var20) {
                class36 var21 = var3[var20];
                var19[var20] = var21.field1401;
                this.field2215[var20] = var21;
                var21.method217(this.field2176, false);
            }
            class432.method2523(this.field2215, -1674857116, var19);
            if (this.field2188 != null) {
                this.field2188.method2284(true);
            }
        }
        this.field2210 = null;
        this.field2187 = null;
        this.field2194 = null;
        this.field2216 = this.field2219 = this.field2213 = null;
        this.field2207 = null;
        this.field2181 = null;
        this.field2178 = this.field2190 = null;
        this.field2214 = null;
        this.field2177 = null;
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method885(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field2206;
        if (~this.field2220 < -1) {
            class180 var9 = this.field2182.method3301(7040, this.field2185);
            int var10 = 0;
            int var11 = 32767;
            int var12 = -32768;
            for (int var13 = 0; ~var13 > -5; ++var13) {
                var10 = 0;
                Buffer var14 = var9.method297((byte) 52, true);
                if (var14 != null) {
                    Stream var15 = this.field2182.method3287(-1, var14);
                    if (!Stream.method3209()) {
                        for (int var16 = arg4; ~arg6 < ~var16; ++var16) {
                            int var17 = super.field7581 * var16 - -arg3;
                            for (int var18 = arg3; var18 < arg5; ++var18) {
                                if (arg7[-arg3 + var18][-arg4 + var16]) {
                                    short[] var19 = this.field2199[var17];
                                    if (var19 != null) {
                                        for (int var20 = 0; var20 < var19.length; ++var20) {
                                            int var21 = var19[var20] & 65535;
                                            if (var11 > var21) {
                                                var11 = var21;
                                            }
                                            if (var12 < var21) {
                                                var12 = var21;
                                            }
                                            var15.method3203(var21);
                                            ++var10;
                                        }
                                    }
                                }
                                ++var17;
                            }
                        }
                    } else {
                        for (int var22 = arg4; ~arg6 < ~var22; ++var22) {
                            int var25 = super.field7581 * var22 + arg3;
                            for (int var26 = arg3; arg5 > var26; ++var26) {
                                if (arg7[-arg3 + var26][-arg4 + var22]) {
                                    short[] var27 = this.field2199[var25];
                                    if (var27 != null) {
                                        for (int var28 = 0; var27.length > var28; ++var28) {
                                            int var29 = 65535 & var27[var28];
                                            ++var10;
                                            if (~var11 < ~var29) {
                                                var11 = var29;
                                            }
                                            if (~var29 < ~var12) {
                                                var12 = var29;
                                            }
                                            var15.method3198(var29);
                                        }
                                    }
                                }
                                ++var25;
                            }
                        }
                    }
                    var15.method3207();
                    if (var9.method290(22526)) {
                        break;
                    }
                }
            }
            if (var10 > 0) {
                this.field2182.method3296(3292);
                this.field2182.method3320(-32, false);
                this.field2182.method3333(false, (byte) 99);
                this.field2182.method3330(false, (byte) -123);
                this.field2182.method3284(false, -88);
                this.field2182.method3343(0, 0);
                this.field2182.method3329(-10053, false, false, -2);
                this.field2182.method3344(29639, (class11) null);
                class186 var23 = this.field2182.method3346((byte) 75);
                float[] var24 = this.field2182.method3340(-93);
                var24[5] = (float) arg2 / ((float) super.field7582 * 128.0F * (float) this.field2182.field8249);
                var24[15] = 1.0F;
                var24[14] = -this.field2208 / (this.field2202 - this.field2208);
                var24[3] = 0.0F;
                var24[0] = (float) arg2 / ((float) super.field7582 * 128.0F * (float) this.field2182.field8219);
                var24[9] = 0.0F;
                var24[2] = 0.0F;
                var24[1] = 0.0F;
                var24[4] = 0.0F;
                var24[7] = 0.0F;
                var24[12] = -(((float) (arg2 * arg3) / 128.0F - (float) (arg0 * 2)) / (float) this.field2182.field8219) + -1.0F;
                var24[10] = 1.0F / (-this.field2208 + this.field2202);
                var24[11] = 0.0F;
                var24[13] = -(((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field2182.field8249) + 1.0F;
                var24[8] = 0.0F;
                var24[6] = 0.0F;
                var23.method1131(1.0F, 1.0F, (byte) 19, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
                this.field2182.method3306(124);
                this.field2182.method3336((byte) 95);
                if (~(7 & this.field2184) != -1) {
                    this.field2182.method3333(true, (byte) 66);
                    this.field2182.method1155(0);
                } else {
                    this.field2182.method3333(false, (byte) 127);
                }
                this.field2182.method1185(false, 6420);
                this.field2182.method1171(this.field2212, 0, (byte) -98);
                this.field2182.method1171(this.field2218, 1, (byte) -98);
                this.field2182.method1207(this.field2211, 1);
                this.field2182.method1212(class546.field7613, var9, -var11 + var12 + 1, -97, var11, var10 / 3, 0);
                this.field2182.method1185(true, 6420);
            }
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method1047(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field2191;
        int var18 = arg9.length;
        int[] var19 = new int[var18 * 3];
        int[] var20 = new int[var18 * 3];
        int[] var21 = new int[var18 * 3];
        int[] var22 = new int[var18 * 3];
        int[] var23 = new int[var18 * 3];
        int[] var24 = new int[var18 * 3];
        int[] var25 = arg3 == null ? null : new int[var18 * 3];
        int[] var26 = arg5 == null ? null : new int[var18 * 3];
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
        this.method1043(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(ZIIIII[[Z)V")
    private final void method1048(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean[][] arg6) {
        int var8 = 87 / ((arg2 - -33) / 40);
        if (this.field2215 != null) {
            int var9 = arg5 - -arg5 + 1;
            int var10 = var9 * var9;
            if (~var10 < ~class72.field1000.length) {
                class72.field1000 = new int[var10];
            }
            int var11 = arg3 - arg5;
            int var12 = var11;
            if (~var11 > -1) {
                var11 = 0;
            }
            int var13 = arg1 - arg5;
            int var14 = var13;
            if (~var13 > -1) {
                var13 = 0;
            }
            int var15 = arg3 - -arg5;
            if (var15 > super.field7581 + -1) {
                var15 = super.field7581 + -1;
            }
            int var16 = arg1 - -arg5;
            if (var16 > super.field7585 + -1) {
                var16 = super.field7585 + -1;
            }
            class170.field2153 = 0;
            for (int var17 = var11; var15 >= var17; ++var17) {
                boolean[] var24 = arg6[-var12 + var17];
                for (int var25 = var13; var16 >= var25; ++var25) {
                    if (var24[-var14 + var25]) {
                        class72.field1000[class170.field2153++] = super.field7581 * var25 + var17;
                    }
                }
            }
            if (arg4 == -1) {
                this.field2182.method3337((byte) 117);
            } else {
                this.field2182.method3322(9, (float) arg4);
                this.field2182.method3314(1);
            }
            this.field2182.method3331((byte) -128);
            this.field2182.method3333(~(this.field2184 & 7) != -1, (byte) 107);
            this.field2182.method3329(-10053, false, false, -1);
            this.field2182.method1171(this.field2212, 0, (byte) -98);
            for (int var18 = 0; ~var18 > ~this.field2215.length; ++var18) {
                this.field2215[var18].method213(class72.field1000, class170.field2153, -128);
            }
            class186 var19 = this.field2182.method3346((byte) 75);
            var19.method361(0, -1, 0);
            this.field2182.method3336((byte) 55);
            if (!this.field2167.method3179(true)) {
                int var20 = this.field2182.field8305;
                int var21 = this.field2182.field8323;
                this.field2182.method923(0, var21, this.field2182.field8302);
                this.field2182.method3333(false, (byte) -111);
                this.field2182.method3284(false, 100);
                this.field2182.method3343(128, 0);
                this.field2182.method3329(-10053, false, false, -2);
                this.field2182.method3344(29639, this.field2182.field8356);
                this.field2182.method3316(class443.field6123, 119, class509.field7093);
                this.field2182.method3300(true, 0, class320.field4434);
                this.field2182.method3307(class542.field7574, 0, 16711680);
                for (class108 var22 = this.field2167.method3188((byte) -100); var22 != null; var22 = this.field2167.method3182((byte) -89)) {
                    class451 var23 = (class451) var22;
                    var23.method2621(arg1, 101, arg3, arg5, arg6);
                }
                this.field2182.method3300(true, 0, class93.field1233);
                this.field2182.method3307(class93.field1233, 0, 16711680);
                this.field2182.method3344(29639, (class11) null);
                this.field2182.method923(var20, var21, this.field2182.field8302);
            }
            if (this.field2188 != null) {
                this.field2182.method1171(this.field2212, 0, (byte) -98);
                this.field2182.method1171(this.field2218, 1, (byte) -98);
                this.field2182.method1207(this.field2211, 1);
                this.field2188.method2282(arg3, -1, arg6, arg5, arg1, arg0);
            }
        }
        ++field2186;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1049(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
