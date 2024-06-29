import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public interface class92 {

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I[I)V")
    void method629(int arg0, int[] arg1);

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIB)V")
    void method630(int arg0, int arg1, byte arg2) throws Exception;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(ZIZLjava/awt/Component;)V")
    void method631(boolean arg0, int arg1, boolean arg2, Component arg3) throws Exception;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(ZI)I")
    int method632(boolean arg0, int arg1);

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(II)V")
    void method633(int arg0, int arg1);

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(BI)V")
    void method634(byte arg0, int arg1);
}
