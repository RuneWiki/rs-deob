import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public interface class91 {

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZBILjava/awt/Component;)V")
    void method591(boolean arg0, byte arg1, int arg2, Component arg3) throws Exception;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IZ)V")
    void method592(int arg0, boolean arg1);

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I[I)V")
    void method593(int arg0, int[] arg1);

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IBI)V")
    void method594(int arg0, byte arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(BI)V")
    void method595(byte arg0, int arg1);

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZI)I")
    int method596(boolean arg0, int arg1);
}
