import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class183 {

    @OriginalMember(owner = "client!td", name = "a", descriptor = "[Ldd;")
    public static class35[] field3756 = new class35[500];

    @OriginalMember(owner = "client!td", name = "d", descriptor = "Ldd;")
    public static class35 field3759 = class180.method1196((byte) 127, "Bitte versuchen Sie es in ");

    @OriginalMember(owner = "client!td", name = "i", descriptor = "Ldd;")
    public static class35 field3764 = class180.method1196((byte) -6, "m-Ochte mit Ihnen handeln)3");

    @OriginalMember(owner = "client!td", name = "e", descriptor = "Ldd;")
    private static class35 field3760 = class180.method1196((byte) 127, "slide:");

    @OriginalMember(owner = "client!td", name = "h", descriptor = "Ldd;")
    private static class35 field3763 = class180.method1196((byte) 126, "Loading title screen )2 ");

    @OriginalMember(owner = "client!td", name = "o", descriptor = "I")
    public static int field3770 = 0;

    @OriginalMember(owner = "client!td", name = "n", descriptor = "Ldd;")
    public static class35 field3769 = class180.method1196((byte) 126, " )2> <col=00ffff>");

    @OriginalMember(owner = "client!td", name = "b", descriptor = "Ldd;")
    public static class35 field3757 = field3760;

    @OriginalMember(owner = "client!td", name = "q", descriptor = "Ldd;")
    private static class35 field3772 = class180.method1196((byte) 126, "Please wait 5 minutes before trying again)3");

    @OriginalMember(owner = "client!td", name = "p", descriptor = "Ldd;")
    public static class35 field3771 = field3760;

    @OriginalMember(owner = "client!td", name = "c", descriptor = "Ldd;")
    public static class35 field3758 = field3763;

    @OriginalMember(owner = "client!td", name = "m", descriptor = "[[S")
    public static short[][] field3768 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!td", name = "j", descriptor = "Ldd;")
    public static class35 field3765 = field3772;

    @OriginalMember(owner = "client!td", name = "f", descriptor = "I")
    public static int field3761;

    @OriginalMember(owner = "client!td", name = "g", descriptor = "I")
    public static int field3762;

    @OriginalMember(owner = "client!td", name = "k", descriptor = "I")
    public static int field3766;

    @OriginalMember(owner = "client!td", name = "l", descriptor = "I")
    public static int field3767;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IILjava/util/Random;)I")
    public static final int method1218(int arg0, int arg1, Random arg2) {
        field3761++;
        if (arg1 <= 0) {
            throw new IllegalArgumentException();
        } else if (class46.method420((byte) -44, arg1)) {
            return (int) ((long) arg1 * ((long) arg2.nextInt() & 0xFFFFFFFFL) >> 32);
        } else {
            int var3 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
            if (arg0 != 1804454752) {
                field3768 = null;
            }
            int var4;
            do {
                var4 = arg2.nextInt();
            } while (var3 <= var4);
            return class207.method1368(arg0 - 1804454880, arg1, var4);
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ILag;Z)[Lbg;")
    public static final class18[] method1219(int arg0, class8 arg1, boolean arg2) {
        field3766++;
        if (arg2) {
            method1220((byte) 63);
        }
        return class100.method751((byte) 109, arg1, arg0) ? class68.method555((byte) 104) : null;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(B)V")
    public static void method1220(byte arg0) {
        field3769 = null;
        field3763 = null;
        field3759 = null;
        field3758 = null;
        int var1 = -89 / ((arg0 + 49) / 41);
        field3756 = null;
        field3764 = null;
        field3771 = null;
        field3768 = null;
        field3760 = null;
        field3765 = null;
        field3757 = null;
        field3772 = null;
    }
}
