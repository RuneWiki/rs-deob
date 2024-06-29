import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public interface class662 {

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(BI)V")
    void method1754(byte arg0, int arg1);

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(II)I")
    int method1755(int arg0, int arg1);

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)V")
    void method1756(int arg0, int arg1);

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(III)V")
    void method1753(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I[I)V")
    void method1758(int arg0, int[] arg1);

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ZZLjava/awt/Component;I)V")
    void method1757(boolean arg0, boolean arg1, Component arg2, int arg3) throws Exception;
}
