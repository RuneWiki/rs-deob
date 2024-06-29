import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class198 {

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "I")
    public static int field3472 = 0;

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "I")
    public static int field3473;

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "I")
    public static int field3475;

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "Ldg;")
    public static class139 field3474;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(B)V")
    public static void method1374(byte arg0) {
        field3474 = null;
        int var1 = 3 / ((34 - arg0) / 58);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IBI)V")
    public static final void method1375(int arg0, byte arg1, int arg2) {
        class90 var3 = class221.method1575(1, arg2, 1651481952);
        var3.method648((byte) -30);
        if (arg1 >= -109) {
            field3473 = 55;
        }
        field3475++;
        var3.field1621 = arg0;
    }
}
