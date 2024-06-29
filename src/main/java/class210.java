import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public interface class210 {

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IB)I")
    int method1468(int arg0, byte arg1);

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(BI)V")
    void method1469(byte arg0, int arg1);

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIZLjava/awt/Component;)V")
    void method1470(int arg0, int arg1, boolean arg2, Component arg3) throws Exception;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(III)V")
    void method1471(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(IB)V")
    void method1472(int arg0, byte arg1);

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(I[I)V")
    void method1473(int arg0, int[] arg1);
}
