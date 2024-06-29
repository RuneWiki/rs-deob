import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public interface class22 {

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(BI)I")
    int method201(byte arg0, int arg1);

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(II)V")
    void method202(int arg0, int arg1);

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I[I)V")
    void method203(int arg0, int[] arg1);

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IB)V")
    void method204(int arg0, byte arg1);

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(III)V")
    void method205(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IZILjava/awt/Component;)V")
    void method206(int arg0, boolean arg1, int arg2, Component arg3) throws Exception;
}
