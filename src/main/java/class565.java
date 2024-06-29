import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class565 extends class472 {

    @OriginalMember(owner = "client!pe", name = "A", descriptor = "Ljava/lang/Object;")
    private Object field7970;

    @OriginalMember(owner = "client!pe", name = "D", descriptor = "Ljava/lang/String;")
    public static String field7973 = "";

    @OriginalMember(owner = "client!pe", name = "y", descriptor = "I")
    public static int field7968 = class608.method3411((byte) -127, 1600);

    @OriginalMember(owner = "client!pe", name = "z", descriptor = "I")
    public static int field7969;

    @OriginalMember(owner = "client!pe", name = "B", descriptor = "I")
    public static int field7971;

    @OriginalMember(owner = "client!pe", name = "C", descriptor = "I")
    public static int field7972;

    @OriginalMember(owner = "client!pe", name = "x", descriptor = "Lclient;")
    public static client field7967;

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "(B)V", line = 6)
    public static void method3223(byte arg0) {
        field7967 = null;
        if (arg0 < 104) {
            field7971 = 12;
        }
        field7973 = null;
    }

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "(B)Z", line = 23)
    public final boolean method2776(byte arg0) {
        field7972++;
        if (arg0 != -76) {
            field7967 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)Ljava/lang/Object;", line = 34)
    public final Object method2777(int arg0) {
        if (arg0 == 14) {
            field7969++;
            return this.field7970;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(Lqt;Ljava/lang/Object;I)V", line = 50)
    public class565(class589 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field7970 = arg1;
    }
}
