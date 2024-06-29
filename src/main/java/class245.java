import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public interface class245 {

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILjava/awt/Component;ZB)V")
    void method1662(int arg0, Component arg1, boolean arg2, byte arg3) throws Exception;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I[I)V")
    void method1663(int arg0, int[] arg1);

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)I")
    int method1664(int arg0, int arg1);

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(II)V")
    void method1665(int arg0, int arg1);

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIB)V")
    void method1666(int arg0, int arg1, byte arg2) throws Exception;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(BI)V")
    void method1667(byte arg0, int arg1);
}
