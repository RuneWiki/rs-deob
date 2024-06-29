import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class245 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "I")
    public static int field3839 = 0;

    @OriginalMember(owner = "client!wi", name = "m", descriptor = "I")
    public static int field3846 = 0;

    @OriginalMember(owner = "client!wi", name = "q", descriptor = "[Ljava/lang/String;")
    public static String[] field3850 = new String[100];

    @OriginalMember(owner = "client!wi", name = "p", descriptor = "I")
    public static int field3849 = 1;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "I")
    public static int field3834;

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "I")
    public static int field3836;

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "I")
    public static int field3837;

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "I")
    public static int field3838;

    @OriginalMember(owner = "client!wi", name = "g", descriptor = "I")
    public static int field3840;

    @OriginalMember(owner = "client!wi", name = "h", descriptor = "I")
    public static int field3841;

    @OriginalMember(owner = "client!wi", name = "i", descriptor = "I")
    public static int field3842;

    @OriginalMember(owner = "client!wi", name = "j", descriptor = "I")
    public static int field3843;

    @OriginalMember(owner = "client!wi", name = "k", descriptor = "I")
    public static int field3844;

    @OriginalMember(owner = "client!wi", name = "l", descriptor = "I")
    public static int field3845;

    @OriginalMember(owner = "client!wi", name = "n", descriptor = "I")
    public static int field3847;

    @OriginalMember(owner = "client!wi", name = "o", descriptor = "I")
    public static int field3848;

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "Lnh;")
    public static class305 field3835;

    @OriginalMember(owner = "client!wi", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class96.field1379 != null) {
            class168.field2400 = 0;
        }
        field3836++;
    }

    @OriginalMember(owner = "client!wi", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class96.field1379 != null) {
            class182.field2768 = 0;
            class76.field1071 = arg0.getX();
            class84.field1188 = arg0.getY();
        }
        field3847++;
    }

    @OriginalMember(owner = "client!wi", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field3834++;
        if (class96.field1379 != null) {
            class182.field2768 = 0;
            class144.field1967 = arg0.getX();
            class116.field1670 = arg0.getY();
            class169.field2411 = class299.method2006(9594);
            if (arg0.isMetaDown()) {
                class128.field1785 = 2;
                class168.field2400 = 2;
            } else {
                class128.field1785 = 1;
                class168.field2400 = 1;
            }
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IJ)Ljava/lang/String;")
    public static final String method1606(int arg0, long arg1) {
        field3845++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if (arg1 % 37L == (long) arg0) {
            return null;
        } else {
            long var3 = arg1;
            int var5 = 0;
            while (var3 != 0L) {
                var5++;
                var3 /= 37L;
            }
            StringBuffer var6 = new StringBuffer(var5);
            while (arg1 != 0L) {
                long var7 = arg1;
                arg1 /= 37L;
                char var9 = class88.field1262[(int) (var7 - (arg1 * 37L))];
                if (var9 == '_') {
                    var9 = ' ';
                    int var10 = var6.length() - 1;
                    var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                }
                var6.append(var9);
            }
            var6.reverse();
            var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
            return var6.toString();
        }
    }

    @OriginalMember(owner = "client!wi", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field3843++;
        if (class96.field1379 != null) {
            class182.field2768 = 0;
            class168.field2400 = 0;
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lnh;IIZ)Lee;")
    public static final class74 method1607(class305 arg0, int arg1, int arg2, boolean arg3) {
        field3837++;
        if (!arg3) {
            field3839 = -30;
        }
        return class131.method832(arg2, arg1, 64, arg0) ? class116.method745(2) : null;
    }

    @OriginalMember(owner = "client!wi", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field3840++;
        if (class96.field1379 != null) {
            class182.field2768 = 0;
            class76.field1071 = arg0.getX();
            class84.field1188 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!wi", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        field3838++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(B)V")
    public static void method1608(byte arg0) {
        field3850 = null;
        field3835 = null;
        int var1 = -56 / ((82 - arg0) / 33);
    }

    @OriginalMember(owner = "client!wi", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field3841++;
    }

    @OriginalMember(owner = "client!wi", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field3848++;
        if (class96.field1379 != null) {
            class182.field2768 = 0;
            class76.field1071 = arg0.getX();
            class84.field1188 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIILnh;)Lta;")
    public static final class203 method1609(int arg0, int arg1, int arg2, class305 arg3) {
        if (arg1 >= -93) {
            return null;
        } else {
            field3844++;
            return class131.method832(arg0, arg2, -127, arg3) ? class284.method1874((byte) 71) : null;
        }
    }

    @OriginalMember(owner = "client!wi", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        field3842++;
        if (class96.field1379 != null) {
            class182.field2768 = 0;
            class76.field1071 = -1;
            class84.field1188 = -1;
        }
    }
}
