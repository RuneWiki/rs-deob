import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mb")
public class OnDemandRequest extends DoublyLinkable {

    @OriginalMember(owner = "mb", name = "m", descriptor = "Z")
    public boolean field726 = true;

    @OriginalMember(owner = "mb", name = "i", descriptor = "I")
    public int field722;

    @OriginalMember(owner = "mb", name = "j", descriptor = "I")
    public int field723;

    @OriginalMember(owner = "mb", name = "l", descriptor = "I")
    public int field725;

    @OriginalMember(owner = "mb", name = "k", descriptor = "[B")
    public byte[] field724;
}
