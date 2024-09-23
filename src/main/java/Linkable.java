import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("u")
public class Linkable {

    @OriginalMember(owner = "u", name = "d", descriptor = "I")
    public static int _flowObfuscator1;

    @OriginalMember(owner = "u", name = "a", descriptor = "J")
    public long key;

    @OriginalMember(owner = "u", name = "b", descriptor = "Lu;")
    public Linkable next;

    @OriginalMember(owner = "u", name = "c", descriptor = "Lu;")
    public Linkable prev;

    @OriginalMember(owner = "u", name = "a", descriptor = "()V")
    public void unlink() {
        if (this.prev != null) {
            this.prev.next = this.next;
            this.next.prev = this.prev;
            this.next = null;
            this.prev = null;
        }
    }
}
