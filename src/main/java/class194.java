import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class194 extends class214 {

    @OriginalMember(owner = "client!hd", name = "M", descriptor = "I")
    private int field2760 = 585;

    @OriginalMember(owner = "client!hd", name = "K", descriptor = "I")
    public static int field2758;

    @OriginalMember(owner = "client!hd", name = "L", descriptor = "I")
    public static int field2759;

    @OriginalMember(owner = "client!hd", name = "N", descriptor = "I")
    public static int field2761;

    @OriginalMember(owner = "client!hd", name = "J", descriptor = "Lwp;")
    public static class77 field2757;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(BIII)V", line = 5)
    public static final void method1238(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 == 81) {
            int var4 = class47.field766 * arg3 >> 8;
            ++field2759;
            if (~var4 != -1 && arg1 != -1) {
                class2.method8(var4, false, arg1, class172.field2548, 0, (byte) 106);
                class7.field122 = true;
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "(I)V", line = 25)
    public static void method1239(int arg0) {
        field2757 = null;
        if (arg0 < 69) {
            field2757 = null;
        }
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "()V", line = 35)
    public class194() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Llk;II)V", line = 39)
    public final void method15(class425 arg0, int arg1, int arg2) {
        if (~arg2 == -1) {
            this.field2760 = arg0.method2508(true);
        }
        if (arg1 >= -114) {
            this.method15((class425) null, -128, 37);
        }
        ++field2758;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(BI)[I", line = 68)
    public final int[] method14(byte arg0, int arg1) {
        ++field2761;
        if (arg0 != 123) {
            method1239(25);
        }
        int[] var3 = super.field3024.method2585(arg1, 0);
        if (super.field3024.field6135) {
            int var4 = class56.field909[arg1];
            for (int var5 = 0; ~class399.field5585 < ~var5; ++var5) {
                int var6 = class436.field5989[var5];
                if (~var6 < ~this.field2760 && var6 < -this.field2760 + 4096 && -this.field2760 + 2048 < var4 && this.field2760 + 2048 > var4) {
                    int var7 = -var6 + 2048;
                    int var8 = var7 < 0 ? -var7 : var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (-this.field2760 + 2048);
                    var3[var5] = -var10 + 4096;
                } else if (~(-this.field2760 + 2048) > ~var6 && var6 < this.field2760 + 2048) {
                    int var11 = var4 + -2048;
                    int var12 = var11 < 0 ? -var11 : var11;
                    int var13 = var12 - this.field2760;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (-this.field2760 + 2048);
                } else if (~var4 <= ~this.field2760 && -this.field2760 + 4096 >= var4) {
                    if (this.field2760 <= var6 && ~var6 >= ~(-this.field2760 + 4096)) {
                        var3[var5] = 0;
                    } else {
                        int var15 = -var4 + 2048;
                        int var16 = var15 >= 0 ? var15 : -var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field2760 + 2048);
                        var3[var5] = -var18 + 4096;
                    }
                } else {
                    int var19 = var6 + -2048;
                    int var20 = var19 < 0 ? -var19 : var19;
                    int var21 = var20 - this.field2760;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (-this.field2760 + 2048);
                }
            }
        }
        return var3;
    }
}
