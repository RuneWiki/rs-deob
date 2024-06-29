import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public interface class60 {

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(II)V")
    void method457(int arg0, int arg1);

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(III)V")
    void method458(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I[I)V")
    void method459(int arg0, int[] arg1);

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(II)I")
    int method460(int arg0, int arg1);

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Ljava/awt/Component;ZIB)V")
    void method461(Component arg0, boolean arg1, int arg2, byte arg3) throws Exception;

    @OriginalMember(owner = "client!id", name = "c", descriptor = "(II)V")
    void method462(int arg0, int arg1);
}
