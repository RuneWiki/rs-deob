import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public interface class186 {

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(I[I)V")
    void method1295(int arg0, int[] arg1);

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(II)V")
    void method1296(int arg0, int arg1);

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(III)V")
    void method1297(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(ZILjava/awt/Component;I)V")
    void method1298(boolean arg0, int arg1, Component arg2, int arg3) throws Exception;

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(II)I")
    int method1299(int arg0, int arg1);

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "(II)V")
    void method1300(int arg0, int arg1);
}
