import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public interface class100 {

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(B)I")
    int method760(byte arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V")
    void method761(int arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(II)V")
    void method762(int arg0, int arg1) throws Exception;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "([I)V")
    void method763(int[] arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ZLjava/awt/Component;)V")
    void method764(boolean arg0, Component arg1) throws Exception;
}
