import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class OnDemandRequest extends DoublyLinkable {

    @OriginalMember(owner = "client!nb", name = "l", descriptor = "Z")
    public boolean field714 = true;

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "I")
    public int field710;

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "I")
    public int field711;

    @OriginalMember(owner = "client!nb", name = "k", descriptor = "I")
    public int field713;

    @OriginalMember(owner = "client!nb", name = "j", descriptor = "[B")
    public byte[] field712;
}
