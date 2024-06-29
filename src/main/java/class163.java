import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public interface class163 {

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(ILjava/awt/Component;ZI)V")
    void method1268(int arg0, Component arg1, boolean arg2, int arg3) throws Exception;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IB)V")
    void method1269(int arg0, byte arg1);

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(III)V")
    void method1270(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(I[I)V")
    void method1271(int arg0, int[] arg1);

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(IB)I")
    int method1272(int arg0, byte arg1);

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(II)V")
    void method1273(int arg0, int arg1);
}
