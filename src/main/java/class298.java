import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public interface class298 {

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ZIILjava/awt/Component;)V")
    void method1887(boolean arg0, int arg1, int arg2, Component arg3) throws Exception;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(BI)V")
    void method1888(byte arg0, int arg1);

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I[I)V")
    void method1889(int arg0, int[] arg1);

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(III)V")
    void method1890(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(II)I")
    int method1891(int arg0, int arg1);

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(II)V")
    void method1892(int arg0, int arg1);
}
