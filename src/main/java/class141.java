import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class141 extends class14 {

    @OriginalMember(owner = "client!ta", name = "P", descriptor = "I")
    private int field2048 = 585;

    @OriginalMember(owner = "client!ta", name = "J", descriptor = "I")
    public static int field2042 = 0;

    @OriginalMember(owner = "client!ta", name = "K", descriptor = "I")
    public static int field2043;

    @OriginalMember(owner = "client!ta", name = "L", descriptor = "I")
    public static int field2044;

    @OriginalMember(owner = "client!ta", name = "O", descriptor = "Lmk;")
    public static class39 field2047;

    @OriginalMember(owner = "client!ta", name = "M", descriptor = "Lia;")
    public static class414 field2045;

    @OriginalMember(owner = "client!ta", name = "Q", descriptor = "[Lna;")
    public static class35[] field2049;

    @OriginalMember(owner = "client!ta", name = "N", descriptor = "[Lf;")
    public static class529[] field2046;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IB)[I")
    public final int[] method140(int arg0, byte arg1) {
        if (arg1 >= -2) {
            this.method147(-84, (byte) -109, (class379) null);
        }
        ++field2043;
        int[] var3 = super.field270.method2263(-29596, arg0);
        if (super.field270.field5222) {
            int var4 = class273.field3590[arg0];
            for (int var5 = 0; class115.field1637 > var5; ++var5) {
                int var6 = class195.field2715[var5];
                if (~var6 < ~this.field2048 && var6 < -this.field2048 + 4096 && -this.field2048 + 2048 < var4 && ~(this.field2048 + 2048) < ~var4) {
                    int var7 = -var6 + 2048;
                    int var8 = ~var7 > -1 ? -var7 : var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (-this.field2048 + 2048);
                    var3[var5] = -var10 + 4096;
                } else if (-this.field2048 + 2048 < var6 && ~(this.field2048 + 2048) < ~var6) {
                    int var11 = var4 - 2048;
                    int var12 = ~var11 > -1 ? -var11 : var11;
                    int var13 = var12 - this.field2048;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (2048 - this.field2048);
                } else if (~this.field2048 >= ~var4 && ~(-this.field2048 + 4096) <= ~var4) {
                    if (this.field2048 <= var6 && ~(4096 - this.field2048) <= ~var6) {
                        var3[var5] = 0;
                    } else {
                        int var15 = -var4 + 2048;
                        int var16 = ~var15 <= -1 ? var15 : -var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field2048 + 2048);
                        var3[var5] = -var18 + 4096;
                    }
                } else {
                    int var19 = var6 + -2048;
                    int var20 = ~var19 > -1 ? -var19 : var19;
                    int var21 = var20 - this.field2048;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (2048 - this.field2048);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "()V")
    public class141() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IBLmd;)V")
    public final void method147(int arg0, byte arg1, class379 arg2) {
        int var4 = 16 % ((-51 - arg1) / 37);
        if (~arg0 == -1) {
            this.field2048 = arg2.method2212((byte) 83);
        }
        ++field2044;
    }

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "(I)V")
    public static void method994(int arg0) {
        field2045 = null;
        if (arg0 != 12) {
            method994(-104);
        }
        field2049 = null;
        field2047 = null;
        field2046 = null;
    }
}
