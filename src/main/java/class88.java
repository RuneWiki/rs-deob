import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class88 extends class573 {

    @OriginalMember(owner = "client!hk", name = "I", descriptor = "I")
    private int field1633 = 4096;

    @OriginalMember(owner = "client!hk", name = "J", descriptor = "I")
    private int field1634 = 0;

    @OriginalMember(owner = "client!hk", name = "K", descriptor = "I")
    public static int field1635;

    @OriginalMember(owner = "client!hk", name = "L", descriptor = "I")
    public static int field1636;

    @OriginalMember(owner = "client!hk", name = "M", descriptor = "I")
    public static int field1637;

    @OriginalMember(owner = "client!hk", name = "N", descriptor = "I")
    public static int field1638;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(BII)Z")
    public static final boolean method866(byte arg0, int arg1, int arg2) {
        ++field1638;
        int var3 = -66 % ((arg0 - -75) / 47);
        return false;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(II)[I")
    public final int[] method619(int arg0, int arg1) {
        ++field1636;
        int[] var3 = super.field8321.method3164(arg0, arg1 ^ -112);
        if (super.field8321.field7825) {
            int[] var4 = this.method3292(0, 0, arg0);
            for (int var5 = 0; var5 < class540.field7555; ++var5) {
                int var6 = var4[var5];
                if (var6 < this.field1634) {
                    var3[var5] = this.field1634;
                } else if (~this.field1633 <= ~var6) {
                    var3[var5] = var6;
                } else {
                    var3[var5] = this.field1633;
                }
            }
        }
        if (arg1 != 1) {
            this.method442(-25, 121);
        }
        return var3;
    }

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "()V")
    public class88() {
        super(1, false);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lqh;II)V")
    public final void method443(class61 arg0, int arg1, int arg2) {
        if (arg2 != 3) {
            this.method442(-24, 77);
        }
        ++field1637;
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    super.field8334 = arg0.method732(arg2 ^ -559537957) == 1;
                }
            } else {
                this.field1633 = arg0.method723((byte) -25);
            }
        } else {
            this.field1634 = arg0.method723((byte) -25);
        }
    }

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "(II)[[I")
    public final int[][] method442(int arg0, int arg1) {
        ++field1635;
        int[][] var3 = super.field8320.method1504(arg1, -2);
        if (super.field8320.field3295) {
            int[][] var4 = this.method3293(0, -72, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class540.field7555; ++var11) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var7[var11];
                if (this.field1634 <= var12) {
                    if (~this.field1633 <= ~var12) {
                        var8[var11] = var12;
                    } else {
                        var8[var11] = this.field1633;
                    }
                } else {
                    var8[var11] = this.field1634;
                }
                if (~this.field1634 >= ~var13) {
                    if (~var13 >= ~this.field1633) {
                        var9[var11] = var13;
                    } else {
                        var9[var11] = this.field1633;
                    }
                } else {
                    var9[var11] = this.field1634;
                }
                if (~this.field1634 < ~var14) {
                    var10[var11] = this.field1634;
                } else if (var14 <= this.field1633) {
                    var10[var11] = var14;
                } else {
                    var10[var11] = this.field1633;
                }
            }
        }
        if (arg0 > -116) {
            this.method442(98, 58);
        }
        return var3;
    }
}
