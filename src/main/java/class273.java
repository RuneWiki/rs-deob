import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class273 {

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "Lbv;")
    private class568 field3461;

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "[I")
    public static int[] field3464 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

    @OriginalMember(owner = "client!gg", name = "h", descriptor = "[I")
    public static int[] field3467 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "I")
    public static int field3462;

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "I")
    public static int field3463;

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "I")
    public static int field3466;

    @OriginalMember(owner = "client!gg", name = "i", descriptor = "I")
    public static int field3468;

    @OriginalMember(owner = "client!gg", name = "j", descriptor = "I")
    public static int field3469;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "Lum;")
    private class108 field3460;

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "Ljq;")
    public static class447 field3465;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lbv;I)V")
    public final void method1668(class568 arg0, int arg1) {
        field3468++;
        if (arg1 != 20502) {
            method1672((byte) 97, 72);
        }
        this.field3461 = arg0;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)Lum;")
    public final class108 method1669(int arg0) {
        field3462++;
        class108 var2 = this.field3461.field7933.field1403;
        if (this.field3461.field7933 == var2) {
            this.field3460 = null;
            return null;
        } else {
            this.field3460 = var2.field1403;
            return arg0 == -25264 ? var2 : null;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(B)Lum;")
    public final class108 method1670(byte arg0) {
        int var2 = 16 / ((arg0 - 59) / 48);
        field3469++;
        class108 var3 = this.field3460;
        if (this.field3461.field7933 == var3) {
            this.field3460 = null;
            return null;
        } else {
            this.field3460 = var3.field1403;
            return var3;
        }
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(I)V")
    public static void method1671(int arg0) {
        field3465 = null;
        if (arg0 == 3) {
            field3464 = null;
            field3467 = null;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(BI)V")
    public static final void method1672(byte arg0, int arg1) {
        class58 var2 = class60.field834;
        synchronized (class60.field834) {
            class60.field834.method320(arg1, -306674912);
        }
        if (arg0 != -126) {
            method1671(0);
        }
        field3463++;
        class58 var3 = class358.field5001;
        synchronized (class358.field5001) {
            class358.field5001.method320(arg1, -306674912);
        }
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "()V")
    public class273() {
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(Lbv;)V")
    public class273(class568 arg0) {
        this.field3461 = arg0;
    }

    static {
        new class344("Unable to send message - player unavailable.", "Deine Nachricht konnte nicht verschickt werden,", "Impossible d'envoyer un message - joueur indisponible.", "Não foi possível enviar a mensagem. O jogador não está disponível.");
    }
}
