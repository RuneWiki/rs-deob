import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public class class501 extends class295 {

    @OriginalMember(owner = "client!qq", name = "l", descriptor = "F")
    private float field7003 = -3.4028235E38F;

    @OriginalMember(owner = "client!qq", name = "A", descriptor = "F")
    private float field7018 = Float.MAX_VALUE;

    @OriginalMember(owner = "client!qq", name = "Q", descriptor = "Lqw;")
    private class84 field7034 = new class84();

    @OriginalMember(owner = "client!qq", name = "x", descriptor = "I")
    private int field7015 = this.field4179 + -2;

    @OriginalMember(owner = "client!qq", name = "M", descriptor = "Lee;")
    public class703 field7030;

    @OriginalMember(owner = "client!qq", name = "o", descriptor = "[[[I")
    private int[][][] field7006;

    @OriginalMember(owner = "client!qq", name = "S", descriptor = "[[[I")
    public int[][][] field7036;

    @OriginalMember(owner = "client!qq", name = "bb", descriptor = "[[B")
    private byte[][] field7045;

    @OriginalMember(owner = "client!qq", name = "n", descriptor = "[[[I")
    public int[][][] field7005;

    @OriginalMember(owner = "client!qq", name = "N", descriptor = "I")
    private int field7031;

    @OriginalMember(owner = "client!qq", name = "F", descriptor = "[[B")
    private byte[][] field7023;

    @OriginalMember(owner = "client!qq", name = "W", descriptor = "[[F")
    private float[][] field7040;

    @OriginalMember(owner = "client!qq", name = "Y", descriptor = "[[F")
    private float[][] field7042;

    @OriginalMember(owner = "client!qq", name = "T", descriptor = "[[S")
    public short[][] field7037;

    @OriginalMember(owner = "client!qq", name = "R", descriptor = "I")
    public int field7035;

    @OriginalMember(owner = "client!qq", name = "r", descriptor = "[[[I")
    public int[][][] field7009;

    @OriginalMember(owner = "client!qq", name = "V", descriptor = "[[[I")
    private int[][][] field7039;

    @OriginalMember(owner = "client!qq", name = "q", descriptor = "[[[Lbha;")
    private class599[][][] field7008;

    @OriginalMember(owner = "client!qq", name = "cb", descriptor = "[[F")
    private float[][] field7046;

    @OriginalMember(owner = "client!qq", name = "eb", descriptor = "Ltca;")
    private class184 field7048;

    @OriginalMember(owner = "client!qq", name = "I", descriptor = "Ljaa;")
    private class640 field7026;

    @OriginalMember(owner = "client!qq", name = "z", descriptor = "F")
    public static float field7017 = 1.0F;

    @OriginalMember(owner = "client!qq", name = "m", descriptor = "I")
    public static int field7004 = 0;

    @OriginalMember(owner = "client!qq", name = "k", descriptor = "I")
    public static int field7002;

    @OriginalMember(owner = "client!qq", name = "p", descriptor = "I")
    public static int field7007;

    @OriginalMember(owner = "client!qq", name = "s", descriptor = "I")
    public static int field7010;

    @OriginalMember(owner = "client!qq", name = "t", descriptor = "I")
    public static int field7011;

    @OriginalMember(owner = "client!qq", name = "u", descriptor = "I")
    public static int field7012;

    @OriginalMember(owner = "client!qq", name = "v", descriptor = "I")
    public static int field7013;

    @OriginalMember(owner = "client!qq", name = "w", descriptor = "I")
    public static int field7014;

    @OriginalMember(owner = "client!qq", name = "y", descriptor = "I")
    public static int field7016;

    @OriginalMember(owner = "client!qq", name = "B", descriptor = "I")
    public static int field7019;

    @OriginalMember(owner = "client!qq", name = "C", descriptor = "I")
    public static int field7020;

    @OriginalMember(owner = "client!qq", name = "D", descriptor = "I")
    public static int field7021;

    @OriginalMember(owner = "client!qq", name = "E", descriptor = "I")
    private int field7022;

    @OriginalMember(owner = "client!qq", name = "G", descriptor = "I")
    public static int field7024;

    @OriginalMember(owner = "client!qq", name = "J", descriptor = "I")
    public static int field7027;

    @OriginalMember(owner = "client!qq", name = "K", descriptor = "I")
    private int field7028;

    @OriginalMember(owner = "client!qq", name = "L", descriptor = "I")
    public static int field7029;

    @OriginalMember(owner = "client!qq", name = "P", descriptor = "I")
    public static int field7033;

    @OriginalMember(owner = "client!qq", name = "U", descriptor = "I")
    public static int field7038;

    @OriginalMember(owner = "client!qq", name = "Z", descriptor = "I")
    private int field7043;

    @OriginalMember(owner = "client!qq", name = "db", descriptor = "I")
    private int field7047;

    @OriginalMember(owner = "client!qq", name = "gb", descriptor = "Leda;")
    public class110 field7050;

    @OriginalMember(owner = "client!qq", name = "X", descriptor = "Lkm;")
    private class373 field7041;

    @OriginalMember(owner = "client!qq", name = "fb", descriptor = "Lkm;")
    private class373 field7049;

    @OriginalMember(owner = "client!qq", name = "O", descriptor = "Lth;")
    public static class621 field7032;

    @OriginalMember(owner = "client!qq", name = "ab", descriptor = "[Lbha;")
    private class599[] field7044;

    @OriginalMember(owner = "client!qq", name = "H", descriptor = "[[[I")
    private int[][][] field7025;

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(ILri;II)V", line = 3)
    private final void method2930(int arg0, class122 arg1, int arg2, int arg3) {
        ++field7014;
        int[] var5 = this.field7009[arg3][arg0];
        int[] var6 = this.field7036[arg3][arg0];
        int var7 = var5.length;
        if (~class469.field6635.length > ~var7) {
            class469.field6635 = new int[var7];
            class7.field59 = new int[var7];
        }
        for (int var8 = 0; ~var7 < ~var8; ++var8) {
            class469.field6635[var8] = var5[var8] >> this.field7030.field9577;
            class7.field59[var8] = var6[var8] >> this.field7030.field9577;
        }
        if (arg2 >= -37) {
            this.method190(6, -71, (class195) null);
        }
        int var9 = 0;
        while (var7 > var9) {
            int var10 = class469.field6635[var9];
            int var11 = class7.field59[var9++];
            int var12 = class469.field6635[var9];
            int var13 = class7.field59[var9++];
            int var14 = class469.field6635[var9];
            int var15 = class7.field59[var9++];
            if ((-var12 + var10) * (-var15 + var13) + -((var14 - var12) * (-var11 + var13)) > 0) {
                arg1.method878((byte) -114, var15, var14, var10, var12, var13, var11);
            }
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIIIIII[[Z)V", line = 65)
    public final void method203(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field7016;
        if (this.field7047 > 0) {
            class118 var9 = this.field7030.method3892(2, this.field7022);
            int var10 = 0;
            int var11 = 32767;
            int var12 = -32768;
            for (int var13 = 0; ~var13 > -5; ++var13) {
                var10 = 0;
                Buffer var14 = var9.method847(-125, true);
                if (var14 != null) {
                    Stream var15 = this.field7030.method3889(0, var14);
                    if (!Stream.method3798()) {
                        for (int var16 = arg4; arg6 > var16; ++var16) {
                            int var17 = super.field4174 * var16 + arg3;
                            for (int var18 = arg3; arg5 > var18; ++var18) {
                                if (arg7[-arg3 + var18][-arg4 + var16]) {
                                    short[] var19 = this.field7037[var17];
                                    if (var19 != null) {
                                        for (int var20 = 0; ~var20 > ~var19.length; ++var20) {
                                            int var21 = 65535 & var19[var20];
                                            ++var10;
                                            if (var21 < var11) {
                                                var11 = var21;
                                            }
                                            if (var21 > var12) {
                                                var12 = var21;
                                            }
                                            var15.method3804(var21);
                                        }
                                    }
                                }
                                ++var17;
                            }
                        }
                    } else {
                        for (int var22 = arg4; ~arg6 < ~var22; ++var22) {
                            int var25 = super.field4174 * var22 + arg3;
                            for (int var26 = arg3; ~var26 > ~arg5; ++var26) {
                                if (arg7[-arg3 + var26][-arg4 + var22]) {
                                    short[] var27 = this.field7037[var25];
                                    if (var27 != null) {
                                        for (int var28 = 0; var27.length > var28; ++var28) {
                                            int var29 = 65535 & var27[var28];
                                            ++var10;
                                            if (~var11 < ~var29) {
                                                var11 = var29;
                                            }
                                            if (~var12 > ~var29) {
                                                var12 = var29;
                                            }
                                            var15.method3795(var29);
                                        }
                                    }
                                }
                                ++var25;
                            }
                        }
                    }
                    var15.method3797();
                    if (var9.method849(18579)) {
                        break;
                    }
                }
            }
            if (var10 > 0) {
                this.field7030.method3862((byte) 18);
                this.field7030.method3853(false, -110);
                this.field7030.method3894(16544, false);
                this.field7030.method3887(false, true);
                this.field7030.method3849((byte) 54, false);
                this.field7030.method3893(123, 0);
                this.field7030.method3863(false, -2, 27016, false);
                this.field7030.method3882(0, (class352) null);
                class532 var23 = this.field7030.method3864((byte) -56);
                float[] var24 = this.field7030.method3909((byte) 52);
                var24[1] = 0.0F;
                var24[6] = 0.0F;
                var24[8] = 0.0F;
                var24[14] = -this.field7018 / (-this.field7018 + this.field7003);
                var24[4] = 0.0F;
                var24[2] = 0.0F;
                var24[7] = 0.0F;
                var24[15] = 1.0F;
                var24[13] = 1.0F - ((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field7030.field9440;
                var24[11] = 0.0F;
                var24[3] = 0.0F;
                var24[9] = 0.0F;
                var24[5] = (float) arg2 / ((float) super.field4177 * 128.0F * (float) this.field7030.field9440);
                var24[12] = -1.0F - ((float) (arg2 * arg3) / 128.0F + (float) (-(arg0 * 2))) / (float) this.field7030.field9469;
                var24[0] = (float) arg2 / ((float) super.field4177 * 128.0F * (float) this.field7030.field9469);
                var24[10] = 1.0F / (-this.field7018 + this.field7003);
                var23.method3090(1.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 37, 1.0F, 0.0F);
                this.field7030.method3837((byte) 65);
                this.field7030.method3852(true);
                if (~(this.field7035 & 7) == -1) {
                    this.field7030.method3894(16544, false);
                } else {
                    this.field7030.method3894(16544, true);
                    this.field7030.method2801((byte) 127);
                }
                this.field7030.method2817((byte) 102, false);
                this.field7030.method2818(false, this.field7041, 0);
                this.field7030.method2818(false, this.field7049, 1);
                this.field7030.method2816((byte) 99, this.field7050);
                this.field7030.method2820(var10 / 3, 0, -13847, -var11 + var12 - -1, class356.field5191, var11, var9);
                this.field7030.method2817((byte) 102, true);
            }
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(II)V", line = 257)
    public final void method195(int arg0, int arg1) {
        ++field7021;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(III[[ZZI)V", line = 265)
    public final void method185(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        this.method2933(arg4, arg3, arg1, arg5, arg2, -53, arg0, -1);
        ++field7038;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lha;B)V", line = 279)
    public static final void method2931(class66 arg0, byte arg1) {
        ++field7011;
        if (arg1 <= -112) {
            if (class348.field5048) {
                class411.method2466(-25686, arg0);
            } else {
                class73.method593(arg0, -1552);
            }
        }
    }

    @OriginalMember(owner = "client!qq", name = "c", descriptor = "(I)V", line = 294)
    public static void method2932(int arg0) {
        field7032 = null;
        if (arg0 != 0) {
            method2931((class66) null, (byte) 71);
        }
    }

    @OriginalMember(owner = "client!qq", name = "CA", descriptor = "(Lr;IIIIZ)V", line = 305)
    public final void method202(class195 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field7020;
        if (this.field7026 != null && arg0 != null) {
            int var7 = -(this.field7030.field9594 * arg2 >> 8) + arg1 >> this.field7030.field9577;
            int var8 = -(this.field7030.field9597 * arg2 >> 8) + arg3 >> this.field7030.field9577;
            this.field7026.method3524(arg0, 256, var7, var8);
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(III[[ZZII)V", line = 324)
    public final void method194(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6) {
        ++field7019;
        this.method2933(arg4, arg3, arg1, arg6, arg2, -102, arg0, arg5);
    }

    @OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(Lee;IIII[[I[[II)V", line = 1125)
    public class501(class703 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        this.field7030 = arg0;
        this.field7006 = new int[arg3][arg4][];
        this.field7036 = new int[arg3][arg4][];
        this.field7045 = new byte[arg3 - -1][arg4 + 1];
        this.field7005 = new int[arg3][arg4][];
        this.field7031 = 1 << this.field7015;
        this.field7023 = new byte[arg3][arg4];
        this.field7040 = new float[super.field4174 + 1][super.field4173 + 1];
        this.field7042 = new float[super.field4174 - -1][super.field4173 + 1];
        this.field7037 = new short[arg3 * arg4][];
        this.field7035 = arg2;
        this.field7009 = new int[arg3][arg4][];
        this.field7039 = new int[arg3][arg4][];
        this.field7008 = new class599[arg3][arg4][];
        this.field7046 = new float[super.field4174 + 1][super.field4173 + 1];
        for (int var9 = 0; super.field4173 >= var9; ++var9) {
            for (int var10 = 0; ~var10 >= ~super.field4174; ++var10) {
                int var11 = super.field4180[var10][var9];
                if (this.field7018 > (float) var11) {
                    this.field7018 = (float) var11;
                }
                if (this.field7003 < (float) var11) {
                    this.field7003 = (float) var11;
                }
                if (~var10 < -1 && ~var9 < -1 && ~var10 > ~super.field4174 && ~var9 > ~super.field4173) {
                    int var12 = arg6[var10 + 1][var9] + -arg6[var10 + -1][var9];
                    int var13 = arg6[var10][var9 + 1] + -arg6[var10][var9 + -1];
                    float var14 = (float) (1.0D / Math.sqrt((double) (var13 * var13 + arg7 * 4 * arg7 + var12 * var12)));
                    this.field7040[var10][var9] = (float) var12 * var14;
                    this.field7046[var10][var9] = (float) (-arg7 * 2) * var14;
                    this.field7042[var10][var9] = (float) var13 * var14;
                }
            }
        }
        ++this.field7003;
        --this.field7018;
        this.field7048 = new class184(128);
        if (~(this.field7035 & 16) != -1) {
            this.field7026 = new class640(this.field7030, this);
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Z[[ZIIIIII)V", line = 343)
    private final void method2933(boolean arg0, boolean[][] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field7012;
        if (this.field7044 != null) {
            int var9 = arg4 + 1 - -arg4;
            int var10 = var9 * var9;
            if (~class96.field1382.length > ~var10) {
                class96.field1382 = new int[var10];
            }
            int var11 = -arg4 + arg6;
            int var12 = var11;
            if (~var11 > -1) {
                var11 = 0;
            }
            int var13 = -arg4 + arg2;
            int var14 = var13;
            if (var13 < 0) {
                var13 = 0;
            }
            int var15 = arg4 + arg6;
            if (~var15 < ~(super.field4174 + -1)) {
                var15 = super.field4174 + -1;
            }
            int var16 = arg2 + arg4;
            if (~(super.field4173 - 1) > ~var16) {
                var16 = super.field4173 - 1;
            }
            class37.field394 = 0;
            for (int var17 = var11; ~var17 >= ~var15; ++var17) {
                boolean[] var24 = arg1[var17 - var12];
                for (int var25 = var13; var16 >= var25; ++var25) {
                    if (var24[-var14 + var25]) {
                        class96.field1382[class37.field394++] = super.field4174 * var25 - -var17;
                    }
                }
            }
            if (arg7 != -1) {
                this.field7030.method3843(117, (float) arg7);
                this.field7030.method3904(6444);
            } else {
                this.field7030.method3844(2);
            }
            this.field7030.method3880(8);
            this.field7030.method3894(16544, ~(this.field7035 & 7) != -1);
            this.field7030.method3863(false, -1, 27016, false);
            this.field7030.method2818(false, this.field7041, 0);
            for (int var18 = 0; ~this.field7044.length < ~var18; ++var18) {
                this.field7044[var18].method3357(class37.field394, true, class96.field1382);
            }
            class532 var19 = this.field7030.method3864((byte) -113);
            var19.method814(0, -1, 0);
            this.field7030.method3852(true);
            if (!this.field7034.method688(-63)) {
                int var20 = this.field7030.field9515;
                int var21 = this.field7030.field9569;
                this.field7030.method540(0, var21, this.field7030.field9548);
                this.field7030.method3894(16544, false);
                this.field7030.method3849((byte) 54, false);
                this.field7030.method3893(117, 128);
                this.field7030.method3863(false, -2, 27016, false);
                this.field7030.method3882(0, this.field7030.field9539);
                this.field7030.method3911(22228, class117.field1574, class291.field4152);
                this.field7030.method3859(117, 0, class64.field840);
                this.field7030.method3867((byte) 18, class264.field3887, 0);
                for (class159 var22 = this.field7034.method679((byte) -86); var22 != null; var22 = this.field7034.method681(-61)) {
                    class645 var23 = (class645) var22;
                    var23.method3576(arg2, arg4, arg6, arg1, 0);
                }
                this.field7030.method3859(125, 0, class790.field10851);
                this.field7030.method3867((byte) 18, class790.field10851, 0);
                this.field7030.method3882(0, (class352) null);
                this.field7030.method540(var20, var21, this.field7030.field9548);
            }
            if (this.field7026 != null) {
                this.field7030.method2818(false, this.field7041, 0);
                this.field7030.method2818(false, this.field7049, 1);
                this.field7030.method2816((byte) 108, this.field7050);
                this.field7026.method3527(arg1, arg0, arg4, arg6, 23749, arg2);
            }
        }
        if (arg5 > -47) {
            this.method188(20, 110, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, 93, -29, -101, false);
        }
    }

    @OriginalMember(owner = "client!qq", name = "fa", descriptor = "(IILr;)Lr;", line = 485)
    public final class195 method190(int arg0, int arg1, class195 arg2) {
        ++field7007;
        if (~(this.field7023[arg0][arg1] & 1) == -1) {
            return null;
        } else {
            int var4 = super.field4177 >> this.field7030.field9577;
            class122 var5 = (class122) arg2;
            class122 var6;
            if (var5 != null && var5.method876(var4, (byte) -78, var4)) {
                var6 = var5;
                var5.method880(-582811760);
            } else {
                var6 = new class122(this.field7030, var4, var4);
            }
            var6.method883(7209, 0, var4, 0, var4);
            this.method2930(arg1, var6, -41, arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!qq", name = "YA", descriptor = "()V", line = 514)
    public final void method197() {
        ++field7002;
        if (this.field7047 > 0) {
            byte[][] var1 = new byte[super.field4174 + 1][super.field4173 - -1];
            for (int var2 = 1; super.field4174 > var2; ++var2) {
                for (int var107 = 1; ~super.field4173 < ~var107; ++var107) {
                    var1[var2][var107] = (byte) ((this.field7045[var2][var107 + 1] >> 3) + (this.field7045[var2 + -1][var107] >> 2) + (this.field7045[var2 - -1][var107] >> 3) + (this.field7045[var2][var107 + -1] >> 2) + (this.field7045[var2][var107] >> 1));
                }
            }
            class599[] var3 = new class599[this.field7048.method1245((byte) 124)];
            this.field7048.method1242(var3, -1);
            for (int var4 = 0; var3.length > var4; ++var4) {
                var3[var4].method3363(this.field7047, -9619);
            }
            int var5 = 20;
            if (this.field7025 != null) {
                var5 += 4;
            }
            if ((7 & this.field7035) != 0) {
                var5 += 12;
            }
            NativeHeapBuffer var6 = this.field7030.field9422.method3794(this.field7047 * 4, false);
            NativeHeapBuffer var7 = this.field7030.field9422.method3794(this.field7047 * var5, false);
            Stream var8 = new Stream(var7);
            Stream var9 = new Stream(var6);
            class599[] var10 = new class599[this.field7047];
            int var11 = class263.method1773(32051, this.field7047 / 4);
            if (var11 < 1) {
                var11 = 1;
            }
            class184 var12 = new class184(var11);
            class599[] var13 = new class599[this.field7043];
            for (int var14 = 0; ~super.field4174 < ~var14; ++var14) {
                for (int var34 = 0; ~var34 > ~super.field4173; ++var34) {
                    if (this.field7005[var14][var34] != null) {
                        class599[] var35 = this.field7008[var14][var34];
                        int[] var36 = this.field7009[var14][var34];
                        int[] var37 = this.field7036[var14][var34];
                        int[] var38 = this.field7006[var14][var34];
                        int[] var39 = this.field7005[var14][var34];
                        int[] var40 = this.field7039 != null ? this.field7039[var14][var34] : null;
                        int[] var41 = this.field7025 != null ? this.field7025[var14][var34] : null;
                        if (var38 == null) {
                            var38 = var39;
                        }
                        float var42 = this.field7040[var14][var34];
                        float var43 = this.field7046[var14][var34];
                        float var44 = this.field7042[var14][var34];
                        float var45 = this.field7040[var14][var34 + 1];
                        float var46 = this.field7046[var14][var34 + 1];
                        float var47 = this.field7042[var14][var34 + 1];
                        float var48 = this.field7040[var14 + 1][var34 + 1];
                        float var49 = this.field7046[var14 + 1][var34 + 1];
                        float var50 = this.field7042[var14 + 1][var34 + 1];
                        float var51 = this.field7040[var14 + 1][var34];
                        float var52 = this.field7046[var14 + 1][var34];
                        float var53 = this.field7042[var14 + 1][var34];
                        int var54 = var1[var14][var34] & 255;
                        int var55 = 255 & var1[var14][var34 + 1];
                        int var56 = var1[var14 + 1][var34 - -1] & 255;
                        int var57 = 255 & var1[var14 - -1][var34];
                        int var58 = 0;
                        label359: for (int var59 = 0; ~var59 > ~var39.length; ++var59) {
                            class599 var105 = var35[var59];
                            for (int var106 = 0; var106 < var58; ++var106) {
                                if (var13[var106] == var105) {
                                    continue label359;
                                }
                            }
                            var13[var58++] = var105;
                        }
                        short[] var60 = this.field7037[super.field4174 * var34 + var14] = new short[var39.length];
                        for (int var61 = 0; ~var61 > ~var39.length; ++var61) {
                            int var62 = (var14 << super.field4179) + var36[var61];
                            int var63 = (var34 << super.field4179) - -var37[var61];
                            int var64 = var62 >> this.field7015;
                            int var65 = var63 >> this.field7015;
                            int var66 = var39[var61];
                            int var67 = var38[var61];
                            int var68 = var40 == null ? 0 : var40[var61];
                            long var69 = (long) var66 << 32 | (long) var67 << 48 | (long) (var64 << 16) | (long) var65;
                            int var71 = var36[var61];
                            int var72 = var37[var61];
                            byte var73 = 74;
                            int var74 = 0;
                            float var75;
                            int var76;
                            float var77;
                            float var78;
                            if (var71 == 0 && ~var72 == -1) {
                                var75 = var42;
                                var76 = var73 - var54;
                                var77 = var44;
                                var78 = var43;
                            } else if (var71 == 0 && super.field4177 == var72) {
                                var78 = var46;
                                var75 = var45;
                                var76 = var73 - var55;
                                var77 = var47;
                            } else if (~super.field4177 == ~var71 && super.field4177 == var72) {
                                var75 = var48;
                                var76 = var73 - var56;
                                var78 = var49;
                                var77 = var50;
                            } else if (~super.field4177 == ~var71 && var72 == 0) {
                                var78 = var52;
                                var76 = var73 - var57;
                                var77 = var53;
                                var75 = var51;
                            } else {
                                float var79 = (float) var71 / (float) super.field4177;
                                float var80 = (float) var72 / (float) super.field4177;
                                float var81 = (var51 - var42) * var79 + var42;
                                float var82 = (var52 - var43) * var79 + var43;
                                float var83 = (var53 - var44) * var79 + var44;
                                float var84 = (-var45 + var48) * var79 + var45;
                                float var85 = (-var46 + var49) * var79 + var46;
                                float var86 = (var50 - var47) * var79 + var47;
                                var78 = (var85 - var82) * var80 + var82;
                                var75 = (-var81 + var84) * var80 + var81;
                                var77 = (-var83 + var86) * var80 + var83;
                                int var87 = ((-var54 + var57) * var71 >> super.field4179) + var54;
                                int var88 = var55 - -((-var55 + var56) * var71 >> super.field4179);
                                var76 = var73 - (((-var87 + var88) * var72 >> super.field4179) + var87);
                            }
                            float var89 = 1.0F;
                            if (var66 != -1) {
                                int var90 = (127 & var66) * var76 >> 7;
                                if (var90 >= 2) {
                                    if (var90 > 126) {
                                        var90 = 126;
                                    }
                                } else {
                                    var90 = 2;
                                }
                                var74 = class217.field2836[65408 & var66 | var90];
                                if ((this.field7035 & 7) == 0) {
                                    float var91 = this.field7030.field9558[2] * var77 + this.field7030.field9558[0] * var75 + this.field7030.field9558[1] * var78;
                                    var89 = this.field7030.field9579 + (!(var91 > 0.0F) ? this.field7030.field9529 : this.field7030.field9607) * var91;
                                }
                            }
                            class159 var92 = null;
                            if ((this.field7031 + -1 & var62) == 0 && (var63 & this.field7031 + -1) == 0) {
                                var92 = var12.method1248(88, var69);
                            }
                            int var93;
                            if (var92 != null) {
                                var60[var61] = ((class603) var92).field8189;
                                var93 = 65535 & var60[var61];
                                if (var66 != -1 && var35[var61].field2146 < var10[var93].field2146) {
                                    var10[var93] = var35[var61];
                                }
                            } else {
                                int var94;
                                if (~var66 == ~var67) {
                                    var94 = var74;
                                } else {
                                    int var95 = (127 & var67) * var76 >> 7;
                                    if (~var95 > -3) {
                                        var95 = 2;
                                    } else if (~var95 < -127) {
                                        var95 = 126;
                                    }
                                    var94 = class217.field2836[var95 | var67 & 65408];
                                    if ((this.field7035 & 7) == 0) {
                                        float var96 = this.field7030.field9558[2] * var77 + this.field7030.field9558[1] * var78 + this.field7030.field9558[0] * var75;
                                        float var97 = (!(var89 > 0.0F) ? this.field7030.field9529 : this.field7030.field9607) * var89 + this.field7030.field9579;
                                        int var98 = (var94 & 16767904) >> 16;
                                        int var99 = (65493 & var94) >> 8;
                                        int var100 = 255 & var94;
                                        int var101 = (int) ((float) var98 * var97);
                                        if (var101 < 0) {
                                            var101 = 0;
                                        } else if (var101 > 255) {
                                            var101 = 255;
                                        }
                                        int var102 = (int) ((float) var99 * var97);
                                        if (var102 < 0) {
                                            var102 = 0;
                                        } else if (~var102 < -256) {
                                            var102 = 255;
                                        }
                                        int var103 = (int) ((float) var100 * var97);
                                        if (~var103 > -1) {
                                            var103 = 0;
                                        } else if (var103 > 255) {
                                            var103 = 255;
                                        }
                                        var94 = var103 | var101 << 16 | var102 << 8;
                                    }
                                }
                                if (!Stream.method3798()) {
                                    var8.method3809((float) var62);
                                    var8.method3809((float) (var68 + this.method1895(var62, var63, 93)));
                                    var8.method3809((float) var63);
                                    var8.method3809((float) var62);
                                    var8.method3809((float) var63);
                                    if (this.field7025 != null) {
                                        var8.method3809((float) (var41 != null ? var41[var61] + -1 : 0));
                                    }
                                    if (~(this.field7035 & 7) != -1) {
                                        var8.method3809(var75);
                                        var8.method3809(var78);
                                        var8.method3809(var77);
                                    }
                                } else {
                                    var8.method3800((float) var62);
                                    var8.method3800((float) (var68 + this.method1895(var62, var63, 28)));
                                    var8.method3800((float) var63);
                                    var8.method3800((float) var62);
                                    var8.method3800((float) var63);
                                    if (this.field7025 != null) {
                                        var8.method3800((float) (var41 == null ? 0 : var41[var61] - 1));
                                    }
                                    if (~(this.field7035 & 7) != -1) {
                                        var8.method3800(var75);
                                        var8.method3800(var78);
                                        var8.method3800(var77);
                                    }
                                }
                                if (this.field7030.field9591 != 0) {
                                    var9.method3796(var94 | -16777216);
                                } else {
                                    var9.method3807(-16777216 | var94);
                                }
                                var93 = this.field7028++;
                                var60[var61] = (short) var93;
                                if (~var66 != 0) {
                                    var10[var93] = var35[var61];
                                }
                                var12.method1247(4070, var69, new class603(var60[var61]));
                            }
                            for (int var104 = 0; ~var58 < ~var104; ++var104) {
                                var13[var104].method3356(var74, var76, 114, var89, var93);
                            }
                            ++this.field7022;
                        }
                    }
                }
            }
            for (int var15 = 0; this.field7028 > var15; ++var15) {
                class599 var33 = var10[var15];
                if (var33 != null) {
                    var33.method3362(var15, (byte) 114);
                }
            }
            for (int var16 = 0; super.field4174 > var16; ++var16) {
                for (int var22 = 0; super.field4173 > var22; ++var22) {
                    short[] var23 = this.field7037[super.field4174 * var22 + var16];
                    if (var23 != null) {
                        int var24 = 0;
                        int var25 = 0;
                        while (~var23.length < ~var25) {
                            int var26 = 65535 & var23[var25++];
                            int var27 = var23[var25++] & 65535;
                            int var28 = var23[var25++] & 65535;
                            class599 var29 = var10[var26];
                            class599 var30 = var10[var27];
                            class599 var31 = var10[var28];
                            class599 var32 = null;
                            if (var29 != null) {
                                var29.method3360(var24, var22, var16, false);
                                var32 = var29;
                            }
                            if (var30 != null) {
                                var30.method3360(var24, var22, var16, false);
                                if (var32 == null || ~var32.field2146 < ~var30.field2146) {
                                    var32 = var30;
                                }
                            }
                            if (var31 != null) {
                                var31.method3360(var24, var22, var16, false);
                                if (var32 == null || var31.field2146 < var32.field2146) {
                                    var32 = var31;
                                }
                            }
                            if (var32 != null) {
                                if (var29 != null) {
                                    var32.method3362(var26, (byte) 102);
                                }
                                if (var30 != null) {
                                    var32.method3362(var27, (byte) 109);
                                }
                                if (var31 != null) {
                                    var32.method3362(var28, (byte) -125);
                                }
                                var32.method3360(var24, var22, var16, false);
                            }
                            ++var24;
                        }
                    }
                }
            }
            var8.method3797();
            var9.method3797();
            this.field7049 = this.field7030.method2795(0, false);
            this.field7049.method2336(false, 4, var6, this.field7028 * 4);
            this.field7041 = this.field7030.method2795(0, false);
            this.field7041.method2336(false, var5, var7, this.field7028 * var5);
            if ((this.field7035 & 7) == 0) {
                if (this.field7025 == null) {
                    this.field7050 = this.field7030.method2791(new class92[] { new class92(new class382[] { class382.field5542, class382.field5552 }), new class92(class382.field5550) }, false);
                } else {
                    this.field7050 = this.field7030.method2791(new class92[] { new class92(new class382[] { class382.field5542, class382.field5552, class382.field5551 }), new class92(class382.field5550) }, false);
                }
            } else if (this.field7025 == null) {
                this.field7050 = this.field7030.method2791(new class92[] { new class92(new class382[] { class382.field5542, class382.field5552, class382.field5546 }), new class92(class382.field5550) }, false);
            } else {
                this.field7050 = this.field7030.method2791(new class92[] { new class92(new class382[] { class382.field5542, class382.field5552, class382.field5551, class382.field5546 }), new class92(class382.field5550) }, false);
            }
            int var17 = 0;
            for (int var18 = 0; var3.length > var18; ++var18) {
                if (~var3[var18].field8171 < -1) {
                    var3[var17++] = var3[var18];
                }
            }
            this.field7044 = new class599[var17];
            long[] var19 = new long[var17];
            for (int var20 = 0; var20 < var17; ++var20) {
                class599 var21 = var3[var20];
                var19[var20] = var21.field2146;
                this.field7044[var20] = var21;
                var21.method3361(this.field7028, true);
            }
            class652.method3628(this.field7044, var19, (byte) -53);
            if (this.field7026 != null) {
                this.field7026.method3521(false);
            }
        } else {
            this.field7026 = null;
        }
        this.field7006 = null;
        this.field7025 = null;
        this.field7008 = null;
        this.field7048 = null;
        this.field7009 = this.field7036 = null;
        this.field7040 = this.field7046 = this.field7042 = null;
        this.field7045 = null;
        this.field7039 = null;
        this.field7005 = null;
    }

    @OriginalMember(owner = "client!qq", name = "ka", descriptor = "(III)V", line = 1204)
    public final void method204(int arg0, int arg1, int arg2) {
        ++field7013;
        if (~arg2 < ~(255 & this.field7045[arg0][arg1])) {
            this.field7045[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lr;IIIIZ)Z", line = 1216)
    public final boolean method201(class195 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field7029;
        if (this.field7026 != null && arg0 != null) {
            int var7 = arg1 - (this.field7030.field9594 * arg2 >> 8) >> this.field7030.field9577;
            int var8 = -(this.field7030.field9597 * arg2 >> 8) + arg3 >> this.field7030.field9577;
            return this.field7026.method3528(arg0, -1, var8, var7);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 1237)
    public final void method205(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field7010;
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
        this.method188(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Luaa;[I)V", line = 1321)
    public final void method189(class127 arg0, int[] arg1) {
        ++field7033;
        this.field7034.method689(new class645(this.field7030, this, arg0, arg1), 111);
    }

    @OriginalMember(owner = "client!qq", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V", line = 1334)
    public final void method188(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        ++field7027;
        if (arg5 != null && this.field7025 == null) {
            this.field7025 = new int[super.field4174][super.field4173][];
        }
        if (arg3 != null && this.field7039 == null) {
            this.field7039 = new int[super.field4174][super.field4173][];
        }
        class161 var15 = this.field7030.field913;
        this.field7009[arg0][arg1] = arg2;
        this.field7036[arg0][arg1] = arg4;
        this.field7005[arg0][arg1] = arg6;
        this.field7006[arg0][arg1] = arg7;
        if (this.field7025 != null) {
            this.field7025[arg0][arg1] = arg5;
        }
        if (this.field7039 != null) {
            this.field7039[arg0][arg1] = arg3;
        }
        class599[] var16 = this.field7008[arg0][arg1] = new class599[arg6.length];
        for (int var17 = 0; var17 < arg6.length; ++var17) {
            int var18 = arg8[var17];
            int var19 = arg9[var17];
            if ((this.field7035 & 32) != 0 && var18 != -1 && var15.method1114(var18, -97).field7868) {
                var18 = -1;
                var19 = 128;
            }
            long var20 = (long) (var19 << 14) | (long) arg11 << 42 | (long) arg12 << 48 | (long) arg10 << 28 | (long) var18;
            class159 var22;
            for (var22 = this.field7048.method1248(120, var20); var22 != null; var22 = this.field7048.method1243(99)) {
                class599 var23 = (class599) var22;
                if (var23.field8168 == var18 && (float) var19 == var23.field8164 && ~var23.field8165 == ~arg10 && var23.field8151 == arg11 && var23.field8162 == arg12) {
                    break;
                }
            }
            if (var22 == null) {
                var16[var17] = new class599(this, var18, var19, arg10, arg11, arg12);
                this.field7048.method1247(4070, var20, var16[var17]);
            } else {
                var16[var17] = (class599) var22;
            }
        }
        if (arg13) {
            this.field7023[arg0][arg1] = (byte) class670.method3699(this.field7023[arg0][arg1], 1);
        }
        if (~arg6.length < ~this.field7043) {
            this.field7043 = arg6.length;
        }
        this.field7047 += arg6.length;
    }

    @OriginalMember(owner = "client!qq", name = "wa", descriptor = "(Lr;IIIIZ)V", line = 1412)
    public final void method200(class195 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field7024;
        if (this.field7026 != null && arg0 != null) {
            int var7 = -(this.field7030.field9594 * arg2 >> 8) + arg1 >> this.field7030.field9577;
            int var8 = -(this.field7030.field9597 * arg2 >> 8) + arg3 >> this.field7030.field9577;
            this.field7026.method3525(19583, var7, arg0, var8);
        }
    }
}
