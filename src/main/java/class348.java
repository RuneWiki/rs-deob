import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public abstract class class348 {

    @OriginalMember(owner = "client!hr", name = "i", descriptor = "Leq;")
    private class134 field5028;

    @OriginalMember(owner = "client!hr", name = "j", descriptor = "Lmo;")
    private class507 field5029;

    @OriginalMember(owner = "client!hr", name = "t", descriptor = "J")
    public static long field5039 = 0L;

    @OriginalMember(owner = "client!hr", name = "k", descriptor = "[Ljava/lang/String;")
    public static String[] field5030 = new String[100];

    @OriginalMember(owner = "client!hr", name = "n", descriptor = "Lgn;")
    public static class475 field5033 = new class475(63, 3);

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "I")
    public static int field5020;

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "I")
    public static int field5021;

    @OriginalMember(owner = "client!hr", name = "c", descriptor = "I")
    public static int field5022;

    @OriginalMember(owner = "client!hr", name = "d", descriptor = "I")
    public static int field5023;

    @OriginalMember(owner = "client!hr", name = "e", descriptor = "I")
    public static int field5024;

    @OriginalMember(owner = "client!hr", name = "f", descriptor = "I")
    public static int field5025;

    @OriginalMember(owner = "client!hr", name = "g", descriptor = "I")
    public static int field5026;

    @OriginalMember(owner = "client!hr", name = "h", descriptor = "I")
    public static int field5027;

    @OriginalMember(owner = "client!hr", name = "l", descriptor = "I")
    public static int field5031;

    @OriginalMember(owner = "client!hr", name = "m", descriptor = "I")
    public static int field5032;

    @OriginalMember(owner = "client!hr", name = "o", descriptor = "I")
    public static int field5034;

    @OriginalMember(owner = "client!hr", name = "p", descriptor = "I")
    public static int field5035;

    @OriginalMember(owner = "client!hr", name = "q", descriptor = "I")
    public static int field5036;

    @OriginalMember(owner = "client!hr", name = "r", descriptor = "I")
    public static int field5037;

    @OriginalMember(owner = "client!hr", name = "s", descriptor = "I")
    public static int field5038;

    @OriginalMember(owner = "client!hr", name = "u", descriptor = "I")
    public static int field5040;

    @OriginalMember(owner = "client!hr", name = "v", descriptor = "I")
    public static int field5041;

    @OriginalMember(owner = "client!hr", name = "w", descriptor = "I")
    public static int field5042;

    @OriginalMember(owner = "client!hr", name = "x", descriptor = "I")
    public static int field5043;

    @OriginalMember(owner = "client!hr", name = "y", descriptor = "[I")
    public static int[] field5044;

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(IILfs;III[Lqg;IIIIILjava/lang/String;[IIII)I")
    public final int method2099(int arg0, int arg1, class372 arg2, int arg3, int arg4, int arg5, class307[] arg6, int arg7, int arg8, int arg9, int arg10, int arg11, String arg12, int[] arg13, int arg14, int arg15, int arg16) {
        field5026++;
        if (arg12 == null) {
            return 0;
        }
        this.method2102(arg8, arg7, 27154);
        if (arg9 == 0) {
            arg9 = this.field5029.field7725;
        }
        int[] var18;
        if ((this.field5029.field7724 + arg9 + this.field5029.field7727) > arg10 && arg10 < arg9 + arg9) {
            var18 = null;
        } else {
            var18 = new int[] { arg0 };
        }
        int var19 = this.field5029.method3046(arg6, -5111, arg12, class140.field1833, var18);
        if (arg3 == -1) {
            arg3 = arg10 / arg9;
            if (arg3 <= 0) {
                arg3 = 1;
            }
        }
        if (arg3 > 0 && var19 >= arg3) {
            var19 = arg3;
            class140.field1833[arg3 - 1] = this.field5029.method3051(class140.field1833[arg3 - 1], -1, arg6, arg0);
        }
        if (arg1 == 3 && var19 == 1) {
            arg1 = 1;
        }
        int var20;
        if (arg1 == 0) {
            var20 = arg16 + this.field5029.field7727;
        } else if (arg1 == 1) {
            var20 = this.field5029.field7727 + ((arg10 - (this.field5029.field7727 - (-this.field5029.field7724 - (var19 - 1) * arg9))) / 2) + arg16;
        } else if (arg1 == 2) {
            var20 = arg10 + arg16 - this.field5029.field7724 - ((var19 + -1) * arg9);
        } else {
            int var21 = (arg10 - this.field5029.field7727 - this.field5029.field7724 - ((var19 - 1) * arg9)) / (var19 + 1);
            if (var21 < 0) {
                var21 = 0;
            }
            arg9 += var21;
            var20 = this.field5029.field7727 + var21 + arg16;
        }
        if (arg14 != 12426) {
            return 58;
        }
        for (int var22 = 0; var22 < var19; var22++) {
            if (arg5 == 0) {
                this.method2115(arg6, class140.field1833[var22], arg4, arg11, 119, arg13, arg2, arg15, var20);
            } else if (arg5 == 1) {
                this.method2115(arg6, class140.field1833[var22], arg4, arg11, -74, arg13, arg2, (arg0 - this.field5029.method3055(7748, class140.field1833[var22])) / 2 + arg15, var20);
            } else if (arg5 == 2) {
                this.method2115(arg6, class140.field1833[var22], arg4, arg11, -56, arg13, arg2, arg0 + arg15 - this.field5029.method3055(7748, class140.field1833[var22]), var20);
            } else if ((var19 - 1) == var22) {
                this.method2115(arg6, class140.field1833[var22], arg4, arg11, -121, arg13, arg2, arg15, var20);
            } else {
                this.method2101((byte) 107, class140.field1833[var22], arg0);
                this.method2115(arg6, class140.field1833[var22], arg4, arg11, -20, arg13, arg2, arg15, var20);
                class282.field4028 = 0;
            }
            var20 += arg9;
        }
        return var19;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(ILts;II)V")
    public static final void method2100(int arg0, class356 arg1, int arg2, int arg3) {
        field5042++;
        class372 var4 = arg1.method2162(0, class481.field6937);
        if (var4 == null) {
            return;
        }
        class481.field6937.method810(arg3, arg0, arg1.field5168 + arg3, arg0 - -arg1.field5169);
        int var5 = -25 % ((arg2 + 66) / 35);
        if (class231.field3230 >= 3) {
            class481.field6937.method771(-16777216, var4, arg3, arg0);
        } else {
            class190.field2703.method1848((float) arg1.field5168 / 2.0F + (float) arg3, (float) arg1.field5169 / 2.0F + (float) arg0, 4096, ((int) (-class506.field7722) & 0x3FFF) << 2, var4, arg3, arg0);
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(CIIIZ)V")
    public abstract void method433(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(BLjava/lang/String;I)V")
    private final void method2101(byte arg0, String arg1, int arg2) {
        field5040++;
        int var4 = 0;
        boolean var5 = false;
        for (int var6 = 0; arg1.length() > var6; var6++) {
            char var7 = arg1.charAt(var6);
            if (var7 == '<') {
                var5 = true;
            } else if (var7 == '>') {
                var5 = false;
            } else if (!var5 && var7 == ' ') {
                var4++;
            }
        }
        if (arg0 < 93) {
            field5030 = null;
        }
        if (var4 > 0) {
            class282.field4028 = (arg2 - this.field5029.method3055(7748, arg1) << 8) / var4;
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(III)V")
    private final void method2102(int arg0, int arg1, int arg2) {
        if (arg2 != 27154) {
            this.method2117(-33, -117, -63, null, -21, -70, null, null);
        }
        if (arg1 == -1) {
            arg1 = 0;
        }
        class221.field3125 = -1;
        class325.field4742 = -1;
        class282.field4028 = 0;
        field5023++;
        class463.field6719 = arg0;
        class388.field5751 = arg0;
        class297.field4327 = 0;
        class27.field447 = arg1;
        class492.field7522 = arg1;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(IZLjava/lang/String;III)V")
    public final void method2103(int arg0, boolean arg1, String arg2, int arg3, int arg4, int arg5) {
        field5032++;
        if (arg2 == null) {
            return;
        }
        this.method2102(arg4, arg5, 27154);
        if (arg1) {
            this.method2112(7, null, 9, null, -126, null, null, null);
        }
        this.method2115(null, arg2, 0, 0, 111, null, null, arg3 - this.field5029.method3055(7748, arg2), arg0);
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(ILjava/lang/String;IIIIII)V")
    public final void method2104(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5041++;
        if (arg1 == null) {
            return;
        }
        this.method2102(arg0, arg3, 27154);
        if (arg6 < 21) {
            return;
        }
        double var9 = 7.0D - ((double) arg2 / 8.0D);
        if (var9 < 0.0D) {
            var9 = 0.0D;
        }
        int var11 = arg1.length();
        int[] var12 = new int[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = (int) (Math.sin((double) var13 / 1.5D + (double) arg5) * var9);
        }
        this.method2112(arg4 - (this.field5029.method3055(7748, arg1) / 2), arg1, arg7, var12, -1, null, null, null);
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(IILjava/lang/String;IIII)V")
    public final void method2105(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5, int arg6) {
        field5021++;
        if (arg2 == null) {
            return;
        }
        this.method2102(arg5, arg3, 27154);
        int var8 = arg2.length();
        if (arg6 != 5) {
            return;
        }
        int[] var9 = new int[var8];
        int[] var10 = new int[var8];
        for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = (int) (Math.sin((double) arg0 / 5.0D + (double) var11 / 5.0D) * 5.0D);
            var10[var11] = (int) (Math.sin((double) arg0 / 5.0D + (double) var11 / 3.0D) * 5.0D);
        }
        this.method2112(arg4 - (this.field5029.method3055(arg6 ^ 0x1E41, arg2) / 2), arg2, arg1, var10, -1, var9, null, null);
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(BLjava/lang/String;)V")
    private final void method2106(byte arg0, String arg1) {
        field5038++;
        try {
            if (arg0 != -14) {
                field5039 = 7L;
            }
            if (arg1.startsWith("col=")) {
                class388.field5751 = class388.field5751 & 0xFF000000 | class45.method348(16, true, arg1.substring(4)) & 0xFFFFFF;
            } else if (arg1.equals("/col")) {
                class388.field5751 = class463.field6719 & 0xFFFFFF | class388.field5751 & 0xFF000000;
            }
            if (arg1.startsWith("argb=")) {
                class388.field5751 = class45.method348(16, true, arg1.substring(5));
            } else if (arg1.equals("/argb")) {
                class388.field5751 = class463.field6719;
            } else if (arg1.startsWith("str=")) {
                class221.field3125 = class45.method348(16, true, arg1.substring(4)) | 0xFF000000;
            } else if (arg1.equals("str")) {
                class221.field3125 = -8388608;
            } else if (arg1.equals("/str")) {
                class221.field3125 = -1;
            } else if (arg1.startsWith("u=")) {
                class325.field4742 = class45.method348(16, true, arg1.substring(2)) | 0xFF000000;
            } else if (arg1.equals("u")) {
                class325.field4742 = -16777216;
            } else if (arg1.equals("/u")) {
                class325.field4742 = -1;
            } else if (arg1.equalsIgnoreCase("shad=-1")) {
                class492.field7522 = 0;
            } else if (arg1.startsWith("shad=")) {
                class492.field7522 = class45.method348(16, true, arg1.substring(5)) | 0xFF000000;
            } else if (arg1.equals("shad")) {
                class492.field7522 = -16777216;
            } else if (arg1.equals("/shad")) {
                class492.field7522 = class27.field447;
            } else if (arg1.equals("br")) {
                this.method2102(class463.field6719, class27.field447, 27154);
                return;
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(CIIIZLfs;II)V")
    public abstract void method434(char arg0, int arg1, int arg2, int arg3, boolean arg4, class372 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(ILjava/lang/String;IIII)V")
    public final void method2107(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 != -14014) {
            method2114((byte) -70);
        }
        field5036++;
        if (arg1 != null) {
            this.method2102(arg3, arg5, 27154);
            this.method2115(null, arg1, 0, 0, -108, null, null, arg0 - (this.field5029.method3055(7748, arg1) / 2), arg2);
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Ljava/util/Random;[II[Lqg;IILjava/lang/String;III)I")
    public final int method2108(Random arg0, int[] arg1, int arg2, class307[] arg3, int arg4, int arg5, String arg6, int arg7, int arg8, int arg9) {
        field5020++;
        if (arg6 == null) {
            return 0;
        }
        arg0.setSeed((long) arg7);
        int var11 = (arg0.nextInt() & 0x1F) + arg4;
        this.method2102(var11 << 24 | arg8 & 0xFFFFFF, var11 << 24 | arg5 & 0xFFFFFF, 27154);
        int var12 = arg6.length();
        int[] var13 = new int[var12];
        int var14 = 0;
        for (int var15 = 0; var15 < var12; var15++) {
            var13[var15] = var14;
            if ((arg0.nextInt() & 0x3) == 0) {
                var14++;
            }
        }
        this.method2112(arg9, arg6, arg2, null, arg4 ^ 0xFFFFFF3F, var13, arg1, arg3);
        return var14;
    }

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "(IILjava/lang/String;IIII)V")
    public final void method2109(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5, int arg6) {
        field5027++;
        if (arg2 == null) {
            return;
        }
        this.method2102(arg1, arg0, 27154);
        int var8 = arg2.length();
        int[] var9 = new int[var8];
        for (int var10 = 0; var10 < var8; var10++) {
            var9[var10] = (int) (Math.sin((double) arg4 / 5.0D + (double) var10 / 2.0D) * 5.0D);
        }
        this.method2112(arg6 - (this.field5029.method3055(7748, arg2) / arg3), arg2, arg5, var9, -1, null, null, null);
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lfs;IIIIIIILjava/lang/String;II[Lqg;IIB[I)I")
    public final int method2110(class372 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, String arg8, int arg9, int arg10, class307[] arg11, int arg12, int arg13, byte arg14, int[] arg15) {
        field5025++;
        if (arg14 >= -91) {
            field5030 = null;
        }
        return this.method2099(arg10, arg2, arg0, 0, arg4, arg6, arg11, arg13, arg3, arg12, arg5, arg1, arg8, arg15, 12426, arg7, arg9);
    }

    @OriginalMember(owner = "client!hr", name = "<init>", descriptor = "(Leq;Lmo;)V")
    public class348(class134 arg0, class507 arg1) {
        this.field5028 = arg0;
        this.field5029 = arg1;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Ljava/lang/String;ILjava/util/Random;I[IIII[IIIIII[Lqg;)I")
    public final int method2111(String arg0, int arg1, Random arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, int[] arg8, int arg9, int arg10, int arg11, int arg12, int arg13, class307[] arg14) {
        field5034++;
        if (arg0 == null) {
            return 0;
        }
        arg2.setSeed((long) arg1);
        int var16 = (arg2.nextInt() & 0x1F) + 192;
        this.method2102(var16 << 24 | arg9 & 0xFFFFFF, arg10 & 0xFFFFFF | var16 << 24, 27154);
        int var17 = arg0.length();
        int[] var18 = new int[var17];
        int var19 = 0;
        for (int var20 = 0; var20 < var17; var20++) {
            var18[var20] = var19;
            if ((arg2.nextInt() & 0x3) == 0) {
                var19++;
            }
        }
        if (arg6 <= 79) {
            this.field5028 = null;
        }
        int var21 = arg12;
        int var22 = arg5 + this.field5029.field7727;
        if (arg13 == 1) {
            var22 += (arg11 - this.field5029.field7727 - this.field5029.field7724) / 2;
        } else if (arg13 == 2) {
            var22 = arg5 + arg11 - this.field5029.field7724;
        }
        int var23 = -1;
        if (arg7 == 1) {
            var23 = var19 + this.field5029.method3055(7748, arg0);
            var21 = (arg3 - var23) / 2 + arg12;
        } else if (arg7 == 2) {
            var23 = this.field5029.method3055(7748, arg0) + var19;
            var21 = arg3 + arg12 - var23;
        }
        this.method2112(var21, arg0, var22, null, -1, var18, arg4, arg14);
        if (arg8 != null) {
            if (var23 == -1) {
                var23 = var19 + this.field5029.method3055(7748, arg0);
            }
            arg8[1] = var22 - this.field5029.field7727;
            arg8[3] = this.field5029.field7727 + this.field5029.field7724;
            arg8[2] = var23;
            arg8[0] = var21;
        }
        return var19;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(ILjava/lang/String;I[II[I[I[Lqg;)V")
    private final void method2112(int arg0, String arg1, int arg2, int[] arg3, int arg4, int[] arg5, int[] arg6, class307[] arg7) {
        int var9 = arg2 - this.field5029.field7725;
        field5031++;
        int var10 = -1;
        int var11 = arg4;
        int var12 = 0;
        int var13 = arg1.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class164.method1040((byte) -103, arg1.charAt(var14)) & 0xFF);
            if (var15 == '<') {
                var10 = var14;
            } else {
                if (var15 == '>' && var10 != -1) {
                    String var16 = arg1.substring(var10 + 1, var14);
                    var10 = -1;
                    if (var16.equals("lt")) {
                        var15 = '<';
                    } else if (var16.equals("gt")) {
                        var15 = '>';
                    } else if (var16.equals("nbsp")) {
                        var15 = ' ';
                    } else if (var16.equals("shy")) {
                        var15 = '\u00AD';
                    } else if (var16.equals("times")) {
                        var15 = '×';
                    } else if (var16.equals("euro")) {
                        var15 = '€';
                    } else if (var16.equals("copy")) {
                        var15 = '©';
                    } else {
                        if (!var16.equals("reg")) {
                            if (var16.startsWith("img=")) {
                                try {
                                    int var17;
                                    if (arg5 == null) {
                                        var17 = 0;
                                    } else {
                                        var17 = arg5[var12];
                                    }
                                    int var18;
                                    if (arg3 == null) {
                                        var18 = 0;
                                    } else {
                                        var18 = arg3[var12];
                                    }
                                    var12++;
                                    int var19 = class103.method622(var16.substring(4), 0);
                                    class307 var20 = arg7[var19];
                                    int var21 = arg6 == null ? var20.method94() : arg6[var19];
                                    var20.method90(arg0 + var17, -var21 + var18 + this.field5029.field7725 + var9, 1, 0, 1);
                                    var11 = -1;
                                    arg0 += arg7[var19].method87();
                                } catch (Exception var25) {
                                }
                            } else {
                                this.method2106((byte) -14, var16);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var10 == -1) {
                    if (var11 != -1) {
                        arg0 += this.field5029.method3048(var15, var11, arg4 + 1);
                    }
                    int var22;
                    if (arg5 == null) {
                        var22 = 0;
                    } else {
                        var22 = arg5[var12];
                    }
                    int var23;
                    if (arg3 == null) {
                        var23 = 0;
                    } else {
                        var23 = arg3[var12];
                    }
                    if (var15 != ' ') {
                        if ((class492.field7522 & 0xFF000000) != 0) {
                            this.method433(var15, arg0 + var22 + 1, var9 + 1 + var23, class492.field7522, true);
                        }
                        this.method433(var15, arg0 + var22, var9 + var23, class388.field5751, false);
                    } else if (class282.field4028 > 0) {
                        class297.field4327 += class282.field4028;
                        arg0 += class297.field4327 >> 8;
                        class297.field4327 &= 0xFF;
                    }
                    var12++;
                    int var24 = this.field5029.method3049((byte) -62, var15);
                    if (class221.field3125 != -1) {
                        this.field5028.method741(var24, arg0, (int) ((double) this.field5029.field7725 * 0.7D) + var9, class221.field3125, arg4 + 2);
                    }
                    if (class325.field4742 != -1) {
                        this.field5028.method741(var24, arg0, this.field5029.field7725 + var9, class325.field4742, 1);
                    }
                    arg0 += var24;
                    var11 = var15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(IIIIII)V")
    public static final void method2113(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5024++;
        int var6 = arg1 - arg0;
        int var7 = arg2 - arg3;
        if (var7 == 0) {
            if (var6 != 0) {
                class19.method130(arg1, arg3, arg0, false, arg5);
            }
        } else if (var6 == 0) {
            class192.method1209(true, arg0, arg5, arg2, arg3);
        } else {
            if (var7 < 0) {
                var7 = -var7;
            }
            if (var6 < 0) {
                var6 = -var6;
            }
            if (arg4 > -41) {
                field5043 = -40;
            }
            boolean var8 = var7 < var6;
            if (var8) {
                int var9 = arg3;
                arg3 = arg0;
                int var10 = arg2;
                arg2 = arg1;
                arg0 = var9;
                arg1 = var10;
            }
            if (arg2 < arg3) {
                int var11 = arg3;
                int var12 = arg0;
                arg3 = arg2;
                arg0 = arg1;
                arg2 = var11;
                arg1 = var12;
            }
            int var13 = arg0;
            int var14 = arg2 - arg3;
            int var15 = arg1 - arg0;
            int var16 = -(var14 >> 1);
            if (var15 < 0) {
                var15 = -var15;
            }
            int var17 = arg0 < arg1 ? 1 : -1;
            if (var8) {
                for (int var18 = arg3; var18 <= arg2; var18++) {
                    class41.field629[var18][var13] = arg5;
                    var16 += var15;
                    if (var16 > 0) {
                        var16 -= var14;
                        var13 += var17;
                    }
                }
            } else {
                for (int var19 = arg3; var19 <= arg2; var19++) {
                    class41.field629[var13][var19] = arg5;
                    var16 += var15;
                    if (var16 > 0) {
                        var13 += var17;
                        var16 -= var14;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(B)V")
    public static void method2114(byte arg0) {
        field5033 = null;
        if (arg0 > -109) {
            method2114((byte) 121);
        }
        field5030 = null;
        field5044 = null;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "([Lqg;Ljava/lang/String;III[ILfs;II)V")
    private final void method2115(class307[] arg0, String arg1, int arg2, int arg3, int arg4, int[] arg5, class372 arg6, int arg7, int arg8) {
        int var10 = arg8 - this.field5029.field7725;
        field5022++;
        int var11 = 67 % ((arg4 - 43) / 63);
        int var12 = -1;
        int var13 = -1;
        int var14 = arg1.length();
        for (int var15 = 0; var15 < var14; var15++) {
            char var16 = (char) (class164.method1040((byte) -103, arg1.charAt(var15)) & 0xFF);
            if (var16 == '<') {
                var12 = var15;
            } else {
                if (var16 == '>' && var12 != -1) {
                    String var17 = arg1.substring(var12 + 1, var15);
                    var12 = -1;
                    if (var17.equals("lt")) {
                        var16 = '<';
                    } else if (var17.equals("gt")) {
                        var16 = '>';
                    } else if (var17.equals("nbsp")) {
                        var16 = ' ';
                    } else if (var17.equals("shy")) {
                        var16 = '\u00AD';
                    } else if (var17.equals("times")) {
                        var16 = '×';
                    } else if (var17.equals("euro")) {
                        var16 = '€';
                    } else if (var17.equals("copy")) {
                        var16 = '©';
                    } else {
                        if (!var17.equals("reg")) {
                            if (var17.startsWith("img=")) {
                                try {
                                    int var18 = class103.method622(var17.substring(4), 0);
                                    class307 var19 = arg0[var18];
                                    int var20 = arg5 == null ? var19.method94() : arg5[var18];
                                    if ((class388.field5751 & 0xFF000000) == -16777216) {
                                        var19.method90(arg7, var10 + this.field5029.field7725 - var20, 1, 0, 1);
                                    } else {
                                        var19.method90(arg7, var10 + this.field5029.field7725 - var20, 0, class388.field5751 & 0xFF000000 | 0xFFFFFF, 1);
                                    }
                                    var13 = -1;
                                    arg7 += arg0[var18].method87();
                                } catch (Exception var22) {
                                }
                            } else {
                                this.method2106((byte) -14, var17);
                            }
                            continue;
                        }
                        var16 = '®';
                    }
                }
                if (var12 == -1) {
                    if (var13 != -1) {
                        arg7 += this.field5029.method3048(var16, var13, 0);
                    }
                    if (var16 == ' ') {
                        if (class282.field4028 > 0) {
                            class297.field4327 += class282.field4028;
                            arg7 += class297.field4327 >> 8;
                            class297.field4327 &= 0xFF;
                        }
                    } else if (arg6 == null) {
                        if ((class492.field7522 & 0xFF000000) != 0) {
                            this.method433(var16, arg7 + 1, var10 - -1, class492.field7522, true);
                        }
                        this.method433(var16, arg7, var10, class388.field5751, false);
                    } else {
                        if ((class492.field7522 & 0xFF000000) != 0) {
                            this.method434(var16, arg7 + 1, var10 + 1, class492.field7522, true, arg6, arg3, arg2);
                        }
                        this.method434(var16, arg7, var10, class388.field5751, false, arg6, arg3, arg2);
                    }
                    int var21 = this.field5029.method3049((byte) -62, var16);
                    if (class221.field3125 != -1) {
                        this.field5028.method741(var21, arg7, (int) ((double) this.field5029.field7725 * 0.7D) + var10, class221.field3125, 1);
                    }
                    if (class325.field4742 != -1) {
                        this.field5028.method741(var21, arg7, var10 + this.field5029.field7725 + 1, class325.field4742, 1);
                    }
                    var13 = var16;
                    arg7 += var21;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(IIIILjava/lang/String;B)V")
    public final void method2116(int arg0, int arg1, int arg2, int arg3, String arg4, byte arg5) {
        field5037++;
        if (arg5 == -85 && arg4 != null) {
            this.method2102(arg0, arg1, arg5 ^ 0xFFFF95B9);
            this.method2115(null, arg4, 0, 0, 111, null, null, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(IIILjava/lang/String;II[Lqg;[I)V")
    public final void method2117(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5, class307[] arg6, int[] arg7) {
        field5035++;
        if (arg3 == null) {
            return;
        }
        this.method2102(arg0, arg2, 27154);
        this.method2115(arg6, arg3, 0, 0, -85, arg7, null, arg4, arg5);
        if (arg1 != -1) {
            method2114((byte) 36);
        }
    }
}
