import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ov")
public class class22 extends class32 {

    @OriginalMember(owner = "client!ov", name = "q", descriptor = "I")
    public int field249;

    @OriginalMember(owner = "client!ov", name = "r", descriptor = "I")
    public int field250;

    @OriginalMember(owner = "client!ov", name = "s", descriptor = "I")
    public int field251;

    @OriginalMember(owner = "client!ov", name = "u", descriptor = "I")
    public int field253;

    @OriginalMember(owner = "client!ov", name = "t", descriptor = "J")
    public long field252;

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(Z)I")
    public final int method139(boolean arg0) {
        if (!arg0) {
            this.field252 = -40L;
        }
        return this.field251;
    }

    @OriginalMember(owner = "client!ov", name = "b", descriptor = "(I)J")
    public final long method140(int arg0) {
        if (arg0 >= -63) {
            this.method143(7);
        }
        return this.field252;
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(B)I")
    public final int method141(byte arg0) {
        return arg0 == -58 ? this.field250 : 79;
    }

    @OriginalMember(owner = "client!ov", name = "c", descriptor = "(I)I")
    public final int method142(int arg0) {
        if (arg0 < 36) {
            this.field249 = -95;
        }
        return this.field253;
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(I)I")
    public final int method143(int arg0) {
        if (arg0 != 3) {
            this.method142(43);
        }
        return this.field249;
    }
}
