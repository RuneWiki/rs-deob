import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public interface class156 {

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IBI)V")
    void method910(int arg0, byte arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(BILjava/awt/Component;Z)V")
    void method911(byte arg0, int arg1, Component arg2, boolean arg3) throws Exception;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I[I)V")
    void method912(int arg0, int[] arg1);

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)I")
    int method913(int arg0, int arg1);

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IB)V")
    void method914(int arg0, byte arg1);

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(II)V")
    void method915(int arg0, int arg1);
}
