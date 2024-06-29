import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class64 extends class321 {

    @OriginalMember(owner = "client!dl", name = "w", descriptor = "[B")
    public byte[] field1007;

    @OriginalMember(owner = "client!dl", name = "u", descriptor = "I")
    public static int field1005 = -1;

    @OriginalMember(owner = "client!dl", name = "v", descriptor = "[I")
    public static int[] field1006 = new int[6];

    @OriginalMember(owner = "client!dl", name = "t", descriptor = "Lcq;")
    public static class273 field1004 = new class273(8, 0, 4, 1);

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(B)V", line = 5)
    public static void method391(byte arg0) {
        field1004 = null;
        if (arg0 < -27) {
            field1006 = null;
        }
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "([B)V", line = 28)
    public class64(byte[] arg0) {
        this.field1007 = arg0;
    }
}
