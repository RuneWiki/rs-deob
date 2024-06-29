import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public interface class22 {

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(II)I")
    int method157(int arg0, int arg1);

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(III)V")
    void method158(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(ILjava/awt/Component;IZ)V")
    void method159(int arg0, Component arg1, int arg2, boolean arg3) throws Exception;

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(II)V")
    void method160(int arg0, int arg1);

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I[I)V")
    void method161(int arg0, int[] arg1);

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(BI)V")
    void method162(byte arg0, int arg1);
}
