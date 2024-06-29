import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public interface class250 {

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)J")
    long method1629(int arg0);

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIZ[B)V")
    void method1630(int arg0, int arg1, boolean arg2, byte[] arg3);

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(B)I")
    int method1631(byte arg0);

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(I)I")
    int method1632(int arg0);
}
