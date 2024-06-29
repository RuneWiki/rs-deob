import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!w")
public class class34 {

    @OriginalMember(owner = "mapview!w", name = "e", descriptor = "[B")
    public byte[] field358 = new byte[18002];

    @OriginalMember(owner = "mapview!w", name = "l", descriptor = "[[B")
    public byte[][] field365 = new byte[6][258];

    @OriginalMember(owner = "mapview!w", name = "u", descriptor = "[I")
    public int[] field374 = new int[257];

    @OriginalMember(owner = "mapview!w", name = "d", descriptor = "I")
    public int field357 = 0;

    @OriginalMember(owner = "mapview!w", name = "f", descriptor = "[I")
    public int[] field359 = new int[256];

    @OriginalMember(owner = "mapview!w", name = "x", descriptor = "[B")
    public byte[] field377 = new byte[256];

    @OriginalMember(owner = "mapview!w", name = "E", descriptor = "[[I")
    public int[][] field383 = new int[6][258];

    @OriginalMember(owner = "mapview!w", name = "t", descriptor = "[[I")
    public int[][] field373 = new int[6][258];

    @OriginalMember(owner = "mapview!w", name = "J", descriptor = "[[I")
    public int[][] field388 = new int[6][258];

    @OriginalMember(owner = "mapview!w", name = "L", descriptor = "[B")
    public byte[] field390 = new byte[4096];

    @OriginalMember(owner = "mapview!w", name = "r", descriptor = "I")
    public int field371 = 0;

    @OriginalMember(owner = "mapview!w", name = "C", descriptor = "[B")
    public byte[] field381 = new byte[18002];

    @OriginalMember(owner = "mapview!w", name = "P", descriptor = "[I")
    public int[] field394 = new int[16];

    @OriginalMember(owner = "mapview!w", name = "N", descriptor = "[I")
    public int[] field392 = new int[6];

    @OriginalMember(owner = "mapview!w", name = "g", descriptor = "[Z")
    public boolean[] field360 = new boolean[256];

    @OriginalMember(owner = "mapview!w", name = "Q", descriptor = "[Z")
    public boolean[] field395 = new boolean[16];

    @OriginalMember(owner = "mapview!w", name = "i", descriptor = "Lt;")
    public static class31 field362 = class14.method84(116, "Brewery");

    @OriginalMember(owner = "mapview!w", name = "p", descriptor = "Lt;")
    public static class31 field369 = class14.method84(113, "Herbalist");

    @OriginalMember(owner = "mapview!w", name = "k", descriptor = "I")
    public static int field364 = 0;

    @OriginalMember(owner = "mapview!w", name = "D", descriptor = "Lt;")
    public static class31 field382 = class14.method84(108, "loc)3dat");

    @OriginalMember(owner = "mapview!w", name = "K", descriptor = "I")
    public static volatile int field389 = 0;

    @OriginalMember(owner = "mapview!w", name = "o", descriptor = "B")
    public byte field368;

    @OriginalMember(owner = "mapview!w", name = "b", descriptor = "I")
    public static int field355;

    @OriginalMember(owner = "mapview!w", name = "c", descriptor = "I")
    public int field356;

    @OriginalMember(owner = "mapview!w", name = "h", descriptor = "I")
    public int field361;

    @OriginalMember(owner = "mapview!w", name = "j", descriptor = "I")
    public static int field363;

    @OriginalMember(owner = "mapview!w", name = "m", descriptor = "I")
    public int field366;

    @OriginalMember(owner = "mapview!w", name = "n", descriptor = "I")
    public static int field367;

    @OriginalMember(owner = "mapview!w", name = "q", descriptor = "I")
    public int field370;

    @OriginalMember(owner = "mapview!w", name = "s", descriptor = "I")
    public int field372;

    @OriginalMember(owner = "mapview!w", name = "v", descriptor = "I")
    public int field375;

    @OriginalMember(owner = "mapview!w", name = "w", descriptor = "I")
    public int field376;

    @OriginalMember(owner = "mapview!w", name = "y", descriptor = "I")
    public int field378;

    @OriginalMember(owner = "mapview!w", name = "A", descriptor = "I")
    public int field380;

    @OriginalMember(owner = "mapview!w", name = "G", descriptor = "I")
    public int field385;

    @OriginalMember(owner = "mapview!w", name = "H", descriptor = "I")
    public int field386;

    @OriginalMember(owner = "mapview!w", name = "I", descriptor = "I")
    public int field387;

    @OriginalMember(owner = "mapview!w", name = "M", descriptor = "I")
    public int field391;

    @OriginalMember(owner = "mapview!w", name = "O", descriptor = "I")
    public static int field393;

    @OriginalMember(owner = "mapview!w", name = "F", descriptor = "Lma;")
    public static class24 field384;

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "[B")
    public byte[] field354;

    @OriginalMember(owner = "mapview!w", name = "z", descriptor = "[B")
    public byte[] field379;

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(Z)V", line = 9)
    public static void method210(boolean arg0) {
        field382 = null;
        field384 = null;
        if (arg0) {
            field367 = -105;
        }
        field369 = null;
        field362 = null;
    }

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(IIB[Lt;)V", line = 58)
    public static final void method211(int arg0, int arg1, byte arg2, class31[] arg3) {
        if (arg2 > -121) {
            field369 = null;
        }
        if (arg1 == 1) {
            arg3[0].method189(-3878);
        } else {
            class18.method101(arg1, arg3, (byte) -45, arg0).method189(-3878);
        }
    }
}
