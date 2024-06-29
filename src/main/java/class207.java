import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class207 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
    public static volatile int field2974 = 0;

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "I")
    public static int field2976 = -1;

    @OriginalMember(owner = "client!lc", name = "n", descriptor = "Z")
    public static boolean field2985 = true;

    @OriginalMember(owner = "client!lc", name = "o", descriptor = "[Ljava/lang/String;")
    public static String[] field2986 = new String[200];

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "F")
    public static float field2972;

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
    public static int field2973;

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
    public static int field2975;

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "I")
    public static int field2977;

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "I")
    public static int field2978;

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "I")
    public static int field2980;

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "I")
    public static int field2981;

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "I")
    public static int field2982;

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "I")
    public static int field2983;

    @OriginalMember(owner = "client!lc", name = "m", descriptor = "I")
    public static int field2984;

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "[I")
    public static int[] field2979;

    @OriginalMember(owner = "client!lc", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 4)
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class171.field2336 != null) {
            class334.field5050 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class132.field1813.length > var2) {
                var3 = class132.field1813[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class160.field2184 >= 0 && var3 >= 0) {
                class338.field5082[class160.field2184] = ~var3;
                class160.field2184 = class160.field2184 + 1 & 0x7F;
                if (class307.field4598 == class160.field2184) {
                    class160.field2184 = -1;
                }
            }
        }
        field2977++;
        arg0.consume();
    }

    @OriginalMember(owner = "client!lc", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 38)
    public final void focusGained(FocusEvent arg0) {
        field2973++;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "([BII)I", line = 52)
    public static final int method1461(byte[] arg0, int arg1, int arg2) {
        field2982++;
        if (arg1 != -25376) {
            field2981 = -27;
        }
        return class235.method1617(arg2, (byte) 109, arg0, 0);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V", line = 66)
    public static void method1462(int arg0) {
        if (arg0 != 0) {
            method1462(-75);
        }
        field2979 = null;
        field2986 = null;
    }

    @OriginalMember(owner = "client!lc", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 77)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class171.field2336 != null) {
            class160.field2184 = -1;
        }
        field2980++;
    }

    @OriginalMember(owner = "client!lc", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 107)
    public final void keyTyped(KeyEvent arg0) {
        field2975++;
        if (class171.field2336 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != '\u0000' && var2 != '\uFFFF' && class211.method1485(1, var2)) {
                int var3 = class309.field4671 + 1 & 0x7F;
                if (class54.field731 != var3) {
                    class148.field2049[class309.field4671] = -1;
                    class148.field2055[class309.field4671] = var2;
                    class309.field4671 = var3;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)V", line = 136)
    public static final void method1463(byte arg0) {
        field2983++;
        if (arg0 > -93) {
            method1461((byte[]) null, -118, 111);
        }
        field2985 = true;
    }

    @OriginalMember(owner = "client!lc", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 152)
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class171.field2336 != null) {
            class334.field5050 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class132.field1813.length) {
                var3 = class132.field1813[var2];
                if ((var3 & 0x80) != 0) {
                    var3 = -1;
                }
            } else {
                var3 = -1;
            }
            if (class160.field2184 >= 0 && var3 >= 0) {
                class338.field5082[class160.field2184] = var3;
                class160.field2184 = class160.field2184 + 1 & 0x7F;
                if (class307.field4598 == class160.field2184) {
                    class160.field2184 = -1;
                }
            }
            if (var3 >= 0) {
                int var4 = class309.field4671 + 1 & 0x7F;
                if (class54.field731 != var4) {
                    class148.field2049[class309.field4671] = var3;
                    class148.field2055[class309.field4671] = '\u0000';
                    class309.field4671 = var4;
                }
            }
            int var5 = arg0.getModifiers();
            if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
                arg0.consume();
            }
        }
        field2984++;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IBZZI)V", line = 210)
    public static final void method1464(int arg0, byte arg1, boolean arg2, boolean arg3, int arg4) {
        if (arg1 == -91) {
            field2978++;
            class10.method52(class262.field3848.length - 1, -82, arg3, arg2, arg4, arg0, 0);
        }
    }
}
