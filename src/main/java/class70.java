import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public interface class70 {

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)V")
    void method596(int arg0, int arg1) throws Exception;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "([I)V")
    void method597(int[] arg0);

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)V")
    void method598(byte arg0);

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)I")
    int method599(int arg0);

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    void method600(Component arg0, byte arg1) throws Exception;
}
