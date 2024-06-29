import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public abstract class class299 {

    @OriginalMember(owner = "client!io", name = "c", descriptor = "Lrn;")
    public static class174 field4257 = new class174(51, 7);

    @OriginalMember(owner = "client!io", name = "i", descriptor = "Liv;")
    public static class64 field4263 = new class64(2, -2);

    @OriginalMember(owner = "client!io", name = "a", descriptor = "I")
    public static int field4255;

    @OriginalMember(owner = "client!io", name = "b", descriptor = "I")
    public int field4256;

    @OriginalMember(owner = "client!io", name = "d", descriptor = "I")
    public static int field4258;

    @OriginalMember(owner = "client!io", name = "e", descriptor = "I")
    public int field4259;

    @OriginalMember(owner = "client!io", name = "f", descriptor = "I")
    public static int field4260;

    @OriginalMember(owner = "client!io", name = "g", descriptor = "I")
    public static int field4261;

    @OriginalMember(owner = "client!io", name = "h", descriptor = "I")
    public int field4262;

    @OriginalMember(owner = "client!io", name = "j", descriptor = "I")
    public static int field4264;

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(I)Z", line = 10)
    public final boolean method1889(int arg0) {
        field4260++;
        if (arg0 != -21540) {
            field4263 = null;
        }
        return (this.field4259 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!io", name = "b", descriptor = "(I)Z", line = 27)
    public final boolean method1890(int arg0) {
        field4258++;
        if (arg0 == 654) {
            return (this.field4259 & 0x4) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(Z)Z", line = 41)
    public final boolean method1891(boolean arg0) {
        if (!arg0) {
            field4257 = null;
        }
        field4264++;
        return (this.field4259 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!io", name = "c", descriptor = "(I)V", line = 58)
    public static void method1892(int arg0) {
        field4257 = null;
        field4263 = null;
        if (arg0 != 1) {
            field4257 = null;
        }
    }

    @OriginalMember(owner = "client!io", name = "d", descriptor = "(I)Z", line = 77)
    public final boolean method1893(int arg0) {
        if (arg0 == -12997) {
            field4261++;
            return (this.field4259 & 0x1) != 0;
        } else {
            return false;
        }
    }
}
