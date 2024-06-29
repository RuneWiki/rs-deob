import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public interface class136 {

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(III)V")
    void method847(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(II)V")
    void method848(int arg0, int arg1);

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(BI)V")
    void method849(byte arg0, int arg1);

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ZILjava/awt/Component;I)V")
    void method850(boolean arg0, int arg1, Component arg2, int arg3) throws Exception;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I[I)V")
    void method851(int arg0, int[] arg1);

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(BI)I")
    int method852(byte arg0, int arg1);
}
