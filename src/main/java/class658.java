import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class658 extends class739 {

    @OriginalMember(owner = "client!fj", name = "M", descriptor = "I")
    private int field9165 = 0;

    @OriginalMember(owner = "client!fj", name = "I", descriptor = "I")
    private int field9161 = 2048;

    @OriginalMember(owner = "client!fj", name = "P", descriptor = "I")
    private int field9168 = 10;

    @OriginalMember(owner = "client!fj", name = "E", descriptor = "Lkg;")
    public static class275 field9157 = new class275(40, -2);

    @OriginalMember(owner = "client!fj", name = "T", descriptor = "Z")
    public static boolean field9172 = false;

    @OriginalMember(owner = "client!fj", name = "F", descriptor = "F")
    public static float field9158;

    @OriginalMember(owner = "client!fj", name = "K", descriptor = "F")
    public static float field9163;

    @OriginalMember(owner = "client!fj", name = "G", descriptor = "I")
    public static int field9159;

    @OriginalMember(owner = "client!fj", name = "H", descriptor = "I")
    public static int field9160;

    @OriginalMember(owner = "client!fj", name = "L", descriptor = "I")
    public static int field9164;

    @OriginalMember(owner = "client!fj", name = "O", descriptor = "I")
    public static int field9167;

    @OriginalMember(owner = "client!fj", name = "Q", descriptor = "I")
    public static int field9169;

    @OriginalMember(owner = "client!fj", name = "R", descriptor = "I")
    public static int field9170;

    @OriginalMember(owner = "client!fj", name = "S", descriptor = "I")
    public static int field9171;

    @OriginalMember(owner = "client!fj", name = "U", descriptor = "J")
    public static long field9173;

    @OriginalMember(owner = "client!fj", name = "J", descriptor = "[I")
    private int[] field9162;

    @OriginalMember(owner = "client!fj", name = "N", descriptor = "[I")
    private int[] field9166;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lsl;II)V")
    public final void method214(class461 arg0, int arg1, int arg2) {
        ++field9170;
        if (arg2 == -3) {
            if (~arg1 != -1) {
                if (~arg1 != -2) {
                    if (arg1 == 2) {
                        this.field9165 = arg0.method2600((byte) -128);
                    }
                } else {
                    this.field9161 = arg0.method2566(-2);
                }
            } else {
                this.field9168 = arg0.method2600((byte) -126);
            }
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(II)[I")
    public final int[] method215(int arg0, int arg1) {
        ++field9159;
        if (arg0 != -23347) {
            field9158 = -0.2549724F;
        }
        int[] var3 = super.field10311.method2116(arg1, (byte) 99);
        if (super.field10311.field4728) {
            int var4 = class287.field3604[arg1];
            if (this.field9165 != 0) {
                for (int var5 = 0; ~class29.field523 < ~var5; ++var5) {
                    int var6 = 0;
                    short var7 = 0;
                    int var8 = class634.field8751[var5];
                    int var9 = this.field9165;
                    if (var9 != 1) {
                        if (~var9 != -3) {
                            if (~var9 == -4) {
                                var6 = (-var4 + var8 >> 1) + 2048;
                            }
                        } else {
                            var6 = 2048 - -(var8 - (-var4 + 4096) >> 1);
                        }
                    } else {
                        var6 = var8;
                    }
                    for (int var10 = 0; ~this.field9168 < ~var10; ++var10) {
                        if (var6 >= this.field9162[var10] && ~var6 > ~this.field9162[var10 + 1]) {
                            if (var6 < this.field9166[var10]) {
                                var7 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var5] = var7;
                }
            } else {
                short var11 = 0;
                for (int var12 = 0; ~var12 > ~this.field9168; ++var12) {
                    if (~this.field9162[var12] >= ~var4 && this.field9162[var12 + 1] > var4) {
                        if (var4 < this.field9166[var12]) {
                            var11 = 4096;
                        }
                        break;
                    }
                }
                class135.method997(var3, 0, class29.field523, var11);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(B)V")
    public static void method3706(byte arg0) {
        if (arg0 >= -69) {
            method3706((byte) -57);
        }
        field9157 = null;
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "()V")
    public class658() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "(Z)V")
    public static final void method3707(boolean arg0) {
        class519.method3017();
        ++field9169;
        if (!arg0) {
            field9173 = -45L;
        }
    }

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "(I)V")
    public final void method216(int arg0) {
        this.method3708(0);
        if (arg0 != -21773) {
            field9158 = -0.40267947F;
        }
        ++field9171;
    }

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "(I)V")
    private final void method3708(int arg0) {
        ++field9164;
        int var2 = 0;
        this.field9166 = new int[this.field9168 + 1];
        this.field9162 = new int[this.field9168 - -1];
        int var3 = 4096 / this.field9168;
        int var4 = this.field9161 * var3 >> 12;
        for (int var5 = arg0; this.field9168 > var5; ++var5) {
            this.field9162[var5] = var2;
            this.field9166[var5] = var2 + var4;
            var2 += var3;
        }
        this.field9162[this.field9168] = 4096;
        this.field9166[this.field9168] = 4096 - -this.field9166[0];
    }
}
