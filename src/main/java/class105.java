import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public interface class105 {

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZILjava/awt/Component;I)V")
    void method703(boolean arg0, int arg1, Component arg2, int arg3) throws Exception;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I[I)V")
    void method704(int arg0, int[] arg1);

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)V")
    void method705(int arg0, int arg1);

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(II)I")
    int method706(int arg0, int arg1);

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(III)V")
    void method707(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "(II)V")
    void method708(int arg0, int arg1);
}
