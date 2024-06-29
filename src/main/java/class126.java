import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public interface class126 {

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(II)I")
    int method984(int arg0, int arg1);

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(BI)V")
    void method985(byte arg0, int arg1);

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILjava/awt/Component;IZ)V")
    void method986(int arg0, Component arg1, int arg2, boolean arg3) throws Exception;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IZI)V")
    void method987(int arg0, boolean arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I[I)V")
    void method988(int arg0, int[] arg1);

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(BI)V")
    void method989(byte arg0, int arg1);
}
