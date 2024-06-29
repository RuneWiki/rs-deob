import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class284 extends class96 {

    @OriginalMember(owner = "client!e", name = "K", descriptor = "Loi;")
    public static class169 field3624 = new class169("level: ", "Stufe: ", "niveau ", "nível: ");

    @OriginalMember(owner = "client!e", name = "L", descriptor = "I")
    public static int field3625;

    @OriginalMember(owner = "client!e", name = "M", descriptor = "I")
    public static int field3626;

    @OriginalMember(owner = "client!e", name = "N", descriptor = "I")
    public static int field3627;

    @OriginalMember(owner = "client!e", name = "O", descriptor = "I")
    public static int field3628;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIIILhi;Z)V")
    public static final void method1729(int arg0, int arg1, int arg2, int arg3, int arg4, class44 arg5, boolean arg6) {
        ++field3626;
        if (~class405.field5433 > -51) {
            if (arg5 != null && arg5.field666 != null && arg1 < arg5.field666.length && arg5.field666[arg1] != null) {
                int var7 = arg5.field666[arg1][0];
                int var8 = var7 >> 8;
                int var9 = (var7 & 229) >> 5;
                if (arg5.field666[arg1].length > 1) {
                    int var10 = (int) (Math.random() * (double) arg5.field666[arg1].length);
                    if (var10 > 0) {
                        var8 = arg5.field666[arg1][var10];
                    }
                }
                int var11 = var7 & 31;
                if (~var11 == -1) {
                    if (arg6) {
                        class157.method1058(var8, 255, -2, var9, 0);
                    }
                } else if (~class421.field5647.field7695 != -1) {
                    int var12 = arg0 + -64 >> 7;
                    if (arg2 >= 85) {
                        int var13 = arg4 + -64 >> 7;
                        class46.field673[class405.field5433++] = new class449((byte) 1, var8, var9, 0, 255, (arg3 << 24) - -(var13 << 8) + (var12 << 16) + var11);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!e", name = "g", descriptor = "(I)V")
    public static void method1730(int arg0) {
        field3624 = null;
        if (arg0 != 20613) {
            field3628 = -98;
        }
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(II)[I")
    public final int[] method37(int arg0, int arg1) {
        ++field3625;
        int[] var3 = super.field1331.method397((byte) -110, arg0);
        if (arg1 != 255) {
            return null;
        } else {
            if (super.field1331.field863) {
                int[][] var4 = this.method659(0, arg1 + -372, arg0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                for (int var8 = 0; ~class269.field3403 < ~var8; ++var8) {
                    var3[var8] = (var5[var8] + var7[var8] - -var6[var8]) / 3;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(II)Z")
    public static final boolean method1731(int arg0, int arg1) {
        ++field3627;
        if (arg0 != -13615) {
            field3628 = 104;
        }
        return ~arg1 != -2 && ~arg1 != -8;
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "()V")
    public class284() {
        super(1, true);
    }
}
