import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public class class73 extends class368 {

    @OriginalMember(owner = "client!pq", name = "p", descriptor = "I")
    public int field995;

    @OriginalMember(owner = "client!pq", name = "r", descriptor = "I")
    public int field997;

    @OriginalMember(owner = "client!pq", name = "s", descriptor = "I")
    public int field998;

    @OriginalMember(owner = "client!pq", name = "t", descriptor = "I")
    public int field999;

    @OriginalMember(owner = "client!pq", name = "q", descriptor = "J")
    public long field996;

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "(I)I", line = 6)
    public final int method435(int arg0) {
        if (arg0 < 117) {
            this.field999 = -60;
        }
        return this.field995;
    }

    @OriginalMember(owner = "client!pq", name = "i", descriptor = "(I)J", line = 16)
    public final long method436(int arg0) {
        if (arg0 >= -67) {
            this.field998 = -71;
        }
        return this.field996;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(I)I", line = 27)
    public final int method437(int arg0) {
        if (arg0 != 9) {
            this.field996 = 53L;
        }
        return this.field999;
    }

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "(Z)I", line = 37)
    public final int method438(boolean arg0) {
        if (arg0) {
            this.field997 = -105;
        }
        return this.field998;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Z)I", line = 47)
    public final int method439(boolean arg0) {
        if (!arg0) {
            this.field996 = 82L;
        }
        return this.field997;
    }
}
