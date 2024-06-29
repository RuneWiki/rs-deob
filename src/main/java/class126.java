import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public interface class126 {

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(ILjava/awt/Component;ZI)V")
    void method909(int arg0, Component arg1, boolean arg2, int arg3) throws Exception;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IBI)V")
    void method910(int arg0, byte arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(II)V")
    void method911(int arg0, int arg1);

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(I[I)V")
    void method912(int arg0, int[] arg1);

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(II)V")
    void method913(int arg0, int arg1);

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IZ)I")
    int method914(int arg0, boolean arg1);
}
