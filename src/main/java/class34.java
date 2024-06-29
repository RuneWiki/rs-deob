import java.awt.Image;
import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!r")
public class class34 {

    @OriginalMember(owner = "mapview!r", name = "z", descriptor = "[Z")
    public boolean[] field440 = new boolean[16];

    @OriginalMember(owner = "mapview!r", name = "m", descriptor = "[I")
    public int[] field427 = new int[257];

    @OriginalMember(owner = "mapview!r", name = "x", descriptor = "[[I")
    public int[][] field438 = new int[6][258];

    @OriginalMember(owner = "mapview!r", name = "A", descriptor = "I")
    public int field441 = 0;

    @OriginalMember(owner = "mapview!r", name = "r", descriptor = "[I")
    public int[] field432 = new int[16];

    @OriginalMember(owner = "mapview!r", name = "h", descriptor = "[[I")
    public int[][] field422 = new int[6][258];

    @OriginalMember(owner = "mapview!r", name = "t", descriptor = "[I")
    public int[] field434 = new int[6];

    @OriginalMember(owner = "mapview!r", name = "c", descriptor = "I")
    public int field417 = 0;

    @OriginalMember(owner = "mapview!r", name = "B", descriptor = "[Z")
    public boolean[] field442 = new boolean[256];

    @OriginalMember(owner = "mapview!r", name = "H", descriptor = "[B")
    public byte[] field448 = new byte[4096];

    @OriginalMember(owner = "mapview!r", name = "w", descriptor = "[B")
    public byte[] field437 = new byte[18002];

    @OriginalMember(owner = "mapview!r", name = "D", descriptor = "[I")
    public int[] field444 = new int[256];

    @OriginalMember(owner = "mapview!r", name = "M", descriptor = "[[I")
    public int[][] field453 = new int[6][258];

    @OriginalMember(owner = "mapview!r", name = "L", descriptor = "[B")
    public byte[] field452 = new byte[256];

    @OriginalMember(owner = "mapview!r", name = "p", descriptor = "[[B")
    public byte[][] field430 = new byte[6][258];

    @OriginalMember(owner = "mapview!r", name = "F", descriptor = "[B")
    public byte[] field446 = new byte[18002];

    @OriginalMember(owner = "mapview!r", name = "b", descriptor = "Lu;")
    public static class38 field416 = class28.method177("Spinning Wheel", (byte) -84);

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "I")
    public static int field415 = 0;

    @OriginalMember(owner = "mapview!r", name = "y", descriptor = "I")
    public static int field439 = -1;

    @OriginalMember(owner = "mapview!r", name = "n", descriptor = "Lu;")
    public static class38 field428 = class28.method177("Mining Shop", (byte) -84);

    @OriginalMember(owner = "mapview!r", name = "G", descriptor = "Lu;")
    private static class38 field447 = class28.method177("Loading", (byte) -84);

    @OriginalMember(owner = "mapview!r", name = "v", descriptor = "Lu;")
    public static class38 field436 = class28.method177("Candle Shop", (byte) -84);

    @OriginalMember(owner = "mapview!r", name = "j", descriptor = "I")
    public static int field424 = 0;

    @OriginalMember(owner = "mapview!r", name = "i", descriptor = "[I")
    public static int[] field423 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 0, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "mapview!r", name = "d", descriptor = "B")
    public byte field418;

    @OriginalMember(owner = "mapview!r", name = "e", descriptor = "I")
    public int field419;

    @OriginalMember(owner = "mapview!r", name = "f", descriptor = "I")
    public int field420;

    @OriginalMember(owner = "mapview!r", name = "k", descriptor = "I")
    public int field425;

    @OriginalMember(owner = "mapview!r", name = "l", descriptor = "I")
    public int field426;

    @OriginalMember(owner = "mapview!r", name = "o", descriptor = "I")
    public int field429;

    @OriginalMember(owner = "mapview!r", name = "s", descriptor = "I")
    public int field433;

    @OriginalMember(owner = "mapview!r", name = "u", descriptor = "I")
    public int field435;

    @OriginalMember(owner = "mapview!r", name = "C", descriptor = "I")
    public int field443;

    @OriginalMember(owner = "mapview!r", name = "E", descriptor = "I")
    public int field445;

    @OriginalMember(owner = "mapview!r", name = "I", descriptor = "I")
    public int field449;

    @OriginalMember(owner = "mapview!r", name = "J", descriptor = "I")
    public int field450;

    @OriginalMember(owner = "mapview!r", name = "O", descriptor = "I")
    public int field455;

    @OriginalMember(owner = "mapview!r", name = "P", descriptor = "I")
    public int field456;

    @OriginalMember(owner = "mapview!r", name = "g", descriptor = "Lha;")
    public static class16 field421;

    @OriginalMember(owner = "mapview!r", name = "N", descriptor = "Lu;")
    public static class38 field454;

    @OriginalMember(owner = "mapview!r", name = "q", descriptor = "Ljava/awt/Image;")
    public static Image field431;

    @OriginalMember(owner = "mapview!r", name = "K", descriptor = "[B")
    public byte[] field451;

    @OriginalMember(owner = "mapview!r", name = "Q", descriptor = "[B")
    public byte[] field457;

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(I)V", line = 25)
    public static void method201(int arg0) {
        field436 = null;
        field416 = null;
        field421 = null;
        field423 = null;
        field454 = null;
        field431 = null;
        field447 = null;
        field428 = null;
        if (arg0 != -1) {
            method202(-32);
        }
    }

    @OriginalMember(owner = "mapview!r", name = "b", descriptor = "(I)B", line = 59)
    public static final byte method202(int arg0) {
        if (arg0 != 1920) {
            field439 = 107;
        }
        return mapview.field290 == null ? 0 : mapview.field290[class22.field213];
    }

    @OriginalMember(owner = "mapview!r", name = "c", descriptor = "(I)[Lu;", line = 163)
    public static final class38[] method203(int arg0) {
        return arg0 <= 16 ? (class38[]) null : new class38[] { class30.field381, class24.field231, class23.field224, class22.field209, class7.field66, class3.field29, class36.field470, class30.field376, class38.field481, class16.field156, class19.field192, class20.field205, class23.field222, field447 };
    }

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;I)I", line = 191)
    public static final int method204(KeyEvent arg0, int arg1) {
        int var2 = arg0.getKeyChar();
        if (var2 == 8364) {
            return 128;
        } else {
            if (var2 <= 0 || var2 >= 256) {
                var2 = -1;
            }
            return arg1 == 28579 ? var2 : 86;
        }
    }
}
