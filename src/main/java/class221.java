import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public interface class221 {

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(II)I")
    int method1445(int arg0, int arg1);

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IZ)V")
    void method1446(int arg0, boolean arg1);

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/awt/Component;IZI)V")
    void method1447(Component arg0, int arg1, boolean arg2, int arg3) throws Exception;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I[I)V")
    void method1448(int arg0, int[] arg1);

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(II)V")
    void method1449(int arg0, int arg1);

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(III)V")
    void method1450(int arg0, int arg1, int arg2) throws Exception;
}
