import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class428 extends class398 {

    @OriginalMember(owner = "client!wk", name = "O", descriptor = "I")
    private int field6304 = 4096;

    @OriginalMember(owner = "client!wk", name = "J", descriptor = "I")
    public static int field6299;

    @OriginalMember(owner = "client!wk", name = "K", descriptor = "I")
    public static int field6300;

    @OriginalMember(owner = "client!wk", name = "L", descriptor = "I")
    public static int field6301;

    @OriginalMember(owner = "client!wk", name = "M", descriptor = "I")
    public static int field6302;

    @OriginalMember(owner = "client!wk", name = "N", descriptor = "I")
    public static int field6303;

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(IB)I")
    public static final int method2718(int arg0, byte arg1) {
        int var2 = 39 / ((arg1 - 39) / 39);
        ++field6303;
        int var3 = (arg0 * arg0 >> 12) * arg0 >> 12;
        int var4 = arg0 * 6 + -61440;
        int var5 = (arg0 * var4 >> 12) + 40960;
        return var3 * var5 >> 12;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(II)[I")
    public final int[] method95(int arg0, int arg1) {
        ++field6301;
        if (arg1 != 0) {
            field6302 = 64;
        }
        int[] var3 = super.field5927.method305(arg0, (byte) 102);
        if (super.field5927.field591) {
            int[] var4 = this.method2558(0, 29295, arg0 + -1 & class411.field6070);
            int[] var5 = this.method2558(0, arg1 + 29295, arg0);
            int[] var6 = this.method2558(0, 29295, arg0 + 1 & class411.field6070);
            for (int var7 = 0; class140.field1922 > var7; ++var7) {
                int var8 = (var6[var7] - var4[var7]) * this.field6304;
                int var9 = (var5[class242.field3233 & var7 + 1] + -var5[var7 + -1 & class242.field3233]) * this.field6304;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (4096.0D * Math.sqrt((double) ((float) (var12 - (-var13 - 4096)) / 4096.0F)));
                int var15 = ~var14 == -1 ? 0 : 16777216 / var14;
                var3[var7] = 4096 - var15;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "()V")
    public class428() {
        super(1, true);
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lnj;II)V")
    public final void method208(class228 arg0, int arg1, int arg2) {
        if (~arg1 == -1) {
            this.field6304 = arg0.method1343(255);
        }
        ++field6299;
        if (arg2 != -13132) {
            this.field6304 = 116;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(BIILps;)V")
    public static final void method2719(byte arg0, int arg1, int arg2, class394 arg3) {
        if (arg0 < 108) {
            method2719((byte) -47, 76, 50, (class394) null);
        }
        ++field6300;
        if (~arg3.field5753 == -1) {
            arg3.field5821 = arg3.field5712;
        } else if (~arg3.field5753 != -2) {
            if (~arg3.field5753 != -3) {
                if (~arg3.field5753 != -4) {
                    if (arg3.field5753 == 4) {
                        arg3.field5821 = (arg3.field5712 * arg1 >> 14) + (-arg3.field5773 + arg1) / 2;
                    } else {
                        arg3.field5821 = -arg3.field5773 + arg1 + -(arg3.field5712 * arg1 >> 14);
                    }
                } else {
                    arg3.field5821 = arg3.field5712 * arg1 >> 14;
                }
            } else {
                arg3.field5821 = -arg3.field5773 + -arg3.field5712 + arg1;
            }
        } else {
            arg3.field5821 = (arg1 - arg3.field5773) / 2 + arg3.field5712;
        }
        if (arg3.field5793 != 0) {
            if (arg3.field5793 != 1) {
                if (~arg3.field5793 == -3) {
                    arg3.field5779 = -arg3.field5672 + arg2 + -arg3.field5696;
                } else if (~arg3.field5793 != -4) {
                    if (~arg3.field5793 != -5) {
                        arg3.field5779 = -arg3.field5672 + arg2 + -(arg3.field5696 * arg2 >> 14);
                    } else {
                        arg3.field5779 = (arg3.field5696 * arg2 >> 14) + (arg2 - arg3.field5672) / 2;
                    }
                } else {
                    arg3.field5779 = arg3.field5696 * arg2 >> 14;
                }
            } else {
                arg3.field5779 = (-arg3.field5672 + arg2) / 2 - -arg3.field5696;
            }
        } else {
            arg3.field5779 = arg3.field5696;
        }
        if (class62.field818) {
            if (client.method1544(arg3).field4475 == 0 && arg3.field5671 != 0) {
                return;
            }
            if (arg3.field5779 >= 0) {
                if (arg2 < arg3.field5779 - -arg3.field5672) {
                    arg3.field5779 = -arg3.field5672 + arg2;
                }
            } else {
                arg3.field5779 = 0;
            }
            if (~arg3.field5821 > -1) {
                arg3.field5821 = 0;
                return;
            }
            if (arg3.field5821 + arg3.field5773 > arg1) {
                arg3.field5821 = -arg3.field5773 + arg1;
                return;
            }
        }
    }
}
