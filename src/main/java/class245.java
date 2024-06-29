import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class245 extends class76 {

    @OriginalMember(owner = "client!ud", name = "bb", descriptor = "I")
    public static int field4253 = 0;

    @OriginalMember(owner = "client!ud", name = "eb", descriptor = "Lia;")
    public static class257 field4256 = class28.method234(108, "(U(Y");

    @OriginalMember(owner = "client!ud", name = "fb", descriptor = "Lsf;")
    public static class33 field4257 = new class33();

    @OriginalMember(owner = "client!ud", name = "gb", descriptor = "[I")
    public static int[] field4258 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!ud", name = "Y", descriptor = "I")
    public static int field4250;

    @OriginalMember(owner = "client!ud", name = "Z", descriptor = "I")
    public static int field4251;

    @OriginalMember(owner = "client!ud", name = "ab", descriptor = "I")
    public static int field4252;

    @OriginalMember(owner = "client!ud", name = "cb", descriptor = "I")
    public static int field4254;

    @OriginalMember(owner = "client!ud", name = "db", descriptor = "I")
    public static int field4255;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lk;BI)V")
    public final void method158(class152 arg0, byte arg1, int arg2) {
        ++field4254;
        if (arg2 == 0) {
            super.field1477 = ~arg0.method1051((byte) -56) == -2;
        }
        if (arg1 >= -86) {
            this.method169(-14, -99);
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lmb;B)Z")
    public static final boolean method1610(class178 arg0, byte arg1) {
        ++field4251;
        if (arg0.method1207(class164.field2871, (byte) -61)) {
            return true;
        } else {
            if (arg1 >= -99) {
                field4256 = null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "(II)I")
    public static final int method1611(int arg0, int arg1) {
        double var2 = (double) (arg1 >> 16 & 255) / 256.0D;
        ++field4252;
        double var4 = (double) (255 & arg1 >> 8) / 256.0D;
        if (arg0 < 23) {
            method1610((class178) null, (byte) 50);
        }
        double var6 = (double) (arg1 & 255) / 256.0D;
        double var8 = var2;
        double var10 = var2;
        if (var4 > var2) {
            var10 = var4;
        }
        if (var4 < var2) {
            var8 = var4;
        }
        if (var8 > var6) {
            var8 = var6;
        }
        if (var6 > var10) {
            var10 = var6;
        }
        double var12 = 0.0D;
        double var14 = (var8 + var10) / 2.0D;
        double var16 = 0.0D;
        if (var8 != var10) {
            if (var2 == var10) {
                var12 = (var4 - var6) / (var10 - var8);
            } else if (var4 != var10) {
                if (var6 == var10) {
                    var12 = (-var4 + var2) / (-var8 + var10) + 4.0D;
                }
            } else {
                var12 = (var6 - var2) / (var10 - var8) + 2.0D;
            }
            if (var14 < 0.5D) {
                var16 = (var10 - var8) / (var8 + var10);
            }
            if (var14 >= 0.5D) {
                var16 = (-var8 + var10) / (2.0D - var10 + -var8);
            }
        }
        double var18 = var12 / 6.0D;
        int var20 = (int) (var18 * 256.0D);
        int var21 = (int) (var14 * 256.0D);
        int var22 = (int) (var16 * 256.0D);
        if (~var22 <= -1) {
            if (var22 > 255) {
                var22 = 255;
            }
        } else {
            var22 = 0;
        }
        if (var21 >= 0) {
            if (~var21 < -256) {
                var21 = 255;
            }
        } else {
            var21 = 0;
        }
        if (var21 <= 243) {
            if (var21 > 217) {
                var22 >>= 3;
            } else if (var21 > 192) {
                var22 >>= 2;
            } else if (var21 > 179) {
                var22 >>= 1;
            }
        } else {
            var22 >>= 4;
        }
        return (var21 >> 1) + (var20 >> 2 << 10) + (var22 >> 5 << 7);
    }

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(II)[I")
    public final int[] method169(int arg0, int arg1) {
        ++field4250;
        int[] var3 = super.field1467.method1182((byte) -48, arg1);
        if (arg0 != -9351) {
            field4253 = 28;
        }
        if (super.field1467.field2980) {
            int[] var4 = this.method562(arg1, 0, (byte) -104);
            int[] var5 = this.method562(arg1, 1, (byte) -104);
            int[] var6 = this.method562(arg1, 2, (byte) -104);
            for (int var7 = 0; var7 < class96.field1807; ++var7) {
                int var8 = var6[var7];
                if (var8 == 4096) {
                    var3[var7] = var4[var7];
                } else if (~var8 != -1) {
                    var3[var7] = var4[var7] * var8 - -((-var8 + 4096) * var5[var7]) >> 12;
                } else {
                    var3[var7] = var5[var7];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(B)V")
    public static void method1612(byte arg0) {
        field4256 = null;
        if (arg0 == -98) {
            field4258 = null;
            field4257 = null;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IB)[[I")
    public final int[][] method157(int arg0, byte arg1) {
        int[][] var3 = super.field1485.method649(arg0, true);
        if (super.field1485.field1692) {
            int[] var4 = this.method562(arg0, 2, (byte) -104);
            int[][] var5 = this.method565((byte) -20, 0, arg0);
            int[][] var6 = this.method565((byte) -20, 1, arg0);
            int[] var7 = var3[0];
            int[] var8 = var3[2];
            int[] var9 = var5[0];
            int[] var10 = var3[1];
            int[] var11 = var5[2];
            int[] var12 = var5[1];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; ~var16 > ~class96.field1807; ++var16) {
                int var17 = var4[var16];
                if (~var17 == -4097) {
                    var7[var16] = var9[var16];
                    var10[var16] = var12[var16];
                    var8[var16] = var11[var16];
                } else if (var17 != 0) {
                    int var18 = 4096 - var17;
                    var7[var16] = var9[var16] * var17 + var13[var16] * var18 >> 12;
                    var10[var16] = var12[var16] * var17 + var14[var16] * var18 >> 12;
                    var8[var16] = var11[var16] * var17 + var15[var16] * var18 >> 12;
                } else {
                    var7[var16] = var13[var16];
                    var10[var16] = var14[var16];
                    var8[var16] = var15[var16];
                }
            }
        }
        ++field4255;
        if (arg1 <= 2) {
            method1610((class178) null, (byte) 108);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "()V")
    public class245() {
        super(3, false);
    }
}
