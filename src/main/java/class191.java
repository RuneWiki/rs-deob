import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class191 {

    @OriginalMember(owner = "client!va", name = "e", descriptor = "Led;")
    public static class43 field3715 = method1219("(U5", false);

    @OriginalMember(owner = "client!va", name = "d", descriptor = "Led;")
    private static class43 field3714 = method1219("Select a world", false);

    @OriginalMember(owner = "client!va", name = "p", descriptor = "Led;")
    public static class43 field3726 = field3714;

    @OriginalMember(owner = "client!va", name = "j", descriptor = "I")
    public static int field3720 = 0;

    @OriginalMember(owner = "client!va", name = "i", descriptor = "Led;")
    public static class43 field3719 = method1219("Hier wechseln", false);

    @OriginalMember(owner = "client!va", name = "q", descriptor = "I")
    public static int field3727 = 0;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "I")
    public static int field3711;

    @OriginalMember(owner = "client!va", name = "b", descriptor = "I")
    public int field3712;

    @OriginalMember(owner = "client!va", name = "c", descriptor = "I")
    public int field3713;

    @OriginalMember(owner = "client!va", name = "f", descriptor = "I")
    public static int field3716;

    @OriginalMember(owner = "client!va", name = "h", descriptor = "I")
    public static int field3718;

    @OriginalMember(owner = "client!va", name = "k", descriptor = "I")
    public int field3721;

    @OriginalMember(owner = "client!va", name = "l", descriptor = "I")
    public static int field3722;

    @OriginalMember(owner = "client!va", name = "m", descriptor = "I")
    public int field3723;

    @OriginalMember(owner = "client!va", name = "r", descriptor = "I")
    public int field3728;

    @OriginalMember(owner = "client!va", name = "o", descriptor = "Lnb;")
    public static class120 field3725;

    @OriginalMember(owner = "client!va", name = "n", descriptor = "Lga;")
    public static class58 field3724;

    @OriginalMember(owner = "client!va", name = "g", descriptor = "Lka;")
    public class92 field3717;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Z)V")
    public static final void method1215(boolean arg0) {
        Object var1 = class122.field2441;
        synchronized (class122.field2441) {
            if (class67.field1349 != 0) {
                class67.field1349 = 1;
                try {
                    class122.field2441.wait();
                } catch (InterruptedException var2) {
                }
            }
        }
        field3722++;
        if (arg0) {
            field3719 = null;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(II)Lfe;")
    public static final class53 method1216(int arg0, int arg1) {
        if (arg0 != 255) {
            method1219(null, true);
        }
        field3711++;
        class53 var2 = (class53) class174.field3460.method1106(100, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class84.field1649.method367(16, arg1, (byte) -34);
        class53 var4 = new class53();
        if (var3 != null) {
            var4.method321(new class89(var3), (byte) 127);
        }
        class174.field3460.method1107((long) arg1, var4, 26);
        return var4;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I)V")
    public static void method1217(int arg0) {
        field3725 = null;
        field3724 = null;
        field3714 = null;
        field3719 = null;
        field3726 = null;
        if (arg0 == 0) {
            field3715 = null;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ZZZ)I")
    public static final int method1218(boolean arg0, boolean arg1, boolean arg2) {
        field3716++;
        int var3 = 0;
        if (arg1) {
            var3 += class185.field3653 + class206.field4039;
        }
        if (arg2) {
            field3724 = null;
        }
        if (arg0) {
            var3 += class39.field750 + class76.field1502;
        }
        return var3;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Ljava/lang/String;Z)Led;")
    public static final class43 method1219(String arg0, boolean arg1) {
        field3718++;
        byte[] var2 = arg0.getBytes();
        int var3 = 0;
        int var4 = var2.length;
        class43 var5 = new class43();
        var5.field844 = new byte[var4];
        while (var4 > var3) {
            int var6 = var2[var3++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var3 >= var4) {
                    break;
                }
                int var7 = var2[var3++] & 0xFF;
                var5.field844[var5.field818++] = (byte) (var6 * 43 + var7 - 1720 - 48);
            } else if (var6 != 0) {
                var5.field844[var5.field818++] = (byte) var6;
            }
        }
        if (arg1) {
            field3725 = null;
        }
        var5.method270(0);
        return var5.method271(-65);
    }
}
