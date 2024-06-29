import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class501 {

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "Ljk;")
    public static class585 field7001 = new class585(79, 1);

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "[I")
    public static int[] field7002 = new int[1];

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "[Lio;")
    public static class404[] field7005 = new class404[0];

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "I")
    public static int field7000;

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "I")
    public static int field7004;

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "Ljn;")
    public static class668 field7003;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "[I")
    public static int[] field6999;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)V", line = 3)
    public static void method2911(byte arg0) {
        if (arg0 != 2) {
            field7003 = null;
        }
        field6999 = null;
        field7005 = null;
        field7003 = null;
        field7001 = null;
        field7002 = null;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(II)Z", line = 24)
    public static final boolean method2912(int arg0, int arg1) {
        field7004++;
        if (arg0 == -4) {
            return arg1 == 3 || arg1 == 4 || arg1 == 5 || arg1 == 6;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)Z", line = 40)
    public static final boolean method2913(int arg0) {
        if (arg0 <= 19) {
            return false;
        } else {
            field7000++;
            return class505.field7053 == 0 ? class601.field8666.method2098(16) : true;
        }
    }
}
