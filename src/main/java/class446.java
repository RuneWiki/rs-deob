import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public class class446 {

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "I")
    public static int field6127;

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "I")
    public static int field6128;

    @OriginalMember(owner = "client!nn", name = "c", descriptor = "Lil;")
    public static class598 field6129;

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(I)V")
    public static final void method2560(int arg0) {
        field6127++;
        if (arg0 < -117) {
            class560 var1 = class372.field5329;
            synchronized (class372.field5329) {
                class372.field5329.method3142(false);
            }
        }
    }

    @OriginalMember(owner = "client!nn", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field6128++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!nn", name = "<init>", descriptor = "(II)V")
    public class446(int arg0, int arg1) {
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(B)V")
    public static void method2561(byte arg0) {
        field6129 = null;
        if (arg0 <= 25) {
            method2560(4);
        }
    }
}
