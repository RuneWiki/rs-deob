import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class OnDemandRequest extends DoublyLinkable {

    @OriginalMember(owner = "client!nb", name = "l", descriptor = "Z")
    public boolean field710 = true;

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "I")
    public int field706;

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "I")
    public int field707;

    @OriginalMember(owner = "client!nb", name = "k", descriptor = "I")
    public int field709;

    @OriginalMember(owner = "client!nb", name = "j", descriptor = "[B")
    public byte[] field708;
}
