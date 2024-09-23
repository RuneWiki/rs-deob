import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mb")
public class OnDemandRequest extends DoublyLinkable {

    @OriginalMember(owner = "mb", name = "l", descriptor = "Z")
    public boolean field734 = true;

    @OriginalMember(owner = "mb", name = "h", descriptor = "I")
    public int field730;

    @OriginalMember(owner = "mb", name = "i", descriptor = "I")
    public int field731;

    @OriginalMember(owner = "mb", name = "k", descriptor = "I")
    public int field733;

    @OriginalMember(owner = "mb", name = "j", descriptor = "[B")
    public byte[] field732;
}
