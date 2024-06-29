import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bw")
public interface class28 extends class34 {

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(B)I")
    int method124(byte arg0);

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(IIII[III)V")
    void method125(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(FI)F")
    float method126(float arg0, int arg1);

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(II[BLpb;IIIII)V")
    void method127(int arg0, int arg1, byte[] arg2, class2 arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(FZ)F")
    float method128(float arg0, boolean arg1);

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(ZZZ)V")
    void method129(boolean arg0, boolean arg1, boolean arg2);

    @OriginalMember(owner = "client!bw", name = "b", descriptor = "(B)I")
    int method130(byte arg0);

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(I[IIIIZII)V")
    void method131(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(I)Z")
    boolean method132(int arg0);
}
