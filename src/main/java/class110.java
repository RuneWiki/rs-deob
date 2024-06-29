import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class110 extends class17 {

    @OriginalMember(owner = "client!qd", name = "I", descriptor = "Lmb;")
    public static class84 field2660 = class79.method672(true, "und Ihr Passwort ein)3");

    @OriginalMember(owner = "client!qd", name = "x", descriptor = "Lmb;")
    public static class84 field2649 = class79.method672(true, "Sichtbare Karte vorbereitet)3");

    @OriginalMember(owner = "client!qd", name = "D", descriptor = "[I")
    public static int[] field2655 = new int[4000];

    @OriginalMember(owner = "client!qd", name = "L", descriptor = "Lmb;")
    public static class84 field2663 = class79.method672(true, "Der Server wird gerade aktualisiert)3");

    @OriginalMember(owner = "client!qd", name = "O", descriptor = "I")
    public static int field2666 = 0;

    @OriginalMember(owner = "client!qd", name = "A", descriptor = "Lmb;")
    public static class84 field2652 = class79.method672(true, " )2> @yel@");

    @OriginalMember(owner = "client!qd", name = "E", descriptor = "Lmb;")
    public static class84 field2656 = class79.method672(true, " )2> ");

    @OriginalMember(owner = "client!qd", name = "G", descriptor = "Lmb;")
    private static class84 field2658 = class79.method672(true, "K");

    @OriginalMember(owner = "client!qd", name = "Q", descriptor = "Lmb;")
    public static class84 field2668 = field2658;

    @OriginalMember(owner = "client!qd", name = "F", descriptor = "Lmb;")
    public static class84 field2657 = field2658;

    @OriginalMember(owner = "client!qd", name = "y", descriptor = "I")
    public static int field2650;

    @OriginalMember(owner = "client!qd", name = "B", descriptor = "I")
    public static int field2653;

    @OriginalMember(owner = "client!qd", name = "H", descriptor = "I")
    public static int field2659;

    @OriginalMember(owner = "client!qd", name = "K", descriptor = "I")
    public static int field2662;

    @OriginalMember(owner = "client!qd", name = "M", descriptor = "I")
    public static int field2664;

    @OriginalMember(owner = "client!qd", name = "N", descriptor = "I")
    public static int field2665;

    @OriginalMember(owner = "client!qd", name = "R", descriptor = "I")
    public static int field2669;

    @OriginalMember(owner = "client!qd", name = "z", descriptor = "Lqd;")
    public class110 field2651;

    @OriginalMember(owner = "client!qd", name = "J", descriptor = "Lqd;")
    public class110 field2661;

    @OriginalMember(owner = "client!qd", name = "P", descriptor = "Lsc;")
    public static class121 field2667;

    @OriginalMember(owner = "client!qd", name = "C", descriptor = "Lge;")
    public static class47 field2654;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(II)Z")
    public static final boolean method895(int arg0, int arg1) {
        field2669++;
        if (arg1 >= -9) {
            method897((byte) 5);
        }
        return (arg0 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(BIII)I")
    public static final int method896(byte arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 & 0x3;
        field2659++;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return 7 - arg3;
        } else if (arg0 >= -73) {
            return -108;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "(B)V")
    public static void method897(byte arg0) {
        field2660 = null;
        field2658 = null;
        field2668 = null;
        field2652 = null;
        field2663 = null;
        field2655 = null;
        field2657 = null;
        int var1 = 5 % ((arg0 + 62) / 61);
        field2656 = null;
        field2649 = null;
        field2654 = null;
        field2667 = null;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;B)I")
    public static final int method898(KeyEvent arg0, byte arg1) {
        field2665++;
        int var2 = arg0.getKeyChar();
        if (var2 <= 0 || var2 >= 256) {
            var2 = -1;
        }
        if (arg1 <= 50) {
            field2650 = -76;
        }
        return var2;
    }

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "(I)V")
    public final void method899(int arg0) {
        field2662++;
        if (this.field2661 == null) {
            return;
        }
        if (arg0 < 96) {
            field2657 = null;
        }
        this.field2661.field2651 = this.field2651;
        this.field2651.field2661 = this.field2661;
        this.field2651 = null;
        this.field2661 = null;
    }
}
