import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class240 extends class273 {

    @OriginalMember(owner = "client!tl", name = "V", descriptor = "I")
    private int field3789 = 585;

    @OriginalMember(owner = "client!tl", name = "U", descriptor = "Ljava/lang/String;")
    public static String field3788 = " has logged in.";

    @OriginalMember(owner = "client!tl", name = "W", descriptor = "[I")
    public static int[] field3790 = new int[] { 12543016, 15504954, 15914854, 16773818 };

    @OriginalMember(owner = "client!tl", name = "J", descriptor = "I")
    public static int field3777;

    @OriginalMember(owner = "client!tl", name = "L", descriptor = "I")
    public static int field3779;

    @OriginalMember(owner = "client!tl", name = "M", descriptor = "I")
    public static int field3780;

    @OriginalMember(owner = "client!tl", name = "N", descriptor = "I")
    public static int field3781;

    @OriginalMember(owner = "client!tl", name = "O", descriptor = "I")
    public static int field3782;

    @OriginalMember(owner = "client!tl", name = "P", descriptor = "I")
    public static int field3783;

    @OriginalMember(owner = "client!tl", name = "Q", descriptor = "I")
    public static int field3784;

    @OriginalMember(owner = "client!tl", name = "R", descriptor = "I")
    public static int field3785;

    @OriginalMember(owner = "client!tl", name = "T", descriptor = "I")
    public static int field3787;

    @OriginalMember(owner = "client!tl", name = "X", descriptor = "I")
    public static int field3791;

    @OriginalMember(owner = "client!tl", name = "K", descriptor = "Lsb;")
    public static class124 field3778;

    @OriginalMember(owner = "client!tl", name = "Y", descriptor = "Lsb;")
    public static class124 field3792;

    @OriginalMember(owner = "client!tl", name = "S", descriptor = "[[[I")
    public static int[][][] field3786;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(ZI)[I")
    public final int[] method4(boolean arg0, int arg1) {
        if (arg0) {
            method1582(false);
        }
        ++field3782;
        int[] var3 = super.field4359.method387((byte) -48, arg1);
        if (super.field4359.field833) {
            int var4 = class255.field4068[arg1];
            for (int var5 = 0; ~class26.field458 < ~var5; ++var5) {
                int var6 = class265.field4234[var5];
                if (var6 > this.field3789 && ~var6 > ~(4096 - this.field3789) && ~(-this.field3789 + 2048) > ~var4 && ~(this.field3789 + 2048) < ~var4) {
                    int var7 = 2048 - var6;
                    int var8 = var7 >= 0 ? var7 : -var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (-this.field3789 + 2048);
                    var3[var5] = 4096 - var10;
                } else if (~var6 < ~(-this.field3789 + 2048) && var6 < this.field3789 + 2048) {
                    int var11 = var4 - 2048;
                    int var12 = var11 < 0 ? -var11 : var11;
                    int var13 = var12 - this.field3789;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (-this.field3789 + 2048);
                } else if (this.field3789 <= var4 && ~(-this.field3789 + 4096) <= ~var4) {
                    if (this.field3789 <= var6 && ~var6 >= ~(-this.field3789 + 4096)) {
                        var3[var5] = 0;
                    } else {
                        int var15 = -var4 + 2048;
                        int var16 = var15 >= 0 ? var15 : -var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field3789 + 2048);
                        var3[var5] = 4096 - var18;
                    }
                } else {
                    int var19 = var6 - 2048;
                    int var20 = ~var19 > -1 ? -var19 : var19;
                    int var21 = var20 - this.field3789;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (-this.field3789 + 2048);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "(Z)V")
    public static void method1582(boolean arg0) {
        field3788 = null;
        field3792 = null;
        if (arg0) {
            field3780 = -75;
        }
        field3786 = null;
        field3790 = null;
        field3778 = null;
    }

    @OriginalMember(owner = "client!tl", name = "<init>", descriptor = "()V")
    public class240() {
        super(0, true);
    }

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "(I)V")
    public static final void method1583(int arg0) {
        if (arg0 == -20197) {
            ++field3779;
            if (class146.field2401 == 30) {
                class274.method1856(25, arg0 ^ -20194);
            }
        }
    }

    @OriginalMember(owner = "client!tl", name = "f", descriptor = "(I)V")
    public static final void method1584(int arg0) {
        ++field3791;
        if (arg0 != 30) {
            field3792 = null;
        }
        if (!class107.field1630) {
            if (!class256.field4075) {
                class290.field4630 += (-class290.field4630 + -24.0F) / 2.0F;
            } else {
                class1.field1 = (float) ((int) class1.field1 + -65 & -128);
            }
            class107.field1630 = true;
            class10.field141 = true;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(BI)V")
    public static final void method1585(byte arg0, int arg1) {
        ++field3787;
        if (arg0 > -73) {
            method1584(-96);
        }
        class61.field1037.method1163(arg1, false);
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lig;II)V")
    public final void method2(class136 arg0, int arg1, int arg2) {
        if (arg2 != 5) {
            this.method2((class136) null, 44, 36);
        }
        if (arg1 == 0) {
            this.field3789 = arg0.method996(65280);
        }
        ++field3785;
    }
}
