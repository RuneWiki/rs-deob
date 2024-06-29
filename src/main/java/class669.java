import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public interface class669 {

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(I)I")
    int method2(int arg0);

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(I)I")
    int method3(int arg0);

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "(I)J")
    long method6(int arg0);

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IB[BI)V")
    void method4(int arg0, byte arg1, byte[] arg2, int arg3);
}
