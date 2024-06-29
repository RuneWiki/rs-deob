import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!faa")
public interface class166 {

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(ZLjava/awt/Component;II)V")
    void method1153(boolean arg0, Component arg1, int arg2, int arg3) throws Exception;

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(II)V")
    void method1154(int arg0, int arg1);

    @OriginalMember(owner = "client!faa", name = "b", descriptor = "(II)V")
    void method1155(int arg0, int arg1);

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(III)V")
    void method1156(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(I[I)V")
    void method1157(int arg0, int[] arg1);

    @OriginalMember(owner = "client!faa", name = "c", descriptor = "(II)I")
    int method1158(int arg0, int arg1);
}
