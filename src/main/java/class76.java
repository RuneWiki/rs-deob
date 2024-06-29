import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public interface class76 {

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(B)I")
    int method596(byte arg0);

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    void method597(Component arg0, byte arg1) throws Exception;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IZ)V")
    void method598(int arg0, boolean arg1) throws Exception;

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(B)V")
    void method599(byte arg0);

    @OriginalMember(owner = "client!md", name = "a", descriptor = "([I)V")
    void method600(int[] arg0);
}
