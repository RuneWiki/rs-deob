import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public interface class48 {

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IB)V")
    void method541(int arg0, byte arg1);

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(BI)I")
    int method542(byte arg0, int arg1);

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IZLjava/awt/Component;I)V")
    void method543(int arg0, boolean arg1, Component arg2, int arg3) throws Exception;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(III)V")
    void method544(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I[I)V")
    void method545(int arg0, int[] arg1);

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(II)V")
    void method546(int arg0, int arg1);
}
