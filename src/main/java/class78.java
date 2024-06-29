import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public interface class78 {

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(II)I")
    int method411(int arg0, int arg1);

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Ljava/awt/Component;ZII)V")
    void method412(Component arg0, boolean arg1, int arg2, int arg3) throws Exception;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(I[I)V")
    void method413(int arg0, int[] arg1);

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(III)V")
    void method414(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(BI)V")
    void method415(byte arg0, int arg1);

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(II)V")
    void method416(int arg0, int arg1);
}
