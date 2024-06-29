import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public class class268 {

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "Ltm;")
    public static class112 field3720;

    @OriginalMember(owner = "client!gp", name = "d", descriptor = "Lfn;")
    public static class52 field3722;

    @OriginalMember(owner = "client!gp", name = "g", descriptor = "[Laa;")
    public static class13[] field3725;

    @OriginalMember(owner = "client!gp", name = "h", descriptor = "[[S")
    public static short[][] field3726;

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "I")
    public static int field3719;

    @OriginalMember(owner = "client!gp", name = "f", descriptor = "La;")
    public static class420 field3724;

    @OriginalMember(owner = "client!gp", name = "e", descriptor = "Loj;")
    public static class485 field3723;

    @OriginalMember(owner = "client!gp", name = "c", descriptor = "Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard field3721;

    static {
        new class112("Ok", "Okay", "OK", "Ok");
        field3720 = new class112("Connecting to update server", "Verbindung mit Update-Server...", "Connexion au serveur de mise à jour en cours", "Conectando ao servidor de atualização");
        field3722 = new class52(66, 0);
        field3725 = new class13[14];
        field3726 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lfc;Lfc;Lfc;ILfc;)V", line = 10)
    public static final void method1682(class343 arg0, class343 arg1, class343 arg2, int arg3, class343 arg4) {
        client.field5507 = arg4;
        if (arg3 != -21221) {
            return;
        }
        class54.field886 = arg1;
        class255.field3576 = arg0;
        class157.field2259 = arg2;
        field3719++;
        class39.field666 = new class363[class255.field3576.method2027(63)][];
        class460.field6482 = new boolean[class255.field3576.method2027(-107)];
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(B)V", line = 26)
    public static void method1683(byte arg0) {
        field3724 = null;
        field3725 = null;
        if (arg0 >= -37) {
            method1682((class343) null, (class343) null, (class343) null, -25, (class343) null);
        }
        field3723 = null;
        field3726 = null;
        field3721 = null;
        field3720 = null;
        field3722 = null;
    }
}
