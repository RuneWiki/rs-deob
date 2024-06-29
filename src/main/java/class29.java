import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class29 extends class33 {

    @OriginalMember(owner = "client!ch", name = "P", descriptor = "Z")
    private boolean field595 = true;

    @OriginalMember(owner = "client!ch", name = "W", descriptor = "I")
    private int field602 = 4096;

    @OriginalMember(owner = "client!ch", name = "O", descriptor = "Lrd;")
    public static class173 field594 = class133.method843("mapdots", 38);

    @OriginalMember(owner = "client!ch", name = "R", descriptor = "I")
    public static int field597 = 7759444;

    @OriginalMember(owner = "client!ch", name = "X", descriptor = "Lrd;")
    public static class173 field603 = class133.method843("::gc", -115);

    @OriginalMember(owner = "client!ch", name = "M", descriptor = "I")
    public static int field592;

    @OriginalMember(owner = "client!ch", name = "N", descriptor = "I")
    public static int field593;

    @OriginalMember(owner = "client!ch", name = "Q", descriptor = "I")
    public static int field596;

    @OriginalMember(owner = "client!ch", name = "S", descriptor = "I")
    public static int field598;

    @OriginalMember(owner = "client!ch", name = "T", descriptor = "I")
    public static int field599;

    @OriginalMember(owner = "client!ch", name = "U", descriptor = "I")
    public static int field600;

    @OriginalMember(owner = "client!ch", name = "V", descriptor = "I")
    public static int field601;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Z)V")
    public static void method228(boolean arg0) {
        if (!arg0) {
            method229((byte) 2, 127);
        }
        field603 = null;
        field594 = null;
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(II)[[I")
    public final int[][] method178(int arg0, int arg1) {
        if (arg0 < 112) {
            method228(true);
        }
        int[][] var3 = super.field731.method1340(-119, arg1);
        ++field598;
        if (super.field731.field3925) {
            int[] var4 = this.method262(class26.field545 & arg1 + -1, 5, 0);
            int[] var5 = this.method262(arg1, -122, 0);
            int[] var6 = this.method262(class26.field545 & arg1 + 1, 43, 0);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; ~class117.field2173 < ~var10; ++var10) {
                int var11 = (var6[var10] + -var4[var10]) * this.field602;
                int var12 = var11 >> 12;
                int var13 = (var5[var10 - -1 & class125.field2347] + -var5[var10 - 1 & class125.field2347]) * this.field602;
                int var14 = var13 >> 12;
                int var15 = var14 * var14 >> 12;
                int var16 = var12 * var12 >> 12;
                int var17 = (int) (Math.sqrt((double) ((float) (var15 + var16 + 4096) / 4096.0F)) * 4096.0D);
                int var18;
                int var19;
                int var20;
                if (var17 == 0) {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                } else {
                    var19 = var11 / var17;
                    var20 = var13 / var17;
                    var18 = 16777216 / var17;
                }
                if (this.field595) {
                    var18 = 2048 - -(var18 >> 1);
                    var19 = 2048 - -(var19 >> 1);
                    var20 = 2048 - -(var20 >> 1);
                }
                var7[var10] = var20;
                var8[var10] = var19;
                var9[var10] = var18;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(BI)I")
    public static final int method229(byte arg0, int arg1) {
        if (arg0 != -107) {
            return 113;
        } else {
            ++field599;
            return arg1 >>> 8;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IILmb;)V")
    public final void method177(int arg0, int arg1, class121 arg2) {
        ++field601;
        if (arg1 > -99) {
            field603 = null;
        }
        if (~arg0 != -1) {
            if (~arg0 == -2) {
                this.field595 = ~arg2.method751((byte) -36) == -2;
            }
        } else {
            this.field602 = arg2.method755((byte) -115);
        }
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "()V")
    public class29() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "(I)V")
    public static final void method230(int arg0) {
        ++field596;
        class189 var1 = (class189) class108.field2017.method915(-1);
        if (arg0 == 2048) {
            while (var1 != null) {
                if (var1.field3704 != -1) {
                    var1.method824((byte) -122);
                } else {
                    var1.field3701 = 0;
                    class164.method1054(true, var1);
                }
                var1 = (class189) class108.field2017.method910((byte) 88);
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "(III)Lqf;")
    public static final class165 method231(int arg0, int arg1, int arg2) {
        ++field593;
        class165 var3 = class103.method639(arg0, true);
        if (arg2 != -1) {
            field597 = -115;
        }
        if (~arg1 == 0) {
            return var3;
        } else {
            return var3 != null && var3.field3067 != null && arg1 < var3.field3067.length ? var3.field3067[arg1] : null;
        }
    }
}
