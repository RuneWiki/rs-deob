import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public interface class16 {

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(II)I")
    int method101(int arg0, int arg1);

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(II)V")
    void method102(int arg0, int arg1);

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(BII)V")
    void method103(byte arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(BI)V")
    void method104(byte arg0, int arg1);

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I[I)V")
    void method105(int arg0, int[] arg1);

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ZILjava/awt/Component;B)V")
    void method106(boolean arg0, int arg1, Component arg2, byte arg3) throws Exception;
}
