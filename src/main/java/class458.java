import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!it")
public interface class458 {

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(I)J")
    long method2503(int arg0);

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(B)I")
    int method2501(byte arg0);

    @OriginalMember(owner = "client!it", name = "b", descriptor = "(B)I")
    int method2502(byte arg0);

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(III[B)V")
    void method2505(int arg0, int arg1, int arg2, byte[] arg3);
}
