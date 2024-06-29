import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public interface class311 {

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZFIIIZ)[I")
    int[] method39(boolean arg0, float arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IZ)Z")
    boolean method34(int arg0, boolean arg1);

    @OriginalMember(owner = "client!pe", name = "l", descriptor = "(II)Lob;")
    class185 method37(int arg0, int arg1);
}
