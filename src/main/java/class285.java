import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class285 extends class223 {

    @OriginalMember(owner = "client!rb", name = "J", descriptor = "I")
    private int field4479 = 2048;

    @OriginalMember(owner = "client!rb", name = "L", descriptor = "I")
    private int field4481 = 3072;

    @OriginalMember(owner = "client!rb", name = "T", descriptor = "I")
    private int field4489 = 1024;

    @OriginalMember(owner = "client!rb", name = "N", descriptor = "[[[I")
    public static int[][][] field4483 = new int[2][][];

    @OriginalMember(owner = "client!rb", name = "R", descriptor = "I")
    public static int field4487 = 0;

    @OriginalMember(owner = "client!rb", name = "P", descriptor = "Ljava/lang/String;")
    public static String field4485 = "Connection lost.";

    @OriginalMember(owner = "client!rb", name = "K", descriptor = "I")
    public static int field4480;

    @OriginalMember(owner = "client!rb", name = "M", descriptor = "I")
    public static int field4482;

    @OriginalMember(owner = "client!rb", name = "O", descriptor = "I")
    public static int field4484;

    @OriginalMember(owner = "client!rb", name = "Q", descriptor = "I")
    public static int field4486;

    @OriginalMember(owner = "client!rb", name = "S", descriptor = "I")
    public static int field4488;

    @OriginalMember(owner = "client!rb", name = "U", descriptor = "I")
    public static int field4490;

    @OriginalMember(owner = "client!rb", name = "V", descriptor = "I")
    public static int field4491;

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "(I)V")
    public final void method43(int arg0) {
        ++field4488;
        if (arg0 != 500) {
            field4487 = 67;
        }
        this.field4479 = -this.field4489 + this.field4481;
    }

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "(I)V")
    public static void method1917(int arg0) {
        field4485 = null;
        if (arg0 >= -35) {
            field4483 = null;
        }
        field4483 = null;
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "()V")
    public class285() {
        super(1, false);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(BI)[I")
    public final int[] method40(byte arg0, int arg1) {
        if (arg0 < 14) {
            return null;
        } else {
            ++field4480;
            int[] var3 = super.field3588.method1611(0, arg1);
            if (super.field3588.field3722) {
                int[] var4 = this.method1533(0, arg1, -102);
                for (int var5 = 0; ~var5 > ~class250.field4008; ++var5) {
                    var3[var5] = (var4[var5] * this.field4479 >> 12) + this.field4489;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "(I)V")
    public static final void method1918(int arg0) {
        ++field4482;
        if (!class220.field3359) {
            if (arg0 != 873626860) {
                field4485 = null;
            }
            class220.field3359 = true;
            class130.field1929 = true;
            if (class189.field2972) {
                class50.field818 = (float) (-128 & (int) class50.field818 + 191);
            } else {
                class260.field4118 += (24.0F - class260.field4118) / 2.0F;
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(II)[[I")
    public final int[][] method135(int arg0, int arg1) {
        if (arg0 <= 0) {
            this.field4481 = 34;
        }
        ++field4490;
        int[][] var3 = super.field3572.method1818(arg1, false);
        if (super.field3572.field4257) {
            int[][] var4 = this.method1534(false, 0, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var4[1];
            int[] var8 = var3[1];
            int[] var9 = var3[0];
            int[] var10 = var3[2];
            for (int var11 = 0; class250.field4008 > var11; ++var11) {
                var9[var11] = (var5[var11] * this.field4479 >> 12) + this.field4489;
                var8[var11] = (var7[var11] * this.field4479 >> 12) + this.field4489;
                var10[var11] = (var6[var11] * this.field4479 >> 12) + this.field4489;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lha;IB)V")
    public final void method37(class31 arg0, int arg1, byte arg2) {
        ++field4486;
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    super.field3583 = arg0.method265(-102) == 1;
                }
            } else {
                this.field4481 = arg0.method260((byte) -67);
            }
        } else {
            this.field4489 = arg0.method260((byte) -67);
        }
        if (arg2 != 102) {
            method1917(-31);
        }
    }
}
