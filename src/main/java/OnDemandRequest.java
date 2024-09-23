import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("nb")
public class OnDemandRequest extends DoublyLinkable {

    @OriginalMember(owner = "nb", name = "l", descriptor = "Z")
    public boolean field710 = true;

    @OriginalMember(owner = "nb", name = "h", descriptor = "I")
    public int field706;

    @OriginalMember(owner = "nb", name = "i", descriptor = "I")
    public int field707;

    @OriginalMember(owner = "nb", name = "k", descriptor = "I")
    public int field709;

    @OriginalMember(owner = "nb", name = "j", descriptor = "[B")
    public byte[] field708;
}
