import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class138 extends class59 {

    @OriginalMember(owner = "client!pc", name = "S", descriptor = "I")
    private int field2683 = 585;

    @OriginalMember(owner = "client!pc", name = "T", descriptor = "Z")
    public static boolean field2684 = false;

    @OriginalMember(owner = "client!pc", name = "X", descriptor = "Lb;")
    public static class11 field2688 = new class11(64);

    @OriginalMember(owner = "client!pc", name = "bb", descriptor = "I")
    public static int field2692 = 0;

    @OriginalMember(owner = "client!pc", name = "db", descriptor = "[Lsd;")
    public static class166[] field2694 = new class166[100];

    @OriginalMember(owner = "client!pc", name = "V", descriptor = "I")
    public static int field2686;

    @OriginalMember(owner = "client!pc", name = "W", descriptor = "I")
    public static int field2687;

    @OriginalMember(owner = "client!pc", name = "Y", descriptor = "I")
    public static int field2689;

    @OriginalMember(owner = "client!pc", name = "Z", descriptor = "I")
    public static int field2690;

    @OriginalMember(owner = "client!pc", name = "ab", descriptor = "I")
    public static int field2691;

    @OriginalMember(owner = "client!pc", name = "cb", descriptor = "Lcb;")
    public static class22 field2693;

    @OriginalMember(owner = "client!pc", name = "U", descriptor = "[I")
    public static int[] field2685;

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "(I)I")
    public static final int method946(int arg0) {
        ++field2686;
        return arg0 != 13913 ? -92 : 6;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lff;BI)V")
    public final void method41(class53 arg0, byte arg1, int arg2) {
        if (arg2 == 0) {
            this.field2683 = arg0.method405(2);
        }
        if (arg1 <= 18) {
            field2694 = null;
        }
        ++field2691;
    }

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "(I)V")
    public static void method947(int arg0) {
        field2694 = null;
        field2685 = null;
        field2693 = null;
        if (arg0 > 50) {
            field2688 = null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(IB)[I")
    public final int[] method36(int arg0, byte arg1) {
        ++field2690;
        int[] var3 = super.field1219.method721(arg0, -126);
        if (super.field1219.field1816) {
            int var4 = class136.field2657[arg0];
            for (int var5 = 0; class98.field1879 > var5; ++var5) {
                int var6 = class187.field3569[var5];
                if (var6 > this.field2683 && ~(-this.field2683 + 4096) < ~var6 && -this.field2683 + 2048 < var4 && var4 < this.field2683 + 2048) {
                    int var7 = -var6 + 2048;
                    int var8 = var7 < 0 ? -var7 : var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (-this.field2683 + 2048);
                    var3[var5] = -var10 + 4096;
                } else if (~var6 < ~(-this.field2683 + 2048) && ~(this.field2683 + 2048) < ~var6) {
                    int var11 = var4 + -2048;
                    int var12 = var11 < 0 ? -var11 : var11;
                    int var13 = var12 - this.field2683;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (-this.field2683 + 2048);
                } else if (var4 >= this.field2683 && -this.field2683 + 4096 >= var4) {
                    if (~var6 <= ~this.field2683 && ~var6 >= ~(-this.field2683 + 4096)) {
                        var3[var5] = 0;
                    } else {
                        int var15 = 2048 - var4;
                        int var16 = ~var15 > -1 ? -var15 : var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field2683 + 2048);
                        var3[var5] = -var18 + 4096;
                    }
                } else {
                    int var19 = var6 + -2048;
                    int var20 = ~var19 > -1 ? -var19 : var19;
                    int var21 = var20 - this.field2683;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (-this.field2683 + 2048);
                }
            }
        }
        if (arg1 > -124) {
            field2684 = false;
        }
        return var3;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IZLjava/lang/Object;)[B")
    public static final byte[] method948(int arg0, boolean arg1, Object arg2) {
        ++field2689;
        if (arg2 == null) {
            return null;
        } else if (arg2 instanceof byte[]) {
            byte[] var3 = (byte[]) arg2;
            return arg1 ? class160.method1088((byte) -24, var3) : var3;
        } else if (arg2 instanceof class140) {
            class140 var4 = (class140) arg2;
            return var4.method198(arg0 + -9118);
        } else if (arg0 != 12) {
            return null;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "()V")
    public class138() {
        super(0, true);
    }
}
