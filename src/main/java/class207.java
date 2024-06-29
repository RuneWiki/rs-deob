import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class207 {

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "I")
    public static int field3028 = 0;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "I")
    public static int field3027 = 0;

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "I")
    public static int field3029;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Lrv;Z)Lhha;", line = 4)
    public static final class543 method1482(class120 arg0, boolean arg1) {
        field3029++;
        class82 var2 = class571.method3315((byte) -110, arg0);
        if (arg1) {
            return null;
        } else {
            int var3 = arg0.method838(!arg1);
            return new class543(var2.field3774, var2.field3784, var2.field3777, var2.field3783, var2.field3769, var2.field3773, var2.field3781, var2.field3775, var2.field3776, var2.field1084, var2.field1088, var2.field1093, var2.field1086, var2.field1087, var2.field1089, var3);
        }
    }
}
