import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public interface class152 {

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIZ)V")
    void method1106(int arg0, int arg1, boolean arg2) throws Exception;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Ljava/awt/Component;IZB)V")
    void method1107(Component arg0, int arg1, boolean arg2, byte arg3) throws Exception;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IZ)I")
    int method1108(int arg0, boolean arg1);

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)V")
    void method1109(int arg0, int arg1);

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I[I)V")
    void method1110(int arg0, int[] arg1);

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(II)V")
    void method1111(int arg0, int arg1);
}
