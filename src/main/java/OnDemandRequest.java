import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class OnDemandRequest extends DoublyLinkable {

    @OriginalMember(owner = "client!nb", name = "m", descriptor = "Z")
    public boolean field731 = true;

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "I")
    public int field727;

    @OriginalMember(owner = "client!nb", name = "j", descriptor = "I")
    public int field728;

    @OriginalMember(owner = "client!nb", name = "l", descriptor = "I")
    public int field730;

    @OriginalMember(owner = "client!nb", name = "k", descriptor = "[B")
    public byte[] field729;
}
