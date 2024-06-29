import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class242 extends class620 {

    @OriginalMember(owner = "client!ue", name = "n", descriptor = "I")
    public int field3591;

    @OriginalMember(owner = "client!ue", name = "o", descriptor = "I")
    public int field3592;

    @OriginalMember(owner = "client!ue", name = "p", descriptor = "I")
    public int field3593;

    @OriginalMember(owner = "client!ue", name = "q", descriptor = "I")
    public int field3594;

    @OriginalMember(owner = "client!ue", name = "r", descriptor = "J")
    public long field3595;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Z)I", line = 4)
    public final int method1623(boolean arg0) {
        if (!arg0) {
            this.method1623(true);
        }
        return this.field3594;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)J", line = 15)
    public final long method1624(int arg0) {
        if (arg0 > -5) {
            this.field3595 = 116L;
        }
        return this.field3595;
    }

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "(I)I", line = 25)
    public final int method1625(int arg0) {
        if (arg0 != 8459) {
            this.field3592 = 104;
        }
        return this.field3591;
    }

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "(I)I", line = 36)
    public final int method1626(int arg0) {
        return arg0 < 22 ? -85 : this.field3592;
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(Z)I", line = 46)
    public final int method1627(boolean arg0) {
        if (arg0) {
            this.field3594 = -2;
        }
        return this.field3593;
    }
}
