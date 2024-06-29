import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class151 extends class209 {

    @OriginalMember(owner = "client!id", name = "o", descriptor = "I")
    private int field2451;

    @OriginalMember(owner = "client!id", name = "u", descriptor = "I")
    private int field2457;

    @OriginalMember(owner = "client!id", name = "t", descriptor = "I")
    private int field2456;

    @OriginalMember(owner = "client!id", name = "v", descriptor = "I")
    private int field2458;

    @OriginalMember(owner = "client!id", name = "r", descriptor = "Z")
    public static boolean field2454 = false;

    @OriginalMember(owner = "client!id", name = "s", descriptor = "J")
    public static volatile long field2455 = 0L;

    @OriginalMember(owner = "client!id", name = "q", descriptor = "I")
    public static int field2453 = 0;

    @OriginalMember(owner = "client!id", name = "l", descriptor = "F")
    public static float field2448 = 0.0F;

    @OriginalMember(owner = "client!id", name = "w", descriptor = "[[S")
    public static short[][] field2459 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!id", name = "k", descriptor = "I")
    public static int field2447;

    @OriginalMember(owner = "client!id", name = "m", descriptor = "I")
    public static int field2449;

    @OriginalMember(owner = "client!id", name = "n", descriptor = "I")
    public static int field2450;

    @OriginalMember(owner = "client!id", name = "p", descriptor = "I")
    public static int field2452;

    @OriginalMember(owner = "client!id", name = "c", descriptor = "(III)V")
    public final void method319(int arg0, int arg1, int arg2) {
        ++field2452;
        if (arg1 != -1) {
            field2453 = 104;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lv;Z)Llk;")
    public static final class84 method1067(class152 arg0, boolean arg1) {
        if (arg1) {
            field2453 = 29;
        }
        ++field2449;
        arg0.method1111(255);
        int var2 = arg0.method1111(255);
        class84 var3 = class230.method1640(var2, 9054);
        var3.field1229 = arg0.method1111(255);
        int var4 = arg0.method1111(255);
        for (int var5 = 0; var5 < var4; ++var5) {
            int var6 = arg0.method1111(255);
            var3.method31(arg0, (byte) 97, var6);
        }
        var3.method481(arg1);
        return var3;
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "(IIIIIII)V")
    public class151(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field2451 = arg1;
        this.field2457 = arg2;
        this.field2456 = arg0;
        this.field2458 = arg3;
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(III)V")
    public final void method318(int arg0, int arg1, int arg2) {
        int var4 = this.field2456 * arg1 >> 12;
        ++field2450;
        int var5 = this.field2457 * arg1 >> 12;
        int var6 = -59 % ((-72 - arg0) / 54);
        int var7 = this.field2451 * arg2 >> 12;
        int var8 = this.field2458 * arg2 >> 12;
        class287.method1948(super.field3353, super.field3349, (byte) -87, var5, var8, var4, super.field3348, var7);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(B)V")
    public static void method1068(byte arg0) {
        field2459 = null;
        int var1 = 61 % ((35 - arg0) / 44);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIB)V")
    public final void method322(int arg0, int arg1, byte arg2) {
        int var4 = this.field2456 * arg0 >> 12;
        ++field2447;
        int var5 = -105 / ((arg2 - -55) / 60);
        int var6 = this.field2451 * arg1 >> 12;
        int var7 = this.field2457 * arg0 >> 12;
        int var8 = this.field2458 * arg1 >> 12;
        class153.method1138(var8, -30001, var4, var7, var6, super.field3348);
    }
}
