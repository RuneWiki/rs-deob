import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class272 {

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "Ltn;")
    public static class60 field4123 = new class60();

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "I")
    public static int field4121;

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "I")
    public static int field4122;

    @OriginalMember(owner = "client!wj", name = "e", descriptor = "I")
    public static int field4125;

    @OriginalMember(owner = "client!wj", name = "f", descriptor = "Lfj;")
    public static class470 field4126;

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "Lwo;")
    public static class527 field4124;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(B)V")
    public static void method1720(byte arg0) {
        field4124 = null;
        field4126 = null;
        field4123 = null;
        if (arg0 > -93) {
            field4123 = null;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(CI)C")
    public static final char method1721(char arg0, int arg1) {
        field4125++;
        if (arg0 == 'Æ') {
            return 'E';
        } else if (arg0 == 'æ') {
            return 'e';
        } else if (arg0 == 'ß') {
            return 's';
        } else if (arg0 == 'Œ') {
            return 'E';
        } else if (arg0 == 'œ') {
            return 'e';
        } else {
            return (char) (arg1 >= -21 ? 'n' : '\u0000');
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(III)V")
    public static final void method1722(int arg0, int arg1, int arg2) {
        field4122++;
        class18 var3 = class140.method1047(6, arg2, false);
        var3.method122(true);
        var3.field283 = arg1;
        if (arg0 != 14440) {
            method1722(97, 19, 87);
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(II)[B")
    public static final byte[] method1723(int arg0, int arg1) {
        if (arg1 != 6) {
            return null;
        }
        field4121++;
        class522 var2 = (class522) class205.field3273.method38((long) arg0, (byte) 41);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg0);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class32.method222(var4, -13086, var7);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class522(var3);
            class205.field3273.method35((long) arg0, -1, var2);
        }
        return var2.field7577;
    }

    static {
        new class309("You cannot report that person for Staff Impersonation, they are Jagex Staff.", "Diese Person ist ein Jagex-Mitarbeiter!", "Cette personne est un membre du personnel de Jagex, vous ne pouvez pas la signaler pour abus d'identité.", "Você não pode denunciar essa pessoa por tentar se passar por membro da equipe Jagex, pois ela faz parte da equipe.");
    }
}
