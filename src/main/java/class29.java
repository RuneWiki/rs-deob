import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mca")
public interface class29 extends class152 {

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(IF)F")
    float method365(int arg0, float arg1);

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(ILos;II[BIIII)V")
    void method362(int arg0, class408 arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(ZZB)V")
    void method364(boolean arg0, boolean arg1, byte arg2);

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(I)I")
    int method369(int arg0);

    @OriginalMember(owner = "client!mca", name = "b", descriptor = "(I)Z")
    boolean method366(int arg0);

    @OriginalMember(owner = "client!mca", name = "c", descriptor = "(I)I")
    int method371(int arg0);

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(FB)F")
    float method373(float arg0, byte arg1);

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(II[IIIIII)V")
    void method372(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7);
}
