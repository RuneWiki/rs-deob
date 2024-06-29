import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public abstract class class234 {

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "Luf;")
    public static class310 field3235 = new class310(22, -1);

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "I")
    public static int field3240 = 1;

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "Lfg;")
    public static class83 field3241 = new class83("Loading world map - ", "Lade Weltkarte - ", "Chargement de la mappemonde - ", "Carregando mapa-múndi - ");

    @OriginalMember(owner = "client!rb", name = "l", descriptor = "Ltk;")
    public static class228 field3246 = new class228(7, 0, 1, 1);

    @OriginalMember(owner = "client!rb", name = "m", descriptor = "Luf;")
    public static class310 field3247 = new class310(46, 3);

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "I")
    public static int field3236;

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "I")
    public int field3237;

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "I")
    public int field3239;

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "I")
    public static int field3242;

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "I")
    public static int field3243;

    @OriginalMember(owner = "client!rb", name = "j", descriptor = "I")
    public int field3244;

    @OriginalMember(owner = "client!rb", name = "k", descriptor = "I")
    public static int field3245;

    @OriginalMember(owner = "client!rb", name = "n", descriptor = "I")
    public static int field3248;

    @OriginalMember(owner = "client!rb", name = "p", descriptor = "Lf;")
    public static class529 field3250;

    @OriginalMember(owner = "client!rb", name = "o", descriptor = "[I")
    public static int[] field3249;

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "[Lf;")
    public static class529[] field3238;

    static {
        new class83("Thank-you, your abuse report has been received.", "Vielen Dank, deine Meldung ist bei uns eingegangen.", "Merci, nous avons bien reçu votre rapport d'abus.", "Obrigado. Sua denúncia de abuso foi recebida.");
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Z)Z", line = 6)
    public final boolean method1363(boolean arg0) {
        field3245++;
        if (!arg0) {
            this.field3239 = 107;
        }
        return (this.field3244 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(Z)Z", line = 17)
    public final boolean method1364(boolean arg0) {
        field3242++;
        if (arg0) {
            field3247 = null;
        }
        return (this.field3244 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "(Z)Z", line = 29)
    public final boolean method1365(boolean arg0) {
        field3236++;
        if (arg0) {
            this.field3237 = 29;
        }
        return (this.field3244 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "(Z)V", line = 41)
    public static void method1366(boolean arg0) {
        field3250 = null;
        if (arg0) {
            return;
        }
        field3247 = null;
        field3241 = null;
        field3249 = null;
        field3238 = null;
        field3246 = null;
        field3235 = null;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)Z", line = 87)
    public final boolean method1367(int arg0) {
        if (arg0 != 0) {
            field3248 = 73;
        }
        field3243++;
        return (this.field3244 & 0x2) != 0;
    }
}
