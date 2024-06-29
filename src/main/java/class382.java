import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public class class382 {

    @OriginalMember(owner = "client!ur", name = "e", descriptor = "Lhl;")
    private static class375 field5450 = new class375(16);

    @OriginalMember(owner = "client!ur", name = "j", descriptor = "[B")
    private static byte[] field5455 = new byte[1];

    @OriginalMember(owner = "client!ur", name = "n", descriptor = "I")
    public static int field5459 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!ur", name = "p", descriptor = "[S")
    private static short[] field5461 = new short[1];

    @OriginalMember(owner = "client!ur", name = "s", descriptor = "I")
    public static int field5464 = (int) (Math.random() * 11.0D) - 5;

    @OriginalMember(owner = "client!ur", name = "k", descriptor = "Lgw;")
    public static class118 field5456 = new class118();

    @OriginalMember(owner = "client!ur", name = "l", descriptor = "F")
    public static float field5457;

    @OriginalMember(owner = "client!ur", name = "o", descriptor = "F")
    public static float field5460;

    @OriginalMember(owner = "client!ur", name = "m", descriptor = "I")
    public static int field5458;

    @OriginalMember(owner = "client!ur", name = "u", descriptor = "I")
    public static int field5466;

    @OriginalMember(owner = "client!ur", name = "v", descriptor = "I")
    public static int field5467;

    @OriginalMember(owner = "client!ur", name = "x", descriptor = "I")
    public static int field5469;

    @OriginalMember(owner = "client!ur", name = "y", descriptor = "I")
    public static int field5470;

    @OriginalMember(owner = "client!ur", name = "B", descriptor = "I")
    public static int field5473;

    @OriginalMember(owner = "client!ur", name = "F", descriptor = "I")
    public static int field5477;

    @OriginalMember(owner = "client!ur", name = "G", descriptor = "I")
    public static int field5478;

    @OriginalMember(owner = "client!ur", name = "I", descriptor = "I")
    public static int field5480;

    @OriginalMember(owner = "client!ur", name = "J", descriptor = "I")
    public static int field5481;

    @OriginalMember(owner = "client!ur", name = "K", descriptor = "I")
    public static int field5482;

    @OriginalMember(owner = "client!ur", name = "M", descriptor = "I")
    public static int field5484;

    @OriginalMember(owner = "client!ur", name = "N", descriptor = "I")
    public static int field5485;

    @OriginalMember(owner = "client!ur", name = "q", descriptor = "Lop;")
    public static class128 field5462;

    @OriginalMember(owner = "client!ur", name = "d", descriptor = "Ltg;")
    public static class158 field5449;

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "Liw;")
    public static class212 field5447;

    @OriginalMember(owner = "client!ur", name = "f", descriptor = "Ljc;")
    public static class310 field5451;

    @OriginalMember(owner = "client!ur", name = "g", descriptor = "Lci;")
    public static class320 field5452;

    @OriginalMember(owner = "client!ur", name = "i", descriptor = "Lef;")
    private static class344 field5454;

    @OriginalMember(owner = "client!ur", name = "t", descriptor = "Lhl;")
    private static class375 field5465;

    @OriginalMember(owner = "client!ur", name = "c", descriptor = "Lag;")
    public static class491 field5448;

    @OriginalMember(owner = "client!ur", name = "h", descriptor = "Lrv;")
    public static class73 field5453;

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "Ljj;")
    private static class77 field5446;

    @OriginalMember(owner = "client!ur", name = "w", descriptor = "[B")
    private static byte[] field5468;

    @OriginalMember(owner = "client!ur", name = "C", descriptor = "[B")
    private static byte[] field5474;

    @OriginalMember(owner = "client!ur", name = "D", descriptor = "[B")
    private static byte[] field5475;

    @OriginalMember(owner = "client!ur", name = "H", descriptor = "[B")
    private static byte[] field5479;

    @OriginalMember(owner = "client!ur", name = "L", descriptor = "[B")
    private static byte[] field5483;

    @OriginalMember(owner = "client!ur", name = "A", descriptor = "[I")
    private static int[] field5472;

    @OriginalMember(owner = "client!ur", name = "E", descriptor = "[S")
    private static short[] field5476;

    @OriginalMember(owner = "client!ur", name = "O", descriptor = "[S")
    private static short[] field5486;

    @OriginalMember(owner = "client!ur", name = "r", descriptor = "[[[B")
    public static byte[][][] field5463;

    @OriginalMember(owner = "client!ur", name = "z", descriptor = "[[[Lwp;")
    private static class122[][][] field5471;

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lqa;II)V")
    public static final void method2316(class167 arg0, int arg1, int arg2) {
        class519 var3 = new class519(field5452.method2016("area", 84, field5449.field2417));
        int var4 = var3.method3072((byte) -122);
        int[] var5 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var5[var6] = var3.method3072((byte) -120);
        }
        int var7 = var3.method3072((byte) -121);
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method3072((byte) -127);
        }
        while (true) {
            while (var3.field7558 < var3.field7545.length) {
                if (var3.method3072((byte) -124) == 0) {
                    int var22 = var3.method3072((byte) -121);
                    int var23 = var3.method3072((byte) -121);
                    for (int var24 = 0; var24 < 64; var24++) {
                        for (int var25 = 0; var25 < 64; var25++) {
                            int var26 = var22 * 64 + var24 - field5467;
                            int var27 = var23 * 64 + var25 - field5469;
                            method2329(arg0, var3, var22, var23, var26, var27, var5, var8);
                        }
                    }
                } else {
                    int var28 = var3.method3072((byte) -120);
                    int var29 = var3.method3072((byte) -122);
                    int var30 = var3.method3072((byte) -119);
                    int var31 = var3.method3072((byte) -120);
                    for (int var32 = 0; var32 < 8; var32++) {
                        for (int var33 = 0; var33 < 8; var33++) {
                            int var34 = var28 * 64 + var30 * 8 + var32 - field5467;
                            int var35 = var29 * 64 + var31 * 8 + var33 - field5469;
                            method2329(arg0, var3, var28, var29, var34, var35, var5, var8);
                        }
                    }
                }
            }
            Object var10 = null;
            field5475 = new byte[field5485 * field5470];
            field5476 = new short[field5485 * field5470];
            for (int var11 = 0; var11 < 3; var11++) {
                byte[] var12 = new byte[field5485 * field5470];
                for (int var13 = 0; var13 < field5471[var11].length; var13++) {
                    for (int var19 = 0; var19 < field5471[var11][0].length; var19++) {
                        class122 var20 = field5471[var11][var13][var19];
                        if (var20 != null) {
                            for (class357 var21 = (class357) var20.method904(false); var21 != null; var21 = (class357) var20.method907(-1)) {
                                var12[(var19 * 64 + var21.field5189) * field5470 + var13 * 64 + var21.field5188] = (byte) var21.field5184;
                            }
                        }
                    }
                }
                method2337(var12, field5475, field5476, arg1, arg2);
                for (int var14 = 0; var14 < field5471[var11].length; var14++) {
                    for (int var15 = 0; var15 < field5471[var11][0].length; var15++) {
                        class122 var16 = field5471[var11][var14][var15];
                        if (var16 != null) {
                            for (class357 var17 = (class357) var16.method904(false); var17 != null; var17 = (class357) var16.method907(-1)) {
                                int var18 = (var15 * 64 + var17.field5189) * field5470 + var14 * 64 + var17.field5188;
                                var17.field5184 = (field5475[var18] & 0xFF) << 16 | field5476[var18] & 0xFFFF;
                                if (var17.field5184 != 0) {
                                    var17.field5184 |= 0xFF000000;
                                }
                            }
                        }
                    }
                }
            }
            method2337(field5479, field5475, field5476, arg1, arg2);
            field5479 = null;
            method2332();
            return;
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(I)V")
    public static final void method2317(int arg0) {
        field5449 = (class158) field5450.method2284(true, (long) arg0);
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lqa;)Lgw;")
    public static final class118 method2318(class167 arg0) {
        int var1 = field5466 - field5477;
        int var2 = field5481 - field5478;
        int var3 = (field5473 - field5480 << 16) / var1;
        int var4 = (field5484 - field5482 << 16) / var2;
        return method2321(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "()V")
    public static final void method2319() {
        int[] var0 = new int[3];
        for (int var1 = 0; var1 < field5462.field1994; var1++) {
            boolean var2 = field5449.method1104(field5462.field1995[var1] >> 28 & 0x3, field5462.field1995[var1] & 0x3FFF, var0, -1190, field5462.field1995[var1] >> 14 & 0x3FFF);
            if (var2) {
                class528 var3 = new class528(field5462.field1993[var1]);
                var3.field7714 = var0[1] - field5467;
                var3.field7719 = var0[2] - field5469;
                field5456.method866((byte) 10, var3);
            }
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lqa;Lau;IIII)V")
    private static final void method2320(class167 arg0, class528 arg1, int arg2, int arg3, int arg4, int arg5) {
        arg1.field7717 = ((arg1.field7714 - field5477) * arg2 + arg4 >> 16) + field5480;
        arg1.field7720 = field5484 - ((arg1.field7719 - field5478) * arg3 + arg5 >> 16);
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lqa;IIII)Lgw;")
    private static final class118 method2321(class167 arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class528 var5 = (class528) field5456.method863(-1); var5 != null; var5 = (class528) field5456.method865(-1)) {
            method2320(arg0, var5, arg1, arg2, arg3, arg4);
        }
        return field5456;
    }

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(I)Ltg;")
    public static final class158 method2322(int arg0) {
        return (class158) field5450.method2284(true, (long) arg0);
    }

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "()V")
    public static final void method2323() {
        field5479 = null;
        field5475 = null;
        field5476 = null;
        field5474 = null;
        field5483 = null;
        field5486 = null;
        field5468 = null;
        field5465 = null;
        field5471 = null;
        field5472 = null;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lqa;IIII[S[B)V")
    private static final void method2324(class167 arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        if (arg5 == null) {
            return;
        }
        for (int var7 = 0; var7 < arg5.length; var7++) {
            class261 var8 = field5453.method569((byte) 77, arg5[var7] & 0xFFFF);
            int var9 = var8.field3879;
            if (var9 != -1) {
                class368 var10 = field5448.method2881(var9, (byte) -52);
                class343 var11 = var10.method2257(var8.field3910 ? arg6[var7] >> 6 & 0x3 : 0, arg0, 13827, var8.field3881 ? var8.field3941 : false);
                if (var11 != null) {
                    int var12 = arg3 * var11.method376() >> 2;
                    int var13 = arg4 * var11.method374() >> 2;
                    if (var10.field5318) {
                        int var14 = var8.field3864;
                        int var15 = var8.field3859;
                        if ((arg6[var7] >> 6 & 0x1) == 1) {
                            int var16 = var14;
                            var14 = var15;
                            var15 = var16;
                        }
                        var12 = arg3 * var14;
                        var13 = arg4 * var15;
                    }
                    if (var12 != 0 && var13 != 0) {
                        if (var10.field5315 == 0) {
                            var11.method2169(arg1, arg2 + arg4 - var13, var12, var13);
                        } else {
                            var11.method372(arg1, arg2 + arg4 - var13, var12, var13, 0, var10.field5315 | 0xFF000000, 1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(II)Ltg;")
    public static final class158 method2325(int arg0, int arg1) {
        for (class158 var2 = (class158) field5450.method2285(122); var2 != null; var2 = (class158) field5450.method2283((byte) 11)) {
            if (var2.field2414 && var2.method1105(8366, arg0, arg1)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ur", name = "c", descriptor = "()V")
    public static final void method2326() {
        field5479 = new byte[field5485 * field5470];
        field5474 = new byte[field5485 * field5470];
        field5483 = new byte[field5485 * field5470];
        field5486 = new short[field5485 * field5470];
        field5468 = new byte[field5485 * field5470];
        field5465 = new class375(1024);
        field5471 = new class122[3][field5470 >> 6][field5485 >> 6];
        field5472 = new int[field5454.field5065 + 1];
    }

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(II)Lub;")
    public static final class18 method2327(int arg0, int arg1) {
        class18 var2 = new class18();
        for (class158 var3 = (class158) field5450.method2285(105); var3 != null; var3 = (class158) field5450.method2283((byte) 11)) {
            if (var3.field2414 && var3.method1105(8366, arg0, arg1)) {
                var2.method99(var3, 5604);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Ll;III)I")
    private static final int method2328(class16 arg0, int arg1, int arg2, int arg3) {
        class332 var4 = field5454.method2179(arg1, 6912);
        if (var4 == null) {
            return 0;
        }
        int var5 = var4.field4922;
        if (var5 >= 0 && arg0.method93((byte) -65, var5).field814) {
            var5 = -1;
        }
        int var9;
        if (var4.field4902 >= 0) {
            int var6 = var4.field4902;
            int var7 = (var6 & 0x7F) + arg3;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 127) {
                var7 = 127;
            }
            int var8 = (arg2 + var6 & 0xFC00) + (var6 & 0x380) + var7;
            var9 = class470.field6825[class119.method871(class159.method1126(96, 7851, var8), 0) & 0xFFFF] | 0xFF000000;
        } else if (var5 >= 0) {
            var9 = class470.field6825[class119.method871(class159.method1126(96, 7851, arg0.method93((byte) -110, var5).field828), 0) & 0xFFFF] | 0xFF000000;
        } else if (var4.field4906 == -1) {
            var9 = 0;
        } else {
            int var10 = var4.field4906;
            int var11 = (var10 & 0x7F) + arg3;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 127) {
                var11 = 127;
            }
            int var12 = (arg2 + var10 & 0xFC00) + (var10 & 0x380) + var11;
            var9 = class470.field6825[class119.method871(class159.method1126(96, 7851, var12), 0) & 0xFFFF] | 0xFF000000;
        }
        return var9;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lqa;Lwn;IIII[I[I)V")
    private static final void method2329(class167 arg0, class519 arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7) {
        int var8 = arg1.method3072((byte) -123);
        if ((var8 & 0x1) == 0) {
            boolean var9 = (var8 & 0x2) == 0;
            int var10 = var8 >> 2 & 0x3F;
            if (var10 != 62) {
                int var11;
                if (var10 == 63) {
                    var11 = arg1.method3072((byte) -123);
                } else if (var9) {
                    var11 = arg6[var10];
                } else {
                    var11 = arg7[var10];
                }
                if (var9) {
                    field5479[field5470 * arg5 + arg4] = (byte) var11;
                    field5474[field5470 * arg5 + arg4] = 0;
                } else {
                    field5474[field5470 * arg5 + arg4] = (byte) var11;
                    field5483[field5470 * arg5 + arg4] = 0;
                    field5479[field5470 * arg5 + arg4] = arg1.method3034((byte) 109);
                }
            }
            return;
        }
        int var12 = (var8 >> 1 & 0x3) + 1;
        boolean var13 = (var8 & 0x8) != 0;
        boolean var14 = (var8 & 0x10) != 0;
        for (int var15 = 0; var15 < var12; var15++) {
            int var16 = arg1.method3072((byte) -124);
            int var17 = 0;
            int var18 = 0;
            if (var13) {
                var17 = arg1.method3072((byte) -127);
                var18 = arg1.method3072((byte) -120);
            }
            int var19 = 0;
            if (var14) {
                var19 = arg1.method3072((byte) -122);
            }
            if (var15 == 0) {
                field5479[field5470 * arg5 + arg4] = (byte) var16;
                field5474[field5470 * arg5 + arg4] = (byte) var17;
                field5483[field5470 * arg5 + arg4] = (byte) var18;
                if (var19 == 1) {
                    field5486[field5470 * arg5 + arg4] = (short) (arg1.method3018(566990904) + 1);
                    field5468[field5470 * arg5 + arg4] = arg1.method3034((byte) 116);
                } else if (var19 > 1) {
                    field5486[field5470 * arg5 + arg4] = -1;
                    short[] var20 = new short[var19];
                    byte[] var21 = new byte[var19];
                    for (int var22 = 0; var22 < var19; var22++) {
                        var20[var22] = (short) arg1.method3018(566990904);
                        var21[var22] = arg1.method3034((byte) -84);
                    }
                    field5465.method2292((long) (arg4 << 16 | arg5), new class232(var20, var21), (byte) -128);
                }
            } else {
                short[] var23 = null;
                byte[] var24 = null;
                if (var19 > 0) {
                    var23 = new short[var19];
                    var24 = new byte[var19];
                    for (int var25 = 0; var25 < var19; var25++) {
                        var23[var25] = (short) arg1.method3018(566990904);
                        var24[var25] = arg1.method3034((byte) -113);
                    }
                }
                if (field5471[var15 - 1][arg2 - (field5467 >> 6)][arg3 - (field5469 >> 6)] == null) {
                    field5471[var15 - 1][arg2 - (field5467 >> 6)][arg3 - (field5469 >> 6)] = new class122();
                }
                class357 var26 = new class357(arg4 & 0x3F, arg5 & 0x3F, var16, var17, var18, var23, var24);
                field5471[var15 - 1][arg2 - (field5467 >> 6)][arg3 - (field5469 >> 6)].method905(var26, 0);
            }
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lci;Lef;Ljj;Lrv;Liw;Lag;Ljc;)V")
    public static final void method2330(class320 arg0, class344 arg1, class77 arg2, class73 arg3, class212 arg4, class491 arg5, class310 arg6) {
        field5452 = arg0;
        field5454 = arg1;
        field5446 = arg2;
        field5453 = arg3;
        field5447 = arg4;
        field5448 = arg5;
        field5451 = arg6;
        field5450.method2286((byte) 19);
        int var7 = field5452.method2043((byte) -52, "details");
        int[] var8 = field5452.method2022((byte) 121, var7);
        if (var8 != null) {
            for (int var9 = 0; var9 < var8.length; var9++) {
                class158 var10 = class132.method967(var7, 0, var8[var9], field5452);
                field5450.method2292((long) var10.field2416, var10, (byte) -127);
            }
        }
        class89.method660(0, true, false);
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method2331(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5477 = arg0 - field5467;
        field5481 = arg1 - field5469;
        field5466 = arg2 - field5467;
        field5478 = arg3 - field5469;
        field5480 = arg4;
        field5482 = arg5;
        field5473 = arg6;
        field5484 = arg7;
    }

    @OriginalMember(owner = "client!ur", name = "d", descriptor = "()V")
    private static final void method2332() {
        for (int var0 = 0; var0 < field5470; var0++) {
            for (int var11 = 0; var11 < field5485; var11++) {
                int var12 = field5486[field5470 * var11 + var0] & 0xFFFF;
                if (var12 != 0) {
                    if (var12 == 65535) {
                        class232 var13 = (class232) field5465.method2284(true, (long) (var0 << 16 | var11));
                        if (var13 != null) {
                            for (int var14 = 0; var14 < var13.field3473.length; var14++) {
                                class261 var15 = field5453.method569((byte) 110, var13.field3473[var14] & 0xFFFF);
                                int var16 = var15.field3878;
                                if (var15.field3926 != null) {
                                    class261 var17 = var15.method1679(field5451, 1349439392);
                                    if (var17 != null) {
                                        var16 = var17.field3878;
                                    }
                                }
                                if (var16 != -1) {
                                    class528 var18 = new class528(var16);
                                    var18.field7714 = var0;
                                    var18.field7719 = var11;
                                    field5456.method866((byte) 10, var18);
                                }
                            }
                        }
                    } else {
                        class261 var19 = field5453.method569((byte) 113, var12 - 1);
                        int var20 = var19.field3878;
                        if (var19.field3926 != null) {
                            class261 var21 = var19.method1679(field5451, 1349439392);
                            if (var21 != null) {
                                var20 = var21.field3878;
                            }
                        }
                        if (var20 != -1) {
                            class528 var22 = new class528(var20);
                            var22.field7714 = var0;
                            var22.field7719 = var11;
                            field5456.method866((byte) 10, var22);
                        }
                    }
                }
            }
        }
        for (int var1 = 0; var1 < 3; var1++) {
            for (int var2 = 0; var2 < field5471[0].length; var2++) {
                for (int var3 = 0; var3 < field5471[0][0].length; var3++) {
                    class122 var4 = field5471[var1][var2][var3];
                    if (var4 != null) {
                        for (class357 var5 = (class357) var4.method904(false); var5 != null; var5 = (class357) var4.method907(-1)) {
                            if (var5.field5186 != null) {
                                for (int var6 = 0; var6 < var5.field5186.length; var6++) {
                                    class261 var7 = field5453.method569((byte) 61, var5.field5186[var6] & 0xFFFF);
                                    int var8 = var7.field3878;
                                    if (var7.field3926 != null) {
                                        class261 var9 = var7.method1679(field5451, 1349439392);
                                        if (var9 != null) {
                                            var8 = var9.field3878;
                                        }
                                    }
                                    if (var8 != -1) {
                                        class528 var10 = new class528(var8);
                                        var10.field7714 = ((field5467 >> 6) + var2) * 64 + var5.field5188 - field5467;
                                        var10.field7719 = ((field5469 >> 6) + var3) * 64 + var5.field5189 - field5469;
                                        field5456.method866((byte) 10, var10);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Ll;II)V")
    public static final void method2333(class16 arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < field5454.field5065; var3++) {
            field5472[var3 + 1] = method2328(arg0, var3, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(Lqa;IIII)V")
    private static final void method2334(class167 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = field5466 - field5477;
        int var6 = field5481 - field5478;
        if (field5466 < field5470) {
            var5++;
        }
        if (field5481 < field5485) {
            var6++;
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var49 = (arg1 * var7 + arg3 >> 16) + field5480;
            int var50 = ((var7 + 1) * arg1 + arg3 >> 16) + field5480;
            int var51 = var50 - var49;
            if (var51 > 0) {
                int var52 = field5477 + var7;
                if (var52 >= 0 && var52 < field5470) {
                    for (int var53 = 0; var53 < var6; var53++) {
                        int var54 = field5484 - ((var53 + 1) * arg2 + arg4 >> 16);
                        int var55 = field5484 - (arg2 * var53 + arg4 >> 16);
                        int var56 = var55 - var54;
                        if (var56 > 0) {
                            int var57 = field5478 + var53;
                            int var58 = field5470 * var57 + var52;
                            int var59 = 0;
                            int var60 = 0;
                            int var61 = 0;
                            if (var57 >= 0 && var57 < field5485) {
                                var59 = (field5475[var58] & 0xFF) << 16 | field5476[var58] & 0xFFFF;
                                if (var59 != 0) {
                                    var59 |= 0xFF000000;
                                }
                                var60 = field5474[var58] & 0xFF;
                                var61 = field5486[var58] & 0xFFFF;
                            }
                            if (var59 == 0 && var60 == 0 && var61 == 0) {
                                int var62;
                                if (field5449.field2411 != -1) {
                                    var62 = field5449.field2411 | 0xFF000000;
                                } else if ((field5481 + var53 & 0x4) == (field5477 + var7 & 0x4)) {
                                    var62 = field5472[field5454.field5073 + 1];
                                } else {
                                    var62 = -11840664;
                                }
                                if (var62 == 0) {
                                    var62 = -16777216;
                                }
                                arg0.method215(var49, var54, var51, var56, var62, 0);
                            } else if (var61 <= 0) {
                                method2338(arg0, var49, var54, var51, var56, var59, var60, field5483[var58], null, null, true);
                            } else if (var61 == 65535) {
                                class232 var63 = (class232) field5465.method2284(true, (long) (var52 << 16 | var57));
                                if (var63 != null) {
                                    method2338(arg0, var49, var54, var51, var56, var59, var60, field5483[var58], var63.field3473, var63.field3472, true);
                                }
                            } else {
                                field5461[0] = (short) (var61 - 1);
                                field5455[0] = field5468[var58];
                                method2338(arg0, var49, var54, var51, var56, var59, var60, field5483[var58], field5461, field5455, true);
                            }
                        }
                    }
                } else {
                    for (int var64 = 0; var64 < var6; var64++) {
                        int var65 = field5484 - ((var64 + 1) * arg2 + arg4 >> 16);
                        int var66 = field5484 - (arg2 * var64 + arg4 >> 16);
                        int var67 = var66 - var65;
                        int var68;
                        if (field5449.field2411 != -1) {
                            var68 = field5449.field2411 | 0xFF000000;
                        } else if ((field5481 + var64 & 0x4) == (field5477 + var7 & 0x4)) {
                            var68 = field5472[field5454.field5073 + 1];
                        } else {
                            var68 = -11840664;
                        }
                        if (var68 == 0) {
                            var68 = -16777216;
                        }
                        arg0.method215(var49, var65, var51, var67, var68, 0);
                    }
                }
            }
        }
        for (int var8 = -16; var8 < var5 + 16; var8++) {
            int var38 = (arg1 * var8 + arg3 >> 16) + field5480;
            int var39 = ((var8 + 1) * arg1 + arg3 >> 16) + field5480;
            int var40 = var39 - var38;
            if (var40 > 0) {
                int var41 = field5477 + var8;
                if (var41 >= 0 && var41 < field5470) {
                    for (int var42 = -16; var42 < var6 + 16; var42++) {
                        int var43 = field5484 - ((var42 + 1) * arg2 + arg4 >> 16);
                        int var44 = field5484 - (arg2 * var42 + arg4 >> 16);
                        int var45 = var44 - var43;
                        if (var45 > 0) {
                            int var46 = field5478 + var42;
                            if (var46 >= 0 && var46 < field5485) {
                                int var47 = field5486[field5470 * var46 + var41] & 0xFFFF;
                                if (var47 <= 0) {
                                    method2324(arg0, var38, var43, var40, var45, null, null);
                                } else if (var47 == 65535) {
                                    class232 var48 = (class232) field5465.method2284(true, (long) (var41 << 16 | var46));
                                    if (var48 != null) {
                                        method2324(arg0, var38, var43, var40, var45, var48.field3473, var48.field3472);
                                    }
                                } else {
                                    field5461[0] = (short) (var47 - 1);
                                    field5455[0] = field5468[field5470 * var46 + var41];
                                    method2324(arg0, var38, var43, var40, var45, field5461, field5455);
                                }
                            }
                        }
                    }
                }
            }
        }
        int var9 = field5477 >> 6;
        int var10 = field5478 >> 6;
        if (var9 < 0) {
            var9 = 0;
        }
        if (var10 < 0) {
            var10 = 0;
        }
        int var11 = field5466 >> 6;
        int var12 = field5481 >> 6;
        if (var11 >= field5471[0].length) {
            var11 = field5471[0].length - 1;
        }
        if (var12 >= field5471[0][0].length) {
            var12 = field5471[0][0].length - 1;
        }
        for (int var13 = 0; var13 < 3; var13++) {
            for (int var14 = var9; var14 <= var11; var14++) {
                for (int var27 = var10; var27 <= var12; var27++) {
                    class122 var28 = field5471[var13][var14][var27];
                    if (var28 != null) {
                        int var29 = ((field5467 >> 6) + var14) * 64;
                        int var30 = ((field5469 >> 6) + var27) * 64;
                        for (class357 var31 = (class357) var28.method904(false); var31 != null; var31 = (class357) var28.method907(-1)) {
                            int var32 = var31.field5188 + var29 - field5467 - field5477;
                            int var33 = var31.field5189 + var30 - field5469 - field5478;
                            int var34 = (arg1 * var32 + arg3 >> 16) + field5480;
                            int var35 = ((var32 + 1) * arg1 + arg3 >> 16) + field5480;
                            int var36 = field5484 - ((var33 + 1) * arg2 + arg4 >> 16);
                            int var37 = field5484 - (arg2 * var33 + arg4 >> 16);
                            method2338(arg0, var34, var36, var35 - var34, var37 - var36, var31.field5184, var31.field5185 & 0xFF, var31.field5187, var31.field5186, var31.field5190, false);
                        }
                    }
                }
            }
            for (int var15 = var9; var15 <= var11; var15++) {
                for (int var16 = var10; var16 <= var12; var16++) {
                    class122 var17 = field5471[var13][var15][var16];
                    if (var17 != null) {
                        int var18 = ((field5467 >> 6) + var15) * 64;
                        int var19 = ((field5469 >> 6) + var16) * 64;
                        for (class357 var20 = (class357) var17.method904(false); var20 != null; var20 = (class357) var17.method907(-1)) {
                            int var21 = var20.field5188 + var18 - field5467 - field5477;
                            int var22 = var20.field5189 + var19 - field5469 - field5478;
                            int var23 = (arg1 * var21 + arg3 >> 16) + field5480;
                            int var24 = ((var21 + 1) * arg1 + arg3 >> 16) + field5480;
                            int var25 = field5484 - ((var22 + 1) * arg2 + arg4 >> 16);
                            int var26 = field5484 - (arg2 * var22 + arg4 >> 16);
                            method2324(arg0, var23, var25, var24 - var23, var26 - var25, var20.field5186, var20.field5190);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ur", name = "e", descriptor = "()V")
    public static void method2335() {
        field5454 = null;
        field5446 = null;
        field5453 = null;
        field5447 = null;
        field5448 = null;
        field5451 = null;
        field5449 = null;
        field5452 = null;
        field5450 = null;
        field5463 = null;
        field5461 = null;
        field5455 = null;
        field5462 = null;
        field5456 = null;
        field5472 = null;
        field5479 = null;
        field5475 = null;
        field5476 = null;
        field5474 = null;
        field5483 = null;
        field5486 = null;
        field5468 = null;
        field5465 = null;
        field5471 = null;
    }

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(Lqa;)V")
    public static final void method2336(class167 arg0) {
        int var1 = field5466 - field5477;
        int var2 = field5481 - field5478;
        int var3 = (field5473 - field5480 << 16) / var1;
        int var4 = (field5484 - field5482 << 16) / var2;
        method2334(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "([B[B[SII)V")
    private static final void method2337(byte[] arg0, byte[] arg1, short[] arg2, int arg3, int arg4) {
        int[] var5 = new int[field5485];
        int[] var6 = new int[field5485];
        int[] var7 = new int[field5485];
        int[] var8 = new int[field5485];
        int[] var9 = new int[field5485];
        for (int var10 = -5; var10 < field5470; var10++) {
            int var11 = var10 + 5;
            int var12 = var10 - 5;
            for (int var13 = 0; var13 < field5485; var13++) {
                int var10002;
                if (var11 < field5470) {
                    int var28 = arg0[field5470 * var13 + var11] & 0xFF;
                    if (var28 > 0) {
                        class521 var29 = field5446.method591(var28 - 1, (byte) 0);
                        var5[var13] += var29.field7603;
                        var6[var13] += var29.field7607;
                        var7[var13] += var29.field7595;
                        var8[var13] += var29.field7608;
                        var10002 = var9[var13]++;
                    }
                }
                if (var12 >= 0) {
                    int var30 = arg0[field5470 * var13 + var12] & 0xFF;
                    if (var30 > 0) {
                        class521 var31 = field5446.method591(var30 - 1, (byte) 0);
                        var5[var13] -= var31.field7603;
                        var6[var13] -= var31.field7607;
                        var7[var13] -= var31.field7595;
                        var8[var13] -= var31.field7608;
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
                for (int var19 = -5; var19 < field5485; var19++) {
                    int var20 = var19 + 5;
                    if (var20 < field5485) {
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
                        if ((arg0[field5470 * var19 + var10] & 0xFF) == 0) {
                            int var22 = field5470 * var19 + var10;
                            arg1[var22] = 0;
                            arg2[var22] = 0;
                        } else {
                            int var23 = var17 == 0 ? 0 : class177.method1237(var14 * 256 / var17, var15 / var18, var16 / var18, -91);
                            int var24 = (var23 & 0x7F) + arg4;
                            if (var24 < 0) {
                                var24 = 0;
                            } else if (var24 > 127) {
                                var24 = 127;
                            }
                            int var25 = (arg3 + var23 & 0xFC00) + (var23 & 0x380) + var24;
                            int var26 = field5470 * var19 + var10;
                            int var27 = class470.field6825[class119.method871(class120.method885(true, var25, 96), 0) & 0xFFFF];
                            arg1[var26] = (byte) (var27 >> 16 & 0xFF);
                            arg2[var26] = (short) (var27 & 0xFFFF);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lqa;IIIIIII[S[BZ)V")
    private static final void method2338(class167 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, short[] arg8, byte[] arg9, boolean arg10) {
        if (arg10 || arg5 != 0 || arg6 > 0) {
            if (arg6 == 0) {
                arg0.method215(arg1, arg2, arg3, arg4, arg5, 0);
            } else {
                int var11 = arg7 & 0x3F;
                if (var11 == 0 || arg3 <= 1 || arg4 <= 1) {
                    int var13 = field5472[arg6];
                    if (arg10 || var13 != 0) {
                        arg0.method215(arg1, arg2, arg3, arg4, var13, 0);
                    }
                } else {
                    int var12 = arg10 ? 0 : 1;
                    class73.method572(arg3, field5472[arg6], field5458, arg1, arg4, field5463, var11, (byte) -85, arg5, arg0, arg7 >> 6 & 0x3, arg2, var12);
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
                class261 var18 = field5453.method569((byte) 82, arg8[var16] & 0xFFFF);
                if (var18.field3879 == -1) {
                    int var19 = -3355444;
                    if (var18.field3872 == 1) {
                        var19 = -3407872;
                    }
                    int var20 = arg9[var16] >> 6 & 0x3;
                    if (var17 == 0) {
                        if (var20 == 0) {
                            arg0.method324(arg1, arg2, arg4, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method293(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method324(var14, arg2, arg4, var19, 0);
                        } else {
                            arg0.method293(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 2) {
                        if (var20 == 0) {
                            arg0.method324(arg1, arg2, arg4, -1, 0);
                            arg0.method293(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method324(var14, arg2, arg4, -1, 0);
                            arg0.method293(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method324(var14, arg2, arg4, -1, 0);
                            arg0.method293(arg1, var15, arg3, var19, 0);
                        } else {
                            arg0.method324(arg1, arg2, arg4, -1, 0);
                            arg0.method293(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 3) {
                        if (var20 == 0) {
                            arg0.method293(arg1, arg2, 1, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method293(var14, arg2, 1, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method293(var14, var15, 1, var19, 0);
                        } else {
                            arg0.method293(arg1, var15, 1, var19, 0);
                        }
                    } else if (var17 == 9) {
                        if (var20 == 0 || var20 == 2) {
                            for (int var22 = 0; var22 < arg4; var22++) {
                                arg0.method293(arg1 + var22, var15 - var22, 1, var19, 0);
                            }
                        } else {
                            for (int var21 = 0; var21 < arg4; var21++) {
                                arg0.method293(arg1 + var21, arg2 + var21, 1, var19, 0);
                            }
                        }
                    }
                }
            }
        }
    }
}
