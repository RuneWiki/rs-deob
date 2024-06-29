import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class390 extends class466 {

    @OriginalMember(owner = "client!sj", name = "I", descriptor = "I")
    public static int field5522 = 0;

    @OriginalMember(owner = "client!sj", name = "K", descriptor = "[I")
    public static int[] field5524 = new int[8];

    @OriginalMember(owner = "client!sj", name = "L", descriptor = "[[I")
    public static int[][] field5525 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!sj", name = "E", descriptor = "I")
    public static int field5518;

    @OriginalMember(owner = "client!sj", name = "F", descriptor = "I")
    public static int field5519;

    @OriginalMember(owner = "client!sj", name = "G", descriptor = "I")
    public static int field5520;

    @OriginalMember(owner = "client!sj", name = "H", descriptor = "I")
    public static int field5521;

    @OriginalMember(owner = "client!sj", name = "J", descriptor = "I")
    public static int field5523;

    @OriginalMember(owner = "client!sj", name = "M", descriptor = "I")
    public static int field5526;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(II)[I")
    public final int[] method2(int arg0, int arg1) {
        ++field5526;
        if (arg1 != 0) {
            return null;
        } else {
            int[] var3 = super.field6557.method565(arg0, -24728);
            if (super.field6557.field1163) {
                int[] var4 = this.method2721(0, arg0, 2);
                int[] var5 = this.method2721(1, arg0, 2);
                int[] var6 = this.method2721(2, arg0, arg1 + 2);
                for (int var7 = 0; var7 < class312.field4207; ++var7) {
                    int var8 = var6[var7];
                    if (var8 != 4096) {
                        if (var8 != 0) {
                            var3[var7] = (-var8 + 4096) * var5[var7] + var4[var7] * var8 >> 12;
                        } else {
                            var3[var7] = var5[var7];
                        }
                    } else {
                        var3[var7] = var4[var7];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(B)V")
    public static void method2348(byte arg0) {
        int var1 = -125 / ((3 - arg0) / 44);
        field5525 = null;
        field5524 = null;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IB[Lmc;)V")
    public static final void method2349(int arg0, byte arg1, class114[] arg2) {
        int var3 = 38 / ((-52 - arg1) / 58);
        ++field5523;
        for (int var4 = 0; var4 < arg2.length; ++var4) {
            class114 var5 = arg2[var4];
            if (var5 != null && ~var5.field1897 == ~arg0 && !client.method1554(var5)) {
                if (var5.field1880 == 0) {
                    method2349(var5.field1810, (byte) 61, arg2);
                    if (var5.field1886 != null) {
                        method2349(var5.field1810, (byte) -112, var5.field1886);
                    }
                    class128 var6 = (class128) class211.field2971.method1242(0, (long) var5.field1810);
                    if (var6 != null) {
                        class112.method779(var6.field2065, true);
                    }
                }
                if (var5.field1880 == 6 && var5.field1754 != -1) {
                    class78 var7 = class331.field4418.method195(var5.field1754, (byte) 13);
                    if (var7 != null) {
                        var5.field1838 += class64.field1097;
                        while (~var7.field1260[var5.field1804] > ~var5.field1838) {
                            var5.field1838 -= var7.field1260[var5.field1804];
                            ++var5.field1804;
                            if (var5.field1804 >= var7.field1261.length) {
                                var5.field1804 -= var7.field1270;
                                if (~var5.field1804 > -1 || var7.field1261.length <= var5.field1804) {
                                    var5.field1804 = 0;
                                }
                            }
                            var5.field1891 = var5.field1804 + 1;
                            if (~var5.field1891 <= ~var7.field1261.length) {
                                var5.field1891 -= var7.field1270;
                                if (~var5.field1891 > -1 || var5.field1891 >= var7.field1261.length) {
                                    var5.field1891 = -1;
                                }
                            }
                            class403.method2407(var5, -9130);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "(I)V")
    public static final void method2350(int arg0) {
        class316.field4245.method2697(-123);
        ++field5521;
        class602.field8697.method2157((byte) -122);
        class313.field4221.method2545((byte) -101);
        class166.field2390.setBackground(Color.black);
        class130.field2094 = -1;
        class316.field4245 = class190.method1185(arg0 + 46, class166.field2390);
        class602.field8697 = class611.method3578(true, class166.field2390, 47);
        if (arg0 != 6) {
            method2350(24);
        }
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "()V")
    public class390() {
        super(3, false);
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Ldaa;II)V")
    public final void method6(class11 arg0, int arg1, int arg2) {
        if (arg1 != -5062) {
            field5524 = null;
        }
        ++field5519;
        if (~arg2 == -1) {
            super.field6565 = arg0.method110((byte) 38) == 1;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method33(int arg0, boolean arg1) {
        ++field5518;
        if (arg1) {
            field5522 = -70;
        }
        int[][] var3 = super.field6569.method828((byte) -13, arg0);
        if (super.field6569.field1934) {
            int[] var4 = this.method2721(2, arg0, 2);
            int[][] var5 = this.method2719(0, arg0, 5);
            int[][] var6 = this.method2719(1, arg0, 5);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; ~var16 > ~class312.field4207; ++var16) {
                int var17 = var4[var16];
                if (~var17 == -4097) {
                    var7[var16] = var10[var16];
                    var8[var16] = var11[var16];
                    var9[var16] = var12[var16];
                } else if (var17 != 0) {
                    int var18 = -var17 + 4096;
                    var7[var16] = var10[var16] * var17 - -(var13[var16] * var18) >> 12;
                    var8[var16] = var11[var16] * var17 + var14[var16] * var18 >> 12;
                    var9[var16] = var12[var16] * var17 + var15[var16] * var18 >> 12;
                } else {
                    var7[var16] = var13[var16];
                    var8[var16] = var14[var16];
                    var9[var16] = var15[var16];
                }
            }
        }
        return var3;
    }
}
