import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class OnDemandRequest extends DoublyLinkable {

    @OriginalMember(owner = "client!mb", name = "m", descriptor = "Z")
    public boolean field730 = true;

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "I")
    public int field726;

    @OriginalMember(owner = "client!mb", name = "j", descriptor = "I")
    public int field727;

    @OriginalMember(owner = "client!mb", name = "l", descriptor = "I")
    public int field729;

    @OriginalMember(owner = "client!mb", name = "k", descriptor = "[B")
    public byte[] field728;
}
