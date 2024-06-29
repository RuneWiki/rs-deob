import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class29 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!fb", name = "l", descriptor = "I")
    public static int field420 = 0;

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "Ldf;")
    private static class51 field418 = class46.method233("purple:", 100);

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "Ldf;")
    public static class51 field414 = field418;

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "Ldf;")
    public static class51 field417 = field418;

    @OriginalMember(owner = "client!fb", name = "m", descriptor = "Lqh;")
    public static class189 field421 = new class189(50);

    @OriginalMember(owner = "client!fb", name = "p", descriptor = "Ldf;")
    private static class51 field424 = class46.method233("Drop", 100);

    @OriginalMember(owner = "client!fb", name = "q", descriptor = "Ldf;")
    public static class51 field425 = field424;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "I")
    public static int field409;

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "I")
    public static int field410;

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "I")
    public static int field411;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "I")
    public static int field412;

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "I")
    public static int field413;

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "I")
    public static int field415;

    @OriginalMember(owner = "client!fb", name = "k", descriptor = "I")
    public static int field419;

    @OriginalMember(owner = "client!fb", name = "n", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "client!fb", name = "o", descriptor = "I")
    public static int field423;

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "Lwc;")
    public static class213 field416;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIII)Lkh;")
    public static final class42 method146(int arg0, int arg1, int arg2, int arg3) {
        field409++;
        int var4 = -41 / ((arg0 - 2) / 58);
        class42 var5 = new class42();
        var5.field668 = arg1;
        var5.field672 = arg2;
        class79.field1265.method1447(74, (long) arg3, var5);
        class143.method1032(arg1, (byte) 69);
        class213 var6 = class198.method1392(11823, arg3);
        if (var6 != null) {
            class25.method135(var6, -28014);
        }
        if (class1.field3 != null) {
            class25.method135(class1.field3, -28014);
            class1.field3 = null;
        }
        class90.field1498 = false;
        class39.field616 = 0;
        class2.method6(class255.field4458, class89.field1475, 0, class92.field1531, class87.field1455);
        if (var6 != null) {
            class97.method718(112, false, var6);
        }
        class20.method103(arg1, (byte) -96);
        if (class243.field4206 != -1) {
            class17.method88(class243.field4206, (byte) -16, 1);
        }
        return var5;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIZ)I")
    public static final int method147(int arg0, int arg1, boolean arg2) {
        field411++;
        if (arg0 == -1) {
            return 12345678;
        }
        int var3 = (arg0 & 0x7F) * arg1 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        if (!arg2) {
            field414 = null;
        }
        return (arg0 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!fb", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        field410++;
        if (class208.field3475 != null) {
            int var2 = class176.method1234(arg0, 126);
            if (var2 >= 0) {
                int var3 = class133.field2216 + 1 & 0x7F;
                if (class195.field3261 != var3) {
                    class92.field1517[class133.field2216] = -1;
                    class203.field3400[class133.field2216] = var2;
                    class133.field2216 = var3;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!fb", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        field423++;
        if (class208.field3475 == null) {
            return;
        }
        class196.field3288 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && class185.field3053.length > var2) {
            var3 = class185.field3053[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (class5.field57 >= 0 && var3 >= 0) {
            class44.field711[class5.field57] = var3;
            class5.field57 = class5.field57 + 1 & 0x7F;
            if (class5.field57 == class262.field4578) {
                class5.field57 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = class133.field2216 + 1 & 0x7F;
            if (class195.field3261 != var4) {
                class92.field1517[class133.field2216] = var3;
                class203.field3400[class133.field2216] = -1;
                class133.field2216 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!fb", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field419++;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V")
    public static void method148(int arg0) {
        field417 = null;
        field418 = null;
        field424 = null;
        if (arg0 == -27734) {
            field414 = null;
            field416 = null;
            field425 = null;
            field421 = null;
        }
    }

    @OriginalMember(owner = "client!fb", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class208.field3475 != null) {
            class196.field3288 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class185.field3053.length) {
                var3 = class185.field3053[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class5.field57 >= 0 && var3 >= 0) {
                class44.field711[class5.field57] = ~var3;
                class5.field57 = class5.field57 + 1 & 0x7F;
                if (class5.field57 == class262.field4578) {
                    class5.field57 = -1;
                }
            }
        }
        arg0.consume();
        field412++;
    }

    @OriginalMember(owner = "client!fb", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field413++;
        if (class208.field3475 != null) {
            class5.field57 = -1;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(II)Lgj;")
    public static final class216 method149(int arg0, int arg1) {
        field422++;
        class216 var2 = (class216) class163.field2664.method1491((long) arg0, (byte) 95);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class12.field180.method828(5, (byte) 92, arg0);
        class216 var4 = new class216();
        if (var3 != null) {
            var4.method1484(arg1 - 3549, new class121(var3));
        }
        class163.field2664.method1492(false, (long) arg0, var4);
        if (arg1 != -26793) {
            field421 = null;
        }
        return var4;
    }
}
