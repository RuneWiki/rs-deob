import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class336 {

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "Ljava/util/Hashtable;")
    public static Hashtable field4959 = new Hashtable();

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "Lrw;")
    public static class703 field4962 = new class703(4, 1);

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "I")
    public static int field4960;

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "Lpu;")
    public static class522 field4964;

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "Lha;")
    public class54 field4963;

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "Lda;")
    public class55 field4961;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIIIIIB)V")
    public static final void method2115(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        if (arg7 > -35) {
            field4959 = null;
        }
        if (arg2 >= class15.field153 && arg6 <= class248.field3859 && class520.field7329 <= arg0 && class239.field3747 >= arg4) {
            class666.method3683(arg3, 98, arg0, arg6, arg1, arg5, arg4, arg2);
        } else {
            class147.method1054(false, arg6, arg2, arg5, arg0, arg1, arg4, arg3);
        }
        field4960++;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(B)V")
    public static void method2116(byte arg0) {
        field4964 = null;
        field4962 = null;
        field4959 = null;
        if (arg0 <= 106) {
            method2115(25, 45, -14, -32, 99, 112, -81, (byte) -25);
        }
    }
}
