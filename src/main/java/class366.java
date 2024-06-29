import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ow")
public class class366 {

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "I")
    public static int field5096 = 1;

    @OriginalMember(owner = "client!ow", name = "c", descriptor = "Lbu;")
    public static class21 field5098 = new class21(1, 4);

    @OriginalMember(owner = "client!ow", name = "b", descriptor = "I")
    public static int field5097;

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(B)V")
    public static void method2294(byte arg0) {
        field5098 = null;
        if (arg0 != -33) {
            method2294((byte) 14);
        }
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;)V")
    public static final void method2295(int arg0, String arg1, int arg2, String arg3) {
        if (arg0 <= 45) {
            field5098 = null;
        }
        field5097++;
        class104.field1206 = 2;
        class55.field709 = arg2;
        class642.method3660(11084, false, false, arg3, arg1);
    }
}
