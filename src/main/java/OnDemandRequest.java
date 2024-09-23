import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mb")
public class OnDemandRequest extends DoublyLinkable {

    @OriginalMember(owner = "mb", name = "n", descriptor = "Z")
    public boolean field739 = true;

    @OriginalMember(owner = "mb", name = "j", descriptor = "I")
    public int field735;

    @OriginalMember(owner = "mb", name = "k", descriptor = "I")
    public int field736;

    @OriginalMember(owner = "mb", name = "m", descriptor = "I")
    public int field738;

    @OriginalMember(owner = "mb", name = "l", descriptor = "[B")
    public byte[] field737;
}
