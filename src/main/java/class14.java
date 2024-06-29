import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public interface class14 {

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I[I)V")
    void method91(int arg0, int[] arg1);

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(II)V")
    void method92(int arg0, int arg1);

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIZ)V")
    void method93(int arg0, int arg1, boolean arg2) throws Exception;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZILjava/awt/Component;I)V")
    void method94(boolean arg0, int arg1, Component arg2, int arg3) throws Exception;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IB)I")
    int method95(int arg0, byte arg1);

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(II)V")
    void method96(int arg0, int arg1);
}
