import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public class class376 {

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field4946 = new String[100];

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "Z")
    public static boolean field4947 = false;

    @OriginalMember(owner = "client!ur", name = "c", descriptor = "I")
    public int field4948;

    @OriginalMember(owner = "client!ur", name = "e", descriptor = "I")
    public static int field4950;

    @OriginalMember(owner = "client!ur", name = "f", descriptor = "I")
    public static int field4951;

    @OriginalMember(owner = "client!ur", name = "h", descriptor = "Lvn;")
    public class205 field4953;

    @OriginalMember(owner = "client!ur", name = "g", descriptor = "Lur;")
    public class376 field4952;

    @OriginalMember(owner = "client!ur", name = "d", descriptor = "Leg;")
    public static class70 field4949;

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(I)V", line = 13)
    public final void method2137(int arg0) {
        field4950++;
        if (class157.field1993 >= 500) {
            return;
        }
        this.field4948 = 0;
        this.field4952 = class201.field2619;
        this.field4953 = null;
        if (arg0 <= -52) {
            class201.field2619 = this;
            class157.field1993++;
        }
    }

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(I)V", line = 36)
    public static void method2138(int arg0) {
        field4946 = null;
        int var1 = -34 / ((arg0 + 21) / 42);
        field4949 = null;
    }
}
