import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public interface class164 {

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IB)I")
    int method1176(int arg0, byte arg1);

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(II)V")
    void method1177(int arg0, int arg1);

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Ljava/awt/Component;IZB)V")
    void method1178(Component arg0, int arg1, boolean arg2, byte arg3) throws Exception;

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(II)V")
    void method1179(int arg0, int arg1);

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(III)V")
    void method1180(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(I[I)V")
    void method1181(int arg0, int[] arg1);
}
