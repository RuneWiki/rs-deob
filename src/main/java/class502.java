import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public interface class502 {

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Ljava/awt/Component;ZII)V")
    void method2994(Component arg0, boolean arg1, int arg2, int arg3) throws Exception;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(II)I")
    int method2995(int arg0, int arg1);

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IZ)V")
    void method2996(int arg0, boolean arg1);

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I[I)V")
    void method2997(int arg0, int[] arg1);

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(II)V")
    void method2998(int arg0, int arg1);

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(BII)V")
    void method2999(byte arg0, int arg1, int arg2) throws Exception;
}
