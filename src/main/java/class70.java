import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public interface class70 {

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILjava/awt/Component;ZI)V")
    void method457(int arg0, Component arg1, boolean arg2, int arg3) throws Exception;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)I")
    int method458(int arg0, int arg1);

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZI)V")
    void method459(boolean arg0, int arg1);

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(BII)V")
    void method460(byte arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(II)V")
    void method461(int arg0, int arg1);

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I[I)V")
    void method462(int arg0, int[] arg1);
}
