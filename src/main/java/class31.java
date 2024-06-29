import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public interface class31 {

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II)Z")
    boolean method201(int arg0, int arg1);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(FII)[I")
    int[] method202(float arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IB)[I")
    int[] method203(int arg0, byte arg1);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ZI)Z")
    boolean method204(boolean arg0, int arg1);

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(IB)I")
    int method205(int arg0, byte arg1);

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(ZI)Z")
    boolean method206(boolean arg0, int arg1);

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(II)Z")
    boolean method207(int arg0, int arg1);
}
