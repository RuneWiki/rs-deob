import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public interface class678 {

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(III)V")
    void method2591(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(I[I)V")
    void method2590(int arg0, int[] arg1);

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(II)V")
    void method2592(int arg0, int arg1);

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(II)V")
    void method2588(int arg0, int arg1);

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IZLjava/awt/Component;I)V")
    void method2593(int arg0, boolean arg1, Component arg2, int arg3) throws Exception;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IB)I")
    int method2589(int arg0, byte arg1);
}
