import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public interface class239 {

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IZILjava/awt/Component;)V")
    void method1633(int arg0, boolean arg1, int arg2, Component arg3) throws Exception;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(II)V")
    void method1634(int arg0, int arg1);

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(II)V")
    void method1635(int arg0, int arg1);

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IB)I")
    int method1636(int arg0, byte arg1);

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I[I)V")
    void method1637(int arg0, int[] arg1);

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIB)V")
    void method1638(int arg0, int arg1, byte arg2) throws Exception;
}
