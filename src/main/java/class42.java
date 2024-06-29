import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public interface class42 {

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(III)V")
    void method435(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(II)V")
    void method436(int arg0, int arg1);

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(BI)V")
    void method437(byte arg0, int arg1);

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ZIILjava/awt/Component;)V")
    void method438(boolean arg0, int arg1, int arg2, Component arg3) throws Exception;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I[I)V")
    void method439(int arg0, int[] arg1);

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IB)I")
    int method440(int arg0, byte arg1);
}
