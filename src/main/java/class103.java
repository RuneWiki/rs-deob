import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class103 {

    @OriginalMember(owner = "client!of", name = "a", descriptor = "[[S")
    public static short[][] field2339 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!of", name = "e", descriptor = "I")
    public static int field2343 = 0;

    @OriginalMember(owner = "client!of", name = "h", descriptor = "I")
    public static int field2346 = 50;

    @OriginalMember(owner = "client!of", name = "l", descriptor = "[I")
    public static int[] field2350 = new int[field2346];

    @OriginalMember(owner = "client!of", name = "g", descriptor = "[I")
    public static int[] field2345 = new int[field2346];

    @OriginalMember(owner = "client!of", name = "b", descriptor = "[I")
    public static int[] field2340 = new int[field2346];

    @OriginalMember(owner = "client!of", name = "f", descriptor = "[I")
    public static int[] field2344 = new int[field2346];

    @OriginalMember(owner = "client!of", name = "c", descriptor = "[I")
    public static int[] field2341 = new int[field2346];

    @OriginalMember(owner = "client!of", name = "m", descriptor = "[I")
    public static int[] field2351 = new int[field2346];

    @OriginalMember(owner = "client!of", name = "d", descriptor = "[Lsc;")
    public static class128[] field2342 = new class128[field2346];

    @OriginalMember(owner = "client!of", name = "j", descriptor = "[Lsc;")
    public static class128[] field2348 = new class128[100];

    @OriginalMember(owner = "client!of", name = "n", descriptor = "[I")
    public static int[] field2352 = new int[field2346];

    @OriginalMember(owner = "client!of", name = "i", descriptor = "Lrb;")
    public static class120 field2347 = new class120(64);

    @OriginalMember(owner = "client!of", name = "o", descriptor = "[[[I")
    public static int[][][] field2353 = new int[4][13][13];

    @OriginalMember(owner = "client!of", name = "k", descriptor = "I")
    public static int field2349;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Lsf;ILsf;Lsf;Lh;)Z")
    public static final boolean method773(class131 arg0, int arg1, class131 arg2, class131 arg3, class49 arg4) {
        class5.field59 = arg2;
        class43.field815 = arg3;
        class37.field717 = arg0;
        if (arg1 != 4797) {
            method774(-120);
        }
        class46.field861 = arg4;
        field2349++;
        return true;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V")
    public static void method774(int arg0) {
        field2342 = null;
        field2340 = null;
        field2353 = null;
        field2348 = null;
        field2341 = null;
        field2350 = null;
        field2351 = null;
        field2347 = null;
        field2344 = null;
        field2339 = null;
        field2345 = null;
        field2352 = null;
        if (arg0 <= 62) {
            method774(-11);
        }
    }
}
