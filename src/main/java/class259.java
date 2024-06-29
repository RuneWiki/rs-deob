import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class259 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!r", name = "a", descriptor = "I")
    public static int field4459 = 0;

    @OriginalMember(owner = "client!r", name = "d", descriptor = "I")
    public static int field4462 = 0;

    @OriginalMember(owner = "client!r", name = "o", descriptor = "[I")
    public static int[] field4473 = new int[] { 1, 1, 1, 1, 4, 1, 1, 5, 6, 1, 5, 0, 7, 0, 4, 1, 7, 2, 1, 1, 6, 1, 1, 3, 6, 1, 7, 0, 0, 6, 7, 0, 1, 7, 6, 1, 1, 1, 5, 4, 3, 2, 1, 1, 0, 4, 1, 5 };

    @OriginalMember(owner = "client!r", name = "e", descriptor = "Ls;")
    public static class261 field4463 = new class261(20);

    @OriginalMember(owner = "client!r", name = "u", descriptor = "Z")
    public static boolean field4479 = false;

    @OriginalMember(owner = "client!r", name = "v", descriptor = "Z")
    public static boolean field4480 = false;

    @OriginalMember(owner = "client!r", name = "t", descriptor = "I")
    public static int field4478 = 0;

    @OriginalMember(owner = "client!r", name = "y", descriptor = "[I")
    public static int[] field4483 = new int[1000];

    @OriginalMember(owner = "client!r", name = "x", descriptor = "[I")
    public static int[] field4482 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!r", name = "b", descriptor = "I")
    public static int field4460;

    @OriginalMember(owner = "client!r", name = "c", descriptor = "I")
    public static int field4461;

    @OriginalMember(owner = "client!r", name = "f", descriptor = "I")
    public static int field4464;

    @OriginalMember(owner = "client!r", name = "g", descriptor = "I")
    public static int field4465;

    @OriginalMember(owner = "client!r", name = "h", descriptor = "I")
    public static int field4466;

    @OriginalMember(owner = "client!r", name = "i", descriptor = "I")
    public static int field4467;

    @OriginalMember(owner = "client!r", name = "j", descriptor = "I")
    public static int field4468;

    @OriginalMember(owner = "client!r", name = "k", descriptor = "I")
    public static int field4469;

    @OriginalMember(owner = "client!r", name = "l", descriptor = "I")
    public static int field4470;

    @OriginalMember(owner = "client!r", name = "m", descriptor = "I")
    public static int field4471;

    @OriginalMember(owner = "client!r", name = "n", descriptor = "I")
    public static int field4472;

    @OriginalMember(owner = "client!r", name = "p", descriptor = "I")
    public static int field4474;

    @OriginalMember(owner = "client!r", name = "q", descriptor = "I")
    public static int field4475;

    @OriginalMember(owner = "client!r", name = "r", descriptor = "I")
    public static int field4476;

    @OriginalMember(owner = "client!r", name = "s", descriptor = "I")
    public static int field4477;

    @OriginalMember(owner = "client!r", name = "w", descriptor = "Ldj;")
    public static class314 field4481;

    @OriginalMember(owner = "client!r", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 4)
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field4471++;
    }

    @OriginalMember(owner = "client!r", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 15)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field4475++;
        if (class94.field1591 != null) {
            class50.field991 = 0;
            class129.field2267 = arg0.getX();
            class183.field3206 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!r", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 42)
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class94.field1591 != null) {
            class50.field991 = 0;
            class230.field4002 = arg0.getX();
            class137.field2348 = arg0.getY();
            class311.field5269 = class71.method470(true);
            if (arg0.isMetaDown()) {
                class32.field707 = 2;
                class146.field2499 = 2;
            } else {
                class32.field707 = 1;
                class146.field2499 = 1;
            }
            int var2 = arg0.getModifiers();
            if ((var2 & 0x10) == 0) {
            }
            if ((var2 & 0x4) == 0) {
            }
            if ((var2 & 0x8) != 0) {
            }
        }
        field4461++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V", line = 108)
    public static final void method1818(int arg0) {
        field4477++;
        int var1 = class309.field5249;
        if (arg0 != 0) {
            method1818(70);
        }
        int var2 = class170.field2968;
        int var3 = class57.field1090 - class16.field420 - var2;
        int var4 = class196.field3431 - class199.field3465 - var1;
        if (var1 <= 0 && var4 <= 0 && var2 <= 0 && var3 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class114.field1924 != null) {
                var5 = class114.field1924;
            } else if (class200.field3483 == null) {
                var5 = class288.field4925.field4677;
            } else {
                var5 = class200.field3483;
            }
            int var6 = 0;
            int var7 = 0;
            if (class200.field3483 == var5) {
                Insets var8 = class200.field3483.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, class57.field1090);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, class196.field3431, var2);
            }
            if (var4 > 0) {
                var9.fillRect(var6 + class196.field3431 - var4, var7, var4, class57.field1090);
            }
            if (var3 > 0) {
                var9.fillRect(var6, class57.field1090 + var7 - var3, class196.field3431, var3);
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "client!r", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 186)
    public final void focusGained(FocusEvent arg0) {
        field4472++;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lbg;B)Ltk;", line = 197)
    public static final class240 method1819(class194 arg0, byte arg1) {
        if (arg1 != -18) {
            field4482 = (int[]) null;
        }
        field4466++;
        return new class240(arg0.method1354(2), arg0.method1354(arg1 ^ 0xFFFFFFEC), arg0.method1354(2), arg0.method1354(arg1 ^ 0xFFFFFFEC), arg0.method1354(2), arg0.method1354(2), arg0.method1354(2), arg0.method1354(arg1 ^ 0xFFFFFFEC), arg0.method1349((byte) 91), arg0.method1325(arg1 ^ 0xFFFFE225));
    }

    @OriginalMember(owner = "client!r", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 212)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field4467++;
        if (class94.field1591 != null) {
            class50.field991 = 0;
            class146.field2499 = 0;
            int var2 = arg0.getModifiers();
            if ((var2 & 0x8) == 0) {
            }
            if ((var2 & 0x10) == 0) {
            }
            if ((var2 & 0x4) != 0) {
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(B)V", line = 246)
    public static void method1820(byte arg0) {
        field4481 = null;
        field4463 = null;
        field4483 = null;
        int var1 = 79 % ((arg0 + 33) / 49);
        field4473 = null;
        field4482 = null;
    }

    @OriginalMember(owner = "client!r", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 263)
    public final synchronized void focusLost(FocusEvent arg0) {
        field4465++;
        if (class94.field1591 != null) {
            class146.field2499 = 0;
        }
    }

    @OriginalMember(owner = "client!r", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 281)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class94.field1591 != null) {
            class50.field991 = 0;
            class129.field2267 = arg0.getX();
            class183.field3206 = arg0.getY();
        }
        field4469++;
    }

    @OriginalMember(owner = "client!r", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 303)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field4468++;
        if (class94.field1591 != null) {
            class50.field991 = 0;
            class129.field2267 = arg0.getX();
            class183.field3206 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!r", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 320)
    public final synchronized void mouseExited(MouseEvent arg0) {
        field4470++;
        if (class94.field1591 != null) {
            class50.field991 = 0;
            class129.field2267 = -1;
            class183.field3206 = -1;
        }
    }
}
