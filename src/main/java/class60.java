import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public abstract class class60 {

    @OriginalMember(owner = "client!da", name = "v", descriptor = "Lrc;")
    private class539 field747;

    @OriginalMember(owner = "client!da", name = "j", descriptor = "Lha;")
    private class59 field735;

    @OriginalMember(owner = "client!da", name = "r", descriptor = "Lkaa;")
    public static class47 field743 = new class47(56, -1);

    @OriginalMember(owner = "client!da", name = "y", descriptor = "Lhda;")
    public static class752 field750 = new class752(22, -2);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "I")
    public static int field726;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "I")
    public static int field727;

    @OriginalMember(owner = "client!da", name = "c", descriptor = "I")
    public static int field728;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "I")
    public static int field729;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "I")
    public static int field730;

    @OriginalMember(owner = "client!da", name = "f", descriptor = "I")
    public static int field731;

    @OriginalMember(owner = "client!da", name = "g", descriptor = "I")
    public static int field732;

    @OriginalMember(owner = "client!da", name = "h", descriptor = "I")
    public static int field733;

    @OriginalMember(owner = "client!da", name = "i", descriptor = "I")
    public static int field734;

    @OriginalMember(owner = "client!da", name = "k", descriptor = "I")
    public static int field736;

    @OriginalMember(owner = "client!da", name = "l", descriptor = "I")
    public static int field737;

    @OriginalMember(owner = "client!da", name = "m", descriptor = "I")
    public static int field738;

    @OriginalMember(owner = "client!da", name = "n", descriptor = "I")
    public static int field739;

    @OriginalMember(owner = "client!da", name = "o", descriptor = "I")
    public static int field740;

    @OriginalMember(owner = "client!da", name = "p", descriptor = "I")
    public static int field741;

    @OriginalMember(owner = "client!da", name = "q", descriptor = "I")
    public static int field742;

    @OriginalMember(owner = "client!da", name = "s", descriptor = "I")
    public static int field744;

    @OriginalMember(owner = "client!da", name = "t", descriptor = "I")
    public static int field745;

    @OriginalMember(owner = "client!da", name = "u", descriptor = "I")
    public static int field746;

    @OriginalMember(owner = "client!da", name = "w", descriptor = "I")
    public static int field748;

    @OriginalMember(owner = "client!da", name = "x", descriptor = "I")
    public static int field749;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IILjava/lang/String;III)V", line = 7)
    public final void method513(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5) {
        field734++;
        if (arg2 != null) {
            this.method523(arg4, arg5, 115);
            this.method525(arg3, true, 0, 0, arg2, arg0 - (this.field747.method3001(-1, arg2) / 2), null, null, null);
            int var7 = 63 % ((-arg1 - 45) / 43);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IILjava/lang/String;ZIII)V", line = 22)
    public final void method514(int arg0, int arg1, String arg2, boolean arg3, int arg4, int arg5, int arg6) {
        field738++;
        if (arg2 == null || arg3) {
            return;
        }
        this.method523(arg6, arg4, 27);
        int var8 = arg2.length();
        int[] var9 = new int[var8];
        for (int var10 = 0; var10 < var8; var10++) {
            var9[var10] = (int) (Math.sin((double) arg0 / 5.0D + (double) var10 / 2.0D) * 5.0D);
        }
        this.method517(arg1 - (this.field747.method3001(-1, arg2) / 2), var9, arg5, null, arg2, 19792, null, null);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([II[Lhu;Ljava/lang/String;IIIBLjava/util/Random;I)I", line = 48)
    public final int method515(int[] arg0, int arg1, class133[] arg2, String arg3, int arg4, int arg5, int arg6, byte arg7, Random arg8, int arg9) {
        field749++;
        if (arg3 == null) {
            return 0;
        }
        arg8.setSeed((long) arg6);
        if (arg7 != -115) {
            return 101;
        }
        int var11 = (arg8.nextInt() & 0x1F) + 192;
        this.method523(arg4 & 0xFFFFFF | var11 << 24, var11 << 24 | arg9 & 0xFFFFFF, 69);
        int var12 = arg3.length();
        int[] var13 = new int[var12];
        int var14 = 0;
        for (int var15 = 0; var15 < var12; var15++) {
            var13[var15] = var14;
            if ((arg8.nextInt() & 0x3) == 0) {
                var14++;
            }
        }
        this.method517(arg1, null, arg5, arg0, arg3, 19792, arg2, var13);
        return var14;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([ILjava/util/Random;I[Lhu;[IIIIILjava/lang/String;IIIII)I", line = 89)
    public final int method516(int[] arg0, Random arg1, int arg2, class133[] arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, String arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        field746++;
        if (arg9 == null) {
            return 0;
        }
        arg1.setSeed((long) arg7);
        int var16 = (arg1.nextInt() & 0x1F) + 192;
        this.method523(arg6 & 0xFFFFFF | var16 << 24, arg13 & 0xFFFFFF | var16 << 24, 124);
        int var17 = arg9.length();
        int[] var18 = new int[var17];
        int var19 = 0;
        for (int var20 = 0; var20 < var17; var20++) {
            var18[var20] = var19;
            if ((arg1.nextInt() & 0x3) == 0) {
                var19++;
            }
        }
        int var21 = arg2;
        int var22 = this.field747.field7147 + arg10;
        if (arg8 == 1) {
            var22 += (arg5 - this.field747.field7147 - this.field747.field7145) / 2;
        } else if (arg8 == 2) {
            var22 = arg5 + arg10 - this.field747.field7145;
        }
        int var23 = -1;
        if (arg14 == 1) {
            var23 = this.field747.method3001(-1, arg9) + var19;
            var21 = (arg12 - var23) / 2 + arg2;
        } else if (arg14 == 2) {
            var23 = this.field747.method3001(arg11 - 31521, arg9) + var19;
            var21 = arg12 + arg2 - var23;
        }
        this.method517(var21, null, var22, arg0, arg9, arg11 - 11728, arg3, var18);
        if (arg4 != null) {
            if (var23 == -1) {
                var23 = this.field747.method3001(arg11 ^ 0xFFFF84DF, arg9) + var19;
            }
            arg4[0] = var21;
            arg4[2] = var23;
            arg4[1] = var22 - this.field747.field7147;
            arg4[3] = this.field747.field7147 + this.field747.field7145;
        }
        if (arg11 == 31520) {
            return var19;
        } else {
            return 48;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I[II[ILjava/lang/String;I[Lhu;[I)V", line = 164)
    private final void method517(int arg0, int[] arg1, int arg2, int[] arg3, String arg4, int arg5, class133[] arg6, int[] arg7) {
        field748++;
        int var9 = arg2 - this.field747.field7142;
        int var10 = -1;
        int var11 = -1;
        if (arg5 != 19792) {
            this.field735 = null;
        }
        int var12 = 0;
        int var13 = arg4.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class295.method1826(122, arg4.charAt(var14)) & 0xFF);
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
                                    if (arg7 == null) {
                                        var17 = 0;
                                    } else {
                                        var17 = arg7[var12];
                                    }
                                    int var18;
                                    if (arg1 == null) {
                                        var18 = 0;
                                    } else {
                                        var18 = arg1[var12];
                                    }
                                    var12++;
                                    int var19 = class397.method2337((byte) -123, var16.substring(4));
                                    class133 var20 = arg6[var19];
                                    int var21 = arg3 == null ? var20.method1048() : arg3[var19];
                                    var20.method1045(arg0 + var17, this.field747.field7142 + var18 + var9 + -var21, 1, 0, 1);
                                    arg0 += arg6[var19].method1036();
                                    var11 = -1;
                                } catch (Exception var25) {
                                }
                            } else {
                                this.method531(var16, 5);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var10 == -1) {
                    if (var11 != -1) {
                        arg0 += this.field747.method3000(var11, 0, var15);
                    }
                    int var22;
                    if (arg7 == null) {
                        var22 = 0;
                    } else {
                        var22 = arg7[var12];
                    }
                    int var23;
                    if (arg1 == null) {
                        var23 = 0;
                    } else {
                        var23 = arg1[var12];
                    }
                    var12++;
                    if (var15 != ' ') {
                        if ((class2.field35 & 0xFF000000) != 0) {
                            this.method118(var15, var22 + arg0 + 1, var9 + 1 + var23, class2.field35, true);
                        }
                        this.method118(var15, arg0 + var22, var9 + var23, class272.field3789, false);
                    } else if (class428.field5912 > 0) {
                        class483.field6608 += class428.field5912;
                        arg0 += class483.field6608 >> 8;
                        class483.field6608 &= 0xFF;
                    }
                    int var24 = this.field747.method3008(-100, var15);
                    if (class399.field5568 != -1) {
                        this.field735.method467(70, (int) ((double) this.field747.field7142 * 0.7D) + var9, var24, arg0, class399.field5568);
                    }
                    if (class495.field6677 != -1) {
                        this.field735.method467(-115, this.field747.field7142 + var9, var24, arg0, class495.field6677);
                    }
                    arg0 += var24;
                    var11 = var15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I[Lhu;IIIIII[IIILaa;IIIILjava/lang/String;)I", line = 332)
    public final int method518(int arg0, class133[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, int arg9, int arg10, class490 arg11, int arg12, int arg13, int arg14, int arg15, String arg16) {
        field736++;
        if (arg16 == null) {
            return 0;
        }
        this.method523(arg13, arg5, 114);
        if (arg15 == 0) {
            arg15 = this.field747.field7142;
        }
        int[] var18;
        if (arg7 < this.field747.field7145 + arg15 + this.field747.field7147 && arg15 + arg15 > arg7) {
            var18 = null;
        } else {
            var18 = new int[] { arg9 };
        }
        if (arg0 == -1) {
            arg0 = arg7 / arg15;
            if (arg0 <= 0) {
                arg0 = 1;
            }
        }
        int var19 = this.field747.method3006(arg16, 174, var18, class290.field4146, arg1);
        if (arg0 > 0 && var19 >= arg0) {
            var19 = arg0;
            class290.field4146[arg0 - 1] = this.field747.method3005(arg1, class290.field4146[arg0 - 1], 0, arg9);
        }
        if (arg2 == 3 && var19 == 1) {
            arg2 = 1;
        }
        int var20;
        if (arg2 == 0) {
            var20 = arg4 + this.field747.field7147;
        } else if (arg2 == 1) {
            var20 = arg4 + this.field747.field7147 + ((arg7 - (var19 + -1) * arg15 + -this.field747.field7147 + -this.field747.field7145) / 2);
        } else if (arg2 == 2) {
            var20 = arg4 + arg7 - this.field747.field7145 - ((var19 + -1) * arg15);
        } else {
            int var21 = (arg7 - this.field747.field7147 - this.field747.field7145 - ((var19 + -1) * arg15)) / (var19 + 1);
            if (var21 < 0) {
                var21 = 0;
            }
            var20 = this.field747.field7147 + arg4 + var21;
            arg15 += var21;
        }
        int var22 = 64 % ((arg14 + 58) / 33);
        for (int var23 = 0; var23 < var19; var23++) {
            if (arg3 == 0) {
                this.method525(var20, true, arg12, arg10, class290.field4146[var23], arg6, arg1, arg8, arg11);
            } else if (arg3 == 1) {
                this.method525(var20, true, arg12, arg10, class290.field4146[var23], arg6 + (arg9 - this.field747.method3001(-1, class290.field4146[var23])) / 2, arg1, arg8, arg11);
            } else if (arg3 == 2) {
                this.method525(var20, true, arg12, arg10, class290.field4146[var23], arg6 - (this.field747.method3001(-1, class290.field4146[var23]) - arg9), arg1, arg8, arg11);
            } else if ((var19 - 1) == var23) {
                this.method525(var20, true, arg12, arg10, class290.field4146[var23], arg6, arg1, arg8, arg11);
            } else {
                this.method522(arg9, (byte) 126, class290.field4146[var23]);
                this.method525(var20, true, arg12, arg10, class290.field4146[var23], arg6, arg1, arg8, arg11);
                class428.field5912 = 0;
            }
            var20 += arg15;
        }
        return var19;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ZZZ)V", line = 439)
    public static final void method519(boolean arg0, boolean arg1, boolean arg2) {
        if (arg0) {
            class384.field5371++;
            class660.method3577(true);
        }
        field741++;
        if (arg1) {
            class77.field949++;
            class649.method3550(-6747);
        }
        if (!arg2) {
            field743 = null;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IILjava/lang/String;IIII)V", line = 463)
    public final void method520(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5, int arg6) {
        field726++;
        if (arg2 == null) {
            return;
        }
        this.method523(arg4, arg1, 41);
        int var8 = arg2.length();
        if (arg6 != -1750) {
            this.method523(-5, 47, 4);
        }
        int[] var9 = new int[var8];
        int[] var10 = new int[var8];
        for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = (int) (Math.sin((double) arg5 / 5.0D + (double) var11 / 5.0D) * 5.0D);
            var10[var11] = (int) (Math.sin((double) arg5 / 5.0D + (double) var11 / 3.0D) * 5.0D);
        }
        this.method517(arg3 - this.field747.method3001(-1, arg2) / 2, var10, arg0, null, arg2, 19792, null, var9);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(III)Z", line = 495)
    public static final boolean method521(int arg0, int arg1, int arg2) {
        if (arg1 == -1) {
            field742++;
            return class319.method1935(arg0, arg1, arg2) & class77.method616((byte) -105, arg2, arg0);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IBLjava/lang/String;)V", line = 506)
    private final void method522(int arg0, byte arg1, String arg2) {
        field745++;
        int var4 = 0;
        int var5 = 33 / ((arg1 - 30) / 45);
        boolean var6 = false;
        for (int var7 = 0; var7 < arg2.length(); var7++) {
            char var8 = arg2.charAt(var7);
            if (var8 == '<') {
                var6 = true;
            } else if (var8 == '>') {
                var6 = false;
            } else if (!var6 && var8 == ' ') {
                var4++;
            }
        }
        if (var4 > 0) {
            class428.field5912 = (arg0 - this.field747.method3001(-1, arg2) << 8) / var4;
        }
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(III)V", line = 546)
    private final void method523(int arg0, int arg1, int arg2) {
        if (arg2 < 25) {
            field750 = null;
        }
        field733++;
        class495.field6677 = -1;
        class483.field6608 = 0;
        class248.field3437 = arg0;
        class272.field3789 = arg0;
        if (arg1 == -1) {
            arg1 = 0;
        }
        class399.field5568 = -1;
        class428.field5912 = 0;
        class193.field2915 = arg1;
        class2.field35 = arg1;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V", line = 569)
    public static final void method524(int arg0) {
        class503.field6751 = new class121[50];
        if (arg0 <= -93) {
            class501.field6728 = 0;
            field727++;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IZIILjava/lang/String;I[Lhu;[ILaa;)V", line = 581)
    private final void method525(int arg0, boolean arg1, int arg2, int arg3, String arg4, int arg5, class133[] arg6, int[] arg7, class490 arg8) {
        field728++;
        int var10 = arg0 - this.field747.field7142;
        int var11 = -1;
        int var12 = -1;
        int var13 = arg4.length();
        if (!arg1) {
            this.method517(-41, null, -125, null, null, 80, null, null);
        }
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class295.method1826(107, arg4.charAt(var14)) & 0xFF);
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
                                    int var17 = class397.method2337((byte) -110, var16.substring(4));
                                    class133 var18 = arg6[var17];
                                    int var19 = arg7 == null ? var18.method1048() : arg7[var17];
                                    if ((class272.field3789 & 0xFF000000) == -16777216) {
                                        var18.method1045(arg5, this.field747.field7142 + var10 - var19, 1, 0, 1);
                                    } else {
                                        var18.method1045(arg5, this.field747.field7142 + var10 - var19, 0, class272.field3789 & 0xFF000000 | 0xFFFFFF, 1);
                                    }
                                    arg5 += arg6[var17].method1036();
                                    var12 = -1;
                                } catch (Exception var21) {
                                }
                            } else {
                                this.method531(var16, 5);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var11 == -1) {
                    if (var12 != -1) {
                        arg5 += this.field747.method3000(var12, 0, var15);
                    }
                    if (var15 == ' ') {
                        if (class428.field5912 > 0) {
                            class483.field6608 += class428.field5912;
                            arg5 += class483.field6608 >> 8;
                            class483.field6608 &= 0xFF;
                        }
                    } else if (arg8 == null) {
                        if ((class2.field35 & 0xFF000000) != 0) {
                            this.method118(var15, arg5 + 1, var10 - -1, class2.field35, true);
                        }
                        this.method118(var15, arg5, var10, class272.field3789, false);
                    } else {
                        if ((class2.field35 & 0xFF000000) != 0) {
                            this.method115(var15, arg5 + 1, var10 + 1, class2.field35, true, arg8, arg2, arg3);
                        }
                        this.method115(var15, arg5, var10, class272.field3789, false, arg8, arg2, arg3);
                    }
                    int var20 = this.field747.method3008(-116, var15);
                    if (class399.field5568 != -1) {
                        this.field735.method467(121, (int) ((double) this.field747.field7142 * 0.7D) + var10, var20, arg5, class399.field5568);
                    }
                    if (class495.field6677 != -1) {
                        this.field735.method467(-80, this.field747.field7142 + var10 + 1, var20, arg5, class495.field6677);
                    }
                    var12 = var15;
                    arg5 += var20;
                }
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(B)V", line = 738)
    public static final void method526(byte arg0) {
        field740++;
        if (arg0 <= 45) {
            field743 = null;
        }
        for (class107 var1 = (class107) class1.field12.method2144(true); var1 != null; var1 = (class107) class1.field12.method2146(false)) {
            if (var1.field1452.method1582(0)) {
                class501.method2820(8718, var1.field1459);
            } else {
                var1.field1452.method1358(24719);
                try {
                    var1.field1452.method1596((byte) 126);
                } catch (Exception var5) {
                    class135.method1056("TV: " + var1.field1459, var5, 1);
                    class501.method2820(8718, var1.field1459);
                }
                if (!var1.field1454 && !var1.field1457) {
                    class352 var3 = var1.field1452.method1594(-127);
                    if (var3 != null) {
                        class421 var4 = var3.method2109((byte) 81);
                        if (var4 != null) {
                            var4.method2440(false, var1.field1450);
                            class603.field7927.method1608(var4);
                            var1.field1454 = true;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ZILjava/lang/String;III)V", line = 801)
    public final void method527(boolean arg0, int arg1, String arg2, int arg3, int arg4, int arg5) {
        field744++;
        if (arg2 != null) {
            this.method523(arg5, arg4, 120);
            this.method525(arg3, arg0, 0, 0, arg2, arg1, null, null, null);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IILaa;Ljava/lang/String;I[IIIIIII[Lhu;III)I", line = 815)
    public final int method528(int arg0, int arg1, class490 arg2, String arg3, int arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class133[] arg12, int arg13, int arg14, int arg15) {
        field739++;
        if (arg10 != 0) {
            this.method533(-109, 121, -74, 47, 70, 124, null, (byte) -10);
        }
        return this.method518(0, arg12, arg1, arg14, arg0, arg9, arg7, arg8, arg5, arg15, arg4, arg2, arg13, arg6, -102, arg11, arg3);
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(I)V", line = 827)
    public static void method529(int arg0) {
        field750 = null;
        field743 = null;
        if (arg0 <= 10) {
            method521(-100, 102, -82);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ZZB)V", line = 838)
    public static final void method530(boolean arg0, boolean arg1, byte arg2) {
        if (arg2 != 119) {
            method521(-37, 46, 74);
        }
        if (arg0) {
            class384.field5371--;
            if (class384.field5371 == 0) {
                class656.field8679 = null;
            }
        }
        if (arg1) {
            class77.field949--;
            if (class77.field949 == 0) {
                class169.field2606 = null;
            }
        }
        field729++;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 865)
    private final void method531(String arg0, int arg1) {
        field731++;
        try {
            if (arg0.startsWith("col=")) {
                class272.field3789 = class272.field3789 & 0xFF000000 | class155.method1126(95, arg0.substring(4), 16) & 0xFFFFFF;
            } else if (arg0.equals("/col")) {
                class272.field3789 = class248.field3437 & 0xFFFFFF | class272.field3789 & 0xFF000000;
            }
            if (arg1 != 5) {
                this.field735 = null;
            }
            if (arg0.startsWith("argb=")) {
                class272.field3789 = class155.method1126(101, arg0.substring(5), 16);
            } else if (arg0.equals("/argb")) {
                class272.field3789 = class248.field3437;
            } else if (arg0.startsWith("str=")) {
                class399.field5568 = class272.field3789 & 0xFF000000 | class155.method1126(112, arg0.substring(4), 16);
            } else if (arg0.equals("str")) {
                class399.field5568 = class272.field3789 & 0xFF000000 | 0x800000;
            } else if (arg0.equals("/str")) {
                class399.field5568 = -1;
            } else if (arg0.startsWith("u=")) {
                class495.field6677 = class272.field3789 & 0xFF000000 | class155.method1126(arg1 ^ 0x5F, arg0.substring(2), 16);
            } else if (arg0.equals("u")) {
                class495.field6677 = class272.field3789 & 0xFF000000;
            } else if (arg0.equals("/u")) {
                class495.field6677 = -1;
            } else if (arg0.equalsIgnoreCase("shad=-1")) {
                class2.field35 = 0;
            } else if (arg0.startsWith("shad=")) {
                class2.field35 = class272.field3789 & 0xFF000000 | class155.method1126(121, arg0.substring(5), 16);
            } else if (arg0.equals("shad")) {
                class2.field35 = class272.field3789 & 0xFF000000;
            } else if (arg0.equals("/shad")) {
                class2.field35 = class193.field2915;
                return;
            } else if (arg0.equals("br")) {
                this.method523(class248.field3437, class193.field2915, 95);
                return;
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Lha;Lrc;)V", line = 938)
    public class60(class59 arg0, class539 arg1) {
        this.field747 = arg1;
        this.field735 = arg0;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([IIZLjava/lang/String;III[Lhu;)V", line = 947)
    public final void method532(int[] arg0, int arg1, boolean arg2, String arg3, int arg4, int arg5, int arg6, class133[] arg7) {
        field730++;
        if (arg3 != null && !arg2) {
            this.method523(arg1, arg4, 124);
            this.method525(arg6, !arg2, 0, 0, arg3, arg5, arg7, arg0, null);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIILjava/lang/String;B)V", line = 963)
    public final void method533(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, String arg6, byte arg7) {
        field737++;
        if (arg6 == null) {
            return;
        }
        this.method523(arg1, arg3, 27);
        double var9 = 7.0D - ((double) arg4 / 8.0D);
        if (var9 < 0.0D) {
            var9 = 0.0D;
        }
        int var11 = arg6.length();
        int[] var12 = new int[var11];
        if (arg7 != -40) {
            field743 = null;
        }
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = (int) (var9 * Math.sin((double) var13 / 1.5D + (double) arg2));
        }
        this.method517(arg0 - (this.field747.method3001(-1, arg6) / 2), var12, arg5, null, arg6, 19792, null, null);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIBILjava/lang/String;)V", line = 998)
    public final void method534(int arg0, int arg1, int arg2, byte arg3, int arg4, String arg5) {
        field732++;
        if (arg3 != -108) {
            this.field747 = null;
        }
        if (arg5 != null) {
            this.method523(arg0, arg2, 101);
            this.method525(arg4, true, 0, 0, arg5, arg1 - this.field747.method3001(arg3 + 107, arg5), null, null, null);
        }
    }

    @OriginalMember(owner = "client!da", name = "fa", descriptor = "(CIIIZ)V")
    public abstract void method118(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(CIIIZLaa;II)V")
    public abstract void method115(char arg0, int arg1, int arg2, int arg3, boolean arg4, class490 arg5, int arg6, int arg7);
}
