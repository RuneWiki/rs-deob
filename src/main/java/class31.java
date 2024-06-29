import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public interface class31 {

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IBI)V")
    void method179(int arg0, byte arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BLjava/awt/Component;IZ)V")
    void method180(byte arg0, Component arg1, int arg2, boolean arg3) throws Exception;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ZI)V")
    void method181(boolean arg0, int arg1);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II)I")
    int method182(int arg0, int arg1);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BI)V")
    void method183(byte arg0, int arg1);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I[I)V")
    void method184(int arg0, int[] arg1);
}
