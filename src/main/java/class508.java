import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class508 {

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "Z")
    public static boolean field6667 = false;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "Lgaa;")
    public static class432 field6666 = new class432();

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)V", line = 17)
    public static void method2741(int arg0) {
        field6666 = null;
        int var1 = 75 % ((arg0 - 35) / 58);
    }
}
