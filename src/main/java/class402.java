import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!laa")
public class class402 {

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "Lrda;")
    private static class467 field5318 = new class467(16);

    @OriginalMember(owner = "client!laa", name = "n", descriptor = "I")
    public static int field5331 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!laa", name = "o", descriptor = "I")
    public static int field5332 = (int) (Math.random() * 11.0D) - 5;

    @OriginalMember(owner = "client!laa", name = "p", descriptor = "[S")
    private static short[] field5333 = new short[1];

    @OriginalMember(owner = "client!laa", name = "j", descriptor = "[B")
    private static byte[] field5327 = new byte[1];

    @OriginalMember(owner = "client!laa", name = "l", descriptor = "Lfca;")
    public static class661 field5329 = new class661();

    @OriginalMember(owner = "client!laa", name = "r", descriptor = "F")
    public static float field5335;

    @OriginalMember(owner = "client!laa", name = "s", descriptor = "F")
    public static float field5336;

    @OriginalMember(owner = "client!laa", name = "k", descriptor = "I")
    public static int field5328;

    @OriginalMember(owner = "client!laa", name = "w", descriptor = "I")
    public static int field5340;

    @OriginalMember(owner = "client!laa", name = "x", descriptor = "I")
    public static int field5341;

    @OriginalMember(owner = "client!laa", name = "y", descriptor = "I")
    public static int field5342;

    @OriginalMember(owner = "client!laa", name = "A", descriptor = "I")
    public static int field5344;

    @OriginalMember(owner = "client!laa", name = "B", descriptor = "I")
    public static int field5345;

    @OriginalMember(owner = "client!laa", name = "D", descriptor = "I")
    public static int field5347;

    @OriginalMember(owner = "client!laa", name = "E", descriptor = "I")
    public static int field5348;

    @OriginalMember(owner = "client!laa", name = "G", descriptor = "I")
    public static int field5350;

    @OriginalMember(owner = "client!laa", name = "J", descriptor = "I")
    public static int field5353;

    @OriginalMember(owner = "client!laa", name = "M", descriptor = "I")
    public static int field5356;

    @OriginalMember(owner = "client!laa", name = "O", descriptor = "I")
    public static int field5357;

    @OriginalMember(owner = "client!laa", name = "P", descriptor = "I")
    public static int field5358;

    @OriginalMember(owner = "client!laa", name = "b", descriptor = "Lvg;")
    private static class199 field5319;

    @OriginalMember(owner = "client!laa", name = "d", descriptor = "Lwm;")
    public static class30 field5321;

    @OriginalMember(owner = "client!laa", name = "i", descriptor = "Lrca;")
    public static class389 field5326;

    @OriginalMember(owner = "client!laa", name = "e", descriptor = "Leaa;")
    public static class401 field5322;

    @OriginalMember(owner = "client!laa", name = "I", descriptor = "Lrda;")
    private static class467 field5352;

    @OriginalMember(owner = "client!laa", name = "f", descriptor = "Lsc;")
    private static class472 field5323;

    @OriginalMember(owner = "client!laa", name = "g", descriptor = "Lvf;")
    public static class480 field5324;

    @OriginalMember(owner = "client!laa", name = "h", descriptor = "Lbd;")
    public static class577 field5325;

    @OriginalMember(owner = "client!laa", name = "m", descriptor = "Lff;")
    public static class607 field5330;

    @OriginalMember(owner = "client!laa", name = "c", descriptor = "Lsda;")
    public static class783 field5320;

    @OriginalMember(owner = "client!laa", name = "t", descriptor = "[B")
    private static byte[] field5337;

    @OriginalMember(owner = "client!laa", name = "z", descriptor = "[B")
    private static byte[] field5343;

    @OriginalMember(owner = "client!laa", name = "C", descriptor = "[B")
    private static byte[] field5346;

    @OriginalMember(owner = "client!laa", name = "K", descriptor = "[B")
    private static byte[] field5354;

    @OriginalMember(owner = "client!laa", name = "L", descriptor = "[B")
    private static byte[] field5355;

    @OriginalMember(owner = "client!laa", name = "v", descriptor = "[I")
    private static int[] field5339;

    @OriginalMember(owner = "client!laa", name = "u", descriptor = "[S")
    private static short[] field5338;

    @OriginalMember(owner = "client!laa", name = "F", descriptor = "[S")
    private static short[] field5349;

    @OriginalMember(owner = "client!laa", name = "q", descriptor = "[[[B")
    public static byte[][][] field5334;

    @OriginalMember(owner = "client!laa", name = "H", descriptor = "[[[Lhv;")
    private static class151[][][] field5351;

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(Lha;Lkj;IIII)V")
    private static final void method2329(class570 arg0, class307 arg1, int arg2, int arg3, int arg4, int arg5) {
        arg1.field3855 = ((arg1.field3857 - field5350) * arg2 + arg4 >> 16) + field5358;
        arg1.field3861 = field5353 - ((arg1.field3859 - field5348) * arg3 + arg5 >> 16);
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(Lha;)Lfca;")
    public static final class661 method2330(class570 arg0) {
        int var1 = field5340 - field5350;
        int var2 = field5341 - field5348;
        int var3 = (field5345 - field5358 << 16) / var1;
        int var4 = (field5353 - field5344 << 16) / var2;
        return method2334(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(I)Lrca;")
    public static final class389 method2331(int arg0) {
        return (class389) field5318.method2616((long) arg0, (byte) -97);
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "()V")
    public static final void method2332() {
        int[] var0 = new int[3];
        for (int var1 = 0; var1 < field5330.field7691; var1++) {
            boolean var2 = field5326.method2246(field5330.field7690[var1] >> 28 & 0x3, field5330.field7690[var1] & 0x3FFF, (byte) 29, field5330.field7690[var1] >> 14 & 0x3FFF, var0);
            if (var2) {
                class307 var3 = new class307(field5330.field7688[var1]);
                var3.field3857 = var0[1] - field5357;
                var3.field3859 = var0[2] - field5347;
                field5329.method3593(var3, 15);
            }
        }
    }

    @OriginalMember(owner = "client!laa", name = "b", descriptor = "()V")
    public static final void method2333() {
        field5337 = null;
        field5343 = null;
        field5349 = null;
        field5354 = null;
        field5346 = null;
        field5338 = null;
        field5355 = null;
        field5352 = null;
        field5351 = null;
        field5339 = null;
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(Lha;IIII)Lfca;")
    private static final class661 method2334(class570 arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class307 var5 = (class307) field5329.method3591(0); var5 != null; var5 = (class307) field5329.method3600((byte) 115)) {
            method2329(arg0, var5, arg1, arg2, arg3, arg4);
        }
        return field5329;
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(Lha;Lmc;IIII[I[I)V")
    private static final void method2335(class570 arg0, class234 arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7) {
        int var8 = arg1.method1509(true);
        if ((var8 & 0x1) == 0) {
            boolean var9 = (var8 & 0x2) == 0;
            int var10 = var8 >> 2 & 0x3F;
            if (var10 != 62) {
                int var11;
                if (var10 == 63) {
                    var11 = arg1.method1509(true);
                } else if (var9) {
                    var11 = arg6[var10];
                } else {
                    var11 = arg7[var10];
                }
                if (var9) {
                    field5337[field5356 * arg5 + arg4] = (byte) var11;
                    field5354[field5356 * arg5 + arg4] = 0;
                } else {
                    field5354[field5356 * arg5 + arg4] = (byte) var11;
                    field5346[field5356 * arg5 + arg4] = 0;
                    field5337[field5356 * arg5 + arg4] = arg1.method1554(27806);
                }
            }
            return;
        }
        int var12 = (var8 >> 1 & 0x3) + 1;
        boolean var13 = (var8 & 0x8) != 0;
        boolean var14 = (var8 & 0x10) != 0;
        for (int var15 = 0; var15 < var12; var15++) {
            int var16 = arg1.method1509(true);
            int var17 = 0;
            int var18 = 0;
            if (var13) {
                var17 = arg1.method1509(true);
                var18 = arg1.method1509(true);
            }
            int var19 = 0;
            if (var14) {
                var19 = arg1.method1509(true);
            }
            if (var15 == 0) {
                field5337[field5356 * arg5 + arg4] = (byte) var16;
                field5354[field5356 * arg5 + arg4] = (byte) var17;
                field5346[field5356 * arg5 + arg4] = (byte) var18;
                if (var19 == 1) {
                    field5338[field5356 * arg5 + arg4] = (short) (arg1.method1553((byte) -120) + 1);
                    field5355[field5356 * arg5 + arg4] = arg1.method1554(27806);
                } else if (var19 > 1) {
                    field5338[field5356 * arg5 + arg4] = -1;
                    short[] var20 = new short[var19];
                    byte[] var21 = new byte[var19];
                    for (int var22 = 0; var22 < var19; var22++) {
                        var20[var22] = (short) arg1.method1553((byte) -11);
                        var21[var22] = arg1.method1554(27806);
                    }
                    field5352.method2619(new class767(var20, var21), (long) (arg4 << 16 | arg5), -1);
                }
            } else {
                short[] var23 = null;
                byte[] var24 = null;
                if (var19 > 0) {
                    var23 = new short[var19];
                    var24 = new byte[var19];
                    for (int var25 = 0; var25 < var19; var25++) {
                        var23[var25] = (short) arg1.method1553((byte) -117);
                        var24[var25] = arg1.method1554(27806);
                    }
                }
                if (field5351[var15 - 1][arg2 - (field5357 >> 6)][arg3 - (field5347 >> 6)] == null) {
                    field5351[var15 - 1][arg2 - (field5357 >> 6)][arg3 - (field5347 >> 6)] = new class151();
                }
                class744 var26 = new class744(arg4 & 0x3F, arg5 & 0x3F, var16, var17, var18, var23, var24);
                field5351[var15 - 1][arg2 - (field5357 >> 6)][arg3 - (field5347 >> 6)].method855(0, var26);
            }
        }
    }

    @OriginalMember(owner = "client!laa", name = "c", descriptor = "()V")
    private static final void method2336() {
        for (int var0 = 0; var0 < field5356; var0++) {
            for (int var11 = 0; var11 < field5342; var11++) {
                int var12 = field5338[field5356 * var11 + var0] & 0xFFFF;
                if (var12 != 0) {
                    if (var12 == 65535) {
                        class767 var13 = (class767) field5352.method2616((long) (var0 << 16 | var11), (byte) -86);
                        if (var13 != null) {
                            for (int var14 = 0; var14 < var13.field10435.length; var14++) {
                                class773 var15 = field5320.method4292(var13.field10435[var14] & 0xFFFF, (byte) -108);
                                int var16 = var15.field10443;
                                if (var15.field10536 != null) {
                                    class773 var17 = var15.method4213(field5325, -101);
                                    if (var17 != null) {
                                        var16 = var17.field10443;
                                    }
                                }
                                if (var16 != -1) {
                                    class307 var18 = new class307(var16);
                                    var18.field3857 = var0;
                                    var18.field3859 = var11;
                                    field5329.method3593(var18, 15);
                                }
                            }
                        }
                    } else {
                        class773 var19 = field5320.method4292(var12 - 1, (byte) -109);
                        int var20 = var19.field10443;
                        if (var19.field10536 != null) {
                            class773 var21 = var19.method4213(field5325, -101);
                            if (var21 != null) {
                                var20 = var21.field10443;
                            }
                        }
                        if (var20 != -1) {
                            class307 var22 = new class307(var20);
                            var22.field3857 = var0;
                            var22.field3859 = var11;
                            field5329.method3593(var22, 15);
                        }
                    }
                }
            }
        }
        for (int var1 = 0; var1 < 3; var1++) {
            for (int var2 = 0; var2 < field5351[0].length; var2++) {
                for (int var3 = 0; var3 < field5351[0][0].length; var3++) {
                    class151 var4 = field5351[var1][var2][var3];
                    if (var4 != null) {
                        for (class744 var5 = (class744) var4.method857(-119); var5 != null; var5 = (class744) var4.method864(true)) {
                            if (var5.field10065 != null) {
                                for (int var6 = 0; var6 < var5.field10065.length; var6++) {
                                    class773 var7 = field5320.method4292(var5.field10065[var6] & 0xFFFF, (byte) -96);
                                    int var8 = var7.field10443;
                                    if (var7.field10536 != null) {
                                        class773 var9 = var7.method4213(field5325, -125);
                                        if (var9 != null) {
                                            var8 = var9.field10443;
                                        }
                                    }
                                    if (var8 != -1) {
                                        class307 var10 = new class307(var8);
                                        var10.field3857 = ((field5357 >> 6) + var2) * 64 + var5.field10061 - field5357;
                                        var10.field3859 = ((field5347 >> 6) + var3) * 64 + var5.field10062 - field5347;
                                        field5329.method3593(var10, 15);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(II)Lut;")
    public static final class719 method2337(int arg0, int arg1) {
        class719 var2 = new class719();
        for (class389 var3 = (class389) field5318.method2610((byte) -102); var3 != null; var3 = (class389) field5318.method2620(0)) {
            if (var3.field4957 && var3.method2245(arg0, (byte) -116, arg1)) {
                var2.method3862(var3, false);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!laa", name = "b", descriptor = "(I)V")
    public static final void method2338(int arg0) {
        field5326 = (class389) field5318.method2616((long) arg0, (byte) 21);
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(Ld;III)I")
    private static final int method2339(class284 arg0, int arg1, int arg2, int arg3) {
        class363 var4 = field5319.method1361(4, arg1);
        if (var4 == null) {
            return 0;
        }
        int var5 = var4.field4413;
        if (var5 >= 0 && arg0.method1732((byte) -85, var5).field2679) {
            var5 = -1;
        }
        int var9;
        if (var4.field4428 >= 0) {
            int var6 = var4.field4428;
            int var7 = (var6 & 0x7F) + arg3;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 127) {
                var7 = 127;
            }
            int var8 = (arg2 + var6 & 0xFC00) + (var6 & 0x380) + var7;
            var9 = class558.field7098[class645.method3487(126, class196.method1354(true, 96, var8)) & 0xFFFF] | 0xFF000000;
        } else if (var5 >= 0) {
            var9 = class558.field7098[class645.method3487(122, class196.method1354(true, 96, arg0.method1732((byte) 117, var5).field2681)) & 0xFFFF] | 0xFF000000;
        } else if (var4.field4424 == -1) {
            var9 = 0;
        } else {
            int var10 = var4.field4424;
            int var11 = (var10 & 0x7F) + arg3;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 127) {
                var11 = 127;
            }
            int var12 = (arg2 + var10 & 0xFC00) + (var10 & 0x380) + var11;
            var9 = class558.field7098[class645.method3487(117, class196.method1354(true, 96, var12)) & 0xFFFF] | 0xFF000000;
        }
        return var9;
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(Lha;IIIIIII[S[BZ)V")
    private static final void method2340(class570 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, short[] arg8, byte[] arg9, boolean arg10) {
        if (arg10 || arg5 != 0 || arg6 > 0) {
            if (arg6 == 0) {
                arg0.method921(arg1, arg2, arg3, arg4, arg5, 0);
            } else {
                int var11 = arg7 & 0x3F;
                if (var11 == 0 || arg3 <= 1 || arg4 <= 1) {
                    int var13 = field5339[arg6];
                    if (arg10 || var13 != 0) {
                        arg0.method921(arg1, arg2, arg3, arg4, var13, 0);
                    }
                } else {
                    int var12 = arg10 ? 0 : 1;
                    class198.method1359(arg4, arg2, 3, arg7 >> 6 & 0x3, field5339[arg6], field5328, field5334, arg1, var11, arg0, var12, arg3, arg5);
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
                class773 var18 = field5320.method4292(arg8[var16] & 0xFFFF, (byte) -114);
                if (var18.field10510 == -1) {
                    int var19 = -3355444;
                    if (var18.field10488 == 1) {
                        var19 = -3407872;
                    }
                    int var20 = arg9[var16] >> 6 & 0x3;
                    if (var17 == 0) {
                        if (var20 == 0) {
                            arg0.method936(arg1, arg2, arg4, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method896(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method936(var14, arg2, arg4, var19, 0);
                        } else {
                            arg0.method896(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 2) {
                        if (var20 == 0) {
                            arg0.method936(arg1, arg2, arg4, -1, 0);
                            arg0.method896(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method936(var14, arg2, arg4, -1, 0);
                            arg0.method896(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method936(var14, arg2, arg4, -1, 0);
                            arg0.method896(arg1, var15, arg3, var19, 0);
                        } else {
                            arg0.method936(arg1, arg2, arg4, -1, 0);
                            arg0.method896(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 3) {
                        if (var20 == 0) {
                            arg0.method896(arg1, arg2, 1, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method896(var14, arg2, 1, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method896(var14, var15, 1, var19, 0);
                        } else {
                            arg0.method896(arg1, var15, 1, var19, 0);
                        }
                    } else if (var17 == 9) {
                        if (var20 == 0 || var20 == 2) {
                            for (int var22 = 0; var22 < arg4; var22++) {
                                arg0.method896(arg1 + var22, var15 - var22, 1, var19, 0);
                            }
                        } else {
                            for (int var21 = 0; var21 < arg4; var21++) {
                                arg0.method896(arg1 + var21, arg2 + var21, 1, var19, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(Ld;II)V")
    public static final void method2341(class284 arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < field5319.field2765; var3++) {
            field5339[var3 + 1] = method2339(arg0, var3, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!laa", name = "b", descriptor = "(II)Lrca;")
    public static final class389 method2342(int arg0, int arg1) {
        for (class389 var2 = (class389) field5318.method2610((byte) -116); var2 != null; var2 = (class389) field5318.method2620(0)) {
            if (var2.field4957 && var2.method2245(arg0, (byte) -116, arg1)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(Lwm;Lvg;Lsc;Lsda;Leaa;Lvf;Lbd;)V")
    public static final void method2343(class30 arg0, class199 arg1, class472 arg2, class783 arg3, class401 arg4, class480 arg5, class577 arg6) {
        field5321 = arg0;
        field5319 = arg1;
        field5323 = arg2;
        field5320 = arg3;
        field5322 = arg4;
        field5324 = arg5;
        field5325 = arg6;
        field5318.method2617(28812);
        int var7 = field5321.method135(0, "details");
        int[] var8 = field5321.method125(var7, (byte) 70);
        if (var8 != null) {
            for (int var9 = 0; var9 < var8.length; var9++) {
                class389 var10 = class80.method501(var7, var8[var9], field5321, 2);
                field5318.method2619(var10, (long) var10.field4973, -1);
            }
        }
        class385.method2206(1708, false, true);
    }

    @OriginalMember(owner = "client!laa", name = "b", descriptor = "(Lha;IIII)V")
    private static final void method2344(class570 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = field5340 - field5350;
        int var6 = field5341 - field5348;
        if (field5340 < field5356) {
            var5++;
        }
        if (field5341 < field5342) {
            var6++;
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var49 = (arg1 * var7 + arg3 >> 16) + field5358;
            int var50 = ((var7 + 1) * arg1 + arg3 >> 16) + field5358;
            int var51 = var50 - var49;
            if (var51 > 0) {
                int var52 = field5350 + var7;
                if (var52 >= 0 && var52 < field5356) {
                    for (int var53 = 0; var53 < var6; var53++) {
                        int var54 = field5353 - ((var53 + 1) * arg2 + arg4 >> 16);
                        int var55 = field5353 - (arg2 * var53 + arg4 >> 16);
                        int var56 = var55 - var54;
                        if (var56 > 0) {
                            int var57 = field5348 + var53;
                            int var58 = field5356 * var57 + var52;
                            int var59 = 0;
                            int var60 = 0;
                            int var61 = 0;
                            if (var57 >= 0 && var57 < field5342) {
                                var59 = (field5343[var58] & 0xFF) << 16 | field5349[var58] & 0xFFFF;
                                if (var59 != 0) {
                                    var59 |= 0xFF000000;
                                }
                                var60 = field5354[var58] & 0xFF;
                                var61 = field5338[var58] & 0xFFFF;
                            }
                            if (var59 == 0 && var60 == 0 && var61 == 0) {
                                int var62;
                                if (field5326.field4962 != -1) {
                                    var62 = field5326.field4962 | 0xFF000000;
                                } else if ((field5350 + var7 & 0x4) == (field5341 + var53 & 0x4)) {
                                    var62 = field5339[field5319.field2771 + 1];
                                } else {
                                    var62 = -11840664;
                                }
                                if (var62 == 0) {
                                    var62 = -16777216;
                                }
                                arg0.method921(var49, var54, var51, var56, var62, 0);
                            } else if (var61 <= 0) {
                                method2340(arg0, var49, var54, var51, var56, var59, var60, field5346[var58], null, null, true);
                            } else if (var61 == 65535) {
                                class767 var63 = (class767) field5352.method2616((long) (var52 << 16 | var57), (byte) -122);
                                if (var63 != null) {
                                    method2340(arg0, var49, var54, var51, var56, var59, var60, field5346[var58], var63.field10435, var63.field10434, true);
                                }
                            } else {
                                field5333[0] = (short) (var61 - 1);
                                field5327[0] = field5355[var58];
                                method2340(arg0, var49, var54, var51, var56, var59, var60, field5346[var58], field5333, field5327, true);
                            }
                        }
                    }
                } else {
                    for (int var64 = 0; var64 < var6; var64++) {
                        int var65 = field5353 - ((var64 + 1) * arg2 + arg4 >> 16);
                        int var66 = field5353 - (arg2 * var64 + arg4 >> 16);
                        int var67 = var66 - var65;
                        int var68;
                        if (field5326.field4962 != -1) {
                            var68 = field5326.field4962 | 0xFF000000;
                        } else if ((field5350 + var7 & 0x4) == (field5341 + var64 & 0x4)) {
                            var68 = field5339[field5319.field2771 + 1];
                        } else {
                            var68 = -11840664;
                        }
                        if (var68 == 0) {
                            var68 = -16777216;
                        }
                        arg0.method921(var49, var65, var51, var67, var68, 0);
                    }
                }
            }
        }
        for (int var8 = -16; var8 < var5 + 16; var8++) {
            int var38 = (arg1 * var8 + arg3 >> 16) + field5358;
            int var39 = ((var8 + 1) * arg1 + arg3 >> 16) + field5358;
            int var40 = var39 - var38;
            if (var40 > 0) {
                int var41 = field5350 + var8;
                if (var41 >= 0 && var41 < field5356) {
                    for (int var42 = -16; var42 < var6 + 16; var42++) {
                        int var43 = field5353 - ((var42 + 1) * arg2 + arg4 >> 16);
                        int var44 = field5353 - (arg2 * var42 + arg4 >> 16);
                        int var45 = var44 - var43;
                        if (var45 > 0) {
                            int var46 = field5348 + var42;
                            if (var46 >= 0 && var46 < field5342) {
                                int var47 = field5338[field5356 * var46 + var41] & 0xFFFF;
                                if (var47 <= 0) {
                                    method2345(arg0, var38, var43, var40, var45, null, null);
                                } else if (var47 == 65535) {
                                    class767 var48 = (class767) field5352.method2616((long) (var41 << 16 | var46), (byte) -3);
                                    if (var48 != null) {
                                        method2345(arg0, var38, var43, var40, var45, var48.field10435, var48.field10434);
                                    }
                                } else {
                                    field5333[0] = (short) (var47 - 1);
                                    field5327[0] = field5355[field5356 * var46 + var41];
                                    method2345(arg0, var38, var43, var40, var45, field5333, field5327);
                                }
                            }
                        }
                    }
                }
            }
        }
        int var9 = field5350 >> 6;
        int var10 = field5348 >> 6;
        if (var9 < 0) {
            var9 = 0;
        }
        if (var10 < 0) {
            var10 = 0;
        }
        int var11 = field5340 >> 6;
        int var12 = field5341 >> 6;
        if (var11 >= field5351[0].length) {
            var11 = field5351[0].length - 1;
        }
        if (var12 >= field5351[0][0].length) {
            var12 = field5351[0][0].length - 1;
        }
        for (int var13 = 0; var13 < 3; var13++) {
            for (int var14 = var9; var14 <= var11; var14++) {
                for (int var27 = var10; var27 <= var12; var27++) {
                    class151 var28 = field5351[var13][var14][var27];
                    if (var28 != null) {
                        int var29 = ((field5357 >> 6) + var14) * 64;
                        int var30 = ((field5347 >> 6) + var27) * 64;
                        for (class744 var31 = (class744) var28.method857(-123); var31 != null; var31 = (class744) var28.method864(true)) {
                            int var32 = var31.field10061 + var29 - field5357 - field5350;
                            int var33 = var31.field10062 + var30 - field5347 - field5348;
                            int var34 = (arg1 * var32 + arg3 >> 16) + field5358;
                            int var35 = ((var32 + 1) * arg1 + arg3 >> 16) + field5358;
                            int var36 = field5353 - ((var33 + 1) * arg2 + arg4 >> 16);
                            int var37 = field5353 - (arg2 * var33 + arg4 >> 16);
                            method2340(arg0, var34, var36, var35 - var34, var37 - var36, var31.field10067, var31.field10063 & 0xFF, var31.field10064, var31.field10065, var31.field10066, false);
                        }
                    }
                }
            }
            for (int var15 = var9; var15 <= var11; var15++) {
                for (int var16 = var10; var16 <= var12; var16++) {
                    class151 var17 = field5351[var13][var15][var16];
                    if (var17 != null) {
                        int var18 = ((field5357 >> 6) + var15) * 64;
                        int var19 = ((field5347 >> 6) + var16) * 64;
                        for (class744 var20 = (class744) var17.method857(-69); var20 != null; var20 = (class744) var17.method864(true)) {
                            int var21 = var20.field10061 + var18 - field5357 - field5350;
                            int var22 = var20.field10062 + var19 - field5347 - field5348;
                            int var23 = (arg1 * var21 + arg3 >> 16) + field5358;
                            int var24 = ((var21 + 1) * arg1 + arg3 >> 16) + field5358;
                            int var25 = field5353 - ((var22 + 1) * arg2 + arg4 >> 16);
                            int var26 = field5353 - (arg2 * var22 + arg4 >> 16);
                            method2345(arg0, var23, var25, var24 - var23, var26 - var25, var20.field10065, var20.field10066);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(Lha;IIII[S[B)V")
    private static final void method2345(class570 arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        if (arg5 == null) {
            return;
        }
        for (int var7 = 0; var7 < arg5.length; var7++) {
            class773 var8 = field5320.method4292(arg5[var7] & 0xFFFF, (byte) -96);
            int var9 = var8.field10510;
            if (var9 != -1) {
                class510 var10 = field5324.method2694((byte) 125, var9);
                class772 var11 = var10.method2820(arg0, var8.field10446 ? arg6[var7] >> 6 & 0x3 : 0, var8.field10497 ? var8.field10532 : false, (byte) 64);
                if (var11 != null) {
                    int var12 = arg3 * var11.method623() >> 2;
                    int var13 = arg4 * var11.method628() >> 2;
                    if (var10.field6515) {
                        int var14 = var8.field10466;
                        int var15 = var8.field10484;
                        if ((arg6[var7] >> 6 & 0x1) == 1) {
                            int var16 = var14;
                            var14 = var15;
                            var15 = var16;
                        }
                        var12 = arg3 * var14;
                        var13 = arg4 * var15;
                    }
                    if (var12 != 0 && var13 != 0) {
                        if (var10.field6514 == 0) {
                            var11.method4206(arg1, arg2 + arg4 - var13, var12, var13);
                        } else {
                            var11.method4199(arg1, arg2 + arg4 - var13, var12, var13, 0, var10.field6514 | 0xFF000000, 1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "([B[B[SII)V")
    private static final void method2346(byte[] arg0, byte[] arg1, short[] arg2, int arg3, int arg4) {
        int[] var5 = new int[field5342];
        int[] var6 = new int[field5342];
        int[] var7 = new int[field5342];
        int[] var8 = new int[field5342];
        int[] var9 = new int[field5342];
        for (int var10 = -5; var10 < field5356; var10++) {
            int var11 = var10 + 5;
            int var12 = var10 - 5;
            for (int var13 = 0; var13 < field5342; var13++) {
                int var10002;
                if (var11 < field5356) {
                    int var28 = arg0[field5356 * var13 + var11] & 0xFF;
                    if (var28 > 0) {
                        class631 var29 = field5323.method2663(var28 - 1, (byte) -54);
                        var5[var13] += var29.field8001;
                        var6[var13] += var29.field8010;
                        var7[var13] += var29.field8008;
                        var8[var13] += var29.field8006;
                        var10002 = var9[var13]++;
                    }
                }
                if (var12 >= 0) {
                    int var30 = arg0[field5356 * var13 + var12] & 0xFF;
                    if (var30 > 0) {
                        class631 var31 = field5323.method2663(var30 - 1, (byte) -54);
                        var5[var13] -= var31.field8001;
                        var6[var13] -= var31.field8010;
                        var7[var13] -= var31.field8008;
                        var8[var13] -= var31.field8006;
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
                for (int var19 = -5; var19 < field5342; var19++) {
                    int var20 = var19 + 5;
                    if (var20 < field5342) {
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
                        if ((arg0[field5356 * var19 + var10] & 0xFF) == 0) {
                            int var22 = field5356 * var19 + var10;
                            arg1[var22] = 0;
                            arg2[var22] = 0;
                        } else {
                            int var23 = var17 == 0 ? 0 : class382.method2192(var14 * 256 / var17, var16 / var18, var15 / var18, (byte) -44);
                            int var24 = (var23 & 0x7F) + arg4;
                            if (var24 < 0) {
                                var24 = 0;
                            } else if (var24 > 127) {
                                var24 = 127;
                            }
                            int var25 = (arg3 + var23 & 0xFC00) + (var23 & 0x380) + var24;
                            int var26 = field5356 * var19 + var10;
                            int var27 = class558.field7098[class645.method3487(-81, class48.method309(127, 96, var25)) & 0xFFFF];
                            arg1[var26] = (byte) (var27 >> 16 & 0xFF);
                            arg2[var26] = (short) (var27 & 0xFFFF);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(Lha;Lkj;Lek;)V")
    public static final void method2347(class570 arg0, class307 arg1, class624 arg2) {
        if (arg2.field7953 == null) {
            return;
        }
        int[] var3 = new int[arg2.field7953.length];
        for (int var4 = 0; var4 < var3.length / 2; var4++) {
            int var21 = arg2.field7953[var4 * 2] + arg1.field3857;
            int var22 = arg2.field7953[var4 * 2 + 1] + arg1.field3859;
            var3[var4 * 2] = (field5345 - field5358) * (var21 - field5350) / (field5340 - field5350) + field5358;
            var3[var4 * 2 + 1] = field5353 - (field5353 - field5344) * (var22 - field5348) / (field5341 - field5348);
        }
        class584.method3124(arg0, var3, arg2.field7955);
        if (arg2.field7943 > 0) {
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
                arg0.method959(var13, var14, var15, var16, arg2.field7944[arg2.field7956[var5] & 0xFF], 1, arg2.field7943, arg2.field7920, arg2.field7906);
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
            arg0.method959(var6, var7, var8, var9, arg2.field7944[arg2.field7956[arg2.field7956.length - 1] & 0xFF], 1, arg2.field7943, arg2.field7920, arg2.field7906);
            return;
        }
        for (int var20 = 0; var20 < var3.length / 2 - 1; var20++) {
            arg0.method3066(arg2.field7944[arg2.field7956[var20] & 0xFF], var3[(var20 + 1) * 2 + 1], var3[var20 * 2], var3[(var20 + 1) * 2], var3[var20 * 2 + 1], (byte) 121);
        }
        arg0.method3066(arg2.field7944[arg2.field7956[arg2.field7956.length - 1] & 0xFF], var3[1], var3[var3.length - 2], var3[0], var3[var3.length - 1], (byte) 127);
    }

    @OriginalMember(owner = "client!laa", name = "d", descriptor = "()V")
    public static void method2348() {
        field5319 = null;
        field5323 = null;
        field5320 = null;
        field5322 = null;
        field5324 = null;
        field5325 = null;
        field5326 = null;
        field5321 = null;
        field5318 = null;
        field5334 = null;
        field5333 = null;
        field5327 = null;
        field5330 = null;
        field5329 = null;
        field5339 = null;
        field5337 = null;
        field5343 = null;
        field5349 = null;
        field5354 = null;
        field5346 = null;
        field5338 = null;
        field5355 = null;
        field5352 = null;
        field5351 = null;
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method2349(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5350 = arg0 - field5357;
        field5341 = arg1 - field5347;
        field5340 = arg2 - field5357;
        field5348 = arg3 - field5347;
        field5358 = arg4;
        field5344 = arg5;
        field5345 = arg6;
        field5353 = arg7;
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(Lha;II)V")
    public static final void method2350(class570 arg0, int arg1, int arg2) {
        class234 var3 = new class234(field5321.method142(-1, field5326.field4975, "area"));
        int var4 = var3.method1509(true);
        int[] var5 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var5[var6] = var3.method1509(true);
        }
        int var7 = var3.method1509(true);
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method1509(true);
        }
        while (true) {
            while (var3.field3133 < var3.field3193.length) {
                if (var3.method1509(true) == 0) {
                    int var22 = var3.method1509(true);
                    int var23 = var3.method1509(true);
                    for (int var24 = 0; var24 < 64; var24++) {
                        for (int var25 = 0; var25 < 64; var25++) {
                            int var26 = var22 * 64 + var24 - field5357;
                            int var27 = var23 * 64 + var25 - field5347;
                            method2335(arg0, var3, var22, var23, var26, var27, var5, var8);
                        }
                    }
                } else {
                    int var28 = var3.method1509(true);
                    int var29 = var3.method1509(true);
                    int var30 = var3.method1509(true);
                    int var31 = var3.method1509(true);
                    for (int var32 = 0; var32 < 8; var32++) {
                        for (int var33 = 0; var33 < 8; var33++) {
                            int var34 = var28 * 64 + var30 * 8 + var32 - field5357;
                            int var35 = var29 * 64 + var31 * 8 + var33 - field5347;
                            method2335(arg0, var3, var28, var29, var34, var35, var5, var8);
                        }
                    }
                }
            }
            Object var10 = null;
            field5343 = new byte[field5356 * field5342];
            field5349 = new short[field5356 * field5342];
            for (int var11 = 0; var11 < 3; var11++) {
                byte[] var12 = new byte[field5356 * field5342];
                for (int var13 = 0; var13 < field5351[var11].length; var13++) {
                    for (int var19 = 0; var19 < field5351[var11][0].length; var19++) {
                        class151 var20 = field5351[var11][var13][var19];
                        if (var20 != null) {
                            for (class744 var21 = (class744) var20.method857(-112); var21 != null; var21 = (class744) var20.method864(true)) {
                                var12[(var19 * 64 + var21.field10062) * field5356 + var13 * 64 + var21.field10061] = (byte) var21.field10067;
                            }
                        }
                    }
                }
                method2346(var12, field5343, field5349, arg1, arg2);
                for (int var14 = 0; var14 < field5351[var11].length; var14++) {
                    for (int var15 = 0; var15 < field5351[var11][0].length; var15++) {
                        class151 var16 = field5351[var11][var14][var15];
                        if (var16 != null) {
                            for (class744 var17 = (class744) var16.method857(-108); var17 != null; var17 = (class744) var16.method864(true)) {
                                int var18 = (var15 * 64 + var17.field10062) * field5356 + var14 * 64 + var17.field10061;
                                var17.field10067 = (field5343[var18] & 0xFF) << 16 | field5349[var18] & 0xFFFF;
                                if (var17.field10067 != 0) {
                                    var17.field10067 |= 0xFF000000;
                                }
                            }
                        }
                    }
                }
            }
            method2346(field5337, field5343, field5349, arg1, arg2);
            field5337 = null;
            method2336();
            return;
        }
    }

    @OriginalMember(owner = "client!laa", name = "b", descriptor = "(Lha;)V")
    public static final void method2351(class570 arg0) {
        int var1 = field5340 - field5350;
        int var2 = field5341 - field5348;
        int var3 = (field5345 - field5358 << 16) / var1;
        int var4 = (field5353 - field5344 << 16) / var2;
        method2344(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!laa", name = "e", descriptor = "()V")
    public static final void method2352() {
        field5337 = new byte[field5356 * field5342];
        field5354 = new byte[field5356 * field5342];
        field5346 = new byte[field5356 * field5342];
        field5338 = new short[field5356 * field5342];
        field5355 = new byte[field5356 * field5342];
        field5352 = new class467(1024);
        field5351 = new class151[3][field5356 >> 6][field5342 >> 6];
        field5339 = new int[field5319.field2765 + 1];
    }
}
