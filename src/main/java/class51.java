import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class51 {

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "Loq;")
    public static class242 field580 = new class242("", 17);

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "I")
    public static int field581;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)V", line = 3)
    public static void method302(int arg0) {
        field580 = null;
        if (arg0 != 17) {
            field580 = null;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(II)V", line = 14)
    public static final void method303(int arg0, int arg1) {
        field581++;
        class184 var2 = class277.method1682(arg0, 14, -57);
        if (arg1 != -14342) {
            method303(-77, -12);
        }
        var2.method1075((byte) -40);
    }
}
