import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public interface class34 {

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(II)I")
    int method201(int arg0, int arg1);

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(II)V")
    void method202(int arg0, int arg1);

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IZZLjava/awt/Component;)V")
    void method203(int arg0, boolean arg1, boolean arg2, Component arg3) throws Exception;

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "(II)V")
    void method204(int arg0, int arg1);

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIB)V")
    void method205(int arg0, int arg1, byte arg2) throws Exception;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(I[I)V")
    void method206(int arg0, int[] arg1);
}
