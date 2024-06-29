import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class731 extends class219 {

    @OriginalMember(owner = "client!fm", name = "f", descriptor = "Lej;")
    public static class124 field9883 = new class124(69, -1);

    @OriginalMember(owner = "client!fm", name = "g", descriptor = "I")
    public static int field9884;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(I)V", line = 3)
    public static void method4042(int arg0) {
        if (arg0 < -121) {
            field9883 = null;
        }
    }
}
