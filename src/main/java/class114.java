import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kba")
public class class114 {

    @OriginalMember(owner = "client!kba", name = "c", descriptor = "I")
    public static int field1555 = 0;

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "I")
    public static int field1553;

    @OriginalMember(owner = "client!kba", name = "b", descriptor = "I")
    public static int field1554;

    @OriginalMember(owner = "client!kba", name = "d", descriptor = "I")
    public static int field1556;

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(IILaj;)Ldw;")
    public static final class749 method851(int arg0, int arg1, class333 arg2) {
        if (arg0 == 0) {
            field1556++;
            byte[] var3 = arg2.method2114(arg1, false);
            return var3 == null ? null : new class749(var3);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(Ljp;I)Lmja;")
    public static final class443 method852(class376 arg0, int arg1) {
        field1553++;
        class780 var2 = class250.method1679(arg0, -93);
        int var3 = arg0.method2377(arg1 ^ 0xFFFFAD20);
        return arg1 == 21157 ? new class443(var2.field10693, var2.field10691, var2.field10697, var2.field10695, var2.field10696, var3) : null;
    }
}
