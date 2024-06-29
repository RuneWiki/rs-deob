import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public interface class387 {

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(BI)I")
    int method2486(byte arg0, int arg1);

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(II)V")
    void method2487(int arg0, int arg1);

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(III)V")
    void method2488(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Ljava/awt/Component;IZI)V")
    void method2489(Component arg0, int arg1, boolean arg2, int arg3) throws Exception;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I[I)V")
    void method2490(int arg0, int[] arg1);

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(II)V")
    void method2491(int arg0, int arg1);
}
