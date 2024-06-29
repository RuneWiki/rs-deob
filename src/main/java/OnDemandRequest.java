import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class OnDemandRequest extends DoublyLinkable {

    @OriginalMember(owner = "client!nb", name = "l", descriptor = "Z")
    public boolean field727 = true;

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "I")
    public int field723;

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "I")
    public int field724;

    @OriginalMember(owner = "client!nb", name = "k", descriptor = "I")
    public int field726;

    @OriginalMember(owner = "client!nb", name = "j", descriptor = "[B")
    public byte[] field725;
}
