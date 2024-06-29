import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public interface class325 {

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(IB)V")
    void method1873(int arg0, byte arg1);

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(IZLjava/awt/Component;I)V")
    void method1874(int arg0, boolean arg1, Component arg2, int arg3) throws Exception;

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "(IB)I")
    int method1875(int arg0, byte arg1);

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(II)V")
    void method1876(int arg0, int arg1);

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(IIB)V")
    void method1877(int arg0, int arg1, byte arg2) throws Exception;

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(I[I)V")
    void method1878(int arg0, int[] arg1);
}
