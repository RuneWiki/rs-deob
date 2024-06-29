import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iba")
public interface class238 {

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(II)V")
    void method1274(int arg0, int arg1);

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(IB)I")
    int method1273(int arg0, byte arg1);

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(III)V")
    void method1271(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(ILjava/awt/Component;ZB)V")
    void method1275(int arg0, Component arg1, boolean arg2, byte arg3) throws Exception;

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(I[I)V")
    void method1272(int arg0, int[] arg1);

    @OriginalMember(owner = "client!iba", name = "b", descriptor = "(II)V")
    void method1276(int arg0, int arg1);
}
