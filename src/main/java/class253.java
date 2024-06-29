import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public interface class253 {

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(ZILjava/awt/Component;I)V")
    void method1516(boolean arg0, int arg1, Component arg2, int arg3) throws Exception;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(BI)V")
    void method1517(byte arg0, int arg1);

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(I[I)V")
    void method1518(int arg0, int[] arg1);

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIZ)V")
    void method1519(int arg0, int arg1, boolean arg2) throws Exception;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(ZI)V")
    void method1520(boolean arg0, int arg1);

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(ZI)I")
    int method1521(boolean arg0, int arg1);
}
