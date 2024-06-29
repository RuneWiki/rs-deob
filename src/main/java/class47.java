import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class47 implements MouseListener, MouseMotionListener {

    @OriginalMember(owner = "client!he", name = "i", descriptor = "Lke;")
    public static class65 field1228 = class1.method17("title)3jpg", -123);

    @OriginalMember(owner = "client!he", name = "b", descriptor = "[I")
    public static int[] field1221 = new int[100];

    @OriginalMember(owner = "client!he", name = "g", descriptor = "I")
    public static int field1226 = 7759444;

    @OriginalMember(owner = "client!he", name = "j", descriptor = "[I")
    public static int[] field1229 = new int[100];

    @OriginalMember(owner = "client!he", name = "t", descriptor = "I")
    public static int field1239 = 0;

    @OriginalMember(owner = "client!he", name = "h", descriptor = "I")
    public static int field1227 = -1;

    @OriginalMember(owner = "client!he", name = "u", descriptor = "Lke;")
    private static class65 field1240 = class1.method17("Loaded input handler", -126);

    @OriginalMember(owner = "client!he", name = "m", descriptor = "Lke;")
    public static class65 field1232 = class1.method17("und die Schaltfl-=che (WSpielkonto erstellen(W am", -116);

    @OriginalMember(owner = "client!he", name = "w", descriptor = "Lke;")
    public static class65 field1242 = field1240;

    @OriginalMember(owner = "client!he", name = "r", descriptor = "Lke;")
    private static class65 field1237 = class1.method17("Loaded fonts", -119);

    @OriginalMember(owner = "client!he", name = "x", descriptor = "I")
    public static int field1243 = 0;

    @OriginalMember(owner = "client!he", name = "k", descriptor = "Lke;")
    public static class65 field1230 = field1237;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "I")
    public static int field1220;

    @OriginalMember(owner = "client!he", name = "c", descriptor = "I")
    public static int field1222;

    @OriginalMember(owner = "client!he", name = "d", descriptor = "I")
    public static int field1223;

    @OriginalMember(owner = "client!he", name = "e", descriptor = "I")
    public static int field1224;

    @OriginalMember(owner = "client!he", name = "f", descriptor = "I")
    public static int field1225;

    @OriginalMember(owner = "client!he", name = "n", descriptor = "I")
    public static int field1233;

    @OriginalMember(owner = "client!he", name = "o", descriptor = "I")
    public static int field1234;

    @OriginalMember(owner = "client!he", name = "p", descriptor = "I")
    public static int field1235;

    @OriginalMember(owner = "client!he", name = "q", descriptor = "I")
    public static int field1236;

    @OriginalMember(owner = "client!he", name = "s", descriptor = "Lf;")
    public static class34 field1238;

    @OriginalMember(owner = "client!he", name = "v", descriptor = "[Luc;")
    public static class119[] field1241;

    @OriginalMember(owner = "client!he", name = "l", descriptor = "[Lkb;")
    public static class61[] field1231;

    @OriginalMember(owner = "client!he", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 3)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class130.field3157 != null) {
            class115.field2889 = 0;
            class50.field1281 = 0;
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field1222++;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(B)V", line = 25)
    public static void method397(byte arg0) {
        int var1 = 97 / ((12 - arg0) / 41);
        field1228 = null;
        field1242 = null;
        field1230 = null;
        field1221 = null;
        field1238 = null;
        field1231 = null;
        field1237 = null;
        field1240 = null;
        field1232 = null;
        field1241 = null;
        field1229 = null;
    }

    @OriginalMember(owner = "client!he", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 49)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field1234++;
        if (class130.field3157 != null) {
            class115.field2889 = 0;
            class9.field166 = arg0.getX();
            class52.field1328 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!he", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 87)
    public final void mouseClicked(MouseEvent arg0) {
        field1223++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!he", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 98)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class130.field3157 != null) {
            class115.field2889 = 0;
            class9.field166 = arg0.getX();
            class52.field1328 = arg0.getY();
        }
        field1224++;
    }

    @OriginalMember(owner = "client!he", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 112)
    public final synchronized void mouseExited(MouseEvent arg0) {
        field1236++;
        if (class130.field3157 != null) {
            class115.field2889 = 0;
            class9.field166 = -1;
            class52.field1328 = -1;
        }
    }

    @OriginalMember(owner = "client!he", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 146)
    public final synchronized void mousePressed(MouseEvent arg0) {
        field1235++;
        if (class130.field3157 != null) {
            class115.field2889 = 0;
            class64.field1679 = arg0.getX();
            class10.field177 = arg0.getY();
            class123.field2991 = System.currentTimeMillis();
            if (arg0.isMetaDown()) {
                class50.field1275 = 2;
                class50.field1281 = 2;
            } else {
                class50.field1275 = 1;
                class50.field1281 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!he", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 177)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class130.field3157 != null) {
            class115.field2889 = 0;
            class9.field166 = arg0.getX();
            class52.field1328 = arg0.getY();
        }
        field1225++;
    }
}
