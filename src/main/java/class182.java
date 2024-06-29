import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cea")
public class class182 {

    @OriginalMember(owner = "client!cea", name = "c", descriptor = "Lsd;")
    private static class80 field2244 = new class80(16);

    @OriginalMember(owner = "client!cea", name = "l", descriptor = "[B")
    private static byte[] field2253 = new byte[1];

    @OriginalMember(owner = "client!cea", name = "p", descriptor = "[S")
    private static short[] field2257 = new short[1];

    @OriginalMember(owner = "client!cea", name = "n", descriptor = "I")
    public static int field2255 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!cea", name = "s", descriptor = "I")
    public static int field2260 = (int) (Math.random() * 11.0D) - 5;

    @OriginalMember(owner = "client!cea", name = "q", descriptor = "Leea;")
    public static class114 field2258 = new class114();

    @OriginalMember(owner = "client!cea", name = "k", descriptor = "F")
    public static float field2252;

    @OriginalMember(owner = "client!cea", name = "r", descriptor = "F")
    public static float field2259;

    @OriginalMember(owner = "client!cea", name = "m", descriptor = "I")
    public static int field2254;

    @OriginalMember(owner = "client!cea", name = "t", descriptor = "I")
    public static int field2261;

    @OriginalMember(owner = "client!cea", name = "v", descriptor = "I")
    public static int field2263;

    @OriginalMember(owner = "client!cea", name = "z", descriptor = "I")
    public static int field2267;

    @OriginalMember(owner = "client!cea", name = "A", descriptor = "I")
    public static int field2268;

    @OriginalMember(owner = "client!cea", name = "C", descriptor = "I")
    public static int field2270;

    @OriginalMember(owner = "client!cea", name = "E", descriptor = "I")
    public static int field2272;

    @OriginalMember(owner = "client!cea", name = "F", descriptor = "I")
    public static int field2273;

    @OriginalMember(owner = "client!cea", name = "H", descriptor = "I")
    public static int field2275;

    @OriginalMember(owner = "client!cea", name = "I", descriptor = "I")
    public static int field2276;

    @OriginalMember(owner = "client!cea", name = "J", descriptor = "I")
    public static int field2277;

    @OriginalMember(owner = "client!cea", name = "L", descriptor = "I")
    public static int field2279;

    @OriginalMember(owner = "client!cea", name = "N", descriptor = "I")
    public static int field2281;

    @OriginalMember(owner = "client!cea", name = "j", descriptor = "Lfaa;")
    public static class136 field2251;

    @OriginalMember(owner = "client!cea", name = "g", descriptor = "Ln;")
    public static class16 field2248;

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "Lik;")
    public static class178 field2242;

    @OriginalMember(owner = "client!cea", name = "f", descriptor = "Lkea;")
    public static class203 field2247;

    @OriginalMember(owner = "client!cea", name = "b", descriptor = "Lup;")
    public static class233 field2243;

    @OriginalMember(owner = "client!cea", name = "i", descriptor = "Ldj;")
    public static class291 field2250;

    @OriginalMember(owner = "client!cea", name = "e", descriptor = "Lpp;")
    private static class333 field2246;

    @OriginalMember(owner = "client!cea", name = "d", descriptor = "Lsp;")
    public static class552 field2245;

    @OriginalMember(owner = "client!cea", name = "h", descriptor = "Ldba;")
    private static class79 field2249;

    @OriginalMember(owner = "client!cea", name = "D", descriptor = "Lsd;")
    private static class80 field2271;

    @OriginalMember(owner = "client!cea", name = "u", descriptor = "[B")
    private static byte[] field2262;

    @OriginalMember(owner = "client!cea", name = "y", descriptor = "[B")
    private static byte[] field2266;

    @OriginalMember(owner = "client!cea", name = "B", descriptor = "[B")
    private static byte[] field2269;

    @OriginalMember(owner = "client!cea", name = "G", descriptor = "[B")
    private static byte[] field2274;

    @OriginalMember(owner = "client!cea", name = "K", descriptor = "[B")
    private static byte[] field2278;

    @OriginalMember(owner = "client!cea", name = "w", descriptor = "[I")
    private static int[] field2264;

    @OriginalMember(owner = "client!cea", name = "M", descriptor = "[S")
    private static short[] field2280;

    @OriginalMember(owner = "client!cea", name = "O", descriptor = "[S")
    private static short[] field2282;

    @OriginalMember(owner = "client!cea", name = "o", descriptor = "[[[B")
    public static byte[][][] field2256;

    @OriginalMember(owner = "client!cea", name = "x", descriptor = "[[[Lfh;")
    private static class567[][][] field2265;

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "()V")
    public static final void method1047() {
        field2266 = new byte[field2279 * field2261];
        field2262 = new byte[field2279 * field2261];
        field2278 = new byte[field2279 * field2261];
        field2280 = new short[field2279 * field2261];
        field2274 = new byte[field2279 * field2261];
        field2271 = new class80(1024);
        field2265 = new class567[3][field2261 >> 6][field2279 >> 6];
        field2264 = new int[field2246.field4791 + 1];
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(Loa;IIII[S[B)V")
    private static final void method1048(class605 arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        if (arg5 == null) {
            return;
        }
        for (int var7 = 0; var7 < arg5.length; var7++) {
            class385 var8 = field2243.method1499(-7532, arg5[var7] & 0xFFFF);
            int var9 = var8.field5850;
            if (var9 != -1) {
                class565 var10 = field2248.method108((byte) 115, var9);
                class433 var11 = var10.method3271(var8.field5878 ? var8.field5797 : false, arg0, var8.field5813 ? arg6[var7] >> 6 & 0x3 : 0, 0);
                if (var11 != null) {
                    int var12 = arg3 * var11.method1577() >> 2;
                    int var13 = arg4 * var11.method1568() >> 2;
                    if (var10.field8052) {
                        int var14 = var8.field5860;
                        int var15 = var8.field5858;
                        if ((arg6[var7] >> 6 & 0x1) == 1) {
                            int var16 = var14;
                            var14 = var15;
                            var15 = var16;
                        }
                        var12 = arg3 * var14;
                        var13 = arg4 * var15;
                    }
                    if (var12 != 0 && var13 != 0) {
                        if (var10.field8058 == 0) {
                            var11.method2700(arg1, arg2 + arg4 - var13, var12, var13);
                        } else {
                            var11.method1582(arg1, arg2 + arg4 - var13, var12, var13, 0, var10.field8058 | 0xFF000000, 1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(Loa;IIII)Leea;")
    private static final class114 method1049(class605 arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class480 var5 = (class480) field2258.method719(false); var5 != null; var5 = (class480) field2258.method716(14)) {
            method1050(arg0, var5, arg1, arg2, arg3, arg4);
        }
        return field2258;
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(Loa;Llq;IIII)V")
    private static final void method1050(class605 arg0, class480 arg1, int arg2, int arg3, int arg4, int arg5) {
        arg1.field7056 = ((arg1.field7059 - field2268) * arg2 + arg4 >> 16) + field2277;
        arg1.field7058 = field2263 - ((arg1.field7057 - field2275) * arg3 + arg5 >> 16);
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1051(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2268 = arg0 - field2273;
        field2281 = arg1 - field2267;
        field2272 = arg2 - field2273;
        field2275 = arg3 - field2267;
        field2277 = arg4;
        field2270 = arg5;
        field2276 = arg6;
        field2263 = arg7;
    }

    @OriginalMember(owner = "client!cea", name = "b", descriptor = "()V")
    public static final void method1052() {
        field2266 = null;
        field2269 = null;
        field2282 = null;
        field2262 = null;
        field2278 = null;
        field2280 = null;
        field2274 = null;
        field2271 = null;
        field2265 = null;
        field2264 = null;
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(II)Ldj;")
    public static final class291 method1053(int arg0, int arg1) {
        for (class291 var2 = (class291) field2244.method523(56); var2 != null; var2 = (class291) field2244.method530(12714)) {
            if (var2.field4036 && var2.method1878(arg0, (byte) -99, arg1)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!cea", name = "c", descriptor = "()V")
    public static void method1054() {
        field2246 = null;
        field2249 = null;
        field2243 = null;
        field2242 = null;
        field2248 = null;
        field2245 = null;
        field2250 = null;
        field2247 = null;
        field2244 = null;
        field2256 = null;
        field2257 = null;
        field2253 = null;
        field2251 = null;
        field2258 = null;
        field2264 = null;
        field2266 = null;
        field2269 = null;
        field2282 = null;
        field2262 = null;
        field2278 = null;
        field2280 = null;
        field2274 = null;
        field2271 = null;
        field2265 = null;
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "([B[B[SII)V")
    private static final void method1055(byte[] arg0, byte[] arg1, short[] arg2, int arg3, int arg4) {
        int[] var5 = new int[field2279];
        int[] var6 = new int[field2279];
        int[] var7 = new int[field2279];
        int[] var8 = new int[field2279];
        int[] var9 = new int[field2279];
        for (int var10 = -5; var10 < field2261; var10++) {
            int var11 = var10 + 5;
            int var12 = var10 - 5;
            for (int var13 = 0; var13 < field2279; var13++) {
                int var10002;
                if (var11 < field2261) {
                    int var28 = arg0[field2261 * var13 + var11] & 0xFF;
                    if (var28 > 0) {
                        class40 var29 = field2249.method516(var28 - 1, 60);
                        var5[var13] += var29.field439;
                        var6[var13] += var29.field432;
                        var7[var13] += var29.field438;
                        var8[var13] += var29.field444;
                        var10002 = var9[var13]++;
                    }
                }
                if (var12 >= 0) {
                    int var30 = arg0[field2261 * var13 + var12] & 0xFF;
                    if (var30 > 0) {
                        class40 var31 = field2249.method516(var30 - 1, -126);
                        var5[var13] -= var31.field439;
                        var6[var13] -= var31.field432;
                        var7[var13] -= var31.field438;
                        var8[var13] -= var31.field444;
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
                for (int var19 = -5; var19 < field2279; var19++) {
                    int var20 = var19 + 5;
                    if (var20 < field2279) {
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
                        if ((arg0[field2261 * var19 + var10] & 0xFF) == 0) {
                            int var22 = field2261 * var19 + var10;
                            arg1[var22] = 0;
                            arg2[var22] = 0;
                        } else {
                            int var23 = var17 == 0 ? 0 : client.method1668((byte) -80, var14 * 256 / var17, var15 / var18, var16 / var18);
                            int var24 = (var23 & 0x7F) + arg4;
                            if (var24 < 0) {
                                var24 = 0;
                            } else if (var24 > 127) {
                                var24 = 127;
                            }
                            int var25 = (arg3 + var23 & 0xFC00) + (var23 & 0x380) + var24;
                            int var26 = field2261 * var19 + var10;
                            int var27 = class348.field4972[class26.method156(100, class132.method817(var25, 127, 96)) & 0xFFFF];
                            arg1[var26] = (byte) (var27 >> 16 & 0xFF);
                            arg2[var26] = (short) (var27 & 0xFFFF);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(Loa;II)V")
    public static final void method1056(class605 arg0, int arg1, int arg2) {
        class194 var3 = new class194(field2247.method1281((byte) -37, "area", field2250.field4039));
        int var4 = var3.method1177(255);
        int[] var5 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var5[var6] = var3.method1177(255);
        }
        int var7 = var3.method1177(255);
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method1177(255);
        }
        while (true) {
            while (var3.field2610 < var3.field2622.length) {
                if (var3.method1177(255) == 0) {
                    int var22 = var3.method1177(255);
                    int var23 = var3.method1177(255);
                    for (int var24 = 0; var24 < 64; var24++) {
                        for (int var25 = 0; var25 < 64; var25++) {
                            int var26 = var22 * 64 + var24 - field2273;
                            int var27 = var23 * 64 + var25 - field2267;
                            method1069(arg0, var3, var22, var23, var26, var27, var5, var8);
                        }
                    }
                } else {
                    int var28 = var3.method1177(255);
                    int var29 = var3.method1177(255);
                    int var30 = var3.method1177(255);
                    int var31 = var3.method1177(255);
                    for (int var32 = 0; var32 < 8; var32++) {
                        for (int var33 = 0; var33 < 8; var33++) {
                            int var34 = var28 * 64 + var30 * 8 + var32 - field2273;
                            int var35 = var29 * 64 + var31 * 8 + var33 - field2267;
                            method1069(arg0, var3, var28, var29, var34, var35, var5, var8);
                        }
                    }
                }
            }
            Object var10 = null;
            field2269 = new byte[field2279 * field2261];
            field2282 = new short[field2279 * field2261];
            for (int var11 = 0; var11 < 3; var11++) {
                byte[] var12 = new byte[field2279 * field2261];
                for (int var13 = 0; var13 < field2265[var11].length; var13++) {
                    for (int var19 = 0; var19 < field2265[var11][0].length; var19++) {
                        class567 var20 = field2265[var11][var13][var19];
                        if (var20 != null) {
                            for (class397 var21 = (class397) var20.method3297((byte) 95); var21 != null; var21 = (class397) var20.method3296((byte) -116)) {
                                var12[(var19 * 64 + var21.field6044) * field2261 + var13 * 64 + var21.field6042] = (byte) var21.field6041;
                            }
                        }
                    }
                }
                method1055(var12, field2269, field2282, arg1, arg2);
                for (int var14 = 0; var14 < field2265[var11].length; var14++) {
                    for (int var15 = 0; var15 < field2265[var11][0].length; var15++) {
                        class567 var16 = field2265[var11][var14][var15];
                        if (var16 != null) {
                            for (class397 var17 = (class397) var16.method3297((byte) 121); var17 != null; var17 = (class397) var16.method3296((byte) -120)) {
                                int var18 = (var15 * 64 + var17.field6044) * field2261 + var14 * 64 + var17.field6042;
                                var17.field6041 = (field2269[var18] & 0xFF) << 16 | field2282[var18] & 0xFFFF;
                                if (var17.field6041 != 0) {
                                    var17.field6041 |= 0xFF000000;
                                }
                            }
                        }
                    }
                }
            }
            method1055(field2266, field2269, field2282, arg1, arg2);
            field2266 = null;
            method1059();
            return;
        }
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(I)V")
    public static final void method1057(int arg0) {
        field2250 = (class291) field2244.method524((byte) 98, (long) arg0);
    }

    @OriginalMember(owner = "client!cea", name = "d", descriptor = "()V")
    public static final void method1058() {
        int[] var0 = new int[3];
        for (int var1 = 0; var1 < field2251.field1695; var1++) {
            boolean var2 = field2250.method1883(field2251.field1693[var1] & 0x3FFF, field2251.field1693[var1] >> 28 & 0x3, 0, field2251.field1693[var1] >> 14 & 0x3FFF, var0);
            if (var2) {
                class480 var3 = new class480(field2251.field1694[var1]);
                var3.field7059 = var0[1] - field2273;
                var3.field7057 = var0[2] - field2267;
                field2258.method706(var3, true);
            }
        }
    }

    @OriginalMember(owner = "client!cea", name = "e", descriptor = "()V")
    private static final void method1059() {
        for (int var0 = 0; var0 < field2261; var0++) {
            for (int var11 = 0; var11 < field2279; var11++) {
                int var12 = field2280[field2261 * var11 + var0] & 0xFFFF;
                if (var12 != 0) {
                    if (var12 == 65535) {
                        class303 var13 = (class303) field2271.method524((byte) 123, (long) (var0 << 16 | var11));
                        if (var13 != null) {
                            for (int var14 = 0; var14 < var13.field4468.length; var14++) {
                                class385 var15 = field2243.method1499(-7532, var13.field4468[var14] & 0xFFFF);
                                int var16 = var15.field5882;
                                if (var15.field5793 != null) {
                                    class385 var17 = var15.method2453(field2245, 0);
                                    if (var17 != null) {
                                        var16 = var17.field5882;
                                    }
                                }
                                if (var16 != -1) {
                                    class480 var18 = new class480(var16);
                                    var18.field7059 = var0;
                                    var18.field7057 = var11;
                                    field2258.method706(var18, true);
                                }
                            }
                        }
                    } else {
                        class385 var19 = field2243.method1499(-7532, var12 - 1);
                        int var20 = var19.field5882;
                        if (var19.field5793 != null) {
                            class385 var21 = var19.method2453(field2245, 0);
                            if (var21 != null) {
                                var20 = var21.field5882;
                            }
                        }
                        if (var20 != -1) {
                            class480 var22 = new class480(var20);
                            var22.field7059 = var0;
                            var22.field7057 = var11;
                            field2258.method706(var22, true);
                        }
                    }
                }
            }
        }
        for (int var1 = 0; var1 < 3; var1++) {
            for (int var2 = 0; var2 < field2265[0].length; var2++) {
                for (int var3 = 0; var3 < field2265[0][0].length; var3++) {
                    class567 var4 = field2265[var1][var2][var3];
                    if (var4 != null) {
                        for (class397 var5 = (class397) var4.method3297((byte) 124); var5 != null; var5 = (class397) var4.method3296((byte) -116)) {
                            if (var5.field6045 != null) {
                                for (int var6 = 0; var6 < var5.field6045.length; var6++) {
                                    class385 var7 = field2243.method1499(-7532, var5.field6045[var6] & 0xFFFF);
                                    int var8 = var7.field5882;
                                    if (var7.field5793 != null) {
                                        class385 var9 = var7.method2453(field2245, 0);
                                        if (var9 != null) {
                                            var8 = var9.field5882;
                                        }
                                    }
                                    if (var8 != -1) {
                                        class480 var10 = new class480(var8);
                                        var10.field7059 = ((field2273 >> 6) + var2) * 64 + var5.field6042 - field2273;
                                        var10.field7057 = ((field2267 >> 6) + var3) * 64 + var5.field6044 - field2267;
                                        field2258.method706(var10, true);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cea", name = "b", descriptor = "(II)Ltf;")
    public static final class248 method1060(int arg0, int arg1) {
        class248 var2 = new class248();
        for (class291 var3 = (class291) field2244.method523(-115); var3 != null; var3 = (class291) field2244.method530(12714)) {
            if (var3.field4036 && var3.method1878(arg0, (byte) -99, arg1)) {
                var2.method1646(103, var3);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(Lkea;Lpp;Ldba;Lup;Lik;Ln;Lsp;)V")
    public static final void method1061(class203 arg0, class333 arg1, class79 arg2, class233 arg3, class178 arg4, class16 arg5, class552 arg6) {
        field2247 = arg0;
        field2246 = arg1;
        field2249 = arg2;
        field2243 = arg3;
        field2242 = arg4;
        field2248 = arg5;
        field2245 = arg6;
        field2244.method528(-519011192);
        int var7 = field2247.method1283((byte) -128, "details");
        int[] var8 = field2247.method1285(var7, 92);
        if (var8 != null) {
            for (int var9 = 0; var9 < var8.length; var9++) {
                class291 var10 = class570.method3314(70, field2247, var8[var9], var7);
                field2244.method520((byte) -76, var10, (long) var10.field4025);
            }
        }
        class27.method157(false, true, (byte) 2);
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(Loa;)Leea;")
    public static final class114 method1062(class605 arg0) {
        int var1 = field2272 - field2268;
        int var2 = field2281 - field2275;
        int var3 = (field2276 - field2277 << 16) / var1;
        int var4 = (field2263 - field2270 << 16) / var2;
        return method1049(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!cea", name = "b", descriptor = "(Loa;IIII)V")
    private static final void method1063(class605 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = field2272 - field2268;
        int var6 = field2281 - field2275;
        if (field2272 < field2261) {
            var5++;
        }
        if (field2281 < field2279) {
            var6++;
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var49 = (arg1 * var7 + arg3 >> 16) + field2277;
            int var50 = ((var7 + 1) * arg1 + arg3 >> 16) + field2277;
            int var51 = var50 - var49;
            if (var51 > 0) {
                int var52 = field2268 + var7;
                if (var52 >= 0 && var52 < field2261) {
                    for (int var53 = 0; var53 < var6; var53++) {
                        int var54 = field2263 - ((var53 + 1) * arg2 + arg4 >> 16);
                        int var55 = field2263 - (arg2 * var53 + arg4 >> 16);
                        int var56 = var55 - var54;
                        if (var56 > 0) {
                            int var57 = field2275 + var53;
                            int var58 = field2261 * var57 + var52;
                            int var59 = 0;
                            int var60 = 0;
                            int var61 = 0;
                            if (var57 >= 0 && var57 < field2279) {
                                var59 = (field2269[var58] & 0xFF) << 16 | field2282[var58] & 0xFFFF;
                                if (var59 != 0) {
                                    var59 |= 0xFF000000;
                                }
                                var60 = field2262[var58] & 0xFF;
                                var61 = field2280[var58] & 0xFFFF;
                            }
                            if (var59 == 0 && var60 == 0 && var61 == 0) {
                                int var62;
                                if (field2250.field4037 != -1) {
                                    var62 = field2250.field4037 | 0xFF000000;
                                } else if ((field2281 + var53 & 0x4) == (field2268 + var7 & 0x4)) {
                                    var62 = field2264[field2246.field4795 + 1];
                                } else {
                                    var62 = -11840664;
                                }
                                if (var62 == 0) {
                                    var62 = -16777216;
                                }
                                arg0.method394(var49, var54, var51, var56, var62, 0);
                            } else if (var61 <= 0) {
                                method1065(arg0, var49, var54, var51, var56, var59, var60, field2278[var58], null, null, true);
                            } else if (var61 == 65535) {
                                class303 var63 = (class303) field2271.method524((byte) 83, (long) (var52 << 16 | var57));
                                if (var63 != null) {
                                    method1065(arg0, var49, var54, var51, var56, var59, var60, field2278[var58], var63.field4468, var63.field4467, true);
                                }
                            } else {
                                field2257[0] = (short) (var61 - 1);
                                field2253[0] = field2274[var58];
                                method1065(arg0, var49, var54, var51, var56, var59, var60, field2278[var58], field2257, field2253, true);
                            }
                        }
                    }
                } else {
                    for (int var64 = 0; var64 < var6; var64++) {
                        int var65 = field2263 - ((var64 + 1) * arg2 + arg4 >> 16);
                        int var66 = field2263 - (arg2 * var64 + arg4 >> 16);
                        int var67 = var66 - var65;
                        int var68;
                        if (field2250.field4037 != -1) {
                            var68 = field2250.field4037 | 0xFF000000;
                        } else if ((field2281 + var64 & 0x4) == (field2268 + var7 & 0x4)) {
                            var68 = field2264[field2246.field4795 + 1];
                        } else {
                            var68 = -11840664;
                        }
                        if (var68 == 0) {
                            var68 = -16777216;
                        }
                        arg0.method394(var49, var65, var51, var67, var68, 0);
                    }
                }
            }
        }
        for (int var8 = -16; var8 < var5 + 16; var8++) {
            int var38 = (arg1 * var8 + arg3 >> 16) + field2277;
            int var39 = ((var8 + 1) * arg1 + arg3 >> 16) + field2277;
            int var40 = var39 - var38;
            if (var40 > 0) {
                int var41 = field2268 + var8;
                if (var41 >= 0 && var41 < field2261) {
                    for (int var42 = -16; var42 < var6 + 16; var42++) {
                        int var43 = field2263 - ((var42 + 1) * arg2 + arg4 >> 16);
                        int var44 = field2263 - (arg2 * var42 + arg4 >> 16);
                        int var45 = var44 - var43;
                        if (var45 > 0) {
                            int var46 = field2275 + var42;
                            if (var46 >= 0 && var46 < field2279) {
                                int var47 = field2280[field2261 * var46 + var41] & 0xFFFF;
                                if (var47 <= 0) {
                                    method1048(arg0, var38, var43, var40, var45, null, null);
                                } else if (var47 == 65535) {
                                    class303 var48 = (class303) field2271.method524((byte) 101, (long) (var41 << 16 | var46));
                                    if (var48 != null) {
                                        method1048(arg0, var38, var43, var40, var45, var48.field4468, var48.field4467);
                                    }
                                } else {
                                    field2257[0] = (short) (var47 - 1);
                                    field2253[0] = field2274[field2261 * var46 + var41];
                                    method1048(arg0, var38, var43, var40, var45, field2257, field2253);
                                }
                            }
                        }
                    }
                }
            }
        }
        int var9 = field2268 >> 6;
        int var10 = field2275 >> 6;
        if (var9 < 0) {
            var9 = 0;
        }
        if (var10 < 0) {
            var10 = 0;
        }
        int var11 = field2272 >> 6;
        int var12 = field2281 >> 6;
        if (var11 >= field2265[0].length) {
            var11 = field2265[0].length - 1;
        }
        if (var12 >= field2265[0][0].length) {
            var12 = field2265[0][0].length - 1;
        }
        for (int var13 = 0; var13 < 3; var13++) {
            for (int var14 = var9; var14 <= var11; var14++) {
                for (int var27 = var10; var27 <= var12; var27++) {
                    class567 var28 = field2265[var13][var14][var27];
                    if (var28 != null) {
                        int var29 = ((field2273 >> 6) + var14) * 64;
                        int var30 = ((field2267 >> 6) + var27) * 64;
                        for (class397 var31 = (class397) var28.method3297((byte) 87); var31 != null; var31 = (class397) var28.method3296((byte) -107)) {
                            int var32 = var31.field6042 + var29 - field2273 - field2268;
                            int var33 = var31.field6044 + var30 - field2267 - field2275;
                            int var34 = (arg1 * var32 + arg3 >> 16) + field2277;
                            int var35 = ((var32 + 1) * arg1 + arg3 >> 16) + field2277;
                            int var36 = field2263 - ((var33 + 1) * arg2 + arg4 >> 16);
                            int var37 = field2263 - (arg2 * var33 + arg4 >> 16);
                            method1065(arg0, var34, var36, var35 - var34, var37 - var36, var31.field6041, var31.field6043 & 0xFF, var31.field6039, var31.field6045, var31.field6040, false);
                        }
                    }
                }
            }
            for (int var15 = var9; var15 <= var11; var15++) {
                for (int var16 = var10; var16 <= var12; var16++) {
                    class567 var17 = field2265[var13][var15][var16];
                    if (var17 != null) {
                        int var18 = ((field2273 >> 6) + var15) * 64;
                        int var19 = ((field2267 >> 6) + var16) * 64;
                        for (class397 var20 = (class397) var17.method3297((byte) 87); var20 != null; var20 = (class397) var17.method3296((byte) -125)) {
                            int var21 = var20.field6042 + var18 - field2273 - field2268;
                            int var22 = var20.field6044 + var19 - field2267 - field2275;
                            int var23 = (arg1 * var21 + arg3 >> 16) + field2277;
                            int var24 = ((var21 + 1) * arg1 + arg3 >> 16) + field2277;
                            int var25 = field2263 - ((var22 + 1) * arg2 + arg4 >> 16);
                            int var26 = field2263 - (arg2 * var22 + arg4 >> 16);
                            method1048(arg0, var23, var25, var24 - var23, var26 - var25, var20.field6045, var20.field6040);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(Le;II)V")
    public static final void method1064(class462 arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < field2246.field4791; var3++) {
            field2264[var3 + 1] = method1068(arg0, var3, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(Loa;IIIIIII[S[BZ)V")
    private static final void method1065(class605 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, short[] arg8, byte[] arg9, boolean arg10) {
        if (arg10 || arg5 != 0 || arg6 > 0) {
            if (arg6 == 0) {
                arg0.method394(arg1, arg2, arg3, arg4, arg5, 0);
            } else {
                int var11 = arg7 & 0x3F;
                if (var11 == 0 || arg3 <= 1 || arg4 <= 1) {
                    int var13 = field2264[arg6];
                    if (arg10 || var13 != 0) {
                        arg0.method394(arg1, arg2, arg3, arg4, var13, 0);
                    }
                } else {
                    int var12 = arg10 ? 0 : 1;
                    class142.method860(arg4, arg2, 8, var12, var11, arg0, arg7 >> 6 & 0x3, field2264[arg6], arg5, field2254, arg1, arg3, field2256);
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
                class385 var18 = field2243.method1499(-7532, arg8[var16] & 0xFFFF);
                if (var18.field5850 == -1) {
                    int var19 = -3355444;
                    if (var18.field5806 == 1) {
                        var19 = -3407872;
                    }
                    int var20 = arg9[var16] >> 6 & 0x3;
                    if (var17 == 0) {
                        if (var20 == 0) {
                            arg0.method384(arg1, arg2, arg4, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method306(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method384(var14, arg2, arg4, var19, 0);
                        } else {
                            arg0.method306(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 2) {
                        if (var20 == 0) {
                            arg0.method384(arg1, arg2, arg4, -1, 0);
                            arg0.method306(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method384(var14, arg2, arg4, -1, 0);
                            arg0.method306(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method384(var14, arg2, arg4, -1, 0);
                            arg0.method306(arg1, var15, arg3, var19, 0);
                        } else {
                            arg0.method384(arg1, arg2, arg4, -1, 0);
                            arg0.method306(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 3) {
                        if (var20 == 0) {
                            arg0.method306(arg1, arg2, 1, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method306(var14, arg2, 1, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method306(var14, var15, 1, var19, 0);
                        } else {
                            arg0.method306(arg1, var15, 1, var19, 0);
                        }
                    } else if (var17 == 9) {
                        if (var20 == 0 || var20 == 2) {
                            for (int var22 = 0; var22 < arg4; var22++) {
                                arg0.method306(arg1 + var22, var15 - var22, 1, var19, 0);
                            }
                        } else {
                            for (int var21 = 0; var21 < arg4; var21++) {
                                arg0.method306(arg1 + var21, arg2 + var21, 1, var19, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cea", name = "b", descriptor = "(Loa;)V")
    public static final void method1066(class605 arg0) {
        int var1 = field2272 - field2268;
        int var2 = field2281 - field2275;
        int var3 = (field2276 - field2277 << 16) / var1;
        int var4 = (field2263 - field2270 << 16) / var2;
        method1063(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!cea", name = "b", descriptor = "(I)Ldj;")
    public static final class291 method1067(int arg0) {
        return (class291) field2244.method524((byte) 83, (long) arg0);
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(Le;III)I")
    private static final int method1068(class462 arg0, int arg1, int arg2, int arg3) {
        class346 var4 = field2246.method2164(true, arg1);
        if (var4 == null) {
            return 0;
        }
        int var5 = var4.field4957;
        if (var5 >= 0 && arg0.method438(82, var5).field8928) {
            var5 = -1;
        }
        int var9;
        if (var4.field4962 >= 0) {
            int var6 = var4.field4962;
            int var7 = (var6 & 0x7F) + arg3;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 127) {
                var7 = 127;
            }
            int var8 = (arg2 + var6 & 0xFC00) + (var6 & 0x380) + var7;
            var9 = class348.field4972[class26.method156(107, class473.method2899(var8, true, 96)) & 0xFFFF] | 0xFF000000;
        } else if (var5 >= 0) {
            var9 = class348.field4972[class26.method156(122, class473.method2899(arg0.method438(48, var5).field8934, true, 96)) & 0xFFFF] | 0xFF000000;
        } else if (var4.field4961 == -1) {
            var9 = 0;
        } else {
            int var10 = var4.field4961;
            int var11 = (var10 & 0x7F) + arg3;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 127) {
                var11 = 127;
            }
            int var12 = (arg2 + var10 & 0xFC00) + (var10 & 0x380) + var11;
            var9 = class348.field4972[class26.method156(104, class473.method2899(var12, true, 96)) & 0xFFFF] | 0xFF000000;
        }
        return var9;
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(Loa;Lrt;IIII[I[I)V")
    private static final void method1069(class605 arg0, class194 arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7) {
        int var8 = arg1.method1177(255);
        if ((var8 & 0x1) == 0) {
            boolean var9 = (var8 & 0x2) == 0;
            int var10 = var8 >> 2 & 0x3F;
            if (var10 != 62) {
                int var11;
                if (var10 == 63) {
                    var11 = arg1.method1177(255);
                } else if (var9) {
                    var11 = arg6[var10];
                } else {
                    var11 = arg7[var10];
                }
                if (var9) {
                    field2266[field2261 * arg5 + arg4] = (byte) var11;
                    field2262[field2261 * arg5 + arg4] = 0;
                } else {
                    field2262[field2261 * arg5 + arg4] = (byte) var11;
                    field2278[field2261 * arg5 + arg4] = 0;
                    field2266[field2261 * arg5 + arg4] = arg1.method1213((byte) 122);
                }
            }
            return;
        }
        int var12 = (var8 >> 1 & 0x3) + 1;
        boolean var13 = (var8 & 0x8) != 0;
        boolean var14 = (var8 & 0x10) != 0;
        for (int var15 = 0; var15 < var12; var15++) {
            int var16 = arg1.method1177(255);
            int var17 = 0;
            int var18 = 0;
            if (var13) {
                var17 = arg1.method1177(255);
                var18 = arg1.method1177(255);
            }
            int var19 = 0;
            if (var14) {
                var19 = arg1.method1177(255);
            }
            if (var15 == 0) {
                field2266[field2261 * arg5 + arg4] = (byte) var16;
                field2262[field2261 * arg5 + arg4] = (byte) var17;
                field2278[field2261 * arg5 + arg4] = (byte) var18;
                if (var19 == 1) {
                    field2280[field2261 * arg5 + arg4] = (short) (arg1.method1220(127) + 1);
                    field2274[field2261 * arg5 + arg4] = arg1.method1213((byte) 75);
                } else if (var19 > 1) {
                    field2280[field2261 * arg5 + arg4] = -1;
                    short[] var20 = new short[var19];
                    byte[] var21 = new byte[var19];
                    for (int var22 = 0; var22 < var19; var22++) {
                        var20[var22] = (short) arg1.method1220(-10);
                        var21[var22] = arg1.method1213((byte) 55);
                    }
                    field2271.method520((byte) -56, new class303(var20, var21), (long) (arg4 << 16 | arg5));
                }
            } else {
                short[] var23 = null;
                byte[] var24 = null;
                if (var19 > 0) {
                    var23 = new short[var19];
                    var24 = new byte[var19];
                    for (int var25 = 0; var25 < var19; var25++) {
                        var23[var25] = (short) arg1.method1220(125);
                        var24[var25] = arg1.method1213((byte) 61);
                    }
                }
                if (field2265[var15 - 1][arg2 - (field2273 >> 6)][arg3 - (field2267 >> 6)] == null) {
                    field2265[var15 - 1][arg2 - (field2273 >> 6)][arg3 - (field2267 >> 6)] = new class567();
                }
                class397 var26 = new class397(arg4 & 0x3F, arg5 & 0x3F, var16, var17, var18, var23, var24);
                field2265[var15 - 1][arg2 - (field2273 >> 6)][arg3 - (field2267 >> 6)].method3293(var26, (byte) 121);
            }
        }
    }
}
