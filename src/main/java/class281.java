import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class281 extends class56 {

    @OriginalMember(owner = "client!cl", name = "G", descriptor = "I")
    private int field3271 = 4096;

    @OriginalMember(owner = "client!cl", name = "I", descriptor = "I")
    private int field3273 = 4096;

    @OriginalMember(owner = "client!cl", name = "F", descriptor = "[I")
    private int[] field3270 = new int[3];

    @OriginalMember(owner = "client!cl", name = "K", descriptor = "I")
    private int field3275 = 4096;

    @OriginalMember(owner = "client!cl", name = "J", descriptor = "I")
    private int field3274 = 409;

    @OriginalMember(owner = "client!cl", name = "D", descriptor = "I")
    public static int field3268;

    @OriginalMember(owner = "client!cl", name = "E", descriptor = "I")
    public static int field3269;

    @OriginalMember(owner = "client!cl", name = "H", descriptor = "I")
    public static int field3272;

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "()V", line = 7)
    public class281() {
        super(1, false);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 10)
    public static final boolean method1622(String arg0, int arg1) {
        ++field3269;
        if (arg0 == null) {
            return false;
        } else {
            for (int var2 = 0; var2 < class651.field8992; ++var2) {
                if (arg0.equalsIgnoreCase(class375.field4702[var2])) {
                    return true;
                }
            }
            int var3 = 125 / ((arg1 - -83) / 43);
            return arg0.equalsIgnoreCase(class300.field3596.field7399);
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(BI)[[I", line = 39)
    public final int[][] method187(byte arg0, int arg1) {
        ++field3268;
        if (arg0 < 35) {
            return null;
        } else {
            int[][] var3 = super.field759.method220(arg1, (byte) -91);
            if (super.field759.field341) {
                int[][] var4 = this.method495(-84, arg1, 0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; class642.field8759 > var11; ++var11) {
                    int var12 = var5[var11];
                    int var13 = -this.field3270[0] + var12;
                    if (~var13 > -1) {
                        var13 = -var13;
                    }
                    if (var13 > this.field3274) {
                        var8[var11] = var12;
                        var9[var11] = var6[var11];
                        var10[var11] = var7[var11];
                    } else {
                        int var14 = var6[var11];
                        int var15 = -this.field3270[1] + var14;
                        if (~var15 > -1) {
                            var15 = -var15;
                        }
                        if (~this.field3274 > ~var15) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var7[var11];
                        } else {
                            int var16 = var7[var11];
                            int var17 = -this.field3270[2] + var16;
                            if (var17 < 0) {
                                var17 = -var17;
                            }
                            if (~this.field3274 > ~var17) {
                                var8[var11] = var12;
                                var9[var11] = var14;
                                var10[var11] = var16;
                            } else {
                                var8[var11] = this.field3275 * var12 >> 12;
                                var9[var11] = this.field3273 * var14 >> 12;
                                var10[var11] = this.field3271 * var16 >> 12;
                            }
                        }
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(BILes;)V", line = 140)
    public final void method144(byte arg0, int arg1, class403 arg2) {
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (arg1 != 3) {
                        if (~arg1 == -5) {
                            int var5 = arg2.method2358(115);
                            this.field3270[1] = class296.method1733(var5, 65280) >> 4;
                            this.field3270[0] = class296.method1733(267386880, var5 << 4);
                            this.field3270[2] = class296.method1733(255, var5) >> 12;
                        }
                    } else {
                        this.field3275 = arg2.method2390((byte) 95);
                    }
                } else {
                    this.field3273 = arg2.method2390((byte) -122);
                }
            } else {
                this.field3271 = arg2.method2390((byte) 110);
            }
        } else {
            this.field3274 = arg2.method2390((byte) 62);
        }
        ++field3272;
        if (arg0 >= -44) {
            this.field3273 = -61;
        }
    }
}
