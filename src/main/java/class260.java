import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sda")
public class class260 {

    @OriginalMember(owner = "client!sda", name = "b", descriptor = "I")
    public static int field3724 = 0;

    @OriginalMember(owner = "client!sda", name = "c", descriptor = "Loaa;")
    public static class290 field3725 = new class290(4, 1, 1, 1);

    @OriginalMember(owner = "client!sda", name = "j", descriptor = "Lej;")
    public static class124 field3732 = new class124(39, 8);

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "I")
    public int field3723;

    @OriginalMember(owner = "client!sda", name = "e", descriptor = "I")
    public static int field3727;

    @OriginalMember(owner = "client!sda", name = "f", descriptor = "I")
    public static int field3728;

    @OriginalMember(owner = "client!sda", name = "g", descriptor = "I")
    public static int field3729;

    @OriginalMember(owner = "client!sda", name = "h", descriptor = "I")
    public int field3730;

    @OriginalMember(owner = "client!sda", name = "i", descriptor = "I")
    private int field3731;

    @OriginalMember(owner = "client!sda", name = "d", descriptor = "Lpg;")
    public class730 field3726;

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(ILcea;B)V")
    private final void method1749(int arg0, class215 arg1, byte arg2) {
        field3727++;
        if (arg0 == 1) {
            this.field3731 = arg1.method1478(842397944);
        } else if (arg0 == 2) {
            this.field3723 = arg1.method1535(255);
            this.field3730 = arg1.method1535(255);
        }
        if (arg2 != 4) {
            this.method1749(-8, null, (byte) 81);
        }
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(B)V")
    public static void method1750(byte arg0) {
        if (arg0 <= -71) {
            field3732 = null;
            field3725 = null;
        }
    }

    @OriginalMember(owner = "client!sda", name = "b", descriptor = "(B)Lrh;")
    public final synchronized class267 method1751(byte arg0) {
        field3728++;
        class267 var2 = (class267) this.field3726.field9882.method992((long) this.field3731, -70);
        if (var2 != null) {
            return var2;
        }
        class267 var3 = class267.method1780(this.field3726.field9872, this.field3731, 0);
        if (arg0 < 49) {
            method1750((byte) 93);
        }
        if (var3 != null) {
            this.field3726.field9882.method991(var3, (long) this.field3731, (byte) -120);
        }
        return var3;
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(Lcea;Z)V")
    public final void method1752(class215 arg0, boolean arg1) {
        while (true) {
            int var3 = arg0.method1535(255);
            if (var3 == 0) {
                field3729++;
                if (arg1) {
                    this.method1751((byte) -86);
                    return;
                }
                return;
            }
            this.method1749(var3, arg0, (byte) 4);
        }
    }
}
