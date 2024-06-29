import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public class class428 {

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "I")
    public static int field6173 = 0;

    @OriginalMember(owner = "client!ps", name = "g", descriptor = "I")
    public static int field6178;

    @OriginalMember(owner = "client!ps", name = "c", descriptor = "I")
    public static int field6174;

    @OriginalMember(owner = "client!ps", name = "e", descriptor = "I")
    public static int field6176;

    @OriginalMember(owner = "client!ps", name = "f", descriptor = "I")
    public static int field6177;

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "Lps;")
    public class428 field6172;

    @OriginalMember(owner = "client!ps", name = "d", descriptor = "Lps;")
    public class428 field6175;

    static {
        new class40("For that rule you can only report players who have spoken or traded recently.", "Mit dieser Option können nur Spieler gemeldet werden,", "Cette règle n'est invocable que pour les discussions ou échanges récents.", "Para essa regra, você só pode denunciar jogadores com quem tenha falado ou negociado recentemente.");
        field6178 = 0;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(Z)V", line = 5)
    public final void method2550(boolean arg0) {
        field6176++;
        if (this.field6172 == null) {
            return;
        }
        this.field6172.field6175 = this.field6175;
        this.field6175.field6172 = this.field6172;
        if (arg0) {
            this.field6175 = null;
        }
        this.field6175 = null;
        this.field6172 = null;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(II)I", line = 22)
    public static final int method2551(int arg0, int arg1) {
        field6177++;
        if (class322.field4655 != null) {
            class322.field4655.method669(5000);
            class322.field4655 = null;
        }
        class159.field1899++;
        if (class159.field1899 > 4) {
            class112.field1379 = 0;
            class159.field1899 = 0;
            return arg0;
        }
        class112.field1379 = arg1;
        if (class457.field6442 == class302.field4488) {
            class302.field4488 = class189.field2594;
        } else {
            class302.field4488 = class457.field6442;
        }
        return -1;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(BI)V", line = 53)
    public static final void method2552(byte arg0, int arg1) {
        field6174++;
        class89 var2 = class146.method695(3, arg1, (byte) -68);
        var2.method448(13);
        if (arg0 <= 27) {
            field6173 = -102;
        }
    }
}
