import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public interface class257 {

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(II)I")
    int method1727(int arg0, int arg1);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Ljava/awt/Component;ZIB)V")
    void method1728(Component arg0, boolean arg1, int arg2, byte arg3) throws Exception;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I[I)V")
    void method1729(int arg0, int[] arg1);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IB)V")
    void method1730(int arg0, byte arg1);

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(IB)V")
    void method1731(int arg0, byte arg1);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(III)V")
    void method1732(int arg0, int arg1, int arg2) throws Exception;
}
