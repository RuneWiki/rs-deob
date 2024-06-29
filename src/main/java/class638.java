import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class638 {

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "I")
    public static int field8563;

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "I")
    public static int field8565;

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "I")
    public static int field8566;

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "Lht;")
    public class395 field8567;

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "Lfe;")
    public class638 field8564;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V", line = 7)
    public final void method3566(int arg0) {
        field8563++;
        if (class525.field7295 >= 500) {
            return;
        }
        this.field8567 = null;
        this.field8564 = class477.field6642;
        class525.field7295++;
        class477.field6642 = this;
        if (arg0 != -1643) {
            this.field8567 = null;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIILuda;)V", line = 30)
    public static final void method3567(int arg0, int arg1, int arg2, class441 arg3) {
        class262 var4 = class670.method3779(arg0, arg1, arg2);
        if (var4 == null) {
            return;
        }
        var4.field3844 = arg3;
        int var5 = class433.field6043 == class371.field5240 ? 1 : 0;
        if (arg3.method783(0)) {
            if (arg3.method785(-126)) {
                arg3.field4412 = class333.field4710[var5];
                class333.field4710[var5] = arg3;
                return;
            }
            arg3.field4412 = class234.field3474[var5];
            class234.field3474[var5] = arg3;
            class569.field7870 = true;
            return;
        }
        arg3.field4412 = class204.field2694[var5];
        class204.field2694[var5] = arg3;
    }
}
