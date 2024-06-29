import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public interface class239 {

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ZIIIFB)[I")
    int[] method1562(boolean arg0, int arg1, int arg2, int arg3, float arg4, byte arg5);

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(BI)Z")
    boolean method1567(byte arg0, int arg1);

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(IB)Lli;")
    class110 method1563(int arg0, byte arg1);
}
