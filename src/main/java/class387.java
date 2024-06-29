import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class387 {

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "Z")
    public static boolean field6009 = false;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "I")
    public static int field6007;

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "I")
    public static int field6008;

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "I")
    public static int field6010;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)V")
    public static final void method2518(int arg0) {
        if (arg0 != -12938) {
            method2519(-110, (char) 65432);
        }
        class20.method359(arg0 + 12938);
        field6010++;
        class636.method3698(true);
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IC)Z")
    public static final boolean method2519(int arg0, char arg1) {
        if (arg0 != -91) {
            method2518(14);
        }
        field6007++;
        return arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Z)V")
    public static final void method2520(boolean arg0) {
        if (class682.field9564 == 9) {
            class68.method715(5, (byte) -121);
        } else if (class682.field9564 == 5 || class682.field9564 == 6) {
            class68.method715(3, (byte) -75);
        } else if (class682.field9564 == 12) {
            class68.method715(3, (byte) -70);
        }
        field6008++;
        if (!arg0) {
            method2518(-18);
        }
    }
}
