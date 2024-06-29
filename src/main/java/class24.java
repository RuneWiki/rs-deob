import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class24 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "[S")
    public static short[] field455 = new short[256];

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "I")
    public static int field452 = 0;

    @OriginalMember(owner = "client!gh", name = "p", descriptor = "I")
    public static volatile int field467 = 0;

    @OriginalMember(owner = "client!gh", name = "i", descriptor = "Z")
    public static boolean field460 = false;

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "I")
    public static int field453;

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "I")
    public static int field454;

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "I")
    public static int field456;

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "I")
    public static int field457;

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "I")
    public static int field458;

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "I")
    public static int field459;

    @OriginalMember(owner = "client!gh", name = "j", descriptor = "I")
    public static int field461;

    @OriginalMember(owner = "client!gh", name = "k", descriptor = "I")
    public static int field462;

    @OriginalMember(owner = "client!gh", name = "l", descriptor = "I")
    public static int field463;

    @OriginalMember(owner = "client!gh", name = "m", descriptor = "I")
    public static int field464;

    @OriginalMember(owner = "client!gh", name = "n", descriptor = "I")
    public static int field465;

    @OriginalMember(owner = "client!gh", name = "q", descriptor = "I")
    public static int field468;

    @OriginalMember(owner = "client!gh", name = "r", descriptor = "I")
    public static int field469;

    @OriginalMember(owner = "client!gh", name = "o", descriptor = "Lkk;")
    public static class223 field466;

    @OriginalMember(owner = "client!gh", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class22.field431 != null) {
            class218.field3758 = 0;
        }
        field457++;
    }

    @OriginalMember(owner = "client!gh", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class22.field431 != null) {
            class264.field4693 = 0;
            class197.field3520 = arg0.getX();
            class92.field1654 = arg0.getY();
        }
        field463++;
    }

    @OriginalMember(owner = "client!gh", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field454++;
    }

    @OriginalMember(owner = "client!gh", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field453++;
        if (class22.field431 != null) {
            class264.field4693 = 0;
            class197.field3520 = arg0.getX();
            class92.field1654 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!gh", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class22.field431 != null) {
            class264.field4693 = 0;
            class197.field3520 = arg0.getX();
            class92.field1654 = arg0.getY();
        }
        field468++;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIII)Z")
    public static final boolean method252(int arg0, int arg1, int arg2, int arg3) {
        if (!class35.method318(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class106.field1912[arg0][arg1][arg2] - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class274.field4817) {
                    if (!class177.method1286(var4, var6, var5)) {
                        return false;
                    }
                    if (!class177.method1286(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class177.method1286(var4, var7, var5)) {
                        return false;
                    }
                    if (!class177.method1286(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class177.method1286(var4, var8, var5)) {
                    return false;
                }
                if (!class177.method1286(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class79.field1439) {
                    if (!class177.method1286(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class177.method1286(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class177.method1286(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class177.method1286(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class177.method1286(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class177.method1286(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class274.field4817) {
                    if (!class177.method1286(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class177.method1286(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class177.method1286(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class177.method1286(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class177.method1286(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class177.method1286(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class79.field1439) {
                    if (!class177.method1286(var4, var6, var5)) {
                        return false;
                    }
                    if (!class177.method1286(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class177.method1286(var4, var7, var5)) {
                        return false;
                    }
                    if (!class177.method1286(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class177.method1286(var4, var8, var5)) {
                    return false;
                }
                if (!class177.method1286(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class177.method1286(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class177.method1286(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class177.method1286(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class177.method1286(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class177.method1286(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!gh", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        field459++;
        if (class22.field431 != null) {
            class264.field4693 = 0;
            class197.field3520 = -1;
            class92.field1654 = -1;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IZ)V")
    public static final void method253(int arg0, boolean arg1) {
        field458++;
        class197 var2 = class164.method1228(8, arg0, -1665874464);
        var2.method1407(-101);
        if (arg1) {
            field455 = null;
        }
    }

    @OriginalMember(owner = "client!gh", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field469++;
        if (class22.field431 != null) {
            class264.field4693 = 0;
            class95.field1717 = arg0.getX();
            class237.field4097 = arg0.getY();
            class48.field855 = class201.method1419(5);
            if (arg0.isMetaDown()) {
                class109.field1957 = 2;
                class218.field3758 = 2;
            } else {
                class109.field1957 = 1;
                class218.field3758 = 1;
            }
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!gh", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field462++;
    }

    @OriginalMember(owner = "client!gh", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field456++;
        if (class22.field431 != null) {
            class264.field4693 = 0;
            class218.field3758 = 0;
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)V")
    public static void method254(int arg0) {
        field466 = null;
        if (arg0 != -6805) {
            method254(59);
        }
        field455 = null;
    }
}
