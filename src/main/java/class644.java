import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class644 {

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "S")
    public static short field9097 = 205;

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "I")
    public static int field9098 = -1;

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "Lsea;")
    public static class319 field9099 = new class319();

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(B)V")
    public static void method3611(byte arg0) {
        if (arg0 > -13) {
            field9098 = 59;
        }
        field9099 = null;
    }
}
