import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public class class33 {

    @OriginalMember(owner = "client!mq", name = "j", descriptor = "I")
    private int field459;

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "[Lsq;")
    private class29[] field451;

    @OriginalMember(owner = "client!mq", name = "g", descriptor = "Lji;")
    public static class67 field456 = new class67(14, 1);

    @OriginalMember(owner = "client!mq", name = "l", descriptor = "Lji;")
    public static class67 field461 = new class67(15, 4);

    @OriginalMember(owner = "client!mq", name = "m", descriptor = "Lji;")
    public static class67 field462 = new class67(16, -2);

    @OriginalMember(owner = "client!mq", name = "n", descriptor = "Lji;")
    public static class67 field463 = new class67(17, 0);

    @OriginalMember(owner = "client!mq", name = "o", descriptor = "Lji;")
    public static class67 field464 = new class67(18, -2);

    @OriginalMember(owner = "client!mq", name = "p", descriptor = "Lji;")
    public static class67 field465 = new class67(20, 6);

    @OriginalMember(owner = "client!mq", name = "q", descriptor = "Lji;")
    public static class67 field466 = new class67(21, 8);

    @OriginalMember(owner = "client!mq", name = "r", descriptor = "Lji;")
    public static class67 field467 = new class67(22, -2);

    @OriginalMember(owner = "client!mq", name = "s", descriptor = "Lji;")
    public static class67 field468 = new class67(23, 4);

    @OriginalMember(owner = "client!mq", name = "t", descriptor = "Lji;")
    public static class67 field469 = new class67(24, -1);

    @OriginalMember(owner = "client!mq", name = "u", descriptor = "[Lji;")
    private static class67[] field470 = new class67[32];

    @OriginalMember(owner = "client!mq", name = "v", descriptor = "Ljn;")
    public static class409 field471;

    @OriginalMember(owner = "client!mq", name = "w", descriptor = "Z")
    public static boolean field472;

    @OriginalMember(owner = "client!mq", name = "y", descriptor = "[Lsc;")
    public static class408[] field474;

    @OriginalMember(owner = "client!mq", name = "x", descriptor = "I")
    public static int field473;

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "I")
    public static int field450;

    @OriginalMember(owner = "client!mq", name = "c", descriptor = "I")
    public static int field452;

    @OriginalMember(owner = "client!mq", name = "d", descriptor = "I")
    public static int field453;

    @OriginalMember(owner = "client!mq", name = "e", descriptor = "I")
    public static int field454;

    @OriginalMember(owner = "client!mq", name = "f", descriptor = "I")
    public static int field455;

    @OriginalMember(owner = "client!mq", name = "k", descriptor = "I")
    public static int field460;

    @OriginalMember(owner = "client!mq", name = "i", descriptor = "J")
    private long field458;

    @OriginalMember(owner = "client!mq", name = "h", descriptor = "Lsq;")
    private class29 field457;

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(B)V")
    public static void method313(byte arg0) {
        field456 = null;
        field466 = null;
        field471 = null;
        field465 = null;
        if (arg0 < 62) {
            field473 = 92;
        }
        field461 = null;
        field464 = null;
        field470 = null;
        field467 = null;
        field462 = null;
        field468 = null;
        field463 = null;
        field474 = null;
        field469 = null;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(I)Lsq;")
    public final class29 method314(int arg0) {
        field455++;
        if (this.field457 == null) {
            return null;
        }
        class29 var2 = this.field451[(int) ((long) (this.field459 + arg0) & this.field458)];
        while (this.field457 != var2) {
            if (this.field457.field406 == this.field458) {
                class29 var3 = this.field457;
                this.field457 = this.field457.field407;
                return var3;
            }
            this.field457 = this.field457.field407;
        }
        this.field457 = null;
        return null;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(IIIBIIIIII)V")
    public static final void method315(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field450++;
        if (arg4 < 128 || arg6 < 128 || (class195.field2745 - 2) * 128 < arg4 || arg6 > class78.field984 * 128 - 256) {
            class18.field296[0] = class18.field296[1] = -1;
            return;
        }
        int var10 = class133.method889(arg9, arg4, arg6, false) - arg7;
        class444.field6476.method823(arg0, 0, 0);
        if (arg3 < 34) {
            method319(94, (String) null, (String) null, -127);
        }
        class74.field942.method107(class444.field6476);
        class74.field942.method114(arg4, var10, arg6, class18.field296);
        class444.field6476.method823(-arg0, 0, 0);
        class74.field942.method107(class444.field6476);
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(JZLsq;)V")
    public final void method316(long arg0, boolean arg1, class29 arg2) {
        if (arg2.field412 != null) {
            arg2.method299((byte) -86);
        }
        field453++;
        class29 var5 = this.field451[(int) (arg0 & (long) (this.field459 - 1))];
        arg2.field412 = var5.field412;
        arg2.field407 = var5;
        arg2.field412.field407 = arg2;
        arg2.field406 = arg0;
        if (!arg1) {
            arg2.field407.field412 = arg2;
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(ICI)I")
    public static final int method317(int arg0, char arg1, int arg2) {
        field460++;
        int var3 = arg1 << 4;
        if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
            arg1 = Character.toLowerCase(arg1);
            var3 = (arg1 << 4) + 1;
        }
        if (arg0 >= -47) {
            return 110;
        } else {
            if (arg1 == 'ñ' && arg2 == 0) {
                var3 = 1762;
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(JI)Lsq;")
    public final class29 method318(long arg0, int arg1) {
        this.field458 = arg0;
        field454++;
        class29 var4 = this.field451[(int) (arg0 & (long) (this.field459 - 1))];
        int var5 = 18 / ((-arg1 - 59) / 63);
        for (this.field457 = var4.field407; this.field457 != var4; this.field457 = this.field457.field407) {
            if (this.field457.field406 == arg0) {
                class29 var6 = this.field457;
                this.field457 = this.field457.field407;
                return var6;
            }
        }
        this.field457 = null;
        return null;
    }

    @OriginalMember(owner = "client!mq", name = "<init>", descriptor = "(I)V")
    public class33(int arg0) {
        this.field459 = arg0;
        this.field451 = new class29[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class29 var3 = this.field451[var2] = new class29();
            var3.field412 = var3;
            var3.field407 = var3;
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V")
    public static final void method319(int arg0, String arg1, String arg2, int arg3) {
        field452++;
        class189.field2636 = arg1;
        class338.field4981 = arg3;
        class216.field3087 = arg2;
        if (class216.field3087.equals("") || class189.field2636.equals("")) {
            class92.field1150 = 3;
            return;
        }
        if (arg0 > -91) {
            field464 = null;
        }
        if (class403.field5825 != -1) {
            class67.method502(0);
            return;
        }
        class299.field4355 = 1;
        class247.field3641 = 0;
        class210.field2966 = 0;
        class92.field1150 = -3;
        class256 var4 = new class256(128);
        var4.method1727(-128, 10);
        var4.method1721(25153, (int) (Math.random() * 9.9999999E7D));
        var4.method1730(class91.method619(117, class216.field3087), false);
        var4.method1721(25153, (int) (Math.random() * 9.9999999E7D));
        var4.method1712(class189.field2636, -79);
        var4.method1721(25153, (int) (Math.random() * 9.9999999E7D));
        var4.method1713(99, class402.field5802, class62.field824);
        class159.field2132.field3762 = 0;
        class159.field2132.method1727(-128, field469.field892);
        class159.field2132.method1727(-128, var4.field3762 + 2);
        class159.field2132.method1750((byte) 0, 571);
        class159.field2132.method1739(var4.field3762, 0, var4.field3764, (byte) 28);
    }

    static {
        class67[] var0 = class155.method1057(-77);
        for (int var1 = 0; var1 < var0.length; var1++) {
            field470[var0[var1].field892] = var0[var1];
        }
        field471 = new class409("cyan:", "blaugrün:", "cyan:", "cyan:");
        field472 = false;
        field474 = new class408[128];
        field473 = -1;
        new class409("Your clan channel has now been disabled!", "Dein Chatraum ist jetzt ausgeschaltet.", "Votre canal de clan est désactivé.", "Seu canal de clã foi desativado!");
    }
}
