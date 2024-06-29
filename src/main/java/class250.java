import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gaa")
public class class250 extends class145 {

    @OriginalMember(owner = "client!gaa", name = "E", descriptor = "I")
    private int field3546 = 4;

    @OriginalMember(owner = "client!gaa", name = "M", descriptor = "I")
    private int field3553 = 4;

    @OriginalMember(owner = "client!gaa", name = "K", descriptor = "I")
    public static int field3551 = 1406;

    @OriginalMember(owner = "client!gaa", name = "J", descriptor = "[I")
    public static int[] field3550 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };

    @OriginalMember(owner = "client!gaa", name = "F", descriptor = "I")
    public static int field3547;

    @OriginalMember(owner = "client!gaa", name = "G", descriptor = "I")
    public static int field3548;

    @OriginalMember(owner = "client!gaa", name = "H", descriptor = "I")
    public static int field3549;

    @OriginalMember(owner = "client!gaa", name = "L", descriptor = "I")
    public static int field3552;

    @OriginalMember(owner = "client!gaa", name = "N", descriptor = "I")
    public static int field3554;

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(BLkea;)V")
    public static final void method1649(byte arg0, class203 arg1) {
        int var2 = 7 % ((arg0 - -49) / 39);
        class638.field9170 = arg1;
        ++field3547;
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(IILrt;)V")
    public final void method28(int arg0, int arg1, class194 arg2) {
        if (arg1 > -67) {
            this.field3546 = 0;
        }
        if (~arg0 != -1) {
            if (arg0 == 1) {
                this.field3553 = arg2.method1177(255);
            }
        } else {
            this.field3546 = arg2.method1177(255);
        }
        ++field3552;
    }

    @OriginalMember(owner = "client!gaa", name = "i", descriptor = "(I)V")
    public static void method1650(int arg0) {
        field3550 = null;
        if (arg0 >= -106) {
            method1649((byte) 73, (class203) null);
        }
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(ZI)[I")
    public final int[] method27(boolean arg0, int arg1) {
        ++field3554;
        int[] var3 = super.field1779.method2069(-2, arg1);
        if (super.field1779.field4602) {
            int var4 = class647.field9368 / this.field3546;
            int var5 = class441.field6574 / this.field3553;
            int[] var6;
            if (var5 <= 0) {
                var6 = this.method865(0, 0, (byte) 98);
            } else {
                int var7 = arg1 % var5;
                var6 = this.method865(0, class441.field6574 * var7 / var5, (byte) 107);
            }
            for (int var8 = 0; class647.field9368 > var8; ++var8) {
                if (~var4 >= -1) {
                    var3[var8] = var6[0];
                } else {
                    int var9 = var8 % var4;
                    var3[var8] = var6[class647.field9368 * var9 / var4];
                }
            }
        }
        if (arg0) {
            this.field3553 = 103;
        }
        return var3;
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(BI)[[I")
    public final int[][] method75(byte arg0, int arg1) {
        if (arg0 >= -28) {
            return null;
        } else {
            ++field3548;
            int[][] var3 = super.field1792.method1826(arg1, -16486);
            if (super.field1792.field3917) {
                int var4 = class647.field9368 / this.field3546;
                int var5 = class441.field6574 / this.field3553;
                int[][] var7;
                if (var5 > 0) {
                    int var6 = arg1 % var5;
                    var7 = this.method866(0, class441.field6574 * var6 / var5, (byte) -99);
                } else {
                    var7 = this.method866(0, 0, (byte) 124);
                }
                int[] var8 = var7[0];
                int[] var9 = var7[1];
                int[] var10 = var7[2];
                int[] var11 = var3[0];
                int[] var12 = var3[1];
                int[] var13 = var3[2];
                for (int var14 = 0; ~class647.field9368 < ~var14; ++var14) {
                    int var16;
                    if (~var4 < -1) {
                        int var15 = var14 % var4;
                        var16 = class647.field9368 * var15 / var4;
                    } else {
                        var16 = 0;
                    }
                    var11[var14] = var8[var16];
                    var12[var14] = var9[var16];
                    var13[var14] = var10[var16];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!gaa", name = "<init>", descriptor = "()V")
    public class250() {
        super(1, false);
    }
}
