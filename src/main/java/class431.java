import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public interface class431 {

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(I[I)V")
    void method1462(int arg0, int[] arg1);

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(BIZLjava/awt/Component;)V")
    void method1463(byte arg0, int arg1, boolean arg2, Component arg3) throws Exception;

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(ZI)V")
    void method1461(boolean arg0, int arg1);

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(III)V")
    void method1464(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(BI)I")
    int method1465(byte arg0, int arg1);

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "(ZI)V")
    void method1466(boolean arg0, int arg1);
}
