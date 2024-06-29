import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class22 extends class139 {

    @OriginalMember(owner = "client!an", name = "q", descriptor = "F")
    private float field331 = Float.MAX_VALUE;

    @OriginalMember(owner = "client!an", name = "l", descriptor = "F")
    private float field326 = -3.4028235E38F;

    @OriginalMember(owner = "client!an", name = "N", descriptor = "Lgj;")
    private class593 field354 = new class593();

    @OriginalMember(owner = "client!an", name = "t", descriptor = "I")
    private int field334 = this.field2245 + -2;

    @OriginalMember(owner = "client!an", name = "P", descriptor = "[[I")
    private int[][] field356;

    @OriginalMember(owner = "client!an", name = "I", descriptor = "Lej;")
    public class111 field349;

    @OriginalMember(owner = "client!an", name = "ab", descriptor = "[[F")
    private float[][] field367;

    @OriginalMember(owner = "client!an", name = "B", descriptor = "I")
    public int field342;

    @OriginalMember(owner = "client!an", name = "M", descriptor = "[[[I")
    public int[][][] field353;

    @OriginalMember(owner = "client!an", name = "Z", descriptor = "[[F")
    private float[][] field366;

    @OriginalMember(owner = "client!an", name = "D", descriptor = "[[[I")
    private int[][][] field344;

    @OriginalMember(owner = "client!an", name = "S", descriptor = "I")
    private int field359;

    @OriginalMember(owner = "client!an", name = "v", descriptor = "[[[I")
    public int[][][] field336;

    @OriginalMember(owner = "client!an", name = "u", descriptor = "[[[I")
    public int[][][] field335;

    @OriginalMember(owner = "client!an", name = "L", descriptor = "[[[Lfk;")
    private class611[][][] field352;

    @OriginalMember(owner = "client!an", name = "W", descriptor = "[[B")
    private byte[][] field363;

    @OriginalMember(owner = "client!an", name = "m", descriptor = "[[S")
    public short[][] field327;

    @OriginalMember(owner = "client!an", name = "x", descriptor = "[[[I")
    private int[][][] field338;

    @OriginalMember(owner = "client!an", name = "w", descriptor = "[[B")
    private byte[][] field337;

    @OriginalMember(owner = "client!an", name = "gb", descriptor = "[[F")
    private float[][] field373;

    @OriginalMember(owner = "client!an", name = "bb", descriptor = "Ljw;")
    private class520 field368;

    @OriginalMember(owner = "client!an", name = "o", descriptor = "Lpm;")
    private class546 field329;

    @OriginalMember(owner = "client!an", name = "k", descriptor = "I")
    public static int field325;

    @OriginalMember(owner = "client!an", name = "n", descriptor = "I")
    public static int field328;

    @OriginalMember(owner = "client!an", name = "p", descriptor = "I")
    public static int field330;

    @OriginalMember(owner = "client!an", name = "r", descriptor = "I")
    public static int field332;

    @OriginalMember(owner = "client!an", name = "s", descriptor = "I")
    public static int field333;

    @OriginalMember(owner = "client!an", name = "y", descriptor = "I")
    private int field339;

    @OriginalMember(owner = "client!an", name = "z", descriptor = "I")
    public static int field340;

    @OriginalMember(owner = "client!an", name = "A", descriptor = "I")
    public static int field341;

    @OriginalMember(owner = "client!an", name = "E", descriptor = "I")
    public static int field345;

    @OriginalMember(owner = "client!an", name = "F", descriptor = "I")
    public static int field346;

    @OriginalMember(owner = "client!an", name = "G", descriptor = "I")
    public static int field347;

    @OriginalMember(owner = "client!an", name = "H", descriptor = "I")
    private int field348;

    @OriginalMember(owner = "client!an", name = "J", descriptor = "I")
    public static int field350;

    @OriginalMember(owner = "client!an", name = "K", descriptor = "I")
    public static int field351;

    @OriginalMember(owner = "client!an", name = "O", descriptor = "I")
    public static int field355;

    @OriginalMember(owner = "client!an", name = "Q", descriptor = "I")
    public static int field357;

    @OriginalMember(owner = "client!an", name = "R", descriptor = "I")
    public static int field358;

    @OriginalMember(owner = "client!an", name = "T", descriptor = "I")
    public static int field360;

    @OriginalMember(owner = "client!an", name = "U", descriptor = "I")
    public static int field361;

    @OriginalMember(owner = "client!an", name = "V", descriptor = "I")
    public static int field362;

    @OriginalMember(owner = "client!an", name = "cb", descriptor = "I")
    private int field369;

    @OriginalMember(owner = "client!an", name = "db", descriptor = "I")
    private int field370;

    @OriginalMember(owner = "client!an", name = "Y", descriptor = "Leu;")
    private class448 field365;

    @OriginalMember(owner = "client!an", name = "eb", descriptor = "Leu;")
    private class448 field371;

    @OriginalMember(owner = "client!an", name = "fb", descriptor = "Lts;")
    public class501 field372;

    @OriginalMember(owner = "client!an", name = "X", descriptor = "[Lfk;")
    private class611[] field364;

    @OriginalMember(owner = "client!an", name = "C", descriptor = "[[[I")
    private int[][][] field343;

    @OriginalMember(owner = "client!an", name = "BA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V", line = 4)
    public final void method194(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        ++field328;
        if (arg3 != null && this.field338 == null) {
            this.field338 = new int[super.field2247][super.field2248][];
        }
        if (arg5 != null && this.field343 == null) {
            this.field343 = new int[super.field2247][super.field2248][];
        }
        this.field353[arg0][arg1] = arg2;
        this.field336[arg0][arg1] = arg4;
        this.field335[arg0][arg1] = arg6;
        this.field344[arg0][arg1] = arg7;
        if (this.field343 != null) {
            this.field343[arg0][arg1] = arg5;
        }
        if (this.field338 != null) {
            this.field338[arg0][arg1] = arg3;
        }
        class611[] var15 = this.field352[arg0][arg1] = new class611[arg6.length];
        for (int var16 = 0; ~var16 > ~arg6.length; ++var16) {
            long var17 = (long) arg8[var16] | (long) arg10 << 28 | (long) arg11 << 42 | (long) arg12 << 48 | (long) (arg9[var16] << 14);
            class504 var19;
            for (var19 = this.field368.method2918(var17, (byte) 100); var19 != null; var19 = this.field368.method2919((byte) 122)) {
                class611 var20 = (class611) var19;
                if (~arg8[var16] == ~var20.field8062 && (float) arg9[var16] == var20.field8075 && var20.field8072 == arg10 && var20.field8069 == arg11 && ~var20.field8080 == ~arg12) {
                    break;
                }
            }
            if (var19 != null) {
                var15[var16] = (class611) var19;
            } else {
                var15[var16] = new class611(this, arg8[var16], arg9[var16], arg10, arg11, arg12);
                this.field368.method2911(var17, var15[var16], (byte) -28);
            }
        }
        if (arg13) {
            this.field337[arg0][arg1] = (byte) class220.method1393(this.field337[arg0][arg1], 1);
        }
        if (~this.field369 > ~arg6.length) {
            this.field369 = arg6.length;
        }
        this.field370 += arg6.length;
    }

    @OriginalMember(owner = "client!an", name = "JA", descriptor = "(II)I", line = 72)
    public final int method195(int arg0, int arg1) {
        ++field341;
        return this.field356[arg0][arg1];
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(BI)V", line = 80)
    public static final void method196(byte arg0, int arg1) {
        ++field351;
        class382 var2 = class396.method2276(-79, 6, arg1);
        var2.method2228((byte) -55);
        int var3 = -127 % ((arg0 - 54) / 55);
    }

    @OriginalMember(owner = "client!an", name = "<init>", descriptor = "(Lej;IIII[[I[[II)V", line = 92)
    public class22(class111 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7);
        this.field356 = arg5;
        this.field349 = arg0;
        this.field367 = new float[super.field2247 + 1][super.field2248 + 1];
        this.field342 = arg2;
        this.field353 = new int[arg3][arg4][];
        this.field366 = new float[super.field2247 + 1][super.field2248 - -1];
        this.field344 = new int[arg3][arg4][];
        this.field359 = 1 << this.field334;
        this.field336 = new int[arg3][arg4][];
        this.field335 = new int[arg3][arg4][];
        this.field352 = new class611[arg3][arg4][];
        this.field363 = new byte[arg3 + 1][arg4 - -1];
        this.field327 = new short[arg3 * arg4][];
        this.field338 = new int[arg3][arg4][];
        this.field337 = new byte[arg3][arg4];
        this.field373 = new float[super.field2247 + 1][super.field2248 - -1];
        for (int var9 = 0; super.field2248 >= var9; ++var9) {
            for (int var10 = 0; ~super.field2247 <= ~var10; ++var10) {
                int var11 = this.field356[var10][var9];
                if ((float) var11 > this.field326) {
                    this.field326 = (float) var11;
                }
                if ((float) var11 < this.field331) {
                    this.field331 = (float) var11;
                }
                if (~var10 < -1 && var9 > 0 && var10 < super.field2247 && ~var9 > ~super.field2248) {
                    int var12 = arg6[var10 - -1][var9] + -arg6[var10 + -1][var9];
                    int var13 = arg6[var10][var9 + 1] - arg6[var10][var9 - 1];
                    float var14 = (float) (1.0D / Math.sqrt((double) (var13 * var13 + arg7 * arg7 * 4 + var12 * var12)));
                    this.field367[var10][var9] = (float) var12 * var14;
                    this.field373[var10][var9] = (float) (-arg7 * 2) * var14;
                    this.field366[var10][var9] = (float) var13 * var14;
                }
            }
        }
        --this.field331;
        ++this.field326;
        this.field368 = new class520(128);
        if (~(16 & this.field342) != -1) {
            this.field329 = new class546(this.field349, this);
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(IIILdf;)V", line = 171)
    private final void method197(int arg0, int arg1, int arg2, class372 arg3) {
        ++field340;
        int[] var5 = this.field353[arg0][arg1];
        int[] var6 = this.field336[arg0][arg1];
        int var7 = var5.length;
        if (var7 > class271.field3779.length) {
            class168.field2600 = new int[var7];
            class271.field3779 = new int[var7];
        }
        for (int var8 = 0; ~var8 > ~var7; ++var8) {
            class271.field3779[var8] = var5[var8] >> this.field349.field1892;
            class168.field2600[var8] = var6[var8] >> this.field349.field1892;
        }
        int var9 = arg2;
        while (~var9 > ~var7) {
            int var10 = class271.field3779[var9];
            int var11 = class168.field2600[var9++];
            int var12 = class271.field3779[var9];
            int var13 = class168.field2600[var9++];
            int var14 = class271.field3779[var9];
            int var15 = class168.field2600[var9++];
            if (~((var13 - var15) * (-var12 + var10) + -((var13 - var11) * (-var12 + var14))) < -1) {
                arg3.method2191(var11, var10, var14, var13, var12, (byte) -100, var15);
            }
        }
    }

    @OriginalMember(owner = "client!an", name = "aa", descriptor = "(Lw;IIIIZ)V", line = 230)
    public final void method198(class276 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field355;
        if (this.field329 != null && arg0 != null) {
            int var7 = -(this.field349.field1844 * arg2 >> 8) + arg1 >> this.field349.field1892;
            int var8 = -(this.field349.field1899 * arg2 >> 8) + arg3 >> this.field349.field1892;
            this.field329.method3035(arg0, -10373, var8, var7);
        }
    }

    @OriginalMember(owner = "client!an", name = "c", descriptor = "(IILw;)Lw;", line = 250)
    public final class276 method199(int arg0, int arg1, class276 arg2) {
        ++field357;
        if ((this.field337[arg0][arg1] & 1) == 0) {
            return null;
        } else {
            int var4 = super.field2250 >> this.field349.field1892;
            class372 var5 = (class372) arg2;
            class372 var6;
            if (var5 != null && var5.method2194(var4, var4, 100)) {
                var6 = var5;
                var5.method2189((byte) 125);
            } else {
                var6 = new class372(this.field349, var4, var4);
            }
            var6.method2195(var4, -123, var4, 0, 0);
            this.method197(arg0, arg1, 0, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!an", name = "sa", descriptor = "(II)I", line = 279)
    public final int method200(int arg0, int arg1) {
        ++field360;
        int var3 = arg0 >> super.field2245;
        int var4 = arg1 >> super.field2245;
        if (~var3 <= -1 && ~var4 <= -1 && super.field2247 - 1 >= var3 && ~(super.field2248 + -1) <= ~var4) {
            int var5 = arg0 & super.field2250 + -1;
            int var6 = arg1 & super.field2250 + -1;
            int var7 = (-var5 + super.field2250) * this.field356[var3][var4] + this.field356[var3 + 1][var4] * var5 >> super.field2245;
            int var8 = (-var5 + super.field2250) * this.field356[var3][var4 + 1] - -(this.field356[var3 + 1][var4 + 1] * var5) >> super.field2245;
            return (-var6 + super.field2250) * var7 - -(var6 * var8) >> super.field2245;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(III[[ZZ)V", line = 307)
    public final void method201(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        ++field358;
        this.method202(arg3, 22468, arg1, arg2, arg4, -1, arg0);
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(II)V", line = 316)
    public final void method18(int arg0, int arg1) {
        ++field350;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "([[ZIIIZII)V", line = 325)
    private final void method202(boolean[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        if (arg1 == 22468) {
            if (this.field364 != null) {
                int var8 = arg3 + 1 + arg3;
                int var9 = var8 * var8;
                if (class334.field4591.length < var9) {
                    class334.field4591 = new int[var9];
                }
                int var10 = -arg3 + arg6;
                int var11 = var10;
                if (var10 < 0) {
                    var10 = 0;
                }
                int var12 = -arg3 + arg2;
                int var13 = var12;
                if (~var12 > -1) {
                    var12 = 0;
                }
                int var14 = arg3 + arg6;
                if (~(super.field2247 + -1) > ~var14) {
                    var14 = super.field2247 + -1;
                }
                int var15 = arg2 - -arg3;
                class521.field6966 = 0;
                if (var15 > super.field2248 - 1) {
                    var15 = super.field2248 - 1;
                }
                for (int var16 = var10; var14 >= var16; ++var16) {
                    boolean[] var23 = arg0[-var11 + var16];
                    for (int var24 = var12; ~var24 >= ~var15; ++var24) {
                        if (var23[-var13 + var24]) {
                            class334.field4591[class521.field6966++] = super.field2247 * var24 + var16;
                        }
                    }
                }
                if (~arg5 == 0) {
                    this.field349.method898(1);
                } else {
                    this.field349.method885(arg1 + -22353, (float) arg5);
                    this.field349.method843((byte) 123);
                }
                this.field349.method895(arg1 ^ 22468);
                this.field349.method903(false, ~(7 & this.field342) != -1);
                this.field349.method846(false, -1, false, (byte) 54);
                this.field349.method48((byte) -32, this.field365, 0);
                for (int var17 = 0; ~this.field364.length < ~var17; ++var17) {
                    this.field364[var17].method3347(class521.field6966, 112, class334.field4591);
                }
                class74 var18 = this.field349.method857(1558);
                var18.method576(0, -1, 0);
                this.field349.method848(arg1 ^ -362249932);
                if (!this.field354.method3254((byte) 32)) {
                    int var19 = this.field349.field1830;
                    int var20 = this.field349.field1827;
                    this.field349.method422(0, var20, this.field349.field1897);
                    this.field349.method903(false, false);
                    this.field349.method826(false, 87);
                    this.field349.method902(true, 128);
                    this.field349.method846(false, -2, false, (byte) 54);
                    this.field349.method897(this.field349.field1840, true);
                    this.field349.method909(class521.field6963, -119, class586.field7773);
                    this.field349.method859((byte) 29, class149.field2382, 0);
                    this.field349.method828(54, class681.field9596, 0);
                    for (class504 var21 = this.field354.method3257(-14); var21 != null; var21 = this.field354.method3263((byte) -71)) {
                        class624 var22 = (class624) var21;
                        var22.method3410(arg2, arg3, arg0, arg6, (byte) -104);
                    }
                    this.field349.method859((byte) 29, class350.field4792, 0);
                    this.field349.method828(18, class350.field4792, 0);
                    this.field349.method897((class430) null, true);
                    this.field349.method422(var19, var20, this.field349.field1897);
                }
                if (this.field329 != null) {
                    this.field349.method48((byte) -32, this.field365, 0);
                    this.field349.method48((byte) -32, this.field371, 1);
                    this.field349.method62(false, this.field372);
                    this.field329.method3041(arg3, arg0, (byte) -2, arg4, arg6, arg2);
                }
            }
            ++field332;
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(Lw;IIIIZ)Z", line = 467)
    public final boolean method203(class276 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field325;
        if (this.field329 != null && arg0 != null) {
            int var7 = arg1 - (this.field349.field1844 * arg2 >> 8) >> this.field349.field1892;
            int var8 = -(this.field349.field1899 * arg2 >> 8) + arg3 >> this.field349.field1892;
            return this.field329.method3036(arg0, (byte) -35, var7, var8);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 482)
    public final void method204(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field347;
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
        for (int var28 = 0; var28 < var18; ++var28) {
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
        this.method194(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(IIIIIII[[Z)V", line = 574)
    public final void method21(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field346;
        if (this.field370 > 0) {
            class4 var9 = this.field349.method839(this.field339, 62);
            int var10 = 0;
            int var11 = 32767;
            int var12 = -32768;
            for (int var13 = 0; var13 < 4; ++var13) {
                var10 = 0;
                Buffer var14 = var9.method27((byte) -64, true);
                if (var14 != null) {
                    Stream var15 = this.field349.method896(var14, (byte) -117);
                    if (Stream.method3473()) {
                        for (int var16 = arg4; var16 < arg6; ++var16) {
                            int var17 = super.field2247 * var16 + arg3;
                            for (int var18 = arg3; var18 < arg5; ++var18) {
                                if (arg7[-arg3 + var18][-arg4 + var16]) {
                                    short[] var19 = this.field327[var17];
                                    if (var19 != null) {
                                        for (int var20 = 0; var20 < var19.length; ++var20) {
                                            int var21 = var19[var20] & 65535;
                                            if (~var12 > ~var21) {
                                                var12 = var21;
                                            }
                                            if (var11 > var21) {
                                                var11 = var21;
                                            }
                                            ++var10;
                                            var15.method3474(var21);
                                        }
                                    }
                                }
                                ++var17;
                            }
                        }
                    } else {
                        for (int var22 = arg4; arg6 > var22; ++var22) {
                            int var25 = super.field2247 * var22 - -arg3;
                            for (int var26 = arg3; arg5 > var26; ++var26) {
                                if (arg7[-arg3 + var26][var22 - arg4]) {
                                    short[] var27 = this.field327[var25];
                                    if (var27 != null) {
                                        for (int var28 = 0; var27.length > var28; ++var28) {
                                            int var29 = var27[var28] & 65535;
                                            var15.method3478(var29);
                                            if (var29 < var11) {
                                                var11 = var29;
                                            }
                                            ++var10;
                                            if (var29 > var12) {
                                                var12 = var29;
                                            }
                                        }
                                    }
                                }
                                ++var25;
                            }
                        }
                    }
                    var15.method3479();
                    if (var9.method28(11390)) {
                        break;
                    }
                }
            }
            if (var10 > 0) {
                this.field349.method868(Integer.MAX_VALUE);
                this.field349.method825(-5284, false);
                this.field349.method903(false, false);
                this.field349.method875(false, (byte) 38);
                this.field349.method826(false, 66);
                this.field349.method902(true, 0);
                this.field349.method846(false, -2, false, (byte) 54);
                this.field349.method897((class430) null, true);
                class74 var23 = this.field349.method857(1558);
                float[] var24 = this.field349.method851((byte) 78);
                var24[6] = 0.0F;
                var24[8] = 0.0F;
                var24[10] = 1.0F / (-this.field331 + this.field326);
                var24[13] = -(((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field349.field1734) + 1.0F;
                var24[15] = 1.0F;
                var24[5] = (float) arg2 / ((float) super.field2250 * 128.0F * (float) this.field349.field1734);
                var24[11] = 0.0F;
                var24[4] = 0.0F;
                var24[12] = -1.0F - ((float) (arg2 * arg3) / 128.0F - (float) (arg0 * 2)) / (float) this.field349.field1669;
                var24[7] = 0.0F;
                var24[1] = 0.0F;
                var24[14] = -this.field331 / (-this.field331 + this.field326);
                var24[0] = (float) arg2 / ((float) super.field2250 * 128.0F * (float) this.field349.field1669);
                var24[2] = 0.0F;
                var24[3] = 0.0F;
                var24[9] = 0.0F;
                var23.method577(0.0F, 0.0F, true, 1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F);
                this.field349.method824((byte) 121);
                this.field349.method848(-362227984);
                if (~(this.field342 & 7) != -1) {
                    this.field349.method903(false, true);
                    this.field349.method102((byte) 116);
                } else {
                    this.field349.method903(false, false);
                }
                this.field349.method71(0, false);
                this.field349.method48((byte) -32, this.field365, 0);
                this.field349.method48((byte) -32, this.field371, 1);
                this.field349.method62(false, this.field372);
                this.field349.method53(0, var11, class620.field8229, var9, 0, var12 + 1 + -var11, var10 / 3);
                this.field349.method71(0, true);
            }
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(Z)Ljava/lang/String;", line = 769)
    public static final String method205(boolean arg0) {
        ++field361;
        if (!class388.field5142 && class221.field3132 != null) {
            return arg0 ? null : class221.field3132.field2001;
        } else {
            return "";
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(Lpv;[I)V", line = 787)
    public final void method206(class65 arg0, int[] arg1) {
        this.field354.method3265(new class624(this.field349, this, arg0, arg1), (byte) -90);
        ++field333;
    }

    @OriginalMember(owner = "client!an", name = "ba", descriptor = "()V", line = 797)
    public final void method207() {
        ++field362;
        if (this.field370 > 0) {
            byte[][] var1 = new byte[super.field2247 + 1][super.field2248 + 1];
            for (int var2 = 1; super.field2247 > var2; ++var2) {
                for (int var107 = 1; var107 < super.field2248; ++var107) {
                    var1[var2][var107] = (byte) ((this.field363[var2][var107 + -1] >> 2) + (this.field363[var2][var107] >> 1) + (this.field363[var2 + -1][var107] >> 2) + (this.field363[var2][var107 + 1] >> 3) + (this.field363[var2 + 1][var107] >> 3));
                }
            }
            class611[] var3 = new class611[this.field368.method2920(false)];
            this.field368.method2913(var3, 0);
            for (int var4 = 0; var4 < var3.length; ++var4) {
                var3[var4].method3343(this.field370, 8);
            }
            int var5 = 20;
            if (this.field343 != null) {
                var5 += 4;
            }
            if (~(this.field342 & 7) != -1) {
                var5 += 12;
            }
            NativeHeapBuffer var6 = this.field349.field1803.method3467(this.field370 * 4, false);
            NativeHeapBuffer var7 = this.field349.field1803.method3467(this.field370 * var5, false);
            Stream var8 = new Stream(var7);
            Stream var9 = new Stream(var6);
            class611[] var10 = new class611[this.field370];
            int var11 = class132.method996(this.field370 / 4, 104);
            if (var11 < 1) {
                var11 = 1;
            }
            class520 var12 = new class520(var11);
            class611[] var13 = new class611[this.field369];
            for (int var14 = 0; ~super.field2247 < ~var14; ++var14) {
                for (int var34 = 0; super.field2248 > var34; ++var34) {
                    if (this.field335[var14][var34] != null) {
                        class611[] var35 = this.field352[var14][var34];
                        int[] var36 = this.field353[var14][var34];
                        int[] var37 = this.field336[var14][var34];
                        int[] var38 = this.field344[var14][var34];
                        int[] var39 = this.field335[var14][var34];
                        int[] var40 = this.field338 != null ? this.field338[var14][var34] : null;
                        int[] var41 = this.field343 == null ? null : this.field343[var14][var34];
                        if (var38 == null) {
                            var38 = var39;
                        }
                        float var42 = this.field367[var14][var34];
                        float var43 = this.field373[var14][var34];
                        float var44 = this.field366[var14][var34];
                        float var45 = this.field367[var14][var34 - -1];
                        float var46 = this.field373[var14][var34 + 1];
                        float var47 = this.field366[var14][var34 - -1];
                        float var48 = this.field367[var14 + 1][var34 - -1];
                        float var49 = this.field373[var14 + 1][var34 + 1];
                        float var50 = this.field366[var14 - -1][var34 + 1];
                        float var51 = this.field367[var14 + 1][var34];
                        float var52 = this.field373[var14 + 1][var34];
                        float var53 = this.field366[var14 - -1][var34];
                        int var54 = 255 & var1[var14][var34];
                        int var55 = 255 & var1[var14][var34 + 1];
                        int var56 = 255 & var1[var14 + 1][var34 + 1];
                        int var57 = var1[var14 - -1][var34] & 255;
                        int var58 = 0;
                        label360: for (int var59 = 0; var39.length > var59; ++var59) {
                            class611 var105 = var35[var59];
                            for (int var106 = 0; var58 > var106; ++var106) {
                                if (var13[var106] == var105) {
                                    continue label360;
                                }
                            }
                            var13[var58++] = var105;
                        }
                        short[] var60 = this.field327[super.field2247 * var34 - -var14] = new short[var39.length];
                        for (int var61 = 0; ~var61 > ~var39.length; ++var61) {
                            int var62 = (var14 << super.field2245) + var36[var61];
                            int var63 = (var34 << super.field2245) + var37[var61];
                            int var64 = var62 >> this.field334;
                            int var65 = var63 >> this.field334;
                            int var66 = var39[var61];
                            int var67 = var38[var61];
                            int var68 = var40 != null ? var40[var61] : 0;
                            long var69 = (long) var65 | (long) (var64 << 16) | (long) var67 << 48 | (long) var66 << 32;
                            int var71 = var36[var61];
                            int var72 = var37[var61];
                            byte var73 = 74;
                            int var74 = 0;
                            float var75;
                            float var76;
                            int var77;
                            float var78;
                            if (~var71 == -1 && ~var72 == -1) {
                                var75 = var43;
                                var76 = var42;
                                var77 = var73 - var54;
                                var78 = var44;
                            } else if (var71 == 0 && super.field2250 == var72) {
                                var76 = var45;
                                var75 = var46;
                                var78 = var47;
                                var77 = var73 - var55;
                            } else if (~super.field2250 == ~var71 && ~super.field2250 == ~var72) {
                                var76 = var48;
                                var75 = var49;
                                var78 = var50;
                                var77 = var73 - var56;
                            } else if (super.field2250 == var71 && ~var72 == -1) {
                                var78 = var53;
                                var75 = var52;
                                var77 = var73 - var57;
                                var76 = var51;
                            } else {
                                float var79 = (float) var71 / (float) super.field2250;
                                float var80 = (float) var72 / (float) super.field2250;
                                float var81 = (-var42 + var51) * var79 + var42;
                                float var82 = (-var43 + var52) * var79 + var43;
                                float var83 = (var53 - var44) * var79 + var44;
                                float var84 = (var48 - var45) * var79 + var45;
                                float var85 = (var49 - var46) * var79 + var46;
                                float var86 = (-var47 + var50) * var79 + var47;
                                var75 = (-var82 + var85) * var80 + var82;
                                var76 = (-var81 + var84) * var80 + var81;
                                var78 = (-var83 + var86) * var80 + var83;
                                int var87 = ((-var54 + var57) * var71 >> super.field2245) + var54;
                                int var88 = ((-var55 + var56) * var71 >> super.field2245) + var55;
                                var77 = var73 - (var87 - -((-var87 + var88) * var72 >> super.field2245));
                            }
                            float var89 = 1.0F;
                            if (var66 != -1) {
                                int var90 = (127 & var66) * var77 >> 7;
                                if (~var90 <= -3) {
                                    if (~var90 < -127) {
                                        var90 = 126;
                                    }
                                } else {
                                    var90 = 2;
                                }
                                var74 = class444.field6084[var66 & 65408 | var90];
                                if ((this.field342 & 7) == 0) {
                                    float var91 = this.field349.field1901[2] * var78 + this.field349.field1901[1] * var75 + this.field349.field1901[0] * var76;
                                    var89 = this.field349.field1833 + (var91 > 0.0F ? this.field349.field1917 : this.field349.field1865) * var91;
                                }
                            }
                            class504 var92 = null;
                            if (~(this.field359 + -1 & var62) == -1 && (this.field359 + -1 & var63) == 0) {
                                var92 = var12.method2918(var69, (byte) 56);
                            }
                            int var103;
                            if (var92 == null) {
                                int var94;
                                if (~var66 != ~var67) {
                                    int var93 = (var67 & 127) * var77 >> 7;
                                    if (~var93 > -3) {
                                        var93 = 2;
                                    } else if (~var93 < -127) {
                                        var93 = 126;
                                    }
                                    var94 = class444.field6084[var93 | var67 & 65408];
                                    if ((7 & this.field342) == 0) {
                                        float var95 = this.field349.field1901[2] * var78 + this.field349.field1901[0] * var76 + this.field349.field1901[1] * var75;
                                        float var96 = (var89 > 0.0F ? this.field349.field1917 : this.field349.field1865) * var89 + this.field349.field1833;
                                        int var97 = (var94 & 16749936) >> 16;
                                        int var98 = (var94 & 65358) >> 8;
                                        int var99 = (int) ((float) var97 * var96);
                                        int var100 = 255 & var94;
                                        int var101 = (int) ((float) var98 * var96);
                                        if (var99 >= 0) {
                                            if (~var99 < -256) {
                                                var99 = 255;
                                            }
                                        } else {
                                            var99 = 0;
                                        }
                                        if (~var101 > -1) {
                                            var101 = 0;
                                        } else if (~var101 < -256) {
                                            var101 = 255;
                                        }
                                        int var102 = (int) ((float) var100 * var96);
                                        if (~var102 > -1) {
                                            var102 = 0;
                                        } else if (var102 > 255) {
                                            var102 = 255;
                                        }
                                        var94 = var101 << 8 | var99 << 16 | var102;
                                    }
                                } else {
                                    var94 = var74;
                                }
                                if (Stream.method3473()) {
                                    var8.method3480((float) var62);
                                    var8.method3480((float) (this.method200(var62, var63) + var68));
                                    var8.method3480((float) var63);
                                    var8.method3480((float) var62);
                                    var8.method3480((float) var63);
                                    if (this.field343 != null) {
                                        var8.method3480((float) (var41 != null ? var41[var61] + -1 : 0));
                                    }
                                    if (~(7 & this.field342) != -1) {
                                        var8.method3480(var76);
                                        var8.method3480(var75);
                                        var8.method3480(var78);
                                    }
                                } else {
                                    var8.method3477((float) var62);
                                    var8.method3477((float) (var68 + this.method200(var62, var63)));
                                    var8.method3477((float) var63);
                                    var8.method3477((float) var62);
                                    var8.method3477((float) var63);
                                    if (this.field343 != null) {
                                        var8.method3477((float) (var41 != null ? var41[var61] - 1 : 0));
                                    }
                                    if ((this.field342 & 7) != 0) {
                                        var8.method3477(var76);
                                        var8.method3477(var75);
                                        var8.method3477(var78);
                                    }
                                }
                                if (this.field349.field1835 != 0) {
                                    var9.method3472(var94 | -16777216);
                                } else {
                                    var9.method3469(var94 | -16777216);
                                }
                                var103 = this.field348++;
                                var60[var61] = (short) var103;
                                if (~var66 != 0) {
                                    var10[var103] = var35[var61];
                                }
                                var12.method2911(var69, new class286(var60[var61]), (byte) -28);
                            } else {
                                var60[var61] = ((class286) var92).field4030;
                                var103 = var60[var61] & 65535;
                                if (~var66 != 0 && var35[var61].field6724 < var10[var103].field6724) {
                                    var10[var103] = var35[var61];
                                }
                            }
                            for (int var104 = 0; ~var104 > ~var58; ++var104) {
                                var13[var104].method3345(var89, var74, var103, 89, var77);
                            }
                            ++this.field339;
                        }
                    }
                }
            }
            for (int var15 = 0; this.field348 > var15; ++var15) {
                class611 var33 = var10[var15];
                if (var33 != null) {
                    var33.method3349(2, var15);
                }
            }
            for (int var16 = 0; var16 < super.field2247; ++var16) {
                for (int var22 = 0; ~var22 > ~super.field2248; ++var22) {
                    short[] var23 = this.field327[super.field2247 * var22 + var16];
                    if (var23 != null) {
                        int var24 = 0;
                        int var25 = 0;
                        while (var23.length > var25) {
                            int var26 = 65535 & var23[var25++];
                            int var27 = var23[var25++] & 65535;
                            int var28 = var23[var25++] & 65535;
                            class611 var29 = var10[var26];
                            class611 var30 = var10[var27];
                            class611 var31 = var10[var28];
                            class611 var32 = null;
                            if (var29 != null) {
                                var32 = var29;
                                var29.method3344(var16, var22, 108, var24);
                            }
                            if (var30 != null) {
                                var30.method3344(var16, var22, 114, var24);
                                if (var32 == null || ~var30.field6724 > ~var32.field6724) {
                                    var32 = var30;
                                }
                            }
                            if (var31 != null) {
                                var31.method3344(var16, var22, 87, var24);
                                if (var32 == null || ~var31.field6724 > ~var32.field6724) {
                                    var32 = var31;
                                }
                            }
                            if (var32 != null) {
                                if (var29 != null) {
                                    var32.method3349(2, var26);
                                }
                                if (var30 != null) {
                                    var32.method3349(2, var27);
                                }
                                if (var31 != null) {
                                    var32.method3349(2, var28);
                                }
                                var32.method3344(var16, var22, 97, var24);
                            }
                            ++var24;
                        }
                    }
                }
            }
            var8.method3479();
            var9.method3479();
            this.field371 = this.field349.method108(false, 15918);
            this.field371.method2521((byte) -61, 4, this.field348 * 4, var6);
            this.field365 = this.field349.method108(false, 15918);
            this.field365.method2521((byte) -61, var5, this.field348 * var5, var7);
            if ((7 & this.field342) == 0) {
                if (this.field343 != null) {
                    this.field372 = this.field349.method45(1, new class282[] { new class282(new class512[] { class512.field6843, class512.field6848, class512.field6847 }), new class282(class512.field6846) });
                } else {
                    this.field372 = this.field349.method45(1, new class282[] { new class282(new class512[] { class512.field6843, class512.field6848 }), new class282(class512.field6846) });
                }
            } else if (this.field343 != null) {
                this.field372 = this.field349.method45(1, new class282[] { new class282(new class512[] { class512.field6843, class512.field6848, class512.field6847, class512.field6845 }), new class282(class512.field6846) });
            } else {
                this.field372 = this.field349.method45(1, new class282[] { new class282(new class512[] { class512.field6843, class512.field6848, class512.field6845 }), new class282(class512.field6846) });
            }
            int var17 = 0;
            for (int var18 = 0; ~var3.length < ~var18; ++var18) {
                if (var3[var18].field8070 > 0) {
                    var3[var17++] = var3[var18];
                }
            }
            this.field364 = new class611[var17];
            long[] var19 = new long[var17];
            for (int var20 = 0; ~var17 < ~var20; ++var20) {
                class611 var21 = var3[var20];
                var19[var20] = var21.field6724;
                this.field364[var20] = var21;
                var21.method3351(false, this.field348);
            }
            class28.method242(this.field364, var19, (byte) -64);
            if (this.field329 != null) {
                this.field329.method3037(1);
            }
        } else {
            this.field329 = null;
        }
        this.field353 = this.field336 = null;
        this.field335 = null;
        this.field367 = this.field373 = this.field366 = null;
        this.field343 = null;
        this.field368 = null;
        this.field338 = null;
        this.field344 = null;
        this.field363 = null;
        this.field352 = null;
    }

    @OriginalMember(owner = "client!an", name = "FA", descriptor = "(Lw;IIIIZ)V", line = 1403)
    public final void method208(class276 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field330;
        if (this.field329 != null && arg0 != null) {
            int var7 = -(this.field349.field1844 * arg2 >> 8) + arg1 >> this.field349.field1892;
            int var8 = -(this.field349.field1899 * arg2 >> 8) + arg3 >> this.field349.field1892;
            this.field329.method3040(var8, arg0, (byte) 14, var7);
        }
    }

    @OriginalMember(owner = "client!an", name = "EA", descriptor = "(III)V", line = 1428)
    public final void method209(int arg0, int arg1, int arg2) {
        ++field345;
        if (~(255 & this.field363[arg0][arg1]) > ~arg2) {
            this.field363[arg0][arg1] = (byte) arg2;
        }
    }
}
