import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public interface class480 {

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I[I)V")
    void method2931(int arg0, int[] arg1);

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IILjava/awt/Component;Z)V")
    void method2932(int arg0, int arg1, Component arg2, boolean arg3) throws Exception;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IB)V")
    void method2933(int arg0, byte arg1);

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(BI)I")
    int method2934(byte arg0, int arg1);

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(II)V")
    void method2935(int arg0, int arg1);

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(BII)V")
    void method2936(byte arg0, int arg1, int arg2) throws Exception;
}
