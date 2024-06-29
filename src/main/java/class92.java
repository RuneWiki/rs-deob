import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public class class92 extends class503 {

    @OriginalMember(owner = "client!vr", name = "r", descriptor = "I")
    private int field1308;

    @OriginalMember(owner = "client!vr", name = "q", descriptor = "I")
    private int field1307;

    @OriginalMember(owner = "client!vr", name = "l", descriptor = "I")
    private int field1302;

    @OriginalMember(owner = "client!vr", name = "m", descriptor = "I")
    private int field1303;

    @OriginalMember(owner = "client!vr", name = "k", descriptor = "I")
    public static int field1301;

    @OriginalMember(owner = "client!vr", name = "n", descriptor = "I")
    public static int field1304;

    @OriginalMember(owner = "client!vr", name = "o", descriptor = "I")
    public static int field1305;

    @OriginalMember(owner = "client!vr", name = "p", descriptor = "I")
    public static int field1306;

    static {
        new class234("That player is offline, or has privacy mode enabled.", "Dieser Spieler ist offline oder hat den Privatsphären-Modus aktiviert.", "Ce joueur est déconnecté ou en mode privé.", "O jogador está offline ou está com o modo de privacidade ativado.");
        new class234("Player ", "Spieler ", "Joueur ", "Jogador ");
        new class234("Unable to join clan chat at this time - please try again later!", "Chatraum kann nicht betreten werden - bitte versuch es später erneut.", "Impossible de participer à une discussion de clan pour le moment - veuillez réessayer ultérieurement.", "Não foi possível entrar no bate-papo do clã dessa vez. Tente de novo depois!");
    }

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "(I)V", line = 3)
    public static final void method746(int arg0) {
        ++field1301;
        if (arg0 != 980099212) {
            method746(118);
        }
        if (class532.field7841 != null) {
            class532.field7841.method1073((byte) 110);
        }
        if (class98.field1401 != null) {
            class98.field1401.method1073((byte) 110);
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIB)V", line = 23)
    public final void method747(int arg0, int arg1, byte arg2) {
        ++field1306;
        int var4 = this.field1308 * arg1 >> 12;
        if (arg2 != 39) {
            this.method747(74, 49, (byte) 85);
        }
        int var5 = this.field1307 * arg1 >> 12;
        int var6 = this.field1303 * arg0 >> 12;
        int var7 = this.field1302 * arg0 >> 12;
        class324.method2062(var7, (byte) -113, super.field7259, super.field7261, super.field7257, var5, var6, var4);
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(IBI)V", line = 57)
    public final void method748(int arg0, byte arg1, int arg2) {
        ++field1304;
        if (arg1 != 25) {
            this.field1308 = -9;
        }
        int var4 = this.field1308 * arg0 >> 12;
        int var5 = this.field1307 * arg0 >> 12;
        int var6 = this.field1303 * arg2 >> 12;
        int var7 = this.field1302 * arg2 >> 12;
        class283.method1837(var6, super.field7259, var7, false, super.field7261, var5, var4);
    }

    @OriginalMember(owner = "client!vr", name = "c", descriptor = "(III)V", line = 78)
    public final void method749(int arg0, int arg1, int arg2) {
        ++field1305;
        int var4 = this.field1308 * arg1 >> 12;
        int var5 = this.field1307 * arg1 >> 12;
        int var6 = this.field1303 * arg2 >> 12;
        int var7 = this.field1302 * arg2 >> 12;
        if (arg0 != -19475) {
            method746(20);
        }
        class520.method3096(var6, var5, (byte) -128, var7, var4, super.field7257);
    }

    @OriginalMember(owner = "client!vr", name = "<init>", descriptor = "(IIIIIII)V", line = 99)
    public class92(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field1308 = arg0;
        this.field1307 = arg2;
        this.field1302 = arg3;
        this.field1303 = arg1;
    }
}
