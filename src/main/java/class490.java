import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public class class490 extends class1 {

    @OriginalMember(owner = "client!dq", name = "l", descriptor = "Llt;")
    public static class475 field7236 = new class475("Continue", "Weiter", "Continuer", "Continuar");

    @OriginalMember(owner = "client!dq", name = "m", descriptor = "Lki;")
    public static class498 field7237 = new class498(81, 7);

    @OriginalMember(owner = "client!dq", name = "n", descriptor = "Lri;")
    public static class73 field7238 = new class73(17, 3);

    @OriginalMember(owner = "client!dq", name = "o", descriptor = "[S")
    public static short[] field7239 = new short[] { 17, 6, 25, 49, 10, 3, 60, 9 };

    @OriginalMember(owner = "client!dq", name = "p", descriptor = "I")
    public static int field7240 = 0;

    @OriginalMember(owner = "client!dq", name = "i", descriptor = "I")
    public static int field7233;

    @OriginalMember(owner = "client!dq", name = "j", descriptor = "I")
    public static int field7234;

    @OriginalMember(owner = "client!dq", name = "k", descriptor = "I")
    public static int field7235;

    static {
        new class475("You cannot report that person for Staff Impersonation, they are Jagex Staff.", "Diese Person ist ein Jagex-Mitarbeiter!", "Cette personne est un membre du personnel de Jagex, vous ne pouvez pas la signaler pour abus d'identité.", "Você não pode denunciar essa pessoa por tentar se passar por membro da equipe Jagex, pois ela faz parte da equipe.");
    }

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "(Z)V", line = 21)
    public static final void method2917(boolean arg0) {
        field7235++;
        if (class482.field7063 == class447.field6662) {
            return;
        }
        try {
            class501.method2995("tbrefresh", (byte) 83, class436.field6522);
            if (!arg0) {
                method2919(39);
            }
        } catch (Throwable var1) {
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(IIB)I", line = 40)
    public static final int method2918(int arg0, int arg1, byte arg2) {
        field7233++;
        if (arg1 == -1) {
            return 12345678;
        }
        if (arg2 != -79) {
            method2917(true);
        }
        int var3 = (arg1 & 0x7F) * arg0 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg1 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "(I)V", line = 69)
    public static void method2919(int arg0) {
        field7236 = null;
        field7237 = null;
        field7239 = null;
        field7238 = null;
        if (arg0 != -24089) {
            field7236 = null;
        }
    }

    @OriginalMember(owner = "client!dq", name = "c", descriptor = "(I)V", line = 92)
    public static final void method2920(int arg0) {
        class11.method73(true);
        field7234++;
        class33.field345 = null;
        class419.field6306 = null;
        class246.field3628 = null;
        class251.field3732 = null;
        int var1 = -123 % ((arg0 - 60) / 53);
        class491.field7281 = null;
    }
}
