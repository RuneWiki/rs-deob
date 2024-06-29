import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public interface class162 {

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(BI)Z")
    boolean method1100(byte arg0, int arg1);

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IZ)Z")
    boolean method1101(int arg0, boolean arg1);

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIF)[I")
    int[] method1102(int arg0, int arg1, float arg2);

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(BI)I")
    int method1103(byte arg0, int arg1);

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(ZI)[I")
    int[] method1104(boolean arg0, int arg1);

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)Z")
    boolean method1105(int arg0, int arg1);

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(II)Z")
    boolean method1106(int arg0, int arg1);
}
