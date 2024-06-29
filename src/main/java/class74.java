import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class74 extends class273 {

    @OriginalMember(owner = "client!je", name = "p", descriptor = "Lwm;")
    public class152 field1074;

    @OriginalMember(owner = "client!je", name = "o", descriptor = "S")
    public static short field1073 = 32767;

    @OriginalMember(owner = "client!je", name = "m", descriptor = "Lwm;")
    public static class152 field1071 = class157.method1048(" (X", 114);

    @OriginalMember(owner = "client!je", name = "n", descriptor = "I")
    public static int field1072;

    @OriginalMember(owner = "client!je", name = "q", descriptor = "I")
    public static int field1075;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Z)V", line = 18)
    public static void method501(boolean arg0) {
        if (arg0) {
            field1071 = null;
        }
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "()V", line = 37)
    public class74() {
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ILah;Lah;)V", line = 41)
    public static final void method502(int arg0, class205 arg1, class205 arg2) {
        class69.field1007 = arg1;
        field1072++;
        if (arg0 <= 50) {
            field1071 = (class152) null;
        }
        class155.field2472 = arg2;
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "(Lwm;)V", line = 52)
    public class74(class152 arg0) {
        this.field1074 = arg0;
    }
}
