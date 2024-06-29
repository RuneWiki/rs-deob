import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public interface class2 {

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IB)[I")
    int[] method4(int arg0, byte arg1);

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(II)Z")
    boolean method5(int arg0, int arg1);

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(II)I")
    int method6(int arg0, int arg1);

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "(II)Z")
    boolean method7(int arg0, int arg1);
}
