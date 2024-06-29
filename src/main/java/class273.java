import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public abstract class class273 {

    @OriginalMember(owner = "client!wl", name = "m", descriptor = "Lii;")
    private class405 field3963;

    @OriginalMember(owner = "client!wl", name = "z", descriptor = "Lcl;")
    private class313 field3976;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "I")
    public static int field3951;

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "I")
    public static int field3952;

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "I")
    public static int field3953;

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "I")
    public static int field3954;

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "I")
    public static int field3955;

    @OriginalMember(owner = "client!wl", name = "f", descriptor = "I")
    public static int field3956;

    @OriginalMember(owner = "client!wl", name = "g", descriptor = "I")
    public static int field3957;

    @OriginalMember(owner = "client!wl", name = "h", descriptor = "I")
    public static int field3958;

    @OriginalMember(owner = "client!wl", name = "i", descriptor = "I")
    public static int field3959;

    @OriginalMember(owner = "client!wl", name = "j", descriptor = "I")
    public static int field3960;

    @OriginalMember(owner = "client!wl", name = "k", descriptor = "I")
    public static int field3961;

    @OriginalMember(owner = "client!wl", name = "l", descriptor = "I")
    public static int field3962;

    @OriginalMember(owner = "client!wl", name = "n", descriptor = "I")
    public static int field3964;

    @OriginalMember(owner = "client!wl", name = "o", descriptor = "I")
    public static int field3965;

    @OriginalMember(owner = "client!wl", name = "p", descriptor = "I")
    public static int field3966;

    @OriginalMember(owner = "client!wl", name = "q", descriptor = "I")
    public static int field3967;

    @OriginalMember(owner = "client!wl", name = "r", descriptor = "I")
    public static int field3968;

    @OriginalMember(owner = "client!wl", name = "s", descriptor = "I")
    public static int field3969;

    @OriginalMember(owner = "client!wl", name = "t", descriptor = "I")
    public static int field3970;

    @OriginalMember(owner = "client!wl", name = "v", descriptor = "I")
    public static int field3972;

    @OriginalMember(owner = "client!wl", name = "x", descriptor = "I")
    public static int field3974;

    @OriginalMember(owner = "client!wl", name = "y", descriptor = "I")
    public static int field3975;

    @OriginalMember(owner = "client!wl", name = "w", descriptor = "Llm;")
    public static class347 field3973;

    @OriginalMember(owner = "client!wl", name = "u", descriptor = "Lcq;")
    public static class67 field3971;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIIIIIILjava/lang/String;)V")
    public final void method1875(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, String arg7) {
        if (arg1 <= 123) {
            this.method443('\u0014', 43, -95, -94, false);
        }
        field3961++;
        if (arg7 == null) {
            return;
        }
        this.method1883(arg0, -1, arg3);
        double var9 = 7.0D - ((double) arg6 / 8.0D);
        if (var9 < 0.0D) {
            var9 = 0.0D;
        }
        int var11 = arg7.length();
        int[] var12 = new int[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = (int) (Math.sin((double) var13 / 1.5D + (double) arg2) * var9);
        }
        this.method1885(arg5, arg7, var12, (int[]) null, (class67[]) null, (int[]) null, false, arg4 - (this.field3976.method2127(255, arg7) / 2));
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Ljava/lang/String;IIIII)V")
    public final void method1876(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3962++;
        if (arg5 == 24412 && arg0 != null) {
            this.method1883(arg4, -1, arg2);
            this.method1886(arg3, (class67[]) null, (class2) null, 0, (int[]) null, false, arg0, arg1 - this.field3976.method2127(255, arg0), 0);
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IILjava/lang/String;[IIII[Lcq;IILud;IIBII)I")
    public final int method1877(int arg0, int arg1, String arg2, int[] arg3, int arg4, int arg5, int arg6, class67[] arg7, int arg8, int arg9, class2 arg10, int arg11, int arg12, byte arg13, int arg14, int arg15) {
        if (arg13 != -26) {
            return -72;
        }
        field3964++;
        if (arg2 == null) {
            return 0;
        }
        this.method1883(arg6, -1, arg4);
        if (arg11 == 0) {
            arg11 = this.field3976.field4584;
        }
        int[] var17;
        if (arg12 < this.field3976.field4578 + arg11 + this.field3976.field4596 && arg12 < (arg11 + arg11)) {
            var17 = null;
        } else {
            var17 = new int[] { arg9 };
        }
        int var18 = this.field3976.method2128(class98.field1375, arg2, var17, arg7, (byte) -83);
        if (arg14 == 3 && var18 == 1) {
            arg14 = 1;
        }
        int var19;
        if (arg14 == 0) {
            var19 = this.field3976.field4578 + arg1;
        } else if (arg14 == 1) {
            var19 = (arg12 - ((var18 - 1) * arg11) - this.field3976.field4596 - this.field3976.field4578) / 2 + this.field3976.field4578 + arg1;
        } else if (arg14 == 2) {
            var19 = arg1 + arg12 - this.field3976.field4596 - ((var18 + -1) * arg11);
        } else {
            int var20 = (arg12 - (var18 - 1) * arg11 - this.field3976.field4578 - this.field3976.field4596) / (var18 + 1);
            if (var20 < 0) {
                var20 = 0;
            }
            arg11 += var20;
            var19 = this.field3976.field4578 + var20 + arg1;
        }
        for (int var21 = 0; var21 < var18; var21++) {
            if (arg15 == 0) {
                this.method1886(var19, arg7, arg10, arg5, arg3, false, class98.field1375[var21], arg8, arg0);
            } else if (arg15 == 1) {
                this.method1886(var19, arg7, arg10, arg5, arg3, false, class98.field1375[var21], arg8 + (arg9 - this.field3976.method2127(255, class98.field1375[var21])) / 2, arg0);
            } else if (arg15 == 2) {
                this.method1886(var19, arg7, arg10, arg5, arg3, false, class98.field1375[var21], arg9 + (arg8 - this.field3976.method2127(255, class98.field1375[var21])), arg0);
            } else if (var18 - 1 == var21) {
                this.method1886(var19, arg7, arg10, arg5, arg3, false, class98.field1375[var21], arg8, arg0);
            } else {
                this.method1884(arg13 - 14352, class98.field1375[var21], arg9);
                this.method1886(var19, arg7, arg10, arg5, arg3, false, class98.field1375[var21], arg8, arg0);
                class152.field2060 = 0;
            }
            var19 += arg11;
        }
        return var18;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIILjava/lang/String;BI)V")
    public final void method1878(int arg0, int arg1, int arg2, String arg3, byte arg4, int arg5) {
        field3960++;
        if (arg3 != null) {
            this.method1883(arg1, -1, arg2);
            this.method1886(arg0, (class67[]) null, (class2) null, 0, (int[]) null, false, arg3, arg5, 0);
            int var7 = 66 / ((85 - arg4) / 34);
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIILjava/lang/String;III)V")
    public final void method1879(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5, int arg6) {
        field3953++;
        if (arg3 == null) {
            return;
        }
        this.method1883(arg5, -1, arg1);
        int var8 = arg3.length();
        int[] var9 = new int[var8];
        for (int var10 = 0; var10 < var8; var10++) {
            var9[var10] = (int) (Math.sin((double) arg6 / 5.0D + (double) var10 / 2.0D) * 5.0D);
        }
        this.method1885(arg2, arg3, var9, (int[]) null, (class67[]) null, (int[]) null, false, arg4 - (this.field3976.method2127(arg0 ^ 0xFD, arg3) / arg0));
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(CIIIZLud;II)V")
    public abstract void method445(char arg0, int arg1, int arg2, int arg3, boolean arg4, class2 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Ljava/lang/String;BI[III[Lcq;I)V")
    public final void method1880(String arg0, byte arg1, int arg2, int[] arg3, int arg4, int arg5, class67[] arg6, int arg7) {
        field3969++;
        if (arg0 != null) {
            this.method1883(arg7, -1, arg4);
            if (arg1 == 1) {
                this.method1886(arg5, arg6, (class2) null, 0, arg3, false, arg0, arg2 - this.field3976.method2127(255, arg0) / 2, 0);
            }
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(ILjava/lang/String;IIII)V")
    public final void method1881(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = 123 / ((15 - arg5) / 46);
        field3959++;
        if (arg1 != null) {
            this.method1883(arg3, -1, arg4);
            this.method1886(arg2, (class67[]) null, (class2) null, 0, (int[]) null, false, arg1, arg0 - (this.field3976.method2127(255, arg1) / 2), 0);
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(BII[Lcq;I[IILjava/lang/String;)V")
    public final void method1882(byte arg0, int arg1, int arg2, class67[] arg3, int arg4, int[] arg5, int arg6, String arg7) {
        int var9 = -64 / ((arg0 - 23) / 39);
        field3954++;
        if (arg7 != null) {
            this.method1883(arg6, -1, arg4);
            this.method1886(arg2, arg3, (class2) null, 0, arg5, false, arg7, arg1 - this.field3976.method2127(255, arg7), 0);
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(III)V")
    private final void method1883(int arg0, int arg1, int arg2) {
        class232.field3088 = 0;
        field3967++;
        class21.field274 = arg1;
        class76.field1083 = -1;
        class152.field2060 = 0;
        if (arg0 == -1) {
            arg0 = 0;
        }
        class4.field43 = arg2;
        class17.field230 = arg2;
        class416.field6109 = arg0;
        class356.field5146 = arg0;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(ILjava/lang/String;I)V")
    private final void method1884(int arg0, String arg1, int arg2) {
        field3955++;
        int var4 = 0;
        boolean var5 = false;
        int var6 = 0;
        if (arg0 != -14378) {
            this.method1875(47, 82, -82, -47, -128, 123, 25, (String) null);
        }
        while (arg1.length() > var6) {
            char var7 = arg1.charAt(var6);
            if (var7 == '<') {
                var5 = true;
            } else if (var7 == '>') {
                var5 = false;
            } else if (!var5 && var7 == ' ') {
                var4++;
            }
            var6++;
        }
        if (var4 > 0) {
            class152.field2060 = (arg2 - this.field3976.method2127(arg0 ^ 0xFFFFC729, arg1) << 8) / var4;
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(ILjava/lang/String;[I[I[Lcq;[IZI)V")
    private final void method1885(int arg0, String arg1, int[] arg2, int[] arg3, class67[] arg4, int[] arg5, boolean arg6, int arg7) {
        field3958++;
        if (arg6) {
            this.field3963 = null;
        }
        int var9 = arg0 - this.field3976.field4584;
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        int var13 = arg1.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class177.method1079(124, arg1.charAt(var14)) & 0xFF);
            if (var15 == '<') {
                var10 = var14;
            } else {
                if (var15 == '>' && var10 != -1) {
                    String var16 = arg1.substring(var10 + 1, var14);
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
                                    if (arg2 == null) {
                                        var18 = 0;
                                    } else {
                                        var18 = arg2[var12];
                                    }
                                    var12++;
                                    int var19 = class351.method2312(-1035, var16.substring(4));
                                    class67 var20 = arg4[var19];
                                    int var21 = arg5 == null ? var20.method409() : arg5[var19];
                                    var20.method407(arg7 + var17, -var21 + var18 + this.field3976.field4584 + var9, 0, 0, 1);
                                    var11 = -1;
                                    arg7 += arg4[var19].method411();
                                } catch (Exception var25) {
                                }
                            } else {
                                this.method1890(4, var16);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var10 == -1) {
                    if (var11 != -1) {
                        arg7 += this.field3976.method2119(0, var15, var11);
                    }
                    int var22;
                    if (arg3 == null) {
                        var22 = 0;
                    } else {
                        var22 = arg3[var12];
                    }
                    int var23;
                    if (arg2 == null) {
                        var23 = 0;
                    } else {
                        var23 = arg2[var12];
                    }
                    var12++;
                    if (var15 != ' ') {
                        if ((class356.field5146 & 0xFF000000) != 0) {
                            this.method443(var15, arg7 + var22 + 1, var9 + 1 + var23, class356.field5146, true);
                        }
                        this.method443(var15, arg7 + var22, var9 + var23, class17.field230, false);
                    } else if (class152.field2060 > 0) {
                        class232.field3088 += class152.field2060;
                        arg7 += class232.field3088 >> 8;
                        class232.field3088 &= 0xFF;
                    }
                    int var24 = this.field3976.method2118(var15, (byte) -27);
                    if (class21.field274 != -1) {
                        this.field3963.method2612(arg7, class21.field274, (int) ((double) this.field3976.field4584 * 0.7D) + var9, 1, var24);
                    }
                    if (class76.field1083 != -1) {
                        this.field3963.method2612(arg7, class76.field1083, this.field3976.field4584 + var9, 1, var24);
                    }
                    var11 = var15;
                    arg7 += var24;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(I[Lcq;Lud;I[IZLjava/lang/String;II)V")
    private final void method1886(int arg0, class67[] arg1, class2 arg2, int arg3, int[] arg4, boolean arg5, String arg6, int arg7, int arg8) {
        int var10 = arg0 - this.field3976.field4584;
        field3966++;
        int var11 = -1;
        int var12 = -1;
        int var13 = arg6.length();
        int var14 = 0;
        if (arg5) {
            return;
        }
        while (var14 < var13) {
            char var15 = (char) (class177.method1079(125, arg6.charAt(var14)) & 0xFF);
            if (var15 == '<') {
                var11 = var14;
            } else {
                label106: {
                    if (var15 == '>' && var11 != -1) {
                        String var16 = arg6.substring(var11 + 1, var14);
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
                                        int var17 = class351.method2312(-1035, var16.substring(4));
                                        class67 var18 = arg1[var17];
                                        int var19 = arg4 == null ? var18.method409() : arg4[var17];
                                        if ((class17.field230 & 0xFF000000) == -16777216) {
                                            var18.method407(arg7, var10 + this.field3976.field4584 - var19, 0, 0, 1);
                                        } else {
                                            var18.method407(arg7, this.field3976.field4584 + var10 - var19, 1, class17.field230 & 0xFF000000 | 0xFFFFFF, 1);
                                        }
                                        arg7 += arg1[var17].method411();
                                        var12 = -1;
                                    } catch (Exception var21) {
                                    }
                                } else {
                                    this.method1890(4, var16);
                                }
                                break label106;
                            }
                            var15 = '®';
                        }
                    }
                    if (var11 == -1) {
                        if (var12 != -1) {
                            arg7 += this.field3976.method2119(0, var15, var12);
                        }
                        if (var15 == ' ') {
                            if (class152.field2060 > 0) {
                                class232.field3088 += class152.field2060;
                                arg7 += class232.field3088 >> 8;
                                class232.field3088 &= 0xFF;
                            }
                        } else if (arg2 == null) {
                            if ((class356.field5146 & 0xFF000000) != 0) {
                                this.method443(var15, arg7 + 1, var10 - -1, class356.field5146, true);
                            }
                            this.method443(var15, arg7, var10, class17.field230, false);
                        } else {
                            if ((class356.field5146 & 0xFF000000) != 0) {
                                this.method445(var15, arg7 + 1, var10 + 1, class356.field5146, true, arg2, arg3, arg8);
                            }
                            this.method445(var15, arg7, var10, class17.field230, false, arg2, arg3, arg8);
                        }
                        int var20 = this.field3976.method2118(var15, (byte) -27);
                        if (class21.field274 != -1) {
                            this.field3963.method2612(arg7, class21.field274, (int) ((double) this.field3976.field4584 * 0.7D) + var10, 1, var20);
                        }
                        if (class76.field1083 != -1) {
                            this.field3963.method2612(arg7, class76.field1083, this.field3976.field4584 + var10 + 1, 1, var20);
                        }
                        arg7 += var20;
                        var12 = var15;
                    }
                }
            }
            var14++;
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIILwm;IIIILwm;I)V")
    public static final void method1887(int arg0, int arg1, int arg2, class298 arg3, int arg4, int arg5, int arg6, int arg7, class298 arg8, int arg9) {
        field3951++;
        int var10 = arg8.method172(arg2);
        if (var10 == -1) {
            return;
        }
        Object var11 = null;
        class67 var12 = (class67) class88.field1231.method1137((long) var10, arg2 + 2108653711);
        if (var12 == null) {
            class441[] var13 = class441.method2779(class362.field5227, var10, 0);
            if (var13 == null) {
                return;
            }
            var12 = class61.field807.method1710(var13[0], true);
            class88.field1231.method1144((long) var10, var12, -3480);
        }
        class83.method579(arg7 >> 1, arg3.field740, arg0 >> 1, 52, arg6, arg3.method168(arg2 ^ 0xFFFFFF83) * 64, arg3.field734, arg2, arg5);
        int var14 = arg9 + class375.field5458[0] - 18;
        int var15 = class375.field5458[1] + arg1 - 70;
        int var16 = arg4 / 4 * 18 + var14;
        int var17 = arg4 % 4 * 18 + var15;
        var12.method454(var16, var17);
        if (arg3 == arg8) {
            class61.field807.method2616(18, 1, var16 - 1, 18, -256, var17 - 1);
        }
        class413 var18 = class211.method1256(true);
        var18.field6077 = arg8;
        var18.field6084 = var16;
        var18.field6080 = var17;
        var18.field6081 = var17 + 16;
        var18.field6082 = var16 + 16;
        class407.field6039.method1003(arg2 + 2166, var18);
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IB)Lfk;")
    public static final class23 method1888(int arg0, byte arg1) {
        field3974++;
        class23 var2 = (class23) class26.field362.method1137((long) arg0, 2108653711);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class379.field5512.method2261(arg0, 35, 89);
        if (arg1 >= -61) {
            method1887(71, -78, 38, (class298) null, 13, 101, -116, -77, (class298) null, 33);
        }
        class23 var4 = new class23();
        if (var3 != null) {
            var4.method152(new class228(var3), 8912);
        }
        var4.method155(2);
        class26.field362.method1144((long) arg0, var4, -3480);
        return var4;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIII[ILjava/lang/String;[Lcq;I)V")
    public final void method1889(int arg0, int arg1, int arg2, int arg3, int[] arg4, String arg5, class67[] arg6, int arg7) {
        field3970++;
        if (arg5 == null) {
            return;
        }
        if (arg2 > -58) {
            field3973 = null;
        }
        this.method1883(arg7, -1, arg0);
        this.method1886(arg3, arg6, (class2) null, 0, arg4, false, arg5, arg1, 0);
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(ILjava/lang/String;)V")
    private final void method1890(int arg0, String arg1) {
        try {
            if (arg1.startsWith("col=")) {
                class17.field230 = class17.field230 & 0xFF000000 | class281.method1934(false, 16, arg1.substring(4)) & 0xFFFFFF;
            } else if (arg1.equals("/col")) {
                class17.field230 = class4.field43 & 0xFFFFFF | class17.field230 & 0xFF000000;
            }
            if (arg1.startsWith("argb=")) {
                class17.field230 = class281.method1934(false, 16, arg1.substring(5));
            } else if (arg1.equals("/argb")) {
                class17.field230 = class4.field43;
            } else if (arg1.startsWith("str=")) {
                class21.field274 = class281.method1934(false, 16, arg1.substring(4)) | 0xFF000000;
            } else if (arg1.equals("str")) {
                class21.field274 = -8388608;
            } else if (arg1.equals("/str")) {
                class21.field274 = -1;
            } else if (arg1.startsWith("u=")) {
                class76.field1083 = class281.method1934(false, 16, arg1.substring(2)) | 0xFF000000;
            } else if (arg1.equals("u")) {
                class76.field1083 = -16777216;
            } else if (arg1.equals("/u")) {
                class76.field1083 = -1;
            } else if (arg1.equalsIgnoreCase("shad=-1")) {
                class356.field5146 = 0;
            } else if (arg1.startsWith("shad=")) {
                class356.field5146 = class281.method1934(false, 16, arg1.substring(5)) | 0xFF000000;
            } else if (arg1.equals("shad")) {
                class356.field5146 = -16777216;
            } else if (arg1.equals("/shad")) {
                class356.field5146 = class416.field6109;
            } else if (arg1.equals("br")) {
                this.method1883(class416.field6109, -1, class4.field43);
            }
        } catch (Exception var3) {
        }
        field3952++;
        if (arg0 != 4) {
            this.method1893(77, -103, 101, (Random) null, (class67[]) null, (String) null, true, (int[]) null, -15, 91);
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Ljava/lang/String;IIZIII)V")
    public final void method1891(String arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        field3975++;
        if (arg0 == null) {
            return;
        }
        this.method1883(arg2, -1, arg5);
        int var8 = arg0.length();
        int[] var9 = new int[var8];
        int[] var10 = new int[var8];
        if (!arg3) {
            this.method1894((class67[]) null, -85, (int[]) null, 39, -61, (String) null, 6, 64, -5, (Random) null, 92, 44, -73, 90, (int[]) null);
        }
        for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = (int) (Math.sin((double) arg6 / 5.0D + (double) var11 / 5.0D) * 5.0D);
            var10[var11] = (int) (Math.sin((double) arg6 / 5.0D + (double) var11 / 3.0D) * 5.0D);
        }
        this.method1885(arg1, arg0, var10, var9, (class67[]) null, (int[]) null, false, arg4 - (this.field3976.method2127(255, arg0) / 2));
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(B)V")
    public static void method1892(byte arg0) {
        field3973 = null;
        if (arg0 != 72) {
            method1892((byte) 16);
        }
        field3971 = null;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIILjava/util/Random;[Lcq;Ljava/lang/String;Z[III)I")
    public final int method1893(int arg0, int arg1, int arg2, Random arg3, class67[] arg4, String arg5, boolean arg6, int[] arg7, int arg8, int arg9) {
        field3968++;
        if (arg5 == null) {
            return 0;
        }
        arg3.setSeed((long) arg0);
        int var11 = (arg3.nextInt() & 0x1F) + 192;
        this.method1883(var11 << 24 | arg9 & 0xFFFFFF, -1, var11 << 24 | arg1 & 0xFFFFFF);
        int var12 = arg5.length();
        int[] var13 = new int[var12];
        int var14 = 0;
        for (int var15 = 0; var15 < var12; var15++) {
            var13[var15] = var14;
            if ((arg3.nextInt() & 0x3) == 0) {
                var14++;
            }
        }
        this.method1885(arg8, arg5, (int[]) null, var13, arg4, arg7, arg6, arg2);
        return var14;
    }

    @OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(Lii;Lcl;)V")
    public class273(class405 arg0, class313 arg1) {
        this.field3963 = arg0;
        this.field3976 = arg1;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "([Lcq;I[IIILjava/lang/String;IIILjava/util/Random;IIII[I)I")
    public final int method1894(class67[] arg0, int arg1, int[] arg2, int arg3, int arg4, String arg5, int arg6, int arg7, int arg8, Random arg9, int arg10, int arg11, int arg12, int arg13, int[] arg14) {
        field3972++;
        if (arg6 != 16044) {
            this.method1880((String) null, (byte) -124, 99, (int[]) null, 66, 60, (class67[]) null, -2);
        }
        if (arg5 == null) {
            return 0;
        }
        arg9.setSeed((long) arg1);
        int var16 = (arg9.nextInt() & 0x1F) + 192;
        this.method1883(arg10 & 0xFFFFFF | var16 << 24, -1, arg4 & 0xFFFFFF | var16 << 24);
        int var17 = arg5.length();
        int[] var18 = new int[var17];
        int var19 = 0;
        for (int var20 = 0; var20 < var17; var20++) {
            var18[var20] = var19;
            if ((arg9.nextInt() & 0x3) == 0) {
                var19++;
            }
        }
        int var21 = arg11;
        int var22 = arg3 + this.field3976.field4578;
        int var23 = -1;
        if (arg7 == 1) {
            var22 += (arg12 - (this.field3976.field4578 + this.field3976.field4596)) / 2;
        } else if (arg7 == 2) {
            var22 = arg3 + arg12 - this.field3976.field4596;
        }
        if (arg13 == 1) {
            var23 = var19 + this.field3976.method2127(255, arg5);
            var21 = (arg8 - var23) / 2 + arg11;
        } else if (arg13 == 2) {
            var23 = var19 + this.field3976.method2127(255, arg5);
            var21 = arg8 + arg11 - var23;
        }
        this.method1885(var22, arg5, (int[]) null, var18, arg0, arg2, false, var21);
        if (arg14 != null) {
            if (var23 == -1) {
                var23 = this.field3976.method2127(arg6 - 15789, arg5) + var19;
            }
            arg14[2] = var23;
            arg14[0] = var21;
            arg14[1] = var22 - this.field3976.field4578;
            arg14[3] = this.field3976.field4578 + this.field3976.field4596;
        }
        return var19;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(CIIIZ)V")
    public abstract void method443(char arg0, int arg1, int arg2, int arg3, boolean arg4);
}
