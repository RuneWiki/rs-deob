import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public interface class446 {

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(ZILjava/awt/Component;I)V")
    void method2758(boolean arg0, int arg1, Component arg2, int arg3) throws Exception;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IZI)V")
    void method2759(int arg0, boolean arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(II)V")
    void method2760(int arg0, int arg1);

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IZ)V")
    void method2761(int arg0, boolean arg1);

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(II)I")
    int method2762(int arg0, int arg1);

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I[I)V")
    void method2763(int arg0, int[] arg1);
}
