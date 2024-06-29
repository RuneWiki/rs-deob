import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lt")
public interface class703 {

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(III)V")
    void method4156(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(I[I)V")
    void method4158(int arg0, int[] arg1);

    @OriginalMember(owner = "client!lt", name = "c", descriptor = "(II)I")
    int method4154(int arg0, int arg1);

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(II)V")
    void method4153(int arg0, int arg1);

    @OriginalMember(owner = "client!lt", name = "b", descriptor = "(II)V")
    void method4157(int arg0, int arg1);

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(IIZLjava/awt/Component;)V")
    void method4155(int arg0, int arg1, boolean arg2, Component arg3) throws Exception;
}
