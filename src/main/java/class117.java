import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public interface class117 {

    @OriginalMember(owner = "client!t", name = "a", descriptor = "([I)V")
    void method898(int[] arg0);

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(B)I")
    int method899(byte arg0);

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V")
    void method900(int arg0);

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(II)V")
    void method901(int arg0, int arg1) throws Exception;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    void method902(Component arg0, int arg1) throws Exception;
}
