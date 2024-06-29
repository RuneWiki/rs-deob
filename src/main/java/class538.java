import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public interface class538 {

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(BI)V")
    void method3163(byte arg0, int arg1);

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(II)I")
    int method3164(int arg0, int arg1);

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(BILjava/awt/Component;Z)V")
    void method3165(byte arg0, int arg1, Component arg2, boolean arg3) throws Exception;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IB)V")
    void method3166(int arg0, byte arg1);

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(III)V")
    void method3167(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(I[I)V")
    void method3168(int arg0, int[] arg1);
}
