import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public interface class258 {

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIB)V")
    void method1746(int arg0, int arg1, byte arg2) throws Exception;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IB)V")
    void method1747(int arg0, byte arg1);

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(I[I)V")
    void method1748(int arg0, int[] arg1);

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ILjava/awt/Component;IZ)V")
    void method1749(int arg0, Component arg1, int arg2, boolean arg3) throws Exception;

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(IB)I")
    int method1750(int arg0, byte arg1);

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(II)V")
    void method1751(int arg0, int arg1);
}
