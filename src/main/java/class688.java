import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public interface class688 {

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(BII)V")
    void method1362(byte arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(ZLjava/awt/Component;II)V")
    void method1366(boolean arg0, Component arg1, int arg2, int arg3) throws Exception;

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(II)I")
    int method1364(int arg0, int arg1);

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(IB)V")
    void method1365(int arg0, byte arg1);

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "(II)V")
    void method1361(int arg0, int arg1);

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(I[I)V")
    void method1363(int arg0, int[] arg1);
}
