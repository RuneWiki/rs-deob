import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dda")
public class class402 {

    @OriginalMember(owner = "client!dda", name = "b", descriptor = "Luh;")
    public static class176 field5507 = new class176(2, 4, 4, 0);

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "I")
    public static int field5506;

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(I)I", line = 12)
    public static final int method2474(int arg0) {
        if (arg0 == 2) {
            field5506++;
            return class165.method1232(false, 64);
        } else {
            return -49;
        }
    }

    @OriginalMember(owner = "client!dda", name = "b", descriptor = "(I)V", line = 23)
    public static void method2475(int arg0) {
        if (arg0 >= 49) {
            field5507 = null;
        }
    }
}
