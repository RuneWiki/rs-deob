import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class339 {

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "Llb;")
    private static class465 field4668 = new class465(16);

    @OriginalMember(owner = "client!tb", name = "j", descriptor = "[S")
    private static short[] field4672 = new short[1];

    @OriginalMember(owner = "client!tb", name = "q", descriptor = "I")
    public static int field4679 = (int) (Math.random() * 11.0D) - 5;

    @OriginalMember(owner = "client!tb", name = "o", descriptor = "I")
    public static int field4677 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!tb", name = "k", descriptor = "[B")
    private static byte[] field4673 = new byte[1];

    @OriginalMember(owner = "client!tb", name = "s", descriptor = "Lbu;")
    public static class19 field4681 = new class19();

    @OriginalMember(owner = "client!tb", name = "m", descriptor = "F")
    public static float field4675;

    @OriginalMember(owner = "client!tb", name = "p", descriptor = "F")
    public static float field4678;

    @OriginalMember(owner = "client!tb", name = "l", descriptor = "I")
    public static int field4674;

    @OriginalMember(owner = "client!tb", name = "t", descriptor = "I")
    public static int field4682;

    @OriginalMember(owner = "client!tb", name = "v", descriptor = "I")
    public static int field4684;

    @OriginalMember(owner = "client!tb", name = "w", descriptor = "I")
    public static int field4685;

    @OriginalMember(owner = "client!tb", name = "y", descriptor = "I")
    public static int field4687;

    @OriginalMember(owner = "client!tb", name = "B", descriptor = "I")
    public static int field4690;

    @OriginalMember(owner = "client!tb", name = "C", descriptor = "I")
    public static int field4691;

    @OriginalMember(owner = "client!tb", name = "F", descriptor = "I")
    public static int field4694;

    @OriginalMember(owner = "client!tb", name = "H", descriptor = "I")
    public static int field4696;

    @OriginalMember(owner = "client!tb", name = "K", descriptor = "I")
    public static int field4699;

    @OriginalMember(owner = "client!tb", name = "L", descriptor = "I")
    public static int field4700;

    @OriginalMember(owner = "client!tb", name = "M", descriptor = "I")
    public static int field4701;

    @OriginalMember(owner = "client!tb", name = "P", descriptor = "I")
    public static int field4703;

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "Lmm;")
    public static class234 field4666;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "Lnc;")
    public static class23 field4663;

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "Lcaa;")
    private static class253 field4669;

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "Lkda;")
    public static class328 field4671;

    @OriginalMember(owner = "client!tb", name = "N", descriptor = "Llb;")
    private static class465 field4702;

    @OriginalMember(owner = "client!tb", name = "n", descriptor = "Llk;")
    public static class504 field4676;

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "Lre;")
    public static class517 field4665;

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "Llo;")
    public static class642 field4664;

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "Lkl;")
    public static class69 field4670;

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "Ler;")
    private static class90 field4667;

    @OriginalMember(owner = "client!tb", name = "x", descriptor = "[B")
    private static byte[] field4686;

    @OriginalMember(owner = "client!tb", name = "z", descriptor = "[B")
    private static byte[] field4688;

    @OriginalMember(owner = "client!tb", name = "A", descriptor = "[B")
    private static byte[] field4689;

    @OriginalMember(owner = "client!tb", name = "D", descriptor = "[B")
    private static byte[] field4692;

    @OriginalMember(owner = "client!tb", name = "J", descriptor = "[B")
    private static byte[] field4698;

    @OriginalMember(owner = "client!tb", name = "I", descriptor = "[I")
    private static int[] field4697;

    @OriginalMember(owner = "client!tb", name = "u", descriptor = "[S")
    private static short[] field4683;

    @OriginalMember(owner = "client!tb", name = "G", descriptor = "[S")
    private static short[] field4695;

    @OriginalMember(owner = "client!tb", name = "r", descriptor = "[[[B")
    public static byte[][][] field4680;

    @OriginalMember(owner = "client!tb", name = "E", descriptor = "[[[Ljc;")
    private static class374[][][] field4693;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lqa;IIII[S[B)V")
    private static final void method2060(class208 arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        if (arg5 == null) {
            return;
        }
        for (int var7 = 0; var7 < arg5.length; var7++) {
            class145 var8 = field4666.method1505(-24044, arg5[var7] & 0xFFFF);
            int var9 = var8.field2110;
            if (var9 != -1) {
                class554 var10 = field4670.method545(var9, 34);
                class53 var11 = var10.method3348(var8.field2107 ? arg6[var7] >> 6 & 0x3 : 0, (byte) 122, var8.field2046 ? var8.field2055 : false, arg0);
                if (var11 != null) {
                    int var12 = arg3 * var11.method326() >> 2;
                    int var13 = arg4 * var11.method322() >> 2;
                    if (var10.field8245) {
                        int var14 = var8.field2108;
                        int var15 = var8.field2067;
                        if ((arg6[var7] >> 6 & 0x1) == 1) {
                            int var16 = var14;
                            var14 = var15;
                            var15 = var16;
                        }
                        var12 = arg3 * var14;
                        var13 = arg4 * var15;
                    }
                    if (var12 != 0 && var13 != 0) {
                        if (var10.field8246 == 0) {
                            var11.method317(arg1, arg2 + arg4 - var13, var12, var13);
                        } else {
                            var11.method314(arg1, arg2 + arg4 - var13, var12, var13, 0, var10.field8246 | 0xFF000000, 1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lqa;Ljj;IIII)V")
    private static final void method2061(class208 arg0, class101 arg1, int arg2, int arg3, int arg4, int arg5) {
        arg1.field1467 = ((arg1.field1470 - field4701) * arg2 + arg4 >> 16) + field4691;
        arg1.field1466 = field4687 - ((arg1.field1465 - field4699) * arg3 + arg5 >> 16);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(II)Llo;")
    public static final class642 method2062(int arg0, int arg1) {
        for (class642 var2 = (class642) field4668.method2798((byte) -74); var2 != null; var2 = (class642) field4668.method2806(true)) {
            if (var2.field9344 && var2.method3711(arg0, false, arg1)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lqa;IIII)Lbu;")
    private static final class19 method2063(class208 arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class101 var5 = (class101) field4681.method124((byte) 42); var5 != null; var5 = (class101) field4681.method120(124)) {
            method2061(arg0, var5, arg1, arg2, arg3, arg4);
        }
        return field4681;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Ln;II)V")
    public static final void method2064(class17 arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < field4667.field1346; var3++) {
            field4697[var3 + 1] = method2066(arg0, var3, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)Llo;")
    public static final class642 method2065(int arg0) {
        return (class642) field4668.method2799((long) arg0, true);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Ln;III)I")
    private static final int method2066(class17 arg0, int arg1, int arg2, int arg3) {
        class121 var4 = field4667.method676(109, arg1);
        if (var4 == null) {
            return 0;
        }
        int var5 = var4.field1698;
        if (var5 >= 0 && arg0.method110(var5, (byte) 116).field6653) {
            var5 = -1;
        }
        int var9;
        if (var4.field1703 >= 0) {
            int var6 = var4.field1703;
            int var7 = (var6 & 0x7F) + arg3;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 127) {
                var7 = 127;
            }
            int var8 = (arg2 + var6 & 0xFC00) + (var6 & 0x380) + var7;
            var9 = class111.field1583[class417.method2456(class582.method3475(1, var8, 96), 87) & 0xFFFF] | 0xFF000000;
        } else if (var5 >= 0) {
            var9 = class111.field1583[class417.method2456(class582.method3475(1, arg0.method110(var5, (byte) 118).field6642, 96), 26) & 0xFFFF] | 0xFF000000;
        } else if (var4.field1699 == -1) {
            var9 = 0;
        } else {
            int var10 = var4.field1699;
            int var11 = (var10 & 0x7F) + arg3;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 127) {
                var11 = 127;
            }
            int var12 = (arg2 + var10 & 0xFC00) + (var10 & 0x380) + var11;
            var9 = class111.field1583[class417.method2456(class582.method3475(1, var12, 96), 122) & 0xFFFF] | 0xFF000000;
        }
        return var9;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lqa;IIIIIII[S[BZ)V")
    private static final void method2067(class208 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, short[] arg8, byte[] arg9, boolean arg10) {
        if (arg10 || arg5 != 0 || arg6 > 0) {
            if (arg6 == 0) {
                arg0.method498(arg1, arg2, arg3, arg4, arg5, 0);
            } else {
                int var11 = arg7 & 0x3F;
                if (var11 == 0 || arg3 <= 1 || arg4 <= 1) {
                    int var13 = field4697[arg6];
                    if (arg10 || var13 != 0) {
                        arg0.method498(arg1, arg2, arg3, arg4, var13, 0);
                    }
                } else {
                    int var12 = arg10 ? 0 : 1;
                    class569.method3397(arg4, field4674, arg1, field4697[arg6], var11, arg3, arg0, var12, arg5, true, arg7 >> 6 & 0x3, field4680, arg2);
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
                class145 var18 = field4666.method1505(-24044, arg8[var16] & 0xFFFF);
                if (var18.field2110 == -1) {
                    int var19 = -3355444;
                    if (var18.field2056 == 1) {
                        var19 = -3407872;
                    }
                    int var20 = arg9[var16] >> 6 & 0x3;
                    if (var17 == 0) {
                        if (var20 == 0) {
                            arg0.method446(arg1, arg2, arg4, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method432(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method446(var14, arg2, arg4, var19, 0);
                        } else {
                            arg0.method432(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 2) {
                        if (var20 == 0) {
                            arg0.method446(arg1, arg2, arg4, -1, 0);
                            arg0.method432(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method446(var14, arg2, arg4, -1, 0);
                            arg0.method432(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method446(var14, arg2, arg4, -1, 0);
                            arg0.method432(arg1, var15, arg3, var19, 0);
                        } else {
                            arg0.method446(arg1, arg2, arg4, -1, 0);
                            arg0.method432(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 3) {
                        if (var20 == 0) {
                            arg0.method432(arg1, arg2, 1, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method432(var14, arg2, 1, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method432(var14, var15, 1, var19, 0);
                        } else {
                            arg0.method432(arg1, var15, 1, var19, 0);
                        }
                    } else if (var17 == 9) {
                        if (var20 == 0 || var20 == 2) {
                            for (int var22 = 0; var22 < arg4; var22++) {
                                arg0.method432(arg1 + var22, var15 - var22, 1, var19, 0);
                            }
                        } else {
                            for (int var21 = 0; var21 < arg4; var21++) {
                                arg0.method432(arg1 + var21, arg2 + var21, 1, var19, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lqa;)Lbu;")
    public static final class19 method2068(class208 arg0) {
        int var1 = field4700 - field4701;
        int var2 = field4703 - field4699;
        int var3 = (field4694 - field4691 << 16) / var1;
        int var4 = (field4687 - field4684 << 16) / var2;
        return method2063(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(Lqa;)V")
    public static final void method2069(class208 arg0) {
        int var1 = field4700 - field4701;
        int var2 = field4703 - field4699;
        int var3 = (field4694 - field4691 << 16) / var1;
        int var4 = (field4687 - field4684 << 16) / var2;
        method2080(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "()V")
    public static final void method2070() {
        field4686 = null;
        field4692 = null;
        field4695 = null;
        field4688 = null;
        field4698 = null;
        field4683 = null;
        field4689 = null;
        field4702 = null;
        field4693 = null;
        field4697 = null;
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "()V")
    public static void method2071() {
        field4667 = null;
        field4669 = null;
        field4666 = null;
        field4665 = null;
        field4670 = null;
        field4663 = null;
        field4664 = null;
        field4671 = null;
        field4668 = null;
        field4680 = null;
        field4672 = null;
        field4673 = null;
        field4676 = null;
        field4681 = null;
        field4697 = null;
        field4686 = null;
        field4692 = null;
        field4695 = null;
        field4688 = null;
        field4698 = null;
        field4683 = null;
        field4689 = null;
        field4702 = null;
        field4693 = null;
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(II)Lvm;")
    public static final class589 method2072(int arg0, int arg1) {
        class589 var2 = new class589();
        for (class642 var3 = (class642) field4668.method2798((byte) -33); var3 != null; var3 = (class642) field4668.method2806(true)) {
            if (var3.field9344 && var3.method3711(arg0, false, arg1)) {
                var2.method3500(var3, false);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "()V")
    private static final void method2073() {
        for (int var0 = 0; var0 < field4690; var0++) {
            for (int var11 = 0; var11 < field4682; var11++) {
                int var12 = field4683[field4690 * var11 + var0] & 0xFFFF;
                if (var12 != 0) {
                    if (var12 == 65535) {
                        class567 var13 = (class567) field4702.method2799((long) (var0 << 16 | var11), true);
                        if (var13 != null) {
                            for (int var14 = 0; var14 < var13.field8372.length; var14++) {
                                class145 var15 = field4666.method1505(-24044, var13.field8372[var14] & 0xFFFF);
                                int var16 = var15.field2070;
                                if (var15.field2028 != null) {
                                    class145 var17 = var15.method991(field4663, true);
                                    if (var17 != null) {
                                        var16 = var17.field2070;
                                    }
                                }
                                if (var16 != -1) {
                                    class101 var18 = new class101(var16);
                                    var18.field1470 = var0;
                                    var18.field1465 = var11;
                                    field4681.method131(var18, 0);
                                }
                            }
                        }
                    } else {
                        class145 var19 = field4666.method1505(-24044, var12 - 1);
                        int var20 = var19.field2070;
                        if (var19.field2028 != null) {
                            class145 var21 = var19.method991(field4663, true);
                            if (var21 != null) {
                                var20 = var21.field2070;
                            }
                        }
                        if (var20 != -1) {
                            class101 var22 = new class101(var20);
                            var22.field1470 = var0;
                            var22.field1465 = var11;
                            field4681.method131(var22, 0);
                        }
                    }
                }
            }
        }
        for (int var1 = 0; var1 < 3; var1++) {
            for (int var2 = 0; var2 < field4693[0].length; var2++) {
                for (int var3 = 0; var3 < field4693[0][0].length; var3++) {
                    class374 var4 = field4693[var1][var2][var3];
                    if (var4 != null) {
                        for (class594 var5 = (class594) var4.method2233(true); var5 != null; var5 = (class594) var4.method2240(16772)) {
                            if (var5.field8774 != null) {
                                for (int var6 = 0; var6 < var5.field8774.length; var6++) {
                                    class145 var7 = field4666.method1505(-24044, var5.field8774[var6] & 0xFFFF);
                                    int var8 = var7.field2070;
                                    if (var7.field2028 != null) {
                                        class145 var9 = var7.method991(field4663, true);
                                        if (var9 != null) {
                                            var8 = var9.field2070;
                                        }
                                    }
                                    if (var8 != -1) {
                                        class101 var10 = new class101(var8);
                                        var10.field1470 = ((field4685 >> 6) + var2) * 64 + var5.field8775 - field4685;
                                        var10.field1465 = ((field4696 >> 6) + var3) * 64 + var5.field8771 - field4696;
                                        field4681.method131(var10, 0);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lqa;Lgw;IIII[I[I)V")
    private static final void method2074(class208 arg0, class148 arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7) {
        int var8 = arg1.method1032((byte) -33);
        if ((var8 & 0x1) == 0) {
            boolean var9 = (var8 & 0x2) == 0;
            int var10 = var8 >> 2 & 0x3F;
            if (var10 != 62) {
                int var11;
                if (var10 == 63) {
                    var11 = arg1.method1032((byte) -33);
                } else if (var9) {
                    var11 = arg6[var10];
                } else {
                    var11 = arg7[var10];
                }
                if (var9) {
                    field4686[field4690 * arg5 + arg4] = (byte) var11;
                    field4688[field4690 * arg5 + arg4] = 0;
                } else {
                    field4688[field4690 * arg5 + arg4] = (byte) var11;
                    field4698[field4690 * arg5 + arg4] = 0;
                    field4686[field4690 * arg5 + arg4] = arg1.method1062(-21188);
                }
            }
            return;
        }
        int var12 = (var8 >> 1 & 0x3) + 1;
        boolean var13 = (var8 & 0x8) != 0;
        boolean var14 = (var8 & 0x10) != 0;
        for (int var15 = 0; var15 < var12; var15++) {
            int var16 = arg1.method1032((byte) -33);
            int var17 = 0;
            int var18 = 0;
            if (var13) {
                var17 = arg1.method1032((byte) -33);
                var18 = arg1.method1032((byte) -33);
            }
            int var19 = 0;
            if (var14) {
                var19 = arg1.method1032((byte) -33);
            }
            if (var15 == 0) {
                field4686[field4690 * arg5 + arg4] = (byte) var16;
                field4688[field4690 * arg5 + arg4] = (byte) var17;
                field4698[field4690 * arg5 + arg4] = (byte) var18;
                if (var19 == 1) {
                    field4683[field4690 * arg5 + arg4] = (short) (arg1.method1045(true) + 1);
                    field4689[field4690 * arg5 + arg4] = arg1.method1062(-21188);
                } else if (var19 > 1) {
                    field4683[field4690 * arg5 + arg4] = -1;
                    short[] var20 = new short[var19];
                    byte[] var21 = new byte[var19];
                    for (int var22 = 0; var22 < var19; var22++) {
                        var20[var22] = (short) arg1.method1045(true);
                        var21[var22] = arg1.method1062(-21188);
                    }
                    field4702.method2797(-4234, new class567(var20, var21), (long) (arg4 << 16 | arg5));
                }
            } else {
                short[] var23 = null;
                byte[] var24 = null;
                if (var19 > 0) {
                    var23 = new short[var19];
                    var24 = new byte[var19];
                    for (int var25 = 0; var25 < var19; var25++) {
                        var23[var25] = (short) arg1.method1045(true);
                        var24[var25] = arg1.method1062(-21188);
                    }
                }
                if (field4693[var15 - 1][arg2 - (field4685 >> 6)][arg3 - (field4696 >> 6)] == null) {
                    field4693[var15 - 1][arg2 - (field4685 >> 6)][arg3 - (field4696 >> 6)] = new class374();
                }
                class594 var26 = new class594(arg4 & 0x3F, arg5 & 0x3F, var16, var17, var18, var23, var24);
                field4693[var15 - 1][arg2 - (field4685 >> 6)][arg3 - (field4696 >> 6)].method2241((byte) 66, var26);
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lqa;II)V")
    public static final void method2075(class208 arg0, int arg1, int arg2) {
        class148 var3 = new class148(field4671.method1990("area", 0, field4664.field9347));
        int var4 = var3.method1032((byte) -33);
        int[] var5 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var5[var6] = var3.method1032((byte) -33);
        }
        int var7 = var3.method1032((byte) -33);
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method1032((byte) -33);
        }
        while (true) {
            while (var3.field2177 < var3.field2146.length) {
                if (var3.method1032((byte) -33) == 0) {
                    int var22 = var3.method1032((byte) -33);
                    int var23 = var3.method1032((byte) -33);
                    for (int var24 = 0; var24 < 64; var24++) {
                        for (int var25 = 0; var25 < 64; var25++) {
                            int var26 = var22 * 64 + var24 - field4685;
                            int var27 = var23 * 64 + var25 - field4696;
                            method2074(arg0, var3, var22, var23, var26, var27, var5, var8);
                        }
                    }
                } else {
                    int var28 = var3.method1032((byte) -33);
                    int var29 = var3.method1032((byte) -33);
                    int var30 = var3.method1032((byte) -33);
                    int var31 = var3.method1032((byte) -33);
                    for (int var32 = 0; var32 < 8; var32++) {
                        for (int var33 = 0; var33 < 8; var33++) {
                            int var34 = var28 * 64 + var30 * 8 + var32 - field4685;
                            int var35 = var29 * 64 + var31 * 8 + var33 - field4696;
                            method2074(arg0, var3, var28, var29, var34, var35, var5, var8);
                        }
                    }
                }
            }
            Object var10 = null;
            field4692 = new byte[field4690 * field4682];
            field4695 = new short[field4690 * field4682];
            for (int var11 = 0; var11 < 3; var11++) {
                byte[] var12 = new byte[field4690 * field4682];
                for (int var13 = 0; var13 < field4693[var11].length; var13++) {
                    for (int var19 = 0; var19 < field4693[var11][0].length; var19++) {
                        class374 var20 = field4693[var11][var13][var19];
                        if (var20 != null) {
                            for (class594 var21 = (class594) var20.method2233(true); var21 != null; var21 = (class594) var20.method2240(16772)) {
                                var12[(var19 * 64 + var21.field8771) * field4690 + var13 * 64 + var21.field8775] = (byte) var21.field8772;
                            }
                        }
                    }
                }
                method2077(var12, field4692, field4695, arg1, arg2);
                for (int var14 = 0; var14 < field4693[var11].length; var14++) {
                    for (int var15 = 0; var15 < field4693[var11][0].length; var15++) {
                        class374 var16 = field4693[var11][var14][var15];
                        if (var16 != null) {
                            for (class594 var17 = (class594) var16.method2233(true); var17 != null; var17 = (class594) var16.method2240(16772)) {
                                int var18 = (var15 * 64 + var17.field8771) * field4690 + var14 * 64 + var17.field8775;
                                var17.field8772 = (field4692[var18] & 0xFF) << 16 | field4695[var18] & 0xFFFF;
                                if (var17.field8772 != 0) {
                                    var17.field8772 |= 0xFF000000;
                                }
                            }
                        }
                    }
                }
            }
            method2077(field4686, field4692, field4695, arg1, arg2);
            field4686 = null;
            method2073();
            return;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method2076(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4701 = arg0 - field4685;
        field4703 = arg1 - field4696;
        field4700 = arg2 - field4685;
        field4699 = arg3 - field4696;
        field4691 = arg4;
        field4684 = arg5;
        field4694 = arg6;
        field4687 = arg7;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "([B[B[SII)V")
    private static final void method2077(byte[] arg0, byte[] arg1, short[] arg2, int arg3, int arg4) {
        int[] var5 = new int[field4682];
        int[] var6 = new int[field4682];
        int[] var7 = new int[field4682];
        int[] var8 = new int[field4682];
        int[] var9 = new int[field4682];
        for (int var10 = -5; var10 < field4690; var10++) {
            int var11 = var10 + 5;
            int var12 = var10 - 5;
            for (int var13 = 0; var13 < field4682; var13++) {
                int var10002;
                if (var11 < field4690) {
                    int var28 = arg0[field4690 * var13 + var11] & 0xFF;
                    if (var28 > 0) {
                        class3 var29 = field4669.method1630(122, var28 - 1);
                        var5[var13] += var29.field23;
                        var6[var13] += var29.field26;
                        var7[var13] += var29.field15;
                        var8[var13] += var29.field16;
                        var10002 = var9[var13]++;
                    }
                }
                if (var12 >= 0) {
                    int var30 = arg0[field4690 * var13 + var12] & 0xFF;
                    if (var30 > 0) {
                        class3 var31 = field4669.method1630(-83, var30 - 1);
                        var5[var13] -= var31.field23;
                        var6[var13] -= var31.field26;
                        var7[var13] -= var31.field15;
                        var8[var13] -= var31.field16;
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
                for (int var19 = -5; var19 < field4682; var19++) {
                    int var20 = var19 + 5;
                    if (var20 < field4682) {
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
                        if ((arg0[field4690 * var19 + var10] & 0xFF) == 0) {
                            int var22 = field4690 * var19 + var10;
                            arg1[var22] = 0;
                            arg2[var22] = 0;
                        } else {
                            int var23 = var17 == 0 ? 0 : class423.method2482(var14 * 256 / var17, var15 / var18, (byte) 98, var16 / var18);
                            int var24 = (var23 & 0x7F) + arg4;
                            if (var24 < 0) {
                                var24 = 0;
                            } else if (var24 > 127) {
                                var24 = 127;
                            }
                            int var25 = (arg3 + var23 & 0xFC00) + (var23 & 0x380) + var24;
                            int var26 = field4690 * var19 + var10;
                            int var27 = class111.field1583[class417.method2456(class609.method3578(false, var25, 96), -120) & 0xFFFF];
                            arg1[var26] = (byte) (var27 >> 16 & 0xFF);
                            arg2[var26] = (short) (var27 & 0xFFFF);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "()V")
    public static final void method2078() {
        field4686 = new byte[field4690 * field4682];
        field4688 = new byte[field4690 * field4682];
        field4698 = new byte[field4690 * field4682];
        field4683 = new short[field4690 * field4682];
        field4689 = new byte[field4690 * field4682];
        field4702 = new class465(1024);
        field4693 = new class374[3][field4690 >> 6][field4682 >> 6];
        field4697 = new int[field4667.field1346 + 1];
    }

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "()V")
    public static final void method2079() {
        int[] var0 = new int[3];
        for (int var1 = 0; var1 < field4676.field7138; var1++) {
            boolean var2 = field4664.method3712((byte) 119, field4676.field7136[var1] >> 28 & 0x3, field4676.field7136[var1] >> 14 & 0x3FFF, var0, field4676.field7136[var1] & 0x3FFF);
            if (var2) {
                class101 var3 = new class101(field4676.field7140[var1]);
                var3.field1470 = var0[1] - field4685;
                var3.field1465 = var0[2] - field4696;
                field4681.method131(var3, 0);
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(Lqa;IIII)V")
    private static final void method2080(class208 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = field4700 - field4701;
        int var6 = field4703 - field4699;
        if (field4700 < field4690) {
            var5++;
        }
        if (field4703 < field4682) {
            var6++;
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var49 = (arg1 * var7 + arg3 >> 16) + field4691;
            int var50 = ((var7 + 1) * arg1 + arg3 >> 16) + field4691;
            int var51 = var50 - var49;
            if (var51 > 0) {
                int var52 = field4701 + var7;
                if (var52 >= 0 && var52 < field4690) {
                    for (int var53 = 0; var53 < var6; var53++) {
                        int var54 = field4687 - ((var53 + 1) * arg2 + arg4 >> 16);
                        int var55 = field4687 - (arg2 * var53 + arg4 >> 16);
                        int var56 = var55 - var54;
                        if (var56 > 0) {
                            int var57 = field4699 + var53;
                            int var58 = field4690 * var57 + var52;
                            int var59 = 0;
                            int var60 = 0;
                            int var61 = 0;
                            if (var57 >= 0 && var57 < field4682) {
                                var59 = (field4692[var58] & 0xFF) << 16 | field4695[var58] & 0xFFFF;
                                if (var59 != 0) {
                                    var59 |= 0xFF000000;
                                }
                                var60 = field4688[var58] & 0xFF;
                                var61 = field4683[var58] & 0xFFFF;
                            }
                            if (var59 == 0 && var60 == 0 && var61 == 0) {
                                int var62;
                                if (field4664.field9355 != -1) {
                                    var62 = field4664.field9355 | 0xFF000000;
                                } else if ((field4703 + var53 & 0x4) == (field4701 + var7 & 0x4)) {
                                    var62 = field4697[field4667.field1351 + 1];
                                } else {
                                    var62 = -11840664;
                                }
                                if (var62 == 0) {
                                    var62 = -16777216;
                                }
                                arg0.method498(var49, var54, var51, var56, var62, 0);
                            } else if (var61 <= 0) {
                                method2067(arg0, var49, var54, var51, var56, var59, var60, field4698[var58], null, null, true);
                            } else if (var61 == 65535) {
                                class567 var63 = (class567) field4702.method2799((long) (var52 << 16 | var57), true);
                                if (var63 != null) {
                                    method2067(arg0, var49, var54, var51, var56, var59, var60, field4698[var58], var63.field8372, var63.field8373, true);
                                }
                            } else {
                                field4672[0] = (short) (var61 - 1);
                                field4673[0] = field4689[var58];
                                method2067(arg0, var49, var54, var51, var56, var59, var60, field4698[var58], field4672, field4673, true);
                            }
                        }
                    }
                } else {
                    for (int var64 = 0; var64 < var6; var64++) {
                        int var65 = field4687 - ((var64 + 1) * arg2 + arg4 >> 16);
                        int var66 = field4687 - (arg2 * var64 + arg4 >> 16);
                        int var67 = var66 - var65;
                        int var68;
                        if (field4664.field9355 != -1) {
                            var68 = field4664.field9355 | 0xFF000000;
                        } else if ((field4703 + var64 & 0x4) == (field4701 + var7 & 0x4)) {
                            var68 = field4697[field4667.field1351 + 1];
                        } else {
                            var68 = -11840664;
                        }
                        if (var68 == 0) {
                            var68 = -16777216;
                        }
                        arg0.method498(var49, var65, var51, var67, var68, 0);
                    }
                }
            }
        }
        for (int var8 = -16; var8 < var5 + 16; var8++) {
            int var38 = (arg1 * var8 + arg3 >> 16) + field4691;
            int var39 = ((var8 + 1) * arg1 + arg3 >> 16) + field4691;
            int var40 = var39 - var38;
            if (var40 > 0) {
                int var41 = field4701 + var8;
                if (var41 >= 0 && var41 < field4690) {
                    for (int var42 = -16; var42 < var6 + 16; var42++) {
                        int var43 = field4687 - ((var42 + 1) * arg2 + arg4 >> 16);
                        int var44 = field4687 - (arg2 * var42 + arg4 >> 16);
                        int var45 = var44 - var43;
                        if (var45 > 0) {
                            int var46 = field4699 + var42;
                            if (var46 >= 0 && var46 < field4682) {
                                int var47 = field4683[field4690 * var46 + var41] & 0xFFFF;
                                if (var47 <= 0) {
                                    method2060(arg0, var38, var43, var40, var45, null, null);
                                } else if (var47 == 65535) {
                                    class567 var48 = (class567) field4702.method2799((long) (var41 << 16 | var46), true);
                                    if (var48 != null) {
                                        method2060(arg0, var38, var43, var40, var45, var48.field8372, var48.field8373);
                                    }
                                } else {
                                    field4672[0] = (short) (var47 - 1);
                                    field4673[0] = field4689[field4690 * var46 + var41];
                                    method2060(arg0, var38, var43, var40, var45, field4672, field4673);
                                }
                            }
                        }
                    }
                }
            }
        }
        int var9 = field4701 >> 6;
        int var10 = field4699 >> 6;
        if (var9 < 0) {
            var9 = 0;
        }
        if (var10 < 0) {
            var10 = 0;
        }
        int var11 = field4700 >> 6;
        int var12 = field4703 >> 6;
        if (var11 >= field4693[0].length) {
            var11 = field4693[0].length - 1;
        }
        if (var12 >= field4693[0][0].length) {
            var12 = field4693[0][0].length - 1;
        }
        for (int var13 = 0; var13 < 3; var13++) {
            for (int var14 = var9; var14 <= var11; var14++) {
                for (int var27 = var10; var27 <= var12; var27++) {
                    class374 var28 = field4693[var13][var14][var27];
                    if (var28 != null) {
                        int var29 = ((field4685 >> 6) + var14) * 64;
                        int var30 = ((field4696 >> 6) + var27) * 64;
                        for (class594 var31 = (class594) var28.method2233(true); var31 != null; var31 = (class594) var28.method2240(16772)) {
                            int var32 = var31.field8775 + var29 - field4685 - field4701;
                            int var33 = var31.field8771 + var30 - field4696 - field4699;
                            int var34 = (arg1 * var32 + arg3 >> 16) + field4691;
                            int var35 = ((var32 + 1) * arg1 + arg3 >> 16) + field4691;
                            int var36 = field4687 - ((var33 + 1) * arg2 + arg4 >> 16);
                            int var37 = field4687 - (arg2 * var33 + arg4 >> 16);
                            method2067(arg0, var34, var36, var35 - var34, var37 - var36, var31.field8772, var31.field8770 & 0xFF, var31.field8773, var31.field8774, var31.field8776, false);
                        }
                    }
                }
            }
            for (int var15 = var9; var15 <= var11; var15++) {
                for (int var16 = var10; var16 <= var12; var16++) {
                    class374 var17 = field4693[var13][var15][var16];
                    if (var17 != null) {
                        int var18 = ((field4685 >> 6) + var15) * 64;
                        int var19 = ((field4696 >> 6) + var16) * 64;
                        for (class594 var20 = (class594) var17.method2233(true); var20 != null; var20 = (class594) var17.method2240(16772)) {
                            int var21 = var20.field8775 + var18 - field4685 - field4701;
                            int var22 = var20.field8771 + var19 - field4696 - field4699;
                            int var23 = (arg1 * var21 + arg3 >> 16) + field4691;
                            int var24 = ((var21 + 1) * arg1 + arg3 >> 16) + field4691;
                            int var25 = field4687 - ((var22 + 1) * arg2 + arg4 >> 16);
                            int var26 = field4687 - (arg2 * var22 + arg4 >> 16);
                            method2060(arg0, var23, var25, var24 - var23, var26 - var25, var20.field8774, var20.field8776);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lkda;Ler;Lcaa;Lmm;Lre;Lkl;Lnc;)V")
    public static final void method2081(class328 arg0, class90 arg1, class253 arg2, class234 arg3, class517 arg4, class69 arg5, class23 arg6) {
        field4671 = arg0;
        field4667 = arg1;
        field4669 = arg2;
        field4666 = arg3;
        field4665 = arg4;
        field4670 = arg5;
        field4663 = arg6;
        field4668.method2800(0);
        int var7 = field4671.method1967(-1, "details");
        int[] var8 = field4671.method1994(-104, var7);
        if (var8 != null) {
            for (int var9 = 0; var9 < var8.length; var9++) {
                class642 var10 = class354.method2141(field4671, var8[var9], (byte) 83, var7);
                field4668.method2797(-4234, var10, (long) var10.field9348);
            }
        }
        class582.method3473(true, false, -3);
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)V")
    public static final void method2082(int arg0) {
        field4664 = (class642) field4668.method2799((long) arg0, true);
    }
}
