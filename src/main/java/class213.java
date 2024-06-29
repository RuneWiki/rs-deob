import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public interface class213 {

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(II)V")
    void method1444(int arg0, int arg1);

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I[I)V")
    void method1445(int arg0, int[] arg1);

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(II)I")
    int method1446(int arg0, int arg1);

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Ljava/awt/Component;IBZ)V")
    void method1447(Component arg0, int arg1, byte arg2, boolean arg3) throws Exception;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(III)V")
    void method1448(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(BI)V")
    void method1449(byte arg0, int arg1);
}
