import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public interface class81 {

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(BIZLjava/awt/Component;)V")
    void method595(byte arg0, int arg1, boolean arg2, Component arg3) throws Exception;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)I")
    int method596(int arg0);

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(II)V")
    void method597(int arg0, int arg1) throws Exception;

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(I)V")
    void method598(int arg0);

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "([I)V")
    void method599(int[] arg0);
}
