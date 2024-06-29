import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public interface class248 {

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IZ)I")
    int method1717(int arg0, boolean arg1);

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(III)V")
    void method1718(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(I[I)V")
    void method1719(int arg0, int[] arg1);

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(II)V")
    void method1720(int arg0, int arg1);

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Ljava/awt/Component;ZIZ)V")
    void method1721(Component arg0, boolean arg1, int arg2, boolean arg3) throws Exception;

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(II)V")
    void method1722(int arg0, int arg1);
}
