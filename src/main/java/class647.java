import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tba")
public interface class647 {

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(II)V")
    void method3720(int arg0, int arg1);

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(III)V")
    void method3721(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(I[I)V")
    void method3722(int arg0, int[] arg1);

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(IZ)V")
    void method3723(int arg0, boolean arg1);

    @OriginalMember(owner = "client!tba", name = "b", descriptor = "(II)I")
    int method3724(int arg0, int arg1);

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(IIZLjava/awt/Component;)V")
    void method3725(int arg0, int arg1, boolean arg2, Component arg3) throws Exception;
}
