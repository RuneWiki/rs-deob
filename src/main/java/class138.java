import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public interface class138 {

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(II)V")
    void method971(int arg0, int arg1);

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(III)V")
    void method972(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Ljava/awt/Component;IIZ)V")
    void method973(Component arg0, int arg1, int arg2, boolean arg3) throws Exception;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IB)V")
    void method974(int arg0, byte arg1);

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(I[I)V")
    void method975(int arg0, int[] arg1);

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(BI)I")
    int method976(byte arg0, int arg1);
}
