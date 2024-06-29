import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public interface class140 {

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)V")
    void method974(int arg0, int arg1);

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZILjava/awt/Component;Z)V")
    void method975(boolean arg0, int arg1, Component arg2, boolean arg3) throws Exception;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I[I)V")
    void method976(int arg0, int[] arg1);

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(II)I")
    int method977(int arg0, int arg1);

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IB)V")
    void method978(int arg0, byte arg1);

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIZ)V")
    void method979(int arg0, int arg1, boolean arg2) throws Exception;
}
