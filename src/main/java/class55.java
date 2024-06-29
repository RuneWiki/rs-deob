import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rv")
public class class55 {

    @OriginalMember(owner = "client!rv", name = "i", descriptor = "Lefa;")
    private static class322 field838 = new class322(16);

    @OriginalMember(owner = "client!rv", name = "j", descriptor = "[B")
    private static byte[] field839 = new byte[1];

    @OriginalMember(owner = "client!rv", name = "n", descriptor = "I")
    public static int field843 = (int) (Math.random() * 11.0D) - 5;

    @OriginalMember(owner = "client!rv", name = "p", descriptor = "I")
    public static int field845 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!rv", name = "s", descriptor = "[S")
    private static short[] field848 = new short[1];

    @OriginalMember(owner = "client!rv", name = "l", descriptor = "Ldc;")
    public static class302 field841 = new class302();

    @OriginalMember(owner = "client!rv", name = "m", descriptor = "F")
    public static float field842;

    @OriginalMember(owner = "client!rv", name = "o", descriptor = "F")
    public static float field844;

    @OriginalMember(owner = "client!rv", name = "r", descriptor = "I")
    public static int field847;

    @OriginalMember(owner = "client!rv", name = "t", descriptor = "I")
    public static int field849;

    @OriginalMember(owner = "client!rv", name = "v", descriptor = "I")
    public static int field851;

    @OriginalMember(owner = "client!rv", name = "w", descriptor = "I")
    public static int field852;

    @OriginalMember(owner = "client!rv", name = "x", descriptor = "I")
    public static int field853;

    @OriginalMember(owner = "client!rv", name = "y", descriptor = "I")
    public static int field854;

    @OriginalMember(owner = "client!rv", name = "C", descriptor = "I")
    public static int field858;

    @OriginalMember(owner = "client!rv", name = "G", descriptor = "I")
    public static int field862;

    @OriginalMember(owner = "client!rv", name = "I", descriptor = "I")
    public static int field864;

    @OriginalMember(owner = "client!rv", name = "J", descriptor = "I")
    public static int field865;

    @OriginalMember(owner = "client!rv", name = "K", descriptor = "I")
    public static int field866;

    @OriginalMember(owner = "client!rv", name = "L", descriptor = "I")
    public static int field867;

    @OriginalMember(owner = "client!rv", name = "N", descriptor = "I")
    public static int field869;

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "Lmv;")
    public static class295 field830;

    @OriginalMember(owner = "client!rv", name = "F", descriptor = "Lefa;")
    private static class322 field861;

    @OriginalMember(owner = "client!rv", name = "c", descriptor = "Lsf;")
    private static class397 field832;

    @OriginalMember(owner = "client!rv", name = "g", descriptor = "Luaa;")
    public static class404 field836;

    @OriginalMember(owner = "client!rv", name = "f", descriptor = "Llm;")
    public static class40 field835;

    @OriginalMember(owner = "client!rv", name = "h", descriptor = "Lqp;")
    public static class438 field837;

    @OriginalMember(owner = "client!rv", name = "e", descriptor = "Lwf;")
    public static class481 field834;

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "Lll;")
    private static class488 field831;

    @OriginalMember(owner = "client!rv", name = "d", descriptor = "Lida;")
    public static class604 field833;

    @OriginalMember(owner = "client!rv", name = "k", descriptor = "Llp;")
    public static class69 field840;

    @OriginalMember(owner = "client!rv", name = "A", descriptor = "[B")
    private static byte[] field856;

    @OriginalMember(owner = "client!rv", name = "B", descriptor = "[B")
    private static byte[] field857;

    @OriginalMember(owner = "client!rv", name = "D", descriptor = "[B")
    private static byte[] field859;

    @OriginalMember(owner = "client!rv", name = "H", descriptor = "[B")
    private static byte[] field863;

    @OriginalMember(owner = "client!rv", name = "O", descriptor = "[B")
    private static byte[] field870;

    @OriginalMember(owner = "client!rv", name = "M", descriptor = "[I")
    private static int[] field868;

    @OriginalMember(owner = "client!rv", name = "z", descriptor = "[S")
    private static short[] field855;

    @OriginalMember(owner = "client!rv", name = "E", descriptor = "[S")
    private static short[] field860;

    @OriginalMember(owner = "client!rv", name = "q", descriptor = "[[[B")
    public static byte[][][] field846;

    @OriginalMember(owner = "client!rv", name = "u", descriptor = "[[[Lmb;")
    private static class383[][][] field850;

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "()V")
    public static final void method327() {
        int[] var0 = new int[3];
        for (int var1 = 0; var1 < field840.field1081; var1++) {
            boolean var2 = field833.method3450(field840.field1080[var1] >> 28 & 0x3, field840.field1080[var1] >> 14 & 0x3FFF, (byte) 118, field840.field1080[var1] & 0x3FFF, var0);
            if (var2) {
                class415 var3 = new class415(field840.field1079[var1]);
                var3.field6143 = var0[1] - field865;
                var3.field6145 = var0[2] - field866;
                field841.method1909(var3, (byte) -81);
            }
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(Lr;II)V")
    public static final void method328(class98 arg0, int arg1, int arg2) {
        class540 var3 = new class540(field830.method1817(127, field833.field8737, "area"));
        int var4 = var3.method3115(29871);
        int[] var5 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var5[var6] = var3.method3115(29871);
        }
        int var7 = var3.method3115(29871);
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method3115(29871);
        }
        while (true) {
            while (var3.field7956 < var3.field7952.length) {
                if (var3.method3115(29871) == 0) {
                    int var22 = var3.method3115(29871);
                    int var23 = var3.method3115(29871);
                    for (int var24 = 0; var24 < 64; var24++) {
                        for (int var25 = 0; var25 < 64; var25++) {
                            int var26 = var22 * 64 + var24 - field865;
                            int var27 = var23 * 64 + var25 - field866;
                            method349(arg0, var3, var22, var23, var26, var27, var5, var8);
                        }
                    }
                } else {
                    int var28 = var3.method3115(29871);
                    int var29 = var3.method3115(29871);
                    int var30 = var3.method3115(29871);
                    int var31 = var3.method3115(29871);
                    for (int var32 = 0; var32 < 8; var32++) {
                        for (int var33 = 0; var33 < 8; var33++) {
                            int var34 = var28 * 64 + var30 * 8 + var32 - field865;
                            int var35 = var29 * 64 + var31 * 8 + var33 - field866;
                            method349(arg0, var3, var28, var29, var34, var35, var5, var8);
                        }
                    }
                }
            }
            Object var10 = null;
            field870 = new byte[field869 * field851];
            field860 = new short[field869 * field851];
            for (int var11 = 0; var11 < 3; var11++) {
                byte[] var12 = new byte[field869 * field851];
                for (int var13 = 0; var13 < field850[var11].length; var13++) {
                    for (int var19 = 0; var19 < field850[var11][0].length; var19++) {
                        class383 var20 = field850[var11][var13][var19];
                        if (var20 != null) {
                            for (class277 var21 = (class277) var20.method2370(-26173); var21 != null; var21 = (class277) var20.method2369((byte) 123)) {
                                var12[(var19 * 64 + var21.field3606) * field851 + var13 * 64 + var21.field3607] = (byte) var21.field3605;
                            }
                        }
                    }
                }
                method341(var12, field870, field860, arg1, arg2);
                for (int var14 = 0; var14 < field850[var11].length; var14++) {
                    for (int var15 = 0; var15 < field850[var11][0].length; var15++) {
                        class383 var16 = field850[var11][var14][var15];
                        if (var16 != null) {
                            for (class277 var17 = (class277) var16.method2370(-26173); var17 != null; var17 = (class277) var16.method2369((byte) -84)) {
                                int var18 = (var15 * 64 + var17.field3606) * field851 + var14 * 64 + var17.field3607;
                                var17.field3605 = (field870[var18] & 0xFF) << 16 | field860[var18] & 0xFFFF;
                                if (var17.field3605 != 0) {
                                    var17.field3605 |= 0xFF000000;
                                }
                            }
                        }
                    }
                }
            }
            method341(field859, field870, field860, arg1, arg2);
            field859 = null;
            method339();
            return;
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method329(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field864 = arg0 - field865;
        field849 = arg1 - field866;
        field852 = arg2 - field865;
        field853 = arg3 - field866;
        field858 = arg4;
        field867 = arg5;
        field862 = arg6;
        field854 = arg7;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(Lfa;III)I")
    private static final int method330(class615 arg0, int arg1, int arg2, int arg3) {
        class335 var4 = field832.method2472(4, arg1);
        if (var4 == null) {
            return 0;
        }
        int var5 = var4.field4881;
        if (var5 >= 0 && arg0.method955(-1330, var5).field6612) {
            var5 = -1;
        }
        int var9;
        if (var4.field4882 >= 0) {
            int var6 = var4.field4882;
            int var7 = (var6 & 0x7F) + arg3;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 127) {
                var7 = 127;
            }
            int var8 = (arg2 + var6 & 0xFC00) + (var6 & 0x380) + var7;
            var9 = class589.field8551[class399.method2479(class608.method3475(96, var8, -27274), false) & 0xFFFF] | 0xFF000000;
        } else if (var5 >= 0) {
            var9 = class589.field8551[class399.method2479(class608.method3475(96, arg0.method955(-1330, var5).field6597, -27274), false) & 0xFFFF] | 0xFF000000;
        } else if (var4.field4876 == -1) {
            var9 = 0;
        } else {
            int var10 = var4.field4876;
            int var11 = (var10 & 0x7F) + arg3;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 127) {
                var11 = 127;
            }
            int var12 = (arg2 + var10 & 0xFC00) + (var10 & 0x380) + var11;
            var9 = class589.field8551[class399.method2479(class608.method3475(96, var12, -27274), false) & 0xFFFF] | 0xFF000000;
        }
        return var9;
    }

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "()V")
    public static void method331() {
        field832 = null;
        field831 = null;
        field837 = null;
        field834 = null;
        field835 = null;
        field836 = null;
        field833 = null;
        field830 = null;
        field838 = null;
        field846 = null;
        field848 = null;
        field839 = null;
        field840 = null;
        field841 = null;
        field868 = null;
        field859 = null;
        field870 = null;
        field860 = null;
        field857 = null;
        field856 = null;
        field855 = null;
        field863 = null;
        field861 = null;
        field850 = null;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(Lmv;Lsf;Lll;Lqp;Lwf;Llm;Luaa;)V")
    public static final void method332(class295 arg0, class397 arg1, class488 arg2, class438 arg3, class481 arg4, class40 arg5, class404 arg6) {
        field830 = arg0;
        field832 = arg1;
        field831 = arg2;
        field837 = arg3;
        field834 = arg4;
        field835 = arg5;
        field836 = arg6;
        field838.method1995((byte) -123);
        int var7 = field830.method1819("details", (byte) 67);
        int[] var8 = field830.method1846(var7, -15120);
        if (var8 != null) {
            for (int var9 = 0; var9 < var8.length; var9++) {
                class604 var10 = class334.method2044(field830, var7, var8[var9], -2);
                field838.method2001(-126, var10, (long) var10.field8730);
            }
        }
        class530.method3075(false, (byte) 80, true);
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(I)Lida;")
    public static final class604 method333(int arg0) {
        return (class604) field838.method2002((byte) -124, (long) arg0);
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(II)Lida;")
    public static final class604 method334(int arg0, int arg1) {
        for (class604 var2 = (class604) field838.method1993(-118); var2 != null; var2 = (class604) field838.method1997(9831)) {
            if (var2.field8726 && var2.method3449(1, arg1, arg0)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(Lr;IIII)Ldc;")
    private static final class302 method335(class98 arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class415 var5 = (class415) field841.method1904(false); var5 != null; var5 = (class415) field841.method1901(115)) {
            method348(arg0, var5, arg1, arg2, arg3, arg4);
        }
        return field841;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(Lr;IIII[S[B)V")
    private static final void method336(class98 arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        if (arg5 == null) {
            return;
        }
        for (int var7 = 0; var7 < arg5.length; var7++) {
            class289 var8 = field837.method2596(0, arg5[var7] & 0xFFFF);
            int var9 = var8.field4246;
            if (var9 != -1) {
                class673 var10 = field835.method227(var9, -123);
                class256 var11 = var10.method3779(var8.field4257 ? var8.field4226 : false, var8.field4258 ? arg6[var7] >> 6 & 0x3 : 0, 119, arg0);
                if (var11 != null) {
                    int var12 = arg3 * var11.method50() >> 2;
                    int var13 = arg4 * var11.method43() >> 2;
                    if (var10.field9461) {
                        int var14 = var8.field4269;
                        int var15 = var8.field4197;
                        if ((arg6[var7] >> 6 & 0x1) == 1) {
                            int var16 = var14;
                            var14 = var15;
                            var15 = var16;
                        }
                        var12 = arg3 * var14;
                        var13 = arg4 * var15;
                    }
                    if (var12 != 0 && var13 != 0) {
                        if (var10.field9464 == 0) {
                            var11.method1535(arg1, arg2 + arg4 - var13, var12, var13);
                        } else {
                            var11.method1532(arg1, arg2 + arg4 - var13, var12, var13, 0, var10.field9464 | 0xFF000000, 1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(Lr;)V")
    public static final void method337(class98 arg0) {
        int var1 = field852 - field864;
        int var2 = field849 - field853;
        int var3 = (field862 - field858 << 16) / var1;
        int var4 = (field854 - field867 << 16) / var2;
        method338(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "(Lr;IIII)V")
    private static final void method338(class98 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = field852 - field864;
        int var6 = field849 - field853;
        if (field852 < field851) {
            var5++;
        }
        if (field849 < field869) {
            var6++;
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var49 = (arg1 * var7 + arg3 >> 16) + field858;
            int var50 = ((var7 + 1) * arg1 + arg3 >> 16) + field858;
            int var51 = var50 - var49;
            if (var51 > 0) {
                int var52 = field864 + var7;
                if (var52 >= 0 && var52 < field851) {
                    for (int var53 = 0; var53 < var6; var53++) {
                        int var54 = field854 - ((var53 + 1) * arg2 + arg4 >> 16);
                        int var55 = field854 - (arg2 * var53 + arg4 >> 16);
                        int var56 = var55 - var54;
                        if (var56 > 0) {
                            int var57 = field853 + var53;
                            int var58 = field851 * var57 + var52;
                            int var59 = 0;
                            int var60 = 0;
                            int var61 = 0;
                            if (var57 >= 0 && var57 < field869) {
                                var59 = (field870[var58] & 0xFF) << 16 | field860[var58] & 0xFFFF;
                                if (var59 != 0) {
                                    var59 |= 0xFF000000;
                                }
                                var60 = field857[var58] & 0xFF;
                                var61 = field855[var58] & 0xFFFF;
                            }
                            if (var59 == 0 && var60 == 0 && var61 == 0) {
                                int var62;
                                if (field833.field8725 != -1) {
                                    var62 = field833.field8725 | 0xFF000000;
                                } else if ((field864 + var7 & 0x4) == (field849 + var53 & 0x4)) {
                                    var62 = field868[field832.field6003 + 1];
                                } else {
                                    var62 = -11840664;
                                }
                                if (var62 == 0) {
                                    var62 = -16777216;
                                }
                                arg0.method700(var49, var54, var51, var56, var62, 0);
                            } else if (var61 <= 0) {
                                method343(arg0, var49, var54, var51, var56, var59, var60, field856[var58], null, null, true);
                            } else if (var61 == 65535) {
                                class37 var63 = (class37) field861.method2002((byte) -111, (long) (var52 << 16 | var57));
                                if (var63 != null) {
                                    method343(arg0, var49, var54, var51, var56, var59, var60, field856[var58], var63.field569, var63.field570, true);
                                }
                            } else {
                                field848[0] = (short) (var61 - 1);
                                field839[0] = field863[var58];
                                method343(arg0, var49, var54, var51, var56, var59, var60, field856[var58], field848, field839, true);
                            }
                        }
                    }
                } else {
                    for (int var64 = 0; var64 < var6; var64++) {
                        int var65 = field854 - ((var64 + 1) * arg2 + arg4 >> 16);
                        int var66 = field854 - (arg2 * var64 + arg4 >> 16);
                        int var67 = var66 - var65;
                        int var68;
                        if (field833.field8725 != -1) {
                            var68 = field833.field8725 | 0xFF000000;
                        } else if ((field864 + var7 & 0x4) == (field849 + var64 & 0x4)) {
                            var68 = field868[field832.field6003 + 1];
                        } else {
                            var68 = -11840664;
                        }
                        if (var68 == 0) {
                            var68 = -16777216;
                        }
                        arg0.method700(var49, var65, var51, var67, var68, 0);
                    }
                }
            }
        }
        for (int var8 = -16; var8 < var5 + 16; var8++) {
            int var38 = (arg1 * var8 + arg3 >> 16) + field858;
            int var39 = ((var8 + 1) * arg1 + arg3 >> 16) + field858;
            int var40 = var39 - var38;
            if (var40 > 0) {
                int var41 = field864 + var8;
                if (var41 >= 0 && var41 < field851) {
                    for (int var42 = -16; var42 < var6 + 16; var42++) {
                        int var43 = field854 - ((var42 + 1) * arg2 + arg4 >> 16);
                        int var44 = field854 - (arg2 * var42 + arg4 >> 16);
                        int var45 = var44 - var43;
                        if (var45 > 0) {
                            int var46 = field853 + var42;
                            if (var46 >= 0 && var46 < field869) {
                                int var47 = field855[field851 * var46 + var41] & 0xFFFF;
                                if (var47 <= 0) {
                                    method336(arg0, var38, var43, var40, var45, null, null);
                                } else if (var47 == 65535) {
                                    class37 var48 = (class37) field861.method2002((byte) -108, (long) (var41 << 16 | var46));
                                    if (var48 != null) {
                                        method336(arg0, var38, var43, var40, var45, var48.field569, var48.field570);
                                    }
                                } else {
                                    field848[0] = (short) (var47 - 1);
                                    field839[0] = field863[field851 * var46 + var41];
                                    method336(arg0, var38, var43, var40, var45, field848, field839);
                                }
                            }
                        }
                    }
                }
            }
        }
        int var9 = field864 >> 6;
        int var10 = field853 >> 6;
        if (var9 < 0) {
            var9 = 0;
        }
        if (var10 < 0) {
            var10 = 0;
        }
        int var11 = field852 >> 6;
        int var12 = field849 >> 6;
        if (var11 >= field850[0].length) {
            var11 = field850[0].length - 1;
        }
        if (var12 >= field850[0][0].length) {
            var12 = field850[0][0].length - 1;
        }
        for (int var13 = 0; var13 < 3; var13++) {
            for (int var14 = var9; var14 <= var11; var14++) {
                for (int var27 = var10; var27 <= var12; var27++) {
                    class383 var28 = field850[var13][var14][var27];
                    if (var28 != null) {
                        int var29 = ((field865 >> 6) + var14) * 64;
                        int var30 = ((field866 >> 6) + var27) * 64;
                        for (class277 var31 = (class277) var28.method2370(-26173); var31 != null; var31 = (class277) var28.method2369((byte) -54)) {
                            int var32 = var31.field3607 + var29 - field865 - field864;
                            int var33 = var31.field3606 + var30 - field866 - field853;
                            int var34 = (arg1 * var32 + arg3 >> 16) + field858;
                            int var35 = ((var32 + 1) * arg1 + arg3 >> 16) + field858;
                            int var36 = field854 - ((var33 + 1) * arg2 + arg4 >> 16);
                            int var37 = field854 - (arg2 * var33 + arg4 >> 16);
                            method343(arg0, var34, var36, var35 - var34, var37 - var36, var31.field3605, var31.field3604 & 0xFF, var31.field3608, var31.field3603, var31.field3609, false);
                        }
                    }
                }
            }
            for (int var15 = var9; var15 <= var11; var15++) {
                for (int var16 = var10; var16 <= var12; var16++) {
                    class383 var17 = field850[var13][var15][var16];
                    if (var17 != null) {
                        int var18 = ((field865 >> 6) + var15) * 64;
                        int var19 = ((field866 >> 6) + var16) * 64;
                        for (class277 var20 = (class277) var17.method2370(-26173); var20 != null; var20 = (class277) var17.method2369((byte) 127)) {
                            int var21 = var20.field3607 + var18 - field865 - field864;
                            int var22 = var20.field3606 + var19 - field866 - field853;
                            int var23 = (arg1 * var21 + arg3 >> 16) + field858;
                            int var24 = ((var21 + 1) * arg1 + arg3 >> 16) + field858;
                            int var25 = field854 - ((var22 + 1) * arg2 + arg4 >> 16);
                            int var26 = field854 - (arg2 * var22 + arg4 >> 16);
                            method336(arg0, var23, var25, var24 - var23, var26 - var25, var20.field3603, var20.field3609);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rv", name = "c", descriptor = "()V")
    private static final void method339() {
        for (int var0 = 0; var0 < field851; var0++) {
            for (int var11 = 0; var11 < field869; var11++) {
                int var12 = field855[field851 * var11 + var0] & 0xFFFF;
                if (var12 != 0) {
                    if (var12 == 65535) {
                        class37 var13 = (class37) field861.method2002((byte) -121, (long) (var0 << 16 | var11));
                        if (var13 != null) {
                            for (int var14 = 0; var14 < var13.field569.length; var14++) {
                                class289 var15 = field837.method2596(0, var13.field569[var14] & 0xFFFF);
                                int var16 = var15.field4266;
                                if (var15.field4213 != null) {
                                    class289 var17 = var15.method1788(field836, -25);
                                    if (var17 != null) {
                                        var16 = var17.field4266;
                                    }
                                }
                                if (var16 != -1) {
                                    class415 var18 = new class415(var16);
                                    var18.field6143 = var0;
                                    var18.field6145 = var11;
                                    field841.method1909(var18, (byte) -81);
                                }
                            }
                        }
                    } else {
                        class289 var19 = field837.method2596(0, var12 - 1);
                        int var20 = var19.field4266;
                        if (var19.field4213 != null) {
                            class289 var21 = var19.method1788(field836, -20);
                            if (var21 != null) {
                                var20 = var21.field4266;
                            }
                        }
                        if (var20 != -1) {
                            class415 var22 = new class415(var20);
                            var22.field6143 = var0;
                            var22.field6145 = var11;
                            field841.method1909(var22, (byte) -81);
                        }
                    }
                }
            }
        }
        for (int var1 = 0; var1 < 3; var1++) {
            for (int var2 = 0; var2 < field850[0].length; var2++) {
                for (int var3 = 0; var3 < field850[0][0].length; var3++) {
                    class383 var4 = field850[var1][var2][var3];
                    if (var4 != null) {
                        for (class277 var5 = (class277) var4.method2370(-26173); var5 != null; var5 = (class277) var4.method2369((byte) 126)) {
                            if (var5.field3603 != null) {
                                for (int var6 = 0; var6 < var5.field3603.length; var6++) {
                                    class289 var7 = field837.method2596(0, var5.field3603[var6] & 0xFFFF);
                                    int var8 = var7.field4266;
                                    if (var7.field4213 != null) {
                                        class289 var9 = var7.method1788(field836, -80);
                                        if (var9 != null) {
                                            var8 = var9.field4266;
                                        }
                                    }
                                    if (var8 != -1) {
                                        class415 var10 = new class415(var8);
                                        var10.field6143 = ((field865 >> 6) + var2) * 64 + var5.field3607 - field865;
                                        var10.field6145 = ((field866 >> 6) + var3) * 64 + var5.field3606 - field866;
                                        field841.method1909(var10, (byte) -81);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "(Lr;)Ldc;")
    public static final class302 method340(class98 arg0) {
        int var1 = field852 - field864;
        int var2 = field849 - field853;
        int var3 = (field862 - field858 << 16) / var1;
        int var4 = (field854 - field867 << 16) / var2;
        return method335(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "([B[B[SII)V")
    private static final void method341(byte[] arg0, byte[] arg1, short[] arg2, int arg3, int arg4) {
        int[] var5 = new int[field869];
        int[] var6 = new int[field869];
        int[] var7 = new int[field869];
        int[] var8 = new int[field869];
        int[] var9 = new int[field869];
        for (int var10 = -5; var10 < field851; var10++) {
            int var11 = var10 + 5;
            int var12 = var10 - 5;
            for (int var13 = 0; var13 < field869; var13++) {
                int var10002;
                if (var11 < field851) {
                    int var28 = arg0[field851 * var13 + var11] & 0xFF;
                    if (var28 > 0) {
                        class520 var29 = field831.method2789(-45, var28 - 1);
                        var5[var13] += var29.field7286;
                        var6[var13] += var29.field7293;
                        var7[var13] += var29.field7298;
                        var8[var13] += var29.field7289;
                        var10002 = var9[var13]++;
                    }
                }
                if (var12 >= 0) {
                    int var30 = arg0[field851 * var13 + var12] & 0xFF;
                    if (var30 > 0) {
                        class520 var31 = field831.method2789(-122, var30 - 1);
                        var5[var13] -= var31.field7286;
                        var6[var13] -= var31.field7293;
                        var7[var13] -= var31.field7298;
                        var8[var13] -= var31.field7289;
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
                for (int var19 = -5; var19 < field869; var19++) {
                    int var20 = var19 + 5;
                    if (var20 < field869) {
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
                        if ((arg0[field851 * var19 + var10] & 0xFF) == 0) {
                            int var22 = field851 * var19 + var10;
                            arg1[var22] = 0;
                            arg2[var22] = 0;
                        } else {
                            int var23 = var17 == 0 ? 0 : class257.method1540(var14 * 256 / var17, var16 / var18, var15 / var18, -1613418582);
                            int var24 = (var23 & 0x7F) + arg4;
                            if (var24 < 0) {
                                var24 = 0;
                            } else if (var24 > 127) {
                                var24 = 127;
                            }
                            int var25 = (arg3 + var23 & 0xFC00) + (var23 & 0x380) + var24;
                            int var26 = field851 * var19 + var10;
                            int var27 = class589.field8551[class399.method2479(class596.method3391(96, false, var25), false) & 0xFFFF];
                            arg1[var26] = (byte) (var27 >> 16 & 0xFF);
                            arg2[var26] = (short) (var27 & 0xFFFF);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rv", name = "d", descriptor = "()V")
    public static final void method342() {
        field859 = new byte[field869 * field851];
        field857 = new byte[field869 * field851];
        field856 = new byte[field869 * field851];
        field855 = new short[field869 * field851];
        field863 = new byte[field869 * field851];
        field861 = new class322(1024);
        field850 = new class383[3][field851 >> 6][field869 >> 6];
        field868 = new int[field832.field6000 + 1];
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(Lr;IIIIIII[S[BZ)V")
    private static final void method343(class98 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, short[] arg8, byte[] arg9, boolean arg10) {
        if (arg10 || arg5 != 0 || arg6 > 0) {
            if (arg6 == 0) {
                arg0.method700(arg1, arg2, arg3, arg4, arg5, 0);
            } else {
                int var11 = arg7 & 0x3F;
                if (var11 == 0 || arg3 <= 1 || arg4 <= 1) {
                    int var13 = field868[arg6];
                    if (arg10 || var13 != 0) {
                        arg0.method700(arg1, arg2, arg3, arg4, var13, 0);
                    }
                } else {
                    int var12 = arg10 ? 0 : 1;
                    class148.method1062(var12, var11, arg2, arg1, (byte) 125, arg7 >> 6 & 0x3, field868[arg6], arg5, field847, field846, arg0, arg4, arg3);
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
                class289 var18 = field837.method2596(0, arg8[var16] & 0xFFFF);
                if (var18.field4246 == -1) {
                    int var19 = -3355444;
                    if (var18.field4250 == 1) {
                        var19 = -3407872;
                    }
                    int var20 = arg9[var16] >> 6 & 0x3;
                    if (var17 == 0) {
                        if (var20 == 0) {
                            arg0.method635(arg1, arg2, arg4, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method691(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method635(var14, arg2, arg4, var19, 0);
                        } else {
                            arg0.method691(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 2) {
                        if (var20 == 0) {
                            arg0.method635(arg1, arg2, arg4, -1, 0);
                            arg0.method691(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method635(var14, arg2, arg4, -1, 0);
                            arg0.method691(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method635(var14, arg2, arg4, -1, 0);
                            arg0.method691(arg1, var15, arg3, var19, 0);
                        } else {
                            arg0.method635(arg1, arg2, arg4, -1, 0);
                            arg0.method691(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 3) {
                        if (var20 == 0) {
                            arg0.method691(arg1, arg2, 1, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method691(var14, arg2, 1, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method691(var14, var15, 1, var19, 0);
                        } else {
                            arg0.method691(arg1, var15, 1, var19, 0);
                        }
                    } else if (var17 == 9) {
                        if (var20 == 0 || var20 == 2) {
                            for (int var22 = 0; var22 < arg4; var22++) {
                                arg0.method691(arg1 + var22, var15 - var22, 1, var19, 0);
                            }
                        } else {
                            for (int var21 = 0; var21 < arg4; var21++) {
                                arg0.method691(arg1 + var21, arg2 + var21, 1, var19, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rv", name = "e", descriptor = "()V")
    public static final void method344() {
        field859 = null;
        field870 = null;
        field860 = null;
        field857 = null;
        field856 = null;
        field855 = null;
        field863 = null;
        field861 = null;
        field850 = null;
        field868 = null;
    }

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "(II)Loga;")
    public static final class158 method345(int arg0, int arg1) {
        class158 var2 = new class158();
        for (class604 var3 = (class604) field838.method1993(-92); var3 != null; var3 = (class604) field838.method1997(9831)) {
            if (var3.field8726 && var3.method3449(1, arg1, arg0)) {
                var2.method1134(var3, -1);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(Lfa;II)V")
    public static final void method346(class615 arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < field832.field6000; var3++) {
            field868[var3 + 1] = method330(arg0, var3, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "(I)V")
    public static final void method347(int arg0) {
        field833 = (class604) field838.method2002((byte) -122, (long) arg0);
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(Lr;Lhi;IIII)V")
    private static final void method348(class98 arg0, class415 arg1, int arg2, int arg3, int arg4, int arg5) {
        arg1.field6139 = ((arg1.field6143 - field864) * arg2 + arg4 >> 16) + field858;
        arg1.field6146 = field854 - ((arg1.field6145 - field853) * arg3 + arg5 >> 16);
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(Lr;Lgk;IIII[I[I)V")
    private static final void method349(class98 arg0, class540 arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7) {
        int var8 = arg1.method3115(29871);
        if ((var8 & 0x1) == 0) {
            boolean var9 = (var8 & 0x2) == 0;
            int var10 = var8 >> 2 & 0x3F;
            if (var10 != 62) {
                int var11;
                if (var10 == 63) {
                    var11 = arg1.method3115(29871);
                } else if (var9) {
                    var11 = arg6[var10];
                } else {
                    var11 = arg7[var10];
                }
                if (var9) {
                    field859[field851 * arg5 + arg4] = (byte) var11;
                    field857[field851 * arg5 + arg4] = 0;
                } else {
                    field857[field851 * arg5 + arg4] = (byte) var11;
                    field856[field851 * arg5 + arg4] = 0;
                    field859[field851 * arg5 + arg4] = arg1.method3128(32767);
                }
            }
            return;
        }
        int var12 = (var8 >> 1 & 0x3) + 1;
        boolean var13 = (var8 & 0x8) != 0;
        boolean var14 = (var8 & 0x10) != 0;
        for (int var15 = 0; var15 < var12; var15++) {
            int var16 = arg1.method3115(29871);
            int var17 = 0;
            int var18 = 0;
            if (var13) {
                var17 = arg1.method3115(29871);
                var18 = arg1.method3115(29871);
            }
            int var19 = 0;
            if (var14) {
                var19 = arg1.method3115(29871);
            }
            if (var15 == 0) {
                field859[field851 * arg5 + arg4] = (byte) var16;
                field857[field851 * arg5 + arg4] = (byte) var17;
                field856[field851 * arg5 + arg4] = (byte) var18;
                if (var19 == 1) {
                    field855[field851 * arg5 + arg4] = (short) (arg1.method3169(26488) + 1);
                    field863[field851 * arg5 + arg4] = arg1.method3128(32767);
                } else if (var19 > 1) {
                    field855[field851 * arg5 + arg4] = -1;
                    short[] var20 = new short[var19];
                    byte[] var21 = new byte[var19];
                    for (int var22 = 0; var22 < var19; var22++) {
                        var20[var22] = (short) arg1.method3169(26488);
                        var21[var22] = arg1.method3128(32767);
                    }
                    field861.method2001(64, new class37(var20, var21), (long) (arg4 << 16 | arg5));
                }
            } else {
                short[] var23 = null;
                byte[] var24 = null;
                if (var19 > 0) {
                    var23 = new short[var19];
                    var24 = new byte[var19];
                    for (int var25 = 0; var25 < var19; var25++) {
                        var23[var25] = (short) arg1.method3169(26488);
                        var24[var25] = arg1.method3128(32767);
                    }
                }
                if (field850[var15 - 1][arg2 - (field865 >> 6)][arg3 - (field866 >> 6)] == null) {
                    field850[var15 - 1][arg2 - (field865 >> 6)][arg3 - (field866 >> 6)] = new class383();
                }
                class277 var26 = new class277(arg4 & 0x3F, arg5 & 0x3F, var16, var17, var18, var23, var24);
                field850[var15 - 1][arg2 - (field865 >> 6)][arg3 - (field866 >> 6)].method2368(0, var26);
            }
        }
    }
}
