import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class32 extends class115 {

    @OriginalMember(owner = "client!pg", name = "jb", descriptor = "I")
    private int field399 = -1;

    @OriginalMember(owner = "client!pg", name = "eb", descriptor = "Lqe;")
    private static class168 field394 = class66.method448("You can(Wt add yourself to your own ignore list)3", 61);

    @OriginalMember(owner = "client!pg", name = "fb", descriptor = "[[B")
    public static byte[][] field395 = new byte[50][];

    @OriginalMember(owner = "client!pg", name = "T", descriptor = "Lqe;")
    public static class168 field383 = field394;

    @OriginalMember(owner = "client!pg", name = "gb", descriptor = "I")
    public static int field396 = 0;

    @OriginalMember(owner = "client!pg", name = "X", descriptor = "Lqe;")
    private static class168 field387 = class66.method448("Loaded update list", -108);

    @OriginalMember(owner = "client!pg", name = "R", descriptor = "Lqe;")
    public static class168 field381 = field387;

    @OriginalMember(owner = "client!pg", name = "S", descriptor = "[Lqe;")
    public static class168[] field382 = new class168[200];

    @OriginalMember(owner = "client!pg", name = "V", descriptor = "Lhe;")
    public static class47 field385 = new class47();

    @OriginalMember(owner = "client!pg", name = "ob", descriptor = "[[[I")
    public static int[][][] field404 = new int[2][][];

    @OriginalMember(owner = "client!pg", name = "lb", descriptor = "Lqe;")
    private static class168 field401 = class66.method448("scroll:", 108);

    @OriginalMember(owner = "client!pg", name = "nb", descriptor = "Lqe;")
    public static class168 field403 = field401;

    @OriginalMember(owner = "client!pg", name = "mb", descriptor = "Lqe;")
    public static class168 field402 = field401;

    @OriginalMember(owner = "client!pg", name = "Q", descriptor = "I")
    public static int field380;

    @OriginalMember(owner = "client!pg", name = "U", descriptor = "I")
    public int field384;

    @OriginalMember(owner = "client!pg", name = "W", descriptor = "I")
    public static int field386;

    @OriginalMember(owner = "client!pg", name = "Y", descriptor = "I")
    public static int field388;

    @OriginalMember(owner = "client!pg", name = "bb", descriptor = "I")
    public static int field391;

    @OriginalMember(owner = "client!pg", name = "cb", descriptor = "I")
    public static int field392;

    @OriginalMember(owner = "client!pg", name = "db", descriptor = "I")
    public static int field393;

    @OriginalMember(owner = "client!pg", name = "hb", descriptor = "I")
    public static int field397;

    @OriginalMember(owner = "client!pg", name = "ib", descriptor = "I")
    public static int field398;

    @OriginalMember(owner = "client!pg", name = "kb", descriptor = "I")
    public int field400;

    @OriginalMember(owner = "client!pg", name = "ab", descriptor = "[I")
    public int[] field390;

    @OriginalMember(owner = "client!pg", name = "Z", descriptor = "[[[I")
    public static int[][][] field389;

    @OriginalMember(owner = "client!pg", name = "i", descriptor = "(I)V")
    public static void method206(int arg0) {
        field403 = null;
        if (arg0 != 4080) {
            method210(-10, 108, -80, 74, 117, (class18) null, -117);
        }
        field383 = null;
        field394 = null;
        field387 = null;
        field401 = null;
        field382 = null;
        field381 = null;
        field395 = null;
        field385 = null;
        field389 = null;
        field404 = null;
        field402 = null;
    }

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "(I)I")
    public final int method207(int arg0) {
        if (arg0 != -1) {
            field403 = null;
        }
        ++field388;
        return this.field399;
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "()V")
    public class32() {
        super(0, false);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(BLnh;I)V")
    public final void method3(byte arg0, class112 arg1, int arg2) {
        if (arg2 == 0) {
            this.field399 = arg1.method731(false);
        }
        ++field393;
        if (arg0 != 107) {
            this.field400 = -5;
        }
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(II)[[I")
    public int[][] method1(int arg0, int arg1) {
        ++field391;
        if (arg1 <= 11) {
            this.field384 = -51;
        }
        int[][] var3 = super.field1882.method1242(arg0, 107);
        if (super.field1882.field3344 && this.method209(16711680)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = this.field400 * (~class62.field855 == ~this.field384 ? arg0 : this.field384 * arg0 / class62.field855);
            if (~class130.field2297 != ~this.field400) {
                for (int var8 = 0; ~class130.field2297 < ~var8; ++var8) {
                    int var9 = this.field400 * var8 / class130.field2297;
                    int var10 = this.field390[var7 + var9];
                    var6[var8] = class86.method571(var10, 255) << 4;
                    var5[var8] = class86.method571(var10 >> 4, 4080);
                    var4[var8] = class86.method571(16711680, var10) >> 12;
                }
            } else {
                for (int var11 = 0; ~var11 > ~class130.field2297; ++var11) {
                    int var12 = this.field390[var7++];
                    var6[var11] = class86.method571(var12, 255) << 4;
                    var5[var11] = class86.method571(4080, var12 >> 4);
                    var4[var11] = class86.method571(var12, 16711680) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pg", name = "g", descriptor = "(I)V")
    public final void method208(int arg0) {
        ++field397;
        super.method208(arg0);
        this.field390 = null;
    }

    @OriginalMember(owner = "client!pg", name = "j", descriptor = "(I)Z")
    public final boolean method209(int arg0) {
        ++field392;
        if (arg0 != 16711680) {
            return false;
        } else if (this.field390 != null) {
            return true;
        } else if (~this.field399 <= -1) {
            class15 var2 = class95.method629(false, this.field399, class240.field4112);
            var2.method68();
            this.field400 = var2.field914;
            this.field390 = var2.field136;
            this.field384 = var2.field912;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIIILog;I)V")
    public static final void method210(int arg0, int arg1, int arg2, int arg3, int arg4, class18 arg5, int arg6) {
        ++field380;
        class109.method711(arg3, arg4, arg5.field190, arg5.field166, arg1, arg2, arg6, 0);
        if (arg0 <= 104) {
            method206(2);
        }
    }
}
