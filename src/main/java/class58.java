import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class58 {

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "[B")
    public static byte[] field819 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "I")
    public static volatile int field818 = -1;

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "Lph;")
    public static class229 field822 = class266.method1858("lila:", 0);

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "I")
    public static int field817 = -1;

    @OriginalMember(owner = "client!ud", name = "n", descriptor = "[[S")
    public static short[][] field827 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!ud", name = "j", descriptor = "Lph;")
    public static class229 field823 = class266.method1858("blanc:", 0);

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "I")
    public static int field814;

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "I")
    public static int field815;

    @OriginalMember(owner = "client!ud", name = "k", descriptor = "I")
    public static int field824;

    @OriginalMember(owner = "client!ud", name = "l", descriptor = "I")
    public static int field825;

    @OriginalMember(owner = "client!ud", name = "m", descriptor = "Lrk;")
    public class216 field826;

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "Lcl;")
    public class32 field821;

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "[I")
    public static int[] field816;

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "[Lcc;")
    public static class220[] field820;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lhb;I)Lvj;", line = 11)
    public static final class198 method387(class164 arg0, int arg1) {
        if (arg1 != 3650) {
            field823 = (class229) null;
        }
        field824++;
        return new class198(arg0.method1179((byte) -74), arg0.method1179((byte) -74), arg0.method1179((byte) -74), arg0.method1179((byte) -74), arg0.method1176(1048115912), arg0.method1178(8));
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIBII)V", line = 40)
    public static final void method388(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field814++;
        int var5 = 0;
        int var6 = arg0;
        class193.method1354((byte) -37, arg0 + arg3, -arg0 + arg3, arg1, class202.field3337[arg4]);
        int var7 = -arg0;
        if (arg2 >= -12) {
            field827 = (short[][]) ((short[][]) null);
        }
        int var8 = -1;
        while (var6 > var5) {
            var8 += 2;
            var5++;
            var7 += var8;
            if (var7 >= 0) {
                var6--;
                var7 -= var6 << 1;
                int[] var9 = class202.field3337[arg4 + var6];
                int[] var10 = class202.field3337[arg4 - var6];
                int var11 = arg3 - var5;
                int var12 = arg3 + var5;
                class193.method1354((byte) -37, var12, var11, arg1, var9);
                class193.method1354((byte) -37, var12, var11, arg1, var10);
            }
            int var13 = arg3 + var6;
            int[] var14 = class202.field3337[arg4 + var5];
            int var15 = arg3 - var6;
            int[] var16 = class202.field3337[arg4 - var5];
            class193.method1354((byte) -37, var13, var15, arg1, var14);
            class193.method1354((byte) -37, var13, var15, arg1, var16);
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)V", line = 94)
    public static void method389(byte arg0) {
        field820 = null;
        field819 = null;
        if (arg0 != 106) {
            field817 = -95;
        }
        field827 = (short[][]) null;
        field823 = null;
        field822 = null;
        field816 = null;
    }
}
