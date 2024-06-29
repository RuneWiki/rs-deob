import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public class class6 extends class57 implements Runnable {

    @OriginalMember(owner = "client!er", name = "p", descriptor = "I")
    public int field51 = -1;

    @OriginalMember(owner = "client!er", name = "q", descriptor = "Z")
    private boolean field52 = true;

    @OriginalMember(owner = "client!er", name = "s", descriptor = "Lec;")
    private class141 field54;

    @OriginalMember(owner = "client!er", name = "o", descriptor = "Z")
    public static boolean field50 = false;

    @OriginalMember(owner = "client!er", name = "t", descriptor = "Ljn;")
    public static class491 field55;

    @OriginalMember(owner = "client!er", name = "u", descriptor = "[J")
    public static long[] field56;

    @OriginalMember(owner = "client!er", name = "v", descriptor = "Lgu;")
    public static class126 field57;

    @OriginalMember(owner = "client!er", name = "r", descriptor = "F")
    public static float field53;

    @OriginalMember(owner = "client!er", name = "l", descriptor = "I")
    public static int field47;

    @OriginalMember(owner = "client!er", name = "m", descriptor = "I")
    public static int field48;

    @OriginalMember(owner = "client!er", name = "n", descriptor = "I")
    public static int field49;

    @OriginalMember(owner = "client!er", name = "w", descriptor = "I")
    public static int field58;

    @OriginalMember(owner = "client!er", name = "b", descriptor = "(I)V")
    public final void method23(int arg0) {
        (new Thread(this, "a")).start();
        field48++;
        if (arg0 != 32) {
            this.run();
        }
    }

    @OriginalMember(owner = "client!er", name = "run", descriptor = "()V")
    public final void run() {
        field47++;
        while (this.field52) {
            this.field54.method764(this, -4557);
        }
    }

    @OriginalMember(owner = "client!er", name = "c", descriptor = "(I)V")
    public static void method24(int arg0) {
        if (arg0 == 32) {
            field56 = null;
            field57 = null;
            field55 = null;
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(B)V")
    public final void method25(byte arg0) {
        this.field52 = false;
        int var2 = -5 % ((arg0 - 52) / 42);
        field49++;
    }

    @OriginalMember(owner = "client!er", name = "<init>", descriptor = "(Lec;)V")
    public class6(class141 arg0) {
        this.field54 = arg0;
    }

    static {
        new class344("You will be un-muted within 24 hours.", "Du wirst innerhalb der nächsten 24 Stunden wieder sprechen können.", "Vous aurez à nouveau accès à la messagerie instantanée dans 24 heures.", "O veto será retirado dentro de 24 horas.");
        field55 = new class491();
        field56 = new long[32];
        field57 = new class126();
    }
}
