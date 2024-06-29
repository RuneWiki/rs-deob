import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public interface class25 {

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(I[I)V")
    void method220(int arg0, int[] arg1);

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(II)V")
    void method221(int arg0, int arg1);

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIZLjava/awt/Component;)V")
    void method222(int arg0, int arg1, boolean arg2, Component arg3) throws Exception;

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(II)V")
    void method223(int arg0, int arg1);

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIZ)V")
    void method224(int arg0, int arg1, boolean arg2) throws Exception;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ZI)I")
    int method225(boolean arg0, int arg1);
}
