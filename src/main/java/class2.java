import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public interface class2 {

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I[I)V")
    void method4(int arg0, int[] arg1);

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILjava/awt/Component;ZI)V")
    void method5(int arg0, Component arg1, boolean arg2, int arg3) throws Exception;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(BI)V")
    void method6(byte arg0, int arg1);

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)I")
    int method7(int arg0, int arg1);

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(III)V")
    void method8(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(II)V")
    void method9(int arg0, int arg1);
}
