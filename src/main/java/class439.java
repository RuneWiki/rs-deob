import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class439 extends class294 {

    @OriginalMember(owner = "client!mf", name = "q", descriptor = "F")
    private float field5919 = Float.MAX_VALUE;

    @OriginalMember(owner = "client!mf", name = "B", descriptor = "F")
    private float field5930 = -3.4028235E38F;

    @OriginalMember(owner = "client!mf", name = "k", descriptor = "Lok;")
    private class266 field5913 = new class266();

    @OriginalMember(owner = "client!mf", name = "K", descriptor = "Lpj;")
    public class156 field5939;

    @OriginalMember(owner = "client!mf", name = "S", descriptor = "I")
    private int field5947;

    @OriginalMember(owner = "client!mf", name = "db", descriptor = "[[F")
    private float[][] field5958;

    @OriginalMember(owner = "client!mf", name = "T", descriptor = "[[[I")
    public int[][][] field5948;

    @OriginalMember(owner = "client!mf", name = "A", descriptor = "[[B")
    private byte[][] field5929;

    @OriginalMember(owner = "client!mf", name = "N", descriptor = "[[S")
    public short[][] field5942;

    @OriginalMember(owner = "client!mf", name = "s", descriptor = "I")
    private int field5921;

    @OriginalMember(owner = "client!mf", name = "R", descriptor = "[[[I")
    private int[][][] field5946;

    @OriginalMember(owner = "client!mf", name = "W", descriptor = "[[[I")
    private int[][][] field5951;

    @OriginalMember(owner = "client!mf", name = "t", descriptor = "I")
    public int field5922;

    @OriginalMember(owner = "client!mf", name = "I", descriptor = "[[[I")
    public int[][][] field5937;

    @OriginalMember(owner = "client!mf", name = "n", descriptor = "[[[Lqd;")
    private class471[][][] field5916;

    @OriginalMember(owner = "client!mf", name = "gb", descriptor = "[[F")
    private float[][] field5961;

    @OriginalMember(owner = "client!mf", name = "fb", descriptor = "[[B")
    private byte[][] field5960;

    @OriginalMember(owner = "client!mf", name = "Y", descriptor = "[[F")
    private float[][] field5953;

    @OriginalMember(owner = "client!mf", name = "U", descriptor = "[[[I")
    public int[][][] field5949;

    @OriginalMember(owner = "client!mf", name = "cb", descriptor = "Ljo;")
    private class353 field5957;

    @OriginalMember(owner = "client!mf", name = "J", descriptor = "Lve;")
    private class528 field5938;

    @OriginalMember(owner = "client!mf", name = "p", descriptor = "Lmea;")
    public static class451 field5918 = null;

    @OriginalMember(owner = "client!mf", name = "y", descriptor = "Ltda;")
    public static class663 field5927 = new class663();

    @OriginalMember(owner = "client!mf", name = "m", descriptor = "F")
    public static float field5915;

    @OriginalMember(owner = "client!mf", name = "C", descriptor = "F")
    public static float field5931;

    @OriginalMember(owner = "client!mf", name = "l", descriptor = "I")
    public static int field5914;

    @OriginalMember(owner = "client!mf", name = "o", descriptor = "I")
    public static int field5917;

    @OriginalMember(owner = "client!mf", name = "r", descriptor = "I")
    public static int field5920;

    @OriginalMember(owner = "client!mf", name = "u", descriptor = "I")
    public static int field5923;

    @OriginalMember(owner = "client!mf", name = "v", descriptor = "I")
    public static int field5924;

    @OriginalMember(owner = "client!mf", name = "w", descriptor = "I")
    public static int field5925;

    @OriginalMember(owner = "client!mf", name = "x", descriptor = "I")
    public static int field5926;

    @OriginalMember(owner = "client!mf", name = "z", descriptor = "I")
    private int field5928;

    @OriginalMember(owner = "client!mf", name = "D", descriptor = "I")
    public static int field5932;

    @OriginalMember(owner = "client!mf", name = "E", descriptor = "I")
    public static int field5933;

    @OriginalMember(owner = "client!mf", name = "F", descriptor = "I")
    public static int field5934;

    @OriginalMember(owner = "client!mf", name = "G", descriptor = "I")
    public static int field5935;

    @OriginalMember(owner = "client!mf", name = "H", descriptor = "I")
    public static int field5936;

    @OriginalMember(owner = "client!mf", name = "L", descriptor = "I")
    public static int field5940;

    @OriginalMember(owner = "client!mf", name = "M", descriptor = "I")
    public static int field5941;

    @OriginalMember(owner = "client!mf", name = "O", descriptor = "I")
    private int field5943;

    @OriginalMember(owner = "client!mf", name = "P", descriptor = "I")
    public static int field5944;

    @OriginalMember(owner = "client!mf", name = "V", descriptor = "I")
    public static int field5950;

    @OriginalMember(owner = "client!mf", name = "X", descriptor = "I")
    private int field5952;

    @OriginalMember(owner = "client!mf", name = "Z", descriptor = "I")
    private int field5954;

    @OriginalMember(owner = "client!mf", name = "ab", descriptor = "Lhl;")
    private class553 field5955;

    @OriginalMember(owner = "client!mf", name = "eb", descriptor = "Lhl;")
    private class553 field5959;

    @OriginalMember(owner = "client!mf", name = "hb", descriptor = "Lkq;")
    public class618 field5962;

    @OriginalMember(owner = "client!mf", name = "bb", descriptor = "[Lqd;")
    private class471[] field5956;

    @OriginalMember(owner = "client!mf", name = "Q", descriptor = "[[[I")
    private int[][][] field5945;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(II)V", line = 5)
    public final void method1917(int arg0, int arg1) {
        ++field5941;
    }

    @OriginalMember(owner = "client!mf", name = "ka", descriptor = "(III)V", line = 16)
    public final void method1906(int arg0, int arg1, int arg2) {
        ++field5936;
        if (~(255 & this.field5960[arg0][arg1]) > ~arg2) {
            this.field5960[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILpn;II)V", line = 29)
    private final void method2617(int arg0, class776 arg1, int arg2, int arg3) {
        ++field5924;
        int[] var5 = this.field5948[arg0][arg3];
        int[] var6 = this.field5949[arg0][arg3];
        int var7 = var5.length;
        if (var7 > class704.field9818.length) {
            class642.field8986 = new int[var7];
            class704.field9818 = new int[var7];
        }
        if (arg2 > -4) {
            this.field5922 = 112;
        }
        for (int var8 = 0; ~var8 > ~var7; ++var8) {
            class704.field9818[var8] = var5[var8] >> this.field5939.field2466;
            class642.field8986[var8] = var6[var8] >> this.field5939.field2466;
        }
        int var9 = 0;
        while (var9 < var7) {
            int var10 = class704.field9818[var9];
            int var11 = class642.field8986[var9++];
            int var12 = class704.field9818[var9];
            int var13 = class642.field8986[var9++];
            int var14 = class704.field9818[var9];
            int var15 = class642.field8986[var9++];
            if (~((var10 - var12) * (-var15 + var13) + -((var14 - var12) * (-var11 + var13))) < -1) {
                arg1.method4270(var11, var15, var10, 65, var12, var14, var13);
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Lpj;IIII[[I[[II)V", line = 90)
    public class439(class156 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        this.field5939 = arg0;
        this.field5947 = super.field4285 + -2;
        this.field5958 = new float[super.field4289 + 1][super.field4290 + 1];
        this.field5948 = new int[arg3][arg4][];
        this.field5929 = new byte[arg3][arg4];
        this.field5942 = new short[arg3 * arg4][];
        this.field5921 = 1 << this.field5947;
        this.field5946 = new int[arg3][arg4][];
        this.field5951 = new int[arg3][arg4][];
        this.field5922 = arg2;
        this.field5937 = new int[arg3][arg4][];
        this.field5916 = new class471[arg3][arg4][];
        this.field5961 = new float[super.field4289 + 1][super.field4290 + 1];
        this.field5960 = new byte[arg3 + 1][arg4 - -1];
        this.field5953 = new float[super.field4289 + 1][super.field4290 - -1];
        this.field5949 = new int[arg3][arg4][];
        for (int var9 = 0; super.field4290 >= var9; ++var9) {
            for (int var10 = 0; ~var10 >= ~super.field4289; ++var10) {
                int var11 = super.field4291[var10][var9];
                if (this.field5930 < (float) var11) {
                    this.field5930 = (float) var11;
                }
                if ((float) var11 < this.field5919) {
                    this.field5919 = (float) var11;
                }
                if (~var10 < -1 && var9 > 0 && ~super.field4289 < ~var10 && var9 < super.field4290) {
                    int var12 = arg6[var10 - -1][var9] + -arg6[var10 + -1][var9];
                    int var13 = arg6[var10][var9 + 1] + -arg6[var10][var9 + -1];
                    float var14 = (float) (1.0D / Math.sqrt((double) (arg7 * 4 * arg7 + var12 * var12 - -(var13 * var13))));
                    this.field5958[var10][var9] = (float) var12 * var14;
                    this.field5953[var10][var9] = (float) (-arg7 * 2) * var14;
                    this.field5961[var10][var9] = (float) var13 * var14;
                }
            }
        }
        ++this.field5930;
        --this.field5919;
        this.field5957 = new class353(128);
        if (~(16 & this.field5922) != -1) {
            this.field5938 = new class528(this.field5939, this);
        }
    }

    @OriginalMember(owner = "client!mf", name = "wa", descriptor = "(Lr;IIIIZ)V", line = 170)
    public final void method1916(class194 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field5932;
        if (this.field5938 != null && arg0 != null) {
            int var7 = arg1 - (this.field5939.field2484 * arg2 >> 8) >> this.field5939.field2466;
            int var8 = -(this.field5939.field2430 * arg2 >> 8) + arg3 >> this.field5939.field2466;
            this.field5938.method3190(var7, arg0, (byte) -107, var8);
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZIIIZII[[Z)V", line = 187)
    private final void method2618(boolean arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field5944;
        if (this.field5956 != null) {
            int var9 = arg1 + arg1 + 1;
            int var10 = var9 * var9;
            if (~var10 < ~class618.field8641.length) {
                class618.field8641 = new int[var10];
            }
            int var11 = arg2 - arg1;
            int var12 = var11;
            if (var11 < 0) {
                var11 = 0;
            }
            int var13 = -arg1 + arg3;
            int var14 = var13;
            if (~var13 > -1) {
                var13 = 0;
            }
            int var15 = arg1 + arg2;
            if (super.field4289 - 1 < var15) {
                var15 = super.field4289 + -1;
            }
            int var16 = arg1 + arg3;
            if (super.field4290 + -1 < var16) {
                var16 = super.field4290 + -1;
            }
            class2.field11 = 0;
            for (int var17 = var11; ~var17 >= ~var15; ++var17) {
                boolean[] var24 = arg7[-var12 + var17];
                for (int var25 = var13; ~var25 >= ~var16; ++var25) {
                    if (var24[-var14 + var25]) {
                        class618.field8641[class2.field11++] = super.field4289 * var25 + var17;
                    }
                }
            }
            if (arg6 == -1) {
                this.field5939.method1066((byte) 110);
            } else {
                this.field5939.method1104((float) arg6, (byte) 30);
                this.field5939.method1077(0);
            }
            this.field5939.method1088(12358);
            this.field5939.method1188((7 & this.field5922) != 0, 1);
            this.field5939.method1073(false, -1, false, -1);
            this.field5939.method1178(0, (byte) 77, this.field5955);
            for (int var18 = 0; ~var18 > ~this.field5956.length; ++var18) {
                this.field5956[var18].method2799(class618.field8641, 10395, class2.field11);
            }
            class385 var19 = this.field5939.method1117((byte) 104);
            var19.method1869(0, -1, 0);
            this.field5939.method1147(true);
            if (!this.field5913.method1737(-17429)) {
                int var20 = this.field5939.field2441;
                int var21 = this.field5939.field2451;
                this.field5939.method502(0, var21, this.field5939.field2472);
                this.field5939.method1188(false, 1);
                this.field5939.method1133(16, false);
                this.field5939.method1101(false, 128);
                this.field5939.method1073(false, -2, false, -1);
                this.field5939.method1118(0, this.field5939.field2465);
                this.field5939.method1080(class463.field6532, class776.field10666, -30);
                this.field5939.method1180(0, (byte) 91, class683.field9465);
                this.field5939.method1082(0, class407.field5550, (byte) -112);
                for (class577 var22 = this.field5913.method1731((byte) -111); var22 != null; var22 = this.field5913.method1724(0)) {
                    class647 var23 = (class647) var22;
                    var23.method3708(arg7, arg3, arg1, arg2, (byte) -108);
                }
                this.field5939.method1180(0, (byte) 91, class605.field8453);
                this.field5939.method1082(0, class605.field8453, (byte) -112);
                this.field5939.method1118(0, (class684) null);
                this.field5939.method502(var20, var21, this.field5939.field2472);
            }
            if (this.field5938 != null) {
                this.field5939.method1178(0, (byte) 57, this.field5955);
                this.field5939.method1178(1, (byte) 122, this.field5959);
                this.field5939.method1111((byte) 119, this.field5962);
                this.field5938.method3187(arg0, (byte) -37, arg7, arg3, arg2, arg1);
            }
        }
        if (!arg4) {
            this.method1909(-78, 49, 24, (boolean[][]) null, true, 44);
        }
    }

    @OriginalMember(owner = "client!mf", name = "fa", descriptor = "(IILr;)Lr;", line = 326)
    public final class194 method1902(int arg0, int arg1, class194 arg2) {
        ++field5925;
        if (~(this.field5929[arg0][arg1] & 1) == -1) {
            return null;
        } else {
            int var4 = super.field4284 >> this.field5939.field2466;
            class776 var5 = (class776) arg2;
            class776 var6;
            if (var5 != null && var5.method4274(var4, (byte) 78, var4)) {
                var6 = var5;
                var5.method4273(6198);
            } else {
                var6 = new class776(this.field5939, var4, var4);
            }
            var6.method4269(var4, 0, 0, var4, 0);
            this.method2617(arg0, var6, -100, arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Ltd;I)[Lmm;", line = 353)
    public static final class293[] method2619(class477 arg0, int arg1) {
        ++field5917;
        if (!arg0.method2843(arg1 + 1)) {
            return new class293[0];
        } else {
            class141 var2 = arg0.method2836((byte) -85);
            while (var2.field2089 == 0) {
                class107.method828(10L, (byte) -103);
            }
            if (~var2.field2089 == -3) {
                return new class293[0];
            } else {
                int[] var3 = (int[]) var2.field2092;
                class293[] var4 = new class293[var3.length >> 2];
                for (int var5 = arg1; var5 < var4.length; ++var5) {
                    class293 var6 = new class293();
                    var4[var5] = var6;
                    var6.field4281 = var3[var5 << 2];
                    var6.field4275 = var3[(var5 << 2) - -1];
                    var6.field4280 = var3[(var5 << 2) + 2];
                    var6.field4277 = var3[(var5 << 2) + 3];
                }
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lqm;[I)V", line = 394)
    public final void method1907(class154 arg0, int[] arg1) {
        ++field5920;
        this.field5913.method1727(new class647(this.field5939, this, arg0, arg1), (byte) 116);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIIIII[[Z)V", line = 405)
    public final void method1914(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field5935;
        if (~this.field5954 < -1) {
            class535 var9 = this.field5939.method1116((byte) -109, this.field5943);
            int var10 = 0;
            int var11 = 32767;
            int var12 = -32768;
            for (int var13 = 0; var13 < 4; ++var13) {
                var10 = 0;
                Buffer var14 = var9.method605((byte) -110, true);
                if (var14 != null) {
                    Stream var15 = this.field5939.method1190(0, var14);
                    if (!Stream.method3953()) {
                        for (int var16 = arg4; ~var16 > ~arg6; ++var16) {
                            int var17 = super.field4289 * var16 + arg3;
                            for (int var18 = arg3; ~arg5 < ~var18; ++var18) {
                                if (arg7[-arg3 + var18][-arg4 + var16]) {
                                    short[] var19 = this.field5942[var17];
                                    if (var19 != null) {
                                        for (int var20 = 0; var19.length > var20; ++var20) {
                                            int var21 = 65535 & var19[var20];
                                            if (~var21 < ~var12) {
                                                var12 = var21;
                                            }
                                            var15.method3954(var21);
                                            if (~var11 < ~var21) {
                                                var11 = var21;
                                            }
                                            ++var10;
                                        }
                                    }
                                }
                                ++var17;
                            }
                        }
                    } else {
                        for (int var22 = arg4; ~var22 > ~arg6; ++var22) {
                            int var25 = super.field4289 * var22 - -arg3;
                            for (int var26 = arg3; arg5 > var26; ++var26) {
                                if (arg7[-arg3 + var26][-arg4 + var22]) {
                                    short[] var27 = this.field5942[var25];
                                    if (var27 != null) {
                                        for (int var28 = 0; ~var28 > ~var27.length; ++var28) {
                                            int var29 = var27[var28] & 65535;
                                            if (var29 < var11) {
                                                var11 = var29;
                                            }
                                            ++var10;
                                            var15.method3947(var29);
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
                    var15.method3945();
                    if (var9.method601(-75)) {
                        break;
                    }
                }
            }
            if (var10 > 0) {
                this.field5939.method1084((byte) 95);
                this.field5939.method1100(false, true);
                this.field5939.method1188(false, 1);
                this.field5939.method1176(14, false);
                this.field5939.method1133(16, false);
                this.field5939.method1101(false, 0);
                this.field5939.method1073(false, -2, false, -1);
                this.field5939.method1118(0, (class684) null);
                class385 var23 = this.field5939.method1117((byte) 125);
                float[] var24 = this.field5939.method1136(6280);
                var24[8] = 0.0F;
                var24[9] = 0.0F;
                var24[3] = 0.0F;
                var24[10] = 1.0F / (-this.field5919 + this.field5930);
                var24[7] = 0.0F;
                var24[12] = -1.0F - ((float) (arg2 * arg3) / 128.0F + (float) (-(arg0 * 2))) / (float) this.field5939.field2365;
                var24[6] = 0.0F;
                var24[15] = 1.0F;
                var24[11] = 0.0F;
                var24[0] = (float) arg2 / ((float) super.field4284 * 128.0F * (float) this.field5939.field2365);
                var24[13] = 1.0F - ((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field5939.field2265;
                var24[5] = (float) arg2 / ((float) super.field4284 * 128.0F * (float) this.field5939.field2265);
                var24[1] = 0.0F;
                var24[14] = -this.field5919 / (this.field5930 - this.field5919);
                var24[4] = 0.0F;
                var24[2] = 0.0F;
                var23.method2392(1.0F, 0.0F, 1, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
                this.field5939.method1179(123);
                this.field5939.method1147(true);
                if ((7 & this.field5922) == 0) {
                    this.field5939.method1188(false, 1);
                } else {
                    this.field5939.method1188(true, 1);
                    this.field5939.method1087(31205);
                }
                this.field5939.method1119(false, false);
                this.field5939.method1178(0, (byte) 82, this.field5955);
                this.field5939.method1178(1, (byte) 53, this.field5959);
                this.field5939.method1111((byte) 18, this.field5962);
                this.field5939.method1091(var10 / 3, var9, var11, 0, var12 + 1 + -var11, class207.field3204, (byte) -29);
                this.field5939.method1119(false, true);
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(III[[ZZII)V", line = 599)
    public final void method1915(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6) {
        this.method2618(arg4, arg2, arg0, arg1, true, arg6, arg5, arg3);
        ++field5950;
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(I)V", line = 607)
    public static void method2620(int arg0) {
        field5918 = null;
        field5927 = null;
        int var1 = 41 % ((53 - arg0) / 50);
    }

    @OriginalMember(owner = "client!mf", name = "CA", descriptor = "(Lr;IIIIZ)V", line = 618)
    public final void method1911(class194 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field5934;
        if (this.field5938 != null && arg0 != null) {
            int var7 = arg1 - (this.field5939.field2484 * arg2 >> 8) >> this.field5939.field2466;
            int var8 = arg3 - (this.field5939.field2430 * arg2 >> 8) >> this.field5939.field2466;
            this.field5938.method3186(true, var8, var7, arg0);
        }
    }

    @OriginalMember(owner = "client!mf", name = "YA", descriptor = "()V", line = 651)
    public final void method1913() {
        if (~this.field5954 >= -1) {
            this.field5938 = null;
        } else {
            byte[][] var1 = new byte[super.field4289 + 1][super.field4290 + 1];
            for (int var2 = 1; var2 < super.field4289; ++var2) {
                for (int var107 = 1; ~super.field4290 < ~var107; ++var107) {
                    var1[var2][var107] = (byte) ((this.field5960[var2][var107 + -1] >> 2) + (this.field5960[var2][var107 + 1] >> 3) + (this.field5960[var2][var107] >> 1) + (this.field5960[var2 - -1][var107] >> 3) + (this.field5960[var2 + -1][var107] >> 2));
                }
            }
            class471[] var3 = new class471[this.field5957.method2244(false)];
            this.field5957.method2251(-126, var3);
            for (int var4 = 0; ~var3.length < ~var4; ++var4) {
                var3[var4].method2805(this.field5954, (byte) -15);
            }
            int var5 = 20;
            if (this.field5945 != null) {
                var5 += 4;
            }
            if (~(this.field5922 & 7) != -1) {
                var5 += 12;
            }
            NativeHeapBuffer var6 = this.field5939.field2354.method3939(this.field5954 * 4, false);
            NativeHeapBuffer var7 = this.field5939.field2354.method3939(this.field5954 * var5, false);
            Stream var8 = new Stream(var7);
            Stream var9 = new Stream(var6);
            class471[] var10 = new class471[this.field5954];
            int var11 = class189.method1324(this.field5954 / 4, (byte) 105);
            if (var11 < 1) {
                var11 = 1;
            }
            class353 var12 = new class353(var11);
            class471[] var13 = new class471[this.field5952];
            for (int var14 = 0; ~var14 > ~super.field4289; ++var14) {
                for (int var34 = 0; super.field4290 > var34; ++var34) {
                    if (this.field5937[var14][var34] != null) {
                        class471[] var35 = this.field5916[var14][var34];
                        int[] var36 = this.field5948[var14][var34];
                        int[] var37 = this.field5949[var14][var34];
                        int[] var38 = this.field5951[var14][var34];
                        int[] var39 = this.field5937[var14][var34];
                        int[] var40 = this.field5946 == null ? null : this.field5946[var14][var34];
                        if (var38 == null) {
                            var38 = var39;
                        }
                        int[] var41 = this.field5945 != null ? this.field5945[var14][var34] : null;
                        float var42 = this.field5958[var14][var34];
                        float var43 = this.field5953[var14][var34];
                        float var44 = this.field5961[var14][var34];
                        float var45 = this.field5958[var14][var34 + 1];
                        float var46 = this.field5953[var14][var34 - -1];
                        float var47 = this.field5961[var14][var34 - -1];
                        float var48 = this.field5958[var14 + 1][var34 + 1];
                        float var49 = this.field5953[var14 + 1][var34 - -1];
                        float var50 = this.field5961[var14 - -1][var34 + 1];
                        float var51 = this.field5958[var14 + 1][var34];
                        float var52 = this.field5953[var14 + 1][var34];
                        float var53 = this.field5961[var14 + 1][var34];
                        int var54 = 255 & var1[var14][var34];
                        int var55 = var1[var14][var34 + 1] & 255;
                        int var56 = var1[var14 + 1][var34 + 1] & 255;
                        int var57 = 255 & var1[var14 + 1][var34];
                        int var58 = 0;
                        label358: for (int var59 = 0; var39.length > var59; ++var59) {
                            class471 var105 = var35[var59];
                            for (int var106 = 0; ~var58 < ~var106; ++var106) {
                                if (var13[var106] == var105) {
                                    continue label358;
                                }
                            }
                            var13[var58++] = var105;
                        }
                        short[] var60 = this.field5942[super.field4289 * var34 + var14] = new short[var39.length];
                        for (int var61 = 0; ~var39.length < ~var61; ++var61) {
                            int var62 = (var14 << super.field4285) - -var36[var61];
                            int var63 = (var34 << super.field4285) - -var37[var61];
                            int var64 = var62 >> this.field5947;
                            int var65 = var63 >> this.field5947;
                            int var66 = var39[var61];
                            int var67 = var38[var61];
                            int var68 = var40 == null ? 0 : var40[var61];
                            long var69 = (long) var67 << 48 | (long) var66 << 32 | (long) (var64 << 16) | (long) var65;
                            int var71 = var36[var61];
                            int var72 = var37[var61];
                            byte var73 = 74;
                            int var74 = 0;
                            float var75;
                            int var76;
                            float var77;
                            float var78;
                            if (var71 == 0 && ~var72 == -1) {
                                var75 = var43;
                                var76 = var73 - var54;
                                var77 = var44;
                                var78 = var42;
                            } else if (~var71 == -1 && super.field4284 == var72) {
                                var76 = var73 - var55;
                                var75 = var46;
                                var78 = var45;
                                var77 = var47;
                            } else if (super.field4284 == var71 && super.field4284 == var72) {
                                var78 = var48;
                                var75 = var49;
                                var77 = var50;
                                var76 = var73 - var56;
                            } else if (super.field4284 == var71 && var72 == 0) {
                                var76 = var73 - var57;
                                var77 = var53;
                                var78 = var51;
                                var75 = var52;
                            } else {
                                float var79 = (float) var71 / (float) super.field4284;
                                float var80 = (float) var72 / (float) super.field4284;
                                float var81 = (var51 - var42) * var79 + var42;
                                float var82 = (-var43 + var52) * var79 + var43;
                                float var83 = (-var44 + var53) * var79 + var44;
                                float var84 = (-var45 + var48) * var79 + var45;
                                float var85 = (-var46 + var49) * var79 + var46;
                                var78 = (-var81 + var84) * var80 + var81;
                                float var86 = (-var47 + var50) * var79 + var47;
                                var75 = (-var82 + var85) * var80 + var82;
                                var77 = (-var83 + var86) * var80 + var83;
                                int var87 = ((-var54 + var57) * var71 >> super.field4285) + var54;
                                int var88 = var55 - -((-var55 + var56) * var71 >> super.field4285);
                                var76 = var73 - (((var88 - var87) * var72 >> super.field4285) + var87);
                            }
                            float var89 = 1.0F;
                            if (~var66 != 0) {
                                int var90 = (127 & var66) * var76 >> 7;
                                if (var90 < 2) {
                                    var90 = 2;
                                } else if (~var90 < -127) {
                                    var90 = 126;
                                }
                                if (~(7 & this.field5922) == -1) {
                                    float var91 = this.field5939.field2416[2] * var77 + this.field5939.field2416[0] * var78 + this.field5939.field2416[1] * var75;
                                    var89 = (var91 > 0.0F ? this.field5939.field2410 : this.field5939.field2495) * var91 + this.field5939.field2399;
                                }
                                var74 = class779.field10694[var66 & 65408 | var90];
                            }
                            class577 var92 = null;
                            if ((var62 & this.field5921 - 1) == 0 && (this.field5921 - 1 & var63) == 0) {
                                var92 = var12.method2242(var69, -1);
                            }
                            int var93;
                            if (var92 != null) {
                                var60[var61] = ((class75) var92).field853;
                                var93 = var60[var61] & 65535;
                                if (~var66 != 0 && ~var35[var61].field8133 > ~var10[var93].field8133) {
                                    var10[var93] = var35[var61];
                                }
                            } else {
                                int var94;
                                if (~var66 == ~var67) {
                                    var94 = var74;
                                } else {
                                    int var95 = (var67 & 127) * var76 >> 7;
                                    if (var95 >= 2) {
                                        if (var95 > 126) {
                                            var95 = 126;
                                        }
                                    } else {
                                        var95 = 2;
                                    }
                                    var94 = class779.field10694[65408 & var67 | var95];
                                    if ((7 & this.field5922) == 0) {
                                        float var96 = this.field5939.field2416[2] * var77 + this.field5939.field2416[0] * var78 + this.field5939.field2416[1] * var75;
                                        float var97 = (var89 > 0.0F ? this.field5939.field2410 : this.field5939.field2495) * var89 + this.field5939.field2399;
                                        int var98 = (16717295 & var94) >> 16;
                                        int var99 = (65325 & var94) >> 8;
                                        int var100 = var94 & 255;
                                        int var101 = (int) ((float) var98 * var97);
                                        if (~var101 <= -1) {
                                            if (var101 > 255) {
                                                var101 = 255;
                                            }
                                        } else {
                                            var101 = 0;
                                        }
                                        int var102 = (int) ((float) var99 * var97);
                                        int var103 = (int) ((float) var100 * var97);
                                        if (~var102 > -1) {
                                            var102 = 0;
                                        } else if (var102 > 255) {
                                            var102 = 255;
                                        }
                                        if (~var103 > -1) {
                                            var103 = 0;
                                        } else if (~var103 < -256) {
                                            var103 = 255;
                                        }
                                        var94 = var101 << 16 | var102 << 8 | var103;
                                    }
                                }
                                if (Stream.method3953()) {
                                    var8.method3952((float) var62);
                                    var8.method3952((float) (var68 + this.method1918(var62, (byte) 127, var63)));
                                    var8.method3952((float) var63);
                                    var8.method3952((float) var62);
                                    var8.method3952((float) var63);
                                    if (this.field5945 != null) {
                                        var8.method3952((float) (var41 != null ? var41[var61] - 1 : 0));
                                    }
                                    if ((7 & this.field5922) != 0) {
                                        var8.method3952(var78);
                                        var8.method3952(var75);
                                        var8.method3952(var77);
                                    }
                                } else {
                                    var8.method3949((float) var62);
                                    var8.method3949((float) (var68 + this.method1918(var62, (byte) 127, var63)));
                                    var8.method3949((float) var63);
                                    var8.method3949((float) var62);
                                    var8.method3949((float) var63);
                                    if (this.field5945 != null) {
                                        var8.method3949((float) (var41 != null ? var41[var61] + -1 : 0));
                                    }
                                    if (~(7 & this.field5922) != -1) {
                                        var8.method3949(var78);
                                        var8.method3949(var75);
                                        var8.method3949(var77);
                                    }
                                }
                                if (~this.field5939.field2443 != -1) {
                                    var9.method3951(var94 | -16777216);
                                } else {
                                    var9.method3950(var94 | -16777216);
                                }
                                var93 = this.field5928++;
                                var60[var61] = (short) var93;
                                if (~var66 != 0) {
                                    var10[var93] = var35[var61];
                                }
                                var12.method2241(67, var69, new class75(var60[var61]));
                            }
                            for (int var104 = 0; ~var58 < ~var104; ++var104) {
                                var13[var104].method2802(var93, var89, -97, var76, var74);
                            }
                            ++this.field5943;
                        }
                    }
                }
            }
            for (int var15 = 0; ~this.field5928 < ~var15; ++var15) {
                class471 var33 = var10[var15];
                if (var33 != null) {
                    var33.method2806((byte) -85, var15);
                }
            }
            for (int var16 = 0; super.field4289 > var16; ++var16) {
                for (int var22 = 0; ~var22 > ~super.field4290; ++var22) {
                    short[] var23 = this.field5942[super.field4289 * var22 + var16];
                    if (var23 != null) {
                        int var24 = 0;
                        int var25 = 0;
                        while (~var25 > ~var23.length) {
                            int var26 = 65535 & var23[var25++];
                            int var27 = var23[var25++] & 65535;
                            int var28 = var23[var25++] & 65535;
                            class471 var29 = var10[var26];
                            class471 var30 = var10[var27];
                            class471 var31 = var10[var28];
                            class471 var32 = null;
                            if (var29 != null) {
                                var32 = var29;
                                var29.method2798(22764, var16, var22, var24);
                            }
                            if (var30 != null) {
                                var30.method2798(22764, var16, var22, var24);
                                if (var32 == null || var30.field8133 < var32.field8133) {
                                    var32 = var30;
                                }
                            }
                            if (var31 != null) {
                                var31.method2798(22764, var16, var22, var24);
                                if (var32 == null || ~var32.field8133 < ~var31.field8133) {
                                    var32 = var31;
                                }
                            }
                            if (var32 != null) {
                                if (var29 != null) {
                                    var32.method2806((byte) -76, var26);
                                }
                                if (var30 != null) {
                                    var32.method2806((byte) -106, var27);
                                }
                                if (var31 != null) {
                                    var32.method2806((byte) -92, var28);
                                }
                                var32.method2798(22764, var16, var22, var24);
                            }
                            ++var24;
                        }
                    }
                }
            }
            var8.method3945();
            var9.method3945();
            this.field5959 = this.field5939.method1074((byte) 46, false);
            this.field5959.method680(4, 89, var6, this.field5928 * 4);
            this.field5955 = this.field5939.method1074((byte) 46, false);
            this.field5955.method680(var5, 95, var7, this.field5928 * var5);
            if ((7 & this.field5922) == 0) {
                if (this.field5945 == null) {
                    this.field5962 = this.field5939.method1151(12, new class152[] { new class152(new class631[] { class631.field8865, class631.field8870 }), new class152(class631.field8868) });
                } else {
                    this.field5962 = this.field5939.method1151(12, new class152[] { new class152(new class631[] { class631.field8865, class631.field8870, class631.field8869 }), new class152(class631.field8868) });
                }
            } else if (this.field5945 == null) {
                this.field5962 = this.field5939.method1151(12, new class152[] { new class152(new class631[] { class631.field8865, class631.field8870, class631.field8867 }), new class152(class631.field8868) });
            } else {
                this.field5962 = this.field5939.method1151(12, new class152[] { new class152(new class631[] { class631.field8865, class631.field8870, class631.field8869, class631.field8867 }), new class152(class631.field8868) });
            }
            int var17 = 0;
            for (int var18 = 0; var18 < var3.length; ++var18) {
                if (~var3[var18].field6612 < -1) {
                    var3[var17++] = var3[var18];
                }
            }
            this.field5956 = new class471[var17];
            long[] var19 = new long[var17];
            for (int var20 = 0; var20 < var17; ++var20) {
                class471 var21 = var3[var20];
                var19[var20] = var21.field8133;
                this.field5956[var20] = var21;
                var21.method2807(this.field5928, 4);
            }
            class186.method1305(var19, this.field5956, -128);
            if (this.field5938 != null) {
                this.field5938.method3184(-92);
            }
        }
        ++field5926;
        this.field5916 = null;
        this.field5957 = null;
        this.field5945 = null;
        this.field5946 = null;
        this.field5948 = this.field5949 = null;
        this.field5960 = null;
        this.field5951 = null;
        this.field5937 = null;
        this.field5958 = this.field5953 = this.field5961 = null;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 1250)
    public final void method1903(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field5933;
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
        this.method1908(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lr;IIIIZ)Z", line = 1335)
    public final boolean method1905(class194 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field5923;
        if (this.field5938 != null && arg0 != null) {
            int var7 = -(this.field5939.field2484 * arg2 >> 8) + arg1 >> this.field5939.field2466;
            int var8 = -(this.field5939.field2430 * arg2 >> 8) + arg3 >> this.field5939.field2466;
            return this.field5938.method3185(0, var7, arg0, var8);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(III[[ZZI)V", line = 1354)
    public final void method1909(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        ++field5940;
        this.method2618(arg4, arg2, arg0, arg1, true, arg5, -1, arg3);
    }

    @OriginalMember(owner = "client!mf", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V", line = 1362)
    public final void method1908(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        ++field5914;
        class160 var15 = this.field5939.field774;
        if (arg5 != null && this.field5945 == null) {
            this.field5945 = new int[super.field4289][super.field4290][];
        }
        if (arg3 != null && this.field5946 == null) {
            this.field5946 = new int[super.field4289][super.field4290][];
        }
        this.field5948[arg0][arg1] = arg2;
        this.field5949[arg0][arg1] = arg4;
        this.field5937[arg0][arg1] = arg6;
        this.field5951[arg0][arg1] = arg7;
        if (this.field5945 != null) {
            this.field5945[arg0][arg1] = arg5;
        }
        if (this.field5946 != null) {
            this.field5946[arg0][arg1] = arg3;
        }
        class471[] var16 = this.field5916[arg0][arg1] = new class471[arg6.length];
        for (int var17 = 0; ~var17 > ~arg6.length; ++var17) {
            int var18 = arg8[var17];
            int var19 = arg9[var17];
            if (~(this.field5922 & 32) != -1 && var18 != -1 && var15.method1208((byte) 47, var18).field6570) {
                var18 = -1;
                var19 = 128;
            }
            long var20 = (long) (var19 << 14) | (long) arg11 << 42 | (long) arg12 << 48 | (long) arg10 << 28 | (long) var18;
            class577 var22;
            for (var22 = this.field5957.method2242(var20, -1); var22 != null; var22 = this.field5957.method2250(true)) {
                class471 var23 = (class471) var22;
                if (var23.field6605 == var18 && (float) var19 == var23.field6604 && var23.field6601 == arg10 && ~var23.field6600 == ~arg11 && var23.field6602 == arg12) {
                    break;
                }
            }
            if (var22 == null) {
                var16[var17] = new class471(this, var18, var19, arg10, arg11, arg12);
                this.field5957.method2241(-82, var20, var16[var17]);
            } else {
                var16[var17] = (class471) var22;
            }
        }
        if (arg13) {
            this.field5929[arg0][arg1] = (byte) class746.method4158(this.field5929[arg0][arg1], 1);
        }
        if (~this.field5952 > ~arg6.length) {
            this.field5952 = arg6.length;
        }
        this.field5954 += arg6.length;
    }
}
