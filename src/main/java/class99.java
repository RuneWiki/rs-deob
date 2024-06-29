import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public interface class99 {

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IZ)V")
    void method779(int arg0, boolean arg1) throws Exception;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)I")
    int method780(byte arg0);

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(B)V")
    void method781(byte arg0);

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    void method782(Component arg0, byte arg1) throws Exception;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "([I)V")
    void method783(int[] arg0);
}
