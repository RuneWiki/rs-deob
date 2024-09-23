import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("nb")
public class OnDemandRequest extends DoublyLinkable {

    @OriginalMember(owner = "nb", name = "m", descriptor = "Z")
    public boolean field753 = true;

    @OriginalMember(owner = "nb", name = "i", descriptor = "I")
    public int field749;

    @OriginalMember(owner = "nb", name = "j", descriptor = "I")
    public int field750;

    @OriginalMember(owner = "nb", name = "l", descriptor = "I")
    public int field752;

    @OriginalMember(owner = "nb", name = "k", descriptor = "[B")
    public byte[] field751;
}
