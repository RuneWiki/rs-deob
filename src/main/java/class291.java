import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public class class291 extends class471 {

    @OriginalMember(owner = "client!en", name = "l", descriptor = "I")
    public int field3942;

    @OriginalMember(owner = "client!en", name = "m", descriptor = "I")
    public int field3943;

    @OriginalMember(owner = "client!en", name = "o", descriptor = "I")
    public int field3945;

    @OriginalMember(owner = "client!en", name = "p", descriptor = "I")
    public int field3946;

    @OriginalMember(owner = "client!en", name = "n", descriptor = "J")
    public long field3944;

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(Z)I", line = 4)
    public final int method1729(boolean arg0) {
        if (arg0) {
            this.field3944 = 48L;
        }
        return this.field3942;
    }

    @OriginalMember(owner = "client!en", name = "d", descriptor = "(Z)I", line = 17)
    public final int method1730(boolean arg0) {
        if (!arg0) {
            this.method1731(false);
        }
        return this.field3943;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Z)J", line = 27)
    public final long method1731(boolean arg0) {
        if (!arg0) {
            this.method1733((byte) -114);
        }
        return this.field3944;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(B)I", line = 37)
    public final int method1732(byte arg0) {
        return arg0 == 88 ? this.field3945 : 42;
    }

    @OriginalMember(owner = "client!en", name = "d", descriptor = "(B)I", line = 47)
    public final int method1733(byte arg0) {
        return arg0 < 66 ? -63 : this.field3946;
    }
}
