import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public interface class649 {

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)I")
    int method2176(int arg0, int arg1);

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Ljava/awt/Component;IBZ)V")
    void method2179(Component arg0, int arg1, byte arg2, boolean arg3) throws Exception;

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(II)V")
    void method2180(int arg0, int arg1);

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(III)V")
    void method2175(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(II)V")
    void method2178(int arg0, int arg1);

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I[I)V")
    void method2177(int arg0, int[] arg1);
}
