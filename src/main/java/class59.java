import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public interface class59 {

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I[I)V")
    void method450(int arg0, int[] arg1);

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(BI)V")
    void method451(byte arg0, int arg1);

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)V")
    void method452(int arg0, int arg1);

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(III)V")
    void method453(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IZBLjava/awt/Component;)V")
    void method454(int arg0, boolean arg1, byte arg2, Component arg3) throws Exception;

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(II)I")
    int method455(int arg0, int arg1);
}
