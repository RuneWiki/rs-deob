import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qv")
public class class73 extends Canvas {

    @OriginalMember(owner = "client!qv", name = "e", descriptor = "Ljava/awt/Component;")
    private Component field1246;

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "Z")
    public static boolean field1242 = false;

    @OriginalMember(owner = "client!qv", name = "i", descriptor = "[I")
    public static int[] field1250;

    @OriginalMember(owner = "client!qv", name = "b", descriptor = "I")
    public static int field1243;

    @OriginalMember(owner = "client!qv", name = "c", descriptor = "I")
    public static int field1244;

    @OriginalMember(owner = "client!qv", name = "d", descriptor = "I")
    public static int field1245;

    @OriginalMember(owner = "client!qv", name = "f", descriptor = "I")
    public static int field1247;

    @OriginalMember(owner = "client!qv", name = "j", descriptor = "Lhv;")
    public static class150 field1251;

    @OriginalMember(owner = "client!qv", name = "g", descriptor = "Lza;")
    public static class299 field1248;

    @OriginalMember(owner = "client!qv", name = "h", descriptor = "Z")
    public static boolean field1249;

    static {
        new class179("Error joining clan channel - please try again later!", "Fehler beim Betreten des Chatraums - bitte versuch es später erneut.", "Erreur lors de la connexion au canal de clan - veuillez réessayer ultérieurement.", "Erro ao entrar no canal do clã. Tente de novo depois!");
        field1250 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };
    }

    @OriginalMember(owner = "client!qv", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 3)
    public final void update(Graphics arg0) {
        this.field1246.update(arg0);
        field1247++;
    }

    @OriginalMember(owner = "client!qv", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 12)
    public final void paint(Graphics arg0) {
        field1244++;
        this.field1246.paint(arg0);
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(IIILfi;)V", line = 20)
    public static final void method682(int arg0, int arg1, int arg2, class38 arg3) {
        class30.field336 = arg2;
        if (arg0 < -80) {
            field1245++;
            class355.field5260 = arg3;
            class100.field1537 = arg1;
        }
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(B)V", line = 33)
    public static void method683(byte arg0) {
        if (arg0 != -85) {
            method684(12, 21, 90, 75, true, -120, -14);
        }
        field1251 = null;
        field1250 = null;
        field1248 = null;
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(IIIIZII)V", line = 48)
    public static final void method684(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        field1243++;
        if (arg4) {
            field1250 = null;
        }
        if (arg3 >= class232.field3492 && arg6 <= class36.field453 && class487.field7124 <= arg2 && arg5 <= class232.field3493) {
            if (arg1 == 1) {
                class301.method2002(arg3, arg0, arg5, arg6, arg2, (byte) 127);
            } else {
                class83.method755(arg1, arg2, -120, arg3, arg6, arg5, arg0);
            }
        } else if (arg1 == 1) {
            class267.method1849(85916620, arg6, arg0, arg2, arg5, arg3);
        } else {
            class78.method703(false, arg2, arg1, arg0, arg5, arg6, arg3);
        }
    }

    @OriginalMember(owner = "client!qv", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 99)
    public class73(Component arg0) {
        this.field1246 = arg0;
    }
}
