import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public interface class17 {

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)I")
    int method163(int arg0);

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(BI)V")
    void method164(byte arg0, int arg1) throws Exception;

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(I)V")
    void method165(int arg0);

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "([I)V")
    void method166(int[] arg0);

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ZLjava/awt/Component;)V")
    void method167(boolean arg0, Component arg1) throws Exception;
}
