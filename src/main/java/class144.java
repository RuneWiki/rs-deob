import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class144 extends class356 {

    @OriginalMember(owner = "client!jh", name = "q", descriptor = "I")
    public int field2115;

    @OriginalMember(owner = "client!jh", name = "r", descriptor = "I")
    public int field2116;

    @OriginalMember(owner = "client!jh", name = "t", descriptor = "I")
    public int field2118;

    @OriginalMember(owner = "client!jh", name = "u", descriptor = "I")
    public int field2119;

    @OriginalMember(owner = "client!jh", name = "s", descriptor = "J")
    public long field2117;

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(Z)J", line = 4)
    public final long method1028(boolean arg0) {
        if (arg0) {
            this.method1028(false);
        }
        return this.field2117;
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(B)I", line = 14)
    public final int method1029(byte arg0) {
        if (arg0 < 16) {
            this.method1028(false);
        }
        return this.field2118;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)I", line = 26)
    public final int method1030(int arg0) {
        if (arg0 <= 91) {
            this.field2116 = 33;
        }
        return this.field2116;
    }

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "(B)I", line = 38)
    public final int method1031(byte arg0) {
        int var2 = 59 / ((17 - arg0) / 46);
        return this.field2115;
    }

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "(B)I", line = 47)
    public final int method1032(byte arg0) {
        if (arg0 != 15) {
            this.field2115 = 91;
        }
        return this.field2119;
    }
}
