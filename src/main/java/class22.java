import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public interface class22 {

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(III)V")
    void method192(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(II)I")
    int method193(int arg0, int arg1);

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(II)V")
    void method194(int arg0, int arg1);

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IZLjava/awt/Component;I)V")
    void method195(int arg0, boolean arg1, Component arg2, int arg3) throws Exception;

    @OriginalMember(owner = "client!d", name = "c", descriptor = "(II)V")
    void method196(int arg0, int arg1);

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I[I)V")
    void method197(int arg0, int[] arg1);
}
