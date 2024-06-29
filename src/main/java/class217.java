import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public class class217 extends class389 {

    @OriginalMember(owner = "client!bp", name = "r", descriptor = "I")
    private int field3000;

    @OriginalMember(owner = "client!bp", name = "u", descriptor = "I")
    private int field3003;

    @OriginalMember(owner = "client!bp", name = "s", descriptor = "I")
    private int field3001;

    @OriginalMember(owner = "client!bp", name = "v", descriptor = "I")
    private int field3004;

    @OriginalMember(owner = "client!bp", name = "t", descriptor = "[I")
    public static int[] field3002 = new int[] { 32, 39, 44, 47 };

    @OriginalMember(owner = "client!bp", name = "y", descriptor = "Lwd;")
    public static class149 field3007;

    @OriginalMember(owner = "client!bp", name = "n", descriptor = "I")
    public static int field2996;

    @OriginalMember(owner = "client!bp", name = "p", descriptor = "I")
    public static int field2998;

    @OriginalMember(owner = "client!bp", name = "q", descriptor = "I")
    public static int field2999;

    @OriginalMember(owner = "client!bp", name = "w", descriptor = "I")
    public static int field3005;

    @OriginalMember(owner = "client!bp", name = "x", descriptor = "I")
    public static int field3006;

    @OriginalMember(owner = "client!bp", name = "o", descriptor = "Ljava/awt/Frame;")
    public static Frame field2997;

    static {
        new class442("Unable to send message - player not on your friendlist.", "Nachricht kann nicht geschickt werden,", "Impossible d'envoyer un message - joueur non inclus dans votre liste d'amis.", "Não foi possível enviar a mensagem. O jogador não está na sua lista de amigos.");
        new class442("You already sent an abuse report under 60 secs ago! Do not abuse this system!", "Du hast bereits vor weniger als 60 Sekunden einen Regelverstoß gemeldet!", "Vous avez déjà signalé un abus il y a moins d'une minute ! N'abusez pas du système !", "Você já enviou uma denúncia de abuso há menos de um minuto. Não abuse deste sistema!");
        field3007 = new class149();
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(I)V", line = 4)
    public static void method1402(int arg0) {
        field3002 = null;
        field3007 = null;
        field2997 = null;
        if (arg0 != -32696) {
            method1402(-71);
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(ILjava/lang/String;)V", line = 19)
    public static final void method1403(int arg0, String arg1) {
        ++field2996;
        if (class121.field1700 != null) {
            int var2 = -48 / ((arg0 - -47) / 47);
            ++class450.field6290;
            class46.field648.method1178(63, 34);
            class46.field648.method173(class273.method1782((byte) 25, arg1), 255);
            class46.field648.method160(arg1, false);
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(III)V", line = 36)
    public final void method552(int arg0, int arg1, int arg2) {
        ++field3006;
        if (arg0 == 32546) {
            int var4 = this.field3001 * arg1 >> 12;
            int var5 = this.field3003 * arg1 >> 12;
            int var6 = this.field3000 * arg2 >> 12;
            int var7 = this.field3004 * arg2 >> 12;
            class119.method818(var5, var6, false, super.field5589, super.field5582, var4, super.field5592, var7);
        }
    }

    @OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(IIIIIII)V", line = 57)
    public class217(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field3000 = arg1;
        this.field3003 = arg2;
        this.field3001 = arg0;
        this.field3004 = arg3;
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(IZI)V", line = 69)
    public final void method554(int arg0, boolean arg1, int arg2) {
        ++field2998;
        int var4 = this.field3001 * arg2 >> 12;
        int var5 = this.field3003 * arg2 >> 12;
        int var6 = this.field3000 * arg0 >> 12;
        if (!arg1) {
            this.method553(-17, 121, -64);
        }
        int var7 = this.field3004 * arg0 >> 12;
        class171.method1126(var6, super.field5592, var4, (byte) 115, super.field5582, var7, var5);
    }

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "(Z)Lpg;", line = 90)
    public static final class437 method1404(boolean arg0) {
        ++field2999;
        class282.field3994 = 0;
        return !arg0 ? null : class61.method471(-128);
    }

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "(III)V", line = 110)
    public final void method553(int arg0, int arg1, int arg2) {
        ++field3005;
        int var4 = this.field3001 * arg2 >> 12;
        int var5 = this.field3003 * arg2 >> 12;
        int var6 = this.field3000 * arg1 >> 12;
        int var7 = -36 / ((-24 - arg0) / 35);
        int var8 = this.field3004 * arg1 >> 12;
        class21.method280(2048, super.field5589, var4, var5, var8, var6);
    }
}
