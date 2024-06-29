import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public interface class261 {

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(III)V")
    void method1764(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(I[I)V")
    void method1765(int arg0, int[] arg1);

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IZ)I")
    int method1766(int arg0, boolean arg1);

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Ljava/awt/Component;IZI)V")
    void method1767(Component arg0, int arg1, boolean arg2, int arg3) throws Exception;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(II)V")
    void method1768(int arg0, int arg1);

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ZI)V")
    void method1769(boolean arg0, int arg1);
}
