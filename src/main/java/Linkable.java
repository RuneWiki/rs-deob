import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("PKVMXVTO")
public class Linkable {

    @OriginalMember(owner = "PKVMXVTO", name = "a", descriptor = "Z")
    private boolean _flowObfuscator1 = true;

    @OriginalMember(owner = "PKVMXVTO", name = "b", descriptor = "J")
    public long key;

    @OriginalMember(owner = "PKVMXVTO", name = "c", descriptor = "LPKVMXVTO;")
    public Linkable next;

    @OriginalMember(owner = "PKVMXVTO", name = "d", descriptor = "LPKVMXVTO;")
    public Linkable prev;

    @OriginalMember(owner = "PKVMXVTO", name = "e", descriptor = "Z")
    public static boolean _flowObfuscator2;

    @OriginalMember(owner = "PKVMXVTO", name = "a", descriptor = "()V")
    public void unlink() {
        if (this.prev != null) {
            this.prev.next = this.next;
            this.next.prev = this.prev;
            this.next = null;
            this.prev = null;
        }
    }
}
