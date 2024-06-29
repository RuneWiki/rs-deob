import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class581 extends class518 {

    @OriginalMember(owner = "client!tb", name = "l", descriptor = "Lcb;")
    public static class318 field8008 = new class318(71, -2);

    @OriginalMember(owner = "client!tb", name = "r", descriptor = "Lcb;")
    public static class318 field8014 = new class318(59, 3);

    @OriginalMember(owner = "client!tb", name = "k", descriptor = "I")
    public static int field8007;

    @OriginalMember(owner = "client!tb", name = "m", descriptor = "I")
    public static int field8009;

    @OriginalMember(owner = "client!tb", name = "n", descriptor = "I")
    public static int field8010;

    @OriginalMember(owner = "client!tb", name = "o", descriptor = "I")
    public static int field8011;

    @OriginalMember(owner = "client!tb", name = "p", descriptor = "I")
    public static int field8012;

    @OriginalMember(owner = "client!tb", name = "s", descriptor = "I")
    public static int field8015;

    @OriginalMember(owner = "client!tb", name = "t", descriptor = "I")
    public static int field8016;

    @OriginalMember(owner = "client!tb", name = "u", descriptor = "I")
    public static int field8017;

    @OriginalMember(owner = "client!tb", name = "v", descriptor = "I")
    public static int field8018;

    @OriginalMember(owner = "client!tb", name = "q", descriptor = "Lxa;")
    public static class424 field8013;

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(Lpea;)V")
    public class581(class641 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(II)Z")
    public static final boolean method3261(int arg0, int arg1) {
        ++field8011;
        if (arg0 > -3) {
            return false;
        } else {
            return ~arg1 == -1 || ~arg1 == -2 || arg1 == 2;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(BLwq;I)V")
    public final void method1138(byte arg0, class254 arg1, int arg2) {
        if (arg0 == 75) {
            super.field7145.method3553((byte) -127, arg1);
            ++field8018;
            super.field7145.method3524(arg2, 14);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V")
    public final void method1137(int arg0) {
        ++field8010;
        super.field7145.method3495(false, false);
        if (arg0 != 6) {
            this.method1137(30);
        }
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(ZI)Z")
    public static final boolean method3262(boolean arg0, int arg1) {
        ++field8017;
        if (!arg0) {
            return true;
        } else {
            return ~arg1 <= -5 && arg1 <= 8;
        }
    }

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "(I)V")
    public static void method3263(int arg0) {
        if (arg0 != -24537) {
            field8008 = null;
        }
        field8013 = null;
        field8014 = null;
        field8008 = null;
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(III)Lia;")
    public static final class650 method3264(int arg0, int arg1, int arg2) {
        class651 var3 = class145.field1841[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class650 var4 = var3.field9219;
            var3.field9219 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Z)Z")
    public final boolean method1131(boolean arg0) {
        if (arg0) {
            field8014 = null;
        }
        ++field8012;
        return true;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ZB)V")
    public final void method1139(boolean arg0, byte arg1) {
        if (arg1 == 127) {
            ++field8009;
            super.field7145.method3495(false, true);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ZI)V")
    public final void method1133(boolean arg0, int arg1) {
        if (arg1 < 79) {
            field8008 = null;
        }
        ++field8015;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IZI)V")
    public final void method1134(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            ++field8016;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIIII)V")
    public static final void method3265(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field8007;
        int var6 = class191.method1226(arg5, class609.field8313, class19.field169, 16);
        if (arg3 < -58) {
            int var7 = class191.method1226(arg1, class609.field8313, class19.field169, 16);
            int var8 = class191.method1226(arg4, class398.field5676, class298.field3995, 16);
            int var9 = class191.method1226(arg0, class398.field5676, class298.field3995, 16);
            for (int var10 = var6; ~var10 >= ~var7; ++var10) {
                class653.method3620(var9, var8, false, arg2, class319.field4673[var10]);
            }
        }
    }
}
