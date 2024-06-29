import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class52 extends class241 {

    @OriginalMember(owner = "client!nh", name = "n", descriptor = "I")
    public int field1108;

    @OriginalMember(owner = "client!nh", name = "s", descriptor = "I")
    public int field1113;

    @OriginalMember(owner = "client!nh", name = "r", descriptor = "I")
    public static int field1112 = 0;

    @OriginalMember(owner = "client!nh", name = "p", descriptor = "Z")
    public static boolean field1110 = false;

    @OriginalMember(owner = "client!nh", name = "t", descriptor = "Loh;")
    public static class263 field1114 = class253.method1681(-119, ")2");

    @OriginalMember(owner = "client!nh", name = "q", descriptor = "I")
    public static int field1111;

    @OriginalMember(owner = "client!nh", name = "o", descriptor = "[Lw;")
    public static class141[] field1109;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)V")
    public static void method332(byte arg0) {
        field1109 = null;
        field1114 = null;
        if (arg0 != 5) {
            field1110 = true;
        }
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(II)V")
    public class52(int arg0, int arg1) {
        this.field1108 = arg0;
        this.field1113 = arg1;
    }
}
