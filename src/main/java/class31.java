import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!pa")
public class class31 {

    @OriginalMember(owner = "mapview!pa", name = "n", descriptor = "[B")
    public byte[] field418 = new byte[256];

    @OriginalMember(owner = "mapview!pa", name = "m", descriptor = "[Z")
    public boolean[] field417 = new boolean[256];

    @OriginalMember(owner = "mapview!pa", name = "d", descriptor = "[B")
    public byte[] field408 = new byte[18002];

    @OriginalMember(owner = "mapview!pa", name = "p", descriptor = "[I")
    public int[] field420 = new int[256];

    @OriginalMember(owner = "mapview!pa", name = "l", descriptor = "[[I")
    public int[][] field416 = new int[6][258];

    @OriginalMember(owner = "mapview!pa", name = "I", descriptor = "I")
    public int field439 = 0;

    @OriginalMember(owner = "mapview!pa", name = "F", descriptor = "[B")
    public byte[] field436 = new byte[18002];

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "[Z")
    public boolean[] field405 = new boolean[16];

    @OriginalMember(owner = "mapview!pa", name = "H", descriptor = "I")
    public int field438 = 0;

    @OriginalMember(owner = "mapview!pa", name = "A", descriptor = "[[B")
    public byte[][] field431 = new byte[6][258];

    @OriginalMember(owner = "mapview!pa", name = "q", descriptor = "[I")
    public int[] field421 = new int[257];

    @OriginalMember(owner = "mapview!pa", name = "K", descriptor = "[[I")
    public int[][] field441 = new int[6][258];

    @OriginalMember(owner = "mapview!pa", name = "D", descriptor = "[B")
    public byte[] field434 = new byte[4096];

    @OriginalMember(owner = "mapview!pa", name = "e", descriptor = "[I")
    public int[] field409 = new int[16];

    @OriginalMember(owner = "mapview!pa", name = "o", descriptor = "[[I")
    public int[][] field419 = new int[6][258];

    @OriginalMember(owner = "mapview!pa", name = "L", descriptor = "[I")
    public int[] field442 = new int[6];

    @OriginalMember(owner = "mapview!pa", name = "h", descriptor = "Ls;")
    public static class34 field412 = class9.method35("sprites", 220);

    @OriginalMember(owner = "mapview!pa", name = "r", descriptor = "I")
    public static int field422 = 0;

    @OriginalMember(owner = "mapview!pa", name = "w", descriptor = "Ls;")
    public static class34 field427 = class9.method35("mapscene", 220);

    @OriginalMember(owner = "mapview!pa", name = "J", descriptor = "Ls;")
    public static class34 field440 = class9.method35("Chainmail Shop", 220);

    @OriginalMember(owner = "mapview!pa", name = "j", descriptor = "Lha;")
    public static class16 field414 = new class16();

    @OriginalMember(owner = "mapview!pa", name = "c", descriptor = "B")
    public byte field407;

    @OriginalMember(owner = "mapview!pa", name = "b", descriptor = "I")
    public int field406;

    @OriginalMember(owner = "mapview!pa", name = "f", descriptor = "I")
    public int field410;

    @OriginalMember(owner = "mapview!pa", name = "g", descriptor = "I")
    public int field411;

    @OriginalMember(owner = "mapview!pa", name = "i", descriptor = "I")
    public int field413;

    @OriginalMember(owner = "mapview!pa", name = "k", descriptor = "I")
    public int field415;

    @OriginalMember(owner = "mapview!pa", name = "s", descriptor = "I")
    public int field423;

    @OriginalMember(owner = "mapview!pa", name = "u", descriptor = "I")
    public int field425;

    @OriginalMember(owner = "mapview!pa", name = "v", descriptor = "I")
    public int field426;

    @OriginalMember(owner = "mapview!pa", name = "y", descriptor = "I")
    public int field429;

    @OriginalMember(owner = "mapview!pa", name = "z", descriptor = "I")
    public int field430;

    @OriginalMember(owner = "mapview!pa", name = "B", descriptor = "I")
    public int field432;

    @OriginalMember(owner = "mapview!pa", name = "C", descriptor = "I")
    public static int field433;

    @OriginalMember(owner = "mapview!pa", name = "E", descriptor = "I")
    public int field435;

    @OriginalMember(owner = "mapview!pa", name = "G", descriptor = "I")
    public int field437;

    @OriginalMember(owner = "mapview!pa", name = "O", descriptor = "I")
    public static int field445;

    @OriginalMember(owner = "mapview!pa", name = "t", descriptor = "[B")
    public byte[] field424;

    @OriginalMember(owner = "mapview!pa", name = "M", descriptor = "[B")
    public static byte[] field443;

    @OriginalMember(owner = "mapview!pa", name = "N", descriptor = "[B")
    public byte[] field444;

    @OriginalMember(owner = "mapview!pa", name = "x", descriptor = "[I")
    public static int[] field428;

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "(II)I", line = 7)
    public static int method206(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "(I)B", line = 27)
    public static final byte method207(int arg0) {
        if (arg0 == 258) {
            return class38.field515 == null ? 0 : class38.field515[field433];
        } else {
            return -115;
        }
    }

    @OriginalMember(owner = "mapview!pa", name = "b", descriptor = "(I)V", line = 48)
    public static void method208(int arg0) {
        field440 = null;
        field427 = null;
        field428 = null;
        field412 = null;
        if (arg0 < 35) {
            field428 = null;
        }
        field414 = null;
        field443 = null;
    }

    @OriginalMember(owner = "mapview!pa", name = "b", descriptor = "(II)I", line = 74)
    public static int method209(int arg0, int arg1) {
        return arg0 ^ arg1;
    }
}
