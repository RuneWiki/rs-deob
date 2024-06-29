import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class44 extends class300 {

    @OriginalMember(owner = "client!m", name = "J", descriptor = "I")
    private int field531 = 585;

    @OriginalMember(owner = "client!m", name = "K", descriptor = "Ljava/lang/String;")
    public static String field532 = "slide:";

    @OriginalMember(owner = "client!m", name = "G", descriptor = "Z")
    public static boolean field528 = true;

    @OriginalMember(owner = "client!m", name = "H", descriptor = "I")
    public static int field529;

    @OriginalMember(owner = "client!m", name = "I", descriptor = "I")
    public static int field530;

    @OriginalMember(owner = "client!m", name = "L", descriptor = "I")
    public static int field533;

    @OriginalMember(owner = "client!m", name = "M", descriptor = "I")
    public static int field534;

    @OriginalMember(owner = "client!m", name = "N", descriptor = "I")
    public static int field535;

    @OriginalMember(owner = "client!m", name = "F", descriptor = "[[B")
    public static byte[][] field527;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IZ)V")
    public static final void method246(int arg0, boolean arg1) {
        ++field534;
        class19.field255 = arg0;
        class124.field1785 = 100;
        class181.field2855 = -1;
        class99.field1490 = 3;
        if (arg1) {
            method247(-53);
        }
    }

    @OriginalMember(owner = "client!m", name = "f", descriptor = "(I)V")
    public static final void method247(int arg0) {
        class107.field1557 = null;
        class13.field182 = null;
        ++field535;
        if (arg0 != 134154262) {
            method248(14);
        }
        class264.field4289 = null;
    }

    @OriginalMember(owner = "client!m", name = "g", descriptor = "(I)V")
    public static void method248(int arg0) {
        if (arg0 != 2048) {
            field527 = null;
        }
        field532 = null;
        field527 = null;
    }

    @OriginalMember(owner = "client!m", name = "c", descriptor = "(IBI)I")
    public static final int method249(int arg0, byte arg1, int arg2) {
        ++field533;
        if (arg1 != -76) {
            method246(78, true);
        }
        int var3 = arg2 * 57 + arg0;
        int var4 = var3 << 13 ^ var3;
        int var5 = Integer.MAX_VALUE & (var4 * 15731 * var4 + 789221) * var4 + 1376312589;
        return (var5 & 134154262) >> 19;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(II)[I")
    public final int[] method99(int arg0, int arg1) {
        if (arg1 != -957953300) {
            return null;
        } else {
            ++field529;
            int[] var3 = super.field4797.method217(arg0, true);
            if (super.field4797.field470) {
                int var4 = class235.field3797[arg0];
                for (int var5 = 0; var5 < class180.field2826; ++var5) {
                    int var6 = class5.field73[var5];
                    if (this.field531 < var6 && ~(4096 - this.field531) < ~var6 && ~var4 < ~(-this.field531 + 2048) && var4 < this.field531 + 2048) {
                        int var7 = -var6 + 2048;
                        int var8 = ~var7 <= -1 ? var7 : -var7;
                        int var9 = var8 << 12;
                        int var10 = var9 / (-this.field531 + 2048);
                        var3[var5] = -var10 + 4096;
                    } else if (~(-this.field531 + 2048) > ~var6 && var6 < this.field531 + 2048) {
                        int var11 = var4 + -2048;
                        int var12 = var11 >= 0 ? var11 : -var11;
                        int var13 = var12 - this.field531;
                        int var14 = var13 << 12;
                        var3[var5] = var14 / (-this.field531 + 2048);
                    } else if (var4 >= this.field531 && ~var4 >= ~(4096 - this.field531)) {
                        if (~var6 <= ~this.field531 && ~var6 >= ~(-this.field531 + 4096)) {
                            var3[var5] = 0;
                        } else {
                            int var15 = -var4 + 2048;
                            int var16 = ~var15 > -1 ? -var15 : var15;
                            int var17 = var16 << 12;
                            int var18 = var17 / (-this.field531 + 2048);
                            var3[var5] = -var18 + 4096;
                        }
                    } else {
                        int var19 = var6 + -2048;
                        int var20 = ~var19 > -1 ? -var19 : var19;
                        int var21 = var20 - this.field531;
                        int var22 = var21 << 12;
                        var3[var5] = var22 / (-this.field531 + 2048);
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Lim;BI)V")
    public final void method35(class170 arg0, byte arg1, int arg2) {
        ++field530;
        if (arg1 < -43) {
            if (arg2 == 0) {
                this.field531 = arg0.method1186((byte) -94);
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "()V")
    public class44() {
        super(0, true);
    }
}
