import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public interface class39 {

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(II)I")
    int method307(int arg0, int arg1);

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(I[I)V")
    void method308(int arg0, int[] arg1);

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(ZI)V")
    void method309(boolean arg0, int arg1);

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IBI)V")
    void method310(int arg0, byte arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IB)V")
    void method311(int arg0, byte arg1);

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(ILjava/awt/Component;ZB)V")
    void method312(int arg0, Component arg1, boolean arg2, byte arg3) throws Exception;
}
