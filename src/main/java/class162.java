import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public interface class162 {

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(ZIILjava/awt/Component;)V")
    void method1153(boolean arg0, int arg1, int arg2, Component arg3) throws Exception;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IB)I")
    int method1154(int arg0, byte arg1);

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(III)V")
    void method1155(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I[I)V")
    void method1156(int arg0, int[] arg1);

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(II)V")
    void method1157(int arg0, int arg1);

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(II)V")
    void method1158(int arg0, int arg1);
}
