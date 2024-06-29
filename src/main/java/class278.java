import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public interface class278 {

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(II)V")
    void method1877(int arg0, int arg1);

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(II)V")
    void method1878(int arg0, int arg1);

    @OriginalMember(owner = "client!le", name = "c", descriptor = "(II)I")
    int method1879(int arg0, int arg1);

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ZLjava/awt/Component;II)V")
    void method1880(boolean arg0, Component arg1, int arg2, int arg3) throws Exception;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I[I)V")
    void method1881(int arg0, int[] arg1);

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IBI)V")
    void method1882(int arg0, byte arg1, int arg2) throws Exception;
}
