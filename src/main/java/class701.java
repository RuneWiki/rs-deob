import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mha")
public class class701 {

    @OriginalMember(owner = "client!mha", name = "b", descriptor = "I")
    public int field9762;

    @OriginalMember(owner = "client!mha", name = "i", descriptor = "I")
    public int field9769;

    @OriginalMember(owner = "client!mha", name = "e", descriptor = "I")
    public int field9765;

    @OriginalMember(owner = "client!mha", name = "d", descriptor = "I")
    public int field9764;

    @OriginalMember(owner = "client!mha", name = "g", descriptor = "I")
    public static int field9767 = -1;

    @OriginalMember(owner = "client!mha", name = "h", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field9768 = new BigInteger("10001", 16);

    @OriginalMember(owner = "client!mha", name = "j", descriptor = "Z")
    public static boolean field9770 = false;

    @OriginalMember(owner = "client!mha", name = "c", descriptor = "I")
    public static int field9763;

    @OriginalMember(owner = "client!mha", name = "f", descriptor = "I")
    public static int field9766;

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "Lcj;")
    public static class443 field9761;

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(B)V", line = 9)
    public static void method3952(byte arg0) {
        field9761 = null;
        field9768 = null;
        int var1 = -81 % ((-arg0 - 9) / 48);
    }

    @OriginalMember(owner = "client!mha", name = "toString", descriptor = "()Ljava/lang/String;", line = 19)
    public final String toString() {
        field9763++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(IIIIIII)Z", line = 30)
    public static final boolean method3953(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field9766++;
        if (!class57.field802 || !class238.field3315) {
            return false;
        } else if (class129.field1762 < 100) {
            return false;
        } else if (arg4 != arg6 || arg0 != arg3) {
            int var9 = 7 / ((-arg5 - 17) / 62);
            for (int var10 = arg4; var10 <= arg6; var10++) {
                for (int var13 = arg0; var13 <= arg3; var13++) {
                    if (class573.field8104[arg2][var10][var13] == -class582.field8284) {
                        return false;
                    }
                }
            }
            int var11 = (arg4 << class509.field7106) + 1;
            int var12 = (arg0 << class509.field7106) + 2;
            if (class141.method909(var12, (arg6 + 1 - arg4) * class96.field1402, var11, arg1, -107, (arg3 + 1 - arg0) * class96.field1402, class52.field741[arg2].method1959(123, arg0, arg4))) {
                class158.field2144++;
                return true;
            } else {
                return false;
            }
        } else if (class614.method3603(arg0, false, arg4, arg2)) {
            int var7 = arg4 << class509.field7106;
            int var8 = arg0 << class509.field7106;
            if (class141.method909(var8, class96.field1402, var7, arg1, -119, class96.field1402, class52.field741[arg2].method1959(123, arg0, arg4))) {
                class158.field2144++;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mha", name = "<init>", descriptor = "(IIII)V", line = 102)
    public class701(int arg0, int arg1, int arg2, int arg3) {
        this.field9762 = arg2;
        this.field9769 = arg3;
        this.field9765 = arg0;
        this.field9764 = arg1;
    }
}
