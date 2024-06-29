import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mu")
public interface class459 {

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(II)V")
    void method1919(int arg0, int arg1);

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(I[I)V")
    void method1918(int arg0, int[] arg1);

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "(II)I")
    int method1917(int arg0, int arg1);

    @OriginalMember(owner = "client!mu", name = "c", descriptor = "(II)V")
    void method1921(int arg0, int arg1);

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(III)V")
    void method1920(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(ZZLjava/awt/Component;I)V")
    void method1916(boolean arg0, boolean arg1, Component arg2, int arg3) throws Exception;
}
