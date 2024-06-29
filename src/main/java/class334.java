import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public interface class334 {

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(I)I")
    int method111(int arg0);

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(I[BII)V")
    void method103(int arg0, byte[] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(B)J")
    long method110(byte arg0);

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(Z)I")
    int method104(boolean arg0);
}
