import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!av")
public class class450 {

    @OriginalMember(owner = "client!av", name = "c", descriptor = "I")
    public static int field6127 = -1;

    @OriginalMember(owner = "client!av", name = "b", descriptor = "Lcu;")
    public static class145 field6126 = new class145(41, -1);

    @OriginalMember(owner = "client!av", name = "a", descriptor = "I")
    public static int field6125;

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(I)V", line = 11)
    public static void method2575(int arg0) {
        if (arg0 == 24588) {
            field6126 = null;
        }
    }
}
