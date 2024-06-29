import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public interface class122 {

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IZI)V")
    void method923(int arg0, boolean arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IB)I")
    int method924(int arg0, byte arg1);

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)V")
    void method925(int arg0, int arg1);

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(II)V")
    void method926(int arg0, int arg1);

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I[I)V")
    void method927(int arg0, int[] arg1);

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IZLjava/awt/Component;I)V")
    void method928(int arg0, boolean arg1, Component arg2, int arg3) throws Exception;
}
