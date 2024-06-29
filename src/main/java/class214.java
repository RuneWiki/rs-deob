import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public interface class214 {

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I[I)V")
    void method1418(int arg0, int[] arg1);

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(BII)V")
    void method1419(byte arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IBLjava/awt/Component;Z)V")
    void method1420(int arg0, byte arg1, Component arg2, boolean arg3) throws Exception;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(II)I")
    int method1421(int arg0, int arg1);

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(II)V")
    void method1422(int arg0, int arg1);

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IB)V")
    void method1423(int arg0, byte arg1);
}
