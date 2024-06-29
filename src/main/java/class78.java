import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public interface class78 {

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZI)V")
    void method665(boolean arg0, int arg1);

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(BZILjava/awt/Component;)V")
    void method666(byte arg0, boolean arg1, int arg2, Component arg3) throws Exception;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(BI)I")
    int method667(byte arg0, int arg1);

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IBI)V")
    void method668(int arg0, byte arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I[I)V")
    void method669(int arg0, int[] arg1);

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(II)V")
    void method670(int arg0, int arg1);
}
