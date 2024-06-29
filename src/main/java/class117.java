import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public interface class117 {

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(II)V")
    void method931(int arg0, int arg1);

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Ljava/awt/Component;ZII)V")
    void method932(Component arg0, boolean arg1, int arg2, int arg3) throws Exception;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I[I)V")
    void method933(int arg0, int[] arg1);

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IB)I")
    int method934(int arg0, byte arg1);

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(II)V")
    void method935(int arg0, int arg1);

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(III)V")
    void method936(int arg0, int arg1, int arg2) throws Exception;
}
