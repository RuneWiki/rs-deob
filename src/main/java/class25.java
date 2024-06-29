import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public class class25 {

    @OriginalMember(owner = "client!ir", name = "i", descriptor = "Lkea;")
    private static class213 field340 = new class213(16);

    @OriginalMember(owner = "client!ir", name = "m", descriptor = "[B")
    private static byte[] field344 = new byte[1];

    @OriginalMember(owner = "client!ir", name = "s", descriptor = "I")
    public static int field350 = (int) (Math.random() * 11.0D) - 5;

    @OriginalMember(owner = "client!ir", name = "r", descriptor = "I")
    public static int field349 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!ir", name = "q", descriptor = "[S")
    private static short[] field348 = new short[1];

    @OriginalMember(owner = "client!ir", name = "o", descriptor = "Lwba;")
    public static class46 field346 = new class46();

    @OriginalMember(owner = "client!ir", name = "j", descriptor = "F")
    public static float field341;

    @OriginalMember(owner = "client!ir", name = "l", descriptor = "F")
    public static float field343;

    @OriginalMember(owner = "client!ir", name = "n", descriptor = "I")
    public static int field345;

    @OriginalMember(owner = "client!ir", name = "v", descriptor = "I")
    public static int field353;

    @OriginalMember(owner = "client!ir", name = "w", descriptor = "I")
    public static int field354;

    @OriginalMember(owner = "client!ir", name = "z", descriptor = "I")
    public static int field357;

    @OriginalMember(owner = "client!ir", name = "B", descriptor = "I")
    public static int field359;

    @OriginalMember(owner = "client!ir", name = "C", descriptor = "I")
    public static int field360;

    @OriginalMember(owner = "client!ir", name = "F", descriptor = "I")
    public static int field363;

    @OriginalMember(owner = "client!ir", name = "H", descriptor = "I")
    public static int field365;

    @OriginalMember(owner = "client!ir", name = "I", descriptor = "I")
    public static int field366;

    @OriginalMember(owner = "client!ir", name = "J", descriptor = "I")
    public static int field367;

    @OriginalMember(owner = "client!ir", name = "K", descriptor = "I")
    public static int field368;

    @OriginalMember(owner = "client!ir", name = "M", descriptor = "I")
    public static int field370;

    @OriginalMember(owner = "client!ir", name = "N", descriptor = "I")
    public static int field371;

    @OriginalMember(owner = "client!ir", name = "h", descriptor = "Lqca;")
    public static class100 field339;

    @OriginalMember(owner = "client!ir", name = "G", descriptor = "Lkea;")
    private static class213 field364;

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "Ltu;")
    private static class316 field332;

    @OriginalMember(owner = "client!ir", name = "e", descriptor = "Loq;")
    public static class326 field336;

    @OriginalMember(owner = "client!ir", name = "c", descriptor = "Lka;")
    private static class435 field334;

    @OriginalMember(owner = "client!ir", name = "d", descriptor = "Leu;")
    public static class442 field335;

    @OriginalMember(owner = "client!ir", name = "g", descriptor = "Lqj;")
    public static class470 field338;

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "Lpu;")
    public static class522 field333;

    @OriginalMember(owner = "client!ir", name = "f", descriptor = "Lpf;")
    public static class539 field337;

    @OriginalMember(owner = "client!ir", name = "k", descriptor = "Lam;")
    public static class585 field342;

    @OriginalMember(owner = "client!ir", name = "u", descriptor = "[B")
    private static byte[] field352;

    @OriginalMember(owner = "client!ir", name = "x", descriptor = "[B")
    private static byte[] field355;

    @OriginalMember(owner = "client!ir", name = "D", descriptor = "[B")
    private static byte[] field361;

    @OriginalMember(owner = "client!ir", name = "E", descriptor = "[B")
    private static byte[] field362;

    @OriginalMember(owner = "client!ir", name = "O", descriptor = "[B")
    private static byte[] field372;

    @OriginalMember(owner = "client!ir", name = "t", descriptor = "[I")
    private static int[] field351;

    @OriginalMember(owner = "client!ir", name = "A", descriptor = "[S")
    private static short[] field358;

    @OriginalMember(owner = "client!ir", name = "L", descriptor = "[S")
    private static short[] field369;

    @OriginalMember(owner = "client!ir", name = "p", descriptor = "[[[B")
    public static byte[][][] field347;

    @OriginalMember(owner = "client!ir", name = "y", descriptor = "[[[Lli;")
    private static class392[][][] field356;

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(Lfa;III)I")
    private static final int method286(class209 arg0, int arg1, int arg2, int arg3) {
        class156 var4 = field334.method2586(-20216, arg1);
        if (var4 == null) {
            return 0;
        }
        int var5 = var4.field2244;
        if (var5 >= 0 && arg0.method1386(var5, -6514).field2305) {
            var5 = -1;
        }
        int var9;
        if (var4.field2248 >= 0) {
            int var6 = var4.field2248;
            int var7 = (var6 & 0x7F) + arg3;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 127) {
                var7 = 127;
            }
            int var8 = (arg2 + var6 & 0xFC00) + (var6 & 0x380) + var7;
            var9 = class689.field9703[class373.method2250((byte) 34, class361.method2202(96, var8, (byte) 61)) & 0xFFFF] | 0xFF000000;
        } else if (var5 >= 0) {
            var9 = class689.field9703[class373.method2250((byte) 58, class361.method2202(96, arg0.method1386(var5, -6514).field2283, (byte) 108)) & 0xFFFF] | 0xFF000000;
        } else if (var4.field2241 == -1) {
            var9 = 0;
        } else {
            int var10 = var4.field2241;
            int var11 = (var10 & 0x7F) + arg3;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 127) {
                var11 = 127;
            }
            int var12 = (arg2 + var10 & 0xFC00) + (var10 & 0x380) + var11;
            var9 = class689.field9703[class373.method2250((byte) 65, class361.method2202(96, var12, (byte) 68)) & 0xFFFF] | 0xFF000000;
        }
        return var9;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(Lr;Llt;IIII)V")
    private static final void method287(class166 arg0, class627 arg1, int arg2, int arg3, int arg4, int arg5) {
        arg1.field8773 = ((arg1.field8782 - field367) * arg2 + arg4 >> 16) + field357;
        arg1.field8779 = field368 - ((arg1.field8777 - field354) * arg3 + arg5 >> 16);
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "()V")
    public static final void method288() {
        int[] var0 = new int[3];
        for (int var1 = 0; var1 < field342.field8202; var1++) {
            boolean var2 = field336.method2054(field342.field8203[var1] >> 28 & 0x3, field342.field8203[var1] >> 14 & 0x3FFF, 0, field342.field8203[var1] & 0x3FFF, var0);
            if (var2) {
                class627 var3 = new class627(field342.field8200[var1]);
                var3.field8782 = var0[1] - field365;
                var3.field8777 = var0[2] - field366;
                field346.method474(var3, 6);
            }
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(Lpu;Lka;Ltu;Leu;Lqca;Lpf;Lqj;)V")
    public static final void method289(class522 arg0, class435 arg1, class316 arg2, class442 arg3, class100 arg4, class539 arg5, class470 arg6) {
        field333 = arg0;
        field334 = arg1;
        field332 = arg2;
        field335 = arg3;
        field339 = arg4;
        field337 = arg5;
        field338 = arg6;
        field340.method1409((byte) 119);
        int var7 = field333.method2980(-9104, "details");
        int[] var8 = field333.method3002(var7, 114);
        if (var8 != null) {
            for (int var9 = 0; var9 < var8.length; var9++) {
                class326 var10 = class24.method285(var8[var9], var7, field333, (byte) -104);
                field340.method1403((byte) -18, var10, (long) var10.field4830);
            }
        }
        class489.method2838(true, false, (byte) 58);
    }

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "()V")
    private static final void method290() {
        for (int var0 = 0; var0 < field359; var0++) {
            for (int var11 = 0; var11 < field360; var11++) {
                int var12 = field358[field359 * var11 + var0] & 0xFFFF;
                if (var12 != 0) {
                    if (var12 == 65535) {
                        class449 var13 = (class449) field364.method1405((long) (var0 << 16 | var11), (byte) -16);
                        if (var13 != null) {
                            for (int var14 = 0; var14 < var13.field6483.length; var14++) {
                                class550 var15 = field335.method2617((byte) -108, var13.field6483[var14] & 0xFFFF);
                                int var16 = var15.field7740;
                                if (var15.field7781 != null) {
                                    class550 var17 = var15.method3124((byte) 109, field338);
                                    if (var17 != null) {
                                        var16 = var17.field7740;
                                    }
                                }
                                if (var16 != -1) {
                                    class627 var18 = new class627(var16);
                                    var18.field8782 = var0;
                                    var18.field8777 = var11;
                                    field346.method474(var18, 6);
                                }
                            }
                        }
                    } else {
                        class550 var19 = field335.method2617((byte) -96, var12 - 1);
                        int var20 = var19.field7740;
                        if (var19.field7781 != null) {
                            class550 var21 = var19.method3124((byte) -109, field338);
                            if (var21 != null) {
                                var20 = var21.field7740;
                            }
                        }
                        if (var20 != -1) {
                            class627 var22 = new class627(var20);
                            var22.field8782 = var0;
                            var22.field8777 = var11;
                            field346.method474(var22, 6);
                        }
                    }
                }
            }
        }
        for (int var1 = 0; var1 < 3; var1++) {
            for (int var2 = 0; var2 < field356[0].length; var2++) {
                for (int var3 = 0; var3 < field356[0][0].length; var3++) {
                    class392 var4 = field356[var1][var2][var3];
                    if (var4 != null) {
                        for (class526 var5 = (class526) var4.method2417(false); var5 != null; var5 = (class526) var4.method2414(true)) {
                            if (var5.field7412 != null) {
                                for (int var6 = 0; var6 < var5.field7412.length; var6++) {
                                    class550 var7 = field335.method2617((byte) -93, var5.field7412[var6] & 0xFFFF);
                                    int var8 = var7.field7740;
                                    if (var7.field7781 != null) {
                                        class550 var9 = var7.method3124((byte) 59, field338);
                                        if (var9 != null) {
                                            var8 = var9.field7740;
                                        }
                                    }
                                    if (var8 != -1) {
                                        class627 var10 = new class627(var8);
                                        var10.field8782 = ((field365 >> 6) + var2) * 64 + var5.field7411 - field365;
                                        var10.field8777 = ((field366 >> 6) + var3) * 64 + var5.field7413 - field366;
                                        field346.method474(var10, 6);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(Lr;II)V")
    public static final void method291(class166 arg0, int arg1, int arg2) {
        class695 var3 = new class695(field333.method3009("area", field336.field4813, 0));
        int var4 = var3.method3826(false);
        int[] var5 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var5[var6] = var3.method3826(false);
        }
        int var7 = var3.method3826(false);
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method3826(false);
        }
        while (true) {
            while (var3.field9761 < var3.field9796.length) {
                if (var3.method3826(false) == 0) {
                    int var22 = var3.method3826(false);
                    int var23 = var3.method3826(false);
                    for (int var24 = 0; var24 < 64; var24++) {
                        for (int var25 = 0; var25 < 64; var25++) {
                            int var26 = var22 * 64 + var24 - field365;
                            int var27 = var23 * 64 + var25 - field366;
                            method303(arg0, var3, var22, var23, var26, var27, var5, var8);
                        }
                    }
                } else {
                    int var28 = var3.method3826(false);
                    int var29 = var3.method3826(false);
                    int var30 = var3.method3826(false);
                    int var31 = var3.method3826(false);
                    for (int var32 = 0; var32 < 8; var32++) {
                        for (int var33 = 0; var33 < 8; var33++) {
                            int var34 = var28 * 64 + var30 * 8 + var32 - field365;
                            int var35 = var29 * 64 + var31 * 8 + var33 - field366;
                            method303(arg0, var3, var28, var29, var34, var35, var5, var8);
                        }
                    }
                }
            }
            Object var10 = null;
            field352 = new byte[field360 * field359];
            field369 = new short[field360 * field359];
            for (int var11 = 0; var11 < 3; var11++) {
                byte[] var12 = new byte[field360 * field359];
                for (int var13 = 0; var13 < field356[var11].length; var13++) {
                    for (int var19 = 0; var19 < field356[var11][0].length; var19++) {
                        class392 var20 = field356[var11][var13][var19];
                        if (var20 != null) {
                            for (class526 var21 = (class526) var20.method2417(false); var21 != null; var21 = (class526) var20.method2414(true)) {
                                var12[(var19 * 64 + var21.field7413) * field359 + var13 * 64 + var21.field7411] = (byte) var21.field7414;
                            }
                        }
                    }
                }
                method300(var12, field352, field369, arg1, arg2);
                for (int var14 = 0; var14 < field356[var11].length; var14++) {
                    for (int var15 = 0; var15 < field356[var11][0].length; var15++) {
                        class392 var16 = field356[var11][var14][var15];
                        if (var16 != null) {
                            for (class526 var17 = (class526) var16.method2417(false); var17 != null; var17 = (class526) var16.method2414(true)) {
                                int var18 = (var15 * 64 + var17.field7413) * field359 + var14 * 64 + var17.field7411;
                                var17.field7414 = (field352[var18] & 0xFF) << 16 | field369[var18] & 0xFFFF;
                                if (var17.field7414 != 0) {
                                    var17.field7414 |= 0xFF000000;
                                }
                            }
                        }
                    }
                }
            }
            method300(field355, field352, field369, arg1, arg2);
            field355 = null;
            method290();
            return;
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(I)V")
    public static final void method292(int arg0) {
        field336 = (class326) field340.method1405((long) arg0, (byte) -17);
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(II)Lgm;")
    public static final class108 method293(int arg0, int arg1) {
        class108 var2 = new class108();
        for (class326 var3 = (class326) field340.method1407(53); var3 != null; var3 = (class326) field340.method1413(true)) {
            if (var3.field4821 && var3.method2056(arg1, true, arg0)) {
                var2.method852(true, var3);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(Lr;IIIIIII[S[BZ)V")
    private static final void method294(class166 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, short[] arg8, byte[] arg9, boolean arg10) {
        if (arg10 || arg5 != 0 || arg6 > 0) {
            if (arg6 == 0) {
                arg0.method114(arg1, arg2, arg3, arg4, arg5, 0);
            } else {
                int var11 = arg7 & 0x3F;
                if (var11 == 0 || arg3 <= 1 || arg4 <= 1) {
                    int var13 = field351[arg6];
                    if (arg10 || var13 != 0) {
                        arg0.method114(arg1, arg2, arg3, arg4, var13, 0);
                    }
                } else {
                    int var12 = arg10 ? 0 : 1;
                    class282.method1825(arg5, var12, field347, var11, field351[arg6], arg0, arg3, arg4, 72, field345, arg1, arg7 >> 6 & 0x3, arg2);
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
                class550 var18 = field335.method2617((byte) -98, arg8[var16] & 0xFFFF);
                if (var18.field7792 == -1) {
                    int var19 = -3355444;
                    if (var18.field7746 == 1) {
                        var19 = -3407872;
                    }
                    int var20 = arg9[var16] >> 6 & 0x3;
                    if (var17 == 0) {
                        if (var20 == 0) {
                            arg0.method103(arg1, arg2, arg4, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method202(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method103(var14, arg2, arg4, var19, 0);
                        } else {
                            arg0.method202(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 2) {
                        if (var20 == 0) {
                            arg0.method103(arg1, arg2, arg4, -1, 0);
                            arg0.method202(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method103(var14, arg2, arg4, -1, 0);
                            arg0.method202(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method103(var14, arg2, arg4, -1, 0);
                            arg0.method202(arg1, var15, arg3, var19, 0);
                        } else {
                            arg0.method103(arg1, arg2, arg4, -1, 0);
                            arg0.method202(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 3) {
                        if (var20 == 0) {
                            arg0.method202(arg1, arg2, 1, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method202(var14, arg2, 1, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method202(var14, var15, 1, var19, 0);
                        } else {
                            arg0.method202(arg1, var15, 1, var19, 0);
                        }
                    } else if (var17 == 9) {
                        if (var20 == 0 || var20 == 2) {
                            for (int var22 = 0; var22 < arg4; var22++) {
                                arg0.method202(arg1 + var22, var15 - var22, 1, var19, 0);
                            }
                        } else {
                            for (int var21 = 0; var21 < arg4; var21++) {
                                arg0.method202(arg1 + var21, arg2 + var21, 1, var19, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(Lr;IIII[S[B)V")
    private static final void method295(class166 arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        if (arg5 == null) {
            return;
        }
        for (int var7 = 0; var7 < arg5.length; var7++) {
            class550 var8 = field335.method2617((byte) -111, arg5[var7] & 0xFFFF);
            int var9 = var8.field7792;
            if (var9 != -1) {
                class563 var10 = field337.method3064((byte) 120, var9);
                class702 var11 = var10.method3218(-18081, var8.field7774 ? arg6[var7] >> 6 & 0x3 : 0, var8.field7789 ? var8.field7785 : false, arg0);
                if (var11 != null) {
                    int var12 = arg3 * var11.method931() >> 2;
                    int var13 = arg4 * var11.method936() >> 2;
                    if (var10.field7919) {
                        int var14 = var8.field7752;
                        int var15 = var8.field7733;
                        if ((arg6[var7] >> 6 & 0x1) == 1) {
                            int var16 = var14;
                            var14 = var15;
                            var15 = var16;
                        }
                        var12 = arg3 * var14;
                        var13 = arg4 * var15;
                    }
                    if (var12 != 0 && var13 != 0) {
                        if (var10.field7924 == 0) {
                            var11.method3908(arg1, arg2 + arg4 - var13, var12, var13);
                        } else {
                            var11.method3909(arg1, arg2 + arg4 - var13, var12, var13, 0, var10.field7924 | 0xFF000000, 1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "(I)Loq;")
    public static final class326 method296(int arg0) {
        return (class326) field340.method1405((long) arg0, (byte) -109);
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(Lr;IIII)Lwba;")
    private static final class46 method297(class166 arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class627 var5 = (class627) field346.method472((byte) -116); var5 != null; var5 = (class627) field346.method482(-100)) {
            method287(arg0, var5, arg1, arg2, arg3, arg4);
        }
        return field346;
    }

    @OriginalMember(owner = "client!ir", name = "c", descriptor = "()V")
    public static void method298() {
        field334 = null;
        field332 = null;
        field335 = null;
        field339 = null;
        field337 = null;
        field338 = null;
        field336 = null;
        field333 = null;
        field340 = null;
        field347 = null;
        field348 = null;
        field344 = null;
        field342 = null;
        field346 = null;
        field351 = null;
        field355 = null;
        field352 = null;
        field369 = null;
        field361 = null;
        field362 = null;
        field358 = null;
        field372 = null;
        field364 = null;
        field356 = null;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(Lfa;II)V")
    public static final void method299(class209 arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < field334.field6352; var3++) {
            field351[var3 + 1] = method286(arg0, var3, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "([B[B[SII)V")
    private static final void method300(byte[] arg0, byte[] arg1, short[] arg2, int arg3, int arg4) {
        int[] var5 = new int[field360];
        int[] var6 = new int[field360];
        int[] var7 = new int[field360];
        int[] var8 = new int[field360];
        int[] var9 = new int[field360];
        for (int var10 = -5; var10 < field359; var10++) {
            int var11 = var10 + 5;
            int var12 = var10 - 5;
            for (int var13 = 0; var13 < field360; var13++) {
                int var10002;
                if (var11 < field359) {
                    int var28 = arg0[field359 * var13 + var11] & 0xFF;
                    if (var28 > 0) {
                        class460 var29 = field332.method1993(var28 - 1, true);
                        var5[var13] += var29.field6585;
                        var6[var13] += var29.field6581;
                        var7[var13] += var29.field6590;
                        var8[var13] += var29.field6572;
                        var10002 = var9[var13]++;
                    }
                }
                if (var12 >= 0) {
                    int var30 = arg0[field359 * var13 + var12] & 0xFF;
                    if (var30 > 0) {
                        class460 var31 = field332.method1993(var30 - 1, true);
                        var5[var13] -= var31.field6585;
                        var6[var13] -= var31.field6581;
                        var7[var13] -= var31.field6590;
                        var8[var13] -= var31.field6572;
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
                for (int var19 = -5; var19 < field360; var19++) {
                    int var20 = var19 + 5;
                    if (var20 < field360) {
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
                        if ((arg0[field359 * var19 + var10] & 0xFF) == 0) {
                            int var22 = field359 * var19 + var10;
                            arg1[var22] = 0;
                            arg2[var22] = 0;
                        } else {
                            int var23 = var17 == 0 ? 0 : class639.method3555(42, var15 / var18, var16 / var18, var14 * 256 / var17);
                            int var24 = (var23 & 0x7F) + arg4;
                            if (var24 < 0) {
                                var24 = 0;
                            } else if (var24 > 127) {
                                var24 = 127;
                            }
                            int var25 = (arg3 + var23 & 0xFC00) + (var23 & 0x380) + var24;
                            int var26 = field359 * var19 + var10;
                            int var27 = class689.field9703[class373.method2250((byte) 31, class612.method3417(96, var25, -91)) & 0xFFFF];
                            arg1[var26] = (byte) (var27 >> 16 & 0xFF);
                            arg2[var26] = (short) (var27 & 0xFFFF);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "(II)Loq;")
    public static final class326 method301(int arg0, int arg1) {
        for (class326 var2 = (class326) field340.method1407(-92); var2 != null; var2 = (class326) field340.method1413(true)) {
            if (var2.field4821 && var2.method2056(arg1, true, arg0)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method302(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field367 = arg0 - field365;
        field363 = arg1 - field366;
        field371 = arg2 - field365;
        field354 = arg3 - field366;
        field357 = arg4;
        field370 = arg5;
        field353 = arg6;
        field368 = arg7;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(Lr;Lmo;IIII[I[I)V")
    private static final void method303(class166 arg0, class695 arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7) {
        int var8 = arg1.method3826(false);
        if ((var8 & 0x1) == 0) {
            boolean var9 = (var8 & 0x2) == 0;
            int var10 = var8 >> 2 & 0x3F;
            if (var10 != 62) {
                int var11;
                if (var10 == 63) {
                    var11 = arg1.method3826(false);
                } else if (var9) {
                    var11 = arg6[var10];
                } else {
                    var11 = arg7[var10];
                }
                if (var9) {
                    field355[field359 * arg5 + arg4] = (byte) var11;
                    field361[field359 * arg5 + arg4] = 0;
                } else {
                    field361[field359 * arg5 + arg4] = (byte) var11;
                    field362[field359 * arg5 + arg4] = 0;
                    field355[field359 * arg5 + arg4] = arg1.method3827((byte) 67);
                }
            }
            return;
        }
        int var12 = (var8 >> 1 & 0x3) + 1;
        boolean var13 = (var8 & 0x8) != 0;
        boolean var14 = (var8 & 0x10) != 0;
        for (int var15 = 0; var15 < var12; var15++) {
            int var16 = arg1.method3826(false);
            int var17 = 0;
            int var18 = 0;
            if (var13) {
                var17 = arg1.method3826(false);
                var18 = arg1.method3826(false);
            }
            int var19 = 0;
            if (var14) {
                var19 = arg1.method3826(false);
            }
            if (var15 == 0) {
                field355[field359 * arg5 + arg4] = (byte) var16;
                field361[field359 * arg5 + arg4] = (byte) var17;
                field362[field359 * arg5 + arg4] = (byte) var18;
                if (var19 == 1) {
                    field358[field359 * arg5 + arg4] = (short) (arg1.method3847((byte) 118) + 1);
                    field372[field359 * arg5 + arg4] = arg1.method3827((byte) -115);
                } else if (var19 > 1) {
                    field358[field359 * arg5 + arg4] = -1;
                    short[] var20 = new short[var19];
                    byte[] var21 = new byte[var19];
                    for (int var22 = 0; var22 < var19; var22++) {
                        var20[var22] = (short) arg1.method3847((byte) 118);
                        var21[var22] = arg1.method3827((byte) -58);
                    }
                    field364.method1403((byte) -18, new class449(var20, var21), (long) (arg4 << 16 | arg5));
                }
            } else {
                short[] var23 = null;
                byte[] var24 = null;
                if (var19 > 0) {
                    var23 = new short[var19];
                    var24 = new byte[var19];
                    for (int var25 = 0; var25 < var19; var25++) {
                        var23[var25] = (short) arg1.method3847((byte) 118);
                        var24[var25] = arg1.method3827((byte) -56);
                    }
                }
                if (field356[var15 - 1][arg2 - (field365 >> 6)][arg3 - (field366 >> 6)] == null) {
                    field356[var15 - 1][arg2 - (field365 >> 6)][arg3 - (field366 >> 6)] = new class392();
                }
                class526 var26 = new class526(arg4 & 0x3F, arg5 & 0x3F, var16, var17, var18, var23, var24);
                field356[var15 - 1][arg2 - (field365 >> 6)][arg3 - (field366 >> 6)].method2413(var26, (byte) 112);
            }
        }
    }

    @OriginalMember(owner = "client!ir", name = "d", descriptor = "()V")
    public static final void method304() {
        field355 = new byte[field360 * field359];
        field361 = new byte[field360 * field359];
        field362 = new byte[field360 * field359];
        field358 = new short[field360 * field359];
        field372 = new byte[field360 * field359];
        field364 = new class213(1024);
        field356 = new class392[3][field359 >> 6][field360 >> 6];
        field351 = new int[field334.field6352 + 1];
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(Lr;)Lwba;")
    public static final class46 method305(class166 arg0) {
        int var1 = field371 - field367;
        int var2 = field363 - field354;
        int var3 = (field353 - field357 << 16) / var1;
        int var4 = (field368 - field370 << 16) / var2;
        return method297(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!ir", name = "e", descriptor = "()V")
    public static final void method306() {
        field355 = null;
        field352 = null;
        field369 = null;
        field361 = null;
        field362 = null;
        field358 = null;
        field372 = null;
        field364 = null;
        field356 = null;
        field351 = null;
    }

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "(Lr;)V")
    public static final void method307(class166 arg0) {
        int var1 = field371 - field367;
        int var2 = field363 - field354;
        int var3 = (field353 - field357 << 16) / var1;
        int var4 = (field368 - field370 << 16) / var2;
        method308(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "(Lr;IIII)V")
    private static final void method308(class166 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = field371 - field367;
        int var6 = field363 - field354;
        if (field371 < field359) {
            var5++;
        }
        if (field363 < field360) {
            var6++;
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var49 = (arg1 * var7 + arg3 >> 16) + field357;
            int var50 = ((var7 + 1) * arg1 + arg3 >> 16) + field357;
            int var51 = var50 - var49;
            if (var51 > 0) {
                int var52 = field367 + var7;
                if (var52 >= 0 && var52 < field359) {
                    for (int var53 = 0; var53 < var6; var53++) {
                        int var54 = field368 - ((var53 + 1) * arg2 + arg4 >> 16);
                        int var55 = field368 - (arg2 * var53 + arg4 >> 16);
                        int var56 = var55 - var54;
                        if (var56 > 0) {
                            int var57 = field354 + var53;
                            int var58 = field359 * var57 + var52;
                            int var59 = 0;
                            int var60 = 0;
                            int var61 = 0;
                            if (var57 >= 0 && var57 < field360) {
                                var59 = (field352[var58] & 0xFF) << 16 | field369[var58] & 0xFFFF;
                                if (var59 != 0) {
                                    var59 |= 0xFF000000;
                                }
                                var60 = field361[var58] & 0xFF;
                                var61 = field358[var58] & 0xFFFF;
                            }
                            if (var59 == 0 && var60 == 0 && var61 == 0) {
                                int var62;
                                if (field336.field4818 != -1) {
                                    var62 = field336.field4818 | 0xFF000000;
                                } else if ((field367 + var7 & 0x4) == (field363 + var53 & 0x4)) {
                                    var62 = field351[field334.field6356 + 1];
                                } else {
                                    var62 = -11840664;
                                }
                                if (var62 == 0) {
                                    var62 = -16777216;
                                }
                                arg0.method114(var49, var54, var51, var56, var62, 0);
                            } else if (var61 <= 0) {
                                method294(arg0, var49, var54, var51, var56, var59, var60, field362[var58], null, null, true);
                            } else if (var61 == 65535) {
                                class449 var63 = (class449) field364.method1405((long) (var52 << 16 | var57), (byte) -46);
                                if (var63 != null) {
                                    method294(arg0, var49, var54, var51, var56, var59, var60, field362[var58], var63.field6483, var63.field6484, true);
                                }
                            } else {
                                field348[0] = (short) (var61 - 1);
                                field344[0] = field372[var58];
                                method294(arg0, var49, var54, var51, var56, var59, var60, field362[var58], field348, field344, true);
                            }
                        }
                    }
                } else {
                    for (int var64 = 0; var64 < var6; var64++) {
                        int var65 = field368 - ((var64 + 1) * arg2 + arg4 >> 16);
                        int var66 = field368 - (arg2 * var64 + arg4 >> 16);
                        int var67 = var66 - var65;
                        int var68;
                        if (field336.field4818 != -1) {
                            var68 = field336.field4818 | 0xFF000000;
                        } else if ((field367 + var7 & 0x4) == (field363 + var64 & 0x4)) {
                            var68 = field351[field334.field6356 + 1];
                        } else {
                            var68 = -11840664;
                        }
                        if (var68 == 0) {
                            var68 = -16777216;
                        }
                        arg0.method114(var49, var65, var51, var67, var68, 0);
                    }
                }
            }
        }
        for (int var8 = -16; var8 < var5 + 16; var8++) {
            int var38 = (arg1 * var8 + arg3 >> 16) + field357;
            int var39 = ((var8 + 1) * arg1 + arg3 >> 16) + field357;
            int var40 = var39 - var38;
            if (var40 > 0) {
                int var41 = field367 + var8;
                if (var41 >= 0 && var41 < field359) {
                    for (int var42 = -16; var42 < var6 + 16; var42++) {
                        int var43 = field368 - ((var42 + 1) * arg2 + arg4 >> 16);
                        int var44 = field368 - (arg2 * var42 + arg4 >> 16);
                        int var45 = var44 - var43;
                        if (var45 > 0) {
                            int var46 = field354 + var42;
                            if (var46 >= 0 && var46 < field360) {
                                int var47 = field358[field359 * var46 + var41] & 0xFFFF;
                                if (var47 <= 0) {
                                    method295(arg0, var38, var43, var40, var45, null, null);
                                } else if (var47 == 65535) {
                                    class449 var48 = (class449) field364.method1405((long) (var41 << 16 | var46), (byte) -22);
                                    if (var48 != null) {
                                        method295(arg0, var38, var43, var40, var45, var48.field6483, var48.field6484);
                                    }
                                } else {
                                    field348[0] = (short) (var47 - 1);
                                    field344[0] = field372[field359 * var46 + var41];
                                    method295(arg0, var38, var43, var40, var45, field348, field344);
                                }
                            }
                        }
                    }
                }
            }
        }
        int var9 = field367 >> 6;
        int var10 = field354 >> 6;
        if (var9 < 0) {
            var9 = 0;
        }
        if (var10 < 0) {
            var10 = 0;
        }
        int var11 = field371 >> 6;
        int var12 = field363 >> 6;
        if (var11 >= field356[0].length) {
            var11 = field356[0].length - 1;
        }
        if (var12 >= field356[0][0].length) {
            var12 = field356[0][0].length - 1;
        }
        for (int var13 = 0; var13 < 3; var13++) {
            for (int var14 = var9; var14 <= var11; var14++) {
                for (int var27 = var10; var27 <= var12; var27++) {
                    class392 var28 = field356[var13][var14][var27];
                    if (var28 != null) {
                        int var29 = ((field365 >> 6) + var14) * 64;
                        int var30 = ((field366 >> 6) + var27) * 64;
                        for (class526 var31 = (class526) var28.method2417(false); var31 != null; var31 = (class526) var28.method2414(true)) {
                            int var32 = var31.field7411 + var29 - field365 - field367;
                            int var33 = var31.field7413 + var30 - field366 - field354;
                            int var34 = (arg1 * var32 + arg3 >> 16) + field357;
                            int var35 = ((var32 + 1) * arg1 + arg3 >> 16) + field357;
                            int var36 = field368 - ((var33 + 1) * arg2 + arg4 >> 16);
                            int var37 = field368 - (arg2 * var33 + arg4 >> 16);
                            method294(arg0, var34, var36, var35 - var34, var37 - var36, var31.field7414, var31.field7416 & 0xFF, var31.field7415, var31.field7412, var31.field7417, false);
                        }
                    }
                }
            }
            for (int var15 = var9; var15 <= var11; var15++) {
                for (int var16 = var10; var16 <= var12; var16++) {
                    class392 var17 = field356[var13][var15][var16];
                    if (var17 != null) {
                        int var18 = ((field365 >> 6) + var15) * 64;
                        int var19 = ((field366 >> 6) + var16) * 64;
                        for (class526 var20 = (class526) var17.method2417(false); var20 != null; var20 = (class526) var17.method2414(true)) {
                            int var21 = var20.field7411 + var18 - field365 - field367;
                            int var22 = var20.field7413 + var19 - field366 - field354;
                            int var23 = (arg1 * var21 + arg3 >> 16) + field357;
                            int var24 = ((var21 + 1) * arg1 + arg3 >> 16) + field357;
                            int var25 = field368 - ((var22 + 1) * arg2 + arg4 >> 16);
                            int var26 = field368 - (arg2 * var22 + arg4 >> 16);
                            method295(arg0, var23, var25, var24 - var23, var26 - var25, var20.field7412, var20.field7417);
                        }
                    }
                }
            }
        }
    }
}
