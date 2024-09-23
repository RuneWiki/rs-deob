import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("PHKHJKBS")
public class OnDemandRequest extends DoublyLinkable {

    @OriginalMember(owner = "PHKHJKBS", name = "l", descriptor = "Z")
    public boolean important = true;

    @OriginalMember(owner = "PHKHJKBS", name = "i", descriptor = "I")
    public int archive;

    @OriginalMember(owner = "PHKHJKBS", name = "m", descriptor = "I")
    public int cycle;

    @OriginalMember(owner = "PHKHJKBS", name = "k", descriptor = "I")
    public int file;

    @OriginalMember(owner = "PHKHJKBS", name = "j", descriptor = "[B")
    public byte[] data;
}
