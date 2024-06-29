import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public interface class201 {

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)I")
    int method1254(int arg0, int arg1);

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IB)Z")
    boolean method1252(int arg0, byte arg1);

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(II)Z")
    boolean method1250(int arg0, int arg1);

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(FII)[I")
    int[] method1256(float arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "(II)Z")
    boolean method1251(int arg0, int arg1);

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(IB)Z")
    boolean method1253(int arg0, byte arg1);

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "(IB)[I")
    int[] method1255(int arg0, byte arg1);
}
