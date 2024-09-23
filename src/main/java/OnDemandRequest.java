import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mb")
public class OnDemandRequest extends DoublyLinkable {

    @OriginalMember(owner = "mb", name = "n", descriptor = "Z")
    public boolean field720 = true;

    @OriginalMember(owner = "mb", name = "j", descriptor = "I")
    public int field716;

    @OriginalMember(owner = "mb", name = "k", descriptor = "I")
    public int field717;

    @OriginalMember(owner = "mb", name = "m", descriptor = "I")
    public int field719;

    @OriginalMember(owner = "mb", name = "l", descriptor = "[B")
    public byte[] field718;
}
