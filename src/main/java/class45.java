import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public interface class45 {

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)V")
    void method296(int arg0, int arg1);

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(III)V")
    void method297(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(BI)V")
    void method298(byte arg0, int arg1);

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I[I)V")
    void method299(int arg0, int[] arg1);

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(BI)I")
    int method300(byte arg0, int arg1);

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZILjava/awt/Component;I)V")
    void method301(boolean arg0, int arg1, Component arg2, int arg3) throws Exception;
}
