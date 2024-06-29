import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class9 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "Lhh;")
    public static class163 field151 = null;

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "Z")
    public static boolean field154 = true;

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "Lhh;")
    public static class163 field157 = class137.method1065(" GMT", 17);

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "[I")
    public static int[] field153 = new int[50];

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "I")
    public static int field152 = 0;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "I")
    public static int field147;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "I")
    public static int field148;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "I")
    public static int field149;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "I")
    public static int field150;

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "I")
    public static int field155;

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "I")
    public static int field159;

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "I")
    public static int field160;

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "J")
    public static long field156;

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "Leh;")
    public static class109 field158;

    @OriginalMember(owner = "client!oa", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class191.field3494 != null) {
            class247.field4371 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class32.field497.length > var2) {
                var3 = class32.field497[var2];
                if ((var3 & 0x80) != 0) {
                    var3 = -1;
                }
            } else {
                var3 = -1;
            }
            if (class30.field470 >= 0 && var3 >= 0) {
                class58.field951[class30.field470] = var3;
                class30.field470 = class30.field470 + 1 & 0x7F;
                if (class30.field470 == class12.field179) {
                    class30.field470 = -1;
                }
            }
            if (var3 >= 0) {
                int var4 = class39.field656 + 1 & 0x7F;
                if (class31.field482 != var4) {
                    class255.field4465[class39.field656] = var3;
                    class48.field810[class39.field656] = -1;
                    class39.field656 = var4;
                }
            }
            int var5 = arg0.getModifiers();
            if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
                arg0.consume();
            }
        }
        field155++;
    }

    @OriginalMember(owner = "client!oa", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field160++;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
    public static final void method63(int arg0) {
        int var1 = (class235.field4203.field3633 >> 7) + class62.field1035;
        field150++;
        class45.field760 = 0;
        if (arg0 >= -65) {
            field154 = true;
        }
        int var2 = (class235.field4203.field3615 >> 7) + class257.field4500;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class45.field760 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class45.field760 = 1;
        }
        if (class45.field760 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class45.field760 = 0;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ZI)Ldb;")
    public static final class35 method64(boolean arg0, int arg1) {
        class35 var2 = (class35) class52.field863.method114((long) arg1, 0);
        field147++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class204.field3697.method973(class69.method486(arg1, (byte) 20), true, class141.method1082(arg1, (byte) -112));
        class35 var4 = new class35();
        var4.field538 = arg1;
        if (var3 != null) {
            var4.method256(new class81(var3), -32507);
        }
        var4.method247(-26516);
        if (var4.field553) {
            var4.field570 = 0;
            var4.field601 = false;
        }
        if (!class88.field1635 && var4.field550) {
            var4.field555 = null;
        }
        class52.field863.method117(var4, arg0, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!oa", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        field159++;
        if (class191.field3494 != null) {
            class247.field4371 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class32.field497.length) {
                var3 = class32.field497[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class30.field470 >= 0 && var3 >= 0) {
                class58.field951[class30.field470] = ~var3;
                class30.field470 = class30.field470 + 1 & 0x7F;
                if (class30.field470 == class12.field179) {
                    class30.field470 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)V")
    public static void method65(byte arg0) {
        field151 = null;
        field157 = null;
        if (arg0 != 14) {
            field153 = null;
        }
        field158 = null;
        field153 = null;
    }

    @OriginalMember(owner = "client!oa", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field148++;
        if (class191.field3494 != null) {
            class30.field470 = -1;
        }
    }

    @OriginalMember(owner = "client!oa", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        if (class191.field3494 != null) {
            int var2 = class199.method1431(arg0, (byte) -118);
            if (var2 >= 0) {
                int var3 = class39.field656 + 1 & 0x7F;
                if (class31.field482 != var3) {
                    class255.field4465[class39.field656] = -1;
                    class48.field810[class39.field656] = var2;
                    class39.field656 = var3;
                }
            }
        }
        field149++;
        arg0.consume();
    }
}
