import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fha")
public interface class401 {

    @OriginalMember(owner = "client!fha", name = "a", descriptor = "([BIII)V")
    void method2501(byte[] arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!fha", name = "a", descriptor = "(B)I")
    int method2502(byte arg0);

    @OriginalMember(owner = "client!fha", name = "a", descriptor = "(I)J")
    long method2503(int arg0);

    @OriginalMember(owner = "client!fha", name = "b", descriptor = "(I)I")
    int method2504(int arg0);
}
