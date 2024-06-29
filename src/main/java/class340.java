import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fda")
public interface class340 {

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(III)V")
    void method2154(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(I[I)V")
    void method2155(int arg0, int[] arg1);

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(IZ)V")
    void method2156(int arg0, boolean arg1);

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(II)I")
    int method2157(int arg0, int arg1);

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(IIZLjava/awt/Component;)V")
    void method2158(int arg0, int arg1, boolean arg2, Component arg3) throws Exception;

    @OriginalMember(owner = "client!fda", name = "b", descriptor = "(II)V")
    void method2159(int arg0, int arg1);
}
