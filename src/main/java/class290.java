import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class290 {

    @OriginalMember(owner = "client!gj", name = "h", descriptor = "Loh;")
    private static class258 field4997 = class153.method1046("Prepared sound engine", 91);

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "Loh;")
    public static class258 field4990 = field4997;

    @OriginalMember(owner = "client!gj", name = "l", descriptor = "Lmb;")
    public static class172 field5001 = new class172(4);

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "I")
    public static int field4991;

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "I")
    public static int field4992;

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "I")
    public static int field4993;

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "I")
    public static int field4994;

    @OriginalMember(owner = "client!gj", name = "f", descriptor = "I")
    public static int field4995;

    @OriginalMember(owner = "client!gj", name = "g", descriptor = "I")
    public static int field4996;

    @OriginalMember(owner = "client!gj", name = "i", descriptor = "I")
    public static int field4998;

    @OriginalMember(owner = "client!gj", name = "j", descriptor = "I")
    public static int field4999;

    @OriginalMember(owner = "client!gj", name = "k", descriptor = "I")
    public static int field5000;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)V", line = 5)
    public static final void method2038(int arg0) {
        class121.field2143 = null;
        class279.field4795 = null;
        class37.field497 = (byte[][]) null;
        class113.field1958 = null;
        if (arg0 <= 110) {
            field4995 = -87;
        }
        class301.field5149 = null;
        field4991++;
        class280.field4819 = null;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(ILs;)Ls;", line = 37)
    public static final class171 method2039(int arg0, class171 arg1) {
        field4993++;
        class171 var2 = client.method355(arg1);
        if (arg0 >= -88) {
            field4997 = (class258) null;
        }
        if (var2 == null) {
            var2 = arg1.field3048;
        }
        return var2;
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(ILs;)Z", line = 52)
    public static final boolean method2040(int arg0, class171 arg1) {
        if (arg0 != 906) {
            field4997 = (class258) null;
        }
        field4992++;
        if (arg1.field2985 == null) {
            return false;
        }
        for (int var2 = 0; var2 < arg1.field2985.length; var2++) {
            int var3 = class279.method1964(var2, arg1, -106);
            int var4 = arg1.field2955[var2];
            if (arg1.field2985[var2] == 2) {
                if (var3 >= var4) {
                    return false;
                }
            } else if (arg1.field2985[var2] == 3) {
                if (var3 <= var4) {
                    return false;
                }
            } else if (arg1.field2985[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(I)[Lti;", line = 118)
    public static final class220[] method2041(int arg0) {
        field4998++;
        if (arg0 != 2264) {
            return (class220[]) null;
        }
        if (class34.field403 == null) {
            class220[] var1 = class110.method806(class297.field5086, (byte) -98);
            class220[] var2 = new class220[var1.length];
            int var3 = 0;
            label56: for (int var4 = 0; var4 < var1.length; var4++) {
                class220 var5 = var1[var4];
                if ((var5.field3815 <= 0 || var5.field3815 >= 24) && var5.field3808 >= 800 && var5.field3809 >= 600) {
                    for (int var6 = 0; var6 < var3; var6++) {
                        class220 var7 = var2[var6];
                        if (var5.field3808 == var7.field3808 && var5.field3809 == var7.field3809) {
                            if (var5.field3815 > var7.field3815) {
                                var2[var6] = var5;
                            }
                            continue label56;
                        }
                    }
                    var2[var3] = var5;
                    var3++;
                }
            }
            class34.field403 = new class220[var3];
            class275.method1929(var2, 0, class34.field403, 0, var3);
            int[] var8 = new int[class34.field403.length];
            for (int var9 = 0; var9 < class34.field403.length; var9++) {
                class220 var10 = class34.field403[var9];
                var8[var9] = var10.field3809 * var10.field3808;
            }
            class125.method914(121, var8, class34.field403);
        }
        return class34.field403;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Z)V", line = 194)
    public static final void method2042(boolean arg0) {
        field4999++;
        if (arg0) {
            method2043(-43, 31, 105, 107, 7, -117);
        }
        class153.field2627.method1161(121);
        class233.field4038.method1161(118);
        class286.field4934.method1161(107);
        class245.field4257.method1161(109);
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIIII)V", line = 211)
    public static final void method2043(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4994++;
        class19.method126(7, arg3, class154.field2638[arg0], arg5 - arg2, arg2 + arg5);
        int var6 = arg1;
        int var7 = 0;
        int var8 = arg2 * arg2;
        int var9 = arg1 * arg1;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg1 << 1;
        int var13 = var8 << 2;
        int var14 = (1 - var12) * var8 + var10;
        int var15 = var9 - ((var12 - 1) * var11);
        int var16 = var9 << 2;
        int var17 = ((var7 << 1) + 3) * var10;
        int var18 = (var7 + 1) * var16;
        int var19 = (arg1 - 1) * var13;
        int var20 = ((arg1 << 1) - 3) * var11;
        int var21 = -107 / ((arg4 + 56) / 52);
        while (var6 > 0) {
            if (var14 < 0) {
                while (var14 < 0) {
                    var15 += var18;
                    var18 += var16;
                    var7++;
                    var14 += var17;
                    var17 += var16;
                }
            }
            var6--;
            int var22 = arg0 - var6;
            int var23 = arg0 + var6;
            if (var15 < 0) {
                var14 += var17;
                var15 += var18;
                var7++;
                var18 += var16;
                var17 += var16;
            }
            int var24 = arg5 - var7;
            int var25 = arg5 + var7;
            var14 += -var19;
            var19 -= var13;
            class19.method126(7, arg3, class154.field2638[var22], var24, var25);
            var15 += -var20;
            class19.method126(7, arg3, class154.field2638[var23], var24, var25);
            var20 -= var13;
        }
    }

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "(I)V", line = 300)
    public static void method2044(int arg0) {
        field4997 = null;
        field4990 = null;
        if (arg0 > 3) {
            field5001 = null;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIIIIII)V", line = 336)
    public static final void method2045(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4996++;
        if (arg0 == arg5) {
            class61.method477(arg7, 21858, arg3, arg4, arg2, arg6, arg0);
            return;
        }
        if ((arg3 - arg0) >= class75.field1314 && class206.field3562 >= (arg0 + arg3) && class241.field4189 <= (arg6 - arg5) && arg6 + arg5 <= class94.field1654) {
            class14.method99(arg2, (byte) 100, arg3, arg6, arg5, arg0, arg7, arg4);
        } else {
            class27.method213(arg5, arg6, arg4, arg3, arg2, (byte) 111, arg7, arg0);
        }
        if (arg1 != -1) {
            method2040(19, (class171) null);
        }
    }
}
