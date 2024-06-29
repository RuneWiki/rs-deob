import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public interface class116 {

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(BI)Z")
    boolean method407(byte arg0, int arg1);

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(BI)Z")
    boolean method399(byte arg0, int arg1);

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(II)Z")
    boolean method401(int arg0, int arg1);

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(II)[I")
    int[] method400(int arg0, int arg1);

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "(II)I")
    int method411(int arg0, int arg1);

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(ZI)Z")
    boolean method416(boolean arg0, int arg1);

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(FII)[I")
    int[] method408(float arg0, int arg1, int arg2);
}
