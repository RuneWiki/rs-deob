import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public interface class24 {

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IZ)V")
    void method139(int arg0, boolean arg1);

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I[I)V")
    void method140(int arg0, int[] arg1);

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IB)V")
    void method141(int arg0, byte arg1);

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Ljava/awt/Component;ZBI)V")
    void method142(Component arg0, boolean arg1, byte arg2, int arg3) throws Exception;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(III)V")
    void method143(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(BI)I")
    int method144(byte arg0, int arg1);
}
