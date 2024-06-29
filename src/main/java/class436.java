import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public class class436 extends class634 {

    @OriginalMember(owner = "client!io", name = "I", descriptor = "I")
    private int field6352 = 0;

    @OriginalMember(owner = "client!io", name = "H", descriptor = "I")
    private int field6351 = 4096;

    @OriginalMember(owner = "client!io", name = "J", descriptor = "Lpfa;")
    public static class295 field6353 = new class295(16);

    @OriginalMember(owner = "client!io", name = "G", descriptor = "I")
    public static int field6350;

    @OriginalMember(owner = "client!io", name = "K", descriptor = "I")
    public static int field6354;

    @OriginalMember(owner = "client!io", name = "L", descriptor = "I")
    public static int field6355;

    @OriginalMember(owner = "client!io", name = "M", descriptor = "I")
    public static int field6356;

    @OriginalMember(owner = "client!io", name = "N", descriptor = "[Lrr;")
    public static class361[] field6357;

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(ILig;Z)V")
    public final void method3(int arg0, class244 arg1, boolean arg2) {
        if (arg2) {
            method2720(100);
        }
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    super.field9121 = arg1.method1423(-90) == 1;
                }
            } else {
                this.field6351 = arg1.method1476(103);
            }
        } else {
            this.field6352 = arg1.method1476(125);
        }
        ++field6354;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(BI)[[I")
    public final int[][] method7(byte arg0, int arg1) {
        ++field6350;
        int[][] var3 = super.field9126.method132(0, arg1);
        if (super.field9126.field295) {
            int[][] var4 = this.method3642(0, arg1, true);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class635.field9139; ++var11) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var7[var11];
                if (~var12 <= ~this.field6352) {
                    if (~this.field6351 <= ~var12) {
                        var8[var11] = var12;
                    } else {
                        var8[var11] = this.field6351;
                    }
                } else {
                    var8[var11] = this.field6352;
                }
                if (this.field6352 > var13) {
                    var9[var11] = this.field6352;
                } else if (~this.field6351 <= ~var13) {
                    var9[var11] = var13;
                } else {
                    var9[var11] = this.field6351;
                }
                if (~this.field6352 >= ~var14) {
                    if (this.field6351 < var14) {
                        var10[var11] = this.field6351;
                    } else {
                        var10[var11] = var14;
                    }
                } else {
                    var10[var11] = this.field6352;
                }
            }
        }
        int var15 = -108 / ((-56 - arg0) / 53);
        return var3;
    }

    @OriginalMember(owner = "client!io", name = "b", descriptor = "(BI)[I")
    public final int[] method13(byte arg0, int arg1) {
        ++field6356;
        if (arg0 >= -55) {
            field6353 = null;
        }
        int[] var3 = super.field9114.method1858(100, arg1);
        if (super.field9114.field3897) {
            int[] var4 = this.method3641(arg1, 20604, 0);
            for (int var5 = 0; var5 < class635.field9139; ++var5) {
                int var6 = var4[var5];
                if (this.field6352 > var6) {
                    var3[var5] = this.field6352;
                } else if (this.field6351 < var6) {
                    var3[var5] = this.field6351;
                } else {
                    var3[var5] = var6;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!io", name = "f", descriptor = "(I)Lfea;")
    public static final class141 method2720(int arg0) {
        ++field6355;
        try {
            return (class141) Class.forName("me").newInstance();
        } catch (Throwable var1) {
            if (arg0 < 101) {
                method2720(-1);
            }
            return new class49();
        }
    }

    @OriginalMember(owner = "client!io", name = "d", descriptor = "(B)V")
    public static void method2721(byte arg0) {
        field6353 = null;
        if (arg0 <= 116) {
            field6353 = null;
        }
        field6357 = null;
    }

    @OriginalMember(owner = "client!io", name = "<init>", descriptor = "()V")
    public class436() {
        super(1, false);
    }
}
