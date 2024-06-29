import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rea")
public class class117 extends class214 {

    @OriginalMember(owner = "client!rea", name = "E", descriptor = "I")
    private int field1805 = 585;

    @OriginalMember(owner = "client!rea", name = "H", descriptor = "I")
    public static int field1808 = 1;

    @OriginalMember(owner = "client!rea", name = "F", descriptor = "I")
    public static int field1806;

    @OriginalMember(owner = "client!rea", name = "G", descriptor = "I")
    public static int field1807;

    @OriginalMember(owner = "client!rea", name = "I", descriptor = "I")
    public static int field1809;

    @OriginalMember(owner = "client!rea", name = "D", descriptor = "[I")
    public static int[] field1804;

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(IB)[I", line = 3)
    public final int[] method64(int arg0, byte arg1) {
        ++field1807;
        int[] var3 = super.field3544.method3869(arg0, -114);
        if (arg1 != 5) {
            return null;
        } else {
            if (super.field3544.field9836) {
                int var4 = class131.field2138[arg0];
                for (int var5 = 0; ~class626.field8787 < ~var5; ++var5) {
                    int var6 = class592.field8328[var5];
                    if (~var6 < ~this.field1805 && ~(-this.field1805 + 4096) < ~var6 && var4 > 2048 - this.field1805 && ~(this.field1805 + 2048) < ~var4) {
                        int var7 = -var6 + 2048;
                        int var8 = ~var7 <= -1 ? var7 : -var7;
                        int var9 = var8 << 12;
                        int var10 = var9 / (-this.field1805 + 2048);
                        var3[var5] = -var10 + 4096;
                    } else if (~(-this.field1805 + 2048) > ~var6 && var6 < this.field1805 + 2048) {
                        int var11 = var4 + -2048;
                        int var12 = ~var11 > -1 ? -var11 : var11;
                        int var13 = var12 - this.field1805;
                        int var14 = var13 << 12;
                        var3[var5] = var14 / (-this.field1805 + 2048);
                    } else if (~this.field1805 >= ~var4 && ~(-this.field1805 + 4096) <= ~var4) {
                        if (var6 >= this.field1805 && -this.field1805 + 4096 >= var6) {
                            var3[var5] = 0;
                        } else {
                            int var15 = -var4 + 2048;
                            int var16 = var15 >= 0 ? var15 : -var15;
                            int var17 = var16 << 12;
                            int var18 = var17 / (-this.field1805 + 2048);
                            var3[var5] = 4096 - var18;
                        }
                    } else {
                        int var19 = var6 + -2048;
                        int var20 = var19 >= 0 ? var19 : -var19;
                        int var21 = var20 - this.field1805;
                        int var22 = var21 << 12;
                        var3[var5] = var22 / (-this.field1805 + 2048);
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "([II[FI[FIIIII[III)V", line = 85)
    public static final void method928(int[] arg0, int arg1, float[] arg2, int arg3, float[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int[] arg10, int arg11, int arg12) {
        if (arg6 == -28848) {
            ++field1809;
            int var13 = arg1 * arg11 + arg12;
            int var14 = arg5 * arg9 + arg7;
            int var15 = -arg8 + arg11;
            int var16 = -arg8 + arg9;
            if (arg0 != null) {
                if (arg4 != null) {
                    for (int var17 = 0; var17 < arg3; ++var17) {
                        int var18 = var13 - -arg8;
                        while (~var18 < ~var13) {
                            arg10[var14] = arg0[var13];
                            arg2[var14++] = arg4[var13++];
                        }
                        var13 += var15;
                        var14 += var16;
                    }
                } else {
                    for (int var19 = 0; var19 < arg3; ++var19) {
                        int var20 = arg8 + var13;
                        while (~var20 < ~var13) {
                            arg10[var14++] = arg0[var13++];
                        }
                        var14 += var16;
                        var13 += var15;
                    }
                }
            } else {
                for (int var21 = 0; var21 < arg3; ++var21) {
                    int var22 = arg8 + var13;
                    while (~var13 > ~var22) {
                        arg2[var14++] = arg4[var13++];
                    }
                    var14 += var16;
                    var13 += var15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rea", name = "<init>", descriptor = "()V", line = 177)
    public class117() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(ILofa;I)V", line = 180)
    public final void method59(int arg0, class301 arg1, int arg2) {
        ++field1806;
        if (arg0 < 92) {
            field1808 = 121;
        }
        if (arg2 == 0) {
            this.field1805 = arg1.method1989((byte) -77);
        }
    }

    @OriginalMember(owner = "client!rea", name = "b", descriptor = "(Z)V", line = 207)
    public static void method929(boolean arg0) {
        if (!arg0) {
            field1808 = -11;
        }
        field1804 = null;
    }
}
