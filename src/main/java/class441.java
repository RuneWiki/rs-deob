import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public class class441 {

    @OriginalMember(owner = "client!es", name = "b", descriptor = "I")
    public int field6228;

    @OriginalMember(owner = "client!es", name = "a", descriptor = "[I")
    public static int[] field6227 = new int[25];

    @OriginalMember(owner = "client!es", name = "f", descriptor = "Lct;")
    public static class285 field6232 = new class285(52, 4);

    @OriginalMember(owner = "client!es", name = "i", descriptor = "[[S")
    public static short[][] field6235 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!es", name = "j", descriptor = "Lsh;")
    public static class472 field6236 = new class472(38, 8);

    @OriginalMember(owner = "client!es", name = "k", descriptor = "Z")
    public static boolean field6237 = false;

    @OriginalMember(owner = "client!es", name = "c", descriptor = "I")
    public static int field6229;

    @OriginalMember(owner = "client!es", name = "d", descriptor = "I")
    public static int field6230;

    @OriginalMember(owner = "client!es", name = "g", descriptor = "I")
    public static int field6233;

    @OriginalMember(owner = "client!es", name = "h", descriptor = "I")
    public static int field6234;

    @OriginalMember(owner = "client!es", name = "e", descriptor = "Lfc;")
    public static class239 field6231;

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(BII)I")
    public static final int method2564(byte arg0, int arg1, int arg2) {
        field6230++;
        if (arg0 != 117) {
            field6233 = 79;
        }
        if (arg1 == -2) {
            return 12345678;
        } else if (arg1 == -1) {
            if (arg2 < 2) {
                arg2 = 2;
            } else if (arg2 > 126) {
                arg2 = 126;
            }
            return arg2;
        } else {
            int var3 = (arg1 & 0x7F) * arg2 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg1 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!es", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field6229++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(I)V")
    public static void method2565(int arg0) {
        field6231 = null;
        field6236 = null;
        if (arg0 != -10093) {
            field6233 = -43;
        }
        field6227 = null;
        field6232 = null;
        field6235 = null;
    }

    @OriginalMember(owner = "client!es", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class441(String arg0, int arg1) {
        this.field6228 = arg1;
    }
}
