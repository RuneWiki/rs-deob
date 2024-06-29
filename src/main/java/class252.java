import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public interface class252 {

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(III)V")
    void method1810(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(II)V")
    void method1811(int arg0, int arg1);

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IB)V")
    void method1812(int arg0, byte arg1);

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(IB)I")
    int method1813(int arg0, byte arg1);

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIZLjava/awt/Component;)V")
    void method1814(int arg0, int arg1, boolean arg2, Component arg3) throws Exception;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(I[I)V")
    void method1815(int arg0, int[] arg1);
}
