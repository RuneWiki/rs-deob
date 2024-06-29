import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class523 extends class278 {

    @OriginalMember(owner = "client!um", name = "C", descriptor = "F")
    private float field7448 = Float.MAX_VALUE;

    @OriginalMember(owner = "client!um", name = "p", descriptor = "F")
    private float field7435 = -3.4028235E38F;

    @OriginalMember(owner = "client!um", name = "s", descriptor = "Lbq;")
    private class289 field7438 = new class289();

    @OriginalMember(owner = "client!um", name = "X", descriptor = "I")
    private int field7469 = this.field3409 - 2;

    @OriginalMember(owner = "client!um", name = "A", descriptor = "Lln;")
    public class377 field7446;

    @OriginalMember(owner = "client!um", name = "E", descriptor = "I")
    public int field7450;

    @OriginalMember(owner = "client!um", name = "F", descriptor = "[[[Lo;")
    private class29[][][] field7451;

    @OriginalMember(owner = "client!um", name = "Z", descriptor = "[[F")
    private float[][] field7471;

    @OriginalMember(owner = "client!um", name = "t", descriptor = "[[[I")
    public int[][][] field7439;

    @OriginalMember(owner = "client!um", name = "r", descriptor = "I")
    private int field7437;

    @OriginalMember(owner = "client!um", name = "fb", descriptor = "[[F")
    private float[][] field7477;

    @OriginalMember(owner = "client!um", name = "J", descriptor = "[[B")
    private byte[][] field7455;

    @OriginalMember(owner = "client!um", name = "y", descriptor = "[[S")
    public short[][] field7444;

    @OriginalMember(owner = "client!um", name = "M", descriptor = "[[[I")
    public int[][][] field7458;

    @OriginalMember(owner = "client!um", name = "G", descriptor = "[[[I")
    private int[][][] field7452;

    @OriginalMember(owner = "client!um", name = "hb", descriptor = "[[F")
    private float[][] field7479;

    @OriginalMember(owner = "client!um", name = "z", descriptor = "[[[I")
    private int[][][] field7445;

    @OriginalMember(owner = "client!um", name = "ib", descriptor = "[[B")
    private byte[][] field7480;

    @OriginalMember(owner = "client!um", name = "x", descriptor = "[[[I")
    public int[][][] field7443;

    @OriginalMember(owner = "client!um", name = "bb", descriptor = "Lpfa;")
    private class295 field7473;

    @OriginalMember(owner = "client!um", name = "w", descriptor = "Lnw;")
    private class584 field7442;

    @OriginalMember(owner = "client!um", name = "H", descriptor = "Lqo;")
    public static class22 field7453 = new class22();

    @OriginalMember(owner = "client!um", name = "N", descriptor = "[I")
    public static int[] field7459 = new int[4096];

    @OriginalMember(owner = "client!um", name = "P", descriptor = "I")
    public static int field7461 = 0;

    @OriginalMember(owner = "client!um", name = "m", descriptor = "I")
    public static int field7432;

    @OriginalMember(owner = "client!um", name = "n", descriptor = "I")
    public static int field7433;

    @OriginalMember(owner = "client!um", name = "o", descriptor = "I")
    public static int field7434;

    @OriginalMember(owner = "client!um", name = "q", descriptor = "I")
    public static int field7436;

    @OriginalMember(owner = "client!um", name = "u", descriptor = "I")
    public static int field7440;

    @OriginalMember(owner = "client!um", name = "v", descriptor = "I")
    public static int field7441;

    @OriginalMember(owner = "client!um", name = "B", descriptor = "I")
    private int field7447;

    @OriginalMember(owner = "client!um", name = "D", descriptor = "I")
    public static int field7449;

    @OriginalMember(owner = "client!um", name = "I", descriptor = "I")
    public static int field7454;

    @OriginalMember(owner = "client!um", name = "K", descriptor = "I")
    public static int field7456;

    @OriginalMember(owner = "client!um", name = "O", descriptor = "I")
    public static int field7460;

    @OriginalMember(owner = "client!um", name = "Q", descriptor = "I")
    public static int field7462;

    @OriginalMember(owner = "client!um", name = "R", descriptor = "I")
    public static int field7463;

    @OriginalMember(owner = "client!um", name = "S", descriptor = "I")
    public static int field7464;

    @OriginalMember(owner = "client!um", name = "T", descriptor = "I")
    private int field7465;

    @OriginalMember(owner = "client!um", name = "U", descriptor = "I")
    public static int field7466;

    @OriginalMember(owner = "client!um", name = "V", descriptor = "I")
    public static int field7467;

    @OriginalMember(owner = "client!um", name = "W", descriptor = "I")
    public static int field7468;

    @OriginalMember(owner = "client!um", name = "Y", descriptor = "I")
    private int field7470;

    @OriginalMember(owner = "client!um", name = "db", descriptor = "I")
    private int field7475;

    @OriginalMember(owner = "client!um", name = "eb", descriptor = "Lel;")
    private class545 field7476;

    @OriginalMember(owner = "client!um", name = "gb", descriptor = "Lel;")
    private class545 field7478;

    @OriginalMember(owner = "client!um", name = "cb", descriptor = "Lf;")
    public class753 field7474;

    @OriginalMember(owner = "client!um", name = "ab", descriptor = "[Lo;")
    private class29[] field7472;

    @OriginalMember(owner = "client!um", name = "L", descriptor = "[[[I")
    private int[][][] field7457;

    @OriginalMember(owner = "client!um", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V", line = 3)
    public final void method1673(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        ++field7434;
        if (arg5 != null && this.field7457 == null) {
            this.field7457 = new int[super.field3410][super.field3408][];
        }
        if (arg3 != null && this.field7452 == null) {
            this.field7452 = new int[super.field3410][super.field3408][];
        }
        class150 var15 = this.field7446.field578;
        this.field7458[arg0][arg1] = arg2;
        this.field7443[arg0][arg1] = arg4;
        this.field7439[arg0][arg1] = arg6;
        this.field7445[arg0][arg1] = arg7;
        if (this.field7457 != null) {
            this.field7457[arg0][arg1] = arg5;
        }
        if (this.field7452 != null) {
            this.field7452[arg0][arg1] = arg3;
        }
        class29[] var16 = this.field7451[arg0][arg1] = new class29[arg6.length];
        for (int var17 = 0; arg6.length > var17; ++var17) {
            int var18 = arg8[var17];
            int var19 = arg9[var17];
            if ((32 & this.field7450) != 0 && var18 != -1 && var15.method931(var18, true).field3694) {
                var18 = -1;
                var19 = 128;
            }
            long var20 = (long) (var19 << 14) | (long) arg10 << 28 | (long) arg12 << 48 | (long) arg11 << 42 | (long) var18;
            class134 var22;
            for (var22 = this.field7473.method1754(false, var20); var22 != null; var22 = this.field7473.method1759(-1)) {
                class29 var23 = (class29) var22;
                if (var23.field334 == var18 && (float) var19 == var23.field333 && var23.field326 == arg10 && var23.field329 == arg11 && ~var23.field335 == ~arg12) {
                    break;
                }
            }
            if (var22 == null) {
                var16[var17] = new class29(this, var18, var19, arg10, arg11, arg12);
                this.field7473.method1751(var16[var17], 3970, var20);
            } else {
                var16[var17] = (class29) var22;
            }
        }
        if (arg13) {
            this.field7455[arg0][arg1] = (byte) class695.method3919(this.field7455[arg0][arg1], 1);
        }
        if (this.field7475 < arg6.length) {
            this.field7475 = arg6.length;
        }
        this.field7470 += arg6.length;
    }

    @OriginalMember(owner = "client!um", name = "wa", descriptor = "(Lr;IIIIZ)V", line = 82)
    public final void method1663(class182 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field7462;
        if (this.field7442 != null && arg0 != null) {
            int var7 = arg1 - (this.field7446.field5144 * arg2 >> 8) >> this.field7446.field5103;
            int var8 = arg3 - (this.field7446.field5083 * arg2 >> 8) >> this.field7446.field5103;
            this.field7442.method3359((byte) -88, var7, arg0, var8);
        }
    }

    @OriginalMember(owner = "client!um", name = "ka", descriptor = "(III)V", line = 98)
    public final void method1666(int arg0, int arg1, int arg2) {
        if (arg2 > (this.field7480[arg0][arg1] & 255)) {
            this.field7480[arg0][arg1] = (byte) arg2;
        }
        ++field7468;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(III[[ZZI)V", line = 109)
    public final void method1667(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        ++field7466;
        this.method3073(arg2, -1, arg0, arg4, false, arg5, arg1, arg3);
    }

    @OriginalMember(owner = "client!um", name = "CA", descriptor = "(Lr;IIIIZ)V", line = 117)
    public final void method1677(class182 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field7456;
        if (this.field7442 != null && arg0 != null) {
            int var7 = -(this.field7446.field5144 * arg2 >> 8) + arg1 >> this.field7446.field5103;
            int var8 = -(this.field7446.field5083 * arg2 >> 8) + arg3 >> this.field7446.field5103;
            this.field7442.method3352(var7, var8, -1, arg0);
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(B)V", line = 137)
    public static void method3071(byte arg0) {
        field7453 = null;
        int var1 = 6 / ((-2 - arg0) / 50);
        field7459 = null;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(II)V", line = 147)
    public final void method1672(int arg0, int arg1) {
        ++field7454;
    }

    @OriginalMember(owner = "client!um", name = "fa", descriptor = "(IILr;)Lr;", line = 155)
    public final class182 method1678(int arg0, int arg1, class182 arg2) {
        ++field7464;
        if ((1 & this.field7455[arg0][arg1]) == 0) {
            return null;
        } else {
            int var4 = super.field3413 >> this.field7446.field5103;
            class192 var5 = (class192) arg2;
            class192 var6;
            if (var5 != null && var5.method1163(13793, var4, var4)) {
                var6 = var5;
                var5.method1171(0);
            } else {
                var6 = new class192(this.field7446, var4, var4);
            }
            var6.method1166(-1778027312, var4, 0, 0, var4);
            this.method3072(arg1, 0, arg0, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IIILru;)V", line = 193)
    private final void method3072(int arg0, int arg1, int arg2, class192 arg3) {
        ++field7436;
        int[] var5 = this.field7458[arg2][arg0];
        int[] var6 = this.field7443[arg2][arg0];
        int var7 = var5.length;
        if (var7 > class361.field4644.length) {
            class544.field7831 = new int[var7];
            class361.field4644 = new int[var7];
        }
        for (int var8 = arg1; ~var7 < ~var8; ++var8) {
            class361.field4644[var8] = var5[var8] >> this.field7446.field5103;
            class544.field7831[var8] = var6[var8] >> this.field7446.field5103;
        }
        int var9 = 0;
        while (var7 > var9) {
            int var10 = class361.field4644[var9];
            int var11 = class544.field7831[var9++];
            int var12 = class361.field4644[var9];
            int var13 = class544.field7831[var9++];
            int var14 = class361.field4644[var9];
            int var15 = class544.field7831[var9++];
            if ((-var12 + var10) * (-var15 + var13) + -((-var11 + var13) * (-var12 + var14)) > 0) {
                arg3.method1169(var14, -85, var12, var10, var13, var11, var15);
            }
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Lada;[I)V", line = 251)
    public final void method1668(class163 arg0, int[] arg1) {
        ++field7440;
        this.field7438.method1721((byte) 98, new class168(this.field7446, this, arg0, arg1));
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 260)
    public final void method1665(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field7463;
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
        for (int var28 = 0; var18 > var28; ++var28) {
            int var29 = arg6[var28];
            int var30 = arg7[var28];
            int var31 = arg8[var28];
            var19[var27] = arg2[var29];
            var20[var27] = arg4[var29];
            var21[var27] = arg9[var28];
            var23[var27] = arg11[var28];
            var24[var27] = arg12[var28];
            var22[var27] = arg10 != null ? arg10[var28] : arg9[var28];
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
            var22[var27] = arg10 != null ? arg10[var28] : arg9[var28];
            if (arg3 != null) {
                var25[var27] = arg3[var31];
            }
            if (arg5 != null) {
                var26[var27] = arg5[var31];
            }
            ++var27;
        }
        this.method1673(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IIIZZII[[Z)V", line = 348)
    private final void method3073(int arg0, int arg1, int arg2, boolean arg3, boolean arg4, int arg5, int arg6, boolean[][] arg7) {
        if (this.field7472 != null) {
            int var9 = arg0 + 1 + arg0;
            int var10 = var9 * var9;
            if (class723.field10132.length < var10) {
                class723.field10132 = new int[var10];
            }
            int var11 = -arg0 + arg2;
            int var12 = var11;
            if (~var11 > -1) {
                var11 = 0;
            }
            int var13 = -arg0 + arg6;
            int var14 = var13;
            if (var13 < 0) {
                var13 = 0;
            }
            int var15 = arg0 + arg2;
            if (~(super.field3410 - 1) > ~var15) {
                var15 = super.field3410 + -1;
            }
            int var16 = arg0 + arg6;
            class128.field1349 = 0;
            if (~(super.field3408 + -1) > ~var16) {
                var16 = super.field3408 + -1;
            }
            for (int var17 = var11; var15 >= var17; ++var17) {
                boolean[] var24 = arg7[-var12 + var17];
                for (int var25 = var13; var25 <= var16; ++var25) {
                    if (var24[-var14 + var25]) {
                        class723.field10132[class128.field1349++] = super.field3410 * var25 + var17;
                    }
                }
            }
            if (~arg1 == 0) {
                this.field7446.method2256(1);
            } else {
                this.field7446.method2212(3, (float) arg1);
                this.field7446.method2218((byte) -121);
            }
            this.field7446.method2294(true);
            this.field7446.method2284((7 & this.field7450) != 0, 30315);
            this.field7446.method2275(false, false, (byte) 24, -1);
            this.field7446.method2301(true, this.field7476, 0);
            for (int var18 = 0; var18 < this.field7472.length; ++var18) {
                this.field7472[var18].method148((byte) 79, class128.field1349, class723.field10132);
            }
            class427 var19 = this.field7446.method2263((byte) 55);
            var19.method1019(0, -1, 0);
            this.field7446.method2304(27);
            if (!this.field7438.method1717((byte) 28)) {
                int var20 = this.field7446.field5117;
                int var21 = this.field7446.field5088;
                this.field7446.method342(0, var21, this.field7446.field5135);
                this.field7446.method2284(false, 30315);
                this.field7446.method2234(false, 0);
                this.field7446.method2274(128, -2);
                this.field7446.method2275(false, false, (byte) 24, -2);
                this.field7446.method2207((byte) -61, this.field7446.field5149);
                this.field7446.method2242(-102, class94.field989, class372.field4752);
                this.field7446.method2264(0, class58.field582, (byte) 60);
                this.field7446.method2268(0, 99, class169.field1881);
                for (class134 var22 = this.field7438.method1719(65280); var22 != null; var22 = this.field7438.method1723(-20665)) {
                    class168 var23 = (class168) var22;
                    var23.method1041(arg7, arg2, 20023, arg0, arg6);
                }
                this.field7446.method2264(0, class424.field6157, (byte) 60);
                this.field7446.method2268(0, 115, class424.field6157);
                this.field7446.method2207((byte) -61, (class596) null);
                this.field7446.method342(var20, var21, this.field7446.field5135);
            }
            if (this.field7442 != null) {
                this.field7446.method2301(true, this.field7476, 0);
                this.field7446.method2301(true, this.field7478, 1);
                this.field7446.method2285(1, this.field7474);
                this.field7442.method3354(arg3, arg0, arg6, arg7, 15, arg2);
            }
        }
        if (arg4) {
            this.field7478 = null;
        }
        ++field7449;
    }

    @OriginalMember(owner = "client!um", name = "<init>", descriptor = "(Lln;IIII[[I[[II)V", line = 495)
    public class523(class377 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        this.field7446 = arg0;
        this.field7450 = arg2;
        this.field7451 = new class29[arg3][arg4][];
        this.field7471 = new float[super.field3410 + 1][super.field3408 + 1];
        this.field7439 = new int[arg3][arg4][];
        this.field7437 = 1 << this.field7469;
        this.field7477 = new float[super.field3410 + 1][super.field3408 + 1];
        this.field7455 = new byte[arg3][arg4];
        this.field7444 = new short[arg3 * arg4][];
        this.field7458 = new int[arg3][arg4][];
        this.field7452 = new int[arg3][arg4][];
        this.field7479 = new float[super.field3410 + 1][super.field3408 + 1];
        this.field7445 = new int[arg3][arg4][];
        this.field7480 = new byte[arg3 + 1][arg4 + 1];
        this.field7443 = new int[arg3][arg4][];
        for (int var9 = 0; var9 <= super.field3408; ++var9) {
            for (int var10 = 0; ~var10 >= ~super.field3410; ++var10) {
                int var11 = super.field3415[var10][var9];
                if ((float) var11 > this.field7435) {
                    this.field7435 = (float) var11;
                }
                if ((float) var11 < this.field7448) {
                    this.field7448 = (float) var11;
                }
                if (~var10 < -1 && ~var9 < -1 && ~var10 > ~super.field3410 && var9 < super.field3408) {
                    int var12 = arg6[var10 + 1][var9] + -arg6[var10 + -1][var9];
                    int var13 = arg6[var10][var9 - -1] + -arg6[var10][var9 + -1];
                    float var14 = (float) (1.0D / Math.sqrt((double) (var13 * var13 + arg7 * 4 * arg7 + var12 * var12)));
                    this.field7477[var10][var9] = (float) var12 * var14;
                    this.field7479[var10][var9] = (float) (-arg7 * 2) * var14;
                    this.field7471[var10][var9] = (float) var13 * var14;
                }
            }
        }
        --this.field7448;
        ++this.field7435;
        this.field7473 = new class295(128);
        if (~(this.field7450 & 16) != -1) {
            this.field7442 = new class584(this.field7446, this);
        }
    }

    @OriginalMember(owner = "client!um", name = "YA", descriptor = "()V", line = 571)
    public final void method1674() {
        ++field7460;
        if (this.field7470 > 0) {
            byte[][] var1 = new byte[super.field3410 + 1][super.field3408 + 1];
            for (int var2 = 1; ~super.field3410 < ~var2; ++var2) {
                for (int var107 = 1; ~var107 > ~super.field3408; ++var107) {
                    var1[var2][var107] = (byte) ((this.field7480[var2][var107] >> 1) + (this.field7480[var2][var107 - 1] >> 2) + (this.field7480[var2 - -1][var107] >> 3) + (this.field7480[var2][var107 + 1] >> 3) + (this.field7480[var2 + -1][var107] >> 2));
                }
            }
            class29[] var3 = new class29[this.field7473.method1752(0)];
            this.field7473.method1750(var3, 0);
            for (int var4 = 0; ~var4 > ~var3.length; ++var4) {
                var3[var4].method146(this.field7470, (byte) 52);
            }
            int var5 = 20;
            if (this.field7457 != null) {
                var5 += 4;
            }
            if ((this.field7450 & 7) != 0) {
                var5 += 12;
            }
            NativeHeapBuffer var6 = this.field7446.field4934.method3806(this.field7470 * 4, false);
            NativeHeapBuffer var7 = this.field7446.field4934.method3806(this.field7470 * var5, false);
            Stream var8 = new Stream(var7);
            Stream var9 = new Stream(var6);
            class29[] var10 = new class29[this.field7470];
            int var11 = class687.method3886(100, this.field7470 / 4);
            if (var11 < 1) {
                var11 = 1;
            }
            class295 var12 = new class295(var11);
            class29[] var13 = new class29[this.field7475];
            for (int var14 = 0; super.field3410 > var14; ++var14) {
                for (int var34 = 0; super.field3408 > var34; ++var34) {
                    if (this.field7439[var14][var34] != null) {
                        class29[] var35 = this.field7451[var14][var34];
                        int[] var36 = this.field7458[var14][var34];
                        int[] var37 = this.field7443[var14][var34];
                        int[] var38 = this.field7445[var14][var34];
                        int[] var39 = this.field7439[var14][var34];
                        int[] var40 = this.field7452 == null ? null : this.field7452[var14][var34];
                        int[] var41 = this.field7457 != null ? this.field7457[var14][var34] : null;
                        if (var38 == null) {
                            var38 = var39;
                        }
                        float var42 = this.field7477[var14][var34];
                        float var43 = this.field7479[var14][var34];
                        float var44 = this.field7471[var14][var34];
                        float var45 = this.field7477[var14][var34 + 1];
                        float var46 = this.field7479[var14][var34 + 1];
                        float var47 = this.field7471[var14][var34 + 1];
                        float var48 = this.field7477[var14 + 1][var34 - -1];
                        float var49 = this.field7479[var14 - -1][var34 + 1];
                        float var50 = this.field7471[var14 + 1][var34 - -1];
                        float var51 = this.field7477[var14 - -1][var34];
                        float var52 = this.field7479[var14 + 1][var34];
                        float var53 = this.field7471[var14 + 1][var34];
                        int var54 = var1[var14][var34] & 255;
                        int var55 = var1[var14][var34 - -1] & 255;
                        int var56 = 255 & var1[var14 - -1][var34 + 1];
                        int var57 = 255 & var1[var14 + 1][var34];
                        int var58 = 0;
                        label359: for (int var59 = 0; ~var59 > ~var39.length; ++var59) {
                            class29 var105 = var35[var59];
                            for (int var106 = 0; ~var106 > ~var58; ++var106) {
                                if (var13[var106] == var105) {
                                    continue label359;
                                }
                            }
                            var13[var58++] = var105;
                        }
                        short[] var60 = this.field7444[super.field3410 * var34 + var14] = new short[var39.length];
                        for (int var61 = 0; ~var39.length < ~var61; ++var61) {
                            int var62 = (var14 << super.field3409) + var36[var61];
                            int var63 = (var34 << super.field3409) - -var37[var61];
                            int var64 = var62 >> this.field7469;
                            int var65 = var63 >> this.field7469;
                            int var66 = var39[var61];
                            int var67 = var38[var61];
                            int var68 = var40 != null ? var40[var61] : 0;
                            long var69 = (long) var65 | (long) var66 << 32 | (long) var67 << 48 | (long) (var64 << 16);
                            int var71 = var36[var61];
                            int var72 = var37[var61];
                            byte var73 = 74;
                            int var74 = 0;
                            float var75;
                            int var76;
                            float var77;
                            float var78;
                            if (var71 == 0 && var72 == 0) {
                                var75 = var44;
                                var76 = var73 - var54;
                                var77 = var42;
                                var78 = var43;
                            } else if (var71 == 0 && ~super.field3413 == ~var72) {
                                var75 = var47;
                                var77 = var45;
                                var76 = var73 - var55;
                                var78 = var46;
                            } else if (~super.field3413 == ~var71 && super.field3413 == var72) {
                                var76 = var73 - var56;
                                var77 = var48;
                                var78 = var49;
                                var75 = var50;
                            } else if (super.field3413 == var71 && var72 == 0) {
                                var76 = var73 - var57;
                                var75 = var53;
                                var77 = var51;
                                var78 = var52;
                            } else {
                                float var79 = (float) var71 / (float) super.field3413;
                                float var80 = (float) var72 / (float) super.field3413;
                                float var81 = (var51 - var42) * var79 + var42;
                                float var82 = (-var43 + var52) * var79 + var43;
                                float var83 = (-var44 + var53) * var79 + var44;
                                float var84 = (var48 - var45) * var79 + var45;
                                float var85 = (var49 - var46) * var79 + var46;
                                float var86 = (-var47 + var50) * var79 + var47;
                                var78 = (-var82 + var85) * var80 + var82;
                                var77 = (var84 - var81) * var80 + var81;
                                var75 = (var86 - var83) * var80 + var83;
                                int var87 = ((-var54 + var57) * var71 >> super.field3409) + var54;
                                int var88 = ((var56 - var55) * var71 >> super.field3409) + var55;
                                var76 = var73 - (((-var87 + var88) * var72 >> super.field3409) + var87);
                            }
                            float var89 = 1.0F;
                            if (~var66 != 0) {
                                int var90 = (127 & var66) * var76 >> 7;
                                if (var90 < 2) {
                                    var90 = 2;
                                } else if (~var90 < -127) {
                                    var90 = 126;
                                }
                                var74 = class721.field10115[var66 & 65408 | var90];
                                if (~(this.field7450 & 7) == -1) {
                                    float var91 = this.field7446.field5076[2] * var75 + this.field7446.field5076[0] * var77 + this.field7446.field5076[1] * var78;
                                    var89 = this.field7446.field5116 + var91 * (var91 > 0.0F ? this.field7446.field5093 : this.field7446.field5094);
                                }
                            }
                            class134 var92 = null;
                            if (~(var62 & this.field7437 + -1) == -1 && ~(this.field7437 + -1 & var63) == -1) {
                                var92 = var12.method1754(false, var69);
                            }
                            int var93;
                            if (var92 != null) {
                                var60[var61] = ((class595) var92).field8395;
                                var93 = 65535 & var60[var61];
                                if (var66 != -1 && ~var35[var61].field1522 > ~var10[var93].field1522) {
                                    var10[var93] = var35[var61];
                                }
                            } else {
                                int var95;
                                if (var66 != var67) {
                                    int var94 = (127 & var67) * var76 >> 7;
                                    if (~var94 > -3) {
                                        var94 = 2;
                                    } else if (~var94 < -127) {
                                        var94 = 126;
                                    }
                                    var95 = class721.field10115[var94 | var67 & 65408];
                                    if ((7 & this.field7450) == 0) {
                                        float var96 = this.field7446.field5076[2] * var75 + this.field7446.field5076[1] * var78 + this.field7446.field5076[0] * var77;
                                        float var97 = this.field7446.field5116 + var89 * (!(var89 > 0.0F) ? this.field7446.field5094 : this.field7446.field5093);
                                        int var98 = 255 & var95 >> 16;
                                        int var99 = var95 >> 8 & 255;
                                        int var100 = 255 & var95;
                                        int var101 = (int) ((float) var98 * var97);
                                        if (~var101 <= -1) {
                                            if (var101 > 255) {
                                                var101 = 255;
                                            }
                                        } else {
                                            var101 = 0;
                                        }
                                        int var102 = (int) ((float) var99 * var97);
                                        if (~var102 <= -1) {
                                            if (var102 > 255) {
                                                var102 = 255;
                                            }
                                        } else {
                                            var102 = 0;
                                        }
                                        int var103 = (int) ((float) var100 * var97);
                                        if (var103 < 0) {
                                            var103 = 0;
                                        } else if (~var103 < -256) {
                                            var103 = 255;
                                        }
                                        var95 = var101 << 16 | var102 << 8 | var103;
                                    }
                                } else {
                                    var95 = var74;
                                }
                                if (!Stream.method3823()) {
                                    var8.method3815((float) var62);
                                    var8.method3815((float) (this.method1675(var63, var62, 65286) - -var68));
                                    var8.method3815((float) var63);
                                    var8.method3815((float) var62);
                                    var8.method3815((float) var63);
                                    if (this.field7457 != null) {
                                        var8.method3815((float) (var41 != null ? var41[var61] + -1 : 0));
                                    }
                                    if (~(this.field7450 & 7) != -1) {
                                        var8.method3815(var77);
                                        var8.method3815(var78);
                                        var8.method3815(var75);
                                    }
                                } else {
                                    var8.method3810((float) var62);
                                    var8.method3810((float) (this.method1675(var63, var62, 65286) + var68));
                                    var8.method3810((float) var63);
                                    var8.method3810((float) var62);
                                    var8.method3810((float) var63);
                                    if (this.field7457 != null) {
                                        var8.method3810((float) (var41 == null ? 0 : var41[var61] + -1));
                                    }
                                    if ((7 & this.field7450) != 0) {
                                        var8.method3810(var77);
                                        var8.method3810(var78);
                                        var8.method3810(var75);
                                    }
                                }
                                if (~this.field7446.field5074 != -1) {
                                    var9.method3818(-16777216 | var95);
                                } else {
                                    var9.method3817(var95 | -16777216);
                                }
                                var93 = this.field7465++;
                                var60[var61] = (short) var93;
                                if (~var66 != 0) {
                                    var10[var93] = var35[var61];
                                }
                                var12.method1751(new class595(var60[var61]), 3970, var69);
                            }
                            for (int var104 = 0; ~var104 > ~var58; ++var104) {
                                var13[var104].method151(false, var76, var89, var93, var74);
                            }
                            ++this.field7447;
                        }
                    }
                }
            }
            for (int var15 = 0; ~var15 > ~this.field7465; ++var15) {
                class29 var33 = var10[var15];
                if (var33 != null) {
                    var33.method150(var15, 32276);
                }
            }
            for (int var16 = 0; ~super.field3410 < ~var16; ++var16) {
                for (int var22 = 0; var22 < super.field3408; ++var22) {
                    short[] var23 = this.field7444[super.field3410 * var22 + var16];
                    if (var23 != null) {
                        int var24 = 0;
                        int var25 = 0;
                        while (~var25 > ~var23.length) {
                            int var26 = var23[var25++] & 65535;
                            int var27 = var23[var25++] & 65535;
                            int var28 = 65535 & var23[var25++];
                            class29 var29 = var10[var26];
                            class29 var30 = var10[var27];
                            class29 var31 = var10[var28];
                            class29 var32 = null;
                            if (var29 != null) {
                                var29.method145(var16, var24, (byte) -87, var22);
                                var32 = var29;
                            }
                            if (var30 != null) {
                                var30.method145(var16, var24, (byte) -87, var22);
                                if (var32 == null || var30.field1522 < var32.field1522) {
                                    var32 = var30;
                                }
                            }
                            if (var31 != null) {
                                var31.method145(var16, var24, (byte) -87, var22);
                                if (var32 == null || ~var31.field1522 > ~var32.field1522) {
                                    var32 = var31;
                                }
                            }
                            if (var32 != null) {
                                if (var29 != null) {
                                    var32.method150(var26, 32276);
                                }
                                if (var30 != null) {
                                    var32.method150(var27, 32276);
                                }
                                if (var31 != null) {
                                    var32.method150(var28, 32276);
                                }
                                var32.method145(var16, var24, (byte) -87, var22);
                            }
                            ++var24;
                        }
                    }
                }
            }
            var8.method3821();
            var9.method3821();
            this.field7478 = this.field7446.method2306(false, 0);
            this.field7478.method3106(var6, (byte) -74, 4, this.field7465 * 4);
            this.field7476 = this.field7446.method2306(false, 0);
            this.field7476.method3106(var7, (byte) 127, var5, this.field7465 * var5);
            if (~(7 & this.field7450) == -1) {
                if (this.field7457 != null) {
                    this.field7474 = this.field7446.method2312(new class231[] { new class231(new class467[] { class467.field6679, class467.field6685, class467.field6684 }), new class231(class467.field6683) }, 0);
                } else {
                    this.field7474 = this.field7446.method2312(new class231[] { new class231(new class467[] { class467.field6679, class467.field6685 }), new class231(class467.field6683) }, 0);
                }
            } else if (this.field7457 == null) {
                this.field7474 = this.field7446.method2312(new class231[] { new class231(new class467[] { class467.field6679, class467.field6685, class467.field6682 }), new class231(class467.field6683) }, 0);
            } else {
                this.field7474 = this.field7446.method2312(new class231[] { new class231(new class467[] { class467.field6679, class467.field6685, class467.field6684, class467.field6682 }), new class231(class467.field6683) }, 0);
            }
            int var17 = 0;
            for (int var18 = 0; var3.length > var18; ++var18) {
                if (var3[var18].field332 > 0) {
                    var3[var17++] = var3[var18];
                }
            }
            this.field7472 = new class29[var17];
            long[] var19 = new long[var17];
            for (int var20 = 0; var17 > var20; ++var20) {
                class29 var21 = var3[var20];
                var19[var20] = var21.field1522;
                this.field7472[var20] = var21;
                var21.method147((byte) 93, this.field7465);
            }
            class158.method975(-1, this.field7472, var19);
            if (this.field7442 != null) {
                this.field7442.method3361(70);
            }
        } else {
            this.field7442 = null;
        }
        this.field7480 = null;
        this.field7439 = null;
        this.field7445 = null;
        this.field7451 = null;
        this.field7458 = this.field7443 = null;
        this.field7477 = this.field7479 = this.field7471 = null;
        this.field7452 = null;
        this.field7473 = null;
        this.field7457 = null;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(III[[ZZII)V", line = 1168)
    public final void method1670(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6) {
        ++field7433;
        this.method3073(arg2, arg5, arg0, arg4, false, arg6, arg1, arg3);
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Lr;IIIIZ)Z", line = 1181)
    public final boolean method1669(class182 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field7467;
        if (this.field7442 != null && arg0 != null) {
            int var7 = arg1 - (this.field7446.field5144 * arg2 >> 8) >> this.field7446.field5103;
            int var8 = -(this.field7446.field5083 * arg2 >> 8) + arg3 >> this.field7446.field5103;
            return this.field7442.method3358(var7, arg0, -29624, var8);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IIIIIII[[Z)V", line = 1200)
    public final void method1662(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field7441;
        if (this.field7470 > 0) {
            class543 var9 = this.field7446.method2288(15951, this.field7447);
            int var10 = 0;
            int var11 = 32767;
            int var12 = -32768;
            for (int var13 = 0; ~var13 > -5; ++var13) {
                var10 = 0;
                Buffer var14 = var9.method263(13931, true);
                if (var14 != null) {
                    Stream var15 = this.field7446.method2299(var14, 0);
                    if (!Stream.method3823()) {
                        for (int var16 = arg4; ~arg6 < ~var16; ++var16) {
                            int var17 = super.field3410 * var16 + arg3;
                            for (int var18 = arg3; arg5 > var18; ++var18) {
                                if (arg7[-arg3 + var18][-arg4 + var16]) {
                                    short[] var19 = this.field7444[var17];
                                    if (var19 != null) {
                                        for (int var20 = 0; ~var20 > ~var19.length; ++var20) {
                                            int var21 = 65535 & var19[var20];
                                            var15.method3816(var21);
                                            ++var10;
                                            if (var11 > var21) {
                                                var11 = var21;
                                            }
                                            if (var21 > var12) {
                                                var12 = var21;
                                            }
                                        }
                                    }
                                }
                                ++var17;
                            }
                        }
                    } else {
                        for (int var22 = arg4; var22 < arg6; ++var22) {
                            int var25 = super.field3410 * var22 + arg3;
                            for (int var26 = arg3; var26 < arg5; ++var26) {
                                if (arg7[-arg3 + var26][var22 - arg4]) {
                                    short[] var27 = this.field7444[var25];
                                    if (var27 != null) {
                                        for (int var28 = 0; ~var27.length < ~var28; ++var28) {
                                            int var29 = 65535 & var27[var28];
                                            if (var29 < var11) {
                                                var11 = var29;
                                            }
                                            var15.method3820(var29);
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
                    var15.method3821();
                    if (var9.method266(-19067)) {
                        break;
                    }
                }
            }
            if (var10 > 0) {
                this.field7446.method2290(-8);
                this.field7446.method2221(0, false);
                this.field7446.method2284(false, 30315);
                this.field7446.method2251(false, -32);
                this.field7446.method2234(false, 0);
                this.field7446.method2274(0, -2);
                this.field7446.method2275(false, false, (byte) 24, -2);
                this.field7446.method2207((byte) -61, (class596) null);
                class427 var23 = this.field7446.method2263((byte) 55);
                float[] var24 = this.field7446.method2307((byte) 66);
                var24[3] = 0.0F;
                var24[15] = 1.0F;
                var24[8] = 0.0F;
                var24[12] = -1.0F - ((float) (arg2 * arg3) / 128.0F + (float) (-(arg0 * 2))) / (float) this.field7446.field4912;
                var24[7] = 0.0F;
                var24[0] = (float) arg2 / ((float) super.field3413 * 128.0F * (float) this.field7446.field4912);
                var24[2] = 0.0F;
                var24[11] = 0.0F;
                var24[10] = 1.0F / (this.field7435 - this.field7448);
                var24[4] = 0.0F;
                var24[9] = 0.0F;
                var24[14] = -this.field7448 / (this.field7435 - this.field7448);
                var24[5] = (float) arg2 / ((float) super.field3413 * 128.0F * (float) this.field7446.field4875);
                var24[1] = 0.0F;
                var24[6] = 0.0F;
                var24[13] = -(((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field7446.field4875) + 1.0F;
                var23.method2673(0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F, (byte) 82, 0.0F, 1.0F, 0.0F);
                this.field7446.method2206(-117);
                this.field7446.method2304(31);
                if (~(7 & this.field7450) != -1) {
                    this.field7446.method2284(true, 30315);
                    this.field7446.method2317(-113);
                } else {
                    this.field7446.method2284(false, 30315);
                }
                this.field7446.method2237(0, false);
                this.field7446.method2301(true, this.field7476, 0);
                this.field7446.method2301(true, this.field7478, 1);
                this.field7446.method2285(1, this.field7474);
                this.field7446.method2295(class178.field2092, -121, var9, var11, var10 / 3, 0, -var11 + var12 + 1);
                this.field7446.method2237(0, true);
            }
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Z)V", line = 1398)
    public static final void method3074(boolean arg0) {
        ++field7432;
        class729 var1 = null;
        try {
            var1 = class546.method3214((byte) -13, "2");
            class244 var2 = new class244(class278.field3418 * 6 + 3);
            var2.method1460(1, 24710);
            var2.method1446(class278.field3418, !arg0);
            for (int var3 = 0; var3 < class217.field2518.length; ++var3) {
                if (class417.field5905[var3]) {
                    var2.method1446(var3, true);
                    var2.method1421(class217.field2518[var3], -20798);
                }
            }
            var1.method4064(0, var2.field2903, var2.field2912, 118);
        } catch (Exception var5) {
        }
        try {
            if (var1 != null) {
                var1.method4060((byte) 120);
            }
        } catch (Exception var4) {
        }
        class681.field9637 = class652.method3700(-1);
        class542.field7815 = arg0;
    }
}
