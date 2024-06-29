import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public abstract class class129 extends class179 {

    @OriginalMember(owner = "client!br", name = "s", descriptor = "Lss;")
    public static class281 field1431 = null;

    @OriginalMember(owner = "client!br", name = "t", descriptor = "I")
    public static int field1432;

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(IIILqo;Lqo;)V", line = 3)
    public static final void method823(int arg0, int arg1, int arg2, class364 arg3, class364 arg4) {
        if (class347.field4722[arg0][arg1][arg2] == null) {
            class75.method443(arg0, arg1, arg2);
        }
        class347.field4722[arg0][arg1][arg2].field4259 = arg3;
        class347.field4722[arg0][arg1][arg2].field4266 = arg4;
    }

    @OriginalMember(owner = "client!br", name = "b", descriptor = "(I)Z")
    public abstract boolean method824(int arg0);

    @OriginalMember(owner = "client!br", name = "c", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method825(int arg0);
}
