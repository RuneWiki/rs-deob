import java.util.Hashtable;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public abstract class class91 {

    @OriginalMember(owner = "client!ra", name = "q", descriptor = "Lpu;")
    private class483 field1419;

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "Lqa;")
    private class207 field1404;

    @OriginalMember(owner = "client!ra", name = "s", descriptor = "Ldm;")
    public static class46 field1421 = new class46();

    @OriginalMember(owner = "client!ra", name = "w", descriptor = "[I")
    public static int[] field1425;

    @OriginalMember(owner = "client!ra", name = "v", descriptor = "Ljava/util/Hashtable;")
    public static Hashtable field1424;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "I")
    public static int field1403;

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "I")
    public static int field1405;

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "I")
    public static int field1406;

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "I")
    public static int field1407;

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "I")
    public static int field1408;

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "I")
    public static int field1409;

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "I")
    public static int field1410;

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "I")
    public static int field1411;

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "I")
    public static int field1412;

    @OriginalMember(owner = "client!ra", name = "k", descriptor = "I")
    public static int field1413;

    @OriginalMember(owner = "client!ra", name = "l", descriptor = "I")
    public static int field1414;

    @OriginalMember(owner = "client!ra", name = "m", descriptor = "I")
    public static int field1415;

    @OriginalMember(owner = "client!ra", name = "n", descriptor = "I")
    public static int field1416;

    @OriginalMember(owner = "client!ra", name = "o", descriptor = "I")
    public static int field1417;

    @OriginalMember(owner = "client!ra", name = "p", descriptor = "I")
    public static int field1418;

    @OriginalMember(owner = "client!ra", name = "r", descriptor = "I")
    public static int field1420;

    @OriginalMember(owner = "client!ra", name = "t", descriptor = "I")
    public static int field1422;

    @OriginalMember(owner = "client!ra", name = "u", descriptor = "I")
    public static int field1423;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "([II[III[Lha;ILjava/util/Random;IIIIIILjava/lang/String;)I")
    public final int method657(int[] arg0, int arg1, int[] arg2, int arg3, int arg4, class52[] arg5, int arg6, Random arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, String arg14) {
        field1403++;
        if (arg14 == null) {
            return 0;
        }
        arg7.setSeed((long) arg10);
        int var16 = (arg7.nextInt() & 0x1F) + 192;
        this.method676(arg13 & 0xFFFFFF | var16 << 24, false, arg12 & 0xFFFFFF | var16 << 24);
        int var17 = arg14.length();
        int[] var18 = new int[var17];
        int var19 = 0;
        for (int var20 = 0; var20 < var17; var20++) {
            var18[var20] = var19;
            if ((arg7.nextInt() & 0x3) == 0) {
                var19++;
            }
        }
        if (arg1 <= 89) {
            this.field1404 = null;
        }
        int var21 = arg6;
        int var22 = this.field1419.field6799 + arg3;
        int var23 = -1;
        if (arg11 == 1) {
            var22 += (arg4 - this.field1419.field6799 - this.field1419.field6813) / 2;
        } else if (arg11 == 2) {
            var22 = arg3 + arg4 - this.field1419.field6813;
        }
        if (arg9 == 1) {
            var23 = var19 + this.field1419.method2810(arg14, (byte) 124);
            var21 = (arg8 - var23) / 2 + arg6;
        } else if (arg9 == 2) {
            var23 = this.field1419.method2810(arg14, (byte) 124) + var19;
            var21 = arg8 + arg6 - var23;
        }
        this.method659(arg5, var22, var21, null, arg14, var18, arg2, -13450);
        if (arg0 != null) {
            if (var23 == -1) {
                var23 = var19 + this.field1419.method2810(arg14, (byte) 124);
            }
            arg0[2] = var23;
            arg0[1] = var22 - this.field1419.field6799;
            arg0[0] = var21;
            arg0[3] = this.field1419.field6813 + this.field1419.field6799;
        }
        return var19;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "([Lha;I[ILjava/lang/String;IILpa;II)V")
    private final void method658(class52[] arg0, int arg1, int[] arg2, String arg3, int arg4, int arg5, class310 arg6, int arg7, int arg8) {
        int var10 = arg7 - this.field1419.field6803;
        field1416++;
        int var11 = -1;
        int var12 = -1;
        if (arg5 != -10692) {
            this.method666(-114, -105, -89, -51, null, 68);
        }
        int var13 = arg3.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class228.method1452(arg3.charAt(var14), (byte) -126) & 0xFF);
            if (var15 == '<') {
                var11 = var14;
            } else {
                if (var15 == '>' && var11 != -1) {
                    String var16 = arg3.substring(var11 + 1, var14);
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
                                    int var17 = class547.method3122(var16.substring(4), arg5 + 10566);
                                    class52 var18 = arg0[var17];
                                    int var19 = arg2 == null ? var18.method432() : arg2[var17];
                                    if ((class61.field1076 & 0xFF000000) == -16777216) {
                                        var18.method421(arg1, this.field1419.field6803 + var10 - var19, 1, 0, 1);
                                    } else {
                                        var18.method421(arg1, var10 + this.field1419.field6803 - var19, 0, class61.field1076 & 0xFF000000 | 0xFFFFFF, 1);
                                    }
                                    var12 = -1;
                                    arg1 += arg0[var17].method419();
                                } catch (Exception var21) {
                                }
                            } else {
                                this.method675(var16, true);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var11 == -1) {
                    if (var12 != -1) {
                        arg1 += this.field1419.method2817((byte) -114, var12, var15);
                    }
                    if (var15 == ' ') {
                        if (class214.field3046 > 0) {
                            class398.field5686 += class214.field3046;
                            arg1 += class398.field5686 >> 8;
                            class398.field5686 &= 0xFF;
                        }
                    } else if (arg6 == null) {
                        if ((class301.field4118 & 0xFF000000) != 0) {
                            this.method669(var15, arg1 + 1, var10 + 1, class301.field4118, true);
                        }
                        this.method669(var15, arg1, var10, class61.field1076, false);
                    } else {
                        if ((class301.field4118 & 0xFF000000) != 0) {
                            this.method672(var15, arg1 + 1, var10 + 1, class301.field4118, true, arg6, arg8, arg4);
                        }
                        this.method672(var15, arg1, var10, class61.field1076, false, arg6, arg8, arg4);
                    }
                    int var20 = this.field1419.method2818(var15, arg5 ^ 0xFFFFD63C);
                    if (class96.field1463 != -1) {
                        this.field1404.method1316(class96.field1463, var20, arg5 + 10692, (int) ((double) this.field1419.field6803 * 0.7D) + var10, arg1);
                    }
                    if (class223.field3182 != -1) {
                        this.field1404.method1316(class223.field3182, var20, 0, this.field1419.field6803 + var10 + 1, arg1);
                    }
                    var12 = var15;
                    arg1 += var20;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "([Lha;II[ILjava/lang/String;[I[II)V")
    private final void method659(class52[] arg0, int arg1, int arg2, int[] arg3, String arg4, int[] arg5, int[] arg6, int arg7) {
        int var9 = arg1 - this.field1419.field6803;
        field1409++;
        int var10 = -1;
        if (arg7 != -13450) {
            return;
        }
        int var11 = -1;
        int var12 = 0;
        int var13 = arg4.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class228.method1452(arg4.charAt(var14), (byte) -126) & 0xFF);
            if (var15 == '<') {
                var10 = var14;
            } else {
                if (var15 == '>' && var10 != -1) {
                    String var16 = arg4.substring(var10 + 1, var14);
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
                                    int var19 = class547.method3122(var16.substring(4), arg7 + 13323);
                                    class52 var20 = arg0[var19];
                                    int var21 = arg6 == null ? var20.method432() : arg6[var19];
                                    var20.method421(arg2 + var17, -var21 + var9 - (-this.field1419.field6803 + -var18), 1, 0, 1);
                                    arg2 += arg0[var19].method419();
                                    var11 = -1;
                                } catch (Exception var25) {
                                }
                            } else {
                                this.method675(var16, true);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var10 == -1) {
                    if (var11 != -1) {
                        arg2 += this.field1419.method2817((byte) -97, var11, var15);
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
                        if ((class301.field4118 & 0xFF000000) != 0) {
                            this.method669(var15, arg2 - (-var22 - 1), var9 - (-var23 + -1), class301.field4118, true);
                        }
                        this.method669(var15, arg2 + var22, var9 + var23, class61.field1076, false);
                    } else if (class214.field3046 > 0) {
                        class398.field5686 += class214.field3046;
                        arg2 += class398.field5686 >> 8;
                        class398.field5686 &= 0xFF;
                    }
                    var12++;
                    int var24 = this.field1419.method2818(var15, 0);
                    if (class96.field1463 != -1) {
                        this.field1404.method1316(class96.field1463, var24, 0, (int) ((double) this.field1419.field6803 * 0.7D) + var9, arg2);
                    }
                    if (class223.field3182 != -1) {
                        this.field1404.method1316(class223.field3182, var24, 0, this.field1419.field6803 + var9, arg2);
                    }
                    arg2 += var24;
                    var11 = var15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIIILjava/lang/String;I)V")
    public final void method660(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5, int arg6) {
        field1423++;
        if (arg5 == null) {
            return;
        }
        this.method676(arg3, false, arg4);
        int var8 = arg5.length();
        int[] var9 = new int[var8];
        int[] var10 = new int[var8];
        if (arg1 != 60) {
            this.method674(75, 82, (byte) -75, -30, -23, null);
        }
        for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = (int) (Math.sin((double) arg2 / 5.0D + (double) var11 / 5.0D) * 5.0D);
            var10[var11] = (int) (Math.sin((double) arg2 / 5.0D + (double) var11 / 3.0D) * 5.0D);
        }
        this.method659(null, arg0, arg6 - (this.field1419.method2810(arg5, (byte) 124) / 2), var10, arg5, var9, null, -13450);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ljava/lang/String;IB)V")
    private final void method661(String arg0, int arg1, byte arg2) {
        field1405++;
        int var4 = 0;
        boolean var5 = false;
        for (int var6 = 0; arg0.length() > var6; var6++) {
            char var7 = arg0.charAt(var6);
            if (var7 == '<') {
                var5 = true;
            } else if (var7 == '>') {
                var5 = false;
            } else if (!var5 && var7 == ' ') {
                var4++;
            }
        }
        if (arg2 != 23) {
            this.method673(87, 122, -71, -61, -117, -89, null, -68, null, null, 40, -98, -49, -113, -21, null);
        }
        if (var4 > 0) {
            class214.field3046 = (arg1 - this.field1419.method2810(arg0, (byte) 124) << 8) / var4;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIILjava/lang/String;II)V")
    public final void method662(int arg0, int arg1, int arg2, int arg3, String arg4, int arg5, int arg6) {
        field1415++;
        if (arg4 == null) {
            return;
        }
        this.method676(arg1, false, arg6);
        int var8 = arg4.length();
        if (arg2 != -1) {
            method665((byte) -123);
        }
        int[] var9 = new int[var8];
        for (int var10 = 0; var10 < var8; var10++) {
            var9[var10] = (int) (Math.sin((double) arg3 / 5.0D + (double) var10 / 2.0D) * 5.0D);
        }
        this.method659(null, arg0, arg5 - (this.field1419.method2810(arg4, (byte) 124) / 2), var9, arg4, null, null, -13450);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIILjava/lang/String;II)V")
    public final void method663(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5) {
        int var7 = -36 % ((arg0 - 19) / 61);
        field1408++;
        if (arg3 != null) {
            this.method676(arg5, false, arg1);
            this.method658(null, arg2, null, arg3, 0, -10692, null, arg4, 0);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V")
    public static void method664(int arg0) {
        field1424 = null;
        field1425 = null;
        field1421 = null;
        if (arg0 != 2) {
            field1424 = null;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)V")
    public static final void method665(byte arg0) {
        if (class69.field1165.method1369()) {
            class69.field1165.method1262(class166.field2390);
            class390.method2350(6);
            class69.field1165.method1260(class166.field2390);
            class69.field1165.method1343(class166.field2390);
        } else {
            class452.method2658(7, class103.field1570);
        }
        field1413++;
        if (arg0 < 62) {
            method664(-31);
        }
        class40.method413(-101);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIILjava/lang/String;I)V")
    public final void method666(int arg0, int arg1, int arg2, int arg3, String arg4, int arg5) {
        field1410++;
        if (arg4 != null) {
            this.method676(arg1, false, arg5);
            int var7 = -94 / ((arg3 + 12) / 34);
            this.method658(null, arg2 - (this.field1419.method2810(arg4, (byte) 124) / 2), null, arg4, 0, -10692, null, arg0, 0);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IZLjava/lang/String;[III[Lha;I)V")
    public final void method667(int arg0, boolean arg1, String arg2, int[] arg3, int arg4, int arg5, class52[] arg6, int arg7) {
        field1407++;
        if (arg2 != null) {
            this.method676(arg0, arg1, arg5);
            this.method658(arg6, arg7, arg3, arg2, 0, -10692, null, arg4, 0);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IILjava/lang/String;IBIII)V")
    public final void method668(int arg0, int arg1, String arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        field1422++;
        int var9 = -42 % ((arg4 - 76) / 50);
        if (arg2 == null) {
            return;
        }
        this.method676(arg0, false, arg5);
        double var10 = 7.0D - ((double) arg6 / 8.0D);
        if (var10 < 0.0D) {
            var10 = 0.0D;
        }
        int var12 = arg2.length();
        int[] var13 = new int[var12];
        for (int var14 = 0; var14 < var12; var14++) {
            var13[var14] = (int) (Math.sin((double) var14 / 1.5D + (double) arg1) * var10);
        }
        this.method659(null, arg7, arg3 - (this.field1419.method2810(arg2, (byte) 124) / 2), var13, arg2, null, null, -13450);
    }

    @OriginalMember(owner = "client!ra", name = "HA", descriptor = "(CIIIZ)V")
    public abstract void method669(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "([Lha;I[IIIIILpa;IIIILjava/lang/String;IIII)I")
    public final int method670(class52[] arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, class310 arg7, int arg8, int arg9, int arg10, int arg11, String arg12, int arg13, int arg14, int arg15, int arg16) {
        field1418++;
        if (arg12 == null) {
            return 0;
        }
        this.method676(arg5, false, arg1);
        if (arg13 == 0) {
            arg13 = this.field1419.field6803;
        }
        int[] var18;
        if (arg6 < (this.field1419.field6799 + this.field1419.field6813 + arg13) && (arg13 + arg13) > arg6) {
            var18 = null;
        } else {
            var18 = new int[] { arg8 };
        }
        int var19 = this.field1419.method2821(class568.field7840, arg0, -1, arg12, var18);
        if (arg11 == -1) {
            arg11 = arg6 / arg13;
            if (arg11 <= 0) {
                arg11 = 1;
            }
        }
        if (arg11 > 0 && var19 >= arg11) {
            class568.field7840[arg11 - 1] = this.field1419.method2815(class568.field7840[arg11 - 1], arg8, arg0, -1);
            var19 = arg11;
        }
        int var20 = 103 % ((-arg4 - 3) / 57);
        if (arg16 == 3 && var19 == 1) {
            arg16 = 1;
        }
        int var21;
        if (arg16 == 0) {
            var21 = arg14 + this.field1419.field6799;
        } else if (arg16 == 1) {
            var21 = (arg6 - this.field1419.field6799 - this.field1419.field6813 - ((var19 + -1) * arg13)) / 2 + arg14 + this.field1419.field6799;
        } else if (arg16 == 2) {
            var21 = arg6 + arg14 - this.field1419.field6813 - ((var19 + -1) * arg13);
        } else {
            int var22 = (arg6 - this.field1419.field6799 - this.field1419.field6813 - ((var19 + -1) * arg13)) / (var19 + 1);
            if (var22 < 0) {
                var22 = 0;
            }
            arg13 += var22;
            var21 = arg14 + var22 + this.field1419.field6799;
        }
        for (int var23 = 0; var23 < var19; var23++) {
            if (arg10 == 0) {
                this.method658(arg0, arg3, arg2, class568.field7840[var23], arg9, -10692, arg7, var21, arg15);
            } else if (arg10 == 1) {
                this.method658(arg0, arg3 + (arg8 - this.field1419.method2810(class568.field7840[var23], (byte) 124)) / 2, arg2, class568.field7840[var23], arg9, -10692, arg7, var21, arg15);
            } else if (arg10 == 2) {
                this.method658(arg0, arg3 + arg8 - this.field1419.method2810(class568.field7840[var23], (byte) 124), arg2, class568.field7840[var23], arg9, -10692, arg7, var21, arg15);
            } else if ((var19 - 1) == var23) {
                this.method658(arg0, arg3, arg2, class568.field7840[var23], arg9, -10692, arg7, var21, arg15);
            } else {
                this.method661(class568.field7840[var23], arg8, (byte) 23);
                this.method658(arg0, arg3, arg2, class568.field7840[var23], arg9, -10692, arg7, var21, arg15);
                class214.field3046 = 0;
            }
            var21 += arg13;
        }
        return var19;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "([IIILjava/lang/String;ILjava/util/Random;[Lha;III)I")
    public final int method671(int[] arg0, int arg1, int arg2, String arg3, int arg4, Random arg5, class52[] arg6, int arg7, int arg8, int arg9) {
        field1412++;
        if (arg3 == null) {
            return 0;
        }
        arg5.setSeed((long) arg1);
        int var11 = (arg5.nextInt() & 0x1F) + 192;
        this.method676(var11 << 24 | arg8 & 0xFFFFFF, false, arg4 & 0xFFFFFF | var11 << 24);
        int var12 = arg3.length();
        int[] var13 = new int[var12];
        int var14 = 0;
        for (int var15 = 0; var15 < var12; var15++) {
            var13[var15] = var14;
            if ((arg5.nextInt() & 0x3) == 0) {
                var14++;
            }
        }
        this.method659(arg6, arg9, arg2, null, arg3, var13, arg0, arg7 - 13452);
        if (arg7 != 2) {
            field1424 = null;
        }
        return var14;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(CIIIZLpa;II)V")
    public abstract void method672(char arg0, int arg1, int arg2, int arg3, boolean arg4, class310 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIIIILjava/lang/String;ILpa;[Lha;IIIII[I)I")
    public final int method673(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, String arg6, int arg7, class310 arg8, class52[] arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int[] arg15) {
        if (arg0 != -1) {
            field1424 = null;
        }
        field1417++;
        return this.method670(arg9, arg14, arg15, arg11, -107, arg2, arg12, arg8, arg13, arg5, arg1, 0, arg6, arg4, arg3, arg7, arg10);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIBIILjava/lang/String;)V")
    public final void method674(int arg0, int arg1, byte arg2, int arg3, int arg4, String arg5) {
        field1406++;
        int var7 = 102 / ((-arg2 - 7) / 54);
        if (arg5 != null) {
            this.method676(arg1, false, arg3);
            this.method658(null, arg0 - this.field1419.method2810(arg5, (byte) 124), null, arg5, 0, -10692, null, arg4, 0);
        }
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Lqa;Lpu;)V")
    public class91(class207 arg0, class483 arg1) {
        this.field1419 = arg1;
        this.field1404 = arg0;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ljava/lang/String;Z)V")
    private final void method675(String arg0, boolean arg1) {
        field1420++;
        try {
            if (arg0.startsWith("col=")) {
                class61.field1076 = class61.field1076 & 0xFF000000 | class246.method1519(16, arg0.substring(4), true) & 0xFFFFFF;
            } else if (arg0.equals("/col")) {
                class61.field1076 = class346.field4655 & 0xFFFFFF | class61.field1076 & 0xFF000000;
            }
            if (arg0.startsWith("argb=")) {
                class61.field1076 = class246.method1519(16, arg0.substring(5), true);
            } else if (arg0.equals("/argb")) {
                class61.field1076 = class346.field4655;
            } else if (arg0.startsWith("str=")) {
                class96.field1463 = class61.field1076 & 0xFF000000 | class246.method1519(16, arg0.substring(4), true);
            } else if (arg0.equals("str")) {
                class96.field1463 = class61.field1076 & 0xFF000000 | 0x800000;
            } else if (arg0.equals("/str")) {
                class96.field1463 = -1;
            } else if (arg0.startsWith("u=")) {
                class223.field3182 = class61.field1076 & 0xFF000000 | class246.method1519(16, arg0.substring(2), true);
            } else if (arg0.equals("u")) {
                class223.field3182 = class61.field1076 & 0xFF000000;
            } else if (arg0.equals("/u")) {
                class223.field3182 = -1;
            } else if (arg0.equalsIgnoreCase("shad=-1")) {
                class301.field4118 = 0;
            } else if (arg0.startsWith("shad=")) {
                class301.field4118 = class61.field1076 & 0xFF000000 | class246.method1519(16, arg0.substring(5), true);
            } else if (arg0.equals("shad")) {
                class301.field4118 = class61.field1076 & 0xFF000000;
            } else if (arg0.equals("/shad")) {
                class301.field4118 = class314.field4236;
            } else if (arg0.equals("br")) {
                this.method676(class346.field4655, !arg1, class314.field4236);
            }
            if (!arg1) {
                this.method657(null, -37, null, 21, -11, null, 1, null, 119, -121, 87, 10, 43, -40, null);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IZI)V")
    private final void method676(int arg0, boolean arg1, int arg2) {
        if (arg2 == -1) {
            arg2 = 0;
        }
        if (arg1) {
            return;
        }
        class96.field1463 = -1;
        class223.field3182 = -1;
        class346.field4655 = arg0;
        class61.field1076 = arg0;
        class214.field3046 = 0;
        field1411++;
        class398.field5686 = 0;
        class314.field4236 = arg2;
        class301.field4118 = arg2;
    }

    static {
        new class104("You cannot send a quick chat message to a player on this world at this time.", "Einem Spieler auf dieser Welt können derzeit keine Direktchat-Nachrichten", "Impossible d'envoyer un message rapide à un joueur de ce serveur à l'heure actuelle.", "Você não pode enviar uma mensagem de papo rápido para um jogador neste mundo neste momento.");
        field1425 = new int[] { 1, 2, 4, 8 };
        field1424 = new Hashtable();
    }
}
