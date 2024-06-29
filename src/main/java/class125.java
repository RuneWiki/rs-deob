import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class125 extends class123 {

    @OriginalMember(owner = "client!nk", name = "bb", descriptor = "Leb;")
    private static class230 field2194 = class68.method589(0, "May");

    @OriginalMember(owner = "client!nk", name = "cb", descriptor = "[[[I")
    public static int[][][] field2195 = new int[4][13][13];

    @OriginalMember(owner = "client!nk", name = "Y", descriptor = "Leb;")
    private static class230 field2191 = class68.method589(0, "Jan");

    @OriginalMember(owner = "client!nk", name = "fb", descriptor = "[Z")
    public static boolean[] field2198 = new boolean[100];

    @OriginalMember(owner = "client!nk", name = "eb", descriptor = "Leb;")
    private static class230 field2197 = class68.method589(0, "Dec");

    @OriginalMember(owner = "client!nk", name = "ab", descriptor = "Leb;")
    public static class230 field2193 = class68.method589(0, "<col=ffff00>");

    @OriginalMember(owner = "client!nk", name = "db", descriptor = "Leb;")
    private static class230 field2196 = class68.method589(0, "Nov");

    @OriginalMember(owner = "client!nk", name = "nb", descriptor = "Leb;")
    private static class230 field2206 = class68.method589(0, "Jun");

    @OriginalMember(owner = "client!nk", name = "pb", descriptor = "Leb;")
    private static class230 field2208 = class68.method589(0, "Feb");

    @OriginalMember(owner = "client!nk", name = "gb", descriptor = "[I")
    public static int[] field2199 = new int[5];

    @OriginalMember(owner = "client!nk", name = "lb", descriptor = "Leb;")
    private static class230 field2204 = class68.method589(0, "Sep");

    @OriginalMember(owner = "client!nk", name = "sb", descriptor = "Leb;")
    private static class230 field2211 = class68.method589(0, "Jul");

    @OriginalMember(owner = "client!nk", name = "tb", descriptor = "Leb;")
    private static class230 field2212 = class68.method589(0, "Mar");

    @OriginalMember(owner = "client!nk", name = "ob", descriptor = "Leb;")
    private static class230 field2207 = class68.method589(0, "Oct");

    @OriginalMember(owner = "client!nk", name = "ub", descriptor = "Leb;")
    private static class230 field2213 = class68.method589(0, "Apr");

    @OriginalMember(owner = "client!nk", name = "hb", descriptor = "Leb;")
    private static class230 field2200 = class68.method589(0, "Aug");

    @OriginalMember(owner = "client!nk", name = "X", descriptor = "[Leb;")
    public static class230[] field2190 = new class230[] { field2191, field2208, field2212, field2213, field2194, field2206, field2211, field2200, field2204, field2207, field2196, field2197 };

    @OriginalMember(owner = "client!nk", name = "ib", descriptor = "I")
    public static int field2201;

    @OriginalMember(owner = "client!nk", name = "jb", descriptor = "I")
    public static int field2202;

    @OriginalMember(owner = "client!nk", name = "kb", descriptor = "I")
    public static int field2203;

    @OriginalMember(owner = "client!nk", name = "mb", descriptor = "I")
    public static int field2205;

    @OriginalMember(owner = "client!nk", name = "qb", descriptor = "I")
    public static int field2209;

    @OriginalMember(owner = "client!nk", name = "rb", descriptor = "I")
    public static int field2210;

    @OriginalMember(owner = "client!nk", name = "Z", descriptor = "Lij;")
    public static class189 field2192;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(ILfk;I)V")
    public final void method6(int arg0, class14 arg1, int arg2) {
        if (arg2 != 1876195788) {
            field2212 = null;
        }
        ++field2201;
        if (arg0 == 0) {
            super.field2147 = arg1.method200(255) == 1;
        }
    }

    @OriginalMember(owner = "client!nk", name = "g", descriptor = "(I)V")
    public static void method980(int arg0) {
        field2193 = null;
        field2197 = null;
        field2190 = null;
        field2206 = null;
        if (arg0 >= -72) {
            method982(-78, -14);
        }
        field2191 = null;
        field2208 = null;
        field2213 = null;
        field2194 = null;
        field2207 = null;
        field2198 = null;
        field2211 = null;
        field2192 = null;
        field2195 = null;
        field2204 = null;
        field2212 = null;
        field2200 = null;
        field2196 = null;
        field2199 = null;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IB)[I")
    public final int[] method4(int arg0, byte arg1) {
        int var3 = -94 / ((arg1 - -24) / 57);
        int[] var4 = super.field2160.method1323((byte) 124, arg0);
        if (super.field2160.field3243) {
            for (int var5 = 0; var5 < class140.field2505; ++var5) {
                this.method981(var5, arg0, (byte) 105);
                int[] var6 = this.method965(0, class212.field3677, (byte) 43);
                var4[var5] = var6[class7.field119];
            }
        }
        ++field2210;
        return var4;
    }

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "(IIB)V")
    private final void method981(int arg0, int arg1, byte arg2) {
        ++field2209;
        int var4 = class214.field3705[arg0];
        if (arg2 < 84) {
            field2197 = null;
        }
        int var5 = class154.field2753[arg1];
        float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 - 2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class7.field119 = arg0;
            class212.field3677 = arg1;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class212.field3677 = arg0;
            class7.field119 = arg1;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class212.field3677 = arg0;
            class7.field119 = -arg1 + class140.field2505;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class212.field3677 = class255.field4540 - arg1;
            class7.field119 = arg0;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class212.field3677 = class255.field4540 - arg1;
            class7.field119 = class140.field2505 - arg0;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class212.field3677 = -arg0 + class255.field4540;
            class7.field119 = class140.field2505 - arg1;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class212.field3677 = -arg0 + class255.field4540;
            class7.field119 = arg1;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class212.field3677 = arg1;
            class7.field119 = -arg0 + class140.field2505;
        }
        class212.field3677 &= class79.field1431;
        class7.field119 &= class217.field3743;
    }

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "(II)V")
    public static final void method982(int arg0, int arg1) {
        class197 var2 = class164.method1228(arg0, arg1, arg0 + -1665874475);
        ++field2203;
        var2.method1407(-113);
    }

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "(II)[[I")
    public final int[][] method2(int arg0, int arg1) {
        ++field2202;
        int[][] var3 = super.field2152.method1106(arg0, -7034);
        if (arg1 != 26080) {
            field2211 = null;
        }
        if (super.field2152.field2616) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; ~class140.field2505 < ~var7; ++var7) {
                this.method981(var7, arg0, (byte) 86);
                int[][] var8 = this.method960(0, class212.field3677, (byte) -41);
                var4[var7] = var8[0][class7.field119];
                var5[var7] = var8[1][class7.field119];
                var6[var7] = var8[2][class7.field119];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "()V")
    public class125() {
        super(1, false);
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(BI)Log;")
    public static final class210 method983(byte arg0, int arg1) {
        class210 var2 = (class210) class45.field803.method1125((long) arg1, true);
        ++field2205;
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class145.field2594.method1546(arg1, (byte) -100, 16);
            class210 var4 = new class210();
            if (arg0 <= 117) {
                method983((byte) 27, 1);
            }
            if (var3 != null) {
                var4.method1461(new class14(var3), true);
            }
            class45.field803.method1129((long) arg1, true, var4);
            return var4;
        }
    }
}
