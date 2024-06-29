import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public interface class269 {

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(II)V")
    void method1972(int arg0, int arg1);

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(IBI)V")
    void method1973(int arg0, byte arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(ZI)V")
    void method1974(boolean arg0, int arg1);

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(II)I")
    int method1975(int arg0, int arg1);

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Ljava/awt/Component;ZII)V")
    void method1976(Component arg0, boolean arg1, int arg2, int arg3) throws Exception;

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(I[I)V")
    void method1977(int arg0, int[] arg1);
}
