import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public interface class45 {

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(III)V")
    void method536(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(Ljava/awt/Component;ZII)V")
    void method537(Component arg0, boolean arg1, int arg2, int arg3) throws Exception;

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(II)I")
    int method538(int arg0, int arg1);

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(I[I)V")
    void method539(int arg0, int[] arg1);

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(ZI)V")
    void method540(boolean arg0, int arg1);

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(IB)V")
    void method541(int arg0, byte arg1);
}
