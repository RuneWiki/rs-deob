import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public interface class690 {

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(II)V")
    void method1125(int arg0, int arg1);

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(II)V")
    void method1124(int arg0, int arg1);

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(ZII)V")
    void method1127(boolean arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "(II)I")
    int method1123(int arg0, int arg1);

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(I[I)V")
    void method1126(int arg0, int[] arg1);

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Ljava/awt/Component;IZI)V")
    void method1128(Component arg0, int arg1, boolean arg2, int arg3) throws Exception;
}
