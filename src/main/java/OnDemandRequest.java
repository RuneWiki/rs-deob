import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("nb")
public class OnDemandRequest extends DoublyLinkable {

    @OriginalMember(owner = "nb", name = "l", descriptor = "Z")
    public boolean field729 = true;

    @OriginalMember(owner = "nb", name = "h", descriptor = "I")
    public int field725;

    @OriginalMember(owner = "nb", name = "i", descriptor = "I")
    public int field726;

    @OriginalMember(owner = "nb", name = "k", descriptor = "I")
    public int field728;

    @OriginalMember(owner = "nb", name = "j", descriptor = "[B")
    public byte[] field727;
}
