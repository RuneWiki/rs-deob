import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public class class180 {

    @OriginalMember(owner = "client!no", name = "d", descriptor = "I")
    public static int field2881 = -1;

    @OriginalMember(owner = "client!no", name = "a", descriptor = "Ljl;")
    public static class332 field2878 = new class332(64);

    @OriginalMember(owner = "client!no", name = "b", descriptor = "F")
    public static float field2879;

    @OriginalMember(owner = "client!no", name = "c", descriptor = "I")
    public static int field2880;

    @OriginalMember(owner = "client!no", name = "e", descriptor = "I")
    public static int field2882;

    @OriginalMember(owner = "client!no", name = "f", descriptor = "I")
    public static int field2883;

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(I)V", line = 16)
    public static void method1412(int arg0) {
        if (arg0 == 922028784) {
            field2878 = null;
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(BLwf;)Lwf;", line = 42)
    public static final class250 method1413(byte arg0, class250 arg1) {
        field2882++;
        if (arg1.field4086 != -1) {
            return class13.method74(-61, arg1.field4086);
        }
        if (arg0 >= -18) {
            field2881 = 9;
        }
        int var2 = arg1.field4167 >>> 16;
        class127 var3 = new class127(class226.field3723);
        for (class259 var4 = (class259) var3.method982(105); var4 != null; var4 = (class259) var3.method985(28980)) {
            if (var4.field4358 == var2) {
                return class13.method74(-125, (int) var4.field698);
            }
        }
        return null;
    }
}
