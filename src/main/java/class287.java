import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public interface class287 {

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(FIIZII)[I")
    int[] method1619(float arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(II)Z")
    boolean method1620(int arg0, int arg1);

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(II)Luc;")
    class23 method1621(int arg0, int arg1);

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IZIIFI)[I")
    int[] method1622(int arg0, boolean arg1, int arg2, int arg3, float arg4, int arg5);

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(BZIIFI)[F")
    float[] method1623(byte arg0, boolean arg1, int arg2, int arg3, float arg4, int arg5);
}
