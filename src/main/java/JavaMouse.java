import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!qa")
public class JavaMouse implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "mapview!qa", name = "d", descriptor = "Lv;")
    public static JagString field384 = class1.method2(255, "");

    @OriginalMember(owner = "mapview!qa", name = "g", descriptor = "I")
    public static int field387 = -1;

    @OriginalMember(owner = "mapview!qa", name = "h", descriptor = "Lv;")
    public static JagString field388 = class1.method2(255, " ");

    @OriginalMember(owner = "mapview!qa", name = "f", descriptor = "Z")
    public static volatile boolean field386 = false;

    @OriginalMember(owner = "mapview!qa", name = "c", descriptor = "Lv;")
    public static JagString field383 = class1.method2(255, "Mining Shop");

    @OriginalMember(owner = "mapview!qa", name = "j", descriptor = "Lv;")
    public static JagString field390 = class1.method2(255, "Slayer Master");

    @OriginalMember(owner = "mapview!qa", name = "a", descriptor = "I")
    public static int field381;

    @OriginalMember(owner = "mapview!qa", name = "b", descriptor = "I")
    public static int field382;

    @OriginalMember(owner = "mapview!qa", name = "i", descriptor = "[B")
    public static byte[] field389;

    @OriginalMember(owner = "mapview!qa", name = "e", descriptor = "[[B")
    public static byte[][] field385;

    @OriginalMember(owner = "mapview!qa", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 8)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (Worldmap.field347 != null) {
            IntHashTable.field49 = arg0.getX();
            GZip.field114 = arg0.getY();
        }
    }

    @OriginalMember(owner = "mapview!qa", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 32)
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (Worldmap.field347 != null) {
            IntHashTable.field49 = -1;
            GZip.field114 = -1;
        }
    }

    @OriginalMember(owner = "mapview!qa", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 49)
    public final void focusGained(FocusEvent arg0) {
    }

    @OriginalMember(owner = "mapview!qa", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 62)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (Worldmap.field347 != null) {
            Worldmap.field363 = 0;
        }
    }

    @OriginalMember(owner = "mapview!qa", name = "a", descriptor = "(III)V", line = 75)
    public static final void method176(int arg0, int arg1, int arg2) {
        ByteArray.field128 = arg2 & 0x3F;
        field381 = arg2 >> 6;
        JagException.field107 = arg1 >> 6;
        Js5.field132 = arg1 & 0x3F;
        JavaKeyboard.field12 = (Js5.field132 << 6) + ByteArray.field128;
        if (arg0 <= -53) {
            GZip.method50(0);
        }
    }

    @OriginalMember(owner = "mapview!qa", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 90)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (Worldmap.field347 != null) {
            IntHashTable.field49 = arg0.getX();
            GZip.field114 = arg0.getY();
        }
    }

    @OriginalMember(owner = "mapview!qa", name = "a", descriptor = "(B)V", line = 106)
    public static void method177(byte arg0) {
        field385 = null;
        if (arg0 != -17) {
            field386 = true;
        }
        field389 = null;
        field384 = null;
        field388 = null;
        field383 = null;
        field390 = null;
    }

    @OriginalMember(owner = "mapview!qa", name = "a", descriptor = "(Ljava/lang/Object;Lu;I)V", line = 126)
    public static final void method178(Object arg0, Signlink arg1, int arg2) {
        if (arg1.field462 == null) {
            return;
        }
        if (arg2 != -51) {
            field382 = -101;
        }
        for (int var3 = 0; var3 < 50 && arg1.field462.peekEvent() != null; var3++) {
            ByteArray.method55(1L, (byte) 12);
        }
        if (arg0 != null) {
            arg1.field462.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "mapview!qa", name = "b", descriptor = "(B)B", line = 149)
    public static final byte method179(byte arg0) {
        if (arg0 <= 102) {
            return 49;
        } else if (field389 == null) {
            return 0;
        } else {
            return field389[JavaKeyboard.field12];
        }
    }

    @OriginalMember(owner = "mapview!qa", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 164)
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (Worldmap.field347 != null) {
            Worldmap.field362 = arg0.getX();
            DoublyLinkable.field47 = arg0.getY();
            if (arg0.isMetaDown()) {
                Js5.field134 = 2;
                Worldmap.field363 = 2;
            } else {
                Js5.field134 = 1;
                Worldmap.field363 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!qa", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 201)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (Worldmap.field347 != null) {
            IntHashTable.field49 = arg0.getX();
            GZip.field114 = arg0.getY();
        }
    }

    @OriginalMember(owner = "mapview!qa", name = "a", descriptor = "(III[B)Lv;", line = 227)
    public static final JagString method180(int arg0, int arg1, int arg2, byte[] arg3) {
        if (arg2 != 63) {
            method180(-66, -65, 117, null);
        }
        JagString var4 = new JagString();
        var4.field474 = new byte[arg0];
        var4.field468 = 0;
        for (int var5 = arg1; var5 < arg0 + arg1; var5++) {
            if (arg3[var5] != 0) {
                var4.field474[var4.field468++] = arg3[var5];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "mapview!qa", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 262)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (Worldmap.field347 != null) {
            Worldmap.field363 = 0;
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!qa", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 283)
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!qa", name = "a", descriptor = "(I)Z", line = 293)
    public static final boolean method181(int arg0) {
        JavaKeyboard var1 = StringNode.field81;
        synchronized (StringNode.field81) {
            if (Packet.field342 == GameCanvas.field35) {
                return false;
            }
            Worldmap.field360 = Worldmap.field355[Packet.field342];
            mapview.field295 = Packet.field343[Packet.field342];
            if (arg0 != 63) {
                method180(-19, -50, -83, null);
            }
            Packet.field342 = Packet.field342 + 1 & 0x7F;
            return true;
        }
    }
}
