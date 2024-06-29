import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class OnDemandRequest extends DoublyLinkable {

    @OriginalMember(owner = "client!mb", name = "l", descriptor = "Z")
    public boolean field734 = true;

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "I")
    public int field730;

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "I")
    public int field731;

    @OriginalMember(owner = "client!mb", name = "k", descriptor = "I")
    public int field733;

    @OriginalMember(owner = "client!mb", name = "j", descriptor = "[B")
    public byte[] field732;
}
