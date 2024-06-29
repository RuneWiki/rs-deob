import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class531 extends class30 {

    @OriginalMember(owner = "client!im", name = "H", descriptor = "I")
    private int field7186 = 585;

    @OriginalMember(owner = "client!im", name = "A", descriptor = "I")
    public static int field7180 = 0;

    @OriginalMember(owner = "client!im", name = "z", descriptor = "[I")
    public static int[] field7179 = new int[1000];

    @OriginalMember(owner = "client!im", name = "G", descriptor = "Lea;")
    public static class507 field7185 = new class507();

    @OriginalMember(owner = "client!im", name = "J", descriptor = "[I")
    public static int[] field7187 = new int[200];

    @OriginalMember(owner = "client!im", name = "C", descriptor = "I")
    public static int field7181;

    @OriginalMember(owner = "client!im", name = "D", descriptor = "I")
    public static int field7182;

    @OriginalMember(owner = "client!im", name = "F", descriptor = "I")
    public static int field7184;

    @OriginalMember(owner = "client!im", name = "E", descriptor = "Lqea;")
    public static class112 field7183;

    @OriginalMember(owner = "client!im", name = "d", descriptor = "(I)V")
    public static void method3018(int arg0) {
        field7179 = null;
        field7185 = null;
        field7183 = null;
        field7187 = null;
        if (arg0 != -2048) {
            method3018(108);
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(BILac;)V")
    public final void method27(byte arg0, int arg1, class501 arg2) {
        ++field7182;
        if (arg0 >= 100) {
            if (arg1 == 0) {
                this.field7186 = arg2.method2845(-1);
            }
        }
    }

    @OriginalMember(owner = "client!im", name = "<init>", descriptor = "()V")
    public class531() {
        super(0, true);
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(II)[I")
    public final int[] method48(int arg0, int arg1) {
        ++field7184;
        if (arg0 != 1) {
            field7180 = 49;
        }
        int[] var3 = super.field374.method3664(arg1, (byte) 8);
        if (super.field374.field9032) {
            int var4 = class430.field6016[arg1];
            for (int var5 = 0; var5 < class31.field399; ++var5) {
                int var6 = class48.field568[var5];
                if (~this.field7186 > ~var6 && ~(-this.field7186 + 4096) < ~var6 && var4 > -this.field7186 + 2048 && ~(this.field7186 + 2048) < ~var4) {
                    int var7 = -var6 + 2048;
                    int var8 = var7 >= 0 ? var7 : -var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (-this.field7186 + 2048);
                    var3[var5] = -var10 + 4096;
                } else if (var6 > -this.field7186 + 2048 && ~(this.field7186 + 2048) < ~var6) {
                    int var11 = var4 + -2048;
                    int var12 = var11 < 0 ? -var11 : var11;
                    int var13 = var12 - this.field7186;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (2048 - this.field7186);
                } else if (var4 >= this.field7186 && var4 <= 4096 - this.field7186) {
                    if (this.field7186 <= var6 && var6 <= -this.field7186 + 4096) {
                        var3[var5] = 0;
                    } else {
                        int var15 = -var4 + 2048;
                        int var16 = var15 < 0 ? -var15 : var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field7186 + 2048);
                        var3[var5] = -var18 + 4096;
                    }
                } else {
                    int var19 = var6 + -2048;
                    int var20 = var19 < 0 ? -var19 : var19;
                    int var21 = var20 - this.field7186;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (2048 - this.field7186);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IIIIIII)Lwn;")
    public static final class674 method3019(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field7181;
        if (arg3 != 13924) {
            field7183 = null;
        }
        long var7 = (long) arg6 * 32147369L ^ (long) arg2 * 97549L ^ (long) arg1 * 67481L ^ (long) arg4 * 475427L ^ (long) arg0 * 986053L ^ (long) arg5 * 76724863L;
        class674 var9 = (class674) class624.field8662.method3747((byte) -66, var7);
        if (var9 != null) {
            return var9;
        } else {
            class674 var10 = class610.field8463.method165(arg1, arg2, arg4, arg0, arg6, arg5);
            class624.field8662.method3748(var7, var10, arg3 ^ 1693);
            return var10;
        }
    }
}
