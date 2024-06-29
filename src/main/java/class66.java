import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class66 extends Canvas {

    @OriginalMember(owner = "client!fj", name = "l", descriptor = "Ljava/awt/Component;")
    private Component field1198;

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "Li;")
    public static class88 field1188 = class208.method1425(105, "");

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "I")
    public static int field1192 = 0;

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "[Li;")
    public static class88[] field1191 = new class88[500];

    @OriginalMember(owner = "client!fj", name = "h", descriptor = "[I")
    public static int[] field1194 = new int[5];

    @OriginalMember(owner = "client!fj", name = "i", descriptor = "Li;")
    public static class88 field1195 = class208.method1425(105, "Zu viele Verbindungen von Ihrer Adresse)3");

    @OriginalMember(owner = "client!fj", name = "j", descriptor = "Lwi;")
    public static class248 field1196 = new class248();

    @OriginalMember(owner = "client!fj", name = "o", descriptor = "Li;")
    public static class88 field1201 = class208.method1425(105, "Bitte versuchen Sie es erneut)3");

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "I")
    public static int field1187;

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "I")
    public static int field1189;

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "I")
    public static int field1190;

    @OriginalMember(owner = "client!fj", name = "k", descriptor = "I")
    public static int field1197;

    @OriginalMember(owner = "client!fj", name = "n", descriptor = "I")
    public static int field1200;

    @OriginalMember(owner = "client!fj", name = "p", descriptor = "I")
    public static int field1202;

    @OriginalMember(owner = "client!fj", name = "m", descriptor = "Lnb;")
    public static class144 field1199;

    @OriginalMember(owner = "client!fj", name = "g", descriptor = "Lbj;")
    public static class22 field1193;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;I)I")
    public static final int method455(KeyEvent arg0, int arg1) {
        field1190++;
        int var2 = arg0.getKeyChar();
        if (arg1 != -26362) {
            return -68;
        } else if (var2 == 8364) {
            return 128;
        } else {
            if (var2 <= 0 || var2 >= 256) {
                var2 = -1;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!fj", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field1198.update(arg0);
        field1189++;
    }

    @OriginalMember(owner = "client!fj", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        field1197++;
        this.field1198.paint(arg0);
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)V")
    public static void method456(int arg0) {
        field1191 = null;
        field1193 = null;
        field1199 = null;
        if (arg0 != 128) {
            method456(-32);
        }
        field1201 = null;
        field1196 = null;
        field1188 = null;
        field1195 = null;
        field1194 = null;
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class66(Component arg0) {
        this.field1198 = arg0;
    }
}
