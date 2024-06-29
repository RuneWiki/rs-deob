import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class340 extends class14 {

    @OriginalMember(owner = "client!ga", name = "o", descriptor = "[S")
    public static short[] field4390 = new short[256];

    @OriginalMember(owner = "client!ga", name = "n", descriptor = "I")
    public static int field4389;

    @OriginalMember(owner = "client!ga", name = "p", descriptor = "I")
    public static int field4391;

    @OriginalMember(owner = "client!ga", name = "m", descriptor = "Lia;")
    public static class504 field4388;

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "(I)V", line = 3)
    public static void method1902(int arg0) {
        field4390 = null;
        field4388 = null;
        int var1 = -103 / ((arg0 + 76) / 42);
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(II)Z", line = 17)
    public static final boolean method1903(int arg0, int arg1) {
        if (arg1 != 2) {
            method1903(-46, 20);
        }
        field4391++;
        return arg0 == 0 || arg0 == 1 || arg0 == 2;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IZ)Lwf;", line = 28)
    public static final class115 method1904(int arg0, boolean arg1) {
        field4389++;
        if (arg1) {
            return null;
        } else if (arg0 >= 0 && arg0 < 100) {
            return class5.field45[arg0];
        } else {
            return null;
        }
    }
}
