import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class256 {

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "Lpr;")
    public static class407 field3278 = new class407(17, 2);

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "I")
    public static int field3280;

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "[Lwd;")
    public static class247[] field3279;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(I)V")
    public static void method1465(int arg0) {
        if (arg0 < 38) {
            field3278 = null;
        }
        field3278 = null;
        field3279 = null;
    }
}
