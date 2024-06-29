import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public abstract class class202 {

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "Lff;")
    public static class9 field2794 = new class9(0, 0);

    @OriginalMember(owner = "client!wt", name = "i", descriptor = "Lcu;")
    public static class145 field2801;

    @OriginalMember(owner = "client!wt", name = "j", descriptor = "Lcu;")
    public static class145 field2802;

    @OriginalMember(owner = "client!wt", name = "c", descriptor = "F")
    public static float field2795;

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "I")
    public static int field2793;

    @OriginalMember(owner = "client!wt", name = "d", descriptor = "I")
    public static int field2796;

    @OriginalMember(owner = "client!wt", name = "g", descriptor = "I")
    public static int field2799;

    @OriginalMember(owner = "client!wt", name = "h", descriptor = "I")
    public static int field2800;

    @OriginalMember(owner = "client!wt", name = "e", descriptor = "Ltm;")
    public static class264 field2797;

    @OriginalMember(owner = "client!wt", name = "k", descriptor = "Lfk;")
    public static class462 field2803;

    @OriginalMember(owner = "client!wt", name = "f", descriptor = "Z")
    public static boolean field2798;

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(IILcr;I)V")
    public static final void method1291(int arg0, int arg1, class403 arg2, int arg3) {
        field2800++;
        class381 var4 = arg2.method2345(-1, class370.field4984);
        if (var4 == null) {
            return;
        }
        class370.field4984.method572(arg0, arg3, arg2.field5450 + arg0, arg2.field5404 + arg3);
        if (arg1 <= 12) {
            method1291(111, -37, null, -11);
        }
        if (class130.field1894 >= 3) {
            class370.field4984.method576(-16777216, var4, arg0, arg3);
        } else {
            class220.field2984.method3111((float) arg2.field5450 / 2.0F + (float) arg0, (float) arg2.field5404 / 2.0F + (float) arg3, 4096, ((int) (-class184.field2621) & 0x3FFF) << 2, var4, arg0, arg3);
        }
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(I)Z")
    public abstract boolean method1292(int arg0);

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(B)Z")
    public abstract boolean method1293(byte arg0);

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "(B)Z")
    public abstract boolean method1294(byte arg0);

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(Lpc;I)V")
    public static final void method1295(class473 arg0, int arg1) {
        int var2 = 123 / ((72 - arg1) / 45);
        class513.field7559 = arg0;
        field2793++;
    }

    @OriginalMember(owner = "client!wt", name = "c", descriptor = "(B)V")
    public abstract void method1296(byte arg0);

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(Z)I")
    public abstract int method1297(boolean arg0);

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "(I)Llb;")
    public abstract class378 method1298(int arg0);

    @OriginalMember(owner = "client!wt", name = "c", descriptor = "(I)V")
    public abstract void method1299(int arg0);

    @OriginalMember(owner = "client!wt", name = "d", descriptor = "(B)Z")
    public final boolean method1300(byte arg0) {
        if (arg0 <= 4) {
            return false;
        } else {
            field2796++;
            return this.method1294((byte) -28) || this.method1292(-18949) || this.method1293((byte) 124);
        }
    }

    @OriginalMember(owner = "client!wt", name = "e", descriptor = "(B)V")
    public static void method1301(byte arg0) {
        field2801 = null;
        field2802 = null;
        if (arg0 >= -4) {
            field2794 = null;
        }
        field2803 = null;
        field2794 = null;
        field2797 = null;
    }

    @OriginalMember(owner = "client!wt", name = "d", descriptor = "(I)I")
    public abstract int method1302(int arg0);

    static {
        new class304("You can't report yourself!", "Du kannst dich nicht selbst melden!", "Vous ne pouvez pas vous signaler vous-même !", "Você não pode denunciar a si próprio!");
        field2801 = new class145(11, 16);
        new class304("You already sent an abuse report under 60 secs ago! Do not abuse this system!", "Du hast bereits vor weniger als 60 Sekunden einen Regelverstoß gemeldet!", "Vous avez déjà signalé un abus il y a moins d'une minute ! N'abusez pas du système !", "Você já enviou uma denúncia de abuso há menos de um minuto. Não abuse deste sistema!");
        field2802 = new class145(72, 16);
    }
}
