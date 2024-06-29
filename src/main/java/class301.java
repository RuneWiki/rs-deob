import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public interface class301 {

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(BI)I")
    int method1810(byte arg0, int arg1);

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IB)V")
    void method1811(int arg0, byte arg1);

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I[I)V")
    void method1812(int arg0, int[] arg1);

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ZILjava/awt/Component;I)V")
    void method1813(boolean arg0, int arg1, Component arg2, int arg3) throws Exception;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(II)V")
    void method1814(int arg0, int arg1);

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIB)V")
    void method1815(int arg0, int arg1, byte arg2) throws Exception;
}
