import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public interface class219 {

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IILjava/awt/Component;Z)V")
    void method1389(int arg0, int arg1, Component arg2, boolean arg3) throws Exception;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I[I)V")
    void method1390(int arg0, int[] arg1);

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(II)V")
    void method1391(int arg0, int arg1);

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIB)V")
    void method1392(int arg0, int arg1, byte arg2) throws Exception;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZI)I")
    int method1393(boolean arg0, int arg1);

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(II)V")
    void method1394(int arg0, int arg1);
}
