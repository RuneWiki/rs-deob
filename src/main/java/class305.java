import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class305 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!bl", name = "k", descriptor = "[I")
    public static int[] field5222 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!bl", name = "m", descriptor = "Lok;")
    public static class146 field5224 = class235.method1724(-12908, "::tele ");

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "Lhd;")
    public static class117 field5214 = new class117(2);

    @OriginalMember(owner = "client!bl", name = "o", descriptor = "Z")
    public static boolean field5226 = false;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "I")
    public static int field5212;

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "I")
    public static int field5213;

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "I")
    public static int field5215;

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "I")
    public static int field5216;

    @OriginalMember(owner = "client!bl", name = "f", descriptor = "I")
    public static int field5217;

    @OriginalMember(owner = "client!bl", name = "g", descriptor = "I")
    public static int field5218;

    @OriginalMember(owner = "client!bl", name = "h", descriptor = "I")
    public static int field5219;

    @OriginalMember(owner = "client!bl", name = "i", descriptor = "I")
    public static int field5220;

    @OriginalMember(owner = "client!bl", name = "j", descriptor = "I")
    public static int field5221;

    @OriginalMember(owner = "client!bl", name = "l", descriptor = "I")
    public static int field5223;

    @OriginalMember(owner = "client!bl", name = "n", descriptor = "Lje;")
    public static class70 field5225;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(ZIIIIIIIIIZI)Z", line = 40)
    public static final boolean method2148(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10, int arg11) {
        field5220++;
        if (!arg10) {
            method2148(true, 105, -79, 80, -128, -17, 12, -101, 38, 85, false, -124);
        }
        if (class102.field1639.method1717(0) == 2) {
            return class9.method68(arg6, arg7, arg8, arg9, arg11, arg3, arg1, arg5, arg0, arg4, arg2, false);
        } else if (class102.field1639.method1717(0) > 2) {
            return class248.method1814(arg4, arg2, arg9, arg3, arg1, arg7, (byte) 42, arg5, arg0, class102.field1639.method1717(0), arg11, arg6, arg8);
        } else {
            return class27.method178(-64, arg4, arg8, arg2, arg11, arg6, arg0, arg7, arg3, arg9, arg5, arg1);
        }
    }

    @OriginalMember(owner = "client!bl", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 75)
    public final void keyTyped(KeyEvent arg0) {
        field5221++;
        if (class157.field2648 != null) {
            int var2 = class212.method1587(arg0, 128);
            if (var2 >= 0) {
                int var3 = class56.field1000 + 1 & 0x7F;
                if (class265.field4553 != var3) {
                    class249.field4178[class56.field1000] = -1;
                    class274.field4712[class56.field1000] = var2;
                    class56.field1000 = var3;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(I)V", line = 146)
    public static final void method2149(int arg0) {
        class9.field177.method793((byte) -77);
        field5218++;
        class226.field3775.method793((byte) -85);
        class207.field3460.method793((byte) -125);
        if (arg0 != -15672) {
            field5214 = (class117) null;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(II)Z", line = 160)
    public static final boolean method2150(int arg0, int arg1) {
        if (arg1 <= 10) {
            method2149(126);
        }
        field5223++;
        return (arg0 >> 28 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!bl", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 175)
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class157.field2648 != null) {
            class280.field4791 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class159.field2690.length) {
                var3 = class159.field2690[var2];
                if ((var3 & 0x80) != 0) {
                    var3 = -1;
                }
            } else {
                var3 = -1;
            }
            if (class185.field3093 >= 0 && var3 >= 0) {
                class127.field2063[class185.field3093] = var3;
                class185.field3093 = class185.field3093 + 1 & 0x7F;
                if (class205.field3414 == class185.field3093) {
                    class185.field3093 = -1;
                }
            }
            if (var3 >= 0) {
                int var4 = class56.field1000 + 1 & 0x7F;
                if (class265.field4553 != var4) {
                    class249.field4178[class56.field1000] = var3;
                    class274.field4712[class56.field1000] = -1;
                    class56.field1000 = var4;
                }
            }
            int var5 = arg0.getModifiers();
            if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
                arg0.consume();
            }
        }
        field5217++;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(ZILok;ILjava/awt/Color;)V", line = 236)
    public static final void method2151(boolean arg0, int arg1, class146 arg2, int arg3, Color arg4) {
        field5213++;
        try {
            Graphics var5 = class75.field1228.getGraphics();
            if (class303.field5206 == null) {
                class303.field5206 = new Font("Helvetica", 1, 13);
                class33.field635 = class75.field1228.getFontMetrics(class303.field5206);
            }
            if (arg0) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class148.field2518, class56.field997);
            }
            if (arg4 == null) {
                arg4 = new Color(140, 17, 17);
            }
            try {
                if (class96.field1553 == null) {
                    class96.field1553 = class75.field1228.createImage(304, 34);
                }
                Graphics var6 = class96.field1553.getGraphics();
                var6.setColor(arg4);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg3 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect((arg3 * 3) + 2, 2, 300 - arg3 * 3, arg1);
                var6.setFont(class303.field5206);
                var6.setColor(Color.white);
                arg2.method1099(var6, 22, (byte) -80, (304 - arg2.method1122(51, class33.field635)) / 2);
                var5.drawImage(class96.field1553, class148.field2518 / 2 - 152, class56.field997 / 2 + -18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = class148.field2518 / 2 - 152;
                int var9 = class56.field997 / 2 - 18;
                var5.setColor(arg4);
                var5.drawRect(var8, var9, 303, 33);
                var5.fillRect(var8 + 2, var9 + 2, arg3 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var8 + 1, var9 + 1, 301, 31);
                var5.fillRect(arg3 * 3 + var8 + 2, var9 - -2, 300 - arg3 * 3, 30);
                var5.setFont(class303.field5206);
                var5.setColor(Color.white);
                arg2.method1099(var5, var9 + 22, (byte) -124, var8 + (304 - arg2.method1122(51, class33.field635)) / 2);
            }
            if (class169.field2847 != null) {
                var5.setFont(class303.field5206);
                var5.setColor(Color.white);
                class169.field2847.method1099(var5, class56.field997 / 2 - 26, (byte) -102, class148.field2518 / 2 - class169.field2847.method1122(51, class33.field635) / 2);
            }
        } catch (Exception var12) {
            class75.field1228.repaint();
        }
    }

    @OriginalMember(owner = "client!bl", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 304)
    public final synchronized void focusLost(FocusEvent arg0) {
        field5219++;
        if (class157.field2648 != null) {
            class185.field3093 = -1;
        }
    }

    @OriginalMember(owner = "client!bl", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 316)
    public final synchronized void keyReleased(KeyEvent arg0) {
        field5215++;
        if (class157.field2648 != null) {
            class280.field4791 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class159.field2690.length) {
                var3 = class159.field2690[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class185.field3093 >= 0 && var3 >= 0) {
                class127.field2063[class185.field3093] = ~var3;
                class185.field3093 = class185.field3093 + 1 & 0x7F;
                if (class205.field3414 == class185.field3093) {
                    class185.field3093 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!bl", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 353)
    public final void focusGained(FocusEvent arg0) {
        field5216++;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Z)V", line = 373)
    public static void method2152(boolean arg0) {
        field5222 = null;
        field5214 = null;
        if (arg0) {
            method2152(false);
        }
        field5224 = null;
        field5225 = null;
    }
}
