import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gt")
public class class319 {

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "Lmn;")
    private static class249 field4843 = new class249(16);

    @OriginalMember(owner = "client!gt", name = "k", descriptor = "[B")
    private static byte[] field4852 = new byte[1];

    @OriginalMember(owner = "client!gt", name = "l", descriptor = "I")
    public static int field4853 = (int) (Math.random() * 11.0D) - 5;

    @OriginalMember(owner = "client!gt", name = "n", descriptor = "I")
    public static int field4855 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!gt", name = "s", descriptor = "[S")
    private static short[] field4860 = new short[1];

    @OriginalMember(owner = "client!gt", name = "q", descriptor = "Lmf;")
    public static class291 field4858 = new class291();

    @OriginalMember(owner = "client!gt", name = "o", descriptor = "F")
    public static float field4856;

    @OriginalMember(owner = "client!gt", name = "r", descriptor = "F")
    public static float field4859;

    @OriginalMember(owner = "client!gt", name = "j", descriptor = "I")
    public static int field4851;

    @OriginalMember(owner = "client!gt", name = "t", descriptor = "I")
    public static int field4861;

    @OriginalMember(owner = "client!gt", name = "v", descriptor = "I")
    public static int field4863;

    @OriginalMember(owner = "client!gt", name = "w", descriptor = "I")
    public static int field4864;

    @OriginalMember(owner = "client!gt", name = "x", descriptor = "I")
    public static int field4865;

    @OriginalMember(owner = "client!gt", name = "y", descriptor = "I")
    public static int field4866;

    @OriginalMember(owner = "client!gt", name = "B", descriptor = "I")
    public static int field4869;

    @OriginalMember(owner = "client!gt", name = "C", descriptor = "I")
    public static int field4870;

    @OriginalMember(owner = "client!gt", name = "G", descriptor = "I")
    public static int field4874;

    @OriginalMember(owner = "client!gt", name = "H", descriptor = "I")
    public static int field4875;

    @OriginalMember(owner = "client!gt", name = "I", descriptor = "I")
    public static int field4876;

    @OriginalMember(owner = "client!gt", name = "M", descriptor = "I")
    public static int field4880;

    @OriginalMember(owner = "client!gt", name = "O", descriptor = "I")
    public static int field4882;

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "Lgf;")
    public static class183 field4842;

    @OriginalMember(owner = "client!gt", name = "i", descriptor = "Lao;")
    public static class191 field4850;

    @OriginalMember(owner = "client!gt", name = "h", descriptor = "Lhp;")
    public static class217 field4849;

    @OriginalMember(owner = "client!gt", name = "e", descriptor = "Ltk;")
    public static class231 field4846;

    @OriginalMember(owner = "client!gt", name = "D", descriptor = "Lmn;")
    private static class249 field4871;

    @OriginalMember(owner = "client!gt", name = "d", descriptor = "Lcq;")
    private static class329 field4845;

    @OriginalMember(owner = "client!gt", name = "g", descriptor = "Laa;")
    public static class339 field4848;

    @OriginalMember(owner = "client!gt", name = "m", descriptor = "Ljb;")
    public static class344 field4854;

    @OriginalMember(owner = "client!gt", name = "f", descriptor = "Lph;")
    public static class459 field4847;

    @OriginalMember(owner = "client!gt", name = "c", descriptor = "Lri;")
    private static class75 field4844;

    @OriginalMember(owner = "client!gt", name = "u", descriptor = "[B")
    private static byte[] field4862;

    @OriginalMember(owner = "client!gt", name = "A", descriptor = "[B")
    private static byte[] field4868;

    @OriginalMember(owner = "client!gt", name = "F", descriptor = "[B")
    private static byte[] field4873;

    @OriginalMember(owner = "client!gt", name = "K", descriptor = "[B")
    private static byte[] field4878;

    @OriginalMember(owner = "client!gt", name = "N", descriptor = "[B")
    private static byte[] field4881;

    @OriginalMember(owner = "client!gt", name = "J", descriptor = "[I")
    private static int[] field4877;

    @OriginalMember(owner = "client!gt", name = "z", descriptor = "[S")
    private static short[] field4867;

    @OriginalMember(owner = "client!gt", name = "L", descriptor = "[S")
    private static short[] field4879;

    @OriginalMember(owner = "client!gt", name = "p", descriptor = "[[[B")
    public static byte[][][] field4857;

    @OriginalMember(owner = "client!gt", name = "E", descriptor = "[[[Ltn;")
    private static class60[][][] field4872;

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "()V", line = 5)
    public static final void method2030() {
        field4881 = new byte[field4880 * field4865];
        field4873 = new byte[field4880 * field4865];
        field4862 = new byte[field4880 * field4865];
        field4867 = new short[field4880 * field4865];
        field4878 = new byte[field4880 * field4865];
        field4871 = new class249(1024);
        field4872 = new class60[3][field4880 >> 6][field4865 >> 6];
        field4877 = new int[field4845.field4990 + 1];
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Ll;II)V", line = 19)
    public static final void method2031(class16 arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < field4845.field4990; var3++) {
            field4877[var3 + 1] = method2043(arg0, var3, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lza;IIII[S[B)V", line = 28)
    private static final void method2032(class288 arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        if (arg5 == null) {
            return;
        }
        for (int var7 = 0; var7 < arg5.length; var7++) {
            class306 var8 = field4846.method1530((byte) -105, arg5[var7] & 0xFFFF);
            int var9 = var8.field4597;
            if (var9 != -1) {
                class113 var10 = field4848.method2134(var9, (byte) 84);
                class24 var11 = var10.method940((byte) -89, var8.field4569 ? arg6[var7] >> 6 & 0x3 : 0, var8.field4600 ? var8.field4612 : false, arg0);
                if (var11 != null) {
                    int var12 = arg3 * var11.method147() >> 2;
                    int var13 = arg4 * var11.method165() >> 2;
                    if (var10.field2048) {
                        int var14 = var8.field4601;
                        int var15 = var8.field4595;
                        if ((arg6[var7] >> 6 & 0x1) == 1) {
                            int var16 = var14;
                            var14 = var15;
                            var15 = var16;
                        }
                        var12 = arg3 * var14;
                        var13 = arg4 * var15;
                    }
                    if (var12 != 0 && var13 != 0) {
                        if (var10.field2053 == 0) {
                            var11.method151(arg1, arg2 + arg4 - var13, var12, var13);
                        } else {
                            var11.method163(arg1, arg2 + arg4 - var13, var12, var13, 0, var10.field2053 | 0xFF000000, 1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(II)Lao;", line = 88)
    public static final class191 method2033(int arg0, int arg1) {
        for (class191 var2 = (class191) field4843.method1615(0); var2 != null; var2 = (class191) field4843.method1621((byte) 79)) {
            if (var2.field3089 && var2.method1299((byte) -62, arg1, arg0)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lza;Lnn;IIII[I[I)V", line = 103)
    private static final void method2034(class288 arg0, class289 arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7) {
        int var8 = arg1.method1858(-3256);
        if ((var8 & 0x1) == 0) {
            boolean var9 = (var8 & 0x2) == 0;
            int var10 = var8 >> 2 & 0x3F;
            if (var10 != 62) {
                int var11;
                if (var10 == 63) {
                    var11 = arg1.method1858(-3256);
                } else if (var9) {
                    var11 = arg6[var10];
                } else {
                    var11 = arg7[var10];
                }
                if (var9) {
                    field4881[field4880 * arg5 + arg4] = (byte) var11;
                    field4873[field4880 * arg5 + arg4] = 0;
                } else {
                    field4873[field4880 * arg5 + arg4] = (byte) var11;
                    field4862[field4880 * arg5 + arg4] = 0;
                    field4881[field4880 * arg5 + arg4] = arg1.method1816(true);
                }
            }
            return;
        }
        int var12 = (var8 >> 1 & 0x3) + 1;
        boolean var13 = (var8 & 0x8) != 0;
        boolean var14 = (var8 & 0x10) != 0;
        for (int var15 = 0; var15 < var12; var15++) {
            int var16 = arg1.method1858(-3256);
            int var17 = 0;
            int var18 = 0;
            if (var13) {
                var17 = arg1.method1858(-3256);
                var18 = arg1.method1858(-3256);
            }
            int var19 = 0;
            if (var14) {
                var19 = arg1.method1858(-3256);
            }
            if (var15 == 0) {
                field4881[field4880 * arg5 + arg4] = (byte) var16;
                field4873[field4880 * arg5 + arg4] = (byte) var17;
                field4862[field4880 * arg5 + arg4] = (byte) var18;
                if (var19 == 1) {
                    field4867[field4880 * arg5 + arg4] = (short) (arg1.method1841((byte) 78) + 1);
                    field4878[field4880 * arg5 + arg4] = arg1.method1816(true);
                } else if (var19 > 1) {
                    field4867[field4880 * arg5 + arg4] = -1;
                    short[] var20 = new short[var19];
                    byte[] var21 = new byte[var19];
                    for (int var22 = 0; var22 < var19; var22++) {
                        var20[var22] = (short) arg1.method1841((byte) -119);
                        var21[var22] = arg1.method1816(true);
                    }
                    field4871.method1618(new class530(var20, var21), (long) (arg4 << 16 | arg5), -1);
                }
            } else {
                short[] var23 = null;
                byte[] var24 = null;
                if (var19 > 0) {
                    var23 = new short[var19];
                    var24 = new byte[var19];
                    for (int var25 = 0; var25 < var19; var25++) {
                        var23[var25] = (short) arg1.method1841((byte) -1);
                        var24[var25] = arg1.method1816(true);
                    }
                }
                if (field4872[var15 - 1][arg2 - (field4876 >> 6)][arg3 - (field4869 >> 6)] == null) {
                    field4872[var15 - 1][arg2 - (field4876 >> 6)][arg3 - (field4869 >> 6)] = new class60();
                }
                class176 var26 = new class176(arg4 & 0x3F, arg5 & 0x3F, var16, var17, var18, var23, var24);
                field4872[var15 - 1][arg2 - (field4876 >> 6)][arg3 - (field4869 >> 6)].method531((byte) 123, var26);
            }
        }
    }

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "()V", line = 238)
    public static final void method2035() {
        int[] var0 = new int[3];
        for (int var1 = 0; var1 < field4854.field5143; var1++) {
            boolean var2 = field4850.method1298((byte) -76, field4854.field5149[var1] >> 28 & 0x3, var0, field4854.field5149[var1] & 0x3FFF, field4854.field5149[var1] >> 14 & 0x3FFF);
            if (var2) {
                class97 var3 = new class97(field4854.field5148[var1]);
                var3.field1897 = var0[1] - field4876;
                var3.field1893 = var0[2] - field4869;
                field4858.method1885(false, var3);
            }
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lph;Lcq;Lri;Ltk;Lgf;Laa;Lhp;)V", line = 259)
    public static final void method2036(class459 arg0, class329 arg1, class75 arg2, class231 arg3, class183 arg4, class339 arg5, class217 arg6) {
        field4847 = arg0;
        field4845 = arg1;
        field4844 = arg2;
        field4846 = arg3;
        field4842 = arg4;
        field4848 = arg5;
        field4849 = arg6;
        field4843.method1614((byte) -24);
        int var7 = field4847.method2735("details", -84);
        int[] var8 = field4847.method2748(-76, var7);
        if (var8 != null) {
            for (int var9 = 0; var9 < var8.length; var9++) {
                class191 var10 = class108.method917(42, var8[var9], var7, field4847);
                field4843.method1618(var10, (long) var10.field3086, -1);
            }
        }
        class140.method1050(1135383648, false, true);
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lza;IIII)Lmf;", line = 293)
    private static final class291 method2037(class288 arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class97 var5 = (class97) field4858.method1892(89); var5 != null; var5 = (class97) field4858.method1893((byte) -2)) {
            method2038(arg0, var5, arg1, arg2, arg3, arg4);
        }
        return field4858;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lza;Lwk;IIII)V", line = 304)
    private static final void method2038(class288 arg0, class97 arg1, int arg2, int arg3, int arg4, int arg5) {
        arg1.field1887 = ((arg1.field1897 - field4863) * arg2 + arg4 >> 16) + field4864;
        arg1.field1895 = field4870 - ((arg1.field1893 - field4882) * arg3 + arg5 >> 16);
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lza;)Lmf;", line = 309)
    public static final class291 method2039(class288 arg0) {
        int var1 = field4861 - field4863;
        int var2 = field4874 - field4882;
        int var3 = (field4875 - field4864 << 16) / var1;
        int var4 = (field4870 - field4866 << 16) / var2;
        return method2037(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(I)V", line = 319)
    public static final void method2040(int arg0) {
        field4850 = (class191) field4843.method1622((long) arg0, -122);
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lza;II)V", line = 324)
    public static final void method2041(class288 arg0, int arg1, int arg2) {
        class289 var3 = new class289(field4847.method2746(false, field4850.field3092, "area"));
        int var4 = var3.method1858(-3256);
        int[] var5 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var5[var6] = var3.method1858(-3256);
        }
        int var7 = var3.method1858(-3256);
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method1858(-3256);
        }
        while (true) {
            while (var3.field4399 < var3.field4408.length) {
                if (var3.method1858(-3256) == 0) {
                    int var22 = var3.method1858(-3256);
                    int var23 = var3.method1858(-3256);
                    for (int var24 = 0; var24 < 64; var24++) {
                        for (int var25 = 0; var25 < 64; var25++) {
                            int var26 = var22 * 64 + var24 - field4876;
                            int var27 = var23 * 64 + var25 - field4869;
                            method2034(arg0, var3, var22, var23, var26, var27, var5, var8);
                        }
                    }
                } else {
                    int var28 = var3.method1858(-3256);
                    int var29 = var3.method1858(-3256);
                    int var30 = var3.method1858(-3256);
                    int var31 = var3.method1858(-3256);
                    for (int var32 = 0; var32 < 8; var32++) {
                        for (int var33 = 0; var33 < 8; var33++) {
                            int var34 = var28 * 64 + var30 * 8 + var32 - field4876;
                            int var35 = var29 * 64 + var31 * 8 + var33 - field4869;
                            method2034(arg0, var3, var28, var29, var34, var35, var5, var8);
                        }
                    }
                }
            }
            Object var10 = null;
            field4868 = new byte[field4880 * field4865];
            field4879 = new short[field4880 * field4865];
            for (int var11 = 0; var11 < 3; var11++) {
                byte[] var12 = new byte[field4880 * field4865];
                for (int var13 = 0; var13 < field4872[var11].length; var13++) {
                    for (int var19 = 0; var19 < field4872[var11][0].length; var19++) {
                        class60 var20 = field4872[var11][var13][var19];
                        if (var20 != null) {
                            for (class176 var21 = (class176) var20.method533((byte) -48); var21 != null; var21 = (class176) var20.method536(-40)) {
                                var12[(var19 * 64 + var21.field2856) * field4880 + var13 * 64 + var21.field2862] = (byte) var21.field2860;
                            }
                        }
                    }
                }
                method2044(var12, field4868, field4879, arg1, arg2);
                for (int var14 = 0; var14 < field4872[var11].length; var14++) {
                    for (int var15 = 0; var15 < field4872[var11][0].length; var15++) {
                        class60 var16 = field4872[var11][var14][var15];
                        if (var16 != null) {
                            for (class176 var17 = (class176) var16.method533((byte) -67); var17 != null; var17 = (class176) var16.method536(-69)) {
                                int var18 = (var15 * 64 + var17.field2856) * field4880 + var14 * 64 + var17.field2862;
                                var17.field2860 = (field4868[var18] & 0xFF) << 16 | field4879[var18] & 0xFFFF;
                                if (var17.field2860 != 0) {
                                    var17.field2860 |= 0xFF000000;
                                }
                            }
                        }
                    }
                }
            }
            method2044(field4881, field4868, field4879, arg1, arg2);
            field4881 = null;
            method2052();
            return;
        }
    }

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "(Lza;)V", line = 505)
    public static final void method2042(class288 arg0) {
        int var1 = field4861 - field4863;
        int var2 = field4874 - field4882;
        int var3 = (field4875 - field4864 << 16) / var1;
        int var4 = (field4870 - field4866 << 16) / var2;
        method2045(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Ll;III)I", line = 516)
    private static final int method2043(class16 arg0, int arg1, int arg2, int arg3) {
        class193 var4 = field4845.method2077(arg1, (byte) 64);
        if (var4 == null) {
            return 0;
        }
        int var5 = var4.field3121;
        if (var5 >= 0 && arg0.method105(-123, var5).field7149) {
            var5 = -1;
        }
        int var9;
        if (var4.field3109 >= 0) {
            int var6 = var4.field3109;
            int var7 = (var6 & 0x7F) + arg3;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 127) {
                var7 = 127;
            }
            int var8 = (arg2 + var6 & 0xFC00) + (var6 & 0x380) + var7;
            var9 = class198.field3177[class127.method1000(class212.method1438(var8, 12345678, 96), (byte) -34) & 0xFFFF] | 0xFF000000;
        } else if (var5 >= 0) {
            var9 = class198.field3177[class127.method1000(class212.method1438(arg0.method105(-126, var5).field7152, 12345678, 96), (byte) -51) & 0xFFFF] | 0xFF000000;
        } else if (var4.field3114 == -1) {
            var9 = 0;
        } else {
            int var10 = var4.field3114;
            int var11 = (var10 & 0x7F) + arg3;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 127) {
                var11 = 127;
            }
            int var12 = (arg2 + var10 & 0xFC00) + (var10 & 0x380) + var11;
            var9 = class198.field3177[class127.method1000(class212.method1438(var12, 12345678, 96), (byte) -36) & 0xFFFF] | 0xFF000000;
        }
        return var9;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "([B[B[SII)V", line = 573)
    private static final void method2044(byte[] arg0, byte[] arg1, short[] arg2, int arg3, int arg4) {
        int[] var5 = new int[field4865];
        int[] var6 = new int[field4865];
        int[] var7 = new int[field4865];
        int[] var8 = new int[field4865];
        int[] var9 = new int[field4865];
        for (int var10 = -5; var10 < field4880; var10++) {
            int var11 = var10 + 5;
            int var12 = var10 - 5;
            for (int var13 = 0; var13 < field4865; var13++) {
                int var10002;
                if (var11 < field4880) {
                    int var28 = arg0[field4880 * var13 + var11] & 0xFF;
                    if (var28 > 0) {
                        class526 var29 = field4844.method679(32020, var28 - 1);
                        var5[var13] += var29.field7642;
                        var6[var13] += var29.field7644;
                        var7[var13] += var29.field7651;
                        var8[var13] += var29.field7649;
                        var10002 = var9[var13]++;
                    }
                }
                if (var12 >= 0) {
                    int var30 = arg0[field4880 * var13 + var12] & 0xFF;
                    if (var30 > 0) {
                        class526 var31 = field4844.method679(32020, var30 - 1);
                        var5[var13] -= var31.field7642;
                        var6[var13] -= var31.field7644;
                        var7[var13] -= var31.field7651;
                        var8[var13] -= var31.field7649;
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
                for (int var19 = -5; var19 < field4865; var19++) {
                    int var20 = var19 + 5;
                    if (var20 < field4865) {
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
                        if ((arg0[field4880 * var19 + var10] & 0xFF) == 0) {
                            int var22 = field4880 * var19 + var10;
                            arg1[var22] = 0;
                            arg2[var22] = 0;
                        } else {
                            int var23 = var17 == 0 ? 0 : class485.method2904(false, var15 / var18, var14 * 256 / var17, var16 / var18);
                            int var24 = (var23 & 0x7F) + arg4;
                            if (var24 < 0) {
                                var24 = 0;
                            } else if (var24 > 127) {
                                var24 = 127;
                            }
                            int var25 = (arg3 + var23 & 0xFC00) + (var23 & 0x380) + var24;
                            int var26 = field4880 * var19 + var10;
                            int var27 = class198.field3177[class127.method1000(class372.method2283(var25, true, 96), (byte) -102) & 0xFFFF];
                            arg1[var26] = (byte) (var27 >> 16 & 0xFF);
                            arg2[var26] = (short) (var27 & 0xFFFF);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "(Lza;IIII)V", line = 717)
    private static final void method2045(class288 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = field4861 - field4863;
        int var6 = field4874 - field4882;
        if (field4861 < field4880) {
            var5++;
        }
        if (field4874 < field4865) {
            var6++;
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var49 = (arg1 * var7 + arg3 >> 16) + field4864;
            int var50 = ((var7 + 1) * arg1 + arg3 >> 16) + field4864;
            int var51 = var50 - var49;
            if (var51 > 0) {
                int var52 = field4863 + var7;
                if (var52 >= 0 && var52 < field4880) {
                    for (int var53 = 0; var53 < var6; var53++) {
                        int var54 = field4870 - ((var53 + 1) * arg2 + arg4 >> 16);
                        int var55 = field4870 - (arg2 * var53 + arg4 >> 16);
                        int var56 = var55 - var54;
                        if (var56 > 0) {
                            int var57 = field4882 + var53;
                            int var58 = field4880 * var57 + var52;
                            int var59 = 0;
                            int var60 = 0;
                            int var61 = 0;
                            if (var57 >= 0 && var57 < field4865) {
                                var59 = (field4868[var58] & 0xFF) << 16 | field4879[var58] & 0xFFFF;
                                if (var59 != 0) {
                                    var59 |= 0xFF000000;
                                }
                                var60 = field4873[var58] & 0xFF;
                                var61 = field4867[var58] & 0xFFFF;
                            }
                            if (var59 == 0 && var60 == 0 && var61 == 0) {
                                int var62;
                                if (field4850.field3076 != -1) {
                                    var62 = field4850.field3076 | 0xFF000000;
                                } else if ((field4874 + var53 & 0x4) == (field4863 + var7 & 0x4)) {
                                    var62 = field4877[field4845.field4991 + 1];
                                } else {
                                    var62 = -11840664;
                                }
                                if (var62 == 0) {
                                    var62 = -16777216;
                                }
                                arg0.method327(var49, var54, var51, var56, var62, 0);
                            } else if (var61 <= 0) {
                                method2046(arg0, var49, var54, var51, var56, var59, var60, field4862[var58], null, null, true);
                            } else if (var61 == 65535) {
                                class530 var63 = (class530) field4871.method1622((long) (var52 << 16 | var57), -116);
                                if (var63 != null) {
                                    method2046(arg0, var49, var54, var51, var56, var59, var60, field4862[var58], var63.field7723, var63.field7724, true);
                                }
                            } else {
                                field4860[0] = (short) (var61 - 1);
                                field4852[0] = field4878[var58];
                                method2046(arg0, var49, var54, var51, var56, var59, var60, field4862[var58], field4860, field4852, true);
                            }
                        }
                    }
                } else {
                    for (int var64 = 0; var64 < var6; var64++) {
                        int var65 = field4870 - ((var64 + 1) * arg2 + arg4 >> 16);
                        int var66 = field4870 - (arg2 * var64 + arg4 >> 16);
                        int var67 = var66 - var65;
                        int var68;
                        if (field4850.field3076 != -1) {
                            var68 = field4850.field3076 | 0xFF000000;
                        } else if ((field4874 + var64 & 0x4) == (field4863 + var7 & 0x4)) {
                            var68 = field4877[field4845.field4991 + 1];
                        } else {
                            var68 = -11840664;
                        }
                        if (var68 == 0) {
                            var68 = -16777216;
                        }
                        arg0.method327(var49, var65, var51, var67, var68, 0);
                    }
                }
            }
        }
        for (int var8 = -16; var8 < var5 + 16; var8++) {
            int var38 = (arg1 * var8 + arg3 >> 16) + field4864;
            int var39 = ((var8 + 1) * arg1 + arg3 >> 16) + field4864;
            int var40 = var39 - var38;
            if (var40 > 0) {
                int var41 = field4863 + var8;
                if (var41 >= 0 && var41 < field4880) {
                    for (int var42 = -16; var42 < var6 + 16; var42++) {
                        int var43 = field4870 - ((var42 + 1) * arg2 + arg4 >> 16);
                        int var44 = field4870 - (arg2 * var42 + arg4 >> 16);
                        int var45 = var44 - var43;
                        if (var45 > 0) {
                            int var46 = field4882 + var42;
                            if (var46 >= 0 && var46 < field4865) {
                                int var47 = field4867[field4880 * var46 + var41] & 0xFFFF;
                                if (var47 <= 0) {
                                    method2032(arg0, var38, var43, var40, var45, null, null);
                                } else if (var47 == 65535) {
                                    class530 var48 = (class530) field4871.method1622((long) (var41 << 16 | var46), -120);
                                    if (var48 != null) {
                                        method2032(arg0, var38, var43, var40, var45, var48.field7723, var48.field7724);
                                    }
                                } else {
                                    field4860[0] = (short) (var47 - 1);
                                    field4852[0] = field4878[field4880 * var46 + var41];
                                    method2032(arg0, var38, var43, var40, var45, field4860, field4852);
                                }
                            }
                        }
                    }
                }
            }
        }
        int var9 = field4863 >> 6;
        int var10 = field4882 >> 6;
        if (var9 < 0) {
            var9 = 0;
        }
        if (var10 < 0) {
            var10 = 0;
        }
        int var11 = field4861 >> 6;
        int var12 = field4874 >> 6;
        if (var11 >= field4872[0].length) {
            var11 = field4872[0].length - 1;
        }
        if (var12 >= field4872[0][0].length) {
            var12 = field4872[0][0].length - 1;
        }
        for (int var13 = 0; var13 < 3; var13++) {
            for (int var14 = var9; var14 <= var11; var14++) {
                for (int var27 = var10; var27 <= var12; var27++) {
                    class60 var28 = field4872[var13][var14][var27];
                    if (var28 != null) {
                        int var29 = ((field4876 >> 6) + var14) * 64;
                        int var30 = ((field4869 >> 6) + var27) * 64;
                        for (class176 var31 = (class176) var28.method533((byte) -92); var31 != null; var31 = (class176) var28.method536(-95)) {
                            int var32 = var31.field2862 + var29 - field4876 - field4863;
                            int var33 = var31.field2856 + var30 - field4869 - field4882;
                            int var34 = (arg1 * var32 + arg3 >> 16) + field4864;
                            int var35 = ((var32 + 1) * arg1 + arg3 >> 16) + field4864;
                            int var36 = field4870 - ((var33 + 1) * arg2 + arg4 >> 16);
                            int var37 = field4870 - (arg2 * var33 + arg4 >> 16);
                            method2046(arg0, var34, var36, var35 - var34, var37 - var36, var31.field2860, var31.field2857 & 0xFF, var31.field2861, var31.field2859, var31.field2858, false);
                        }
                    }
                }
            }
            for (int var15 = var9; var15 <= var11; var15++) {
                for (int var16 = var10; var16 <= var12; var16++) {
                    class60 var17 = field4872[var13][var15][var16];
                    if (var17 != null) {
                        int var18 = ((field4876 >> 6) + var15) * 64;
                        int var19 = ((field4869 >> 6) + var16) * 64;
                        for (class176 var20 = (class176) var17.method533((byte) -124); var20 != null; var20 = (class176) var17.method536(99)) {
                            int var21 = var20.field2862 + var18 - field4876 - field4863;
                            int var22 = var20.field2856 + var19 - field4869 - field4882;
                            int var23 = (arg1 * var21 + arg3 >> 16) + field4864;
                            int var24 = ((var21 + 1) * arg1 + arg3 >> 16) + field4864;
                            int var25 = field4870 - ((var22 + 1) * arg2 + arg4 >> 16);
                            int var26 = field4870 - (arg2 * var22 + arg4 >> 16);
                            method2032(arg0, var23, var25, var24 - var23, var26 - var25, var20.field2859, var20.field2858);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lza;IIIIIII[S[BZ)V", line = 1060)
    private static final void method2046(class288 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, short[] arg8, byte[] arg9, boolean arg10) {
        if (arg10 || arg5 != 0 || arg6 > 0) {
            if (arg6 == 0) {
                arg0.method327(arg1, arg2, arg3, arg4, arg5, 0);
            } else {
                int var11 = arg7 & 0x3F;
                if (var11 == 0 || arg3 <= 1 || arg4 <= 1) {
                    int var13 = field4877[arg6];
                    if (arg10 || var13 != 0) {
                        arg0.method327(arg1, arg2, arg3, arg4, var13, 0);
                    }
                } else {
                    int var12 = arg10 ? 0 : 1;
                    class483.method2900(field4877[arg6], field4857, arg3, 124, arg4, arg2, arg5, arg7 >> 6 & 0x3, var12, field4851, arg0, arg1, var11);
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
                class306 var18 = field4846.method1530((byte) -123, arg8[var16] & 0xFFFF);
                if (var18.field4597 == -1) {
                    int var19 = -3355444;
                    if (var18.field4587 == 1) {
                        var19 = -3407872;
                    }
                    int var20 = arg9[var16] >> 6 & 0x3;
                    if (var17 == 0) {
                        if (var20 == 0) {
                            arg0.method405(arg1, arg2, arg4, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method345(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method405(var14, arg2, arg4, var19, 0);
                        } else {
                            arg0.method345(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 2) {
                        if (var20 == 0) {
                            arg0.method405(arg1, arg2, arg4, -1, 0);
                            arg0.method345(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method405(var14, arg2, arg4, -1, 0);
                            arg0.method345(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method405(var14, arg2, arg4, -1, 0);
                            arg0.method345(arg1, var15, arg3, var19, 0);
                        } else {
                            arg0.method405(arg1, arg2, arg4, -1, 0);
                            arg0.method345(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 3) {
                        if (var20 == 0) {
                            arg0.method345(arg1, arg2, 1, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method345(var14, arg2, 1, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method345(var14, var15, 1, var19, 0);
                        } else {
                            arg0.method345(arg1, var15, 1, var19, 0);
                        }
                    } else if (var17 == 9) {
                        if (var20 == 0 || var20 == 2) {
                            for (int var22 = 0; var22 < arg4; var22++) {
                                arg0.method345(arg1 + var22, var15 - var22, 1, var19, 0);
                            }
                        } else {
                            for (int var21 = 0; var21 < arg4; var21++) {
                                arg0.method345(arg1 + var21, arg2 + var21, 1, var19, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gt", name = "c", descriptor = "()V", line = 1221)
    public static void method2047() {
        field4845 = null;
        field4844 = null;
        field4846 = null;
        field4842 = null;
        field4848 = null;
        field4849 = null;
        field4850 = null;
        field4847 = null;
        field4843 = null;
        field4857 = null;
        field4860 = null;
        field4852 = null;
        field4854 = null;
        field4858 = null;
        field4877 = null;
        field4881 = null;
        field4868 = null;
        field4879 = null;
        field4873 = null;
        field4862 = null;
        field4867 = null;
        field4878 = null;
        field4871 = null;
        field4872 = null;
    }

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "(I)Lao;", line = 1248)
    public static final class191 method2048(int arg0) {
        return (class191) field4843.method1622((long) arg0, 92);
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(IIIIIIII)V", line = 1251)
    public static final void method2049(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4863 = arg0 - field4876;
        field4874 = arg1 - field4869;
        field4861 = arg2 - field4876;
        field4882 = arg3 - field4869;
        field4864 = arg4;
        field4866 = arg5;
        field4875 = arg6;
        field4870 = arg7;
    }

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "(II)Lju;", line = 1262)
    public static final class83 method2050(int arg0, int arg1) {
        class83 var2 = new class83();
        for (class191 var3 = (class191) field4843.method1615(0); var3 != null; var3 = (class191) field4843.method1621((byte) 127)) {
            if (var3.field3089 && var3.method1299((byte) -62, arg1, arg0)) {
                var2.method776(0, var3);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!gt", name = "d", descriptor = "()V", line = 1277)
    public static final void method2051() {
        field4881 = null;
        field4868 = null;
        field4879 = null;
        field4873 = null;
        field4862 = null;
        field4867 = null;
        field4878 = null;
        field4871 = null;
        field4872 = null;
        field4877 = null;
    }

    @OriginalMember(owner = "client!gt", name = "e", descriptor = "()V", line = 1292)
    private static final void method2052() {
        for (int var0 = 0; var0 < field4880; var0++) {
            for (int var11 = 0; var11 < field4865; var11++) {
                int var12 = field4867[field4880 * var11 + var0] & 0xFFFF;
                if (var12 != 0) {
                    if (var12 == 65535) {
                        class530 var13 = (class530) field4871.method1622((long) (var0 << 16 | var11), -108);
                        if (var13 != null) {
                            for (int var14 = 0; var14 < var13.field7723.length; var14++) {
                                class306 var15 = field4846.method1530((byte) -15, var13.field7723[var14] & 0xFFFF);
                                int var16 = var15.field4615;
                                if (var15.field4593 != null) {
                                    class306 var17 = var15.method1951(field4849, 0);
                                    if (var17 != null) {
                                        var16 = var17.field4615;
                                    }
                                }
                                if (var16 != -1) {
                                    class97 var18 = new class97(var16);
                                    var18.field1897 = var0;
                                    var18.field1893 = var11;
                                    field4858.method1885(false, var18);
                                }
                            }
                        }
                    } else {
                        class306 var19 = field4846.method1530((byte) -24, var12 - 1);
                        int var20 = var19.field4615;
                        if (var19.field4593 != null) {
                            class306 var21 = var19.method1951(field4849, 0);
                            if (var21 != null) {
                                var20 = var21.field4615;
                            }
                        }
                        if (var20 != -1) {
                            class97 var22 = new class97(var20);
                            var22.field1897 = var0;
                            var22.field1893 = var11;
                            field4858.method1885(false, var22);
                        }
                    }
                }
            }
        }
        for (int var1 = 0; var1 < 3; var1++) {
            for (int var2 = 0; var2 < field4872[0].length; var2++) {
                for (int var3 = 0; var3 < field4872[0][0].length; var3++) {
                    class60 var4 = field4872[var1][var2][var3];
                    if (var4 != null) {
                        for (class176 var5 = (class176) var4.method533((byte) -87); var5 != null; var5 = (class176) var4.method536(-90)) {
                            if (var5.field2859 != null) {
                                for (int var6 = 0; var6 < var5.field2859.length; var6++) {
                                    class306 var7 = field4846.method1530((byte) -112, var5.field2859[var6] & 0xFFFF);
                                    int var8 = var7.field4615;
                                    if (var7.field4593 != null) {
                                        class306 var9 = var7.method1951(field4849, 0);
                                        if (var9 != null) {
                                            var8 = var9.field4615;
                                        }
                                    }
                                    if (var8 != -1) {
                                        class97 var10 = new class97(var8);
                                        var10.field1897 = ((field4876 >> 6) + var2) * 64 + var5.field2862 - field4876;
                                        var10.field1893 = ((field4869 >> 6) + var3) * 64 + var5.field2856 - field4869;
                                        field4858.method1885(false, var10);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
