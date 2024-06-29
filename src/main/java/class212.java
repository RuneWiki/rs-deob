import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!su")
public class class212 extends class251 {

    @OriginalMember(owner = "client!su", name = "h", descriptor = "[Ldia;")
    public class235[] field2544;

    @OriginalMember(owner = "client!su", name = "c", descriptor = "[I")
    public static int[] field2539 = new int[14];

    @OriginalMember(owner = "client!su", name = "f", descriptor = "[I")
    public static int[] field2542 = new int[25];

    @OriginalMember(owner = "client!su", name = "d", descriptor = "I")
    public static int field2540;

    @OriginalMember(owner = "client!su", name = "g", descriptor = "I")
    public static int field2543;

    @OriginalMember(owner = "client!su", name = "e", descriptor = "Ljava/lang/String;")
    public static String field2541;

    @OriginalMember(owner = "client!su", name = "b", descriptor = "(I)V", line = 4)
    public static void method1180(int arg0) {
        if (arg0 != 0) {
            method1181(116, null);
        }
        field2541 = null;
        field2539 = null;
        field2542 = null;
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(ILjava/lang/String;)Z", line = 20)
    public static final boolean method1181(int arg0, String arg1) {
        field2543++;
        if (arg1 == null) {
            return false;
        }
        for (int var2 = arg0; var2 < class233.field3026; var2++) {
            if (arg1.equalsIgnoreCase(class512.field6935[var2])) {
                return true;
            }
        }
        return arg1.equalsIgnoreCase(class653.field9086.field1148);
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(B)Luca;", line = 47)
    public static final class513 method1182(byte arg0) {
        field2540++;
        if (class642.field8937 == null || class551.field7805 == null) {
            return null;
        }
        class551.field7805.method1074((byte) 26, class642.field8937);
        class513 var1 = (class513) class551.field7805.method1073((byte) -116);
        if (var1 == null) {
            return null;
        }
        class292 var2 = class642.field8929.method1647(-88, var1.field6940);
        if (arg0 >= -68) {
            method1182((byte) -25);
        }
        return var2 != null && var2.field3875 && var2.method1736(124, class642.field8932) ? var1 : class176.method1006(-76);
    }

    @OriginalMember(owner = "client!su", name = "<init>", descriptor = "([Ldia;)V", line = 75)
    public class212(class235[] arg0) {
        this.field2544 = arg0;
    }
}
