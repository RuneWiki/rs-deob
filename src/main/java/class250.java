import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public interface class250 {

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(III)V")
    void method1624(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(ZILjava/awt/Component;I)V")
    void method1625(boolean arg0, int arg1, Component arg2, int arg3) throws Exception;

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(IB)V")
    void method1626(int arg0, byte arg1);

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(II)V")
    void method1627(int arg0, int arg1);

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(BI)I")
    int method1628(byte arg0, int arg1);

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(I[I)V")
    void method1629(int arg0, int[] arg1);
}
