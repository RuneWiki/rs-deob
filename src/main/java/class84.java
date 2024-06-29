import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public interface class84 {

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(BI)V")
    void method606(byte arg0, int arg1);

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(BI)V")
    void method607(byte arg0, int arg1);

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IILjava/awt/Component;Z)V")
    void method608(int arg0, int arg1, Component arg2, boolean arg3) throws Exception;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ZII)V")
    void method609(boolean arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I[I)V")
    void method610(int arg0, int[] arg1);

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "(BI)I")
    int method611(byte arg0, int arg1);
}
