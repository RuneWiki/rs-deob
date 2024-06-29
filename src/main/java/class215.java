import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public interface class215 {

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIB)V")
    void method1415(int arg0, int arg1, byte arg2) throws Exception;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(II)V")
    void method1416(int arg0, int arg1);

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ZLjava/awt/Component;BI)V")
    void method1417(boolean arg0, Component arg1, byte arg2, int arg3) throws Exception;

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(II)I")
    int method1418(int arg0, int arg1);

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I[I)V")
    void method1419(int arg0, int[] arg1);

    @OriginalMember(owner = "client!md", name = "c", descriptor = "(II)V")
    void method1420(int arg0, int arg1);
}
