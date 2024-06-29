import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public interface class168 {

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(II)I")
    int method1166(int arg0, int arg1);

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(Ljava/awt/Component;IBZ)V")
    void method1167(Component arg0, int arg1, byte arg2, boolean arg3) throws Exception;

    @OriginalMember(owner = "client!in", name = "b", descriptor = "(II)V")
    void method1168(int arg0, int arg1);

    @OriginalMember(owner = "client!in", name = "c", descriptor = "(II)V")
    void method1169(int arg0, int arg1);

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(I[I)V")
    void method1170(int arg0, int[] arg1);

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(BII)V")
    void method1171(byte arg0, int arg1, int arg2) throws Exception;
}
