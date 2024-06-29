import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public interface class144 {

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IZLjava/awt/Component;I)V")
    void method1106(int arg0, boolean arg1, Component arg2, int arg3) throws Exception;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(III)V")
    void method1107(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IB)V")
    void method1108(int arg0, byte arg1);

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(II)I")
    int method1109(int arg0, int arg1);

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I[I)V")
    void method1110(int arg0, int[] arg1);

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(II)V")
    void method1111(int arg0, int arg1);
}
