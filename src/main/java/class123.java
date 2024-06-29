import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class123 extends class80 {

    @OriginalMember(owner = "client!r", name = "J", descriptor = "I")
    private int field2132 = 4096;

    @OriginalMember(owner = "client!r", name = "N", descriptor = "I")
    private int field2135 = 409;

    @OriginalMember(owner = "client!r", name = "M", descriptor = "[I")
    private int[] field2134 = new int[3];

    @OriginalMember(owner = "client!r", name = "P", descriptor = "I")
    private int field2137 = 4096;

    @OriginalMember(owner = "client!r", name = "Q", descriptor = "I")
    private int field2138 = 4096;

    @OriginalMember(owner = "client!r", name = "K", descriptor = "Ls;")
    public static class186 field2133 = new class186(42, 8);

    @OriginalMember(owner = "client!r", name = "R", descriptor = "[Ltn;")
    public static class60[] field2139 = new class60[5];

    @OriginalMember(owner = "client!r", name = "T", descriptor = "Z")
    public static boolean field2141;

    @OriginalMember(owner = "client!r", name = "I", descriptor = "I")
    public static int field2131;

    @OriginalMember(owner = "client!r", name = "O", descriptor = "I")
    public static int field2136;

    @OriginalMember(owner = "client!r", name = "S", descriptor = "I")
    public static int field2140;

    @OriginalMember(owner = "client!r", name = "V", descriptor = "Lc;")
    public static class124 field2143;

    @OriginalMember(owner = "client!r", name = "U", descriptor = "Ltk;")
    public static class231 field2142;

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "()V")
    public class123() {
        super(1, false);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IILnn;)V")
    public final void method26(int arg0, int arg1, class289 arg2) {
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (~arg0 == -5) {
                            int var5 = arg2.method1863(-111);
                            this.field2134[2] = class490.method2960(0, var5 >> 12);
                            this.field2134[0] = class490.method2960(267386880, var5 << 4);
                            this.field2134[1] = class490.method2960(4080, var5 >> 4);
                        }
                    } else {
                        this.field2137 = arg2.method1841((byte) 109);
                    }
                } else {
                    this.field2132 = arg2.method1841((byte) 114);
                }
            } else {
                this.field2138 = arg2.method1841((byte) -125);
            }
        } else {
            this.field2135 = arg2.method1841((byte) 51);
        }
        int var6 = 37 % ((arg1 - 28) / 53);
        ++field2131;
    }

    @OriginalMember(owner = "client!r", name = "d", descriptor = "(I)V")
    public static void method983(int arg0) {
        field2142 = null;
        field2143 = null;
        field2133 = null;
        field2139 = null;
        if (arg0 != 21832) {
            method983(34);
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIBII[B[B)V")
    public static final void method984(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, byte[] arg7, byte[] arg8) {
        ++field2136;
        int var9 = -(arg5 >> 2);
        int var10 = -(3 & arg5);
        if (arg4 <= 44) {
            method983(-49);
        }
        for (int var11 = -arg2; var11 < 0; ++var11) {
            int var10001;
            for (int var12 = var9; ~var12 > -1; ++var12) {
                var10001 = arg6++;
                arg7[var10001] = (byte) (arg7[var10001] + -arg8[arg1++]);
                int var14 = arg6++;
                arg7[var14] = (byte) (arg7[var14] + -arg8[arg1++]);
                int var15 = arg6++;
                arg7[var15] = (byte) (arg7[var15] + -arg8[arg1++]);
                int var16 = arg6++;
                arg7[var16] = (byte) (arg7[var16] + -arg8[arg1++]);
            }
            for (int var13 = var10; ~var13 > -1; ++var13) {
                var10001 = arg6++;
                arg7[var10001] = (byte) (arg7[var10001] + -arg8[arg1++]);
            }
            arg6 += arg0;
            arg1 += arg3;
        }
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(II)[[I")
    public final int[][] method29(int arg0, int arg1) {
        ++field2140;
        int[][] var3 = super.field1589.method859(arg1, arg0 + -365);
        if (arg0 != 255) {
            return null;
        } else {
            if (super.field1589.field1884) {
                int[][] var4 = this.method713(0, -61, arg1);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; ~var11 > ~class137.field2308; ++var11) {
                    int var12 = var5[var11];
                    int var13 = -this.field2134[0] + var12;
                    if (~var13 > -1) {
                        var13 = -var13;
                    }
                    if (var13 > this.field2135) {
                        var8[var11] = var12;
                        var9[var11] = var6[var11];
                        var10[var11] = var7[var11];
                    } else {
                        int var14 = var6[var11];
                        int var15 = -this.field2134[1] + var14;
                        if (~var15 > -1) {
                            var15 = -var15;
                        }
                        if (~this.field2135 > ~var15) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var7[var11];
                        } else {
                            int var16 = var7[var11];
                            int var17 = var16 - this.field2134[2];
                            if (~var17 > -1) {
                                var17 = -var17;
                            }
                            if (var17 > this.field2135) {
                                var8[var11] = var12;
                                var9[var11] = var14;
                                var10[var11] = var16;
                            } else {
                                var8[var11] = this.field2137 * var12 >> 12;
                                var9[var11] = this.field2132 * var14 >> 12;
                                var10[var11] = this.field2138 * var16 >> 12;
                            }
                        }
                    }
                }
            }
            return var3;
        }
    }

    static {
        for (int var0 = 0; ~var0 > ~field2139.length; ++var0) {
            field2139[var0] = new class60();
        }
        field2141 = false;
        new class309("Ok", "Okay", "OK", "Ok");
    }
}
