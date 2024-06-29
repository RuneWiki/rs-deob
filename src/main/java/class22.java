import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public interface class22 {

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(II)I")
    int method97(int arg0, int arg1);

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "(II)V")
    void method98(int arg0, int arg1);

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(I[I)V")
    void method99(int arg0, int[] arg1);

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(IZLjava/awt/Component;I)V")
    void method100(int arg0, boolean arg1, Component arg2, int arg3) throws Exception;

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(IB)V")
    void method101(int arg0, byte arg1);

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(IIZ)V")
    void method102(int arg0, int arg1, boolean arg2) throws Exception;
}
