import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sba")
public class class556 extends class339 {

    @OriginalMember(owner = "client!sba", name = "l", descriptor = "F")
    private float field7845 = Float.MAX_VALUE;

    @OriginalMember(owner = "client!sba", name = "F", descriptor = "F")
    private float field7865 = -3.4028235E38F;

    @OriginalMember(owner = "client!sba", name = "J", descriptor = "Lfha;")
    private class522 field7869 = new class522();

    @OriginalMember(owner = "client!sba", name = "i", descriptor = "Lpga;")
    public class492 field7842;

    @OriginalMember(owner = "client!sba", name = "s", descriptor = "I")
    private int field7852;

    @OriginalMember(owner = "client!sba", name = "M", descriptor = "[[[I")
    private int[][][] field7872;

    @OriginalMember(owner = "client!sba", name = "Q", descriptor = "[[[I")
    public int[][][] field7876;

    @OriginalMember(owner = "client!sba", name = "u", descriptor = "[[[I")
    public int[][][] field7854;

    @OriginalMember(owner = "client!sba", name = "D", descriptor = "[[[I")
    private int[][][] field7863;

    @OriginalMember(owner = "client!sba", name = "V", descriptor = "[[F")
    private float[][] field7881;

    @OriginalMember(owner = "client!sba", name = "U", descriptor = "[[F")
    private float[][] field7880;

    @OriginalMember(owner = "client!sba", name = "R", descriptor = "I")
    private int field7877;

    @OriginalMember(owner = "client!sba", name = "N", descriptor = "[[S")
    public short[][] field7873;

    @OriginalMember(owner = "client!sba", name = "y", descriptor = "I")
    public int field7858;

    @OriginalMember(owner = "client!sba", name = "L", descriptor = "[[[Luo;")
    private class145[][][] field7871;

    @OriginalMember(owner = "client!sba", name = "Z", descriptor = "[[F")
    private float[][] field7885;

    @OriginalMember(owner = "client!sba", name = "t", descriptor = "[[B")
    private byte[][] field7853;

    @OriginalMember(owner = "client!sba", name = "ab", descriptor = "[[B")
    private byte[][] field7886;

    @OriginalMember(owner = "client!sba", name = "S", descriptor = "[[[I")
    public int[][][] field7878;

    @OriginalMember(owner = "client!sba", name = "db", descriptor = "Lgca;")
    private class209 field7889;

    @OriginalMember(owner = "client!sba", name = "T", descriptor = "Lgf;")
    private class663 field7879;

    @OriginalMember(owner = "client!sba", name = "o", descriptor = "Lqk;")
    public static class148 field7848 = new class148(90, 4);

    @OriginalMember(owner = "client!sba", name = "j", descriptor = "I")
    public static int field7843;

    @OriginalMember(owner = "client!sba", name = "k", descriptor = "I")
    public static int field7844;

    @OriginalMember(owner = "client!sba", name = "n", descriptor = "I")
    public static int field7847;

    @OriginalMember(owner = "client!sba", name = "p", descriptor = "I")
    public static int field7849;

    @OriginalMember(owner = "client!sba", name = "q", descriptor = "I")
    public static int field7850;

    @OriginalMember(owner = "client!sba", name = "r", descriptor = "I")
    public static int field7851;

    @OriginalMember(owner = "client!sba", name = "v", descriptor = "I")
    private int field7855;

    @OriginalMember(owner = "client!sba", name = "w", descriptor = "I")
    private int field7856;

    @OriginalMember(owner = "client!sba", name = "x", descriptor = "I")
    public static int field7857;

    @OriginalMember(owner = "client!sba", name = "z", descriptor = "I")
    public static int field7859;

    @OriginalMember(owner = "client!sba", name = "A", descriptor = "I")
    public static int field7860;

    @OriginalMember(owner = "client!sba", name = "C", descriptor = "I")
    public static int field7862;

    @OriginalMember(owner = "client!sba", name = "E", descriptor = "I")
    public static int field7864;

    @OriginalMember(owner = "client!sba", name = "G", descriptor = "I")
    public static int field7866;

    @OriginalMember(owner = "client!sba", name = "H", descriptor = "I")
    public static int field7867;

    @OriginalMember(owner = "client!sba", name = "I", descriptor = "I")
    public static int field7868;

    @OriginalMember(owner = "client!sba", name = "K", descriptor = "I")
    public static int field7870;

    @OriginalMember(owner = "client!sba", name = "O", descriptor = "I")
    public static int field7874;

    @OriginalMember(owner = "client!sba", name = "P", descriptor = "I")
    public static int field7875;

    @OriginalMember(owner = "client!sba", name = "X", descriptor = "I")
    private int field7883;

    @OriginalMember(owner = "client!sba", name = "bb", descriptor = "I")
    private int field7887;

    @OriginalMember(owner = "client!sba", name = "cb", descriptor = "Llk;")
    private class251 field7888;

    @OriginalMember(owner = "client!sba", name = "eb", descriptor = "Llk;")
    private class251 field7890;

    @OriginalMember(owner = "client!sba", name = "W", descriptor = "Ldha;")
    public class732 field7882;

    @OriginalMember(owner = "client!sba", name = "Y", descriptor = "[Luo;")
    private class145[] field7884;

    @OriginalMember(owner = "client!sba", name = "m", descriptor = "[[B")
    public static byte[][] field7846;

    @OriginalMember(owner = "client!sba", name = "B", descriptor = "[[[I")
    private int[][][] field7861;

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method512(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field7859;
        if (this.field7887 > 0) {
            class212 var9 = this.field7842.method2909(true, this.field7856);
            int var10 = 0;
            int var11 = 32767;
            int var12 = -32768;
            for (int var13 = 0; ~var13 > -5; ++var13) {
                var10 = 0;
                Buffer var14 = var9.method1401(true, 68);
                if (var14 != null) {
                    Stream var15 = this.field7842.method2917(var14, false);
                    if (!Stream.method2541()) {
                        for (int var16 = arg4; arg6 > var16; ++var16) {
                            int var17 = super.field4344 * var16 + arg3;
                            for (int var18 = arg3; ~arg5 < ~var18; ++var18) {
                                if (arg7[-arg3 + var18][var16 - arg4]) {
                                    short[] var19 = this.field7873[var17];
                                    if (var19 != null) {
                                        for (int var20 = 0; ~var19.length < ~var20; ++var20) {
                                            int var21 = 65535 & var19[var20];
                                            if (~var11 < ~var21) {
                                                var11 = var21;
                                            }
                                            ++var10;
                                            var15.method2544(var21);
                                            if (~var12 > ~var21) {
                                                var12 = var21;
                                            }
                                        }
                                    }
                                }
                                ++var17;
                            }
                        }
                    } else {
                        for (int var22 = arg4; ~arg6 < ~var22; ++var22) {
                            int var25 = super.field4344 * var22 + arg3;
                            for (int var26 = arg3; arg5 > var26; ++var26) {
                                if (arg7[-arg3 + var26][var22 - arg4]) {
                                    short[] var27 = this.field7873[var25];
                                    if (var27 != null) {
                                        for (int var28 = 0; var28 < var27.length; ++var28) {
                                            int var29 = var27[var28] & 65535;
                                            if (~var11 < ~var29) {
                                                var11 = var29;
                                            }
                                            var15.method2554(var29);
                                            if (~var12 > ~var29) {
                                                var12 = var29;
                                            }
                                            ++var10;
                                        }
                                    }
                                }
                                ++var25;
                            }
                        }
                    }
                    var15.method2551();
                    if (var9.method1400(false)) {
                        break;
                    }
                }
            }
            if (var10 > 0) {
                this.field7842.method2919(-32);
                this.field7842.method2903((byte) 120, false);
                this.field7842.method2910(false, (byte) 111);
                this.field7842.method2869(13, false);
                this.field7842.method2885(false, 106);
                this.field7842.method2945(0, 22630);
                this.field7842.method2951(true, false, false, -2);
                this.field7842.method2933((byte) -40, (class117) null);
                class173 var23 = this.field7842.method2891(-42);
                float[] var24 = this.field7842.method2900(20112);
                var24[6] = 0.0F;
                var24[2] = 0.0F;
                var24[10] = 1.0F / (this.field7865 - this.field7845);
                var24[8] = 0.0F;
                var24[13] = -(((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field7842.field6730) + 1.0F;
                var24[4] = 0.0F;
                var24[7] = 0.0F;
                var24[5] = (float) arg2 / ((float) super.field4346 * 128.0F * (float) this.field7842.field6730);
                var24[3] = 0.0F;
                var24[11] = 0.0F;
                var24[0] = (float) arg2 / ((float) super.field4346 * 128.0F * (float) this.field7842.field6732);
                var24[14] = -this.field7845 / (-this.field7845 + this.field7865);
                var24[9] = 0.0F;
                var24[1] = 0.0F;
                var24[15] = 1.0F;
                var24[12] = -1.0F - ((float) (arg2 * arg3) / 128.0F + (float) (-(arg0 * 2))) / (float) this.field7842.field6732;
                var23.method1080(0.0F, 0.0F, 0.0F, 1.0F, (byte) 16, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F);
                this.field7842.method2887((byte) 120);
                this.field7842.method2901((byte) 53);
                if ((7 & this.field7858) != 0) {
                    this.field7842.method2910(true, (byte) 117);
                    this.field7842.method620((byte) 47);
                } else {
                    this.field7842.method2910(false, (byte) 103);
                }
                this.field7842.method607((byte) 67, false);
                this.field7842.method564(0, this.field7888, false);
                this.field7842.method564(1, this.field7890, false);
                this.field7842.method565(false, this.field7882);
                this.field7842.method612(class756.field10497, 0, var11, true, -var11 + var12 + 1, var9, var10 / 3);
                this.field7842.method607((byte) 67, true);
            }
        }
    }

    @OriginalMember(owner = "client!sba", name = "fa", descriptor = "(IILr;)Lr;")
    public final class706 method504(int arg0, int arg1, class706 arg2) {
        ++field7868;
        if (~(1 & this.field7853[arg0][arg1]) == -1) {
            return null;
        } else {
            int var4 = super.field4346 >> this.field7842.field6818;
            class450 var5 = (class450) arg2;
            class450 var6;
            if (var5 != null && var5.method2709(var4, var4, 1073741824)) {
                var6 = var5;
                var5.method2702((byte) 127);
            } else {
                var6 = new class450(this.field7842, var4, var4);
            }
            var6.method2705((byte) -128, var4, 0, 0, var4);
            this.method3306((byte) 92, var6, arg0, arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!sba", name = "wa", descriptor = "(Lr;IIIIZ)V")
    public final void method502(class706 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field7867;
        if (this.field7879 != null && arg0 != null) {
            int var7 = arg1 - (this.field7842.field6902 * arg2 >> 8) >> this.field7842.field6818;
            int var8 = arg3 - (this.field7842.field6862 * arg2 >> 8) >> this.field7842.field6818;
            this.field7879.method3806(arg0, var7, -52, var8);
        }
    }

    @OriginalMember(owner = "client!sba", name = "ka", descriptor = "(III)V")
    public final void method516(int arg0, int arg1, int arg2) {
        ++field7849;
        if ((this.field7886[arg0][arg1] & 255) < arg2) {
            this.field7886[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!sba", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method508(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        ++field7857;
        if (arg5 != null && this.field7861 == null) {
            this.field7861 = new int[super.field4344][super.field4348][];
        }
        class268 var15 = this.field7842.field7694;
        if (arg3 != null && this.field7872 == null) {
            this.field7872 = new int[super.field4344][super.field4348][];
        }
        this.field7876[arg0][arg1] = arg2;
        this.field7878[arg0][arg1] = arg4;
        this.field7854[arg0][arg1] = arg6;
        this.field7863[arg0][arg1] = arg7;
        if (this.field7861 != null) {
            this.field7861[arg0][arg1] = arg5;
        }
        if (this.field7872 != null) {
            this.field7872[arg0][arg1] = arg3;
        }
        class145[] var16 = this.field7871[arg0][arg1] = new class145[arg6.length];
        for (int var17 = 0; var17 < arg6.length; ++var17) {
            int var18 = arg8[var17];
            int var19 = arg9[var17];
            if ((this.field7858 & 32) != 0 && var18 != -1 && var15.method91(var18, -22805).field6389) {
                var19 = 128;
                var18 = -1;
            }
            long var20 = (long) (var19 << 14) | (long) arg12 << 48 | (long) arg11 << 42 | (long) arg10 << 28 | (long) var18;
            class513 var22;
            for (var22 = this.field7889.method1381(true, var20); var22 != null; var22 = this.field7889.method1391(-1)) {
                class145 var23 = (class145) var22;
                if (var23.field2009 == var18 && (float) var19 == var23.field1998 && var23.field2018 == arg10 && ~var23.field2000 == ~arg11 && var23.field2012 == arg12) {
                    break;
                }
            }
            if (var22 != null) {
                var16[var17] = (class145) var22;
            } else {
                var16[var17] = new class145(this, var18, var19, arg10, arg11, arg12);
                this.field7889.method1387(var16[var17], var20, (byte) -113);
            }
        }
        if (arg13) {
            this.field7853[arg0][arg1] = (byte) class747.method4153(this.field7853[arg0][arg1], 1);
        }
        if (arg6.length > this.field7883) {
            this.field7883 = arg6.length;
        }
        this.field7887 += arg6.length;
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(I)V")
    public static void method3304(int arg0) {
        if (arg0 != 15) {
            method3304(-37);
        }
        field7848 = null;
        field7846 = null;
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(III[[ZZII)V")
    public final void method517(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6) {
        this.method3305(arg1, arg3, arg2, 112, arg6, arg5, arg0, arg4);
        ++field7864;
    }

    @OriginalMember(owner = "client!sba", name = "<init>", descriptor = "(Lpga;IIII[[I[[II)V")
    public class556(class492 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        this.field7842 = arg0;
        this.field7852 = super.field4349 + -2;
        this.field7872 = new int[arg3][arg4][];
        this.field7876 = new int[arg3][arg4][];
        this.field7854 = new int[arg3][arg4][];
        this.field7863 = new int[arg3][arg4][];
        this.field7881 = new float[super.field4344 - -1][super.field4348 - -1];
        this.field7880 = new float[super.field4344 + 1][super.field4348 - -1];
        this.field7877 = 1 << this.field7852;
        this.field7873 = new short[arg3 * arg4][];
        this.field7858 = arg2;
        this.field7871 = new class145[arg3][arg4][];
        this.field7885 = new float[super.field4344 + 1][super.field4348 - -1];
        this.field7853 = new byte[arg3][arg4];
        this.field7886 = new byte[arg3 - -1][arg4 - -1];
        this.field7878 = new int[arg3][arg4][];
        for (int var9 = 0; super.field4348 >= var9; ++var9) {
            for (int var10 = 0; super.field4344 >= var10; ++var10) {
                int var11 = super.field4343[var10][var9];
                if ((float) var11 < this.field7845) {
                    this.field7845 = (float) var11;
                }
                if ((float) var11 > this.field7865) {
                    this.field7865 = (float) var11;
                }
                if (var10 > 0 && var9 > 0 && ~super.field4344 < ~var10 && ~var9 > ~super.field4348) {
                    int var12 = arg6[var10 + 1][var9] + -arg6[var10 - 1][var9];
                    int var13 = arg6[var10][var9 - -1] - arg6[var10][var9 + -1];
                    float var14 = (float) (1.0D / Math.sqrt((double) (var13 * var13 + arg7 * 4 * arg7 + var12 * var12)));
                    this.field7881[var10][var9] = (float) var12 * var14;
                    this.field7880[var10][var9] = (float) (-arg7 * 2) * var14;
                    this.field7885[var10][var9] = (float) var13 * var14;
                }
            }
        }
        ++this.field7865;
        --this.field7845;
        this.field7889 = new class209(128);
        if (~(this.field7858 & 16) != -1) {
            this.field7879 = new class663(this.field7842, this);
        }
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(III[[ZZI)V")
    public final void method510(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        this.method3305(arg1, arg3, arg2, -91, arg5, -1, arg0, arg4);
        ++field7843;
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(I[[ZIIIIIZ)V")
    private final void method3305(int arg0, boolean[][] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        if (this.field7884 != null) {
            int var9 = arg2 + arg2 + 1;
            int var10 = var9 * var9;
            if (~var10 < ~class746.field10400.length) {
                class746.field10400 = new int[var10];
            }
            int var11 = -arg2 + arg6;
            int var12 = var11;
            if (var11 < 0) {
                var11 = 0;
            }
            int var13 = -arg2 + arg0;
            int var14 = var13;
            if (var13 < 0) {
                var13 = 0;
            }
            int var15 = arg2 + arg6;
            if (var15 > super.field4344 + -1) {
                var15 = super.field4344 + -1;
            }
            int var16 = arg0 + arg2;
            class362.field4646 = 0;
            if (var16 > super.field4348 + -1) {
                var16 = super.field4348 - 1;
            }
            for (int var17 = var11; var15 >= var17; ++var17) {
                boolean[] var24 = arg1[-var12 + var17];
                for (int var25 = var13; var16 >= var25; ++var25) {
                    if (var24[-var14 + var25]) {
                        class746.field10400[class362.field4646++] = super.field4344 * var25 + var17;
                    }
                }
            }
            if (~arg5 == 0) {
                this.field7842.method2914(8);
            } else {
                this.field7842.method2932((float) arg5, 17736);
                this.field7842.method2952(-116);
            }
            this.field7842.method2886(357957308);
            this.field7842.method2910(~(this.field7858 & 7) != -1, (byte) 112);
            this.field7842.method2951(true, false, false, -1);
            this.field7842.method564(0, this.field7888, false);
            for (int var18 = 0; ~this.field7884.length < ~var18; ++var18) {
                this.field7884[var18].method944(class746.field10400, 1, class362.field4646);
            }
            class173 var19 = this.field7842.method2891(-66);
            var19.method848(0, -1, 0);
            this.field7842.method2901((byte) 53);
            if (!this.field7869.method3121((byte) -125)) {
                int var20 = this.field7842.field6830;
                int var21 = this.field7842.field6889;
                this.field7842.method2069(0, var21, this.field7842.field6852);
                this.field7842.method2910(false, (byte) -96);
                this.field7842.method2885(false, 105);
                this.field7842.method2945(128, 22630);
                this.field7842.method2951(true, false, false, -2);
                this.field7842.method2933((byte) 85, this.field7842.field6870);
                this.field7842.method2878(class253.field3501, 28768, class369.field4717);
                this.field7842.method2946(0, class123.field1675, (byte) 127);
                this.field7842.method2923(-122, 0, class87.field1198);
                for (class513 var22 = this.field7869.method3118((byte) 73); var22 != null; var22 = this.field7869.method3111(114)) {
                    class416 var23 = (class416) var22;
                    var23.method2534(arg2, arg6, arg0, 20212, arg1);
                }
                this.field7842.method2946(0, class186.field2725, (byte) 127);
                this.field7842.method2923(-126, 0, class186.field2725);
                this.field7842.method2933((byte) -58, (class117) null);
                this.field7842.method2069(var20, var21, this.field7842.field6852);
            }
            if (this.field7879 != null) {
                this.field7842.method564(0, this.field7888, false);
                this.field7842.method564(1, this.field7890, false);
                this.field7842.method565(false, this.field7882);
                this.field7879.method3805(false, arg2, arg1, arg0, arg7, arg6);
            }
        }
        ++field7860;
        int var26 = -55 / ((arg3 - 44) / 63);
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method518(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field7862;
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
        this.method508(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(Lkb;[I)V")
    public final void method513(class757 arg0, int[] arg1) {
        ++field7870;
        this.field7869.method3116(29066, new class416(this.field7842, this, arg0, arg1));
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(BLw;II)V")
    private final void method3306(byte arg0, class450 arg1, int arg2, int arg3) {
        ++field7874;
        int[] var5 = this.field7876[arg2][arg3];
        int[] var6 = this.field7878[arg2][arg3];
        if (arg0 != 92) {
            this.method514();
        }
        int var7 = var5.length;
        if (~class433.field5947.length > ~var7) {
            class322.field4147 = new int[var7];
            class433.field5947 = new int[var7];
        }
        for (int var8 = 0; ~var8 > ~var7; ++var8) {
            class433.field5947[var8] = var5[var8] >> this.field7842.field6818;
            class322.field4147[var8] = var6[var8] >> this.field7842.field6818;
        }
        int var9 = 0;
        while (~var9 > ~var7) {
            int var10 = class433.field5947[var9];
            int var11 = class322.field4147[var9++];
            int var12 = class433.field5947[var9];
            int var13 = class322.field4147[var9++];
            int var14 = class433.field5947[var9];
            int var15 = class322.field4147[var9++];
            if ((-var12 + var10) * (-var15 + var13) + -((var14 - var12) * (-var11 + var13)) > 0) {
                arg1.method2704((byte) -111, var14, var11, var13, var10, var12, var15);
            }
        }
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(Lr;IIIIZ)Z")
    public final boolean method515(class706 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field7844;
        if (this.field7879 != null && arg0 != null) {
            int var7 = -(this.field7842.field6902 * arg2 >> 8) + arg1 >> this.field7842.field6818;
            int var8 = -(this.field7842.field6862 * arg2 >> 8) + arg3 >> this.field7842.field6818;
            return this.field7879.method3808(1, arg0, var7, var8);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sba", name = "CA", descriptor = "(Lr;IIIIZ)V")
    public final void method500(class706 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field7875;
        if (this.field7879 != null && arg0 != null) {
            int var7 = -(this.field7842.field6902 * arg2 >> 8) + arg1 >> this.field7842.field6818;
            int var8 = -(this.field7842.field6862 * arg2 >> 8) + arg3 >> this.field7842.field6818;
            this.field7879.method3803(arg0, (byte) -111, var7, var8);
        }
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(II)V")
    public final void method511(int arg0, int arg1) {
        ++field7851;
    }

    @OriginalMember(owner = "client!sba", name = "YA", descriptor = "()V")
    public final void method514() {
        if (this.field7887 <= 0) {
            this.field7879 = null;
        } else {
            byte[][] var1 = new byte[super.field4344 + 1][super.field4348 + 1];
            for (int var2 = 1; ~var2 > ~super.field4344; ++var2) {
                for (int var107 = 1; var107 < super.field4348; ++var107) {
                    var1[var2][var107] = (byte) ((this.field7886[var2][var107 - -1] >> 3) + (this.field7886[var2][var107 + -1] >> 2) + (this.field7886[var2 + -1][var107] >> 2) + (this.field7886[var2 + 1][var107] >> 3) + (this.field7886[var2][var107] >> 1));
                }
            }
            class145[] var3 = new class145[this.field7889.method1388(false)];
            this.field7889.method1384(0, var3);
            for (int var4 = 0; var3.length > var4; ++var4) {
                var3[var4].method948(this.field7887, (byte) 11);
            }
            int var5 = 20;
            if (this.field7861 != null) {
                var5 += 4;
            }
            if (~(this.field7858 & 7) != -1) {
                var5 += 12;
            }
            NativeHeapBuffer var6 = this.field7842.field6718.method2558(this.field7887 * 4, false);
            NativeHeapBuffer var7 = this.field7842.field6718.method2558(this.field7887 * var5, false);
            Stream var8 = new Stream(var7);
            Stream var9 = new Stream(var6);
            class145[] var10 = new class145[this.field7887];
            int var11 = class655.method3787((byte) 123, this.field7887 / 4);
            if (var11 < 1) {
                var11 = 1;
            }
            class209 var12 = new class209(var11);
            class145[] var13 = new class145[this.field7883];
            for (int var14 = 0; ~var14 > ~super.field4344; ++var14) {
                for (int var34 = 0; var34 < super.field4348; ++var34) {
                    if (this.field7854[var14][var34] != null) {
                        class145[] var35 = this.field7871[var14][var34];
                        int[] var36 = this.field7876[var14][var34];
                        int[] var37 = this.field7878[var14][var34];
                        int[] var38 = this.field7863[var14][var34];
                        int[] var39 = this.field7854[var14][var34];
                        int[] var40 = this.field7872 != null ? this.field7872[var14][var34] : null;
                        if (var38 == null) {
                            var38 = var39;
                        }
                        int[] var41 = this.field7861 != null ? this.field7861[var14][var34] : null;
                        float var42 = this.field7881[var14][var34];
                        float var43 = this.field7880[var14][var34];
                        float var44 = this.field7885[var14][var34];
                        float var45 = this.field7881[var14][var34 + 1];
                        float var46 = this.field7880[var14][var34 - -1];
                        float var47 = this.field7885[var14][var34 + 1];
                        float var48 = this.field7881[var14 + 1][var34 + 1];
                        float var49 = this.field7880[var14 + 1][var34 + 1];
                        float var50 = this.field7885[var14 + 1][var34 + 1];
                        float var51 = this.field7881[var14 + 1][var34];
                        float var52 = this.field7880[var14 + 1][var34];
                        float var53 = this.field7885[var14 + 1][var34];
                        int var54 = var1[var14][var34] & 255;
                        int var55 = 255 & var1[var14][var34 + 1];
                        int var56 = 255 & var1[var14 + 1][var34 + 1];
                        int var57 = var1[var14 - -1][var34] & 255;
                        int var58 = 0;
                        label359: for (int var59 = 0; ~var39.length < ~var59; ++var59) {
                            class145 var105 = var35[var59];
                            for (int var106 = 0; ~var58 < ~var106; ++var106) {
                                if (var13[var106] == var105) {
                                    continue label359;
                                }
                            }
                            var13[var58++] = var105;
                        }
                        short[] var60 = this.field7873[super.field4344 * var34 + var14] = new short[var39.length];
                        for (int var61 = 0; var39.length > var61; ++var61) {
                            int var62 = (var14 << super.field4349) + var36[var61];
                            int var63 = (var34 << super.field4349) + var37[var61];
                            int var64 = var62 >> this.field7852;
                            int var65 = var63 >> this.field7852;
                            int var66 = var39[var61];
                            int var67 = var38[var61];
                            int var68 = var40 != null ? var40[var61] : 0;
                            long var69 = (long) (var64 << 16) | (long) var66 << 32 | (long) var67 << 48 | (long) var65;
                            int var71 = var36[var61];
                            int var72 = var37[var61];
                            byte var73 = 74;
                            int var74 = 0;
                            float var75 = 1.0F;
                            float var76;
                            int var77;
                            float var78;
                            float var79;
                            if (~var71 == -1 && var72 == 0) {
                                var76 = var42;
                                var77 = var73 - var54;
                                var78 = var43;
                                var79 = var44;
                            } else if (var71 == 0 && super.field4346 == var72) {
                                var76 = var45;
                                var78 = var46;
                                var77 = var73 - var55;
                                var79 = var47;
                            } else if (super.field4346 == var71 && ~super.field4346 == ~var72) {
                                var78 = var49;
                                var79 = var50;
                                var77 = var73 - var56;
                                var76 = var48;
                            } else if (~super.field4346 == ~var71 && ~var72 == -1) {
                                var77 = var73 - var57;
                                var79 = var53;
                                var76 = var51;
                                var78 = var52;
                            } else {
                                float var80 = (float) var71 / (float) super.field4346;
                                float var81 = (float) var72 / (float) super.field4346;
                                float var82 = (var51 - var42) * var80 + var42;
                                float var83 = (-var43 + var52) * var80 + var43;
                                float var84 = (-var44 + var53) * var80 + var44;
                                float var85 = (-var45 + var48) * var80 + var45;
                                float var86 = (-var46 + var49) * var80 + var46;
                                var78 = (-var83 + var86) * var81 + var83;
                                float var87 = (var50 - var47) * var80 + var47;
                                var76 = (-var82 + var85) * var81 + var82;
                                var79 = (-var84 + var87) * var81 + var84;
                                int var88 = ((-var54 + var57) * var71 >> super.field4349) + var54;
                                int var89 = ((-var55 + var56) * var71 >> super.field4349) + var55;
                                var77 = var73 - (var88 - -((-var88 + var89) * var72 >> super.field4349));
                            }
                            if (var66 != -1) {
                                int var90 = (127 & var66) * var77 >> 7;
                                if (~var90 > -3) {
                                    var90 = 2;
                                } else if (~var90 < -127) {
                                    var90 = 126;
                                }
                                if ((this.field7858 & 7) == 0) {
                                    float var91 = this.field7842.field6861[2] * var79 + this.field7842.field6861[0] * var76 + this.field7842.field6861[1] * var78;
                                    var75 = this.field7842.field6850 + var91 * (var91 > 0.0F ? this.field7842.field6826 : this.field7842.field6910);
                                }
                                var74 = class673.field9471[var90 | 65408 & var66];
                            }
                            class513 var92 = null;
                            if ((var62 & this.field7877 + -1) == 0 && (var63 & this.field7877 + -1) == 0) {
                                var92 = var12.method1381(true, var69);
                            }
                            int var103;
                            if (var92 == null) {
                                int var94;
                                if (~var66 != ~var67) {
                                    int var93 = (var67 & 127) * var77 >> 7;
                                    if (var93 >= 2) {
                                        if (~var93 < -127) {
                                            var93 = 126;
                                        }
                                    } else {
                                        var93 = 2;
                                    }
                                    var94 = class673.field9471[var93 | var67 & 65408];
                                    if ((7 & this.field7858) == 0) {
                                        float var95 = this.field7842.field6861[2] * var79 + this.field7842.field6861[0] * var76 + this.field7842.field6861[1] * var78;
                                        float var96 = this.field7842.field6850 + var75 * (!(var75 > 0.0F) ? this.field7842.field6910 : this.field7842.field6826);
                                        int var97 = (16750867 & var94) >> 16;
                                        int var98 = (65420 & var94) >> 8;
                                        int var99 = (int) ((float) var97 * var96);
                                        int var100 = 255 & var94;
                                        int var101 = (int) ((float) var98 * var96);
                                        if (~var99 > -1) {
                                            var99 = 0;
                                        } else if (var99 > 255) {
                                            var99 = 255;
                                        }
                                        int var102 = (int) ((float) var100 * var96);
                                        if (var101 >= 0) {
                                            if (~var101 < -256) {
                                                var101 = 255;
                                            }
                                        } else {
                                            var101 = 0;
                                        }
                                        if (~var102 > -1) {
                                            var102 = 0;
                                        } else if (~var102 < -256) {
                                            var102 = 255;
                                        }
                                        var94 = var102 | var101 << 8 | var99 << 16;
                                    }
                                } else {
                                    var94 = var74;
                                }
                                if (Stream.method2541()) {
                                    var8.method2552((float) var62);
                                    var8.method2552((float) (this.method1960(var62, var63, 118) - -var68));
                                    var8.method2552((float) var63);
                                    var8.method2552((float) var62);
                                    var8.method2552((float) var63);
                                    if (this.field7861 != null) {
                                        var8.method2552((float) (var41 == null ? 0 : var41[var61] + -1));
                                    }
                                    if ((7 & this.field7858) != 0) {
                                        var8.method2552(var76);
                                        var8.method2552(var78);
                                        var8.method2552(var79);
                                    }
                                } else {
                                    var8.method2550((float) var62);
                                    var8.method2550((float) (var68 + this.method1960(var62, var63, 126)));
                                    var8.method2550((float) var63);
                                    var8.method2550((float) var62);
                                    var8.method2550((float) var63);
                                    if (this.field7861 != null) {
                                        var8.method2550((float) (var41 == null ? 0 : var41[var61] - 1));
                                    }
                                    if (~(this.field7858 & 7) != -1) {
                                        var8.method2550(var76);
                                        var8.method2550(var78);
                                        var8.method2550(var79);
                                    }
                                }
                                if (~this.field7842.field6886 != -1) {
                                    var9.method2553(-16777216 | var94);
                                } else {
                                    var9.method2545(-16777216 | var94);
                                }
                                var103 = this.field7855++;
                                var60[var61] = (short) var103;
                                if (~var66 != 0) {
                                    var10[var103] = var35[var61];
                                }
                                var12.method1387(new class366(var60[var61]), var69, (byte) -107);
                            } else {
                                var60[var61] = ((class366) var92).field4701;
                                var103 = var60[var61] & 65535;
                                if (var66 != -1 && ~var35[var61].field7166 > ~var10[var103].field7166) {
                                    var10[var103] = var35[var61];
                                }
                            }
                            for (int var104 = 0; var104 < var58; ++var104) {
                                var13[var104].method947(var74, var77, (byte) 41, var75, var103);
                            }
                            ++this.field7856;
                        }
                    }
                }
            }
            for (int var15 = 0; this.field7855 > var15; ++var15) {
                class145 var33 = var10[var15];
                if (var33 != null) {
                    var33.method946((byte) 106, var15);
                }
            }
            for (int var16 = 0; ~var16 > ~super.field4344; ++var16) {
                for (int var22 = 0; ~super.field4348 < ~var22; ++var22) {
                    short[] var23 = this.field7873[super.field4344 * var22 - -var16];
                    if (var23 != null) {
                        int var24 = 0;
                        int var25 = 0;
                        while (var23.length > var25) {
                            int var26 = var23[var25++] & 65535;
                            int var27 = var23[var25++] & 65535;
                            int var28 = 65535 & var23[var25++];
                            class145 var29 = var10[var26];
                            class145 var30 = var10[var27];
                            class145 var31 = var10[var28];
                            class145 var32 = null;
                            if (var29 != null) {
                                var29.method945(var24, var22, (byte) 108, var16);
                                var32 = var29;
                            }
                            if (var30 != null) {
                                var30.method945(var24, var22, (byte) 108, var16);
                                if (var32 == null || ~var30.field7166 > ~var32.field7166) {
                                    var32 = var30;
                                }
                            }
                            if (var31 != null) {
                                var31.method945(var24, var22, (byte) 108, var16);
                                if (var32 == null || ~var31.field7166 > ~var32.field7166) {
                                    var32 = var31;
                                }
                            }
                            if (var32 != null) {
                                if (var29 != null) {
                                    var32.method946((byte) 105, var26);
                                }
                                if (var30 != null) {
                                    var32.method946((byte) -46, var27);
                                }
                                if (var31 != null) {
                                    var32.method946((byte) 126, var28);
                                }
                                var32.method945(var24, var22, (byte) 108, var16);
                            }
                            ++var24;
                        }
                    }
                }
            }
            var8.method2551();
            var9.method2551();
            this.field7890 = this.field7842.method638((byte) -117, false);
            this.field7890.method1593(var6, 4, this.field7855 * 4, 1340);
            this.field7888 = this.field7842.method638((byte) -82, false);
            this.field7888.method1593(var7, var5, this.field7855 * var5, 1340);
            if (~(this.field7858 & 7) == -1) {
                if (this.field7861 != null) {
                    this.field7882 = this.field7842.method573(0, new class378[] { new class378(new class91[] { class91.field1226, class91.field1232, class91.field1231 }), new class378(class91.field1230) });
                } else {
                    this.field7882 = this.field7842.method573(0, new class378[] { new class378(new class91[] { class91.field1226, class91.field1232 }), new class378(class91.field1230) });
                }
            } else if (this.field7861 == null) {
                this.field7882 = this.field7842.method573(0, new class378[] { new class378(new class91[] { class91.field1226, class91.field1232, class91.field1229 }), new class378(class91.field1230) });
            } else {
                this.field7882 = this.field7842.method573(0, new class378[] { new class378(new class91[] { class91.field1226, class91.field1232, class91.field1231, class91.field1229 }), new class378(class91.field1230) });
            }
            int var17 = 0;
            for (int var18 = 0; var18 < var3.length; ++var18) {
                if (var3[var18].field2007 > 0) {
                    var3[var17++] = var3[var18];
                }
            }
            this.field7884 = new class145[var17];
            long[] var19 = new long[var17];
            for (int var20 = 0; var20 < var17; ++var20) {
                class145 var21 = var3[var20];
                var19[var20] = var21.field7166;
                this.field7884[var20] = var21;
                var21.method943(this.field7855, 4);
            }
            class487.method2853(1, var19, this.field7884);
            if (this.field7879 != null) {
                this.field7879.method3810(-8857);
            }
        }
        ++field7866;
        this.field7889 = null;
        this.field7872 = null;
        this.field7854 = null;
        this.field7863 = null;
        this.field7881 = this.field7880 = this.field7885 = null;
        this.field7871 = null;
        this.field7886 = null;
        this.field7876 = this.field7878 = null;
        this.field7861 = null;
    }
}
