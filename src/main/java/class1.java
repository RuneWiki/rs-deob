import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public interface class1 {

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IB)V")
    void method1(int arg0, byte arg1);

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(I[I)V")
    void method2(int arg0, int[] arg1);

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(III)V")
    void method3(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ZIILjava/awt/Component;)V")
    void method4(boolean arg0, int arg1, int arg2, Component arg3) throws Exception;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(II)I")
    int method5(int arg0, int arg1);

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(II)V")
    void method6(int arg0, int arg1);
}
