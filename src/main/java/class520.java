import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public class class520 implements class283 {

    @OriginalMember(owner = "client!po", name = "e", descriptor = "Ljava/lang/String;")
    private String field7096;

    @OriginalMember(owner = "client!po", name = "d", descriptor = "Z")
    public static boolean field7095 = true;

    @OriginalMember(owner = "client!po", name = "a", descriptor = "I")
    public static int field7092;

    @OriginalMember(owner = "client!po", name = "b", descriptor = "I")
    public static int field7093;

    @OriginalMember(owner = "client!po", name = "f", descriptor = "I")
    public static int field7097;

    @OriginalMember(owner = "client!po", name = "g", descriptor = "I")
    public static int field7098;

    @OriginalMember(owner = "client!po", name = "c", descriptor = "Lclient;")
    public static client field7094;

    @OriginalMember(owner = "client!po", name = "h", descriptor = "Z")
    private boolean field7099;

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(I)I", line = 8)
    public final int method1266(int arg0) {
        field7092++;
        int var2 = 113 / ((-arg0 - 55) / 49);
        int var3 = class310.method1793((byte) -127, this.field7096);
        if (var3 >= 0 && var3 <= 100) {
            return var3;
        } else {
            this.field7099 = true;
            return 100;
        }
    }

    @OriginalMember(owner = "client!po", name = "b", descriptor = "(B)Z", line = 25)
    public final boolean method2845(byte arg0) {
        if (arg0 == 25) {
            field7097++;
            return this.field7099;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(B)Ltj;", line = 38)
    public final class31 method1265(byte arg0) {
        if (arg0 == -58) {
            field7098++;
            return class31.field442;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!po", name = "b", descriptor = "(I)V", line = 49)
    public static void method2846(int arg0) {
        if (arg0 != 20285) {
            method2846(-6);
        }
        field7094 = null;
    }

    @OriginalMember(owner = "client!po", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 64)
    public class520(String arg0) {
        this.field7096 = arg0;
    }
}
