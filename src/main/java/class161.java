import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public interface class161 {

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(BII)V")
    void method1029(byte arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Ljava/awt/Component;ZBI)V")
    void method1030(Component arg0, boolean arg1, byte arg2, int arg3) throws Exception;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(BI)V")
    void method1031(byte arg0, int arg1);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(II)V")
    void method1032(int arg0, int arg1);

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(II)I")
    int method1033(int arg0, int arg1);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I[I)V")
    void method1034(int arg0, int[] arg1);
}
