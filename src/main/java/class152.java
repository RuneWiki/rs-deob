import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ada")
public class class152 {

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "Lmga;")
    public static class666 field2404 = new class666(8);

    @OriginalMember(owner = "client!ada", name = "b", descriptor = "Lct;")
    public static class134 field2405;

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(I)V", line = 7)
    public static void method1074(int arg0) {
        if (arg0 == 8) {
            field2404 = null;
            field2405 = null;
        }
    }
}
