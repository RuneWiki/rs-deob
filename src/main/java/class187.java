import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public interface class187 {

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(I[I)V")
    void method1360(int arg0, int[] arg1);

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(II)I")
    int method1361(int arg0, int arg1);

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IBI)V")
    void method1362(int arg0, byte arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IILjava/awt/Component;Z)V")
    void method1363(int arg0, int arg1, Component arg2, boolean arg3) throws Exception;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(BI)V")
    void method1364(byte arg0, int arg1);

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ZI)V")
    void method1365(boolean arg0, int arg1);
}
