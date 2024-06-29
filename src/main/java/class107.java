import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class107 extends class110 {

    @OriginalMember(owner = "client!lh", name = "t", descriptor = "[B")
    public byte[] field2227;

    @OriginalMember(owner = "client!lh", name = "s", descriptor = "I")
    public static int field2226 = 0;

    @OriginalMember(owner = "client!lh", name = "v", descriptor = "Leh;")
    public static class47 field2229 = class195.method1282((byte) -4, "welle2:");

    @OriginalMember(owner = "client!lh", name = "w", descriptor = "[I")
    public static int[] field2230 = new int[1000];

    @OriginalMember(owner = "client!lh", name = "u", descriptor = "[[S")
    public static short[][] field2228 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!lh", name = "x", descriptor = "Leh;")
    public static class47 field2231 = class195.method1282((byte) -4, "rect_debug=");

    @OriginalMember(owner = "client!lh", name = "A", descriptor = "I")
    public static int field2234 = 0;

    @OriginalMember(owner = "client!lh", name = "B", descriptor = "I")
    public static int field2235 = -1;

    @OriginalMember(owner = "client!lh", name = "z", descriptor = "I")
    public static int field2233;

    @OriginalMember(owner = "client!lh", name = "y", descriptor = "Lah;")
    public static class9 field2232;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(B)V")
    public static void method866(byte arg0) {
        field2231 = null;
        field2228 = null;
        field2232 = null;
        field2230 = null;
        if (arg0 != 1) {
            field2228 = null;
        }
        field2229 = null;
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "([B)V")
    public class107(byte[] arg0) {
        this.field2227 = arg0;
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(III)I")
    public static final int method867(int arg0, int arg1, int arg2) {
        int var3 = arg1 >>> 31;
        if (arg2 >= -57) {
            return 123;
        } else {
            field2233++;
            return (arg1 + var3) / arg0 - var3;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method868(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class106.field2215[arg0][var8][var14] == -class44.field893) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << 7) + 1;
            int var10 = (arg3 << 7) + 2;
            int var11 = class41.field821[arg0][arg1][arg3] + arg5;
            if (!class40.method338(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << 7) - 1;
            if (!class40.method338(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << 7) - 1;
            if (!class40.method338(var9, var11, var13)) {
                return false;
            } else if (class40.method338(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class108.method873(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class40.method338(var6 + 1, class41.field821[arg0][arg1][arg3] + arg5, var7 + 1) && class40.method338(var6 + 128 - 1, class41.field821[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class40.method338(var6 + 128 - 1, class41.field821[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class40.method338(var6 + 1, class41.field821[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }
}
