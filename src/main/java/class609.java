import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qca")
public class class609 extends class108 {

    @OriginalMember(owner = "client!qca", name = "s", descriptor = "Ljava/lang/String;")
    public String field8661;

    @OriginalMember(owner = "client!qca", name = "m", descriptor = "Lpp;")
    public static class464 field8655 = new class464(20, 12);

    @OriginalMember(owner = "client!qca", name = "o", descriptor = "Z")
    public static boolean field8657 = false;

    @OriginalMember(owner = "client!qca", name = "q", descriptor = "I")
    public static int field8659 = -1;

    @OriginalMember(owner = "client!qca", name = "p", descriptor = "[Ljava/lang/String;")
    public static String[] field8658 = new String[5];

    @OriginalMember(owner = "client!qca", name = "t", descriptor = "[C")
    public static char[] field8662 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!qca", name = "n", descriptor = "Lbv;")
    public static class567 field8656 = new class567("Connecting to update server", "Verbindung mit Update-Server...", "Connexion au serveur de mise à jour en cours", "Conectando ao servidor de atualização");

    @OriginalMember(owner = "client!qca", name = "v", descriptor = "Lio;")
    public static class151 field8664 = new class151(9, 0, 4, 1);

    @OriginalMember(owner = "client!qca", name = "w", descriptor = "Lfd;")
    public static class143 field8665 = new class143();

    @OriginalMember(owner = "client!qca", name = "x", descriptor = "Ld;")
    public static class300 field8666 = new class300();

    @OriginalMember(owner = "client!qca", name = "k", descriptor = "I")
    public static int field8653;

    @OriginalMember(owner = "client!qca", name = "r", descriptor = "I")
    public static int field8660;

    @OriginalMember(owner = "client!qca", name = "u", descriptor = "I")
    public static int field8663;

    @OriginalMember(owner = "client!qca", name = "l", descriptor = "[I")
    public static int[] field8654;

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(IIIB)I")
    public static final int method3463(int arg0, int arg1, int arg2, byte arg3) {
        field8663++;
        if (arg3 != 24) {
            method3464(true);
        }
        if ((class104.field1755[arg1][arg0][arg2] & 0x8) == 0) {
            return arg1 <= 0 || (class104.field1755[1][arg0][arg2] & 0x2) == 0 ? arg1 : arg1 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(Z)V")
    public static void method3464(boolean arg0) {
        field8665 = null;
        field8654 = null;
        if (arg0) {
            method3464(false);
        }
        field8658 = null;
        field8655 = null;
        field8664 = null;
        field8662 = null;
        field8656 = null;
        field8666 = null;
    }

    @OriginalMember(owner = "client!qca", name = "c", descriptor = "(Z)V")
    public static final void method3465(boolean arg0) {
        field8660++;
        try {
            if (!arg0 && class376.field5531 == 1) {
                int var1 = class193.field2780.method177(16);
                if (var1 > 0 && class193.field2780.method179(4)) {
                    int var2 = var1 - class442.field6468;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class193.field2780.method180(-107, var2);
                } else {
                    class193.field2780.method178(false);
                    class193.field2780.method168(-11856);
                    class595.field8464 = null;
                    class544.field7578 = null;
                    if (class69.field1309 == null) {
                        class376.field5531 = 0;
                    } else {
                        class376.field5531 = 2;
                    }
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class193.field2780.method178(arg0);
            class544.field7578 = null;
            class376.field5531 = 0;
            class595.field8464 = null;
            class69.field1309 = null;
        }
    }

    @OriginalMember(owner = "client!qca", name = "<init>", descriptor = "()V")
    public class609() {
    }

    @OriginalMember(owner = "client!qca", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class609(String arg0, int arg1) {
        this.field8661 = arg0;
    }
}
