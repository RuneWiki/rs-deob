import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class365 extends class145 {

    @OriginalMember(owner = "client!rg", name = "L", descriptor = "I")
    private int field5033;

    @OriginalMember(owner = "client!rg", name = "N", descriptor = "Ljava/lang/String;")
    public static String field5035;

    @OriginalMember(owner = "client!rg", name = "M", descriptor = "[Lu;")
    public static class187[] field5034;

    @OriginalMember(owner = "client!rg", name = "O", descriptor = "[I")
    public static int[] field5036;

    @OriginalMember(owner = "client!rg", name = "Q", descriptor = "[I")
    public static int[] field5038;

    @OriginalMember(owner = "client!rg", name = "F", descriptor = "I")
    public static int field5028;

    @OriginalMember(owner = "client!rg", name = "G", descriptor = "I")
    public static int field5029;

    @OriginalMember(owner = "client!rg", name = "H", descriptor = "I")
    public static int field5030;

    @OriginalMember(owner = "client!rg", name = "K", descriptor = "I")
    public static int field5032;

    @OriginalMember(owner = "client!rg", name = "R", descriptor = "I")
    public static int field5039;

    @OriginalMember(owner = "client!rg", name = "P", descriptor = "Laq;")
    public static class234 field5037;

    @OriginalMember(owner = "client!rg", name = "I", descriptor = "Ljava/lang/String;")
    public static String field5031;

    static {
        new class35(64);
        field5035 = "Walk here";
        field5034 = new class187[0];
        field5036 = new int[2];
        field5038 = new int[] { 16, 32, 64, 128 };
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(I)V", line = 3)
    public class365(int arg0) {
        super(0, true);
        this.field5033 = 4096;
        this.field5033 = arg0;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lap;BI)V", line = 15)
    public final void method2(class289 arg0, byte arg1, int arg2) {
        ++field5030;
        if (~arg2 == -1) {
            this.field5033 = (arg0.method1861((byte) -72) << 12) / 255;
        }
        int var5 = 56 % ((11 - arg1) / 52);
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(II)[I", line = 41)
    public final int[] method3(int arg0, int arg1) {
        int var3 = -33 % ((arg1 - 16) / 49);
        ++field5032;
        int[] var4 = super.field2218.method1614(47, arg0);
        if (super.field2218.field3396) {
            class152.method1171(var4, 0, class156.field2364, this.field5033);
        }
        return var4;
    }

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "(I)V", line = 66)
    public static final void method2288(int arg0) {
        ++field5028;
        int var1 = class361.field4910 * 128 + 64;
        int var2 = class325.field4416 * 128 - -64;
        int var3 = class22.method281(1, class69.field1046, var2, var1) - class303.field4108;
        if (class419.field5870 >= 100) {
            class374.field5261 = class325.field4416 * 128 + 64;
            class356.field4842 = class361.field4910 * 128 - -64;
            class443.field6389 = class22.method281(1, class69.field1046, class374.field5261, class356.field4842) - class303.field4108;
        } else {
            if (var1 > class356.field4842) {
                class356.field4842 += (var1 - class356.field4842) * class419.field5870 / 1000 + class183.field2659;
                if (~var1 > ~class356.field4842) {
                    class356.field4842 = var1;
                }
            }
            if (class443.field6389 < var3) {
                class443.field6389 += (-class443.field6389 + var3) * class419.field5870 / 1000 + class183.field2659;
                if (class443.field6389 > var3) {
                    class443.field6389 = var3;
                }
            }
            if (class356.field4842 > var1) {
                class356.field4842 -= (-var1 + class356.field4842) * class419.field5870 / 1000 + class183.field2659;
                if (var1 > class356.field4842) {
                    class356.field4842 = var1;
                }
            }
            if (~class443.field6389 < ~var3) {
                class443.field6389 -= (-var3 + class443.field6389) * class419.field5870 / 1000 + class183.field2659;
                if (~class443.field6389 > ~var3) {
                    class443.field6389 = var3;
                }
            }
            if (class374.field5261 < var2) {
                class374.field5261 += (var2 - class374.field5261) * class419.field5870 / 1000 + class183.field2659;
                if (~var2 > ~class374.field5261) {
                    class374.field5261 = var2;
                }
            }
            if (~class374.field5261 < ~var2) {
                class374.field5261 -= class183.field2659 - -((class374.field5261 - var2) * class419.field5870 / 1000);
                if (class374.field5261 < var2) {
                    class374.field5261 = var2;
                }
            }
        }
        int var4 = class19.field371 * 128 + 64;
        int var5 = class360.field4896 * 128 - -64;
        int var6 = class22.method281(1, class69.field1046, var4, var5) - class183.field2667;
        int var7 = -class356.field4842 + var5;
        int var8 = -class443.field6389 + var6;
        int var9 = -class374.field5261 + var4;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
        int var11 = (int) (2607.5945876176133D * Math.atan2((double) var8, (double) var10)) & 16383;
        int var12 = (int) (Math.atan2((double) var7, (double) var9) * -2607.5945876176133D) & 16383;
        if (var11 < 1024) {
            var11 = 1024;
        }
        if (~var11 < -3073) {
            var11 = 3072;
        }
        if (class167.field2488 < var11) {
            class167.field2488 += class265.field3565 - -((-class167.field2488 + var11 >> 3) * class83.field1218 / 1000) << 3;
            if (class167.field2488 > var11) {
                class167.field2488 = var11;
            }
        }
        if (var11 < class167.field2488) {
            class167.field2488 -= (class167.field2488 - var11 >> 3) * class83.field1218 / 1000 + class265.field3565 << 3;
            if (class167.field2488 < var11) {
                class167.field2488 = var11;
            }
        }
        int var13 = -class286.field3837 + var12;
        if (var13 > 8192) {
            var13 -= 16384;
        }
        if (var13 < -8192) {
            var13 += 16384;
        }
        int var14 = var13 >> 3;
        if (var14 > 0) {
            class286.field3837 += class83.field1218 * var14 / 1000 + class265.field3565 << 3;
            class286.field3837 &= 16383;
        }
        if (var14 < 0) {
            class286.field3837 -= class265.field3565 - -(-var14 * class83.field1218 / 1000) << 3;
            class286.field3837 &= 16383;
        }
        int var15 = -class286.field3837 + var12;
        if (~var15 < -8193) {
            var15 -= 16384;
        }
        if (var15 < -8192) {
            var15 += 16384;
        }
        if (var15 < arg0 && ~var14 < -1 || ~var15 < -1 && ~var14 > -1) {
            class286.field3837 = var12;
        }
    }

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "(I)V", line = 237)
    public static void method2289(int arg0) {
        field5034 = null;
        field5037 = null;
        field5038 = null;
        if (arg0 == -5733) {
            field5035 = null;
            field5036 = null;
            field5031 = null;
        }
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "()V", line = 256)
    public class365() {
        this(4096);
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Ljava/lang/String;ZI)V", line = 266)
    public static final void method2290(String arg0, boolean arg1, int arg2) {
        ++field5029;
        class332.field4514.field6055 = 1;
        String var3 = arg0.toLowerCase();
        short[] var4 = new short[16];
        int var5 = 0;
        for (int var6 = 0; ~class128.field1824 < ~var6; ++var6) {
            class452 var9 = class234.method1569(2142, var6);
            if ((!arg1 || var9.field6592) && ~var9.field6529 == 0 && ~var9.field6586 == 0 && ~var9.field6590 == -1 && var9.field6595.toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 250) {
                    class358.field4858 = null;
                    class97.field1406 = -1;
                    return;
                }
                if (var4.length <= var5) {
                    short[] var10 = new short[var4.length * 2];
                    for (int var11 = 0; ~var11 > ~var5; ++var11) {
                        var10[var11] = var4[var11];
                    }
                    var4 = var10;
                }
                var4[var5++] = (short) var6;
            }
        }
        class97.field1406 = var5;
        class358.field4858 = var4;
        if (arg2 >= -37) {
            method2288(95);
        }
        class221.field3052 = 0;
        String[] var7 = new String[class97.field1406];
        for (int var8 = 0; var8 < class97.field1406; ++var8) {
            var7[var8] = class234.method1569(2142, var4[var8]).field6595;
        }
        class1.method7(var7, -90, class358.field4858);
        class332.field4514.method2631((byte) -1);
        class332.field4514.field6055 = 2;
    }
}
