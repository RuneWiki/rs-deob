import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public interface class48 {

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(BI)V")
    void method417(byte arg0, int arg1);

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(II)I")
    int method418(int arg0, int arg1);

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(I[I)V")
    void method419(int arg0, int[] arg1);

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IB)V")
    void method420(int arg0, byte arg1);

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Ljava/awt/Component;BZI)V")
    void method421(Component arg0, byte arg1, boolean arg2, int arg3) throws Exception;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(III)V")
    void method422(int arg0, int arg1, int arg2) throws Exception;
}
