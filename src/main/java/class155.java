import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public interface class155 {

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ILjava/awt/Component;BZ)V")
    void method1037(int arg0, Component arg1, byte arg2, boolean arg3) throws Exception;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(II)V")
    void method1038(int arg0, int arg1);

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IZ)V")
    void method1039(int arg0, boolean arg1);

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(III)V")
    void method1040(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I[I)V")
    void method1041(int arg0, int[] arg1);

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(II)I")
    int method1042(int arg0, int arg1);
}
