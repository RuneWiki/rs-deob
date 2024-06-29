import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public class class636 {

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "Lh;")
    private class571 field9274 = new class571(64);

    @OriginalMember(owner = "client!kr", name = "d", descriptor = "Lan;")
    private class21 field9277;

    @OriginalMember(owner = "client!kr", name = "e", descriptor = "I")
    public int field9278;

    @OriginalMember(owner = "client!kr", name = "c", descriptor = "Ljava/lang/String;")
    public static String field9276 = "";

    @OriginalMember(owner = "client!kr", name = "f", descriptor = "Ldv;")
    public static class566 field9279;

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "I")
    public static int field9275;

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(B)V")
    public static void method3690(byte arg0) {
        int var1 = 44 / ((arg0 + 48) / 45);
        field9279 = null;
        field9276 = null;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(II)Lwca;")
    public final class582 method3691(int arg0, int arg1) {
        field9275++;
        class571 var3 = this.field9274;
        class582 var4;
        synchronized (this.field9274) {
            var4 = (class582) this.field9274.method3252((long) arg1, (byte) 35);
        }
        if (var4 != null) {
            return var4;
        }
        class21 var5 = this.field9277;
        byte[] var6;
        synchronized (this.field9277) {
            var6 = this.field9277.method240(arg0, arg1, (byte) -124);
        }
        class582 var7 = new class582();
        if (var6 != null) {
            var7.method3323(new class11(var6), false);
        }
        class571 var8 = this.field9274;
        synchronized (this.field9274) {
            this.field9274.method3243(var7, (long) arg1, 83);
            return var7;
        }
    }

    @OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(Lhu;ILan;)V")
    public class636(class111 arg0, int arg1, class21 arg2) {
        this.field9277 = arg2;
        this.field9278 = this.field9277.method231(19, -118);
    }

    static {
        new class104("Unable to send message - player not on your friends list.", "Nachricht kann nicht geschickt werden,", "Impossible d'envoyer un message - joueur non inclus dans votre liste d'amis.", "Não foi possível enviar a mensagem. O jogador não está na sua lista de amigos.");
        field9279 = new class566(37, 3);
    }
}
