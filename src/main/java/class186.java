import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public interface class186 {

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)I")
    int method1152(int arg0, int arg1);

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(II)V")
    void method1153(int arg0, int arg1);

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IB)V")
    void method1154(int arg0, byte arg1);

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Ljava/awt/Component;IZB)V")
    void method1155(Component arg0, int arg1, boolean arg2, byte arg3) throws Exception;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIB)V")
    void method1156(int arg0, int arg1, byte arg2) throws Exception;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I[I)V")
    void method1157(int arg0, int[] arg1);
}
