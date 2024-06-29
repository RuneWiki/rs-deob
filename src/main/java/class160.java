import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public interface class160 {

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(II)I")
    int method1507(int arg0, int arg1);

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(IB)V")
    void method1508(int arg0, byte arg1);

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(I[I)V")
    void method1509(int arg0, int[] arg1);

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(III)V")
    void method1510(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!as", name = "b", descriptor = "(IB)V")
    void method1511(int arg0, byte arg1);

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(ILjava/awt/Component;ZB)V")
    void method1512(int arg0, Component arg1, boolean arg2, byte arg3) throws Exception;
}
