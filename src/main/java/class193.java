import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public interface class193 {

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IB)I")
    int method1335(int arg0, byte arg1);

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I[I)V")
    void method1336(int arg0, int[] arg1);

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(IB)V")
    void method1337(int arg0, byte arg1);

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(III)V")
    void method1338(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)V")
    void method1339(int arg0, int arg1);

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Ljava/awt/Component;ZIZ)V")
    void method1340(Component arg0, boolean arg1, int arg2, boolean arg3) throws Exception;
}
