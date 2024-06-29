import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public interface class514 {

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IZLjava/awt/Component;Z)V")
    void method3045(int arg0, boolean arg1, Component arg2, boolean arg3) throws Exception;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(I[I)V")
    void method3046(int arg0, int[] arg1);

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IB)I")
    int method3047(int arg0, byte arg1);

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(II)V")
    void method3048(int arg0, int arg1);

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(IB)V")
    void method3049(int arg0, byte arg1);

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(BII)V")
    void method3050(byte arg0, int arg1, int arg2) throws Exception;
}
