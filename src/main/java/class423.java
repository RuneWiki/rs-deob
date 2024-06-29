import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public interface class423 {

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)J")
    long method1555(int arg0);

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(I)I")
    int method1553(int arg0);

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "(I)I")
    int method1559(int arg0);

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(I[BBI)V")
    void method1556(int arg0, byte[] arg1, byte arg2, int arg3);
}
