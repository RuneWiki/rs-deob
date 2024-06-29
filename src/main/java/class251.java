import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public interface class251 {

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Ljava/awt/Component;ZZI)V")
    void method1756(Component arg0, boolean arg1, boolean arg2, int arg3) throws Exception;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IB)I")
    int method1757(int arg0, byte arg1);

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(BI)V")
    void method1758(byte arg0, int arg1);

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I[I)V")
    void method1759(int arg0, int[] arg1);

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(III)V")
    void method1760(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)V")
    void method1761(int arg0, int arg1);
}
