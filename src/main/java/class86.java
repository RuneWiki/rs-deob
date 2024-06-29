import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public interface class86 {

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZZILjava/awt/Component;)V")
    void method635(boolean arg0, boolean arg1, int arg2, Component arg3) throws Exception;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(III)V")
    void method636(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I[I)V")
    void method637(int arg0, int[] arg1);

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IB)V")
    void method638(int arg0, byte arg1);

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)V")
    void method639(int arg0, int arg1);

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(II)I")
    int method640(int arg0, int arg1);
}
