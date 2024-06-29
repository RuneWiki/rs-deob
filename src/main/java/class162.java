import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public interface class162 {

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IB)V")
    void method1094(int arg0, byte arg1);

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Ljava/awt/Component;ZIB)V")
    void method1095(Component arg0, boolean arg1, int arg2, byte arg3) throws Exception;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(II)V")
    void method1096(int arg0, int arg1);

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(III)V")
    void method1097(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(I[I)V")
    void method1098(int arg0, int[] arg1);

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(II)I")
    int method1099(int arg0, int arg1);
}
