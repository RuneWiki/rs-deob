import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class335 extends class386 {

    @OriginalMember(owner = "client!bc", name = "C", descriptor = "I")
    private int field4446 = 4096;

    @OriginalMember(owner = "client!bc", name = "H", descriptor = "I")
    private int field4450 = 0;

    @OriginalMember(owner = "client!bc", name = "M", descriptor = "I")
    private int field4455 = 8192;

    @OriginalMember(owner = "client!bc", name = "E", descriptor = "I")
    private int field4447 = 12288;

    @OriginalMember(owner = "client!bc", name = "R", descriptor = "I")
    private int field4460 = 2048;

    @OriginalMember(owner = "client!bc", name = "S", descriptor = "I")
    private int field4461 = 2048;

    @OriginalMember(owner = "client!bc", name = "O", descriptor = "I")
    private int field4457 = 0;

    @OriginalMember(owner = "client!bc", name = "N", descriptor = "J")
    public static volatile long field4456 = 0L;

    @OriginalMember(owner = "client!bc", name = "F", descriptor = "[Lida;")
    public static class214[] field4448 = new class214[35];

    @OriginalMember(owner = "client!bc", name = "G", descriptor = "Lsq;")
    public static class161 field4449 = new class161(4, 1);

    @OriginalMember(owner = "client!bc", name = "T", descriptor = "F")
    public static float field4462;

    @OriginalMember(owner = "client!bc", name = "I", descriptor = "I")
    public static int field4451;

    @OriginalMember(owner = "client!bc", name = "J", descriptor = "I")
    public static int field4452;

    @OriginalMember(owner = "client!bc", name = "K", descriptor = "I")
    public static int field4453;

    @OriginalMember(owner = "client!bc", name = "L", descriptor = "I")
    public static int field4454;

    @OriginalMember(owner = "client!bc", name = "P", descriptor = "I")
    public static int field4458;

    @OriginalMember(owner = "client!bc", name = "Q", descriptor = "[Lf;")
    public static class701[] field4459;

    @OriginalMember(owner = "client!bc", name = "U", descriptor = "[Lf;")
    public static class701[] field4463;

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "()V")
    public class335() {
        super(0, true);
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IBLun;)V")
    public final void method355(int arg0, byte arg1, class389 arg2) {
        if (arg1 > 111) {
            ++field4458;
            if (~arg0 != -1) {
                if (~arg0 != -2) {
                    if (arg0 != 2) {
                        if (~arg0 != -4) {
                            if (~arg0 != -5) {
                                if (arg0 != 5) {
                                    if (arg0 == 6) {
                                        this.field4455 = arg2.method2260(-119);
                                    }
                                } else {
                                    this.field4446 = arg2.method2260(-96);
                                }
                            } else {
                                this.field4447 = arg2.method2260(-91);
                            }
                        } else {
                            this.field4461 = arg2.method2260(-95);
                        }
                    } else {
                        this.field4457 = arg2.method2260(-57);
                    }
                } else {
                    this.field4450 = arg2.method2260(-66);
                }
            } else {
                this.field4460 = arg2.method2260(-50);
            }
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)[I")
    public final int[] method359(int arg0, int arg1) {
        ++field4454;
        int[] var3 = super.field5140.method1564(arg0, true);
        int var4 = 47 / ((arg1 - 13) / 40);
        if (super.field5140.field3482) {
            int var5 = class562.field8114[arg0] + -2048;
            for (int var6 = 0; ~var6 > ~class599.field8643; ++var6) {
                int var7 = class152.field1879[var6] + -2048;
                int var8 = this.field4460 + var7;
                int var9 = ~var8 <= 2047 ? var8 : var8 + 4096;
                int var10 = var9 <= 2048 ? var9 : var9 + -4096;
                int var11 = this.field4450 + var5;
                int var12 = var11 >= -2048 ? var11 : var11 + 4096;
                int var13 = var12 > 2048 ? var12 - 4096 : var12;
                int var14 = this.field4457 + var7;
                int var15 = var14 < -2048 ? var14 + 4096 : var14;
                int var16 = ~var15 >= -2049 ? var15 : var15 - 4096;
                int var17 = this.field4461 + var5;
                int var18 = ~var17 <= 2047 ? var17 : var17 + 4096;
                int var19 = ~var18 >= -2049 ? var18 : var18 + -4096;
                var3[var6] = !this.method1934(var10, 255, var13) && !this.method1936(true, var19, var16) ? 0 : 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "(III)Z")
    private final boolean method1934(int arg0, int arg1, int arg2) {
        ++field4451;
        int var4 = (-arg0 + arg2) * this.field4447 >> 12;
        int var5 = class197.field2400[arg1 & var4 * 255 >> 12];
        int var6 = (var5 << 12) / this.field4447;
        int var7 = (var6 << 12) / this.field4455;
        int var8 = this.field4446 * var7 >> 12;
        return ~var8 < ~(arg0 + arg2) && -var8 < arg0 + arg2;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V")
    public final void method358(int arg0) {
        class265.method1609((byte) -126);
        if (arg0 < 0) {
            this.method359(98, 50);
        }
        ++field4453;
    }

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "(I)V")
    public static void method1935(int arg0) {
        field4463 = null;
        field4449 = null;
        field4459 = null;
        field4448 = null;
        if (arg0 < 68) {
            field4462 = 0.21950948F;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ZII)Z")
    private final boolean method1936(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            method1935(-6);
        }
        ++field4452;
        int var4 = (arg1 + arg2) * this.field4447 >> 12;
        int var5 = class197.field2400[var4 * 255 >> 12 & 255];
        int var6 = (var5 << 12) / this.field4447;
        int var7 = (var6 << 12) / this.field4455;
        int var8 = this.field4446 * var7 >> 12;
        return var8 > arg1 - arg2 && ~(-var8) > ~(arg1 - arg2);
    }
}
