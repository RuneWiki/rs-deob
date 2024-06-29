import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class157 {

    @OriginalMember(owner = "client!og", name = "d", descriptor = "Llh;")
    public static class320 field2165 = new class320(5000);

    @OriginalMember(owner = "client!og", name = "n", descriptor = "[[S")
    public static short[][] field2175 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!og", name = "l", descriptor = "Lfm;")
    public static class53 field2173 = new class53(64);

    @OriginalMember(owner = "client!og", name = "a", descriptor = "I")
    public static int field2162;

    @OriginalMember(owner = "client!og", name = "b", descriptor = "I")
    public int field2163;

    @OriginalMember(owner = "client!og", name = "c", descriptor = "I")
    public static int field2164;

    @OriginalMember(owner = "client!og", name = "e", descriptor = "I")
    public int field2166;

    @OriginalMember(owner = "client!og", name = "f", descriptor = "I")
    public static int field2167;

    @OriginalMember(owner = "client!og", name = "g", descriptor = "I")
    public static int field2168;

    @OriginalMember(owner = "client!og", name = "h", descriptor = "I")
    public static int field2169;

    @OriginalMember(owner = "client!og", name = "j", descriptor = "I")
    public static int field2171;

    @OriginalMember(owner = "client!og", name = "k", descriptor = "I")
    public static int field2172;

    @OriginalMember(owner = "client!og", name = "m", descriptor = "I")
    public int field2174;

    @OriginalMember(owner = "client!og", name = "i", descriptor = "[Z")
    public static boolean[] field2170;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(ILcg;)V", line = 4)
    public final void method1133(int arg0, class316 arg1) {
        field2168++;
        if (arg0 != -1) {
            method1137(true, (class241) null);
        }
        while (true) {
            int var3 = arg1.method2219(arg0 + 16449);
            if (var3 == 0) {
                return;
            }
            this.method1138(arg1, var3, -99);
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(B)V", line = 26)
    public static void method1134(byte arg0) {
        field2173 = null;
        field2165 = null;
        field2170 = null;
        field2175 = (short[][]) null;
        if (arg0 <= 68) {
            field2165 = (class320) null;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(III)Lfd;", line = 44)
    public static final class306 method1135(int arg0, int arg1, int arg2) {
        class202 var3 = class142.field1940[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class306 var4 = var3.field2869;
            var3.field2869 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IIII)I", line = 55)
    public static final int method1136(int arg0, int arg1, int arg2, int arg3) {
        field2164++;
        int var4 = arg0 & 0x3;
        if (arg2 != 5673) {
            field2173 = (class53) null;
        }
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return 1023 - arg1;
        } else if (var4 == 2) {
            return 1023 - arg3;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(ZLfj;)V", line = 80)
    public static final void method1137(boolean arg0, class241 arg1) {
        class98 var2 = (class98) class223.field3199.method111(54, class77.method584(arg1.field3439, 72));
        if (var2 != null) {
            if (var2.field1333 != null) {
                class160.field2196.method1130(var2.field1333);
                var2.field1333 = null;
            }
            var2.method1274((byte) -26);
        }
        field2172++;
        if (!arg0) {
            method1136(42, 68, -69, 114);
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Lcg;II)V", line = 113)
    private final void method1138(class316 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field2163 = arg0.method2220((byte) 57);
            this.field2166 = arg0.method2219(16448);
            this.field2174 = arg0.method2219(16448);
        }
        field2162++;
        if (arg2 >= -79) {
            field2173 = (class53) null;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IILkm;I)Lkn;", line = 138)
    public static final class178 method1139(int arg0, int arg1, class133 arg2, int arg3) {
        field2167++;
        int var4 = 0 % ((arg3 - 18) / 55);
        return class129.method931(arg0, arg1, arg2, (byte) 114) ? class292.method1998((byte) 51) : null;
    }
}
