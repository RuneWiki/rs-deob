import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public abstract class class400 {

    @OriginalMember(owner = "client!da", name = "k", descriptor = "Loq;")
    private class742 field5537;

    @OriginalMember(owner = "client!da", name = "f", descriptor = "Lha;")
    private class545 field5532;

    @OriginalMember(owner = "client!da", name = "g", descriptor = "Z")
    public static boolean field5533 = false;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "[F")
    public static float[] field5530 = new float[4];

    @OriginalMember(owner = "client!da", name = "w", descriptor = "[Z")
    public static boolean[] field5549 = new boolean[5];

    @OriginalMember(owner = "client!da", name = "a", descriptor = "I")
    public static int field5527;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "I")
    public static int field5528;

    @OriginalMember(owner = "client!da", name = "c", descriptor = "I")
    public static int field5529;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "I")
    public static int field5531;

    @OriginalMember(owner = "client!da", name = "h", descriptor = "I")
    public static int field5534;

    @OriginalMember(owner = "client!da", name = "i", descriptor = "I")
    public static int field5535;

    @OriginalMember(owner = "client!da", name = "j", descriptor = "I")
    public static int field5536;

    @OriginalMember(owner = "client!da", name = "l", descriptor = "I")
    public static int field5538;

    @OriginalMember(owner = "client!da", name = "m", descriptor = "I")
    public static int field5539;

    @OriginalMember(owner = "client!da", name = "n", descriptor = "I")
    public static int field5540;

    @OriginalMember(owner = "client!da", name = "o", descriptor = "I")
    public static int field5541;

    @OriginalMember(owner = "client!da", name = "p", descriptor = "I")
    public static int field5542;

    @OriginalMember(owner = "client!da", name = "q", descriptor = "I")
    public static int field5543;

    @OriginalMember(owner = "client!da", name = "r", descriptor = "I")
    public static int field5544;

    @OriginalMember(owner = "client!da", name = "t", descriptor = "I")
    public static int field5546;

    @OriginalMember(owner = "client!da", name = "u", descriptor = "I")
    public static int field5547;

    @OriginalMember(owner = "client!da", name = "v", descriptor = "I")
    public static int field5548;

    @OriginalMember(owner = "client!da", name = "s", descriptor = "Z")
    public static boolean field5545;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIILjava/lang/String;)V", line = 3)
    public final void method2422(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5) {
        if (arg4 != 18127) {
            this.method2437(-122, -98, null, null, 105, 97, 16, null);
        }
        field5539++;
        if (arg5 != null) {
            this.method2426(arg2, arg0, (byte) -40);
            this.method2429(arg3, 0, null, arg5, null, arg1 - this.field5537.method4134((byte) 79, arg5), 17672, null, 0);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([Lcw;IBIIIII[IILjava/lang/String;IILaa;II)I", line = 21)
    public final int method2423(class21[] arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, int arg9, String arg10, int arg11, int arg12, class571 arg13, int arg14, int arg15) {
        int var17 = 87 / ((-arg2 - 67) / 43);
        field5534++;
        return this.method2438(arg12, arg14, 0, arg13, arg4, arg8, arg1, arg5, arg15, arg6, -1, arg7, arg10, arg0, arg11, arg9, arg3);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/lang/String;IIIII)V", line = 33)
    public final void method2424(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5527++;
        if (arg1 == null) {
            return;
        }
        if (arg5 != -19398) {
            this.method2436(-28, -22, null, null, -101, null, -101, 64, null, -84);
        }
        this.method2426(arg0, arg6, (byte) -80);
        int var8 = arg1.length();
        int[] var9 = new int[var8];
        for (int var10 = 0; var10 < var8; var10++) {
            var9[var10] = (int) (Math.sin((double) arg3 / 5.0D + (double) var10 / 2.0D) * 5.0D);
        }
        this.method2428(null, null, arg2, arg1, true, arg4 - (this.field5537.method4134((byte) -79, arg1) / 2), var9, null);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIILjava/lang/String;Z)V", line = 62)
    public final void method2425(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, String arg6, boolean arg7) {
        field5544++;
        if (arg6 == null) {
            return;
        }
        this.method2426(arg2, arg4, (byte) -65);
        double var9 = 7.0D - ((double) arg0 / 8.0D);
        if (var9 < 0.0D) {
            var9 = 0.0D;
        }
        int var11 = arg6.length();
        int[] var12 = new int[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = (int) (Math.sin((double) var13 / 1.5D + (double) arg3) * var9);
        }
        this.method2428(null, null, arg1, arg6, arg7, arg5 - (this.field5537.method4134((byte) -55, arg6) / 2), var12, null);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIB)V", line = 92)
    private final void method2426(int arg0, int arg1, byte arg2) {
        field5547++;
        class145.field2004 = -1;
        class127.field1748 = arg1;
        class403.field5601 = arg1;
        if (arg2 > -15) {
            return;
        }
        if (arg0 == -1) {
            arg0 = 0;
        }
        class668.field9406 = -1;
        class128.field1754 = 0;
        class363.field4651 = 0;
        class28.field362 = arg0;
        class530.field7415 = arg0;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IILjava/lang/String;III)V", line = 114)
    public final void method2427(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5) {
        field5531++;
        if (arg0 == 648 && arg2 != null) {
            this.method2426(arg5, arg4, (byte) -98);
            this.method2429(arg3, 0, null, arg2, null, arg1, arg0 + 17024, null, 0);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([I[IILjava/lang/String;ZI[I[Lcw;)V", line = 140)
    private final void method2428(int[] arg0, int[] arg1, int arg2, String arg3, boolean arg4, int arg5, int[] arg6, class21[] arg7) {
        field5529++;
        if (!arg4) {
            return;
        }
        int var9 = arg2 - this.field5537.field10344;
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        int var13 = arg3.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class228.method1474(arg3.charAt(var14), true) & 0xFF);
            if (var15 == '<') {
                var10 = var14;
            } else {
                if (var15 == '>' && var10 != -1) {
                    String var16 = arg3.substring(var10 + 1, var14);
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
                                    if (arg1 == null) {
                                        var17 = 0;
                                    } else {
                                        var17 = arg1[var12];
                                    }
                                    int var18;
                                    if (arg6 == null) {
                                        var18 = 0;
                                    } else {
                                        var18 = arg6[var12];
                                    }
                                    var12++;
                                    int var19 = class665.method3815(var16.substring(4), -125);
                                    class21 var20 = arg7[var19];
                                    int var21 = arg0 == null ? var20.method108() : arg0[var19];
                                    var20.method104(arg5 + var17, -var21 + var9 - (-this.field5537.field10344 - var18), 1, 0, 1);
                                    var11 = -1;
                                    arg5 += arg7[var19].method116();
                                } catch (Exception var25) {
                                }
                            } else {
                                this.method2431((byte) 93, var16);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var10 == -1) {
                    if (var11 != -1) {
                        arg5 += this.field5537.method4138(-101, var15, var11);
                    }
                    int var22;
                    if (arg1 == null) {
                        var22 = 0;
                    } else {
                        var22 = arg1[var12];
                    }
                    int var23;
                    if (arg6 == null) {
                        var23 = 0;
                    } else {
                        var23 = arg6[var12];
                    }
                    if (var15 != ' ') {
                        if ((class530.field7415 & 0xFF000000) != 0) {
                            this.method296(var15, arg5 + var22 + 1, var23 + 1 + var9, class530.field7415, true);
                        }
                        this.method296(var15, arg5 + var22, var9 + var23, class403.field5601, false);
                    } else if (class363.field4651 > 0) {
                        class128.field1754 += class363.field4651;
                        arg5 += class128.field1754 >> 8;
                        class128.field1754 &= 0xFF;
                    }
                    var12++;
                    int var24 = this.field5537.method4135(255, var15);
                    if (class145.field2004 != -1) {
                        this.field5532.method3264((int) ((double) this.field5537.field10344 * 0.7D) + var9, (byte) 79, class145.field2004, arg5, var24);
                    }
                    if (class668.field9406 != -1) {
                        this.field5532.method3264(this.field5537.field10344 + var9, (byte) 127, class668.field9406, arg5, var24);
                    }
                    var11 = var15;
                    arg5 += var24;
                }
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II[ILjava/lang/String;[Lcw;IILaa;I)V", line = 306)
    private final void method2429(int arg0, int arg1, int[] arg2, String arg3, class21[] arg4, int arg5, int arg6, class571 arg7, int arg8) {
        int var10 = arg0 - this.field5537.field10344;
        field5538++;
        int var11 = -1;
        if (arg6 != 17672) {
            this.method2430(79, 121, null);
        }
        int var12 = -1;
        int var13 = arg3.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class228.method1474(arg3.charAt(var14), true) & 0xFF);
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
                                    int var17 = class665.method3815(var16.substring(4), arg6 ^ 0xFFFFBA8A);
                                    class21 var18 = arg4[var17];
                                    int var19 = arg2 == null ? var18.method108() : arg2[var17];
                                    if ((class403.field5601 & 0xFF000000) == -16777216) {
                                        var18.method104(arg5, var10 + this.field5537.field10344 - var19, 1, 0, 1);
                                    } else {
                                        var18.method104(arg5, var10 + this.field5537.field10344 - var19, 0, class403.field5601 & 0xFF000000 | 0xFFFFFF, 1);
                                    }
                                    arg5 += arg4[var17].method116();
                                    var12 = -1;
                                } catch (Exception var21) {
                                }
                            } else {
                                this.method2431((byte) 93, var16);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var11 == -1) {
                    if (var12 != -1) {
                        arg5 += this.field5537.method4138(-105, var15, var12);
                    }
                    if (var15 == ' ') {
                        if (class363.field4651 > 0) {
                            class128.field1754 += class363.field4651;
                            arg5 += class128.field1754 >> 8;
                            class128.field1754 &= 0xFF;
                        }
                    } else if (arg7 == null) {
                        if ((class530.field7415 & 0xFF000000) != 0) {
                            this.method296(var15, arg5 + 1, var10 + 1, class530.field7415, true);
                        }
                        this.method296(var15, arg5, var10, class403.field5601, false);
                    } else {
                        if ((class530.field7415 & 0xFF000000) != 0) {
                            this.method295(var15, arg5 + 1, var10 + 1, class530.field7415, true, arg7, arg1, arg8);
                        }
                        this.method295(var15, arg5, var10, class403.field5601, false, arg7, arg1, arg8);
                    }
                    int var20 = this.field5537.method4135(arg6 - 17417, var15);
                    if (class145.field2004 != -1) {
                        this.field5532.method3264((int) ((double) this.field5537.field10344 * 0.7D) + var10, (byte) 78, class145.field2004, arg5, var20);
                    }
                    if (class668.field9406 != -1) {
                        this.field5532.method3264(this.field5537.field10344 + var10 + 1, (byte) 117, class668.field9406, arg5, var20);
                    }
                    var12 = var15;
                    arg5 += var20;
                }
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IILjava/lang/String;)V", line = 464)
    private final void method2430(int arg0, int arg1, String arg2) {
        field5542++;
        int var4 = 0;
        boolean var5 = false;
        if (arg1 != 22316) {
            field5549 = null;
        }
        for (int var6 = 0; arg2.length() > var6; var6++) {
            char var7 = arg2.charAt(var6);
            if (var7 == '<') {
                var5 = true;
            } else if (var7 == '>') {
                var5 = false;
            } else if (!var5 && var7 == ' ') {
                var4++;
            }
        }
        if (var4 > 0) {
            class363.field4651 = (arg0 - this.field5537.method4134((byte) -80, arg2) << 8) / var4;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BLjava/lang/String;)V", line = 503)
    private final void method2431(byte arg0, String arg1) {
        field5541++;
        try {
            if (arg0 == 93) {
                if (arg1.startsWith("col=")) {
                    class403.field5601 = class403.field5601 & 0xFF000000 | class526.method3132(16, arg1.substring(4), -10711) & 0xFFFFFF;
                } else if (arg1.equals("/col")) {
                    class403.field5601 = class403.field5601 & 0xFF000000 | class127.field1748 & 0xFFFFFF;
                }
                if (arg1.startsWith("argb=")) {
                    class403.field5601 = class526.method3132(16, arg1.substring(5), arg0 ^ 0xFFFFD674);
                } else if (arg1.equals("/argb")) {
                    class403.field5601 = class127.field1748;
                } else if (arg1.startsWith("str=")) {
                    class145.field2004 = class403.field5601 & 0xFF000000 | class526.method3132(16, arg1.substring(4), arg0 ^ 0xFFFFD674);
                } else if (arg1.equals("str")) {
                    class145.field2004 = class403.field5601 & 0xFF000000 | 0x800000;
                } else if (arg1.equals("/str")) {
                    class145.field2004 = -1;
                } else if (arg1.startsWith("u=")) {
                    class668.field9406 = class403.field5601 & 0xFF000000 | class526.method3132(16, arg1.substring(2), -10711);
                } else if (arg1.equals("u")) {
                    class668.field9406 = class403.field5601 & 0xFF000000;
                } else if (arg1.equals("/u")) {
                    class668.field9406 = -1;
                } else if (arg1.equalsIgnoreCase("shad=-1")) {
                    class530.field7415 = 0;
                } else if (arg1.startsWith("shad=")) {
                    class530.field7415 = class403.field5601 & 0xFF000000 | class526.method3132(16, arg1.substring(5), -10711);
                } else if (arg1.equals("shad")) {
                    class530.field7415 = class403.field5601 & 0xFF000000;
                } else if (arg1.equals("/shad")) {
                    class530.field7415 = class28.field362;
                } else if (arg1.equals("br")) {
                    this.method2426(class28.field362, class127.field1748, (byte) -18);
                    return;
                }
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIILjava/lang/String;III)V", line = 581)
    public final void method2432(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5, int arg6) {
        field5528++;
        if (arg3 == null) {
            return;
        }
        this.method2426(arg4, arg5, (byte) -33);
        int var8 = arg3.length();
        int[] var9 = new int[var8];
        if (arg0 > -83) {
            return;
        }
        int[] var10 = new int[var8];
        for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = (int) (Math.sin((double) arg1 / 5.0D + (double) var11 / 5.0D) * 5.0D);
            var10[var11] = (int) (Math.sin((double) arg1 / 5.0D + (double) var11 / 3.0D) * 5.0D);
        }
        this.method2428(null, var9, arg6, arg3, true, arg2 - (this.field5537.method4134((byte) -72, arg3) / 2), var10, null);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V", line = 612)
    public static void method2433(int arg0) {
        field5530 = null;
        if (arg0 == 20151) {
            field5549 = null;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IILjava/lang/String;ZII)V", line = 623)
    public final void method2434(int arg0, int arg1, String arg2, boolean arg3, int arg4, int arg5) {
        field5546++;
        if (arg2 == null) {
            return;
        }
        this.method2426(arg4, arg1, (byte) -126);
        this.method2429(arg5, 0, null, arg2, null, arg0 - (this.field5537.method4134((byte) 118, arg2) / 2), 17672, null, 0);
        if (!arg3) {
            field5549 = null;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([IIIILjava/lang/String;IIILjava/util/Random;II[I[Lcw;II)I", line = 639)
    public final int method2435(int[] arg0, int arg1, int arg2, int arg3, String arg4, int arg5, int arg6, int arg7, Random arg8, int arg9, int arg10, int[] arg11, class21[] arg12, int arg13, int arg14) {
        field5543++;
        if (arg4 == null) {
            return 0;
        }
        arg8.setSeed((long) arg3);
        int var16 = (arg8.nextInt() & 0x1F) + 192;
        this.method2426(var16 << 24 | arg1 & 0xFFFFFF, arg7 & 0xFFFFFF | var16 << 24, (byte) -124);
        int var17 = arg4.length();
        int[] var18 = new int[var17];
        int var19 = 0;
        for (int var20 = 0; var20 < var17; var20++) {
            var18[var20] = var19;
            if ((arg8.nextInt() & 0x3) == 0) {
                var19++;
            }
        }
        int var21 = arg13;
        int var22 = this.field5537.field10332 + arg14;
        int var23 = -1;
        if (arg10 == 1) {
            var22 += (arg5 - this.field5537.field10338 - this.field5537.field10332) / 2;
        } else if (arg10 == 2) {
            var22 = arg14 + arg5 - this.field5537.field10338;
        }
        if (arg2 == arg9) {
            var23 = var19 + this.field5537.method4134((byte) 80, arg4);
            var21 = (arg6 - var23) / 2 + arg13;
        } else if (arg2 == 2) {
            var23 = var19 + this.field5537.method4134((byte) 64, arg4);
            var21 = arg6 + arg13 - var23;
        }
        this.method2428(arg0, var18, var22, arg4, true, var21, null, arg12);
        if (arg11 != null) {
            if (var23 == -1) {
                var23 = this.field5537.method4134((byte) -55, arg4) + var19;
            }
            arg11[0] = var21;
            arg11[3] = this.field5537.field10338 + this.field5537.field10332;
            arg11[1] = var22 - this.field5537.field10332;
            arg11[2] = var23;
        }
        return var19;
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Lha;Loq;)V", line = 716)
    public class400(class545 arg0, class742 arg1) {
        this.field5537 = arg1;
        this.field5532 = arg0;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II[Lcw;[IILjava/lang/String;IILjava/util/Random;I)I", line = 726)
    public final int method2436(int arg0, int arg1, class21[] arg2, int[] arg3, int arg4, String arg5, int arg6, int arg7, Random arg8, int arg9) {
        field5548++;
        if (arg5 == null) {
            return 0;
        }
        arg8.setSeed((long) arg1);
        int var11 = (arg8.nextInt() & 0x1F) + 192;
        this.method2426(var11 << 24 | arg4 & 0xFFFFFF, arg0 & 0xFFFFFF | var11 << 24, (byte) -28);
        int var12 = arg5.length();
        if (arg7 != -13575) {
            return -84;
        }
        int[] var13 = new int[var12];
        int var14 = 0;
        for (int var15 = 0; var15 < var12; var15++) {
            var13[var15] = var14;
            if ((arg8.nextInt() & 0x3) == 0) {
                var14++;
            }
        }
        this.method2428(arg3, var13, arg6, arg5, true, arg9, null, arg2);
        return var14;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IILjava/lang/String;[Lcw;III[I)V", line = 770)
    public final void method2437(int arg0, int arg1, String arg2, class21[] arg3, int arg4, int arg5, int arg6, int[] arg7) {
        field5536++;
        if (arg2 != null) {
            this.method2426(arg0, arg6, (byte) -75);
            if (arg5 <= -63) {
                this.method2429(arg4, 0, arg7, arg2, arg3, arg1, 17672, null, 0);
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIILaa;I[IIIIIIILjava/lang/String;[Lcw;III)I", line = 786)
    public final int method2438(int arg0, int arg1, int arg2, class571 arg3, int arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, String arg12, class21[] arg13, int arg14, int arg15, int arg16) {
        field5540++;
        if (arg12 == null) {
            return 0;
        }
        this.method2426(arg11, arg7, (byte) -123);
        if (arg4 == 0) {
            arg4 = this.field5537.field10344;
        }
        int[] var18;
        if (arg8 < (this.field5537.field10332 + this.field5537.field10338 + arg4) && (arg4 + arg4) > arg8) {
            var18 = null;
        } else {
            var18 = new int[] { arg1 };
        }
        int var19 = this.field5537.method4141(arg12, -107, class229.field3186, arg13, var18);
        if (arg2 == -1) {
            arg2 = arg8 / arg4;
            if (arg2 <= 0) {
                arg2 = 1;
            }
        }
        if (arg10 > ~arg2 && arg2 <= var19) {
            var19 = arg2;
            class229.field3186[arg2 - 1] = this.field5537.method4139(class229.field3186[arg2 - 1], arg13, arg1, (byte) -124);
        }
        if (arg0 == 3 && var19 == 1) {
            arg0 = 1;
        }
        int var20;
        if (arg0 == 0) {
            var20 = this.field5537.field10332 + arg14;
        } else if (arg0 == 1) {
            var20 = (arg8 - (this.field5537.field10338 + ((var19 - 1) * arg4) + this.field5537.field10332)) / 2 + this.field5537.field10332 + arg14;
        } else if (arg0 == 2) {
            var20 = arg8 + arg14 - ((var19 - 1) * arg4) - this.field5537.field10338;
        } else {
            int var21 = (arg8 - this.field5537.field10332 - (this.field5537.field10338 - -((var19 - 1) * arg4))) / (var19 + 1);
            if (var21 < 0) {
                var21 = 0;
            }
            arg4 += var21;
            var20 = this.field5537.field10332 + arg14 + var21;
        }
        for (int var22 = 0; var22 < var19; var22++) {
            if (arg6 == 0) {
                this.method2429(var20, arg9, arg5, class229.field3186[var22], arg13, arg16, 17672, arg3, arg15);
            } else if (arg6 == 1) {
                this.method2429(var20, arg9, arg5, class229.field3186[var22], arg13, (arg1 - this.field5537.method4134((byte) -71, class229.field3186[var22])) / 2 + arg16, 17672, arg3, arg15);
            } else if (arg6 == 2) {
                this.method2429(var20, arg9, arg5, class229.field3186[var22], arg13, arg1 + arg16 - this.field5537.method4134((byte) 81, class229.field3186[var22]), 17672, arg3, arg15);
            } else if (var19 - 1 == var22) {
                this.method2429(var20, arg9, arg5, class229.field3186[var22], arg13, arg16, 17672, arg3, arg15);
            } else {
                this.method2430(arg1, 22316, class229.field3186[var22]);
                this.method2429(var20, arg9, arg5, class229.field3186[var22], arg13, arg16, 17672, arg3, arg15);
                class363.field4651 = 0;
            }
            var20 += arg4;
        }
        return var19;
    }

    @OriginalMember(owner = "client!da", name = "fa", descriptor = "(CIIIZ)V")
    public abstract void method296(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(CIIIZLaa;II)V")
    public abstract void method295(char arg0, int arg1, int arg2, int arg3, boolean arg4, class571 arg5, int arg6, int arg7);
}
