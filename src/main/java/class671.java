import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fv")
public interface class671 {

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(II)V")
    void method3017(int arg0, int arg1);

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(ZIILjava/awt/Component;)V")
    void method3016(boolean arg0, int arg1, int arg2, Component arg3) throws Exception;

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(I[I)V")
    void method3014(int arg0, int[] arg1);

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(III)V")
    void method3019(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(BI)V")
    void method3015(byte arg0, int arg1);

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "(II)I")
    int method3018(int arg0, int arg1);
}
