import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public abstract class class129 {

    @OriginalMember(owner = "client!os", name = "i", descriptor = "Ltj;")
    private class298 field1678;

    @OriginalMember(owner = "client!os", name = "b", descriptor = "Lvn;")
    private class431 field1671;

    @OriginalMember(owner = "client!os", name = "h", descriptor = "I")
    public static int field1677 = -1;

    @OriginalMember(owner = "client!os", name = "o", descriptor = "I")
    public static int field1684 = 1;

    @OriginalMember(owner = "client!os", name = "r", descriptor = "Ljava/lang/String;")
    public static String field1687 = "Loaded input handler";

    @OriginalMember(owner = "client!os", name = "n", descriptor = "[I")
    public static int[] field1683 = new int[50];

    @OriginalMember(owner = "client!os", name = "B", descriptor = "Ljava/lang/String;")
    public static String field1697 = null;

    @OriginalMember(owner = "client!os", name = "a", descriptor = "I")
    public static int field1670;

    @OriginalMember(owner = "client!os", name = "c", descriptor = "I")
    public static int field1672;

    @OriginalMember(owner = "client!os", name = "d", descriptor = "I")
    public static int field1673;

    @OriginalMember(owner = "client!os", name = "e", descriptor = "I")
    public static int field1674;

    @OriginalMember(owner = "client!os", name = "f", descriptor = "I")
    public static int field1675;

    @OriginalMember(owner = "client!os", name = "g", descriptor = "I")
    public static int field1676;

    @OriginalMember(owner = "client!os", name = "j", descriptor = "I")
    public static int field1679;

    @OriginalMember(owner = "client!os", name = "k", descriptor = "I")
    public static int field1680;

    @OriginalMember(owner = "client!os", name = "l", descriptor = "I")
    public static int field1681;

    @OriginalMember(owner = "client!os", name = "m", descriptor = "I")
    public static int field1682;

    @OriginalMember(owner = "client!os", name = "q", descriptor = "I")
    public static int field1686;

    @OriginalMember(owner = "client!os", name = "s", descriptor = "I")
    public static int field1688;

    @OriginalMember(owner = "client!os", name = "t", descriptor = "I")
    public static int field1689;

    @OriginalMember(owner = "client!os", name = "u", descriptor = "I")
    public static int field1690;

    @OriginalMember(owner = "client!os", name = "v", descriptor = "I")
    public static int field1691;

    @OriginalMember(owner = "client!os", name = "w", descriptor = "I")
    public static int field1692;

    @OriginalMember(owner = "client!os", name = "x", descriptor = "I")
    public static int field1693;

    @OriginalMember(owner = "client!os", name = "y", descriptor = "I")
    public static int field1694;

    @OriginalMember(owner = "client!os", name = "z", descriptor = "I")
    public static int field1695;

    @OriginalMember(owner = "client!os", name = "A", descriptor = "I")
    public static int field1696;

    @OriginalMember(owner = "client!os", name = "D", descriptor = "I")
    public static int field1699;

    @OriginalMember(owner = "client!os", name = "p", descriptor = "Lir;")
    public static class185 field1685;

    @OriginalMember(owner = "client!os", name = "C", descriptor = "Lir;")
    public static class185 field1698;

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(I[IIII[Ll;ILjava/lang/String;)V", line = 4)
    public final void method904(int arg0, int[] arg1, int arg2, int arg3, int arg4, class315[] arg5, int arg6, String arg7) {
        int var9 = 16 % ((49 - arg3) / 42);
        field1680++;
        if (arg7 != null) {
            this.method910(-1, arg2, arg4);
            this.method918(arg1, 0, arg5, 0, arg6, (class421) null, arg0, true, arg7);
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IIIIIII)V", line = 25)
    public static final void method905(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class321 var7 = new class321();
        var7.field4777 = arg1 >> 7;
        var7.field4762 = arg2 >> 7;
        var7.field4783 = arg3 >> 7;
        var7.field4764 = arg4 >> 7;
        var7.field4769 = arg0;
        var7.field4766 = arg1;
        var7.field4787 = arg2;
        var7.field4778 = arg3;
        var7.field4774 = arg4;
        var7.field4765 = arg5;
        var7.field4767 = arg6;
        class114.field1489[class199.field2754++] = var7;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(B)V", line = 40)
    public static void method906(byte arg0) {
        field1698 = null;
        field1697 = null;
        field1685 = null;
        if (arg0 != 57) {
            method905(-13, -86, -73, -61, 51, 117, -39);
        }
        field1687 = null;
        field1683 = null;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Ljava/lang/String;ZIIII)V", line = 55)
    public final void method907(String arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        field1681++;
        if (arg0 == null) {
            return;
        }
        this.method910(-1, arg2, arg4);
        this.method918((int[]) null, 0, (class315[]) null, 0, arg3, (class421) null, arg5, true, arg0);
        if (arg1) {
            this.method920(-36, (String) null, -34, -17, -7, 41, -119);
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(I[III[Ll;IBILjava/lang/String;Ljava/util/Random;)I", line = 75)
    public final int method908(int arg0, int[] arg1, int arg2, int arg3, class315[] arg4, int arg5, byte arg6, int arg7, String arg8, Random arg9) {
        field1675++;
        if (arg8 == null) {
            return 0;
        }
        arg9.setSeed((long) arg2);
        int var11 = (arg9.nextInt() & 0x1F) + 192;
        this.method910(-1, arg3 & 0xFFFFFF | var11 << 24, var11 << 24 | arg7 & 0xFFFFFF);
        int var12 = arg8.length();
        int[] var13 = new int[var12];
        int var14 = 0;
        if (arg6 >= -12) {
            return -62;
        }
        for (int var15 = 0; var15 < var12; var15++) {
            var13[var15] = var14;
            if ((arg9.nextInt() & 0x3) == 0) {
                var14++;
            }
        }
        this.method924(arg0, arg4, -17274, (int[]) null, var13, arg8, arg1, arg5);
        return var14;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IIIIIIILjava/lang/String;)V", line = 115)
    public final void method909(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, String arg7) {
        if (arg1 >= -113) {
            this.method916(75, 122, 21, 11, 15, (String) null, (class421) null, -70, -92, 35, (int[]) null, 39, (class315[]) null, -36, 20, 88);
        }
        field1686++;
        if (arg7 == null) {
            return;
        }
        this.method910(-1, arg5, arg4);
        double var9 = 7.0D - ((double) arg2 / 8.0D);
        if (var9 < 0.0D) {
            var9 = 0.0D;
        }
        int var11 = arg7.length();
        int[] var12 = new int[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = (int) (Math.sin((double) var13 / 1.5D + (double) arg0) * var9);
        }
        this.method924(arg6, (class315[]) null, -17274, var12, (int[]) null, arg7, (int[]) null, arg3 - (this.field1671.method2695(-1, arg7) / 2));
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(III)V", line = 149)
    private final void method910(int arg0, int arg1, int arg2) {
        class117.field1525 = -1;
        class144.field1835 = -1;
        if (arg0 == arg1) {
            arg1 = 0;
        }
        class251.field3690 = arg2;
        class386.field5639 = arg2;
        class9.field151 = 0;
        field1694++;
        class133.field1740 = 0;
        class86.field1196 = arg1;
        class139.field1792 = arg1;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(BIIILjava/util/Random;II[II[Ll;IILjava/lang/String;[II)I", line = 166)
    public final int method911(byte arg0, int arg1, int arg2, int arg3, Random arg4, int arg5, int arg6, int[] arg7, int arg8, class315[] arg9, int arg10, int arg11, String arg12, int[] arg13, int arg14) {
        field1673++;
        if (arg12 == null) {
            return 0;
        }
        arg4.setSeed((long) arg11);
        int var16 = (arg4.nextInt() & 0x1F) + 192;
        this.method910(-1, arg14 & 0xFFFFFF | var16 << 24, var16 << 24 | arg6 & 0xFFFFFF);
        int var17 = arg12.length();
        int[] var18 = new int[var17];
        int var19 = 0;
        for (int var20 = 0; var20 < var17; var20++) {
            var18[var20] = var19;
            if ((arg4.nextInt() & 0x3) == 0) {
                var19++;
            }
        }
        int var21 = arg5;
        if (arg0 > -123) {
            return 11;
        }
        int var22 = arg1 + this.field1671.field6255;
        if (arg2 == 1) {
            var22 += (arg10 - this.field1671.field6255 - this.field1671.field6259) / 2;
        } else if (arg2 == 2) {
            var22 = arg1 + arg10 - this.field1671.field6259;
        }
        int var23 = -1;
        if (arg3 == 1) {
            var23 = var19 + this.field1671.method2695(-1, arg12);
            var21 = (arg8 - var23) / 2 + arg5;
        } else if (arg3 == 2) {
            var23 = var19 + this.field1671.method2695(-1, arg12);
            var21 = arg8 + arg5 - var23;
        }
        this.method924(var22, arg9, -17274, (int[]) null, var18, arg12, arg13, var21);
        if (arg7 != null) {
            if (var23 == -1) {
                var23 = this.field1671.method2695(-1, arg12) + var19;
            }
            arg7[2] = var23;
            arg7[1] = var22 - this.field1671.field6255;
            arg7[0] = var21;
            arg7[3] = this.field1671.field6259 + this.field1671.field6255;
        }
        return var19;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IILjava/lang/String;IBII)V", line = 257)
    public final void method912(int arg0, int arg1, String arg2, int arg3, byte arg4, int arg5, int arg6) {
        field1672++;
        if (arg2 == null) {
            return;
        }
        this.method910(-1, arg5, arg0);
        int var8 = arg2.length();
        int[] var9 = new int[var8];
        if (arg4 == 101) {
            for (int var10 = 0; var10 < var8; var10++) {
                var9[var10] = (int) (Math.sin((double) arg1 / 5.0D + (double) var10 / 2.0D) * 5.0D);
            }
            this.method924(arg6, (class315[]) null, -17274, var9, (int[]) null, arg2, (int[]) null, arg3 - (this.field1671.method2695(arg4 ^ 0xFFFFFF9A, arg2) / 2));
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(ILjava/lang/String;I)V", line = 284)
    private final void method913(int arg0, String arg1, int arg2) {
        field1676++;
        int var4 = 0;
        boolean var5 = false;
        if (arg2 > -125) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length(); var6++) {
            char var7 = arg1.charAt(var6);
            if (var7 == '<') {
                var5 = true;
            } else if (var7 == '>') {
                var5 = false;
            } else if (!var5 && var7 == ' ') {
                var4++;
            }
        }
        if (var4 > 0) {
            class133.field1740 = (arg0 - this.field1671.method2695(-1, arg1) << 8) / var4;
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Lro;BI)Lpl;", line = 325)
    public static final class356 method914(class407 arg0, byte arg1, int arg2) {
        field1696++;
        if (arg1 > -112) {
            return null;
        }
        class356 var3;
        if (class277.field4070 == null) {
            var3 = new class356();
        } else {
            var3 = class277.field4070;
            class277.field4070 = class277.field4070.field5275;
            var3.field5275 = null;
            class192.field2678--;
        }
        var3.field5274 = arg0;
        var3.field5267 = arg2;
        return var3;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(II)Ldb;", line = 350)
    public static final class159 method915(int arg0, int arg1) {
        field1688++;
        class51 var2 = class239.field3357;
        class159 var3;
        synchronized (class239.field3357) {
            var3 = (class159) class239.field3357.method378((byte) 28, (long) arg1);
        }
        if (var3 != null) {
            return var3;
        } else if (arg0 <= 125) {
            return null;
        } else {
            byte[] var4 = class123.field1586.method1235(class328.method2154(true, arg1), false, class94.method756(arg1, -111));
            class159 var5 = new class159();
            var5.field2032 = arg1;
            if (var4 != null) {
                var5.method1057(-61, new class341(var4));
            }
            var5.method1072(false);
            if (var5.field2062 != -1) {
                var5.method1063((byte) 94, method915(126, var5.field2070), method915(126, var5.field2062));
            }
            if (var5.field2004 != -1) {
                var5.method1062(method915(126, var5.field2004), (byte) 57, method915(127, var5.field2002));
            }
            if (!class384.field5625 && var5.field2059) {
                var5.field2046 = class280.field4129;
                var5.field2038 = 0;
                var5.field2073 = false;
                var5.field2026 = null;
                var5.field2035 = class254.field3712;
                var5.field2068 = class95.field1282;
            }
            class51 var6 = class239.field3357;
            synchronized (class239.field3357) {
                class239.field3357.method367((long) arg1, var5, true);
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IIIIILjava/lang/String;Lsf;III[II[Ll;III)I", line = 399)
    public final int method916(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5, class421 arg6, int arg7, int arg8, int arg9, int[] arg10, int arg11, class315[] arg12, int arg13, int arg14, int arg15) {
        field1690++;
        if (arg5 == null) {
            return 0;
        }
        this.method910(-1, arg13, arg4);
        if (arg15 == 0) {
            arg15 = this.field1671.field6257;
        }
        int[] var17;
        if (arg2 < (this.field1671.field6259 + arg15 + this.field1671.field6255) && (arg15 + arg15) > arg2) {
            var17 = null;
        } else {
            var17 = new int[] { arg14 };
        }
        int var18 = this.field1671.method2690((byte) 119, var17, arg5, class132.field1732, arg12);
        if (arg11 == 3 && var18 == 1) {
            arg11 = 1;
        }
        int var20;
        if (arg11 == 0) {
            var20 = this.field1671.field6255 + arg7;
        } else if (arg11 == 1) {
            var20 = (arg2 - this.field1671.field6255 - this.field1671.field6259 - (var18 + -1) * arg15) / 2 + this.field1671.field6255 + arg7;
        } else if (arg11 == 2) {
            var20 = arg2 + arg7 - ((var18 - 1) * arg15) - this.field1671.field6259;
        } else {
            int var19 = (arg2 - ((var18 - 1) * arg15) - this.field1671.field6255 - this.field1671.field6259) / (var18 + 1);
            if (var19 < 0) {
                var19 = 0;
            }
            arg15 += var19;
            var20 = arg7 + var19 + this.field1671.field6255;
        }
        for (int var21 = 0; var21 < var18; var21++) {
            if (arg9 == 0) {
                this.method918(arg10, arg8, arg12, arg3, var20, arg6, arg0, true, class132.field1732[var21]);
            } else if (arg9 == 1) {
                this.method918(arg10, arg8, arg12, arg3, var20, arg6, arg0 + (arg14 - this.field1671.method2695(-1, class132.field1732[var21])) / 2, true, class132.field1732[var21]);
            } else if (arg9 == 2) {
                this.method918(arg10, arg8, arg12, arg3, var20, arg6, arg14 + arg0 - this.field1671.method2695(-1, class132.field1732[var21]), true, class132.field1732[var21]);
            } else if (var18 - 1 == var21) {
                this.method918(arg10, arg8, arg12, arg3, var20, arg6, arg0, true, class132.field1732[var21]);
            } else {
                this.method913(arg14, class132.field1732[var21], -128);
                this.method918(arg10, arg8, arg12, arg3, var20, arg6, arg0, true, class132.field1732[var21]);
                class133.field1740 = 0;
            }
            var20 += arg15;
        }
        if (arg1 != 16) {
            field1687 = null;
        }
        return var18;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Ljava/lang/String;II[Ll;I[IBI)V", line = 484)
    public final void method917(String arg0, int arg1, int arg2, class315[] arg3, int arg4, int[] arg5, byte arg6, int arg7) {
        field1692++;
        if (arg0 == null) {
            return;
        }
        this.method910(-1, arg7, arg2);
        if (arg6 <= 87) {
            field1687 = null;
        }
        this.method918(arg5, 0, arg3, 0, arg1, (class421) null, arg4 - this.field1671.method2695(-1, arg0), true, arg0);
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "([II[Ll;IILsf;IZLjava/lang/String;)V", line = 504)
    private final void method918(int[] arg0, int arg1, class315[] arg2, int arg3, int arg4, class421 arg5, int arg6, boolean arg7, String arg8) {
        int var10 = arg4 - this.field1671.field6257;
        field1674++;
        int var11 = -1;
        int var12 = -1;
        if (!arg7) {
            field1677 = 40;
        }
        int var13 = arg8.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class245.method1594(arg8.charAt(var14), true) & 0xFF);
            if (var15 == '<') {
                var11 = var14;
            } else {
                if (var15 == '>' && var11 != -1) {
                    String var16 = arg8.substring(var11 + 1, var14);
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
                                    int var17 = class212.method1392(true, var16.substring(4));
                                    class315 var18 = arg2[var17];
                                    int var19 = arg0 == null ? var18.method207() : arg0[var17];
                                    if ((class386.field5639 & 0xFF000000) == -16777216) {
                                        var18.method211(arg6, var10 + this.field1671.field6257 - var19, 0, 0, 1);
                                    } else {
                                        var18.method211(arg6, this.field1671.field6257 + var10 - var19, 1, class386.field5639 & 0xFF000000 | 0xFFFFFF, 1);
                                    }
                                    arg6 += arg2[var17].method199();
                                    var12 = -1;
                                } catch (Exception var21) {
                                }
                            } else {
                                this.method921((byte) 114, var16);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var11 == -1) {
                    if (var12 != -1) {
                        arg6 += this.field1671.method2692(var12, 0, var15);
                    }
                    if (var15 == ' ') {
                        if (class133.field1740 > 0) {
                            class9.field151 += class133.field1740;
                            arg6 += class9.field151 >> 8;
                            class9.field151 &= 0xFF;
                        }
                    } else if (arg5 == null) {
                        if ((class139.field1792 & 0xFF000000) != 0) {
                            this.method388(var15, arg6 + 1, var10 + 1, class139.field1792, true);
                        }
                        this.method388(var15, arg6, var10, class386.field5639, false);
                    } else {
                        if ((class139.field1792 & 0xFF000000) != 0) {
                            this.method387(var15, arg6 + 1, var10 + 1, class139.field1792, true, arg5, arg3, arg1);
                        }
                        this.method387(var15, arg6, var10, class386.field5639, false, arg5, arg3, arg1);
                    }
                    int var20 = this.field1671.method2693(-67, var15);
                    if (class117.field1525 != -1) {
                        this.field1678.method2016(class117.field1525, arg6, var20, 43, (int) ((double) this.field1671.field6257 * 0.7D) + var10);
                    }
                    if (class144.field1835 != -1) {
                        this.field1678.method2016(class144.field1835, arg6, var20, 97, this.field1671.field6257 + var10 + 1);
                    }
                    arg6 += var20;
                    var12 = var15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(III[S[Ljava/lang/String;)V", line = 657)
    public static final void method919(int arg0, int arg1, int arg2, short[] arg3, String[] arg4) {
        if (arg0 <= 103) {
            return;
        }
        if (arg2 > arg1) {
            int var5 = (arg1 + arg2) / 2;
            int var6 = arg1;
            String var7 = arg4[var5];
            arg4[var5] = arg4[arg2];
            arg4[arg2] = var7;
            short var8 = arg3[var5];
            arg3[var5] = arg3[arg2];
            arg3[arg2] = var8;
            for (int var9 = arg1; var9 < arg2; var9++) {
                if (var7 == null || arg4[var9] != null && arg4[var9].compareTo(var7) < (var9 & 0x1)) {
                    String var10 = arg4[var9];
                    arg4[var9] = arg4[var6];
                    arg4[var6] = var10;
                    short var11 = arg3[var9];
                    arg3[var9] = arg3[var6];
                    arg3[var6++] = var11;
                }
            }
            arg4[arg2] = arg4[var6];
            arg4[var6] = var7;
            arg3[arg2] = arg3[var6];
            arg3[var6] = var8;
            method919(123, arg1, var6 - 1, arg3, arg4);
            method919(105, var6 + 1, arg2, arg3, arg4);
        }
        field1699++;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(ILjava/lang/String;IIIII)V", line = 711)
    public final void method920(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1689++;
        if (arg1 == null) {
            return;
        }
        this.method910(arg6 - 256, arg3, arg5);
        int var8 = arg1.length();
        int[] var9 = new int[var8];
        int[] var10 = new int[var8];
        for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = (int) (Math.sin((double) arg0 / 5.0D + (double) var11 / 5.0D) * 5.0D);
            var10[var11] = (int) (Math.sin((double) arg0 / 5.0D + (double) var11 / 3.0D) * 5.0D);
        }
        if (arg6 != 255) {
            this.field1671 = null;
        }
        this.method924(arg2, (class315[]) null, arg6 ^ 0xFFFFBC79, var10, var9, arg1, (int[]) null, arg4 - (this.field1671.method2695(-1, arg1) / 2));
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(BLjava/lang/String;)V", line = 747)
    private final void method921(byte arg0, String arg1) {
        field1695++;
        try {
            if (arg1.startsWith("col=")) {
                class386.field5639 = class386.field5639 & 0xFF000000 | class124.method883(21, arg1.substring(4), 16) & 0xFFFFFF;
            } else if (arg1.equals("/col")) {
                class386.field5639 = class251.field3690 & 0xFFFFFF | class386.field5639 & 0xFF000000;
            }
            if (arg1.startsWith("argb=")) {
                class386.field5639 = class124.method883(21, arg1.substring(5), 16);
            } else if (arg1.equals("/argb")) {
                class386.field5639 = class251.field3690;
            } else if (arg1.startsWith("str=")) {
                class117.field1525 = class124.method883(21, arg1.substring(4), 16) | 0xFF000000;
            } else if (arg1.equals("str")) {
                class117.field1525 = -8388608;
            } else if (arg1.equals("/str")) {
                class117.field1525 = -1;
            } else if (arg1.startsWith("u=")) {
                class144.field1835 = class124.method883(21, arg1.substring(2), 16) | 0xFF000000;
            } else if (arg1.equals("u")) {
                class144.field1835 = -16777216;
            } else if (arg1.equals("/u")) {
                class144.field1835 = -1;
            } else if (arg1.equalsIgnoreCase("shad=-1")) {
                class139.field1792 = 0;
            } else if (arg1.startsWith("shad=")) {
                class139.field1792 = class124.method883(21, arg1.substring(5), 16) | 0xFF000000;
            } else if (arg1.equals("shad")) {
                class139.field1792 = -16777216;
            } else if (arg1.equals("/shad")) {
                class139.field1792 = class86.field1196;
            } else if (arg1.equals("br")) {
                this.method910(-1, class86.field1196, class251.field3690);
            }
        } catch (Exception var4) {
        }
        int var3 = 107 % ((arg0 + 20) / 39);
    }

    @OriginalMember(owner = "client!os", name = "<init>", descriptor = "(Ltj;Lvn;)V", line = 819)
    public class129(class298 arg0, class431 arg1) {
        this.field1678 = arg0;
        this.field1671 = arg1;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(ILjava/lang/String;IIII)V", line = 828)
    public final void method922(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        field1682++;
        if (arg1 != null) {
            this.method910(-1, arg4, arg0);
            this.method918((int[]) null, 0, (class315[]) null, arg5, arg3, (class421) null, arg2 - this.field1671.method2695(-1, arg1), true, arg1);
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "([I[Ll;IIBIILjava/lang/String;)V", line = 842)
    public final void method923(int[] arg0, class315[] arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, String arg7) {
        field1691++;
        if (arg7 == null) {
            return;
        }
        this.method910(-1, arg2, arg5);
        this.method918(arg0, 0, arg1, 0, arg6, (class421) null, arg3 - (this.field1671.method2695(-1, arg7) / 2), true, arg7);
        if (arg4 <= 29) {
            field1683 = null;
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(I[Ll;I[I[ILjava/lang/String;[II)V", line = 867)
    private final void method924(int arg0, class315[] arg1, int arg2, int[] arg3, int[] arg4, String arg5, int[] arg6, int arg7) {
        int var9 = arg0 - this.field1671.field6257;
        field1679++;
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        int var13 = arg5.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class245.method1594(arg5.charAt(var14), true) & 0xFF);
            if (var15 == '<') {
                var10 = var14;
            } else {
                if (var15 == '>' && var10 != -1) {
                    String var16 = arg5.substring(var10 + 1, var14);
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
                                    if (arg4 == null) {
                                        var17 = 0;
                                    } else {
                                        var17 = arg4[var12];
                                    }
                                    int var18;
                                    if (arg3 == null) {
                                        var18 = 0;
                                    } else {
                                        var18 = arg3[var12];
                                    }
                                    var12++;
                                    int var19 = class212.method1392(true, var16.substring(4));
                                    class315 var20 = arg1[var19];
                                    int var21 = arg6 == null ? var20.method207() : arg6[var19];
                                    var20.method211(arg7 + var17, -var21 + this.field1671.field6257 + var9 + var18, 0, 0, 1);
                                    arg7 += arg1[var19].method199();
                                    var11 = -1;
                                } catch (Exception var25) {
                                }
                            } else {
                                this.method921((byte) -67, var16);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var10 == -1) {
                    if (var11 != -1) {
                        arg7 += this.field1671.method2692(var11, 0, var15);
                    }
                    int var22;
                    if (arg4 == null) {
                        var22 = 0;
                    } else {
                        var22 = arg4[var12];
                    }
                    int var23;
                    if (arg3 == null) {
                        var23 = 0;
                    } else {
                        var23 = arg3[var12];
                    }
                    if (var15 != ' ') {
                        if ((class139.field1792 & 0xFF000000) != 0) {
                            this.method388(var15, arg7 + var22 + 1, var9 + 1 - -var23, class139.field1792, true);
                        }
                        this.method388(var15, arg7 + var22, var9 + var23, class386.field5639, false);
                    } else if (class133.field1740 > 0) {
                        class9.field151 += class133.field1740;
                        arg7 += class9.field151 >> 8;
                        class9.field151 &= 0xFF;
                    }
                    var12++;
                    int var24 = this.field1671.method2693(-122, var15);
                    if (class117.field1525 != -1) {
                        this.field1678.method2016(class117.field1525, arg7, var24, arg2 ^ 0xFFFFBCF1, (int) ((double) this.field1671.field6257 * 0.7D) + var9);
                    }
                    if (class144.field1835 != -1) {
                        this.field1678.method2016(class144.field1835, arg7, var24, 82, this.field1671.field6257 + var9);
                    }
                    var11 = var15;
                    arg7 += var24;
                }
            }
        }
        if (arg2 != -17274) {
            this.field1671 = null;
        }
    }

    @OriginalMember(owner = "client!os", name = "b", descriptor = "(ILjava/lang/String;IIII)V", line = 1029)
    public final void method925(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        field1670++;
        if (arg1 != null) {
            this.method910(-1, arg0, arg3);
            if (arg4 == -22978) {
                this.method918((int[]) null, 0, (class315[]) null, 0, arg5, (class421) null, arg2 - (this.field1671.method2695(-1, arg1) / 2), true, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(CIIIZ)V")
    public abstract void method388(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(CIIIZLsf;II)V")
    public abstract void method387(char arg0, int arg1, int arg2, int arg3, boolean arg4, class421 arg5, int arg6, int arg7);
}
