import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cea")
public class class124 {

    @OriginalMember(owner = "client!cea", name = "b", descriptor = "I")
    public int field1599;

    @OriginalMember(owner = "client!cea", name = "c", descriptor = "I")
    public int field1600;

    @OriginalMember(owner = "client!cea", name = "d", descriptor = "I")
    public static int field1601;

    @OriginalMember(owner = "client!cea", name = "e", descriptor = "I")
    public int field1602;

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "Z")
    public boolean field1598;

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(Loa;IZ)Lil;")
    public static final class598 method762(class689 arg0, int arg1, boolean arg2) {
        field1601++;
        class427 var3 = class570.method3222((byte) -116, arg0, arg1, arg2);
        return var3 == null ? null : var3.field5931;
    }
}
