import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public interface class191 {

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(II)V")
    void method1336(int arg0, int arg1);

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(ILjava/awt/Component;ZI)V")
    void method1337(int arg0, Component arg1, boolean arg2, int arg3) throws Exception;

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(II)V")
    void method1338(int arg0, int arg1);

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I[I)V")
    void method1339(int arg0, int[] arg1);

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIZ)V")
    void method1340(int arg0, int arg1, boolean arg2) throws Exception;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(BI)I")
    int method1341(byte arg0, int arg1);
}
