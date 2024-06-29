import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class133 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "Lkd;")
    private static class73 field3330 = class126.method1070((byte) -66, "RuneScape is loading )2 please wait)3)3)3");

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "Lkd;")
    public static class73 field3334 = class126.method1070((byte) -66, " ");

    @OriginalMember(owner = "client!tc", name = "o", descriptor = "Lkd;")
    public static class73 field3341 = class126.method1070((byte) -66, "Wen m-Ochten Sie entfernen?");

    @OriginalMember(owner = "client!tc", name = "s", descriptor = "[Lba;")
    public static class9[] field3345 = new class9[32768];

    @OriginalMember(owner = "client!tc", name = "l", descriptor = "Lkd;")
    private static class73 field3338 = class126.method1070((byte) -66, "Please enter your username)3");

    @OriginalMember(owner = "client!tc", name = "A", descriptor = "Lkd;")
    public static class73 field3353 = field3330;

    @OriginalMember(owner = "client!tc", name = "C", descriptor = "Lkd;")
    public static class73 field3355 = class126.method1070((byte) -66, ": ");

    @OriginalMember(owner = "client!tc", name = "y", descriptor = "I")
    public static int field3351 = -1;

    @OriginalMember(owner = "client!tc", name = "z", descriptor = "Lkd;")
    private static class73 field3352 = class126.method1070((byte) -66, "From");

    @OriginalMember(owner = "client!tc", name = "D", descriptor = "Lkd;")
    private static class73 field3356 = class126.method1070((byte) -66, "Please try using a different world)3");

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "Lkd;")
    public static class73 field3332 = field3356;

    @OriginalMember(owner = "client!tc", name = "r", descriptor = "Lkd;")
    public static class73 field3344 = field3338;

    @OriginalMember(owner = "client!tc", name = "x", descriptor = "Lkd;")
    public static class73 field3350 = class126.method1070((byte) -66, "Ung-Ultiger Benutzername");

    @OriginalMember(owner = "client!tc", name = "E", descriptor = "Lkd;")
    public static class73 field3357 = field3352;

    @OriginalMember(owner = "client!tc", name = "v", descriptor = "Lkd;")
    public static class73 field3348 = field3356;

    @OriginalMember(owner = "client!tc", name = "t", descriptor = "Lkd;")
    public static class73 field3346 = field3356;

    @OriginalMember(owner = "client!tc", name = "F", descriptor = "Lkd;")
    public static class73 field3358 = class126.method1070((byte) -66, "Lade Spiel)2Fenster )2 ");

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "Lkd;")
    public static class73 field3329 = field3356;

    @OriginalMember(owner = "client!tc", name = "p", descriptor = "I")
    public static int field3342 = 0;

    @OriginalMember(owner = "client!tc", name = "k", descriptor = "Lkd;")
    public static class73 field3337 = field3356;

    @OriginalMember(owner = "client!tc", name = "u", descriptor = "Lkd;")
    public static class73 field3347 = field3356;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "I")
    public static int field3327;

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "I")
    public static int field3331;

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "I")
    public static int field3333;

    @OriginalMember(owner = "client!tc", name = "j", descriptor = "I")
    public static int field3336;

    @OriginalMember(owner = "client!tc", name = "n", descriptor = "I")
    public static int field3340;

    @OriginalMember(owner = "client!tc", name = "w", descriptor = "I")
    public static int field3349;

    @OriginalMember(owner = "client!tc", name = "B", descriptor = "I")
    public static int field3354;

    @OriginalMember(owner = "client!tc", name = "q", descriptor = "J")
    public static long field3343;

    @OriginalMember(owner = "client!tc", name = "m", descriptor = "Lqc;")
    public static class114 field3339;

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "Ljf;")
    public static class68 field3335;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "[I")
    public static int[] field3328;

    @OriginalMember(owner = "client!tc", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field3354++;
    }

    @OriginalMember(owner = "client!tc", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class115.field2903 != null) {
            class18.field523 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class5.field187.length) {
                var3 = class5.field187[var2];
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
                var4 = class64.method536(true, arg0);
            }
            if (class39.field1068 >= 0 && var3 >= 0) {
                class107.field2654[class39.field1068] = var3;
                class39.field1068 = class39.field1068 + 1 & 0x7F;
                if (class39.field1068 == class137.field3416) {
                    class39.field1068 = -1;
                }
            }
            if (var3 >= 0 || var4 >= 0) {
                int var5 = class78.field1994 + 1 & 0x7F;
                if (class80.field2031 != var5) {
                    class131.field3287[class78.field1994] = var3;
                    class58.field1534[class78.field1994] = var4;
                    class78.field1994 = var5;
                }
            }
        }
        arg0.consume();
        field3336++;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(II)Lkd;")
    public static final class73 method1107(int arg0, int arg1) {
        field3333++;
        if (arg0 != 18299) {
            method1108(-60);
        }
        if (arg1 < 100000) {
            return class78.method676(arg1, -4);
        } else if (arg1 < 10000000) {
            return class32.method258(-81, new class73[] { class78.method676(arg1 / 1000, arg0 ^ -18296), class145.field3579 });
        } else {
            return class32.method258(-88, new class73[] { class78.method676(arg1 / 1000000, arg0 - 18404), class38.field1035 });
        }
    }

    @OriginalMember(owner = "client!tc", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        arg0.consume();
        field3340++;
    }

    @OriginalMember(owner = "client!tc", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class115.field2903 != null) {
            class39.field1068 = -1;
        }
        field3331++;
    }

    @OriginalMember(owner = "client!tc", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        field3349++;
        if (class115.field2903 != null) {
            class18.field523 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class5.field187.length) {
                var3 = class5.field187[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class39.field1068 >= 0 && var3 >= 0) {
                class107.field2654[class39.field1068] = ~var3;
                class39.field1068 = class39.field1068 + 1 & 0x7F;
                if (class39.field1068 == class137.field3416) {
                    class39.field1068 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V")
    public static void method1108(int arg0) {
        field3341 = null;
        field3352 = null;
        field3353 = null;
        field3339 = null;
        field3348 = null;
        field3345 = null;
        field3358 = null;
        field3346 = null;
        field3330 = null;
        field3355 = null;
        field3328 = null;
        field3356 = null;
        field3338 = null;
        if (arg0 <= 17) {
            return;
        }
        field3350 = null;
        field3329 = null;
        field3334 = null;
        field3347 = null;
        field3332 = null;
        field3335 = null;
        field3357 = null;
        field3337 = null;
        field3344 = null;
    }
}
