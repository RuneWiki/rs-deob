import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class135 {

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "Lu;")
    private class134 field3171 = new class134();

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "Lwd;")
    public static class150 field3167 = class2.method9(true, "Wen m-Ochten Sie hinzuf-Ugen?");

    @OriginalMember(owner = "client!ua", name = "l", descriptor = "Lwd;")
    private static class150 field3176 = class2.method9(true, "Report abuse");

    @OriginalMember(owner = "client!ua", name = "k", descriptor = "I")
    public static int field3175 = 0;

    @OriginalMember(owner = "client!ua", name = "m", descriptor = "Lwd;")
    public static class150 field3177 = class2.method9(true, "");

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "Lwd;")
    public static class150 field3174 = field3176;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "Lwd;")
    public static class150 field3165 = class2.method9(true, "Ung-Ultige Verbindung mit einem Anmelde)2Server)3");

    @OriginalMember(owner = "client!ua", name = "s", descriptor = "I")
    public static int field3183 = 0;

    @OriginalMember(owner = "client!ua", name = "o", descriptor = "Lwd;")
    public static class150 field3179 = class2.method9(true, "headicons_pk");

    @OriginalMember(owner = "client!ua", name = "v", descriptor = "Z")
    public static boolean field3186 = false;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "I")
    public static int field3166;

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "I")
    public static int field3168;

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "I")
    public static int field3170;

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "I")
    public static int field3172;

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "I")
    public static int field3173;

    @OriginalMember(owner = "client!ua", name = "n", descriptor = "I")
    public static int field3178;

    @OriginalMember(owner = "client!ua", name = "p", descriptor = "I")
    public static int field3180;

    @OriginalMember(owner = "client!ua", name = "q", descriptor = "I")
    public static int field3181;

    @OriginalMember(owner = "client!ua", name = "r", descriptor = "I")
    public static int field3182;

    @OriginalMember(owner = "client!ua", name = "t", descriptor = "I")
    public static int field3184;

    @OriginalMember(owner = "client!ua", name = "u", descriptor = "I")
    public static int field3185;

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "Lb;")
    public static class8 field3169;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)Lu;")
    public final class134 method1002(int arg0) {
        field3181++;
        class134 var2 = this.field3171.field3151;
        if (arg0 != -1) {
            return null;
        } else if (this.field3171 == var2) {
            return null;
        } else {
            var2.method996(arg0 - 2);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V")
    public static void method1003(byte arg0) {
        field3176 = null;
        field3165 = null;
        field3174 = null;
        if (arg0 > -54) {
            method1008(-123);
        }
        field3167 = null;
        field3169 = null;
        field3179 = null;
        field3177 = null;
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(I)V")
    public static final void method1004(int arg0) {
        field3173++;
        int var1 = class58.field1502;
        int var2 = class130.field3075;
        int var3 = class12.field292;
        int var4 = class97.field2229;
        int var5 = 6116423;
        class120.method872(var2, var1, var3, var4, var5);
        class120.method872(var2 + 1, var1 + 1, var3 - 2, 16, 0);
        class120.method866(var2 + 1, var1 + 18, var3 - 2, var4 + -19, 0);
        class134.field3150.method1053(class143.field3462, var2 + 3, var1 + 14, var5);
        int var6 = class113.field2602;
        int var7 = class111.field2557;
        if (class12.field305 == 0) {
            var7 -= 4;
            var6 -= 4;
        }
        if (class12.field305 == 1) {
            var6 -= 205;
            var7 -= 553;
        }
        if (class12.field305 == 2) {
            var7 -= 17;
            var6 -= 357;
        }
        if (arg0 > -62) {
            field3182 = 81;
        }
        for (int var8 = 0; var8 < class125.field2900; var8++) {
            int var9 = 16777215;
            int var10 = (class125.field2900 - var8 - 1) * 15 + var1 + 31;
            if (var7 > var2 && var7 < var2 + var3 && var10 - 13 < var6 && var10 + 3 > var6) {
                var9 = 16776960;
            }
            class134.field3150.method1047(class2.field50[var8], var2 + 3, var10, var9, true);
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILu;)V")
    public final void method1005(int arg0, class134 arg1) {
        field3178++;
        if (arg1.field3143 != null) {
            arg1.method996(-3);
        }
        arg1.field3151 = this.field3171;
        if (arg0 < 22) {
            method1003((byte) -51);
        }
        arg1.field3143 = this.field3171.field3143;
        arg1.field3143.field3151 = arg1;
        arg1.field3151.field3143 = arg1;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lu;I)V")
    public final void method1006(class134 arg0, int arg1) {
        field3166++;
        if (arg0.field3143 != null) {
            arg0.method996(-3);
        }
        arg0.field3151 = this.field3171.field3151;
        arg0.field3143 = this.field3171;
        if (arg1 == 16032) {
            arg0.field3143.field3151 = arg0;
            arg0.field3151.field3143 = arg0;
        }
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "(I)Lu;")
    public final class134 method1007(int arg0) {
        class134 var2 = this.field3171.field3151;
        if (arg0 != 16777215) {
            field3186 = true;
        }
        field3170++;
        return this.field3171 == var2 ? null : var2;
    }

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "(I)V")
    public static final void method1008(int arg0) {
        field3168++;
        class15.field405.method351((byte) 47);
        if (arg0 < 54) {
            field3186 = false;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            class104.field2348[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class50.field1355[var2] = 0L;
        }
        class106.field2399 = 0;
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "()V")
    public class135() {
        this.field3171.field3143 = this.field3171;
        this.field3171.field3151 = this.field3171;
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(B)V")
    public static final void method1009(byte arg0) {
        if (arg0 < 61) {
            return;
        }
        field3184++;
        try {
            if (class125.field2897 == null) {
                class125.field2897 = new class28(class10.field243, class111.method786((byte) 43, new class150[] { class82.field1966, class43.field1186, class20.field509 }).method1173((byte) 73));
            } else {
                byte[] var1 = class125.field2897.method237(127);
                if (var1 != null) {
                    class148 var2 = new class148(var1);
                    class2.field24 = var2.method1140(-1);
                    class128.field3047 = new class90[class2.field24];
                    for (int var3 = 0; var3 < class2.field24; var3++) {
                        class90 var4 = class128.field3047[var3] = new class90();
                        int var5 = var2.method1140(-1);
                        var4.field2086 = var5 & 0x7FFF;
                        var4.field2087 = (var5 & 0x8000) != 0;
                        var4.field2089 = var2.method1154((byte) -115);
                        var4.field2091 = var2.method1141((byte) -6);
                        var4.field2104 = var3;
                        var4.field2088 = class107.method743(1, var4.field2089);
                    }
                    class11.method76(0, class128.field3047, class146.field3524, class128.field3047.length - 1, class95.field2198, -73);
                    class125.field2897 = null;
                    class97.field2227 = true;
                    return;
                }
            }
        } catch (Exception var6) {
            class125.field2897 = null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIB)I")
    public static final int method1010(int arg0, int arg1, byte arg2) {
        field3185++;
        int var3 = arg0 >>> 31;
        return arg2 == -20 ? (arg0 + var3) / arg1 - var3 : 1;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIILva;I[Lva;IIIIII)Lva;")
    public static final class141 method1011(int arg0, int arg1, int arg2, class141 arg3, int arg4, class141[] arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field3180++;
        if (arg11 < arg9 || arg7 > arg2 || arg11 >= arg10 || arg2 >= arg6) {
            return null;
        }
        for (int var12 = 0; var12 < arg5.length; var12++) {
            class141 var13 = arg5[var12];
            if (var13 != null && var13.field3298 == arg8 && !class80.method579(arg0 + 79, var13) && arg3 != var13) {
                int var14 = var13.field3304 + arg9 - arg1;
                int var15 = var13.field3353 + arg7 - arg4;
                if (var13.field3354 == 0) {
                    class141 var16 = method1011(-19, var13.field3390, arg2, arg3, var13.field3309, arg5, var13.field3326 + var15, var15, var13.field3323, var14, var13.field3321 + var14, arg11);
                    if (var16 != null) {
                        return var16;
                    }
                    if (var13.field3367 != null) {
                        class141 var17 = method1011(arg0, var13.field3390, arg2, arg3, var13.field3309, var13.field3367, var13.field3326 + var15, var15, var13.field3323, var14, var14 + var13.field3321, arg11);
                        if (var17 != null) {
                            return var17;
                        }
                    }
                }
                if (class9.method55(class124.method942(var13, true), 104) && var14 <= arg11 && arg2 >= var15 && var13.field3321 + var14 > arg11 && arg2 < var13.field3326 + var15) {
                    return var13;
                }
            }
        }
        if (arg0 != -19) {
            method1010(-41, -18, (byte) 86);
        }
        return null;
    }
}
