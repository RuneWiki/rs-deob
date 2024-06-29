import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public interface class420 {

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(II)V")
    void method2416(int arg0, int arg1);

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I[I)V")
    void method2421(int arg0, int[] arg1);

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(III)V")
    void method2419(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IBLjava/awt/Component;Z)V")
    void method2420(int arg0, byte arg1, Component arg2, boolean arg3) throws Exception;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(BI)V")
    void method2417(byte arg0, int arg1);

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IZ)I")
    int method2418(int arg0, boolean arg1);
}
