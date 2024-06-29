import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class460 {

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "Lwa;")
    private static class433 field6799 = new class433(16);

    @OriginalMember(owner = "client!fh", name = "k", descriptor = "I")
    public static int field6806 = (int) (Math.random() * 11.0D) - 5;

    @OriginalMember(owner = "client!fh", name = "n", descriptor = "[B")
    private static byte[] field6809 = new byte[1];

    @OriginalMember(owner = "client!fh", name = "l", descriptor = "I")
    public static int field6807 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!fh", name = "o", descriptor = "[S")
    private static short[] field6810 = new short[1];

    @OriginalMember(owner = "client!fh", name = "s", descriptor = "Lvp;")
    public static class123 field6814 = new class123();

    @OriginalMember(owner = "client!fh", name = "m", descriptor = "F")
    public static float field6808;

    @OriginalMember(owner = "client!fh", name = "r", descriptor = "F")
    public static float field6813;

    @OriginalMember(owner = "client!fh", name = "q", descriptor = "I")
    public static int field6812;

    @OriginalMember(owner = "client!fh", name = "t", descriptor = "I")
    public static int field6815;

    @OriginalMember(owner = "client!fh", name = "v", descriptor = "I")
    public static int field6817;

    @OriginalMember(owner = "client!fh", name = "w", descriptor = "I")
    public static int field6818;

    @OriginalMember(owner = "client!fh", name = "A", descriptor = "I")
    public static int field6822;

    @OriginalMember(owner = "client!fh", name = "D", descriptor = "I")
    public static int field6825;

    @OriginalMember(owner = "client!fh", name = "E", descriptor = "I")
    public static int field6826;

    @OriginalMember(owner = "client!fh", name = "G", descriptor = "I")
    public static int field6828;

    @OriginalMember(owner = "client!fh", name = "I", descriptor = "I")
    public static int field6830;

    @OriginalMember(owner = "client!fh", name = "K", descriptor = "I")
    public static int field6832;

    @OriginalMember(owner = "client!fh", name = "M", descriptor = "I")
    public static int field6834;

    @OriginalMember(owner = "client!fh", name = "N", descriptor = "I")
    public static int field6835;

    @OriginalMember(owner = "client!fh", name = "O", descriptor = "I")
    public static int field6836;

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "Luq;")
    public static class111 field6800;

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "Lkg;")
    public static class177 field6797;

    @OriginalMember(owner = "client!fh", name = "f", descriptor = "Lbc;")
    private static class245 field6801;

    @OriginalMember(owner = "client!fh", name = "h", descriptor = "Lbr;")
    private static class268 field6803;

    @OriginalMember(owner = "client!fh", name = "j", descriptor = "Lbh;")
    public static class28 field6805;

    @OriginalMember(owner = "client!fh", name = "z", descriptor = "Lwa;")
    private static class433 field6821;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "Lgj;")
    public static class447 field6796;

    @OriginalMember(owner = "client!fh", name = "g", descriptor = "Lic;")
    public static class491 field6802;

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "Ltn;")
    public static class58 field6798;

    @OriginalMember(owner = "client!fh", name = "i", descriptor = "Lhc;")
    public static class93 field6804;

    @OriginalMember(owner = "client!fh", name = "u", descriptor = "[B")
    private static byte[] field6816;

    @OriginalMember(owner = "client!fh", name = "C", descriptor = "[B")
    private static byte[] field6824;

    @OriginalMember(owner = "client!fh", name = "F", descriptor = "[B")
    private static byte[] field6827;

    @OriginalMember(owner = "client!fh", name = "H", descriptor = "[B")
    private static byte[] field6829;

    @OriginalMember(owner = "client!fh", name = "J", descriptor = "[B")
    private static byte[] field6831;

    @OriginalMember(owner = "client!fh", name = "y", descriptor = "[I")
    private static int[] field6820;

    @OriginalMember(owner = "client!fh", name = "x", descriptor = "[S")
    private static short[] field6819;

    @OriginalMember(owner = "client!fh", name = "L", descriptor = "[S")
    private static short[] field6833;

    @OriginalMember(owner = "client!fh", name = "p", descriptor = "[[[B")
    public static byte[][][] field6811;

    @OriginalMember(owner = "client!fh", name = "B", descriptor = "[[[Lst;")
    private static class296[][][] field6823;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lqa;IIIIIII[S[BZ)V", line = 4)
    private static final void method2751(class162 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, short[] arg8, byte[] arg9, boolean arg10) {
        if (arg10 || arg5 != 0 || arg6 > 0) {
            if (arg6 == 0) {
                arg0.method1036(arg1, arg2, arg3, arg4, arg5, 0);
            } else {
                int var11 = arg7 & 0x3F;
                if (var11 == 0 || arg3 <= 1 || arg4 <= 1) {
                    int var13 = field6820[arg6];
                    if (arg10 || var13 != 0) {
                        arg0.method1036(arg1, arg2, arg3, arg4, var13, 0);
                    }
                } else {
                    int var12 = arg10 ? 0 : 1;
                    class147.method967(arg4, field6811, arg3, arg1, 78, field6820[arg6], var12, var11, arg7 >> 6 & 0x3, field6812, arg0, arg5, arg2);
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
                class519 var18 = field6796.method2686(arg8[var16] & 0xFFFF, (byte) 85);
                if (var18.field7611 == -1) {
                    int var19 = -3355444;
                    if (var18.field7573 == 1) {
                        var19 = -3407872;
                    }
                    int var20 = arg9[var16] >> 6 & 0x3;
                    if (var17 == 0) {
                        if (var20 == 0) {
                            arg0.method1023(arg1, arg2, arg4, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method1092(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method1023(var14, arg2, arg4, var19, 0);
                        } else {
                            arg0.method1092(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 2) {
                        if (var20 == 0) {
                            arg0.method1023(arg1, arg2, arg4, -1, 0);
                            arg0.method1092(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method1023(var14, arg2, arg4, -1, 0);
                            arg0.method1092(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method1023(var14, arg2, arg4, -1, 0);
                            arg0.method1092(arg1, var15, arg3, var19, 0);
                        } else {
                            arg0.method1023(arg1, arg2, arg4, -1, 0);
                            arg0.method1092(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 3) {
                        if (var20 == 0) {
                            arg0.method1092(arg1, arg2, 1, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method1092(var14, arg2, 1, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method1092(var14, var15, 1, var19, 0);
                        } else {
                            arg0.method1092(arg1, var15, 1, var19, 0);
                        }
                    } else if (var17 == 9) {
                        if (var20 == 0 || var20 == 2) {
                            for (int var22 = 0; var22 < arg4; var22++) {
                                arg0.method1092(arg1 + var22, var15 - var22, 1, var19, 0);
                            }
                        } else {
                            for (int var21 = 0; var21 < arg4; var21++) {
                                arg0.method1092(arg1 + var21, arg2 + var21, 1, var19, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)Luq;", line = 167)
    public static final class111 method2752(int arg0) {
        return (class111) field6799.method2605(false, (long) arg0);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lqa;IIII)Lvp;", line = 172)
    private static final class123 method2753(class162 arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class355 var5 = (class355) field6814.method816(99); var5 != null; var5 = (class355) field6814.method812(90)) {
            method2767(arg0, var5, arg1, arg2, arg3, arg4);
        }
        return field6814;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "()V", line = 184)
    public static final void method2754() {
        field6829 = new byte[field6830 * field6815];
        field6816 = new byte[field6830 * field6815];
        field6827 = new byte[field6830 * field6815];
        field6833 = new short[field6830 * field6815];
        field6824 = new byte[field6830 * field6815];
        field6821 = new class433(1024);
        field6823 = new class296[3][field6815 >> 6][field6830 >> 6];
        field6820 = new int[field6803.field3918 + 1];
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lqa;)Lvp;", line = 195)
    public static final class123 method2755(class162 arg0) {
        int var1 = field6832 - field6817;
        int var2 = field6834 - field6835;
        int var3 = (field6822 - field6836 << 16) / var1;
        int var4 = (field6826 - field6828 << 16) / var2;
        return method2753(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(II)Luq;", line = 207)
    public static final class111 method2756(int arg0, int arg1) {
        for (class111 var2 = (class111) field6799.method2608(true); var2 != null; var2 = (class111) field6799.method2603(110)) {
            if (var2.field1588 && var2.method679((byte) 108, arg1, arg0)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "()V", line = 221)
    public static final void method2757() {
        int[] var0 = new int[3];
        for (int var1 = 0; var1 < field6805.field288; var1++) {
            boolean var2 = field6800.method682(field6805.field295[var1] >> 28 & 0x3, var0, (byte) 102, field6805.field295[var1] >> 14 & 0x3FFF, field6805.field295[var1] & 0x3FFF);
            if (var2) {
                class355 var3 = new class355(field6805.field290[var1]);
                var3.field5465 = var0[1] - field6818;
                var3.field5458 = var0[2] - field6825;
                field6814.method809(var3, false);
            }
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIIIIII)V", line = 242)
    public static final void method2758(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field6817 = arg0 - field6818;
        field6834 = arg1 - field6825;
        field6832 = arg2 - field6818;
        field6835 = arg3 - field6825;
        field6836 = arg4;
        field6828 = arg5;
        field6822 = arg6;
        field6826 = arg7;
    }

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "()V", line = 253)
    public static final void method2759() {
        field6829 = null;
        field6831 = null;
        field6819 = null;
        field6816 = null;
        field6827 = null;
        field6833 = null;
        field6824 = null;
        field6821 = null;
        field6823 = null;
        field6820 = null;
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(Lqa;)V", line = 271)
    public static final void method2760(class162 arg0) {
        int var1 = field6832 - field6817;
        int var2 = field6834 - field6835;
        int var3 = (field6822 - field6836 << 16) / var1;
        int var4 = (field6826 - field6828 << 16) / var2;
        method2772(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(II)Lwf;", line = 283)
    public static final class88 method2761(int arg0, int arg1) {
        class88 var2 = new class88();
        for (class111 var3 = (class111) field6799.method2608(true); var3 != null; var3 = (class111) field6799.method2603(93)) {
            if (var3.field1588 && var3.method679((byte) 108, arg1, arg0)) {
                var2.method518(0, var3);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "([B[B[SII)V", line = 299)
    private static final void method2762(byte[] arg0, byte[] arg1, short[] arg2, int arg3, int arg4) {
        int[] var5 = new int[field6830];
        int[] var6 = new int[field6830];
        int[] var7 = new int[field6830];
        int[] var8 = new int[field6830];
        int[] var9 = new int[field6830];
        for (int var10 = -5; var10 < field6815; var10++) {
            int var11 = var10 + 5;
            int var12 = var10 - 5;
            for (int var13 = 0; var13 < field6830; var13++) {
                int var10002;
                if (var11 < field6815) {
                    int var28 = arg0[field6815 * var13 + var11] & 0xFF;
                    if (var28 > 0) {
                        class487 var29 = field6801.method1647(var28 - 1, -99);
                        var5[var13] += var29.field7206;
                        var6[var13] += var29.field7207;
                        var7[var13] += var29.field7200;
                        var8[var13] += var29.field7201;
                        var10002 = var9[var13]++;
                    }
                }
                if (var12 >= 0) {
                    int var30 = arg0[field6815 * var13 + var12] & 0xFF;
                    if (var30 > 0) {
                        class487 var31 = field6801.method1647(var30 - 1, -98);
                        var5[var13] -= var31.field7206;
                        var6[var13] -= var31.field7207;
                        var7[var13] -= var31.field7200;
                        var8[var13] -= var31.field7201;
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
                for (int var19 = -5; var19 < field6830; var19++) {
                    int var20 = var19 + 5;
                    if (var20 < field6830) {
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
                        if ((arg0[field6815 * var19 + var10] & 0xFF) == 0) {
                            int var22 = field6815 * var19 + var10;
                            arg1[var22] = 0;
                            arg2[var22] = 0;
                        } else {
                            int var23 = var17 == 0 ? 0 : class521.method3080(var15 / var18, (byte) -122, var16 / var18, var14 * 256 / var17);
                            int var24 = (var23 & 0x7F) + arg4;
                            if (var24 < 0) {
                                var24 = 0;
                            } else if (var24 > 127) {
                                var24 = 127;
                            }
                            int var25 = (arg3 + var23 & 0xFC00) + (var23 & 0x380) + var24;
                            int var26 = field6815 * var19 + var10;
                            int var27 = class263.field3858[class491.method2935(class490.method2918(96, var25, (byte) -79), 0) & 0xFFFF];
                            arg1[var26] = (byte) (var27 >> 16 & 0xFF);
                            arg2[var26] = (short) (var27 & 0xFFFF);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "()V", line = 442)
    public static void method2763() {
        field6803 = null;
        field6801 = null;
        field6796 = null;
        field6804 = null;
        field6797 = null;
        field6798 = null;
        field6800 = null;
        field6802 = null;
        field6799 = null;
        field6811 = null;
        field6810 = null;
        field6809 = null;
        field6805 = null;
        field6814 = null;
        field6820 = null;
        field6829 = null;
        field6831 = null;
        field6819 = null;
        field6816 = null;
        field6827 = null;
        field6833 = null;
        field6824 = null;
        field6821 = null;
        field6823 = null;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lqa;II)V", line = 470)
    public static final void method2764(class162 arg0, int arg1, int arg2) {
        class209 var3 = new class209(field6802.method2946("area", field6800.field1576, false));
        int var4 = var3.method1428(32122);
        int[] var5 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var5[var6] = var3.method1428(32122);
        }
        int var7 = var3.method1428(32122);
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method1428(32122);
        }
        while (true) {
            while (var3.field3037 < var3.field3036.length) {
                if (var3.method1428(32122) == 0) {
                    int var22 = var3.method1428(32122);
                    int var23 = var3.method1428(32122);
                    for (int var24 = 0; var24 < 64; var24++) {
                        for (int var25 = 0; var25 < 64; var25++) {
                            int var26 = var22 * 64 + var24 - field6818;
                            int var27 = var23 * 64 + var25 - field6825;
                            method2770(arg0, var3, var22, var23, var26, var27, var5, var8);
                        }
                    }
                } else {
                    int var28 = var3.method1428(32122);
                    int var29 = var3.method1428(32122);
                    int var30 = var3.method1428(32122);
                    int var31 = var3.method1428(32122);
                    for (int var32 = 0; var32 < 8; var32++) {
                        for (int var33 = 0; var33 < 8; var33++) {
                            int var34 = var28 * 64 + var30 * 8 + var32 - field6818;
                            int var35 = var29 * 64 + var31 * 8 + var33 - field6825;
                            method2770(arg0, var3, var28, var29, var34, var35, var5, var8);
                        }
                    }
                }
            }
            Object var10 = null;
            field6831 = new byte[field6830 * field6815];
            field6819 = new short[field6830 * field6815];
            for (int var11 = 0; var11 < 3; var11++) {
                byte[] var12 = new byte[field6830 * field6815];
                for (int var13 = 0; var13 < field6823[var11].length; var13++) {
                    for (int var19 = 0; var19 < field6823[var11][0].length; var19++) {
                        class296 var20 = field6823[var11][var13][var19];
                        if (var20 != null) {
                            for (class506 var21 = (class506) var20.method1873((byte) -126); var21 != null; var21 = (class506) var20.method1880(-61)) {
                                var12[(var19 * 64 + var21.field7394) * field6815 + var13 * 64 + var21.field7399] = (byte) var21.field7397;
                            }
                        }
                    }
                }
                method2762(var12, field6831, field6819, arg1, arg2);
                for (int var14 = 0; var14 < field6823[var11].length; var14++) {
                    for (int var15 = 0; var15 < field6823[var11][0].length; var15++) {
                        class296 var16 = field6823[var11][var14][var15];
                        if (var16 != null) {
                            for (class506 var17 = (class506) var16.method1873((byte) -120); var17 != null; var17 = (class506) var16.method1880(-61)) {
                                int var18 = (var15 * 64 + var17.field7394) * field6815 + var14 * 64 + var17.field7399;
                                var17.field7397 = (field6831[var18] & 0xFF) << 16 | field6819[var18] & 0xFFFF;
                                if (var17.field7397 != 0) {
                                    var17.field7397 |= 0xFF000000;
                                }
                            }
                        }
                    }
                }
            }
            method2762(field6829, field6831, field6819, arg1, arg2);
            field6829 = null;
            method2773();
            return;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lm;II)V", line = 652)
    public static final void method2765(class126 arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < field6803.field3918; var3++) {
            field6820[var3 + 1] = method2766(arg0, var3, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lm;III)I", line = 662)
    private static final int method2766(class126 arg0, int arg1, int arg2, int arg3) {
        class47 var4 = field6803.method1772(arg1, -108);
        if (var4 == null) {
            return 0;
        }
        int var5 = var4.field755;
        if (var5 >= 0 && arg0.method838(true, var5).field4593) {
            var5 = -1;
        }
        int var9;
        if (var4.field745 >= 0) {
            int var6 = var4.field745;
            int var7 = (var6 & 0x7F) + arg3;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 127) {
                var7 = 127;
            }
            int var8 = (arg2 + var6 & 0xFC00) + (var6 & 0x380) + var7;
            var9 = class263.field3858[class491.method2935(class257.method1713(var8, -20411, 96), 0) & 0xFFFF] | 0xFF000000;
        } else if (var5 >= 0) {
            var9 = class263.field3858[class491.method2935(class257.method1713(arg0.method838(true, var5).field4602, -20411, 96), 0) & 0xFFFF] | 0xFF000000;
        } else if (var4.field759 == -1) {
            var9 = 0;
        } else {
            int var10 = var4.field759;
            int var11 = (var10 & 0x7F) + arg3;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 127) {
                var11 = 127;
            }
            int var12 = (arg2 + var10 & 0xFC00) + (var10 & 0x380) + var11;
            var9 = class263.field3858[class491.method2935(class257.method1713(var12, -20411, 96), 0) & 0xFFFF] | 0xFF000000;
        }
        return var9;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lqa;Lcn;IIII)V", line = 718)
    private static final void method2767(class162 arg0, class355 arg1, int arg2, int arg3, int arg4, int arg5) {
        arg1.field5466 = ((arg1.field5465 - field6817) * arg2 + arg4 >> 16) + field6836;
        arg1.field5462 = field6826 - ((arg1.field5458 - field6835) * arg3 + arg5 >> 16);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lqa;IIII[S[B)V", line = 726)
    private static final void method2768(class162 arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        if (arg5 == null) {
            return;
        }
        for (int var7 = 0; var7 < arg5.length; var7++) {
            class519 var8 = field6796.method2686(arg5[var7] & 0xFFFF, (byte) 123);
            int var9 = var8.field7611;
            if (var9 != -1) {
                class464 var10 = field6797.method1202(true, var9);
                class529 var11 = var10.method2790(var8.field7608 ? arg6[var7] >> 6 & 0x3 : 0, var8.field7634 ? var8.field7603 : false, arg0, 3);
                if (var11 != null) {
                    int var12 = arg3 * var11.method105() >> 2;
                    int var13 = arg4 * var11.method100() >> 2;
                    if (var10.field6874) {
                        int var14 = var8.field7648;
                        int var15 = var8.field7614;
                        if ((arg6[var7] >> 6 & 0x1) == 1) {
                            int var16 = var14;
                            var14 = var15;
                            var15 = var16;
                        }
                        var12 = arg3 * var14;
                        var13 = arg4 * var15;
                    }
                    if (var12 != 0 && var13 != 0) {
                        if (var10.field6873 == 0) {
                            var11.method3123(arg1, arg2 + arg4 - var13, var12, var13);
                        } else {
                            var11.method106(arg1, arg2 + arg4 - var13, var12, var13, 0, var10.field6873 | 0xFF000000, 1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(I)V", line = 786)
    public static final void method2769(int arg0) {
        field6800 = (class111) field6799.method2605(false, (long) arg0);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lqa;Ldh;IIII[I[I)V", line = 791)
    private static final void method2770(class162 arg0, class209 arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7) {
        int var8 = arg1.method1428(32122);
        if ((var8 & 0x1) == 0) {
            boolean var9 = (var8 & 0x2) == 0;
            int var10 = var8 >> 2 & 0x3F;
            if (var10 != 62) {
                int var11;
                if (var10 == 63) {
                    var11 = arg1.method1428(32122);
                } else if (var9) {
                    var11 = arg6[var10];
                } else {
                    var11 = arg7[var10];
                }
                if (var9) {
                    field6829[field6815 * arg5 + arg4] = (byte) var11;
                    field6816[field6815 * arg5 + arg4] = 0;
                } else {
                    field6816[field6815 * arg5 + arg4] = (byte) var11;
                    field6827[field6815 * arg5 + arg4] = 0;
                    field6829[field6815 * arg5 + arg4] = arg1.method1417(false);
                }
            }
            return;
        }
        int var12 = (var8 >> 1 & 0x3) + 1;
        boolean var13 = (var8 & 0x8) != 0;
        boolean var14 = (var8 & 0x10) != 0;
        for (int var15 = 0; var15 < var12; var15++) {
            int var16 = arg1.method1428(32122);
            int var17 = 0;
            int var18 = 0;
            if (var13) {
                var17 = arg1.method1428(32122);
                var18 = arg1.method1428(32122);
            }
            int var19 = 0;
            if (var14) {
                var19 = arg1.method1428(32122);
            }
            if (var15 == 0) {
                field6829[field6815 * arg5 + arg4] = (byte) var16;
                field6816[field6815 * arg5 + arg4] = (byte) var17;
                field6827[field6815 * arg5 + arg4] = (byte) var18;
                if (var19 == 1) {
                    field6833[field6815 * arg5 + arg4] = (short) (arg1.method1450((byte) 52) + 1);
                    field6824[field6815 * arg5 + arg4] = arg1.method1417(false);
                } else if (var19 > 1) {
                    field6833[field6815 * arg5 + arg4] = -1;
                    short[] var20 = new short[var19];
                    byte[] var21 = new byte[var19];
                    for (int var22 = 0; var22 < var19; var22++) {
                        var20[var22] = (short) arg1.method1450((byte) 119);
                        var21[var22] = arg1.method1417(false);
                    }
                    field6821.method2606(new class396(var20, var21), (long) (arg4 << 16 | arg5), 0);
                }
            } else {
                short[] var23 = null;
                byte[] var24 = null;
                if (var19 > 0) {
                    var23 = new short[var19];
                    var24 = new byte[var19];
                    for (int var25 = 0; var25 < var19; var25++) {
                        var23[var25] = (short) arg1.method1450((byte) 39);
                        var24[var25] = arg1.method1417(false);
                    }
                }
                if (field6823[var15 - 1][arg2 - (field6818 >> 6)][arg3 - (field6825 >> 6)] == null) {
                    field6823[var15 - 1][arg2 - (field6818 >> 6)][arg3 - (field6825 >> 6)] = new class296();
                }
                class506 var26 = new class506(arg4 & 0x3F, arg5 & 0x3F, var16, var17, var18, var23, var24);
                field6823[var15 - 1][arg2 - (field6818 >> 6)][arg3 - (field6825 >> 6)].method1878(2, var26);
            }
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lic;Lbr;Lbc;Lgj;Lhc;Lkg;Ltn;)V", line = 925)
    public static final void method2771(class491 arg0, class268 arg1, class245 arg2, class447 arg3, class93 arg4, class177 arg5, class58 arg6) {
        field6802 = arg0;
        field6803 = arg1;
        field6801 = arg2;
        field6796 = arg3;
        field6804 = arg4;
        field6797 = arg5;
        field6798 = arg6;
        field6799.method2601(-21859);
        int var7 = field6802.method2940("details", false);
        int[] var8 = field6802.method2951(var7, false);
        for (int var9 = 0; var9 < var8.length; var9++) {
            class111 var10 = class315.method1973(103, field6802, var8[var9], var7);
            field6799.method2606(var10, (long) var10.field1581, 0);
        }
        class493.method2956(126, true, false);
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(Lqa;IIII)V", line = 967)
    private static final void method2772(class162 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = field6832 - field6817;
        int var6 = field6834 - field6835;
        if (field6832 < field6815) {
            var5++;
        }
        if (field6834 < field6830) {
            var6++;
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var49 = (arg1 * var7 + arg3 >> 16) + field6836;
            int var50 = ((var7 + 1) * arg1 + arg3 >> 16) + field6836;
            int var51 = var50 - var49;
            if (var51 > 0) {
                int var52 = field6817 + var7;
                if (var52 >= 0 && var52 < field6815) {
                    for (int var53 = 0; var53 < var6; var53++) {
                        int var54 = field6826 - ((var53 + 1) * arg2 + arg4 >> 16);
                        int var55 = field6826 - (arg2 * var53 + arg4 >> 16);
                        int var56 = var55 - var54;
                        if (var56 > 0) {
                            int var57 = field6835 + var53;
                            int var58 = field6815 * var57 + var52;
                            int var59 = 0;
                            int var60 = 0;
                            int var61 = 0;
                            if (var57 >= 0 && var57 < field6830) {
                                var59 = (field6831[var58] & 0xFF) << 16 | field6819[var58] & 0xFFFF;
                                if (var59 != 0) {
                                    var59 |= 0xFF000000;
                                }
                                var60 = field6816[var58] & 0xFF;
                                var61 = field6833[var58] & 0xFFFF;
                            }
                            if (var59 == 0 && var60 == 0 && var61 == 0) {
                                int var62;
                                if (field6800.field1593 != -1) {
                                    var62 = field6800.field1593 | 0xFF000000;
                                } else if ((field6834 + var53 & 0x4) == (field6817 + var7 & 0x4)) {
                                    var62 = field6820[field6803.field3920 + 1];
                                } else {
                                    var62 = -11840664;
                                }
                                if (var62 == 0) {
                                    var62 = -16777216;
                                }
                                arg0.method1036(var49, var54, var51, var56, var62, 0);
                            } else if (var61 <= 0) {
                                method2751(arg0, var49, var54, var51, var56, var59, var60, field6827[var58], null, null, true);
                            } else if (var61 == 65535) {
                                class396 var63 = (class396) field6821.method2605(false, (long) (var52 << 16 | var57));
                                if (var63 != null) {
                                    method2751(arg0, var49, var54, var51, var56, var59, var60, field6827[var58], var63.field5943, var63.field5944, true);
                                }
                            } else {
                                field6810[0] = (short) (var61 - 1);
                                field6809[0] = field6824[var58];
                                method2751(arg0, var49, var54, var51, var56, var59, var60, field6827[var58], field6810, field6809, true);
                            }
                        }
                    }
                } else {
                    for (int var64 = 0; var64 < var6; var64++) {
                        int var65 = field6826 - ((var64 + 1) * arg2 + arg4 >> 16);
                        int var66 = field6826 - (arg2 * var64 + arg4 >> 16);
                        int var67 = var66 - var65;
                        int var68;
                        if (field6800.field1593 != -1) {
                            var68 = field6800.field1593 | 0xFF000000;
                        } else if ((field6834 + var64 & 0x4) == (field6817 + var7 & 0x4)) {
                            var68 = field6820[field6803.field3920 + 1];
                        } else {
                            var68 = -11840664;
                        }
                        if (var68 == 0) {
                            var68 = -16777216;
                        }
                        arg0.method1036(var49, var65, var51, var67, var68, 0);
                    }
                }
            }
        }
        for (int var8 = -16; var8 < var5 + 16; var8++) {
            int var38 = (arg1 * var8 + arg3 >> 16) + field6836;
            int var39 = ((var8 + 1) * arg1 + arg3 >> 16) + field6836;
            int var40 = var39 - var38;
            if (var40 > 0) {
                int var41 = field6817 + var8;
                if (var41 >= 0 && var41 < field6815) {
                    for (int var42 = -16; var42 < var6 + 16; var42++) {
                        int var43 = field6826 - ((var42 + 1) * arg2 + arg4 >> 16);
                        int var44 = field6826 - (arg2 * var42 + arg4 >> 16);
                        int var45 = var44 - var43;
                        if (var45 > 0) {
                            int var46 = field6835 + var42;
                            if (var46 >= 0 && var46 < field6830) {
                                int var47 = field6833[field6815 * var46 + var41] & 0xFFFF;
                                if (var47 <= 0) {
                                    method2768(arg0, var38, var43, var40, var45, null, null);
                                } else if (var47 == 65535) {
                                    class396 var48 = (class396) field6821.method2605(false, (long) (var41 << 16 | var46));
                                    if (var48 != null) {
                                        method2768(arg0, var38, var43, var40, var45, var48.field5943, var48.field5944);
                                    }
                                } else {
                                    field6810[0] = (short) (var47 - 1);
                                    field6809[0] = field6824[field6815 * var46 + var41];
                                    method2768(arg0, var38, var43, var40, var45, field6810, field6809);
                                }
                            }
                        }
                    }
                }
            }
        }
        int var9 = field6817 >> 6;
        int var10 = field6835 >> 6;
        if (var9 < 0) {
            var9 = 0;
        }
        if (var10 < 0) {
            var10 = 0;
        }
        int var11 = field6832 >> 6;
        int var12 = field6834 >> 6;
        if (var11 >= field6823[0].length) {
            var11 = field6823[0].length - 1;
        }
        if (var12 >= field6823[0][0].length) {
            var12 = field6823[0][0].length - 1;
        }
        for (int var13 = 0; var13 < 3; var13++) {
            for (int var14 = var9; var14 <= var11; var14++) {
                for (int var27 = var10; var27 <= var12; var27++) {
                    class296 var28 = field6823[var13][var14][var27];
                    if (var28 != null) {
                        int var29 = ((field6818 >> 6) + var14) * 64;
                        int var30 = ((field6825 >> 6) + var27) * 64;
                        for (class506 var31 = (class506) var28.method1873((byte) 18); var31 != null; var31 = (class506) var28.method1880(-61)) {
                            int var32 = var31.field7399 + var29 - field6818 - field6817;
                            int var33 = var31.field7394 + var30 - field6825 - field6835;
                            int var34 = (arg1 * var32 + arg3 >> 16) + field6836;
                            int var35 = ((var32 + 1) * arg1 + arg3 >> 16) + field6836;
                            int var36 = field6826 - ((var33 + 1) * arg2 + arg4 >> 16);
                            int var37 = field6826 - (arg2 * var33 + arg4 >> 16);
                            method2751(arg0, var34, var36, var35 - var34, var37 - var36, var31.field7397, var31.field7398 & 0xFF, var31.field7395, var31.field7396, var31.field7400, false);
                        }
                    }
                }
            }
            for (int var15 = var9; var15 <= var11; var15++) {
                for (int var16 = var10; var16 <= var12; var16++) {
                    class296 var17 = field6823[var13][var15][var16];
                    if (var17 != null) {
                        int var18 = ((field6818 >> 6) + var15) * 64;
                        int var19 = ((field6825 >> 6) + var16) * 64;
                        for (class506 var20 = (class506) var17.method1873((byte) 78); var20 != null; var20 = (class506) var17.method1880(-61)) {
                            int var21 = var20.field7399 + var18 - field6818 - field6817;
                            int var22 = var20.field7394 + var19 - field6825 - field6835;
                            int var23 = (arg1 * var21 + arg3 >> 16) + field6836;
                            int var24 = ((var21 + 1) * arg1 + arg3 >> 16) + field6836;
                            int var25 = field6826 - ((var22 + 1) * arg2 + arg4 >> 16);
                            int var26 = field6826 - (arg2 * var22 + arg4 >> 16);
                            method2768(arg0, var23, var25, var24 - var23, var26 - var25, var20.field7396, var20.field7400);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "()V", line = 1335)
    private static final void method2773() {
        for (int var0 = 0; var0 < field6815; var0++) {
            for (int var11 = 0; var11 < field6830; var11++) {
                int var12 = field6833[field6815 * var11 + var0] & 0xFFFF;
                if (var12 != 0) {
                    if (var12 == 65535) {
                        class396 var13 = (class396) field6821.method2605(false, (long) (var0 << 16 | var11));
                        if (var13 != null) {
                            for (int var14 = 0; var14 < var13.field5943.length; var14++) {
                                class519 var15 = field6796.method2686(var13.field5943[var14] & 0xFFFF, (byte) 125);
                                int var16 = var15.field7637;
                                if (var15.field7596 != null) {
                                    class519 var17 = var15.method3067(field6798, -13012);
                                    if (var17 != null) {
                                        var16 = var17.field7637;
                                    }
                                }
                                if (var16 != -1) {
                                    class355 var18 = new class355(var16);
                                    var18.field5465 = var0;
                                    var18.field5458 = var11;
                                    field6814.method809(var18, false);
                                }
                            }
                        }
                    } else {
                        class519 var19 = field6796.method2686(var12 - 1, (byte) 85);
                        int var20 = var19.field7637;
                        if (var19.field7596 != null) {
                            class519 var21 = var19.method3067(field6798, -13012);
                            if (var21 != null) {
                                var20 = var21.field7637;
                            }
                        }
                        if (var20 != -1) {
                            class355 var22 = new class355(var20);
                            var22.field5465 = var0;
                            var22.field5458 = var11;
                            field6814.method809(var22, false);
                        }
                    }
                }
            }
        }
        for (int var1 = 0; var1 < 3; var1++) {
            for (int var2 = 0; var2 < field6823[0].length; var2++) {
                for (int var3 = 0; var3 < field6823[0][0].length; var3++) {
                    class296 var4 = field6823[var1][var2][var3];
                    if (var4 != null) {
                        for (class506 var5 = (class506) var4.method1873((byte) -124); var5 != null; var5 = (class506) var4.method1880(-61)) {
                            if (var5.field7396 != null) {
                                for (int var6 = 0; var6 < var5.field7396.length; var6++) {
                                    class519 var7 = field6796.method2686(var5.field7396[var6] & 0xFFFF, (byte) 96);
                                    int var8 = var7.field7637;
                                    if (var7.field7596 != null) {
                                        class519 var9 = var7.method3067(field6798, -13012);
                                        if (var9 != null) {
                                            var8 = var9.field7637;
                                        }
                                    }
                                    if (var8 != -1) {
                                        class355 var10 = new class355(var8);
                                        var10.field5465 = ((field6818 >> 6) + var2) * 64 + var5.field7399 - field6818;
                                        var10.field5458 = ((field6825 >> 6) + var3) * 64 + var5.field7394 - field6825;
                                        field6814.method809(var10, false);
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
