import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class183 extends class145 {

    @OriginalMember(owner = "client!cj", name = "M", descriptor = "[[S")
    public static short[][] field2662 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!cj", name = "K", descriptor = "I")
    public static int field2661 = 0;

    @OriginalMember(owner = "client!cj", name = "H", descriptor = "[I")
    public static int[] field2658 = new int[32];

    @OriginalMember(owner = "client!cj", name = "F", descriptor = "I")
    public static int field2657;

    @OriginalMember(owner = "client!cj", name = "I", descriptor = "I")
    public static int field2659;

    @OriginalMember(owner = "client!cj", name = "O", descriptor = "I")
    public static int field2664;

    @OriginalMember(owner = "client!cj", name = "P", descriptor = "I")
    public static int field2665;

    @OriginalMember(owner = "client!cj", name = "Q", descriptor = "I")
    public static int field2666;

    @OriginalMember(owner = "client!cj", name = "R", descriptor = "I")
    public static int field2667;

    @OriginalMember(owner = "client!cj", name = "S", descriptor = "I")
    public static int field2668;

    @OriginalMember(owner = "client!cj", name = "U", descriptor = "I")
    public static int field2670;

    @OriginalMember(owner = "client!cj", name = "T", descriptor = "Lrk;")
    public static class427 field2669;

    @OriginalMember(owner = "client!cj", name = "N", descriptor = "[Z")
    public static boolean[] field2663;

    @OriginalMember(owner = "client!cj", name = "J", descriptor = "[[I")
    public static int[][] field2660;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(BJLpe;)V", line = 5)
    public static final void method1339(byte arg0, long arg1, class391 arg2) {
        int var4 = 61 / ((14 - arg0) / 63);
        class209.field2900 = 0;
        ++field2664;
        class418.field5865 = class303.field4099;
        class303.field4099 = 0;
        long var5 = class108.method902((byte) -93);
        for (class48 var7 = (class48) class428.field6084.method891(20838); var7 != null; var7 = (class48) class428.field6084.method898(64)) {
            if (var7.method484(arg2, arg1)) {
                ++class209.field2900;
            }
        }
        if (class32.field528 && ~(arg1 % 100L) == -1L) {
            System.out.println("Particle system count: " + class428.field6084.method900((byte) 127) + ", running: " + class209.field2900 + ". Particles: " + class303.field4099 + ". Time taken: " + (class108.method902((byte) -93) - var5) + "ms");
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IC)Z", line = 37)
    public static final boolean method1340(int arg0, char arg1) {
        ++field2670;
        if (~arg1 <= -33 && arg1 <= '~') {
            return true;
        } else if (arg1 >= 160 && arg1 <= 255) {
            return true;
        } else {
            if (arg0 != -30253) {
                field2657 = 14;
            }
            return ~arg1 == -8365 || arg1 == 338 || ~arg1 == -8213 || arg1 == 339 || ~arg1 == -377;
        }
    }

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "(I)V", line = 61)
    public static void method1341(int arg0) {
        field2662 = null;
        field2658 = null;
        field2669 = null;
        field2663 = null;
        field2660 = null;
        if (arg0 != 19185) {
            field2658 = null;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(II)[I", line = 75)
    public final int[] method3(int arg0, int arg1) {
        ++field2666;
        int[] var3 = super.field2218.method1614(45, arg0);
        int var4 = 28 / ((16 - arg1) / 49);
        if (super.field2218.field3396) {
            int[][] var5 = this.method1121(arg0, 0, 2);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            for (int var9 = 0; ~class156.field2364 < ~var9; ++var9) {
                var3[var9] = (var6[var9] + var8[var9] - -var7[var9]) / 3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "()V", line = 116)
    public class183() {
        super(1, true);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IB)Ljava/lang/String;", line = 121)
    public static final String method1342(int arg0, byte arg1) {
        if (arg1 > -117) {
            field2669 = null;
        }
        ++field2668;
        String var2 = Integer.toString(arg0);
        for (int var3 = var2.length() - 3; ~var3 < -1; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, -8 + var2.length()) + class278.field3745 + " (" + var2 + ")</col>";
        } else {
            return ~var2.length() < -7 ? " <col=ffffff>" + var2.substring(0, var2.length() + -4) + class340.field4651 + " (" + var2 + ")</col>" : " <col=ffff00>" + var2 + "</col>";
        }
    }
}
