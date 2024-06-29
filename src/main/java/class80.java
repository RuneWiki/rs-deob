import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class80 extends class154 {

    @OriginalMember(owner = "client!oi", name = "j", descriptor = "[B")
    public byte[] field1116;

    @OriginalMember(owner = "client!oi", name = "i", descriptor = "Lpja;")
    public static class43 field1115 = new class43(3000000, 200);

    @OriginalMember(owner = "client!oi", name = "k", descriptor = "I")
    public static int field1117;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(B)V")
    public static void method667(byte arg0) {
        field1115 = null;
        if (arg0 <= 34) {
            field1115 = null;
        }
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "([B)V")
    public class80(byte[] arg0) {
        this.field1116 = arg0;
    }
}
