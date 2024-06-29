import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public interface class531 {

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(IIB)V")
    void method3133(int arg0, int arg1, byte arg2) throws Exception;

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(ILjava/awt/Component;ZB)V")
    void method3134(int arg0, Component arg1, boolean arg2, byte arg3) throws Exception;

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(II)V")
    void method3135(int arg0, int arg1);

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(I[I)V")
    void method3136(int arg0, int[] arg1);

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(BI)V")
    void method3137(byte arg0, int arg1);

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "(II)I")
    int method3138(int arg0, int arg1);
}
