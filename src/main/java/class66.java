import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public abstract class class66 {

    @OriginalMember(owner = "client!da", name = "p", descriptor = "Lha;")
    private class65 field944;

    @OriginalMember(owner = "client!da", name = "v", descriptor = "Leia;")
    private class255 field950;

    @OriginalMember(owner = "client!da", name = "n", descriptor = "Ljava/lang/String;")
    public static String field942 = null;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "I")
    public static int field929;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "I")
    public static int field930;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "I")
    public static int field932;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "I")
    public static int field933;

    @OriginalMember(owner = "client!da", name = "f", descriptor = "I")
    public static int field934;

    @OriginalMember(owner = "client!da", name = "g", descriptor = "I")
    public static int field935;

    @OriginalMember(owner = "client!da", name = "h", descriptor = "I")
    public static int field936;

    @OriginalMember(owner = "client!da", name = "j", descriptor = "I")
    public static int field938;

    @OriginalMember(owner = "client!da", name = "k", descriptor = "I")
    public static int field939;

    @OriginalMember(owner = "client!da", name = "l", descriptor = "I")
    public static int field940;

    @OriginalMember(owner = "client!da", name = "m", descriptor = "I")
    public static int field941;

    @OriginalMember(owner = "client!da", name = "o", descriptor = "I")
    public static int field943;

    @OriginalMember(owner = "client!da", name = "q", descriptor = "I")
    public static int field945;

    @OriginalMember(owner = "client!da", name = "r", descriptor = "I")
    public static int field946;

    @OriginalMember(owner = "client!da", name = "s", descriptor = "I")
    public static int field947;

    @OriginalMember(owner = "client!da", name = "t", descriptor = "I")
    public static int field948;

    @OriginalMember(owner = "client!da", name = "u", descriptor = "I")
    public static int field949;

    @OriginalMember(owner = "client!da", name = "w", descriptor = "I")
    public static int field951;

    @OriginalMember(owner = "client!da", name = "x", descriptor = "Lhka;")
    public static class56 field952;

    @OriginalMember(owner = "client!da", name = "i", descriptor = "Lha;")
    public static class65 field937;

    @OriginalMember(owner = "client!da", name = "c", descriptor = "[[[B")
    public static byte[][][] field931;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/lang/String;IIII)V", line = 4)
    public final void method569(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        field939++;
        if (arg1 == null) {
            return;
        }
        this.method586(arg0, true, arg2);
        if (arg5 != -1) {
            field937 = null;
        }
        this.method575(null, arg3 - this.field950.method1696(arg1, 0), -93, arg1, 0, null, 0, null, arg4);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(CI)I", line = 32)
    public static final int method570(char arg0, int arg1) {
        field943++;
        return ~arg0 <= arg1 && arg0 < class52.field757.length ? class52.field757[arg0] : -1;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IILjava/lang/String;[Lvr;ILjava/util/Random;III[I)I", line = 52)
    public final int method571(int arg0, int arg1, String arg2, class147[] arg3, int arg4, Random arg5, int arg6, int arg7, int arg8, int[] arg9) {
        field945++;
        if (arg2 == null) {
            return 0;
        }
        arg5.setSeed((long) arg0);
        int var11 = (arg5.nextInt() & 0x1F) + 192;
        this.method586(arg8 & 0xFFFFFF | var11 << 24, true, var11 << 24 | arg6 & 0xFFFFFF);
        if (arg1 < 58) {
            return 54;
        }
        int var12 = arg2.length();
        int[] var13 = new int[var12];
        int var14 = 0;
        for (int var15 = 0; var15 < var12; var15++) {
            var13[var15] = var14;
            if ((arg5.nextInt() & 0x3) == 0) {
                var14++;
            }
        }
        this.method584(arg2, arg7, arg9, arg4, var13, arg3, null, -7654);
        return var14;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BLjava/lang/String;)V", line = 92)
    private final void method572(byte arg0, String arg1) {
        field951++;
        try {
            if (arg1.startsWith("col=")) {
                class293.field4281 = class293.field4281 & 0xFF000000 | class339.method2153(arg1.substring(4), 16, -91) & 0xFFFFFF;
            } else if (arg1.equals("/col")) {
                class293.field4281 = class293.field4281 & 0xFF000000 | class250.field3708 & 0xFFFFFF;
            }
            if (arg1.startsWith("argb=")) {
                class293.field4281 = class339.method2153(arg1.substring(5), 16, -90);
            } else if (arg1.equals("/argb")) {
                class293.field4281 = class250.field3708;
            } else if (arg1.startsWith("str=")) {
                class446.field6256 = class293.field4281 & 0xFF000000 | class339.method2153(arg1.substring(4), 16, -39);
            } else if (arg1.equals("str")) {
                class446.field6256 = class293.field4281 & 0xFF000000 | 0x800000;
            } else if (arg1.equals("/str")) {
                class446.field6256 = -1;
            } else if (arg1.startsWith("u=")) {
                class78.field1118 = class293.field4281 & 0xFF000000 | class339.method2153(arg1.substring(2), 16, -126);
            } else if (arg1.equals("u")) {
                class78.field1118 = class293.field4281 & 0xFF000000;
            } else if (arg1.equals("/u")) {
                class78.field1118 = -1;
            } else if (arg1.equalsIgnoreCase("shad=-1")) {
                class184.field2456 = 0;
            } else if (arg1.startsWith("shad=")) {
                class184.field2456 = class293.field4281 & 0xFF000000 | class339.method2153(arg1.substring(5), 16, -75);
            } else if (arg1.equals("shad")) {
                class184.field2456 = class293.field4281 & 0xFF000000;
            } else if (arg1.equals("/shad")) {
                class184.field2456 = class9.field150;
            } else if (arg1.equals("br")) {
                this.method586(class250.field3708, true, class9.field150);
            }
        } catch (Exception var4) {
        }
        int var3 = -115 / ((-arg0 - 53) / 61);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIILjava/lang/String;II)V", line = 167)
    public final void method573(int arg0, int arg1, int arg2, int arg3, String arg4, int arg5, int arg6) {
        field946++;
        if (arg4 == null) {
            return;
        }
        this.method586(arg1, true, arg2);
        int var8 = arg4.length();
        int[] var9 = new int[var8];
        int[] var10 = new int[var8];
        int var11 = -124 % ((arg5 - 76) / 37);
        for (int var12 = 0; var12 < var8; var12++) {
            var9[var12] = (int) (Math.sin((double) arg6 / 5.0D + (double) var12 / 5.0D) * 5.0D);
            var10[var12] = (int) (Math.sin((double) arg6 / 5.0D + (double) var12 / 3.0D) * 5.0D);
        }
        this.method584(arg4, arg0 - (this.field950.method1696(arg4, 0) / 2), null, arg3, var9, null, var10, -7654);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;II[Lvr;IIIIIIIIILaa;[II)I", line = 203)
    public final int method574(String arg0, int arg1, int arg2, class147[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class514 arg13, int[] arg14, int arg15) {
        field935++;
        if (arg5 != -1) {
            field937 = null;
        }
        return this.method582(arg15, arg11, 0, arg10, arg8, arg4, arg12, arg7, arg0, arg13, arg6, arg3, arg1, arg2, 0, arg14, arg9);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([IIILjava/lang/String;I[Lvr;ILaa;I)V", line = 215)
    private final void method575(int[] arg0, int arg1, int arg2, String arg3, int arg4, class147[] arg5, int arg6, class514 arg7, int arg8) {
        if (arg2 > -81) {
            field937 = null;
        }
        field940++;
        int var10 = arg8 - this.field950.field3796;
        int var11 = -1;
        int var12 = -1;
        int var13 = arg3.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class521.method3010(-115, arg3.charAt(var14)) & 0xFF);
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
                                    int var17 = class334.method2123(1, var16.substring(4));
                                    class147 var18 = arg5[var17];
                                    int var19 = arg0 == null ? var18.method1106() : arg0[var17];
                                    if ((class293.field4281 & 0xFF000000) == -16777216) {
                                        var18.method1086(arg1, this.field950.field3796 + var10 - var19, 1, 0, 1);
                                    } else {
                                        var18.method1086(arg1, this.field950.field3796 + var10 - var19, 0, class293.field4281 & 0xFF000000 | 0xFFFFFF, 1);
                                    }
                                    var12 = -1;
                                    arg1 += arg5[var17].method1096();
                                } catch (Exception var21) {
                                }
                            } else {
                                this.method572((byte) -120, var16);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var11 == -1) {
                    if (var12 != -1) {
                        arg1 += this.field950.method1698(var15, var12, 0);
                    }
                    if (var15 == ' ') {
                        if (class312.field4489 > 0) {
                            class363.field5290 += class312.field4489;
                            arg1 += class363.field5290 >> 8;
                            class363.field5290 &= 0xFF;
                        }
                    } else if (arg7 == null) {
                        if ((class184.field2456 & 0xFF000000) != 0) {
                            this.method153(var15, arg1 + 1, var10 + 1, class184.field2456, true);
                        }
                        this.method153(var15, arg1, var10, class293.field4281, false);
                    } else {
                        if ((class184.field2456 & 0xFF000000) != 0) {
                            this.method154(var15, arg1 + 1, var10 + 1, class184.field2456, true, arg7, arg6, arg4);
                        }
                        this.method154(var15, arg1, var10, class293.field4281, false, arg7, arg6, arg4);
                    }
                    int var20 = this.field950.method1700(false, var15);
                    if (class446.field6256 != -1) {
                        this.field944.method514((int) ((double) this.field950.field3796 * 0.7D) + var10, arg1, class446.field6256, var20, (byte) -55);
                    }
                    if (class78.field1118 != -1) {
                        this.field944.method514(var10 - (-this.field950.field3796 - 1), arg1, class78.field1118, var20, (byte) -66);
                    }
                    var12 = var15;
                    arg1 += var20;
                }
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IILjava/lang/String;IIII)V", line = 364)
    public final void method576(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5, int arg6) {
        field949++;
        if (arg2 == null) {
            return;
        }
        this.method586(arg3, true, arg4);
        int var8 = arg2.length();
        int[] var9 = new int[var8];
        for (int var10 = 0; var10 < var8; var10++) {
            var9[var10] = (int) (Math.sin((double) arg0 / 5.0D + (double) var10 / 2.0D) * 5.0D);
        }
        this.method584(arg2, arg6 - this.field950.method1696(arg2, arg5 ^ 0x2) / arg5, null, arg1, null, null, var9, -7654);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/lang/String;I)V", line = 389)
    private final void method577(int arg0, String arg1, int arg2) {
        field934++;
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
        if (var4 > 0) {
            class312.field4489 = (arg0 - this.field950.method1696(arg1, 0) << 8) / var4;
        }
        if (arg2 != 62) {
            field952 = null;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIBIILjava/lang/String;)V", line = 429)
    public final void method578(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, String arg7) {
        field933++;
        if (arg7 == null) {
            return;
        }
        this.method586(arg5, true, arg1);
        double var9 = 7.0D - (double) arg3 / 8.0D;
        if (arg4 != -101) {
            return;
        }
        if (var9 < 0.0D) {
            var9 = 0.0D;
        }
        int var11 = arg7.length();
        int[] var12 = new int[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = (int) (var9 * Math.sin((double) var13 / 1.5D + (double) arg2));
        }
        this.method584(arg7, arg0 - (this.field950.method1696(arg7, 0) / 2), null, arg6, null, null, var12, -7654);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIBLjava/lang/String;I)V", line = 462)
    public final void method579(int arg0, int arg1, int arg2, byte arg3, String arg4, int arg5) {
        field941++;
        if (arg4 == null) {
            return;
        }
        if (arg3 < 25) {
            this.method580(74, 43, -110, null, null, 4, null, -29);
        }
        this.method586(arg2, true, arg1);
        this.method575(null, arg0 - (this.field950.method1696(arg4, 0) / 2), -96, arg4, 0, null, 0, null, arg5);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(III[I[Lvr;ILjava/lang/String;I)V", line = 477)
    public final void method580(int arg0, int arg1, int arg2, int[] arg3, class147[] arg4, int arg5, String arg6, int arg7) {
        field936++;
        if (arg6 != null) {
            this.method586(arg1, true, arg7);
            this.method575(arg3, arg5, -119, arg6, arg0, arg4, 0, null, arg2);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BII[Lvr;III[ILjava/util/Random;Ljava/lang/String;III[II)I", line = 492)
    public final int method581(byte arg0, int arg1, int arg2, class147[] arg3, int arg4, int arg5, int arg6, int[] arg7, Random arg8, String arg9, int arg10, int arg11, int arg12, int[] arg13, int arg14) {
        field929++;
        if (arg9 == null) {
            return 0;
        }
        arg8.setSeed((long) arg10);
        int var16 = -63 / ((-arg0 - 45) / 45);
        int var17 = (arg8.nextInt() & 0x1F) + 192;
        this.method586(arg11 & 0xFFFFFF | var17 << 24, true, arg2 & 0xFFFFFF | var17 << 24);
        int var18 = arg9.length();
        int[] var19 = new int[var18];
        int var20 = 0;
        for (int var21 = 0; var21 < var18; var21++) {
            var19[var21] = var20;
            if ((arg8.nextInt() & 0x3) == 0) {
                var20++;
            }
        }
        int var22 = arg4;
        int var23 = arg6 + this.field950.field3810;
        if (arg14 == 1) {
            var23 += (arg5 - (this.field950.field3810 + this.field950.field3807)) / 2;
        } else if (arg14 == 2) {
            var23 = arg5 + arg6 - this.field950.field3807;
        }
        int var24 = -1;
        if (arg12 == 1) {
            var24 = var20 + this.field950.method1696(arg9, 0);
            var22 = (arg1 - var24) / 2 + arg4;
        } else if (arg12 == 2) {
            var24 = this.field950.method1696(arg9, 0) + var20;
            var22 = arg1 + arg4 - var24;
        }
        this.method584(arg9, var22, arg13, var23, var19, arg3, null, -7654);
        if (arg7 != null) {
            if (var24 == -1) {
                var24 = var20 + this.field950.method1696(arg9, 0);
            }
            arg7[2] = var24;
            arg7[3] = this.field950.field3810 + this.field950.field3807;
            arg7[1] = var23 - this.field950.field3810;
            arg7[0] = var22;
        }
        return var20;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIIIILjava/lang/String;Laa;I[Lvr;III[II)I", line = 570)
    public final int method582(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, String arg8, class514 arg9, int arg10, class147[] arg11, int arg12, int arg13, int arg14, int[] arg15, int arg16) {
        field930++;
        if (arg8 == null) {
            return 0;
        }
        this.method586(arg10, true, arg6);
        if (arg3 == arg14) {
            arg3 = this.field950.field3796;
        }
        int[] var18;
        if (arg16 < this.field950.field3807 + arg3 + this.field950.field3810 && arg16 < (arg3 + arg3)) {
            var18 = null;
        } else {
            var18 = new int[] { arg4 };
        }
        if (arg2 == -1) {
            arg2 = arg16 / arg3;
            if (arg2 <= 0) {
                arg2 = 1;
            }
        }
        int var19 = this.field950.method1706(arg11, class419.field6020, var18, arg8, -1);
        if (arg2 > 0 && var19 >= arg2) {
            class419.field6020[arg2 - 1] = this.field950.method1699(arg4, class419.field6020[arg2 - 1], true, arg11);
            var19 = arg2;
        }
        if (arg1 == 3 && var19 == 1) {
            arg1 = 1;
        }
        int var20;
        if (arg1 == 0) {
            var20 = this.field950.field3810 + arg0;
        } else if (arg1 == 1) {
            var20 = (arg16 - ((var19 - 1) * arg3) - this.field950.field3807 - this.field950.field3810) / 2 + arg0 + this.field950.field3810;
        } else if (arg1 == 2) {
            var20 = arg0 + arg16 - ((var19 - 1) * arg3) - this.field950.field3807;
        } else {
            int var21 = (arg16 - ((var19 - 1) * arg3) - this.field950.field3807 - this.field950.field3810) / (var19 + 1);
            if (var21 < 0) {
                var21 = 0;
            }
            arg3 += var21;
            var20 = arg0 - (-this.field950.field3810 - var21);
        }
        for (int var22 = 0; var22 < var19; var22++) {
            if (arg7 == 0) {
                this.method575(arg15, arg5, -106, class419.field6020[var22], arg13, arg11, arg12, arg9, var20);
            } else if (arg7 == 1) {
                this.method575(arg15, arg5 + ((arg4 - this.field950.method1696(class419.field6020[var22], 0)) / 2), -95, class419.field6020[var22], arg13, arg11, arg12, arg9, var20);
            } else if (arg7 == 2) {
                this.method575(arg15, arg5 + (arg4 - this.field950.method1696(class419.field6020[var22], 0)), arg14 ^ 0xFFFFFF85, class419.field6020[var22], arg13, arg11, arg12, arg9, var20);
            } else if ((var19 - 1) == var22) {
                this.method575(arg15, arg5, -98, class419.field6020[var22], arg13, arg11, arg12, arg9, var20);
            } else {
                this.method577(arg4, class419.field6020[var22], 62);
                this.method575(arg15, arg5, -103, class419.field6020[var22], arg13, arg11, arg12, arg9, var20);
                class312.field4489 = 0;
            }
            var20 += arg3;
        }
        return var19;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BIILjava/lang/String;II)V", line = 672)
    public final void method583(byte arg0, int arg1, int arg2, String arg3, int arg4, int arg5) {
        field948++;
        if (arg3 == null) {
            return;
        }
        this.method586(arg4, true, arg2);
        this.method575(null, arg5, -113, arg3, 0, null, 0, null, arg1);
        if (arg0 != 56) {
            this.method583((byte) -67, 101, -113, null, 75, 77);
        }
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Lha;Leia;)V", line = 688)
    public class66(class65 arg0, class255 arg1) {
        this.field944 = arg0;
        this.field950 = arg1;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;I[II[I[Lvr;[II)V", line = 697)
    private final void method584(String arg0, int arg1, int[] arg2, int arg3, int[] arg4, class147[] arg5, int[] arg6, int arg7) {
        int var9 = arg3 - this.field950.field3796;
        field932++;
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        int var13 = arg0.length();
        if (arg7 != -7654) {
            this.method154('-', 109, 6, -76, false, null, -5, -30);
        }
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class521.method3010(arg7 ^ 0x1D89, arg0.charAt(var14)) & 0xFF);
            if (var15 == '<') {
                var10 = var14;
            } else {
                if (var15 == '>' && var10 != -1) {
                    String var16 = arg0.substring(var10 + 1, var14);
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
                                    if (arg6 == null) {
                                        var18 = 0;
                                    } else {
                                        var18 = arg6[var12];
                                    }
                                    var12++;
                                    int var19 = class334.method2123(1, var16.substring(4));
                                    class147 var20 = arg5[var19];
                                    int var21 = arg2 == null ? var20.method1106() : arg2[var19];
                                    var20.method1086(arg1 + var17, -var21 + var18 + this.field950.field3796 + var9, 1, 0, 1);
                                    arg1 += arg5[var19].method1096();
                                    var11 = -1;
                                } catch (Exception var25) {
                                }
                            } else {
                                this.method572((byte) 92, var16);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var10 == -1) {
                    if (var11 != -1) {
                        arg1 += this.field950.method1698(var15, var11, 0);
                    }
                    int var22;
                    if (arg4 == null) {
                        var22 = 0;
                    } else {
                        var22 = arg4[var12];
                    }
                    int var23;
                    if (arg6 == null) {
                        var23 = 0;
                    } else {
                        var23 = arg6[var12];
                    }
                    var12++;
                    if (var15 != ' ') {
                        if ((class184.field2456 & 0xFF000000) != 0) {
                            this.method153(var15, arg1 - (-var22 - 1), var23 + 1 + var9, class184.field2456, true);
                        }
                        this.method153(var15, arg1 + var22, var9 - -var23, class293.field4281, false);
                    } else if (class312.field4489 > 0) {
                        class363.field5290 += class312.field4489;
                        arg1 += class363.field5290 >> 8;
                        class363.field5290 &= 0xFF;
                    }
                    int var24 = this.field950.method1700(false, var15);
                    if (class446.field6256 != -1) {
                        this.field944.method514(var9 + ((int) ((double) this.field950.field3796 * 0.7D)), arg1, class446.field6256, var24, (byte) -91);
                    }
                    if (class78.field1118 != -1) {
                        this.field944.method514(var9 + this.field950.field3796, arg1, class78.field1118, var24, (byte) -80);
                    }
                    arg1 += var24;
                    var11 = var15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V", line = 865)
    public static void method585(int arg0) {
        field931 = null;
        field952 = null;
        field937 = null;
        field942 = null;
        if (arg0 != 18344) {
            method585(-70);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IZI)V", line = 878)
    private final void method586(int arg0, boolean arg1, int arg2) {
        class363.field5290 = 0;
        class78.field1118 = -1;
        class446.field6256 = -1;
        field938++;
        class312.field4489 = 0;
        class250.field3708 = arg0;
        class293.field4281 = arg0;
        if (arg2 == -1) {
            arg2 = 0;
        }
        if (!arg1) {
            this.method582(115, -81, 85, -55, -33, -29, 16, -95, null, null, 47, null, -75, 66, -25, null, -64);
        }
        class9.field150 = arg2;
        class184.field2456 = arg2;
    }

    @OriginalMember(owner = "client!da", name = "fa", descriptor = "(CIIIZ)V")
    public abstract void method153(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(CIIIZLaa;II)V")
    public abstract void method154(char arg0, int arg1, int arg2, int arg3, boolean arg4, class514 arg5, int arg6, int arg7);
}
