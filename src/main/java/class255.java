import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class255 extends class166 {

    @OriginalMember(owner = "client!rk", name = "O", descriptor = "Lhj;")
    public static class69 field4583 = class181.method1318("Nehmen", (byte) -108);

    @OriginalMember(owner = "client!rk", name = "P", descriptor = "Luh;")
    public static class98 field4584 = null;

    @OriginalMember(owner = "client!rk", name = "R", descriptor = "I")
    public static int field4586 = 0;

    @OriginalMember(owner = "client!rk", name = "Y", descriptor = "Lhj;")
    public static class69 field4593 = class181.method1318("<img=0>", (byte) -124);

    @OriginalMember(owner = "client!rk", name = "Q", descriptor = "I")
    public static int field4585;

    @OriginalMember(owner = "client!rk", name = "S", descriptor = "I")
    public static int field4587;

    @OriginalMember(owner = "client!rk", name = "V", descriptor = "I")
    public static int field4590;

    @OriginalMember(owner = "client!rk", name = "W", descriptor = "I")
    public static int field4591;

    @OriginalMember(owner = "client!rk", name = "X", descriptor = "I")
    public static int field4592;

    @OriginalMember(owner = "client!rk", name = "Z", descriptor = "I")
    public static int field4594;

    @OriginalMember(owner = "client!rk", name = "ab", descriptor = "I")
    public static int field4595;

    @OriginalMember(owner = "client!rk", name = "bb", descriptor = "I")
    public static int field4596;

    @OriginalMember(owner = "client!rk", name = "U", descriptor = "Lnc;")
    public static class83 field4589;

    @OriginalMember(owner = "client!rk", name = "T", descriptor = "[Lji;")
    private class40[] field4588;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIII)V")
    public static final void method1768(int arg0, int arg1, int arg2, int arg3) {
        if (class91.field1726 != 0 && arg2 != 0 && class229.field4200 < 50 && ~arg3 != 0) {
            class124.field2309[class229.field4200] = arg3;
            class220.field3956[class229.field4200] = arg2;
            class59.field1077[class229.field4200] = arg1;
            class83.field1592[class229.field4200] = null;
            class114.field2191[class229.field4200] = 0;
            ++class229.field4200;
        }
        if (arg0 <= -57) {
            ++field4585;
        }
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(II)[I")
    public final int[] method20(int arg0, int arg1) {
        ++field4591;
        if (arg1 != 8388607) {
            return null;
        } else {
            int[] var3 = super.field3071.method1252(arg0, true);
            if (super.field3071.field3142) {
                this.method1771(super.field3071.method1253((byte) -52), (byte) 106);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(II)[[I")
    public final int[][] method134(int arg0, int arg1) {
        if (arg0 != 0) {
            this.method20(103, 85);
        }
        ++field4587;
        int[][] var3 = super.field3064.method320(arg1, (byte) -23);
        if (super.field3064.field979) {
            int var4 = class253.field4565;
            int var5 = class146.field2691;
            int[][][] var6 = super.field3064.method318(84);
            int[][] var7 = new int[var5][var4];
            this.method1771(var7, (byte) 106);
            for (int var8 = 0; class146.field2691 > var8; ++var8) {
                int[] var9 = var7[var8];
                int[][] var10 = var6[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[1];
                int[] var13 = var10[2];
                for (int var14 = 0; class253.field4565 > var14; ++var14) {
                    int var15 = var9[var14];
                    var13[var14] = class69.method443(var15, 255) << 4;
                    var12[var14] = class69.method443(4080, var15 >> 4);
                    var11[var14] = class69.method443(var15 >> 12, 4080);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "(I)V")
    public static final void method1769(int arg0) {
        ++field4592;
        class168.method1239();
        for (int var1 = 0; var1 < 4; ++var1) {
            class79.field1518[var1].method1816(-120);
        }
        int var2 = 51 / ((arg0 - -32) / 55);
        System.gc();
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(BLfh;I)V")
    public final void method18(byte arg0, class128 arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 == -2) {
                super.field3074 = ~arg1.method937(false) == -2;
            }
        } else {
            this.field4588 = new class40[arg1.method937(false)];
            for (int var4 = 0; var4 < this.field4588.length; ++var4) {
                int var5 = arg1.method937(false);
                if (var5 != 0) {
                    if (~var5 != -2) {
                        if (var5 != 2) {
                            if (var5 == 3) {
                                this.field4588[var4] = class40.method226(arg1, arg0 + -96);
                            }
                        } else {
                            this.field4588[var4] = class34.method182(arg1, 12);
                        }
                    } else {
                        this.field4588[var4] = class266.method1839(57, arg1);
                    }
                } else {
                    this.field4588[var4] = class202.method1468((byte) -42, arg1);
                }
            }
        }
        if (arg0 != 96) {
            this.method18((byte) -108, (class128) null, 98);
        }
        ++field4590;
    }

    @OriginalMember(owner = "client!rk", name = "f", descriptor = "(I)V")
    public static void method1770(int arg0) {
        field4583 = null;
        if (arg0 != 25206) {
            method1769(57);
        }
        field4589 = null;
        field4593 = null;
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "()V")
    public class255() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "([[IB)V")
    private final void method1771(int[][] arg0, byte arg1) {
        ++field4596;
        if (arg1 != 106) {
            this.field4588 = null;
        }
        int var3 = class253.field4565;
        int var4 = class146.field2691;
        class46.method260(104, arg0);
        class241.method1711(0, class12.field183, 0, class138.field2583, arg1 ^ 107);
        if (this.field4588 != null) {
            for (int var5 = 0; ~this.field4588.length < ~var5; ++var5) {
                class40 var6 = this.field4588[var5];
                int var7 = var6.field567;
                int var8 = var6.field575;
                if (var8 >= 0) {
                    if (~var7 > -1) {
                        var6.method111((byte) -101, var3, var4);
                    } else {
                        var6.method110(var4, var3, arg1 + -6);
                    }
                } else if (var7 >= 0) {
                    var6.method106((byte) -123, var4, var3);
                }
            }
        }
    }
}
