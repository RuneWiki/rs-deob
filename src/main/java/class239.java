import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dt")
public class class239 extends class56 {

    @OriginalMember(owner = "client!dt", name = "F", descriptor = "I")
    private int field3188 = 2048;

    @OriginalMember(owner = "client!dt", name = "J", descriptor = "I")
    private int field3191 = 10;

    @OriginalMember(owner = "client!dt", name = "I", descriptor = "I")
    private int field3190 = 0;

    @OriginalMember(owner = "client!dt", name = "N", descriptor = "[Leh;")
    public static class360[] field3195 = new class360[5];

    @OriginalMember(owner = "client!dt", name = "O", descriptor = "[Lmga;")
    public static class709[] field3196;

    @OriginalMember(owner = "client!dt", name = "D", descriptor = "I")
    public static int field3186;

    @OriginalMember(owner = "client!dt", name = "G", descriptor = "I")
    public static int field3189;

    @OriginalMember(owner = "client!dt", name = "K", descriptor = "I")
    public static int field3192;

    @OriginalMember(owner = "client!dt", name = "M", descriptor = "I")
    public static int field3194;

    @OriginalMember(owner = "client!dt", name = "E", descriptor = "[I")
    private int[] field3187;

    @OriginalMember(owner = "client!dt", name = "L", descriptor = "[I")
    private int[] field3193;

    static {
        for (int var0 = 0; field3195.length > var0; ++var0) {
            field3195[var0] = new class360();
        }
        field3196 = new class709[14];
    }

    @OriginalMember(owner = "client!dt", name = "<init>", descriptor = "()V", line = 3)
    public class239() {
        super(0, true);
    }

    @OriginalMember(owner = "client!dt", name = "b", descriptor = "(I)V", line = 10)
    public final void method364(int arg0) {
        if (arg0 != 7) {
            method1526(-53);
        }
        ++field3186;
        this.method1527(false);
    }

    @OriginalMember(owner = "client!dt", name = "e", descriptor = "(I)V", line = 21)
    public static void method1526(int arg0) {
        field3196 = null;
        field3195 = null;
        if (arg0 != 0) {
            method1526(95);
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(IZ)[I", line = 32)
    public final int[] method24(int arg0, boolean arg1) {
        ++field3189;
        if (!arg1) {
            this.method364(-84);
        }
        int[] var3 = super.field673.method3270(arg0, (byte) -42);
        if (super.field673.field8073) {
            int var4 = class720.field10000[arg0];
            if (this.field3190 == 0) {
                short var5 = 0;
                for (int var6 = 0; var6 < this.field3191; ++var6) {
                    if (this.field3193[var6] <= var4 && var4 < this.field3193[var6 - -1]) {
                        if (this.field3187[var6] > var4) {
                            var5 = 4096;
                        }
                        break;
                    }
                }
                class255.method1691(var3, 0, class328.field4576, var5);
            } else {
                for (int var7 = 0; var7 < class328.field4576; ++var7) {
                    int var8 = 0;
                    short var9 = 0;
                    int var10 = class132.field1945[var7];
                    int var11 = this.field3190;
                    if (~var11 != -2) {
                        if (var11 != 2) {
                            if (var11 == 3) {
                                var8 = (var10 - var4 >> 1) + 2048;
                            }
                        } else {
                            var8 = 2048 - -(var4 + -4096 + var10 >> 1);
                        }
                    } else {
                        var8 = var10;
                    }
                    for (int var12 = 0; this.field3191 > var12; ++var12) {
                        if (this.field3193[var12] <= var8 && ~var8 > ~this.field3193[var12 - -1]) {
                            if (~var8 > ~this.field3187[var12]) {
                                var9 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var7] = var9;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(Z)V", line = 151)
    private final void method1527(boolean arg0) {
        ++field3192;
        this.field3187 = new int[this.field3191 + 1];
        int var2 = 0;
        this.field3193 = new int[this.field3191 + 1];
        int var3 = 4096 / this.field3191;
        int var4 = this.field3188 * var3 >> 12;
        if (arg0) {
            this.field3193 = null;
        }
        for (int var5 = 0; this.field3191 > var5; ++var5) {
            this.field3193[var5] = var2;
            this.field3187[var5] = var2 + var4;
            var2 += var3;
        }
        this.field3193[this.field3191] = 4096;
        this.field3187[this.field3191] = this.field3187[0] + 4096;
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(ILee;I)V", line = 193)
    public final void method6(int arg0, class675 arg1, int arg2) {
        if (arg0 != 3731) {
            this.field3191 = 19;
        }
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    this.field3190 = arg1.method3750((byte) 35);
                }
            } else {
                this.field3188 = arg1.method3757((byte) -65);
            }
        } else {
            this.field3191 = arg1.method3750((byte) 35);
        }
        ++field3194;
    }
}
