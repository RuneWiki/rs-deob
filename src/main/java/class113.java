import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public interface class113 {

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(I)I")
    int method897(int arg0);

    @OriginalMember(owner = "client!se", name = "a", descriptor = "([I)V")
    void method898(int[] arg0);

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(I)V")
    void method899(int arg0);

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IB)V")
    void method900(int arg0, byte arg1) throws Exception;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(BLjava/awt/Component;)V")
    void method901(byte arg0, Component arg1) throws Exception;
}
