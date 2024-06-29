import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public abstract class class101 {

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "I")
    public static int field1580 = -1;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "Ljava/lang/String;")
    public static String field1578 = "purple:";

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "Z")
    public static boolean field1582 = false;

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "I")
    public static int field1579;

    @OriginalMember(owner = "client!uk", name = "f", descriptor = "I")
    public static int field1583;

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "Lcc;")
    public static class222 field1581;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "([BI)V")
    public abstract void method767(byte[] arg0, int arg1);

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static final String method775(int arg0, int arg1) {
        field1583++;
        if (arg0 != 1000000) {
            field1581 = null;
        }
        if (arg1 < 100000) {
            return "<col=ffff00>" + arg1 + "</col>";
        } else if (arg1 < 10000000) {
            return "<col=ffffff>" + arg1 / 1000 + class105.field1642 + "</col>";
        } else {
            return "<col=00ff80>" + arg1 / 1000000 + class294.field4564 + "</col>";
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)[B")
    public abstract byte[] method768(int arg0);

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(I)V")
    public static void method776(int arg0) {
        if (arg0 != -5508) {
            method776(-118);
        }
        field1578 = null;
        field1581 = null;
    }
}
