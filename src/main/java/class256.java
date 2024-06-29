import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public abstract class class256 {

    @OriginalMember(owner = "client!oh", name = "h", descriptor = "Lqb;")
    private class135 field3749;

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "Lnp;")
    private class313 field3746;

    @OriginalMember(owner = "client!oh", name = "j", descriptor = "[B")
    public static byte[] field3751 = new byte[32896];

    @OriginalMember(owner = "client!oh", name = "n", descriptor = "Lwf;")
    public static class79 field3755;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "I")
    public static int field3742;

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "I")
    public static int field3743;

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "I")
    public static int field3744;

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "I")
    public static int field3745;

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "I")
    public static int field3747;

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "I")
    public static int field3748;

    @OriginalMember(owner = "client!oh", name = "i", descriptor = "I")
    public static int field3750;

    @OriginalMember(owner = "client!oh", name = "k", descriptor = "I")
    public static int field3752;

    @OriginalMember(owner = "client!oh", name = "l", descriptor = "I")
    public static int field3753;

    @OriginalMember(owner = "client!oh", name = "m", descriptor = "I")
    public static int field3754;

    @OriginalMember(owner = "client!oh", name = "o", descriptor = "I")
    public static int field3756;

    @OriginalMember(owner = "client!oh", name = "p", descriptor = "I")
    public static int field3757;

    @OriginalMember(owner = "client!oh", name = "q", descriptor = "I")
    public static int field3758;

    @OriginalMember(owner = "client!oh", name = "r", descriptor = "I")
    public static int field3759;

    @OriginalMember(owner = "client!oh", name = "s", descriptor = "I")
    public static int field3760;

    @OriginalMember(owner = "client!oh", name = "t", descriptor = "Z")
    public static boolean field3761;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "([III[I[IILjava/lang/String;[Ltr;)V")
    private final void method1588(int[] arg0, int arg1, int arg2, int[] arg3, int[] arg4, int arg5, String arg6, class176[] arg7) {
        int var9 = arg1 - this.field3749.field1796;
        field3752++;
        int var10 = arg2;
        int var11 = -1;
        int var12 = 0;
        int var13 = arg6.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class367.method2262(arg6.charAt(var14), (byte) -99) & 0xFF);
            if (var15 == '<') {
                var10 = var14;
            } else {
                if (var15 == '>' && var10 != -1) {
                    String var16 = arg6.substring(var10 + 1, var14);
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
                                    int var19 = class151.method952(var16.substring(4), arg2 ^ 0xFFFFC151);
                                    class176 var20 = arg7[var19];
                                    int var21 = arg3 == null ? var20.method524() : arg3[var19];
                                    var20.method144(arg5 + var17, -var21 + this.field3749.field1796 + var9 + var18, 0, 0, 1);
                                    arg5 += arg7[var19].method516();
                                    var11 = -1;
                                } catch (Exception var25) {
                                }
                            } else {
                                this.method1602(var16, 53);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var10 == -1) {
                    if (var11 != -1) {
                        arg5 += this.field3749.method856(var15, 127, var11);
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
                        if ((class85.field1040 & 0xFF000000) != 0) {
                            this.method1399(var15, arg5 + var22 + 1, var9 - -var23 + 1, class85.field1040, true);
                        }
                        this.method1399(var15, arg5 + var22, var9 + var23, class187.field2769, false);
                    } else if (class153.field2258 > 0) {
                        class475.field6669 += class153.field2258;
                        arg5 += class475.field6669 >> 8;
                        class475.field6669 &= 0xFF;
                    }
                    var12++;
                    int var24 = this.field3749.method861(var15, 60);
                    if (class479.field6714 != -1) {
                        this.field3746.method1931(class479.field6714, var24, var9 + ((int) ((double) this.field3749.field1796 * 0.7D)), arg5, 114);
                    }
                    if (class68.field861 != -1) {
                        this.field3746.method1931(class68.field861, var24, var9 + this.field3749.field1796, arg5, arg2 ^ 0xFFFFFF84);
                    }
                    var11 = var15;
                    arg5 += var24;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ILsm;IILjava/lang/String;II[Ltr;[I)V")
    private final void method1589(int arg0, class171 arg1, int arg2, int arg3, String arg4, int arg5, int arg6, class176[] arg7, int[] arg8) {
        int var10 = arg0 - this.field3749.field1796;
        field3756++;
        int var11 = -1;
        int var12 = arg6;
        int var13 = arg4.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class367.method2262(arg4.charAt(var14), (byte) -99) & 0xFF);
            if (var15 == '<') {
                var11 = var14;
            } else {
                if (var15 == '>' && var11 != -1) {
                    String var16 = arg4.substring(var11 + 1, var14);
                    var11 = -1;
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
                                    int var17 = class151.method952(var16.substring(4), 16046);
                                    class176 var18 = arg7[var17];
                                    int var19 = arg8 == null ? var18.method524() : arg8[var17];
                                    if ((class187.field2769 & 0xFF000000) == -16777216) {
                                        var18.method144(arg5, var10 + this.field3749.field1796 - var19, 0, 0, 1);
                                    } else {
                                        var18.method144(arg5, var10 + this.field3749.field1796 - var19, 1, class187.field2769 & 0xFF000000 | 0xFFFFFF, 1);
                                    }
                                    arg5 += arg7[var17].method516();
                                    var12 = -1;
                                } catch (Exception var21) {
                                }
                            } else {
                                this.method1602(var16, -3);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var11 == -1) {
                    if (var12 != -1) {
                        arg5 += this.field3749.method856(var15, 125, var12);
                    }
                    if (var15 == ' ') {
                        if (class153.field2258 > 0) {
                            class475.field6669 += class153.field2258;
                            arg5 += class475.field6669 >> 8;
                            class475.field6669 &= 0xFF;
                        }
                    } else if (arg1 == null) {
                        if ((class85.field1040 & 0xFF000000) != 0) {
                            this.method1399(var15, arg5 + 1, var10 + 1, class85.field1040, true);
                        }
                        this.method1399(var15, arg5, var10, class187.field2769, false);
                    } else {
                        if ((class85.field1040 & 0xFF000000) != 0) {
                            this.method1402(var15, arg5 + 1, var10 - -1, class85.field1040, true, arg1, arg2, arg3);
                        }
                        this.method1402(var15, arg5, var10, class187.field2769, false, arg1, arg2, arg3);
                    }
                    int var20 = this.field3749.method861(var15, 60);
                    if (class479.field6714 != -1) {
                        this.field3746.method1931(class479.field6714, var20, var10 + ((int) ((double) this.field3749.field1796 * 0.7D)), arg5, 95);
                    }
                    if (class68.field861 != -1) {
                        this.field3746.method1931(class68.field861, var20, var10 - (-this.field3749.field1796 - 1), arg5, arg6 ^ 0xFFFFFF9A);
                    }
                    var12 = var15;
                    arg5 += var20;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Ljava/lang/String;IIIBI)V")
    public final void method1590(String arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        if (arg4 >= -13) {
            this.method1596(20, (String) null, -11, 106, 117, -107);
        }
        field3748++;
        if (arg0 != null) {
            this.method1597((byte) 72, arg2, arg1);
            this.method1589(arg5, (class171) null, 0, 0, arg0, arg3, -1, (class176[]) null, (int[]) null);
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(BIIIIILjava/lang/String;I)V")
    public final void method1591(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, String arg6, int arg7) {
        field3743++;
        if (arg6 == null) {
            return;
        }
        this.method1597((byte) 75, arg7, arg2);
        double var9 = 7.0D - (double) arg1 / 8.0D;
        if (var9 < 0.0D) {
            var9 = 0.0D;
        }
        if (arg0 > -82) {
            this.method1602((String) null, 81);
        }
        int var11 = arg6.length();
        int[] var12 = new int[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = (int) (Math.sin((double) var13 / 1.5D + (double) arg5) * var9);
        }
        this.method1588((int[]) null, arg4, -1, (int[]) null, var12, arg3 - this.field3749.method860(-46, arg6) / 2, arg6, (class176[]) null);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IILjava/lang/String;)V")
    private final void method1592(int arg0, int arg1, String arg2) {
        field3745++;
        int var4 = 0;
        boolean var5 = false;
        for (int var6 = 0; var6 < arg2.length(); var6++) {
            char var7 = arg2.charAt(var6);
            if (var7 == '<') {
                var5 = true;
            } else if (var7 == '>') {
                var5 = false;
            } else if (!var5 && var7 == ' ') {
                var4++;
            }
        }
        if (arg1 != 5) {
            this.field3749 = null;
        }
        if (var4 > 0) {
            class153.field2258 = (arg0 - this.field3749.method860(-46, arg2) << 8) / var4;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIIILjava/lang/String;)V")
    public final void method1593(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5) {
        field3754++;
        if (arg5 != null) {
            int var7 = 114 / ((arg1 - 9) / 41);
            this.method1597((byte) 98, arg0, arg4);
            this.method1589(arg3, (class171) null, 0, 0, arg5, arg2 - this.field3749.method860(-46, arg5), -1, (class176[]) null, (int[]) null);
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(II[Ltr;Ljava/lang/String;I[III)V")
    public final void method1594(int arg0, int arg1, class176[] arg2, String arg3, int arg4, int[] arg5, int arg6, int arg7) {
        if (arg4 < 61) {
            this.method1600(56, -17, -123, -99, (String) null, -46, 15);
        }
        field3747++;
        if (arg3 != null) {
            this.method1597((byte) 84, arg0, arg1);
            this.method1589(arg7, (class171) null, 0, 0, arg3, arg6, -1, arg2, arg5);
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IILjava/lang/String;IIII)V")
    public final void method1595(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5, int arg6) {
        field3744++;
        if (arg2 == null) {
            return;
        }
        this.method1597((byte) 101, arg1, arg6);
        int var8 = arg2.length();
        int[] var9 = new int[var8];
        for (int var10 = 0; var10 < var8; var10++) {
            var9[var10] = (int) (Math.sin((double) arg3 / 5.0D + (double) var10 / 2.0D) * 5.0D);
        }
        this.method1588((int[]) null, arg5, -1, (int[]) null, var9, arg0 - (this.field3749.method860(-46, arg2) / 2), arg2, (class176[]) null);
        if (arg4 > -22) {
            this.field3749 = null;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ILjava/lang/String;IIII)V")
    public final void method1596(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        field3757++;
        if (arg1 != null) {
            this.method1597((byte) 98, arg3, arg2);
            this.method1589(arg4, (class171) null, arg0, 0, arg1, arg5 - (this.field3749.method860(-46, arg1) / 2), -1, (class176[]) null, (int[]) null);
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(BII)V")
    private final void method1597(byte arg0, int arg1, int arg2) {
        class153.field2258 = 0;
        field3759++;
        class479.field6714 = -1;
        if (arg1 == -1) {
            arg1 = 0;
        }
        class68.field861 = -1;
        if (arg0 < 50) {
            field3755 = null;
        }
        class393.field5580 = arg2;
        class187.field2769 = arg2;
        class475.field6669 = 0;
        class327.field4733 = arg1;
        class85.field1040 = arg1;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ILsm;IIIZIII[IIIILjava/lang/String;I[Ltr;)I")
    public final int method1598(int arg0, class171 arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int[] arg9, int arg10, int arg11, int arg12, String arg13, int arg14, class176[] arg15) {
        field3750++;
        if (arg13 == null) {
            return 0;
        }
        this.method1597((byte) 83, arg6, arg8);
        if (arg4 == 0) {
            arg4 = this.field3749.field1796;
        }
        int[] var17;
        if (this.field3749.field1785 + this.field3749.field1793 + arg4 > arg10 && (arg4 + arg4) > arg10) {
            var17 = null;
        } else {
            var17 = new int[] { arg12 };
        }
        int var18 = this.field3749.method859((byte) 93, var17, class48.field666, arg13, arg15);
        if (arg3 == 3 && var18 == 1) {
            arg3 = 1;
        }
        int var19;
        if (arg3 == 0) {
            var19 = arg0 + this.field3749.field1785;
        } else if (arg3 == 1) {
            var19 = (arg10 - this.field3749.field1785 - this.field3749.field1793 - ((var18 + -1) * arg4)) / 2 + this.field3749.field1785 + arg0;
        } else if (arg3 == 2) {
            var19 = arg0 + arg10 - ((var18 - 1) * arg4) - this.field3749.field1793;
        } else {
            int var20 = (arg10 - this.field3749.field1793 - this.field3749.field1785 - (var18 + -1) * arg4) / (var18 + 1);
            if (var20 < 0) {
                var20 = 0;
            }
            var19 = this.field3749.field1785 + arg0 + var20;
            arg4 += var20;
        }
        int var21 = 0;
        if (arg5) {
            return -6;
        }
        while (var18 > var21) {
            if (arg2 == 0) {
                this.method1589(var19, arg1, arg14, arg7, class48.field666[var21], arg11, -1, arg15, arg9);
            } else if (arg2 == 1) {
                this.method1589(var19, arg1, arg14, arg7, class48.field666[var21], arg11 + (arg12 - this.field3749.method860(-46, class48.field666[var21])) / 2, -1, arg15, arg9);
            } else if (arg2 == 2) {
                this.method1589(var19, arg1, arg14, arg7, class48.field666[var21], arg11 + arg12 - this.field3749.method860(-46, class48.field666[var21]), -1, arg15, arg9);
            } else if (var18 - 1 == var21) {
                this.method1589(var19, arg1, arg14, arg7, class48.field666[var21], arg11, -1, arg15, arg9);
            } else {
                this.method1592(arg12, 5, class48.field666[var21]);
                this.method1589(var19, arg1, arg14, arg7, class48.field666[var21], arg11, -1, arg15, arg9);
                class153.field2258 = 0;
            }
            var19 += arg4;
            var21++;
        }
        return var18;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(CIIIZLsm;II)V")
    public abstract void method1402(char arg0, int arg1, int arg2, int arg3, boolean arg4, class171 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ILjava/util/Random;[IB[Ltr;IIIIIIIILjava/lang/String;[I)I")
    public final int method1599(int arg0, Random arg1, int[] arg2, byte arg3, class176[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, String arg13, int[] arg14) {
        field3753++;
        if (arg13 == null) {
            return 0;
        }
        arg1.setSeed((long) arg7);
        int var16 = (arg1.nextInt() & 0x1F) + 192;
        this.method1597((byte) 67, arg6 & 0xFFFFFF | var16 << 24, var16 << 24 | arg12 & 0xFFFFFF);
        int var17 = arg13.length();
        int[] var18 = new int[var17];
        int var19 = 0;
        for (int var20 = 0; var20 < var17; var20++) {
            var18[var20] = var19;
            if ((arg1.nextInt() & 0x3) == 0) {
                var19++;
            }
        }
        int var21 = arg9;
        int var22 = arg5 + this.field3749.field1785;
        if (arg0 == 1) {
            var22 += (arg8 - this.field3749.field1785 - this.field3749.field1793) / 2;
        } else if (arg0 == 2) {
            var22 = arg5 + arg8 - this.field3749.field1793;
        }
        int var23 = -1;
        if (arg10 == 1) {
            var23 = this.field3749.method860(-46, arg13) + var19;
            var21 = (arg11 - var23) / 2 + arg9;
        } else if (arg10 == 2) {
            var23 = var19 + this.field3749.method860(-46, arg13);
            var21 = arg11 + arg9 - var23;
        }
        if (arg3 < 77) {
            this.method1589(106, (class171) null, 110, 56, (String) null, -42, -64, (class176[]) null, (int[]) null);
        }
        this.method1588(var18, var22, -1, arg2, (int[]) null, var21, arg13, arg4);
        if (arg14 != null) {
            if (var23 == -1) {
                var23 = var19 + this.field3749.method860(-46, arg13);
            }
            arg14[3] = this.field3749.field1793 + this.field3749.field1785;
            arg14[2] = var23;
            arg14[0] = var21;
            arg14[1] = var22 - this.field3749.field1785;
        }
        return var19;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(CIIIZ)V")
    public abstract void method1399(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIILjava/lang/String;II)V")
    public final void method1600(int arg0, int arg1, int arg2, int arg3, String arg4, int arg5, int arg6) {
        field3760++;
        if (arg4 == null) {
            return;
        }
        this.method1597((byte) 92, arg3, arg0);
        int var8 = arg4.length();
        int[] var9 = new int[var8];
        int[] var10 = new int[var8];
        for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = (int) (Math.sin((double) arg5 / 5.0D + (double) var11 / 5.0D) * 5.0D);
            var10[var11] = (int) (Math.sin((double) arg5 / 5.0D + (double) var11 / 3.0D) * 5.0D);
        }
        this.method1588(var9, arg6, -1, (int[]) null, var10, arg1 - (this.field3749.method860(-46, arg4) / 2), arg4, (class176[]) null);
        if (arg2 <= 27) {
            this.method1402('5', -60, 71, -36, false, (class171) null, 53, 92);
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)V")
    public static void method1601(int arg0) {
        field3751 = null;
        if (arg0 != 169) {
            field3755 = null;
        }
        field3755 = null;
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(Lnp;Lqb;)V")
    public class256(class313 arg0, class135 arg1) {
        this.field3749 = arg1;
        this.field3746 = arg0;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Ljava/lang/String;I)V")
    private final void method1602(String arg0, int arg1) {
        try {
            int var3 = -65 / ((arg1 + 45) / 37);
            if (arg0.startsWith("col=")) {
                class187.field2769 = class187.field2769 & 0xFF000000 | class52.method333(16, -21872, arg0.substring(4)) & 0xFFFFFF;
            } else if (arg0.equals("/col")) {
                class187.field2769 = class187.field2769 & 0xFF000000 | class393.field5580 & 0xFFFFFF;
            }
            if (arg0.startsWith("argb=")) {
                class187.field2769 = class52.method333(16, -21872, arg0.substring(5));
            } else if (arg0.equals("/argb")) {
                class187.field2769 = class393.field5580;
            } else if (arg0.startsWith("str=")) {
                class479.field6714 = class52.method333(16, -21872, arg0.substring(4)) | 0xFF000000;
            } else if (arg0.equals("str")) {
                class479.field6714 = -8388608;
            } else if (arg0.equals("/str")) {
                class479.field6714 = -1;
            } else if (arg0.startsWith("u=")) {
                class68.field861 = class52.method333(16, -21872, arg0.substring(2)) | 0xFF000000;
            } else if (arg0.equals("u")) {
                class68.field861 = -16777216;
            } else if (arg0.equals("/u")) {
                class68.field861 = -1;
            } else if (arg0.equalsIgnoreCase("shad=-1")) {
                class85.field1040 = 0;
            } else if (arg0.startsWith("shad=")) {
                class85.field1040 = class52.method333(16, -21872, arg0.substring(5)) | 0xFF000000;
            } else if (arg0.equals("shad")) {
                class85.field1040 = -16777216;
            } else if (arg0.equals("/shad")) {
                class85.field1040 = class327.field4733;
            } else if (arg0.equals("br")) {
                this.method1597((byte) 83, class327.field4733, class393.field5580);
            }
        } catch (Exception var4) {
        }
        field3758++;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIIILjava/util/Random;B[Ltr;Ljava/lang/String;[I)I")
    public final int method1603(int arg0, int arg1, int arg2, int arg3, int arg4, Random arg5, byte arg6, class176[] arg7, String arg8, int[] arg9) {
        field3742++;
        if (arg8 == null) {
            return 0;
        }
        arg5.setSeed((long) arg0);
        int var11 = (arg5.nextInt() & 0x1F) + 192;
        this.method1597((byte) 105, arg4 & 0xFFFFFF | var11 << 24, arg1 & 0xFFFFFF | var11 << 24);
        int var12 = arg8.length();
        int[] var13 = new int[var12];
        int var14 = 0;
        int var15 = 56 % ((64 - arg6) / 36);
        for (int var16 = 0; var16 < var12; var16++) {
            var13[var16] = var14;
            if ((arg5.nextInt() & 0x3) == 0) {
                var14++;
            }
        }
        this.method1588(var13, arg3, -1, arg9, (int[]) null, arg2, arg8, arg7);
        return var14;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lqc;IIIII)V")
    public static final void method1604(class483 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field6802 = 0;
        label58: for (int var6 = arg2; var6 <= arg4; var6++) {
            label56: for (int var7 = arg3; var7 <= arg5; var7++) {
                long var8 = class337.field4910[arg1][var6][var7];
                long var10 = 0L;
                while (true) {
                    label51: while (true) {
                        if (var10 > 48L) {
                            continue label56;
                        }
                        int var12 = (int) (var8 >>> (int) var10 & 0xFFFFL);
                        if (var12 <= 0) {
                            continue label56;
                        }
                        class94 var13 = class478.field6712[var12 - 1];
                        for (int var14 = 0; var14 < arg0.field6802; var14++) {
                            if (arg0.field6799[var14] == var13) {
                                var10 += 16L;
                                continue label51;
                            }
                        }
                        arg0.field6799[arg0.field6802++] = var13;
                        if (arg0.field6802 == 4) {
                            break label58;
                        }
                        var10 += 16L;
                    }
                }
            }
        }
        for (int var15 = arg0.field6802; var15 < 4; var15++) {
            arg0.field6799[var15] = null;
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field3751[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
        field3755 = new class79(77, -1);
        new class326("You can report that person under a different rule.", "Diese Person kann bezüglich einer anderen Regel gemeldet werden.", "Vous pouvez signaler cette personne pour une autre infraction aux règles.", "Você não pode denunciar essa pessoa de acordo com uma regra diferente.");
    }
}
