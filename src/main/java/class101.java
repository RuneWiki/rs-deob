import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public interface class101 {

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IB)V")
    void method768(int arg0, byte arg1);

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(I[I)V")
    void method769(int arg0, int[] arg1);

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ILjava/awt/Component;BZ)V")
    void method770(int arg0, Component arg1, byte arg2, boolean arg3) throws Exception;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(II)V")
    void method771(int arg0, int arg1);

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(II)I")
    int method772(int arg0, int arg1);

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIZ)V")
    void method773(int arg0, int arg1, boolean arg2) throws Exception;
}
