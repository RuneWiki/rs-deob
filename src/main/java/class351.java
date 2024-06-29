import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class351 extends class442 {

    @OriginalMember(owner = "client!bf", name = "y", descriptor = "[I")
    private int[] field5039 = new int[this.field6323];

    @OriginalMember(owner = "client!bf", name = "B", descriptor = "Lpn;")
    public static class72 field5042 = new class72(76, -1);

    @OriginalMember(owner = "client!bf", name = "D", descriptor = "I")
    public static int field5044 = -1;

    @OriginalMember(owner = "client!bf", name = "C", descriptor = "Lsd;")
    public static class74 field5043 = new class74(39, 5);

    @OriginalMember(owner = "client!bf", name = "G", descriptor = "I")
    public static int field5046 = 0;

    @OriginalMember(owner = "client!bf", name = "I", descriptor = "[I")
    public static int[] field5048 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

    @OriginalMember(owner = "client!bf", name = "t", descriptor = "I")
    private int field5034;

    @OriginalMember(owner = "client!bf", name = "u", descriptor = "I")
    public static int field5035;

    @OriginalMember(owner = "client!bf", name = "v", descriptor = "I")
    public static int field5036;

    @OriginalMember(owner = "client!bf", name = "w", descriptor = "I")
    public static int field5037;

    @OriginalMember(owner = "client!bf", name = "x", descriptor = "I")
    private int field5038;

    @OriginalMember(owner = "client!bf", name = "z", descriptor = "I")
    public static int field5040;

    @OriginalMember(owner = "client!bf", name = "A", descriptor = "I")
    public static int field5041;

    @OriginalMember(owner = "client!bf", name = "H", descriptor = "I")
    public static int field5047;

    @OriginalMember(owner = "client!bf", name = "F", descriptor = "[B")
    private byte[] field5045;

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(Z)V", line = 3)
    public static void method2125(boolean arg0) {
        field5042 = null;
        field5048 = null;
        field5043 = null;
        if (arg0) {
            field5044 = -10;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lso;BLoj;Lfg;)V", line = 18)
    public static final void method2126(class334 arg0, byte arg1, class280 arg2, class21 arg3) {
        ++field5036;
        class395 var4 = arg0.method2028((byte) -112, arg2);
        if (var4 != null) {
            int var5 = var4.method220();
            if (var5 < var4.method223()) {
                var5 = var4.method223();
            }
            byte var6 = 10;
            int var7 = arg3.field298;
            int var8 = arg3.field294;
            int var9 = 0;
            int var10 = 0;
            int var11 = 0;
            if (arg0.field4822 != null) {
                var9 = class56.field715.method2424((int[]) null, class179.field2220, arg0.field4822, 104, (class395[]) null);
                for (int var12 = 0; var12 < var9; ++var12) {
                    String var13 = class179.field2220[var12];
                    if (var12 < var9 + -1) {
                        var13 = var13.substring(0, -4 + var13.length());
                    }
                    int var14 = class458.field6455.method1158(var13);
                    if (var10 < var14) {
                        var10 = var14;
                    }
                }
                var11 = class458.field6455.method1159() * var9 - -(class458.field6455.method1157() / 2);
            }
            int var15 = arg3.field298 - -(var5 / 2);
            int var16 = arg3.field294;
            if (~var7 <= ~(class429.field6201 + var5)) {
                if (-var5 + class429.field6199 < var7) {
                    var15 = -var6 + -5 + class429.field6199 + -(var5 / 2) - var10 / 2;
                    var7 = -var5 + class429.field6199;
                }
            } else {
                var7 = class429.field6201;
                var15 = var5 / 2 + var6 + var10 / 2 + 5 + class429.field6201;
            }
            if (var8 < class429.field6208 - -var5) {
                var8 = class429.field6208;
                var16 = var5 / 2 + class429.field6208 + var6;
            } else if (-var5 + class429.field6206 < var8) {
                var16 = -var6 + class429.field6206 - (var5 / 2 + var11);
                var8 = -var5 + class429.field6206;
            }
            int var17 = 65535 & (int) (32767.0D * (Math.atan2((double) (-arg3.field298 + var7), (double) (-arg3.field294 + var8)) / 3.141592653589793D));
            var4.method2366((float) var5 / 2.0F + (float) var7, (float) var5 / 2.0F + (float) var8, 4096, var17);
            if (arg1 != 83) {
                method2125(false);
            }
            int var18 = -2;
            int var19 = -2;
            int var20 = -2;
            int var21 = -2;
            if (arg0.field4822 != null) {
                var19 = var16;
                var18 = -(var10 / 2) + var15 + -5;
                var21 = var9 * class458.field6455.method1159() + var16 + 3;
                var20 = var18 + 10 - -var10;
                if (arg0.field4788 != 0) {
                    arg2.method1759(-6923, -var16 + var21, -var18 + var20, var16, arg0.field4788, var18);
                }
                if (~arg0.field4821 != -1) {
                    arg2.method1755(-4867, -var16 + var21, var18, var20 - var18, arg0.field4821, var16);
                }
                for (int var22 = 0; ~var9 < ~var22; ++var22) {
                    String var23 = class179.field2220[var22];
                    if (var22 < var9 + -1) {
                        var23 = var23.substring(0, -4 + var23.length());
                    }
                    class458.field6455.method1160(arg2, var23, var15, var16, arg0.field4778, true);
                    var16 += class458.field6455.method1159();
                }
            }
            if (arg0.field4809 != -1 || arg0.field4822 != null) {
                class50 var24 = new class50(arg3);
                int var25 = var5 >> 1;
                var24.field646 = var8 + var25;
                var24.field643 = var7 - var25;
                var24.field652 = var18;
                var24.field642 = var19;
                var24.field644 = var7 - -var25;
                var24.field654 = -var25 + var8;
                var24.field650 = var21;
                var24.field651 = var20;
                class118.field1467.method803(var24, 50);
            }
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(III)V", line = 167)
    public final void method2127(int arg0, int arg1, int arg2) {
        if (arg1 != -256) {
            field5044 = -95;
        }
        this.field5034 += this.field5039[arg2] * arg0 >> 12;
        ++field5037;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IB)V", line = 181)
    public void method172(int arg0, byte arg1) {
        ++field5035;
        this.field5045[this.field5038++] = (byte) ((class444.method2618(arg1, 255) >> 1) + 127);
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(IIIIIF)V", line = 190)
    public class351(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; ~super.field6323 < ~var7; ++var7) {
            this.field5039[var7] = (short) ((int) (4096.0D * Math.pow((double) arg5, (double) var7)));
        }
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(I)V", line = 211)
    public final void method2128(int arg0) {
        ++field5041;
        this.field5034 = 0;
        if (arg0 != 1) {
            method2126((class334) null, (byte) 94, (class280) null, (class21) null);
        }
        this.field5038 = 0;
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(I)V", line = 224)
    public final void method2129(int arg0) {
        this.field5034 = Math.abs(this.field5034);
        ++field5040;
        if (this.field5034 >= 4096) {
            this.field5034 = 4095;
        }
        this.method172(this.field5038++, (byte) (this.field5034 >> 4));
        if (arg0 == 255) {
            this.field5034 = 0;
        }
    }
}
