import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pba")
public class class350 {

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "Z")
    public static boolean field5102 = false;

    @OriginalMember(owner = "client!pba", name = "d", descriptor = "I")
    public static int field5105 = -1;

    @OriginalMember(owner = "client!pba", name = "c", descriptor = "I")
    public static int field5104;

    @OriginalMember(owner = "client!pba", name = "e", descriptor = "I")
    public static int field5106;

    @OriginalMember(owner = "client!pba", name = "b", descriptor = "Ldt;")
    public static class254 field5103;

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(BLg;)I")
    public static final int method2238(byte arg0, class166 arg1) {
        if (arg0 != 79) {
            method2239((byte) 86);
        }
        field5106++;
        if (class442.field6353 == arg1) {
            return 6407;
        } else if (class109.field1521 == arg1) {
            return 6408;
        } else if (class325.field4613 == arg1) {
            return 6406;
        } else if (class172.field2282 == arg1) {
            return 6409;
        } else if (class564.field7728 == arg1) {
            return 6410;
        } else if (class638.field8600 == arg1) {
            return 6145;
        } else {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(B)V")
    public static void method2239(byte arg0) {
        if (arg0 != -71) {
            field5103 = null;
        }
        field5103 = null;
    }
}
