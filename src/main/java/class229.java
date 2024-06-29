import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ju")
public class class229 extends class478 {

    @OriginalMember(owner = "client!ju", name = "E", descriptor = "Z")
    private boolean field2834 = true;

    @OriginalMember(owner = "client!ju", name = "G", descriptor = "Z")
    private boolean field2836 = true;

    @OriginalMember(owner = "client!ju", name = "C", descriptor = "I")
    public static int field2832 = 0;

    @OriginalMember(owner = "client!ju", name = "D", descriptor = "I")
    public static int field2833;

    @OriginalMember(owner = "client!ju", name = "F", descriptor = "I")
    public static int field2835;

    @OriginalMember(owner = "client!ju", name = "H", descriptor = "I")
    public static int field2837;

    @OriginalMember(owner = "client!ju", name = "I", descriptor = "I")
    public static int field2838;

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "(II)[I")
    public final int[] method35(int arg0, int arg1) {
        ++field2835;
        int[] var3 = super.field6886.method789(arg0, (byte) -77);
        if (super.field6886.field1592) {
            int[] var4 = this.method2752(!this.field2834 ? arg0 : -arg0 + class156.field1746, 110, 0);
            if (!this.field2836) {
                class567.method3215(var4, 0, var3, 0, class436.field6154);
            } else {
                for (int var5 = 0; ~class436.field6154 < ~var5; ++var5) {
                    var3[var5] = var4[class204.field2414 - var5];
                }
            }
        }
        return arg1 != -11323 ? null : var3;
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(ILnp;I)V")
    public final void method33(int arg0, class115 arg1, int arg2) {
        ++field2837;
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    super.field6881 = arg1.method620((byte) 32) == 1;
                }
            } else {
                this.field2834 = ~arg1.method620((byte) -126) == -2;
            }
        } else {
            this.field2836 = ~arg1.method620((byte) 127) == -2;
        }
        if (arg0 != 255) {
            this.method33(-97, (class115) null, 27);
        }
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(ZZI)V")
    public static final void method1376(boolean arg0, boolean arg1, int arg2) {
        ++field2833;
        class533.field7494 = 3;
        class445.field6273 = arg2;
        class291.method1699(class152.field1682.field2001, class152.field1682.field1987, 32506);
        if (!arg0) {
            class194.method1176((byte) 45);
            class483.method2795(19326, false, class705.field9907, class136.field1497);
        } else {
            class483.method2795(19326, false, "", "");
        }
        if (arg1) {
            field2832 = -108;
        }
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method104(boolean arg0, int arg1) {
        ++field2838;
        int[][] var3 = super.field6889.method2091(-115, arg1);
        if (super.field6889.field4765) {
            int[][] var4 = this.method2753(0, this.field2834 ? -arg1 + class156.field1746 : arg1, (byte) 11);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (!this.field2836) {
                for (int var11 = 0; var11 < class436.field6154; ++var11) {
                    var8[var11] = var5[var11];
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                }
            } else {
                for (int var12 = 0; class436.field6154 > var12; ++var12) {
                    var8[var12] = var5[-var12 + class204.field2414];
                    var9[var12] = var6[-var12 + class204.field2414];
                    var10[var12] = var7[-var12 + class204.field2414];
                }
            }
        }
        if (!arg0) {
            this.method35(120, 87);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ju", name = "<init>", descriptor = "()V")
    public class229() {
        super(1, false);
    }
}
