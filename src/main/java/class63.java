import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class63 {

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "I")
    public static int field999 = 0;

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "Z")
    public static boolean field1000 = true;

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "Liba;")
    public static class211 field1001 = new class211(82, 7);

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "I")
    public static int field1002;

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "I")
    public static int field1003;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V", line = 13)
    public static void method389(int arg0) {
        field1001 = null;
        if (arg0 != -8474) {
            method389(-99);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIZBI)V", line = 33)
    public static final void method390(int arg0, int arg1, boolean arg2, byte arg3, int arg4) {
        if (class62.field996 == 0) {
            class61.method379((byte) -101, false);
        } else {
            class340.field5001 = class62.field996;
            class409.method2509(512, 0);
        }
        field1002++;
        class186.field2525 = arg0;
        class250.field3279 = arg2;
        if (arg3 != 11) {
            field1000 = true;
        }
        class457.field6604 = arg4;
        class55.method347(arg1);
    }
}
