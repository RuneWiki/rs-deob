import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tga")
public class class64 {

    @OriginalMember(owner = "client!tga", name = "f", descriptor = "Lcja;")
    private static class46 field880 = new class46(16);

    @OriginalMember(owner = "client!tga", name = "l", descriptor = "I")
    public static int field886 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!tga", name = "m", descriptor = "[B")
    private static byte[] field887 = new byte[1];

    @OriginalMember(owner = "client!tga", name = "r", descriptor = "[S")
    private static short[] field892 = new short[1];

    @OriginalMember(owner = "client!tga", name = "s", descriptor = "I")
    public static int field893 = (int) (Math.random() * 11.0D) - 5;

    @OriginalMember(owner = "client!tga", name = "n", descriptor = "Ljia;")
    public static class645 field888 = new class645();

    @OriginalMember(owner = "client!tga", name = "p", descriptor = "F")
    public static float field890;

    @OriginalMember(owner = "client!tga", name = "q", descriptor = "F")
    public static float field891;

    @OriginalMember(owner = "client!tga", name = "k", descriptor = "I")
    public static int field885;

    @OriginalMember(owner = "client!tga", name = "t", descriptor = "I")
    public static int field894;

    @OriginalMember(owner = "client!tga", name = "u", descriptor = "I")
    public static int field895;

    @OriginalMember(owner = "client!tga", name = "v", descriptor = "I")
    public static int field896;

    @OriginalMember(owner = "client!tga", name = "x", descriptor = "I")
    public static int field898;

    @OriginalMember(owner = "client!tga", name = "A", descriptor = "I")
    public static int field901;

    @OriginalMember(owner = "client!tga", name = "G", descriptor = "I")
    public static int field907;

    @OriginalMember(owner = "client!tga", name = "H", descriptor = "I")
    public static int field908;

    @OriginalMember(owner = "client!tga", name = "J", descriptor = "I")
    public static int field910;

    @OriginalMember(owner = "client!tga", name = "K", descriptor = "I")
    public static int field911;

    @OriginalMember(owner = "client!tga", name = "L", descriptor = "I")
    public static int field912;

    @OriginalMember(owner = "client!tga", name = "N", descriptor = "I")
    public static int field914;

    @OriginalMember(owner = "client!tga", name = "O", descriptor = "I")
    public static int field915;

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "Ljf;")
    public static class229 field875;

    @OriginalMember(owner = "client!tga", name = "i", descriptor = "Lfda;")
    public static class340 field883;

    @OriginalMember(owner = "client!tga", name = "d", descriptor = "Lvh;")
    public static class381 field878;

    @OriginalMember(owner = "client!tga", name = "b", descriptor = "Lud;")
    private static class39 field876;

    @OriginalMember(owner = "client!tga", name = "e", descriptor = "Lbe;")
    private static class41 field879;

    @OriginalMember(owner = "client!tga", name = "I", descriptor = "Lcja;")
    private static class46 field909;

    @OriginalMember(owner = "client!tga", name = "c", descriptor = "Lgj;")
    public static class662 field877;

    @OriginalMember(owner = "client!tga", name = "j", descriptor = "Lfh;")
    public static class678 field884;

    @OriginalMember(owner = "client!tga", name = "g", descriptor = "Llw;")
    public static class688 field881;

    @OriginalMember(owner = "client!tga", name = "h", descriptor = "Lsea;")
    public static class726 field882;

    @OriginalMember(owner = "client!tga", name = "w", descriptor = "[B")
    private static byte[] field897;

    @OriginalMember(owner = "client!tga", name = "z", descriptor = "[B")
    private static byte[] field900;

    @OriginalMember(owner = "client!tga", name = "B", descriptor = "[B")
    private static byte[] field902;

    @OriginalMember(owner = "client!tga", name = "C", descriptor = "[B")
    private static byte[] field903;

    @OriginalMember(owner = "client!tga", name = "M", descriptor = "[B")
    private static byte[] field913;

    @OriginalMember(owner = "client!tga", name = "D", descriptor = "[I")
    private static int[] field904;

    @OriginalMember(owner = "client!tga", name = "y", descriptor = "[S")
    private static short[] field899;

    @OriginalMember(owner = "client!tga", name = "E", descriptor = "[S")
    private static short[] field905;

    @OriginalMember(owner = "client!tga", name = "o", descriptor = "[[[B")
    public static byte[][][] field889;

    @OriginalMember(owner = "client!tga", name = "F", descriptor = "[[[Lem;")
    private static class239[][][] field906;

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(Lha;Lfca;IIII[I[I)V", line = 4)
    private static final void method437(class66 arg0, class93 arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7) {
        int var8 = arg1.method793((byte) 79);
        if ((var8 & 0x1) == 0) {
            boolean var9 = (var8 & 0x2) == 0;
            int var10 = var8 >> 2 & 0x3F;
            if (var10 != 62) {
                int var11;
                if (var10 == 63) {
                    var11 = arg1.method793((byte) 124);
                } else if (var9) {
                    var11 = arg6[var10];
                } else {
                    var11 = arg7[var10];
                }
                if (var9) {
                    field903[field901 * arg5 + arg4] = (byte) var11;
                    field913[field901 * arg5 + arg4] = 0;
                } else {
                    field913[field901 * arg5 + arg4] = (byte) var11;
                    field897[field901 * arg5 + arg4] = 0;
                    field903[field901 * arg5 + arg4] = arg1.method766((byte) 122);
                }
            }
            return;
        }
        int var12 = (var8 >> 1 & 0x3) + 1;
        boolean var13 = (var8 & 0x8) != 0;
        boolean var14 = (var8 & 0x10) != 0;
        for (int var15 = 0; var15 < var12; var15++) {
            int var16 = arg1.method793((byte) 100);
            int var17 = 0;
            int var18 = 0;
            if (var13) {
                var17 = arg1.method793((byte) 83);
                var18 = arg1.method793((byte) 66);
            }
            int var19 = 0;
            if (var14) {
                var19 = arg1.method793((byte) 119);
            }
            if (var15 == 0) {
                field903[field901 * arg5 + arg4] = (byte) var16;
                field913[field901 * arg5 + arg4] = (byte) var17;
                field897[field901 * arg5 + arg4] = (byte) var18;
                if (var19 == 1) {
                    field899[field901 * arg5 + arg4] = (short) (arg1.method763(85) + 1);
                    field902[field901 * arg5 + arg4] = arg1.method766((byte) 122);
                } else if (var19 > 1) {
                    field899[field901 * arg5 + arg4] = -1;
                    short[] var20 = new short[var19];
                    byte[] var21 = new byte[var19];
                    for (int var22 = 0; var22 < var19; var22++) {
                        var20[var22] = (short) arg1.method763(104);
                        var21[var22] = arg1.method766((byte) 122);
                    }
                    field909.method341((long) (arg4 << 16 | arg5), new class669(var20, var21), (byte) 30);
                }
            } else {
                short[] var23 = null;
                byte[] var24 = null;
                if (var19 > 0) {
                    var23 = new short[var19];
                    var24 = new byte[var19];
                    for (int var25 = 0; var25 < var19; var25++) {
                        var23[var25] = (short) arg1.method763(-4);
                        var24[var25] = arg1.method766((byte) 122);
                    }
                }
                if (field906[var15 - 1][arg2 - (field907 >> 6)][arg3 - (field914 >> 6)] == null) {
                    field906[var15 - 1][arg2 - (field907 >> 6)][arg3 - (field914 >> 6)] = new class239();
                }
                class581 var26 = new class581(arg4 & 0x3F, arg5 & 0x3F, var16, var17, var18, var23, var24);
                field906[var15 - 1][arg2 - (field907 >> 6)][arg3 - (field914 >> 6)].method1600(var26, -3);
            }
        }
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(Lha;IIIIIII[S[BZ)V", line = 139)
    private static final void method438(class66 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, short[] arg8, byte[] arg9, boolean arg10) {
        if (arg10 || arg5 != 0 || arg6 > 0) {
            if (arg6 == 0) {
                arg0.method537(arg1, arg2, arg3, arg4, arg5, 0);
            } else {
                int var11 = arg7 & 0x3F;
                if (var11 == 0 || arg3 <= 1 || arg4 <= 1) {
                    int var13 = field904[arg6];
                    if (arg10 || var13 != 0) {
                        arg0.method537(arg1, arg2, arg3, arg4, var13, 0);
                    }
                } else {
                    int var12 = arg10 ? 0 : 1;
                    class546.method3070(-2993, arg3, field889, arg0, arg1, arg7 >> 6 & 0x3, arg4, var11, var12, field904[arg6], field885, arg5, arg2);
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
                class445 var18 = field878.method2319(arg8[var16] & 0xFFFF, false);
                if (var18.field6027 == -1) {
                    int var19 = -3355444;
                    if (var18.field6050 == 1) {
                        var19 = -3407872;
                    }
                    int var20 = arg9[var16] >> 6 & 0x3;
                    if (var17 == 0) {
                        if (var20 == 0) {
                            arg0.method551(arg1, arg2, arg4, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method591(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method551(var14, arg2, arg4, var19, 0);
                        } else {
                            arg0.method591(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 2) {
                        if (var20 == 0) {
                            arg0.method551(arg1, arg2, arg4, -1, 0);
                            arg0.method591(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method551(var14, arg2, arg4, -1, 0);
                            arg0.method591(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method551(var14, arg2, arg4, -1, 0);
                            arg0.method591(arg1, var15, arg3, var19, 0);
                        } else {
                            arg0.method551(arg1, arg2, arg4, -1, 0);
                            arg0.method591(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 3) {
                        if (var20 == 0) {
                            arg0.method591(arg1, arg2, 1, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method591(var14, arg2, 1, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method591(var14, var15, 1, var19, 0);
                        } else {
                            arg0.method591(arg1, var15, 1, var19, 0);
                        }
                    } else if (var17 == 9) {
                        if (var20 == 0 || var20 == 2) {
                            for (int var22 = 0; var22 < arg4; var22++) {
                                arg0.method591(arg1 + var22, var15 - var22, 1, var19, 0);
                            }
                        } else {
                            for (int var21 = 0; var21 < arg4; var21++) {
                                arg0.method591(arg1 + var21, arg2 + var21, 1, var19, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(Lgj;Lud;Lbe;Lvh;Lsea;Lfda;Llw;)V", line = 300)
    public static final void method439(class662 arg0, class39 arg1, class41 arg2, class381 arg3, class726 arg4, class340 arg5, class688 arg6) {
        field877 = arg0;
        field876 = arg1;
        field879 = arg2;
        field878 = arg3;
        field882 = arg4;
        field883 = arg5;
        field881 = arg6;
        field880.method338((byte) -96);
        int var7 = field877.method3738(-1, "details");
        int[] var8 = field877.method3740(16, var7);
        if (var8 != null) {
            for (int var9 = 0; var9 < var8.length; var9++) {
                class229 var10 = class579.method3334(var7, var8[var9], -27, field877);
                field880.method341((long) var10.field3330, var10, (byte) 70);
            }
        }
        class184.method1371(-2526, false, true);
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(Lha;IIII)Ljia;", line = 332)
    private static final class645 method440(class66 arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class508 var5 = (class508) field888.method3589((byte) -128); var5 != null; var5 = (class508) field888.method3591(0)) {
            method455(arg0, var5, arg1, arg2, arg3, arg4);
        }
        return field888;
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(Lha;II)V", line = 344)
    public static final void method441(class66 arg0, int arg1, int arg2) {
        class93 var3 = new class93(field877.method3726(-64, field875.field3344, "area"));
        int var4 = var3.method793((byte) 91);
        int[] var5 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var5[var6] = var3.method793((byte) 35);
        }
        int var7 = var3.method793((byte) 98);
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method793((byte) 97);
        }
        while (true) {
            while (var3.field1442 < var3.field1413.length) {
                if (var3.method793((byte) 43) == 0) {
                    int var22 = var3.method793((byte) 22);
                    int var23 = var3.method793((byte) 102);
                    for (int var24 = 0; var24 < 64; var24++) {
                        for (int var25 = 0; var25 < 64; var25++) {
                            int var26 = var22 * 64 + var24 - field907;
                            int var27 = var23 * 64 + var25 - field914;
                            method437(arg0, var3, var22, var23, var26, var27, var5, var8);
                        }
                    }
                } else {
                    int var28 = var3.method793((byte) 5);
                    int var29 = var3.method793((byte) 63);
                    int var30 = var3.method793((byte) 51);
                    int var31 = var3.method793((byte) 27);
                    for (int var32 = 0; var32 < 8; var32++) {
                        for (int var33 = 0; var33 < 8; var33++) {
                            int var34 = var28 * 64 + var30 * 8 + var32 - field907;
                            int var35 = var29 * 64 + var31 * 8 + var33 - field914;
                            method437(arg0, var3, var28, var29, var34, var35, var5, var8);
                        }
                    }
                }
            }
            Object var10 = null;
            field900 = new byte[field911 * field901];
            field905 = new short[field911 * field901];
            for (int var11 = 0; var11 < 3; var11++) {
                byte[] var12 = new byte[field911 * field901];
                for (int var13 = 0; var13 < field906[var11].length; var13++) {
                    for (int var19 = 0; var19 < field906[var11][0].length; var19++) {
                        class239 var20 = field906[var11][var13][var19];
                        if (var20 != null) {
                            for (class581 var21 = (class581) var20.method1597((byte) -86); var21 != null; var21 = (class581) var20.method1601(117)) {
                                var12[(var19 * 64 + var21.field8222) * field901 + var13 * 64 + var21.field8225] = (byte) var21.field8221;
                            }
                        }
                    }
                }
                method447(var12, field900, field905, arg1, arg2);
                for (int var14 = 0; var14 < field906[var11].length; var14++) {
                    for (int var15 = 0; var15 < field906[var11][0].length; var15++) {
                        class239 var16 = field906[var11][var14][var15];
                        if (var16 != null) {
                            for (class581 var17 = (class581) var16.method1597((byte) -108); var17 != null; var17 = (class581) var16.method1601(92)) {
                                int var18 = (var15 * 64 + var17.field8222) * field901 + var14 * 64 + var17.field8225;
                                var17.field8221 = (field900[var18] & 0xFF) << 16 | field905[var18] & 0xFFFF;
                                if (var17.field8221 != 0) {
                                    var17.field8221 |= 0xFF000000;
                                }
                            }
                        }
                    }
                }
            }
            method447(field903, field900, field905, arg1, arg2);
            field903 = null;
            method449();
            return;
        }
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(Lha;)Ljia;", line = 525)
    public static final class645 method442(class66 arg0) {
        int var1 = field910 - field895;
        int var2 = field896 - field915;
        int var3 = (field908 - field894 << 16) / var1;
        int var4 = (field912 - field898 << 16) / var2;
        return method440(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(Ld;III)I", line = 536)
    private static final int method443(class162 arg0, int arg1, int arg2, int arg3) {
        class184 var4 = field876.method238(arg1, false);
        if (var4 == null) {
            return 0;
        }
        int var5 = var4.field2865;
        if (var5 >= 0 && arg0.method1270(var5, true).field4244) {
            var5 = -1;
        }
        int var9;
        if (var4.field2853 >= 0) {
            int var6 = var4.field2853;
            int var7 = (var6 & 0x7F) + arg3;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 127) {
                var7 = 127;
            }
            int var8 = (arg2 + var6 & 0xFC00) + (var6 & 0x380) + var7;
            var9 = class624.field8692[class752.method4172(class181.method1357(var8, 96, false), 1474149255) & 0xFFFF] | 0xFF000000;
        } else if (var5 >= 0) {
            var9 = class624.field8692[class752.method4172(class181.method1357(arg0.method1270(var5, true).field4239, 96, false), 1474149255) & 0xFFFF] | 0xFF000000;
        } else if (var4.field2858 == -1) {
            var9 = 0;
        } else {
            int var10 = var4.field2858;
            int var11 = (var10 & 0x7F) + arg3;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 127) {
                var11 = 127;
            }
            int var12 = (arg2 + var10 & 0xFC00) + (var10 & 0x380) + var11;
            var9 = class624.field8692[class752.method4172(class181.method1357(var12, 96, false), 1474149255) & 0xFFFF] | 0xFF000000;
        }
        return var9;
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(I)Ljf;", line = 593)
    public static final class229 method444(int arg0) {
        return (class229) field880.method337((long) arg0, 1);
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "()V", line = 596)
    public static final void method445() {
        field903 = null;
        field900 = null;
        field905 = null;
        field913 = null;
        field897 = null;
        field899 = null;
        field902 = null;
        field909 = null;
        field906 = null;
        field904 = null;
    }

    @OriginalMember(owner = "client!tga", name = "b", descriptor = "(Lha;)V", line = 610)
    public static final void method446(class66 arg0) {
        int var1 = field910 - field895;
        int var2 = field896 - field915;
        int var3 = (field908 - field894 << 16) / var1;
        int var4 = (field912 - field898 << 16) / var2;
        method457(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "([B[B[SII)V", line = 622)
    private static final void method447(byte[] arg0, byte[] arg1, short[] arg2, int arg3, int arg4) {
        int[] var5 = new int[field911];
        int[] var6 = new int[field911];
        int[] var7 = new int[field911];
        int[] var8 = new int[field911];
        int[] var9 = new int[field911];
        for (int var10 = -5; var10 < field901; var10++) {
            int var11 = var10 + 5;
            int var12 = var10 - 5;
            for (int var13 = 0; var13 < field911; var13++) {
                int var10002;
                if (var11 < field901) {
                    int var28 = arg0[field901 * var13 + var11] & 0xFF;
                    if (var28 > 0) {
                        class153 var29 = field879.method249(99, var28 - 1);
                        var5[var13] += var29.field2511;
                        var6[var13] += var29.field2520;
                        var7[var13] += var29.field2513;
                        var8[var13] += var29.field2510;
                        var10002 = var9[var13]++;
                    }
                }
                if (var12 >= 0) {
                    int var30 = arg0[field901 * var13 + var12] & 0xFF;
                    if (var30 > 0) {
                        class153 var31 = field879.method249(57, var30 - 1);
                        var5[var13] -= var31.field2511;
                        var6[var13] -= var31.field2520;
                        var7[var13] -= var31.field2513;
                        var8[var13] -= var31.field2510;
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
                for (int var19 = -5; var19 < field911; var19++) {
                    int var20 = var19 + 5;
                    if (var20 < field911) {
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
                        if ((arg0[field901 * var19 + var10] & 0xFF) == 0) {
                            int var22 = field901 * var19 + var10;
                            arg1[var22] = 0;
                            arg2[var22] = 0;
                        } else {
                            int var23 = var17 == 0 ? 0 : class276.method1780(-127, var15 / var18, var16 / var18, var14 * 256 / var17);
                            int var24 = (var23 & 0x7F) + arg4;
                            if (var24 < 0) {
                                var24 = 0;
                            } else if (var24 > 127) {
                                var24 = 127;
                            }
                            int var25 = (arg3 + var23 & 0xFC00) + (var23 & 0x380) + var24;
                            int var26 = field901 * var19 + var10;
                            int var27 = class624.field8692[class752.method4172(class350.method2155((byte) 65, 96, var25), 1474149255) & 0xFFFF];
                            arg1[var26] = (byte) (var27 >> 16 & 0xFF);
                            arg2[var26] = (short) (var27 & 0xFFFF);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tga", name = "b", descriptor = "()V", line = 766)
    public static final void method448() {
        int[] var0 = new int[3];
        for (int var1 = 0; var1 < field884.field9442; var1++) {
            boolean var2 = field875.method1561(-29, field884.field9443[var1] & 0x3FFF, field884.field9443[var1] >> 14 & 0x3FFF, field884.field9443[var1] >> 28 & 0x3, var0);
            if (var2) {
                class508 var3 = new class508(field884.field9447[var1]);
                var3.field6978 = var0[1] - field907;
                var3.field6984 = var0[2] - field914;
                field888.method3594((byte) -34, var3);
            }
        }
    }

    @OriginalMember(owner = "client!tga", name = "c", descriptor = "()V", line = 790)
    private static final void method449() {
        for (int var0 = 0; var0 < field901; var0++) {
            for (int var11 = 0; var11 < field911; var11++) {
                int var12 = field899[field901 * var11 + var0] & 0xFFFF;
                if (var12 != 0) {
                    if (var12 == 65535) {
                        class669 var13 = (class669) field909.method337((long) (var0 << 16 | var11), 1);
                        if (var13 != null) {
                            for (int var14 = 0; var14 < var13.field9305.length; var14++) {
                                class445 var15 = field878.method2319(var13.field9305[var14] & 0xFFFF, false);
                                int var16 = var15.field6120;
                                if (var15.field6028 != null) {
                                    class445 var17 = var15.method2580(51, field881);
                                    if (var17 != null) {
                                        var16 = var17.field6120;
                                    }
                                }
                                if (var16 != -1) {
                                    class508 var18 = new class508(var16);
                                    var18.field6978 = var0;
                                    var18.field6984 = var11;
                                    field888.method3594((byte) 122, var18);
                                }
                            }
                        }
                    } else {
                        class445 var19 = field878.method2319(var12 - 1, false);
                        int var20 = var19.field6120;
                        if (var19.field6028 != null) {
                            class445 var21 = var19.method2580(77, field881);
                            if (var21 != null) {
                                var20 = var21.field6120;
                            }
                        }
                        if (var20 != -1) {
                            class508 var22 = new class508(var20);
                            var22.field6978 = var0;
                            var22.field6984 = var11;
                            field888.method3594((byte) 104, var22);
                        }
                    }
                }
            }
        }
        for (int var1 = 0; var1 < 3; var1++) {
            for (int var2 = 0; var2 < field906[0].length; var2++) {
                for (int var3 = 0; var3 < field906[0][0].length; var3++) {
                    class239 var4 = field906[var1][var2][var3];
                    if (var4 != null) {
                        for (class581 var5 = (class581) var4.method1597((byte) 115); var5 != null; var5 = (class581) var4.method1601(90)) {
                            if (var5.field8227 != null) {
                                for (int var6 = 0; var6 < var5.field8227.length; var6++) {
                                    class445 var7 = field878.method2319(var5.field8227[var6] & 0xFFFF, false);
                                    int var8 = var7.field6120;
                                    if (var7.field6028 != null) {
                                        class445 var9 = var7.method2580(24, field881);
                                        if (var9 != null) {
                                            var8 = var9.field6120;
                                        }
                                    }
                                    if (var8 != -1) {
                                        class508 var10 = new class508(var8);
                                        var10.field6978 = ((field907 >> 6) + var2) * 64 + var5.field8225 - field907;
                                        var10.field6984 = ((field914 >> 6) + var3) * 64 + var5.field8222 - field914;
                                        field888.method3594((byte) 120, var10);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(Lha;IIII[S[B)V", line = 946)
    private static final void method450(class66 arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        if (arg5 == null) {
            return;
        }
        for (int var7 = 0; var7 < arg5.length; var7++) {
            class445 var8 = field878.method2319(arg5[var7] & 0xFFFF, false);
            int var9 = var8.field6027;
            if (var9 != -1) {
                class6 var10 = field883.method2119(var9, (byte) 33);
                class604 var11 = var10.method44(arg0, 0, var8.field6099 ? var8.field6055 : false, var8.field6044 ? arg6[var7] >> 6 & 0x3 : 0);
                if (var11 != null) {
                    int var12 = arg3 * var11.method224() >> 2;
                    int var13 = arg4 * var11.method218() >> 2;
                    if (var10.field109) {
                        int var14 = var8.field6100;
                        int var15 = var8.field6053;
                        if ((arg6[var7] >> 6 & 0x1) == 1) {
                            int var16 = var14;
                            var14 = var15;
                            var15 = var16;
                        }
                        var12 = arg3 * var14;
                        var13 = arg4 * var15;
                    }
                    if (var12 != 0 && var13 != 0) {
                        if (var10.field115 == 0) {
                            var11.method3424(arg1, arg2 + arg4 - var13, var12, var13);
                        } else {
                            var11.method3433(arg1, arg2 + arg4 - var13, var12, var13, 0, var10.field115 | 0xFF000000, 1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(IIIIIIII)V", line = 1004)
    public static final void method451(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field895 = arg0 - field907;
        field896 = arg1 - field914;
        field910 = arg2 - field907;
        field915 = arg3 - field914;
        field894 = arg4;
        field898 = arg5;
        field908 = arg6;
        field912 = arg7;
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(Ld;II)V", line = 1016)
    public static final void method452(class162 arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < field876.field654; var3++) {
            field904[var3 + 1] = method443(arg0, var3, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(Lha;Lbi;Lgka;)V", line = 1025)
    public static final void method453(class66 arg0, class508 arg1, class393 arg2) {
        if (arg2.field5391 == null) {
            return;
        }
        int[] var3 = new int[arg2.field5391.length];
        for (int var4 = 0; var4 < var3.length / 2; var4++) {
            int var21 = arg2.field5391[var4 * 2] + arg1.field6978;
            int var22 = arg2.field5391[var4 * 2 + 1] + arg1.field6984;
            var3[var4 * 2] = (field908 - field894) * (var21 - field895) / (field910 - field895) + field894;
            var3[var4 * 2 + 1] = field912 - (var22 - field915) * (field912 - field898) / (field896 - field915);
        }
        class705.method3934(arg0, var3, arg2.field5415);
        if (arg2.field5421 > 0) {
            for (int var5 = 0; var5 < var3.length / 2 - 1; var5++) {
                int var13 = var3[var5 * 2];
                int var14 = var3[var5 * 2 + 1];
                int var15 = var3[(var5 + 1) * 2];
                int var16 = var3[(var5 + 1) * 2 + 1];
                if (var15 < var13) {
                    int var17 = var13;
                    int var18 = var14;
                    var13 = var15;
                    var14 = var16;
                    var15 = var17;
                    var16 = var18;
                } else if (var13 == var15 && var16 < var14) {
                    int var19 = var14;
                    var14 = var16;
                    var16 = var19;
                }
                arg0.method492(var13, var14, var15, var16, arg2.field5404[arg2.field5402[var5] & 0xFF], 1, arg2.field5421, arg2.field5434, arg2.field5399);
            }
            int var6 = var3[var3.length - 2];
            int var7 = var3[var3.length - 1];
            int var8 = var3[0];
            int var9 = var3[1];
            if (var8 < var6) {
                int var10 = var6;
                int var11 = var7;
                var6 = var8;
                var7 = var9;
                var8 = var10;
                var9 = var11;
            } else if (var6 == var8 && var9 < var7) {
                int var12 = var7;
                var7 = var9;
                var9 = var12;
            }
            arg0.method492(var6, var7, var8, var9, arg2.field5404[arg2.field5402[arg2.field5402.length - 1] & 0xFF], 1, arg2.field5421, arg2.field5434, arg2.field5399);
            return;
        }
        for (int var20 = 0; var20 < var3.length / 2 - 1; var20++) {
            arg0.method510(var3[(var20 + 1) * 2 + 1], var3[(var20 + 1) * 2], var3[var20 * 2 + 1], var3[var20 * 2], 96, arg2.field5404[arg2.field5402[var20] & 0xFF]);
        }
        arg0.method510(var3[1], var3[0], var3[var3.length - 1], var3[var3.length - 2], 73, arg2.field5404[arg2.field5402[arg2.field5402.length - 1] & 0xFF]);
    }

    @OriginalMember(owner = "client!tga", name = "b", descriptor = "(I)V", line = 1133)
    public static final void method454(int arg0) {
        field875 = (class229) field880.method337((long) arg0, 1);
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(Lha;Lbi;IIII)V", line = 1137)
    private static final void method455(class66 arg0, class508 arg1, int arg2, int arg3, int arg4, int arg5) {
        arg1.field6977 = ((arg1.field6978 - field895) * arg2 + arg4 >> 16) + field894;
        arg1.field6981 = field912 - ((arg1.field6984 - field915) * arg3 + arg5 >> 16);
    }

    @OriginalMember(owner = "client!tga", name = "d", descriptor = "()V", line = 1141)
    public static final void method456() {
        field903 = new byte[field911 * field901];
        field913 = new byte[field911 * field901];
        field897 = new byte[field911 * field901];
        field899 = new short[field911 * field901];
        field902 = new byte[field911 * field901];
        field909 = new class46(1024);
        field906 = new class239[3][field901 >> 6][field911 >> 6];
        field904 = new int[field876.field654 + 1];
    }

    @OriginalMember(owner = "client!tga", name = "b", descriptor = "(Lha;IIII)V", line = 1152)
    private static final void method457(class66 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = field910 - field895;
        int var6 = field896 - field915;
        if (field910 < field901) {
            var5++;
        }
        if (field896 < field911) {
            var6++;
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var49 = (arg1 * var7 + arg3 >> 16) + field894;
            int var50 = ((var7 + 1) * arg1 + arg3 >> 16) + field894;
            int var51 = var50 - var49;
            if (var51 > 0) {
                int var52 = field895 + var7;
                if (var52 >= 0 && var52 < field901) {
                    for (int var53 = 0; var53 < var6; var53++) {
                        int var54 = field912 - ((var53 + 1) * arg2 + arg4 >> 16);
                        int var55 = field912 - (arg2 * var53 + arg4 >> 16);
                        int var56 = var55 - var54;
                        if (var56 > 0) {
                            int var57 = field915 + var53;
                            int var58 = field901 * var57 + var52;
                            int var59 = 0;
                            int var60 = 0;
                            int var61 = 0;
                            if (var57 >= 0 && var57 < field911) {
                                var59 = (field900[var58] & 0xFF) << 16 | field905[var58] & 0xFFFF;
                                if (var59 != 0) {
                                    var59 |= 0xFF000000;
                                }
                                var60 = field913[var58] & 0xFF;
                                var61 = field899[var58] & 0xFFFF;
                            }
                            if (var59 == 0 && var60 == 0 && var61 == 0) {
                                int var62;
                                if (field875.field3343 != -1) {
                                    var62 = field875.field3343 | 0xFF000000;
                                } else if ((field896 + var53 & 0x4) == (field895 + var7 & 0x4)) {
                                    var62 = field904[field876.field656 + 1];
                                } else {
                                    var62 = -11840664;
                                }
                                if (var62 == 0) {
                                    var62 = -16777216;
                                }
                                arg0.method537(var49, var54, var51, var56, var62, 0);
                            } else if (var61 <= 0) {
                                method438(arg0, var49, var54, var51, var56, var59, var60, field897[var58], null, null, true);
                            } else if (var61 == 65535) {
                                class669 var63 = (class669) field909.method337((long) (var52 << 16 | var57), 1);
                                if (var63 != null) {
                                    method438(arg0, var49, var54, var51, var56, var59, var60, field897[var58], var63.field9305, var63.field9306, true);
                                }
                            } else {
                                field892[0] = (short) (var61 - 1);
                                field887[0] = field902[var58];
                                method438(arg0, var49, var54, var51, var56, var59, var60, field897[var58], field892, field887, true);
                            }
                        }
                    }
                } else {
                    for (int var64 = 0; var64 < var6; var64++) {
                        int var65 = field912 - ((var64 + 1) * arg2 + arg4 >> 16);
                        int var66 = field912 - (arg2 * var64 + arg4 >> 16);
                        int var67 = var66 - var65;
                        int var68;
                        if (field875.field3343 != -1) {
                            var68 = field875.field3343 | 0xFF000000;
                        } else if ((field896 + var64 & 0x4) == (field895 + var7 & 0x4)) {
                            var68 = field904[field876.field656 + 1];
                        } else {
                            var68 = -11840664;
                        }
                        if (var68 == 0) {
                            var68 = -16777216;
                        }
                        arg0.method537(var49, var65, var51, var67, var68, 0);
                    }
                }
            }
        }
        for (int var8 = -16; var8 < var5 + 16; var8++) {
            int var38 = (arg1 * var8 + arg3 >> 16) + field894;
            int var39 = ((var8 + 1) * arg1 + arg3 >> 16) + field894;
            int var40 = var39 - var38;
            if (var40 > 0) {
                int var41 = field895 + var8;
                if (var41 >= 0 && var41 < field901) {
                    for (int var42 = -16; var42 < var6 + 16; var42++) {
                        int var43 = field912 - ((var42 + 1) * arg2 + arg4 >> 16);
                        int var44 = field912 - (arg2 * var42 + arg4 >> 16);
                        int var45 = var44 - var43;
                        if (var45 > 0) {
                            int var46 = field915 + var42;
                            if (var46 >= 0 && var46 < field911) {
                                int var47 = field899[field901 * var46 + var41] & 0xFFFF;
                                if (var47 <= 0) {
                                    method450(arg0, var38, var43, var40, var45, null, null);
                                } else if (var47 == 65535) {
                                    class669 var48 = (class669) field909.method337((long) (var41 << 16 | var46), 1);
                                    if (var48 != null) {
                                        method450(arg0, var38, var43, var40, var45, var48.field9305, var48.field9306);
                                    }
                                } else {
                                    field892[0] = (short) (var47 - 1);
                                    field887[0] = field902[field901 * var46 + var41];
                                    method450(arg0, var38, var43, var40, var45, field892, field887);
                                }
                            }
                        }
                    }
                }
            }
        }
        int var9 = field895 >> 6;
        int var10 = field915 >> 6;
        if (var9 < 0) {
            var9 = 0;
        }
        if (var10 < 0) {
            var10 = 0;
        }
        int var11 = field910 >> 6;
        int var12 = field896 >> 6;
        if (var11 >= field906[0].length) {
            var11 = field906[0].length - 1;
        }
        if (var12 >= field906[0][0].length) {
            var12 = field906[0][0].length - 1;
        }
        for (int var13 = 0; var13 < 3; var13++) {
            for (int var14 = var9; var14 <= var11; var14++) {
                for (int var27 = var10; var27 <= var12; var27++) {
                    class239 var28 = field906[var13][var14][var27];
                    if (var28 != null) {
                        int var29 = ((field907 >> 6) + var14) * 64;
                        int var30 = ((field914 >> 6) + var27) * 64;
                        for (class581 var31 = (class581) var28.method1597((byte) -74); var31 != null; var31 = (class581) var28.method1601(79)) {
                            int var32 = var31.field8225 + var29 - field907 - field895;
                            int var33 = var31.field8222 + var30 - field914 - field915;
                            int var34 = (arg1 * var32 + arg3 >> 16) + field894;
                            int var35 = ((var32 + 1) * arg1 + arg3 >> 16) + field894;
                            int var36 = field912 - ((var33 + 1) * arg2 + arg4 >> 16);
                            int var37 = field912 - (arg2 * var33 + arg4 >> 16);
                            method438(arg0, var34, var36, var35 - var34, var37 - var36, var31.field8221, var31.field8226 & 0xFF, var31.field8224, var31.field8227, var31.field8223, false);
                        }
                    }
                }
            }
            for (int var15 = var9; var15 <= var11; var15++) {
                for (int var16 = var10; var16 <= var12; var16++) {
                    class239 var17 = field906[var13][var15][var16];
                    if (var17 != null) {
                        int var18 = ((field907 >> 6) + var15) * 64;
                        int var19 = ((field914 >> 6) + var16) * 64;
                        for (class581 var20 = (class581) var17.method1597((byte) 64); var20 != null; var20 = (class581) var17.method1601(121)) {
                            int var21 = var20.field8225 + var18 - field907 - field895;
                            int var22 = var20.field8222 + var19 - field914 - field915;
                            int var23 = (arg1 * var21 + arg3 >> 16) + field894;
                            int var24 = ((var21 + 1) * arg1 + arg3 >> 16) + field894;
                            int var25 = field912 - ((var22 + 1) * arg2 + arg4 >> 16);
                            int var26 = field912 - (arg2 * var22 + arg4 >> 16);
                            method450(arg0, var23, var25, var24 - var23, var26 - var25, var20.field8227, var20.field8223);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(II)Loaa;", line = 1500)
    public static final class305 method458(int arg0, int arg1) {
        class305 var2 = new class305();
        for (class229 var3 = (class229) field880.method335(-29067); var3 != null; var3 = (class229) field880.method336(105)) {
            if (var3.field3342 && var3.method1563(arg1, arg0, (byte) 7)) {
                var2.method1953((byte) 83, var3);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!tga", name = "e", descriptor = "()V", line = 1516)
    public static void method459() {
        field876 = null;
        field879 = null;
        field878 = null;
        field882 = null;
        field883 = null;
        field881 = null;
        field875 = null;
        field877 = null;
        field880 = null;
        field889 = null;
        field892 = null;
        field887 = null;
        field884 = null;
        field888 = null;
        field904 = null;
        field903 = null;
        field900 = null;
        field905 = null;
        field913 = null;
        field897 = null;
        field899 = null;
        field902 = null;
        field909 = null;
        field906 = null;
    }

    @OriginalMember(owner = "client!tga", name = "b", descriptor = "(II)Ljf;", line = 1545)
    public static final class229 method460(int arg0, int arg1) {
        for (class229 var2 = (class229) field880.method335(-29067); var2 != null; var2 = (class229) field880.method336(108)) {
            if (var2.field3342 && var2.method1563(arg1, arg0, (byte) 7)) {
                return var2;
            }
        }
        return null;
    }
}
