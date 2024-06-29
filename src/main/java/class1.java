import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public interface class1 {

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(II)Z")
    boolean method1(int arg0, int arg1);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IB)Z")
    boolean method2(int arg0, byte arg1);

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(II)[I")
    int[] method3(int arg0, int arg1);

    @OriginalMember(owner = "client!a", name = "c", descriptor = "(II)I")
    int method4(int arg0, int arg1);
}
