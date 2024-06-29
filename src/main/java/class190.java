import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class190 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "Lvf;")
    public static class265 field3412 = class87.method582(-46, "Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q");

    @OriginalMember(owner = "client!kf", name = "l", descriptor = "Lvf;")
    private static class265 field3419 = class87.method582(-46, "glow3:");

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "Lvf;")
    public static class265 field3418 = class87.method582(-46, "(U2");

    @OriginalMember(owner = "client!kf", name = "m", descriptor = "Lvf;")
    public static class265 field3420 = field3419;

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "Z")
    public static boolean field3414 = false;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "Lvf;")
    public static class265 field3408 = field3419;

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "I")
    public static int field3409;

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "I")
    public static int field3411;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "I")
    public static int field3413;

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "I")
    public static int field3415;

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "I")
    public static int field3416;

    @OriginalMember(owner = "client!kf", name = "n", descriptor = "I")
    public static int field3421;

    @OriginalMember(owner = "client!kf", name = "o", descriptor = "I")
    public static int field3422;

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "Lfl;")
    public static class192 field3410;

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "[I")
    public static int[] field3417;

    @OriginalMember(owner = "client!kf", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field3416++;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
    public static final Class method1296(String arg0, int arg1) throws ClassNotFoundException {
        field3413++;
        if (arg1 != -9985) {
            method1297(-88);
        }
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else if (arg0.equals("J")) {
            return Long.TYPE;
        } else if (arg0.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg0.equals("F")) {
            return Float.TYPE;
        } else if (arg0.equals("D")) {
            return Double.TYPE;
        } else if (arg0.equals("C")) {
            return Character.TYPE;
        } else {
            return Class.forName(arg0);
        }
    }

    @OriginalMember(owner = "client!kf", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        field3421++;
        if (class94.field1673 != null) {
            int var2 = class139.method960(arg0, (byte) -30);
            if (var2 >= 0) {
                int var3 = class254.field4369 + 1 & 0x7F;
                if (class176.field3138 != var3) {
                    class195.field3500[class254.field4369] = -1;
                    class75.field1430[class254.field4369] = var2;
                    class254.field4369 = var3;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!kf", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class94.field1673 != null) {
            class116.field2049 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class216.field3900.length > var2) {
                var3 = class216.field3900[var2];
                if ((var3 & 0x80) != 0) {
                    var3 = -1;
                }
            } else {
                var3 = -1;
            }
            if (class72.field1388 >= 0 && var3 >= 0) {
                class176.field3144[class72.field1388] = var3;
                class72.field1388 = class72.field1388 + 1 & 0x7F;
                if (class72.field1388 == class147.field2751) {
                    class72.field1388 = -1;
                }
            }
            if (var3 >= 0) {
                int var4 = class254.field4369 + 1 & 0x7F;
                if (class176.field3138 != var4) {
                    class195.field3500[class254.field4369] = var3;
                    class75.field1430[class254.field4369] = -1;
                    class254.field4369 = var4;
                }
            }
            int var5 = arg0.getModifiers();
            if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
                arg0.consume();
            }
        }
        field3422++;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V")
    public static final void method1297(int arg0) {
        for (int var1 = 0; var1 < class131.field2376; var1++) {
            int var2 = class279.field4928[var1];
            class122 var3 = class209.field3766[var2];
            int var4 = class207.field3730.method920((byte) 57);
            if ((var4 & 0x80) != 0) {
                var4 += class207.field3730.method920((byte) 62) << 8;
            }
            class123.method827(var4, var3, var2, arg0 ^ 0xC0);
        }
        if (arg0 == 128) {
            field3411++;
        }
    }

    @OriginalMember(owner = "client!kf", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field3415++;
        if (class94.field1673 != null) {
            class72.field1388 = -1;
        }
    }

    @OriginalMember(owner = "client!kf", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class94.field1673 != null) {
            class116.field2049 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class216.field3900.length) {
                var3 = class216.field3900[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class72.field1388 >= 0 && var3 >= 0) {
                class176.field3144[class72.field1388] = ~var3;
                class72.field1388 = class72.field1388 + 1 & 0x7F;
                if (class72.field1388 == class147.field2751) {
                    class72.field1388 = -1;
                }
            }
        }
        arg0.consume();
        field3409++;
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(I)V")
    public static void method1298(int arg0) {
        field3412 = null;
        field3420 = null;
        field3408 = null;
        field3417 = null;
        if (arg0 < 56) {
            field3418 = null;
        }
        field3418 = null;
        field3419 = null;
        field3410 = null;
    }
}
