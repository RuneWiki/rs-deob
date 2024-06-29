import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public interface class187 {

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Ljava/awt/Component;IZI)V")
    void method1148(Component arg0, int arg1, boolean arg2, int arg3) throws Exception;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IB)I")
    int method1149(int arg0, byte arg1);

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(II)V")
    void method1150(int arg0, int arg1);

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(II)V")
    void method1151(int arg0, int arg1);

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(III)V")
    void method1152(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I[I)V")
    void method1153(int arg0, int[] arg1);
}
