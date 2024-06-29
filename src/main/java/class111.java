import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class111 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!cf", name = "k", descriptor = "[Lia;")
    public static class257[] field2040 = new class257[8];

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "I")
    public static int field2038 = 1;

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "[I")
    public static int[] field2036 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2 };

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "I")
    public static int field2030;

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "I")
    public static int field2031;

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "I")
    public static int field2032;

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "I")
    public static int field2033;

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "I")
    public static int field2034;

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "I")
    public static int field2035;

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "I")
    public static int field2037;

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "I")
    public static int field2039;

    @OriginalMember(owner = "client!cf", name = "l", descriptor = "I")
    public static int field2041;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V")
    public static void method807(int arg0) {
        field2036 = null;
        field2040 = null;
        if (arg0 < 62) {
            method808(13, -50);
        }
    }

    @OriginalMember(owner = "client!cf", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field2035++;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)Lia;")
    public static final class257 method808(int arg0, int arg1) {
        field2041++;
        if (arg0 != 10) {
            field2038 = 46;
        }
        return class244.method1599(63, arg1, 10, false);
    }

    @OriginalMember(owner = "client!cf", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        field2032++;
        if (class27.field524 == null) {
            return;
        }
        class211.field3607 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < class74.field1447.length) {
            var3 = class74.field1447[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (class213.field3641 >= 0 && var3 >= 0) {
            class36.field724[class213.field3641] = var3;
            class213.field3641 = class213.field3641 + 1 & 0x7F;
            if (class99.field1835 == class213.field3641) {
                class213.field3641 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = class117.field2106 + 1 & 0x7F;
            if (class258.field4489 != var4) {
                class81.field1581[class117.field2106] = var3;
                class82.field1597[class117.field2106] = -1;
                class117.field2106 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIBII)V")
    public static final void method809(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        if (arg3 > -114) {
            method807(-3);
        }
        field2031++;
        if (class123.field2211 <= arg4 && class145.field2540 >= arg2 && arg5 >= class40.field834 && arg1 <= class255.field4371) {
            class239.method1577(arg5, arg2, arg0, arg4, arg1, 127);
        } else {
            class108.method799(arg2, arg4, arg1, arg5, arg0, (byte) 49);
        }
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(II)Z")
    public static final boolean method810(int arg0, int arg1) {
        if (arg0 == 10) {
            field2039++;
            return (arg1 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(I)V")
    public static final void method811(int arg0) {
        class111 var1 = class27.field524;
        synchronized (class27.field524) {
            if (arg0 != -16221) {
                field2040 = null;
            }
            class258.field4489 = class37.field738;
            class211.field3607++;
            if (class213.field3641 >= 0) {
                while (class99.field1835 != class213.field3641) {
                    int var2 = class36.field724[class99.field1835];
                    class99.field1835 = class99.field1835 + 1 & 0x7F;
                    if (var2 < 0) {
                        class39.field793[~var2] = false;
                    } else {
                        class39.field793[var2] = true;
                    }
                }
            } else {
                for (int var3 = 0; var3 < 112; var3++) {
                    class39.field793[var3] = false;
                }
                class213.field3641 = class99.field1835;
            }
            class37.field738 = class117.field2106;
        }
        field2033++;
    }

    @OriginalMember(owner = "client!cf", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field2037++;
        if (class27.field524 != null) {
            class213.field3641 = -1;
        }
    }

    @OriginalMember(owner = "client!cf", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        if (class27.field524 != null) {
            int var2 = class251.method1641((byte) -83, arg0);
            if (var2 >= 0) {
                int var3 = class117.field2106 + 1 & 0x7F;
                if (class258.field4489 != var3) {
                    class81.field1581[class117.field2106] = -1;
                    class82.field1597[class117.field2106] = var2;
                    class117.field2106 = var3;
                }
            }
        }
        field2030++;
        arg0.consume();
    }

    @OriginalMember(owner = "client!cf", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class27.field524 != null) {
            class211.field3607 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class74.field1447.length) {
                var3 = class74.field1447[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class213.field3641 >= 0 && var3 >= 0) {
                class36.field724[class213.field3641] = ~var3;
                class213.field3641 = class213.field3641 + 1 & 0x7F;
                if (class99.field1835 == class213.field3641) {
                    class213.field3641 = -1;
                }
            }
        }
        field2034++;
        arg0.consume();
    }
}
