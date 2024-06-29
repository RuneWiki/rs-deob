import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public interface class242 {

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I[I)V")
    void method1599(int arg0, int[] arg1);

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(II)V")
    void method1600(int arg0, int arg1);

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ZLjava/awt/Component;IZ)V")
    void method1601(boolean arg0, Component arg1, int arg2, boolean arg3) throws Exception;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(III)V")
    void method1602(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(II)V")
    void method1603(int arg0, int arg1);

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IB)I")
    int method1604(int arg0, byte arg1);
}
