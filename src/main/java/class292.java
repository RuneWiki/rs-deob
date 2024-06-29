import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gga")
public interface class292 {

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(II)V")
    void method659(int arg0, int arg1);

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(I[I)V")
    void method657(int arg0, int[] arg1);

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(IB)V")
    void method662(int arg0, byte arg1);

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(ZBLjava/awt/Component;I)V")
    void method661(boolean arg0, byte arg1, Component arg2, int arg3) throws Exception;

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(BI)I")
    int method658(byte arg0, int arg1);

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(III)V")
    void method660(int arg0, int arg1, int arg2) throws Exception;
}
