import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class339 {

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "I")
    public static int field4746 = 0;

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "I")
    public static int field4745 = 0;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "Lwia;")
    public static class791 field4744;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)V")
    public static void method2147(int arg0) {
        field4744 = null;
        if (arg0 != -5850) {
            method2147(48);
        }
    }
}
