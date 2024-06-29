import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bia")
public interface class411 {

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "(I)I")
    int method742(int arg0);

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "(B)I")
    int method745(byte arg0);

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "(III[B)V")
    void method743(int arg0, int arg1, int arg2, byte[] arg3);

    @OriginalMember(owner = "client!bia", name = "b", descriptor = "(B)J")
    long method741(byte arg0);
}
