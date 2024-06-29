import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public interface class145 {

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I[I)V")
    void method1070(int arg0, int[] arg1);

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(III)V")
    void method1071(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(II)I")
    int method1072(int arg0, int arg1);

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(II)V")
    void method1073(int arg0, int arg1);

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "(II)V")
    void method1074(int arg0, int arg1);

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ZILjava/awt/Component;I)V")
    void method1075(boolean arg0, int arg1, Component arg2, int arg3) throws Exception;
}
