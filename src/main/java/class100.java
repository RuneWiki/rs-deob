import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class100 extends class128 {

    @OriginalMember(owner = "client!o", name = "Lb", descriptor = "Lja;")
    public static class62 field2318 = class30.method243(43, "Willkommen auf RuneScape");

    @OriginalMember(owner = "client!o", name = "Pb", descriptor = "I")
    public static int field2322 = 0;

    @OriginalMember(owner = "client!o", name = "Vb", descriptor = "I")
    public static int field2328 = 0;

    @OriginalMember(owner = "client!o", name = "dc", descriptor = "Lja;")
    public static class62 field2336 = class30.method243(43, "lila:");

    @OriginalMember(owner = "client!o", name = "Rb", descriptor = "I")
    public static int field2324 = 0;

    @OriginalMember(owner = "client!o", name = "Tb", descriptor = "Z")
    public static boolean field2326 = false;

    @OriginalMember(owner = "client!o", name = "Xb", descriptor = "[Lid;")
    public static class60[] field2330 = new class60[16];

    @OriginalMember(owner = "client!o", name = "hc", descriptor = "Z")
    public static boolean field2340 = true;

    @OriginalMember(owner = "client!o", name = "gc", descriptor = "I")
    public static int field2339 = 0;

    @OriginalMember(owner = "client!o", name = "Mb", descriptor = "Lc;")
    public static class18 field2319 = new class18(64);

    @OriginalMember(owner = "client!o", name = "Kb", descriptor = "I")
    public static int field2317;

    @OriginalMember(owner = "client!o", name = "Ob", descriptor = "I")
    public static int field2321;

    @OriginalMember(owner = "client!o", name = "Ub", descriptor = "I")
    public static int field2327;

    @OriginalMember(owner = "client!o", name = "Wb", descriptor = "I")
    public static int field2329;

    @OriginalMember(owner = "client!o", name = "Yb", descriptor = "I")
    public static int field2331;

    @OriginalMember(owner = "client!o", name = "Zb", descriptor = "I")
    public static int field2332;

    @OriginalMember(owner = "client!o", name = "ac", descriptor = "I")
    public static int field2333;

    @OriginalMember(owner = "client!o", name = "cc", descriptor = "I")
    private int field2335;

    @OriginalMember(owner = "client!o", name = "ec", descriptor = "I")
    public static int field2337;

    @OriginalMember(owner = "client!o", name = "fc", descriptor = "I")
    public static int field2338;

    @OriginalMember(owner = "client!o", name = "ic", descriptor = "I")
    public static int field2341;

    @OriginalMember(owner = "client!o", name = "Qb", descriptor = "Lhe;")
    public static class54 field2323;

    @OriginalMember(owner = "client!o", name = "Nb", descriptor = "Ll;")
    public static class79 field2320;

    @OriginalMember(owner = "client!o", name = "Jb", descriptor = "Lmc;")
    public static class85 field2316;

    @OriginalMember(owner = "client!o", name = "bc", descriptor = "Lna;")
    private class90 field2334;

    @OriginalMember(owner = "client!o", name = "Sb", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field2325;

    @OriginalMember(owner = "client!o", name = "q", descriptor = "(I)V")
    public final void method802(int arg0) {
        ++field2333;
        super.field2873 = (this.field2335 - arg0) / 8;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(B[I)V")
    public final void method803(byte arg0, int[] arg1) {
        this.field2334 = new class90(arg1);
        int var3 = -97 % ((arg0 - 77) / 34);
        ++field2327;
    }

    @OriginalMember(owner = "client!o", name = "o", descriptor = "(II)I")
    public final int method804(int arg0, int arg1) {
        ++field2331;
        if (arg0 != 0) {
            this.method803((byte) -44, (int[]) null);
        }
        return arg1 * 8 - this.field2335;
    }

    @OriginalMember(owner = "client!o", name = "r", descriptor = "(I)V")
    public final void method805(int arg0) {
        this.field2335 = super.field2873 * arg0;
        ++field2329;
    }

    @OriginalMember(owner = "client!o", name = "n", descriptor = "(B)I")
    public final int method806(byte arg0) {
        ++field2341;
        return arg0 != -112 ? 103 : 255 & super.field2874[super.field2873++] - this.field2334.method707((byte) -1);
    }

    @OriginalMember(owner = "client!o", name = "s", descriptor = "(I)V")
    public static void method807(int arg0) {
        field2330 = null;
        field2325 = null;
        field2336 = null;
        int var1 = -33 / ((5 - arg0) / 41);
        field2318 = null;
        field2320 = null;
        field2319 = null;
        field2323 = null;
        field2316 = null;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IBI)I")
    public static final int method808(int arg0, byte arg1, int arg2) {
        ++field2338;
        if (arg1 != -98) {
            method809((byte) 101, 35, 74);
        }
        if (arg2 == -1) {
            return 12345678;
        } else {
            int var3 = (127 & arg2) * arg0 / 128;
            if (~var3 > -3) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (65408 & arg2) + var3;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(BII)I")
    public static final int method809(byte arg0, int arg1, int arg2) {
        ++field2332;
        if (arg0 != 109) {
            field2325 = null;
        }
        if (~arg1 <= -3) {
            int var3 = method809((byte) 109, arg1 >> 1, arg2 * arg2);
            if ((arg1 & 1) != 0) {
                var3 = arg2 * var3;
            }
            return var3;
        } else {
            return ~arg1 == -2 ? arg2 : 1;
        }
    }

    @OriginalMember(owner = "client!o", name = "p", descriptor = "(II)V")
    public final void method810(int arg0, int arg1) {
        super.field2874[super.field2873++] = (byte) (this.field2334.method707((byte) -1) + arg1);
        if (arg0 != -2) {
            this.method811(53, -113);
        }
        ++field2321;
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "(I)V")
    public class100(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!o", name = "q", descriptor = "(II)I")
    public final int method811(int arg0, int arg1) {
        ++field2337;
        int var3 = this.field2335 >> 3;
        int var4 = -(arg0 & this.field2335) + 8;
        this.field2335 += arg1;
        int var5 = 0;
        while (~var4 > ~arg1) {
            var5 += (super.field2874[var3++] & class31.field753[var4]) << -var4 + arg1;
            arg1 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg1 != var4) {
            var6 = (super.field2874[var3] >> -arg1 + var4 & class31.field753[arg1]) + var5;
        } else {
            var6 = (class31.field753[var4] & super.field2874[var3]) + var5;
        }
        return var6;
    }
}
