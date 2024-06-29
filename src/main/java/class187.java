import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class187 implements class195 {

    @OriginalMember(owner = "client!ri", name = "p", descriptor = "I")
    private int field3461 = 50;

    @OriginalMember(owner = "client!ri", name = "h", descriptor = "I")
    private int field3453 = 128;

    @OriginalMember(owner = "client!ri", name = "i", descriptor = "Lab;")
    private class3 field3454;

    @OriginalMember(owner = "client!ri", name = "l", descriptor = "Lab;")
    private class3 field3457;

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "Lig;")
    private class93 field3449;

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "Lvd;")
    public static class222 field3448 = class212.method1357("scrollen:", 10731);

    @OriginalMember(owner = "client!ri", name = "q", descriptor = "Lvd;")
    public static class222 field3462 = class212.method1357("scape main", 10731);

    @OriginalMember(owner = "client!ri", name = "t", descriptor = "Lvd;")
    public static class222 field3465 = class212.method1357("(U4", 10731);

    @OriginalMember(owner = "client!ri", name = "v", descriptor = "Lvd;")
    public static class222 field3467 = class212.method1357(" <col=ffff00>", 10731);

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "[I")
    public static int[] field3446 = new int[128];

    @OriginalMember(owner = "client!ri", name = "w", descriptor = "Lka;")
    public static class109 field3468 = new class109(new byte[5000]);

    @OriginalMember(owner = "client!ri", name = "z", descriptor = "Lvd;")
    private static class222 field3471 = class212.method1357("Click to switch", 10731);

    @OriginalMember(owner = "client!ri", name = "B", descriptor = "Lvd;")
    public static class222 field3473 = field3471;

    @OriginalMember(owner = "client!ri", name = "y", descriptor = "Lvd;")
    public static class222 field3470 = class212.method1357("Unerwartete Antwort vom Anmelde)2Server)3", 10731);

    @OriginalMember(owner = "client!ri", name = "C", descriptor = "Lvd;")
    public static class222 field3474 = class212.method1357("Startseite auf (WSpielkonto wiederherstellen(W)3", 10731);

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "I")
    public static int field3447;

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "I")
    public static int field3450;

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "I")
    public static int field3451;

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "I")
    public static int field3452;

    @OriginalMember(owner = "client!ri", name = "j", descriptor = "I")
    public static int field3455;

    @OriginalMember(owner = "client!ri", name = "k", descriptor = "I")
    public static int field3456;

    @OriginalMember(owner = "client!ri", name = "m", descriptor = "I")
    public static int field3458;

    @OriginalMember(owner = "client!ri", name = "n", descriptor = "I")
    public static int field3459;

    @OriginalMember(owner = "client!ri", name = "o", descriptor = "I")
    public static int field3460;

    @OriginalMember(owner = "client!ri", name = "r", descriptor = "I")
    public static int field3463;

    @OriginalMember(owner = "client!ri", name = "s", descriptor = "I")
    public static int field3464;

    @OriginalMember(owner = "client!ri", name = "x", descriptor = "I")
    public static int field3469;

    @OriginalMember(owner = "client!ri", name = "A", descriptor = "I")
    public static int field3472;

    @OriginalMember(owner = "client!ri", name = "D", descriptor = "I")
    public static int field3475;

    @OriginalMember(owner = "client!ri", name = "u", descriptor = "Lve;")
    public static class223 field3466;

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "(II)Z")
    public final boolean method1168(int arg0, int arg1) {
        field3455++;
        if (arg1 != 2839) {
            this.method1176(-65, 77);
        }
        return this.field3453 == 64 || this.method1174(arg0, arg1 - 2967).field3729 == 64;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)V")
    public static void method1169(int arg0) {
        field3471 = null;
        field3446 = null;
        field3465 = null;
        if (arg0 != 90) {
            field3474 = null;
        }
        field3466 = null;
        field3468 = null;
        field3448 = null;
        field3473 = null;
        field3474 = null;
        field3470 = null;
        field3467 = null;
        field3462 = null;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(B)V")
    public final void method1170(byte arg0) {
        if (arg0 > -80) {
            this.method1173(69, false);
        }
        this.field3449 = new class93(this.field3461);
        field3463++;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IB)Z")
    public final boolean method1171(int arg0, byte arg1) {
        field3469++;
        if (arg1 != 10) {
            this.field3457 = null;
        }
        return this.method1174(arg0, -128).field3710;
    }

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "(II)V")
    public final void method1172(int arg0, int arg1) {
        field3472++;
        for (class203 var3 = (class203) this.field3449.method597(115); var3 != null; var3 = (class203) this.field3449.method592(0)) {
            if (var3.field3717) {
                var3.method1296(false, arg0);
                var3.field3717 = false;
            }
        }
        if (arg1 < 109) {
            method1177(-64, 85);
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IZ)[I")
    public final int[] method1173(int arg0, boolean arg1) {
        if (!arg1) {
            field3446 = null;
        }
        class203 var3 = this.method1174(arg0, -127);
        field3456++;
        return var3.method1299(this.field3453, this.field3454, 0, this);
    }

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "(II)Lte;")
    private final class203 method1174(int arg0, int arg1) {
        field3459++;
        class203 var3 = (class203) this.field3449.method601((long) arg0, 118);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = this.field3457.method33(-29616, 0, arg0);
        if (arg1 >= -126) {
            this.method1172(3, 118);
        }
        if (var4 == null) {
            return class130.method816(-122);
        } else {
            class109 var5 = new class109(var4);
            class203 var6 = new class203(var5);
            this.field3449.method593((long) arg0, var6, (byte) -12);
            return var6;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIF)[I")
    public final int[] method1175(int arg0, int arg1, float arg2) {
        class203 var4 = this.method1174(arg0, -127);
        field3458++;
        var4.field3717 = true;
        return arg1 > -11 ? null : var4.method1295(this.field3453, arg2, (byte) -56, this, this.field3454);
    }

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "(II)Z")
    public final boolean method1176(int arg0, int arg1) {
        field3452++;
        if (arg1 != 31960) {
            field3465 = null;
        }
        return this.method1174(arg0, -127).field3727;
    }

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "(II)Z")
    public static final boolean method1177(int arg0, int arg1) {
        field3451++;
        if (arg0 != 90) {
            method1177(38, -6);
        }
        if (arg1 >= 97 && arg1 <= 122) {
            return true;
        } else if (arg1 >= 65 && arg1 <= 90) {
            return true;
        } else {
            return arg1 >= 48 && arg1 <= 57;
        }
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(B)I")
    public static final int method1178(byte arg0) {
        if (arg0 < 21) {
            return -76;
        } else {
            field3450++;
            return 6;
        }
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(II)Z")
    public final boolean method1179(int arg0, int arg1) {
        field3460++;
        if (arg0 != -4606) {
            this.method1179(-107, 123);
        }
        return this.method1174(arg1, -128).method1293(this, this.field3454, true);
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(II)I")
    public final int method1180(int arg0, int arg1) {
        if (arg0 != -11217) {
            method1169(-43);
        }
        field3447++;
        return this.method1174(arg1, arg0 ^ 0x2BAF).field3718;
    }

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(Lab;Lab;II)V")
    public class187(class3 arg0, class3 arg1, int arg2, int arg3) {
        this.field3454 = arg1;
        this.field3461 = arg2;
        this.field3453 = arg3;
        this.field3457 = arg0;
        this.field3449 = new class93(this.field3461);
    }
}
