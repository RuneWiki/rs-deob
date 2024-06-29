import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class OnDemandRequest extends DoublyLinkable {

    @OriginalMember(owner = "client!mb", name = "n", descriptor = "Z")
    public boolean field739 = true;

    @OriginalMember(owner = "client!mb", name = "j", descriptor = "I")
    public int field735;

    @OriginalMember(owner = "client!mb", name = "k", descriptor = "I")
    public int field736;

    @OriginalMember(owner = "client!mb", name = "m", descriptor = "I")
    public int field738;

    @OriginalMember(owner = "client!mb", name = "l", descriptor = "[B")
    public byte[] field737;
}
