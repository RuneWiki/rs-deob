import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public interface class147 {

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ZI)V")
    void method1170(boolean arg0, int arg1);

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IB)I")
    int method1171(int arg0, byte arg1);

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ZLjava/awt/Component;II)V")
    void method1172(boolean arg0, Component arg1, int arg2, int arg3) throws Exception;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(III)V")
    void method1173(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I[I)V")
    void method1174(int arg0, int[] arg1);

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(BI)V")
    void method1175(byte arg0, int arg1);
}
