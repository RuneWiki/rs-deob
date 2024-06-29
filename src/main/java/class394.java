import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pu")
public interface class394 {

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(ILjava/awt/Component;ZI)V")
    void method2254(int arg0, Component arg1, boolean arg2, int arg3) throws Exception;

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(II)V")
    void method2255(int arg0, int arg1);

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(I[I)V")
    void method2256(int arg0, int[] arg1);

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(BI)I")
    int method2257(byte arg0, int arg1);

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "(II)V")
    void method2258(int arg0, int arg1);

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(IIZ)V")
    void method2259(int arg0, int arg1, boolean arg2) throws Exception;
}
