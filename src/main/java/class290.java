import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public class class290 {

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "I")
    public int field4349;

    @OriginalMember(owner = "client!hp", name = "c", descriptor = "[I")
    public int[] field4350;

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "[I")
    public int[] field4348;

    @OriginalMember(owner = "client!hp", name = "d", descriptor = "Luv;")
    public static class2 field4351;

    @OriginalMember(owner = "client!hp", name = "e", descriptor = "I")
    public static int field4352;

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(Z)V")
    public static void method1799(boolean arg0) {
        if (arg0) {
            method1800(-34, 5, 18);
        }
        field4351 = null;
    }

    @OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(I)V")
    public class290(int arg0) {
        this.field4349 = arg0;
        this.field4350 = new int[this.field4349];
        this.field4348 = new int[this.field4349];
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(III)I")
    public static final int method1800(int arg0, int arg1, int arg2) {
        field4352++;
        int var3 = arg2 >>> 24;
        int var4 = 106 / ((-arg1 - 28) / 47);
        int var5 = ((arg2 & 0xFF00FF) * var3 & 0xFF00FF00 | (arg2 & 0xFF00) * var3 & 0xFF0000) >>> 8;
        int var6 = 255 - var3;
        return (((arg0 & 0xFF00FF) * var6 & 0xFF00FF00 | (arg0 & 0xFF00) * var6 & 0xFF0000) >>> 8) + var5;
    }

    static {
        new class347("Unable to send message - system busy.", "Deine Nachricht konnte nicht verschickt werden, das System ist derzeit ausgelastet.", "Impossible d'envoyer un message - système occupé.", "Não foi possível enviar a mensagem. O sistema está ocupado.");
        field4351 = new class2(103, 7);
    }
}
