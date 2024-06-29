import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gba")
public class class694 {

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "Lmw;")
    public static class517 field9227 = new class517(50, -1);

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(I)V")
    public static void method3782(int arg0) {
        field9227 = null;
        if (arg0 != 10810) {
            method3782(70);
        }
    }
}
