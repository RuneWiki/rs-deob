import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("p")
public class class139 extends class187 {

    @OriginalMember(owner = "p", name = "Ac", descriptor = "I")
    public static int field2694 = 20;

    @OriginalMember(owner = "p", name = "Bc", descriptor = "I")
    public static int field2695 = 1;

    @OriginalMember(owner = "p", name = "Ec", descriptor = "I")
    public static int field2698 = 0;

    @OriginalMember(owner = "p", name = "Dc", descriptor = "I")
    public static int field2697 = -1;

    @OriginalMember(owner = "p", name = "vc", descriptor = "I")
    public static int field2689 = 0;

    @OriginalMember(owner = "p", name = "Gc", descriptor = "Llf;")
    private static class109 field2700 = class35.method275("Could not complete login)3", 2);

    @OriginalMember(owner = "p", name = "Ic", descriptor = "Llf;")
    public static class109 field2702 = class35.method275("me", 2);

    @OriginalMember(owner = "p", name = "yc", descriptor = "Llf;")
    public static class109 field2692 = field2700;

    @OriginalMember(owner = "p", name = "Hc", descriptor = "Z")
    public static boolean field2701 = false;

    @OriginalMember(owner = "p", name = "wc", descriptor = "I")
    public static int field2690;

    @OriginalMember(owner = "p", name = "zc", descriptor = "I")
    public static int field2693;

    @OriginalMember(owner = "p", name = "Cc", descriptor = "I")
    public static int field2696;

    @OriginalMember(owner = "p", name = "Fc", descriptor = "I")
    public static int field2699;

    @OriginalMember(owner = "p", name = "Jc", descriptor = "I")
    public static int field2703;

    @OriginalMember(owner = "p", name = "Kc", descriptor = "Loh;")
    public static class138 field2704;

    @OriginalMember(owner = "p", name = "xc", descriptor = "Lsd;")
    public class170 field2691;

    @OriginalMember(owner = "p", name = "a", descriptor = "(ILja;)Lj;")
    public static final class85 method993(int arg0, class86 arg1) {
        ++field2693;
        int var2 = arg1.method598((byte) 103);
        int var3 = arg1.method598((byte) 119);
        Class var4 = client.method259(var3, -13);
        try {
            class85 var5 = (class85) var4.newInstance();
            if (arg0 >= -41) {
                field2694 = 29;
            }
            if (var5 != null) {
                var5.field1730 = var2;
                var5.field1729 = arg1.method598((byte) 118);
                int var6 = arg1.method598((byte) 127);
                for (int var7 = 0; ~var7 > ~var6; ++var7) {
                    int var8 = arg1.method598((byte) 123);
                    var5.method31((byte) -123, var8, arg1);
                }
            }
            var5.method199(25614);
            return var5;
        } catch (IllegalAccessException var9) {
            throw new RuntimeException();
        } catch (InstantiationException var10) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "p", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method421(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        ++field2699;
        if (this.field2691 != null) {
            class20 var11 = super.field3597 != -1 && super.field3570 == 0 ? client.method246(12, super.field3597) : null;
            class20 var12 = super.field3579 == -1 || ~super.field3579 == ~super.field3544 && var11 != null ? null : client.method246(12, super.field3579);
            class189 var13 = this.field2691.method1147(-107, var11, super.field3573, super.field3558, var12);
            if (var13 != null) {
                var13.method1274();
                super.field1945 = var13.field1945;
                if (this.field2691.field3178 != 0 && ~this.field2691.field3165 != -1) {
                    int var14 = class124.field2383[arg0];
                    int var15 = class124.field2387[arg0];
                    short var16 = this.field2691.field3165;
                    int var17 = -var16 / 2;
                    short var18 = this.field2691.field3178;
                    int var19 = -var18 / 2;
                    int var20 = var14 * var17 - -(var15 * var19) >> 16;
                    int var21 = var18 / 2;
                    int var22 = var15 * var17 + -(var14 * var19) >> 16;
                    int var23 = class19.method180(super.field3609 - -var22, false, class72.field1405, super.field3549 - -var20);
                    int var24 = -var16 / 2;
                    int var25 = var14 * var24 + var15 * var21 >> 16;
                    int var26 = var15 * var24 - var14 * var21 >> 16;
                    int var27 = -var18 / 2;
                    int var28 = class19.method180(super.field3609 + var26, false, class72.field1405, super.field3549 + var25);
                    int var29 = var16 / 2;
                    int var30 = var14 * var29 + var15 * var27 >> 16;
                    int var31 = var16 / 2;
                    int var32 = var15 * var29 + -(var14 * var27) >> 16;
                    int var33 = var18 / 2;
                    int var34 = var15 * var31 + -(var14 * var33) >> 16;
                    int var35 = var14 * var31 + var15 * var33 >> 16;
                    int var36 = class19.method180(super.field3609 + var32, false, class72.field1405, super.field3549 + var30);
                    int var37 = class19.method180(super.field3609 - -var34, false, class72.field1405, super.field3549 + var35);
                    int var38 = var28 <= var23 ? var28 : var23;
                    int var39 = ~var37 >= ~var36 ? var37 : var36;
                    int var40 = ~var28 <= ~var37 ? var37 : var28;
                    int var41 = ~var23 > ~var36 ? var23 : var36;
                    int var42 = (int) (Math.atan2((double) (-var39 + var38), (double) var16) * 320.0D) & 2047;
                    int var43 = (var38 + var39 + var41 - -var40) / 4;
                    var13.method1275(var42);
                    int var44 = (int) (Math.atan2((double) (-var40 + var41), (double) var18) * 320.0D) & 2047;
                    var13.method1276(var44);
                    var13.method1277(0, -super.field3584 + var43, 0);
                }
                class189 var45 = null;
                if (~super.field3583 != 0 && ~super.field3598 != 0) {
                    var45 = class193.method1297(super.field3583, -18753).method822(super.field3598, 125);
                    if (var45 != null) {
                        var45.method1277(0, -super.field3607, 0);
                    }
                }
                if (var45 != null) {
                    var13 = ((class66) var13).method429(var45);
                }
                if (this.field2691.field3175 == 1) {
                    var13.field3625 = true;
                }
                var13.method421(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            }
        }
    }

    @OriginalMember(owner = "p", name = "a", descriptor = "(II)I")
    public static final int method994(int arg0, int arg1) {
        int var2 = (arg0 & 127) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 65408) + var2;
    }

    @OriginalMember(owner = "p", name = "a", descriptor = "(IIIIIII)V")
    public static final void method995(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field2696;
        int var7 = 2047 & -arg6 + 2048;
        int var8 = 2047 & -arg1 + 2048;
        int var9 = 0;
        int var10 = 0;
        int var11 = arg3;
        if (arg0 <= 62) {
            method997(true);
        }
        if (var7 != 0) {
            int var12 = class124.field2387[var7];
            int var13 = class124.field2383[var7];
            int var14 = var10 * var12 + -(arg3 * var13) >> 16;
            var11 = var10 * var13 + arg3 * var12 >> 16;
            var10 = var14;
        }
        if (var8 != 0) {
            int var15 = class124.field2387[var8];
            int var16 = class124.field2383[var8];
            int var17 = var9 * var15 + var11 * var16 >> 16;
            var11 = var11 * var15 - var9 * var16 >> 16;
            var9 = var17;
        }
        class39.field836 = -var9 + arg5;
        class114.field2267 = -var11 + arg2;
        class143.field2748 = arg1;
        class72.field1397 = arg6;
        class125.field2419 = -var10 + arg4;
    }

    @OriginalMember(owner = "p", name = "c", descriptor = "(I)Z")
    public final boolean method996(int arg0) {
        ++field2703;
        if (arg0 != 0) {
            field2698 = -33;
        }
        return this.field2691 != null;
    }

    @OriginalMember(owner = "p", name = "d", descriptor = "(Z)V")
    public static void method997(boolean arg0) {
        field2692 = null;
        field2704 = null;
        field2700 = null;
        if (arg0) {
            field2702 = null;
        }
    }
}
