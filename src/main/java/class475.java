import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class475 {

    @OriginalMember(owner = "client!m", name = "b", descriptor = "Lqk;")
    public static class148 field6490 = new class148(37, 0);

    @OriginalMember(owner = "client!m", name = "c", descriptor = "I")
    public static int field6491;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "Ljava/lang/Object;")
    public static Object field6489;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Z)V", line = 10)
    public static void method2819(boolean arg0) {
        field6490 = null;
        if (!arg0) {
            field6489 = null;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(B)Z", line = 21)
    public static final boolean method2820(byte arg0) {
        field6491++;
        int var1 = 54 % ((-arg0 - 11) / 40);
        return class736.field10292 == 0 ? class336.field4314.method2291(37) : true;
    }
}
