import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("aa")
public interface class2 {

    @OriginalMember(owner = "aa", name = "a", descriptor = "(II)Z")
    boolean method3(int arg0, int arg1);

    @OriginalMember(owner = "aa", name = "a", descriptor = "(IZ)I")
    int method4(int arg0, boolean arg1);

    @OriginalMember(owner = "aa", name = "b", descriptor = "(II)Z")
    boolean method5(int arg0, int arg1);

    @OriginalMember(owner = "aa", name = "c", descriptor = "(II)Z")
    boolean method6(int arg0, int arg1);

    @OriginalMember(owner = "aa", name = "a", descriptor = "(IFB)[I")
    int[] method7(int arg0, float arg1, byte arg2);

    @OriginalMember(owner = "aa", name = "b", descriptor = "(IZ)[I")
    int[] method8(int arg0, boolean arg1);

    @OriginalMember(owner = "aa", name = "d", descriptor = "(II)Z")
    boolean method9(int arg0, int arg1);
}
