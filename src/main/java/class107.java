import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kba")
public class class107 extends class739 {

    @OriginalMember(owner = "client!kba", name = "v", descriptor = "I")
    public int field1499;

    @OriginalMember(owner = "client!kba", name = "r", descriptor = "I")
    public int field1495;

    @OriginalMember(owner = "client!kba", name = "t", descriptor = "I")
    public static int field1497 = 0;

    @OriginalMember(owner = "client!kba", name = "s", descriptor = "Lmia;")
    public static class63 field1496 = new class63(49, 6);

    @OriginalMember(owner = "client!kba", name = "u", descriptor = "I")
    public static int field1498;

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(B)Lio;", line = 3)
    public final class439 method69(byte arg0) {
        field1498++;
        int var2 = -115 % ((arg0 + 69) / 39);
        return class529.field7543;
    }

    @OriginalMember(owner = "client!kba", name = "<init>", descriptor = "(Log;Lega;IIIIIIIII)V", line = 17)
    public class107(class651 arg0, class713 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field1499 = arg9;
        this.field1495 = arg10;
    }

    @OriginalMember(owner = "client!kba", name = "d", descriptor = "(B)V", line = 26)
    public static void method810(byte arg0) {
        if (arg0 >= -35) {
            field1496 = null;
        }
        field1496 = null;
    }
}
