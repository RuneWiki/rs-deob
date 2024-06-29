import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public interface class275 {

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(II)V")
    void method1903(int arg0, int arg1);

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(II)V")
    void method1904(int arg0, int arg1);

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "(II)I")
    int method1905(int arg0, int arg1);

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ILjava/awt/Component;ZI)V")
    void method1906(int arg0, Component arg1, boolean arg2, int arg3) throws Exception;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IBI)V")
    void method1907(int arg0, byte arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(I[I)V")
    void method1908(int arg0, int[] arg1);
}
