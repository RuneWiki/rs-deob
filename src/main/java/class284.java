import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class284 {

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "Lko;")
    private static class348 field4129 = new class348();

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V", line = 6)
    public static final void method1786(int arg0) {
        if (arg0 != 14844) {
            field4129 = null;
        }
        while (true) {
            class70 var1 = (class70) field4129.method2254(arg0 ^ 0xFFFFC604);
            if (var1 == null) {
                return;
            }
            var1.field1198.method75();
            var1.method2663(-122);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(ILga;)V", line = 26)
    public static final synchronized void method1787(int arg0, class276 arg1) {
        if (arg0 == -24204) {
            class70 var2 = new class70();
            var2.field1198 = arg1;
            field4129.method2270(arg0 + 24204, var2);
        }
    }
}
