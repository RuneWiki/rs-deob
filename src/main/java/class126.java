import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public class class126 {

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "[I")
    public static int[] field1614 = new int[14];

    @OriginalMember(owner = "client!tp", name = "c", descriptor = "I")
    public static int field1615;

    @OriginalMember(owner = "client!tp", name = "d", descriptor = "I")
    public static int field1616;

    @OriginalMember(owner = "client!tp", name = "e", descriptor = "I")
    public static int field1617;

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "Lps;")
    public static class306 field1613;

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(Lfc;B)Z")
    public static final boolean method744(class228 arg0, byte arg1) {
        field1616++;
        if (arg0 == null) {
            return false;
        } else if (!arg0.field3452) {
            return false;
        } else if (!arg0.method1387(69)) {
            return false;
        } else if (arg1 <= 83) {
            return true;
        } else if (class160.field2208.method2302((long) arg0.field3447, 23576) == null) {
            return class387.field5720.method2302((long) arg0.field3487, 23576) == null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(I)V")
    public static void method745(int arg0) {
        field1613 = null;
        field1614 = null;
        if (arg0 != -12032) {
            method744((class228) null, (byte) 38);
        }
    }
}
