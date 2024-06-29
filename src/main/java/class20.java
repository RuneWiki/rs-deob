import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bw")
public class class20 {

    @OriginalMember(owner = "client!bw", name = "e", descriptor = "F")
    public float field307 = 0.25F;

    @OriginalMember(owner = "client!bw", name = "r", descriptor = "F")
    public float field320 = 1.0F;

    @OriginalMember(owner = "client!bw", name = "o", descriptor = "F")
    public float field317 = 1.0F;

    @OriginalMember(owner = "client!bw", name = "c", descriptor = "I")
    public int field305;

    @OriginalMember(owner = "client!bw", name = "i", descriptor = "I")
    public int field311;

    @OriginalMember(owner = "client!bw", name = "b", descriptor = "F")
    public float field304;

    @OriginalMember(owner = "client!bw", name = "k", descriptor = "I")
    public int field313;

    @OriginalMember(owner = "client!bw", name = "n", descriptor = "I")
    public int field316;

    @OriginalMember(owner = "client!bw", name = "m", descriptor = "I")
    public int field315;

    @OriginalMember(owner = "client!bw", name = "d", descriptor = "F")
    public float field306;

    @OriginalMember(owner = "client!bw", name = "l", descriptor = "Lmc;")
    public class242 field314;

    @OriginalMember(owner = "client!bw", name = "p", descriptor = "F")
    public float field318;

    @OriginalMember(owner = "client!bw", name = "h", descriptor = "I")
    public int field310;

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "client!bw", name = "f", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "client!bw", name = "g", descriptor = "I")
    public static int field309;

    @OriginalMember(owner = "client!bw", name = "j", descriptor = "I")
    public static int field312;

    @OriginalMember(owner = "client!bw", name = "q", descriptor = "I")
    public static int field319;

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(IIIBI)V")
    public static final void method162(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        class320.field4910 = arg0;
        class101.field1454 = arg2;
        class74.field1000 = arg4;
        if (arg3 <= -68) {
            class426.field6345 = arg1;
            field308++;
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(ILtl;)V")
    public final void method163(int arg0, class91 arg1) {
        field309++;
        this.field320 = (float) (arg1.method618((byte) 100) * 8) / 255.0F;
        this.field307 = (float) (arg1.method618((byte) 100) * 8) / 255.0F;
        if (arg0 != 0) {
            this.field318 = -0.2652042F;
        }
        this.field317 = (float) (arg1.method618((byte) 100) * 8) / 255.0F;
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(Lbw;I)Z")
    public final boolean method164(class20 arg0, int arg1) {
        field312++;
        if (arg1 == 0) {
            return this.field316 == arg0.field316 && this.field304 == arg0.field304 && this.field306 == arg0.field306 && this.field318 == arg0.field318 && this.field307 == arg0.field307 && this.field320 == arg0.field320 && this.field317 == arg0.field317 && this.field310 == arg0.field310 && this.field315 == arg0.field315 && this.field314 == arg0.field314;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bw", name = "<init>", descriptor = "()V")
    public class20() {
        this.field305 = -60;
        this.field311 = -50;
        this.field304 = 1.1523438F;
        this.field313 = -50;
        this.field316 = class4.field50;
        this.field315 = 0;
        this.field306 = 0.69921875F;
        this.field314 = class392.field5950;
        this.field318 = 1.2F;
        this.field310 = class133.field1927;
    }

    @OriginalMember(owner = "client!bw", name = "<init>", descriptor = "(Ltl;)V")
    public class20(class91 arg0) {
        int var2 = arg0.method618((byte) 100);
        if (class96.field1399.method2171(class441.field6563, 127) && class109.field1536.method1084() > 0) {
            if ((var2 & 0x1) == 0) {
                this.field316 = class4.field50;
            } else {
                this.field316 = arg0.method626((byte) 100);
            }
            if ((var2 & 0x2) == 0) {
                this.field304 = 1.1523438F;
            } else {
                this.field304 = (float) arg0.method631(10494) / 256.0F;
            }
            if ((var2 & 0x4) == 0) {
                this.field306 = 0.69921875F;
            } else {
                this.field306 = (float) arg0.method631(10494) / 256.0F;
            }
            if ((var2 & 0x8) == 0) {
                this.field318 = 1.2F;
            } else {
                this.field318 = (float) arg0.method631(10494) / 256.0F;
            }
        } else {
            if ((var2 & 0x1) != 0) {
                arg0.method626((byte) 100);
            }
            if ((var2 & 0x2) != 0) {
                arg0.method631(10494);
            }
            if ((var2 & 0x4) != 0) {
                arg0.method631(10494);
            }
            if ((var2 & 0x8) != 0) {
                arg0.method631(10494);
            }
            this.field306 = 0.69921875F;
            this.field318 = 1.2F;
            this.field316 = class4.field50;
            this.field304 = 1.1523438F;
        }
        if ((var2 & 0x10) == 0) {
            this.field311 = -50;
            this.field305 = -60;
            this.field313 = -50;
        } else {
            this.field311 = arg0.method643((byte) 115);
            this.field305 = arg0.method643((byte) 117);
            this.field313 = arg0.method643((byte) 121);
        }
        if ((var2 & 0x20) == 0) {
            this.field310 = class133.field1927;
        } else {
            this.field310 = arg0.method626((byte) 100);
        }
        if ((var2 & 0x40) == 0) {
            this.field315 = 0;
        } else {
            this.field315 = arg0.method631(10494);
        }
        if ((var2 & 0x80) == 0) {
            this.field314 = class392.field5950;
        } else {
            int var3 = arg0.method631(10494);
            int var4 = arg0.method631(10494);
            int var5 = arg0.method631(10494);
            int var6 = arg0.method631(10494);
            int var7 = arg0.method631(10494);
            int var8 = arg0.method631(10494);
            this.field314 = class179.method1286(var3, var5, var6, var7, var8, -96, var4);
        }
    }

    static {
        new class375("Use", "Benutzen", "Utiliser", "Usar");
        new class375("Error sending message to clan chat - please try again later!", "Fehler beim Versenden der Nachricht - bitte versuch es später erneut.", "Erreur lors de l'envoi du message au canal de clan - veuillez réessayer ultérieurement.", "Erro ao enviar mensagem ao canal de clã. Tente de novo depois!");
    }
}
