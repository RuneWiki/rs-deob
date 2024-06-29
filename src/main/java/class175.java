import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class175 {

    @OriginalMember(owner = "client!se", name = "d", descriptor = "Luc;")
    private class191 field3567 = new class191();

    @OriginalMember(owner = "client!se", name = "e", descriptor = "Ldd;")
    public static class35 field3568 = class180.method1196((byte) 127, "oberen Rand der Webseite ausw-=hlen)3");

    @OriginalMember(owner = "client!se", name = "b", descriptor = "Ldd;")
    private static class35 field3565 = class180.method1196((byte) 126, "Bad session id)3");

    @OriginalMember(owner = "client!se", name = "k", descriptor = "Ldd;")
    public static class35 field3574 = field3565;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "Ldd;")
    public static class35 field3564 = class180.method1196((byte) 126, ":trade:");

    @OriginalMember(owner = "client!se", name = "m", descriptor = "[I")
    public static int[] field3576 = new int[99];

    @OriginalMember(owner = "client!se", name = "r", descriptor = "Ldd;")
    public static class35 field3581;

    @OriginalMember(owner = "client!se", name = "p", descriptor = "I")
    public static int field3579;

    @OriginalMember(owner = "client!se", name = "s", descriptor = "[I")
    public static int[] field3582;

    @OriginalMember(owner = "client!se", name = "u", descriptor = "I")
    public static int field3584;

    @OriginalMember(owner = "client!se", name = "t", descriptor = "Ldd;")
    public static class35 field3583;

    @OriginalMember(owner = "client!se", name = "c", descriptor = "I")
    public static int field3566;

    @OriginalMember(owner = "client!se", name = "f", descriptor = "I")
    public static int field3569;

    @OriginalMember(owner = "client!se", name = "g", descriptor = "I")
    public static int field3570;

    @OriginalMember(owner = "client!se", name = "h", descriptor = "I")
    public static int field3571;

    @OriginalMember(owner = "client!se", name = "i", descriptor = "I")
    public static int field3572;

    @OriginalMember(owner = "client!se", name = "j", descriptor = "I")
    public static int field3573;

    @OriginalMember(owner = "client!se", name = "l", descriptor = "I")
    public static int field3575;

    @OriginalMember(owner = "client!se", name = "o", descriptor = "I")
    public static int field3578;

    @OriginalMember(owner = "client!se", name = "v", descriptor = "I")
    public static int field3585;

    @OriginalMember(owner = "client!se", name = "n", descriptor = "[I")
    public static int[] field3577;

    @OriginalMember(owner = "client!se", name = "q", descriptor = "[Ljd;")
    public static class93[] field3580;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIZI)I")
    public static final int method1166(int arg0, int arg1, boolean arg2, int arg3) {
        if (arg2) {
            field3564 = null;
        }
        field3566++;
        if (arg1 > 243) {
            arg3 >>= 0x4;
        } else if (arg1 > 217) {
            arg3 >>= 0x3;
        } else if (arg1 > 192) {
            arg3 >>= 0x2;
        } else if (arg1 > 179) {
            arg3 >>= 0x1;
        }
        return (arg0 >> 2 << 10) + (arg3 >> 5 << 7) + (arg1 >> 1);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ZLuc;)V")
    public final void method1167(boolean arg0, class191 arg1) {
        if (arg0) {
            field3579 = -94;
        }
        if (arg1.field3838 != null) {
            arg1.method1256((byte) 108);
        }
        field3570++;
        arg1.field3841 = this.field3567.field3841;
        arg1.field3838 = this.field3567;
        arg1.field3838.field3841 = arg1;
        arg1.field3841.field3838 = arg1;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Luc;B)V")
    public final void method1168(class191 arg0, byte arg1) {
        field3571++;
        if (arg0.field3838 != null) {
            arg0.method1256((byte) 105);
        }
        arg0.field3838 = this.field3567.field3838;
        int var3 = -2 % ((53 - arg1) / 43);
        arg0.field3841 = this.field3567;
        arg0.field3838.field3841 = arg0;
        arg0.field3841.field3838 = arg0;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(I)Luc;")
    public final class191 method1169(int arg0) {
        if (arg0 != 0) {
            field3580 = null;
        }
        class191 var2 = this.field3567.field3841;
        field3572++;
        return this.field3567 == var2 ? null : var2;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(B)V")
    public static void method1170(byte arg0) {
        field3574 = null;
        field3576 = null;
        field3582 = null;
        if (arg0 != 6) {
            return;
        }
        field3577 = null;
        field3564 = null;
        field3583 = null;
        field3581 = null;
        field3568 = null;
        field3580 = null;
        field3565 = null;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Z)Luc;")
    public final class191 method1171(boolean arg0) {
        field3569++;
        class191 var2 = this.field3567.field3841;
        if (!arg0) {
            return null;
        } else if (this.field3567 == var2) {
            return null;
        } else {
            var2.method1256((byte) 121);
            return var2;
        }
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "()V")
    public class175() {
        this.field3567.field3838 = this.field3567;
        this.field3567.field3841 = this.field3567;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field3576[var1] = var0 / 4;
        }
        field3581 = class180.method1196((byte) -22, "");
        field3579 = 0;
        field3582 = new int[50];
        field3584 = -1;
        field3583 = class180.method1196((byte) 126, " <col=ffff00>");
    }
}
