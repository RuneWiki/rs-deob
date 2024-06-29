import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class58 {

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "I")
    public static int field1181 = 0;

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "[Lvf;")
    public static class265[] field1183 = new class265[200];

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "I")
    public static int field1179 = 0;

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "[I")
    public static int[] field1182 = new int[200];

    @OriginalMember(owner = "client!gg", name = "k", descriptor = "Lvf;")
    public static class265 field1189 = class87.method582(-46, ":assist:");

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "I")
    public static int field1185;

    @OriginalMember(owner = "client!gg", name = "h", descriptor = "I")
    public static int field1186;

    @OriginalMember(owner = "client!gg", name = "i", descriptor = "I")
    public static int field1187;

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "Lfl;")
    public static class192 field1180;

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "Lfl;")
    public static class192 field1184;

    @OriginalMember(owner = "client!gg", name = "j", descriptor = "Lfl;")
    public static class192 field1188;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ZIILn;II)V")
    public static final void method434(boolean arg0, int arg1, int arg2, class242 arg3, int arg4, int arg5) {
        field1185++;
        if (arg3.field4208 == -1 && arg3.field4212 == null) {
            return;
        }
        int var6 = 0;
        if (arg3.field4211 < arg4) {
            var6 += arg4 - arg3.field4211;
        } else if (arg3.field4229 > arg4) {
            var6 += arg3.field4229 - arg4;
        }
        if (arg3.field4221 < arg2) {
            var6 += arg2 - arg3.field4221;
        } else if (arg3.field4220 > arg2) {
            var6 += arg3.field4220 - arg2;
        }
        if (arg3.field4207 == 0 || arg3.field4207 < var6 - 64 || class172.field3095 == 0 || arg3.field4206 != arg1) {
            if (arg3.field4203 != null) {
                class49.field1039.method1660(arg3.field4203);
                arg3.field4203 = null;
            }
            if (arg3.field4217 != null) {
                class49.field1039.method1660(arg3.field4217);
                arg3.field4217 = null;
            }
            return;
        }
        var6 -= 64;
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = (arg3.field4207 - var6) * class172.field3095 / arg3.field4207;
        if (arg0) {
            field1179 = 85;
        }
        if (arg3.field4203 != null) {
            arg3.field4203.method1183(var7);
        } else if (arg3.field4208 >= 0) {
            class173 var8 = class173.method1137(class213.field3822, arg3.field4208, 0);
            if (var8 != null) {
                class222 var9 = var8.method1138().method1512(class197.field3515);
                class180 var10 = class180.method1202(var9, 100, var7);
                var10.method1208(-1);
                class49.field1039.method1661(var10);
                arg3.field4203 = var10;
            }
        }
        if (arg3.field4217 != null) {
            arg3.field4217.method1183(var7);
            if (arg3.field4217.method95(-126)) {
                return;
            }
            arg3.field4217 = null;
        } else if (arg3.field4212 != null && (arg3.field4209 -= arg5) <= 0) {
            int var11 = (int) (Math.random() * (double) arg3.field4212.length);
            class173 var12 = class173.method1137(class213.field3822, arg3.field4212[var11], 0);
            if (var12 != null) {
                class222 var13 = var12.method1138().method1512(class197.field3515);
                class180 var14 = class180.method1202(var13, 100, var7);
                var14.method1208(0);
                class49.field1039.method1661(var14);
                arg3.field4209 = arg3.field4225 + (int) (Math.random() * (double) (arg3.field4214 - arg3.field4225));
                arg3.field4217 = var14;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(B)V")
    public static void method435(byte arg0) {
        field1184 = null;
        field1189 = null;
        field1183 = null;
        if (arg0 != -2) {
            method436(112, -65, -104, 47, 101);
        }
        field1188 = null;
        field1180 = null;
        field1182 = null;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIIII)Z")
    public static final boolean method436(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class218.field3929 * arg0 + class186.field3371 * arg3 >> 16;
        int var6 = class218.field3929 * arg3 - class186.field3371 * arg0 >> 16;
        int var7 = class232.field4101 * var6 + class140.field2572 * arg1 >> 16;
        int var8 = class232.field4101 * arg1 - class140.field2572 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class232.field4101 * var6 + class140.field2572 * arg2 >> 16;
        int var12 = class232.field4101 * arg2 - class140.field2572 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class277.field4904 && var13 < class277.field4904) {
            return false;
        } else if (var9 > class73.field1399 && var13 > class73.field1399) {
            return false;
        } else if (var10 < class2.field28 && var14 < class2.field28) {
            return false;
        } else {
            return var10 <= class96.field1690 || var14 <= class96.field1690;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)V")
    public static final void method437(int arg0) {
        field1186++;
        class219 var1 = class232.field4089;
        synchronized (class232.field4089) {
            class208.field3748++;
            class232.field4102 = class89.field1598;
            class79.field1497 = class135.field2426;
            class268.field4722 = class161.field2942;
            class141.field2620 = class57.field1162;
            class122.field2193 = class254.field4366;
            class192.field3427 = class144.field2696;
            if (arg0 < -113) {
                class143.field2663 = class110.field1930;
                class57.field1162 = 0;
            }
        }
    }
}
