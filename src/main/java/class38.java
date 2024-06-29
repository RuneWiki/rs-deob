import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class class38 {

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "Ll;")
    private static class328 field818 = new class328(16);

    @OriginalMember(owner = "client!rn", name = "g", descriptor = "I")
    public static int field823 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!rn", name = "c", descriptor = "I")
    public static int field819 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!rn", name = "i", descriptor = "Lea;")
    public static class227 field825 = new class227();

    @OriginalMember(owner = "client!rn", name = "f", descriptor = "F")
    public static float field822;

    @OriginalMember(owner = "client!rn", name = "l", descriptor = "F")
    public static float field828;

    @OriginalMember(owner = "client!rn", name = "d", descriptor = "I")
    public static int field820;

    @OriginalMember(owner = "client!rn", name = "e", descriptor = "I")
    public static int field821;

    @OriginalMember(owner = "client!rn", name = "h", descriptor = "I")
    public static int field824;

    @OriginalMember(owner = "client!rn", name = "j", descriptor = "I")
    public static int field826;

    @OriginalMember(owner = "client!rn", name = "n", descriptor = "I")
    public static int field830;

    @OriginalMember(owner = "client!rn", name = "o", descriptor = "I")
    public static int field831;

    @OriginalMember(owner = "client!rn", name = "s", descriptor = "I")
    public static int field835;

    @OriginalMember(owner = "client!rn", name = "v", descriptor = "I")
    public static int field838;

    @OriginalMember(owner = "client!rn", name = "w", descriptor = "I")
    public static int field839;

    @OriginalMember(owner = "client!rn", name = "z", descriptor = "I")
    public static int field842;

    @OriginalMember(owner = "client!rn", name = "B", descriptor = "I")
    public static int field844;

    @OriginalMember(owner = "client!rn", name = "D", descriptor = "I")
    public static int field845;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "Lek;")
    public static class206 field817;

    @OriginalMember(owner = "client!rn", name = "m", descriptor = "Lpg;")
    public static class226 field829;

    @OriginalMember(owner = "client!rn", name = "k", descriptor = "Lga;")
    public static class23 field827;

    @OriginalMember(owner = "client!rn", name = "q", descriptor = "[I")
    public static int[] field833;

    @OriginalMember(owner = "client!rn", name = "p", descriptor = "[[[B")
    public static byte[][][] field832;

    @OriginalMember(owner = "client!rn", name = "t", descriptor = "[[[B")
    public static byte[][][] field836;

    @OriginalMember(owner = "client!rn", name = "u", descriptor = "[[[B")
    public static byte[][][] field837;

    @OriginalMember(owner = "client!rn", name = "x", descriptor = "[[[B")
    public static byte[][][] field840;

    @OriginalMember(owner = "client!rn", name = "y", descriptor = "[[[B")
    public static byte[][][] field841;

    @OriginalMember(owner = "client!rn", name = "r", descriptor = "[[[I")
    public static int[][][] field834;

    @OriginalMember(owner = "client!rn", name = "A", descriptor = "[[[I")
    public static int[][][] field843;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(Loe;)V", line = 4)
    public static final void method272(class146 arg0) {
        label83: while (true) {
            if (arg0.field2435 < arg0.field2496.length) {
                boolean var1 = false;
                int var2 = 0;
                int var3 = 0;
                if (arg0.method1005((byte) 122) == 1) {
                    var1 = true;
                    var2 = arg0.method1005((byte) 122);
                    var3 = arg0.method1005((byte) 122);
                }
                int var4 = arg0.method1005((byte) 122);
                int var5 = arg0.method1005((byte) 122);
                int var6 = var4 * 64 - field826;
                int var7 = field821 - (var5 * 64 - field820) - 1;
                if (var6 >= 0 && var7 - 63 >= 0 && var6 + 63 < field824 && var7 < field821) {
                    int var8 = var6 >> 6;
                    int var9 = var7 >> 6;
                    int var10 = 0;
                    while (true) {
                        if (var10 >= 64) {
                            continue label83;
                        }
                        for (int var11 = 0; var11 < 64; var11++) {
                            if (!var1 || var10 >= var2 * 8 && var10 < var2 * 8 + 8 && var11 >= var3 * 8 && var11 < var3 * 8 + 8) {
                                byte var12 = arg0.method1029(-2);
                                if (var12 != 0) {
                                    if (field841[var8][var9] == null) {
                                        field841[var8][var9] = new byte[4096];
                                    }
                                    field841[var8][var9][(63 - var11 << 6) + var10] = var12;
                                    byte var13 = arg0.method1029(-2);
                                    if (field832[var8][var9] == null) {
                                        field832[var8][var9] = new byte[4096];
                                    }
                                    field832[var8][var9][(63 - var11 << 6) + var10] = var13;
                                }
                            }
                        }
                        var10++;
                    }
                }
                int var14 = 0;
                while (true) {
                    if (var14 >= (var1 ? 64 : 4096)) {
                        continue label83;
                    }
                    byte var15 = arg0.method1029(-2);
                    if (var15 != 0) {
                        arg0.field2435++;
                    }
                    var14++;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "()V", line = 89)
    public static final void method273() {
        int var0 = field842 - field844;
        int var1 = field835 - field839;
        int var2 = (field845 - field831 << 16) / var0;
        int var3 = (field830 - field838 << 16) / var1;
        method286(var2, var3, 0, 0);
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(Lek;)V", line = 99)
    public static final void method274(class206 arg0) {
        field817 = arg0;
        field818.method2346((byte) -59);
        int var1 = field817.method1402(-82, "details");
        int[] var2 = field817.method1413(var1, (byte) 84);
        for (int var3 = 0; var3 < var2.length; var3++) {
            field818.method2337(class96.method737((byte) 104, new class146(field817.method1404(var1, var2[var3], (byte) -116)), var2[var3]), 709, (long) var2[var3]);
        }
    }

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "(Loe;)V", line = 117)
    public static final void method275(class146 arg0) {
        label83: while (true) {
            if (arg0.field2435 < arg0.field2496.length) {
                boolean var1 = false;
                int var2 = 0;
                int var3 = 0;
                if (arg0.method1005((byte) 122) == 1) {
                    var1 = true;
                    var2 = arg0.method1005((byte) 122);
                    var3 = arg0.method1005((byte) 122);
                }
                int var4 = arg0.method1005((byte) 122);
                int var5 = arg0.method1005((byte) 122);
                int var6 = var4 * 64 - field826;
                int var7 = field821 - (var5 * 64 - field820) - 1;
                if (var6 >= 0 && var7 - 63 >= 0 && var6 + 63 < field824 && var7 < field821) {
                    int var8 = var6 >> 6;
                    int var9 = var7 >> 6;
                    int var10 = 0;
                    while (true) {
                        if (var10 >= 64) {
                            continue label83;
                        }
                        for (int var11 = 0; var11 < 64; var11++) {
                            if (!var1 || var10 >= var2 * 8 && var10 < var2 * 8 + 8 && var11 >= var3 * 8 && var11 < var3 * 8 + 8) {
                                byte var12 = arg0.method1029(-2);
                                if (var12 != 0) {
                                    if (field836[var8][var9] == null) {
                                        field836[var8][var9] = new byte[4096];
                                    }
                                    field836[var8][var9][(63 - var11 << 6) + var10] = var12;
                                    byte var13 = arg0.method1029(-2);
                                    if (field837[var8][var9] == null) {
                                        field837[var8][var9] = new byte[4096];
                                    }
                                    field837[var8][var9][(63 - var11 << 6) + var10] = var13;
                                }
                            }
                        }
                        var10++;
                    }
                }
                int var14 = 0;
                while (true) {
                    if (var14 >= (var1 ? 64 : 4096)) {
                        continue label83;
                    }
                    byte var15 = arg0.method1029(-2);
                    if (var15 != 0) {
                        arg0.field2435++;
                    }
                    var14++;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(Loe;Z)V", line = 209)
    public static final void method276(class146 arg0, boolean arg1) {
        label125: while (true) {
            if (arg0.field2435 < arg0.field2496.length) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg0.method1005((byte) 122) == 1) {
                    var2 = true;
                    var3 = arg0.method1005((byte) 122);
                    var4 = arg0.method1005((byte) 122);
                }
                int var5 = arg0.method1005((byte) 122);
                int var6 = arg0.method1005((byte) 122);
                int var7 = var5 * 64 - field826;
                int var8 = field821 - (var6 * 64 - field820) - 1;
                if (var7 >= 0 && var8 - 63 >= 0 && var7 + 63 < field824 && var8 < field821) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    int var11 = 0;
                    while (true) {
                        if (var11 >= 64) {
                            continue label125;
                        }
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || var11 >= var3 * 8 && var11 < var3 * 8 + 8 && var12 >= var4 * 8 && var12 < var4 * 8 + 8) {
                                int var13 = arg0.method1005((byte) 122);
                                if (var13 != 0) {
                                    if ((var13 & 0x1) == 1) {
                                        int var14 = arg0.method1005((byte) 122);
                                        if (field840[var9][var10] == null) {
                                            field840[var9][var10] = new byte[4096];
                                        }
                                        field840[var9][var10][(63 - var12 << 6) + var11] = (byte) var14;
                                    }
                                    if ((var13 & 0x2) == 2) {
                                        int var15 = arg0.method1025((byte) -115);
                                        if (field834[var9][var10] == null) {
                                            field834[var9][var10] = new int[4096];
                                        }
                                        field834[var9][var10][(63 - var12 << 6) + var11] = var15;
                                    }
                                    if ((var13 & 0x4) == 4) {
                                        int var16 = arg0.method989(113);
                                        int var17 = arg0.method1005((byte) 122);
                                        int var22 = var16 - 1;
                                        class238 var18 = class1.method7(var22, 25);
                                        if (var18.field3937 != null) {
                                            var18 = var18.method1651(112);
                                            if (var18 == null || var18.field3893 == -1) {
                                                continue;
                                            }
                                        }
                                        if ((!var18.field3911 || arg1) && var18.field3893 != -1) {
                                            class127 var19 = new class127();
                                            var19.field2219 = var18.field3893;
                                            var19.field2213 = var17;
                                            var19.field2216 = var9 * 64 + var11;
                                            var19.field2217 = var10 * 64 + (64 - var12);
                                            field825.method1585(var19, (byte) -12);
                                        }
                                    }
                                }
                            }
                        }
                        var11++;
                    }
                }
                int var20 = 0;
                while (true) {
                    if (var20 >= (var2 ? 64 : 4096)) {
                        continue label125;
                    }
                    int var21 = arg0.method1005((byte) 122);
                    if (var21 != 0) {
                        if ((var21 & 0x1) == 1) {
                            arg0.field2435++;
                        }
                        if ((var21 & 0x2) == 2) {
                            arg0.field2435 += 2;
                        }
                        if ((var21 & 0x4) == 4) {
                            arg0.field2435 += 3;
                        }
                    }
                    var20++;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)V", line = 344)
    public static final void method277(int arg0) {
        field829 = (class226) field818.method2344(-1, (long) arg0);
    }

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "()Len;", line = 351)
    public static final class49 method278() {
        int var0 = field842 - field844;
        int var1 = field835 - field839;
        int var2 = (field845 - field831 << 16) / var0;
        int var3 = (field830 - field838 << 16) / var1;
        return method283(var2, var3, 0, 0);
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(II)Lea;", line = 362)
    public static final class227 method279(int arg0, int arg1) {
        class227 var2 = new class227();
        for (class226 var3 = (class226) field818.method2345((byte) -105); var3 != null; var3 = (class226) field818.method2336(-110)) {
            if (var3.field3719 && var3.method1574(0, arg1, arg0)) {
                var2.method1585(var3, (byte) -12);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "(II)Lpg;", line = 379)
    public static final class226 method280(int arg0, int arg1) {
        for (class226 var2 = (class226) field818.method2345((byte) 97); var2 != null; var2 = (class226) field818.method2336(-105)) {
            if (var2.field3719 && var2.method1574(0, arg1, arg0)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!rn", name = "c", descriptor = "(II)V", line = 393)
    public static final void method281(int arg0, int arg1) {
        for (int var2 = 0; var2 < class197.field3306; var2++) {
            class352 var3 = class131.method929(var2, 8);
            if (var3 != null) {
                int var4 = var3.field5633;
                if (var4 >= 0 && !class305.field4968.method74(var4, (byte) -105)) {
                    var4 = -1;
                }
                int var8;
                if (var3.field5626 >= 0) {
                    int var5 = var3.field5626;
                    int var6 = (var5 & 0x7F) + arg1;
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 127) {
                        var6 = 127;
                    }
                    int var7 = (arg0 + var5 & 0xFC00) + (var5 & 0x380) + var6;
                    var8 = class305.field4956[class215.method1496(var7, -11425, 96)];
                } else if (var4 >= 0) {
                    var8 = class305.field4956[class215.method1496(class305.field4968.method85(var4, (byte) -82), -11425, 96)];
                } else if (var3.field5634 == -1) {
                    var8 = -1;
                } else {
                    int var9 = var3.field5634;
                    int var10 = (var9 & 0x7F) + arg1;
                    if (var10 < 0) {
                        var10 = 0;
                    } else if (var10 > 127) {
                        var10 = 127;
                    }
                    int var11 = (arg0 + var9 & 0xFC00) + (var9 & 0x380) + var10;
                    var8 = class305.field4956[class215.method1496(var11, -11425, 96)];
                }
                field833[var2 + 1] = var8;
            }
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(Lsb;IIII)V", line = 456)
    private static final void method282(class127 arg0, int arg1, int arg2, int arg3, int arg4) {
        arg0.field2223 = ((arg0.field2216 - field844) * arg1 + arg3 >> 16) + field831;
        arg0.field2227 = ((arg0.field2217 - field839) * arg2 + arg4 >> 16) + field838;
        class1 var5 = class125.method901(arg0.field2219, (byte) -76);
        if (var5.field16 != -1) {
            class323 var6 = var5.method4(0, false, true);
            if (var6 != null) {
                if (arg0.field2223 - (var6.field5229 + 1 >> 1) <= field845 && (var6.field5229 + 1 >> 1) + arg0.field2223 >= field831 && arg0.field2227 - (var6.field5236 + 1 >> 1) <= field830 && (var6.field5236 + 1 >> 1) + arg0.field2227 >= field838) {
                    arg0.field2215 = false;
                } else {
                    arg0.field2215 = true;
                }
                return;
            }
        }
        if (arg0.field2216 >= field844 && arg0.field2216 <= field842 && arg0.field2217 >= field839 && arg0.field2217 <= field835) {
            arg0.field2215 = false;
        } else {
            arg0.field2215 = true;
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(IIII)Len;", line = 485)
    private static final class49 method283(int arg0, int arg1, int arg2, int arg3) {
        class49 var4 = new class49();
        for (class127 var5 = (class127) field825.method1580((byte) -128); var5 != null; var5 = (class127) field825.method1586((byte) 50)) {
            method282(var5, arg0, arg1, arg2, arg3);
            var4.method437(var5, (byte) 51);
        }
        int[] var6 = new int[3];
        for (int var7 = 0; var7 < field827.field562; var7++) {
            class127 var8 = field827.field564[var7];
            boolean var9 = field829.method1578(field827.field566[var7] >> 28 & 0x3, field827.field566[var7] & 0x3FFF, var6, field827.field566[var7] >> 14 & 0x3FFF, 601);
            if (var9) {
                var8.field2216 = var6[1] - field826;
                var8.field2217 = field821 - (var6[2] - field820) - 1;
                method282(var8, arg0, arg1, arg2, arg3);
                var4.method437(var8, (byte) 51);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!rn", name = "c", descriptor = "()V", line = 521)
    public static void method284() {
        field817 = null;
        field818 = null;
        field829 = null;
        field827 = null;
        field825 = null;
        field843 = (int[][][]) null;
        field841 = (byte[][][]) null;
        field832 = (byte[][][]) null;
        field836 = (byte[][][]) null;
        field837 = (byte[][][]) null;
        field840 = (byte[][][]) null;
        field834 = (int[][][]) null;
        field833 = null;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "([IIIIIIIIIZ)V", line = 537)
    private static final void method285(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        int var10 = arg1;
        if (arg1 >= class270.field4405) {
            return;
        }
        if (arg1 < class270.field4400) {
            var10 = class270.field4400;
        }
        int var11 = arg1 + arg5;
        if (var11 <= class270.field4400) {
            return;
        }
        if (var11 > class270.field4405) {
            var11 = class270.field4405;
        }
        int var12 = arg2;
        if (arg2 >= class270.field4399) {
            return;
        }
        if (arg2 < class270.field4407) {
            var12 = class270.field4407;
        }
        int var13 = arg2 + arg6;
        if (var13 <= class270.field4407) {
            return;
        }
        if (var13 > class270.field4399) {
            var13 = class270.field4399;
        }
        int var14 = class270.field4406 * var12 + var10;
        int var15 = class270.field4406 + var10 - var11;
        int var16 = var10 - arg1;
        int var17 = var11 - arg1;
        int var18 = var12 - arg2;
        int var19 = var13 - arg2;
        int var20 = arg5 - var17;
        int var21 = arg5 - var16;
        int var22 = arg6 - var19;
        int var23 = arg6 - var18;
        if (arg7 == 9) {
            arg7 = 1;
            arg8 = arg8 + 1 & 0x3;
        }
        if (arg7 == 10) {
            arg7 = 1;
            arg8 = arg8 + 3 & 0x3;
        }
        if (arg7 == 11) {
            arg7 = 8;
            arg8 = arg8 + 3 & 0x3;
        }
        if (arg7 == 1) {
            if (arg8 == 0) {
                for (int var24 = var18; var24 < var19; var24++) {
                    for (int var25 = var16; var25 < var17; var25++) {
                        if (var25 <= var24) {
                            arg0[var14] = arg4;
                        } else if (arg9) {
                            arg0[var14] = arg3;
                        }
                        var14++;
                    }
                    var14 += var15;
                }
            } else if (arg8 == 1) {
                for (int var26 = var23 - 1; var26 >= var22; var26--) {
                    for (int var27 = var16; var27 < var17; var27++) {
                        if (var27 <= var26) {
                            arg0[var14] = arg4;
                        } else if (arg9) {
                            arg0[var14] = arg3;
                        }
                        var14++;
                    }
                    var14 += var15;
                }
            } else if (arg8 == 2) {
                for (int var28 = var18; var28 < var19; var28++) {
                    for (int var29 = var16; var29 < var17; var29++) {
                        if (var29 >= var28) {
                            arg0[var14] = arg4;
                        } else if (arg9) {
                            arg0[var14] = arg3;
                        }
                        var14++;
                    }
                    var14 += var15;
                }
            } else if (arg8 == 3) {
                for (int var30 = var23 - 1; var30 >= var22; var30--) {
                    for (int var31 = var16; var31 < var17; var31++) {
                        if (var31 >= var30) {
                            arg0[var14] = arg4;
                        } else if (arg9) {
                            arg0[var14] = arg3;
                        }
                        var14++;
                    }
                    var14 += var15;
                }
            }
        } else if (arg7 == 2) {
            if (arg8 == 0) {
                for (int var32 = var23 - 1; var32 >= var22; var32--) {
                    for (int var33 = var16; var33 < var17; var33++) {
                        if (var33 <= var32 >> 1) {
                            arg0[var14] = arg4;
                        } else if (arg9) {
                            arg0[var14] = arg3;
                        }
                        var14++;
                    }
                    var14 += var15;
                }
            } else if (arg8 == 1) {
                for (int var34 = var18; var34 < var19; var34++) {
                    for (int var35 = var16; var35 < var17; var35++) {
                        if (var14 >= 0 && var14 < arg0.length) {
                            if (var35 >= var34 << 1) {
                                arg0[var14] = arg4;
                            } else if (arg9) {
                                arg0[var14] = arg3;
                            }
                            var14++;
                        } else {
                            var14++;
                        }
                    }
                    var14 += var15;
                }
            } else if (arg8 == 2) {
                for (int var36 = var18; var36 < var19; var36++) {
                    for (int var37 = var21 - 1; var37 >= var20; var37--) {
                        if (var37 <= var36 >> 1) {
                            arg0[var14] = arg4;
                        } else if (arg9) {
                            arg0[var14] = arg3;
                        }
                        var14++;
                    }
                    var14 += var15;
                }
            } else if (arg8 == 3) {
                for (int var38 = var23 - 1; var38 >= var22; var38--) {
                    for (int var39 = var21 - 1; var39 >= var20; var39--) {
                        if (var39 >= var38 << 1) {
                            arg0[var14] = arg4;
                        } else if (arg9) {
                            arg0[var14] = arg3;
                        }
                        var14++;
                    }
                    var14 += var15;
                }
            }
        } else if (arg7 == 3) {
            if (arg8 == 0) {
                for (int var40 = var23 - 1; var40 >= var22; var40--) {
                    for (int var41 = var21 - 1; var41 >= var20; var41--) {
                        if (var41 <= var40 >> 1) {
                            arg0[var14] = arg4;
                        } else if (arg9) {
                            arg0[var14] = arg3;
                        }
                        var14++;
                    }
                    var14 += var15;
                }
            } else if (arg8 == 1) {
                for (int var42 = var23 - 1; var42 >= var22; var42--) {
                    for (int var43 = var16; var43 < var17; var43++) {
                        if (var43 >= var42 << 1) {
                            arg0[var14] = arg4;
                        } else if (arg9) {
                            arg0[var14] = arg3;
                        }
                        var14++;
                    }
                    var14 += var15;
                }
            } else if (arg8 == 2) {
                for (int var44 = var18; var44 < var19; var44++) {
                    for (int var45 = var16; var45 < var17; var45++) {
                        if (var45 <= var44 >> 1) {
                            arg0[var14] = arg4;
                        } else if (arg9) {
                            arg0[var14] = arg3;
                        }
                        var14++;
                    }
                    var14 += var15;
                }
            } else if (arg8 == 3) {
                for (int var46 = var18; var46 < var19; var46++) {
                    for (int var47 = var21 - 1; var47 >= var20; var47--) {
                        if (var47 >= var46 << 1) {
                            arg0[var14] = arg4;
                        } else if (arg9) {
                            arg0[var14] = arg3;
                        }
                        var14++;
                    }
                    var14 += var15;
                }
            }
        } else if (arg7 == 4) {
            if (arg8 == 0) {
                for (int var48 = var23 - 1; var48 >= var22; var48--) {
                    for (int var49 = var16; var49 < var17; var49++) {
                        if (var49 >= var48 >> 1) {
                            arg0[var14] = arg4;
                        } else if (arg9) {
                            arg0[var14] = arg3;
                        }
                        var14++;
                    }
                    var14 += var15;
                }
            } else if (arg8 == 1) {
                for (int var50 = var18; var50 < var19; var50++) {
                    for (int var51 = var16; var51 < var17; var51++) {
                        if (var51 <= var50 << 1) {
                            arg0[var14] = arg4;
                        } else if (arg9) {
                            arg0[var14] = arg3;
                        }
                        var14++;
                    }
                    var14 += var15;
                }
            } else if (arg8 == 2) {
                for (int var52 = var18; var52 < var19; var52++) {
                    for (int var53 = var21 - 1; var53 >= var20; var53--) {
                        if (var53 >= var52 >> 1) {
                            arg0[var14] = arg4;
                        } else if (arg9) {
                            arg0[var14] = arg3;
                        }
                        var14++;
                    }
                    var14 += var15;
                }
            } else if (arg8 == 3) {
                for (int var54 = var23 - 1; var54 >= var22; var54--) {
                    for (int var55 = var21 - 1; var55 >= var20; var55--) {
                        if (var55 <= var54 << 1) {
                            arg0[var14] = arg4;
                        } else if (arg9) {
                            arg0[var14] = arg3;
                        }
                        var14++;
                    }
                    var14 += var15;
                }
            }
        } else if (arg7 != 5) {
            if (arg7 == 6) {
                if (arg8 == 0) {
                    for (int var64 = var18; var64 < var19; var64++) {
                        for (int var65 = var16; var65 < var17; var65++) {
                            if (var65 <= arg5 / 2) {
                                arg0[var14] = arg4;
                            } else if (arg9) {
                                arg0[var14] = arg3;
                            }
                            var14++;
                        }
                        var14 += var15;
                    }
                    return;
                }
                if (arg8 == 1) {
                    for (int var66 = var18; var66 < var19; var66++) {
                        for (int var67 = var16; var67 < var17; var67++) {
                            if (var66 <= arg6 / 2) {
                                arg0[var14] = arg4;
                            } else if (arg9) {
                                arg0[var14] = arg3;
                            }
                            var14++;
                        }
                        var14 += var15;
                    }
                    return;
                }
                if (arg8 == 2) {
                    for (int var68 = var18; var68 < var19; var68++) {
                        for (int var69 = var16; var69 < var17; var69++) {
                            if (var69 >= arg5 / 2) {
                                arg0[var14] = arg4;
                            } else if (arg9) {
                                arg0[var14] = arg3;
                            }
                            var14++;
                        }
                        var14 += var15;
                    }
                    return;
                }
                if (arg8 == 3) {
                    for (int var70 = var18; var70 < var19; var70++) {
                        for (int var71 = var16; var71 < var17; var71++) {
                            if (var70 >= arg6 / 2) {
                                arg0[var14] = arg4;
                            } else if (arg9) {
                                arg0[var14] = arg3;
                            }
                            var14++;
                        }
                        var14 += var15;
                    }
                    return;
                }
            }
            if (arg7 == 7) {
                if (arg8 == 0) {
                    for (int var72 = var18; var72 < var19; var72++) {
                        for (int var73 = var16; var73 < var17; var73++) {
                            if (var73 <= var72 - arg6 / 2) {
                                arg0[var14] = arg4;
                            } else if (arg9) {
                                arg0[var14] = arg3;
                            }
                            var14++;
                        }
                        var14 += var15;
                    }
                    return;
                }
                if (arg8 == 1) {
                    for (int var74 = var23 - 1; var74 >= var22; var74--) {
                        for (int var75 = var16; var75 < var17; var75++) {
                            if (var75 <= var74 - arg6 / 2) {
                                arg0[var14] = arg4;
                            } else if (arg9) {
                                arg0[var14] = arg3;
                            }
                            var14++;
                        }
                        var14 += var15;
                    }
                    return;
                }
                if (arg8 == 2) {
                    for (int var76 = var23 - 1; var76 >= var22; var76--) {
                        for (int var77 = var21 - 1; var77 >= var20; var77--) {
                            if (var77 <= var76 - arg6 / 2) {
                                arg0[var14] = arg4;
                            } else if (arg9) {
                                arg0[var14] = arg3;
                            }
                            var14++;
                        }
                        var14 += var15;
                    }
                    return;
                }
                if (arg8 == 3) {
                    for (int var78 = var18; var78 < var19; var78++) {
                        for (int var79 = var21 - 1; var79 >= var20; var79--) {
                            if (var79 <= var78 - arg6 / 2) {
                                arg0[var14] = arg4;
                            } else if (arg9) {
                                arg0[var14] = arg3;
                            }
                            var14++;
                        }
                        var14 += var15;
                    }
                    return;
                }
            }
            if (arg7 == 8) {
                if (arg8 == 0) {
                    for (int var80 = var18; var80 < var19; var80++) {
                        for (int var81 = var16; var81 < var17; var81++) {
                            if (var81 >= var80 - arg6 / 2) {
                                arg0[var14] = arg4;
                            } else if (arg9) {
                                arg0[var14] = arg3;
                            }
                            var14++;
                        }
                        var14 += var15;
                    }
                    return;
                }
                if (arg8 == 1) {
                    for (int var82 = var23 - 1; var82 >= var22; var82--) {
                        for (int var83 = var16; var83 < var17; var83++) {
                            if (var83 >= var82 - arg6 / 2) {
                                arg0[var14] = arg4;
                            } else if (arg9) {
                                arg0[var14] = arg3;
                            }
                            var14++;
                        }
                        var14 += var15;
                    }
                    return;
                }
                if (arg8 == 2) {
                    for (int var84 = var23 - 1; var84 >= var22; var84--) {
                        for (int var85 = var21 - 1; var85 >= var20; var85--) {
                            if (var85 >= var84 - arg6 / 2) {
                                arg0[var14] = arg4;
                            } else if (arg9) {
                                arg0[var14] = arg3;
                            }
                            var14++;
                        }
                        var14 += var15;
                    }
                    return;
                }
                if (arg8 == 3) {
                    for (int var86 = var18; var86 < var19; var86++) {
                        for (int var87 = var21 - 1; var87 >= var20; var87--) {
                            if (var87 >= var86 - arg6 / 2) {
                                arg0[var14] = arg4;
                            } else if (arg9) {
                                arg0[var14] = arg3;
                            }
                            var14++;
                        }
                        var14 += var15;
                    }
                    return;
                }
            }
        } else if (arg8 == 0) {
            for (int var56 = var23 - 1; var56 >= var22; var56--) {
                for (int var57 = var21 - 1; var57 >= var20; var57--) {
                    if (var57 >= var56 >> 1) {
                        arg0[var14] = arg4;
                    } else if (arg9) {
                        arg0[var14] = arg3;
                    }
                    var14++;
                }
                var14 += var15;
            }
        } else if (arg8 == 1) {
            for (int var58 = var23 - 1; var58 >= var22; var58--) {
                for (int var59 = var16; var59 < var17; var59++) {
                    if (var59 <= var58 << 1) {
                        arg0[var14] = arg4;
                    } else if (arg9) {
                        arg0[var14] = arg3;
                    }
                    var14++;
                }
                var14 += var15;
            }
        } else if (arg8 == 2) {
            for (int var60 = var18; var60 < var19; var60++) {
                for (int var61 = var16; var61 < var17; var61++) {
                    if (var61 >= var60 >> 1) {
                        arg0[var14] = arg4;
                    } else if (arg9) {
                        arg0[var14] = arg3;
                    }
                    var14++;
                }
                var14 += var15;
            }
        } else if (arg8 == 3) {
            for (int var62 = var18; var62 < var19; var62++) {
                for (int var63 = var21 - 1; var63 >= var20; var63--) {
                    if (var63 <= var62 << 1) {
                        arg0[var14] = arg4;
                    } else if (arg9) {
                        arg0[var14] = arg3;
                    }
                    var14++;
                }
                var14 += var15;
            }
        }
    }

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "(IIII)V", line = 1682)
    private static final void method286(int arg0, int arg1, int arg2, int arg3) {
        int var4 = field842 - field844;
        int var5 = field835 - field839;
        if (field842 < field824) {
            var4++;
        }
        if (field835 < field821) {
            var5++;
        }
        int var10000;
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = arg0 * var6 + arg2 >> 16;
            int var8 = (var6 + 1) * arg0 + arg2 >> 16;
            int var9 = var8 - var7;
            if (var9 > 0) {
                int var10 = field844 + var6 >> 6;
                if (var10 >= 0 && var10 <= field843.length - 1) {
                    int[][] var11 = field843[var10];
                    byte[][] var12 = field841[var10];
                    byte[][] var13 = field832[var10];
                    byte[][] var14 = field836[var10];
                    byte[][] var15 = field837[var10];
                    byte[][] var16 = field840[var10];
                    int var17 = field831 + var7;
                    int var18 = field831 + var8;
                    for (int var19 = 0; var19 < var5; var19++) {
                        int var20 = arg1 * var19 + arg3 >> 16;
                        int var21 = (var19 + 1) * arg1 + arg3 >> 16;
                        int var22 = var21 - var20;
                        if (var22 > 0) {
                            int var23 = field838 + var20;
                            int var24 = field838 + var21;
                            int var25 = field839 + var19 >> 6;
                            int var26 = field839 + var19 & 0x3F;
                            int var27 = field844 + var6 & 0x3F;
                            int var28 = (var26 << 6) + var27;
                            int var29;
                            if (var25 < 0 || var25 > var11.length - 1 || var11[var25] == null) {
                                if (field829.field3729 != -1) {
                                    var29 = field829.field3729;
                                } else if ((field844 + var6 & 0x4) == (field839 + var19 & 0x4)) {
                                    var29 = field833[class232.field3805 + 1];
                                } else {
                                    var29 = 4936552;
                                }
                                if (var25 < 0 || var25 > var11.length - 1) {
                                    if (var29 == 0) {
                                        var29 = 1;
                                    }
                                    class270.method1894(var17, var23, var9, var22, var29);
                                    continue;
                                }
                            } else {
                                var29 = var11[var25][var28];
                            }
                            if (var29 == 0) {
                                var29 = 1;
                            }
                            int var30 = var12[var25] == null ? 0 : field833[var12[var25][var28] & 0xFF];
                            int var31 = var14[var25] == null ? 0 : field833[var14[var25][var28] & 0xFF];
                            if (var30 == 0 && var31 == 0) {
                                class270.method1894(var17, var23, var9, var22, var29);
                            } else {
                                if (var30 != 0) {
                                    if (var30 == -1) {
                                        var30 = 1;
                                    }
                                    byte var32 = var13[var25] == null ? 0 : var13[var25][var28];
                                    int var33 = var32 & 0xFC;
                                    if (var33 == 0 || var9 <= 1 || var22 <= 1) {
                                        class270.method1894(var17, var23, var9, var22, var30);
                                    } else {
                                        method285(class270.field4403, var17, var23, var29, var30, var9, var22, var33 >> 2, var32 & 0x3, true);
                                    }
                                }
                                if (var31 != 0) {
                                    if (var31 == -1) {
                                        var31 = var29;
                                    }
                                    byte var34 = var15[var25][var28];
                                    int var35 = var34 & 0xFC;
                                    if (var35 == 0 || var9 <= 1 || var22 <= 1) {
                                        class270.method1894(var17, var23, var9, var22, var31);
                                    }
                                    method285(class270.field4403, var17, var23, 0, var31, var9, var22, var35 >> 2, var34 & 0x3, var30 == 0);
                                }
                            }
                            if (var16[var25] != null) {
                                int var36 = var16[var25][var28] & 0xFF;
                                if (var36 != 0) {
                                    int var37;
                                    if (var9 == 1) {
                                        var37 = var17;
                                    } else {
                                        var37 = var18 - 1;
                                    }
                                    int var38;
                                    if (var22 == 1) {
                                        var38 = var23;
                                    } else {
                                        var38 = var24 - 1;
                                    }
                                    int var39 = 13421772;
                                    if (var36 >= 5 && var36 <= 8 || var36 >= 13 && var36 <= 16 || var36 >= 21 && var36 <= 24 || var36 == 27 || var36 == 28) {
                                        var39 = 13369344;
                                        var36 -= 4;
                                    }
                                    if (var36 == 1) {
                                        class270.method1885(var17, var23, var22, var39);
                                    } else if (var36 == 2) {
                                        class270.method1897(var17, var23, var9, var39);
                                    } else if (var36 == 3) {
                                        class270.method1885(var37, var23, var22, var39);
                                    } else if (var36 == 4) {
                                        class270.method1897(var17, var38, var9, var39);
                                    } else if (var36 == 9) {
                                        class270.method1885(var17, var23, var22, 16777215);
                                        class270.method1897(var17, var23, var9, var39);
                                    } else if (var36 == 10) {
                                        class270.method1885(var37, var23, var22, 16777215);
                                        class270.method1897(var17, var23, var9, var39);
                                    } else if (var36 == 11) {
                                        class270.method1885(var37, var23, var22, 16777215);
                                        class270.method1897(var17, var38, var9, var39);
                                    } else if (var36 == 12) {
                                        class270.method1885(var17, var23, var22, 16777215);
                                        class270.method1897(var17, var38, var9, var39);
                                    } else if (var36 == 17) {
                                        class270.method1897(var17, var23, 1, var39);
                                    } else if (var36 == 18) {
                                        class270.method1897(var37, var23, 1, var39);
                                    } else if (var36 == 19) {
                                        class270.method1897(var37, var38, 1, var39);
                                    } else if (var36 == 20) {
                                        class270.method1897(var17, var38, 1, var39);
                                    } else if (var36 == 25) {
                                        for (int var40 = 0; var40 < var22; var40++) {
                                            class270.method1897(var17 + var40, var38 - var40, 1, var39);
                                        }
                                    } else if (var36 == 26) {
                                        for (int var41 = 0; var41 < var22; var41++) {
                                            class270.method1897(var17 + var41, var23 + var41, 1, var39);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    int var42 = field831 + var7;
                    var10000 = field831 + var8;
                    for (int var44 = 0; var44 < var5; var44++) {
                        int var45 = (arg1 * var44 + arg3 >> 16) + field838;
                        int var46 = ((var44 + 1) * arg1 + arg3 >> 16) + field838;
                        int var47 = var46 - var45;
                        int var48;
                        if (field829.field3729 != -1) {
                            var48 = field829.field3729;
                        } else if ((field844 + var6 & 0x4) == (field839 + var44 & 0x4)) {
                            var48 = field833[class232.field3805 + 1];
                        } else {
                            var48 = 4936552;
                        }
                        if (var48 == 0) {
                            var48 = 1;
                        }
                        class270.method1894(var42, var45, var9, var47, var48);
                    }
                }
            }
        }
        for (int var49 = -2; var49 < var4 + 2; var49++) {
            int var50 = arg0 * var49 + arg2 >> 16;
            int var51 = (var49 + 1) * arg0 + arg2 >> 16;
            int var52 = var51 - var50;
            if (var52 > 0) {
                int var53 = field831 + var50;
                var10000 = field831 + var51;
                int var55 = field844 + var49 >> 6;
                if (var55 >= 0 && var55 <= field834.length - 1) {
                    int[][] var56 = field834[var55];
                    for (int var57 = -2; var57 < var5 + 2; var57++) {
                        int var58 = arg1 * var57 + arg3 >> 16;
                        int var59 = (var57 + 1) * arg1 + arg3 >> 16;
                        int var60 = var59 - var58;
                        if (var60 > 0) {
                            int var61 = field838 + var58;
                            var10000 = field838 + var59;
                            int var63 = field839 + var57 >> 6;
                            if (var63 >= 0 && var63 <= var56.length - 1) {
                                int var64 = ((field839 + var57 & 0x3F) << 6) + (field844 + var49 & 0x3F);
                                if (var56[var63] != null) {
                                    int var65 = var56[var63][var64];
                                    int var66 = var65 & 0x1FFF;
                                    if (var66 != 0) {
                                        class91 var67 = class138.method960(106, var66 - 1);
                                        int var68 = var65 >> 13 & 0x3;
                                        boolean var69 = (var65 >> 15 & 0x1) == 1;
                                        class211 var70 = var67.method695(0, var68, var69);
                                        if (var70 != null) {
                                            int var71 = var70.field5229 * var52 / 4;
                                            int var72 = var70.field5236 * var60 / 4;
                                            if (var67.field1620) {
                                                int var73 = var65 >> 16 & 0xF;
                                                int var74 = var65 >> 20 & 0xF;
                                                if ((var68 & 0x1) == 1) {
                                                    int var75 = var73;
                                                    var73 = var74;
                                                    var74 = var75;
                                                }
                                                var71 = var52 * var73;
                                                var72 = var60 * var74;
                                            }
                                            if (var71 != 0 && var72 != 0) {
                                                if (var67.field1623 == 0) {
                                                    var70.method1447(var53, var61 + var60 - var72, var71, var72);
                                                } else {
                                                    var70.method1449(var53, var61 + var60 - var72, var71, var72, var67.field1623);
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
        }
    }

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "(I)Lpg;", line = 2079)
    public static final class226 method287(int arg0) {
        return (class226) field818.method2344(-1, (long) arg0);
    }

    @OriginalMember(owner = "client!rn", name = "d", descriptor = "()V", line = 2087)
    public static final void method288() {
        for (int var0 = 0; var0 < field827.field562; var0++) {
            if (field827.field564[var0] != null) {
                field825.method1585(field827.field564[var0], (byte) -12);
            }
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(IIIIIIII)V", line = 2110)
    public static final void method289(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field844 = arg0;
        field839 = arg1;
        field842 = arg2;
        field835 = arg3;
        field831 = arg4;
        field838 = arg5;
        field845 = arg6;
        field830 = arg7;
    }
}
