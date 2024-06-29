import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public abstract class class266 {

    @OriginalMember(owner = "client!sj", name = "s", descriptor = "Lth;")
    private class355 field3799;

    @OriginalMember(owner = "client!sj", name = "k", descriptor = "Lae;")
    private class134 field3791;

    @OriginalMember(owner = "client!sj", name = "n", descriptor = "Z")
    public static boolean field3794;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "I")
    public static int field3781;

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "I")
    public static int field3782;

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "I")
    public static int field3783;

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "I")
    public static int field3784;

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "I")
    public static int field3785;

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "I")
    public static int field3786;

    @OriginalMember(owner = "client!sj", name = "g", descriptor = "I")
    public static int field3787;

    @OriginalMember(owner = "client!sj", name = "h", descriptor = "I")
    public static int field3788;

    @OriginalMember(owner = "client!sj", name = "i", descriptor = "I")
    public static int field3789;

    @OriginalMember(owner = "client!sj", name = "j", descriptor = "I")
    public static int field3790;

    @OriginalMember(owner = "client!sj", name = "l", descriptor = "I")
    public static int field3792;

    @OriginalMember(owner = "client!sj", name = "m", descriptor = "I")
    public static int field3793;

    @OriginalMember(owner = "client!sj", name = "o", descriptor = "I")
    public static int field3795;

    @OriginalMember(owner = "client!sj", name = "p", descriptor = "I")
    public static int field3796;

    @OriginalMember(owner = "client!sj", name = "q", descriptor = "I")
    public static int field3797;

    @OriginalMember(owner = "client!sj", name = "r", descriptor = "I")
    public static int field3798;

    @OriginalMember(owner = "client!sj", name = "u", descriptor = "I")
    public static int field3801;

    @OriginalMember(owner = "client!sj", name = "t", descriptor = "[Lqk;")
    public static class12[] field3800;

    static {
        new class362("Now talking in clan channel ", "Chatraum: ", "Vous participez actuellement au canal de clan ", "Falando no canal do clã agora ");
        field3794 = false;
        new class362("Use", "Benutzen", "Utiliser", "Usar");
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Ljava/lang/String;IIIIII)V", line = 5)
    public final void method1761(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3801++;
        if (arg0 == null) {
            return;
        }
        this.method1773(-1, arg5, arg1);
        int var8 = arg0.length();
        if (arg3 != 5) {
            this.method1761((String) null, -37, -114, -71, 87, 34, 60);
        }
        int[] var9 = new int[var8];
        int[] var10 = new int[var8];
        for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = (int) (Math.sin((double) arg4 / 5.0D + (double) var11 / 5.0D) * 5.0D);
            var10[var11] = (int) (Math.sin((double) arg4 / 5.0D + (double) var11 / 3.0D) * 5.0D);
        }
        this.method1766(var9, arg6, arg0, -73, var10, arg2 - (this.field3799.method2264(arg0, 125) / 2), (int[]) null, (class381[]) null);
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIILjava/util/Random;I[Lgj;IILjava/lang/String;[I)I", line = 39)
    public final int method1762(int arg0, int arg1, int arg2, Random arg3, int arg4, class381[] arg5, int arg6, int arg7, String arg8, int[] arg9) {
        field3790++;
        if (arg8 == null) {
            return 0;
        }
        if (arg7 >= -43) {
            field3794 = true;
        }
        arg3.setSeed((long) arg1);
        int var11 = (arg3.nextInt() & 0x1F) + 192;
        this.method1773(-1, arg4 & 0xFFFFFF | var11 << 24, arg2 & 0xFFFFFF | var11 << 24);
        int var12 = arg8.length();
        int[] var13 = new int[var12];
        int var14 = 0;
        for (int var15 = 0; var15 < var12; var15++) {
            var13[var15] = var14;
            if ((arg3.nextInt() & 0x3) == 0) {
                var14++;
            }
        }
        this.method1766(var13, arg0, arg8, -112, (int[]) null, arg6, arg9, arg5);
        return var14;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(ILjava/lang/String;IIIIII)V", line = 84)
    public final void method1763(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3783++;
        if (arg1 == null) {
            return;
        }
        this.method1773(-1, arg5, arg3);
        if (arg0 <= 15) {
            this.field3791 = null;
        }
        double var9 = 7.0D - (double) arg2 / 8.0D;
        if (var9 < 0.0D) {
            var9 = 0.0D;
        }
        int var11 = arg1.length();
        int[] var12 = new int[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = (int) (Math.sin((double) var13 / 1.5D + (double) arg7) * var9);
        }
        this.method1766((int[]) null, arg4, arg1, -59, var12, arg6 - this.field3799.method2264(arg1, 124) / 2, (int[]) null, (class381[]) null);
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IZ)V", line = 120)
    public static final void method1764(int arg0, boolean arg1) {
        for (class435 var2 = (class435) class273.field3872.method506((byte) -128); var2 != null; var2 = (class435) class273.field3872.method514(true)) {
            if (var2.field6263 != null) {
                class399.field5694.method1137(var2.field6263);
                var2.field6263 = null;
            }
            if (var2.field6254 != null) {
                class399.field5694.method1137(var2.field6254);
                var2.field6254 = null;
            }
            var2.method2594((byte) -22);
        }
        field3786++;
        if (arg1) {
            for (class435 var3 = (class435) class138.field1713.method506((byte) -128); var3 != null; var3 = (class435) class138.field1713.method514(true)) {
                if (var3.field6263 != null) {
                    class399.field5694.method1137(var3.field6263);
                    var3.field6263 = null;
                }
                var3.method2594((byte) -22);
            }
            for (class435 var4 = (class435) class11.field150.method1884(0); var4 != null; var4 = (class435) class11.field150.method1890(-1)) {
                if (var4.field6263 != null) {
                    class399.field5694.method1137(var4.field6263);
                    var4.field6263 = null;
                }
                var4.method2594((byte) -22);
            }
        }
        if (arg0 != 20881) {
            field3800 = null;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IZLhb;IIII[I[Lgj;IIIILjava/lang/String;II)I", line = 202)
    public final int method1765(int arg0, boolean arg1, class433 arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7, class381[] arg8, int arg9, int arg10, int arg11, int arg12, String arg13, int arg14, int arg15) {
        field3789++;
        if (arg13 == null) {
            return 0;
        }
        this.method1773(-1, arg6, arg11);
        if (arg14 == 0) {
            arg14 = this.field3799.field5010;
        }
        int[] var17;
        if (this.field3799.field4997 + this.field3799.field4990 + arg14 > arg3 && arg3 < arg14 + arg14) {
            var17 = null;
        } else {
            var17 = new int[] { arg12 };
        }
        int var18 = this.field3799.method2262(arg13, var17, arg8, class135.field1698, -21293);
        if (arg9 == 3 && var18 == 1) {
            arg9 = 1;
        }
        int var19;
        if (arg9 == 0) {
            var19 = this.field3799.field4990 + arg5;
        } else if (arg9 == 1) {
            var19 = arg5 - (-this.field3799.field4990 - (arg3 - (this.field3799.field4997 + ((var18 - 1) * arg14) + this.field3799.field4990)) / 2);
        } else if (arg9 == 2) {
            var19 = arg3 + arg5 - ((var18 - 1) * arg14) - this.field3799.field4997;
        } else {
            int var20 = (arg3 - this.field3799.field4990 - ((var18 - 1) * arg14) - this.field3799.field4997) / (var18 + 1);
            if (var20 < 0) {
                var20 = 0;
            }
            var19 = arg5 - (-this.field3799.field4990 - var20);
            arg14 += var20;
        }
        int var21 = 0;
        if (!arg1) {
            this.method375('6', -88, -106, -33, false, (class433) null, 127, 72);
        }
        while (var21 < var18) {
            if (arg15 == 0) {
                this.method1775(arg0, arg4, class135.field1698[var21], arg2, arg8, arg10, arg7, 96, var19);
            } else if (arg15 == 1) {
                this.method1775((arg12 - this.field3799.method2264(class135.field1698[var21], 123)) / 2 + arg0, arg4, class135.field1698[var21], arg2, arg8, arg10, arg7, 31, var19);
            } else if (arg15 == 2) {
                this.method1775(arg0 + arg12 - this.field3799.method2264(class135.field1698[var21], -96), arg4, class135.field1698[var21], arg2, arg8, arg10, arg7, -124, var19);
            } else if ((var18 - 1) == var21) {
                this.method1775(arg0, arg4, class135.field1698[var21], arg2, arg8, arg10, arg7, 37, var19);
            } else {
                this.method1768(arg12, class135.field1698[var21], -1);
                this.method1775(arg0, arg4, class135.field1698[var21], arg2, arg8, arg10, arg7, 21, var19);
                class345.field4874 = 0;
            }
            var19 += arg14;
            var21++;
        }
        return var18;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "([IILjava/lang/String;I[II[I[Lgj;)V", line = 287)
    private final void method1766(int[] arg0, int arg1, String arg2, int arg3, int[] arg4, int arg5, int[] arg6, class381[] arg7) {
        if (arg3 >= -31) {
            return;
        }
        int var9 = arg1 - this.field3799.field5010;
        field3796++;
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        int var13 = arg2.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class348.method2226(arg2.charAt(var14), (byte) -121) & 0xFF);
            if (var15 == '<') {
                var10 = var14;
            } else {
                if (var15 == '>' && var10 != -1) {
                    String var16 = arg2.substring(var10 + 1, var14);
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
                                    if (arg0 == null) {
                                        var17 = 0;
                                    } else {
                                        var17 = arg0[var12];
                                    }
                                    int var18;
                                    if (arg4 == null) {
                                        var18 = 0;
                                    } else {
                                        var18 = arg4[var12];
                                    }
                                    var12++;
                                    int var19 = class4.method29(var16.substring(4), 10);
                                    class381 var20 = arg7[var19];
                                    int var21 = arg6 == null ? var20.method761() : arg6[var19];
                                    var20.method756(arg5 + var17, -var21 + this.field3799.field5010 + var18 + var9, 0, 0, 1);
                                    var11 = -1;
                                    arg5 += arg7[var19].method762();
                                } catch (Exception var25) {
                                }
                            } else {
                                this.method1770((byte) 88, var16);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var10 == -1) {
                    if (var11 != -1) {
                        arg5 += this.field3799.method2263(83, var15, var11);
                    }
                    int var22;
                    if (arg0 == null) {
                        var22 = 0;
                    } else {
                        var22 = arg0[var12];
                    }
                    int var23;
                    if (arg4 == null) {
                        var23 = 0;
                    } else {
                        var23 = arg4[var12];
                    }
                    if (var15 != ' ') {
                        if ((class199.field2837 & 0xFF000000) != 0) {
                            this.method376(var15, arg5 + var22 + 1, var9 + var23 + 1, class199.field2837, true);
                        }
                        this.method376(var15, arg5 + var22, var9 - -var23, class351.field4968, false);
                    } else if (class345.field4874 > 0) {
                        class313.field4470 += class345.field4874;
                        arg5 += class313.field4470 >> 8;
                        class313.field4470 &= 0xFF;
                    }
                    var12++;
                    int var24 = this.field3799.method2260(var15, -125);
                    if (class302.field4242 != -1) {
                        this.field3791.method826((byte) -82, var24, arg5, (int) ((double) this.field3799.field5010 * 0.7D) + var9, class302.field4242);
                    }
                    if (class276.field3926 != -1) {
                        this.field3791.method826((byte) -82, var24, arg5, this.field3799.field5010 + var9, class276.field3926);
                    }
                    var11 = var15;
                    arg5 += var24;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIILjava/lang/String;II)V", line = 453)
    public final void method1767(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5) {
        field3781++;
        if (arg3 == null) {
            return;
        }
        if (arg5 != 4) {
            this.field3791 = null;
        }
        this.method1773(-1, arg0, arg2);
        this.method1775(arg1, 0, arg3, (class433) null, (class381[]) null, 0, (int[]) null, arg5 ^ 0x5D, arg4);
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(ILjava/lang/String;I)V", line = 469)
    private final void method1768(int arg0, String arg1, int arg2) {
        field3793++;
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
        if (arg2 > ~var4) {
            class345.field4874 = (arg0 - this.field3799.method2264(arg1, arg2 + 123) << 8) / var4;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(I[III[Lgj;IIIII[ILjava/lang/String;IILjava/util/Random;)I", line = 518)
    public final int method1769(int arg0, int[] arg1, int arg2, int arg3, class381[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int[] arg10, String arg11, int arg12, int arg13, Random arg14) {
        field3788++;
        if (arg11 == null) {
            return 0;
        }
        arg14.setSeed((long) arg13);
        int var16 = (arg14.nextInt() & 0x1F) + 192;
        this.method1773(-1, var16 << 24 | arg8 & 0xFFFFFF, arg7 & 0xFFFFFF | var16 << 24);
        int var17 = arg11.length();
        int[] var18 = new int[var17];
        int var19 = 0;
        for (int var20 = 0; var20 < var17; var20++) {
            var18[var20] = var19;
            if ((arg14.nextInt() & 0x3) == 0) {
                var19++;
            }
        }
        int var21 = arg6;
        if (arg9 != 3) {
            this.method1770((byte) 109, (String) null);
        }
        int var22 = this.field3799.field4990 + arg3;
        int var23 = -1;
        if (arg12 == 1) {
            var22 += (arg0 - this.field3799.field4990 - this.field3799.field4997) / 2;
        } else if (arg12 == 2) {
            var22 = arg0 + arg3 - this.field3799.field4997;
        }
        if (arg5 == 1) {
            var23 = this.field3799.method2264(arg11, arg9 ^ 0x7A) + var19;
            var21 = (arg2 - var23) / 2 + arg6;
        } else if (arg5 == 2) {
            var23 = this.field3799.method2264(arg11, -116) + var19;
            var21 = arg2 + arg6 - var23;
        }
        this.method1766(var18, var22, arg11, -91, (int[]) null, var21, arg10, arg4);
        if (arg1 != null) {
            if (var23 == -1) {
                var23 = this.field3799.method2264(arg11, 127) + var19;
            }
            arg1[2] = var23;
            arg1[0] = var21;
            arg1[3] = this.field3799.field4997 + this.field3799.field4990;
            arg1[1] = var22 - this.field3799.field4990;
        }
        return var19;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(BLjava/lang/String;)V", line = 596)
    private final void method1770(byte arg0, String arg1) {
        field3784++;
        try {
            if (arg1.startsWith("col=")) {
                class351.field4968 = class351.field4968 & 0xFF000000 | class87.method472(16, (byte) -78, arg1.substring(4)) & 0xFFFFFF;
            } else if (arg1.equals("/col")) {
                class351.field4968 = class4.field58 & 0xFFFFFF | class351.field4968 & 0xFF000000;
            }
            if (arg1.startsWith("argb=")) {
                class351.field4968 = class87.method472(16, (byte) -110, arg1.substring(5));
            } else if (arg1.equals("/argb")) {
                class351.field4968 = class4.field58;
            } else if (arg1.startsWith("str=")) {
                class302.field4242 = class87.method472(16, (byte) -65, arg1.substring(4)) | 0xFF000000;
            } else if (arg1.equals("str")) {
                class302.field4242 = -8388608;
            } else if (arg1.equals("/str")) {
                class302.field4242 = -1;
            } else if (arg1.startsWith("u=")) {
                class276.field3926 = class87.method472(16, (byte) 79, arg1.substring(2)) | 0xFF000000;
            } else if (arg1.equals("u")) {
                class276.field3926 = -16777216;
            } else if (arg1.equals("/u")) {
                class276.field3926 = -1;
            } else if (arg1.equalsIgnoreCase("shad=-1")) {
                class199.field2837 = 0;
            } else if (arg1.startsWith("shad=")) {
                class199.field2837 = class87.method472(16, (byte) 121, arg1.substring(5)) | 0xFF000000;
            } else if (arg1.equals("shad")) {
                class199.field2837 = -16777216;
            } else if (arg1.equals("/shad")) {
                class199.field2837 = class46.field558;
            } else if (arg1.equals("br")) {
                this.method1773(-1, class46.field558, class4.field58);
            }
        } catch (Exception var3) {
        }
        if (arg0 < 38) {
            method1774((byte) 98);
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "([IIIILjava/lang/String;I[Lgj;I)V", line = 671)
    public final void method1771(int[] arg0, int arg1, int arg2, int arg3, String arg4, int arg5, class381[] arg6, int arg7) {
        field3785++;
        if (arg4 != null) {
            this.method1773(-1, arg7, arg5);
            this.method1775(arg3, arg1, arg4, (class433) null, arg6, 0, arg0, arg1 ^ 0xFFFFFF9C, arg2);
        }
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(Lae;Lth;)V", line = 683)
    public class266(class134 arg0, class355 arg1) {
        this.field3799 = arg1;
        this.field3791 = arg0;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Ljava/lang/String;BIIII)V", line = 698)
    public final void method1772(String arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field3787++;
        if (arg0 == null) {
            return;
        }
        this.method1773(-1, arg2, arg3);
        this.method1775(arg5 - this.field3799.method2264(arg0, -100), 0, arg0, (class433) null, (class381[]) null, 0, (int[]) null, -27, arg4);
        if (arg1 < 86) {
            field3794 = true;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(III)V", line = 713)
    private final void method1773(int arg0, int arg1, int arg2) {
        field3795++;
        class276.field3926 = -1;
        class302.field4242 = arg0;
        class313.field4470 = 0;
        class345.field4874 = 0;
        class4.field58 = arg2;
        class351.field4968 = arg2;
        if (arg1 == -1) {
            arg1 = 0;
        }
        class46.field558 = arg1;
        class199.field2837 = arg1;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(B)V", line = 734)
    public static void method1774(byte arg0) {
        field3800 = null;
        int var1 = -57 % ((arg0 + 33) / 32);
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IILjava/lang/String;Lhb;[Lgj;I[III)V", line = 744)
    private final void method1775(int arg0, int arg1, String arg2, class433 arg3, class381[] arg4, int arg5, int[] arg6, int arg7, int arg8) {
        field3782++;
        int var10 = arg8 - this.field3799.field5010;
        int var11 = -1;
        int var12 = -1;
        int var13 = arg2.length();
        int var14 = 5 % ((-arg7 - 67) / 32);
        for (int var15 = 0; var15 < var13; var15++) {
            char var16 = (char) (class348.method2226(arg2.charAt(var15), (byte) -121) & 0xFF);
            if (var16 == '<') {
                var11 = var15;
            } else {
                if (var16 == '>' && var11 != -1) {
                    String var17 = arg2.substring(var11 + 1, var15);
                    var11 = -1;
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
                                    int var18 = class4.method29(var17.substring(4), 10);
                                    class381 var19 = arg4[var18];
                                    int var20 = arg6 == null ? var19.method761() : arg6[var18];
                                    if ((class351.field4968 & 0xFF000000) == -16777216) {
                                        var19.method756(arg0, this.field3799.field5010 + var10 - var20, 0, 0, 1);
                                    } else {
                                        var19.method756(arg0, var10 + this.field3799.field5010 - var20, 1, class351.field4968 & 0xFF000000 | 0xFFFFFF, 1);
                                    }
                                    arg0 += arg4[var18].method762();
                                    var12 = -1;
                                } catch (Exception var22) {
                                }
                            } else {
                                this.method1770((byte) 122, var17);
                            }
                            continue;
                        }
                        var16 = '®';
                    }
                }
                if (var11 == -1) {
                    if (var12 != -1) {
                        arg0 += this.field3799.method2263(89, var16, var12);
                    }
                    if (var16 == ' ') {
                        if (class345.field4874 > 0) {
                            class313.field4470 += class345.field4874;
                            arg0 += class313.field4470 >> 8;
                            class313.field4470 &= 0xFF;
                        }
                    } else if (arg3 == null) {
                        if ((class199.field2837 & 0xFF000000) != 0) {
                            this.method376(var16, arg0 + 1, var10 + 1, class199.field2837, true);
                        }
                        this.method376(var16, arg0, var10, class351.field4968, false);
                    } else {
                        if ((class199.field2837 & 0xFF000000) != 0) {
                            this.method375(var16, arg0 + 1, var10 + 1, class199.field2837, true, arg3, arg5, arg1);
                        }
                        this.method375(var16, arg0, var10, class351.field4968, false, arg3, arg5, arg1);
                    }
                    int var21 = this.field3799.method2260(var16, 2);
                    if (class302.field4242 != -1) {
                        this.field3791.method826((byte) -82, var21, arg0, (int) ((double) this.field3799.field5010 * 0.7D) + var10, class302.field4242);
                    }
                    if (class276.field3926 != -1) {
                        this.field3791.method826((byte) -82, var21, arg0, this.field3799.field5010 + var10 + 1, class276.field3926);
                    }
                    arg0 += var21;
                    var12 = var16;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IILjava/lang/String;III)V", line = 893)
    public final void method1776(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5) {
        field3797++;
        if (arg2 == null) {
            return;
        }
        this.method1773(-1, arg5, arg1);
        if (arg4 > -75) {
            this.method1773(-105, -67, -91);
        }
        this.method1775(arg3 - (this.field3799.method2264(arg2, 120) / 2), 0, arg2, (class433) null, (class381[]) null, 0, (int[]) null, -122, arg0);
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIIIILjava/lang/String;I)V", line = 909)
    public final void method1777(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5, int arg6) {
        field3798++;
        if (arg5 == null) {
            return;
        }
        this.method1773(-1, arg4, arg3);
        int var8 = arg5.length();
        int[] var9 = new int[var8];
        int var10 = -34 / ((-arg1 - 9) / 42);
        for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = (int) (Math.sin((double) arg2 / 5.0D + (double) var11 / 2.0D) * 5.0D);
        }
        this.method1766((int[]) null, arg0, arg5, -123, var9, arg6 - this.field3799.method2264(arg5, -6) / 2, (int[]) null, (class381[]) null);
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(CIIIZLhb;II)V")
    public abstract void method375(char arg0, int arg1, int arg2, int arg3, boolean arg4, class433 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(CIIIZ)V")
    public abstract void method376(char arg0, int arg1, int arg2, int arg3, boolean arg4);
}
