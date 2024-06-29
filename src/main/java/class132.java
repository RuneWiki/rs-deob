import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public interface class132 {

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ZI)I")
    int method879(boolean arg0, int arg1);

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IB)V")
    void method880(int arg0, byte arg1);

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(IB)V")
    void method881(int arg0, byte arg1);

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIZLjava/awt/Component;)V")
    void method882(int arg0, int arg1, boolean arg2, Component arg3) throws Exception;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(I[I)V")
    void method883(int arg0, int[] arg1);

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIZ)V")
    void method884(int arg0, int arg1, boolean arg2) throws Exception;
}
