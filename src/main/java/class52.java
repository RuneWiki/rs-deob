import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class52 extends class456 {

    @OriginalMember(owner = "client!gh", name = "K", descriptor = "I")
    private int field749 = 585;

    @OriginalMember(owner = "client!gh", name = "J", descriptor = "[B")
    public static byte[] field748 = new byte[2048];

    @OriginalMember(owner = "client!gh", name = "N", descriptor = "Lo;")
    public static class332 field752 = new class332("wave:", "welle:", "ondulation:", "onda:");

    @OriginalMember(owner = "client!gh", name = "O", descriptor = "I")
    public static int field753 = 0;

    @OriginalMember(owner = "client!gh", name = "H", descriptor = "I")
    public static int field746;

    @OriginalMember(owner = "client!gh", name = "I", descriptor = "I")
    public static int field747;

    @OriginalMember(owner = "client!gh", name = "L", descriptor = "I")
    public static int field750;

    @OriginalMember(owner = "client!gh", name = "M", descriptor = "I")
    public static int field751;

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(II)[I", line = 3)
    public final int[] method33(int arg0, int arg1) {
        if (arg0 != -1) {
            method382(-59, 75);
        }
        ++field751;
        int[] var3 = super.field6466.method2533(true, arg1);
        if (super.field6466.field6153) {
            int var4 = class14.field206[arg1];
            for (int var5 = 0; ~var5 > ~class156.field2169; ++var5) {
                int var6 = class288.field4397[var5];
                if (var6 > this.field749 && ~var6 > ~(4096 - this.field749) && ~var4 < ~(-this.field749 + 2048) && ~var4 > ~(2048 - -this.field749)) {
                    int var7 = -var6 + 2048;
                    int var8 = ~var7 > -1 ? -var7 : var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (-this.field749 + 2048);
                    var3[var5] = -var10 + 4096;
                } else if (~(-this.field749 + 2048) > ~var6 && var6 < 2048 - -this.field749) {
                    int var11 = var4 + -2048;
                    int var12 = ~var11 > -1 ? -var11 : var11;
                    int var13 = var12 - this.field749;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (-this.field749 + 2048);
                } else if (var4 >= this.field749 && ~var4 >= ~(-this.field749 + 4096)) {
                    if (var6 >= this.field749 && ~var6 >= ~(-this.field749 + 4096)) {
                        var3[var5] = 0;
                    } else {
                        int var15 = -var4 + 2048;
                        int var16 = var15 >= 0 ? var15 : -var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field749 + 2048);
                        var3[var5] = -var18 + 4096;
                    }
                } else {
                    int var19 = var6 + -2048;
                    int var20 = var19 < 0 ? -var19 : var19;
                    int var21 = var20 - this.field749;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (-this.field749 + 2048);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(B)V", line = 85)
    public static void method380(byte arg0) {
        if (arg0 != 57) {
            method380((byte) 63);
        }
        field748 = null;
        field752 = null;
    }

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "(I)V", line = 101)
    public static final void method381(int arg0) {
        if (arg0 == 4) {
            class216.field3215.method2401((byte) -33);
            ++field746;
        }
    }

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "(II)V", line = 115)
    public static final void method382(int arg0, int arg1) {
        ++field750;
        if (arg1 != -4397) {
            field748 = null;
        }
        class186 var2 = class275.method1789(arg0, (byte) 123, 4);
        var2.method1279((byte) -65);
    }

    @OriginalMember(owner = "client!gh", name = "<init>", descriptor = "()V", line = 128)
    public class52() {
        super(0, true);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IBLre;)V", line = 135)
    public final void method210(int arg0, byte arg1, class446 arg2) {
        ++field747;
        if (arg1 != 55) {
            this.field749 = -93;
        }
        if (~arg0 == -1) {
            this.field749 = arg2.method2631(arg1 ^ 2517);
        }
    }
}
