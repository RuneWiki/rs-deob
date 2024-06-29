import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public interface class510 {

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(B)J")
    long method2001(byte arg0);

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(B)I")
    int method1999(byte arg0);

    @OriginalMember(owner = "client!el", name = "a", descriptor = "([BIIB)V")
    void method2000(byte[] arg0, int arg1, int arg2, byte arg3);

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(I)I")
    int method1997(int arg0);
}
