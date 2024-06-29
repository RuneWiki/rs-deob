import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public interface class60 {

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IB)Z")
    boolean method369(int arg0, byte arg1);

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IZBIFI)[F")
    float[] method370(int arg0, boolean arg1, byte arg2, int arg3, float arg4, int arg5);

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(IB)Lhl;")
    class311 method371(int arg0, byte arg1);

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIZIFI)[I")
    int[] method372(int arg0, int arg1, boolean arg2, int arg3, float arg4, int arg5);

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIFIIZ)[I")
    int[] method373(int arg0, int arg1, float arg2, int arg3, int arg4, boolean arg5);
}
