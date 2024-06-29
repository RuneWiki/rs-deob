import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public interface class261 {

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIB)V")
    void method1829(int arg0, int arg1, byte arg2) throws Exception;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IBLjava/awt/Component;Z)V")
    void method1830(int arg0, byte arg1, Component arg2, boolean arg3) throws Exception;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I[I)V")
    void method1831(int arg0, int[] arg1);

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)I")
    int method1832(int arg0, int arg1);

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IZ)V")
    void method1833(int arg0, boolean arg1);

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(BI)V")
    void method1834(byte arg0, int arg1);
}
