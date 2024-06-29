import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public interface class142 {

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(ILjava/awt/Component;IZ)V")
    void method1083(int arg0, Component arg1, int arg2, boolean arg3) throws Exception;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(I[I)V")
    void method1084(int arg0, int[] arg1);

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(BI)V")
    void method1085(byte arg0, int arg1);

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(II)I")
    int method1086(int arg0, int arg1);

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(II)V")
    void method1087(int arg0, int arg1);

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIB)V")
    void method1088(int arg0, int arg1, byte arg2) throws Exception;
}
