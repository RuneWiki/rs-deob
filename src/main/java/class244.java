import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class244 extends class35 {

    @OriginalMember(owner = "client!a", name = "m", descriptor = "[B")
    public byte[] field3496;

    @OriginalMember(owner = "client!a", name = "l", descriptor = "Lsh;")
    public static class472 field3495 = new class472(105, 6);

    @OriginalMember(owner = "client!a", name = "n", descriptor = "Lsh;")
    public static class472 field3497 = new class472(21, 5);

    @OriginalMember(owner = "client!a", name = "o", descriptor = "I")
    public static int field3498;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "(I)V")
    public static void method1556(int arg0) {
        if (arg0 != 21) {
            method1556(-124);
        }
        field3495 = null;
        field3497 = null;
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "([B)V")
    public class244(byte[] arg0) {
        this.field3496 = arg0;
    }
}
