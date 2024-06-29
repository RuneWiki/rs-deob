import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public interface class22 {

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    void method159(Component arg0, byte arg1) throws Exception;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(B)I")
    int method160(byte arg0);

    @OriginalMember(owner = "client!d", name = "a", descriptor = "([I)V")
    void method161(int[] arg0);

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I)V")
    void method162(int arg0);

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(ZI)V")
    void method163(boolean arg0, int arg1) throws Exception;
}
