import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public interface class472 {

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(B)I")
    int method1767(byte arg0);

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIFBIZ)[I")
    int[] method1759(int arg0, int arg1, float arg2, byte arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(BI)Z")
    boolean method1758(byte arg0, int arg1);

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IB)Lns;")
    class83 method1762(int arg0, byte arg1);

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(FIIIZI)[I")
    int[] method1764(float arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5);

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIFIZ)[F")
    float[] method1766(int arg0, int arg1, int arg2, float arg3, int arg4, boolean arg5);
}
