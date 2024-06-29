import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class310 {

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "Lwn;")
    public static class585 field4324 = new class585("", 11);

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "I")
    public static int field4322;

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "I")
    public static int field4323;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IBLrl;[I[II)Lqn;")
    public static final class297 method2037(int arg0, byte arg1, class232 arg2, int[] arg3, int[] arg4, int arg5) {
        field4322++;
        if (arg1 != 15) {
            return null;
        } else if (arg2.method323(class38.field472, class401.field5747, (byte) -16)) {
            byte[] var6 = new byte[arg0 * arg5];
            for (int var7 = 0; var7 < arg5; var7++) {
                int var8 = arg0 * var7 + arg3[var7];
                for (int var9 = 0; var9 < arg4[var7]; var9++) {
                    var6[var8++] = -1;
                }
            }
            return new class297(arg2, arg0, arg5, var6);
        } else {
            int[] var10 = new int[arg0 * arg5];
            for (int var11 = 0; var11 < arg5; var11++) {
                int var12 = arg0 * var11 + arg3[var11];
                for (int var13 = 0; var13 < arg4[var11]; var13++) {
                    var10[var12++] = -16777216;
                }
            }
            return new class297(arg2, arg0, arg5, var10);
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V")
    public static void method2038(int arg0) {
        if (arg0 == 3) {
            field4324 = null;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(B)I")
    public static final int method2039(byte arg0) {
        if (arg0 != 69) {
            field4324 = null;
        }
        field4323++;
        if (class25.field320) {
            return 6;
        } else if (class655.field8752 == null) {
            return 0;
        } else {
            int var1 = class655.field8752.field7754;
            if (class321.method2070(30264, var1)) {
                return 1;
            } else if (class158.method994(var1, -118)) {
                return 2;
            } else if (class669.method3774(var1, 0)) {
                return 3;
            } else if (class131.method825(501, var1)) {
                return 4;
            } else {
                return 5;
            }
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(III)Lpn;")
    public static final class91 method2040(int arg0, int arg1, int arg2) {
        class262 var3 = class137.field1948[arg0][arg1][arg2];
        return var3 == null ? null : var3.field3842;
    }
}
