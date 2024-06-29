import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class244 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!mg", name = "n", descriptor = "Ldf;")
    public static class51 field4227 = class46.method233("Lade Benutzeroberfl-=che )2 ", 100);

    @OriginalMember(owner = "client!mg", name = "p", descriptor = "Ldf;")
    public static class51 field4229 = class46.method233(":tradereq:", 100);

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "I")
    public static int field4214;

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "I")
    public static int field4215;

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "I")
    public static int field4216;

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "I")
    public static int field4217;

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "I")
    public static int field4218;

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "I")
    public static int field4219;

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "I")
    public static int field4220;

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "I")
    public static int field4221;

    @OriginalMember(owner = "client!mg", name = "i", descriptor = "I")
    public static int field4222;

    @OriginalMember(owner = "client!mg", name = "j", descriptor = "I")
    public static int field4223;

    @OriginalMember(owner = "client!mg", name = "k", descriptor = "I")
    public static int field4224;

    @OriginalMember(owner = "client!mg", name = "m", descriptor = "I")
    public static int field4226;

    @OriginalMember(owner = "client!mg", name = "o", descriptor = "I")
    public static int field4228;

    @OriginalMember(owner = "client!mg", name = "l", descriptor = "Lp;")
    public static class262 field4225;

    @OriginalMember(owner = "client!mg", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class42.field664 != null) {
            class84.field1402 = 0;
            class139.field2330 = 0;
            int var2 = arg0.getModifiers();
        }
        field4220++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!mg", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field4214++;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IJ)V")
    public static final void method1665(int arg0, long arg1) {
        field4223++;
        if (arg1 == 0L) {
            return;
        }
        if (class108.field1844 >= 100) {
            class147.method1064(class111.field1912, class43.field696, (byte) 97, 0);
            return;
        }
        class51 var3 = class63.method422(arg1, -34).method304((byte) -92);
        for (int var4 = 0; var4 < class108.field1844; var4++) {
            if (class203.field3396[var4] == arg1) {
                class147.method1064(class20.method104(-89, new class51[] { var3, class35.field533 }), class43.field696, (byte) 78, 0);
                return;
            }
        }
        for (int var5 = 0; var5 < class184.field3051; var5++) {
            if (class122.field2079[var5] == arg1) {
                class147.method1064(class20.method104(2, new class51[] { class85.field1434, var3, class16.field250 }), class43.field696, (byte) 103, 0);
                return;
            }
        }
        if (var3.method315(false, class44.field706.field1711)) {
            class147.method1064(class166.field2704, class43.field696, (byte) 46, 0);
            return;
        }
        class203.field3396[class108.field1844] = arg1;
        class75.field1191++;
        int var6 = 80 % ((arg0 - 86) / 36);
        class259.field4520[class108.field1844++] = class63.method422(arg1, -42);
        class204.field3418 = class189.field3173;
        class95.field1575.method424((byte) 78, 174);
        class95.field1575.method885(arg1, (byte) -105);
    }

    @OriginalMember(owner = "client!mg", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field4221++;
        if (class42.field664 != null) {
            class84.field1402 = 0;
            class108.field1821 = arg0.getX();
            class259.field4518 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(B)V")
    public static final void method1666(byte arg0) {
        if (arg0 == 11) {
            field4219++;
            class260.field4539.method1353(-119);
            class213.field3706.method1353(-121);
        }
    }

    @OriginalMember(owner = "client!mg", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field4218++;
        if (class42.field664 != null) {
            class84.field1402 = 0;
            class108.field1821 = arg0.getX();
            class259.field4518 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(B)V")
    public static void method1667(byte arg0) {
        field4225 = null;
        field4229 = null;
        if (arg0 > -85) {
            method1668(-50, 80, 96, 77, 98);
        }
        field4227 = null;
    }

    @OriginalMember(owner = "client!mg", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        field4222++;
        if (class42.field664 != null) {
            class84.field1402 = 0;
            class108.field1821 = -1;
            class259.field4518 = -1;
        }
    }

    @OriginalMember(owner = "client!mg", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class42.field664 != null) {
            class84.field1402 = 0;
            class108.field1821 = arg0.getX();
            class259.field4518 = arg0.getY();
        }
        field4224++;
    }

    @OriginalMember(owner = "client!mg", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field4228++;
    }

    @OriginalMember(owner = "client!mg", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class42.field664 != null) {
            class139.field2330 = 0;
        }
        field4217++;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIIII)V")
    public static final void method1668(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class42.field678 = -1;
        if (arg3 != 4) {
            return;
        }
        class3.field16 = -1;
        class169.field2758 = class85.field1433 * arg0 / arg4;
        class44.field701 = class5.field38 * arg2 / arg1;
        field4215++;
        class120.method863(70);
    }

    @OriginalMember(owner = "client!mg", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class42.field664 != null) {
            class84.field1402 = 0;
            class86.field1443 = arg0.getX();
            class239.field4156 = arg0.getY();
            class75.field1207 = class7.method31((byte) -88);
            if (arg0.isMetaDown()) {
                class211.field3508 = 2;
                class139.field2330 = 2;
            } else {
                class211.field3508 = 1;
                class139.field2330 = 1;
            }
            int var2 = arg0.getModifiers();
        }
        field4226++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }
}
