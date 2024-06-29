import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public interface class232 {

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(ZI)I")
    int method1624(boolean arg0, int arg1);

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(BI)V")
    void method1625(byte arg0, int arg1);

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(II)V")
    void method1626(int arg0, int arg1);

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(ZII)V")
    void method1627(boolean arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(I[I)V")
    void method1628(int arg0, int[] arg1);

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Ljava/awt/Component;BZI)V")
    void method1629(Component arg0, byte arg1, boolean arg2, int arg3) throws Exception;
}
