import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qia")
public class class572 extends class330 {

    @OriginalMember(owner = "client!qia", name = "C", descriptor = "I")
    public static int field8055 = 0;

    @OriginalMember(owner = "client!qia", name = "D", descriptor = "I")
    public static int field8056;

    @OriginalMember(owner = "client!qia", name = "F", descriptor = "I")
    public static int field8057;

    @OriginalMember(owner = "client!qia", name = "G", descriptor = "I")
    public static int field8058;

    @OriginalMember(owner = "client!qia", name = "H", descriptor = "I")
    public static int field8059;

    @OriginalMember(owner = "client!qia", name = "b", descriptor = "(I)[Lof;", line = 7)
    public static final class475[] method3360(int arg0) {
        if (arg0 != 0) {
            field8055 = -86;
        }
        ++field8056;
        return new class475[] { class181.field2287, class656.field9257, class227.field3443, class86.field1037, class538.field7430, class558.field7853, class463.field6467, class132.field1692, class777.field10690, class696.field9705 };
    }

    @OriginalMember(owner = "client!qia", name = "<init>", descriptor = "()V", line = 18)
    public class572() {
        super(3, false);
    }

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "(II)[[I", line = 22)
    public final int[][] method537(int arg0, int arg1) {
        ++field8059;
        int[][] var3 = super.field4621.method1597(arg1, true);
        if (arg0 != 0) {
            return null;
        } else {
            if (super.field4621.field3510) {
                int[] var4 = this.method2084(2, arg1, (byte) 35);
                int[][] var5 = this.method2082(arg1, 0, 124);
                int[][] var6 = this.method2082(arg1, 1, arg0 + 126);
                int[] var7 = var3[0];
                int[] var8 = var3[1];
                int[] var9 = var3[2];
                int[] var10 = var5[0];
                int[] var11 = var5[1];
                int[] var12 = var5[2];
                int[] var13 = var6[0];
                int[] var14 = var6[1];
                int[] var15 = var6[2];
                for (int var16 = 0; ~class80.field901 < ~var16; ++var16) {
                    int var17 = var4[var16];
                    if (var17 == 4096) {
                        var7[var16] = var10[var16];
                        var8[var16] = var11[var16];
                        var9[var16] = var12[var16];
                    } else if (var17 == 0) {
                        var7[var16] = var13[var16];
                        var8[var16] = var14[var16];
                        var9[var16] = var15[var16];
                    } else {
                        int var18 = 4096 - var17;
                        var7[var16] = var10[var16] * var17 + var13[var16] * var18 >> 12;
                        var8[var16] = var11[var16] * var17 - -(var14[var16] * var18) >> 12;
                        var9[var16] = var12[var16] * var17 - -(var15[var16] * var18) >> 12;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "(IZ)[I", line = 104)
    public final int[] method464(int arg0, boolean arg1) {
        if (arg1) {
            return null;
        } else {
            ++field8057;
            int[] var3 = super.field4630.method2475(arg0, 30011);
            if (super.field4630.field5704) {
                int[] var4 = this.method2084(0, arg0, (byte) -117);
                int[] var5 = this.method2084(1, arg0, (byte) -128);
                int[] var6 = this.method2084(2, arg0, (byte) 16);
                for (int var7 = 0; ~class80.field901 < ~var7; ++var7) {
                    int var8 = var6[var7];
                    if (~var8 != -4097) {
                        if (~var8 == -1) {
                            var3[var7] = var5[var7];
                        } else {
                            var3[var7] = (4096 - var8) * var5[var7] + var4[var7] * var8 >> 12;
                        }
                    } else {
                        var3[var7] = var4[var7];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "(Lgga;IB)V", line = 156)
    public final void method466(class511 arg0, int arg1, byte arg2) {
        int var4 = 122 / ((-41 - arg2) / 42);
        ++field8058;
        if (arg1 == 0) {
            super.field4636 = arg0.method3013(-119) == 1;
        }
    }
}
