import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public interface class59 {

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)V")
    void method410(int arg0, int arg1);

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I[I)V")
    void method411(int arg0, int[] arg1);

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IB)I")
    int method412(int arg0, byte arg1);

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IZLjava/awt/Component;I)V")
    void method413(int arg0, boolean arg1, Component arg2, int arg3) throws Exception;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IBI)V")
    void method414(int arg0, byte arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(II)V")
    void method415(int arg0, int arg1);
}
