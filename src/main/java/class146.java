import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public interface class146 {

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(IZI)V")
    void method1015(int arg0, boolean arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(II)V")
    void method1016(int arg0, int arg1);

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(Ljava/awt/Component;ZII)V")
    void method1017(Component arg0, boolean arg1, int arg2, int arg3) throws Exception;

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(BI)V")
    void method1018(byte arg0, int arg1);

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "(II)I")
    int method1019(int arg0, int arg1);

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(I[I)V")
    void method1020(int arg0, int[] arg1);
}
