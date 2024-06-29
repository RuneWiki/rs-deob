import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class269 extends class264 {

    @OriginalMember(owner = "client!rk", name = "U", descriptor = "I")
    private int field4806 = -1;

    @OriginalMember(owner = "client!rk", name = "Q", descriptor = "I")
    public static int field4802 = 0;

    @OriginalMember(owner = "client!rk", name = "J", descriptor = "Lcf;")
    public static class93 field4796 = class147.method1066("null", -48);

    @OriginalMember(owner = "client!rk", name = "X", descriptor = "[I")
    public static int[] field4809 = new int[5];

    @OriginalMember(owner = "client!rk", name = "O", descriptor = "[Lak;")
    public static class138[] field4801 = new class138[14];

    @OriginalMember(owner = "client!rk", name = "K", descriptor = "I")
    public static int field4797;

    @OriginalMember(owner = "client!rk", name = "L", descriptor = "I")
    public static int field4798;

    @OriginalMember(owner = "client!rk", name = "M", descriptor = "I")
    public static int field4799;

    @OriginalMember(owner = "client!rk", name = "N", descriptor = "I")
    public int field4800;

    @OriginalMember(owner = "client!rk", name = "R", descriptor = "I")
    public static int field4803;

    @OriginalMember(owner = "client!rk", name = "T", descriptor = "I")
    public int field4805;

    @OriginalMember(owner = "client!rk", name = "V", descriptor = "I")
    public static int field4807;

    @OriginalMember(owner = "client!rk", name = "W", descriptor = "I")
    public static int field4808;

    @OriginalMember(owner = "client!rk", name = "Y", descriptor = "Lhg;")
    public static class177 field4810;

    @OriginalMember(owner = "client!rk", name = "S", descriptor = "[I")
    public int[] field4804;

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "(I)I")
    public final int method1769(int arg0) {
        int var2 = 29 % ((arg0 - -36) / 56);
        ++field4807;
        return this.field4806;
    }

    @OriginalMember(owner = "client!rk", name = "f", descriptor = "(I)V")
    public static void method1793(int arg0) {
        field4796 = null;
        field4801 = null;
        field4810 = null;
        if (arg0 >= -64) {
            field4796 = null;
        }
        field4809 = null;
    }

    @OriginalMember(owner = "client!rk", name = "g", descriptor = "(I)Z")
    public final boolean method1794(int arg0) {
        ++field4799;
        if (this.field4804 != null) {
            return true;
        } else if (this.field4806 >= 0) {
            class158 var2 = class52.field853 >= 0 ? class187.method1358(0, this.field4806, class6.field77, class52.field853) : class4.method14(this.field4806, -22072, class6.field77);
            var2.method1133();
            this.field4805 = var2.field2127;
            this.field4804 = var2.field2795;
            this.field4800 = var2.field2135;
            return true;
        } else {
            if (arg0 > -90) {
                this.method20(10, 104, (class280) null);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IILee;)V")
    public final void method20(int arg0, int arg1, class280 arg2) {
        if (~arg1 == -1) {
            this.field4806 = arg2.method1891(-126);
        }
        if (arg0 <= 11) {
            this.method1769(-28);
        }
        ++field4808;
    }

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "(B)V")
    public final void method67(byte arg0) {
        ++field4798;
        super.method67((byte) 60);
        if (arg0 > 42) {
            this.field4804 = null;
        }
    }

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "(III)J")
    public static final long method1795(int arg0, int arg1, int arg2) {
        class41 var3 = class232.field4138[arg0][arg1][arg2];
        return var3 != null && var3.field652 != null ? var3.field652.field440 : 0L;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Z)V")
    public static final void method1796(boolean arg0) {
        ++field4797;
        class195.method1400(-265408432, 5);
        class206.method1459(5, (byte) 58);
        class103.method754(5, (byte) 58);
        class37.method218(5, (byte) -114);
        class93.method653(5, 31);
        class283.method1939((byte) -64, 5);
        class278.method1864(arg0, 5);
        class123.method906(5, (byte) 110);
        class155.method1105(5, (byte) 86);
        class149.method1075(false, 5);
        class112.method801(128, 5);
        class216.method1521(5, 40);
        class89.method618((byte) 87, 5);
        class93.method665(-123, 5);
        class280.method1922(5, -62);
        class137.method1001(50, -8984);
        class204.method1448(5, !arg0);
        class233.method1593(false, 5);
        class148.field2606.method298(true, 5);
        class266.field4731.method298(arg0, 5);
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "()V")
    public class269() {
        super(0, false);
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IZ)[[I")
    public int[][] method17(int arg0, boolean arg1) {
        ++field4803;
        if (arg1) {
            this.method1769(75);
        }
        int[][] var3 = super.field4705.method1089(arg0, 84);
        if (super.field4705.field2670 && this.method1794(-98)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = this.field4800 * (class67.field1231 != this.field4805 ? this.field4805 * arg0 / class67.field1231 : arg0);
            if (~class176.field3060 != ~this.field4800) {
                for (int var8 = 0; var8 < class176.field3060; ++var8) {
                    int var9 = this.field4800 * var8 / class176.field3060;
                    int var10 = this.field4804[var7 + var9];
                    var6[var8] = class58.method333(255, var10) << 4;
                    var5[var8] = class58.method333(var10 >> 4, 4080);
                    var4[var8] = class58.method333(var10 >> 12, 4080);
                }
            } else {
                for (int var11 = 0; ~class176.field3060 < ~var11; ++var11) {
                    int var12 = this.field4804[var7++];
                    var6[var11] = class58.method333(4080, var12 << 4);
                    var5[var11] = class58.method333(var12, 65280) >> 4;
                    var4[var11] = class58.method333(4080, var12 >> 12);
                }
            }
        }
        return var3;
    }
}
