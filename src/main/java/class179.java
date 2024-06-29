import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public interface class179 {

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(II)V")
    void method1387(int arg0, int arg1);

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(IZ)V")
    void method1388(int arg0, boolean arg1);

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(BLjava/awt/Component;ZI)V")
    void method1389(byte arg0, Component arg1, boolean arg2, int arg3) throws Exception;

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(I[I)V")
    void method1390(int arg0, int[] arg1);

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(IZI)V")
    void method1391(int arg0, boolean arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(BI)I")
    int method1392(byte arg0, int arg1);
}
