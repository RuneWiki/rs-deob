import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public interface class15 {

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(II)Z")
    boolean method73(int arg0, int arg1);

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(II)I")
    int method74(int arg0, int arg1);

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IB)Z")
    boolean method75(int arg0, byte arg1);

    @OriginalMember(owner = "client!od", name = "c", descriptor = "(II)[I")
    int[] method76(int arg0, int arg1);

    @OriginalMember(owner = "client!od", name = "d", descriptor = "(II)Z")
    boolean method77(int arg0, int arg1);

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(FIB)[I")
    int[] method78(float arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!od", name = "e", descriptor = "(II)Z")
    boolean method79(int arg0, int arg1);
}
