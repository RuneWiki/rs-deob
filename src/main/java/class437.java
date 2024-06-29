import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public class class437 extends class529 {

    @OriginalMember(owner = "client!vr", name = "L", descriptor = "I")
    private int field6141 = 585;

    @OriginalMember(owner = "client!vr", name = "D", descriptor = "[I")
    public static int[] field6134 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

    @OriginalMember(owner = "client!vr", name = "K", descriptor = "F")
    public static float field6140 = 1.0F;

    @OriginalMember(owner = "client!vr", name = "H", descriptor = "Lmq;")
    public static class78 field6138 = new class78(49, 4);

    @OriginalMember(owner = "client!vr", name = "E", descriptor = "I")
    public static int field6135;

    @OriginalMember(owner = "client!vr", name = "F", descriptor = "I")
    public static int field6136;

    @OriginalMember(owner = "client!vr", name = "G", descriptor = "I")
    public static int field6137;

    @OriginalMember(owner = "client!vr", name = "J", descriptor = "I")
    public static int field6139;

    @OriginalMember(owner = "client!vr", name = "M", descriptor = "I")
    public static int field6142;

    @OriginalMember(owner = "client!vr", name = "N", descriptor = "I")
    public static int field6143;

    @OriginalMember(owner = "client!vr", name = "<init>", descriptor = "()V", line = 10)
    public class437() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vr", name = "f", descriptor = "(I)V", line = 14)
    public static void method2580(int arg0) {
        field6134 = null;
        if (arg0 == 2048) {
            field6138 = null;
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(IBLtn;)V", line = 25)
    public final void method190(int arg0, byte arg1, class179 arg2) {
        if (arg1 < 45) {
            field6143 = 75;
        }
        if (~arg0 == -1) {
            this.field6141 = arg2.method1107(false);
        }
        ++field6139;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(IB)[I", line = 52)
    public final int[] method191(int arg0, byte arg1) {
        ++field6137;
        int var3 = 54 % ((arg1 - 27) / 49);
        int[] var4 = super.field7456.method1635(arg0, -82);
        if (super.field7456.field3449) {
            int var5 = class310.field3960[arg0];
            for (int var6 = 0; var6 < class304.field3909; ++var6) {
                int var7 = class225.field2973[var6];
                if (var7 > this.field6141 && ~var7 > ~(-this.field6141 + 4096) && ~(-this.field6141 + 2048) > ~var5 && this.field6141 + 2048 > var5) {
                    int var8 = -var7 + 2048;
                    int var9 = ~var8 <= -1 ? var8 : -var8;
                    int var10 = var9 << 12;
                    int var11 = var10 / (-this.field6141 + 2048);
                    var4[var6] = -var11 + 4096;
                } else if (~var7 < ~(-this.field6141 + 2048) && ~(this.field6141 + 2048) < ~var7) {
                    int var12 = var5 + -2048;
                    int var13 = ~var12 > -1 ? -var12 : var12;
                    int var14 = var13 - this.field6141;
                    int var15 = var14 << 12;
                    var4[var6] = var15 / (-this.field6141 + 2048);
                } else if (this.field6141 <= var5 && ~var5 >= ~(-this.field6141 + 4096)) {
                    if (this.field6141 <= var7 && ~var7 >= ~(-this.field6141 + 4096)) {
                        var4[var6] = 0;
                    } else {
                        int var16 = -var5 + 2048;
                        int var17 = ~var16 > -1 ? -var16 : var16;
                        int var18 = var17 << 12;
                        int var19 = var18 / (-this.field6141 + 2048);
                        var4[var6] = -var19 + 4096;
                    }
                } else {
                    int var20 = var7 + -2048;
                    int var21 = var20 >= 0 ? var20 : -var20;
                    int var22 = var21 - this.field6141;
                    int var23 = var22 << 12;
                    var4[var6] = var23 / (-this.field6141 + 2048);
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "(II)Z", line = 131)
    public static final boolean method2581(int arg0, int arg1) {
        ++field6142;
        if (arg0 != -18) {
            method2580(14);
        }
        return arg1 >= 12 && ~arg1 >= -18;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;", line = 142)
    public static final String method2582(int arg0, String arg1) {
        ++field6136;
        if (!class525.field7419.startsWith("win")) {
            if (class525.field7419.startsWith("linux")) {
                return "lib" + arg1 + ".so";
            } else if (class525.field7419.startsWith("mac")) {
                return "lib" + arg1 + ".dylib";
            } else {
                if (arg0 != -271) {
                    field6140 = 0.9165901F;
                }
                return null;
            }
        } else {
            return arg1 + ".dll";
        }
    }
}
