import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public interface class173 {

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IBI)V")
    void method1202(int arg0, byte arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(II)V")
    void method1203(int arg0, int arg1);

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(ZI)I")
    int method1204(boolean arg0, int arg1);

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(BI)V")
    void method1205(byte arg0, int arg1);

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(I[I)V")
    void method1206(int arg0, int[] arg1);

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(ZZILjava/awt/Component;)V")
    void method1207(boolean arg0, boolean arg1, int arg2, Component arg3) throws Exception;
}
