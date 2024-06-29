import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public interface class453 {

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)J")
    long method732(int arg0);

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)I")
    int method736(byte arg0);

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(I)I")
    int method734(int arg0);

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(B[BII)V")
    void method730(byte arg0, byte[] arg1, int arg2, int arg3);
}
