import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public interface class195 {

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)I")
    int method1180(int arg0, int arg1);

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IB)Z")
    boolean method1171(int arg0, byte arg1);

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(II)Z")
    boolean method1179(int arg0, int arg1);

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIF)[I")
    int[] method1175(int arg0, int arg1, float arg2);

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IZ)[I")
    int[] method1173(int arg0, boolean arg1);

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "(II)Z")
    boolean method1176(int arg0, int arg1);

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "(II)Z")
    boolean method1168(int arg0, int arg1);
}
