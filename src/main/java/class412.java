import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ku")
public class class412 extends class263 {

    @OriginalMember(owner = "client!ku", name = "I", descriptor = "Z")
    private boolean field6221 = true;

    @OriginalMember(owner = "client!ku", name = "K", descriptor = "Z")
    private boolean field6223 = true;

    @OriginalMember(owner = "client!ku", name = "E", descriptor = "I")
    public static int field6217;

    @OriginalMember(owner = "client!ku", name = "F", descriptor = "I")
    public static int field6218;

    @OriginalMember(owner = "client!ku", name = "G", descriptor = "I")
    public static int field6219;

    @OriginalMember(owner = "client!ku", name = "H", descriptor = "I")
    public static int field6220;

    @OriginalMember(owner = "client!ku", name = "J", descriptor = "I")
    public static int field6222;

    @OriginalMember(owner = "client!ku", name = "d", descriptor = "(B)[Loo;")
    public static final class31[] method2470(byte arg0) {
        ++field6219;
        if (arg0 != -88) {
            method2471(94, (byte) -2, -41);
        }
        return new class31[] { class394.field5906, class337.field5201, class59.field818 };
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(IZLgk;)V")
    public final void method32(int arg0, boolean arg1, class468 arg2) {
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    super.field3927 = ~arg2.method2765(125) == -2;
                }
            } else {
                this.field6221 = ~arg2.method2765(75) == -2;
            }
        } else {
            this.field6223 = ~arg2.method2765(105) == -2;
        }
        ++field6222;
        if (!arg1) {
            this.field6223 = true;
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(IB)[I")
    public final int[] method33(int arg0, byte arg1) {
        ++field6217;
        int[] var3 = super.field3917.method41(arg0, 1);
        if (arg1 <= 40) {
            this.field6223 = false;
        }
        if (super.field3917.field91) {
            int[] var4 = this.method1644(0, 0, !this.field6221 ? arg0 : class142.field2133 - arg0);
            if (!this.field6223) {
                class442.method2593(var4, 0, var3, 0, class367.field5597);
            } else {
                for (int var5 = 0; class367.field5597 > var5; ++var5) {
                    var3[var5] = var4[-var5 + class83.field1326];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "(IB)[[I")
    public final int[][] method34(int arg0, byte arg1) {
        if (arg1 > -45) {
            this.field6223 = false;
        }
        ++field6218;
        int[][] var3 = super.field3912.method2649(arg0, false);
        if (super.field3912.field6681) {
            int[][] var4 = this.method1646(0, 2, this.field6221 ? -arg0 + class142.field2133 : arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (!this.field6223) {
                for (int var11 = 0; ~var11 > ~class367.field5597; ++var11) {
                    var8[var11] = var5[var11];
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                }
            } else {
                for (int var12 = 0; ~var12 > ~class367.field5597; ++var12) {
                    var8[var12] = var5[-var12 + class83.field1326];
                    var9[var12] = var6[-var12 + class83.field1326];
                    var10[var12] = var7[-var12 + class83.field1326];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ku", name = "<init>", descriptor = "()V")
    public class412() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "(IBI)V")
    public static final void method2471(int arg0, byte arg1, int arg2) {
        if (arg1 == -93) {
            ++field6220;
            class506 var3 = class14.method185(-1304589728, arg2, 6);
            var3.method2992(arg1 ^ -93);
            var3.field7442 = arg0;
        }
    }
}
