import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!PHKHJKBS")
public class OnDemandRequest extends DoublyLinkable {

    @OriginalMember(owner = "client!PHKHJKBS", name = "l", descriptor = "Z")
    public boolean important = true;

    @OriginalMember(owner = "client!PHKHJKBS", name = "i", descriptor = "I")
    public int archive;

    @OriginalMember(owner = "client!PHKHJKBS", name = "m", descriptor = "I")
    public int cycle;

    @OriginalMember(owner = "client!PHKHJKBS", name = "k", descriptor = "I")
    public int file;

    @OriginalMember(owner = "client!PHKHJKBS", name = "j", descriptor = "[B")
    public byte[] data;
}
