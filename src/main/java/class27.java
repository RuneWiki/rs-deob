import java.awt.Canvas;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!na")
public class class27 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "mapview!na", name = "b", descriptor = "I")
    public static int field312 = 0;

    @OriginalMember(owner = "mapview!na", name = "f", descriptor = "Lba;")
    public static class4 field316 = class14.method105((byte) -125, "Helmet Shop");

    @OriginalMember(owner = "mapview!na", name = "e", descriptor = "Lba;")
    public static class4 field315 = class14.method105((byte) -126, "Saw Mill");

    @OriginalMember(owner = "mapview!na", name = "j", descriptor = "Lba;")
    public static class4 field320 = class14.method105((byte) -97, "???");

    @OriginalMember(owner = "mapview!na", name = "i", descriptor = "Lba;")
    public static class4 field319 = class14.method105((byte) -126, "Pub)4Bar");

    @OriginalMember(owner = "mapview!na", name = "c", descriptor = "I")
    public static int field313;

    @OriginalMember(owner = "mapview!na", name = "h", descriptor = "I")
    public static int field318;

    @OriginalMember(owner = "mapview!na", name = "g", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field317;

    @OriginalMember(owner = "mapview!na", name = "d", descriptor = "[B")
    public static byte[] field314;

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "[I")
    public static int[] field311;

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(B)I", line = 11)
    public static final int method173(byte arg0) {
        if (arg0 > -122) {
            return -99;
        } else if (class14.field191 == null) {
            return 0;
        } else if (class14.field191.field362 == null) {
            return field311[class14.field191.field367 & 0xFF];
        } else {
            return field311[class14.field191.field362[class12.field172] & 0xFF];
        }
    }

    @OriginalMember(owner = "mapview!na", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 28)
    public final void focusGained(FocusEvent arg0) {
    }

    @OriginalMember(owner = "mapview!na", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 33)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class35.field435 != null) {
            class20.field226 = 0;
        }
    }

    @OriginalMember(owner = "mapview!na", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 47)
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class35.field435 != null) {
            class5.field95 = arg0.getX();
            class23.field283 = arg0.getY();
            if (arg0.isMetaDown()) {
                class34.field431 = 2;
                class20.field226 = 2;
            } else {
                class34.field431 = 1;
                class20.field226 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!na", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 92)
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!na", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 102)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class35.field435 != null) {
            class20.field226 = 0;
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!na", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 122)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class35.field435 != null) {
            class20.field230 = arg0.getX();
            class28.field347 = arg0.getY();
        }
    }

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(Z)V", line = 146)
    public static void method174(boolean arg0) {
        field320 = null;
        field317 = null;
        field315 = null;
        field319 = null;
        if (!arg0) {
            field314 = null;
            field316 = null;
            field311 = null;
        }
    }

    @OriginalMember(owner = "mapview!na", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 163)
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class35.field435 != null) {
            class20.field230 = -1;
            class28.field347 = -1;
        }
    }

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(Ljava/lang/Throwable;BLjava/lang/String;)V", line = 185)
    public static final void method175(Throwable arg0, byte arg1, String arg2) {
        try {
            String var3 = "";
            if (arg0 != null) {
                var3 = class26.method172(0, arg0);
            }
            if (arg2 != null) {
                if (arg0 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg2;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            class25 var8 = class9.field148.method78(-128, new URL(class9.field148.field130.getCodeBase(), "clienterror.ws?c=" + class26.field305 + "&u=" + class31.field399 + "&v1=" + class8.field146 + "&v2=" + class8.field131 + "&e=" + var7));
            while (var8.field300 == 0) {
                class35.method225(1L, -45);
            }
            if (arg1 <= 54) {
                field317 = null;
            }
            if (var8.field300 == 1) {
                DataInputStream var9 = (DataInputStream) var8.field299;
                var9.read();
                var9.close();
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "mapview!na", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 231)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class35.field435 != null) {
            class20.field230 = arg0.getX();
            class28.field347 = arg0.getY();
        }
    }

    @OriginalMember(owner = "mapview!na", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 249)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class35.field435 != null) {
            class20.field230 = arg0.getX();
            class28.field347 = arg0.getY();
        }
    }
}
