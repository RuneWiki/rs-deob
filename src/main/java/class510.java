import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lba")
public class class510 {

    @OriginalMember(owner = "client!lba", name = "i", descriptor = "Lfaa;")
    private static class139 field6982 = new class139(16);

    @OriginalMember(owner = "client!lba", name = "k", descriptor = "[S")
    private static short[] field6984 = new short[1];

    @OriginalMember(owner = "client!lba", name = "n", descriptor = "I")
    public static int field6987 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!lba", name = "o", descriptor = "I")
    public static int field6988 = (int) (Math.random() * 11.0D) - 5;

    @OriginalMember(owner = "client!lba", name = "p", descriptor = "[B")
    private static byte[] field6989 = new byte[1];

    @OriginalMember(owner = "client!lba", name = "l", descriptor = "Lgca;")
    public static class227 field6985 = new class227();

    @OriginalMember(owner = "client!lba", name = "q", descriptor = "F")
    public static float field6990;

    @OriginalMember(owner = "client!lba", name = "r", descriptor = "F")
    public static float field6991;

    @OriginalMember(owner = "client!lba", name = "m", descriptor = "I")
    public static int field6986;

    @OriginalMember(owner = "client!lba", name = "t", descriptor = "I")
    public static int field6993;

    @OriginalMember(owner = "client!lba", name = "u", descriptor = "I")
    public static int field6994;

    @OriginalMember(owner = "client!lba", name = "w", descriptor = "I")
    public static int field6996;

    @OriginalMember(owner = "client!lba", name = "x", descriptor = "I")
    public static int field6997;

    @OriginalMember(owner = "client!lba", name = "y", descriptor = "I")
    public static int field6998;

    @OriginalMember(owner = "client!lba", name = "z", descriptor = "I")
    public static int field6999;

    @OriginalMember(owner = "client!lba", name = "D", descriptor = "I")
    public static int field7003;

    @OriginalMember(owner = "client!lba", name = "I", descriptor = "I")
    public static int field7008;

    @OriginalMember(owner = "client!lba", name = "J", descriptor = "I")
    public static int field7009;

    @OriginalMember(owner = "client!lba", name = "M", descriptor = "I")
    public static int field7012;

    @OriginalMember(owner = "client!lba", name = "N", descriptor = "I")
    public static int field7013;

    @OriginalMember(owner = "client!lba", name = "O", descriptor = "I")
    public static int field7014;

    @OriginalMember(owner = "client!lba", name = "f", descriptor = "Lqea;")
    public static class112 field6979;

    @OriginalMember(owner = "client!lba", name = "v", descriptor = "Lfaa;")
    private static class139 field6995;

    @OriginalMember(owner = "client!lba", name = "d", descriptor = "Lbt;")
    public static class40 field6977;

    @OriginalMember(owner = "client!lba", name = "g", descriptor = "Lew;")
    private static class456 field6980;

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "Lgq;")
    public static class476 field6974;

    @OriginalMember(owner = "client!lba", name = "s", descriptor = "Lpga;")
    public static class495 field6992;

    @OriginalMember(owner = "client!lba", name = "e", descriptor = "Lnf;")
    public static class535 field6978;

    @OriginalMember(owner = "client!lba", name = "c", descriptor = "Lfb;")
    private static class627 field6976;

    @OriginalMember(owner = "client!lba", name = "b", descriptor = "Lsea;")
    public static class648 field6975;

    @OriginalMember(owner = "client!lba", name = "h", descriptor = "Lge;")
    public static class660 field6981;

    @OriginalMember(owner = "client!lba", name = "A", descriptor = "[B")
    private static byte[] field7000;

    @OriginalMember(owner = "client!lba", name = "E", descriptor = "[B")
    private static byte[] field7004;

    @OriginalMember(owner = "client!lba", name = "F", descriptor = "[B")
    private static byte[] field7005;

    @OriginalMember(owner = "client!lba", name = "H", descriptor = "[B")
    private static byte[] field7007;

    @OriginalMember(owner = "client!lba", name = "K", descriptor = "[B")
    private static byte[] field7010;

    @OriginalMember(owner = "client!lba", name = "C", descriptor = "[I")
    private static int[] field7002;

    @OriginalMember(owner = "client!lba", name = "B", descriptor = "[S")
    private static short[] field7001;

    @OriginalMember(owner = "client!lba", name = "G", descriptor = "[S")
    private static short[] field7006;

    @OriginalMember(owner = "client!lba", name = "j", descriptor = "[[[B")
    public static byte[][][] field6983;

    @OriginalMember(owner = "client!lba", name = "L", descriptor = "[[[Lkr;")
    private static class693[][][] field7011;

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "()V", line = 5)
    private static final void method2909() {
        for (int var0 = 0; var0 < field7009; var0++) {
            for (int var11 = 0; var11 < field7013; var11++) {
                int var12 = field7001[field7009 * var11 + var0] & 0xFFFF;
                if (var12 != 0) {
                    if (var12 == 65535) {
                        class278 var13 = (class278) field6995.method970((byte) 89, (long) (var0 << 16 | var11));
                        if (var13 != null) {
                            for (int var14 = 0; var14 < var13.field3819.length; var14++) {
                                class301 var15 = field6974.method2685(var13.field3819[var14] & 0xFFFF, -67);
                                int var16 = var15.field4136;
                                if (var15.field4113 != null) {
                                    class301 var17 = var15.method1833(-92, field6978);
                                    if (var17 != null) {
                                        var16 = var17.field4136;
                                    }
                                }
                                if (var16 != -1) {
                                    class163 var18 = new class163(var16);
                                    var18.field2344 = var0;
                                    var18.field2343 = var11;
                                    field6985.method1441(var18, 0);
                                }
                            }
                        }
                    } else {
                        class301 var19 = field6974.method2685(var12 - 1, -110);
                        int var20 = var19.field4136;
                        if (var19.field4113 != null) {
                            class301 var21 = var19.method1833(-99, field6978);
                            if (var21 != null) {
                                var20 = var21.field4136;
                            }
                        }
                        if (var20 != -1) {
                            class163 var22 = new class163(var20);
                            var22.field2344 = var0;
                            var22.field2343 = var11;
                            field6985.method1441(var22, 0);
                        }
                    }
                }
            }
        }
        for (int var1 = 0; var1 < 3; var1++) {
            for (int var2 = 0; var2 < field7011[0].length; var2++) {
                for (int var3 = 0; var3 < field7011[0][0].length; var3++) {
                    class693 var4 = field7011[var1][var2][var3];
                    if (var4 != null) {
                        for (class177 var5 = (class177) var4.method3898((byte) -121); var5 != null; var5 = (class177) var4.method3902(true)) {
                            if (var5.field2536 != null) {
                                for (int var6 = 0; var6 < var5.field2536.length; var6++) {
                                    class301 var7 = field6974.method2685(var5.field2536[var6] & 0xFFFF, -87);
                                    int var8 = var7.field4136;
                                    if (var7.field4113 != null) {
                                        class301 var9 = var7.method1833(-90, field6978);
                                        if (var9 != null) {
                                            var8 = var9.field4136;
                                        }
                                    }
                                    if (var8 != -1) {
                                        class163 var10 = new class163(var8);
                                        var10.field2344 = ((field7003 >> 6) + var2) * 64 + var5.field2541 - field7003;
                                        var10.field2343 = ((field7012 >> 6) + var3) * 64 + var5.field2539 - field7012;
                                        field6985.method1441(var10, 0);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lba", name = "b", descriptor = "()V", line = 161)
    public static final void method2910() {
        field7010 = new byte[field7013 * field7009];
        field7005 = new byte[field7013 * field7009];
        field7007 = new byte[field7013 * field7009];
        field7001 = new short[field7013 * field7009];
        field7000 = new byte[field7013 * field7009];
        field6995 = new class139(1024);
        field7011 = new class693[3][field7009 >> 6][field7013 >> 6];
        field7002 = new int[field6980.field6332 + 1];
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(IIIIIIII)V", line = 171)
    public static final void method2911(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field6993 = arg0 - field7003;
        field6998 = arg1 - field7012;
        field7008 = arg2 - field7003;
        field6997 = arg3 - field7012;
        field6996 = arg4;
        field6999 = arg5;
        field6994 = arg6;
        field7014 = arg7;
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(II)Lqea;", line = 183)
    public static final class112 method2912(int arg0, int arg1) {
        for (class112 var2 = (class112) field6982.method977(0); var2 != null; var2 = (class112) field6982.method975(-1)) {
            if (var2.field1551 && var2.method813(arg1, 3134, arg0)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(I)V", line = 195)
    public static final void method2913(int arg0) {
        field6979 = (class112) field6982.method970((byte) 89, (long) arg0);
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "([B[B[SII)V", line = 199)
    private static final void method2914(byte[] arg0, byte[] arg1, short[] arg2, int arg3, int arg4) {
        int[] var5 = new int[field7013];
        int[] var6 = new int[field7013];
        int[] var7 = new int[field7013];
        int[] var8 = new int[field7013];
        int[] var9 = new int[field7013];
        for (int var10 = -5; var10 < field7009; var10++) {
            int var11 = var10 + 5;
            int var12 = var10 - 5;
            for (int var13 = 0; var13 < field7013; var13++) {
                int var10002;
                if (var11 < field7009) {
                    int var28 = arg0[field7009 * var13 + var11] & 0xFF;
                    if (var28 > 0) {
                        class386 var29 = field6976.method3501((byte) -127, var28 - 1);
                        var5[var13] += var29.field5475;
                        var6[var13] += var29.field5462;
                        var7[var13] += var29.field5467;
                        var8[var13] += var29.field5468;
                        var10002 = var9[var13]++;
                    }
                }
                if (var12 >= 0) {
                    int var30 = arg0[field7009 * var13 + var12] & 0xFF;
                    if (var30 > 0) {
                        class386 var31 = field6976.method3501((byte) -122, var30 - 1);
                        var5[var13] -= var31.field5475;
                        var6[var13] -= var31.field5462;
                        var7[var13] -= var31.field5467;
                        var8[var13] -= var31.field5468;
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
                for (int var19 = -5; var19 < field7013; var19++) {
                    int var20 = var19 + 5;
                    if (var20 < field7013) {
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
                        if ((arg0[field7009 * var19 + var10] & 0xFF) == 0) {
                            int var22 = field7009 * var19 + var10;
                            arg1[var22] = 0;
                            arg2[var22] = 0;
                        } else {
                            int var23 = var17 == 0 ? 0 : class664.method3756(var14 * 256 / var17, var16 / var18, var15 / var18, 4);
                            int var24 = (var23 & 0x7F) + arg4;
                            if (var24 < 0) {
                                var24 = 0;
                            } else if (var24 > 127) {
                                var24 = 127;
                            }
                            int var25 = (arg3 + var23 & 0xFC00) + (var23 & 0x380) + var24;
                            int var26 = field7009 * var19 + var10;
                            int var27 = class244.field3322[class199.method1317(class604.method3397(0, var25, 96), 2124276899) & 0xFFFF];
                            arg1[var26] = (byte) (var27 >> 16 & 0xFF);
                            arg2[var26] = (short) (var27 & 0xFFFF);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(Lfa;III)I", line = 343)
    private static final int method2915(class212 arg0, int arg1, int arg2, int arg3) {
        class466 var4 = field6980.method2601(arg1, 4);
        if (var4 == null) {
            return 0;
        }
        int var5 = var4.field6399;
        if (var5 >= 0 && arg0.method1365(-17951, var5).field9794) {
            var5 = -1;
        }
        int var9;
        if (var4.field6414 >= 0) {
            int var6 = var4.field6414;
            int var7 = (var6 & 0x7F) + arg3;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 127) {
                var7 = 127;
            }
            int var8 = (arg2 + var6 & 0xFC00) + (var6 & 0x380) + var7;
            var9 = class244.field3322[class199.method1317(class58.method487((byte) 102, 96, var8), 2124276899) & 0xFFFF] | 0xFF000000;
        } else if (var5 >= 0) {
            var9 = class244.field3322[class199.method1317(class58.method487((byte) 102, 96, arg0.method1365(-17951, var5).field9777), 2124276899) & 0xFFFF] | 0xFF000000;
        } else if (var4.field6403 == -1) {
            var9 = 0;
        } else {
            int var10 = var4.field6403;
            int var11 = (var10 & 0x7F) + arg3;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 127) {
                var11 = 127;
            }
            int var12 = (arg2 + var10 & 0xFC00) + (var10 & 0x380) + var11;
            var9 = class244.field3322[class199.method1317(class58.method487((byte) 102, 96, var12), 2124276899) & 0xFFFF] | 0xFF000000;
        }
        return var9;
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(Lr;IIII)Lgca;", line = 401)
    private static final class227 method2916(class166 arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class163 var5 = (class163) field6985.method1436(28964); var5 != null; var5 = (class163) field6985.method1443((byte) 6)) {
            method2930(arg0, var5, arg1, arg2, arg3, arg4);
        }
        return field6985;
    }

    @OriginalMember(owner = "client!lba", name = "c", descriptor = "()V", line = 414)
    public static void method2917() {
        field6980 = null;
        field6976 = null;
        field6974 = null;
        field6981 = null;
        field6977 = null;
        field6978 = null;
        field6979 = null;
        field6975 = null;
        field6982 = null;
        field6983 = null;
        field6984 = null;
        field6989 = null;
        field6992 = null;
        field6985 = null;
        field7002 = null;
        field7010 = null;
        field7004 = null;
        field7006 = null;
        field7005 = null;
        field7007 = null;
        field7001 = null;
        field7000 = null;
        field6995 = null;
        field7011 = null;
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(Lr;)V", line = 441)
    public static final void method2918(class166 arg0) {
        int var1 = field7008 - field6993;
        int var2 = field6998 - field6997;
        int var3 = (field6994 - field6996 << 16) / var1;
        int var4 = (field7014 - field6999 << 16) / var2;
        method2927(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!lba", name = "d", descriptor = "()V", line = 452)
    public static final void method2919() {
        int[] var0 = new int[3];
        for (int var1 = 0; var1 < field6992.field6742; var1++) {
            boolean var2 = field6979.method814(field6992.field6741[var1] & 0x3FFF, field6992.field6741[var1] >> 28 & 0x3, var0, field6992.field6741[var1] >> 14 & 0x3FFF, -1);
            if (var2) {
                class163 var3 = new class163(field6992.field6747[var1]);
                var3.field2344 = var0[1] - field7003;
                var3.field2343 = var0[2] - field7012;
                field6985.method1441(var3, 0);
            }
        }
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(Lfa;II)V", line = 476)
    public static final void method2920(class212 arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < field6980.field6332; var3++) {
            field7002[var3 + 1] = method2915(arg0, var3, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(Lr;IIIIIII[S[BZ)V", line = 487)
    private static final void method2921(class166 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, short[] arg8, byte[] arg9, boolean arg10) {
        if (arg10 || arg5 != 0 || arg6 > 0) {
            if (arg6 == 0) {
                arg0.method110(arg1, arg2, arg3, arg4, arg5, 0);
            } else {
                int var11 = arg7 & 0x3F;
                if (var11 == 0 || arg3 <= 1 || arg4 <= 1) {
                    int var13 = field7002[arg6];
                    if (arg10 || var13 != 0) {
                        arg0.method110(arg1, arg2, arg3, arg4, var13, 0);
                    }
                } else {
                    int var12 = arg10 ? 0 : 1;
                    class330.method1960(true, arg4, arg2, field6986, var12, var11, arg1, field7002[arg6], arg5, arg3, arg0, field6983, arg7 >> 6 & 0x3);
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
                class301 var18 = field6974.method2685(arg8[var16] & 0xFFFF, -110);
                if (var18.field4117 == -1) {
                    int var19 = -3355444;
                    if (var18.field4164 == 1) {
                        var19 = -3407872;
                    }
                    int var20 = arg9[var16] >> 6 & 0x3;
                    if (var17 == 0) {
                        if (var20 == 0) {
                            arg0.method205(arg1, arg2, arg4, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method118(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method205(var14, arg2, arg4, var19, 0);
                        } else {
                            arg0.method118(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 2) {
                        if (var20 == 0) {
                            arg0.method205(arg1, arg2, arg4, -1, 0);
                            arg0.method118(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method205(var14, arg2, arg4, -1, 0);
                            arg0.method118(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method205(var14, arg2, arg4, -1, 0);
                            arg0.method118(arg1, var15, arg3, var19, 0);
                        } else {
                            arg0.method205(arg1, arg2, arg4, -1, 0);
                            arg0.method118(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 3) {
                        if (var20 == 0) {
                            arg0.method118(arg1, arg2, 1, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method118(var14, arg2, 1, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method118(var14, var15, 1, var19, 0);
                        } else {
                            arg0.method118(arg1, var15, 1, var19, 0);
                        }
                    } else if (var17 == 9) {
                        if (var20 == 0 || var20 == 2) {
                            for (int var22 = 0; var22 < arg4; var22++) {
                                arg0.method118(arg1 + var22, var15 - var22, 1, var19, 0);
                            }
                        } else {
                            for (int var21 = 0; var21 < arg4; var21++) {
                                arg0.method118(arg1 + var21, arg2 + var21, 1, var19, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(Lr;IIII[S[B)V", line = 648)
    private static final void method2922(class166 arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        if (arg5 == null) {
            return;
        }
        for (int var7 = 0; var7 < arg5.length; var7++) {
            class301 var8 = field6974.method2685(arg5[var7] & 0xFFFF, -95);
            int var9 = var8.field4117;
            if (var9 != -1) {
                class122 var10 = field6977.method358((byte) -26, var9);
                class702 var11 = var10.method878(var8.field4135 ? arg6[var7] >> 6 & 0x3 : 0, arg0, (byte) -105, var8.field4100 ? var8.field4118 : false);
                if (var11 != null) {
                    int var12 = arg3 * var11.method1660() >> 2;
                    int var13 = arg4 * var11.method1661() >> 2;
                    if (var10.field1679) {
                        int var14 = var8.field4109;
                        int var15 = var8.field4119;
                        if ((arg6[var7] >> 6 & 0x1) == 1) {
                            int var16 = var14;
                            var14 = var15;
                            var15 = var16;
                        }
                        var12 = arg3 * var14;
                        var13 = arg4 * var15;
                    }
                    if (var12 != 0 && var13 != 0) {
                        if (var10.field1677 == 0) {
                            var11.method3932(arg1, arg2 + arg4 - var13, var12, var13);
                        } else {
                            var11.method3934(arg1, arg2 + arg4 - var13, var12, var13, 0, var10.field1677 | 0xFF000000, 1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lba", name = "e", descriptor = "()V", line = 706)
    public static final void method2923() {
        field7010 = null;
        field7004 = null;
        field7006 = null;
        field7005 = null;
        field7007 = null;
        field7001 = null;
        field7000 = null;
        field6995 = null;
        field7011 = null;
        field7002 = null;
    }

    @OriginalMember(owner = "client!lba", name = "b", descriptor = "(Lr;)Lgca;", line = 719)
    public static final class227 method2924(class166 arg0) {
        int var1 = field7008 - field6993;
        int var2 = field6998 - field6997;
        int var3 = (field6994 - field6996 << 16) / var1;
        int var4 = (field7014 - field6999 << 16) / var2;
        return method2916(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(Lr;Lac;IIII[I[I)V", line = 731)
    private static final void method2925(class166 arg0, class501 arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7) {
        int var8 = arg1.method2874((byte) -75);
        if ((var8 & 0x1) == 0) {
            boolean var9 = (var8 & 0x2) == 0;
            int var10 = var8 >> 2 & 0x3F;
            if (var10 != 62) {
                int var11;
                if (var10 == 63) {
                    var11 = arg1.method2874((byte) -75);
                } else if (var9) {
                    var11 = arg6[var10];
                } else {
                    var11 = arg7[var10];
                }
                if (var9) {
                    field7010[field7009 * arg5 + arg4] = (byte) var11;
                    field7005[field7009 * arg5 + arg4] = 0;
                } else {
                    field7005[field7009 * arg5 + arg4] = (byte) var11;
                    field7007[field7009 * arg5 + arg4] = 0;
                    field7010[field7009 * arg5 + arg4] = arg1.method2863(93);
                }
            }
            return;
        }
        int var12 = (var8 >> 1 & 0x3) + 1;
        boolean var13 = (var8 & 0x8) != 0;
        boolean var14 = (var8 & 0x10) != 0;
        for (int var15 = 0; var15 < var12; var15++) {
            int var16 = arg1.method2874((byte) -75);
            int var17 = 0;
            int var18 = 0;
            if (var13) {
                var17 = arg1.method2874((byte) -75);
                var18 = arg1.method2874((byte) -75);
            }
            int var19 = 0;
            if (var14) {
                var19 = arg1.method2874((byte) -75);
            }
            if (var15 == 0) {
                field7010[field7009 * arg5 + arg4] = (byte) var16;
                field7005[field7009 * arg5 + arg4] = (byte) var17;
                field7007[field7009 * arg5 + arg4] = (byte) var18;
                if (var19 == 1) {
                    field7001[field7009 * arg5 + arg4] = (short) (arg1.method2845(-1) + 1);
                    field7000[field7009 * arg5 + arg4] = arg1.method2863(92);
                } else if (var19 > 1) {
                    field7001[field7009 * arg5 + arg4] = -1;
                    short[] var20 = new short[var19];
                    byte[] var21 = new byte[var19];
                    for (int var22 = 0; var22 < var19; var22++) {
                        var20[var22] = (short) arg1.method2845(-1);
                        var21[var22] = arg1.method2863(88);
                    }
                    field6995.method968((long) (arg4 << 16 | arg5), new class278(var20, var21), -1);
                }
            } else {
                short[] var23 = null;
                byte[] var24 = null;
                if (var19 > 0) {
                    var23 = new short[var19];
                    var24 = new byte[var19];
                    for (int var25 = 0; var25 < var19; var25++) {
                        var23[var25] = (short) arg1.method2845(-1);
                        var24[var25] = arg1.method2863(89);
                    }
                }
                if (field7011[var15 - 1][arg2 - (field7003 >> 6)][arg3 - (field7012 >> 6)] == null) {
                    field7011[var15 - 1][arg2 - (field7003 >> 6)][arg3 - (field7012 >> 6)] = new class693();
                }
                class177 var26 = new class177(arg4 & 0x3F, arg5 & 0x3F, var16, var17, var18, var23, var24);
                field7011[var15 - 1][arg2 - (field7003 >> 6)][arg3 - (field7012 >> 6)].method3906(var26, (byte) -19);
            }
        }
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(Lr;II)V", line = 866)
    public static final void method2926(class166 arg0, int arg1, int arg2) {
        class501 var3 = new class501(field6975.method3642(101, "area", field6979.field1557));
        int var4 = var3.method2874((byte) -75);
        int[] var5 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var5[var6] = var3.method2874((byte) -75);
        }
        int var7 = var3.method2874((byte) -75);
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method2874((byte) -75);
        }
        while (true) {
            while (var3.field6892 < var3.field6855.length) {
                if (var3.method2874((byte) -75) == 0) {
                    int var22 = var3.method2874((byte) -75);
                    int var23 = var3.method2874((byte) -75);
                    for (int var24 = 0; var24 < 64; var24++) {
                        for (int var25 = 0; var25 < 64; var25++) {
                            int var26 = var22 * 64 + var24 - field7003;
                            int var27 = var23 * 64 + var25 - field7012;
                            method2925(arg0, var3, var22, var23, var26, var27, var5, var8);
                        }
                    }
                } else {
                    int var28 = var3.method2874((byte) -75);
                    int var29 = var3.method2874((byte) -75);
                    int var30 = var3.method2874((byte) -75);
                    int var31 = var3.method2874((byte) -75);
                    for (int var32 = 0; var32 < 8; var32++) {
                        for (int var33 = 0; var33 < 8; var33++) {
                            int var34 = var28 * 64 + var30 * 8 + var32 - field7003;
                            int var35 = var29 * 64 + var31 * 8 + var33 - field7012;
                            method2925(arg0, var3, var28, var29, var34, var35, var5, var8);
                        }
                    }
                }
            }
            Object var10 = null;
            field7004 = new byte[field7013 * field7009];
            field7006 = new short[field7013 * field7009];
            for (int var11 = 0; var11 < 3; var11++) {
                byte[] var12 = new byte[field7013 * field7009];
                for (int var13 = 0; var13 < field7011[var11].length; var13++) {
                    for (int var19 = 0; var19 < field7011[var11][0].length; var19++) {
                        class693 var20 = field7011[var11][var13][var19];
                        if (var20 != null) {
                            for (class177 var21 = (class177) var20.method3898((byte) -31); var21 != null; var21 = (class177) var20.method3902(true)) {
                                var12[(var19 * 64 + var21.field2539) * field7009 + var13 * 64 + var21.field2541] = (byte) var21.field2540;
                            }
                        }
                    }
                }
                method2914(var12, field7004, field7006, arg1, arg2);
                for (int var14 = 0; var14 < field7011[var11].length; var14++) {
                    for (int var15 = 0; var15 < field7011[var11][0].length; var15++) {
                        class693 var16 = field7011[var11][var14][var15];
                        if (var16 != null) {
                            for (class177 var17 = (class177) var16.method3898((byte) -96); var17 != null; var17 = (class177) var16.method3902(true)) {
                                int var18 = (var15 * 64 + var17.field2539) * field7009 + var14 * 64 + var17.field2541;
                                var17.field2540 = (field7004[var18] & 0xFF) << 16 | field7006[var18] & 0xFFFF;
                                if (var17.field2540 != 0) {
                                    var17.field2540 |= 0xFF000000;
                                }
                            }
                        }
                    }
                }
            }
            method2914(field7010, field7004, field7006, arg1, arg2);
            field7010 = null;
            method2909();
            return;
        }
    }

    @OriginalMember(owner = "client!lba", name = "b", descriptor = "(Lr;IIII)V", line = 1046)
    private static final void method2927(class166 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = field7008 - field6993;
        int var6 = field6998 - field6997;
        if (field7008 < field7009) {
            var5++;
        }
        if (field6998 < field7013) {
            var6++;
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var49 = (arg1 * var7 + arg3 >> 16) + field6996;
            int var50 = ((var7 + 1) * arg1 + arg3 >> 16) + field6996;
            int var51 = var50 - var49;
            if (var51 > 0) {
                int var52 = field6993 + var7;
                if (var52 >= 0 && var52 < field7009) {
                    for (int var53 = 0; var53 < var6; var53++) {
                        int var54 = field7014 - ((var53 + 1) * arg2 + arg4 >> 16);
                        int var55 = field7014 - (arg2 * var53 + arg4 >> 16);
                        int var56 = var55 - var54;
                        if (var56 > 0) {
                            int var57 = field6997 + var53;
                            int var58 = field7009 * var57 + var52;
                            int var59 = 0;
                            int var60 = 0;
                            int var61 = 0;
                            if (var57 >= 0 && var57 < field7013) {
                                var59 = (field7004[var58] & 0xFF) << 16 | field7006[var58] & 0xFFFF;
                                if (var59 != 0) {
                                    var59 |= 0xFF000000;
                                }
                                var60 = field7005[var58] & 0xFF;
                                var61 = field7001[var58] & 0xFFFF;
                            }
                            if (var59 == 0 && var60 == 0 && var61 == 0) {
                                int var62;
                                if (field6979.field1548 != -1) {
                                    var62 = field6979.field1548 | 0xFF000000;
                                } else if ((field6998 + var53 & 0x4) == (field6993 + var7 & 0x4)) {
                                    var62 = field7002[field6980.field6339 + 1];
                                } else {
                                    var62 = -11840664;
                                }
                                if (var62 == 0) {
                                    var62 = -16777216;
                                }
                                arg0.method110(var49, var54, var51, var56, var62, 0);
                            } else if (var61 <= 0) {
                                method2921(arg0, var49, var54, var51, var56, var59, var60, field7007[var58], null, null, true);
                            } else if (var61 == 65535) {
                                class278 var63 = (class278) field6995.method970((byte) 89, (long) (var52 << 16 | var57));
                                if (var63 != null) {
                                    method2921(arg0, var49, var54, var51, var56, var59, var60, field7007[var58], var63.field3819, var63.field3820, true);
                                }
                            } else {
                                field6984[0] = (short) (var61 - 1);
                                field6989[0] = field7000[var58];
                                method2921(arg0, var49, var54, var51, var56, var59, var60, field7007[var58], field6984, field6989, true);
                            }
                        }
                    }
                } else {
                    for (int var64 = 0; var64 < var6; var64++) {
                        int var65 = field7014 - ((var64 + 1) * arg2 + arg4 >> 16);
                        int var66 = field7014 - (arg2 * var64 + arg4 >> 16);
                        int var67 = var66 - var65;
                        int var68;
                        if (field6979.field1548 != -1) {
                            var68 = field6979.field1548 | 0xFF000000;
                        } else if ((field6998 + var64 & 0x4) == (field6993 + var7 & 0x4)) {
                            var68 = field7002[field6980.field6339 + 1];
                        } else {
                            var68 = -11840664;
                        }
                        if (var68 == 0) {
                            var68 = -16777216;
                        }
                        arg0.method110(var49, var65, var51, var67, var68, 0);
                    }
                }
            }
        }
        for (int var8 = -16; var8 < var5 + 16; var8++) {
            int var38 = (arg1 * var8 + arg3 >> 16) + field6996;
            int var39 = ((var8 + 1) * arg1 + arg3 >> 16) + field6996;
            int var40 = var39 - var38;
            if (var40 > 0) {
                int var41 = field6993 + var8;
                if (var41 >= 0 && var41 < field7009) {
                    for (int var42 = -16; var42 < var6 + 16; var42++) {
                        int var43 = field7014 - ((var42 + 1) * arg2 + arg4 >> 16);
                        int var44 = field7014 - (arg2 * var42 + arg4 >> 16);
                        int var45 = var44 - var43;
                        if (var45 > 0) {
                            int var46 = field6997 + var42;
                            if (var46 >= 0 && var46 < field7013) {
                                int var47 = field7001[field7009 * var46 + var41] & 0xFFFF;
                                if (var47 <= 0) {
                                    method2922(arg0, var38, var43, var40, var45, null, null);
                                } else if (var47 == 65535) {
                                    class278 var48 = (class278) field6995.method970((byte) 89, (long) (var41 << 16 | var46));
                                    if (var48 != null) {
                                        method2922(arg0, var38, var43, var40, var45, var48.field3819, var48.field3820);
                                    }
                                } else {
                                    field6984[0] = (short) (var47 - 1);
                                    field6989[0] = field7000[field7009 * var46 + var41];
                                    method2922(arg0, var38, var43, var40, var45, field6984, field6989);
                                }
                            }
                        }
                    }
                }
            }
        }
        int var9 = field6993 >> 6;
        int var10 = field6997 >> 6;
        if (var9 < 0) {
            var9 = 0;
        }
        if (var10 < 0) {
            var10 = 0;
        }
        int var11 = field7008 >> 6;
        int var12 = field6998 >> 6;
        if (var11 >= field7011[0].length) {
            var11 = field7011[0].length - 1;
        }
        if (var12 >= field7011[0][0].length) {
            var12 = field7011[0][0].length - 1;
        }
        for (int var13 = 0; var13 < 3; var13++) {
            for (int var14 = var9; var14 <= var11; var14++) {
                for (int var27 = var10; var27 <= var12; var27++) {
                    class693 var28 = field7011[var13][var14][var27];
                    if (var28 != null) {
                        int var29 = ((field7003 >> 6) + var14) * 64;
                        int var30 = ((field7012 >> 6) + var27) * 64;
                        for (class177 var31 = (class177) var28.method3898((byte) -106); var31 != null; var31 = (class177) var28.method3902(true)) {
                            int var32 = var31.field2541 + var29 - field7003 - field6993;
                            int var33 = var31.field2539 + var30 - field7012 - field6997;
                            int var34 = (arg1 * var32 + arg3 >> 16) + field6996;
                            int var35 = ((var32 + 1) * arg1 + arg3 >> 16) + field6996;
                            int var36 = field7014 - ((var33 + 1) * arg2 + arg4 >> 16);
                            int var37 = field7014 - (arg2 * var33 + arg4 >> 16);
                            method2921(arg0, var34, var36, var35 - var34, var37 - var36, var31.field2540, var31.field2538 & 0xFF, var31.field2537, var31.field2536, var31.field2535, false);
                        }
                    }
                }
            }
            for (int var15 = var9; var15 <= var11; var15++) {
                for (int var16 = var10; var16 <= var12; var16++) {
                    class693 var17 = field7011[var13][var15][var16];
                    if (var17 != null) {
                        int var18 = ((field7003 >> 6) + var15) * 64;
                        int var19 = ((field7012 >> 6) + var16) * 64;
                        for (class177 var20 = (class177) var17.method3898((byte) -128); var20 != null; var20 = (class177) var17.method3902(true)) {
                            int var21 = var20.field2541 + var18 - field7003 - field6993;
                            int var22 = var20.field2539 + var19 - field7012 - field6997;
                            int var23 = (arg1 * var21 + arg3 >> 16) + field6996;
                            int var24 = ((var21 + 1) * arg1 + arg3 >> 16) + field6996;
                            int var25 = field7014 - ((var22 + 1) * arg2 + arg4 >> 16);
                            int var26 = field7014 - (arg2 * var22 + arg4 >> 16);
                            method2922(arg0, var23, var25, var24 - var23, var26 - var25, var20.field2536, var20.field2535);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lba", name = "b", descriptor = "(II)Lje;", line = 1391)
    public static final class367 method2928(int arg0, int arg1) {
        class367 var2 = new class367();
        for (class112 var3 = (class112) field6982.method977(0); var3 != null; var3 = (class112) field6982.method975(-1)) {
            if (var3.field1551 && var3.method813(arg1, 3134, arg0)) {
                var2.method2123(var3, -1);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(Lsea;Lew;Lfb;Lgq;Lge;Lbt;Lnf;)V", line = 1407)
    public static final void method2929(class648 arg0, class456 arg1, class627 arg2, class476 arg3, class660 arg4, class40 arg5, class535 arg6) {
        field6975 = arg0;
        field6980 = arg1;
        field6976 = arg2;
        field6974 = arg3;
        field6981 = arg4;
        field6977 = arg5;
        field6978 = arg6;
        field6982.method974(-20470);
        int var7 = field6975.method3643("details", 1);
        int[] var8 = field6975.method3655(0, var7);
        if (var8 != null) {
            for (int var9 = 0; var9 < var8.length; var9++) {
                class112 var10 = class396.method2326(8, field6975, var7, var8[var9]);
                field6982.method968((long) var10.field1550, var10, -1);
            }
        }
        class581.method3314(false, true, 121);
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(Lr;Lwp;IIII)V", line = 1441)
    private static final void method2930(class166 arg0, class163 arg1, int arg2, int arg3, int arg4, int arg5) {
        arg1.field2339 = ((arg1.field2344 - field6993) * arg2 + arg4 >> 16) + field6996;
        arg1.field2341 = field7014 - ((arg1.field2343 - field6997) * arg3 + arg5 >> 16);
    }

    @OriginalMember(owner = "client!lba", name = "b", descriptor = "(I)Lqea;", line = 1445)
    public static final class112 method2931(int arg0) {
        return (class112) field6982.method970((byte) 89, (long) arg0);
    }
}
