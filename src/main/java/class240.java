import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public interface class240 {

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IB)I")
    int method1518(int arg0, byte arg1);

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(I[I)V")
    void method1519(int arg0, int[] arg1);

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(BI)V")
    void method1520(byte arg0, int arg1);

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(II)V")
    void method1521(int arg0, int arg1);

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIZLjava/awt/Component;)V")
    void method1522(int arg0, int arg1, boolean arg2, Component arg3) throws Exception;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(III)V")
    void method1523(int arg0, int arg1, int arg2) throws Exception;
}
