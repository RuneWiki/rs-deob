import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public interface class134 extends class686 {

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)I")
    int method752(int arg0);

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIII[IBII)V")
    void method753(int arg0, int arg1, int arg2, int arg3, int[] arg4, byte arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(I)I")
    int method754(int arg0);

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "(I)Z")
    boolean method755(int arg0);

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(FI)F")
    float method756(float arg0, int arg1);

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(II[BIIIILsq;I)V")
    void method757(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6, class485 arg7, int arg8);

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(FZ)F")
    float method758(float arg0, boolean arg1);

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(ZIZ)V")
    void method759(boolean arg0, int arg1, boolean arg2);
}
