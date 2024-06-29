import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class135 extends class362 {

    @OriginalMember(owner = "client!gm", name = "F", descriptor = "I")
    private int field2289 = 1;

    @OriginalMember(owner = "client!gm", name = "A", descriptor = "I")
    private int field2285 = 1;

    @OriginalMember(owner = "client!gm", name = "y", descriptor = "J")
    public static long field2283 = 20000000L;

    @OriginalMember(owner = "client!gm", name = "I", descriptor = "[[Z")
    public static boolean[][] field2292 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

    @OriginalMember(owner = "client!gm", name = "H", descriptor = "[C")
    public static char[] field2291 = new char[] { '[', ']', '#' };

    @OriginalMember(owner = "client!gm", name = "z", descriptor = "I")
    public static int field2284;

    @OriginalMember(owner = "client!gm", name = "B", descriptor = "I")
    public static int field2286;

    @OriginalMember(owner = "client!gm", name = "E", descriptor = "I")
    public static int field2288;

    @OriginalMember(owner = "client!gm", name = "G", descriptor = "I")
    public static int field2290;

    @OriginalMember(owner = "client!gm", name = "J", descriptor = "I")
    public static int field2293;

    @OriginalMember(owner = "client!gm", name = "K", descriptor = "I")
    public static int field2294;

    @OriginalMember(owner = "client!gm", name = "C", descriptor = "[I")
    public static int[] field2287;

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "(B)V")
    public static void method1112(byte arg0) {
        field2291 = null;
        field2287 = null;
        int var1 = -59 / ((-65 - arg0) / 54);
        field2292 = null;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IB)[[I")
    public final int[][] method153(int arg0, byte arg1) {
        ++field2294;
        if (arg1 <= 57) {
            method1112((byte) -1);
        }
        int[][] var3 = super.field4938.method3199(arg0, (byte) 103);
        if (super.field4938.field7848) {
            int var4 = this.field2289 + 1 + this.field2289;
            int var5 = 65536 / var4;
            int var6 = this.field2285 + 1 + this.field2285;
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var4][][];
            for (int var9 = -this.field2289 + arg0; ~var9 >= ~(this.field2289 + arg0); ++var9) {
                int[][] var19 = this.method2222(0, var9 & class606.field8463, 28008);
                int[][] var20 = new int[3][class769.field10597];
                int var21 = 0;
                int var22 = 0;
                int var23 = 0;
                int[] var24 = var19[0];
                int[] var25 = var19[1];
                int[] var26 = var19[2];
                for (int var27 = -this.field2285; this.field2285 >= var27; ++var27) {
                    int var37 = class522.field7083 & var27;
                    var21 += var24[var37];
                    var23 += var26[var37];
                    var22 += var25[var37];
                }
                int[] var28 = var20[0];
                int[] var29 = var20[1];
                int[] var30 = var20[2];
                int var31 = 0;
                while (~class769.field10597 < ~var31) {
                    var28[var31] = var7 * var21 >> 16;
                    var29[var31] = var7 * var22 >> 16;
                    var30[var31] = var7 * var23 >> 16;
                    int var32 = class522.field7083 & -this.field2285 + var31;
                    int var33 = var23 - var26[var32];
                    ++var31;
                    int var34 = var21 - var24[var32];
                    int var35 = var22 - var25[var32];
                    int var36 = this.field2285 + var31 & class522.field7083;
                    var23 = var26[var36] + var33;
                    var22 = var25[var36] + var35;
                    var21 = var24[var36] + var34;
                }
                var8[this.field2289 + var9 + -arg0] = var20;
            }
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            for (int var13 = 0; class769.field10597 > var13; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; var17 < var4; ++var17) {
                    int[][] var18 = var8[var17];
                    var14 += var18[0][var13];
                    var15 += var18[1][var13];
                    var16 += var18[2][var13];
                }
                var10[var13] = var5 * var14 >> 16;
                var11[var13] = var5 * var15 >> 16;
                var12[var13] = var5 * var16 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gm", name = "<init>", descriptor = "()V")
    public class135() {
        super(1, false);
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(II)[I")
    public final int[] method156(int arg0, int arg1) {
        if (arg0 != -2026769311) {
            return null;
        } else {
            ++field2293;
            int[] var3 = super.field4927.method808(-123, arg1);
            if (super.field4927.field1471) {
                int var4 = this.field2289 + this.field2289 + 1;
                int var5 = 65536 / var4;
                int var6 = this.field2285 + this.field2285 + 1;
                int var7 = 65536 / var6;
                int[][] var8 = new int[var4][];
                for (int var9 = -this.field2289 + arg1; var9 <= this.field2289 + arg1; ++var9) {
                    int[] var13 = this.method2221(0, var9 & class606.field8463, -90);
                    int[] var14 = new int[class769.field10597];
                    int var15 = 0;
                    for (int var16 = -this.field2285; this.field2285 >= var16; ++var16) {
                        var15 += var13[class522.field7083 & var16];
                    }
                    int var17 = 0;
                    while (~var17 > ~class769.field10597) {
                        var14[var17] = var7 * var15 >> 16;
                        int var18 = var15 - var13[class522.field7083 & -this.field2285 + var17];
                        ++var17;
                        var15 = var13[var17 - -this.field2285 & class522.field7083] + var18;
                    }
                    var8[var9 - -this.field2289 + -arg1] = var14;
                }
                for (int var10 = 0; ~class769.field10597 < ~var10; ++var10) {
                    int var11 = 0;
                    for (int var12 = 0; ~var4 < ~var12; ++var12) {
                        var11 += var8[var12][var10];
                    }
                    var3[var10] = var5 * var11 >> 16;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(I[BIIB[BIII)V")
    public static final void method1113(int arg0, byte[] arg1, int arg2, int arg3, byte arg4, byte[] arg5, int arg6, int arg7, int arg8) {
        ++field2288;
        int var9 = -(arg3 >> 2);
        int var10 = -(3 & arg3);
        if (arg4 != -19) {
            field2291 = null;
        }
        for (int var11 = -arg7; var11 < 0; ++var11) {
            int var10001;
            for (int var12 = var9; var12 < 0; ++var12) {
                var10001 = arg2++;
                arg1[var10001] += arg5[arg8++];
                int var14 = arg2++;
                arg1[var14] += arg5[arg8++];
                int var15 = arg2++;
                arg1[var15] += arg5[arg8++];
                int var16 = arg2++;
                arg1[var16] += arg5[arg8++];
            }
            for (int var13 = var10; var13 < 0; ++var13) {
                var10001 = arg2++;
                arg1[var10001] += arg5[arg8++];
            }
            arg2 += arg6;
            arg8 += arg0;
        }
    }

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "(II)V")
    public static final void method1114(int arg0, int arg1) {
        ++field2284;
        class281 var2 = class54.method395((byte) -53, (long) arg1, arg0);
        var2.method1818((byte) 78);
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method1115(int arg0, String arg1) {
        ++field2290;
        int var2 = -122 / ((11 - arg0) / 44);
        if (!class384.field5205.startsWith("win")) {
            if (!class384.field5205.startsWith("linux")) {
                return class384.field5205.startsWith("mac") ? "lib" + arg1 + ".dylib" : null;
            } else {
                return "lib" + arg1 + ".so";
            }
        } else {
            return arg1 + ".dll";
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lfca;II)V")
    public final void method154(class93 arg0, int arg1, int arg2) {
        if (arg2 == -1) {
            ++field2286;
            if (arg1 != 0) {
                if (~arg1 != -2) {
                    if (~arg1 == -3) {
                        super.field4929 = ~arg0.method793((byte) 116) == -2;
                    }
                } else {
                    this.field2289 = arg0.method793((byte) 10);
                }
            } else {
                this.field2285 = arg0.method793((byte) 93);
            }
        }
    }
}
