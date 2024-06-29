import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class239 extends class166 {

    @OriginalMember(owner = "client!jk", name = "ab", descriptor = "I")
    private int field4384 = 585;

    @OriginalMember(owner = "client!jk", name = "S", descriptor = "[S")
    public static short[] field4376 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!jk", name = "Q", descriptor = "Lhj;")
    public static class69 field4374 = class181.method1318("hint_mapedge", (byte) -125);

    @OriginalMember(owner = "client!jk", name = "P", descriptor = "D")
    public static double field4373 = -1.0D;

    @OriginalMember(owner = "client!jk", name = "O", descriptor = "[I")
    public static int[] field4372 = new int[1000];

    @OriginalMember(owner = "client!jk", name = "V", descriptor = "Lhj;")
    public static class69 field4379 = class181.method1318("showVideoAd", (byte) -107);

    @OriginalMember(owner = "client!jk", name = "fb", descriptor = "Lhj;")
    private static class69 field4389 = class181.method1318("glow1:", (byte) -124);

    @OriginalMember(owner = "client!jk", name = "bb", descriptor = "Lhj;")
    public static class69 field4385 = class181.method1318("::qa_op_test", (byte) -111);

    @OriginalMember(owner = "client!jk", name = "Y", descriptor = "Lhj;")
    private static class69 field4382 = class181.method1318("Close", (byte) -107);

    @OriginalMember(owner = "client!jk", name = "db", descriptor = "Lhj;")
    public static class69 field4387 = field4389;

    @OriginalMember(owner = "client!jk", name = "cb", descriptor = "Lhj;")
    public static class69 field4386 = field4382;

    @OriginalMember(owner = "client!jk", name = "U", descriptor = "Lhj;")
    public static class69 field4378 = field4389;

    @OriginalMember(owner = "client!jk", name = "W", descriptor = "I")
    public static int field4380 = 0;

    @OriginalMember(owner = "client!jk", name = "gb", descriptor = "Lhj;")
    public static class69 field4390 = class181.method1318("leuchten1:", (byte) -121);

    @OriginalMember(owner = "client!jk", name = "R", descriptor = "I")
    public static int field4375;

    @OriginalMember(owner = "client!jk", name = "X", descriptor = "I")
    public static int field4381;

    @OriginalMember(owner = "client!jk", name = "Z", descriptor = "I")
    public static int field4383;

    @OriginalMember(owner = "client!jk", name = "eb", descriptor = "I")
    public static int field4388;

    @OriginalMember(owner = "client!jk", name = "hb", descriptor = "I")
    public static int field4391;

    @OriginalMember(owner = "client!jk", name = "T", descriptor = "Lnc;")
    public static class83 field4377;

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(II)[I")
    public final int[] method20(int arg0, int arg1) {
        ++field4383;
        int[] var3 = super.field3071.method1252(arg0, true);
        if (arg1 != 8388607) {
            return null;
        } else {
            if (super.field3071.field3142) {
                int var4 = class13.field187[arg0];
                for (int var5 = 0; class253.field4565 > var5; ++var5) {
                    int var6 = class24.field347[var5];
                    if (var6 > this.field4384 && ~(-this.field4384 + 4096) < ~var6 && -this.field4384 + 2048 < var4 && ~(this.field4384 + 2048) < ~var4) {
                        int var7 = -var6 + 2048;
                        int var8 = ~var7 > -1 ? -var7 : var7;
                        int var9 = var8 << 12;
                        int var10 = var9 / (-this.field4384 + 2048);
                        var3[var5] = -var10 + 4096;
                    } else if (var6 > -this.field4384 + 2048 && ~(this.field4384 + 2048) < ~var6) {
                        int var11 = var4 + -2048;
                        int var12 = ~var11 > -1 ? -var11 : var11;
                        int var13 = var12 - this.field4384;
                        int var14 = var13 << 12;
                        var3[var5] = var14 / (-this.field4384 + 2048);
                    } else if (~this.field4384 >= ~var4 && var4 <= -this.field4384 + 4096) {
                        if (~var6 <= ~this.field4384 && ~(-this.field4384 + 4096) <= ~var6) {
                            var3[var5] = 0;
                        } else {
                            int var15 = -var4 + 2048;
                            int var16 = ~var15 > -1 ? -var15 : var15;
                            int var17 = var16 << 12;
                            int var18 = var17 / (-this.field4384 + 2048);
                            var3[var5] = 4096 - var18;
                        }
                    } else {
                        int var19 = var6 + -2048;
                        int var20 = ~var19 > -1 ? -var19 : var19;
                        int var21 = var20 - this.field4384;
                        int var22 = var21 << 12;
                        var3[var5] = var22 / (-this.field4384 + 2048);
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "(B)V")
    public static void method1692(byte arg0) {
        field4389 = null;
        field4385 = null;
        field4387 = null;
        field4390 = null;
        field4386 = null;
        field4376 = null;
        field4372 = null;
        field4379 = null;
        if (arg0 >= 89) {
            field4378 = null;
            field4377 = null;
            field4382 = null;
            field4374 = null;
        }
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "()V")
    public class239() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "(B)V")
    public static final void method1693(byte arg0) {
        if (arg0 == 14) {
            class142.field2651 = null;
            class144.field2676 = null;
            ++field4375;
            class82.field1573 = null;
            class68.field1291 = null;
        }
    }

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "(B)V")
    public static final void method1694(byte arg0) {
        ++field4388;
        class255.field4584.method720((byte) -62);
        int var1 = 101 / ((-10 - arg0) / 32);
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(BLfh;I)V")
    public final void method18(byte arg0, class128 arg1, int arg2) {
        if (~arg2 == -1) {
            this.field4384 = arg1.method912(75);
        }
        if (arg0 != 96) {
            method1694((byte) -72);
        }
        ++field4381;
    }
}
