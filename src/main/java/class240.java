import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public interface class240 {

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(I[I)V")
    void method1662(int arg0, int[] arg1);

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(II)V")
    void method1663(int arg0, int arg1);

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(ILjava/awt/Component;ZI)V")
    void method1664(int arg0, Component arg1, boolean arg2, int arg3) throws Exception;

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(II)I")
    int method1665(int arg0, int arg1);

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(III)V")
    void method1666(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "(II)V")
    void method1667(int arg0, int arg1);
}
