import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nu")
public abstract class class259 extends class419 {

    @OriginalMember(owner = "client!nu", name = "h", descriptor = "Z")
    public boolean field3853 = false;

    @OriginalMember(owner = "client!nu", name = "r", descriptor = "Z")
    public boolean field3863 = false;

    @OriginalMember(owner = "client!nu", name = "s", descriptor = "I")
    public int field3864;

    @OriginalMember(owner = "client!nu", name = "p", descriptor = "I")
    public int field3861;

    @OriginalMember(owner = "client!nu", name = "q", descriptor = "S")
    public short field3862;

    @OriginalMember(owner = "client!nu", name = "i", descriptor = "I")
    public int field3854;

    @OriginalMember(owner = "client!nu", name = "j", descriptor = "I")
    public static int field3855;

    @OriginalMember(owner = "client!nu", name = "k", descriptor = "I")
    public static int field3856;

    @OriginalMember(owner = "client!nu", name = "l", descriptor = "I")
    public static int field3857;

    @OriginalMember(owner = "client!nu", name = "m", descriptor = "I")
    public static int field3858;

    @OriginalMember(owner = "client!nu", name = "n", descriptor = "I")
    public static int field3859;

    @OriginalMember(owner = "client!nu", name = "o", descriptor = "I")
    public static int field3860;

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(III)B")
    public static final byte method1622(int arg0, int arg1, int arg2) {
        field3858++;
        if (arg1 == 9) {
            int var3 = 43 / ((arg0 + 10) / 49);
            return (byte) ((arg2 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1623(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3857++;
        if (arg5 > -66) {
            field3856 = 31;
        }
        class427[] var7 = class390.field5874;
        for (int var8 = 0; var8 < var7.length; var8++) {
            class427 var9 = var7[var8];
            if (var9 != null && var9.field6358 == 2) {
                class406.method2444(var9.field6366, arg3 >> 1, (byte) 110, arg6, var9.field6359, arg2 >> 1, var9.field6365 * 2, arg0, var9.field6356);
                if (class142.field2140[0] > -1 && (class86.field1350 % 20) < 10) {
                    class320.field4932[var9.field6360].method936(class142.field2140[0] + arg4 - 12, class142.field2140[1] + -28 + arg1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!nu", name = "c", descriptor = "(B)V")
    public static final void method1624(byte arg0) {
        field3855++;
        class476.method2836(class454.field6661.field971, -88);
        int var1 = (class282.field4263 >> 10) + (class267.field3979 >> 3);
        int var2 = (class393.field5897 >> 10) + (class241.field3358 >> 3);
        class521.field7651 = class410.field6198.field7686 = 0;
        class410.field6198.method2863((byte) 76, 8, 8);
        byte var3 = 18;
        class163.field2433 = new int[var3];
        class451.field6630 = new int[var3];
        int var4 = -79 / ((arg0 - 8) / 48);
        class27.field393 = new int[var3];
        class450.field6624 = new byte[var3][];
        class146.field2201 = new int[var3];
        class229.field3226 = new byte[var3][];
        class495.field7349 = new int[var3];
        class230.field3231 = new byte[var3][];
        class194.field2866 = new byte[var3][];
        class23.field335 = new int[var3][4];
        class180.field2659 = new int[var3];
        class50.field639 = new byte[var3][];
        int var5 = 0;
        for (int var6 = (var1 - (class50.field640 >> 4)) / 8; var6 <= ((var1 + (class50.field640 >> 4)) / 8); var6++) {
            for (int var9 = (var2 - (class448.field6611 >> 4)) / 8; var9 <= ((var2 + (class448.field6611 >> 4)) / 8); var9++) {
                int var10 = (var6 << 8) + var9;
                class495.field7349[var5] = var10;
                class27.field393[var5] = class302.field4502.method539((byte) 27, "m" + var6 + "_" + var9);
                class163.field2433[var5] = class302.field4502.method539((byte) 27, "l" + var6 + "_" + var9);
                class451.field6630[var5] = class302.field4502.method539((byte) 27, "n" + var6 + "_" + var9);
                class146.field2201[var5] = class302.field4502.method539((byte) 27, "um" + var6 + "_" + var9);
                class180.field2659[var5] = class302.field4502.method539((byte) 27, "ul" + var6 + "_" + var9);
                if (class451.field6630[var5] == -1) {
                    class27.field393[var5] = -1;
                    class163.field2433[var5] = -1;
                    class146.field2201[var5] = -1;
                    class180.field2659[var5] = -1;
                }
                var5++;
            }
        }
        for (int var7 = var5; var7 < class451.field6630.length; var7++) {
            class451.field6630[var7] = -1;
            class27.field393[var7] = -1;
            class163.field2433[var7] = -1;
            class146.field2201[var7] = -1;
            class180.field2659[var7] = -1;
        }
        byte var8;
        if (class411.field6213 == 1 || class411.field6213 == 2) {
            var8 = 3;
        } else {
            var8 = 7;
        }
        class498.method2963(var8, (byte) 87, var2, var1, false);
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(IIIIZI)V")
    public static final void method1625(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field3859++;
        int var6 = 0;
        int var7 = arg2;
        int var8 = arg0 * arg0;
        int var9 = arg2 * arg2;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg2 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - ((var12 - 1) * var11);
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        if (!arg4) {
            field3860 = -52;
        }
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg2 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        int var20 = (arg2 - 1) * var15;
        if (arg3 >= class305.field4555 && arg3 <= class286.field4290) {
            int var21 = class375.method2223(false, arg0 + arg1, class102.field1544, class297.field4427);
            int var22 = class375.method2223(false, arg1 - arg0, class102.field1544, class297.field4427);
            class94.method740(class306.field4574[arg3], var22, var21, arg5, false);
        }
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var13 += var17;
                    var14 += var19;
                    var6++;
                    var17 += var16;
                    var19 += var16;
                }
            }
            if (var14 < 0) {
                var13 += var17;
                var14 += var19;
                var17 += var16;
                var6++;
                var19 += var16;
            }
            var13 += -var20;
            var14 += -var18;
            var18 -= var15;
            var20 -= var15;
            var7--;
            int var23 = arg3 - var7;
            int var24 = arg3 + var7;
            if (class305.field4555 <= var24 && class286.field4290 >= var23) {
                int var25 = class375.method2223(!arg4, arg1 + var6, class102.field1544, class297.field4427);
                int var26 = class375.method2223(!arg4, arg1 - var6, class102.field1544, class297.field4427);
                if (class305.field4555 <= var23) {
                    class94.method740(class306.field4574[var23], var26, var25, arg5, false);
                }
                if (var24 <= class286.field4290) {
                    class94.method740(class306.field4574[var24], var26, var25, arg5, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!nu", name = "<init>", descriptor = "(IIIIZZ)V")
    public class259(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5) {
        this.field3863 = arg5;
        this.field3853 = arg4;
        this.field3864 = arg0;
        this.field3861 = arg1;
        this.field3862 = (short) arg3;
        this.field3854 = arg2;
    }
}
