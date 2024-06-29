import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public interface class278 {

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(IB)V")
    void method1784(int arg0, byte arg1);

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(Ljava/awt/Component;IZB)V")
    void method1785(Component arg0, int arg1, boolean arg2, byte arg3) throws Exception;

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(II)I")
    int method1786(int arg0, int arg1);

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(BI)V")
    void method1787(byte arg0, int arg1);

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(I[I)V")
    void method1788(int arg0, int[] arg1);

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(III)V")
    void method1789(int arg0, int arg1, int arg2) throws Exception;
}
