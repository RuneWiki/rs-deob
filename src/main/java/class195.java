import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public class class195 {

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "Lqd;")
    public static class315 field3268 = new class315("", 10);

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "I")
    public static int field3267;

    @OriginalMember(owner = "client!tr", name = "c", descriptor = "I")
    public static int field3269;

    @OriginalMember(owner = "client!tr", name = "d", descriptor = "I")
    public static int field3270;

    @OriginalMember(owner = "client!tr", name = "e", descriptor = "Lbi;")
    public static class338 field3271;

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(IZIIIIIII)Z", line = 7)
    public static final boolean method1362(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3269++;
        int var9 = class398.field5947.field1978[0];
        int var10 = class398.field5947.field1976[0];
        if (arg7 < ~var9 || class69.field976 <= var9 || var10 < 0 || class285.field4328 <= var10) {
            return false;
        } else if (arg6 >= 0 && class69.field976 > arg6 && arg0 >= 0 && class285.field4328 > arg0) {
            int var11 = class422.method2633(class398.field5947.method953(-49), class309.field4655, arg6, arg5, arg0, arg8, class184.field2758[class398.field5947.field5826], arg4, var10, arg3, arg1, class4.field22, arg2, (byte) -112, var9);
            if (var11 < 1) {
                return false;
            }
            class114.field1692 = class309.field4655[var11 - 1];
            class523.field7652 = class4.field22[var11 - 1];
            class532.field7839 = false;
            class467.method2817(0);
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tr", name = "<init>", descriptor = "(II)V", line = 36)
    public class195(int arg0, int arg1) {
    }

    @OriginalMember(owner = "client!tr", name = "toString", descriptor = "()Ljava/lang/String;", line = 49)
    public final String toString() {
        field3270++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(I)V", line = 62)
    public static void method1363(int arg0) {
        if (arg0 != 25196) {
            field3271 = null;
        }
        field3271 = null;
        field3268 = null;
    }
}
