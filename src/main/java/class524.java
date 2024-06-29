import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public interface class524 {

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)Z")
    boolean method144(int arg0, int arg1);

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIIFIZ)[F")
    float[] method139(int arg0, int arg1, int arg2, float arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(II)Lco;")
    class295 method140(int arg0, int arg1);

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ZIIFII)[I")
    int[] method141(boolean arg0, int arg1, int arg2, float arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)I")
    int method142(int arg0);

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IZFIII)[I")
    int[] method145(int arg0, boolean arg1, float arg2, int arg3, int arg4, int arg5);
}
