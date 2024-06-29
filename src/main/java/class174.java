import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public interface class174 {

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(II)I")
    int method1178(int arg0, int arg1);

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIB)V")
    void method1179(int arg0, int arg1, byte arg2) throws Exception;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(I[I)V")
    void method1180(int arg0, int[] arg1);

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(II)V")
    void method1181(int arg0, int arg1);

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Ljava/awt/Component;IZI)V")
    void method1182(Component arg0, int arg1, boolean arg2, int arg3) throws Exception;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(BI)V")
    void method1183(byte arg0, int arg1);
}
