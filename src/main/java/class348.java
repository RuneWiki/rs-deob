import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class348 extends class179 {

    @OriginalMember(owner = "client!um", name = "l", descriptor = "I")
    public int field5135;

    @OriginalMember(owner = "client!um", name = "m", descriptor = "I")
    public int field5136;

    @OriginalMember(owner = "client!um", name = "j", descriptor = "I")
    public static int field5133 = -1;

    @OriginalMember(owner = "client!um", name = "k", descriptor = "I")
    public static int field5134;

    @OriginalMember(owner = "client!um", name = "o", descriptor = "Loe;")
    public static class127 field5138;

    @OriginalMember(owner = "client!um", name = "n", descriptor = "Llt;")
    public static class458 field5137;

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(Z)V")
    public static void method2121(boolean arg0) {
        if (!arg0) {
            method2121(false);
        }
        field5137 = null;
        field5138 = null;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(B)V")
    public static final void method2122(byte arg0) {
        if (arg0 <= 124) {
            method2121(true);
        }
        field5134++;
        class207.field3246.method1761(-110);
    }

    @OriginalMember(owner = "client!um", name = "<init>", descriptor = "(II)V")
    public class348(int arg0, int arg1) {
        this.field5135 = arg0;
        this.field5136 = arg1;
    }
}
