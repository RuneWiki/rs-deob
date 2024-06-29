import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class35 {

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "Lsc;")
    public static class181 field542 = class149.method967(255, "rot:");

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "[[S")
    public static short[][] field545 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "Z")
    public static volatile boolean field543 = true;

    @OriginalMember(owner = "client!ma", name = "k", descriptor = "Lsc;")
    public static class181 field552 = class149.method967(255, "blinken3:");

    @OriginalMember(owner = "client!ma", name = "m", descriptor = "[I")
    public static int[] field554 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "I")
    public static int field544;

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "I")
    public static int field546;

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "I")
    public static int field549;

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "I")
    public static int field550;

    @OriginalMember(owner = "client!ma", name = "l", descriptor = "I")
    public static int field553;

    @OriginalMember(owner = "client!ma", name = "n", descriptor = "I")
    public int field555;

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "Lje;")
    public class227 field547;

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "[I")
    public int[] field551;

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "[[[B")
    public static byte[][][] field548;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IZ)I")
    public static final int method262(int arg0, boolean arg1) {
        int var2 = arg0 >> 6 & 0x3;
        field546++;
        int var3 = arg0 & 0x3F;
        if (var3 == 18) {
            if (var2 == 0) {
                return 1;
            }
            if (var2 == 1) {
                return 2;
            }
            if (var2 == 2) {
                return 4;
            }
            if (var2 == 3) {
                return 8;
            }
        } else if (var3 == 19 || var3 == 21) {
            if (var2 == 0) {
                return 16;
            }
            if (var2 == 1) {
                return 32;
            }
            if (var2 == 2) {
                return 64;
            }
            if (var2 == 3) {
                return 128;
            }
        }
        if (!arg1) {
            field545 = null;
        }
        return 0;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V")
    public static void method263(int arg0) {
        field552 = null;
        field548 = null;
        field542 = null;
        field554 = null;
        if (arg0 <= 25) {
            field552 = null;
        }
        field545 = null;
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(I)V")
    public static final void method264(int arg0) {
        class256.method1747();
        if (arg0 != -5) {
            return;
        }
        for (int var1 = 0; var1 < 4; var1++) {
            class109.field1784[var1].method71(64);
        }
        field544++;
        System.gc();
    }
}
