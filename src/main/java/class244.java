import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class244 extends class55 {

    @OriginalMember(owner = "client!hc", name = "m", descriptor = "I")
    private int field3892 = -32768;

    @OriginalMember(owner = "client!hc", name = "o", descriptor = "Lcc;")
    public static class222 field3894 = null;

    @OriginalMember(owner = "client!hc", name = "q", descriptor = "Lcc;")
    public static class222 field3896 = null;

    @OriginalMember(owner = "client!hc", name = "p", descriptor = "Ljava/lang/String;")
    public static String field3895 = "white:";

    @OriginalMember(owner = "client!hc", name = "z", descriptor = "Ljava/lang/String;")
    public static String field3905 = "glow3:";

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "I")
    public static int field3891;

    @OriginalMember(owner = "client!hc", name = "n", descriptor = "I")
    public static int field3893;

    @OriginalMember(owner = "client!hc", name = "r", descriptor = "I")
    public static int field3897;

    @OriginalMember(owner = "client!hc", name = "s", descriptor = "I")
    public static int field3898;

    @OriginalMember(owner = "client!hc", name = "t", descriptor = "I")
    public int field3899;

    @OriginalMember(owner = "client!hc", name = "u", descriptor = "I")
    public int field3900;

    @OriginalMember(owner = "client!hc", name = "v", descriptor = "I")
    public static int field3901;

    @OriginalMember(owner = "client!hc", name = "w", descriptor = "I")
    public static int field3902;

    @OriginalMember(owner = "client!hc", name = "x", descriptor = "I")
    public static int field3903;

    @OriginalMember(owner = "client!hc", name = "y", descriptor = "I")
    public static int field3904;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V")
    public static final void method1655(int arg0) {
        class89.method688();
        field3902++;
        int var1 = 0;
        if (arg0 <= 9) {
            field3905 = null;
        }
        while (var1 < 4) {
            class80.field1236[var1].method687((byte) 84);
            var1++;
        }
        System.gc();
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIIII)V")
    public static final void method1656(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 0;
        field3897++;
        int var7 = arg5;
        int var8 = arg5 * arg5;
        int var9 = var8 << 1;
        int var10 = arg0 * arg0;
        int var11 = var10 << 1;
        int var12 = arg5 << 1;
        int var13 = (1 - var12) * var10 + var9;
        int var14 = var8 - ((var12 - 1) * var11);
        int var15 = var10 << 2;
        int var16 = var8 << 2;
        int var17 = ((var6 << 1) + 3) * var9;
        int var18 = ((arg5 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        if (arg2 >= class112.field1727 && class278.field4410 >= arg2) {
            int var20 = class47.method396(class184.field2914, arg4 + arg0, 79, class2.field42);
            int var21 = class47.method396(class184.field2914, arg4 - arg0, 120, class2.field42);
            class173.method1240((byte) -128, var20, class55.field872[arg2], arg1, var21);
        }
        int var22 = (arg5 - 1) * var15;
        int var23 = 20 % ((26 - arg3) / 50);
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var13 += var17;
                    var14 += var19;
                    var17 += var16;
                    var19 += var16;
                    var6++;
                }
            }
            var7--;
            if (var14 < 0) {
                var13 += var17;
                var17 += var16;
                var6++;
                var14 += var19;
                var19 += var16;
            }
            int var24 = arg2 - var7;
            int var25 = arg2 + var7;
            if (var25 >= class112.field1727 && class278.field4410 >= var24) {
                int var26 = class47.method396(class184.field2914, arg4 + var6, 28, class2.field42);
                int var27 = class47.method396(class184.field2914, arg4 - var6, -127, class2.field42);
                if (var24 >= class112.field1727) {
                    class173.method1240((byte) -98, var26, class55.field872[var24], arg1, var27);
                }
                if (var25 <= class278.field4410) {
                    class173.method1240((byte) -115, var26, class55.field872[var25], arg1, var27);
                }
            }
            var13 += -var22;
            var14 += -var18;
            var22 -= var15;
            var18 -= var15;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIII)V")
    public final void method91(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3903++;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "()I")
    public final int method82() {
        field3904++;
        return this.field3892;
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(Z)V")
    public static void method1657(boolean arg0) {
        field3894 = null;
        if (arg0) {
            method1656(0, 119, -91, -17, -21, 118);
        }
        field3905 = null;
        field3895 = null;
        field3896 = null;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIIIZZ)V")
    public static final void method1658(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        field3898++;
        if (arg2 == 3) {
            method1658(arg0, arg1, class42.field709, -1, -1, true, true);
            return;
        }
        Container var7;
        if (class103.field1599 != null) {
            var7 = class103.field1599;
        } else if (class170.field2582 == null) {
            var7 = class123.field1863.field63;
        } else {
            var7 = class170.field2582;
        }
        class305.field4898 = var7.getSize().width;
        class15.field196 = var7.getSize().height;
        if (class170.field2582 == var7) {
            Insets var8 = class170.field2582.getInsets();
            class15.field196 -= var8.top + var8.bottom;
            class305.field4898 -= var8.left + var8.right;
        }
        if (arg2 >= 2) {
            class163.field2449 = class15.field196;
            class179.field2816 = class305.field4898;
            class294.field4574 = 0;
            class26.field439 = 0;
        } else {
            class294.field4574 = (class305.field4898 - 765) / 2;
            class179.field2816 = 765;
            class163.field2449 = 503;
            class26.field439 = 0;
        }
        if (arg5) {
            class223.method1535(28468, class105.field1651);
            class27.method222(true, class105.field1651);
            if (class104.field1622 != null) {
                class104.field1622.method615(class105.field1651, 0);
            }
            class214.field3283.method1112(63);
            class297.method1989((byte) 80, class105.field1651);
            class133.method986(class105.field1651, false);
            if (class104.field1622 != null) {
                class104.field1622.method608(class105.field1651, arg1 + 17149);
            }
        } else {
            class105.field1651.setSize(class179.field2816, class163.field2449);
            if (class170.field2582 == var7) {
                Insets var9 = class170.field2582.getInsets();
                class105.field1651.setLocation(class294.field4574 + var9.left, class26.field439 + var9.top);
            } else {
                class105.field1651.setLocation(class294.field4574, class26.field439);
            }
        }
        if (~arg2 < arg1) {
            method1658(arg0, -1, 0, -1, -1, true, true);
            return;
        }
        class291.field4518 = !class110.method819(false);
        class249.method1692(class179.field2816, class163.field2449);
        if (class298.field4803 != -1) {
            class26.method218(true, (byte) -75);
        }
        if (class301.field4848 != null && (class23.field382 == 30 || class23.field382 == 25)) {
            class162.method1174(0);
        }
        for (int var10 = 0; var10 < 100; var10++) {
            class247.field3933[var10] = true;
        }
        class268.field4252 = true;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lcc;I)Lcc;")
    public static final class222 method1659(class222 arg0, int arg1) {
        if (arg1 < 13) {
            method1656(-36, -93, -8, 68, -71, -99);
        }
        field3901++;
        class222 var2 = client.method1144(arg0);
        if (var2 == null) {
            var2 = arg0.field3451;
        }
        return var2;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIIIIIIJILgj;)V")
    public final void method75(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class249 arg10) {
        field3893++;
        class11 var13 = class123.method929(22497, this.field3900).method1279(0, -1, this.field3899, 0, 5036, (class103) null, (class186) null);
        if (var13 != null) {
            var13.method75(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
            this.field3892 = var13.method82();
        }
    }
}
