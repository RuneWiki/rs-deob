import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public interface class407 {

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)I")
    int method3184(int arg0);

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(B)I")
    int method3185(byte arg0);

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(BI[BI)V")
    void method3186(byte arg0, int arg1, byte[] arg2, int arg3);

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(B)J")
    long method3187(byte arg0);
}
