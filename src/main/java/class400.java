import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class400 {

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "I")
    public int field6063;

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "Lea;")
    public static class474 field6061 = new class474("Started 3D Library", "3D-Softwarebibliothek gestartet.", "Librairie 3D démarrée", "Biblioteca 3D iniciada");

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "[I")
    public static int[] field6064;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "I")
    public static int field6057;

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "I")
    public static int field6058;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "I")
    public static int field6059;

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "I")
    public static int field6060;

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "I")
    public static int field6062;

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "I")
    public static int field6065;

    @OriginalMember(owner = "client!bg", name = "j", descriptor = "I")
    public static int field6066;

    static {
        new class474("You cannot report that person for Staff Impersonation, they are Jagex Staff.", "Diese Person ist ein Jagex-Mitarbeiter!", "Cette personne est un membre du personnel de Jagex, vous ne pouvez pas la signaler pour abus d'identité.", "Você não pode denunciar essa pessoa por tentar se passar por membro da equipe Jagex, pois ela faz parte da equipe.");
        field6064 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IZ)V", line = 5)
    public static final void method2548(int arg0, boolean arg1) {
        field6059++;
        if (class309.field4552.length() == arg0) {
            return;
        }
        class348.method2221(30742, "--> " + class309.field4552);
        class321.method2096(class309.field4552, arg0 ^ 0x1, false, arg1);
        class655.field9435 = 0;
        class343.field4889 = 0;
        class309.field4552 = "";
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Loa;Lqba;B)I", line = 20)
    public static final int method2549(class605 arg0, class346 arg1, byte arg2) {
        field6060++;
        if (arg1.field4962 != -1) {
            return arg1.field4962;
        }
        if (arg1.field4957 != -1) {
            class614 var3 = arg0.field8852.method438(48, arg0.method370() ? arg1.field4957 : arg1.field4955);
            if (!var3.field8928) {
                return var3.field8934;
            }
        }
        return arg2 == 111 ? arg1.field4961 : -5;
    }

    @OriginalMember(owner = "client!bg", name = "toString", descriptor = "()Ljava/lang/String;", line = 50)
    public final String toString() {
        field6065++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)V", line = 60)
    public static void method2550(byte arg0) {
        int var1 = -17 / ((arg0 - 28) / 54);
        field6064 = null;
        field6061 = null;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Z)V", line = 75)
    public static final void method2551(boolean arg0) {
        field6058++;
        class631 var1 = (class631) class436.field6487.method719(!arg0);
        if (!arg0) {
            return;
        }
        while (var1 != null) {
            if (class341.method2197(var1.field9100, (byte) 98)) {
                class145.method869((byte) 52, var1);
            }
            var1 = (class631) class436.field6487.method716(14);
        }
        if (class111.field1359 == 1) {
            class427.method2671(18);
            return;
        }
        class465.method2848(class291.field4026, class614.field8924, class508.field7392, (byte) -56, class421.field6308);
        int var2 = class281.field3921.method2554(class489.field7132.method2902(class35.field396, -20139), (byte) 0);
        for (class631 var3 = (class631) class436.field6487.method719(false); var3 != null; var3 = (class631) class436.field6487.method716(14)) {
            int var4 = class151.method891(var3, 18203);
            if (var4 > var2) {
                var2 = var4;
            }
        }
        class421.field6308 = var2 + 8;
        class508.field7392 = (class438.field6510 ? 26 : 22) + class111.field1359 * 16;
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(I)V", line = 128)
    public class400(int arg0) {
        this.field6063 = arg0;
    }
}
