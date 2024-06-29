import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public interface class194 {

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(II)V")
    void method1279(int arg0, int arg1);

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I[I)V")
    void method1280(int arg0, int[] arg1);

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(II)I")
    int method1281(int arg0, int arg1);

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(III)V")
    void method1282(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "(II)V")
    void method1283(int arg0, int arg1);

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILjava/awt/Component;BZ)V")
    void method1284(int arg0, Component arg1, byte arg2, boolean arg3) throws Exception;
}
