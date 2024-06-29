import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public interface class366 {

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IZBLjava/awt/Component;)V")
    void method2349(int arg0, boolean arg1, byte arg2, Component arg3) throws Exception;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I[I)V")
    void method2350(int arg0, int[] arg1);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(II)V")
    void method2351(int arg0, int arg1);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(III)V")
    void method2352(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(II)V")
    void method2353(int arg0, int arg1);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(BI)I")
    int method2354(byte arg0, int arg1);
}
