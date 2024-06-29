import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class140 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!w", name = "h", descriptor = "Z")
    public static boolean field3335 = false;

    @OriginalMember(owner = "client!w", name = "m", descriptor = "Lrd;")
    public static class114 field3340 = class84.method656("backleft2", (byte) 118);

    @OriginalMember(owner = "client!w", name = "t", descriptor = "Lrd;")
    private static class114 field3347 = class84.method656("Prepared sound engine", (byte) 119);

    @OriginalMember(owner = "client!w", name = "f", descriptor = "Lrd;")
    public static class114 field3333 = field3347;

    @OriginalMember(owner = "client!w", name = "b", descriptor = "I")
    public static int field3329;

    @OriginalMember(owner = "client!w", name = "c", descriptor = "I")
    public static int field3330;

    @OriginalMember(owner = "client!w", name = "d", descriptor = "I")
    public static int field3331;

    @OriginalMember(owner = "client!w", name = "e", descriptor = "I")
    public static int field3332;

    @OriginalMember(owner = "client!w", name = "g", descriptor = "I")
    public static int field3334;

    @OriginalMember(owner = "client!w", name = "i", descriptor = "I")
    public static int field3336;

    @OriginalMember(owner = "client!w", name = "j", descriptor = "I")
    public static int field3337;

    @OriginalMember(owner = "client!w", name = "k", descriptor = "I")
    public static int field3338;

    @OriginalMember(owner = "client!w", name = "l", descriptor = "I")
    public static int field3339;

    @OriginalMember(owner = "client!w", name = "n", descriptor = "I")
    public static int field3341;

    @OriginalMember(owner = "client!w", name = "o", descriptor = "I")
    public static int field3342;

    @OriginalMember(owner = "client!w", name = "p", descriptor = "I")
    public static int field3343;

    @OriginalMember(owner = "client!w", name = "q", descriptor = "I")
    public static int field3344;

    @OriginalMember(owner = "client!w", name = "u", descriptor = "I")
    public static int field3348;

    @OriginalMember(owner = "client!w", name = "v", descriptor = "I")
    public static int field3349;

    @OriginalMember(owner = "client!w", name = "r", descriptor = "Lpb;")
    public static class100 field3345;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "[I")
    public static int[] field3328;

    @OriginalMember(owner = "client!w", name = "s", descriptor = "[[B")
    public static byte[][] field3346;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I)[Lhe;")
    public static final class54[] method1114(int arg0) {
        field3336++;
        class54[] var1 = new class54[class120.field2796];
        for (int var2 = 0; var2 < class120.field2796; var2++) {
            class54 var3 = var1[var2] = new class54();
            var3.field1131 = class1.field14;
            var3.field1132 = class78.field1776;
            var3.field1127 = class29.field599[var2];
            var3.field1130 = class120.field2814[var2];
            var3.field1128 = class111.field2594[var2];
            var3.field1133 = field3328[var2];
            byte[] var4 = field3346[var2];
            int var5 = var3.field1133 * var3.field1128;
            var3.field1129 = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                var3.field1129[var6] = class31.field630[class96.method737(255, var4[var6])];
            }
        }
        if (arg0 > -61) {
            method1114(36);
        }
        class34.method246(-1958111762);
        return var1;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(B)V")
    public static final void method1115(byte arg0) {
        field3343++;
        int var1 = 83 % ((38 - arg0) / 57);
        for (int var2 = 0; var2 < class48.field1004; var2++) {
            int var3 = class118.field2771[var2];
            class126 var4 = class36.field762[var3];
            int var5 = class77.field1752.method462((byte) 116);
            if ((var5 & 0x80) != 0) {
                var5 += class77.field1752.method462((byte) 116) << 8;
            }
            class104.method805(var4, var5, -67, var3);
        }
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(I)V")
    public static void method1116(int arg0) {
        field3347 = null;
        field3346 = null;
        field3340 = null;
        field3333 = null;
        if (arg0 > 74) {
            field3328 = null;
            field3345 = null;
        }
    }

    @OriginalMember(owner = "client!w", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class90.field2084 != null) {
            class126.field3010 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class107.field2480.length) {
                var3 = class107.field2480[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class98.field2235 >= 0 && var3 >= 0) {
                class72.field1609[class98.field2235] = ~var3;
                class98.field2235 = class98.field2235 + 1 & 0x7F;
                if (class98.field2235 == class12.field236) {
                    class98.field2235 = -1;
                }
            }
        }
        arg0.consume();
        field3349++;
    }

    @OriginalMember(owner = "client!w", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field3329++;
    }

    @OriginalMember(owner = "client!w", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field3342++;
        if (class90.field2084 != null) {
            class98.field2235 = -1;
        }
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(I)V")
    public static final void method1117(int arg0) {
        field3334++;
        for (class98 var1 = (class98) class72.field1598.method654((byte) 49); var1 != null; var1 = (class98) class72.field1598.method644((byte) -68)) {
            if (var1.field2230 == -1) {
                var1.field2217 = 0;
                class79.method631((byte) 103, var1);
            } else {
                var1.method540(-26669);
            }
        }
        int var2 = -74 % ((arg0 - 10) / 59);
    }

    @OriginalMember(owner = "client!w", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        field3330++;
        if (class90.field2084 != null) {
            class126.field3010 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class107.field2480.length > var2) {
                var3 = class107.field2480[var2];
                if ((var3 & 0x80) != 0) {
                    var3 = -1;
                }
            } else {
                var3 = -1;
            }
            int var4;
            if (var3 == 85 || var3 == 80 || var3 == 84 || var3 == 0 || var3 == 101) {
                var4 = -1;
            } else {
                var4 = class11.method85(arg0, 37);
            }
            if (class98.field2235 >= 0 && var3 >= 0) {
                class72.field1609[class98.field2235] = var3;
                class98.field2235 = class98.field2235 + 1 & 0x7F;
                if (class98.field2235 == class12.field236) {
                    class98.field2235 = -1;
                }
            }
            if (var3 >= 0 || var4 >= 0) {
                int var5 = client.field398 + 1 & 0x7F;
                if (class117.field2733 != var5) {
                    class116.field2718[client.field398] = var3;
                    class109.field2523[client.field398] = var4;
                    client.field398 = var5;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!w", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        field3344++;
        arg0.consume();
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IZLrd;)V")
    public static final void method1118(int arg0, boolean arg1, class114 arg2) {
        field3331++;
        field3341++;
        class61.field1303.method1054(8, 193);
        if (!arg1) {
            class61.field1303.method455(arg2.method877(29486), 2);
            class61.field1303.method478((byte) 123, arg0);
        }
    }

    @OriginalMember(owner = "client!w", name = "d", descriptor = "(I)Lee;")
    public static final class34 method1119(int arg0) {
        if (arg0 >= -126) {
            return null;
        }
        field3338++;
        try {
            return (class34) Class.forName("aa").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return new class47();
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lnd;IB)Lrd;")
    public static final class114 method1120(class90 arg0, int arg1, byte arg2) {
        if (arg2 < 60) {
            field3345 = null;
        }
        field3339++;
        if (!class118.method916(false, class39.method278(arg0, 1572721824), arg1)) {
            return null;
        } else if (arg0.field2119 == null || arg0.field2119.length <= arg1 || arg0.field2119[arg1] == null || arg0.field2119[arg1].method862(-6488).method854(-29348) == 0) {
            return class1.field11 ? class101.method786((byte) 126, new class114[] { class39.field820, class14.method113(arg1, -31766) }) : null;
        } else {
            return arg0.field2119[arg1];
        }
    }
}
