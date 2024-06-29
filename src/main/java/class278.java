import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public interface class278 {

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I[I)V")
    void method1945(int arg0, int[] arg1);

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(II)V")
    void method1946(int arg0, int arg1);

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(III)V")
    void method1947(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(BI)I")
    int method1948(byte arg0, int arg1);

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ZIILjava/awt/Component;)V")
    void method1949(boolean arg0, int arg1, int arg2, Component arg3) throws Exception;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ZI)V")
    void method1950(boolean arg0, int arg1);
}
