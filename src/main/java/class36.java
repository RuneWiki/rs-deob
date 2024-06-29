import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!v")
public class class36 {

    @OriginalMember(owner = "mapview!v", name = "h", descriptor = "[I")
    public int[] field432 = new int[257];

    @OriginalMember(owner = "mapview!v", name = "d", descriptor = "[I")
    public int[] field428 = new int[16];

    @OriginalMember(owner = "mapview!v", name = "w", descriptor = "[[I")
    public int[][] field447 = new int[6][258];

    @OriginalMember(owner = "mapview!v", name = "g", descriptor = "[B")
    public byte[] field431 = new byte[18002];

    @OriginalMember(owner = "mapview!v", name = "k", descriptor = "[I")
    public int[] field435 = new int[256];

    @OriginalMember(owner = "mapview!v", name = "B", descriptor = "I")
    public int field452 = 0;

    @OriginalMember(owner = "mapview!v", name = "b", descriptor = "[I")
    public int[] field426 = new int[6];

    @OriginalMember(owner = "mapview!v", name = "f", descriptor = "[B")
    public byte[] field430 = new byte[256];

    @OriginalMember(owner = "mapview!v", name = "D", descriptor = "[B")
    public byte[] field454 = new byte[18002];

    @OriginalMember(owner = "mapview!v", name = "r", descriptor = "[[I")
    public int[][] field442 = new int[6][258];

    @OriginalMember(owner = "mapview!v", name = "E", descriptor = "[Z")
    public boolean[] field455 = new boolean[16];

    @OriginalMember(owner = "mapview!v", name = "q", descriptor = "[[B")
    public byte[][] field441 = new byte[6][258];

    @OriginalMember(owner = "mapview!v", name = "A", descriptor = "I")
    public int field451 = 0;

    @OriginalMember(owner = "mapview!v", name = "G", descriptor = "[B")
    public byte[] field457 = new byte[4096];

    @OriginalMember(owner = "mapview!v", name = "y", descriptor = "[Z")
    public boolean[] field449 = new boolean[256];

    @OriginalMember(owner = "mapview!v", name = "C", descriptor = "[[I")
    public int[][] field453 = new int[6][258];

    @OriginalMember(owner = "mapview!v", name = "x", descriptor = "Ln;")
    public static class26 field448 = class9.method82(255, "Find");

    @OriginalMember(owner = "mapview!v", name = "J", descriptor = "I")
    public static int field460 = 0;

    @OriginalMember(owner = "mapview!v", name = "I", descriptor = "B")
    public byte field459;

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "I")
    public int field425;

    @OriginalMember(owner = "mapview!v", name = "c", descriptor = "I")
    public int field427;

    @OriginalMember(owner = "mapview!v", name = "e", descriptor = "I")
    public int field429;

    @OriginalMember(owner = "mapview!v", name = "i", descriptor = "I")
    public int field433;

    @OriginalMember(owner = "mapview!v", name = "j", descriptor = "I")
    public static int field434;

    @OriginalMember(owner = "mapview!v", name = "m", descriptor = "I")
    public int field437;

    @OriginalMember(owner = "mapview!v", name = "o", descriptor = "I")
    public int field439;

    @OriginalMember(owner = "mapview!v", name = "p", descriptor = "I")
    public int field440;

    @OriginalMember(owner = "mapview!v", name = "t", descriptor = "I")
    public int field444;

    @OriginalMember(owner = "mapview!v", name = "u", descriptor = "I")
    public int field445;

    @OriginalMember(owner = "mapview!v", name = "v", descriptor = "I")
    public int field446;

    @OriginalMember(owner = "mapview!v", name = "z", descriptor = "I")
    public int field450;

    @OriginalMember(owner = "mapview!v", name = "F", descriptor = "I")
    public int field456;

    @OriginalMember(owner = "mapview!v", name = "H", descriptor = "I")
    public int field458;

    @OriginalMember(owner = "mapview!v", name = "s", descriptor = "Le;")
    public static class9 field443;

    @OriginalMember(owner = "mapview!v", name = "l", descriptor = "[B")
    public byte[] field436;

    @OriginalMember(owner = "mapview!v", name = "n", descriptor = "[B")
    public byte[] field438;

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(IBI)V", line = 60)
    public static final void method241(int arg0, byte arg1, int arg2) {
        class5.field135 = arg0 & 0x3F;
        class8.field174 = arg0 >> 6;
        class4.field122 = arg2 & 0x3F;
        class11.field203 = arg2 >> 6;
        class18.field262 = (class4.field122 << 6) + class5.field135;
        if (arg1 == -115) {
            class35.method239((byte) 103);
        }
    }

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(B)V", line = 101)
    public static void method242(byte arg0) {
        if (arg0 > -33) {
            field460 = 77;
        }
        field443 = null;
        field448 = null;
    }
}
