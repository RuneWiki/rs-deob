import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nv")
public class class290 extends class80 {

    @OriginalMember(owner = "client!nv", name = "I", descriptor = "[[I")
    public static int[][] field4437 = new int[128][128];

    @OriginalMember(owner = "client!nv", name = "M", descriptor = "Los;")
    public static class309 field4441 = new class309("flash2:", "blinken2:", "clignotant2:", "flash2:");

    @OriginalMember(owner = "client!nv", name = "J", descriptor = "I")
    public static int field4438;

    @OriginalMember(owner = "client!nv", name = "K", descriptor = "I")
    public static int field4439;

    @OriginalMember(owner = "client!nv", name = "L", descriptor = "I")
    public static int field4440;

    @OriginalMember(owner = "client!nv", name = "N", descriptor = "I")
    public static int field4442;

    @OriginalMember(owner = "client!nv", name = "O", descriptor = "I")
    public static int field4443;

    @OriginalMember(owner = "client!nv", name = "P", descriptor = "I")
    public static int field4444;

    @OriginalMember(owner = "client!nv", name = "c", descriptor = "(B)V")
    public static void method1880(byte arg0) {
        field4437 = null;
        field4441 = null;
        if (arg0 != -1) {
            method1880((byte) 85);
        }
    }

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "(II)[I")
    public final int[] method25(int arg0, int arg1) {
        ++field4442;
        int[] var3 = super.field1601.method48(arg0, (byte) 0);
        if (arg1 != -16828) {
            return null;
        } else {
            if (super.field1601.field124) {
                int[] var4 = this.method710(arg0, 0, (byte) 93);
                int[] var5 = this.method710(arg0, 1, (byte) 79);
                int[] var6 = this.method710(arg0, 2, (byte) 75);
                for (int var7 = 0; ~class137.field2308 < ~var7; ++var7) {
                    int var8 = var6[var7];
                    if (~var8 == -4097) {
                        var3[var7] = var4[var7];
                    } else if (var8 == 0) {
                        var3[var7] = var5[var7];
                    } else {
                        var3[var7] = var4[var7] * var8 - -((4096 - var8) * var5[var7]) >> 12;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(IILnn;)V")
    public final void method26(int arg0, int arg1, class289 arg2) {
        ++field4443;
        if (~arg0 == -1) {
            super.field1591 = ~arg2.method1858(-3256) == -2;
        }
        int var4 = 72 % ((arg1 - 28) / 53);
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(ZLnn;)V")
    public static final void method1881(boolean arg0, class289 arg1) {
        ++field4440;
        byte[] var2 = new byte[24];
        if (class208.field3331 != null) {
            try {
                class208.field3331.method2093(-1006, 0L);
                class208.field3331.method2095((byte) 101, var2);
                int var3;
                for (var3 = 0; ~var3 > -25 && ~var2[var3] == -1; ++var3) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; ++var4) {
                    var2[var4] = -1;
                }
            }
        }
        arg1.method1813(24, 0, var2, 9262);
        if (!arg0) {
            field4441 = null;
        }
    }

    @OriginalMember(owner = "client!nv", name = "c", descriptor = "(II)[[I")
    public final int[][] method29(int arg0, int arg1) {
        ++field4444;
        if (arg0 != 255) {
            field4437 = null;
        }
        int[][] var3 = super.field1589.method859(arg1, 125);
        if (super.field1589.field1884) {
            int[] var4 = this.method710(arg1, 2, (byte) 84);
            int[][] var5 = this.method713(0, -81, arg1);
            int[][] var6 = this.method713(1, -22, arg1);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; class137.field2308 > var16; ++var16) {
                int var17 = var4[var16];
                if (var17 == 4096) {
                    var7[var16] = var10[var16];
                    var8[var16] = var11[var16];
                    var9[var16] = var12[var16];
                } else if (~var17 != -1) {
                    int var18 = -var17 + 4096;
                    var7[var16] = var10[var16] * var17 + var13[var16] * var18 >> 12;
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

    @OriginalMember(owner = "client!nv", name = "d", descriptor = "(I)Z")
    public static final boolean method1882(int arg0) {
        ++field4439;
        class261 var1 = class373.field5469.field4458.field3976;
        if (var1 != null && class373.field5469.field4458 != var1) {
            class328 var2 = (class328) var1;
            if (arg0 != -1453414076) {
                return false;
            } else {
                if (var2.field4972 >= 2000) {
                    var2.field4972 -= 2000;
                }
                return ~var2.field4972 == -1002;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(IIC)I")
    public static final int method1883(int arg0, int arg1, char arg2) {
        ++field4438;
        int var3 = arg2 << 4;
        if (Character.isUpperCase(arg2) || Character.isTitleCase(arg2)) {
            arg2 = Character.toLowerCase(arg2);
            var3 = (arg2 << 4) + 1;
        }
        if (~arg2 == -242 && ~arg1 == -1) {
            var3 = 1762;
        }
        if (arg0 != 128) {
            method1880((byte) -65);
        }
        return var3;
    }

    @OriginalMember(owner = "client!nv", name = "<init>", descriptor = "()V")
    public class290() {
        super(3, false);
    }
}
