import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public interface class365 {

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IILjava/awt/Component;Z)V")
    void method2134(int arg0, int arg1, Component arg2, boolean arg3) throws Exception;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(BII)V")
    void method2135(byte arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(II)I")
    int method2136(int arg0, int arg1);

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(II)V")
    void method2137(int arg0, int arg1);

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IZ)V")
    void method2138(int arg0, boolean arg1);

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I[I)V")
    void method2139(int arg0, int[] arg1);
}
