import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public interface class265 {

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ZLjava/awt/Component;ZI)V")
    void method1736(boolean arg0, Component arg1, boolean arg2, int arg3) throws Exception;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I[I)V")
    void method1737(int arg0, int[] arg1);

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(II)I")
    int method1738(int arg0, int arg1);

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(II)V")
    void method1739(int arg0, int arg1);

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(BI)V")
    void method1740(byte arg0, int arg1);

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(III)V")
    void method1741(int arg0, int arg1, int arg2) throws Exception;
}
