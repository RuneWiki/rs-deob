import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public interface class62 {

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(I[I)V")
    void method450(int arg0, int[] arg1);

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(II)V")
    void method451(int arg0, int arg1);

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(II)V")
    void method452(int arg0, int arg1);

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(III)V")
    void method453(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!j", name = "c", descriptor = "(II)I")
    int method454(int arg0, int arg1);

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ILjava/awt/Component;IZ)V")
    void method455(int arg0, Component arg1, int arg2, boolean arg3) throws Exception;
}
