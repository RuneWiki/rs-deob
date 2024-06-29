import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gw")
public interface class140 {

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(BII[B)V")
    void method310(byte arg0, int arg1, int arg2, byte[] arg3);

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(Z)I")
    int method302(boolean arg0);

    @OriginalMember(owner = "client!gw", name = "b", descriptor = "(Z)I")
    int method309(boolean arg0);

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(I)J")
    long method305(int arg0);
}
