import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class145 extends class88 {

    @OriginalMember(owner = "client!va", name = "y", descriptor = "[I")
    public static int[] field3336 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!va", name = "x", descriptor = "B")
    public static byte field3335 = 0;

    @OriginalMember(owner = "client!va", name = "B", descriptor = "I")
    public static int field3339 = 0;

    @OriginalMember(owner = "client!va", name = "z", descriptor = "[S")
    public static short[] field3337 = new short[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486 };

    @OriginalMember(owner = "client!va", name = "J", descriptor = "[I")
    public static int[] field3347 = new int[256];

    @OriginalMember(owner = "client!va", name = "G", descriptor = "Ltd;")
    public static class136 field3344 = method1172("Gegenstand f-Ur Mitglieder", 45);

    @OriginalMember(owner = "client!va", name = "I", descriptor = "Ltd;")
    public static class136 field3346 = method1172("zur-Uck auf die RuneScape)2Webseite gehen", 45);

    @OriginalMember(owner = "client!va", name = "R", descriptor = "Ltd;")
    private static class136 field3355 = method1172(" from your ignore list first", 45);

    @OriginalMember(owner = "client!va", name = "F", descriptor = "Ltd;")
    private static class136 field3343 = method1172("Choose Option", 45);

    @OriginalMember(owner = "client!va", name = "w", descriptor = "Ltd;")
    public static class136 field3334 = field3355;

    @OriginalMember(owner = "client!va", name = "S", descriptor = "I")
    public static int field3356 = 0;

    @OriginalMember(owner = "client!va", name = "K", descriptor = "Ltd;")
    private static class136 field3348 = method1172("Take", 45);

    @OriginalMember(owner = "client!va", name = "M", descriptor = "Ltd;")
    public static class136 field3350 = field3348;

    @OriginalMember(owner = "client!va", name = "O", descriptor = "Ltd;")
    public static class136 field3352 = field3343;

    @OriginalMember(owner = "client!va", name = "T", descriptor = "Ltd;")
    public static class136 field3357 = method1172("und haben es deaktiviert)3 Klicken Sie auf der", 45);

    @OriginalMember(owner = "client!va", name = "v", descriptor = "I")
    public static int field3333;

    @OriginalMember(owner = "client!va", name = "A", descriptor = "I")
    public static int field3338;

    @OriginalMember(owner = "client!va", name = "C", descriptor = "I")
    public static int field3340;

    @OriginalMember(owner = "client!va", name = "D", descriptor = "I")
    public static int field3341;

    @OriginalMember(owner = "client!va", name = "H", descriptor = "I")
    public static int field3345;

    @OriginalMember(owner = "client!va", name = "P", descriptor = "I")
    public static int field3353;

    @OriginalMember(owner = "client!va", name = "Q", descriptor = "I")
    public static int field3354;

    @OriginalMember(owner = "client!va", name = "E", descriptor = "Lva;")
    public class145 field3342;

    @OriginalMember(owner = "client!va", name = "L", descriptor = "Lva;")
    public class145 field3349;

    @OriginalMember(owner = "client!va", name = "N", descriptor = "Lfc;")
    public static class39 field3351;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "([Ltd;III)Ltd;")
    public static final class136 method1169(class136[] arg0, int arg1, int arg2, int arg3) {
        field3341++;
        int var4 = 0;
        for (int var5 = 0; var5 < arg1; var5++) {
            if (arg0[arg3 + var5] == null) {
                arg0[arg3 + var5] = class71.field1496;
            }
            var4 += arg0[arg3 + var5].field3183;
        }
        byte[] var6 = new byte[var4];
        int var7 = 0;
        for (int var8 = 0; var8 < arg1; var8++) {
            class136 var10 = arg0[arg3 + var8];
            class138.method1132(var10.field3182, 0, var6, var7, var10.field3183);
            var7 += var10.field3183;
        }
        if (arg2 != 10352) {
            field3339 = -14;
        }
        class136 var9 = new class136();
        var9.field3182 = var6;
        var9.field3183 = var4;
        return var9;
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(B)V")
    public static void method1170(byte arg0) {
        field3343 = null;
        field3348 = null;
        field3355 = null;
        field3346 = null;
        if (arg0 >= -40) {
            field3351 = null;
        }
        field3336 = null;
        field3347 = null;
        field3350 = null;
        field3357 = null;
        field3337 = null;
        field3352 = null;
        field3334 = null;
        field3344 = null;
        field3351 = null;
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(Z)V")
    public final void method1171(boolean arg0) {
        field3353++;
        if (this.field3342 == null) {
            return;
        }
        this.field3342.field3349 = this.field3349;
        this.field3349.field3342 = this.field3342;
        this.field3342 = null;
        if (!arg0) {
            field3344 = null;
        }
        this.field3349 = null;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Ljava/lang/String;I)Ltd;")
    public static final class136 method1172(String arg0, int arg1) {
        field3333++;
        byte[] var2 = arg0.getBytes();
        int var3 = var2.length;
        if (arg1 != 45) {
            method1173(null, 32);
        }
        int var4 = 0;
        class136 var5 = new class136();
        var5.field3182 = new byte[var3];
        while (var3 > var4) {
            int var6 = var2[var4++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var4 >= var3) {
                    break;
                }
                int var7 = var2[var4++] & 0xFF;
                var5.field3182[var5.field3183++] = (byte) (var7 + var6 * 43 - 48 - 1720);
            } else if (var6 != 0) {
                var5.field3182[var5.field3183++] = (byte) var6;
            }
        }
        var5.method1098(-122);
        return var5.method1101(3117);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Lke;I)V")
    public static final void method1173(class74 arg0, int arg1) {
        if (class141.field3272 == arg0.field1612) {
            class154.field3511[arg0.field1578] = true;
        }
        if (arg1 != -4008) {
            field3352 = null;
        }
        field3354++;
    }

    @OriginalMember(owner = "client!va", name = "c", descriptor = "(I)V")
    public static final void method1174(int arg0) {
        if (arg0 > -49) {
            method1174(-16);
        }
        field3338++;
        if (class3.field60 != null) {
            class3.field60.method144(1);
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IBLke;IIIII)V")
    public static final void method1175(int arg0, byte arg1, class74 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3345++;
        if (class37.field873) {
            class154.field3523 = 32;
        } else {
            class154.field3523 = 0;
        }
        class37.field873 = false;
        if (arg1 != 16) {
            method1174(-12);
        }
        if (class133.field3139 != 0) {
            if (arg5 >= arg7 && arg7 + 16 > arg5 && arg4 >= arg6 && arg6 + 16 > arg4) {
                arg2.field1646 -= 4;
                method1173(arg2, -4008);
            } else if (arg5 >= arg7 && arg5 < arg7 + 16 && arg6 + arg0 - 16 <= arg4 && arg4 < arg0 + arg6) {
                arg2.field1646 += 4;
                method1173(arg2, -4008);
            } else if (arg7 - class154.field3523 <= arg5 && arg7 + class154.field3523 + 16 > arg5 && arg4 >= arg6 + 16 && arg6 + arg0 - 16 > arg4) {
                int var8 = (arg0 - 32) * arg0 / arg3;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg0 - var8 - 32;
                int var10 = arg4 - arg6 - var8 / 2 - 16;
                arg2.field1646 = (arg3 - arg0) * var10 / var9;
                method1173(arg2, -4008);
                class37.field873 = true;
            }
        }
        if (class83.field1975 == 0) {
            return;
        }
        int var11 = arg2.field1545;
        if (arg7 - var11 <= arg5 && arg6 <= arg4 && arg5 < arg7 + 16 && arg0 + arg6 >= arg4) {
            arg2.field1646 += class83.field1975 * 45;
            method1173(arg2, -4008);
            return;
        }
    }
}
