import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public interface class25 {

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(II)V")
    void method191(int arg0, int arg1);

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(II)V")
    void method192(int arg0, int arg1);

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(III)V")
    void method193(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIZLjava/awt/Component;)V")
    void method194(int arg0, int arg1, boolean arg2, Component arg3) throws Exception;

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "(II)I")
    int method195(int arg0, int arg1);

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I[I)V")
    void method196(int arg0, int[] arg1);
}
