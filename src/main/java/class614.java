import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public interface class614 extends class316 {

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(ZB)Ljaclib/memory/Buffer;")
    Buffer method1126(boolean arg0, byte arg1);

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(I)V")
    void method1125(int arg0);

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "(I)Loea;")
    class612 method1122(int arg0);

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(II)V")
    void method1119(int arg0, int arg1);

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "(I)Z")
    boolean method1121(int arg0);
}
