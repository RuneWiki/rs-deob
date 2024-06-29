import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class442 extends class119 {

    @OriginalMember(owner = "client!cj", name = "m", descriptor = "I")
    private int field6425;

    @OriginalMember(owner = "client!cj", name = "k", descriptor = "I")
    private int field6423;

    @OriginalMember(owner = "client!cj", name = "q", descriptor = "I")
    private int field6429;

    @OriginalMember(owner = "client!cj", name = "h", descriptor = "I")
    private int field6420;

    @OriginalMember(owner = "client!cj", name = "i", descriptor = "I")
    public static int field6421 = 0;

    @OriginalMember(owner = "client!cj", name = "l", descriptor = "[Lme;")
    public static class634[] field6424 = new class634[37];

    @OriginalMember(owner = "client!cj", name = "p", descriptor = "F")
    public static float field6428;

    @OriginalMember(owner = "client!cj", name = "g", descriptor = "I")
    public static int field6419;

    @OriginalMember(owner = "client!cj", name = "j", descriptor = "I")
    public static int field6422;

    @OriginalMember(owner = "client!cj", name = "n", descriptor = "I")
    public static int field6426;

    @OriginalMember(owner = "client!cj", name = "o", descriptor = "I")
    public static int field6427;

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(IIIIIII)V")
    public class442(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field6425 = arg0;
        this.field6423 = arg2;
        this.field6429 = arg3;
        this.field6420 = arg1;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIZ)V")
    public final void method460(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            this.field6420 = -24;
        }
        ++field6426;
        int var4 = this.field6425 * arg1 >> 12;
        int var5 = this.field6423 * arg1 >> 12;
        int var6 = this.field6420 * arg0 >> 12;
        int var7 = this.field6429 * arg0 >> 12;
        class470.method2871(super.field1828, var4, 0, var6, var7, var5, super.field1832);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(III)V")
    public final void method465(int arg0, int arg1, int arg2) {
        ++field6419;
        int var4 = this.field6425 * arg2 >> 12;
        if (arg1 != 2) {
            this.method463(false, -29, 8);
        }
        int var5 = this.field6423 * arg2 >> 12;
        int var6 = this.field6420 * arg0 >> 12;
        int var7 = this.field6429 * arg0 >> 12;
        class12.method53(super.field1828, var6, (byte) -124, var7, var4, var5, super.field1832, super.field1830);
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(Z)V")
    public static void method2709(boolean arg0) {
        field6424 = null;
        if (!arg0) {
            field6424 = null;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZII)V")
    public final void method463(boolean arg0, int arg1, int arg2) {
        ++field6427;
        int var4 = this.field6425 * arg1 >> 12;
        int var5 = this.field6423 * arg1 >> 12;
        int var6 = this.field6420 * arg2 >> 12;
        int var7 = this.field6429 * arg2 >> 12;
        class495.method3007(super.field1830, var5, var6, (byte) 69, var7, var4);
        if (arg0) {
            this.method463(false, 99, 76);
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IILgba;)Z")
    public static final boolean method2710(int arg0, int arg1, class702 arg2) {
        ++field6422;
        int var3 = arg2.method3905(arg0 + -9, 2);
        if (var3 == 0) {
            if (~arg2.method3905(-4, 1) != -1) {
                method2710(5, arg1, arg2);
            }
            int var4 = arg2.method3905(-4, 6);
            int var5 = arg2.method3905(arg0 + -9, 6);
            boolean var6 = ~arg2.method3905(arg0 + -9, 1) == -2;
            if (var6) {
                class505.field7374[class395.field5901++] = arg1;
            }
            if (class279.field4271[arg1] != null) {
                throw new RuntimeException("hr:lr");
            } else {
                class195 var7 = class457.field6636[arg1];
                class573 var8 = class279.field4271[arg1] = new class573();
                var8.field1628 = arg1;
                if (class85.field1255[arg1] != null) {
                    var8.method3327(class85.field1255[arg1], arg0 ^ -6);
                }
                var8.method884(true, var7.field3357, 30934);
                var8.field1687 = var7.field3355;
                int var9 = var7.field3354;
                int var10 = var9 >> 28;
                int var11 = (4183728 & var9) >> 14;
                int var12 = var9 & 255;
                int var13 = (var11 << 6) + -class265.field4123 + var4;
                var8.field8133 = var7.field3358;
                int var14 = (var12 << 6) + var5 + -class723.field10155;
                var8.field1708[0] = class397.field5909[arg1];
                var8.field9470 = var8.field9469 = (byte) var10;
                if (class584.method3365(false, var13, var14)) {
                    ++var8.field9469;
                }
                var8.method3325(var13, var14, arg0 ^ 90);
                var8.field8122 = false;
                class457.field6636[arg1] = null;
                return true;
            }
        } else if (var3 == 1) {
            int var15 = arg2.method3905(-4, 2);
            int var16 = class457.field6636[arg1].field3354;
            class457.field6636[arg1].field3354 = ((var16 >> 28) + var15 << 28 & 805306368) + (var16 & 268435455);
            return false;
        } else if (~var3 == -3) {
            int var17 = arg2.method3905(-4, 5);
            int var18 = var17 >> 3;
            int var19 = var17 & 7;
            int var20 = class457.field6636[arg1].field3354;
            int var21 = (var20 >> 28) + var18 & 3;
            int var22 = 255 & var20 >> 14;
            int var23 = var20 & 255;
            if (var19 == 0) {
                --var22;
                --var23;
            }
            if (~var19 == -2) {
                --var23;
            }
            if (~var19 == -3) {
                ++var22;
                --var23;
            }
            if (var19 == 3) {
                --var22;
            }
            if (~var19 == -5) {
                ++var22;
            }
            if (var19 == 5) {
                --var22;
                ++var23;
            }
            if (var19 == 6) {
                ++var23;
            }
            if (var19 == 7) {
                ++var22;
                ++var23;
            }
            class457.field6636[arg1].field3354 = (var21 << 28) - -(var22 << 14) + var23;
            return false;
        } else {
            int var24 = arg2.method3905(-4, 18);
            if (arg0 != 5) {
                return true;
            } else {
                int var25 = var24 >> 16;
                int var26 = (65352 & var24) >> 8;
                int var27 = 255 & var24;
                int var28 = class457.field6636[arg1].field3354;
                int var29 = 3 & (var28 >> 28) + var25;
                int var30 = (var28 >> 14) + var26 & 255;
                int var31 = 255 & var27 + var28;
                class457.field6636[arg1].field3354 = (var29 << 28) + (var30 << 14) + var31;
                return false;
            }
        }
    }
}
