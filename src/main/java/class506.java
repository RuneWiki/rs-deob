import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class506 extends class634 {

    @OriginalMember(owner = "client!ek", name = "H", descriptor = "I")
    public static int field7219 = -1;

    @OriginalMember(owner = "client!ek", name = "G", descriptor = "I")
    public static int field7218;

    @OriginalMember(owner = "client!ek", name = "I", descriptor = "I")
    public static int field7220;

    @OriginalMember(owner = "client!ek", name = "K", descriptor = "I")
    public static int field7222;

    @OriginalMember(owner = "client!ek", name = "M", descriptor = "I")
    public static int field7224;

    @OriginalMember(owner = "client!ek", name = "L", descriptor = "Lqv;")
    public static class444 field7223;

    @OriginalMember(owner = "client!ek", name = "J", descriptor = "[Lcha;")
    private class217[] field7221;

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "()V", line = 5)
    public class506() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(BI)[[I", line = 8)
    public final int[][] method7(byte arg0, int arg1) {
        ++field7220;
        int[][] var3 = super.field9126.method132(0, arg1);
        int var4 = -5 / ((arg0 - -56) / 53);
        if (super.field9126.field295) {
            int var5 = class635.field9139;
            int var6 = class201.field2372;
            int[][] var7 = new int[var6][var5];
            int[][][] var8 = super.field9126.method131(2354);
            this.method3006(1, var7);
            for (int var9 = 0; ~var9 > ~class201.field2372; ++var9) {
                int[] var10 = var7[var9];
                int[][] var11 = var8[var9];
                int[] var12 = var11[0];
                int[] var13 = var11[1];
                int[] var14 = var11[2];
                for (int var15 = 0; ~class635.field9139 < ~var15; ++var15) {
                    int var16 = var10[var15];
                    var14[var15] = class327.method1956(var16 << 4, 4080);
                    var13[var15] = class327.method1956(4080, var16 >> 4);
                    var12[var15] = class327.method1956(var16, 16711680) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "(B)V", line = 69)
    public static void method3005(byte arg0) {
        if (arg0 < 44) {
            method3005((byte) 83);
        }
        field7223 = null;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(I[[I)V", line = 82)
    private final void method3006(int arg0, int[][] arg1) {
        ++field7222;
        int var3 = class635.field9139;
        int var4 = class201.field2372;
        class504.method2988(-8193, arg1);
        class706.method3959((byte) -108, 0, class110.field1162, 0, class312.field3870);
        if (this.field7221 != null) {
            for (int var5 = 0; var5 < this.field7221.length; ++var5) {
                class217 var6 = this.field7221[var5];
                int var7 = var6.field2515;
                int var8 = var6.field2520;
                if (var7 < 0) {
                    if (var8 >= 0) {
                        var6.method1268(var4, var3, (byte) -39);
                    }
                } else if (~var8 > -1) {
                    var6.method1265(var3, var4, true);
                } else {
                    var6.method1267(-5, var4, var3);
                }
            }
        }
        if (arg0 != 1) {
            this.field7221 = null;
        }
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(BI)[I", line = 134)
    public final int[] method13(byte arg0, int arg1) {
        ++field7218;
        int[] var3 = super.field9114.method1858(100, arg1);
        if (super.field9114.field3897) {
            this.method3006(1, super.field9114.method1866((byte) 121));
        }
        if (arg0 > -55) {
            field7223 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(ILig;Z)V", line = 163)
    public final void method3(int arg0, class244 arg1, boolean arg2) {
        if (!arg2) {
            if (arg0 == 0) {
                this.field7221 = new class217[arg1.method1423(-13)];
                for (int var4 = 0; ~this.field7221.length < ~var4; ++var4) {
                    int var5 = arg1.method1423(-83);
                    if (var5 != 0) {
                        if (var5 != 1) {
                            if (~var5 != -3) {
                                if (var5 == 3) {
                                    this.field7221[var4] = class682.method3864(arg1, 8192);
                                }
                            } else {
                                this.field7221[var4] = class114.method757(arg1, 28090);
                            }
                        } else {
                            this.field7221[var4] = class173.method1070((byte) -26, arg1);
                        }
                    } else {
                        this.field7221[var4] = class664.method3773(13433, arg1);
                    }
                }
            } else if (arg0 == 1) {
                super.field9121 = arg1.method1423(-38) == 1;
            }
            ++field7224;
        }
    }
}
