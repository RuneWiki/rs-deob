import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public interface class635 {

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(IZ)V")
    void method3684(int arg0, boolean arg1);

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(ZLjava/awt/Component;BI)V")
    void method3685(boolean arg0, Component arg1, byte arg2, int arg3) throws Exception;

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(II)V")
    void method3686(int arg0, int arg1);

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(IBI)V")
    void method3687(int arg0, byte arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(I[I)V")
    void method3688(int arg0, int[] arg1);

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(BI)I")
    int method3689(byte arg0, int arg1);
}
