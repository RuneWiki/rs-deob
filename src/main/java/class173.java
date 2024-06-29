import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class173 extends class432 {

    @OriginalMember(owner = "client!pd", name = "q", descriptor = "I")
    public int field2499;

    @OriginalMember(owner = "client!pd", name = "r", descriptor = "I")
    public int field2500;

    @OriginalMember(owner = "client!pd", name = "s", descriptor = "I")
    public int field2501;

    @OriginalMember(owner = "client!pd", name = "t", descriptor = "I")
    public int field2502;

    @OriginalMember(owner = "client!pd", name = "u", descriptor = "J")
    public long field2503;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(B)I")
    public final int method1080(byte arg0) {
        return arg0 < 81 ? 70 : this.field2500;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)J")
    public final long method1081(int arg0) {
        if (arg0 < 125) {
            this.field2503 = 73L;
        }
        return this.field2503;
    }

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "(I)I")
    public final int method1082(int arg0) {
        if (arg0 != -769) {
            this.method1083(101);
        }
        return this.field2499;
    }

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "(I)I")
    public final int method1083(int arg0) {
        if (arg0 > -72) {
            this.method1081(-93);
        }
        return this.field2501;
    }

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "(B)I")
    public final int method1084(byte arg0) {
        return arg0 == -102 ? this.field2502 : 42;
    }
}
