import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nba")
public class class366 extends class543 {

    @OriginalMember(owner = "client!nba", name = "E", descriptor = "Lrk;")
    private class419 field5279 = new class419();

    @OriginalMember(owner = "client!nba", name = "s", descriptor = "I")
    private int field5267 = this.field8119 + -2;

    @OriginalMember(owner = "client!nba", name = "R", descriptor = "[[I")
    private int[][] field5292;

    @OriginalMember(owner = "client!nba", name = "C", descriptor = "Los;")
    public class468 field5277;

    @OriginalMember(owner = "client!nba", name = "V", descriptor = "[[F")
    private float[][] field5296;

    @OriginalMember(owner = "client!nba", name = "D", descriptor = "[[[Lpg;")
    private class413[][][] field5278;

    @OriginalMember(owner = "client!nba", name = "cb", descriptor = "[[F")
    private float[][] field5303;

    @OriginalMember(owner = "client!nba", name = "db", descriptor = "[[B")
    private byte[][] field5304;

    @OriginalMember(owner = "client!nba", name = "X", descriptor = "[[F")
    private float[][] field5298;

    @OriginalMember(owner = "client!nba", name = "l", descriptor = "[[[I")
    private int[][][] field5260;

    @OriginalMember(owner = "client!nba", name = "J", descriptor = "[[S")
    public short[][] field5284;

    @OriginalMember(owner = "client!nba", name = "q", descriptor = "[[[I")
    public int[][][] field5265;

    @OriginalMember(owner = "client!nba", name = "y", descriptor = "[[[I")
    private int[][][] field5273;

    @OriginalMember(owner = "client!nba", name = "x", descriptor = "[[B")
    private byte[][] field5272;

    @OriginalMember(owner = "client!nba", name = "K", descriptor = "[[[I")
    public int[][][] field5285;

    @OriginalMember(owner = "client!nba", name = "v", descriptor = "I")
    public int field5270;

    @OriginalMember(owner = "client!nba", name = "S", descriptor = "I")
    private int field5293;

    @OriginalMember(owner = "client!nba", name = "Q", descriptor = "[[[I")
    private int[][][] field5291;

    @OriginalMember(owner = "client!nba", name = "ib", descriptor = "Lica;")
    private class205 field5309;

    @OriginalMember(owner = "client!nba", name = "u", descriptor = "Lrw;")
    private class128 field5269;

    @OriginalMember(owner = "client!nba", name = "m", descriptor = "I")
    private int field5261;

    @OriginalMember(owner = "client!nba", name = "n", descriptor = "I")
    public static int field5262;

    @OriginalMember(owner = "client!nba", name = "p", descriptor = "I")
    public static int field5264;

    @OriginalMember(owner = "client!nba", name = "r", descriptor = "I")
    public static int field5266;

    @OriginalMember(owner = "client!nba", name = "t", descriptor = "I")
    public static int field5268;

    @OriginalMember(owner = "client!nba", name = "w", descriptor = "I")
    public static int field5271;

    @OriginalMember(owner = "client!nba", name = "z", descriptor = "I")
    public static int field5274;

    @OriginalMember(owner = "client!nba", name = "A", descriptor = "I")
    public static int field5275;

    @OriginalMember(owner = "client!nba", name = "B", descriptor = "I")
    public static int field5276;

    @OriginalMember(owner = "client!nba", name = "F", descriptor = "I")
    public static int field5280;

    @OriginalMember(owner = "client!nba", name = "G", descriptor = "I")
    public static int field5281;

    @OriginalMember(owner = "client!nba", name = "H", descriptor = "I")
    private int field5282;

    @OriginalMember(owner = "client!nba", name = "I", descriptor = "I")
    public static int field5283;

    @OriginalMember(owner = "client!nba", name = "L", descriptor = "I")
    public static int field5286;

    @OriginalMember(owner = "client!nba", name = "M", descriptor = "I")
    public static int field5287;

    @OriginalMember(owner = "client!nba", name = "N", descriptor = "I")
    public static int field5288;

    @OriginalMember(owner = "client!nba", name = "O", descriptor = "I")
    public static int field5289;

    @OriginalMember(owner = "client!nba", name = "P", descriptor = "I")
    public static int field5290;

    @OriginalMember(owner = "client!nba", name = "Y", descriptor = "I")
    public static int field5299;

    @OriginalMember(owner = "client!nba", name = "Z", descriptor = "I")
    private int field5300;

    @OriginalMember(owner = "client!nba", name = "ab", descriptor = "I")
    public static int field5301;

    @OriginalMember(owner = "client!nba", name = "eb", descriptor = "I")
    private int field5305;

    @OriginalMember(owner = "client!nba", name = "fb", descriptor = "I")
    public static int field5306;

    @OriginalMember(owner = "client!nba", name = "U", descriptor = "Laf;")
    private class156 field5295;

    @OriginalMember(owner = "client!nba", name = "W", descriptor = "Laf;")
    public class156 field5297;

    @OriginalMember(owner = "client!nba", name = "bb", descriptor = "Laf;")
    public class156 field5302;

    @OriginalMember(owner = "client!nba", name = "hb", descriptor = "Laf;")
    public class156 field5308;

    @OriginalMember(owner = "client!nba", name = "T", descriptor = "Llq;")
    private class9 field5294;

    // $FF: synthetic field
    @OriginalMember(owner = "client!nba", name = "jb", descriptor = "Ljava/lang/Class;")
    public static Class field5310;

    @OriginalMember(owner = "client!nba", name = "gb", descriptor = "[Lpg;")
    private class413[] field5307;

    @OriginalMember(owner = "client!nba", name = "o", descriptor = "[[[I")
    private int[][][] field5263;

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method1324(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field5274;
        if (~this.field5305 < -1) {
            this.field5277.method2833((byte) 119);
            this.field5277.method2787(false, (byte) 59);
            this.field5277.method2828(5126, false);
            this.field5277.method2836(2929, false);
            this.field5277.method2800(false, -32);
            this.field5277.method2796((byte) -80, 0);
            this.field5277.method2778(-2, 0);
            this.field5277.method2811((class541) null, -2);
            class508.field7555[3] = 0.0F;
            class508.field7555[5] = (float) arg2 / ((float) super.field8116 * 128.0F * (float) this.field5277.field6936);
            class508.field7555[14] = 0.0F;
            class508.field7555[12] = -1.0F - ((float) (arg2 * arg3) / 128.0F + (float) (-(arg0 * 2))) / (float) this.field5277.field6912;
            class508.field7555[9] = 0.0F;
            class508.field7555[13] = 1.0F - ((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field5277.field6936;
            class508.field7555[4] = 0.0F;
            class508.field7555[6] = 0.0F;
            class508.field7555[7] = 0.0F;
            class508.field7555[11] = 0.0F;
            class508.field7555[15] = 1.0F;
            class508.field7555[10] = 0.0F;
            class508.field7555[2] = 0.0F;
            class508.field7555[8] = 0.0F;
            class508.field7555[0] = (float) arg2 / ((float) super.field8116 * 128.0F * (float) this.field5277.field6912);
            class508.field7555[1] = 0.0F;
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadMatrixf(class508.field7555, 0);
            class508.field7555[4] = 0.0F;
            class508.field7555[2] = 0.0F;
            class508.field7555[12] = 0.0F;
            class508.field7555[9] = 1.0F;
            class508.field7555[13] = 0.0F;
            class508.field7555[3] = 0.0F;
            class508.field7555[6] = 1.0F;
            class508.field7555[11] = 0.0F;
            class508.field7555[10] = 0.0F;
            class508.field7555[8] = 0.0F;
            class508.field7555[15] = 1.0F;
            class508.field7555[0] = 1.0F;
            class508.field7555[14] = 0.0F;
            class508.field7555[7] = 0.0F;
            class508.field7555[5] = 0.0F;
            class508.field7555[1] = 0.0F;
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadMatrixf(class508.field7555, 0);
            if (~(7 & this.field5270) == -1) {
                this.field5277.method2828(5126, false);
            } else {
                this.field5277.method2828(5126, true);
                this.field5277.method2809(-8482);
            }
            this.field5277.method2846(this.field5297, this.field5295, this.field5302, 32888, this.field5308);
            if (this.field5282 * 2 <= this.field5277.field7005.field6162.length) {
                this.field5277.field7005.field6221 = 0;
            } else {
                this.field5277.field7005 = new class444(this.field5282 * 2);
            }
            int var9 = 0;
            class444 var10 = this.field5277.field7005;
            if (!this.field5277.field7004) {
                for (int var11 = arg4; ~arg6 < ~var11; ++var11) {
                    int var12 = super.field8121 * var11 + arg3;
                    for (int var13 = arg3; ~var13 > ~arg5; ++var13) {
                        if (arg7[-arg3 + var13][-arg4 + var11]) {
                            short[] var14 = this.field5284[var12];
                            if (var14 != null) {
                                for (int var15 = 0; ~var15 > ~var14.length; ++var15) {
                                    var10.method2590(var14[var15] & 65535, (byte) -127);
                                    ++var9;
                                }
                            }
                        }
                        ++var12;
                    }
                }
            } else {
                for (int var16 = arg4; arg6 > var16; ++var16) {
                    int var18 = super.field8121 * var16 + arg3;
                    for (int var19 = arg3; ~arg5 < ~var19; ++var19) {
                        if (arg7[var19 - arg3][-arg4 + var16]) {
                            short[] var20 = this.field5284[var18];
                            if (var20 != null) {
                                for (int var21 = 0; ~var20.length < ~var21; ++var21) {
                                    ++var9;
                                    var10.method2608(var20[var21] & 65535, (byte) 95);
                                }
                            }
                        }
                        ++var18;
                    }
                }
            }
            if (~var9 < -1) {
                class11 var17 = new class11(this.field5277, 5123, var10.field6162, var10.field6221);
                this.field5277.method2847(-86, var17, 4, var9, 0);
            }
        }
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "([[ZIIBIIZ)V")
    private final void method2235(boolean[][] arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, boolean arg6) {
        if (this.field5307 != null) {
            float var8 = this.field5277.field7061;
            float var9 = this.field5277.field6990;
            int var10 = arg2 + 1 - -arg2;
            int var11 = var10 * var10;
            if (~this.field5277.field7108.length > ~var11) {
                this.field5277.field7108 = new int[var11];
            }
            if (this.field5282 * 2 > this.field5277.field7005.field6162.length) {
                this.field5277.field7005 = new class444(this.field5282 * 2);
            }
            int var12 = arg4 - arg2;
            int var13 = var12;
            if (~var12 > -1) {
                var12 = 0;
            }
            int var14 = arg1 - arg2;
            int var15 = var14;
            if (var14 < 0) {
                var14 = 0;
            }
            int var16 = arg4 - -arg2;
            if (~var16 < ~(super.field8121 + -1)) {
                var16 = super.field8121 - 1;
            }
            int var17 = arg1 + arg2;
            if (var17 > super.field8118 - 1) {
                var17 = super.field8118 + -1;
            }
            int var18 = 0;
            int[] var19 = this.field5277.field7108;
            for (int var20 = var12; var16 >= var20; ++var20) {
                boolean[] var26 = arg0[-var13 + var20];
                for (int var27 = var14; var17 >= var27; ++var27) {
                    if (var26[var27 - var15]) {
                        var19[var18++] = super.field8121 * var27 + var20;
                    }
                }
            }
            if (~arg5 != 0) {
                this.field5277.method2792((float) arg5, true);
                this.field5277.method2794(16);
            } else {
                this.field5277.method2804((byte) 118);
            }
            this.field5277.method2828(5126, ~(7 & this.field5270) != -1);
            for (int var21 = 0; this.field5307.length > var21; ++var21) {
                this.field5307[var21].method2453(var19, var18, -127);
            }
            if (!this.field5279.method2488((byte) 124)) {
                int var22 = this.field5277.field7027;
                int var23 = this.field5277.field7086;
                this.field5277.method974(0, var23, this.field5277.field7010);
                this.field5277.method1009(var9, var8 - 4.0F);
                this.field5277.method2828(5126, false);
                this.field5277.method2800(false, -32);
                this.field5277.method2796((byte) -80, 128);
                this.field5277.method2778(-2, 0);
                this.field5277.method2811(this.field5277.field7058, -2);
                this.field5277.method2852(8448, (byte) 51, 7681);
                this.field5277.method2801(false, 34166, 0, 770);
                this.field5277.method2772(34167, 770, (byte) 68, 0);
                for (class496 var24 = this.field5279.method2496((byte) 100); var24 != null; var24 = this.field5279.method2494(41)) {
                    class620 var25 = (class620) var24;
                    var25.method3589(arg2, arg1, (byte) -51, arg4, arg0);
                }
                this.field5277.method2801(false, 5890, 0, 768);
                this.field5277.method2772(5890, 770, (byte) 75, 0);
                this.field5277.method2811((class541) null, -2);
                this.field5277.method974(var22, var23, this.field5277.field7010);
            }
            if (this.field5269 != null) {
                this.field5277.method1009(var9, var8 - 8.0F);
                this.field5277.method2804((byte) 119);
                this.field5277.method2846(this.field5297, (class156) null, this.field5302, 32888, (class156) null);
                this.field5269.method792(arg6, arg4, arg1, -117, arg2, arg0);
            }
            this.field5277.method1009(var9, var8);
        }
        ++field5306;
        if (arg3 > -87) {
            this.method1318(10, 16, -3, (boolean[][]) null, true);
        }
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(II)V")
    public final void method1330(int arg0, int arg1) {
        ++field5266;
    }

    @OriginalMember(owner = "client!nba", name = "IA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method1320(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (arg3 != null && this.field5291 == null) {
            this.field5291 = new int[super.field8121][super.field8118][];
        }
        if (arg5 != null && this.field5263 == null) {
            this.field5263 = new int[super.field8121][super.field8118][];
        }
        ++field5299;
        this.field5285[arg0][arg1] = arg2;
        this.field5265[arg0][arg1] = arg4;
        this.field5273[arg0][arg1] = arg6;
        this.field5260[arg0][arg1] = arg7;
        if (this.field5263 != null) {
            this.field5263[arg0][arg1] = arg5;
        }
        if (this.field5291 != null) {
            this.field5291[arg0][arg1] = arg3;
        }
        class413[] var15 = this.field5278[arg0][arg1] = new class413[arg6.length];
        for (int var16 = 0; ~var16 > ~arg6.length; ++var16) {
            long var17 = (long) (arg9[var16] << 14) | (long) arg10 << 28 | (long) arg11 << 42 | (long) arg12 << 48 | (long) arg8[var16];
            class496 var19;
            for (var19 = this.field5309.method1333(var17, false); var19 != null; var19 = this.field5309.method1338(-1)) {
                class413 var20 = (class413) var19;
                if (arg8[var16] == var20.field5869 && (float) arg9[var16] == var20.field5875 && ~var20.field5887 == ~arg10 && var20.field5880 == arg11 && var20.field5871 == arg12) {
                    break;
                }
            }
            if (var19 == null) {
                var15[var16] = new class413(this, arg8[var16], arg9[var16], arg10, arg11, arg12);
                this.field5309.method1341(var15[var16], (byte) -98, var17);
            } else {
                var15[var16] = (class413) var19;
            }
        }
        if (arg13) {
            this.field5272[arg0][arg1] = (byte) class313.method1926(this.field5272[arg0][arg1], 1);
        }
        if (~this.field5300 > ~arg6.length) {
            this.field5300 = arg6.length;
        }
        this.field5305 += arg6.length;
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(Lk;IIIIZ)Z")
    public final boolean method1325(class88 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field5289;
        if (this.field5269 != null && arg0 != null) {
            int var7 = -(this.field5277.field7033 * arg2 >> 8) + arg1 >> this.field5277.field6959;
            int var8 = -(this.field5277.field7090 * arg2 >> 8) + arg3 >> this.field5277.field6959;
            return this.field5269.method793(-1, var7, arg0, var8);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nba", name = "Q", descriptor = "(III)V")
    public final void method1317(int arg0, int arg1, int arg2) {
        if (~(this.field5304[arg0][arg1] & 255) > ~arg2) {
            this.field5304[arg0][arg1] = (byte) arg2;
        }
        ++field5288;
    }

    @OriginalMember(owner = "client!nba", name = "ya", descriptor = "(Lk;IIIIZ)V")
    public final void method1322(class88 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field5290;
        if (this.field5269 != null && arg0 != null) {
            int var7 = -(this.field5277.field7033 * arg2 >> 8) + arg1 >> this.field5277.field6959;
            int var8 = -(this.field5277.field7090 * arg2 >> 8) + arg3 >> this.field5277.field6959;
            this.field5269.method798(var8, arg0, 1, var7);
        }
    }

    @OriginalMember(owner = "client!nba", name = "X", descriptor = "(IILk;)Lk;")
    public final class88 method1329(int arg0, int arg1, class88 arg2) {
        ++field5281;
        if ((1 & this.field5272[arg0][arg1]) == 0) {
            return null;
        } else {
            int var4 = super.field8116 >> this.field5277.field6959;
            class469 var5 = (class469) arg2;
            class469 var6;
            if (var5 != null && var5.method2856(var4, (byte) -53, var4)) {
                var6 = var5;
                var5.method2854(72);
            } else {
                var6 = new class469(this.field5277, var4, var4);
            }
            var6.method2857(0, (byte) 0, var4, 0, var4);
            this.method2237(var6, (byte) -82, arg0, arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!nba", name = "b", descriptor = "(I)V")
    public static final void method2236(int arg0) {
        ++field5275;
        if (class353.field5140 != arg0) {
            try {
                Method var1 = (field5310 != null ? field5310 : (field5310 = method2239("java.lang.Runtime"))).getMethod("maxMemory");
                if (var1 != null) {
                    try {
                        Runtime var2 = Runtime.getRuntime();
                        Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                        class223.field3276 = 1 + (int) (var3 / 1048576L);
                        return;
                    } catch (Throwable var4) {
                        return;
                    }
                }
            } catch (Exception var5) {
                return;
            }
        } else {
            class223.field3276 = 96;
        }
    }

    @OriginalMember(owner = "client!nba", name = "aa", descriptor = "(II)I")
    public final int method1323(int arg0, int arg1) {
        ++field5264;
        int var3 = arg0 >> super.field8119;
        int var4 = arg1 >> super.field8119;
        if (var3 >= 0 && ~var4 <= -1 && ~var3 >= ~(super.field8121 - 1) && ~var4 >= ~(super.field8118 + -1)) {
            int var5 = super.field8116 - 1 & arg0;
            int var6 = arg1 & super.field8116 + -1;
            int var7 = (super.field8116 - var5) * this.field5292[var3][var4] + this.field5292[var3 + 1][var4] * var5 >> super.field8119;
            int var8 = (-var5 + super.field8116) * this.field5292[var3][var4 + 1] + this.field5292[var3 + 1][var4 + 1] * var5 >> super.field8119;
            return (super.field8116 - var6) * var7 + var6 * var8 >> super.field8119;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(Lat;[I)V")
    public final void method1328(class535 arg0, int[] arg1) {
        ++field5268;
        this.field5279.method2492(new class620(this.field5277, this, arg0, arg1), (byte) -96);
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(Liaa;BII)V")
    private final void method2237(class469 arg0, byte arg1, int arg2, int arg3) {
        ++field5276;
        if (arg1 == -82) {
            int[] var5 = this.field5285[arg2][arg3];
            int[] var6 = this.field5265[arg2][arg3];
            int var7 = var5.length;
            if (var7 > this.field5277.field7105.length) {
                this.field5277.field7104 = new int[var7];
                this.field5277.field7105 = new int[var7];
            }
            int[] var8 = this.field5277.field7105;
            int[] var9 = this.field5277.field7104;
            for (int var10 = 0; var10 < var7; ++var10) {
                var8[var10] = var5[var10] >> this.field5277.field6959;
                var9[var10] = var6[var10] >> this.field5277.field6959;
            }
            int var11 = 0;
            while (var11 < var7) {
                int var12 = var8[var11];
                int var13 = var9[var11++];
                int var14 = var8[var11];
                int var15 = var9[var11++];
                int var16 = var8[var11];
                int var17 = var9[var11++];
                if (~((var12 - var14) * (var15 - var17) - (-var13 + var15) * (-var14 + var16)) < -1) {
                    arg0.method2859(var16, var14, var17, var15, false, var12, var13);
                }
            }
        }
    }

    @OriginalMember(owner = "client!nba", name = "F", descriptor = "(Lk;IIIIZ)V")
    public final void method1314(class88 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field5286;
        if (this.field5269 != null && arg0 != null) {
            int var7 = -(this.field5277.field7033 * arg2 >> 8) + arg1 >> this.field5277.field6959;
            int var8 = -(this.field5277.field7090 * arg2 >> 8) + arg3 >> this.field5277.field6959;
            this.field5269.method795(var7, arg0, var8, 25250);
        }
    }

    @OriginalMember(owner = "client!nba", name = "<init>", descriptor = "(Los;IIII[[I[[II)V")
    public class366(class468 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7);
        this.field5292 = arg5;
        this.field5277 = arg0;
        this.field5296 = new float[super.field8121 + 1][super.field8118 + 1];
        this.field5278 = new class413[arg3][arg4][];
        this.field5303 = new float[super.field8121 + 1][super.field8118 + 1];
        this.field5304 = new byte[arg3 + 1][arg4 + 1];
        this.field5298 = new float[super.field8121 + 1][super.field8118 + 1];
        this.field5260 = new int[arg3][arg4][];
        this.field5284 = new short[arg3 * arg4][];
        this.field5265 = new int[arg3][arg4][];
        this.field5273 = new int[arg3][arg4][];
        this.field5272 = new byte[arg3][arg4];
        this.field5285 = new int[arg3][arg4][];
        this.field5270 = arg2;
        this.field5293 = 1 << this.field5267;
        this.field5291 = new int[arg3][arg4][];
        for (int var9 = 1; ~super.field8118 < ~var9; ++var9) {
            for (int var10 = 1; super.field8121 > var10; ++var10) {
                int var11 = arg6[var10 - -1][var9] - arg6[var10 + -1][var9];
                int var12 = arg6[var10][var9 - -1] + -arg6[var10][var9 + -1];
                float var13 = (float) (1.0D / Math.sqrt((double) (var12 * var12 + (var11 * var11 - -(arg7 * 4 * arg7)))));
                this.field5298[var10][var9] = (float) var11 * var13;
                this.field5303[var10][var9] = (float) (-arg7 * 2) * var13;
                this.field5296[var10][var9] = (float) var12 * var13;
            }
        }
        this.field5309 = new class205(128);
        if (~(16 & this.field5270) != -1) {
            this.field5269 = new class128(this.field5277, this);
        }
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method1326(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field5287;
        int var18 = arg9.length;
        int[] var19 = new int[var18 * 3];
        int[] var20 = new int[var18 * 3];
        int[] var21 = new int[var18 * 3];
        int[] var22 = new int[var18 * 3];
        int[] var23 = new int[var18 * 3];
        int[] var24 = new int[var18 * 3];
        int[] var25 = arg3 != null ? new int[var18 * 3] : null;
        int[] var26 = arg5 == null ? null : new int[var18 * 3];
        int var27 = 0;
        for (int var28 = 0; ~var18 < ~var28; ++var28) {
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
        this.method1320(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(IIIII)V")
    public static final void method2238(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5280;
        class221.field3268.field6221 = 0;
        class221.field3268.method2563(arg3 + -78447, class538.field7964.field8954);
        class221.field3268.method2563(-13021, arg4);
        class221.field3268.method2563(-13021, arg0);
        class221.field3268.method2608(arg2, (byte) 113);
        class221.field3268.method2608(arg1, (byte) 123);
        class427.field6090 = -3;
        class304.field4433 = 1;
        class172.field2331 = 0;
        if (arg3 != 65426) {
            field5271 = 34;
        }
        class567.field8413 = 0;
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(III[[ZZ)V")
    public final void method1318(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        ++field5283;
        this.method2235(arg3, arg1, arg2, (byte) -94, arg0, -1, arg4);
    }

    @OriginalMember(owner = "client!nba", name = "ba", descriptor = "(II)I")
    public final int method1319(int arg0, int arg1) {
        ++field5301;
        return this.field5292[arg0][arg1];
    }

    @OriginalMember(owner = "client!nba", name = "N", descriptor = "()V")
    public final void method1321() {
        if (~this.field5305 >= -1) {
            this.field5269 = null;
        } else {
            byte[][] var1 = new byte[super.field8121 + 1][super.field8118 + 1];
            for (int var2 = 1; var2 < super.field8121; ++var2) {
                for (int var103 = 1; ~var103 > ~super.field8118; ++var103) {
                    var1[var2][var103] = (byte) ((this.field5304[var2][var103 + 1] >> 3) + (this.field5304[var2][var103] >> 1) + (this.field5304[var2 + -1][var103] >> 2) + (this.field5304[var2][var103 + -1] >> 2) + (this.field5304[var2 + 1][var103] >> 3));
                }
            }
            this.field5307 = new class413[this.field5309.method1337(0)];
            this.field5309.method1335(this.field5307, 0);
            for (int var3 = 0; ~var3 > ~this.field5307.length; ++var3) {
                this.field5307[var3].method2451(this.field5305, 36);
            }
            int var4 = 24;
            if (this.field5263 != null) {
                var4 += 4;
            }
            if ((this.field5270 & 7) != 0) {
                var4 += 12;
            }
            NativeHeapBuffer var5 = this.field5277.field6964.method3320(this.field5305 * var4, false);
            Stream var6 = new Stream(var5);
            class413[] var7 = new class413[this.field5305];
            int var8 = class239.method1537(-24644, this.field5305 / 4);
            if (~var8 > -2) {
                var8 = 1;
            }
            class205 var9 = new class205(var8);
            class413[] var10 = new class413[this.field5300];
            for (int var11 = 0; super.field8121 > var11; ++var11) {
                for (int var30 = 0; ~super.field8118 < ~var30; ++var30) {
                    if (this.field5273[var11][var30] != null) {
                        class413[] var31 = this.field5278[var11][var30];
                        int[] var32 = this.field5285[var11][var30];
                        int[] var33 = this.field5265[var11][var30];
                        int[] var34 = this.field5260[var11][var30];
                        int[] var35 = this.field5273[var11][var30];
                        int[] var36 = this.field5291 == null ? null : this.field5291[var11][var30];
                        int[] var37 = this.field5263 != null ? this.field5263[var11][var30] : null;
                        if (var34 == null) {
                            var34 = var35;
                        }
                        float var38 = this.field5298[var11][var30];
                        float var39 = this.field5303[var11][var30];
                        float var40 = this.field5296[var11][var30];
                        float var41 = this.field5298[var11][var30 + 1];
                        float var42 = this.field5303[var11][var30 + 1];
                        float var43 = this.field5296[var11][var30 + 1];
                        float var44 = this.field5298[var11 + 1][var30 + 1];
                        float var45 = this.field5303[var11 + 1][var30 + 1];
                        float var46 = this.field5296[var11 + 1][var30 + 1];
                        float var47 = this.field5298[var11 - -1][var30];
                        float var48 = this.field5303[var11 + 1][var30];
                        float var49 = this.field5296[var11 + 1][var30];
                        int var50 = var1[var11][var30] & 255;
                        int var51 = var1[var11][var30 + 1] & 255;
                        int var52 = var1[var11 - -1][var30 - -1] & 255;
                        int var53 = var1[var11 - -1][var30] & 255;
                        int var54 = 0;
                        label340: for (int var55 = 0; ~var35.length < ~var55; ++var55) {
                            class413 var101 = var31[var55];
                            for (int var102 = 0; ~var102 > ~var54; ++var102) {
                                if (var10[var102] == var101) {
                                    continue label340;
                                }
                            }
                            var10[var54++] = var101;
                        }
                        short[] var56 = this.field5284[super.field8121 * var30 + var11] = new short[var35.length];
                        for (int var57 = 0; var35.length > var57; ++var57) {
                            int var58 = (var11 << super.field8119) + var32[var57];
                            int var59 = (var30 << super.field8119) + var33[var57];
                            int var60 = var58 >> this.field5267;
                            int var61 = var59 >> this.field5267;
                            int var62 = var35[var57];
                            int var63 = var34[var57];
                            int var64 = var36 != null ? var36[var57] : 0;
                            long var65 = (long) var61 | (long) (var60 << 16) | (long) var62 << 32 | (long) var63 << 48;
                            int var67 = var32[var57];
                            int var68 = var33[var57];
                            byte var69 = 74;
                            int var70 = 0;
                            float var71 = 1.0F;
                            float var72;
                            float var73;
                            int var74;
                            float var75;
                            if (var67 == 0 && var68 == 0) {
                                var72 = var40;
                                var73 = var38;
                                var74 = var69 - var50;
                                var75 = var39;
                            } else if (~var67 == -1 && super.field8116 == var68) {
                                var72 = var43;
                                var75 = var42;
                                var74 = var69 - var51;
                                var73 = var41;
                            } else if (super.field8116 == var67 && ~super.field8116 == ~var68) {
                                var72 = var46;
                                var73 = var44;
                                var75 = var45;
                                var74 = var69 - var52;
                            } else if (~super.field8116 == ~var67 && ~var68 == -1) {
                                var72 = var49;
                                var73 = var47;
                                var75 = var48;
                                var74 = var69 - var53;
                            } else {
                                float var76 = (float) var67 / (float) super.field8116;
                                float var77 = (float) var68 / (float) super.field8116;
                                float var78 = (-var38 + var47) * var76 + var38;
                                float var79 = (var48 - var39) * var76 + var39;
                                float var80 = (-var40 + var49) * var76 + var40;
                                float var81 = (var44 - var41) * var76 + var41;
                                float var82 = (-var42 + var45) * var76 + var42;
                                float var83 = (-var43 + var46) * var76 + var43;
                                var75 = (var82 - var79) * var77 + var79;
                                var73 = (var81 - var78) * var77 + var78;
                                var72 = (var83 - var80) * var77 + var80;
                                int var84 = ((-var50 + var53) * var67 >> super.field8119) + var50;
                                int var85 = ((var52 - var51) * var67 >> super.field8119) + var51;
                                var74 = var69 - (((-var84 + var85) * var68 >> super.field8119) + var84);
                            }
                            if (~var62 != 0) {
                                int var86 = (var62 & 127) * var74 >> 7;
                                if (~var86 <= -3) {
                                    if (var86 > 126) {
                                        var86 = 126;
                                    }
                                } else {
                                    var86 = 2;
                                }
                                if (~(7 & this.field5270) == -1) {
                                    float var87 = this.field5277.field7036[2] * var72 + this.field5277.field7036[1] * var75 + this.field5277.field7036[0] * var73;
                                    var71 = this.field5277.field7000 + (!(var87 > 0.0F) ? this.field5277.field7046 : this.field5277.field7045) * var87;
                                }
                                var70 = class620.field9045[var86 | 65408 & var62];
                            }
                            class496 var88 = null;
                            if (~(var58 & this.field5293 + -1) == -1 && ~(this.field5293 + -1 & var59) == -1) {
                                var88 = var9.method1333(var65, false);
                            }
                            int var89;
                            if (var88 != null) {
                                var56[var57] = ((class168) var88).field2272;
                                var89 = var56[var57] & 65535;
                                if (var62 != -1 && var31[var57].field7465 < var7[var89].field7465) {
                                    var7[var89] = var31[var57];
                                }
                            } else {
                                int var90;
                                if (~var62 == ~var63) {
                                    var90 = var70;
                                } else {
                                    int var91 = (127 & var63) * var74 >> 7;
                                    if (var91 >= 2) {
                                        if (var91 > 126) {
                                            var91 = 126;
                                        }
                                    } else {
                                        var91 = 2;
                                    }
                                    var90 = class620.field9045[var63 & 65408 | var91];
                                    if ((7 & this.field5270) == 0) {
                                        float var92 = this.field5277.field7036[2] * var72 + this.field5277.field7036[1] * var75 + this.field5277.field7036[0] * var73;
                                        float var93 = (!(var71 > 0.0F) ? this.field5277.field7046 : this.field5277.field7045) * var71 + this.field5277.field7000;
                                        int var94 = (16774489 & var90) >> 16;
                                        int var95 = (65426 & var90) >> 8;
                                        int var96 = 255 & var90;
                                        int var97 = (int) ((float) var94 * var93);
                                        int var98 = (int) ((float) var95 * var93);
                                        if (~var97 <= -1) {
                                            if (var97 > 255) {
                                                var97 = 255;
                                            }
                                        } else {
                                            var97 = 0;
                                        }
                                        int var99 = (int) ((float) var96 * var93);
                                        if (var98 < 0) {
                                            var98 = 0;
                                        } else if (var98 > 255) {
                                            var98 = 255;
                                        }
                                        if (var99 >= 0) {
                                            if (~var99 < -256) {
                                                var99 = 255;
                                            }
                                        } else {
                                            var99 = 0;
                                        }
                                        var90 = var98 << 8 | var97 << 16 | var99;
                                    }
                                }
                                if (this.field5277.field7004) {
                                    var6.method3326((float) var58);
                                    var6.method3326((float) (var64 + this.method1323(var58, var59)));
                                    var6.method3326((float) var59);
                                    var6.method3330((byte) (var90 >> 16));
                                    var6.method3330((byte) (var90 >> 8));
                                    var6.method3330((byte) var90);
                                    var6.method3330(-1);
                                    var6.method3326((float) var58);
                                    var6.method3326((float) var59);
                                    if (this.field5263 != null) {
                                        var6.method3326((float) (var37 != null ? var37[var57] + -1 : 0));
                                    }
                                    if ((this.field5270 & 7) != 0) {
                                        var6.method3326(var73);
                                        var6.method3326(var75);
                                        var6.method3326(var72);
                                    }
                                } else {
                                    var6.method3333((float) var58);
                                    var6.method3333((float) (var64 + this.method1323(var58, var59)));
                                    var6.method3333((float) var59);
                                    var6.method3330((byte) (var90 >> 16));
                                    var6.method3330((byte) (var90 >> 8));
                                    var6.method3330((byte) var90);
                                    var6.method3330(-1);
                                    var6.method3333((float) var58);
                                    var6.method3333((float) var59);
                                    if (this.field5263 != null) {
                                        var6.method3333((float) (var37 != null ? var37[var57] + -1 : 0));
                                    }
                                    if (~(7 & this.field5270) != -1) {
                                        var6.method3333(var73);
                                        var6.method3333(var75);
                                        var6.method3333(var72);
                                    }
                                }
                                var89 = this.field5261++;
                                var56[var57] = (short) var89;
                                if (~var62 != 0) {
                                    var7[var89] = var31[var57];
                                }
                                var9.method1341(new class168(var56[var57]), (byte) 53, var65);
                            }
                            for (int var100 = 0; ~var100 > ~var54; ++var100) {
                                var10[var100].method2452(var71, var70, var89, var74, -5434);
                            }
                            ++this.field5282;
                        }
                    }
                }
            }
            for (int var12 = 0; this.field5261 > var12; ++var12) {
                class413 var29 = var7[var12];
                if (var29 != null) {
                    var29.method2450(6107, var12);
                }
            }
            for (int var13 = 0; ~super.field8121 < ~var13; ++var13) {
                for (int var18 = 0; super.field8118 > var18; ++var18) {
                    short[] var19 = this.field5284[super.field8121 * var18 + var13];
                    if (var19 != null) {
                        int var20 = 0;
                        int var21 = 0;
                        while (~var19.length < ~var21) {
                            int var22 = var19[var21++] & 65535;
                            int var23 = var19[var21++] & 65535;
                            int var24 = 65535 & var19[var21++];
                            class413 var25 = var7[var22];
                            class413 var26 = var7[var23];
                            class413 var27 = var7[var24];
                            class413 var28 = null;
                            if (var25 != null) {
                                var28 = var25;
                                var25.method2447(var20, -20211, var18, var13);
                            }
                            if (var26 != null) {
                                var26.method2447(var20, -20211, var18, var13);
                                if (var28 == null || ~var28.field7465 < ~var26.field7465) {
                                    var28 = var26;
                                }
                            }
                            if (var27 != null) {
                                var27.method2447(var20, -20211, var18, var13);
                                if (var28 == null || var28.field7465 > var27.field7465) {
                                    var28 = var27;
                                }
                            }
                            if (var28 != null) {
                                if (var25 != null) {
                                    var28.method2450(6107, var22);
                                }
                                if (var26 != null) {
                                    var28.method2450(6107, var23);
                                }
                                if (var27 != null) {
                                    var28.method2450(6107, var24);
                                }
                                var28.method2447(var20, -20211, var18, var13);
                            }
                            ++var20;
                        }
                    }
                }
            }
            var6.method3332();
            this.field5294 = this.field5277.method2830(var4, var5, var6.method3331(), -313244496, false);
            this.field5297 = new class156(this.field5294, 5126, 3, 0);
            this.field5295 = new class156(this.field5294, 5121, 4, 12);
            byte var14;
            if (this.field5263 == null) {
                var14 = 24;
                this.field5302 = new class156(this.field5294, 5126, 2, 16);
            } else {
                this.field5302 = new class156(this.field5294, 5126, 3, 16);
                var14 = 28;
            }
            if ((this.field5270 & 7) != 0) {
                this.field5308 = new class156(this.field5294, 5126, 3, var14);
            }
            long[] var15 = new long[this.field5307.length];
            for (int var16 = 0; ~this.field5307.length < ~var16; ++var16) {
                class413 var17 = this.field5307[var16];
                var15[var16] = var17.field7465;
                var17.method2448(-22051, this.field5261);
            }
            class29.method127(var15, (byte) -125, this.field5307);
            if (this.field5269 != null) {
                this.field5269.method800((byte) -116);
            }
        }
        ++field5262;
        this.field5285 = this.field5265 = null;
        this.field5309 = null;
        this.field5291 = null;
        this.field5273 = null;
        this.field5260 = null;
        this.field5278 = null;
        this.field5304 = null;
        this.field5298 = this.field5303 = this.field5296 = null;
        this.field5263 = null;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2239(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class487("You have been removed from this channel.", "Du wurdest aus dem Chatraum entfernt.", "Vous avez été supprimé de ce canal.", "Você foi retirado desse canal.");
    }
}
