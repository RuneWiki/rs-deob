import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tda")
public interface class635 {

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(B)I")
    int method2158(byte arg0);

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(IIB[B)V")
    void method2161(int arg0, int arg1, byte arg2, byte[] arg3);

    @OriginalMember(owner = "client!tda", name = "b", descriptor = "(B)J")
    long method2160(byte arg0);

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(Z)I")
    int method2162(boolean arg0);
}
