import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class191 extends class59 {

    @OriginalMember(owner = "client!vb", name = "X", descriptor = "I")
    public static int field3628 = 5063219;

    @OriginalMember(owner = "client!vb", name = "Y", descriptor = "Lb;")
    public static class11 field3629 = new class11(50);

    @OriginalMember(owner = "client!vb", name = "ab", descriptor = "I")
    public static volatile int field3631 = 0;

    @OriginalMember(owner = "client!vb", name = "Z", descriptor = "I")
    public static int field3630 = 1;

    @OriginalMember(owner = "client!vb", name = "bb", descriptor = "Lsd;")
    public static class166 field3632 = class135.method935("p12_full", 0);

    @OriginalMember(owner = "client!vb", name = "cb", descriptor = "Lsd;")
    public static class166 field3633 = class135.method935("null", 0);

    @OriginalMember(owner = "client!vb", name = "S", descriptor = "I")
    public static int field3623;

    @OriginalMember(owner = "client!vb", name = "T", descriptor = "I")
    public static int field3624;

    @OriginalMember(owner = "client!vb", name = "U", descriptor = "I")
    public static int field3625;

    @OriginalMember(owner = "client!vb", name = "V", descriptor = "I")
    public static int field3626;

    @OriginalMember(owner = "client!vb", name = "W", descriptor = "I")
    public static int field3627;

    @OriginalMember(owner = "client!vb", name = "db", descriptor = "Lie;")
    public static class78 field3634;

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(IB)[I")
    public final int[] method36(int arg0, byte arg1) {
        ++field3627;
        int[] var3 = super.field1219.method721(arg0, -123);
        if (arg1 >= -124) {
            return null;
        } else {
            if (super.field1219.field1816) {
                int[] var4 = this.method499(0, arg0, 0);
                int[] var5 = this.method499(0, arg0, 1);
                int[] var6 = this.method499(0, arg0, 2);
                for (int var7 = 0; ~class98.field1879 < ~var7; ++var7) {
                    int var8 = var6[var7];
                    if (~var8 != -4097) {
                        if (~var8 == -1) {
                            var3[var7] = var5[var7];
                        } else {
                            var3[var7] = (4096 - var8) * var5[var7] + var4[var7] * var8 >> 12;
                        }
                    } else {
                        var3[var7] = var4[var7];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "(B)I")
    public static final int method1276(byte arg0) {
        ++field3625;
        int var1 = -33 / ((arg0 - -44) / 52);
        return class46.field836++;
    }

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "(I)V")
    public static void method1277(int arg0) {
        field3629 = null;
        field3633 = null;
        field3632 = null;
        if (arg0 != 0) {
            field3628 = -73;
        }
        field3634 = null;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lff;BI)V")
    public final void method41(class53 arg0, byte arg1, int arg2) {
        if (~arg2 == -1) {
            super.field1216 = ~arg0.method400(255) == -2;
        }
        ++field3626;
        if (arg1 < 18) {
            method1278(51, 115L);
        }
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "()V")
    public class191() {
        super(3, false);
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method37(boolean arg0, int arg1) {
        if (!arg0) {
            this.method36(78, (byte) -121);
        }
        ++field3623;
        int[][] var3 = super.field1207.method528(65, arg1);
        if (super.field1207.field1320) {
            int[] var4 = this.method499(0, arg1, 2);
            int[][] var5 = this.method498(arg1, 0, 0);
            int[][] var6 = this.method498(arg1, 0, 1);
            int[] var7 = var3[1];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            int[] var10 = var5[1];
            int[] var11 = var5[0];
            int[] var12 = var5[2];
            int[] var13 = var6[1];
            int[] var14 = var6[2];
            int[] var15 = var6[0];
            for (int var16 = 0; class98.field1879 > var16; ++var16) {
                int var17 = var4[var16];
                if (~var17 == -4097) {
                    var8[var16] = var11[var16];
                    var7[var16] = var10[var16];
                    var9[var16] = var12[var16];
                } else if (~var17 != -1) {
                    int var18 = -var17 + 4096;
                    var8[var16] = var11[var16] * var17 + var15[var16] * var18 >> 12;
                    var7[var16] = var10[var16] * var17 + var13[var16] * var18 >> 12;
                    var9[var16] = var12[var16] * var17 + var14[var16] * var18 >> 12;
                } else {
                    var8[var16] = var15[var16];
                    var7[var16] = var13[var16];
                    var9[var16] = var14[var16];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IJ)Lsd;")
    public static final class166 method1278(int arg0, long arg1) {
        ++field3624;
        if (arg1 > 0L && arg1 < 6582952005840035281L) {
            if (~(arg1 % (long) arg0) == -1L) {
                return null;
            } else {
                long var3 = arg1;
                int var5 = 0;
                while (~var3 != -1L) {
                    ++var5;
                    var3 /= 37L;
                }
                byte[] var6 = new byte[var5];
                while (arg1 != 0L) {
                    long var8 = arg1;
                    arg1 /= 37L;
                    --var5;
                    var6[var5] = class171.field3284[(int) (-(arg1 * 37L) + var8)];
                }
                class166 var7 = new class166();
                var7.field3162 = var6;
                var7.field3187 = var6.length;
                return var7;
            }
        } else {
            return null;
        }
    }
}
