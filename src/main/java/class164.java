import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!at")
public class class164 {

    @OriginalMember(owner = "client!at", name = "c", descriptor = "Z")
    public static boolean field2512 = false;

    @OriginalMember(owner = "client!at", name = "g", descriptor = "Lin;")
    public static class380 field2516 = new class380(30, -2);

    @OriginalMember(owner = "client!at", name = "b", descriptor = "Lce;")
    public static class590 field2511;

    @OriginalMember(owner = "client!at", name = "e", descriptor = "[B")
    public byte[] field2514;

    @OriginalMember(owner = "client!at", name = "a", descriptor = "[S")
    public short[] field2510;

    @OriginalMember(owner = "client!at", name = "d", descriptor = "[S")
    public short[] field2513;

    @OriginalMember(owner = "client!at", name = "f", descriptor = "[S")
    public short[] field2515;

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(I)V")
    public static void method1236(int arg0) {
        field2516 = null;
        field2511 = null;
        if (arg0 != 30) {
            method1236(17);
        }
    }
}
