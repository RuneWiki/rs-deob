import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class202 extends class114 {

    @OriginalMember(owner = "client!ik", name = "L", descriptor = "Lia;")
    private static class257 field3455 = class28.method234(95, "World");

    @OriginalMember(owner = "client!ik", name = "K", descriptor = "Lia;")
    public static class257 field3454 = class28.method234(-87, "blaugr-Un:");

    @OriginalMember(owner = "client!ik", name = "P", descriptor = "Lia;")
    public static class257 field3459 = class28.method234(110, "AUS");

    @OriginalMember(owner = "client!ik", name = "O", descriptor = "Lia;")
    public static class257 field3458 = field3455;

    @OriginalMember(owner = "client!ik", name = "G", descriptor = "I")
    public int field3450;

    @OriginalMember(owner = "client!ik", name = "H", descriptor = "I")
    public static int field3451;

    @OriginalMember(owner = "client!ik", name = "I", descriptor = "I")
    public static int field3452;

    @OriginalMember(owner = "client!ik", name = "J", descriptor = "I")
    public static int field3453;

    @OriginalMember(owner = "client!ik", name = "N", descriptor = "I")
    public static int field3457;

    @OriginalMember(owner = "client!ik", name = "Q", descriptor = "I")
    public static int field3460;

    @OriginalMember(owner = "client!ik", name = "R", descriptor = "I")
    public static int field3461;

    @OriginalMember(owner = "client!ik", name = "M", descriptor = "Lia;")
    public class257 field3456;

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "(I)V")
    public final void method1354(int arg0) {
        super.field2055 |= Long.MIN_VALUE;
        if (this.method1356(107) == 0L) {
            class203.field3486.method985(this, (byte) 27);
        }
        if (arg0 > 49) {
            ++field3452;
        }
    }

    @OriginalMember(owner = "client!ik", name = "g", descriptor = "(I)V")
    public final void method1355(int arg0) {
        super.field2055 = Long.MIN_VALUE & super.field2055 | 500L + class80.method600(-85);
        if (arg0 < 48) {
            field3458 = null;
        }
        ++field3451;
        class80.field1562.method985(this, (byte) 27);
    }

    @OriginalMember(owner = "client!ik", name = "h", descriptor = "(I)J")
    public final long method1356(int arg0) {
        ++field3460;
        if (arg0 <= 15) {
            this.field3450 = 78;
        }
        return Long.MAX_VALUE & super.field2055;
    }

    @OriginalMember(owner = "client!ik", name = "i", descriptor = "(I)I")
    public final int method1357(int arg0) {
        if (arg0 < 61) {
            this.method1360((byte) 115);
        }
        ++field3461;
        return (int) (super.field573 >>> 32 & 255L);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lia;Z)Z")
    public static final boolean method1358(class257 arg0, boolean arg1) {
        ++field3453;
        if (arg0 == null) {
            return false;
        } else {
            if (!arg1) {
                field3455 = null;
            }
            for (int var2 = 0; ~var2 > ~class185.field3215; ++var2) {
                if (arg0.method1681((byte) -124, class221.field3743[var2])) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ik", name = "j", descriptor = "(I)V")
    public static void method1359(int arg0) {
        field3459 = null;
        if (arg0 <= 55) {
            method1358((class257) null, false);
        }
        field3458 = null;
        field3454 = null;
        field3455 = null;
    }

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "(B)I")
    public final int method1360(byte arg0) {
        ++field3457;
        if (arg0 > -126) {
            this.method1360((byte) -57);
        }
        return (int) super.field573;
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(II)V")
    public class202(int arg0, int arg1) {
        super.field573 = (long) arg0 << 32 | (long) arg1;
    }
}
