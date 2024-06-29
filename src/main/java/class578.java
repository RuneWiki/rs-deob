import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public interface class578 {

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IB)V")
    void method2155(int arg0, byte arg1);

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(I[I)V")
    void method2154(int arg0, int[] arg1);

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(III)V")
    void method2157(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(IB)I")
    int method2158(int arg0, byte arg1);

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(ZLjava/awt/Component;II)V")
    void method2153(boolean arg0, Component arg1, int arg2, int arg3) throws Exception;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IZ)V")
    void method2156(int arg0, boolean arg1);
}
