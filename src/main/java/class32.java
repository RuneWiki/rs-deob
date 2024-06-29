import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class32 extends class273 {

    @OriginalMember(owner = "client!gh", name = "Q", descriptor = "Z")
    private boolean field534 = true;

    @OriginalMember(owner = "client!gh", name = "P", descriptor = "Z")
    private boolean field533 = true;

    @OriginalMember(owner = "client!gh", name = "K", descriptor = "Ljava/lang/String;")
    public static String field529 = "Examine";

    @OriginalMember(owner = "client!gh", name = "M", descriptor = "Ljava/lang/String;")
    public static String field531 = "Loading...";

    @OriginalMember(owner = "client!gh", name = "V", descriptor = "I")
    public static int field539 = 0;

    @OriginalMember(owner = "client!gh", name = "W", descriptor = "I")
    public static int field540 = 0;

    @OriginalMember(owner = "client!gh", name = "U", descriptor = "[I")
    public static int[] field538 = new int[32];

    @OriginalMember(owner = "client!gh", name = "J", descriptor = "I")
    public static int field528;

    @OriginalMember(owner = "client!gh", name = "L", descriptor = "I")
    public static int field530;

    @OriginalMember(owner = "client!gh", name = "N", descriptor = "I")
    public static int field532;

    @OriginalMember(owner = "client!gh", name = "R", descriptor = "I")
    public static int field535;

    @OriginalMember(owner = "client!gh", name = "S", descriptor = "I")
    public static int field536;

    @OriginalMember(owner = "client!gh", name = "T", descriptor = "I")
    public static int field537;

    @OriginalMember(owner = "client!gh", name = "X", descriptor = "I")
    public static int field541;

    @OriginalMember(owner = "client!gh", name = "Y", descriptor = "I")
    public static int field542;

    @OriginalMember(owner = "client!gh", name = "Z", descriptor = "I")
    public static int field543;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lsb;I)Z")
    public static final boolean method275(class124 arg0, int arg1) {
        if (arg1 != 7121) {
            field531 = null;
        }
        ++field543;
        return arg0.method899(class183.field3016, -79);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ZI)[I")
    public final int[] method4(boolean arg0, int arg1) {
        if (arg0) {
            this.field533 = false;
        }
        ++field536;
        int[] var3 = super.field4359.method387((byte) -45, arg1);
        if (super.field4359.field833) {
            int[] var4 = this.method1850(this.field533 ? -arg1 + class145.field2392 : arg1, 0, (byte) -39);
            if (this.field534) {
                for (int var5 = 0; ~class26.field458 < ~var5; ++var5) {
                    var3[var5] = var4[client.field4573 - var5];
                }
            } else {
                class68.method533(var4, 0, var3, 0, class26.field458);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gh", name = "<init>", descriptor = "()V")
    public class32() {
        super(1, false);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lig;II)V")
    public final void method2(class136 arg0, int arg1, int arg2) {
        if (arg2 == 5) {
            if (arg1 != 0) {
                if (~arg1 != -2) {
                    if (~arg1 == -3) {
                        super.field4358 = ~arg0.method1012(4) == -2;
                    }
                } else {
                    this.field533 = ~arg0.method1012(arg2 + -1) == -2;
                }
            } else {
                this.field534 = arg0.method1012(4) == 1;
            }
            ++field530;
        }
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(II)V")
    public static final void method276(int arg0, int arg1) {
        class225.field3579 = null;
        class167.field2753 = arg1;
        client.field4563 = -1;
        class293.field4652 = false;
        class138.field2311 = 1;
        class47.field870 = -1;
        ++field535;
        if (arg0 != 12543) {
            method275((class124) null, -95);
        }
        class257.field4086 = 0;
    }

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "(I)V")
    public static void method277(int arg0) {
        field538 = null;
        field529 = null;
        field531 = null;
        if (arg0 != 4252) {
            field529 = null;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIII)I")
    public static final int method278(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 1) {
            method277(-66);
        }
        ++field537;
        if (arg3 < arg0) {
            return arg0;
        } else {
            return ~arg3 < ~arg2 ? arg2 : arg3;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lsb;IB)Lfc;")
    public static final class149 method279(class124 arg0, int arg1, byte arg2) {
        int var3 = 95 / ((arg2 - -1) / 50);
        ++field542;
        return !class146.method1077(true, arg1, arg0) ? null : class245.method1628(113);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(II)[[I")
    public final int[][] method3(int arg0, int arg1) {
        ++field532;
        int[][] var3 = super.field4357.method1949(true, arg1);
        if (arg0 <= 122) {
            field539 = 7;
        }
        if (super.field4357.field4631) {
            int[][] var4 = this.method1853(0, !this.field533 ? arg1 : -arg1 + class145.field2392, (byte) 8);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[2];
            int[] var9 = var3[1];
            int[] var10 = var3[0];
            if (this.field534) {
                for (int var11 = 0; ~var11 > ~class26.field458; ++var11) {
                    var10[var11] = var5[-var11 + client.field4573];
                    var9[var11] = var6[-var11 + client.field4573];
                    var8[var11] = var7[-var11 + client.field4573];
                }
            } else {
                for (int var12 = 0; ~var12 > ~class26.field458; ++var12) {
                    var10[var12] = var5[var12];
                    var9[var12] = var6[var12];
                    var8[var12] = var7[var12];
                }
            }
        }
        return var3;
    }
}
