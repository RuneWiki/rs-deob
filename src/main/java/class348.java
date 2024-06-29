import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public interface class348 {

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(II)V")
    void method2059(int arg0, int arg1);

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IZI)V")
    void method2060(int arg0, boolean arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(ZLjava/awt/Component;IZ)V")
    void method2061(boolean arg0, Component arg1, int arg2, boolean arg3) throws Exception;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I[I)V")
    void method2062(int arg0, int[] arg1);

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(II)V")
    void method2063(int arg0, int arg1);

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "(II)I")
    int method2064(int arg0, int arg1);
}
