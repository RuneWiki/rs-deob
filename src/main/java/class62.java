import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class62 extends class37 {

    @OriginalMember(owner = "client!ga", name = "Q", descriptor = "I")
    public static int field1507 = -1;

    @OriginalMember(owner = "client!ga", name = "S", descriptor = "Ldd;")
    public static class35 field1509 = class180.method1196((byte) 127, "<)4col>");

    @OriginalMember(owner = "client!ga", name = "P", descriptor = "I")
    public static int field1506;

    @OriginalMember(owner = "client!ga", name = "R", descriptor = "I")
    public static int field1508;

    @OriginalMember(owner = "client!ga", name = "T", descriptor = "I")
    public static int field1510;

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(Z)V")
    public static final void method520(boolean arg0) {
        if (!arg0) {
            field1509 = null;
        }
        ++field1506;
        class172.field3438 = new class187();
    }

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(Z)V")
    public static void method521(boolean arg0) {
        field1509 = null;
        if (arg0) {
            field1509 = null;
        }
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "()V")
    public class62() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(BI)[I")
    public final int[] method7(byte arg0, int arg1) {
        ++field1510;
        if (arg0 != 75) {
            return null;
        } else {
            int[] var3 = super.field816.method1189((byte) 33, arg1);
            if (super.field816.field3661) {
                class156.method1047(var3, 0, class72.field1719, class22.field450[arg1]);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(ZII)I")
    public static final int method522(boolean arg0, int arg1, int arg2) {
        class210 var3 = (class210) class35.field746.method796(arg0, (long) arg2);
        ++field1508;
        if (var3 == null) {
            return -1;
        } else {
            return ~arg1 <= -1 && arg1 < var3.field4156.length ? var3.field4156[arg1] : -1;
        }
    }
}
