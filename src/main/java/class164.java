import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public interface class164 {

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ZI)V")
    void method1028(boolean arg0, int arg1);

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(III)V")
    void method1029(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(II)I")
    int method1030(int arg0, int arg1);

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(II)V")
    void method1031(int arg0, int arg1);

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(I[I)V")
    void method1032(int arg0, int[] arg1);

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Ljava/awt/Component;IZI)V")
    void method1033(Component arg0, int arg1, boolean arg2, int arg3) throws Exception;
}
