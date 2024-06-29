import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class OnDemandRequest extends DoublyLinkable {

    @OriginalMember(owner = "client!nb", name = "m", descriptor = "Z")
    public boolean field734 = true;

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "I")
    public int field730;

    @OriginalMember(owner = "client!nb", name = "j", descriptor = "I")
    public int field731;

    @OriginalMember(owner = "client!nb", name = "l", descriptor = "I")
    public int field733;

    @OriginalMember(owner = "client!nb", name = "k", descriptor = "[B")
    public byte[] field732;
}
