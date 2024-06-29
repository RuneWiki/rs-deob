import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public interface class212 {

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(IB)V")
    void method1361(int arg0, byte arg1);

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(IBI)V")
    void method1362(int arg0, byte arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(II)V")
    void method1363(int arg0, int arg1);

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(IZ)I")
    int method1364(int arg0, boolean arg1);

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(BILjava/awt/Component;Z)V")
    void method1365(byte arg0, int arg1, Component arg2, boolean arg3) throws Exception;

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(I[I)V")
    void method1366(int arg0, int[] arg1);
}
