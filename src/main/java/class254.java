import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public interface class254 {

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(I[I)V")
    void method1722(int arg0, int[] arg1);

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(IB)V")
    void method1723(int arg0, byte arg1);

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(II)I")
    int method1724(int arg0, int arg1);

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(ZBLjava/awt/Component;I)V")
    void method1725(boolean arg0, byte arg1, Component arg2, int arg3) throws Exception;

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(II)V")
    void method1726(int arg0, int arg1);

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(IIB)V")
    void method1727(int arg0, int arg1, byte arg2) throws Exception;
}
