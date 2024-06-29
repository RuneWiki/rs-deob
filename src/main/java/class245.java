import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public class class245 extends class535 {

    @OriginalMember(owner = "client!ws", name = "I", descriptor = "I")
    private int field3663 = 10;

    @OriginalMember(owner = "client!ws", name = "N", descriptor = "I")
    private int field3668 = 2048;

    @OriginalMember(owner = "client!ws", name = "T", descriptor = "I")
    private int field3674 = 0;

    @OriginalMember(owner = "client!ws", name = "P", descriptor = "I")
    public static int field3670 = 0;

    @OriginalMember(owner = "client!ws", name = "L", descriptor = "Lqt;")
    public static class459 field3666 = new class459(24, 8);

    @OriginalMember(owner = "client!ws", name = "S", descriptor = "[J")
    public static long[] field3673 = new long[32];

    @OriginalMember(owner = "client!ws", name = "G", descriptor = "I")
    public static int field3661;

    @OriginalMember(owner = "client!ws", name = "H", descriptor = "I")
    public static int field3662;

    @OriginalMember(owner = "client!ws", name = "J", descriptor = "I")
    public static int field3664;

    @OriginalMember(owner = "client!ws", name = "M", descriptor = "I")
    public static int field3667;

    @OriginalMember(owner = "client!ws", name = "O", descriptor = "I")
    public static int field3669;

    @OriginalMember(owner = "client!ws", name = "Q", descriptor = "I")
    public static int field3671;

    @OriginalMember(owner = "client!ws", name = "R", descriptor = "I")
    public static int field3672;

    @OriginalMember(owner = "client!ws", name = "U", descriptor = "I")
    public static int field3675;

    @OriginalMember(owner = "client!ws", name = "F", descriptor = "[I")
    private int[] field3660;

    @OriginalMember(owner = "client!ws", name = "K", descriptor = "[I")
    private int[] field3665;

    @OriginalMember(owner = "client!ws", name = "e", descriptor = "(B)V")
    public final void method66(byte arg0) {
        ++field3667;
        if (arg0 <= 111) {
            field3672 = 36;
        }
        this.method1610(false);
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(ILwn;I)V")
    public final void method60(int arg0, class519 arg1, int arg2) {
        if (arg2 != -6232) {
            this.field3665 = null;
        }
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    this.field3674 = arg1.method3072((byte) -123);
                }
            } else {
                this.field3668 = arg1.method3018(566990904);
            }
        } else {
            this.field3663 = arg1.method3072((byte) -125);
        }
        ++field3675;
    }

    @OriginalMember(owner = "client!ws", name = "<init>", descriptor = "()V")
    public class245() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ws", name = "c", descriptor = "(II)I")
    public static final int method1606(int arg0, int arg1) {
        ++field3662;
        if (arg1 != 32) {
            method1609(-113);
        }
        return arg0 >>> 10;
    }

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "(II)[I")
    public final int[] method65(int arg0, int arg1) {
        ++field3661;
        int[] var3 = super.field7885.method974(-30531, arg0);
        if (arg1 != 1) {
            method1606(-3, 35);
        }
        if (super.field7885.field2086) {
            int var4 = class448.field6442[arg0];
            if (this.field3674 != 0) {
                for (int var5 = 0; var5 < class174.field2597; ++var5) {
                    int var6 = 0;
                    short var7 = 0;
                    int var8 = class539.field7939[var5];
                    int var9 = this.field3674;
                    if (~var9 != -2) {
                        if (var9 != 2) {
                            if (var9 == 3) {
                                var6 = (var8 - var4 >> 1) + 2048;
                            }
                        } else {
                            var6 = 2048 - -(var8 - (-var4 + 4096) >> 1);
                        }
                    } else {
                        var6 = var8;
                    }
                    for (int var10 = 0; ~this.field3663 < ~var10; ++var10) {
                        if (var6 >= this.field3660[var10] && var6 < this.field3660[var10 - -1]) {
                            if (~this.field3665[var10] < ~var6) {
                                var7 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var5] = var7;
                }
            } else {
                short var11 = 0;
                for (int var12 = 0; var12 < this.field3663; ++var12) {
                    if (var4 >= this.field3660[var12] && ~var4 > ~this.field3660[var12 + 1]) {
                        if (~this.field3665[var12] < ~var4) {
                            var11 = 4096;
                        }
                        break;
                    }
                }
                class282.method1821(var3, 0, class174.field2597, var11);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(IIB)I")
    public static final int method1607(int arg0, int arg1, byte arg2) {
        ++field3671;
        if (arg2 > -97) {
            return -99;
        } else {
            return ~arg0 != -2 && ~arg0 != -4 ? class497.field7209[3 & arg1] : class421.field5974[3 & arg1];
        }
    }

    @OriginalMember(owner = "client!ws", name = "f", descriptor = "(B)V")
    public static void method1608(byte arg0) {
        if (arg0 != 9) {
            field3672 = -120;
        }
        field3673 = null;
        field3666 = null;
    }

    @OriginalMember(owner = "client!ws", name = "c", descriptor = "(I)V")
    public static final void method1609(int arg0) {
        if (arg0 == 2048) {
            ++field3664;
            class157.field2402.method331(((float) class220.field3371.field2566 * 0.1F + 0.7F) * 1.1523438F);
            class157.field2402.method194(class466.field6780, 0.69921875F, 1.2F, -50.0F, -60.0F, -50.0F);
            class157.field2402.method314(class157.field2401, -1, 256);
            class157.field2402.method294(class287.field4257);
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(Z)V")
    private final void method1610(boolean arg0) {
        ++field3669;
        int var2 = 0;
        this.field3665 = new int[this.field3663 + 1];
        this.field3660 = new int[this.field3663 + 1];
        int var3 = 4096 / this.field3663;
        int var4 = this.field3668 * var3 >> 12;
        if (arg0) {
            this.method65(109, -115);
        }
        for (int var5 = 0; var5 < this.field3663; ++var5) {
            this.field3660[var5] = var2;
            this.field3665[var5] = var2 + var4;
            var2 += var3;
        }
        this.field3660[this.field3663] = 4096;
        this.field3665[this.field3663] = this.field3665[0] + 4096;
    }
}
