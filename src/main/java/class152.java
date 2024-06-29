import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class152 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "I")
    public static int field1981;

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "I")
    public static int field1982;

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "I")
    public static int field1984;

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "I")
    public static int field1985;

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "I")
    public static int field1986;

    @OriginalMember(owner = "client!uh", name = "h", descriptor = "I")
    public static int field1988;

    @OriginalMember(owner = "client!uh", name = "i", descriptor = "I")
    public static int field1989;

    @OriginalMember(owner = "client!uh", name = "j", descriptor = "I")
    public static int field1990;

    @OriginalMember(owner = "client!uh", name = "k", descriptor = "I")
    public static int field1991;

    @OriginalMember(owner = "client!uh", name = "l", descriptor = "I")
    public static int field1992;

    @OriginalMember(owner = "client!uh", name = "m", descriptor = "I")
    public static int field1993;

    @OriginalMember(owner = "client!uh", name = "n", descriptor = "I")
    public static int field1994;

    @OriginalMember(owner = "client!uh", name = "o", descriptor = "I")
    public static int field1995;

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "Lpp;")
    public static class262 field1987;

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "[Lqa;")
    public static class243[] field1983;

    @OriginalMember(owner = "client!uh", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class126.field1672 != null) {
            class295.field4256 = 0;
            class167.field2196 = arg0.getX();
            class144.field1897 = arg0.getY();
        }
        field1994++;
    }

    @OriginalMember(owner = "client!uh", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field1989++;
        if (class126.field1672 != null) {
            class179.field2363 = 0;
        }
    }

    @OriginalMember(owner = "client!uh", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field1992++;
    }

    @OriginalMember(owner = "client!uh", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field1990++;
        if (class126.field1672 != null) {
            class295.field4256 = 0;
            class179.field2363 = 0;
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!uh", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field1991++;
        if (class126.field1672 != null) {
            class295.field4256 = 0;
            class167.field2196 = arg0.getX();
            class144.field1897 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!uh", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field1982++;
        if (class126.field1672 != null) {
            class295.field4256 = 0;
            class424.field6308 = arg0.getX();
            class6.field62 = arg0.getY();
            class309.field4414 = class55.method375(-3913);
            if (arg0.isMetaDown()) {
                client.field3669 = 2;
                class179.field2363 = 2;
            } else {
                client.field3669 = 1;
                class179.field2363 = 1;
            }
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(B)V")
    public static final void method990(byte arg0) {
        field1981++;
        if (arg0 != -101) {
            method991((String) null, 119, false, -85);
        }
        int var1 = class72.method446(28804);
        if (var1 == 0) {
            class115.field1566 = null;
            class332.method2195(0, 27309);
        } else if (var1 == 1) {
            class358.method2349((byte) -62, (byte) 0);
            class332.method2195(512, arg0 ^ 0xFFFF9536);
            if (class37.field606 != null) {
                class408.method2661(0);
            }
        } else {
            class358.method2349((byte) -48, (byte) (class269.field3930 - 4 & 0xFF));
            class332.method2195(2, 27309);
        }
        class155.field2037 = class193.field2688;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Ljava/lang/String;IZI)I")
    public static final int method991(String arg0, int arg1, boolean arg2, int arg3) {
        field1993++;
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
        if (arg1 != -8470) {
            field1983 = null;
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg0.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg0.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg2) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                throw new NumberFormatException();
            }
            if (var11 >= arg3) {
                throw new NumberFormatException();
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg3 * var6 + var11;
            if ((var10 / arg3) != var6) {
                throw new NumberFormatException();
            }
            var5 = true;
            var6 = var10;
        }
        if (!var5) {
            throw new NumberFormatException();
        }
        return var6;
    }

    @OriginalMember(owner = "client!uh", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field1988++;
    }

    @OriginalMember(owner = "client!uh", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field1986++;
        if (class126.field1672 != null) {
            class295.field4256 = 0;
            class167.field2196 = arg0.getX();
            class144.field1897 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(B)V")
    public static void method992(byte arg0) {
        field1987 = null;
        if (arg0 != -63) {
            field1983 = null;
        }
        field1983 = null;
    }

    @OriginalMember(owner = "client!uh", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        field1984++;
        if (class126.field1672 != null) {
            class295.field4256 = 0;
            class167.field2196 = -1;
            class144.field1897 = -1;
        }
    }
}
