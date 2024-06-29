import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public interface class118 {

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(II)V")
    void method926(int arg0, int arg1);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I[I)V")
    void method927(int arg0, int[] arg1);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ZIILjava/awt/Component;)V")
    void method928(boolean arg0, int arg1, int arg2, Component arg3) throws Exception;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IBI)V")
    void method929(int arg0, byte arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ZI)I")
    int method930(boolean arg0, int arg1);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IB)V")
    void method931(int arg0, byte arg1);
}
