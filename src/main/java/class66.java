import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public interface class66 {

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Ljava/awt/Component;IZI)V")
    void method538(Component arg0, int arg1, boolean arg2, int arg3) throws Exception;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I[I)V")
    void method539(int arg0, int[] arg1);

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IBI)V")
    void method540(int arg0, byte arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IB)I")
    int method541(int arg0, byte arg1);

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(IB)V")
    void method542(int arg0, byte arg1);

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(II)V")
    void method543(int arg0, int arg1);
}
