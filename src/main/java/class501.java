import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public interface class501 {

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ILjava/awt/Component;ZZ)V")
    void method3016(int arg0, Component arg1, boolean arg2, boolean arg3) throws Exception;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IZ)V")
    void method3017(int arg0, boolean arg1);

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I[I)V")
    void method3018(int arg0, int[] arg1);

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(BII)V")
    void method3019(byte arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)V")
    void method3020(int arg0, int arg1);

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(II)I")
    int method3021(int arg0, int arg1);
}
