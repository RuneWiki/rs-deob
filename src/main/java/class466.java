import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public interface class466 {

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)V")
    void method2449(int arg0, int arg1);

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(II)I")
    int method2448(int arg0, int arg1);

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(III)V")
    void method2445(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(BI)V")
    void method2447(byte arg0, int arg1);

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I[I)V")
    void method2446(int arg0, int[] arg1);

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILjava/awt/Component;BZ)V")
    void method2450(int arg0, Component arg1, byte arg2, boolean arg3) throws Exception;
}
