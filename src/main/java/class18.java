import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public interface class18 {

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)Z")
    boolean method1(int arg0);

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(BLdr;)V")
    void method2(byte arg0, class261 arg1);

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Ldr;IB)Lwp;")
    class292 method12(class261 arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Ldr;I)V")
    void method6(class261 arg0, int arg1);

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)I")
    int method3(byte arg0);

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Z)I")
    int method7(boolean arg0);

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(I)I")
    int method9(int arg0);

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(I)V")
    void method11(int arg0);
}
