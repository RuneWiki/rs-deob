import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public interface class481 {

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(IB)Z")
    boolean method1335(int arg0, byte arg1);

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(II)Lha;")
    class85 method1331(int arg0, int arg1);

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(ZIIIFZ)[I")
    int[] method1332(boolean arg0, int arg1, int arg2, int arg3, float arg4, boolean arg5);

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(IZFIII)[I")
    int[] method1333(int arg0, boolean arg1, float arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(IFZIII)[F")
    float[] method1329(int arg0, float arg1, boolean arg2, int arg3, int arg4, int arg5);
}
