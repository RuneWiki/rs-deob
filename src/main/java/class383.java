import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public interface class383 {

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(B)I")
    int method135(byte arg0);

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)I")
    int method132(int arg0);

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIB[B)V")
    void method134(int arg0, int arg1, byte arg2, byte[] arg3);

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(B)J")
    long method133(byte arg0);
}
