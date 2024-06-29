import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class64 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "I")
    public static int field1566 = 0;

    @OriginalMember(owner = "client!kd", name = "j", descriptor = "I")
    public static int field1571 = 0;

    @OriginalMember(owner = "client!kd", name = "m", descriptor = "[I")
    public static int[] field1574 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!kd", name = "p", descriptor = "Lpd;")
    private static class94 field1577 = class28.method249(67, "Unexpected server response");

    @OriginalMember(owner = "client!kd", name = "v", descriptor = "I")
    public static int field1583 = 0;

    @OriginalMember(owner = "client!kd", name = "n", descriptor = "Lpd;")
    public static class94 field1575 = field1577;

    @OriginalMember(owner = "client!kd", name = "q", descriptor = "Leb;")
    public static class26 field1578 = new class26();

    @OriginalMember(owner = "client!kd", name = "z", descriptor = "Lpd;")
    public static class94 field1587 = class28.method249(-101, "T");

    @OriginalMember(owner = "client!kd", name = "G", descriptor = "Lpd;")
    private static class94 field1594 = class28.method249(101, "Enter name of friend to delete from list");

    @OriginalMember(owner = "client!kd", name = "E", descriptor = "Lpd;")
    public static class94 field1592 = field1594;

    @OriginalMember(owner = "client!kd", name = "H", descriptor = "I")
    public static int field1595 = 0;

    @OriginalMember(owner = "client!kd", name = "w", descriptor = "Lpd;")
    public static class94 field1584 = class28.method249(48, "Side panel redrawn");

    @OriginalMember(owner = "client!kd", name = "F", descriptor = "Lpd;")
    public static class94 field1593 = class28.method249(-69, "Bitte warten Sie eine Minute");

    @OriginalMember(owner = "client!kd", name = "I", descriptor = "Lpd;")
    private static class94 field1596 = class28.method249(55, "Loaded update list");

    @OriginalMember(owner = "client!kd", name = "D", descriptor = "Lpd;")
    public static class94 field1591 = class28.method249(-67, "W-=hlen Sie eine Option");

    @OriginalMember(owner = "client!kd", name = "y", descriptor = "Lpd;")
    public static class94 field1586 = field1596;

    @OriginalMember(owner = "client!kd", name = "K", descriptor = "Lpd;")
    public static class94 field1597 = class28.method249(-47, "da dieser Computer gegen unsere ");

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "I")
    public static int field1562;

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "I")
    public static int field1563;

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "I")
    public static int field1564;

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "I")
    public static int field1565;

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "I")
    public static int field1567;

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "I")
    public static int field1568;

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "I")
    public static int field1569;

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "I")
    public static int field1570;

    @OriginalMember(owner = "client!kd", name = "k", descriptor = "I")
    public static int field1572;

    @OriginalMember(owner = "client!kd", name = "l", descriptor = "I")
    public static int field1573;

    @OriginalMember(owner = "client!kd", name = "o", descriptor = "I")
    public static int field1576;

    @OriginalMember(owner = "client!kd", name = "r", descriptor = "I")
    public static int field1579;

    @OriginalMember(owner = "client!kd", name = "s", descriptor = "I")
    public static int field1580;

    @OriginalMember(owner = "client!kd", name = "t", descriptor = "I")
    public static int field1581;

    @OriginalMember(owner = "client!kd", name = "u", descriptor = "I")
    public static int field1582;

    @OriginalMember(owner = "client!kd", name = "A", descriptor = "I")
    public static int field1588;

    @OriginalMember(owner = "client!kd", name = "B", descriptor = "I")
    public static int field1589;

    @OriginalMember(owner = "client!kd", name = "x", descriptor = "Lde;")
    public static class24 field1585;

    @OriginalMember(owner = "client!kd", name = "C", descriptor = "Lad;")
    public static class5 field1590;

    @OriginalMember(owner = "client!kd", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 6)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class81.field2076 != null) {
            class36.field944 = 0;
            class92.field2364 = arg0.getX();
            class74.field1816 = arg0.getY();
        }
        field1563++;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/Class;", line = 25)
    public static final Class method478(byte arg0, String arg1) throws ClassNotFoundException {
        field1568++;
        if (arg0 >= -1) {
            return null;
        } else if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (arg1.equals("S")) {
            return Short.TYPE;
        } else if (arg1.equals("J")) {
            return Long.TYPE;
        } else if (arg1.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg1.equals("F")) {
            return Float.TYPE;
        } else if (arg1.equals("D")) {
            return Double.TYPE;
        } else if (arg1.equals("C")) {
            return Character.TYPE;
        } else {
            return Class.forName(arg1);
        }
    }

    @OriginalMember(owner = "client!kd", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 74)
    public final synchronized void mouseExited(MouseEvent arg0) {
        field1576++;
        if (class81.field2076 != null) {
            class36.field944 = 0;
            class92.field2364 = -1;
            class74.field1816 = -1;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(III)V", line = 91)
    public static final void method479(int arg0, int arg1, int arg2) {
        if (arg1 != 5752) {
            return;
        }
        field1570++;
        long var3 = (long) ((arg0 << 16) + arg2);
        class7 var5 = (class7) class29.field821.method19(25239, var3);
        if (var5 != null) {
            field1578.method230(false, var5);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V", line = 111)
    public static final void method480(int arg0) {
        class97.field2458.method1013(-1);
        if (arg0 < -91) {
            field1581++;
        }
    }

    @OriginalMember(owner = "client!kd", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 128)
    public final synchronized void focusLost(FocusEvent arg0) {
        field1580++;
        if (class81.field2076 != null) {
            class120.field3006 = 0;
        }
    }

    @OriginalMember(owner = "client!kd", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 145)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class81.field2076 != null) {
            class36.field944 = 0;
            class92.field2364 = arg0.getX();
            class74.field1816 = arg0.getY();
        }
        field1562++;
    }

    @OriginalMember(owner = "client!kd", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 174)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field1573++;
        if (class81.field2076 != null) {
            class36.field944 = 0;
            class120.field3006 = 0;
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!kd", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 200)
    public final void focusGained(FocusEvent arg0) {
        field1582++;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)V", line = 208)
    public static void method481(byte arg0) {
        field1584 = null;
        field1577 = null;
        field1592 = null;
        field1590 = null;
        field1586 = null;
        field1593 = null;
        int var1 = -120 % ((-arg0 - 52) / 53);
        field1597 = null;
        field1575 = null;
        field1574 = null;
        field1594 = null;
        field1596 = null;
        field1585 = null;
        field1587 = null;
        field1591 = null;
        field1578 = null;
    }

    @OriginalMember(owner = "client!kd", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 232)
    public final synchronized void mousePressed(MouseEvent arg0) {
        field1565++;
        if (class81.field2076 != null) {
            class36.field944 = 0;
            class100.field2533 = arg0.getX();
            class57.field1443 = arg0.getY();
            class33.field923 = class115.method856(true);
            if (arg0.isMetaDown()) {
                class21.field588 = 2;
                class120.field3006 = 2;
            } else {
                class21.field588 = 1;
                class120.field3006 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZLoe;III)V", line = 263)
    public static final void method482(boolean arg0, class89 arg1, int arg2, int arg3, int arg4) {
        field1564++;
        if (class80.field2044 == arg1 || class97.field2478 >= 400) {
            return;
        }
        class94 var5;
        if (arg1.field2291 == 0) {
            var5 = class4.method20(new class94[] { arg1.field2295, class66.method499(class80.field2044.field2307, -7, arg1.field2307), class25.field679, class54.field1339, class51.method403(arg1.field2307, true), class94.field2400 }, true);
        } else {
            var5 = class4.method20(new class94[] { arg1.field2295, class25.field679, class25.field687, class51.method403(arg1.field2291, arg0), class94.field2400 }, true);
        }
        if (class126.field3178 == 1) {
            class121.field3019++;
            class97.method738(arg2, arg4, class4.method20(new class94[] { class113.field2848, class20.field565, var5 }, true), class99.field2492, arg3, 18, -30801);
        } else if (class31.field882 != 1) {
            for (int var6 = 4; var6 >= 0; var6--) {
                if (class9.field248[var6] != null) {
                    class86.field2154++;
                    int var7 = 0;
                    short var8 = 0;
                    if (class9.field248[var6].method692(class1.field8, (byte) -38)) {
                        if (class80.field2044.field2307 < arg1.field2307) {
                            var8 = 2000;
                        }
                        if (class80.field2044.field2306 != 0 && arg1.field2306 != 0) {
                            if (class80.field2044.field2306 == arg1.field2306) {
                                var8 = 2000;
                            } else {
                                var8 = 0;
                            }
                        }
                    } else if (class110.field2702[var6]) {
                        var8 = 2000;
                    }
                    if (var6 == 0) {
                        var7 = var8 + 6;
                    }
                    if (var6 == 1) {
                        var7 = var8 + 53;
                    }
                    if (var6 == 2) {
                        var7 = var8 + 49;
                    }
                    if (var6 == 3) {
                        var7 = var8 + 38;
                    }
                    if (var6 == 4) {
                        var7 = var8 + 23;
                    }
                    class97.method738(arg2, arg4, class4.method20(new class94[] { class43.field1088, var5 }, true), class9.field248[var6], arg3, var7, -30801);
                }
            }
        } else if ((class67.field1647 & 0x8) == 8) {
            class97.method738(arg2, arg4, class4.method20(new class94[] { class66.field1632, class20.field565, var5 }, true), class19.field526, arg3, 9, -30801);
            class33.field907++;
        }
        if (!arg0) {
            method480(3);
        }
        for (int var9 = 0; var9 < class97.field2478; var9++) {
            if (class38.field995[var9] == 55) {
                class39.field1008[var9] = class4.method20(new class94[] { class102.field2575, class73.field1783, class43.field1088, var5 }, true);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 380)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class81.field2076 != null) {
            class36.field944 = 0;
            class92.field2364 = arg0.getX();
            class74.field1816 = arg0.getY();
        }
        field1569++;
    }

    @OriginalMember(owner = "client!kd", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 399)
    public final void mouseClicked(MouseEvent arg0) {
        field1579++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }
}
