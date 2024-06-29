import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public abstract class class605 {

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "Lok;")
    public class228 field8542;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "I")
    public static int field8541;

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "I")
    public static int field8543;

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(Lok;)V", line = 6)
    public class605(class228 arg0) {
        this.field8542 = arg0;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(II)[B", line = 16)
    public static final byte[] method3403(int arg0, int arg1) {
        if (arg0 != 255) {
            return null;
        }
        field8543++;
        class663 var2 = (class663) class502.field7109.method1097((long) arg1, (byte) -121);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg1);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class311.method1976(-1, var7, var4);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class663(var3);
            class502.field7109.method1095((long) arg1, (byte) -128, var2);
        }
        return var2.field9364;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(ILjava/lang/String;IZIIZIIJLjava/lang/String;)V", line = 66)
    public static final void method3404(int arg0, String arg1, int arg2, boolean arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, long arg9, String arg10) {
        if (arg7 > -9) {
            return;
        }
        field8541++;
        if (!class623.field8731 && class340.field5002 < 500) {
            int var12 = arg8 == -1 ? class190.field2750 : arg8;
            class279 var13 = new class279(arg10, arg1, var12, arg4, arg5, arg9, arg0, arg2, arg3, arg6);
            class663.field9367.method474(var13, 6);
            class340.field5002++;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Z)Z")
    public abstract boolean method48(boolean arg0);

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(ZI)V")
    public abstract void method51(boolean arg0, int arg1);

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IZI)V")
    public abstract void method47(int arg0, boolean arg1, int arg2);

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)V")
    public abstract void method45(int arg0);

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(ILip;I)V")
    public abstract void method43(int arg0, class657 arg1, int arg2);

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(ZB)V")
    public abstract void method46(boolean arg0, byte arg1);
}
