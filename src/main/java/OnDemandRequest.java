import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mb")
public class OnDemandRequest extends DoublyLinkable {

    @OriginalMember(owner = "mb", name = "m", descriptor = "Z")
    public boolean field727 = true;

    @OriginalMember(owner = "mb", name = "i", descriptor = "I")
    public int field723;

    @OriginalMember(owner = "mb", name = "j", descriptor = "I")
    public int field724;

    @OriginalMember(owner = "mb", name = "l", descriptor = "I")
    public int field726;

    @OriginalMember(owner = "mb", name = "k", descriptor = "[B")
    public byte[] field725;
}
