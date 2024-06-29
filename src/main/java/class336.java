import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eu")
public interface class336 {

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(I[I)V")
    void method1939(int arg0, int[] arg1);

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(III)V")
    void method1940(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(IZLjava/awt/Component;Z)V")
    void method1941(int arg0, boolean arg1, Component arg2, boolean arg3) throws Exception;

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(ZI)I")
    int method1942(boolean arg0, int arg1);

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(IB)V")
    void method1943(int arg0, byte arg1);

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(II)V")
    void method1944(int arg0, int arg1);
}
