import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class559 {

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "Z")
    public static boolean field7927 = false;

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "S")
    public static short field7928 = 32767;

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "Loh;")
    public static class549 field7930 = null;

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "I")
    public static int field7929;

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "I")
    public static int field7931;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)V", line = 10)
    public static void method3145(int arg0) {
        if (arg0 == 0) {
            field7930 = null;
        }
    }
}
