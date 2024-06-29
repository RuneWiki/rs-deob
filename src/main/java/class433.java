import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public class class433 extends class334 {

    @OriginalMember(owner = "client!gs", name = "F", descriptor = "Z")
    private boolean field6039 = true;

    @OriginalMember(owner = "client!gs", name = "K", descriptor = "Z")
    private boolean field6044 = true;

    @OriginalMember(owner = "client!gs", name = "H", descriptor = "Lin;")
    public static class380 field6041 = new class380(120, 1);

    @OriginalMember(owner = "client!gs", name = "N", descriptor = "[F")
    public static float[] field6047 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!gs", name = "E", descriptor = "I")
    public static int field6038;

    @OriginalMember(owner = "client!gs", name = "G", descriptor = "I")
    public static int field6040;

    @OriginalMember(owner = "client!gs", name = "I", descriptor = "I")
    public static int field6042;

    @OriginalMember(owner = "client!gs", name = "J", descriptor = "I")
    public static int field6043;

    @OriginalMember(owner = "client!gs", name = "M", descriptor = "I")
    public static int field6046;

    @OriginalMember(owner = "client!gs", name = "O", descriptor = "I")
    public static int field6048;

    @OriginalMember(owner = "client!gs", name = "L", descriptor = "Lii;")
    public static class670 field6045;

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(II)[I", line = 6)
    public final int[] method28(int arg0, int arg1) {
        ++field6038;
        int[] var3 = super.field4743.method1027((byte) -89, arg0);
        if (arg1 != -22563988) {
            this.field6044 = false;
        }
        if (super.field4743.field1993) {
            int[] var4 = this.method2052(0, arg1 + 22563988, !this.field6044 ? arg0 : class147.field2360 - arg0);
            if (!this.field6039) {
                class171.method1262(var4, 0, var3, 0, class439.field6099);
            } else {
                for (int var5 = 0; class439.field6099 > var5; ++var5) {
                    var3[var5] = var4[-var5 + class478.field6578];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gs", name = "c", descriptor = "(B)V", line = 46)
    public static void method2591(byte arg0) {
        field6041 = null;
        field6047 = null;
        int var1 = 79 / ((10 - arg0) / 53);
        field6045 = null;
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(ZI)[[I", line = 57)
    public final int[][] method283(boolean arg0, int arg1) {
        if (!arg0) {
            field6047 = null;
        }
        ++field6046;
        int[][] var3 = super.field4734.method275(26422, arg1);
        if (super.field4734.field425) {
            int[][] var4 = this.method2053(1, 0, this.field6044 ? -arg1 + class147.field2360 : arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (this.field6039) {
                for (int var11 = 0; ~class439.field6099 < ~var11; ++var11) {
                    var8[var11] = var5[-var11 + class478.field6578];
                    var9[var11] = var6[-var11 + class478.field6578];
                    var10[var11] = var7[-var11 + class478.field6578];
                }
            } else {
                for (int var12 = 0; class439.field6099 > var12; ++var12) {
                    var8[var12] = var5[var12];
                    var9[var12] = var6[var12];
                    var10[var12] = var7[var12];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gs", name = "<init>", descriptor = "()V", line = 126)
    public class433() {
        super(1, false);
    }

    @OriginalMember(owner = "client!gs", name = "g", descriptor = "(I)Z", line = 132)
    public static final boolean method2592(int arg0) {
        ++field6042;
        if (arg0 != -1) {
            field6047 = null;
        }
        return ~class624.field8863 < -1;
    }

    @OriginalMember(owner = "client!gs", name = "h", descriptor = "(I)V", line = 150)
    public static final void method2593(int arg0) {
        int var1 = -74 % ((-8 - arg0) / 42);
        ++field6040;
        class208.field3039 = null;
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(IZLol;)V", line = 162)
    public final void method29(int arg0, boolean arg1, class431 arg2) {
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    super.field4747 = arg2.method2557(14929) == 1;
                }
            } else {
                this.field6044 = ~arg2.method2557(14929) == -2;
            }
        } else {
            this.field6039 = arg2.method2557(14929) == 1;
        }
        ++field6043;
        if (arg1) {
            field6045 = null;
        }
    }
}
