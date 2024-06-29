import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ot")
public class class540 extends class136 {

    @OriginalMember(owner = "client!ot", name = "T", descriptor = "Lsu;")
    private class192 field7350 = new class192();

    @OriginalMember(owner = "client!ot", name = "H", descriptor = "Len;")
    public class289 field7339;

    @OriginalMember(owner = "client!ot", name = "W", descriptor = "[[I")
    private int[][] field7353;

    @OriginalMember(owner = "client!ot", name = "m", descriptor = "I")
    private int field7318;

    @OriginalMember(owner = "client!ot", name = "E", descriptor = "[[[I")
    private int[][][] field7336;

    @OriginalMember(owner = "client!ot", name = "x", descriptor = "[[B")
    private byte[][] field7329;

    @OriginalMember(owner = "client!ot", name = "ab", descriptor = "[[F")
    private float[][] field7357;

    @OriginalMember(owner = "client!ot", name = "t", descriptor = "[[[Loq;")
    private class327[][][] field7325;

    @OriginalMember(owner = "client!ot", name = "D", descriptor = "[[[I")
    public int[][][] field7335;

    @OriginalMember(owner = "client!ot", name = "O", descriptor = "[[[I")
    public int[][][] field7345;

    @OriginalMember(owner = "client!ot", name = "R", descriptor = "[[[I")
    private int[][][] field7348;

    @OriginalMember(owner = "client!ot", name = "Z", descriptor = "[[F")
    private float[][] field7356;

    @OriginalMember(owner = "client!ot", name = "fb", descriptor = "[[B")
    private byte[][] field7362;

    @OriginalMember(owner = "client!ot", name = "Q", descriptor = "[[S")
    public short[][] field7347;

    @OriginalMember(owner = "client!ot", name = "L", descriptor = "[[[I")
    public int[][][] field7342;

    @OriginalMember(owner = "client!ot", name = "s", descriptor = "I")
    private int field7324;

    @OriginalMember(owner = "client!ot", name = "cb", descriptor = "[[F")
    private float[][] field7359;

    @OriginalMember(owner = "client!ot", name = "K", descriptor = "I")
    public int field7341;

    @OriginalMember(owner = "client!ot", name = "lb", descriptor = "Loj;")
    private class346 field7368;

    @OriginalMember(owner = "client!ot", name = "w", descriptor = "Lmg;")
    private class134 field7328;

    @OriginalMember(owner = "client!ot", name = "n", descriptor = "I")
    public static int field7319;

    @OriginalMember(owner = "client!ot", name = "o", descriptor = "I")
    public static int field7320;

    @OriginalMember(owner = "client!ot", name = "p", descriptor = "I")
    public static int field7321;

    @OriginalMember(owner = "client!ot", name = "q", descriptor = "I")
    public static int field7322;

    @OriginalMember(owner = "client!ot", name = "r", descriptor = "I")
    public static int field7323;

    @OriginalMember(owner = "client!ot", name = "u", descriptor = "I")
    public static int field7326;

    @OriginalMember(owner = "client!ot", name = "v", descriptor = "I")
    public static int field7327;

    @OriginalMember(owner = "client!ot", name = "y", descriptor = "I")
    private int field7330;

    @OriginalMember(owner = "client!ot", name = "z", descriptor = "I")
    public static int field7331;

    @OriginalMember(owner = "client!ot", name = "A", descriptor = "I")
    public static int field7332;

    @OriginalMember(owner = "client!ot", name = "B", descriptor = "I")
    public static int field7333;

    @OriginalMember(owner = "client!ot", name = "C", descriptor = "I")
    private int field7334;

    @OriginalMember(owner = "client!ot", name = "F", descriptor = "I")
    public static int field7337;

    @OriginalMember(owner = "client!ot", name = "I", descriptor = "I")
    public static int field7340;

    @OriginalMember(owner = "client!ot", name = "M", descriptor = "I")
    public static int field7343;

    @OriginalMember(owner = "client!ot", name = "P", descriptor = "I")
    public static int field7346;

    @OriginalMember(owner = "client!ot", name = "S", descriptor = "I")
    public static int field7349;

    @OriginalMember(owner = "client!ot", name = "U", descriptor = "I")
    public static int field7351;

    @OriginalMember(owner = "client!ot", name = "V", descriptor = "I")
    public static int field7352;

    @OriginalMember(owner = "client!ot", name = "X", descriptor = "I")
    private int field7354;

    @OriginalMember(owner = "client!ot", name = "bb", descriptor = "I")
    public static int field7358;

    @OriginalMember(owner = "client!ot", name = "gb", descriptor = "I")
    public static int field7363;

    @OriginalMember(owner = "client!ot", name = "ib", descriptor = "I")
    private int field7365;

    @OriginalMember(owner = "client!ot", name = "N", descriptor = "Ldr;")
    public static class660 field7344;

    @OriginalMember(owner = "client!ot", name = "Y", descriptor = "Lpn;")
    private class682 field7355;

    @OriginalMember(owner = "client!ot", name = "db", descriptor = "Lkca;")
    private class74 field7360;

    @OriginalMember(owner = "client!ot", name = "eb", descriptor = "Lkca;")
    public class74 field7361;

    @OriginalMember(owner = "client!ot", name = "hb", descriptor = "Lkca;")
    public class74 field7364;

    @OriginalMember(owner = "client!ot", name = "jb", descriptor = "Lkca;")
    public class74 field7366;

    @OriginalMember(owner = "client!ot", name = "kb", descriptor = "[Loq;")
    private class327[] field7367;

    @OriginalMember(owner = "client!ot", name = "G", descriptor = "[[[I")
    private int[][][] field7338;

    @OriginalMember(owner = "client!ot", name = "BA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method266(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (arg3 != null && this.field7336 == null) {
            this.field7336 = new int[super.field1918][super.field1916][];
        }
        ++field7351;
        if (arg5 != null && this.field7338 == null) {
            this.field7338 = new int[super.field1918][super.field1916][];
        }
        this.field7345[arg0][arg1] = arg2;
        this.field7335[arg0][arg1] = arg4;
        this.field7342[arg0][arg1] = arg6;
        this.field7348[arg0][arg1] = arg7;
        if (this.field7338 != null) {
            this.field7338[arg0][arg1] = arg5;
        }
        if (this.field7336 != null) {
            this.field7336[arg0][arg1] = arg3;
        }
        class327[] var15 = this.field7325[arg0][arg1] = new class327[arg6.length];
        for (int var16 = 0; var16 < arg6.length; ++var16) {
            long var17 = (long) (arg9[var16] << 14) | (long) arg11 << 42 | (long) arg12 << 48 | (long) arg10 << 28 | (long) arg8[var16];
            class539 var19;
            for (var19 = this.field7368.method2061(-17305, var17); var19 != null; var19 = this.field7368.method2064(6654)) {
                class327 var20 = (class327) var19;
                if (arg8[var16] == var20.field4838 && (float) arg9[var16] == var20.field4825 && var20.field4835 == arg10 && var20.field4820 == arg11 && ~var20.field4821 == ~arg12) {
                    break;
                }
            }
            if (var19 != null) {
                var15[var16] = (class327) var19;
            } else {
                var15[var16] = new class327(this, arg8[var16], arg9[var16], arg10, arg11, arg12);
                this.field7368.method2063(var17, 1, var15[var16]);
            }
        }
        if (arg13) {
            this.field7329[arg0][arg1] = (byte) class266.method1624(this.field7329[arg0][arg1], 1);
        }
        if (this.field7365 < arg6.length) {
            this.field7365 = arg6.length;
        }
        this.field7354 += arg6.length;
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(III[[ZZ)V")
    public final void method271(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        ++field7363;
        this.method2977(-1, arg3, arg4, (byte) -105, arg0, arg2, arg1);
    }

    @OriginalMember(owner = "client!ot", name = "aa", descriptor = "(Lw;IIIIZ)V")
    public final void method277(class271 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field7326;
        if (this.field7328 != null && arg0 != null) {
            int var7 = -(this.field7339.field4357 * arg2 >> 8) + arg1 >> this.field7339.field4219;
            int var8 = arg3 - (this.field7339.field4248 * arg2 >> 8) >> this.field7339.field4219;
            this.field7328.method964(arg0, var7, 0, var8);
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method274(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field7320;
        if (~this.field7354 < -1) {
            this.field7339.method1749(-1);
            this.field7339.method1778(false, (byte) 28);
            this.field7339.method1777(false, 39);
            this.field7339.method1779(true, false);
            this.field7339.method1805(false, (byte) 58);
            this.field7339.method1768(0, -127);
            this.field7339.method1789((byte) -51, -2);
            this.field7339.method1804(false, (class591) null);
            class314.field4663[6] = 0.0F;
            class314.field4663[2] = 0.0F;
            class314.field4663[8] = 0.0F;
            class314.field4663[1] = 0.0F;
            class314.field4663[0] = (float) arg2 / ((float) super.field1919 * 128.0F * (float) this.field7339.field4110);
            class314.field4663[12] = -1.0F - ((float) (arg2 * arg3) / 128.0F + (float) (-(arg0 * 2))) / (float) this.field7339.field4110;
            class314.field4663[14] = 0.0F;
            class314.field4663[7] = 0.0F;
            class314.field4663[15] = 1.0F;
            class314.field4663[13] = -(((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field7339.field4036) + 1.0F;
            class314.field4663[5] = (float) arg2 / ((float) super.field1919 * 128.0F * (float) this.field7339.field4036);
            class314.field4663[4] = 0.0F;
            class314.field4663[10] = 0.0F;
            class314.field4663[11] = 0.0F;
            class314.field4663[9] = 0.0F;
            class314.field4663[3] = 0.0F;
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadMatrixf(class314.field4663, 0);
            class314.field4663[12] = 0.0F;
            class314.field4663[0] = 1.0F;
            class314.field4663[5] = 0.0F;
            class314.field4663[7] = 0.0F;
            class314.field4663[8] = 0.0F;
            class314.field4663[1] = 0.0F;
            class314.field4663[4] = 0.0F;
            class314.field4663[3] = 0.0F;
            class314.field4663[10] = 0.0F;
            class314.field4663[14] = 0.0F;
            class314.field4663[9] = 1.0F;
            class314.field4663[15] = 1.0F;
            class314.field4663[13] = 0.0F;
            class314.field4663[11] = 0.0F;
            class314.field4663[6] = 1.0F;
            class314.field4663[2] = 0.0F;
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadMatrixf(class314.field4663, 0);
            if ((7 & this.field7341) == 0) {
                this.field7339.method1777(false, -8);
            } else {
                this.field7339.method1777(true, 92);
                this.field7339.method1745((byte) -110);
            }
            this.field7339.method1744(this.field7364, (byte) -91, this.field7366, this.field7360, this.field7361);
            if (~this.field7339.field4289.field1316.length <= ~(this.field7334 * 2)) {
                this.field7339.field4289.field1301 = 0;
            } else {
                this.field7339.field4289 = new class57(this.field7334 * 2);
            }
            int var9 = 0;
            class57 var10 = this.field7339.field4289;
            if (this.field7339.field4362) {
                for (int var11 = arg4; ~var11 > ~arg6; ++var11) {
                    int var12 = super.field1918 * var11 + arg3;
                    for (int var13 = arg3; arg5 > var13; ++var13) {
                        if (arg7[-arg3 + var13][var11 - arg4]) {
                            short[] var14 = this.field7347[var12];
                            if (var14 != null) {
                                for (int var15 = 0; var14.length > var15; ++var15) {
                                    var10.method731(-2045573048, 65535 & var14[var15]);
                                    ++var9;
                                }
                            }
                        }
                        ++var12;
                    }
                }
            } else {
                for (int var16 = arg4; arg6 > var16; ++var16) {
                    int var18 = super.field1918 * var16 + arg3;
                    for (int var19 = arg3; ~var19 > ~arg5; ++var19) {
                        if (arg7[-arg3 + var19][-arg4 + var16]) {
                            short[] var20 = this.field7347[var18];
                            if (var20 != null) {
                                for (int var21 = 0; var21 < var20.length; ++var21) {
                                    ++var9;
                                    var10.method720(4, var20[var21] & 65535);
                                }
                            }
                        }
                        ++var18;
                    }
                }
            }
            if (var9 > 0) {
                class135 var17 = new class135(this.field7339, 5123, var10.field1316, var10.field1301);
                this.field7339.method1822(var9, var17, 0, (byte) 63, 4);
            }
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(Lmv;III)V")
    private final void method2973(class341 arg0, int arg1, int arg2, int arg3) {
        ++field7319;
        int[] var5 = this.field7345[arg1][arg2];
        int[] var6 = this.field7335[arg1][arg2];
        int var7 = var5.length;
        if (~this.field7339.field4368.length > ~var7) {
            this.field7339.field4368 = new int[var7];
            this.field7339.field4366 = new int[var7];
        }
        int[] var8 = this.field7339.field4368;
        if (arg3 == 12) {
            int[] var9 = this.field7339.field4366;
            for (int var10 = 0; var10 < var7; ++var10) {
                var8[var10] = var5[var10] >> this.field7339.field4219;
                var9[var10] = var6[var10] >> this.field7339.field4219;
            }
            int var11 = 0;
            while (var7 > var11) {
                int var12 = var8[var11];
                int var13 = var9[var11++];
                int var14 = var8[var11];
                int var15 = var9[var11++];
                int var16 = var8[var11];
                int var17 = var9[var11++];
                if ((-var14 + var12) * (-var17 + var15) - (-var13 + var15) * (-var14 + var16) > 0) {
                    arg0.method2041(var16, var17, (byte) -91, var14, var15, var13, var12);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ot", name = "<init>", descriptor = "(Len;IIII[[I[[II)V")
    public class540(class289 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7);
        this.field7339 = arg0;
        this.field7353 = arg5;
        this.field7318 = super.field1921 - 2;
        this.field7336 = new int[arg3][arg4][];
        this.field7329 = new byte[arg3][arg4];
        this.field7357 = new float[super.field1918 + 1][super.field1916 + 1];
        this.field7325 = new class327[arg3][arg4][];
        this.field7335 = new int[arg3][arg4][];
        this.field7345 = new int[arg3][arg4][];
        this.field7348 = new int[arg3][arg4][];
        this.field7356 = new float[super.field1918 - -1][super.field1916 + 1];
        this.field7362 = new byte[arg3 + 1][arg4 + 1];
        this.field7347 = new short[arg3 * arg4][];
        this.field7342 = new int[arg3][arg4][];
        this.field7324 = 1 << this.field7318;
        this.field7359 = new float[super.field1918 + 1][super.field1916 + 1];
        this.field7341 = arg2;
        for (int var9 = 1; ~super.field1916 < ~var9; ++var9) {
            for (int var10 = 1; ~var10 > ~super.field1918; ++var10) {
                int var11 = arg6[var10 + 1][var9] + -arg6[var10 + -1][var9];
                int var12 = arg6[var10][var9 + 1] - arg6[var10][var9 + -1];
                float var13 = (float) (1.0D / Math.sqrt((double) (var12 * var12 + arg7 * 4 * arg7 + var11 * var11)));
                this.field7359[var10][var9] = (float) var11 * var13;
                this.field7356[var10][var9] = (float) (-arg7 * 2) * var13;
                this.field7357[var10][var9] = (float) var12 * var13;
            }
        }
        this.field7368 = new class346(128);
        if (~(16 & this.field7341) != -1) {
            this.field7328 = new class134(this.field7339, this);
        }
    }

    @OriginalMember(owner = "client!ot", name = "sa", descriptor = "(II)I")
    public final int method267(int arg0, int arg1) {
        ++field7332;
        int var3 = arg0 >> super.field1921;
        int var4 = arg1 >> super.field1921;
        if (~var3 <= -1 && var4 >= 0 && ~var3 >= ~(super.field1918 + -1) && var4 <= super.field1916 + -1) {
            int var5 = arg0 & super.field1919 + -1;
            int var6 = arg1 & super.field1919 - 1;
            int var7 = (super.field1919 - var5) * this.field7353[var3][var4] - -(this.field7353[var3 + 1][var4] * var5) >> super.field1921;
            int var8 = (-var5 + super.field1919) * this.field7353[var3][var4 - -1] + this.field7353[var3 + 1][var4 + 1] * var5 >> super.field1921;
            return (super.field1919 - var6) * var7 + var6 * var8 >> super.field1921;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(II)V")
    public final void method280(int arg0, int arg1) {
        ++field7352;
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(IILjava/lang/String;)V")
    public static final void method2974(int arg0, int arg1, String arg2) {
        ++field7358;
        int var3 = class64.field851;
        int[] var4 = class53.field759;
        boolean var5 = false;
        int var6 = -2 % ((-55 - arg0) / 39);
        for (int var7 = 0; var3 > var7; ++var7) {
            class286 var8 = class495.field6821[var4[var7]];
            if (var8 != null && class253.field3576 != var8 && var8.field3975 != null && var8.field3975.equalsIgnoreCase(arg2)) {
                if (~arg1 != -2) {
                    if (~arg1 != -5) {
                        if (~arg1 != -6) {
                            if (~arg1 == -7) {
                                class1.method5(1, class94.field1235);
                                ++class680.field9581;
                                class288.field4014.method742((byte) -101, 0);
                                class288.field4014.method740(var4[var7], true);
                            } else if (~arg1 == -8) {
                                class1.method5(1, class174.field2607);
                                ++class690.field9697;
                                class288.field4014.method746((byte) -91, 0);
                                class288.field4014.method757(true, var4[var7]);
                            }
                        } else {
                            ++class257.field3620;
                            class1.method5(1, class507.field6948);
                            class288.field4014.method740(var4[var7], true);
                            class288.field4014.method746((byte) -118, 0);
                        }
                    } else {
                        class1.method5(1, class194.field2878);
                        ++class37.field502;
                        class288.field4014.method742((byte) -101, 0);
                        class288.field4014.method752(87, var4[var7]);
                    }
                } else {
                    class1.method5(1, class675.field9544);
                    ++class448.field6254;
                    class288.field4014.method700(269307178, 0);
                    class288.field4014.method752(80, var4[var7]);
                }
                var5 = true;
                break;
            }
        }
        if (!var5) {
            class235.method1482(4, 24658, class9.field155.method42(class666.field9377, 19572) + arg2);
        }
    }

    @OriginalMember(owner = "client!ot", name = "c", descriptor = "(IILw;)Lw;")
    public final class271 method281(int arg0, int arg1, class271 arg2) {
        ++field7346;
        if ((1 & this.field7329[arg0][arg1]) == 0) {
            return null;
        } else {
            int var4 = super.field1919 >> this.field7339.field4219;
            class341 var5 = (class341) arg2;
            class341 var6;
            if (var5 != null && var5.method2042(var4, var4, 0)) {
                var6 = var5;
                var5.method2039((byte) 0);
            } else {
                var6 = new class341(this.field7339, var4, var4);
            }
            var6.method2043(var4, var4, (byte) -97, 0, 0);
            this.method2973(var6, arg0, arg1, 12);
            return var6;
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(III)B")
    public static final byte method2975(int arg0, int arg1, int arg2) {
        if (arg1 > -72) {
            field7344 = null;
        }
        ++field7333;
        if (~arg2 != -10) {
            return 0;
        } else {
            return (byte) ((arg0 & 1) != 0 ? 2 : 1);
        }
    }

    @OriginalMember(owner = "client!ot", name = "EA", descriptor = "(III)V")
    public final void method272(int arg0, int arg1, int arg2) {
        ++field7322;
        if (arg2 > (this.field7362[arg0][arg1] & 255)) {
            this.field7362[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "(I)V")
    public static void method2976(int arg0) {
        field7344 = null;
        if (arg0 != 4893) {
            field7344 = null;
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(I[[ZZBIII)V")
    private final void method2977(int arg0, boolean[][] arg1, boolean arg2, byte arg3, int arg4, int arg5, int arg6) {
        ++field7321;
        if (this.field7367 != null) {
            int var8 = arg5 + 1 - -arg5;
            int var9 = var8 * var8;
            if (~this.field7339.field4367.length > ~var9) {
                this.field7339.field4367 = new int[var9];
            }
            if (~this.field7339.field4289.field1316.length > ~(this.field7334 * 2)) {
                this.field7339.field4289 = new class57(this.field7334 * 2);
            }
            int var10 = -arg5 + arg4;
            int var11 = var10;
            if (~var10 > -1) {
                var10 = 0;
            }
            int var12 = -arg5 + arg6;
            int var13 = var12;
            if (~var12 > -1) {
                var12 = 0;
            }
            int var14 = arg4 + arg5;
            if (~(super.field1918 - 1) > ~var14) {
                var14 = super.field1918 - 1;
            }
            int var15 = arg5 + arg6;
            if (super.field1916 + -1 < var15) {
                var15 = super.field1916 + -1;
            }
            int var16 = 0;
            int[] var17 = this.field7339.field4367;
            for (int var18 = var10; ~var18 >= ~var14; ++var18) {
                boolean[] var24 = arg1[-var11 + var18];
                for (int var25 = var12; var15 >= var25; ++var25) {
                    if (var24[-var13 + var25]) {
                        var17[var16++] = super.field1918 * var25 - -var18;
                    }
                }
            }
            if (arg0 != -1) {
                this.field7339.method1790((byte) -3, (float) arg0);
                this.field7339.method1763(8960);
            } else {
                this.field7339.method1800(false);
            }
            this.field7339.method1777((this.field7341 & 7) != 0, arg3 + -23);
            for (int var19 = 0; ~this.field7367.length < ~var19; ++var19) {
                this.field7367[var19].method1975((byte) -122, var16, var17);
            }
            if (!this.field7350.method1274((byte) 120)) {
                int var20 = this.field7339.field4339;
                int var21 = this.field7339.field4283;
                this.field7339.method453(0, var21, this.field7339.field4293);
                this.field7339.method1777(false, -93);
                this.field7339.method1805(false, (byte) 58);
                this.field7339.method1768(128, arg3 ^ 56);
                this.field7339.method1789((byte) -51, -2);
                this.field7339.method1804(false, this.field7339.field4311);
                this.field7339.method1798(false, 7681, 8448);
                this.field7339.method1797(0, (byte) 61, 770, 34166);
                this.field7339.method1811(770, 0, false, 34167);
                for (class539 var22 = this.field7350.method1270((byte) -25); var22 != null; var22 = this.field7350.method1282(0)) {
                    class357 var23 = (class357) var22;
                    var23.method2114(arg1, arg4, arg5, arg6, 10531);
                }
                this.field7339.method1797(0, (byte) 38, 768, 5890);
                this.field7339.method1811(770, 0, false, 5890);
                this.field7339.method1804(false, (class591) null);
                this.field7339.method453(var20, var21, this.field7339.field4293);
            }
            if (this.field7328 != null) {
                this.field7339.method1744(this.field7364, (byte) -102, this.field7366, (class74) null, (class74) null);
                this.field7328.method963(arg4, arg1, arg6, 0, arg5, arg2);
            }
        }
        if (arg3 == -105) {
            ;
        }
    }

    @OriginalMember(owner = "client!ot", name = "FA", descriptor = "(Lw;IIIIZ)V")
    public final void method278(class271 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field7337;
        if (this.field7328 != null && arg0 != null) {
            int var7 = -(this.field7339.field4357 * arg2 >> 8) + arg1 >> this.field7339.field4219;
            int var8 = -(this.field7339.field4248 * arg2 >> 8) + arg3 >> this.field7339.field4219;
            this.field7328.method960(arg0, var7, (byte) -18, var8);
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(ILuq;IB)J")
    public static final long method2978(int arg0, class147 arg1, int arg2, byte arg3) {
        ++field7327;
        long var4 = 4194304L;
        int var6 = -102 % ((-50 - arg3) / 43);
        long var7 = 2147483648L;
        long var9 = Long.MIN_VALUE;
        class620 var11 = class164.field2499.method2013(arg1.method554(-18971), false);
        long var12 = (long) (1073741824 | arg0 | arg2 << 7 | arg1.method549(12352) << 14 | arg1.method560(15654) << 20);
        if (var11.field8592 == 0) {
            var12 |= var9;
        }
        if (var11.field8652 == 1) {
            var12 |= var4;
        }
        if (var11.field8586) {
            var12 |= var7;
        }
        return var12 | (long) arg1.method554(-18971) << 32;
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method275(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field7323;
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
        for (int var28 = 0; var18 > var28; ++var28) {
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
        this.method266(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!ot", name = "JA", descriptor = "(II)I")
    public final int method273(int arg0, int arg1) {
        ++field7343;
        return this.field7353[arg0][arg1];
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(Lld;[I)V")
    public final void method282(class154 arg0, int[] arg1) {
        this.field7350.method1273(new class357(this.field7339, this, arg0, arg1), (byte) 122);
        ++field7349;
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(Lw;IIIIZ)Z")
    public final boolean method276(class271 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field7340;
        if (this.field7328 != null && arg0 != null) {
            int var7 = -(this.field7339.field4357 * arg2 >> 8) + arg1 >> this.field7339.field4219;
            int var8 = -(this.field7339.field4248 * arg2 >> 8) + arg3 >> this.field7339.field4219;
            return this.field7328.method955(var7, arg0, 7, var8);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ot", name = "ba", descriptor = "()V")
    public final void method270() {
        if (~this.field7354 < -1) {
            byte[][] var1 = new byte[super.field1918 + 1][super.field1916 + 1];
            for (int var2 = 1; super.field1918 > var2; ++var2) {
                for (int var103 = 1; var103 < super.field1916; ++var103) {
                    var1[var2][var103] = (byte) ((this.field7362[var2][var103 + 1] >> 3) + (this.field7362[var2][var103 + -1] >> 2) + (this.field7362[var2 - 1][var103] >> 2) + (this.field7362[var2 + 1][var103] >> 3) + (this.field7362[var2][var103] >> 1));
                }
            }
            this.field7367 = new class327[this.field7368.method2057(0)];
            this.field7368.method2059((byte) -88, this.field7367);
            for (int var3 = 0; this.field7367.length > var3; ++var3) {
                this.field7367[var3].method1980(4, this.field7354);
            }
            int var4 = 24;
            if (this.field7338 != null) {
                var4 += 4;
            }
            if (~(7 & this.field7341) != -1) {
                var4 += 12;
            }
            NativeHeapBuffer var5 = this.field7339.field4222.method3413(this.field7354 * var4, false);
            Stream var6 = new Stream(var5);
            class327[] var7 = new class327[this.field7354];
            int var8 = class694.method3810(this.field7354 / 4, 71828324);
            if (var8 < 1) {
                var8 = 1;
            }
            class346 var9 = new class346(var8);
            class327[] var10 = new class327[this.field7365];
            for (int var11 = 0; ~super.field1918 < ~var11; ++var11) {
                for (int var30 = 0; ~super.field1916 < ~var30; ++var30) {
                    if (this.field7342[var11][var30] != null) {
                        class327[] var31 = this.field7325[var11][var30];
                        int[] var32 = this.field7345[var11][var30];
                        int[] var33 = this.field7335[var11][var30];
                        int[] var34 = this.field7348[var11][var30];
                        int[] var35 = this.field7342[var11][var30];
                        int[] var36 = this.field7336 == null ? null : this.field7336[var11][var30];
                        int[] var37 = this.field7338 != null ? this.field7338[var11][var30] : null;
                        if (var34 == null) {
                            var34 = var35;
                        }
                        float var38 = this.field7359[var11][var30];
                        float var39 = this.field7356[var11][var30];
                        float var40 = this.field7357[var11][var30];
                        float var41 = this.field7359[var11][var30 - -1];
                        float var42 = this.field7356[var11][var30 - -1];
                        float var43 = this.field7357[var11][var30 - -1];
                        float var44 = this.field7359[var11 + 1][var30 - -1];
                        float var45 = this.field7356[var11 + 1][var30 + 1];
                        float var46 = this.field7357[var11 + 1][var30 + 1];
                        float var47 = this.field7359[var11 - -1][var30];
                        float var48 = this.field7356[var11 + 1][var30];
                        float var49 = this.field7357[var11 + 1][var30];
                        int var50 = 255 & var1[var11][var30];
                        int var51 = 255 & var1[var11][var30 + 1];
                        int var52 = 255 & var1[var11 + 1][var30 - -1];
                        int var53 = 255 & var1[var11 + 1][var30];
                        int var54 = 0;
                        label342: for (int var55 = 0; ~var35.length < ~var55; ++var55) {
                            class327 var101 = var31[var55];
                            for (int var102 = 0; var54 > var102; ++var102) {
                                if (var10[var102] == var101) {
                                    continue label342;
                                }
                            }
                            var10[var54++] = var101;
                        }
                        short[] var56 = this.field7347[super.field1918 * var30 - -var11] = new short[var35.length];
                        for (int var57 = 0; ~var35.length < ~var57; ++var57) {
                            int var58 = (var11 << super.field1921) - -var32[var57];
                            int var59 = (var30 << super.field1921) - -var33[var57];
                            int var60 = var58 >> this.field7318;
                            int var61 = var59 >> this.field7318;
                            int var62 = var35[var57];
                            int var63 = var34[var57];
                            int var64 = var36 != null ? var36[var57] : 0;
                            long var65 = (long) var63 << 48 | (long) var62 << 32 | (long) (var60 << 16) | (long) var61;
                            int var67 = var32[var57];
                            int var68 = var33[var57];
                            byte var69 = 74;
                            int var70 = 0;
                            float var71 = 1.0F;
                            int var72;
                            float var73;
                            float var74;
                            float var75;
                            if (~var67 == -1 && var68 == 0) {
                                var72 = var69 - var50;
                                var73 = var38;
                                var74 = var40;
                                var75 = var39;
                            } else if (~var67 == -1 && ~super.field1919 == ~var68) {
                                var73 = var41;
                                var72 = var69 - var51;
                                var74 = var43;
                                var75 = var42;
                            } else if (~super.field1919 == ~var67 && ~super.field1919 == ~var68) {
                                var74 = var46;
                                var75 = var45;
                                var72 = var69 - var52;
                                var73 = var44;
                            } else if (~super.field1919 == ~var67 && var68 == 0) {
                                var74 = var49;
                                var72 = var69 - var53;
                                var75 = var48;
                                var73 = var47;
                            } else {
                                float var76 = (float) var67 / (float) super.field1919;
                                float var77 = (float) var68 / (float) super.field1919;
                                float var78 = (-var38 + var47) * var76 + var38;
                                float var79 = (-var39 + var48) * var76 + var39;
                                float var80 = (var49 - var40) * var76 + var40;
                                float var81 = (var44 - var41) * var76 + var41;
                                float var82 = (var45 - var42) * var76 + var42;
                                var75 = (var82 - var79) * var77 + var79;
                                float var83 = (var46 - var43) * var76 + var43;
                                var73 = (-var78 + var81) * var77 + var78;
                                var74 = (var83 - var80) * var77 + var80;
                                int var84 = ((var53 - var50) * var67 >> super.field1921) + var50;
                                int var85 = ((-var51 + var52) * var67 >> super.field1921) + var51;
                                var72 = var69 - (((-var84 + var85) * var68 >> super.field1921) + var84);
                            }
                            if (~var62 != 0) {
                                int var86 = (127 & var62) * var72 >> 7;
                                if (var86 < 2) {
                                    var86 = 2;
                                } else if (var86 > 126) {
                                    var86 = 126;
                                }
                                if ((7 & this.field7341) == 0) {
                                    float var87 = this.field7339.field4360[2] * var74 + this.field7339.field4360[0] * var73 + this.field7339.field4360[1] * var75;
                                    var71 = (var87 > 0.0F ? this.field7339.field4310 : this.field7339.field4262) * var87 + this.field7339.field4320;
                                }
                                var70 = class35.field433[65408 & var62 | var86];
                            }
                            class539 var88 = null;
                            if (~(var58 & this.field7324 + -1) == -1 && ~(this.field7324 + -1 & var59) == -1) {
                                var88 = var9.method2061(-17305, var65);
                            }
                            int var99;
                            if (var88 == null) {
                                int var89;
                                if (~var62 == ~var63) {
                                    var89 = var70;
                                } else {
                                    int var90 = (var63 & 127) * var72 >> 7;
                                    if (~var90 > -3) {
                                        var90 = 2;
                                    } else if (~var90 < -127) {
                                        var90 = 126;
                                    }
                                    var89 = class35.field433[var63 & 65408 | var90];
                                    if ((this.field7341 & 7) == 0) {
                                        float var91 = this.field7339.field4360[2] * var74 + this.field7339.field4360[1] * var75 + this.field7339.field4360[0] * var73;
                                        float var92 = var71 * (!(var71 > 0.0F) ? this.field7339.field4262 : this.field7339.field4310) + this.field7339.field4320;
                                        int var93 = 255 & var89 >> 16;
                                        int var94 = var89 >> 8 & 255;
                                        int var95 = (int) ((float) var93 * var92);
                                        int var96 = var89 & 255;
                                        int var97 = (int) ((float) var94 * var92);
                                        if (var95 < 0) {
                                            var95 = 0;
                                        } else if (~var95 < -256) {
                                            var95 = 255;
                                        }
                                        if (var97 >= 0) {
                                            if (~var97 < -256) {
                                                var97 = 255;
                                            }
                                        } else {
                                            var97 = 0;
                                        }
                                        int var98 = (int) ((float) var96 * var92);
                                        if (var98 >= 0) {
                                            if (var98 > 255) {
                                                var98 = 255;
                                            }
                                        } else {
                                            var98 = 0;
                                        }
                                        var89 = var97 << 8 | var95 << 16 | var98;
                                    }
                                }
                                if (!this.field7339.field4362) {
                                    var6.method3428((float) var58);
                                    var6.method3428((float) (var64 + this.method267(var58, var59)));
                                    var6.method3428((float) var59);
                                    var6.method3419((byte) (var89 >> 16));
                                    var6.method3419((byte) (var89 >> 8));
                                    var6.method3419((byte) var89);
                                    var6.method3419(-1);
                                    var6.method3428((float) var58);
                                    var6.method3428((float) var59);
                                    if (this.field7338 != null) {
                                        var6.method3428((float) (var37 == null ? 0 : var37[var57] - 1));
                                    }
                                    if ((this.field7341 & 7) != 0) {
                                        var6.method3428(var73);
                                        var6.method3428(var75);
                                        var6.method3428(var74);
                                    }
                                } else {
                                    var6.method3421((float) var58);
                                    var6.method3421((float) (this.method267(var58, var59) + var64));
                                    var6.method3421((float) var59);
                                    var6.method3419((byte) (var89 >> 16));
                                    var6.method3419((byte) (var89 >> 8));
                                    var6.method3419((byte) var89);
                                    var6.method3419(-1);
                                    var6.method3421((float) var58);
                                    var6.method3421((float) var59);
                                    if (this.field7338 != null) {
                                        var6.method3421((float) (var37 != null ? var37[var57] - 1 : 0));
                                    }
                                    if ((this.field7341 & 7) != 0) {
                                        var6.method3421(var73);
                                        var6.method3421(var75);
                                        var6.method3421(var74);
                                    }
                                }
                                var99 = this.field7330++;
                                var56[var57] = (short) var99;
                                if (var62 != -1) {
                                    var7[var99] = var31[var57];
                                }
                                var9.method2063(var65, 1, new class379(var56[var57]));
                            } else {
                                var56[var57] = ((class379) var88).field5339;
                                var99 = 65535 & var56[var57];
                                if (var62 != -1 && ~var31[var57].field7311 > ~var7[var99].field7311) {
                                    var7[var99] = var31[var57];
                                }
                            }
                            for (int var100 = 0; var100 < var54; ++var100) {
                                var10[var100].method1982(var99, var71, var70, -128, var72);
                            }
                            ++this.field7334;
                        }
                    }
                }
            }
            for (int var12 = 0; this.field7330 > var12; ++var12) {
                class327 var29 = var7[var12];
                if (var29 != null) {
                    var29.method1979(var12, (byte) -48);
                }
            }
            for (int var13 = 0; super.field1918 > var13; ++var13) {
                for (int var18 = 0; super.field1916 > var18; ++var18) {
                    short[] var19 = this.field7347[super.field1918 * var18 - -var13];
                    if (var19 != null) {
                        int var20 = 0;
                        int var21 = 0;
                        while (~var21 > ~var19.length) {
                            int var22 = 65535 & var19[var21++];
                            int var23 = 65535 & var19[var21++];
                            int var24 = var19[var21++] & 65535;
                            class327 var25 = var7[var22];
                            class327 var26 = var7[var23];
                            class327 var27 = var7[var24];
                            class327 var28 = null;
                            if (var25 != null) {
                                var28 = var25;
                                var25.method1978(var18, 1, var20, var13);
                            }
                            if (var26 != null) {
                                var26.method1978(var18, 1, var20, var13);
                                if (var28 == null || var28.field7311 > var26.field7311) {
                                    var28 = var26;
                                }
                            }
                            if (var27 != null) {
                                var27.method1978(var18, 1, var20, var13);
                                if (var28 == null || ~var27.field7311 > ~var28.field7311) {
                                    var28 = var27;
                                }
                            }
                            if (var28 != null) {
                                if (var25 != null) {
                                    var28.method1979(var22, (byte) -124);
                                }
                                if (var26 != null) {
                                    var28.method1979(var23, (byte) -82);
                                }
                                if (var27 != null) {
                                    var28.method1979(var24, (byte) -68);
                                }
                                var28.method1978(var18, 1, var20, var13);
                            }
                            ++var20;
                        }
                    }
                }
            }
            var6.method3426();
            this.field7355 = this.field7339.method1794(var6.method3429(), false, var4, 126, var5);
            this.field7364 = new class74(this.field7355, 5126, 3, 0);
            this.field7360 = new class74(this.field7355, 5121, 4, 12);
            byte var14;
            if (this.field7338 == null) {
                var14 = 24;
                this.field7366 = new class74(this.field7355, 5126, 2, 16);
            } else {
                var14 = 28;
                this.field7366 = new class74(this.field7355, 5126, 3, 16);
            }
            if ((this.field7341 & 7) != 0) {
                this.field7361 = new class74(this.field7355, 5126, 3, var14);
            }
            long[] var15 = new long[this.field7367.length];
            for (int var16 = 0; var16 < this.field7367.length; ++var16) {
                class327 var17 = this.field7367[var16];
                var15[var16] = var17.field7311;
                var17.method1981(this.field7330, 90);
            }
            class235.method1480(true, this.field7367, var15);
            if (this.field7328 != null) {
                this.field7328.method958(0);
            }
        } else {
            this.field7328 = null;
        }
        ++field7331;
        this.field7368 = null;
        this.field7325 = null;
        this.field7338 = null;
        this.field7345 = this.field7335 = null;
        this.field7362 = null;
        this.field7348 = null;
        this.field7342 = null;
        this.field7336 = null;
        this.field7359 = this.field7356 = this.field7357 = null;
    }
}
