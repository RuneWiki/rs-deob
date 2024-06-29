import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public interface class147 {

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(II)I")
    int method972(int arg0, int arg1);

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IZ)V")
    void method973(int arg0, boolean arg1);

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(II)V")
    void method974(int arg0, int arg1);

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I[I)V")
    void method975(int arg0, int[] arg1);

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(BII)V")
    void method976(byte arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ZBLjava/awt/Component;I)V")
    void method977(boolean arg0, byte arg1, Component arg2, int arg3) throws Exception;
}
