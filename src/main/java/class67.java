import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public abstract class class67 {

    @OriginalMember(owner = "client!da", name = "v", descriptor = "Llq;")
    private class578 field721;

    @OriginalMember(owner = "client!da", name = "u", descriptor = "Lha;")
    private class66 field714;

    @OriginalMember(owner = "client!da", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field722 = new String[] { method616(method615("XJ0:")), method616(method615("R^r\u0004N")), method616(method615("M\u0011rx\u001b")), method616(method615("R^r\u0014'\u001e")), method616(method615("R^r\u0000N")), method616(method615("EW=2")), method616(method615("TM")), method616(method615("C\u0002")), method616(method615("EK.k")), method616(method615("UP0k")), method616(method615("\u0019L47\u0002")), method616(method615("EW=2[")), method616(method615("EW=2[\u001b\u000e")), method616(method615("WM;4[")), method616(method615("EK.")), method616(method615("\u0019\\3:")), method616(method615("\u0019J")), method616(method615("R^r\u0003N")), method616(method615("\u0019L($")), method616(method615("\u0019^.1\u0004")), method616(method615("R^r\u0002N")), method616(method615("R^r\u001fN")), method616(method615("R^r\u0011N")), method616(method615("R^r\u001cN")), method616(method615("R^rj\u000fXV(hN")), method616(method615("R^r\u001dN")), method616(method615("R^r\u0010N")), method616(method615("R^r\u0007N")), method616(method615("R^r\u0017'\u001e")), method616(method615("R^r\u001bN")), method616(method615("R^r\u0001N")), method616(method615("BV13\u0015")), method616(method615("EW%")), method616(method615("QK")), method616(method615("SJ.9")), method616(method615("UP,/")), method616(method615("X]/&")), method616(method615("R^r\u0018N")), method616(method615("ZK")), method616(method615("DZ;")), method616(method615("_R;k")), method616(method615("R^r\u001eN")), method616(method615("R^r\u0019N")), method616(method615("R^r\u0006N")), method616(method615("R^r\u001aN")) };

    @OriginalMember(owner = "client!da", name = "c", descriptor = "Lvaa;")
    public static class494 field710 = new class494(6, 1);

    @OriginalMember(owner = "client!da", name = "d", descriptor = "Lel;")
    public static class573 field720 = new class573(74, 5);

    @OriginalMember(owner = "client!da", name = "j", descriptor = "I")
    public static int field699;

    @OriginalMember(owner = "client!da", name = "i", descriptor = "I")
    public static int field700;

    @OriginalMember(owner = "client!da", name = "o", descriptor = "I")
    public static int field701;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "I")
    public static int field702;

    @OriginalMember(owner = "client!da", name = "r", descriptor = "I")
    public static int field703;

    @OriginalMember(owner = "client!da", name = "g", descriptor = "I")
    public static int field704;

    @OriginalMember(owner = "client!da", name = "p", descriptor = "I")
    public static int field706;

    @OriginalMember(owner = "client!da", name = "m", descriptor = "I")
    public static int field707;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "I")
    public static int field708;

    @OriginalMember(owner = "client!da", name = "s", descriptor = "I")
    public static int field709;

    @OriginalMember(owner = "client!da", name = "l", descriptor = "I")
    public static int field711;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "I")
    public static int field712;

    @OriginalMember(owner = "client!da", name = "q", descriptor = "I")
    public static int field713;

    @OriginalMember(owner = "client!da", name = "k", descriptor = "I")
    public static int field715;

    @OriginalMember(owner = "client!da", name = "h", descriptor = "I")
    public static int field716;

    @OriginalMember(owner = "client!da", name = "f", descriptor = "I")
    public static int field717;

    @OriginalMember(owner = "client!da", name = "t", descriptor = "I")
    public static int field718;

    @OriginalMember(owner = "client!da", name = "n", descriptor = "I")
    public static int field719;

    @OriginalMember(owner = "client!da", name = "w", descriptor = "Lcn;")
    public static class541 field705;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IILjava/lang/String;III)V", line = 3)
    public final void method596(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5) {
        try {
            field701++;
            if (arg2 != null && arg1 == 31) {
                this.method600(arg1 ^ 0x66, arg4, arg0);
                this.method601(null, null, arg5, 0, -15634, arg3, 0, arg2, null);
            }
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field722[21] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field722[0] : field722[2]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIILjava/lang/String;III)V", line = 20)
    public final void method597(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5, int arg6) {
        try {
            field719++;
            if (arg3 != null) {
                this.method600(arg6 + 24860, arg0, arg5);
                if (arg6 != -24786) {
                    field720 = null;
                }
                int var8 = arg3.length();
                int[] var9 = new int[var8];
                for (int var10 = 0; var10 < var8; var10++) {
                    var9[var10] = (int) (Math.sin((double) arg1 / 5.0D + (double) var10 / 2.0D) * 5.0D);
                }
                this.method606(null, null, arg4, arg2 - (this.field721.method4322(256, arg3) / 2), -1, arg3, var9, null);
            }
        } catch (RuntimeException var12) {
            throw class759.method5498(var12, field722[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field722[0] : field722[2]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIB[Lfs;ILjava/lang/String;I[IIILaa;II)I", line = 47)
    public final int method598(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, class581[] arg6, int arg7, String arg8, int arg9, int[] arg10, int arg11, int arg12, class512 arg13, int arg14, int arg15) {
        try {
            field711++;
            return arg5 > -9 ? 90 : this.method614(arg6, 97, arg15, arg4, arg8, arg0, arg12, arg7, arg14, arg1, arg9, arg11, arg3, 0, arg2, arg13, arg10);
        } catch (RuntimeException var18) {
            throw class759.method5498(var18, field722[28] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 == null ? field722[0] : field722[2]) + ',' + arg7 + ',' + (arg8 == null ? field722[0] : field722[2]) + ',' + arg9 + ',' + (arg10 == null ? field722[0] : field722[2]) + ',' + arg11 + ',' + arg12 + ',' + (arg13 == null ? field722[0] : field722[2]) + ',' + arg14 + ',' + arg15 + ')');
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIILjava/lang/String;II)V", line = 58)
    public final void method599(int arg0, int arg1, int arg2, int arg3, String arg4, int arg5, int arg6) {
        try {
            field717++;
            if (arg4 != null) {
                this.method600(94, arg6, arg0);
                int var8 = arg4.length();
                int var9 = 69 % ((53 - arg3) / 59);
                int[] var10 = new int[var8];
                int[] var11 = new int[var8];
                for (int var12 = 0; var12 < var8; var12++) {
                    var10[var12] = (int) (Math.sin((double) arg1 / 5.0D + (double) var12 / 5.0D) * 5.0D);
                    var11[var12] = (int) (Math.sin((double) arg1 / 5.0D + (double) var12 / 3.0D) * 5.0D);
                }
                this.method606(var10, null, arg5, arg2 - (this.field721.method4322(256, arg4) / 2), -1, arg4, var11, null);
            }
        } catch (RuntimeException var14) {
            throw class759.method5498(var14, field722[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 == null ? field722[0] : field722[2]) + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(III)V", line = 88)
    private final void method600(int arg0, int arg1, int arg2) {
        try {
            class331.field5196 = 0;
            if (arg2 == -1) {
                arg2 = 0;
            }
            class424.field6256 = -1;
            if (arg0 <= 59) {
                field705 = null;
            }
            class653.field9441 = -1;
            class535.field7833 = 0;
            class384.field5816 = arg1;
            class646.field9358 = arg1;
            field707++;
            class69.field747 = arg2;
            class428.field6289 = arg2;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field722[20] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([ILaa;IIIIILjava/lang/String;[Lfs;)V", line = 109)
    private final void method601(int[] arg0, class512 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, String arg7, class581[] arg8) {
        try {
            if (arg4 != -15634) {
                this.method603(null, null, false, null, 91, 62, -94, 108, null, -80);
            }
            int var23 = arg5 - this.field721.field8584;
            field709++;
            int var10 = -1;
            int var11 = -1;
            int var12 = arg7.length();
            for (int var13 = 0; var13 < var12; var13++) {
                char var14 = (char) (class513.method3867(7635, arg7.charAt(var13)) & 0xFF);
                if (var14 == '<') {
                    var10 = var13;
                } else {
                    if (var14 == '>' && var10 != -1) {
                        String var15 = arg7.substring(var10 + 1, var13);
                        var10 = -1;
                        if (var15.equals(field722[38])) {
                            var14 = '<';
                        } else if (var15.equals(field722[33])) {
                            var14 = '>';
                        } else if (var15.equals(field722[36])) {
                            var14 = ' ';
                        } else if (var15.equals(field722[32])) {
                            var14 = '\u00AD';
                        } else if (var15.equals(field722[31])) {
                            var14 = '×';
                        } else if (var15.equals(field722[34])) {
                            var14 = '€';
                        } else if (var15.equals(field722[35])) {
                            var14 = '©';
                        } else {
                            if (!var15.equals(field722[39])) {
                                if (var15.startsWith(field722[40])) {
                                    try {
                                        int var16 = class244.method2078(-7431, var15.substring(4));
                                        class581 var17 = arg8[var16];
                                        int var18 = arg0 == null ? var17.method997() : arg0[var16];
                                        if ((class646.field9358 & 0xFF000000) == -16777216) {
                                            var17.method999(arg2, this.field721.field8584 + var23 - var18, 1, 0, 1);
                                        } else {
                                            var17.method999(arg2, this.field721.field8584 + var23 - var18, 0, class646.field9358 & 0xFF000000 | 0xFFFFFF, 1);
                                        }
                                        arg2 += arg8[var16].method988();
                                        var11 = -1;
                                    } catch (Exception var21) {
                                    }
                                } else {
                                    this.method613(var15, arg4 ^ 0xFFFFC2BB);
                                }
                                continue;
                            }
                            var14 = '®';
                        }
                    }
                    if (var10 == -1) {
                        if (var11 != -1) {
                            arg2 += this.field721.method4319(var14, var11, 0);
                        }
                        if (var14 == ' ') {
                            if (class535.field7833 > 0) {
                                class331.field5196 += class535.field7833;
                                arg2 += class331.field5196 >> 8;
                                class331.field5196 &= 0xFF;
                            }
                        } else if (arg1 == null) {
                            if ((class428.field6289 & 0xFF000000) != 0) {
                                this.method132(var14, arg2 + 1, var23 + 1, class428.field6289, true);
                            }
                            this.method132(var14, arg2, var23, class646.field9358, false);
                        } else {
                            if ((class428.field6289 & 0xFF000000) != 0) {
                                this.method129(var14, arg2 + 1, var23 + 1, class428.field6289, true, arg1, arg3, arg6);
                            }
                            this.method129(var14, arg2, var23, class646.field9358, false, arg1, arg3, arg6);
                        }
                        int var19 = this.field721.method4320(var14, (byte) -2);
                        if (class424.field6256 != -1) {
                            this.field714.method564(class424.field6256, (byte) 88, var19, arg2, var23 + ((int) ((double) this.field721.field8584 * 0.7D)));
                        }
                        if (class653.field9441 != -1) {
                            this.field714.method564(class653.field9441, (byte) 88, var19, arg2, this.field721.field8584 + var23 + 1);
                        }
                        arg2 += var19;
                        var11 = var14;
                    }
                }
            }
        } catch (RuntimeException var22) {
            throw class759.method5498(var22, field722[44] + (arg0 == null ? field722[0] : field722[2]) + ',' + (arg1 == null ? field722[0] : field722[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 == null ? field722[0] : field722[2]) + ',' + (arg8 == null ? field722[0] : field722[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lib;II)V", line = 261)
    public static final void method602(class163 arg0, int arg1, int arg2) {
        try {
            field706++;
            if (class605.field8870 != null) {
                try {
                    class605.field8870.method3438(0L, (byte) 85);
                    class605.field8870.method3440(arg1, (byte) 22, arg0.field2209, 24);
                } catch (Exception var5) {
                }
            }
            int var3 = 67 / ((-arg2 - 21) / 32);
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field722[27] + (arg0 == null ? field722[0] : field722[2]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/util/Random;Ljava/lang/String;Z[IIIII[Lfs;I)I", line = 281)
    public final int method603(Random arg0, String arg1, boolean arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, class581[] arg8, int arg9) {
        try {
            field708++;
            if (arg1 == null) {
                return 0;
            }
            arg0.setSeed((long) arg6);
            int var11 = (arg0.nextInt() & 0x1F) + 192;
            this.method600(104, arg5 & 0xFFFFFF | var11 << 24, var11 << 24 | arg9 & 0xFFFFFF);
            int var12 = arg1.length();
            if (arg2) {
                this.field714 = null;
            }
            int[] var13 = new int[var12];
            int var14 = 0;
            for (int var15 = 0; var15 < var12; var15++) {
                var13[var15] = var14;
                if ((arg0.nextInt() & 0x3) == 0) {
                    var14++;
                }
            }
            this.method606(var13, arg3, arg4, arg7, -1, arg1, null, arg8);
            return var14;
        } catch (RuntimeException var17) {
            throw class759.method5498(var17, field722[22] + (arg0 == null ? field722[0] : field722[2]) + ',' + (arg1 == null ? field722[0] : field722[2]) + ',' + arg2 + ',' + (arg3 == null ? field722[0] : field722[2]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + (arg8 == null ? field722[0] : field722[2]) + ',' + arg9 + ')');
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BLjava/lang/String;I)V", line = 319)
    private final void method604(byte arg0, String arg1, int arg2) {
        try {
            field700++;
            int var4 = 0;
            boolean var5 = false;
            if (arg0 <= -15) {
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
                    class535.field7833 = (arg2 - this.field721.method4322(256, arg1) << 8) / var4;
                }
            }
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field722[23] + arg0 + ',' + (arg1 == null ? field722[0] : field722[2]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/lang/String;[I[Lfs;IIII)V", line = 359)
    public final void method605(int arg0, String arg1, int[] arg2, class581[] arg3, int arg4, int arg5, int arg6, int arg7) {
        try {
            field715++;
            int var9 = -128 / ((-arg0 - 60) / 36);
            if (arg1 != null) {
                this.method600(113, arg7, arg5);
                this.method601(arg2, null, arg4, 0, -15634, arg6, 0, arg1, arg3);
            }
        } catch (RuntimeException var11) {
            throw class759.method5498(var11, field722[4] + arg0 + ',' + (arg1 == null ? field722[0] : field722[2]) + ',' + (arg2 == null ? field722[0] : field722[2]) + ',' + (arg3 == null ? field722[0] : field722[2]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([I[IIIILjava/lang/String;[I[Lfs;)V", line = 374)
    private final void method606(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, String arg5, int[] arg6, class581[] arg7) {
        try {
            field712++;
            int var27 = arg2 - this.field721.field8584;
            int var9 = -1;
            int var10 = arg4;
            int var11 = 0;
            int var12 = arg5.length();
            for (int var13 = 0; var13 < var12; var13++) {
                char var14 = (char) (class513.method3867(7635, arg5.charAt(var13)) & 0xFF);
                if (var14 == '<') {
                    var9 = var13;
                } else {
                    if (var14 == '>' && var9 != -1) {
                        String var15 = arg5.substring(var9 + 1, var13);
                        var9 = -1;
                        if (var15.equals(field722[38])) {
                            var14 = '<';
                        } else if (var15.equals(field722[33])) {
                            var14 = '>';
                        } else if (var15.equals(field722[36])) {
                            var14 = ' ';
                        } else if (var15.equals(field722[32])) {
                            var14 = '\u00AD';
                        } else if (var15.equals(field722[31])) {
                            var14 = '×';
                        } else if (var15.equals(field722[34])) {
                            var14 = '€';
                        } else if (var15.equals(field722[35])) {
                            var14 = '©';
                        } else {
                            if (!var15.equals(field722[39])) {
                                if (var15.startsWith(field722[40])) {
                                    try {
                                        int var16;
                                        if (arg0 == null) {
                                            var16 = 0;
                                        } else {
                                            var16 = arg0[var11];
                                        }
                                        int var17;
                                        if (arg6 == null) {
                                            var17 = 0;
                                        } else {
                                            var17 = arg6[var11];
                                        }
                                        var11++;
                                        int var18 = class244.method2078(-7431, var15.substring(4));
                                        class581 var19 = arg7[var18];
                                        int var20 = arg1 == null ? var19.method997() : arg1[var18];
                                        var19.method999(arg3 + var16, var27 - -this.field721.field8584 + -var20 + var17, 1, 0, 1);
                                        var10 = -1;
                                        arg3 += arg7[var18].method988();
                                    } catch (Exception var25) {
                                    }
                                } else {
                                    this.method613(var15, arg4 ^ 0xFFFFFF82);
                                }
                                continue;
                            }
                            var14 = '®';
                        }
                    }
                    if (var9 == -1) {
                        if (var10 != -1) {
                            arg3 += this.field721.method4319(var14, var10, 0);
                        }
                        int var21;
                        if (arg0 == null) {
                            var21 = 0;
                        } else {
                            var21 = arg0[var11];
                        }
                        int var22;
                        if (arg6 == null) {
                            var22 = 0;
                        } else {
                            var22 = arg6[var11];
                        }
                        if (var14 != ' ') {
                            if ((class428.field6289 & 0xFF000000) != 0) {
                                this.method132(var14, arg3 + var21 + 1, var27 + var22 + 1, class428.field6289, true);
                            }
                            this.method132(var14, arg3 + var21, var27 + var22, class646.field9358, false);
                        } else if (class535.field7833 > 0) {
                            class331.field5196 += class535.field7833;
                            arg3 += class331.field5196 >> 8;
                            class331.field5196 &= 0xFF;
                        }
                        var11++;
                        int var23 = this.field721.method4320(var14, (byte) -2);
                        if (class424.field6256 != -1) {
                            this.field714.method564(class424.field6256, (byte) 88, var23, arg3, (int) ((double) this.field721.field8584 * 0.7D) + var27);
                        }
                        if (class653.field9441 != -1) {
                            this.field714.method564(class653.field9441, (byte) 88, var23, arg3, this.field721.field8584 + var27);
                        }
                        arg3 += var23;
                        var10 = var14;
                    }
                }
            }
        } catch (RuntimeException var26) {
            throw class759.method5498(var26, field722[37] + (arg0 == null ? field722[0] : field722[2]) + ',' + (arg1 == null ? field722[0] : field722[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 == null ? field722[0] : field722[2]) + ',' + (arg6 == null ? field722[0] : field722[2]) + ',' + (arg7 == null ? field722[0] : field722[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V", line = 535)
    public static void method607(int arg0) {
        try {
            field705 = null;
            field710 = null;
            if (arg0 != 0) {
                field710 = null;
            }
            field720 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field722[25] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIZILjava/lang/String;)V", line = 547)
    public final void method608(int arg0, int arg1, int arg2, boolean arg3, int arg4, String arg5) {
        try {
            field716++;
            if (arg5 != null) {
                this.method600(124, arg2, arg4);
                this.method601(null, null, arg0 - this.field721.method4322(256, arg5) / 2, 0, -15634, arg1, 0, arg5, null);
                if (!arg3) {
                    method607(68);
                }
            }
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field722[41] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 == null ? field722[0] : field722[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(III)Z", line = 568)
    public static final boolean method609(int arg0, int arg1, int arg2) {
        try {
            field713++;
            int var3 = 10 % ((-arg1 - 82) / 33);
            return (arg0 & 0x10000) != 0;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field722[29] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/lang/String;IIIIII)V", line = 590)
    public final void method610(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        try {
            field704++;
            if (arg1 != null) {
                this.method600(90, arg4, arg0);
                double var9 = 7.0D - ((double) arg5 / 8.0D);
                if (var9 < 0.0D) {
                    var9 = 0.0D;
                }
                int var11 = arg1.length();
                int[] var12 = new int[var11];
                for (int var13 = 0; var13 < var11; var13++) {
                    var12[var13] = (int) (Math.sin((double) var13 / 1.5D + (double) arg6) * var9);
                }
                this.method606(null, null, arg3, arg2 - (this.field721.method4322(256, arg1) / arg7), -1, arg1, var12, null);
            }
        } catch (RuntimeException var15) {
            throw class759.method5498(var15, field722[26] + arg0 + ',' + (arg1 == null ? field722[0] : field722[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/lang/String;IIII)V", line = 624)
    public final void method611(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            if (arg5 == 16895) {
                field702++;
                if (arg1 != null) {
                    this.method600(106, arg2, arg3);
                    this.method601(null, null, arg0 - this.field721.method4322(256, arg1), 0, -15634, arg4, 0, arg1, null);
                }
            }
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field722[43] + arg0 + ',' + (arg1 == null ? field722[0] : field722[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([IIIILjava/lang/String;IIIIII[Lfs;Ljava/util/Random;I[I)I", line = 640)
    public final int method612(int[] arg0, int arg1, int arg2, int arg3, String arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class581[] arg11, Random arg12, int arg13, int[] arg14) {
        try {
            field699++;
            if (arg4 == null) {
                return 0;
            }
            arg12.setSeed((long) arg2);
            int var16 = (arg12.nextInt() & 0x1F) + 192;
            this.method600(116, var16 << 24 | arg9 & 0xFFFFFF, arg7 & 0xFFFFFF | var16 << 24);
            int var17 = arg4.length();
            int[] var18 = new int[var17];
            int var19 = 0;
            for (int var20 = 0; var20 < var17; var20++) {
                var18[var20] = var19;
                if ((arg12.nextInt() & 0x3) == 0) {
                    var19++;
                }
            }
            if (arg3 != 4) {
                field710 = null;
            }
            int var21 = arg8;
            int var22 = this.field721.field8574 + arg6;
            int var23 = -1;
            if (arg1 == 1) {
                var22 += (arg13 - this.field721.field8574 - this.field721.field8571) / 2;
            } else if (arg1 == 2) {
                var22 = arg6 + arg13 - this.field721.field8571;
            }
            if (arg5 == 1) {
                var23 = var19 + this.field721.method4322(arg3 ^ 0x104, arg4);
                var21 = (arg10 - var23) / 2 + arg8;
            } else if (arg5 == 2) {
                var23 = this.field721.method4322(256, arg4) + var19;
                var21 = arg10 + arg8 - var23;
            }
            this.method606(var18, arg0, var22, var21, -1, arg4, null, arg11);
            if (arg14 != null) {
                if (var23 == -1) {
                    var23 = this.field721.method4322(256, arg4) + var19;
                }
                arg14[1] = var22 - this.field721.field8574;
                arg14[0] = var21;
                arg14[2] = var23;
                arg14[3] = this.field721.field8574 + this.field721.field8571;
            }
            return var19;
        } catch (RuntimeException var25) {
            throw class759.method5498(var25, field722[30] + (arg0 == null ? field722[0] : field722[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 == null ? field722[0] : field722[2]) + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + (arg11 == null ? field722[0] : field722[2]) + ',' + (arg12 == null ? field722[0] : field722[2]) + ',' + arg13 + ',' + (arg14 == null ? field722[0] : field722[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 717)
    private final void method613(String arg0, int arg1) {
        try {
            try {
                if (arg1 < 72) {
                    field720 = null;
                }
                if (arg0.startsWith(field722[9])) {
                    class646.field9358 = class646.field9358 & 0xFF000000 | class227.method1961(true, arg0.substring(4), 16) & 0xFFFFFF;
                } else if (arg0.equals(field722[15])) {
                    class646.field9358 = class384.field5816 & 0xFFFFFF | class646.field9358 & 0xFF000000;
                }
                if (arg0.startsWith(field722[13])) {
                    class646.field9358 = class227.method1961(true, arg0.substring(5), 16);
                } else if (arg0.equals(field722[19])) {
                    class646.field9358 = class384.field5816;
                } else if (arg0.startsWith(field722[8])) {
                    class424.field6256 = class646.field9358 & 0xFF000000 | class227.method1961(true, arg0.substring(4), 16);
                } else if (arg0.equals(field722[14])) {
                    class424.field6256 = class646.field9358 & 0xFF000000 | 0x800000;
                } else if (arg0.equals(field722[18])) {
                    class424.field6256 = -1;
                } else if (arg0.startsWith(field722[7])) {
                    class653.field9441 = class646.field9358 & 0xFF000000 | class227.method1961(true, arg0.substring(2), 16);
                } else if (arg0.equals("u")) {
                    class653.field9441 = class646.field9358 & 0xFF000000;
                } else if (arg0.equals(field722[16])) {
                    class653.field9441 = -1;
                } else if (arg0.equalsIgnoreCase(field722[12])) {
                    class428.field6289 = 0;
                } else if (arg0.startsWith(field722[11])) {
                    class428.field6289 = class646.field9358 & 0xFF000000 | class227.method1961(true, arg0.substring(5), 16);
                } else if (arg0.equals(field722[5])) {
                    class428.field6289 = class646.field9358 & 0xFF000000;
                } else if (arg0.equals(field722[10])) {
                    class428.field6289 = class69.field747;
                } else if (arg0.equals(field722[6])) {
                    this.method600(82, class384.field5816, class69.field747);
                }
            } catch (Exception var4) {
            }
            field718++;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field722[17] + (arg0 == null ? field722[0] : field722[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([Lfs;IIILjava/lang/String;IIIIIIIIIILaa;[I)I", line = 797)
    public final int method614(class581[] arg0, int arg1, int arg2, int arg3, String arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, class512 arg15, int[] arg16) {
        try {
            field703++;
            if (arg4 == null) {
                return 0;
            }
            this.method600(109, arg12, arg3);
            if (arg9 == 0) {
                arg9 = this.field721.field8584;
            }
            int[] var18;
            if (arg14 < (this.field721.field8574 + arg9 + this.field721.field8571) && arg14 < (arg9 + arg9)) {
                var18 = null;
            } else {
                var18 = new int[] { arg7 };
            }
            if (arg13 == -1) {
                arg13 = arg14 / arg9;
                if (arg13 <= 0) {
                    arg13 = 1;
                }
            }
            int var19 = this.field721.method4321(arg4, arg0, (byte) -18, class341.field5311, var18);
            if (arg13 > 0 && var19 >= arg13) {
                class341.field5311[arg13 - 1] = this.field721.method4324(arg0, class341.field5311[arg13 - 1], arg7, (byte) 123);
                var19 = arg13;
            }
            if (arg1 <= 96) {
                this.method601(null, null, -107, -111, 64, 14, 83, null, null);
            }
            if (arg5 == 3 && var19 == 1) {
                arg5 = 1;
            }
            int var21;
            if (arg5 == 0) {
                var21 = this.field721.field8574 + arg8;
            } else if (arg5 == 1) {
                var21 = (arg14 - ((var19 - 1) * arg9) - this.field721.field8574 - this.field721.field8571) / 2 + this.field721.field8574 + arg8;
            } else if (arg5 == 2) {
                var21 = arg8 + arg14 - this.field721.field8571 - ((var19 + -1) * arg9);
            } else {
                int var20 = (arg14 - ((var19 - 1) * arg9) - this.field721.field8574 - this.field721.field8571) / (var19 + 1);
                if (var20 < 0) {
                    var20 = 0;
                }
                arg9 += var20;
                var21 = arg8 + this.field721.field8574 + var20;
            }
            for (int var22 = 0; var22 < var19; var22++) {
                if (arg2 == 0) {
                    this.method601(arg16, arg15, arg11, arg6, -15634, var21, arg10, class341.field5311[var22], arg0);
                } else if (arg2 == 1) {
                    this.method601(arg16, arg15, (arg7 - this.field721.method4322(256, class341.field5311[var22])) / 2 + arg11, arg6, -15634, var21, arg10, class341.field5311[var22], arg0);
                } else if (arg2 == 2) {
                    this.method601(arg16, arg15, arg11 - (this.field721.method4322(256, class341.field5311[var22]) - arg7), arg6, -15634, var21, arg10, class341.field5311[var22], arg0);
                } else if (var19 - 1 == var22) {
                    this.method601(arg16, arg15, arg11, arg6, -15634, var21, arg10, class341.field5311[var22], arg0);
                } else {
                    this.method604((byte) -76, class341.field5311[var22], arg7);
                    this.method601(arg16, arg15, arg11, arg6, -15634, var21, arg10, class341.field5311[var22], arg0);
                    class535.field7833 = 0;
                }
                var21 += arg9;
            }
            return var19;
        } catch (RuntimeException var24) {
            throw class759.method5498(var24, field722[42] + (arg0 == null ? field722[0] : field722[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 == null ? field722[0] : field722[2]) + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ',' + arg13 + ',' + arg14 + ',' + (arg15 == null ? field722[0] : field722[2]) + ',' + (arg16 == null ? field722[0] : field722[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Lha;Llq;)V", line = 908)
    public class67(class66 arg0, class578 arg1) {
        try {
            this.field721 = arg1;
            this.field714 = arg0;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field722[24] + (arg0 == null ? field722[0] : field722[2]) + ',' + (arg1 == null ? field722[0] : field722[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(CIIIZLaa;II)V")
    public abstract void method129(char arg0, int arg1, int arg2, int arg3, boolean arg4, class512 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!da", name = "fa", descriptor = "(CIIIZ)V")
    public abstract void method132(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!da", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method615(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x66);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!da", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method616(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 54;
                    break;
                case 1:
                    var10005 = 63;
                    break;
                case 2:
                    var10005 = 92;
                    break;
                case 3:
                    var10005 = 86;
                    break;
                default:
                    var10005 = 102;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
