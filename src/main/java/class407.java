import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public class class407 {

    @OriginalMember(owner = "client!ks", name = "e", descriptor = "Lsl;")
    private static class427 field5867 = new class427(16);

    @OriginalMember(owner = "client!ks", name = "j", descriptor = "[S")
    private static short[] field5872 = new short[1];

    @OriginalMember(owner = "client!ks", name = "o", descriptor = "I")
    public static int field5877 = (int) (Math.random() * 11.0D) - 5;

    @OriginalMember(owner = "client!ks", name = "k", descriptor = "I")
    public static int field5873 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!ks", name = "q", descriptor = "[B")
    private static byte[] field5879 = new byte[1];

    @OriginalMember(owner = "client!ks", name = "r", descriptor = "Lhga;")
    public static class158 field5880 = new class158();

    @OriginalMember(owner = "client!ks", name = "l", descriptor = "F")
    public static float field5874;

    @OriginalMember(owner = "client!ks", name = "n", descriptor = "F")
    public static float field5876;

    @OriginalMember(owner = "client!ks", name = "s", descriptor = "I")
    public static int field5881;

    @OriginalMember(owner = "client!ks", name = "t", descriptor = "I")
    public static int field5882;

    @OriginalMember(owner = "client!ks", name = "u", descriptor = "I")
    public static int field5883;

    @OriginalMember(owner = "client!ks", name = "z", descriptor = "I")
    public static int field5888;

    @OriginalMember(owner = "client!ks", name = "D", descriptor = "I")
    public static int field5892;

    @OriginalMember(owner = "client!ks", name = "F", descriptor = "I")
    public static int field5894;

    @OriginalMember(owner = "client!ks", name = "G", descriptor = "I")
    public static int field5895;

    @OriginalMember(owner = "client!ks", name = "I", descriptor = "I")
    public static int field5897;

    @OriginalMember(owner = "client!ks", name = "J", descriptor = "I")
    public static int field5898;

    @OriginalMember(owner = "client!ks", name = "K", descriptor = "I")
    public static int field5899;

    @OriginalMember(owner = "client!ks", name = "L", descriptor = "I")
    public static int field5900;

    @OriginalMember(owner = "client!ks", name = "O", descriptor = "I")
    public static int field5902;

    @OriginalMember(owner = "client!ks", name = "P", descriptor = "I")
    public static int field5903;

    @OriginalMember(owner = "client!ks", name = "m", descriptor = "Lik;")
    public static class193 field5875;

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "Llf;")
    private static class217 field5863;

    @OriginalMember(owner = "client!ks", name = "d", descriptor = "Lom;")
    public static class344 field5866;

    @OriginalMember(owner = "client!ks", name = "v", descriptor = "Lsl;")
    private static class427 field5884;

    @OriginalMember(owner = "client!ks", name = "c", descriptor = "Lve;")
    public static class469 field5865;

    @OriginalMember(owner = "client!ks", name = "i", descriptor = "Lai;")
    public static class557 field5871;

    @OriginalMember(owner = "client!ks", name = "h", descriptor = "Lqs;")
    public static class561 field5870;

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "Ljk;")
    public static class588 field5864;

    @OriginalMember(owner = "client!ks", name = "g", descriptor = "Ldv;")
    public static class612 field5869;

    @OriginalMember(owner = "client!ks", name = "f", descriptor = "Lsfa;")
    private static class648 field5868;

    @OriginalMember(owner = "client!ks", name = "y", descriptor = "[B")
    private static byte[] field5887;

    @OriginalMember(owner = "client!ks", name = "A", descriptor = "[B")
    private static byte[] field5889;

    @OriginalMember(owner = "client!ks", name = "B", descriptor = "[B")
    private static byte[] field5890;

    @OriginalMember(owner = "client!ks", name = "E", descriptor = "[B")
    private static byte[] field5893;

    @OriginalMember(owner = "client!ks", name = "H", descriptor = "[B")
    private static byte[] field5896;

    @OriginalMember(owner = "client!ks", name = "x", descriptor = "[I")
    private static int[] field5886;

    @OriginalMember(owner = "client!ks", name = "w", descriptor = "[S")
    private static short[] field5885;

    @OriginalMember(owner = "client!ks", name = "C", descriptor = "[S")
    private static short[] field5891;

    @OriginalMember(owner = "client!ks", name = "p", descriptor = "[[[B")
    public static byte[][][] field5878;

    @OriginalMember(owner = "client!ks", name = "M", descriptor = "[[[Lsk;")
    private static class578[][][] field5901;

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "()V")
    public static final void method2474() {
        int[] var0 = new int[3];
        for (int var1 = 0; var1 < field5875.field3034; var1++) {
            boolean var2 = field5871.method3176(field5875.field3036[var1] >> 14 & 0x3FFF, -127, field5875.field3036[var1] & 0x3FFF, var0, field5875.field3036[var1] >> 28 & 0x3);
            if (var2) {
                class473 var3 = new class473(field5875.field3035[var1]);
                var3.field6712 = var0[1] - field5899;
                var3.field6706 = var0[2] - field5902;
                field5880.method1229(var3, (byte) 120);
            }
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(II)Lai;")
    public static final class557 method2475(int arg0, int arg1) {
        for (class557 var2 = (class557) field5867.method2597((byte) 19); var2 != null; var2 = (class557) field5867.method2594((byte) -122)) {
            if (var2.field7874 && var2.method3172(arg0, -107, arg1)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lr;IIIIIII[S[BZ)V")
    private static final void method2476(class167 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, short[] arg8, byte[] arg9, boolean arg10) {
        if (arg10 || arg5 != 0 || arg6 > 0) {
            if (arg6 == 0) {
                arg0.method4(arg1, arg2, arg3, arg4, arg5, 0);
            } else {
                int var11 = arg7 & 0x3F;
                if (var11 == 0 || arg3 <= 1 || arg4 <= 1) {
                    int var13 = field5886[arg6];
                    if (arg10 || var13 != 0) {
                        arg0.method4(arg1, arg2, arg3, arg4, var13, 0);
                    }
                } else {
                    int var12 = arg10 ? 0 : 1;
                    class423.method2579(field5878, arg2, arg1, arg4, arg3, arg7 >> 6 & 0x3, arg5, field5886[arg6], var11, var12, arg0, 980, field5881);
                }
            }
        }
        if (arg8 == null) {
            return;
        }
        int var14;
        if (arg3 == 1) {
            var14 = arg1;
        } else {
            var14 = arg1 + arg3 - 1;
        }
        int var15;
        if (arg4 == 1) {
            var15 = arg2;
        } else {
            var15 = arg2 + arg4 - 1;
        }
        for (int var16 = 0; var16 < arg8.length; var16++) {
            int var17 = arg9[var16] & 0x3F;
            if (var17 == 0 || var17 == 2 || var17 == 3 || var17 == 9) {
                class56 var18 = field5869.method3515(arg8[var16] & 0xFFFF, 50);
                if (var18.field1233 == -1) {
                    int var19 = -3355444;
                    if (var18.field1290 == 1) {
                        var19 = -3407872;
                    }
                    int var20 = arg9[var16] >> 6 & 0x3;
                    if (var17 == 0) {
                        if (var20 == 0) {
                            arg0.method69(arg1, arg2, arg4, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method126(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method69(var14, arg2, arg4, var19, 0);
                        } else {
                            arg0.method126(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 2) {
                        if (var20 == 0) {
                            arg0.method69(arg1, arg2, arg4, -1, 0);
                            arg0.method126(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method69(var14, arg2, arg4, -1, 0);
                            arg0.method126(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method69(var14, arg2, arg4, -1, 0);
                            arg0.method126(arg1, var15, arg3, var19, 0);
                        } else {
                            arg0.method69(arg1, arg2, arg4, -1, 0);
                            arg0.method126(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 3) {
                        if (var20 == 0) {
                            arg0.method126(arg1, arg2, 1, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method126(var14, arg2, 1, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method126(var14, var15, 1, var19, 0);
                        } else {
                            arg0.method126(arg1, var15, 1, var19, 0);
                        }
                    } else if (var17 == 9) {
                        if (var20 == 0 || var20 == 2) {
                            for (int var22 = 0; var22 < arg4; var22++) {
                                arg0.method126(arg1 + var22, var15 - var22, 1, var19, 0);
                            }
                        } else {
                            for (int var21 = 0; var21 < arg4; var21++) {
                                arg0.method126(arg1 + var21, arg2 + var21, 1, var19, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(I)V")
    public static final void method2477(int arg0) {
        field5871 = (class557) field5867.method2596((long) arg0, 124);
    }

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "()V")
    public static final void method2478() {
        field5890 = null;
        field5896 = null;
        field5891 = null;
        field5889 = null;
        field5887 = null;
        field5885 = null;
        field5893 = null;
        field5884 = null;
        field5901 = null;
        field5886 = null;
    }

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "(II)Lcba;")
    public static final class513 method2479(int arg0, int arg1) {
        class513 var2 = new class513();
        for (class557 var3 = (class557) field5867.method2597((byte) -114); var3 != null; var3 = (class557) field5867.method2594((byte) -122)) {
            if (var3.field7874 && var3.method3172(arg0, -31, arg1)) {
                var2.method3023((byte) 110, var3);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ks", name = "c", descriptor = "()V")
    private static final void method2480() {
        for (int var0 = 0; var0 < field5892; var0++) {
            for (int var11 = 0; var11 < field5882; var11++) {
                int var12 = field5885[field5892 * var11 + var0] & 0xFFFF;
                if (var12 != 0) {
                    if (var12 == 65535) {
                        class665 var13 = (class665) field5884.method2596((long) (var0 << 16 | var11), 45);
                        if (var13 != null) {
                            for (int var14 = 0; var14 < var13.field9545.length; var14++) {
                                class56 var15 = field5869.method3515(var13.field9545[var14] & 0xFFFF, 50);
                                int var16 = var15.field1296;
                                if (var15.field1248 != null) {
                                    class56 var17 = var15.method662(3433, field5870);
                                    if (var17 != null) {
                                        var16 = var17.field1296;
                                    }
                                }
                                if (var16 != -1) {
                                    class473 var18 = new class473(var16);
                                    var18.field6712 = var0;
                                    var18.field6706 = var11;
                                    field5880.method1229(var18, (byte) 120);
                                }
                            }
                        }
                    } else {
                        class56 var19 = field5869.method3515(var12 - 1, 50);
                        int var20 = var19.field1296;
                        if (var19.field1248 != null) {
                            class56 var21 = var19.method662(3433, field5870);
                            if (var21 != null) {
                                var20 = var21.field1296;
                            }
                        }
                        if (var20 != -1) {
                            class473 var22 = new class473(var20);
                            var22.field6712 = var0;
                            var22.field6706 = var11;
                            field5880.method1229(var22, (byte) 120);
                        }
                    }
                }
            }
        }
        for (int var1 = 0; var1 < 3; var1++) {
            for (int var2 = 0; var2 < field5901[0].length; var2++) {
                for (int var3 = 0; var3 < field5901[0][0].length; var3++) {
                    class578 var4 = field5901[var1][var2][var3];
                    if (var4 != null) {
                        for (class621 var5 = (class621) var4.method3317(-121); var5 != null; var5 = (class621) var4.method3321(-121)) {
                            if (var5.field9006 != null) {
                                for (int var6 = 0; var6 < var5.field9006.length; var6++) {
                                    class56 var7 = field5869.method3515(var5.field9006[var6] & 0xFFFF, 50);
                                    int var8 = var7.field1296;
                                    if (var7.field1248 != null) {
                                        class56 var9 = var7.method662(3433, field5870);
                                        if (var9 != null) {
                                            var8 = var9.field1296;
                                        }
                                    }
                                    if (var8 != -1) {
                                        class473 var10 = new class473(var8);
                                        var10.field6712 = ((field5899 >> 6) + var2) * 64 + var5.field9007 - field5899;
                                        var10.field6706 = ((field5902 >> 6) + var3) * 64 + var5.field9005 - field5902;
                                        field5880.method1229(var10, (byte) 120);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lr;II)V")
    public static final void method2481(class167 arg0, int arg1, int arg2) {
        class61 var3 = new class61(field5866.method2211(field5871.field7876, 19558, "area"));
        int var4 = var3.method732(-559537960);
        int[] var5 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var5[var6] = var3.method732(-559537960);
        }
        int var7 = var3.method732(-559537960);
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method732(-559537960);
        }
        while (true) {
            while (var3.field1393 < var3.field1397.length) {
                if (var3.method732(-559537960) == 0) {
                    int var22 = var3.method732(-559537960);
                    int var23 = var3.method732(-559537960);
                    for (int var24 = 0; var24 < 64; var24++) {
                        for (int var25 = 0; var25 < 64; var25++) {
                            int var26 = var22 * 64 + var24 - field5899;
                            int var27 = var23 * 64 + var25 - field5902;
                            method2491(arg0, var3, var22, var23, var26, var27, var5, var8);
                        }
                    }
                } else {
                    int var28 = var3.method732(-559537960);
                    int var29 = var3.method732(-559537960);
                    int var30 = var3.method732(-559537960);
                    int var31 = var3.method732(-559537960);
                    for (int var32 = 0; var32 < 8; var32++) {
                        for (int var33 = 0; var33 < 8; var33++) {
                            int var34 = var28 * 64 + var30 * 8 + var32 - field5899;
                            int var35 = var29 * 64 + var31 * 8 + var33 - field5902;
                            method2491(arg0, var3, var28, var29, var34, var35, var5, var8);
                        }
                    }
                }
            }
            Object var10 = null;
            field5896 = new byte[field5892 * field5882];
            field5891 = new short[field5892 * field5882];
            for (int var11 = 0; var11 < 3; var11++) {
                byte[] var12 = new byte[field5892 * field5882];
                for (int var13 = 0; var13 < field5901[var11].length; var13++) {
                    for (int var19 = 0; var19 < field5901[var11][0].length; var19++) {
                        class578 var20 = field5901[var11][var13][var19];
                        if (var20 != null) {
                            for (class621 var21 = (class621) var20.method3317(-121); var21 != null; var21 = (class621) var20.method3321(-121)) {
                                var12[(var19 * 64 + var21.field9005) * field5892 + var13 * 64 + var21.field9007] = (byte) var21.field9009;
                            }
                        }
                    }
                }
                method2492(var12, field5896, field5891, arg1, arg2);
                for (int var14 = 0; var14 < field5901[var11].length; var14++) {
                    for (int var15 = 0; var15 < field5901[var11][0].length; var15++) {
                        class578 var16 = field5901[var11][var14][var15];
                        if (var16 != null) {
                            for (class621 var17 = (class621) var16.method3317(-121); var17 != null; var17 = (class621) var16.method3321(-121)) {
                                int var18 = (var15 * 64 + var17.field9005) * field5892 + var14 * 64 + var17.field9007;
                                var17.field9009 = (field5896[var18] & 0xFF) << 16 | field5891[var18] & 0xFFFF;
                                if (var17.field9009 != 0) {
                                    var17.field9009 |= 0xFF000000;
                                }
                            }
                        }
                    }
                }
            }
            method2492(field5890, field5896, field5891, arg1, arg2);
            field5890 = null;
            method2480();
            return;
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lr;)Lhga;")
    public static final class158 method2482(class167 arg0) {
        int var1 = field5895 - field5897;
        int var2 = field5900 - field5883;
        int var3 = (field5903 - field5888 << 16) / var1;
        int var4 = (field5898 - field5894 << 16) / var2;
        return method2489(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!ks", name = "d", descriptor = "()V")
    public static void method2483() {
        field5868 = null;
        field5863 = null;
        field5869 = null;
        field5864 = null;
        field5865 = null;
        field5870 = null;
        field5871 = null;
        field5866 = null;
        field5867 = null;
        field5878 = null;
        field5872 = null;
        field5879 = null;
        field5875 = null;
        field5880 = null;
        field5886 = null;
        field5890 = null;
        field5896 = null;
        field5891 = null;
        field5889 = null;
        field5887 = null;
        field5885 = null;
        field5893 = null;
        field5884 = null;
        field5901 = null;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lfa;II)V")
    public static final void method2484(class214 arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < field5868.field9336; var3++) {
            field5886[var3 + 1] = method2490(arg0, var3, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lom;Lsfa;Llf;Ldv;Ljk;Lve;Lqs;)V")
    public static final void method2485(class344 arg0, class648 arg1, class217 arg2, class612 arg3, class588 arg4, class469 arg5, class561 arg6) {
        field5866 = arg0;
        field5868 = arg1;
        field5863 = arg2;
        field5869 = arg3;
        field5864 = arg4;
        field5865 = arg5;
        field5870 = arg6;
        field5867.method2600((byte) -114);
        int var7 = field5866.method2228("details", 5781);
        int[] var8 = field5866.method2231(var7, 3);
        if (var8 != null) {
            for (int var9 = 0; var9 < var8.length; var9++) {
                class557 var10 = class112.method1010(var7, field5866, 106, var8[var9]);
                field5867.method2598(var10, (long) var10.field7887, (byte) 8);
            }
        }
        class377.method2364(true, false, -40);
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lr;Lqj;IIII)V")
    private static final void method2486(class167 arg0, class473 arg1, int arg2, int arg3, int arg4, int arg5) {
        arg1.field6701 = ((arg1.field6712 - field5897) * arg2 + arg4 >> 16) + field5888;
        arg1.field6702 = field5898 - ((arg1.field6706 - field5883) * arg3 + arg5 >> 16);
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lr;IIII)V")
    private static final void method2487(class167 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = field5895 - field5897;
        int var6 = field5900 - field5883;
        if (field5895 < field5892) {
            var5++;
        }
        if (field5900 < field5882) {
            var6++;
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var49 = (arg1 * var7 + arg3 >> 16) + field5888;
            int var50 = ((var7 + 1) * arg1 + arg3 >> 16) + field5888;
            int var51 = var50 - var49;
            if (var51 > 0) {
                int var52 = field5897 + var7;
                if (var52 >= 0 && var52 < field5892) {
                    for (int var53 = 0; var53 < var6; var53++) {
                        int var54 = field5898 - ((var53 + 1) * arg2 + arg4 >> 16);
                        int var55 = field5898 - (arg2 * var53 + arg4 >> 16);
                        int var56 = var55 - var54;
                        if (var56 > 0) {
                            int var57 = field5883 + var53;
                            int var58 = field5892 * var57 + var52;
                            int var59 = 0;
                            int var60 = 0;
                            int var61 = 0;
                            if (var57 >= 0 && var57 < field5882) {
                                var59 = (field5896[var58] & 0xFF) << 16 | field5891[var58] & 0xFFFF;
                                if (var59 != 0) {
                                    var59 |= 0xFF000000;
                                }
                                var60 = field5889[var58] & 0xFF;
                                var61 = field5885[var58] & 0xFFFF;
                            }
                            if (var59 == 0 && var60 == 0 && var61 == 0) {
                                int var62;
                                if (field5871.field7882 != -1) {
                                    var62 = field5871.field7882 | 0xFF000000;
                                } else if ((field5900 + var53 & 0x4) == (field5897 + var7 & 0x4)) {
                                    var62 = field5886[field5868.field9345 + 1];
                                } else {
                                    var62 = -11840664;
                                }
                                if (var62 == 0) {
                                    var62 = -16777216;
                                }
                                arg0.method4(var49, var54, var51, var56, var62, 0);
                            } else if (var61 <= 0) {
                                method2476(arg0, var49, var54, var51, var56, var59, var60, field5887[var58], null, null, true);
                            } else if (var61 == 65535) {
                                class665 var63 = (class665) field5884.method2596((long) (var52 << 16 | var57), 111);
                                if (var63 != null) {
                                    method2476(arg0, var49, var54, var51, var56, var59, var60, field5887[var58], var63.field9545, var63.field9546, true);
                                }
                            } else {
                                field5872[0] = (short) (var61 - 1);
                                field5879[0] = field5893[var58];
                                method2476(arg0, var49, var54, var51, var56, var59, var60, field5887[var58], field5872, field5879, true);
                            }
                        }
                    }
                } else {
                    for (int var64 = 0; var64 < var6; var64++) {
                        int var65 = field5898 - ((var64 + 1) * arg2 + arg4 >> 16);
                        int var66 = field5898 - (arg2 * var64 + arg4 >> 16);
                        int var67 = var66 - var65;
                        int var68;
                        if (field5871.field7882 != -1) {
                            var68 = field5871.field7882 | 0xFF000000;
                        } else if ((field5900 + var64 & 0x4) == (field5897 + var7 & 0x4)) {
                            var68 = field5886[field5868.field9345 + 1];
                        } else {
                            var68 = -11840664;
                        }
                        if (var68 == 0) {
                            var68 = -16777216;
                        }
                        arg0.method4(var49, var65, var51, var67, var68, 0);
                    }
                }
            }
        }
        for (int var8 = -16; var8 < var5 + 16; var8++) {
            int var38 = (arg1 * var8 + arg3 >> 16) + field5888;
            int var39 = ((var8 + 1) * arg1 + arg3 >> 16) + field5888;
            int var40 = var39 - var38;
            if (var40 > 0) {
                int var41 = field5897 + var8;
                if (var41 >= 0 && var41 < field5892) {
                    for (int var42 = -16; var42 < var6 + 16; var42++) {
                        int var43 = field5898 - ((var42 + 1) * arg2 + arg4 >> 16);
                        int var44 = field5898 - (arg2 * var42 + arg4 >> 16);
                        int var45 = var44 - var43;
                        if (var45 > 0) {
                            int var46 = field5883 + var42;
                            if (var46 >= 0 && var46 < field5882) {
                                int var47 = field5885[field5892 * var46 + var41] & 0xFFFF;
                                if (var47 <= 0) {
                                    method2488(arg0, var38, var43, var40, var45, null, null);
                                } else if (var47 == 65535) {
                                    class665 var48 = (class665) field5884.method2596((long) (var41 << 16 | var46), 41);
                                    if (var48 != null) {
                                        method2488(arg0, var38, var43, var40, var45, var48.field9545, var48.field9546);
                                    }
                                } else {
                                    field5872[0] = (short) (var47 - 1);
                                    field5879[0] = field5893[field5892 * var46 + var41];
                                    method2488(arg0, var38, var43, var40, var45, field5872, field5879);
                                }
                            }
                        }
                    }
                }
            }
        }
        int var9 = field5897 >> 6;
        int var10 = field5883 >> 6;
        if (var9 < 0) {
            var9 = 0;
        }
        if (var10 < 0) {
            var10 = 0;
        }
        int var11 = field5895 >> 6;
        int var12 = field5900 >> 6;
        if (var11 >= field5901[0].length) {
            var11 = field5901[0].length - 1;
        }
        if (var12 >= field5901[0][0].length) {
            var12 = field5901[0][0].length - 1;
        }
        for (int var13 = 0; var13 < 3; var13++) {
            for (int var14 = var9; var14 <= var11; var14++) {
                for (int var27 = var10; var27 <= var12; var27++) {
                    class578 var28 = field5901[var13][var14][var27];
                    if (var28 != null) {
                        int var29 = ((field5899 >> 6) + var14) * 64;
                        int var30 = ((field5902 >> 6) + var27) * 64;
                        for (class621 var31 = (class621) var28.method3317(-121); var31 != null; var31 = (class621) var28.method3321(-121)) {
                            int var32 = var31.field9007 + var29 - field5899 - field5897;
                            int var33 = var31.field9005 + var30 - field5902 - field5883;
                            int var34 = (arg1 * var32 + arg3 >> 16) + field5888;
                            int var35 = ((var32 + 1) * arg1 + arg3 >> 16) + field5888;
                            int var36 = field5898 - ((var33 + 1) * arg2 + arg4 >> 16);
                            int var37 = field5898 - (arg2 * var33 + arg4 >> 16);
                            method2476(arg0, var34, var36, var35 - var34, var37 - var36, var31.field9009, var31.field9004 & 0xFF, var31.field9003, var31.field9006, var31.field9008, false);
                        }
                    }
                }
            }
            for (int var15 = var9; var15 <= var11; var15++) {
                for (int var16 = var10; var16 <= var12; var16++) {
                    class578 var17 = field5901[var13][var15][var16];
                    if (var17 != null) {
                        int var18 = ((field5899 >> 6) + var15) * 64;
                        int var19 = ((field5902 >> 6) + var16) * 64;
                        for (class621 var20 = (class621) var17.method3317(-121); var20 != null; var20 = (class621) var17.method3321(-121)) {
                            int var21 = var20.field9007 + var18 - field5899 - field5897;
                            int var22 = var20.field9005 + var19 - field5902 - field5883;
                            int var23 = (arg1 * var21 + arg3 >> 16) + field5888;
                            int var24 = ((var21 + 1) * arg1 + arg3 >> 16) + field5888;
                            int var25 = field5898 - ((var22 + 1) * arg2 + arg4 >> 16);
                            int var26 = field5898 - (arg2 * var22 + arg4 >> 16);
                            method2488(arg0, var23, var25, var24 - var23, var26 - var25, var20.field9006, var20.field9008);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lr;IIII[S[B)V")
    private static final void method2488(class167 arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        if (arg5 == null) {
            return;
        }
        for (int var7 = 0; var7 < arg5.length; var7++) {
            class56 var8 = field5869.method3515(arg5[var7] & 0xFFFF, 50);
            int var9 = var8.field1233;
            if (var9 != -1) {
                class661 var10 = field5865.method2803(var9, -28997);
                class702 var11 = var10.method3759(arg0, -1, var8.field1295 ? var8.field1269 : false, var8.field1256 ? arg6[var7] >> 6 & 0x3 : 0);
                if (var11 != null) {
                    int var12 = arg3 * var11.method1784() >> 2;
                    int var13 = arg4 * var11.method1789() >> 2;
                    if (var10.field9522) {
                        int var14 = var8.field1238;
                        int var15 = var8.field1244;
                        if ((arg6[var7] >> 6 & 0x1) == 1) {
                            int var16 = var14;
                            var14 = var15;
                            var15 = var16;
                        }
                        var12 = arg3 * var14;
                        var13 = arg4 * var15;
                    }
                    if (var12 != 0 && var13 != 0) {
                        if (var10.field9529 == 0) {
                            var11.method3922(arg1, arg2 + arg4 - var13, var12, var13);
                        } else {
                            var11.method3919(arg1, arg2 + arg4 - var13, var12, var13, 0, var10.field9529 | 0xFF000000, 1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "(Lr;IIII)Lhga;")
    private static final class158 method2489(class167 arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class473 var5 = (class473) field5880.method1224(-2); var5 != null; var5 = (class473) field5880.method1232(-2)) {
            method2486(arg0, var5, arg1, arg2, arg3, arg4);
        }
        return field5880;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lfa;III)I")
    private static final int method2490(class214 arg0, int arg1, int arg2, int arg3) {
        class92 var4 = field5868.method3697((byte) -125, arg1);
        if (var4 == null) {
            return 0;
        }
        int var5 = var4.field1681;
        if (var5 >= 0 && arg0.method1500(var5, -85).field9844) {
            var5 = -1;
        }
        int var9;
        if (var4.field1678 >= 0) {
            int var6 = var4.field1678;
            int var7 = (var6 & 0x7F) + arg3;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 127) {
                var7 = 127;
            }
            int var8 = (arg2 + var6 & 0xFC00) + (var6 & 0x380) + var7;
            var9 = class410.field5946[class414.method2528((byte) 123, class699.method3907(-69, 96, var8)) & 0xFFFF] | 0xFF000000;
        } else if (var5 >= 0) {
            var9 = class410.field5946[class414.method2528((byte) -77, class699.method3907(-93, 96, arg0.method1500(var5, -91).field9828)) & 0xFFFF] | 0xFF000000;
        } else if (var4.field1686 == -1) {
            var9 = 0;
        } else {
            int var10 = var4.field1686;
            int var11 = (var10 & 0x7F) + arg3;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 127) {
                var11 = 127;
            }
            int var12 = (arg2 + var10 & 0xFC00) + (var10 & 0x380) + var11;
            var9 = class410.field5946[class414.method2528((byte) 127, class699.method3907(-115, 96, var12)) & 0xFFFF] | 0xFF000000;
        }
        return var9;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lr;Lqh;IIII[I[I)V")
    private static final void method2491(class167 arg0, class61 arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7) {
        int var8 = arg1.method732(-559537960);
        if ((var8 & 0x1) == 0) {
            boolean var9 = (var8 & 0x2) == 0;
            int var10 = var8 >> 2 & 0x3F;
            if (var10 != 62) {
                int var11;
                if (var10 == 63) {
                    var11 = arg1.method732(-559537960);
                } else if (var9) {
                    var11 = arg6[var10];
                } else {
                    var11 = arg7[var10];
                }
                if (var9) {
                    field5890[field5892 * arg5 + arg4] = (byte) var11;
                    field5889[field5892 * arg5 + arg4] = 0;
                } else {
                    field5889[field5892 * arg5 + arg4] = (byte) var11;
                    field5887[field5892 * arg5 + arg4] = 0;
                    field5890[field5892 * arg5 + arg4] = arg1.method710((byte) 43);
                }
            }
            return;
        }
        int var12 = (var8 >> 1 & 0x3) + 1;
        boolean var13 = (var8 & 0x8) != 0;
        boolean var14 = (var8 & 0x10) != 0;
        for (int var15 = 0; var15 < var12; var15++) {
            int var16 = arg1.method732(-559537960);
            int var17 = 0;
            int var18 = 0;
            if (var13) {
                var17 = arg1.method732(-559537960);
                var18 = arg1.method732(-559537960);
            }
            int var19 = 0;
            if (var14) {
                var19 = arg1.method732(-559537960);
            }
            if (var15 == 0) {
                field5890[field5892 * arg5 + arg4] = (byte) var16;
                field5889[field5892 * arg5 + arg4] = (byte) var17;
                field5887[field5892 * arg5 + arg4] = (byte) var18;
                if (var19 == 1) {
                    field5885[field5892 * arg5 + arg4] = (short) (arg1.method723((byte) -25) + 1);
                    field5893[field5892 * arg5 + arg4] = arg1.method710((byte) 43);
                } else if (var19 > 1) {
                    field5885[field5892 * arg5 + arg4] = -1;
                    short[] var20 = new short[var19];
                    byte[] var21 = new byte[var19];
                    for (int var22 = 0; var22 < var19; var22++) {
                        var20[var22] = (short) arg1.method723((byte) -25);
                        var21[var22] = arg1.method710((byte) 43);
                    }
                    field5884.method2598(new class665(var20, var21), (long) (arg4 << 16 | arg5), (byte) 8);
                }
            } else {
                short[] var23 = null;
                byte[] var24 = null;
                if (var19 > 0) {
                    var23 = new short[var19];
                    var24 = new byte[var19];
                    for (int var25 = 0; var25 < var19; var25++) {
                        var23[var25] = (short) arg1.method723((byte) -25);
                        var24[var25] = arg1.method710((byte) 43);
                    }
                }
                if (field5901[var15 - 1][arg2 - (field5899 >> 6)][arg3 - (field5902 >> 6)] == null) {
                    field5901[var15 - 1][arg2 - (field5899 >> 6)][arg3 - (field5902 >> 6)] = new class578();
                }
                class621 var26 = new class621(arg4 & 0x3F, arg5 & 0x3F, var16, var17, var18, var23, var24);
                field5901[var15 - 1][arg2 - (field5899 >> 6)][arg3 - (field5902 >> 6)].method3322(var26, -78);
            }
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "([B[B[SII)V")
    private static final void method2492(byte[] arg0, byte[] arg1, short[] arg2, int arg3, int arg4) {
        int[] var5 = new int[field5882];
        int[] var6 = new int[field5882];
        int[] var7 = new int[field5882];
        int[] var8 = new int[field5882];
        int[] var9 = new int[field5882];
        for (int var10 = -5; var10 < field5892; var10++) {
            int var11 = var10 + 5;
            int var12 = var10 - 5;
            for (int var13 = 0; var13 < field5882; var13++) {
                int var10002;
                if (var11 < field5892) {
                    int var28 = arg0[field5892 * var13 + var11] & 0xFF;
                    if (var28 > 0) {
                        class232 var29 = field5863.method1510(false, var28 - 1);
                        var5[var13] += var29.field3484;
                        var6[var13] += var29.field3472;
                        var7[var13] += var29.field3470;
                        var8[var13] += var29.field3477;
                        var10002 = var9[var13]++;
                    }
                }
                if (var12 >= 0) {
                    int var30 = arg0[field5892 * var13 + var12] & 0xFF;
                    if (var30 > 0) {
                        class232 var31 = field5863.method1510(false, var30 - 1);
                        var5[var13] -= var31.field3484;
                        var6[var13] -= var31.field3472;
                        var7[var13] -= var31.field3470;
                        var8[var13] -= var31.field3477;
                        var10002 = var9[var13]--;
                    }
                }
            }
            if (var10 >= 0) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                int var17 = 0;
                int var18 = 0;
                for (int var19 = -5; var19 < field5882; var19++) {
                    int var20 = var19 + 5;
                    if (var20 < field5882) {
                        var14 += var5[var20];
                        var15 += var6[var20];
                        var16 += var7[var20];
                        var17 += var8[var20];
                        var18 += var9[var20];
                    }
                    int var21 = var19 - 5;
                    if (var21 >= 0) {
                        var14 -= var5[var21];
                        var15 -= var6[var21];
                        var16 -= var7[var21];
                        var17 -= var8[var21];
                        var18 -= var9[var21];
                    }
                    if (var19 >= 0 && var18 > 0) {
                        if ((arg0[field5892 * var19 + var10] & 0xFF) == 0) {
                            int var22 = field5892 * var19 + var10;
                            arg1[var22] = 0;
                            arg2[var22] = 0;
                        } else {
                            int var23 = var17 == 0 ? 0 : class610.method3507((byte) 62, var14 * 256 / var17, var16 / var18, var15 / var18);
                            int var24 = (var23 & 0x7F) + arg4;
                            if (var24 < 0) {
                                var24 = 0;
                            } else if (var24 > 127) {
                                var24 = 127;
                            }
                            int var25 = (arg3 + var23 & 0xFC00) + (var23 & 0x380) + var24;
                            int var26 = field5892 * var19 + var10;
                            int var27 = class410.field5946[class414.method2528((byte) -20, class695.method3890(var25, 96, -3)) & 0xFFFF];
                            arg1[var26] = (byte) (var27 >> 16 & 0xFF);
                            arg2[var26] = (short) (var27 & 0xFFFF);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ks", name = "e", descriptor = "()V")
    public static final void method2493() {
        field5890 = new byte[field5892 * field5882];
        field5889 = new byte[field5892 * field5882];
        field5887 = new byte[field5892 * field5882];
        field5885 = new short[field5892 * field5882];
        field5893 = new byte[field5892 * field5882];
        field5884 = new class427(1024);
        field5901 = new class578[3][field5892 >> 6][field5882 >> 6];
        field5886 = new int[field5868.field9336 + 1];
    }

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "(Lr;)V")
    public static final void method2494(class167 arg0) {
        int var1 = field5895 - field5897;
        int var2 = field5900 - field5883;
        int var3 = (field5903 - field5888 << 16) / var1;
        int var4 = (field5898 - field5894 << 16) / var2;
        method2487(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method2495(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5897 = arg0 - field5899;
        field5900 = arg1 - field5902;
        field5895 = arg2 - field5899;
        field5883 = arg3 - field5902;
        field5888 = arg4;
        field5894 = arg5;
        field5903 = arg6;
        field5898 = arg7;
    }

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "(I)Lai;")
    public static final class557 method2496(int arg0) {
        return (class557) field5867.method2596((long) arg0, 60);
    }
}
