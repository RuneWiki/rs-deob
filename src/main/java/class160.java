import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public abstract class class160 {

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "I")
    public static int field2847 = -1;

    @OriginalMember(owner = "client!tm", name = "f", descriptor = "Lke;")
    public static class256 field2851 = class316.method2202("runes", 27626);

    @OriginalMember(owner = "client!tm", name = "h", descriptor = "Lke;")
    public static class256 field2853 = class316.method2202("Chargement en cours)3)3)3", 27626);

    @OriginalMember(owner = "client!tm", name = "e", descriptor = "Lke;")
    public static class256 field2850 = class316.method2202("blanc:", 27626);

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "Lke;")
    public static class256 field2846 = class316.method2202("Null", 27626);

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "Lke;")
    public static class256 field2848 = class316.method2202("<col=ffff00>", 27626);

    @OriginalMember(owner = "client!tm", name = "i", descriptor = "Lke;")
    public static class256 field2854 = class316.method2202(")4a=", 27626);

    @OriginalMember(owner = "client!tm", name = "g", descriptor = "[I")
    public static int[] field2852 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!tm", name = "j", descriptor = "I")
    public static int field2855 = 0;

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "I")
    public static int field2849;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)V", line = 13)
    public static void method1183(int arg0) {
        field2852 = null;
        if (arg0 != -14291) {
            field2850 = (class256) null;
        }
        field2850 = null;
        field2853 = null;
        field2848 = null;
        field2851 = null;
        field2846 = null;
        field2854 = null;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIIIIIII)V", line = 51)
    public static final void method1184(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = 0;
        field2849++;
        int var9 = arg4;
        int var10 = arg1 - arg5;
        int var11 = arg1 * arg1;
        int var12 = arg4 - arg5;
        int var13 = var10 * var10;
        int var14 = 0;
        int var15 = arg4 * arg4;
        if (arg0 != 8) {
            field2850 = (class256) null;
        }
        int var16 = var12 * var12;
        int var17 = var11 << 1;
        int var18 = var15 << 1;
        int var19 = var16 << 1;
        int var20 = var13 << 1;
        int var21 = arg4 << 1;
        int var22 = var15 - ((var21 - 1) * var17);
        int var23 = var12 << 1;
        int var24 = (1 - var21) * var11 + var18;
        int var25 = (1 - var23) * var13 + var19;
        int var26 = var11 << 2;
        int var27 = var15 << 2;
        int var28 = var16 - ((var23 - 1) * var20);
        int var29 = var13 << 2;
        int var30 = var16 << 2;
        int var31 = (var21 - 3) * var17;
        int var32 = var18 * 3;
        int var33 = (var23 - 3) * var20;
        int var34 = var30;
        int var35 = var27;
        int var36 = var19 * 3;
        if (class105.field1887 <= arg7 && class274.field4748 >= arg7) {
            int[] var37 = class308.field5329[arg7];
            int var38 = class101.method731(class175.field3106, arg3 - arg1, class244.field4161, true);
            int var39 = class101.method731(class175.field3106, arg1 + arg3, class244.field4161, true);
            int var40 = class101.method731(class175.field3106, arg3 - var10, class244.field4161, true);
            int var41 = class101.method731(class175.field3106, arg3 + var10, class244.field4161, true);
            class73.method550(arg0 - 29911, var37, var40, var38, arg2);
            class73.method550(-29903, var37, var41, var40, arg6);
            class73.method550(arg0 ^ 0xFFFF8B39, var37, var39, var41, arg2);
        }
        int var42 = (arg4 - 1) * var26;
        int var43 = (var12 - 1) * var29;
        while (var9 > 0) {
            if (var24 < 0) {
                while (var24 < 0) {
                    var22 += var35;
                    var24 += var32;
                    var32 += var27;
                    var35 += var27;
                    var8++;
                }
            }
            if (var22 < 0) {
                var8++;
                var24 += var32;
                var32 += var27;
                var22 += var35;
                var35 += var27;
            }
            boolean var44 = var9 <= var12;
            var22 += -var31;
            if (var44) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var14++;
                        var25 += var36;
                        var28 += var34;
                        var34 += var30;
                        var36 += var30;
                    }
                }
                if (var28 < 0) {
                    var14++;
                    var25 += var36;
                    var28 += var34;
                    var34 += var30;
                    var36 += var30;
                }
                var28 += -var33;
                var33 -= var29;
                var25 += -var43;
                var43 -= var29;
            }
            var24 += -var42;
            var31 -= var26;
            var9--;
            int var45 = arg7 - var9;
            var42 -= var26;
            int var46 = arg7 + var9;
            if (class105.field1887 <= var46 && class274.field4748 >= var45) {
                int var47 = class101.method731(class175.field3106, arg3 + var8, class244.field4161, true);
                int var48 = class101.method731(class175.field3106, arg3 - var8, class244.field4161, true);
                if (var44) {
                    int var49 = class101.method731(class175.field3106, arg3 + var14, class244.field4161, true);
                    int var50 = class101.method731(class175.field3106, arg3 - var14, class244.field4161, true);
                    if (class105.field1887 <= var45) {
                        int[] var51 = class308.field5329[var45];
                        class73.method550(-29903, var51, var50, var48, arg2);
                        class73.method550(-29903, var51, var49, var50, arg6);
                        class73.method550(-29903, var51, var47, var49, arg2);
                    }
                    if (class274.field4748 >= var46) {
                        int[] var52 = class308.field5329[var46];
                        class73.method550(-29903, var52, var50, var48, arg2);
                        class73.method550(-29903, var52, var49, var50, arg6);
                        class73.method550(arg0 ^ 0xFFFF8B39, var52, var47, var49, arg2);
                    }
                } else {
                    if (var45 >= class105.field1887) {
                        class73.method550(-29903, class308.field5329[var45], var47, var48, arg2);
                    }
                    if (var46 <= class274.field4748) {
                        class73.method550(arg0 ^ 0xFFFF8B39, class308.field5329[var46], var47, var48, arg2);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "([BB)V")
    public abstract void method1185(byte[] arg0, byte arg1);

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(B)[B")
    public abstract byte[] method1186(byte arg0);
}
