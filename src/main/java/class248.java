import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public interface class248 {

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(BI)V")
    void method1695(byte arg0, int arg1);

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Ljava/awt/Component;ZBI)V")
    void method1696(Component arg0, boolean arg1, byte arg2, int arg3) throws Exception;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(I[I)V")
    void method1697(int arg0, int[] arg1);

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(III)V")
    void method1698(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IZ)V")
    void method1699(int arg0, boolean arg1);

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IB)I")
    int method1700(int arg0, byte arg1);
}
