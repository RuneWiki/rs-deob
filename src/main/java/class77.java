import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public abstract class class77 {

    @OriginalMember(owner = "client!wp", name = "e", descriptor = "Z")
    public static boolean field1167;

    @OriginalMember(owner = "client!wp", name = "g", descriptor = "I")
    public static int field1169;

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "I")
    public static int field1163;

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "I")
    public static int field1164;

    @OriginalMember(owner = "client!wp", name = "c", descriptor = "I")
    public static int field1165;

    @OriginalMember(owner = "client!wp", name = "d", descriptor = "I")
    public static int field1166;

    @OriginalMember(owner = "client!wp", name = "f", descriptor = "[I")
    public static int[] field1168;

    static {
        new class112("You cannot report that person for Staff Impersonation, they are Jagex Staff.", "Diese Person ist ein Jagex-Mitarbeiter!", "Cette personne est un membre du personnel de Jagex, vous ne pouvez pas la signaler pour abus d'identité.", "Você não pode denunciar essa pessoa por tentar se passar por membro da equipe Jagex, pois ela faz parte da equipe.");
        field1167 = false;
        field1169 = 0;
    }

    @OriginalMember(owner = "client!wp", name = "c", descriptor = "(I)V", line = 12)
    public static void method532(int arg0) {
        if (arg0 >= -26) {
            method534(117, (class487) null);
        }
        field1168 = null;
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(B)V", line = 32)
    public static final void method533(byte arg0) {
        class224.field3175 = null;
        class47.field764 = null;
        field1163++;
        class465.field6534 = null;
        class289.field3964 = null;
        class81.field1226 = false;
        int var1 = 116 / ((arg0 + 47) / 34);
        class478.field6760 = null;
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(ILkm;)V", line = 48)
    public static final void method534(int arg0, class487 arg1) {
        if (arg0 != 13521) {
            method534(46, (class487) null);
        }
        field1165++;
        if (class351.field4800) {
            class230.method1447(arg1, 0);
        } else {
            class6.method82(arg1, 2);
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(Z)V")
    public abstract void method528(boolean arg0);

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(I)Lau;")
    public abstract class304 method529(int arg0);

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "(I)V")
    public abstract void method530(int arg0);

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(II)Z")
    public abstract boolean method531(int arg0, int arg1);
}
