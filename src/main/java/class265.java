import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public interface class265 {

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I[I)V")
    void method1811(int arg0, int[] arg1);

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(II)V")
    void method1812(int arg0, int arg1);

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ZI)I")
    int method1813(boolean arg0, int arg1);

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(II)V")
    void method1814(int arg0, int arg1);

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ZLjava/awt/Component;ZI)V")
    void method1815(boolean arg0, Component arg1, boolean arg2, int arg3) throws Exception;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(III)V")
    void method1816(int arg0, int arg1, int arg2) throws Exception;
}
