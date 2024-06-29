import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class139 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "Ljava/lang/String;")
    public static String field2220 = "flash2:";

    @OriginalMember(owner = "client!bc", name = "j", descriptor = "I")
    public static int field2228 = 1;

    @OriginalMember(owner = "client!bc", name = "l", descriptor = "Ljava/lang/String;")
    public static String field2230 = " is already on your ignore list.";

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "I")
    public static int field2219;

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "I")
    public static int field2221;

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "I")
    public static int field2222;

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "I")
    public static int field2223;

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "I")
    public static int field2224;

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "I")
    public static int field2225;

    @OriginalMember(owner = "client!bc", name = "h", descriptor = "I")
    public static int field2226;

    @OriginalMember(owner = "client!bc", name = "i", descriptor = "I")
    public static int field2227;

    @OriginalMember(owner = "client!bc", name = "m", descriptor = "I")
    public static int field2231;

    @OriginalMember(owner = "client!bc", name = "n", descriptor = "I")
    public static int field2232;

    @OriginalMember(owner = "client!bc", name = "o", descriptor = "I")
    public static int field2233;

    @OriginalMember(owner = "client!bc", name = "p", descriptor = "I")
    public static int field2234;

    @OriginalMember(owner = "client!bc", name = "q", descriptor = "I")
    public static int field2235;

    @OriginalMember(owner = "client!bc", name = "r", descriptor = "I")
    public static int field2236;

    @OriginalMember(owner = "client!bc", name = "k", descriptor = "Ljava/lang/String;")
    public static String field2229;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lob;")
    public static final class292 method963(Throwable arg0, String arg1) {
        field2222++;
        class292 var2;
        if ((arg0 instanceof class292)) {
            var2 = (class292) arg0;
            var2.field4632 = var2.field4632 + ' ' + arg1;
        } else {
            var2 = new class292(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!bc", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field2221++;
        if (class187.field2974 != null) {
            class201.field3191 = 0;
            class78.field978 = arg0.getX();
            class92.field1161 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!bc", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        field2224++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!bc", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field2233++;
        if (class187.field2974 != null) {
            class201.field3191 = 0;
            class78.field978 = arg0.getX();
            class92.field1161 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!bc", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class187.field2974 != null) {
            class201.field3191 = 0;
            class78.field978 = -1;
            class92.field1161 = -1;
        }
        field2226++;
    }

    @OriginalMember(owner = "client!bc", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class187.field2974 != null) {
            class201.field3191 = 0;
            class75.field947 = 0;
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field2234++;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(III)V")
    public static final void method964(int arg0, int arg1, int arg2) {
        field2232++;
        class233 var3 = class114.method746(arg0, 1228126432, 13);
        var3.method1651((byte) 121);
        if (arg2 != 1) {
            method963((Throwable) null, (String) null);
        }
        var3.field3855 = arg1;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIIZ)V")
    public static final void method965(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2225++;
        if (arg0 >= class116.field1653 && class114.field1634 >= arg0) {
            int var5 = class256.method1750(76, arg3, class117.field1656, class132.field2105);
            int var6 = class256.method1750(125, arg1, class117.field1656, class132.field2105);
            class212.method1489(var6, arg2, -17020, arg0, var5);
        }
        if (arg4) {
            field2228 = 88;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method966(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class136.field2158[arg0][var8][var14] == -class35.field452) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << 7) + 1;
            int var10 = (arg3 << 7) + 2;
            int var11 = class17.field209[arg0][arg1][arg3] + arg5;
            if (!class186.method1299(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << 7) - 1;
            if (!class186.method1299(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << 7) - 1;
            if (!class186.method1299(var9, var11, var13)) {
                return false;
            } else if (class186.method1299(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class222.method1567(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class186.method1299(var6 + 1, class17.field209[arg0][arg1][arg3] + arg5, var7 + 1) && class186.method1299(var6 + 128 - 1, class17.field209[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class186.method1299(var6 + 128 - 1, class17.field209[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class186.method1299(var6 + 1, class17.field209[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bc", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field2231++;
        if (class187.field2974 != null) {
            class75.field947 = 0;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Z)V")
    public static void method967(boolean arg0) {
        field2229 = null;
        if (arg0) {
            field2220 = null;
        }
        field2230 = null;
        field2220 = null;
    }

    @OriginalMember(owner = "client!bc", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class187.field2974 != null) {
            class201.field3191 = 0;
            class78.field978 = arg0.getX();
            class92.field1161 = arg0.getY();
        }
        field2235++;
    }

    @OriginalMember(owner = "client!bc", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field2219++;
    }

    @OriginalMember(owner = "client!bc", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field2223++;
        if (class187.field2974 != null) {
            class201.field3191 = 0;
            class116.field1650 = arg0.getX();
            class155.field2465 = arg0.getY();
            class258.field4186 = class249.method1723((byte) 94);
            if (arg0.isMetaDown()) {
                class226.field3638 = 2;
                class75.field947 = 2;
            } else {
                class226.field3638 = 1;
                class75.field947 = 1;
            }
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }
}
