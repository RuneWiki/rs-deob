import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public interface class164 {

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(ZI)V")
    void method1160(boolean arg0, int arg1);

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(BI)I")
    int method1161(byte arg0, int arg1);

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(I[I)V")
    void method1162(int arg0, int[] arg1);

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(BI)V")
    void method1163(byte arg0, int arg1);

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(III)V")
    void method1164(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(ILjava/awt/Component;ZI)V")
    void method1165(int arg0, Component arg1, boolean arg2, int arg3) throws Exception;
}
