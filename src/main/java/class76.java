import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tt")
public class class76 extends class82 {

    @OriginalMember(owner = "client!tt", name = "P", descriptor = "I")
    private int field884 = 8192;

    @OriginalMember(owner = "client!tt", name = "Q", descriptor = "I")
    private int field885 = 2048;

    @OriginalMember(owner = "client!tt", name = "U", descriptor = "I")
    private int field889 = 2048;

    @OriginalMember(owner = "client!tt", name = "T", descriptor = "I")
    private int field888 = 0;

    @OriginalMember(owner = "client!tt", name = "Y", descriptor = "I")
    private int field893 = 12288;

    @OriginalMember(owner = "client!tt", name = "V", descriptor = "I")
    private int field890 = 4096;

    @OriginalMember(owner = "client!tt", name = "X", descriptor = "I")
    private int field892 = 0;

    @OriginalMember(owner = "client!tt", name = "ab", descriptor = "F")
    public static float field895 = 1.0F;

    @OriginalMember(owner = "client!tt", name = "M", descriptor = "I")
    public static int field881 = 0;

    @OriginalMember(owner = "client!tt", name = "L", descriptor = "I")
    public static int field880;

    @OriginalMember(owner = "client!tt", name = "N", descriptor = "I")
    public static int field882;

    @OriginalMember(owner = "client!tt", name = "O", descriptor = "I")
    public static int field883;

    @OriginalMember(owner = "client!tt", name = "R", descriptor = "I")
    public static int field886;

    @OriginalMember(owner = "client!tt", name = "W", descriptor = "I")
    public static int field891;

    @OriginalMember(owner = "client!tt", name = "Z", descriptor = "I")
    public static int field894;

    @OriginalMember(owner = "client!tt", name = "S", descriptor = "Lvq;")
    public static class390 field887;

    @OriginalMember(owner = "client!tt", name = "<init>", descriptor = "()V", line = 3)
    public class76() {
        super(0, true);
    }

    @OriginalMember(owner = "client!tt", name = "e", descriptor = "(III)Z", line = 15)
    private final boolean method435(int arg0, int arg1, int arg2) {
        ++field891;
        int var4 = -24 % ((25 - arg0) / 43);
        int var5 = (arg2 - -arg1) * this.field893 >> 12;
        int var6 = class326.field4164[(1048182 & var5 * 255) >> 12];
        int var7 = (var6 << 12) / this.field893;
        int var8 = (var7 << 12) / this.field884;
        int var9 = this.field890 * var8 >> 12;
        return ~var9 < ~(-arg1 + arg2) && -var9 < -arg1 + arg2;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(IILos;)V", line = 34)
    public final void method198(int arg0, int arg1, class374 arg2) {
        ++field886;
        int var4 = 96 / ((-69 - arg1) / 42);
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (~arg0 != -5) {
                            if (arg0 != 5) {
                                if (~arg0 == -7) {
                                    this.field884 = arg2.method2136(false);
                                }
                            } else {
                                this.field890 = arg2.method2136(false);
                            }
                        } else {
                            this.field893 = arg2.method2136(false);
                        }
                    } else {
                        this.field889 = arg2.method2136(false);
                    }
                } else {
                    this.field892 = arg2.method2136(false);
                }
            } else {
                this.field888 = arg2.method2136(false);
            }
        } else {
            this.field885 = arg2.method2136(false);
        }
    }

    @OriginalMember(owner = "client!tt", name = "h", descriptor = "(I)V", line = 112)
    public static void method436(int arg0) {
        if (arg0 == -4096) {
            field887 = null;
        }
    }

    @OriginalMember(owner = "client!tt", name = "c", descriptor = "(II)[I", line = 141)
    public final int[] method201(int arg0, int arg1) {
        if (arg1 != 12218) {
            method436(-20);
        }
        ++field883;
        int[] var3 = super.field990.method1566((byte) 116, arg0);
        if (super.field990.field3641) {
            int var4 = class85.field1036[arg0] + -2048;
            for (int var5 = 0; ~class629.field9033 < ~var5; ++var5) {
                int var6 = class366.field4817[var5] + -2048;
                int var7 = this.field885 + var6;
                int var8 = var7 >= -2048 ? var7 : var7 + 4096;
                int var9 = var8 > 2048 ? var8 + -4096 : var8;
                int var10 = this.field888 + var4;
                int var11 = var10 >= -2048 ? var10 : var10 + 4096;
                int var12 = ~var11 >= -2049 ? var11 : var11 + -4096;
                int var13 = this.field892 + var6;
                int var14 = ~var13 > 2047 ? var13 + 4096 : var13;
                int var15 = var14 <= 2048 ? var14 : var14 + -4096;
                int var16 = var4 - -this.field889;
                int var17 = ~var16 > 2047 ? var16 - -4096 : var16;
                int var18 = ~var17 >= -2049 ? var17 : var17 - 4096;
                var3[var5] = !this.method437(var12, -125, var9) && !this.method435(-68, var15, var18) ? 0 : 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tt", name = "f", descriptor = "(III)Z", line = 197)
    private final boolean method437(int arg0, int arg1, int arg2) {
        ++field882;
        int var4 = (arg0 - arg2) * this.field893 >> 12;
        int var5 = class326.field4164[(var4 * 255 & 1046451) >> 12];
        int var6 = (var5 << 12) / this.field893;
        int var7 = 116 / ((arg1 - -91) / 32);
        int var8 = (var6 << 12) / this.field884;
        int var9 = this.field890 * var8 >> 12;
        return ~(arg0 + arg2) > ~var9 && ~(arg0 + arg2) < ~(-var9);
    }

    @OriginalMember(owner = "client!tt", name = "c", descriptor = "(I)V", line = 218)
    public final void method438(int arg0) {
        ++field880;
        class623.method3571(-120);
        if (arg0 != -2) {
            method436(45);
        }
    }
}
