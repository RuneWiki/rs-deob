import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lv")
public class class524 {

    @OriginalMember(owner = "client!lv", name = "e", descriptor = "Lad;")
    private class11 field7768 = new class11(64);

    @OriginalMember(owner = "client!lv", name = "b", descriptor = "Ldn;")
    private class201 field7765;

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "Lum;")
    public static class82 field7764 = new class82("WTQA", 2);

    @OriginalMember(owner = "client!lv", name = "f", descriptor = "I")
    public static int field7769;

    @OriginalMember(owner = "client!lv", name = "c", descriptor = "I")
    public static int field7766;

    @OriginalMember(owner = "client!lv", name = "d", descriptor = "I")
    public static int field7767;

    static {
        new class169("Leave request already in progress - please wait...", "Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.", "Demande de sortie déjà effectuée - veuillez patienter...", "Solicitação de saída já em andamento. Aguarde...");
        field7769 = 0;
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(II)Lci;", line = 16)
    public final class112 method3108(int arg0, int arg1) {
        int var3 = 8 % ((-arg1 - 42) / 48);
        field7767++;
        class11 var4 = this.field7768;
        class112 var5;
        synchronized (this.field7768) {
            var5 = (class112) this.field7768.method78((long) arg0, (byte) -111);
        }
        if (var5 != null) {
            return var5;
        }
        byte[] var6 = this.field7765.method1313((byte) -120, 5, arg0);
        class112 var7 = new class112();
        if (var6 != null) {
            var7.method733(true, new class88(var6));
        }
        class11 var8 = this.field7768;
        synchronized (this.field7768) {
            this.field7768.method88((long) arg0, 45, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(I)V", line = 44)
    public static void method3109(int arg0) {
        field7764 = null;
        if (arg0 <= 18) {
            method3109(102);
        }
    }

    @OriginalMember(owner = "client!lv", name = "<init>", descriptor = "(Lgt;ILdn;)V", line = 66)
    public class524(class65 arg0, int arg1, class201 arg2) {
        this.field7765 = arg2;
        this.field7765.method1302(-66, 5);
    }
}
