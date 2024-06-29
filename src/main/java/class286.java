import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public interface class286 {

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(II)I")
    int method2057(int arg0, int arg1);

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Ljava/awt/Component;ZII)V")
    void method2058(Component arg0, boolean arg1, int arg2, int arg3) throws Exception;

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(II)V")
    void method2059(int arg0, int arg1);

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(I[I)V")
    void method2060(int arg0, int[] arg1);

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(BI)V")
    void method2061(byte arg0, int arg1);

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(III)V")
    void method2062(int arg0, int arg1, int arg2) throws Exception;
}
