import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public interface class110 {

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ZII)V")
    void method703(boolean arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I[I)V")
    void method704(int arg0, int[] arg1);

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Ljava/awt/Component;IZI)V")
    void method705(Component arg0, int arg1, boolean arg2, int arg3) throws Exception;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(II)V")
    void method706(int arg0, int arg1);

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(II)I")
    int method707(int arg0, int arg1);

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "(II)V")
    void method708(int arg0, int arg1);
}
