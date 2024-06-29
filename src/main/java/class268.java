import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public abstract class class268 {

    @OriginalMember(owner = "client!ba", name = "t", descriptor = "Lju;")
    private class82 field3737;

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "Lqa;")
    private class165 field3719;

    @OriginalMember(owner = "client!ba", name = "j", descriptor = "Lgi;")
    public static class487 field3727 = new class487(16);

    @OriginalMember(owner = "client!ba", name = "w", descriptor = "[I")
    public static int[] field3740 = new int[4];

    @OriginalMember(owner = "client!ba", name = "q", descriptor = "I")
    public static int field3734 = 0;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "I")
    public static int field3718;

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "I")
    public static int field3720;

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "I")
    public static int field3721;

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "I")
    public static int field3722;

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "I")
    public static int field3723;

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "I")
    public static int field3724;

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "I")
    public static int field3725;

    @OriginalMember(owner = "client!ba", name = "i", descriptor = "I")
    public static int field3726;

    @OriginalMember(owner = "client!ba", name = "k", descriptor = "I")
    public static int field3728;

    @OriginalMember(owner = "client!ba", name = "l", descriptor = "I")
    public static int field3729;

    @OriginalMember(owner = "client!ba", name = "m", descriptor = "I")
    public static int field3730;

    @OriginalMember(owner = "client!ba", name = "n", descriptor = "I")
    public static int field3731;

    @OriginalMember(owner = "client!ba", name = "o", descriptor = "I")
    public static int field3732;

    @OriginalMember(owner = "client!ba", name = "p", descriptor = "I")
    public static int field3733;

    @OriginalMember(owner = "client!ba", name = "r", descriptor = "I")
    public static int field3735;

    @OriginalMember(owner = "client!ba", name = "s", descriptor = "I")
    public static int field3736;

    @OriginalMember(owner = "client!ba", name = "u", descriptor = "I")
    public static int field3738;

    @OriginalMember(owner = "client!ba", name = "v", descriptor = "I")
    public static int field3739;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIII[Laa;ILjava/lang/String;[I)V", line = 3)
    public final void method1707(int arg0, int arg1, int arg2, int arg3, class341[] arg4, int arg5, String arg6, int[] arg7) {
        field3731++;
        if (arg6 != null) {
            this.method1710(arg1, -1, arg5);
            int var9 = -98 / ((-arg3 - 72) / 36);
            this.method1725(-1, null, arg6, arg0, arg4, arg7, arg2, 0, 0);
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IILjava/lang/String;IIII)V", line = 27)
    public final void method1708(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5, int arg6) {
        field3738++;
        if (arg2 == null) {
            return;
        }
        this.method1710(arg3, -1, arg1);
        int var8 = arg2.length();
        int[] var9 = new int[var8];
        int[] var10 = new int[var8];
        for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = (int) (Math.sin((double) arg6 / 5.0D + (double) var11 / 5.0D) * 5.0D);
            var10[var11] = (int) (Math.sin((double) arg6 / 5.0D + (double) var11 / 3.0D) * 5.0D);
        }
        if (arg5 != 20989) {
            this.method161('\u0006', 26, -97, 115, false, null, 41, 8);
        }
        this.method1721(null, -1, var10, arg2, null, arg4, var9, arg0 - (this.field3737.method564(-90, arg2) / 2));
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Ljava/util/Random;II[IIIILjava/lang/String;I[Laa;)I", line = 61)
    public final int method1709(Random arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, String arg7, int arg8, class341[] arg9) {
        field3730++;
        if (arg7 == null) {
            return 0;
        }
        arg0.setSeed((long) arg1);
        int var11 = (arg0.nextInt() & arg2) + 192;
        this.method1710(var11 << 24 | arg8 & 0xFFFFFF, -1, var11 << 24 | arg6 & 0xFFFFFF);
        int var12 = arg7.length();
        int[] var13 = new int[var12];
        int var14 = 0;
        for (int var15 = 0; var15 < var12; var15++) {
            var13[var15] = var14;
            if ((arg0.nextInt() & 0x3) == 0) {
                var14++;
            }
        }
        this.method1721(arg3, -1, null, arg7, arg9, arg4, var13, arg5);
        return var14;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(III)V", line = 99)
    private final void method1710(int arg0, int arg1, int arg2) {
        class75.field1101 = arg1;
        field3729++;
        class300.field4406 = 0;
        class502.field7412 = arg0;
        class149.field1962 = arg0;
        class214.field3033 = 0;
        class395.field6037 = -1;
        if (arg2 == -1) {
            arg2 = 0;
        }
        class279.field3964 = arg2;
        class444.field6675 = arg2;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Ljava/lang/String;IB)V", line = 116)
    private final void method1711(String arg0, int arg1, byte arg2) {
        field3736++;
        int var4 = 0;
        boolean var5 = false;
        if (arg2 != 109) {
            return;
        }
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
        if (var4 > 0) {
            class214.field3033 = (arg1 - this.field3737.method564(123, arg0) << 8) / var4;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(BLjava/lang/String;IIII)V", line = 156)
    public final void method1712(byte arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        field3724++;
        if (arg1 != null && arg0 == 66) {
            this.method1710(arg2, arg0 ^ 0xFFFFFFBD, arg3);
            this.method1725(-1, null, arg1, arg5, null, null, arg4, 0, 0);
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILjava/lang/String;IIII)V", line = 173)
    public final void method1713(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        field3723++;
        if (arg1 != null) {
            this.method1710(arg3, arg4, arg0);
            this.method1725(arg4, null, arg1, arg2, null, null, arg5 - this.field3737.method564(-102, arg1), 0, 0);
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Ljava/lang/String;ZIIII)V", line = 186)
    public final void method1714(String arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1) {
            return;
        }
        field3725++;
        if (arg0 != null) {
            this.method1710(arg2, -1, arg4);
            this.method1725(-1, null, arg0, arg3, null, null, arg5 - (this.field3737.method564(-82, arg0) / 2), 0, 0);
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "([IIIIIIIIIILi;I[Laa;Ljava/lang/String;III)I", line = 204)
    public final int method1715(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class30 arg10, int arg11, class341[] arg12, String arg13, int arg14, int arg15, int arg16) {
        field3733++;
        if (arg13 == null) {
            return 0;
        }
        this.method1710(arg5, -1, arg1);
        if (arg8 == 0) {
            arg8 = this.field3737.field1195;
        }
        int[] var18;
        if ((this.field3737.field1191 + arg8 + this.field3737.field1201) > arg11 && (arg8 + arg8) > arg11) {
            var18 = null;
        } else {
            var18 = new int[] { arg16 };
        }
        if (arg14 == -1) {
            arg14 = arg11 / arg8;
            if (arg14 <= 0) {
                arg14 = 1;
            }
        }
        int var19 = this.field3737.method565(arg12, class254.field3528, arg13, var18, (byte) 98);
        if (arg14 > 0 && arg14 <= var19) {
            var19 = arg14;
            class254.field3528[arg14 - 1] = this.field3737.method559(arg16, class254.field3528[arg14 - 1], arg12, -62);
        }
        if (arg7 == 3 && var19 == 1) {
            arg7 = 1;
        }
        if (arg4 < 119) {
            return 65;
        }
        int var20;
        if (arg7 == 0) {
            var20 = this.field3737.field1201 + arg6;
        } else if (arg7 == 1) {
            var20 = this.field3737.field1201 + arg6 + ((-this.field3737.field1201 - this.field3737.field1191 + arg11 + -((var19 + -1) * arg8)) / 2);
        } else if (arg7 == 2) {
            var20 = arg6 + arg11 - ((var19 - 1) * arg8) - this.field3737.field1191;
        } else {
            int var21 = (arg11 - this.field3737.field1191 - (var19 + -1) * arg8 - this.field3737.field1201) / (var19 + 1);
            if (var21 < 0) {
                var21 = 0;
            }
            arg8 += var21;
            var20 = this.field3737.field1201 + arg6 + var21;
        }
        for (int var22 = 0; var22 < var19; var22++) {
            if (arg3 == 0) {
                this.method1725(-1, arg10, class254.field3528[var22], var20, arg12, arg0, arg15, arg9, arg2);
            } else if (arg3 == 1) {
                this.method1725(-1, arg10, class254.field3528[var22], var20, arg12, arg0, (arg16 - this.field3737.method564(120, class254.field3528[var22])) / 2 + arg15, arg9, arg2);
            } else if (arg3 == 2) {
                this.method1725(-1, arg10, class254.field3528[var22], var20, arg12, arg0, arg15 - (this.field3737.method564(-101, class254.field3528[var22]) - arg16), arg9, arg2);
            } else if ((var19 - 1) == var22) {
                this.method1725(-1, arg10, class254.field3528[var22], var20, arg12, arg0, arg15, arg9, arg2);
            } else {
                this.method1711(class254.field3528[var22], arg16, (byte) 109);
                this.method1725(-1, arg10, class254.field3528[var22], var20, arg12, arg0, arg15, arg9, arg2);
                class214.field3033 = 0;
            }
            var20 += arg8;
        }
        return var19;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Z)V", line = 308)
    public static void method1716(boolean arg0) {
        if (arg0) {
            field3740 = null;
            field3727 = null;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILjava/lang/String;BIIIII)V", line = 320)
    public final void method1717(int arg0, String arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3720++;
        if (arg1 == null) {
            return;
        }
        this.method1710(arg5, -1, arg4);
        double var9 = 7.0D - ((double) arg6 / 8.0D);
        if (arg2 > -99) {
            this.method1725(61, null, null, -118, null, null, 79, -11, -57);
        }
        if (var9 < 0.0D) {
            var9 = 0.0D;
        }
        int var11 = arg1.length();
        int[] var12 = new int[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = (int) (var9 * Math.sin((double) var13 / 1.5D + (double) arg7));
        }
        this.method1721(null, -1, var12, arg1, null, arg0, null, arg3 - (this.field3737.method564(-110, arg1) / 2));
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Ljava/lang/String;Z)V", line = 361)
    private final void method1718(String arg0, boolean arg1) {
        try {
            if (arg0.startsWith("col=")) {
                class149.field1962 = class149.field1962 & 0xFF000000 | class176.method1181(arg0.substring(4), -1, 16) & 0xFFFFFF;
            } else if (arg0.equals("/col")) {
                class149.field1962 = class502.field7412 & 0xFFFFFF | class149.field1962 & 0xFF000000;
            }
            if (!arg1) {
                this.method161('K', 85, -21, 34, true, null, 108, -27);
            }
            if (arg0.startsWith("argb=")) {
                class149.field1962 = class176.method1181(arg0.substring(5), -1, 16);
            } else if (arg0.equals("/argb")) {
                class149.field1962 = class502.field7412;
            } else if (arg0.startsWith("str=")) {
                class75.field1101 = class149.field1962 & 0xFF000000 | class176.method1181(arg0.substring(4), -1, 16);
            } else if (arg0.equals("str")) {
                class75.field1101 = class149.field1962 & 0xFF000000 | 0x800000;
            } else if (arg0.equals("/str")) {
                class75.field1101 = -1;
            } else if (arg0.startsWith("u=")) {
                class395.field6037 = class149.field1962 & 0xFF000000 | class176.method1181(arg0.substring(2), -1, 16);
            } else if (arg0.equals("u")) {
                class395.field6037 = class149.field1962 & 0xFF000000;
            } else if (arg0.equals("/u")) {
                class395.field6037 = -1;
            } else if (arg0.equalsIgnoreCase("shad=-1")) {
                class444.field6675 = 0;
            } else if (arg0.startsWith("shad=")) {
                class444.field6675 = class149.field1962 & 0xFF000000 | class176.method1181(arg0.substring(5), -1, 16);
            } else if (arg0.equals("shad")) {
                class444.field6675 = class149.field1962 & 0xFF000000;
            } else if (arg0.equals("/shad")) {
                class444.field6675 = class279.field3964;
            } else if (arg0.equals("br")) {
                this.method1710(class502.field7412, -1, class279.field3964);
            }
        } catch (Exception var3) {
        }
        field3726++;
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(Z)Z", line = 436)
    public static final boolean method1719(boolean arg0) {
        if (!arg0) {
            method1724(null, (byte) 29);
        }
        field3735++;
        return class476.field7072 != class116.field1601 || class257.field3562 >= 2;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIILjava/lang/String;Li;IIIII[II[Laa;III)I", line = 448)
    public final int method1720(int arg0, int arg1, int arg2, String arg3, class30 arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int[] arg10, int arg11, class341[] arg12, int arg13, int arg14, int arg15) {
        field3732++;
        if (arg7 != -5594) {
            this.method1721(null, -26, null, null, null, -117, null, 38);
        }
        return this.method1715(arg10, arg6, arg13, arg5, 123, arg2, arg14, arg9, arg1, arg15, arg4, arg0, arg12, arg3, 0, arg8, arg11);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "([II[ILjava/lang/String;[Laa;I[II)V", line = 459)
    private final void method1721(int[] arg0, int arg1, int[] arg2, String arg3, class341[] arg4, int arg5, int[] arg6, int arg7) {
        int var9 = arg5 - this.field3737.field1195;
        field3722++;
        int var10 = arg1;
        int var11 = -1;
        int var12 = 0;
        int var13 = arg3.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class286.method1838(1, arg3.charAt(var14)) & 0xFF);
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
                                    if (arg6 == null) {
                                        var17 = 0;
                                    } else {
                                        var17 = arg6[var12];
                                    }
                                    int var18;
                                    if (arg2 == null) {
                                        var18 = 0;
                                    } else {
                                        var18 = arg2[var12];
                                    }
                                    var12++;
                                    int var19 = class370.method2349(10, var16.substring(4));
                                    class341 var20 = arg4[var19];
                                    int var21 = arg0 == null ? var20.method306() : arg0[var19];
                                    var20.method297(arg7 + var17, -var21 + var18 + this.field3737.field1195 + var9, 1, 0, 1);
                                    arg7 += arg4[var19].method302();
                                    var11 = -1;
                                } catch (Exception var25) {
                                }
                            } else {
                                this.method1718(var16, true);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var10 == -1) {
                    if (var11 != -1) {
                        arg7 += this.field3737.method557(0, var11, var15);
                    }
                    int var22;
                    if (arg6 == null) {
                        var22 = 0;
                    } else {
                        var22 = arg6[var12];
                    }
                    int var23;
                    if (arg2 == null) {
                        var23 = 0;
                    } else {
                        var23 = arg2[var12];
                    }
                    if (var15 != ' ') {
                        if ((class444.field6675 & 0xFF000000) != 0) {
                            this.method164(var15, arg7 + var22 + 1, var9 - (-var23 + -1), class444.field6675, true);
                        }
                        this.method164(var15, arg7 + var22, var9 + var23, class149.field1962, false);
                    } else if (class214.field3033 > 0) {
                        class300.field4406 += class214.field3033;
                        arg7 += class300.field4406 >> 8;
                        class300.field4406 &= 0xFF;
                    }
                    var12++;
                    int var24 = this.field3737.method554(255, var15);
                    if (class75.field1101 != -1) {
                        this.field3719.method1129(var24, (int) ((double) this.field3737.field1195 * 0.7D) + var9, 43, class75.field1101, arg7);
                    }
                    if (class395.field6037 != -1) {
                        this.field3719.method1129(var24, var9 + this.field3737.field1195, 43, class395.field6037, arg7);
                    }
                    var11 = var15;
                    arg7 += var24;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I[I[Laa;IIIIIIILjava/util/Random;Ljava/lang/String;[III)I", line = 620)
    public final int method1722(int arg0, int[] arg1, class341[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, Random arg10, String arg11, int[] arg12, int arg13, int arg14) {
        field3728++;
        if (arg11 == null) {
            return 0;
        }
        arg10.setSeed((long) arg6);
        int var16 = (arg10.nextInt() & 0x1F) + 192;
        this.method1710(var16 << 24 | arg7 & 0xFFFFFF, -1, var16 << 24 | arg13 & 0xFFFFFF);
        int var17 = arg11.length();
        int[] var18 = new int[var17];
        int var19 = 0;
        for (int var20 = 0; var20 < var17; var20++) {
            var18[var20] = var19;
            if ((arg10.nextInt() & 0x3) == 0) {
                var19++;
            }
        }
        int var21 = arg8;
        int var22 = this.field3737.field1201 + arg3;
        if (arg0 == 1) {
            var22 += (arg14 - this.field3737.field1201 - this.field3737.field1191) / 2;
        } else if (arg0 == 2) {
            var22 = arg3 + arg14 - this.field3737.field1191;
        }
        int var23 = -1;
        if (arg5 == 1) {
            var23 = var19 + this.field3737.method564(52, arg11);
            var21 = (arg4 - var23) / 2 + arg8;
        } else if (arg5 == 2) {
            var23 = this.field3737.method564(-94, arg11) + var19;
            var21 = arg4 + arg8 - var23;
        }
        this.method1721(arg12, -1, null, arg11, arg2, var22, var18, var21);
        if (arg1 != null) {
            if (var23 == -1) {
                var23 = var19 + this.field3737.method564(91, arg11);
            }
            arg1[1] = var22 - this.field3737.field1201;
            arg1[3] = this.field3737.field1201 + this.field3737.field1191;
            arg1[2] = var23;
            arg1[0] = var21;
        }
        if (arg9 != 32058) {
            this.method1721(null, 124, null, null, null, 10, null, 16);
        }
        return var19;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IBILjava/lang/String;III)V", line = 697)
    public final void method1723(int arg0, byte arg1, int arg2, String arg3, int arg4, int arg5, int arg6) {
        if (arg1 != -11) {
            this.field3737 = null;
        }
        field3718++;
        if (arg3 == null) {
            return;
        }
        this.method1710(arg0, arg1 ^ 0xA, arg6);
        int var8 = arg3.length();
        int[] var9 = new int[var8];
        for (int var10 = 0; var10 < var8; var10++) {
            var9[var10] = (int) (Math.sin((double) arg2 / 5.0D + (double) var10 / 2.0D) * 5.0D);
        }
        this.method1721(null, -1, var9, arg3, null, arg5, null, arg4 - (this.field3737.method564(arg1 + 103, arg3) / 2));
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 725)
    public static final void method1724(String arg0, byte arg1) {
        field3739++;
        System.exit(1);
        if (arg1 != -58) {
            method1724(null, (byte) 51);
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILi;Ljava/lang/String;I[Laa;[IIII)V", line = 738)
    private final void method1725(int arg0, class30 arg1, String arg2, int arg3, class341[] arg4, int[] arg5, int arg6, int arg7, int arg8) {
        int var10 = arg3 - this.field3737.field1195;
        field3721++;
        int var11 = -1;
        int var12 = arg0;
        int var13 = arg2.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class286.method1838(1, arg2.charAt(var14)) & 0xFF);
            if (var15 == '<') {
                var11 = var14;
            } else {
                if (var15 == '>' && var11 != -1) {
                    String var16 = arg2.substring(var11 + 1, var14);
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
                                    int var17 = class370.method2349(10, var16.substring(4));
                                    class341 var18 = arg4[var17];
                                    int var19 = arg5 == null ? var18.method306() : arg5[var17];
                                    if ((class149.field1962 & 0xFF000000) == -16777216) {
                                        var18.method297(arg6, var10 + this.field3737.field1195 - var19, 1, 0, 1);
                                    } else {
                                        var18.method297(arg6, var10 + this.field3737.field1195 - var19, 0, class149.field1962 & 0xFF000000 | 0xFFFFFF, 1);
                                    }
                                    arg6 += arg4[var17].method302();
                                    var12 = -1;
                                } catch (Exception var21) {
                                }
                            } else {
                                this.method1718(var16, true);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var11 == -1) {
                    if (var12 != -1) {
                        arg6 += this.field3737.method557(0, var12, var15);
                    }
                    if (var15 == ' ') {
                        if (class214.field3033 > 0) {
                            class300.field4406 += class214.field3033;
                            arg6 += class300.field4406 >> 8;
                            class300.field4406 &= 0xFF;
                        }
                    } else if (arg1 == null) {
                        if ((class444.field6675 & 0xFF000000) != 0) {
                            this.method164(var15, arg6 + 1, var10 + 1, class444.field6675, true);
                        }
                        this.method164(var15, arg6, var10, class149.field1962, false);
                    } else {
                        if ((class444.field6675 & 0xFF000000) != 0) {
                            this.method161(var15, arg6 + 1, var10 + 1, class444.field6675, true, arg1, arg7, arg8);
                        }
                        this.method161(var15, arg6, var10, class149.field1962, false, arg1, arg7, arg8);
                    }
                    int var20 = this.field3737.method554(255, var15);
                    if (class75.field1101 != -1) {
                        this.field3719.method1129(var20, (int) ((double) this.field3737.field1195 * 0.7D) + var10, arg0 + 44, class75.field1101, arg6);
                    }
                    if (class395.field6037 != -1) {
                        this.field3719.method1129(var20, this.field3737.field1195 + var10 + 1, 43, class395.field6037, arg6);
                    }
                    var12 = var15;
                    arg6 += var20;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(Lqa;Lju;)V", line = 889)
    public class268(class165 arg0, class82 arg1) {
        this.field3737 = arg1;
        this.field3719 = arg0;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(CIIIZLi;II)V")
    public abstract void method161(char arg0, int arg1, int arg2, int arg3, boolean arg4, class30 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "(CIIIZ)V")
    public abstract void method164(char arg0, int arg1, int arg2, int arg3, boolean arg4);
}
