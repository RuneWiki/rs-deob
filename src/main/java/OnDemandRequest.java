import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class OnDemandRequest extends DoublyLinkable {

    @OriginalMember(owner = "client!mb", name = "m", descriptor = "Z")
    public boolean field726 = true;

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "I")
    public int field722;

    @OriginalMember(owner = "client!mb", name = "j", descriptor = "I")
    public int field723;

    @OriginalMember(owner = "client!mb", name = "l", descriptor = "I")
    public int field725;

    @OriginalMember(owner = "client!mb", name = "k", descriptor = "[B")
    public byte[] field724;
}
