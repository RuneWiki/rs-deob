import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public class class17 {

    @OriginalMember(owner = "client!wt", name = "c", descriptor = "Lka;")
    private class473 field269 = new class473(64);

    @OriginalMember(owner = "client!wt", name = "h", descriptor = "Ldk;")
    private class421 field274;

    @OriginalMember(owner = "client!wt", name = "f", descriptor = "I")
    public static int field272 = 0;

    @OriginalMember(owner = "client!wt", name = "e", descriptor = "Lhi;")
    public static class45 field271 = new class45(49, 6);

    @OriginalMember(owner = "client!wt", name = "i", descriptor = "Lnf;")
    public static class28 field275;

    @OriginalMember(owner = "client!wt", name = "j", descriptor = "I")
    public static int field276;

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "I")
    public static int field267;

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "I")
    public static int field268;

    @OriginalMember(owner = "client!wt", name = "d", descriptor = "I")
    public static int field270;

    @OriginalMember(owner = "client!wt", name = "g", descriptor = "I")
    public static int field273;

    @OriginalMember(owner = "client!wt", name = "k", descriptor = "Lqc;")
    public static class256 field277;

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(IB)Lsc;")
    public final class266 method121(int arg0, byte arg1) {
        field267++;
        class473 var3 = this.field269;
        class266 var4;
        synchronized (this.field269) {
            var4 = (class266) this.field269.method2767((long) arg0, 0);
        }
        if (var4 != null) {
            return var4;
        }
        class421 var5 = this.field274;
        byte[] var6;
        synchronized (this.field274) {
            var6 = this.field274.method2512(5, (byte) -93, arg0);
        }
        class266 var7 = new class266();
        if (var6 != null) {
            var7.method1567((byte) -46, new class319(var6));
        }
        class473 var8 = this.field269;
        synchronized (this.field269) {
            this.field269.method2777(-1025, var7, (long) arg0);
            if (arg1 >= -18) {
                method123(63, 58, 44, 58, -81, -18, -48, -106, -125, -120);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(I)V")
    public static void method122(int arg0) {
        int var1 = 49 % ((arg0 - 44) / 51);
        field271 = null;
        field275 = null;
        field277 = null;
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method123(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field268++;
        if (arg6 < 128 || arg4 < 128 || (class9.field111 * 128 - 256) < arg6 || arg4 > (class192.field2809 * 128 - 256)) {
            class385.field5520[0] = class385.field5520[1] = -1;
        } else if (arg5 == 5) {
            int var10 = class123.method893(arg4, arg6, (byte) -13, arg2) - arg1;
            class14.field146.method948(arg0, 0, 0);
            class275.field3737.method548(class14.field146);
            class275.field3737.method478(arg6, var10, arg4, class385.field5520);
            class14.field146.method948(-arg0, 0, 0);
            class275.field3737.method548(class14.field146);
        }
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(ZIB)V")
    public static final void method124(boolean arg0, int arg1, byte arg2) {
        if (arg2 <= 23) {
            return;
        }
        field273++;
        class225.field3176 = 3;
        class61.field899 = arg1;
        class193.method1273(class475.field6872.field603, 40000, class475.field6872.field609);
        if (arg0) {
            class508.method3012("", -16759, "");
        } else {
            class340.method2064(1);
            class508.method3012(class84.field1291, -16759, class154.field2375);
        }
    }

    @OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(Lad;ILdk;)V")
    public class17(class12 arg0, int arg1, class421 arg2) {
        this.field274 = arg2;
        this.field274.method2509(0, 5);
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(IIIII)I")
    public static final int method125(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field270++;
        int var5 = arg3 & 0xF;
        if (arg1 > -33) {
            field276 = 87;
        }
        int var6 = var5 >= 8 ? arg2 : arg4;
        int var7 = var5 >= 4 ? (var5 == 12 || var5 == 14 ? arg4 : arg0) : arg2;
        return ((var5 & 0x1) == 0 ? var6 : -var6) + ((var5 & 0x2) == 0 ? var7 : -var7);
    }

    static {
        new class157("Error sending message to clan chat - please try again later!", "Fehler beim Versenden der Nachricht - bitte versuch es später erneut.", "Erreur lors de l'envoi du message au canal de clan - veuillez réessayer ultérieurement.", "Erro ao enviar mensagem ao canal de clã. Tente de novo depois!");
        field275 = new class28(5000);
        field276 = 0;
    }
}
