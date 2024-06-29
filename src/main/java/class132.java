import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class132 extends class337 {

    @OriginalMember(owner = "client!pk", name = "o", descriptor = "I")
    public int field2034;

    @OriginalMember(owner = "client!pk", name = "q", descriptor = "I")
    public int field2036;

    @OriginalMember(owner = "client!pk", name = "r", descriptor = "Z")
    public static boolean field2037 = false;

    @OriginalMember(owner = "client!pk", name = "p", descriptor = "Lic;")
    public static class491 field2035;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(B)V")
    public static void method885(byte arg0) {
        field2035 = null;
        if (arg0 != 120) {
            method885((byte) 54);
        }
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(II)V")
    public class132(int arg0, int arg1) {
        this.field2034 = arg1;
        this.field2036 = arg0;
    }
}
