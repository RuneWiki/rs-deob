import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public interface class56 {

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Ljava/awt/Component;IIZ)V")
    void method370(Component arg0, int arg1, int arg2, boolean arg3) throws Exception;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(I[I)V")
    void method371(int arg0, int[] arg1);

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(II)V")
    void method372(int arg0, int arg1);

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(II)V")
    void method373(int arg0, int arg1);

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(BI)I")
    int method374(byte arg0, int arg1);

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IBI)V")
    void method375(int arg0, byte arg1, int arg2) throws Exception;
}
