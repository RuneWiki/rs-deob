import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public interface class213 {

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(II)V")
    void method1429(int arg0, int arg1);

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(III)V")
    void method1430(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(II)V")
    void method1431(int arg0, int arg1);

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Ljava/awt/Component;ZII)V")
    void method1432(Component arg0, boolean arg1, int arg2, int arg3) throws Exception;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(I[I)V")
    void method1433(int arg0, int[] arg1);

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "(II)I")
    int method1434(int arg0, int arg1);
}
