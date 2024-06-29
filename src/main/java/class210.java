import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public interface class210 {

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)V")
    void method1359(int arg0, int arg1);

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(BI)I")
    int method1360(byte arg0, int arg1);

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IZI)V")
    void method1361(int arg0, boolean arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I[I)V")
    void method1362(int arg0, int[] arg1);

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IZLjava/awt/Component;B)V")
    void method1363(int arg0, boolean arg1, Component arg2, byte arg3) throws Exception;

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(BI)V")
    void method1364(byte arg0, int arg1);
}
