import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public interface class59 {

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(II)Z")
    boolean method428(int arg0, int arg1);

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(IIZFII)[I")
    int[] method429(int arg0, int arg1, boolean arg2, float arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(FIZIBI)[I")
    int[] method430(float arg0, int arg1, boolean arg2, int arg3, byte arg4, int arg5);

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(IZIFII)[F")
    float[] method431(int arg0, boolean arg1, int arg2, float arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(IZ)Lop;")
    class118 method432(int arg0, boolean arg1);
}
