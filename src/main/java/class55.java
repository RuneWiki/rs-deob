import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public interface class55 {

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(II)Z")
    boolean method4(int arg0, int arg1);

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IZ)[I")
    int[] method6(int arg0, boolean arg1);

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ZI)I")
    int method11(boolean arg0, int arg1);

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(II)Z")
    boolean method2(int arg0, int arg1);
}
