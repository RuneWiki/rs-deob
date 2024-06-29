import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public interface class70 {

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IB)Z")
    boolean method190(int arg0, byte arg1);

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(BI)Z")
    boolean method197(byte arg0, int arg1);

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ZI)I")
    int method202(boolean arg0, int arg1);

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(IB)[I")
    int[] method192(int arg0, byte arg1);
}
