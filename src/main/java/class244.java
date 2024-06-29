import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jw")
public class class244 extends Canvas {

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "Ljava/awt/Component;")
    private Component field3081;

    @OriginalMember(owner = "client!jw", name = "d", descriptor = "Lbv;")
    public static class568 field3084;

    @OriginalMember(owner = "client!jw", name = "g", descriptor = "Z")
    public static boolean field3087;

    @OriginalMember(owner = "client!jw", name = "h", descriptor = "F")
    public static float field3088;

    @OriginalMember(owner = "client!jw", name = "b", descriptor = "I")
    public static int field3082;

    @OriginalMember(owner = "client!jw", name = "c", descriptor = "I")
    public static int field3083;

    @OriginalMember(owner = "client!jw", name = "e", descriptor = "I")
    public static int field3085;

    @OriginalMember(owner = "client!jw", name = "i", descriptor = "I")
    public static int field3089;

    @OriginalMember(owner = "client!jw", name = "j", descriptor = "I")
    public static int field3090;

    @OriginalMember(owner = "client!jw", name = "f", descriptor = "Lbw;")
    public static class411 field3086;

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(I)V")
    public static void method1510(int arg0) {
        if (arg0 != -6679) {
            method1512(-14, null);
        }
        field3086 = null;
        field3084 = null;
    }

    @OriginalMember(owner = "client!jw", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field3081.paint(arg0);
        field3090++;
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(IZ)V")
    public static final void method1511(int arg0, boolean arg1) {
        if (arg0 != 0) {
            return;
        }
        field3083++;
        class118.method650(true, class459.field6555);
        class621.field8936++;
        for (class496 var2 = (class496) class523.field7289.method3473(-27089); var2 != null; var2 = (class496) class523.field7289.method3478((byte) 5)) {
            if (!var2.method591(123)) {
                var2 = (class496) class523.field7289.method3473(arg0 - 27089);
                if (var2 == null) {
                    break;
                }
            }
            if (var2.field6912 == 0) {
                class489.method2752(arg1, var2, true, false);
            }
        }
        if (class168.field2123 != null) {
            class90.method501(class168.field2123, -1);
            class168.field2123 = null;
        }
    }

    @OriginalMember(owner = "client!jw", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field3081.update(arg0);
        field3082++;
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(ILvaa;)Z")
    public static final boolean method1512(int arg0, class246 arg1) {
        field3089++;
        class137 var2 = class626.field9084.method1093(0, arg1.method52(-17817));
        if (~var2.field1730 == arg0) {
            return true;
        } else {
            class264 var3 = class376.field5232.method2485(3146, var2.field1730);
            return var3.field3365 == -1 ? true : var3.method1628((byte) -63);
        }
    }

    @OriginalMember(owner = "client!jw", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class244(Component arg0) {
        this.field3081 = arg0;
    }

    static {
        new class344("Now talking in clan channel of player: ", "Clanchat dieses Spieler beigetreten: ", "Vous participez actuellement au canal de clan du joueur : ", "Falando no canal do clã do jogador: ");
        field3084 = new class568();
        field3087 = false;
    }
}
