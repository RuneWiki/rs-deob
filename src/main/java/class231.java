import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public interface class231 {

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILjava/awt/Component;ZZ)V")
    void method1670(int arg0, Component arg1, boolean arg2, boolean arg3) throws Exception;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IB)V")
    void method1671(int arg0, byte arg1);

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(II)I")
    int method1672(int arg0, int arg1);

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(I[I)V")
    void method1673(int arg0, int[] arg1);

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(III)V")
    void method1674(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(II)V")
    void method1675(int arg0, int arg1);
}
