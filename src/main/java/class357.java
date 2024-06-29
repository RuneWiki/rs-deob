import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public abstract class class357 {

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "I")
    public static int field5236;

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "I")
    public int field5237;

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "I")
    public static int field5238;

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "I")
    public static int field5239;

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "I")
    public int field5240;

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "I")
    public static int field5241;

    @OriginalMember(owner = "client!dk", name = "g", descriptor = "I")
    public static int field5242;

    @OriginalMember(owner = "client!dk", name = "h", descriptor = "I")
    public int field5243;

    @OriginalMember(owner = "client!dk", name = "i", descriptor = "I")
    public static int field5244;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Z)Z")
    public final boolean method2200(boolean arg0) {
        if (arg0) {
            this.method2202((byte) -18);
        }
        field5241++;
        return (this.field5243 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)V")
    public static final void method2201(int arg0) {
        class189.field3038.method2475((byte) 67);
        field5244++;
        if (arg0 == 8) {
            ;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(B)Z")
    public final boolean method2202(byte arg0) {
        field5236++;
        int var2 = -85 % ((arg0 + 49) / 38);
        return (this.field5243 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(I)Z")
    public final boolean method2203(int arg0) {
        if (arg0 == 1) {
            field5239++;
            return (this.field5243 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(B)Z")
    public final boolean method2204(byte arg0) {
        if (arg0 != -66) {
            this.field5240 = 65;
        }
        field5238++;
        return (this.field5243 & 0x8) != 0;
    }
}
