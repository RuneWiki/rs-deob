import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mea")
public class class72 extends class274 {

    @OriginalMember(owner = "client!mea", name = "x", descriptor = "Lgk;")
    private class616 field712 = new class616();

    @OriginalMember(owner = "client!mea", name = "G", descriptor = "Lvj;")
    public class422 field721;

    @OriginalMember(owner = "client!mea", name = "y", descriptor = "I")
    private int field713;

    @OriginalMember(owner = "client!mea", name = "z", descriptor = "[[[I")
    public int[][][] field714;

    @OriginalMember(owner = "client!mea", name = "q", descriptor = "[[[I")
    private int[][][] field705;

    @OriginalMember(owner = "client!mea", name = "n", descriptor = "I")
    private int field702;

    @OriginalMember(owner = "client!mea", name = "P", descriptor = "[[[Lac;")
    private class309[][][] field730;

    @OriginalMember(owner = "client!mea", name = "cb", descriptor = "[[F")
    private float[][] field743;

    @OriginalMember(owner = "client!mea", name = "R", descriptor = "[[[I")
    public int[][][] field732;

    @OriginalMember(owner = "client!mea", name = "s", descriptor = "[[S")
    public short[][] field707;

    @OriginalMember(owner = "client!mea", name = "r", descriptor = "I")
    public int field706;

    @OriginalMember(owner = "client!mea", name = "jb", descriptor = "[[B")
    private byte[][] field750;

    @OriginalMember(owner = "client!mea", name = "bb", descriptor = "[[F")
    private float[][] field742;

    @OriginalMember(owner = "client!mea", name = "J", descriptor = "[[[I")
    private int[][][] field724;

    @OriginalMember(owner = "client!mea", name = "nb", descriptor = "[[F")
    private float[][] field754;

    @OriginalMember(owner = "client!mea", name = "X", descriptor = "[[[I")
    public int[][][] field738;

    @OriginalMember(owner = "client!mea", name = "C", descriptor = "[[B")
    private byte[][] field717;

    @OriginalMember(owner = "client!mea", name = "kb", descriptor = "Lwa;")
    private class661 field751;

    @OriginalMember(owner = "client!mea", name = "B", descriptor = "Lhaa;")
    private class80 field716;

    @OriginalMember(owner = "client!mea", name = "F", descriptor = "[I")
    public static int[] field720 = new int[13];

    @OriginalMember(owner = "client!mea", name = "I", descriptor = "Lsb;")
    public static class305 field723 = new class305(71, 4);

    @OriginalMember(owner = "client!mea", name = "Z", descriptor = "I")
    public static int field740 = 100;

    @OriginalMember(owner = "client!mea", name = "gb", descriptor = "Z")
    public static boolean field747 = false;

    @OriginalMember(owner = "client!mea", name = "p", descriptor = "I")
    public static int field704;

    @OriginalMember(owner = "client!mea", name = "t", descriptor = "I")
    public static int field708;

    @OriginalMember(owner = "client!mea", name = "u", descriptor = "I")
    public static int field709;

    @OriginalMember(owner = "client!mea", name = "v", descriptor = "I")
    public static int field710;

    @OriginalMember(owner = "client!mea", name = "w", descriptor = "I")
    private int field711;

    @OriginalMember(owner = "client!mea", name = "A", descriptor = "I")
    public static int field715;

    @OriginalMember(owner = "client!mea", name = "D", descriptor = "I")
    public static int field718;

    @OriginalMember(owner = "client!mea", name = "E", descriptor = "I")
    private int field719;

    @OriginalMember(owner = "client!mea", name = "H", descriptor = "I")
    public static int field722;

    @OriginalMember(owner = "client!mea", name = "K", descriptor = "I")
    public static int field725;

    @OriginalMember(owner = "client!mea", name = "L", descriptor = "I")
    public static int field726;

    @OriginalMember(owner = "client!mea", name = "M", descriptor = "I")
    public static int field727;

    @OriginalMember(owner = "client!mea", name = "N", descriptor = "I")
    public static int field728;

    @OriginalMember(owner = "client!mea", name = "O", descriptor = "I")
    public static int field729;

    @OriginalMember(owner = "client!mea", name = "Q", descriptor = "I")
    public static int field731;

    @OriginalMember(owner = "client!mea", name = "S", descriptor = "I")
    public static int field733;

    @OriginalMember(owner = "client!mea", name = "T", descriptor = "I")
    public static int field734;

    @OriginalMember(owner = "client!mea", name = "U", descriptor = "I")
    public static int field735;

    @OriginalMember(owner = "client!mea", name = "V", descriptor = "I")
    public static int field736;

    @OriginalMember(owner = "client!mea", name = "W", descriptor = "I")
    public static int field737;

    @OriginalMember(owner = "client!mea", name = "Y", descriptor = "I")
    public static int field739;

    @OriginalMember(owner = "client!mea", name = "fb", descriptor = "I")
    private int field746;

    @OriginalMember(owner = "client!mea", name = "hb", descriptor = "I")
    private int field748;

    @OriginalMember(owner = "client!mea", name = "eb", descriptor = "Lut;")
    private class199 field745;

    @OriginalMember(owner = "client!mea", name = "ab", descriptor = "Lhea;")
    public class351 field741;

    @OriginalMember(owner = "client!mea", name = "db", descriptor = "Lhea;")
    private class351 field744;

    @OriginalMember(owner = "client!mea", name = "ib", descriptor = "Lhea;")
    public class351 field749;

    @OriginalMember(owner = "client!mea", name = "mb", descriptor = "Lhea;")
    public class351 field753;

    @OriginalMember(owner = "client!mea", name = "lb", descriptor = "[Lac;")
    private class309[] field752;

    @OriginalMember(owner = "client!mea", name = "o", descriptor = "[[[I")
    private int[][][] field703;

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(III[[ZZ)V")
    public final void method376(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        ++field710;
        this.method386(-1, arg4, arg0, 124, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(ILog;ZI)V")
    private final void method377(int arg0, class102 arg1, boolean arg2, int arg3) {
        ++field737;
        int[] var5 = this.field714[arg0][arg3];
        int[] var6 = this.field732[arg0][arg3];
        int var7 = var5.length;
        if (~var7 < ~this.field721.field5970.length) {
            this.field721.field5969 = new int[var7];
            this.field721.field5970 = new int[var7];
        }
        int[] var8 = this.field721.field5970;
        int[] var9 = this.field721.field5969;
        int var10 = 0;
        if (!arg2) {
            this.field712 = null;
        }
        while (~var7 < ~var10) {
            var8[var10] = var5[var10] >> this.field721.field5818;
            var9[var10] = var6[var10] >> this.field721.field5818;
            ++var10;
        }
        int var11 = 0;
        while (var7 > var11) {
            int var12 = var8[var11];
            int var13 = var9[var11++];
            int var14 = var8[var11];
            int var15 = var9[var11++];
            int var16 = var8[var11];
            int var17 = var9[var11++];
            if ((var12 - var14) * (-var17 + var15) + -((-var13 + var15) * (-var14 + var16)) > 0) {
                arg1.method550(var13, var12, var16, var15, var17, var14, -91);
            }
        }
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method378(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field734;
        if (this.field746 > 0) {
            this.field721.method2440((byte) -94);
            this.field721.method2402(0, false);
            this.field721.method2410(false, -85);
            this.field721.method2382(false, 2929);
            this.field721.method2358(false, (byte) -108);
            this.field721.method2386(126, 0);
            this.field721.method2426(116, -2);
            this.field721.method2396((byte) 36, (class325) null);
            class478.field6878[1] = 0.0F;
            class478.field6878[6] = 0.0F;
            class478.field6878[7] = 0.0F;
            class478.field6878[0] = (float) arg2 / ((float) super.field3424 * 128.0F * (float) this.field721.field5760);
            class478.field6878[4] = 0.0F;
            class478.field6878[5] = (float) arg2 / ((float) super.field3424 * 128.0F * (float) this.field721.field5766);
            class478.field6878[12] = -(((float) (arg2 * arg3) / 128.0F + (float) (-(arg0 * 2))) / (float) this.field721.field5760) + -1.0F;
            class478.field6878[11] = 0.0F;
            class478.field6878[14] = 0.0F;
            class478.field6878[15] = 1.0F;
            class478.field6878[13] = -(((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field721.field5766) + 1.0F;
            class478.field6878[8] = 0.0F;
            class478.field6878[9] = 0.0F;
            class478.field6878[3] = 0.0F;
            class478.field6878[2] = 0.0F;
            class478.field6878[10] = 0.0F;
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadMatrixf(class478.field6878, 0);
            class478.field6878[10] = 0.0F;
            class478.field6878[15] = 1.0F;
            class478.field6878[1] = 0.0F;
            class478.field6878[11] = 0.0F;
            class478.field6878[14] = 0.0F;
            class478.field6878[4] = 0.0F;
            class478.field6878[0] = 1.0F;
            class478.field6878[3] = 0.0F;
            class478.field6878[5] = 0.0F;
            class478.field6878[12] = 0.0F;
            class478.field6878[13] = 0.0F;
            class478.field6878[6] = 1.0F;
            class478.field6878[9] = 1.0F;
            class478.field6878[7] = 0.0F;
            class478.field6878[8] = 0.0F;
            class478.field6878[2] = 0.0F;
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadMatrixf(class478.field6878, 0);
            if (~(this.field706 & 7) == -1) {
                this.field721.method2410(false, -95);
            } else {
                this.field721.method2410(true, -121);
                this.field721.method2375(-1);
            }
            this.field721.method2419(this.field749, 99, this.field744, this.field741, this.field753);
            if (~(this.field719 * 2) < ~this.field721.field5965.field1269.length) {
                this.field721.field5965 = new class209(this.field719 * 2);
            } else {
                this.field721.field5965.field1218 = 0;
            }
            int var9 = 0;
            class209 var10 = this.field721.field5965;
            if (!this.field721.field5874) {
                for (int var11 = arg4; ~arg6 < ~var11; ++var11) {
                    int var12 = super.field3428 * var11 - -arg3;
                    for (int var13 = arg3; arg5 > var13; ++var13) {
                        if (arg7[-arg3 + var13][-arg4 + var11]) {
                            short[] var14 = this.field707[var12];
                            if (var14 != null) {
                                for (int var15 = 0; var14.length > var15; ++var15) {
                                    var10.method667(13224, 65535 & var14[var15]);
                                    ++var9;
                                }
                            }
                        }
                        ++var12;
                    }
                }
            } else {
                for (int var16 = arg4; ~arg6 < ~var16; ++var16) {
                    int var18 = super.field3428 * var16 - -arg3;
                    for (int var19 = arg3; ~arg5 < ~var19; ++var19) {
                        if (arg7[-arg3 + var19][-arg4 + var16]) {
                            short[] var20 = this.field707[var18];
                            if (var20 != null) {
                                for (int var21 = 0; var20.length > var21; ++var21) {
                                    var10.method645(-672168216, var20[var21] & 65535);
                                    ++var9;
                                }
                            }
                        }
                        ++var18;
                    }
                }
            }
            if (~var9 < -1) {
                class97 var17 = new class97(this.field721, 5123, var10.field1269, var10.field1218);
                this.field721.method2403(var17, 0, var9, 4, 126);
            }
        }
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(III)V")
    public final void method379(int arg0, int arg1, int arg2) {
        ++field728;
        if (arg2 > (this.field750[arg0][arg1] & 255)) {
            this.field750[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(III[[ZZI)V")
    public final void method380(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        ++field739;
        this.method386(arg5, arg4, arg0, 33, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(Leq;[I)V")
    public final void method381(class670 arg0, int[] arg1) {
        ++field708;
        this.field712.method3425(new class592(this.field721, this, arg0, arg1), false);
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method382(int arg0, String arg1) {
        if (arg0 != 2018672392) {
            method393(-16);
        }
        ++field727;
        return 1 + arg1.length();
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(II)V")
    public final void method383(int arg0, int arg1) {
        ++field718;
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(IZIIIIII)V")
    public static final void method384(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field733;
        if (~arg2 == ~arg7) {
            class254.method1502(arg2, arg5, arg6, arg3, (byte) 38, arg4, arg0);
        } else if (arg1) {
            if (~class412.field5526 >= ~(-arg2 + arg5) && arg2 + arg5 <= field740 && class93.field949 <= arg6 - arg7 && ~(arg6 + arg7) >= ~class360.field4834) {
                class189.method1150(arg4, (byte) -55, arg7, arg0, arg2, arg3, arg6, arg5);
            } else {
                class202.method1207(arg6, arg4, arg3, arg5, arg0, arg2, (byte) 111, arg7);
            }
        }
    }

    @OriginalMember(owner = "client!mea", name = "DA", descriptor = "(Lha;IIIIZ)V")
    public final void method385(class120 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field729;
        if (this.field716 != null && arg0 != null) {
            int var7 = -(this.field721.field5871 * arg2 >> 8) + arg1 >> this.field721.field5818;
            int var8 = arg3 - (this.field721.field5880 * arg2 >> 8) >> this.field721.field5818;
            this.field716.method423(var8, arg0, false, var7);
        }
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(IZIIII[[Z)V")
    private final void method386(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, boolean[][] arg6) {
        if (this.field752 != null) {
            int var8 = arg5 + arg5 - -1;
            int var9 = var8 * var8;
            if (~var9 < ~this.field721.field5972.length) {
                this.field721.field5972 = new int[var9];
            }
            if (~(this.field719 * 2) < ~this.field721.field5965.field1269.length) {
                this.field721.field5965 = new class209(this.field719 * 2);
            }
            int var10 = -arg5 + arg2;
            int var11 = var10;
            if (var10 < 0) {
                var10 = 0;
            }
            int var12 = -arg5 + arg4;
            int var13 = var12;
            if (~var12 > -1) {
                var12 = 0;
            }
            int var14 = arg2 - -arg5;
            if (var14 > super.field3428 + -1) {
                var14 = super.field3428 + -1;
            }
            int var15 = arg4 + arg5;
            if (~(super.field3426 + -1) > ~var15) {
                var15 = super.field3426 - 1;
            }
            int var16 = 0;
            int[] var17 = this.field721.field5972;
            for (int var18 = var10; var14 >= var18; ++var18) {
                boolean[] var24 = arg6[-var11 + var18];
                for (int var25 = var12; ~var15 <= ~var25; ++var25) {
                    if (var24[-var13 + var25]) {
                        var17[var16++] = super.field3428 * var25 - -var18;
                    }
                }
            }
            if (arg0 == -1) {
                this.field721.method2414(95);
            } else {
                this.field721.method2376((byte) -89, (float) arg0);
                this.field721.method2432(16);
            }
            this.field721.method2410((this.field706 & 7) != 0, -79);
            for (int var19 = 0; var19 < this.field752.length; ++var19) {
                this.field752[var19].method1777(var16, (byte) -3, var17);
            }
            if (!this.field712.method3439((byte) 89)) {
                int var20 = this.field721.field5963;
                int var21 = this.field721.field5954;
                this.field721.method937(0, var21, this.field721.field5920);
                this.field721.method2410(false, -85);
                this.field721.method2358(false, (byte) -91);
                this.field721.method2386(126, 128);
                this.field721.method2426(110, -2);
                this.field721.method2396((byte) 36, this.field721.field5960);
                this.field721.method2412((byte) -49, 8448, 7681);
                this.field721.method2428(770, 34166, 0, -4);
                this.field721.method2371(770, 0, -51, 34167);
                for (class333 var22 = this.field712.method3434((byte) 2); var22 != null; var22 = this.field712.method3430(true)) {
                    class592 var23 = (class592) var22;
                    var23.method3332(arg5, (byte) -127, arg2, arg6, arg4);
                }
                this.field721.method2428(768, 5890, 0, -4);
                this.field721.method2371(770, 0, -45, 5890);
                this.field721.method2396((byte) 36, (class325) null);
                this.field721.method937(var20, var21, this.field721.field5920);
            }
            if (this.field716 != null) {
                OpenGL.glPushMatrix();
                OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
                this.field721.method2419(this.field749, 96, (class351) null, this.field741, (class351) null);
                this.field716.method427(arg6, arg1, arg5, true, arg2, arg4);
                OpenGL.glPopMatrix();
            }
        }
        ++field726;
        if (arg3 < 21) {
            this.method389((class120) null, -51, -7, -104, -21, false);
        }
    }

    @OriginalMember(owner = "client!mea", name = "O", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method387(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (arg5 != null && this.field703 == null) {
            this.field703 = new int[super.field3428][super.field3426][];
        }
        if (arg3 != null && this.field705 == null) {
            this.field705 = new int[super.field3428][super.field3426][];
        }
        ++field725;
        this.field714[arg0][arg1] = arg2;
        this.field732[arg0][arg1] = arg4;
        this.field738[arg0][arg1] = arg6;
        this.field724[arg0][arg1] = arg7;
        if (this.field703 != null) {
            this.field703[arg0][arg1] = arg5;
        }
        if (this.field705 != null) {
            this.field705[arg0][arg1] = arg3;
        }
        class309[] var15 = this.field730[arg0][arg1] = new class309[arg6.length];
        for (int var16 = 0; var16 < arg6.length; ++var16) {
            long var17 = (long) (arg9[var16] << 14) | (long) arg10 << 28 | (long) arg12 << 48 | (long) arg11 << 42 | (long) arg8[var16];
            class333 var19;
            for (var19 = this.field751.method3669(var17, -1); var19 != null; var19 = this.field751.method3673((byte) 109)) {
                class309 var20 = (class309) var19;
                if (~arg8[var16] == ~var20.field3822 && (float) arg9[var16] == var20.field3821 && var20.field3802 == arg10 && var20.field3808 == arg11 && ~var20.field3826 == ~arg12) {
                    break;
                }
            }
            if (var19 == null) {
                var15[var16] = new class309(this, arg8[var16], arg9[var16], arg10, arg11, arg12);
                this.field751.method3671(false, var15[var16], var17);
            } else {
                var15[var16] = (class309) var19;
            }
        }
        if (arg13) {
            this.field717[arg0][arg1] = (byte) class422.method2436(this.field717[arg0][arg1], 1);
        }
        if (~this.field748 > ~arg6.length) {
            this.field748 = arg6.length;
        }
        this.field746 += arg6.length;
    }

    @OriginalMember(owner = "client!mea", name = "<init>", descriptor = "(Lvj;IIII[[I[[II)V")
    public class72(class422 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        this.field721 = arg0;
        this.field713 = super.field3430 + -2;
        this.field714 = new int[arg3][arg4][];
        this.field705 = new int[arg3][arg4][];
        this.field702 = 1 << this.field713;
        this.field730 = new class309[arg3][arg4][];
        this.field743 = new float[super.field3428 + 1][super.field3426 - -1];
        this.field732 = new int[arg3][arg4][];
        this.field707 = new short[arg3 * arg4][];
        this.field706 = arg2;
        this.field750 = new byte[arg3 - -1][arg4 + 1];
        this.field742 = new float[super.field3428 - -1][super.field3426 - -1];
        this.field724 = new int[arg3][arg4][];
        this.field754 = new float[super.field3428 + 1][super.field3426 + 1];
        this.field738 = new int[arg3][arg4][];
        this.field717 = new byte[arg3][arg4];
        for (int var9 = 1; var9 < super.field3426; ++var9) {
            for (int var10 = 1; ~super.field3428 < ~var10; ++var10) {
                int var11 = arg6[var10 - -1][var9] - arg6[var10 + -1][var9];
                int var12 = arg6[var10][var9 + 1] + -arg6[var10][var9 + -1];
                float var13 = (float) (1.0D / Math.sqrt((double) (var12 * var12 + arg7 * arg7 * 4 + var11 * var11)));
                this.field743[var10][var9] = (float) var11 * var13;
                this.field754[var10][var9] = (float) (-arg7 * 2) * var13;
                this.field742[var10][var9] = (float) var12 * var13;
            }
        }
        this.field751 = new class661(128);
        if ((16 & this.field706) != 0) {
            this.field716 = new class80(this.field721, this);
        }
    }

    @OriginalMember(owner = "client!mea", name = "v", descriptor = "(IILha;)Lha;")
    public final class120 method388(int arg0, int arg1, class120 arg2) {
        ++field709;
        if (~(this.field717[arg0][arg1] & 1) == -1) {
            return null;
        } else {
            int var4 = super.field3424 >> this.field721.field5818;
            class102 var5 = (class102) arg2;
            class102 var6;
            if (var5 != null && var5.method551(var4, var4, -23345)) {
                var6 = var5;
                var5.method553((byte) -122);
            } else {
                var6 = new class102(this.field721, var4, var4);
            }
            var6.method556(-18, var4, 0, var4, 0);
            this.method377(arg0, var6, true, arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(Lha;IIIIZ)Z")
    public final boolean method389(class120 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field704;
        if (this.field716 != null && arg0 != null) {
            int var7 = arg1 - (this.field721.field5871 * arg2 >> 8) >> this.field721.field5818;
            int var8 = -(this.field721.field5880 * arg2 >> 8) + arg3 >> this.field721.field5818;
            return this.field716.method420(var7, var8, arg0, 120);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mea", name = "E", descriptor = "(Lha;IIIIZ)V")
    public final void method390(class120 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field735;
        if (this.field716 != null && arg0 != null) {
            int var7 = -(this.field721.field5871 * arg2 >> 8) + arg1 >> this.field721.field5818;
            int var8 = -(this.field721.field5880 * arg2 >> 8) + arg3 >> this.field721.field5818;
            this.field716.method425(var8, 121, arg0, var7);
        }
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method391(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field715;
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
        for (int var28 = 0; ~var18 < ~var28; ++var28) {
            int var29 = arg6[var28];
            int var30 = arg7[var28];
            int var31 = arg8[var28];
            var19[var27] = arg2[var29];
            var20[var27] = arg4[var29];
            var21[var27] = arg9[var28];
            var23[var27] = arg11[var28];
            var24[var27] = arg12[var28];
            var22[var27] = arg10 == null ? arg9[var28] : arg10[var28];
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
            var22[var27] = arg10 == null ? arg9[var28] : arg10[var28];
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
            var22[var27] = arg10 == null ? arg9[var28] : arg10[var28];
            if (arg3 != null) {
                var25[var27] = arg3[var31];
            }
            if (arg5 != null) {
                var26[var27] = arg5[var31];
            }
            ++var27;
        }
        this.method387(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!mea", name = "BA", descriptor = "()V")
    public final void method392() {
        if (~this.field746 >= -1) {
            this.field716 = null;
        } else {
            byte[][] var1 = new byte[super.field3428 + 1][super.field3426 + 1];
            for (int var2 = 1; var2 < super.field3428; ++var2) {
                for (int var103 = 1; super.field3426 > var103; ++var103) {
                    var1[var2][var103] = (byte) ((this.field750[var2][var103 + 1] >> 3) + (this.field750[var2][var103] >> 1) + (this.field750[var2 + 1][var103] >> 3) + (this.field750[var2][var103 + -1] >> 2) + (this.field750[var2 + -1][var103] >> 2));
                }
            }
            this.field752 = new class309[this.field751.method3668(false)];
            this.field751.method3675(this.field752, (byte) 114);
            for (int var3 = 0; var3 < this.field752.length; ++var3) {
                this.field752[var3].method1778(-127, this.field746);
            }
            int var4 = 24;
            if (this.field703 != null) {
                var4 += 4;
            }
            if ((this.field706 & 7) != 0) {
                var4 += 12;
            }
            NativeHeapBuffer var5 = this.field721.field5820.method3462(this.field746 * var4, false);
            Stream var6 = new Stream(var5);
            class309[] var7 = new class309[this.field746];
            int var8 = class668.method3699(28069, this.field746 / 4);
            if (~var8 > -2) {
                var8 = 1;
            }
            class661 var9 = new class661(var8);
            class309[] var10 = new class309[this.field748];
            for (int var11 = 0; ~var11 > ~super.field3428; ++var11) {
                for (int var30 = 0; var30 < super.field3426; ++var30) {
                    if (this.field738[var11][var30] != null) {
                        class309[] var31 = this.field730[var11][var30];
                        int[] var32 = this.field714[var11][var30];
                        int[] var33 = this.field732[var11][var30];
                        int[] var34 = this.field724[var11][var30];
                        int[] var35 = this.field738[var11][var30];
                        int[] var36 = this.field705 != null ? this.field705[var11][var30] : null;
                        int[] var37 = this.field703 == null ? null : this.field703[var11][var30];
                        if (var34 == null) {
                            var34 = var35;
                        }
                        float var38 = this.field743[var11][var30];
                        float var39 = this.field754[var11][var30];
                        float var40 = this.field742[var11][var30];
                        float var41 = this.field743[var11][var30 + 1];
                        float var42 = this.field754[var11][var30 + 1];
                        float var43 = this.field742[var11][var30 - -1];
                        float var44 = this.field743[var11 - -1][var30 + 1];
                        float var45 = this.field754[var11 + 1][var30 - -1];
                        float var46 = this.field742[var11 + 1][var30 - -1];
                        float var47 = this.field743[var11 + 1][var30];
                        float var48 = this.field754[var11 + 1][var30];
                        float var49 = this.field742[var11 + 1][var30];
                        int var50 = var1[var11][var30] & 255;
                        int var51 = var1[var11][var30 + 1] & 255;
                        int var52 = 255 & var1[var11 + 1][var30 + 1];
                        int var53 = 255 & var1[var11 + 1][var30];
                        int var54 = 0;
                        label339: for (int var55 = 0; var55 < var35.length; ++var55) {
                            class309 var101 = var31[var55];
                            for (int var102 = 0; var102 < var54; ++var102) {
                                if (var10[var102] == var101) {
                                    continue label339;
                                }
                            }
                            var10[var54++] = var101;
                        }
                        short[] var56 = this.field707[super.field3428 * var30 - -var11] = new short[var35.length];
                        for (int var57 = 0; var57 < var35.length; ++var57) {
                            int var58 = (var11 << super.field3430) + var32[var57];
                            int var59 = (var30 << super.field3430) - -var33[var57];
                            int var60 = var58 >> this.field713;
                            int var61 = var59 >> this.field713;
                            int var62 = var35[var57];
                            int var63 = var34[var57];
                            int var64 = var36 == null ? 0 : var36[var57];
                            long var65 = (long) (var60 << 16) | (long) var63 << 48 | (long) var62 << 32 | (long) var61;
                            int var67 = var32[var57];
                            int var68 = var33[var57];
                            byte var69 = 74;
                            int var70 = 0;
                            float var71;
                            float var72;
                            int var73;
                            float var74;
                            if (~var67 == -1 && ~var68 == -1) {
                                var71 = var39;
                                var72 = var38;
                                var73 = var69 - var50;
                                var74 = var40;
                            } else if (~var67 == -1 && super.field3424 == var68) {
                                var72 = var41;
                                var73 = var69 - var51;
                                var74 = var43;
                                var71 = var42;
                            } else if (super.field3424 == var67 && ~super.field3424 == ~var68) {
                                var71 = var45;
                                var74 = var46;
                                var73 = var69 - var52;
                                var72 = var44;
                            } else if (~super.field3424 == ~var67 && var68 == 0) {
                                var74 = var49;
                                var72 = var47;
                                var73 = var69 - var53;
                                var71 = var48;
                            } else {
                                float var75 = (float) var67 / (float) super.field3424;
                                float var76 = (float) var68 / (float) super.field3424;
                                float var77 = (-var38 + var47) * var75 + var38;
                                float var78 = (-var39 + var48) * var75 + var39;
                                float var79 = (var49 - var40) * var75 + var40;
                                float var80 = (var44 - var41) * var75 + var41;
                                float var81 = (-var42 + var45) * var75 + var42;
                                var72 = (-var77 + var80) * var76 + var77;
                                var71 = (var81 - var78) * var76 + var78;
                                float var82 = (-var43 + var46) * var75 + var43;
                                var74 = (var82 - var79) * var76 + var79;
                                int var83 = ((var53 - var50) * var67 >> super.field3430) + var50;
                                int var84 = var51 - -((-var51 + var52) * var67 >> super.field3430);
                                var73 = var69 - (var83 - -((-var83 + var84) * var68 >> super.field3430));
                            }
                            float var85 = 1.0F;
                            if (~var62 != 0) {
                                int var86 = (127 & var62) * var73 >> 7;
                                if (~var86 > -3) {
                                    var86 = 2;
                                } else if (var86 > 126) {
                                    var86 = 126;
                                }
                                if ((this.field706 & 7) == 0) {
                                    float var87 = this.field721.field5899[2] * var74 + this.field721.field5899[1] * var71 + this.field721.field5899[0] * var72;
                                    var85 = this.field721.field5949 + (var87 > 0.0F ? this.field721.field5945 : this.field721.field5866) * var87;
                                }
                                var70 = class194.field2239[65408 & var62 | var86];
                            }
                            class333 var88 = null;
                            if (~(this.field702 - 1 & var58) == -1 && ~(var59 & this.field702 - 1) == -1) {
                                var88 = var9.method3669(var65, -1);
                            }
                            int var99;
                            if (var88 == null) {
                                int var89;
                                if (var62 == var63) {
                                    var89 = var70;
                                } else {
                                    int var90 = (127 & var63) * var73 >> 7;
                                    if (~var90 > -3) {
                                        var90 = 2;
                                    } else if (~var90 < -127) {
                                        var90 = 126;
                                    }
                                    var89 = class194.field2239[65408 & var63 | var90];
                                    if ((this.field706 & 7) == 0) {
                                        float var91 = this.field721.field5899[2] * var74 + this.field721.field5899[0] * var72 + this.field721.field5899[1] * var71;
                                        float var92 = (var85 > 0.0F ? this.field721.field5945 : this.field721.field5866) * var85 + this.field721.field5949;
                                        int var93 = (16743662 & var89) >> 16;
                                        int var94 = 255 & var89 >> 8;
                                        int var95 = (int) ((float) var93 * var92);
                                        int var96 = 255 & var89;
                                        int var97 = (int) ((float) var94 * var92);
                                        if (var95 >= 0) {
                                            if (var95 > 255) {
                                                var95 = 255;
                                            }
                                        } else {
                                            var95 = 0;
                                        }
                                        int var98 = (int) ((float) var96 * var92);
                                        if (~var97 <= -1) {
                                            if (var97 > 255) {
                                                var97 = 255;
                                            }
                                        } else {
                                            var97 = 0;
                                        }
                                        if (var98 >= 0) {
                                            if (var98 > 255) {
                                                var98 = 255;
                                            }
                                        } else {
                                            var98 = 0;
                                        }
                                        var89 = var95 << 16 | var97 << 8 | var98;
                                    }
                                }
                                if (this.field721.field5874) {
                                    var6.method3469((float) var58);
                                    var6.method3469((float) (this.method1610(var58, 108, var59) - -var64));
                                    var6.method3469((float) var59);
                                    var6.method3471((byte) (var89 >> 16));
                                    var6.method3471((byte) (var89 >> 8));
                                    var6.method3471((byte) var89);
                                    var6.method3471(-1);
                                    var6.method3469((float) var58);
                                    var6.method3469((float) var59);
                                    if (this.field703 != null) {
                                        var6.method3469((float) (var37 != null ? var37[var57] - 1 : 0));
                                    }
                                    if ((this.field706 & 7) != 0) {
                                        var6.method3469(var72);
                                        var6.method3469(var71);
                                        var6.method3469(var74);
                                    }
                                } else {
                                    var6.method3475((float) var58);
                                    var6.method3475((float) (var64 + this.method1610(var58, 106, var59)));
                                    var6.method3475((float) var59);
                                    var6.method3471((byte) (var89 >> 16));
                                    var6.method3471((byte) (var89 >> 8));
                                    var6.method3471((byte) var89);
                                    var6.method3471(-1);
                                    var6.method3475((float) var58);
                                    var6.method3475((float) var59);
                                    if (this.field703 != null) {
                                        var6.method3475((float) (var37 != null ? var37[var57] - 1 : 0));
                                    }
                                    if (~(this.field706 & 7) != -1) {
                                        var6.method3475(var72);
                                        var6.method3475(var71);
                                        var6.method3475(var74);
                                    }
                                }
                                var99 = this.field711++;
                                var56[var57] = (short) var99;
                                if (~var62 != 0) {
                                    var7[var99] = var31[var57];
                                }
                                var9.method3671(false, new class331(var56[var57]), var65);
                            } else {
                                var56[var57] = ((class331) var88).field4164;
                                var99 = var56[var57] & 65535;
                                if (~var62 != 0 && ~var7[var99].field4176 < ~var31[var57].field4176) {
                                    var7[var99] = var31[var57];
                                }
                            }
                            for (int var100 = 0; ~var100 > ~var54; ++var100) {
                                var10[var100].method1773(115, var85, var70, var73, var99);
                            }
                            ++this.field719;
                        }
                    }
                }
            }
            for (int var12 = 0; var12 < this.field711; ++var12) {
                class309 var29 = var7[var12];
                if (var29 != null) {
                    var29.method1780(var12, (byte) -5);
                }
            }
            for (int var13 = 0; ~var13 > ~super.field3428; ++var13) {
                for (int var18 = 0; super.field3426 > var18; ++var18) {
                    short[] var19 = this.field707[super.field3428 * var18 + var13];
                    if (var19 != null) {
                        int var20 = 0;
                        int var21 = 0;
                        while (var21 < var19.length) {
                            int var22 = 65535 & var19[var21++];
                            int var23 = 65535 & var19[var21++];
                            int var24 = 65535 & var19[var21++];
                            class309 var25 = var7[var22];
                            class309 var26 = var7[var23];
                            class309 var27 = var7[var24];
                            class309 var28 = null;
                            if (var25 != null) {
                                var28 = var25;
                                var25.method1775(var18, var13, (byte) 124, var20);
                            }
                            if (var26 != null) {
                                var26.method1775(var18, var13, (byte) 124, var20);
                                if (var28 == null || ~var28.field4176 < ~var26.field4176) {
                                    var28 = var26;
                                }
                            }
                            if (var27 != null) {
                                var27.method1775(var18, var13, (byte) 124, var20);
                                if (var28 == null || var28.field4176 > var27.field4176) {
                                    var28 = var27;
                                }
                            }
                            if (var28 != null) {
                                if (var25 != null) {
                                    var28.method1780(var22, (byte) -5);
                                }
                                if (var26 != null) {
                                    var28.method1780(var23, (byte) -5);
                                }
                                if (var27 != null) {
                                    var28.method1780(var24, (byte) -5);
                                }
                                var28.method1775(var18, var13, (byte) 124, var20);
                            }
                            ++var20;
                        }
                    }
                }
            }
            var6.method3472();
            this.field745 = this.field721.method2406((byte) -4, var6.method3474(), var5, false, var4);
            this.field749 = new class351(this.field745, 5126, 3, 0);
            this.field744 = new class351(this.field745, 5121, 4, 12);
            byte var14;
            if (this.field703 == null) {
                this.field741 = new class351(this.field745, 5126, 2, 16);
                var14 = 24;
            } else {
                var14 = 28;
                this.field741 = new class351(this.field745, 5126, 3, 16);
            }
            if ((this.field706 & 7) != 0) {
                this.field753 = new class351(this.field745, 5126, 3, var14);
            }
            long[] var15 = new long[this.field752.length];
            for (int var16 = 0; ~this.field752.length < ~var16; ++var16) {
                class309 var17 = this.field752[var16];
                var15[var16] = var17.field4176;
                var17.method1776(this.field711, 65535);
            }
            class112.method596((byte) -121, var15, this.field752);
            if (this.field716 != null) {
                this.field716.method418(-125);
            }
        }
        ++field736;
        this.field724 = null;
        this.field751 = null;
        this.field703 = null;
        this.field738 = null;
        this.field750 = null;
        this.field743 = this.field754 = this.field742 = null;
        this.field730 = null;
        this.field714 = this.field732 = null;
        this.field705 = null;
    }

    @OriginalMember(owner = "client!mea", name = "b", descriptor = "(I)V")
    public static void method393(int arg0) {
        field723 = null;
        if (arg0 == -2715) {
            field720 = null;
        }
    }
}
