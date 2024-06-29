import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class123 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!vj", name = "i", descriptor = "[I")
    public static int[] field1952 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "Lad;")
    public static class275 field1949 = new class275(32);

    @OriginalMember(owner = "client!vj", name = "p", descriptor = "I")
    public static int field1959 = 0;

    @OriginalMember(owner = "client!vj", name = "o", descriptor = "Ljava/lang/String;")
    public static String field1958 = "Choose Option";

    @OriginalMember(owner = "client!vj", name = "r", descriptor = "Ljava/lang/String;")
    public static String field1961 = "Connected to update server";

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "I")
    public static int field1944;

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "I")
    public static int field1945;

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "I")
    public static int field1946;

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "I")
    public static int field1947;

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "I")
    public static int field1948;

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "I")
    public static int field1950;

    @OriginalMember(owner = "client!vj", name = "h", descriptor = "I")
    public static int field1951;

    @OriginalMember(owner = "client!vj", name = "j", descriptor = "I")
    public static int field1953;

    @OriginalMember(owner = "client!vj", name = "k", descriptor = "I")
    public static int field1954;

    @OriginalMember(owner = "client!vj", name = "l", descriptor = "I")
    public static int field1955;

    @OriginalMember(owner = "client!vj", name = "m", descriptor = "I")
    public static int field1956;

    @OriginalMember(owner = "client!vj", name = "n", descriptor = "I")
    public static int field1957;

    @OriginalMember(owner = "client!vj", name = "q", descriptor = "I")
    public static int field1960;

    @OriginalMember(owner = "client!vj", name = "u", descriptor = "I")
    public static int field1964;

    @OriginalMember(owner = "client!vj", name = "t", descriptor = "Lfh;")
    public static class140 field1963;

    @OriginalMember(owner = "client!vj", name = "s", descriptor = "Lgi;")
    public static class164 field1962;

    @OriginalMember(owner = "client!vj", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        field1954++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!vj", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field1964++;
        if (class149.field2381 != null) {
            class50.field730 = 0;
            class74.field1182 = arg0.getX();
            class246.field3880 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lgi;Lgi;I)V")
    public static final void method845(class164 arg0, class164 arg1, int arg2) {
        class273.field4412 = arg1;
        if (arg2 != 8469) {
            method846(127);
        }
        field1945++;
        class46.field686 = arg0;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)V")
    public static final void method846(int arg0) {
        field1950++;
        if (class217.field3408 != null && class217.field3408.field994 - (class217.field3408.method101(false) - 1) * 64 >> 7 == class35.field569 && class217.field3408.field929 - (class217.field3408.method101(false) - 1) * 64 >> 7 == class164.field2690) {
            class46.field691 = false;
            class35.field569 = 0;
        }
        for (int var1 = 0; var1 < 104; var1++) {
            for (int var6 = 0; var6 < 104; var6++) {
                class144.field2319[var1][var6] = 0;
            }
        }
        for (int var2 = 0; var2 < class134.field2172; var2++) {
            class12 var5 = class28.field494[class111.field1708[var2]];
            if (var5 != null) {
                var5.field926 = false;
            }
        }
        int var3 = 0;
        if (arg0 < 104) {
            field1961 = null;
        }
        while (var3 < class91.field1439) {
            class104 var4 = class131.field2113[class34.field556[var3]];
            if (var4 != null) {
                var4.field926 = false;
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!vj", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field1947++;
        if (class149.field2381 != null) {
            class265.field4316 = 0;
        }
    }

    @OriginalMember(owner = "client!vj", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field1957++;
        if (class149.field2381 != null) {
            class50.field730 = 0;
            class76.field1237 = arg0.getX();
            class233.field3649 = arg0.getY();
            class277.field4525 = class264.method1778(6573);
            if (arg0.isMetaDown()) {
                class109.field1691 = 2;
                class265.field4316 = 2;
            } else {
                class109.field1691 = 1;
                class265.field4316 = 1;
            }
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(I)V")
    public static void method847(int arg0) {
        field1961 = null;
        field1949 = null;
        field1963 = null;
        field1952 = null;
        field1958 = null;
        field1962 = null;
        if (arg0 != 14679) {
            method845((class164) null, (class164) null, 11);
        }
    }

    @OriginalMember(owner = "client!vj", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        field1951++;
        if (class149.field2381 != null) {
            class50.field730 = 0;
            class74.field1182 = -1;
            class246.field3880 = -1;
        }
    }

    @OriginalMember(owner = "client!vj", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class149.field2381 != null) {
            class50.field730 = 0;
            class74.field1182 = arg0.getX();
            class246.field3880 = arg0.getY();
        }
        field1948++;
    }

    @OriginalMember(owner = "client!vj", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class149.field2381 != null) {
            class50.field730 = 0;
            class74.field1182 = arg0.getX();
            class246.field3880 = arg0.getY();
        }
        field1946++;
    }

    @OriginalMember(owner = "client!vj", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field1955++;
        if (class149.field2381 != null) {
            class50.field730 = 0;
            class265.field4316 = 0;
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Luk;B)V")
    public static final void method848(class104 arg0, byte arg1) {
        field1953++;
        int var2 = 97 / ((arg1 - 2) / 62);
        for (class273 var3 = (class273) class66.field1071.method1553(true); var3 != null; var3 = (class273) class66.field1071.method1551(0)) {
            if (var3.field4417 == arg0) {
                if (var3.field4413 != null) {
                    class89.field1397.method1357(var3.field4413);
                    var3.field4413 = null;
                }
                var3.method952((byte) 28);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!vj", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field1956++;
    }
}
