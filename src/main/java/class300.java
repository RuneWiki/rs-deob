import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public interface class300 {

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(II)V")
    void method2031(int arg0, int arg1);

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IZLjava/awt/Component;Z)V")
    void method2032(int arg0, boolean arg1, Component arg2, boolean arg3) throws Exception;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(I[I)V")
    void method2033(int arg0, int[] arg1);

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IIB)V")
    void method2034(int arg0, int arg1, byte arg2) throws Exception;

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(II)V")
    void method2035(int arg0, int arg1);

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IZ)I")
    int method2036(int arg0, boolean arg1);
}
