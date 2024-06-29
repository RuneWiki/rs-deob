import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class241 extends class113 {

    @OriginalMember(owner = "client!rh", name = "s", descriptor = "I")
    public int field3455;

    @OriginalMember(owner = "client!rh", name = "u", descriptor = "I")
    public int field3457;

    @OriginalMember(owner = "client!rh", name = "v", descriptor = "I")
    public int field3458;

    @OriginalMember(owner = "client!rh", name = "w", descriptor = "I")
    public int field3459;

    @OriginalMember(owner = "client!rh", name = "t", descriptor = "J")
    public long field3456;

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(B)J", line = 7)
    public final long method843(byte arg0) {
        return arg0 >= -110 ? 29L : this.field3456;
    }

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "(I)I", line = 20)
    public final int method844(int arg0) {
        int var2 = -65 / ((24 - arg0) / 52);
        return this.field3457;
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(I)I", line = 28)
    public final int method842(int arg0) {
        if (arg0 != 15) {
            this.method840(17);
        }
        return this.field3455;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)I", line = 38)
    public final int method840(int arg0) {
        if (arg0 < 103) {
            this.field3458 = -80;
        }
        return this.field3458;
    }

    @OriginalMember(owner = "client!rh", name = "g", descriptor = "(I)I", line = 48)
    public final int method847(int arg0) {
        if (arg0 != -1) {
            this.method840(18);
        }
        return this.field3459;
    }
}
