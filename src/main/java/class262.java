import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public abstract class class262 {

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "I")
    public static int field3866;

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "I")
    public static int field3867;

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "I")
    public static int field3868;

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "I")
    public int field3869;

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "I")
    public static int field3870;

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "I")
    public static int field3871;

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "I")
    public int field3872;

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "I")
    public int field3873;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)Z", line = 3)
    public final boolean method1768(int arg0) {
        field3868++;
        if (arg0 == 256) {
            return (this.field3873 & 0x4) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(BII)V", line = 17)
    public static final void method1769(byte arg0, int arg1, int arg2) {
        field3870++;
        if (class333.field4719 == 1) {
            class702.method3828(2, class295.field4181, arg1, arg2);
        } else if (class333.field4719 == 2) {
            if (class24.field246) {
                class202.method1332(arg0 ^ 0x3C0E, class186.method1252(arg0 ^ 0x6A) + arg1, class550.method3163(16383) + arg2);
            } else {
                class202.method1332(15460, arg1, arg2);
            }
        }
        if (arg0 != 106) {
            method1769((byte) -47, -109, -23);
        }
        class295.field4181 = null;
        class333.field4719 = 0;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(B)Z", line = 48)
    public final boolean method1770(byte arg0) {
        if (arg0 >= -25) {
            this.method1770((byte) 95);
        }
        field3866++;
        return (this.field3873 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)Z", line = 60)
    public final boolean method1771(int arg0) {
        field3871++;
        if (arg0 <= 63) {
            return false;
        } else {
            return (this.field3873 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(B)Z", line = 75)
    public final boolean method1772(byte arg0) {
        field3867++;
        if (arg0 == 43) {
            return (this.field3873 & 0x8) != 0;
        } else {
            return false;
        }
    }
}
