import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class611 extends class646 {

    @OriginalMember(owner = "client!pe", name = "I", descriptor = "I")
    private int field8765 = 0;

    @OriginalMember(owner = "client!pe", name = "P", descriptor = "I")
    private int field8772 = 4096;

    @OriginalMember(owner = "client!pe", name = "Q", descriptor = "Leda;")
    public static class116 field8773 = new class116(99, 2);

    @OriginalMember(owner = "client!pe", name = "R", descriptor = "[C")
    public static char[] field8774 = new char[] { '[', ']', '#' };

    @OriginalMember(owner = "client!pe", name = "S", descriptor = "I")
    public static int field8775 = 1403;

    @OriginalMember(owner = "client!pe", name = "J", descriptor = "I")
    public static int field8766;

    @OriginalMember(owner = "client!pe", name = "K", descriptor = "I")
    public static int field8767;

    @OriginalMember(owner = "client!pe", name = "L", descriptor = "I")
    public static int field8768;

    @OriginalMember(owner = "client!pe", name = "M", descriptor = "I")
    public static int field8769;

    @OriginalMember(owner = "client!pe", name = "N", descriptor = "I")
    public static int field8770;

    @OriginalMember(owner = "client!pe", name = "O", descriptor = "I")
    public static int field8771;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIZ)V", line = 3)
    public static final void method3461(int arg0, int arg1, boolean arg2) {
        ++field8769;
        if (class56.method437((byte) 61, arg1)) {
            class580.method3358((byte) 44, class265.field3806[arg1], arg0);
            if (!arg2) {
                field8774 = null;
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "(I)V", line = 18)
    public static void method3462(int arg0) {
        if (arg0 < -70) {
            field8774 = null;
            field8773 = null;
        }
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "()V", line = 85)
    public class611() {
        super(1, false);
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(IB)[I", line = 41)
    public final int[] method424(int arg0, byte arg1) {
        ++field8771;
        int[] var3 = super.field9156.method2193(1269, arg0);
        if (super.field9156.field5075) {
            int[] var4 = this.method3628(false, 0, arg0);
            for (int var5 = 0; var5 < class89.field1330; ++var5) {
                int var6 = var4[var5];
                if (this.field8765 <= var6) {
                    if (var6 <= this.field8772) {
                        var3[var5] = var6;
                    } else {
                        var3[var5] = this.field8772;
                    }
                } else {
                    var3[var5] = this.field8765;
                }
            }
        }
        return arg1 != -120 ? null : var3;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IBI)Lep;", line = 88)
    public static final class449 method3463(int arg0, byte arg1, int arg2) {
        ++field8768;
        class449 var3 = (class449) class101.field1535.method2818(-22803, (long) arg0 | (long) arg2 << 32);
        if (var3 == null) {
            var3 = new class449(arg2, arg0);
            class101.field1535.method2816(var3, var3.field6265, false);
        }
        if (arg1 > -108) {
            method3463(3, (byte) -37, -22);
        }
        return var3;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IILr;Z)V", line = 107)
    public static final void method3464(int arg0, int arg1, class98 arg2, boolean arg3) {
        class119.field1958 = new class63[arg1][arg0];
        class506.field7522 = arg2;
        ++field8770;
        if (!arg3) {
            field8773 = null;
        }
        if (class171.field2768 != null) {
            class319.field4403 = class494.method2889(class171.field2768[5], class171.field2768[3], class171.field2768[4], class171.field2768[1], 124, class171.field2768[2], class171.field2768[0]);
        }
        class521.field7682 = new class63();
        class355.method2151(29229);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)[[I", line = 125)
    public final int[][] method298(int arg0, int arg1) {
        ++field8767;
        int[][] var3 = super.field9164.method1002(arg0 + 12532, arg1);
        if (super.field9164.field2082) {
            int[][] var4 = this.method3626(41, arg1, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class89.field1330 > var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var7[var11];
                if (this.field8765 > var12) {
                    var8[var11] = this.field8765;
                } else if (var12 <= this.field8772) {
                    var8[var11] = var12;
                } else {
                    var8[var11] = this.field8772;
                }
                if (this.field8765 > var13) {
                    var9[var11] = this.field8765;
                } else if (var13 > this.field8772) {
                    var9[var11] = this.field8772;
                } else {
                    var9[var11] = var13;
                }
                if (~var14 > ~this.field8765) {
                    var10[var11] = this.field8765;
                } else if (var14 > this.field8772) {
                    var10[var11] = this.field8772;
                } else {
                    var10[var11] = var14;
                }
            }
        }
        if (arg0 != -12424) {
            field8775 = -46;
        }
        return var3;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lek;IB)V", line = 203)
    public final void method295(class465 arg0, int arg1, byte arg2) {
        if (arg2 <= 7) {
            method3464(-98, -50, (class98) null, false);
        }
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    super.field9160 = ~arg0.method2705(-111) == -2;
                }
            } else {
                this.field8772 = arg0.method2755((byte) -81);
            }
        } else {
            this.field8765 = arg0.method2755((byte) -74);
        }
        ++field8766;
    }
}
