import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public interface class306 {

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(II)V")
    void method2122(int arg0, int arg1);

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I[I)V")
    void method2123(int arg0, int[] arg1);

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ZIILjava/awt/Component;)V")
    void method2124(boolean arg0, int arg1, int arg2, Component arg3) throws Exception;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(BI)V")
    void method2125(byte arg0, int arg1);

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(BI)I")
    int method2126(byte arg0, int arg1);

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(III)V")
    void method2127(int arg0, int arg1, int arg2) throws Exception;
}
