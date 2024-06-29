import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public interface class13 {

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(B)I")
    int method112(byte arg0);

    @OriginalMember(owner = "client!c", name = "a", descriptor = "([I)V")
    void method113(int[] arg0);

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    void method114(Component arg0, int arg1) throws Exception;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V")
    void method115(int arg0);

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(BI)V")
    void method116(byte arg0, int arg1) throws Exception;
}
