import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public class class129 {

    @OriginalMember(owner = "client!pq", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field1867 = new String[100];

    @OriginalMember(owner = "client!pq", name = "d", descriptor = "Lpn;")
    public static class523 field1866 = new class523("", 15);

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "I")
    public static int field1863;

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "I")
    public static int field1864;

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "Lfs;")
    public static class387 field1865;

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(III)B", line = 10)
    public static final byte method995(int arg0, int arg1, int arg2) {
        field1864++;
        if (arg0 == 9) {
            return (byte) (~(arg2 & 0x1) == arg1 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "(III)Z", line = 27)
    public static final boolean method996(int arg0, int arg1, int arg2) {
        if (arg2 != 15) {
            field1865 = null;
        }
        field1863++;
        return (arg1 & 0x60000) != 0 | class150.method1083(arg1, (byte) -53, arg0) || class66.method645(-20147, arg0, arg1) || class473.method2863(arg1, arg0, 0);
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(B)V", line = 41)
    public static void method997(byte arg0) {
        field1867 = null;
        field1866 = null;
        if (arg0 != 116) {
            method996(-30, 44, 97);
        }
        field1865 = null;
    }
}
