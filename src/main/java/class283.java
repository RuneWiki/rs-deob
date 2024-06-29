import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class283 {

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "I")
    private int field3588 = 0;

    @OriginalMember(owner = "client!rm", name = "i", descriptor = "I")
    private int field3596 = 0;

    @OriginalMember(owner = "client!rm", name = "f", descriptor = "I")
    private int field3593 = 0;

    @OriginalMember(owner = "client!rm", name = "m", descriptor = "Lsq;")
    private class119 field3600 = null;

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "Lug;")
    private class395 field3591;

    @OriginalMember(owner = "client!rm", name = "l", descriptor = "Lpl;")
    private class462 field3599;

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "[Ltr;")
    private class193[] field3590;

    @OriginalMember(owner = "client!rm", name = "j", descriptor = "Loc;")
    public class137 field3597;

    @OriginalMember(owner = "client!rm", name = "k", descriptor = "Ldq;")
    public static class493 field3598 = new class493(59, 6);

    @OriginalMember(owner = "client!rm", name = "o", descriptor = "I")
    public static int field3602;

    @OriginalMember(owner = "client!rm", name = "q", descriptor = "I")
    public static int field3604;

    @OriginalMember(owner = "client!rm", name = "r", descriptor = "[Ljava/lang/String;")
    public static String[] field3605;

    @OriginalMember(owner = "client!rm", name = "p", descriptor = "Lkg;")
    public static class179 field3603;

    @OriginalMember(owner = "client!rm", name = "t", descriptor = "[Ljava/lang/String;")
    public static String[] field3607;

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "I")
    public static int field3589;

    @OriginalMember(owner = "client!rm", name = "e", descriptor = "I")
    public static int field3592;

    @OriginalMember(owner = "client!rm", name = "g", descriptor = "I")
    public static int field3594;

    @OriginalMember(owner = "client!rm", name = "h", descriptor = "I")
    public static int field3595;

    @OriginalMember(owner = "client!rm", name = "n", descriptor = "I")
    public static int field3601;

    @OriginalMember(owner = "client!rm", name = "s", descriptor = "I")
    public static int field3606;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(ILsq;I)Z")
    public final boolean method1671(int arg0, class119 arg1, int arg2) {
        if (arg2 <= 84) {
            this.method1672(-60, 70);
        }
        field3595++;
        if (this.field3596 == 0) {
            return false;
        }
        if (this.field3600 != arg1) {
            this.field3590[Integer.MAX_VALUE & this.field3596].method97(arg1, arg0, 36);
            this.field3600 = arg1;
        }
        return true;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(II)Z")
    public final boolean method1672(int arg0, int arg1) {
        field3592++;
        return arg0 == -18491 ? this.field3590[arg1].method93(false) : true;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(III)V")
    public final void method1673(int arg0, int arg1, int arg2) {
        if (this.field3596 != 0 & (this.field3588 != arg2 | this.field3593 != arg0)) {
            this.field3590[Integer.MAX_VALUE & this.field3596].method99(arg0, arg2, false);
            this.field3593 = arg0;
            this.field3588 = arg2;
        }
        field3594++;
        if (arg1 != Integer.MAX_VALUE) {
            field3606 = 5;
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(ZIIZ)V")
    public final void method1674(boolean arg0, int arg1, int arg2, boolean arg3) {
        boolean var5 = arg0 & this.field3591.method297();
        field3589++;
        if (arg1 != -15272) {
            this.method1673(109, -116, 17);
        }
        if (!var5 && (arg2 == 4 || arg2 == 8)) {
            arg2 = 2;
        }
        if (arg2 != 0 && arg3) {
            arg2 |= Integer.MIN_VALUE;
        }
        if (this.field3596 != arg2) {
            if (this.field3596 != 0) {
                this.field3590[Integer.MAX_VALUE & this.field3596].method92((byte) -87);
            }
            if (arg2 != 0) {
                this.field3590[arg2 & Integer.MAX_VALUE].method94(true, arg3);
                this.field3590[arg2 & Integer.MAX_VALUE].method95(arg3, true);
            }
            this.field3596 = arg2;
            this.field3593 = Integer.MIN_VALUE;
            this.field3588 = Integer.MIN_VALUE;
            this.field3600 = null;
        } else if (this.field3596 != 0) {
            this.field3590[Integer.MAX_VALUE & this.field3596].method95(arg3, true);
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)V")
    public static void method1675(int arg0) {
        field3603 = null;
        field3598 = null;
        if (arg0 != 0) {
            method1675(-30);
        }
        field3607 = null;
        field3605 = null;
    }

    @OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(Lug;)V")
    public class283(class395 arg0) {
        this.field3591 = arg0;
        this.field3599 = new class462(arg0);
        this.field3590 = new class193[10];
        this.field3590[1] = new class298(arg0);
        this.field3590[2] = new class12(arg0, this.field3599);
        this.field3590[4] = new class394(arg0, this.field3599);
        this.field3590[5] = new class484(arg0, this.field3599);
        this.field3590[6] = new class110(arg0);
        this.field3590[7] = new class461(arg0);
        this.field3590[3] = this.field3597 = new class137(arg0);
        this.field3590[8] = new class122(arg0, this.field3599);
        this.field3590[9] = new class233(arg0, this.field3599);
        if (!this.field3590[8].method93(false)) {
            this.field3590[8] = this.field3590[4];
        }
        if (!this.field3590[9].method93(false)) {
            this.field3590[9] = this.field3590[8];
        }
    }

    static {
        new class335("For that rule you can only report players who have spoken or traded recently.", "Mit dieser Option können nur Spieler gemeldet werden,", "Cette règle n'est invocable que pour les discussions ou échanges récents.", "Para essa regra, você só pode denunciar jogadores com quem tenha falado ou negociado recentemente.");
        field3602 = 0;
        field3604 = -1;
        field3605 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };
        field3603 = new class179(19, 8);
        field3607 = new String[] { "en", "de", "fr", "pt", "nl" };
    }
}
