import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class17 extends class82 {

    @OriginalMember(owner = "client!be", name = "Q", descriptor = "I")
    private int field301 = 1365;

    @OriginalMember(owner = "client!be", name = "W", descriptor = "I")
    private int field307 = 0;

    @OriginalMember(owner = "client!be", name = "ab", descriptor = "I")
    private int field311 = 20;

    @OriginalMember(owner = "client!be", name = "R", descriptor = "I")
    private int field302 = 0;

    @OriginalMember(owner = "client!be", name = "V", descriptor = "[I")
    public static int[] field306 = new int[] { 0, 1, 2, 3 };

    @OriginalMember(owner = "client!be", name = "P", descriptor = "[J")
    public static long[] field300 = new long[32];

    @OriginalMember(owner = "client!be", name = "Z", descriptor = "Ldj;")
    public static class44 field310 = class89.method650(255, " )2> <col=00ffff>");

    @OriginalMember(owner = "client!be", name = "Y", descriptor = "Lgi;")
    public static class75 field309 = new class75();

    @OriginalMember(owner = "client!be", name = "S", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "client!be", name = "T", descriptor = "I")
    public static int field304;

    @OriginalMember(owner = "client!be", name = "U", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "client!be", name = "X", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Lfj;IB)V")
    public final void method2(class66 arg0, int arg1, byte arg2) {
        if (arg2 != 68) {
            this.field302 = -74;
        }
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (~arg1 == -4) {
                        this.field302 = arg0.method500(74);
                    }
                } else {
                    this.field307 = arg0.method500(72);
                }
            } else {
                this.field311 = arg0.method500(arg2 ^ 53);
            }
        } else {
            this.field301 = arg0.method500(63);
        }
        ++field304;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Z)V")
    public static final void method143(boolean arg0) {
        if (!arg0) {
            method143(true);
        }
        class24.method174((byte) 126, class130.field2313, class169.field2926, class201.field3575);
        ++field305;
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(II)[I")
    public final int[] method3(int arg0, int arg1) {
        ++field308;
        if (arg0 != 25238) {
            this.field301 = -57;
        }
        int[] var3 = super.field1595.method603(true, arg1);
        if (super.field1595.field1538) {
            for (int var4 = 0; ~class129.field2287 < ~var4; ++var4) {
                int var5 = (class49.field912[var4] << 12) / this.field301 + this.field307;
                int var6 = (class212.field3809[arg1] << 12) / this.field301 + this.field302;
                int var7 = var5;
                int var8 = var6;
                int var9 = var5;
                int var10 = var6;
                int var11 = var6 * var6 >> 12;
                int var12 = var5 * var5 >> 12;
                int var13 = 0;
                while (~(var11 + var12) > -16385 && var13 < this.field311) {
                    ++var13;
                    var10 = (var9 * var10 >> 12) * 2 + var8;
                    var9 = -var11 + var12 + var7;
                    var11 = var10 * var10 >> 12;
                    var12 = var9 * var9 >> 12;
                }
                var3[var4] = ~(this.field311 + -1) >= ~var13 ? 0 : (var13 << 12) / this.field311;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!be", name = "g", descriptor = "(I)V")
    public static void method144(int arg0) {
        field310 = null;
        field309 = null;
        if (arg0 >= -57) {
            method144(-113);
        }
        field300 = null;
        field306 = null;
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "()V")
    public class17() {
        super(0, true);
    }
}
