import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class291 extends class307 {

    @OriginalMember(owner = "client!fb", name = "C", descriptor = "Ljava/lang/Object;")
    private Object field3889;

    @OriginalMember(owner = "client!fb", name = "D", descriptor = "I")
    public static int field3890 = 0;

    @OriginalMember(owner = "client!fb", name = "E", descriptor = "Z")
    public static boolean field3891 = false;

    @OriginalMember(owner = "client!fb", name = "F", descriptor = "[Ljava/lang/String;")
    public static String[] field3892 = new String[100];

    @OriginalMember(owner = "client!fb", name = "I", descriptor = "Lej;")
    public static class229 field3895 = new class229("", 10);

    @OriginalMember(owner = "client!fb", name = "G", descriptor = "I")
    public static int field3893;

    @OriginalMember(owner = "client!fb", name = "H", descriptor = "I")
    public static int field3894;

    @OriginalMember(owner = "client!fb", name = "J", descriptor = "I")
    public static int field3896;

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "(I)Z", line = 13)
    public final boolean method435(int arg0) {
        field3896++;
        if (arg0 != -23828) {
            field3891 = false;
        }
        return false;
    }

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "(I)V", line = 34)
    public static final void method1726(int arg0) {
        field3893++;
        if (class241.field3154 != null) {
            if (class241.field3154.field3773 == 1) {
                class241.field3154 = null;
                return;
            }
            if (class241.field3154.field3773 == 2) {
                class139.method961(class159.field2006, 126, 2, class677.field9607);
                class241.field3154 = null;
                return;
            }
        }
        if (arg0 > -95) {
            field3890 = -97;
        }
    }

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "(B)V", line = 62)
    public static void method1727(byte arg0) {
        field3895 = null;
        if (arg0 == 68) {
            field3892 = null;
        }
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Ljava/lang/Object;I)V", line = 74)
    public class291(Object arg0, int arg1) {
        super(arg1);
        this.field3889 = arg0;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)Ljava/lang/Object;", line = 82)
    public final Object method434(int arg0) {
        field3894++;
        if (arg0 >= -26) {
            this.method434(-105);
        }
        return this.field3889;
    }
}
