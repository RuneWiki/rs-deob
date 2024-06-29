import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public interface class751 {

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(II)V")
    void method1565(int arg0, int arg1);

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(BLjava/awt/Component;IZ)V")
    void method1563(byte arg0, Component arg1, int arg2, boolean arg3) throws Exception;

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(IZ)I")
    int method1566(int arg0, boolean arg1);

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(III)V")
    void method1561(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(ZI)V")
    void method1562(boolean arg0, int arg1);

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(I[I)V")
    void method1564(int arg0, int[] arg1);
}
