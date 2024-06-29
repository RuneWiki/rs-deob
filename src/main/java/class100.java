import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public interface class100 {

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(III)V")
    void method769(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIZLjava/awt/Component;)V")
    void method770(int arg0, int arg1, boolean arg2, Component arg3) throws Exception;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(BI)I")
    int method771(byte arg0, int arg1);

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)V")
    void method772(int arg0, int arg1);

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ZI)V")
    void method773(boolean arg0, int arg1);

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I[I)V")
    void method774(int arg0, int[] arg1);
}
