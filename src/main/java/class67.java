import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public abstract class class67 {

    @OriginalMember(owner = "client!da", name = "b", descriptor = "Lkf;")
    private class263 field887;

    @OriginalMember(owner = "client!da", name = "l", descriptor = "Lha;")
    private class66 field897;

    @OriginalMember(owner = "client!da", name = "u", descriptor = "[I")
    public static int[] field906 = new int[4];

    @OriginalMember(owner = "client!da", name = "m", descriptor = "Lofa;")
    public static class345 field898 = new class345(3);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "I")
    public static int field886;

    @OriginalMember(owner = "client!da", name = "c", descriptor = "I")
    public static int field888;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "I")
    public static int field889;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "I")
    public static int field890;

    @OriginalMember(owner = "client!da", name = "f", descriptor = "I")
    public static int field891;

    @OriginalMember(owner = "client!da", name = "g", descriptor = "I")
    public static int field892;

    @OriginalMember(owner = "client!da", name = "h", descriptor = "I")
    public static int field893;

    @OriginalMember(owner = "client!da", name = "i", descriptor = "I")
    public static int field894;

    @OriginalMember(owner = "client!da", name = "j", descriptor = "I")
    public static int field895;

    @OriginalMember(owner = "client!da", name = "k", descriptor = "I")
    public static int field896;

    @OriginalMember(owner = "client!da", name = "n", descriptor = "I")
    public static int field899;

    @OriginalMember(owner = "client!da", name = "o", descriptor = "I")
    public static int field900;

    @OriginalMember(owner = "client!da", name = "p", descriptor = "I")
    public static int field901;

    @OriginalMember(owner = "client!da", name = "q", descriptor = "I")
    public static int field902;

    @OriginalMember(owner = "client!da", name = "r", descriptor = "I")
    public static int field903;

    @OriginalMember(owner = "client!da", name = "s", descriptor = "I")
    public static int field904;

    @OriginalMember(owner = "client!da", name = "t", descriptor = "I")
    public static int field905;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;IIIIIIB)V")
    public final void method514(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        field903++;
        if (arg7 <= 53) {
            field898 = null;
        }
        if (arg0 == null) {
            return;
        }
        this.method520((byte) -100, arg3, arg2);
        double var9 = 7.0D - (double) arg5 / 8.0D;
        if (var9 < 0.0D) {
            var9 = 0.0D;
        }
        int var11 = arg0.length();
        int[] var12 = new int[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = (int) (Math.sin((double) var13 / 1.5D + (double) arg4) * var9);
        }
        this.method519((byte) 92, null, null, null, arg6 - (this.field887.method1728(arg0, -84) / 2), arg1, var12, arg0);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(CIIIZLaa;II)V")
    public abstract void method30(char arg0, int arg1, int arg2, int arg3, boolean arg4, class510 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IILjava/lang/String;)V")
    private final void method515(int arg0, int arg1, String arg2) {
        field899++;
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
        if (~var4 < arg0) {
            class250.field3545 = (arg1 - this.field887.method1728(arg2, -106) << 8) / var4;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IILjava/lang/String;IIIIIIIBILaa;[Lqda;[II)I")
    public final int method516(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, byte arg10, int arg11, class510 arg12, class112[] arg13, int[] arg14, int arg15) {
        if (arg10 == 89) {
            field891++;
            return this.method517(arg4, arg12, arg7, arg1, arg0, arg15, arg2, arg11, arg6, -74, arg13, 0, arg14, arg3, arg8, arg9, arg5);
        } else {
            return -18;
        }
    }

    @OriginalMember(owner = "client!da", name = "fa", descriptor = "(CIIIZ)V")
    public abstract void method31(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILaa;IIIILjava/lang/String;III[Lqda;I[IIIII)I")
    public final int method517(int arg0, class510 arg1, int arg2, int arg3, int arg4, int arg5, String arg6, int arg7, int arg8, int arg9, class112[] arg10, int arg11, int[] arg12, int arg13, int arg14, int arg15, int arg16) {
        field893++;
        if (arg6 == null) {
            return 0;
        }
        this.method520((byte) 28, arg5, arg14);
        if (arg2 == 0) {
            arg2 = this.field887.field3711;
        }
        int[] var18;
        if (arg3 < (this.field887.field3723 + arg2 + this.field887.field3724) && arg3 < arg2 + arg2) {
            var18 = null;
        } else {
            var18 = new int[] { arg8 };
        }
        if (arg11 == -1) {
            arg11 = arg3 / arg2;
            if (arg11 <= 0) {
                arg11 = 1;
            }
        }
        int var19 = this.field887.method1737(class268.field3766, arg10, arg6, var18, true);
        if (arg11 > 0 && arg11 <= var19) {
            var19 = arg11;
            class268.field3766[arg11 - 1] = this.field887.method1727(class268.field3766[arg11 - 1], true, arg8, arg10);
        }
        if (arg16 == 3 && var19 == 1) {
            arg16 = 1;
        }
        int var20;
        if (arg16 == 0) {
            var20 = this.field887.field3723 + arg4;
        } else if (arg16 == 1) {
            var20 = (arg3 - ((var19 - 1) * arg2) - this.field887.field3724 - this.field887.field3723) / 2 + this.field887.field3723 + arg4;
        } else if (arg16 == 2) {
            var20 = arg4 + arg3 - this.field887.field3724 - ((var19 - 1) * arg2);
        } else {
            int var21 = (arg3 - this.field887.field3724 - this.field887.field3723 - ((var19 - 1) * arg2)) / (var19 + 1);
            if (var21 < 0) {
                var21 = 0;
            }
            arg2 += var21;
            var20 = arg4 - (-this.field887.field3723 - var21);
        }
        int var22 = 0;
        if (arg9 >= -47) {
            return 118;
        }
        while (var22 < var19) {
            if (arg7 == 0) {
                this.method524(arg13, (byte) -110, arg12, arg15, class268.field3766[var22], arg0, arg10, arg1, var20);
            } else if (arg7 == 1) {
                this.method524(arg13, (byte) -113, arg12, (arg8 - this.field887.method1728(class268.field3766[var22], 124)) / 2 + arg15, class268.field3766[var22], arg0, arg10, arg1, var20);
            } else if (arg7 == 2) {
                this.method524(arg13, (byte) -121, arg12, arg8 + arg15 - this.field887.method1728(class268.field3766[var22], -57), class268.field3766[var22], arg0, arg10, arg1, var20);
            } else if (var19 - 1 == var22) {
                this.method524(arg13, (byte) -93, arg12, arg15, class268.field3766[var22], arg0, arg10, arg1, var20);
            } else {
                this.method515(-1, arg8, class268.field3766[var22]);
                this.method524(arg13, (byte) -87, arg12, arg15, class268.field3766[var22], arg0, arg10, arg1, var20);
                class250.field3545 = 0;
            }
            var20 += arg2;
            var22++;
        }
        return var19;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIILjava/lang/String;II)V")
    public final void method518(int arg0, int arg1, int arg2, int arg3, String arg4, int arg5, int arg6) {
        field905++;
        if (arg4 == null) {
            return;
        }
        this.method520((byte) -115, arg2, arg0);
        int var8 = arg4.length();
        int[] var9 = new int[var8];
        int[] var10 = new int[var8];
        if (arg1 != 7596) {
            return;
        }
        for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = (int) (Math.sin((double) arg5 / 5.0D + (double) var11 / 5.0D) * 5.0D);
            var10[var11] = (int) (Math.sin((double) arg5 / 5.0D + (double) var11 / 3.0D) * 5.0D);
        }
        this.method519((byte) 15, null, var9, null, arg6 - (this.field887.method1728(arg4, -85) / 2), arg3, var10, arg4);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(B[I[I[Lqda;II[ILjava/lang/String;)V")
    private final void method519(byte arg0, int[] arg1, int[] arg2, class112[] arg3, int arg4, int arg5, int[] arg6, String arg7) {
        field896++;
        int var9 = arg5 - this.field887.field3711;
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        int var13 = arg7.length();
        int var14 = 49 / ((-arg0 - 41) / 46);
        for (int var15 = 0; var15 < var13; var15++) {
            char var16 = (char) (class483.method2829((byte) -83, arg7.charAt(var15)) & 0xFF);
            if (var16 == '<') {
                var10 = var15;
            } else {
                if (var16 == '>' && var10 != -1) {
                    String var17 = arg7.substring(var10 + 1, var15);
                    var10 = -1;
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
                                    int var18;
                                    if (arg2 == null) {
                                        var18 = 0;
                                    } else {
                                        var18 = arg2[var12];
                                    }
                                    int var19;
                                    if (arg6 == null) {
                                        var19 = 0;
                                    } else {
                                        var19 = arg6[var12];
                                    }
                                    var12++;
                                    int var20 = class4.method25(0, var17.substring(4));
                                    class112 var21 = arg3[var20];
                                    int var22 = arg1 == null ? var21.method792() : arg1[var20];
                                    var21.method795(arg4 + var18, var9 - (-this.field887.field3711 - var19) + -var22, 1, 0, 1);
                                    arg4 += arg3[var20].method781();
                                    var11 = -1;
                                } catch (Exception var26) {
                                }
                            } else {
                                this.method528(var17, (byte) 127);
                            }
                            continue;
                        }
                        var16 = '®';
                    }
                }
                if (var10 == -1) {
                    if (var11 != -1) {
                        arg4 += this.field887.method1731(var16, var11, 1230);
                    }
                    int var23;
                    if (arg2 == null) {
                        var23 = 0;
                    } else {
                        var23 = arg2[var12];
                    }
                    int var24;
                    if (arg6 == null) {
                        var24 = 0;
                    } else {
                        var24 = arg6[var12];
                    }
                    if (var16 != ' ') {
                        if ((class318.field4726 & 0xFF000000) != 0) {
                            this.method31(var16, arg4 + var23 + 1, var9 - (-1 - var24), class318.field4726, true);
                        }
                        this.method31(var16, arg4 + var23, var9 - -var24, class458.field6563, false);
                    } else if (class250.field3545 > 0) {
                        class471.field6716 += class250.field3545;
                        arg4 += class471.field6716 >> 8;
                        class471.field6716 &= 0xFF;
                    }
                    var12++;
                    int var25 = this.field887.method1729(var16, (byte) 32);
                    if (class7.field71 != -1) {
                        this.field897.method478(arg4, true, class7.field71, var25, (int) ((double) this.field887.field3711 * 0.7D) + var9);
                    }
                    if (class336.field4993 != -1) {
                        this.field897.method478(arg4, true, class336.field4993, var25, var9 + this.field887.field3711);
                    }
                    var11 = var16;
                    arg4 += var25;
                }
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BII)V")
    private final void method520(byte arg0, int arg1, int arg2) {
        if (arg1 == -1) {
            arg1 = 0;
        }
        class471.field6716 = 0;
        int var4 = -31 % ((arg0 + 46) / 44);
        field895++;
        class533.field7528 = arg2;
        class458.field6563 = arg2;
        class336.field4993 = -1;
        class7.field71 = -1;
        class250.field3545 = 0;
        class323.field4847 = arg1;
        class318.field4726 = arg1;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/util/Random;I[ILjava/lang/String;[IIIIIIB[Lqda;III)I")
    public final int method521(Random arg0, int arg1, int[] arg2, String arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9, byte arg10, class112[] arg11, int arg12, int arg13, int arg14) {
        field900++;
        if (arg3 == null) {
            return 0;
        } else if (arg10 == 71) {
            arg0.setSeed((long) arg12);
            int var16 = (arg0.nextInt() & 0x1F) + 192;
            this.method520((byte) -102, var16 << 24 | arg5 & 0xFFFFFF, var16 << 24 | arg8 & 0xFFFFFF);
            int var17 = arg3.length();
            int[] var18 = new int[var17];
            int var19 = 0;
            for (int var20 = 0; var20 < var17; var20++) {
                var18[var20] = var19;
                if ((arg0.nextInt() & 0x3) == 0) {
                    var19++;
                }
            }
            int var21 = arg14;
            int var22 = this.field887.field3723 + arg7;
            if (arg13 == 1) {
                var22 += (arg9 - (this.field887.field3724 + this.field887.field3723)) / 2;
            } else if (arg13 == 2) {
                var22 = arg7 + arg9 - this.field887.field3724;
            }
            int var23 = -1;
            if (arg1 == 1) {
                var23 = this.field887.method1728(arg3, 119) + var19;
                var21 = (arg6 - var23) / 2 + arg14;
            } else if (arg1 == 2) {
                var23 = var19 + this.field887.method1728(arg3, 124);
                var21 = arg6 + arg14 - var23;
            }
            this.method519((byte) 55, arg2, var18, arg11, var21, var22, null, arg3);
            if (arg4 != null) {
                if (var23 == -1) {
                    var23 = var19 + this.field887.method1728(arg3, 123);
                }
                arg4[0] = var21;
                arg4[3] = this.field887.field3724 + this.field887.field3723;
                arg4[2] = var23;
                arg4[1] = var22 - this.field887.field3723;
            }
            return var19;
        } else {
            return -120;
        }
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Lha;Lkf;)V")
    public class67(class66 arg0, class263 arg1) {
        this.field887 = arg1;
        this.field897 = arg0;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II[Lqda;ILjava/lang/String;I[II)V")
    public final void method522(int arg0, int arg1, class112[] arg2, int arg3, String arg4, int arg5, int[] arg6, int arg7) {
        field890++;
        if (arg4 != null) {
            this.method520((byte) -102, arg0, arg1);
            this.method524(arg3, (byte) -108, arg6, arg5, arg4, 0, arg2, null, arg7);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IILjava/lang/String;IZI)V")
    public final void method523(int arg0, int arg1, String arg2, int arg3, boolean arg4, int arg5) {
        field894++;
        if (arg2 == null) {
            return;
        }
        this.method520((byte) 67, arg5, arg0);
        this.method524(0, (byte) -123, null, arg1 - (this.field887.method1728(arg2, 119) / 2), arg2, 0, null, null, arg3);
        if (!arg4) {
            this.field897 = null;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IB[IILjava/lang/String;I[Lqda;Laa;I)V")
    private final void method524(int arg0, byte arg1, int[] arg2, int arg3, String arg4, int arg5, class112[] arg6, class510 arg7, int arg8) {
        field902++;
        int var10 = arg8 - this.field887.field3711;
        int var11 = -1;
        int var12 = -1;
        if (arg1 >= -81) {
            return;
        }
        int var13 = arg4.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class483.method2829((byte) -83, arg4.charAt(var14)) & 0xFF);
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
                                    int var17 = class4.method25(0, var16.substring(4));
                                    class112 var18 = arg6[var17];
                                    int var19 = arg2 == null ? var18.method792() : arg2[var17];
                                    if ((class458.field6563 & 0xFF000000) == -16777216) {
                                        var18.method795(arg3, this.field887.field3711 + var10 - var19, 1, 0, 1);
                                    } else {
                                        var18.method795(arg3, var10 + this.field887.field3711 - var19, 0, class458.field6563 & 0xFF000000 | 0xFFFFFF, 1);
                                    }
                                    arg3 += arg6[var17].method781();
                                    var12 = -1;
                                } catch (Exception var21) {
                                }
                            } else {
                                this.method528(var16, (byte) 127);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var11 == -1) {
                    if (var12 != -1) {
                        arg3 += this.field887.method1731(var15, var12, 1230);
                    }
                    if (var15 == ' ') {
                        if (class250.field3545 > 0) {
                            class471.field6716 += class250.field3545;
                            arg3 += class471.field6716 >> 8;
                            class471.field6716 &= 0xFF;
                        }
                    } else if (arg7 == null) {
                        if ((class318.field4726 & 0xFF000000) != 0) {
                            this.method31(var15, arg3 + 1, var10 + 1, class318.field4726, true);
                        }
                        this.method31(var15, arg3, var10, class458.field6563, false);
                    } else {
                        if ((class318.field4726 & 0xFF000000) != 0) {
                            this.method30(var15, arg3 + 1, var10 - -1, class318.field4726, true, arg7, arg5, arg0);
                        }
                        this.method30(var15, arg3, var10, class458.field6563, false, arg7, arg5, arg0);
                    }
                    int var20 = this.field887.method1729(var15, (byte) 73);
                    if (class7.field71 != -1) {
                        this.field897.method478(arg3, true, class7.field71, var20, var10 + ((int) ((double) this.field887.field3711 * 0.7D)));
                    }
                    if (class336.field4993 != -1) {
                        this.field897.method478(arg3, true, class336.field4993, var20, this.field887.field3711 + var10 + 1);
                    }
                    var12 = var15;
                    arg3 += var20;
                }
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(IIIILjava/lang/String;II)V")
    public final void method525(int arg0, int arg1, int arg2, int arg3, String arg4, int arg5, int arg6) {
        field889++;
        if (arg4 == null) {
            return;
        }
        this.method520((byte) -101, arg5, arg2);
        int var8 = arg4.length();
        int[] var9 = new int[var8];
        for (int var10 = arg6; var10 < var8; var10++) {
            var9[var10] = (int) (Math.sin((double) arg0 / 5.0D + (double) var10 / 2.0D) * 5.0D);
        }
        this.method519((byte) 113, null, null, null, arg3 - (this.field887.method1728(arg4, 118) / 2), arg1, var9, arg4);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIBI)V")
    public static final void method526(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        if (arg4 != 32) {
            method526(106, 113, 7, 59, (byte) 126, -97);
        }
        int var9 = arg1 + 1;
        class382.method2347(arg2, class347.field5087[arg1], arg3, 7, arg5);
        field901++;
        int var8 = arg0 - 1;
        class382.method2347(arg2, class347.field5087[arg0], arg3, 7, arg5);
        for (int var6 = var9; var6 <= var8; var6++) {
            int[] var7 = class347.field5087[var6];
            var7[arg2] = var7[arg5] = arg3;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;IIIII)V")
    public final void method527(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field892++;
        if (arg0 == null) {
            return;
        }
        this.method520((byte) 17, arg1, arg2);
        this.method524(0, (byte) -103, null, arg5 - this.field887.method1728(arg0, -70), arg0, 0, null, null, arg3);
        if (arg4 <= 91) {
            method530((byte) -72);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;B)V")
    private final void method528(String arg0, byte arg1) {
        field888++;
        try {
            if (arg1 != 127) {
                this.method528(null, (byte) -25);
            }
            if (arg0.startsWith("col=")) {
                class458.field6563 = class458.field6563 & 0xFF000000 | class519.method3023(16, arg0.substring(4), 0) & 0xFFFFFF;
            } else if (arg0.equals("/col")) {
                class458.field6563 = class533.field7528 & 0xFFFFFF | class458.field6563 & 0xFF000000;
            }
            if (arg0.startsWith("argb=")) {
                class458.field6563 = class519.method3023(16, arg0.substring(5), 0);
            } else if (arg0.equals("/argb")) {
                class458.field6563 = class533.field7528;
            } else if (arg0.startsWith("str=")) {
                class7.field71 = class458.field6563 & 0xFF000000 | class519.method3023(16, arg0.substring(4), 0);
            } else if (arg0.equals("str")) {
                class7.field71 = class458.field6563 & 0xFF000000 | 0x800000;
            } else if (arg0.equals("/str")) {
                class7.field71 = -1;
            } else if (arg0.startsWith("u=")) {
                class336.field4993 = class458.field6563 & 0xFF000000 | class519.method3023(16, arg0.substring(2), 0);
            } else if (arg0.equals("u")) {
                class336.field4993 = class458.field6563 & 0xFF000000;
            } else if (arg0.equals("/u")) {
                class336.field4993 = -1;
            } else if (arg0.equalsIgnoreCase("shad=-1")) {
                class318.field4726 = 0;
            } else if (arg0.startsWith("shad=")) {
                class318.field4726 = class458.field6563 & 0xFF000000 | class519.method3023(16, arg0.substring(5), 0);
            } else if (arg0.equals("shad")) {
                class318.field4726 = class458.field6563 & 0xFF000000;
                return;
            } else if (arg0.equals("/shad")) {
                class318.field4726 = class323.field4847;
                return;
            } else if (arg0.equals("br")) {
                this.method520((byte) -102, class323.field4847, class533.field7528);
                return;
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/lang/String;BIII)V")
    public final void method529(int arg0, String arg1, byte arg2, int arg3, int arg4, int arg5) {
        field904++;
        if (arg1 != null) {
            this.method520((byte) -104, arg4, arg5);
            if (arg2 <= -40) {
                this.method524(0, (byte) -96, null, arg3, arg1, 0, null, null, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(B)V")
    public static void method530(byte arg0) {
        field898 = null;
        field906 = null;
        if (arg0 <= 52) {
            field906 = null;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([ILjava/util/Random;Ljava/lang/String;IIBIII[Lqda;)I")
    public final int method531(int[] arg0, Random arg1, String arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, class112[] arg9) {
        field886++;
        if (arg2 == null) {
            return 0;
        }
        arg1.setSeed((long) arg6);
        int var11 = (arg1.nextInt() & 0x1F) + 192;
        this.method520((byte) 79, arg7 & 0xFFFFFF | var11 << 24, arg3 & 0xFFFFFF | var11 << 24);
        int var12 = arg2.length();
        int[] var13 = new int[var12];
        if (arg5 > -80) {
            return -104;
        }
        int var14 = 0;
        for (int var15 = 0; var15 < var12; var15++) {
            var13[var15] = var14;
            if ((arg1.nextInt() & 0x3) == 0) {
                var14++;
            }
        }
        this.method519((byte) 117, arg0, var13, arg9, arg4, arg8, null, arg2);
        return var14;
    }
}
