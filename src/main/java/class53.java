import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class53 {

    @OriginalMember(owner = "client!kb", name = "n", descriptor = "Lcc;")
    public static class209 field1047 = class95.method669(119, "gleiten:");

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "Lcc;")
    public static class209 field1041 = class95.method669(123, "details");

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "Lcc;")
    private static class209 field1040 = class95.method669(87, "Please wait)3)3)3");

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "Z")
    public static boolean field1034 = false;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "Lcc;")
    public static class209 field1035 = field1040;

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "I")
    public int field1036;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "I")
    public int field1037;

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "I")
    public int field1038;

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "I")
    public static int field1039;

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "I")
    public int field1042;

    @OriginalMember(owner = "client!kb", name = "j", descriptor = "I")
    public int field1043;

    @OriginalMember(owner = "client!kb", name = "k", descriptor = "I")
    public int field1044;

    @OriginalMember(owner = "client!kb", name = "l", descriptor = "I")
    public static int field1045;

    @OriginalMember(owner = "client!kb", name = "m", descriptor = "I")
    public int field1046;

    @OriginalMember(owner = "client!kb", name = "o", descriptor = "I")
    public int field1048;

    @OriginalMember(owner = "client!kb", name = "p", descriptor = "I")
    public int field1049;

    @OriginalMember(owner = "client!kb", name = "q", descriptor = "I")
    public int field1050;

    @OriginalMember(owner = "client!kb", name = "r", descriptor = "I")
    public int field1051;

    @OriginalMember(owner = "client!kb", name = "s", descriptor = "I")
    public int field1052;

    @OriginalMember(owner = "client!kb", name = "t", descriptor = "I")
    public int field1053;

    @OriginalMember(owner = "client!kb", name = "u", descriptor = "I")
    public int field1054;

    @OriginalMember(owner = "client!kb", name = "v", descriptor = "I")
    public int field1055;

    @OriginalMember(owner = "client!kb", name = "x", descriptor = "I")
    public int field1057;

    @OriginalMember(owner = "client!kb", name = "y", descriptor = "I")
    public int field1058;

    @OriginalMember(owner = "client!kb", name = "z", descriptor = "I")
    public int field1059;

    @OriginalMember(owner = "client!kb", name = "A", descriptor = "I")
    public static int field1060;

    @OriginalMember(owner = "client!kb", name = "w", descriptor = "Lsj;")
    public static class49 field1056;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lcc;I)I")
    public static final int method398(class209 arg0, int arg1) {
        field1060++;
        if (arg0 == null) {
            return -1;
        } else if (arg1 == 30014) {
            for (int var2 = 0; var2 < class3.field38; var2++) {
                if (arg0.method1483(class286.field5049[var2], (byte) -80)) {
                    return var2;
                }
            }
            return -1;
        } else {
            return 20;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V")
    public static void method399(byte arg0) {
        field1056 = null;
        field1035 = null;
        if (arg0 == 76) {
            field1047 = null;
            field1040 = null;
            field1041 = null;
        }
    }
}
