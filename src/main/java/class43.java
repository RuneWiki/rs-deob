import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public interface class43 {

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IZ)V")
    void method291(int arg0, boolean arg1);

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(BII)V")
    void method292(byte arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(I[I)V")
    void method293(int arg0, int[] arg1);

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IILjava/awt/Component;Z)V")
    void method294(int arg0, int arg1, Component arg2, boolean arg3) throws Exception;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(II)I")
    int method295(int arg0, int arg1);

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(II)V")
    void method296(int arg0, int arg1);
}
