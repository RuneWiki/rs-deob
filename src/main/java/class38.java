import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public interface class38 {

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(ILjava/awt/Component;ZZ)V")
    void method193(int arg0, Component arg1, boolean arg2, boolean arg3) throws Exception;

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(IZI)V")
    void method194(int arg0, boolean arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(II)V")
    void method195(int arg0, int arg1);

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(I[I)V")
    void method196(int arg0, int[] arg1);

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(IB)I")
    int method197(int arg0, byte arg1);

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "(IB)V")
    void method198(int arg0, byte arg1);
}
