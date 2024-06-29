import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class217 extends class377 {

    @OriginalMember(owner = "client!tg", name = "z", descriptor = "I")
    public static int field2534;

    @OriginalMember(owner = "client!tg", name = "A", descriptor = "I")
    public static int field2535;

    @OriginalMember(owner = "client!tg", name = "B", descriptor = "I")
    public static int field2536;

    @OriginalMember(owner = "client!tg", name = "D", descriptor = "I")
    public static int field2538;

    @OriginalMember(owner = "client!tg", name = "E", descriptor = "I")
    public static int field2539;

    @OriginalMember(owner = "client!tg", name = "F", descriptor = "I")
    public static int field2540;

    @OriginalMember(owner = "client!tg", name = "C", descriptor = "[Lph;")
    private class602[] field2537;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IB)[[I", line = 4)
    public final int[][] method23(int arg0, byte arg1) {
        ++field2536;
        int var3 = 42 % ((31 - arg1) / 42);
        int[][] var4 = super.field4850.method2566(-27346, arg0);
        if (super.field4850.field5843) {
            int var5 = class528.field6661;
            int var6 = class383.field4916;
            int[][] var7 = new int[var6][var5];
            int[][][] var8 = super.field4850.method2562((byte) 102);
            this.method1257((byte) 111, var7);
            for (int var9 = 0; ~var9 > ~class383.field4916; ++var9) {
                int[] var10 = var7[var9];
                int[][] var11 = var8[var9];
                int[] var12 = var11[0];
                int[] var13 = var11[1];
                int[] var14 = var11[2];
                for (int var15 = 0; class528.field6661 > var15; ++var15) {
                    int var16 = var10[var15];
                    var14[var15] = class109.method762(255, var16) << 4;
                    var13[var15] = class109.method762(var16, 65280) >> 4;
                    var12[var15] = class109.method762(16711680, var16) >> 12;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(II)[I", line = 68)
    public final int[] method88(int arg0, int arg1) {
        ++field2540;
        int[] var3 = super.field4842.method2772(arg0, (byte) -115);
        int var4 = 68 % ((arg1 - 5) / 53);
        if (super.field4842.field6354) {
            this.method1257((byte) 89, super.field4842.method2771(0));
        }
        return var3;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(BI)I", line = 90)
    public static final int method1256(byte arg0, int arg1) {
        ++field2534;
        int var2 = arg1 >>> 1;
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        if (arg0 != -64) {
            return 116;
        } else {
            int var7 = var6 | var6 >>> 16;
            return arg1 & ~var7;
        }
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "()V", line = 108)
    public class217() {
        super(0, true);
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IILji;)V", line = 116)
    public final void method27(int arg0, int arg1, class572 arg2) {
        int var4 = -11 / ((13 - arg1) / 55);
        ++field2535;
        if (~arg0 == -1) {
            this.field2537 = new class602[arg2.method3097((byte) 12)];
            for (int var5 = 0; var5 < this.field2537.length; ++var5) {
                int var6 = arg2.method3097((byte) 12);
                if (var6 != 0) {
                    if (~var6 != -2) {
                        if (~var6 != -3) {
                            if (var6 == 3) {
                                this.field2537[var5] = class435.method2393(1, arg2);
                            }
                        } else {
                            this.field2537[var5] = class183.method1090(915377228, arg2);
                        }
                    } else {
                        this.field2537[var5] = class677.method3747(2, arg2);
                    }
                } else {
                    this.field2537[var5] = class591.method3277(arg2, (byte) 107);
                }
            }
        } else if (arg0 == 1) {
            super.field4853 = arg2.method3097((byte) 12) == 1;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(B[[I)V", line = 187)
    private final void method1257(byte arg0, int[][] arg1) {
        ++field2539;
        int var3 = class528.field6661;
        int var4 = class383.field4916;
        if (arg0 >= 2) {
            class62.method507((byte) -98, arg1);
            class702.method3881(0, class251.field3236, 0, class376.field4836, 2);
            if (this.field2537 != null) {
                for (int var5 = 0; var5 < this.field2537.length; ++var5) {
                    class602 var6 = this.field2537[var5];
                    int var7 = var6.field8083;
                    int var8 = var6.field8084;
                    if (var7 >= 0) {
                        if (var8 < 0) {
                            var6.method807(var3, var4, 5);
                        } else {
                            var6.method803(var3, (byte) 61, var4);
                        }
                    } else if (~var8 <= -1) {
                        var6.method805(false, var4, var3);
                    }
                }
            }
        }
    }
}
