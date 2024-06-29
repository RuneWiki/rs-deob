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

@OriginalClass("client!pd")
public class class57 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "I")
    public static int field916 = 0;

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "Lp;")
    public static class280 field917 = class18.method140((byte) -123, "3D)2Softwarebibliothek gestartet)3");

    @OriginalMember(owner = "client!pd", name = "m", descriptor = "Lua;")
    public static class113 field927 = null;

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "[I")
    public static int[] field923 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "I")
    public static int field919;

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "I")
    public static int field920;

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "I")
    public static int field921;

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "I")
    public static int field922;

    @OriginalMember(owner = "client!pd", name = "j", descriptor = "I")
    public static int field924;

    @OriginalMember(owner = "client!pd", name = "l", descriptor = "I")
    public static int field926;

    @OriginalMember(owner = "client!pd", name = "n", descriptor = "I")
    public static int field928;

    @OriginalMember(owner = "client!pd", name = "o", descriptor = "I")
    public static int field929;

    @OriginalMember(owner = "client!pd", name = "q", descriptor = "I")
    public static int field931;

    @OriginalMember(owner = "client!pd", name = "k", descriptor = "Ltg;")
    public static class180 field925;

    @OriginalMember(owner = "client!pd", name = "p", descriptor = "Leg;")
    public static class223 field930;

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "Z")
    public static boolean field918;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "[I")
    public static int[] field915;

    @OriginalMember(owner = "client!pd", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        field924++;
        if (class182.field3192 != null) {
            int var2 = class4.method57(7, arg0);
            if (var2 >= 0) {
                int var3 = class149.field2580 + 1 & 0x7F;
                if (class48.field789 != var3) {
                    class189.field3321[class149.field2580] = -1;
                    class242.field4244[class149.field2580] = var2;
                    class149.field2580 = var3;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!pd", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class182.field3192 != null) {
            class80.field1320 = -1;
        }
        field921++;
    }

    @OriginalMember(owner = "client!pd", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field920++;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V")
    public static final void method410(int arg0) {
        int var1 = class183.field3224 >> 7;
        field929++;
        if (class220.field3759 < 128) {
            class220.field3759 = 128;
        }
        class25.field487 &= 0x7FF;
        if (class220.field3759 > 383) {
            class220.field3759 = 383;
        }
        int var2 = class67.field1115 >> 7;
        int var3 = 0;
        int var4 = class158.method1123(class231.field4013, class183.field3224, -6230, class67.field1115);
        if (var1 > 3 && var2 > 3 && var1 < 100 && var2 < 100) {
            for (int var5 = var1 - 4; var5 <= var1 + 4; var5++) {
                for (int var6 = var2 - 4; var6 <= (var2 + 4); var6++) {
                    int var7 = class231.field4013;
                    if (var7 < 3 && (class259.field4598[1][var5][var6] & 0x2) == 2) {
                        var7++;
                    }
                    int var8 = -class145.field2529[var7][var5][var6] - (-((class249.field4353[var7][var5][var6] & 0xFF) * 8) - var4);
                    if (var3 < var8) {
                        var3 = var8;
                    }
                }
            }
        }
        if (arg0 != 303) {
            field930 = null;
        }
        int var9 = var3 * 192;
        if (var9 > 98048) {
            var9 = 98048;
        }
        if (var9 < 32768) {
            var9 = 32768;
        }
        if (class279.field4883 < var9) {
            class279.field4883 += (var9 - class279.field4883) / 24;
        } else if (var9 < class279.field4883) {
            class279.field4883 += (var9 - class279.field4883) / 80;
        }
    }

    @OriginalMember(owner = "client!pd", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        field931++;
        if (class182.field3192 != null) {
            class56.field908 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class277.field4862.length) {
                var3 = class277.field4862[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class80.field1320 >= 0 && var3 >= 0) {
                class177.field3083[class80.field1320] = ~var3;
                class80.field1320 = class80.field1320 + 1 & 0x7F;
                if (class80.field1320 == class183.field3226) {
                    class80.field1320 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Z)V")
    public static void method411(boolean arg0) {
        field917 = null;
        field915 = null;
        field925 = null;
        field927 = null;
        if (arg0) {
            field930 = null;
            field923 = null;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(BLp;ZILjava/awt/Color;)V")
    public static final void method412(byte arg0, class280 arg1, boolean arg2, int arg3, Color arg4) {
        try {
            Graphics var5 = class41.field707.getGraphics();
            if (class266.field4685 == null) {
                class266.field4685 = new Font("Helvetica", 1, 13);
                class109.field1827 = class41.field707.getFontMetrics(class266.field4685);
            }
            if (arg2) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class190.field3328, class103.field1724);
            }
            if (arg4 == null) {
                arg4 = new Color(140, 17, 17);
            }
            try {
                if (class177.field3078 == null) {
                    class177.field3078 = class41.field707.createImage(304, 34);
                }
                Graphics var6 = class177.field3078.getGraphics();
                var6.setColor(arg4);
                if (arg0 != 28) {
                    method410(-83);
                }
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg3 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg3 * 3 + 2, 2, 300 - (arg3 * 3), 30);
                var6.setFont(class266.field4685);
                var6.setColor(Color.white);
                arg1.method1872(0, (304 - arg1.method1855(107, class109.field1827)) / 2, 22, var6);
                var5.drawImage(class177.field3078, class190.field3328 / 2 - 152, class103.field1724 / 2 + -18, (ImageObserver) null);
            } catch (Exception var9) {
                int var7 = class190.field3328 / 2 - 152;
                int var8 = class103.field1724 / 2 - 18;
                var5.setColor(arg4);
                var5.drawRect(var7, var8, 303, 33);
                var5.fillRect(var7 + 2, var8 + 2, arg3 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var7 + 1, var8 + 1, 301, 31);
                var5.fillRect(arg3 * 3 + var7 + 2, var8 + 2, 300 - (arg3 * 3), 30);
                var5.setFont(class266.field4685);
                var5.setColor(Color.white);
                arg1.method1872(0, var7 + (304 - arg1.method1855(79, class109.field1827)) / 2, var8 + 22, var5);
            }
            if (class178.field3100 != null) {
                var5.setFont(class266.field4685);
                var5.setColor(Color.white);
                class178.field3100.method1872(0, class190.field3328 / 2 - class178.field3100.method1855(104, class109.field1827) / 2, class103.field1724 / 2 + -26, var5);
            }
        } catch (Exception var10) {
            class41.field707.repaint();
        }
        field922++;
    }

    @OriginalMember(owner = "client!pd", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class182.field3192 != null) {
            class56.field908 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class277.field4862.length) {
                var3 = class277.field4862[var2];
                if ((var3 & 0x80) != 0) {
                    var3 = -1;
                }
            } else {
                var3 = -1;
            }
            if (class80.field1320 >= 0 && var3 >= 0) {
                class177.field3083[class80.field1320] = var3;
                class80.field1320 = class80.field1320 + 1 & 0x7F;
                if (class80.field1320 == class183.field3226) {
                    class80.field1320 = -1;
                }
            }
            if (var3 >= 0) {
                int var4 = class149.field2580 + 1 & 0x7F;
                if (class48.field789 != var4) {
                    class189.field3321[class149.field2580] = var3;
                    class242.field4244[class149.field2580] = -1;
                    class149.field2580 = var4;
                }
            }
            int var5 = arg0.getModifiers();
            if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
                arg0.consume();
            }
        }
        field926++;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIZLoc;)V")
    public static final void method413(int arg0, int arg1, boolean arg2, class61 arg3) {
        if (arg3.field4853 == arg1 && arg1 != -1) {
            class78 var4 = class207.method1401((byte) -22, arg1);
            int var5 = var4.field1290;
            if (var5 == 1) {
                arg3.field4861 = 0;
                arg3.field4801 = 0;
                arg3.field4821 = arg0;
                arg3.field4830 = 0;
                class150.method1034(arg3.field4793, arg2, var4, arg3.field4830, arg3.field4791, false);
            }
            if (var5 == 2) {
                arg3.field4801 = 0;
            }
        } else if (arg1 == -1 || arg3.field4853 == -1 || class207.method1401((byte) -22, arg1).field1288 >= class207.method1401((byte) -22, arg3.field4853).field1288) {
            arg3.field4821 = arg0;
            arg3.field4801 = 0;
            arg3.field4864 = arg3.field4816;
            arg3.field4861 = 0;
            arg3.field4853 = arg1;
            arg3.field4830 = 0;
            if (arg3.field4853 != -1) {
                class150.method1034(arg3.field4793, false, class207.method1401((byte) -22, arg3.field4853), arg3.field4830, arg3.field4791, false);
            }
        }
        field919++;
        if (arg2) {
            field930 = null;
        }
    }
}
