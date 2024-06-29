import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public interface class203 {

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IZ)V")
    void method1347(int arg0, boolean arg1);

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ILjava/awt/Component;IZ)V")
    void method1348(int arg0, Component arg1, int arg2, boolean arg3) throws Exception;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(I[I)V")
    void method1349(int arg0, int[] arg1);

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(II)V")
    void method1350(int arg0, int arg1);

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IB)I")
    int method1351(int arg0, byte arg1);

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ZII)V")
    void method1352(boolean arg0, int arg1, int arg2) throws Exception;
}
