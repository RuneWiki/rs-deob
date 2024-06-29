import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class OnDemandRequest extends DoublyLinkable {

    @OriginalMember(owner = "client!mb", name = "n", descriptor = "Z")
    public boolean field725 = true;

    @OriginalMember(owner = "client!mb", name = "j", descriptor = "I")
    public int field721;

    @OriginalMember(owner = "client!mb", name = "k", descriptor = "I")
    public int field722;

    @OriginalMember(owner = "client!mb", name = "m", descriptor = "I")
    public int field724;

    @OriginalMember(owner = "client!mb", name = "l", descriptor = "[B")
    public byte[] field723;
}
