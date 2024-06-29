import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public interface class500 {

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)I")
    int method344(int arg0);

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I[BII)V")
    void method343(int arg0, byte[] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)J")
    long method349(int arg0);

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)I")
    int method350(byte arg0);
}
