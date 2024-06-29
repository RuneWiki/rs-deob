import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!waa")
public interface class702 {

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(III)V")
    void method1156(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(BI)V")
    void method1159(byte arg0, int arg1);

    @OriginalMember(owner = "client!waa", name = "b", descriptor = "(BI)I")
    int method1158(byte arg0, int arg1);

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(Ljava/awt/Component;ZII)V")
    void method1161(Component arg0, boolean arg1, int arg2, int arg3) throws Exception;

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(IB)V")
    void method1157(int arg0, byte arg1);

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(I[I)V")
    void method1160(int arg0, int[] arg1);
}
