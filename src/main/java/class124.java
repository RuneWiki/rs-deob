import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pv")
public class class124 {

    @OriginalMember(owner = "client!pv", name = "f", descriptor = "[Lwc;")
    private class270[] field2164;

    @OriginalMember(owner = "client!pv", name = "g", descriptor = "I")
    private int field2165;

    @OriginalMember(owner = "client!pv", name = "i", descriptor = "Lnk;")
    public static class326 field2167;

    @OriginalMember(owner = "client!pv", name = "j", descriptor = "I")
    public static int field2168;

    @OriginalMember(owner = "client!pv", name = "b", descriptor = "I")
    public static int field2160;

    @OriginalMember(owner = "client!pv", name = "d", descriptor = "I")
    public static int field2162;

    @OriginalMember(owner = "client!pv", name = "e", descriptor = "I")
    public static int field2163;

    @OriginalMember(owner = "client!pv", name = "h", descriptor = "I")
    public static int field2166;

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "J")
    private long field2159;

    @OriginalMember(owner = "client!pv", name = "c", descriptor = "Lwc;")
    private class270 field2161;

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(BLwc;J)V")
    public final void method976(byte arg0, class270 arg1, long arg2) {
        field2163++;
        if (arg0 > -56) {
            return;
        }
        if (arg1.field4489 != null) {
            arg1.method1799((byte) -92);
        }
        class270 var5 = this.field2164[(int) ((long) (this.field2165 - 1) & arg2)];
        arg1.field4489 = var5.field4489;
        arg1.field4493 = var5;
        arg1.field4489.field4493 = arg1;
        arg1.field4493.field4489 = arg1;
        arg1.field4496 = arg2;
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(FI)F")
    public static final float method977(float arg0, int arg1) {
        if (arg1 != 6) {
            field2167 = null;
        }
        field2162++;
        return arg0 * arg0 * arg0 * ((arg0 * 6.0F - 15.0F) * arg0 + 10.0F);
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(BJ)Lwc;")
    public final class270 method978(byte arg0, long arg1) {
        field2166++;
        this.field2159 = arg1;
        if (arg0 != -40) {
            field2167 = null;
        }
        class270 var4 = this.field2164[(int) (arg1 & (long) (this.field2165 - 1))];
        for (this.field2161 = var4.field4493; this.field2161 != var4; this.field2161 = this.field2161.field4493) {
            if (this.field2161.field4496 == arg1) {
                class270 var5 = this.field2161;
                this.field2161 = this.field2161.field4493;
                return var5;
            }
        }
        this.field2161 = null;
        return null;
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(I)Lwc;")
    public final class270 method979(int arg0) {
        field2160++;
        if (this.field2161 == null) {
            return null;
        }
        class270 var2 = this.field2164[(int) ((long) (this.field2165 - 1) & this.field2159)];
        if (arg0 != -27732) {
            method977(-1.6475664F, 38);
        }
        while (this.field2161 != var2) {
            if (this.field2161.field4496 == this.field2159) {
                class270 var3 = this.field2161;
                this.field2161 = this.field2161.field4493;
                return var3;
            }
            this.field2161 = this.field2161.field4493;
        }
        this.field2161 = null;
        return null;
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(B)V")
    public static void method980(byte arg0) {
        if (arg0 <= -4) {
            field2167 = null;
        }
    }

    @OriginalMember(owner = "client!pv", name = "<init>", descriptor = "(I)V")
    public class124(int arg0) {
        this.field2164 = new class270[arg0];
        this.field2165 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class270 var3 = this.field2164[var2] = new class270();
            var3.field4489 = var3;
            var3.field4493 = var3;
        }
    }

    static {
        new class306("You already sent an abuse report under 60 secs ago! Do not abuse this system!", "Du hast bereits vor weniger als 60 Sekunden einen Regelverstoß gemeldet!", "Vous avez déjà signalé un abus il y a moins d'une minute ! N'abusez pas du système !", "Você já enviou uma denúncia de abuso há menos de um minuto. Não abuse deste sistema!");
        field2167 = new class326(74, 1);
        new class306("Unable to send abuse report - system busy.", "Meldung konnte nicht gesendet werden - Systeme überlastet", "Impossible de signaler un abus - Erreur système", "Sistema ocupado. Não foi possível enviar sua denúncia de abuso.");
        field2168 = -1;
    }
}
