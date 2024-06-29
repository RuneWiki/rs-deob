import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public interface class46 {

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Ljava/awt/Component;ZZI)V")
    void method483(Component arg0, boolean arg1, boolean arg2, int arg3) throws Exception;

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(II)V")
    void method484(int arg0, int arg1);

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(II)V")
    void method485(int arg0, int arg1);

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "(II)I")
    int method486(int arg0, int arg1);

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(BII)V")
    void method487(byte arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(I[I)V")
    void method488(int arg0, int[] arg1);
}
