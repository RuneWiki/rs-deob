import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public interface class208 {

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(II)I")
    int method1430(int arg0, int arg1);

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(BILjava/awt/Component;Z)V")
    void method1431(byte arg0, int arg1, Component arg2, boolean arg3) throws Exception;

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(II)V")
    void method1432(int arg0, int arg1);

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "(II)V")
    void method1433(int arg0, int arg1);

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I[I)V")
    void method1434(int arg0, int[] arg1);

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(III)V")
    void method1435(int arg0, int arg1, int arg2) throws Exception;
}
