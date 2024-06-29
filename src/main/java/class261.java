import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public interface class261 {

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IB)I")
    int method1780(int arg0, byte arg1);

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I[I)V")
    void method1781(int arg0, int[] arg1);

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(IB)V")
    void method1782(int arg0, byte arg1);

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(BIZLjava/awt/Component;)V")
    void method1783(byte arg0, int arg1, boolean arg2, Component arg3) throws Exception;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ZII)V")
    void method1784(boolean arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "(IB)V")
    void method1785(int arg0, byte arg1);
}
