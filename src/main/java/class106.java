import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class106 extends class147 {

    @OriginalMember(owner = "client!ee", name = "K", descriptor = "[B")
    public byte[] field1529;

    @OriginalMember(owner = "client!ee", name = "I", descriptor = "Lqj;")
    private static class196 field1527 = class80.method502(" has logged out)3", -48);

    @OriginalMember(owner = "client!ee", name = "H", descriptor = "Lqj;")
    public static class196 field1526 = field1527;

    @OriginalMember(owner = "client!ee", name = "E", descriptor = "I")
    public static int field1523;

    @OriginalMember(owner = "client!ee", name = "F", descriptor = "I")
    public static int field1524;

    @OriginalMember(owner = "client!ee", name = "G", descriptor = "I")
    public static int field1525;

    @OriginalMember(owner = "client!ee", name = "J", descriptor = "I")
    public static int field1528;

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "([B)V")
    public class106(byte[] arg0) {
        this.field1529 = arg0;
    }

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "(B)V")
    public static void method642(byte arg0) {
        field1527 = null;
        int var1 = -33 / ((-arg0 - 16) / 48);
        field1526 = null;
    }
}
