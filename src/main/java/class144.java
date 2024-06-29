import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class144 extends class639 {

    @OriginalMember(owner = "client!jh", name = "m", descriptor = "I")
    public int field2064;

    @OriginalMember(owner = "client!jh", name = "n", descriptor = "I")
    public int field2065;

    @OriginalMember(owner = "client!jh", name = "p", descriptor = "I")
    public int field2067;

    @OriginalMember(owner = "client!jh", name = "q", descriptor = "I")
    public int field2068;

    @OriginalMember(owner = "client!jh", name = "o", descriptor = "J")
    public long field2066;

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "(I)I", line = 4)
    public final int method1010(int arg0) {
        if (arg0 > -83) {
            this.field2068 = 111;
        }
        return this.field2068;
    }

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "(Z)I", line = 15)
    public final int method1011(boolean arg0) {
        if (!arg0) {
            this.field2068 = 36;
        }
        return this.field2067;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)J", line = 25)
    public final long method1012(int arg0) {
        if (arg0 != -15665) {
            this.method1010(36);
        }
        return this.field2066;
    }

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "(I)I", line = 37)
    public final int method1013(int arg0) {
        return arg0 == 731 ? this.field2065 : 43;
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(Z)I", line = 49)
    public final int method1014(boolean arg0) {
        if (arg0) {
            this.method1014(true);
        }
        return this.field2064;
    }
}
