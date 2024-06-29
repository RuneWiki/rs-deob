import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class477 {

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "I")
    public static int field6043;

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "I")
    public static int field6044;

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "I")
    public static int field6046;

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "[Laga;")
    public static class661[] field6045;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(ILjava/lang/String;I)V")
    public static final void method2519(int arg0, String arg1, int arg2) {
        field6044++;
        class592 var3 = class61.method371(arg0, arg2, (byte) 91);
        var3.method3256((byte) 11);
        var3.field8316 = arg1;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)V")
    public static void method2520(int arg0) {
        if (arg0 >= 78) {
            field6045 = null;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(B)V")
    public static final void method2521(byte arg0) {
        class463.field5904 = 0;
        if (arg0 == 91) {
            field6043++;
            class1.field7.method247(2);
            class1.field7.method239(class596.field8390, (byte) 93);
            class463.field5904++;
        }
    }
}
