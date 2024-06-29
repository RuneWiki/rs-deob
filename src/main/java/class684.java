import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public class class684 {

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "Lcga;")
    public static class449 field9353 = new class449(34, 3);

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "Z")
    public static boolean field9354 = false;

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(B)V", line = 6)
    public static void method3780(byte arg0) {
        if (arg0 != 125) {
            method3780((byte) 52);
        }
        field9353 = null;
    }
}
