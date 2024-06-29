import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class335 {

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "Z")
    public static boolean field4900 = false;

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "Lik;")
    public static class191 field4901 = new class191(128);

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(B)V", line = 12)
    public static void method2024(byte arg0) {
        field4901 = null;
        if (arg0 != 80) {
            method2024((byte) -109);
        }
    }
}
