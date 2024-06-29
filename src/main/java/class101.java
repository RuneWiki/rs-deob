import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public interface class101 {

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)I")
    int method641(int arg0, int arg1);

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I[I)V")
    void method642(int arg0, int[] arg1);

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(II)V")
    void method643(int arg0, int arg1);

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZBLjava/awt/Component;I)V")
    void method644(boolean arg0, byte arg1, Component arg2, int arg3) throws Exception;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(BI)V")
    void method645(byte arg0, int arg1);

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(III)V")
    void method646(int arg0, int arg1, int arg2) throws Exception;
}
