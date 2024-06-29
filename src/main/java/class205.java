import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public interface class205 {

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(BI)I")
    int method1353(byte arg0, int arg1);

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(II)V")
    void method1354(int arg0, int arg1);

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I[I)V")
    void method1355(int arg0, int[] arg1);

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(II)V")
    void method1356(int arg0, int arg1);

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(III)V")
    void method1357(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IZLjava/awt/Component;I)V")
    void method1358(int arg0, boolean arg1, Component arg2, int arg3) throws Exception;
}
