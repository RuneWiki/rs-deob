import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public interface class192 {

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(II)V")
    void method1277(int arg0, int arg1);

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(BI)I")
    int method1278(byte arg0, int arg1);

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILjava/awt/Component;IZ)V")
    void method1279(int arg0, Component arg1, int arg2, boolean arg3) throws Exception;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I[I)V")
    void method1280(int arg0, int[] arg1);

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(III)V")
    void method1281(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(II)V")
    void method1282(int arg0, int arg1);
}
