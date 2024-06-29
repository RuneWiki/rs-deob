import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class261 extends class283 {

    @OriginalMember(owner = "client!wi", name = "cb", descriptor = "[S")
    private short[] field4271 = new short[257];

    @OriginalMember(owner = "client!wi", name = "Z", descriptor = "I")
    private int field4268 = 0;

    @OriginalMember(owner = "client!wi", name = "X", descriptor = "[[B")
    public static byte[][] field4266 = new byte[1000][];

    @OriginalMember(owner = "client!wi", name = "hb", descriptor = "[[Z")
    public static boolean[][] field4276 = new boolean[][] { { true, true, true }, { false, false }, { false, true }, { true, false }, { false, true, true }, { true, false, true }, { false, true, false }, { true, false, false } };

    @OriginalMember(owner = "client!wi", name = "W", descriptor = "I")
    public static int field4265 = 0;

    @OriginalMember(owner = "client!wi", name = "bb", descriptor = "I")
    public static int field4270 = 0;

    @OriginalMember(owner = "client!wi", name = "S", descriptor = "I")
    public static int field4261;

    @OriginalMember(owner = "client!wi", name = "T", descriptor = "I")
    public static int field4262;

    @OriginalMember(owner = "client!wi", name = "U", descriptor = "I")
    public static int field4263;

    @OriginalMember(owner = "client!wi", name = "V", descriptor = "I")
    public static int field4264;

    @OriginalMember(owner = "client!wi", name = "Y", descriptor = "I")
    public static int field4267;

    @OriginalMember(owner = "client!wi", name = "ab", descriptor = "I")
    public static int field4269;

    @OriginalMember(owner = "client!wi", name = "db", descriptor = "I")
    public static int field4272;

    @OriginalMember(owner = "client!wi", name = "eb", descriptor = "I")
    public static int field4273;

    @OriginalMember(owner = "client!wi", name = "fb", descriptor = "I")
    public static int field4274;

    @OriginalMember(owner = "client!wi", name = "jb", descriptor = "I")
    public static int field4278;

    @OriginalMember(owner = "client!wi", name = "kb", descriptor = "I")
    public static int field4279;

    @OriginalMember(owner = "client!wi", name = "Q", descriptor = "[I")
    private int[] field4259;

    @OriginalMember(owner = "client!wi", name = "gb", descriptor = "[I")
    private int[] field4275;

    @OriginalMember(owner = "client!wi", name = "R", descriptor = "[Lqf;")
    public static class148[] field4260;

    @OriginalMember(owner = "client!wi", name = "ib", descriptor = "[[I")
    private int[][] field4277;

    @OriginalMember(owner = "client!wi", name = "h", descriptor = "(I)V", line = 10)
    private final void method1839(int arg0) {
        field4267++;
        int var2 = this.field4268;
        if (var2 == 2) {
            for (int var20 = 0; var20 < 257; var20++) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; this.field4277.length - 1 > var22 && this.field4277[var22][0] <= var21; var22++) {
                }
                int[] var23 = this.field4277[var22];
                int[] var24 = this.field4277[var22 - 1];
                int var25 = this.method1843((byte) -106, var22 - 2)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = var26 - var25;
                int var29 = this.method1843((byte) -106, var22 + 1)[1];
                int var30 = (var21 - var24[0] << 12) / (var23[0] - var24[0]);
                int var31 = var27 + var29 - var25 - var26;
                int var32 = var30 * var30 >> 12;
                int var33 = var25 - var27 - var31;
                int var34 = var28 * var30 >> 12;
                int var35 = var32 * var33 >> 12;
                int var37 = (var30 * var31 >> 12) * var32 >> 12;
                int var38 = var35 + var37 + var34 + var27;
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field4271[var20] = (short) var38;
            }
        } else if (var2 == 1) {
            for (int var3 = 0; var3 < 257; var3++) {
                int var4 = var3 << 4;
                int var5;
                for (var5 = 1; var5 < (this.field4277.length - 1) && this.field4277[var5][0] <= var4; var5++) {
                }
                int[] var6 = this.field4277[var5 - 1];
                int[] var7 = this.field4277[var5];
                int var8 = (var4 - var6[0] << 12) / (var7[0] - var6[0]);
                int var9 = 4096 - class36.field586[(var8 & 0x1FFD) >> 5] >> 1;
                int var10 = 4096 - var9;
                int var11 = var6[1] * var10 + var7[1] * var9 >> 12;
                if (var11 <= -32768) {
                    var11 = -32767;
                }
                if (var11 >= 32768) {
                    var11 = 32767;
                }
                this.field4271[var3] = (short) var11;
            }
        } else {
            for (int var12 = 0; var12 < 257; var12++) {
                int var13 = var12 << 4;
                int var14;
                for (var14 = 1; this.field4277.length - 1 > var14 && this.field4277[var14][0] <= var13; var14++) {
                }
                int[] var15 = this.field4277[var14];
                int[] var16 = this.field4277[var14 - 1];
                int var17 = (var13 - var16[0] << 12) / (var15[0] - var16[0]);
                int var18 = 4096 - var17;
                int var19 = var15[1] * var17 + var16[1] * var18 >> 12;
                if (var19 <= -32768) {
                    var19 = -32767;
                }
                if (var19 >= 32768) {
                    var19 = 32767;
                }
                this.field4271[var12] = (short) var19;
            }
        }
        int var39 = -74 % ((arg0 - 50) / 33);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IB)[I", line = 194)
    public final int[] method8(int arg0, byte arg1) {
        int var3 = -119 / ((30 - arg1) / 36);
        field4274++;
        int[] var4 = this.field4733.method664(-16409, arg0);
        if (this.field4733.field1406) {
            int[] var5 = this.method1990(0, arg0, 32755);
            for (int var6 = 0; var6 < class101.field1632; var6++) {
                int var7 = var5[var6] >> 4;
                if (var7 < 0) {
                    var7 = 0;
                }
                if (var7 > 256) {
                    var7 = 256;
                }
                var4[var6] = this.field4271[var7];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "()V", line = 233)
    public class261() {
        super(1, true);
    }

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "(II)Z", line = 241)
    public static final boolean method1840(int arg0, int arg1) {
        field4264++;
        if (arg1 > arg0) {
            return false;
        }
        int var2 = class142.field2178[arg0];
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        return var2 == 1003;
    }

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "(II)V", line = 265)
    public static final void method1841(int arg0, int arg1) {
        class18.field253 = -1;
        if (arg0 >= -121) {
            field4272 = -58;
        }
        class18.field253 = -1;
        class69.field1069 = arg1;
        field4263++;
        class265.method1868((byte) 87);
    }

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "(I)V", line = 286)
    public final void method130(int arg0) {
        if (this.field4277 == null) {
            this.field4277 = new int[][] { { 0, 0 }, { 4096, 4096 } };
        }
        field4273++;
        if (this.field4277.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        }
        if (this.field4268 == 2) {
            this.method1842(true);
        }
        if (arg0 != 16251) {
            field4269 = 22;
        }
        class321.method2237((byte) -9);
        this.method1839(-11);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Z)V", line = 308)
    private final void method1842(boolean arg0) {
        field4261++;
        int[] var2 = this.field4277[0];
        if (!arg0) {
            this.field4275 = (int[]) null;
        }
        int[] var3 = this.field4277[1];
        int[] var4 = this.field4277[this.field4277.length - 2];
        int[] var5 = this.field4277[this.field4277.length - 1];
        this.field4259 = new int[] { var2[0] - (var3[0] - var2[0]), var2[1] + -var3[1] + var2[1] };
        this.field4275 = new int[] { var4[0] + var4[0] - var5[0], -var5[1] - -var4[1] + var4[1] };
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(ILwa;Z)V", line = 332)
    public final void method1(int arg0, class82 arg1, boolean arg2) {
        field4278++;
        if (arg0 == 0) {
            this.field4268 = arg1.method642((byte) -31);
            this.field4277 = new int[arg1.method642((byte) -52)][2];
            for (int var4 = 0; var4 < this.field4277.length; var4++) {
                this.field4277[var4][0] = arg1.method576(1);
                this.field4277[var4][1] = arg1.method576(1);
            }
        }
        if (!arg2) {
            this.field4268 = -6;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(BI)[I", line = 366)
    private final int[] method1843(byte arg0, int arg1) {
        field4279++;
        if (arg1 < 0) {
            return this.field4259;
        } else if (arg1 >= this.field4277.length) {
            return this.field4275;
        } else {
            if (arg0 != -106) {
                this.field4271 = (short[]) null;
            }
            return this.field4277[arg1];
        }
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(Z)V", line = 404)
    public static void method1844(boolean arg0) {
        field4266 = (byte[][]) null;
        field4260 = null;
        if (arg0) {
            method1840(-71, 100);
        }
        field4276 = (boolean[][]) null;
    }
}
