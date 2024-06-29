import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public abstract class class220 {

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "F")
    public static float field2891 = 0.0F;

    @OriginalMember(owner = "client!tm", name = "g", descriptor = "I")
    public static int field2894 = 0;

    @OriginalMember(owner = "client!tm", name = "k", descriptor = "Ljava/lang/String;")
    public static String field2898 = "Attack";

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "I")
    public static int field2888;

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "I")
    public static int field2889;

    @OriginalMember(owner = "client!tm", name = "e", descriptor = "I")
    public static int field2892;

    @OriginalMember(owner = "client!tm", name = "h", descriptor = "I")
    public static int field2895;

    @OriginalMember(owner = "client!tm", name = "i", descriptor = "I")
    public static int field2896;

    @OriginalMember(owner = "client!tm", name = "j", descriptor = "I")
    public static int field2897;

    @OriginalMember(owner = "client!tm", name = "f", descriptor = "Lci;")
    public static class261 field2893;

    @OriginalMember(owner = "client!tm", name = "l", descriptor = "Lrj;")
    public static class352 field2899;

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "[I")
    public static int[] field2890;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(ILeb;I)V", line = 10)
    public static final void method1390(int arg0, class371 arg1, int arg2) {
        if (class245.field3396 != null) {
            try {
                class245.field3396.method2666(0L, 0);
                class245.field3396.method2665((byte) 95, arg1.field5258, arg2, 24);
            } catch (Exception var3) {
            }
        }
        field2888++;
        if (arg0 != 30973) {
            method1395(true);
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(II)Z", line = 39)
    public static final boolean method1391(int arg0, int arg1) {
        field2892++;
        if (arg0 == -17949) {
            return (-arg1 & arg1) == arg1;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IILb;Laa;IILu;Lne;)V", line = 54)
    public static final void method1392(int arg0, int arg1, class183 arg2, class281 arg3, int arg4, int arg5, class46 arg6, class173 arg7) {
        field2896++;
        int var8 = arg7.field2460 - (arg4 / 2) - 5;
        int var9 = arg5 + 2;
        if (arg6.field723 != 0) {
            arg3.method1762(var9, arg2.method1207() * arg1 + arg5 + 1 - var9, var8, arg6.field723, arg4 + 10, -1);
        }
        if (arg6.field704 != 0) {
            arg3.method1754(arg6.field704, var9, (byte) -74, arg4 + 10, var8, arg5 + (arg2.method1207() * arg1) + 1 - var9);
        }
        int var10 = arg6.field716;
        if (arg7.field2456 && arg6.field706 != -1) {
            var10 = arg6.field706;
        }
        if (arg0 != 10) {
            return;
        }
        for (int var11 = 0; var11 < arg1; var11++) {
            String var12 = class356.field5011[var11];
            if ((arg1 - 1) > var11) {
                var12 = var12.substring(0, var12.length() - 4);
            }
            arg2.method1208(arg3, var12, arg7.field2460, arg5, var10, true);
            arg5 += arg2.method1207();
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIIBI)V", line = 97)
    public static final void method1393(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg3 <= 118) {
            return;
        }
        if (class379.field5397 <= arg1 - arg4 && arg1 + arg4 <= class43.field659 && class300.field4164 <= arg0 - arg4 && class398.field5827 >= (arg0 + arg4)) {
            class412.method2636(2, arg4, arg1, arg2, arg0);
        } else {
            class296.method1909(arg2, (byte) 81, arg1, arg4, arg0);
        }
        field2897++;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)[Lqi;", line = 114)
    public static final class337[] method1394(int arg0) {
        if (class198.field2743 == null) {
            class337[] var1 = class196.method1308(class204.field2772, true);
            class337[] var2 = new class337[var1.length];
            int var3 = 0;
            label67: for (int var4 = 0; var4 < var1.length; var4++) {
                class337 var8 = var1[var4];
                if ((var8.field4593 <= 0 || var8.field4593 >= 24) && var8.field4597 >= 800 && var8.field4591 >= 600 && (class275.field3730 >= 96 || class16.field205 != 0 || var8.field4597 <= 1024 && var8.field4591 <= 768)) {
                    for (int var9 = 0; var9 < var3; var9++) {
                        class337 var10 = var2[var9];
                        if (var8.field4597 == var10.field4597 && var8.field4591 == var10.field4591) {
                            if (var8.field4593 > var10.field4593) {
                                var2[var9] = var8;
                            }
                            continue label67;
                        }
                    }
                    var2[var3] = var8;
                    var3++;
                }
            }
            class198.field2743 = new class337[var3];
            class150.method1023(var2, 0, class198.field2743, 0, var3);
            int[] var5 = new int[class198.field2743.length];
            for (int var6 = 0; var6 < class198.field2743.length; var6++) {
                class337 var7 = class198.field2743[var6];
                var5[var6] = var7.field4597 * var7.field4591;
            }
            class60.method394((byte) 69, var5, class198.field2743);
        }
        field2889++;
        if (arg0 < 124) {
            method1393(-71, 39, -13, (byte) 12, 22);
        }
        return class198.field2743;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(Z)V", line = 198)
    public static void method1395(boolean arg0) {
        field2899 = null;
        if (!arg0) {
            field2899 = null;
        }
        field2890 = null;
        field2898 = null;
        field2893 = null;
    }
}
