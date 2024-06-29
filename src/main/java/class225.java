import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lba")
public interface class225 extends class408 {

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(III[IIII)V")
    void method336(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!lba", name = "b", descriptor = "(I)I")
    int method338(int arg0);

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(IF)F")
    float method328(int arg0, float arg1);

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(B)Z")
    boolean method337(byte arg0);

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(FI)F")
    float method330(float arg0, int arg1);

    @OriginalMember(owner = "client!lba", name = "b", descriptor = "(B)I")
    int method334(byte arg0);

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(IZLnea;I[BIIII)V")
    void method331(int arg0, boolean arg1, class600 arg2, int arg3, byte[] arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(ZZI)V")
    void method333(boolean arg0, boolean arg1, int arg2);

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(II[IIIIII)V")
    void method329(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7);
}
