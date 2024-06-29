import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hu")
public class class238 {

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "Ltn;")
    public static class749 field3237 = new class749(1);

    @OriginalMember(owner = "client!hu", name = "b", descriptor = "I")
    public static int field3238;

    @OriginalMember(owner = "client!hu", name = "c", descriptor = "I")
    public static int field3239;

    @OriginalMember(owner = "client!hu", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3239++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(IIILjava/lang/Class;)Lhd;")
    public static final class620 method1571(int arg0, int arg1, int arg2, Class arg3) {
        class766 var4 = class28.field252[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        }
        for (class569 var5 = var4.field10431; var5 != null; var5 = var5.field7189) {
            class620 var6 = var5.field7193;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field7852 == arg1 && var6.field7844 == arg2) {
                return var6;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(I)V")
    public static void method1572(int arg0) {
        field3237 = null;
        if (arg0 != 1) {
            method1571(37, -127, -58, null);
        }
    }
}
