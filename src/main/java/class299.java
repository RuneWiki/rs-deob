import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public abstract class class299 {

    @OriginalMember(owner = "client!la", name = "a", descriptor = "Lza;")
    private class497 field4689;

    @OriginalMember(owner = "client!la", name = "A", descriptor = "Laq;")
    private class340 field4715;

    @OriginalMember(owner = "client!la", name = "t", descriptor = "Lss;")
    public static class213 field4708 = new class213("Loaded update list", "Update-Liste geladen.", "Liste des mises à jour chargée", "Lista de atualizações carregada");

    @OriginalMember(owner = "client!la", name = "y", descriptor = "[I")
    public static int[] field4713 = new int[4096];

    @OriginalMember(owner = "client!la", name = "z", descriptor = "Lbi;")
    public static class104 field4714 = new class104(65, 5);

    @OriginalMember(owner = "client!la", name = "b", descriptor = "I")
    public static int field4690;

    @OriginalMember(owner = "client!la", name = "c", descriptor = "I")
    public static int field4691;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "I")
    public static int field4692;

    @OriginalMember(owner = "client!la", name = "e", descriptor = "I")
    public static int field4693;

    @OriginalMember(owner = "client!la", name = "f", descriptor = "I")
    public static int field4694;

    @OriginalMember(owner = "client!la", name = "g", descriptor = "I")
    public static int field4695;

    @OriginalMember(owner = "client!la", name = "h", descriptor = "I")
    public static int field4696;

    @OriginalMember(owner = "client!la", name = "i", descriptor = "I")
    public static int field4697;

    @OriginalMember(owner = "client!la", name = "j", descriptor = "I")
    public static int field4698;

    @OriginalMember(owner = "client!la", name = "k", descriptor = "I")
    public static int field4699;

    @OriginalMember(owner = "client!la", name = "l", descriptor = "I")
    public static int field4700;

    @OriginalMember(owner = "client!la", name = "m", descriptor = "I")
    public static int field4701;

    @OriginalMember(owner = "client!la", name = "n", descriptor = "I")
    public static int field4702;

    @OriginalMember(owner = "client!la", name = "o", descriptor = "I")
    public static int field4703;

    @OriginalMember(owner = "client!la", name = "p", descriptor = "I")
    public static int field4704;

    @OriginalMember(owner = "client!la", name = "q", descriptor = "I")
    public static int field4705;

    @OriginalMember(owner = "client!la", name = "r", descriptor = "I")
    public static int field4706;

    @OriginalMember(owner = "client!la", name = "s", descriptor = "I")
    public static int field4707;

    @OriginalMember(owner = "client!la", name = "u", descriptor = "I")
    public static int field4709;

    @OriginalMember(owner = "client!la", name = "v", descriptor = "I")
    public static int field4710;

    @OriginalMember(owner = "client!la", name = "w", descriptor = "I")
    public static int field4711;

    @OriginalMember(owner = "client!la", name = "x", descriptor = "Z")
    public static boolean field4712;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjava/lang/String;IIIZI)V")
    public final void method2000(int arg0, String arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        field4690++;
        if (!arg5) {
            this.method2008(-32, -27, 92);
        }
        if (arg1 == null) {
            return;
        }
        this.method2008(0, arg3, arg4);
        int var8 = arg1.length();
        int[] var9 = new int[var8];
        int[] var10 = new int[var8];
        for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = (int) (Math.sin((double) arg2 / 5.0D + (double) var11 / 5.0D) * 5.0D);
            var10[var11] = (int) (Math.sin((double) arg2 / 5.0D + (double) var11 / 3.0D) * 5.0D);
        }
        this.method2012(2504, arg6 - (this.field4715.method2252(arg1, 0) / 2), arg1, var9, var10, null, null, arg0);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BLkj;)V")
    public static final void method2001(byte arg0, class55 arg1) {
        if (arg0 >= -53) {
            method2001((byte) 80, null);
        }
        field4707++;
        boolean var2 = false;
        if (class88.field1278 == arg1.field846 || arg1.field840 == -1 || arg1.field836 != 0) {
            var2 = true;
        } else {
            class363 var3 = class388.field5915.method1703(arg1.field840, -12536);
            if (var3.field5598 || var3.field5599[arg1.field875] < (arg1.field826 + 1)) {
                var2 = true;
            }
        }
        if (var2) {
            int var4 = arg1.field846 - arg1.field796;
            int var5 = class88.field1278 - arg1.field796;
            int var6 = arg1.field821 * 128 + arg1.method415(-4) * 64;
            int var7 = arg1.field870 * 128 + arg1.method415(-4) * 64;
            int var8 = arg1.field835 * 128 + arg1.method415(-4) * 64;
            int var9 = arg1.field868 * 128 + arg1.method415(-4) * 64;
            arg1.field6417 = ((var4 - var5) * var6 + (var5 * var8)) / var4;
            arg1.field6410 = ((var4 - var5) * var7 + var5 * var9) / var4;
        }
        arg1.field900 = 0;
        if (arg1.field811 == 0) {
            arg1.method426(false, 8192, (byte) -111);
        }
        if (arg1.field811 == 1) {
            arg1.method426(false, 12288, (byte) -111);
        }
        if (arg1.field811 == 2) {
            arg1.method426(false, 0, (byte) -111);
        }
        if (arg1.field811 == 3) {
            arg1.method426(false, 4096, (byte) -111);
        }
    }

    @OriginalMember(owner = "client!la", name = "B", descriptor = "(CIIIZ)V")
    public abstract void method68(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BLqg;)Z")
    public static final boolean method2002(byte arg0, class210 arg1) {
        if (arg0 != -84) {
            method2010(-59, null, -45, null, -14, 89, 55, null);
        }
        field4709++;
        if (arg1 == null) {
            return false;
        } else if (!arg1.field3260) {
            return false;
        } else if (!arg1.method1489((byte) -128, class194.field2867)) {
            return false;
        } else if (class7.field82.method1122((byte) 59, (long) arg1.field3233) == null) {
            return class136.field1848.method1122((byte) 59, (long) arg1.field3272) == null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IILjava/lang/String;)V")
    private final void method2003(int arg0, int arg1, String arg2) {
        field4698++;
        int var4 = 0;
        boolean var5 = false;
        if (arg0 > -49) {
            field4708 = null;
        }
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
        if (var4 > 0) {
            class407.field6166 = (arg1 - this.field4715.method2252(arg2, 0) << 8) / var4;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I[I[Lo;IILjava/lang/String;IILta;)V")
    private final void method2004(int arg0, int[] arg1, class139[] arg2, int arg3, int arg4, String arg5, int arg6, int arg7, class453 arg8) {
        if (arg3 != 1) {
            this.field4689 = null;
        }
        field4699++;
        int var10 = arg6 - this.field4715.field5302;
        int var11 = -1;
        int var12 = -1;
        int var13 = arg5.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class345.method2283(23251, arg5.charAt(var14)) & 0xFF);
            if (var15 == '<') {
                var11 = var14;
            } else {
                if (var15 == '>' && var11 != -1) {
                    String var16 = arg5.substring(var11 + 1, var14);
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
                                    int var17 = class170.method1078(-105, var16.substring(4));
                                    class139 var18 = arg2[var17];
                                    int var19 = arg1 == null ? var18.method618() : arg1[var17];
                                    if ((class409.field6201 & 0xFF000000) == -16777216) {
                                        var18.method620(arg0, var10 + this.field4715.field5302 - var19, 1, 0, 1);
                                    } else {
                                        var18.method620(arg0, var10 + this.field4715.field5302 - var19, 0, class409.field6201 & 0xFF000000 | 0xFFFFFF, 1);
                                    }
                                    var12 = -1;
                                    arg0 += arg2[var17].method623();
                                } catch (Exception var21) {
                                }
                            } else {
                                this.method2015((byte) -21, var16);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var11 == -1) {
                    if (var12 != -1) {
                        arg0 += this.field4715.method2257(var15, 47, var12);
                    }
                    if (var15 == ' ') {
                        if (class407.field6166 > 0) {
                            class414.field6278 += class407.field6166;
                            arg0 += class414.field6278 >> 8;
                            class414.field6278 &= 0xFF;
                        }
                    } else if (arg8 == null) {
                        if ((class502.field7529 & 0xFF000000) != 0) {
                            this.method68(var15, arg0 + 1, var10 + 1, class502.field7529, true);
                        }
                        this.method68(var15, arg0, var10, class409.field6201, false);
                    } else {
                        if ((class502.field7529 & 0xFF000000) != 0) {
                            this.method70(var15, arg0 + 1, var10 + 1, class502.field7529, true, arg8, arg4, arg7);
                        }
                        this.method70(var15, arg0, var10, class409.field6201, false, arg8, arg4, arg7);
                    }
                    int var20 = this.field4715.method2256(var15, (byte) 106);
                    if (class261.field4214 != -1) {
                        this.field4689.method3046((int) ((double) this.field4715.field5302 * 0.7D) + var10, class261.field4214, arg0, 2, var20);
                    }
                    if (class460.field7087 != -1) {
                        this.field4689.method3046(this.field4715.field5302 + var10 + 1, class460.field7087, arg0, 2, var20);
                    }
                    arg0 += var20;
                    var12 = var15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IBIIILjava/lang/String;)V")
    public final void method2005(int arg0, byte arg1, int arg2, int arg3, int arg4, String arg5) {
        field4702++;
        if (arg5 == null) {
            return;
        }
        this.method2008(0, arg3, arg0);
        this.method2004(arg2 - this.field4715.method2252(arg5, 0), null, null, 1, 0, arg5, arg4, 0, null);
        if (arg1 != 25) {
            method2001((byte) -128, null);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;IIIZI)V")
    public final void method2006(String arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field4700++;
        if (!arg4) {
            field4708 = null;
        }
        if (arg0 != null) {
            this.method2008(0, arg5, arg3);
            this.method2004(arg1 - (this.field4715.method2252(arg0, 0) / 2), null, null, 1, 0, arg0, arg2, 0, null);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIZIIILjava/lang/String;)V")
    public final void method2007(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, String arg6) {
        field4704++;
        if (arg6 == null) {
            return;
        }
        this.method2008(0, arg5, arg1);
        if (!arg2) {
            field4714 = null;
        }
        int var8 = arg6.length();
        int[] var9 = new int[var8];
        for (int var10 = 0; var10 < var8; var10++) {
            var9[var10] = (int) (Math.sin((double) arg3 / 5.0D + (double) var10 / 2.0D) * 5.0D);
        }
        this.method2012(2504, arg4 - this.field4715.method2252(arg6, 0) / 2, arg6, null, var9, null, null, arg0);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(III)V")
    private final void method2008(int arg0, int arg1, int arg2) {
        class261.field4214 = -1;
        class500.field7509 = arg2;
        class409.field6201 = arg2;
        if (arg1 == -1) {
            arg1 = 0;
        }
        field4697++;
        class460.field7087 = -1;
        class407.field6166 = arg0;
        class414.field6278 = 0;
        class348.field5402 = arg1;
        class502.field7529 = arg1;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IILjava/lang/String;IZI)V")
    public final void method2009(int arg0, int arg1, String arg2, int arg3, boolean arg4, int arg5) {
        field4705++;
        if (arg2 == null) {
            return;
        }
        this.method2008(0, arg1, arg0);
        if (arg4) {
            field4713 = null;
        }
        this.method2004(arg3, null, null, 1, 0, arg2, arg5, 0, null);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ILo;ILgi;IIILta;)V")
    public static final void method2010(int arg0, class139 arg1, int arg2, class437 arg3, int arg4, int arg5, int arg6, class453 arg7) {
        field4706++;
        if (arg1 == null) {
            return;
        }
        int var8;
        if (class334.field5222 == 4) {
            var8 = (int) class388.field5918 & 0x3FFF;
        } else {
            var8 = (int) class388.field5918 + class386.field5903 & 0x3FFF;
        }
        int var9 = Math.max(arg3.field6615 / 2, arg3.field6730 / 2) + 10;
        int var10 = arg2 * arg2 + arg6 * arg6;
        if (var10 > (var9 * var9)) {
            return;
        }
        int var11 = class147.field1988[var8];
        if (arg5 < 12) {
            field4712 = true;
        }
        int var12 = class147.field1986[var8];
        if (class334.field5222 != 4) {
            var12 = var12 * 256 / (class326.field5126 + 256);
            var11 = var11 * 256 / (class326.field5126 + 256);
        }
        int var13 = arg2 * var12 + arg6 * var11 >> 15;
        int var14 = arg6 * var12 - (arg2 * var11) >> 15;
        arg1.method632(arg3.field6615 / 2 + arg4 + var13 - arg1.method623() / 2, arg3.field6730 / 2 + arg0 + (-var14 - arg1.method618() / 2), arg7, arg4, arg0);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;BILjava/lang/String;)I")
    public static final int method2011(String arg0, byte arg1, int arg2, String arg3) {
        field4701++;
        int var4 = arg3.length();
        int var5 = arg0.length();
        int var6 = 0;
        int var7 = 0;
        char var8 = 0;
        char var9 = 0;
        while (var4 > (var6 - var8) || var5 > (var7 - var9)) {
            if (var4 <= var6 - var8) {
                return -1;
            }
            if (var7 - var9 >= var5) {
                return 1;
            }
            char var22;
            if (var8 == '\u0000') {
                var22 = arg3.charAt(var6++);
            } else {
                var22 = var8;
                boolean var23 = false;
            }
            char var24;
            if (var9 == '\u0000') {
                var24 = arg0.charAt(var7++);
            } else {
                var24 = var9;
                boolean var25 = false;
            }
            var8 = class153.method933(var22, (byte) 104);
            var9 = class153.method933(var24, (byte) 78);
            char var26 = class528.method3143(arg2, var22, -19172);
            char var27 = class528.method3143(arg2, var24, -19172);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class318.method2128(arg2, arg1 ^ 0x42, var28) - class318.method2128(arg2, 0, var29);
                }
            }
        }
        int var10 = Math.min(var4, var5);
        for (int var11 = 0; var11 < var10; var11++) {
            int var16;
            int var17;
            if (arg2 == 2) {
                var16 = var5 - var11 - 1;
                var17 = var4 - var11 - 1;
            } else {
                var16 = var11;
                var17 = var11;
            }
            char var18 = arg3.charAt(var17);
            char var19 = arg0.charAt(var16);
            if (var18 != var19 && Character.toUpperCase(var18) != Character.toUpperCase(var19)) {
                char var20 = Character.toLowerCase(var18);
                char var21 = Character.toLowerCase(var19);
                if (var20 != var21) {
                    return class318.method2128(arg2, arg1 ^ 0x42, var20) - class318.method2128(arg2, arg1 - 66, var21);
                }
            }
        }
        int var12 = var4 - var5;
        if (var12 != 0) {
            return var12;
        } else if (arg1 == 66) {
            for (int var13 = 0; var13 < var10; var13++) {
                char var14 = arg3.charAt(var13);
                char var15 = arg0.charAt(var13);
                if (var14 != var15) {
                    return class318.method2128(arg2, 0, var14) - class318.method2128(arg2, 0, var15);
                }
            }
            return 0;
        } else {
            return -118;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IILjava/lang/String;[I[I[I[Lo;I)V")
    private final void method2012(int arg0, int arg1, String arg2, int[] arg3, int[] arg4, int[] arg5, class139[] arg6, int arg7) {
        int var9 = arg7 - this.field4715.field5302;
        if (arg0 != 2504) {
            return;
        }
        field4703++;
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        int var13 = arg2.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class345.method2283(23251, arg2.charAt(var14)) & 0xFF);
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
                                    if (arg3 == null) {
                                        var17 = 0;
                                    } else {
                                        var17 = arg3[var12];
                                    }
                                    int var18;
                                    if (arg4 == null) {
                                        var18 = 0;
                                    } else {
                                        var18 = arg4[var12];
                                    }
                                    var12++;
                                    int var19 = class170.method1078(-94, var16.substring(4));
                                    class139 var20 = arg6[var19];
                                    int var21 = arg5 == null ? var20.method618() : arg5[var19];
                                    var20.method620(arg1 + var17, -var21 + var9 + this.field4715.field5302 + var18, 1, 0, 1);
                                    var11 = -1;
                                    arg1 += arg6[var19].method623();
                                } catch (Exception var25) {
                                }
                            } else {
                                this.method2015((byte) -59, var16);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var10 == -1) {
                    if (var11 != -1) {
                        arg1 += this.field4715.method2257(var15, 93, var11);
                    }
                    int var22;
                    if (arg3 == null) {
                        var22 = 0;
                    } else {
                        var22 = arg3[var12];
                    }
                    int var23;
                    if (arg4 == null) {
                        var23 = 0;
                    } else {
                        var23 = arg4[var12];
                    }
                    var12++;
                    if (var15 != ' ') {
                        if ((class502.field7529 & 0xFF000000) != 0) {
                            this.method68(var15, arg1 + var22 + 1, var9 - (-1 - var23), class502.field7529, true);
                        }
                        this.method68(var15, arg1 + var22, var9 + var23, class409.field6201, false);
                    } else if (class407.field6166 > 0) {
                        class414.field6278 += class407.field6166;
                        arg1 += class414.field6278 >> 8;
                        class414.field6278 &= 0xFF;
                    }
                    int var24 = this.field4715.method2256(var15, (byte) 29);
                    if (class261.field4214 != -1) {
                        this.field4689.method3046((int) ((double) this.field4715.field5302 * 0.7D) + var9, class261.field4214, arg1, 2, var24);
                    }
                    if (class460.field7087 != -1) {
                        this.field4689.method3046(var9 + this.field4715.field5302, class460.field7087, arg1, 2, var24);
                    }
                    var11 = var15;
                    arg1 += var24;
                }
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(II)Z")
    public static final boolean method2013(int arg0, int arg1) {
        if (arg1 < 45) {
            return false;
        } else {
            field4710++;
            return arg0 >= 12 && arg0 <= 17;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIIILta;I[II[Lo;Ljava/lang/String;IIII)I")
    public final int method2014(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class453 arg6, int arg7, int[] arg8, int arg9, class139[] arg10, String arg11, int arg12, int arg13, int arg14, int arg15) {
        if (arg0 > -62) {
            field4713 = null;
        }
        field4695++;
        return this.method2019(arg6, arg15, arg11, arg12, arg9, arg10, arg8, arg5, arg3, arg4, arg14, 499, 0, arg2, arg7, arg1, arg13);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BLjava/lang/String;)V")
    private final void method2015(byte arg0, String arg1) {
        field4696++;
        try {
            if (arg1.startsWith("col=")) {
                class409.field6201 = class409.field6201 & 0xFF000000 | class349.method2304(16, arg1.substring(4), 0) & 0xFFFFFF;
            } else if (arg1.equals("/col")) {
                class409.field6201 = class500.field7509 & 0xFFFFFF | class409.field6201 & 0xFF000000;
            }
            if (arg1.startsWith("argb=")) {
                class409.field6201 = class349.method2304(16, arg1.substring(5), 0);
            } else if (arg1.equals("/argb")) {
                class409.field6201 = class500.field7509;
            } else if (arg1.startsWith("str=")) {
                class261.field4214 = class409.field6201 & 0xFF000000 | class349.method2304(16, arg1.substring(4), 0);
            } else if (arg1.equals("str")) {
                class261.field4214 = class409.field6201 & 0xFF000000 | 0x800000;
            } else if (arg1.equals("/str")) {
                class261.field4214 = -1;
            } else if (arg1.startsWith("u=")) {
                class460.field7087 = class409.field6201 & 0xFF000000 | class349.method2304(16, arg1.substring(2), 0);
            } else if (arg1.equals("u")) {
                class460.field7087 = class409.field6201 & 0xFF000000;
            } else if (arg1.equals("/u")) {
                class460.field7087 = -1;
            } else if (arg1.equalsIgnoreCase("shad=-1")) {
                class502.field7529 = 0;
            } else if (arg1.startsWith("shad=")) {
                class502.field7529 = class409.field6201 & 0xFF000000 | class349.method2304(16, arg1.substring(5), 0);
            } else if (arg1.equals("shad")) {
                class502.field7529 = class409.field6201 & 0xFF000000;
            } else if (arg1.equals("/shad")) {
                class502.field7529 = class348.field5402;
            } else if (arg1.equals("br")) {
                this.method2008(0, class348.field5402, class500.field7509);
            }
            if (arg0 >= -17) {
                this.method2021(null, 75, (byte) 121, null, null, -62, 13, -96, null, 54);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(III[Lo;IILjava/lang/String;I[II[ILjava/util/Random;III)I")
    public final int method2016(int arg0, int arg1, int arg2, class139[] arg3, int arg4, int arg5, String arg6, int arg7, int[] arg8, int arg9, int[] arg10, Random arg11, int arg12, int arg13, int arg14) {
        field4693++;
        if (arg6 == null) {
            return 0;
        }
        arg11.setSeed((long) arg13);
        int var16 = (arg11.nextInt() & 0x1F) + 192;
        this.method2008(0, arg1 & 0xFFFFFF | var16 << 24, arg2 & 0xFFFFFF | var16 << 24);
        int var17 = arg6.length();
        if (arg12 <= 7) {
            method2018((byte) 109);
        }
        int[] var18 = new int[var17];
        int var19 = 0;
        for (int var20 = 0; var20 < var17; var20++) {
            var18[var20] = var19;
            if ((arg11.nextInt() & 0x3) == 0) {
                var19++;
            }
        }
        int var21 = arg4;
        int var22 = arg14 + this.field4715.field5304;
        int var23 = -1;
        if (arg5 == 1) {
            var22 += (arg9 - this.field4715.field5304 - this.field4715.field5295) / 2;
        } else if (arg5 == 2) {
            var22 = arg9 + arg14 - this.field4715.field5295;
        }
        if (arg7 == 1) {
            var23 = this.field4715.method2252(arg6, 0) + var19;
            var21 = (arg0 - var23) / 2 + arg4;
        } else if (arg7 == 2) {
            var23 = var19 + this.field4715.method2252(arg6, 0);
            var21 = arg0 + arg4 - var23;
        }
        this.method2012(2504, var21, arg6, var18, null, arg8, arg3, var22);
        if (arg10 != null) {
            if (var23 == -1) {
                var23 = this.field4715.method2252(arg6, 0) + var19;
            }
            arg10[3] = this.field4715.field5304 + this.field4715.field5295;
            arg10[1] = var22 - this.field4715.field5304;
            arg10[0] = var21;
            arg10[2] = var23;
        }
        return var19;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BI[IIILjava/lang/String;[Lo;I)V")
    public final void method2017(byte arg0, int arg1, int[] arg2, int arg3, int arg4, String arg5, class139[] arg6, int arg7) {
        field4692++;
        if (arg5 == null) {
            return;
        }
        this.method2008(0, arg7, arg4);
        this.method2004(arg3, arg2, arg6, 1, 0, arg5, arg1, 0, null);
        if (arg0 != -23) {
            this.field4689 = null;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(B)V")
    public static void method2018(byte arg0) {
        if (arg0 != -84) {
            method2018((byte) 112);
        }
        field4708 = null;
        field4714 = null;
        field4713 = null;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(CIIIZLta;II)V")
    public abstract void method70(char arg0, int arg1, int arg2, int arg3, boolean arg4, class453 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Lta;ILjava/lang/String;II[Lo;[IIIIIIIIIII)I")
    public final int method2019(class453 arg0, int arg1, String arg2, int arg3, int arg4, class139[] arg5, int[] arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16) {
        field4691++;
        if (arg2 == null) {
            return 0;
        }
        this.method2008(0, arg4, arg8);
        if (arg3 == 0) {
            arg3 = this.field4715.field5302;
        }
        int[] var18;
        if ((this.field4715.field5304 + arg3 + this.field4715.field5295) > arg15 && arg15 < (arg3 + arg3)) {
            var18 = null;
        } else {
            var18 = new int[] { arg9 };
        }
        int var19 = this.field4715.method2260(arg2, 215, arg5, class161.field2303, var18);
        if (arg12 == -1) {
            arg12 = arg15 / arg3;
            if (arg12 <= 0) {
                arg12 = 1;
            }
        }
        if (arg12 > 0 && arg12 <= var19) {
            class161.field2303[arg12 - 1] = this.field4715.method2251(arg5, class161.field2303[arg12 - 1], arg9, 0);
            var19 = arg12;
        }
        if (arg14 == 3 && var19 == 1) {
            arg14 = 1;
        }
        int var20;
        if (arg14 == 0) {
            var20 = arg16 + this.field4715.field5304;
        } else if (arg14 == 1) {
            var20 = (arg15 - this.field4715.field5304 - this.field4715.field5295 - ((var19 - 1) * arg3)) / 2 + this.field4715.field5304 + arg16;
        } else if (arg14 == 2) {
            var20 = arg16 + arg15 - ((var19 + -1) * arg3) - this.field4715.field5295;
        } else {
            int var21 = (arg15 - (this.field4715.field5304 + this.field4715.field5295 + ((var19 + -1) * arg3))) / (var19 + 1);
            if (var21 < 0) {
                var21 = 0;
            }
            var20 = this.field4715.field5304 + arg16 + var21;
            arg3 += var21;
        }
        int var22 = 0;
        if (arg11 != 499) {
            return 3;
        }
        while (var19 > var22) {
            if (arg13 == 0) {
                this.method2004(arg7, arg6, arg5, arg11 ^ 0x1F2, arg10, class161.field2303[var22], var20, arg1, arg0);
            } else if (arg13 == 1) {
                this.method2004(arg7 + ((arg9 - this.field4715.method2252(class161.field2303[var22], 0)) / 2), arg6, arg5, 1, arg10, class161.field2303[var22], var20, arg1, arg0);
            } else if (arg13 == 2) {
                this.method2004(arg7 + arg9 - this.field4715.method2252(class161.field2303[var22], 0), arg6, arg5, 1, arg10, class161.field2303[var22], var20, arg1, arg0);
            } else if ((var19 - 1) == var22) {
                this.method2004(arg7, arg6, arg5, 1, arg10, class161.field2303[var22], var20, arg1, arg0);
            } else {
                this.method2003(-107, arg9, class161.field2303[var22]);
                this.method2004(arg7, arg6, arg5, 1, arg10, class161.field2303[var22], var20, arg1, arg0);
                class407.field6166 = 0;
            }
            var20 += arg3;
            var22++;
        }
        return var19;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjava/lang/String;IIIIII)V")
    public final void method2020(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4694++;
        if (arg1 == null) {
            return;
        }
        this.method2008(0, arg0, arg4);
        double var9 = 7.0D - (double) arg3 / 8.0D;
        if (var9 < 0.0D) {
            var9 = 0.0D;
        }
        int var11 = arg1.length();
        int[] var12 = new int[var11];
        int var13 = 0;
        if (arg2 > -35) {
            this.method2019(null, 31, null, -12, -119, null, null, 38, -103, 67, 86, -70, -91, -32, 44, 64, -114);
        }
        while (var13 < var11) {
            var12[var13] = (int) (Math.sin((double) var13 / 1.5D + (double) arg7) * var9);
            var13++;
        }
        this.method2012(2504, arg6 - this.field4715.method2252(arg1, 0) / 2, arg1, null, var12, null, null, arg5);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/util/Random;IB[Lo;[IIIILjava/lang/String;I)I")
    public final int method2021(Random arg0, int arg1, byte arg2, class139[] arg3, int[] arg4, int arg5, int arg6, int arg7, String arg8, int arg9) {
        field4711++;
        if (arg8 == null) {
            return 0;
        }
        arg0.setSeed((long) arg1);
        int var11 = (arg0.nextInt() & 0x1F) + 192;
        this.method2008(0, arg5 & 0xFFFFFF | var11 << 24, arg7 & 0xFFFFFF | var11 << 24);
        int var12 = arg8.length();
        int[] var13 = new int[var12];
        int var14 = -114 / ((arg2 - 6) / 51);
        int var15 = 0;
        for (int var16 = 0; var16 < var12; var16++) {
            var13[var16] = var15;
            if ((arg0.nextInt() & 0x3) == 0) {
                var15++;
            }
        }
        this.method2012(2504, arg9, arg8, var13, null, arg4, arg3, arg6);
        return var15;
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lza;Laq;)V")
    public class299(class497 arg0, class340 arg1) {
        this.field4689 = arg0;
        this.field4715 = arg1;
    }
}
