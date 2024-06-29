import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public interface class73 {

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(II)V")
    void method605(int arg0, int arg1) throws Exception;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V")
    void method606(int arg0);

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(B)I")
    int method607(byte arg0);

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    void method608(Component arg0, int arg1) throws Exception;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "([I)V")
    void method609(int[] arg0);
}
