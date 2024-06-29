import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wga")
public class class750 {

    @OriginalMember(owner = "client!wga", name = "h", descriptor = "I")
    private int field10439 = -1;

    @OriginalMember(owner = "client!wga", name = "p", descriptor = "Z")
    public boolean field10447 = true;

    @OriginalMember(owner = "client!wga", name = "c", descriptor = "Lrda;")
    private class663 field10434;

    @OriginalMember(owner = "client!wga", name = "g", descriptor = "I")
    private int field10438;

    @OriginalMember(owner = "client!wga", name = "n", descriptor = "I")
    private int field10445;

    @OriginalMember(owner = "client!wga", name = "r", descriptor = "Ljl;")
    private class274 field10449;

    @OriginalMember(owner = "client!wga", name = "s", descriptor = "I")
    private int field10450;

    @OriginalMember(owner = "client!wga", name = "e", descriptor = "Las;")
    private class154 field10436;

    @OriginalMember(owner = "client!wga", name = "o", descriptor = "Lvp;")
    private class190 field10446;

    @OriginalMember(owner = "client!wga", name = "d", descriptor = "Lsia;")
    private class737 field10435;

    @OriginalMember(owner = "client!wga", name = "l", descriptor = "Lhda;")
    public static class752 field10443 = new class752(114, 8);

    @OriginalMember(owner = "client!wga", name = "q", descriptor = "[I")
    public static int[] field10448 = new int[4096];

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "I")
    public static int field10432;

    @OriginalMember(owner = "client!wga", name = "b", descriptor = "I")
    public static int field10433;

    @OriginalMember(owner = "client!wga", name = "f", descriptor = "I")
    public static int field10437;

    @OriginalMember(owner = "client!wga", name = "i", descriptor = "I")
    public static int field10440;

    @OriginalMember(owner = "client!wga", name = "j", descriptor = "I")
    public static int field10441;

    @OriginalMember(owner = "client!wga", name = "k", descriptor = "I")
    public static int field10442;

    @OriginalMember(owner = "client!wga", name = "m", descriptor = "I")
    public static int field10444;

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(I)V")
    public static void method4203(int arg0) {
        field10443 = null;
        field10448 = null;
        if (arg0 >= -113) {
            method4206(24);
        }
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(B)V")
    private final void method4204(byte arg0) {
        field10432++;
        if (!this.field10447) {
            return;
        }
        this.field10447 = false;
        byte[] var2 = this.field10449.field3818;
        byte[] var3 = this.field10434.field9100;
        int var4 = 0;
        int var5 = this.field10449.field3816;
        int var6 = this.field10438 + (this.field10449.field3816 * this.field10445);
        for (int var7 = -128; var7 < 0; var7++) {
            var4 = (var4 << 8) - var4;
            for (int var13 = -128; var13 < 0; var13++) {
                if (var2[var6++] != 0) {
                    var4++;
                }
            }
            var6 += var5 - 128;
        }
        if (this.field10435 != null && this.field10439 == var4) {
            this.field10447 = false;
            return;
        }
        this.field10439 = var4;
        int var8 = 0;
        int var9 = this.field10438 + (this.field10445 * var5);
        for (int var10 = -128; var10 < 0; var10++) {
            for (int var11 = -128; var11 < 0; var11++) {
                if (var2[var9] == 0) {
                    int var12 = 0;
                    if (var2[var9 - 1] != 0) {
                        var12++;
                    }
                    if (var2[var9 + 1] != 0) {
                        var12++;
                    }
                    if (var2[var9 - var5] != 0) {
                        var12++;
                    }
                    if (var2[var5 + var9] != 0) {
                        var12++;
                    }
                    var3[var8++] = (byte) (var12 * 17);
                } else {
                    var3[var8++] = 68;
                }
                var9++;
            }
            var9 += this.field10449.field3816 - 128;
        }
        if (arg0 != 17) {
            this.field10439 = -17;
        }
        if (this.field10435 == null) {
            this.field10435 = new class737(this.field10434, 3553, 6406, 128, 128, false, this.field10434.field9100, 6406, false);
            this.field10435.method4116((byte) -60, false, false);
            this.field10435.method2615(false, true);
        } else {
            this.field10435.method4118(this.field10434.field9100, 6406, 0, 0, 0, 0, false, 128, 59, 128);
        }
    }

    @OriginalMember(owner = "client!wga", name = "b", descriptor = "(B)V")
    public final void method4205(byte arg0) {
        if (arg0 != 113) {
            this.field10445 = 106;
        }
        this.method4207((byte) -121, this.field10450, this.field10436);
        field10444++;
    }

    @OriginalMember(owner = "client!wga", name = "b", descriptor = "(I)V")
    public static final void method4206(int arg0) {
        for (int var1 = 0; var1 < class501.field6728; var1++) {
            class121 var3 = class503.field6751[var1];
            boolean var4 = false;
            if (var3.field1939 == null) {
                var3.field1934--;
                if (var3.field1934 < (var3.method975(4236) ? -1500 : -10)) {
                    var4 = true;
                } else {
                    if (var3.field1930 == 1 && var3.field1926 == null) {
                        var3.field1926 = class174.method1219(class250.field3445, var3.field1938, 0);
                        if (var3.field1926 == null) {
                            continue;
                        }
                        var3.field1934 += var3.field1926.method1221();
                    } else if (var3.method975(4236) && (var3.field1936 == null || var3.field1928 == null)) {
                        if (var3.field1936 == null) {
                            var3.field1936 = class627.method3445(class11.field175, var3.field1938);
                        }
                        if (var3.field1936 == null) {
                            continue;
                        }
                        if (var3.field1928 == null) {
                            var3.field1928 = var3.field1936.method3450(new int[] { 22050 });
                            if (var3.field1928 == null) {
                                continue;
                            }
                        }
                    }
                    if (var3.field1934 < 0) {
                        int var5 = 8192;
                        int var6;
                        if (var3.field1940 == 0) {
                            var6 = var3.field1924 * (var3.field1930 == 3 ? class411.field5711.field3894.method2432(true) : class411.field5711.field3887.method2432(true)) >> 2;
                        } else {
                            int var7 = var3.field1940 >> 24 & 0x3;
                            if (class472.field6475.field3508 == var7) {
                                int var8 = (var3.field1940 & 0xFF) << 9;
                                int var9 = class472.field6475.method2256(-1) << 8;
                                int var10 = (var3.field1940 & 0xFF5577) >> 16;
                                int var11 = (var10 << 9) + 256 - (-var9 + class472.field6475.field3505);
                                int var12 = (var3.field1940 & 0xFFC7) >> 8;
                                int var13 = (var12 << 9) + var9 + 256 - class472.field6475.field3502;
                                int var14 = Math.abs(var11) + Math.abs(var13) - 512;
                                if (var8 < var14) {
                                    var3.field1934 = -99999;
                                    continue;
                                }
                                if (var14 < 0) {
                                    var14 = 0;
                                }
                                var6 = class411.field5711.field3880.method2432(true) * (var8 - var14) * var3.field1924 / var8 >> 2;
                                if (var3.field1931 != null && var3.field1931 instanceof class675) {
                                    class675 var15 = (class675) var3.field1931;
                                    short var16 = var15.field9354;
                                    short var17 = var15.field9367;
                                }
                                if (var11 != 0 || var13 != 0) {
                                    int var18 = -class372.field5175 - (int) (Math.atan2((double) var11, (double) var13) * 2607.5945876176133D) - 4096 & 0x3FFF;
                                    if (var18 > 8192) {
                                        var18 = 16384 - var18;
                                    }
                                    int var19;
                                    if (var14 <= 0) {
                                        var19 = 8192;
                                    } else if (var14 < 4096) {
                                        var19 = ((8192 - var14) / 4096) + 8192;
                                    } else {
                                        var19 = 16384;
                                    }
                                    var5 = (16384 - var19 >> 1) + var18 * var19 / 8192;
                                }
                            } else {
                                var6 = 0;
                            }
                        }
                        if (var6 > 0) {
                            class147 var20 = null;
                            if (var3.field1930 == 1) {
                                var20 = var3.field1926.method1220().method1108(class383.field5318);
                            } else if (var3.method975(4236)) {
                                var20 = var3.field1928;
                            }
                            class527 var21 = var3.field1939 = class527.method2915(var20, var3.field1935, var6, var5);
                            var21.method2927(var3.field1933 - 1);
                            class603.field7927.method1608(var21);
                        }
                    }
                }
            } else if (!var3.field1939.method3566((byte) 78)) {
                var4 = true;
            }
            if (var4) {
                class501.field6728--;
                for (int var22 = var1; var22 < class501.field6728; var22++) {
                    class503.field6751[var22] = class503.field6751[var22 + 1];
                }
                var1--;
            }
        }
        field10433++;
        if (class122.field1996 && !class438.method2521(-114)) {
            if (class411.field5711.field3899.method2432(true) != 0 && class453.field6192 != -1) {
                if (class637.field8466 == null) {
                    class238.method1498(false, 105, class453.field6192, 0, class411.field5711.field3899.method2432(true), class165.field2501);
                } else {
                    class400.method2351(2, false, 0, class411.field5711.field3899.method2432(true), class637.field8466, class165.field2501, class453.field6192);
                }
            }
            class637.field8466 = null;
            class122.field1996 = false;
        } else if (class411.field5711.field3899.method2432(true) != 0 && class453.field6192 != -1 && !class438.method2521(-115)) {
            class621.field8276++;
            class583 var2 = class381.method2246(1, class128.field2105, class676.field9385);
            var2.field7637.method3798(27695, class453.field6192);
            class42.method309(var2, 0);
            class453.field6192 = -1;
        }
        if (arg0 > -31) {
            method4203(-102);
        }
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(BILas;)V")
    private final void method4207(byte arg0, int arg1, class154 arg2) {
        field10437++;
        if (arg1 != 0) {
            this.method4204((byte) 17);
            int var4 = 110 % ((arg0 + 11) / 49);
            this.field10434.method3639(-2, this.field10435);
            this.field10434.method3647(arg2, 0, (byte) -78, 4, arg1);
        }
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(Laha;B[[B)V")
    public static final void method4208(class385 arg0, byte arg1, byte[][] arg2) {
        field10440++;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        for (int var4 = 0; var4 < arg0.field6057; var4++) {
            class651.method3552(-25926);
            for (int var9 = 0; var9 < class719.field10004 >> 3; var9++) {
                for (int var10 = 0; var10 < class107.field1453 >> 3; var10++) {
                    int var11 = class447.field6131[var4][var9][var10];
                    if (var11 != -1) {
                        int var12 = (var11 & 0x3D49EE9) >> 24;
                        if (!arg0.field6053 || var12 == 0) {
                            int var13 = var11 >> 1 & 0x3;
                            int var14 = (var11 & 0xFFF94A) >> 14;
                            int var15 = (var11 & 0x3FFC) >> 3;
                            int var16 = (var14 / 8 << 8) + var15 / 8;
                            for (int var17 = 0; var17 < class197.field2972.length; var17++) {
                                if (class197.field2972[var17] == var16 && arg2[var17] != null) {
                                    class677 var18 = new class677(arg2[var17]);
                                    arg0.method2520(var14, var10 * 8, (byte) 2, var13, var12, class456.field6226, var18, var4, var15, var9 * 8);
                                    arg0.method2283((byte) -100, var15, var14, var12, var10 * 8, var9 * 8, var18, var13, class341.field4807, var3[0] == -1 ? var3 : null, var4);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        for (int var5 = 0; var5 < arg0.field6057; var5++) {
            class651.method3552(-25926);
            for (int var6 = 0; var6 < (class719.field10004 >> 3); var6++) {
                for (int var7 = 0; var7 < class107.field1453 >> 3; var7++) {
                    int var8 = class447.field6131[var5][var6][var7];
                    if (var8 == -1) {
                        arg0.method2518(-1, 8, 8, var5, var6 * 8, var7 * 8);
                    }
                }
            }
        }
        if (arg1 < 51) {
            field10443 = null;
        }
        if (var3[0] != -1) {
            class749.field10430 = class2.field26.method3691(var3[2], var3[0], -23470, var3[1], var3[3], class137.field2187);
            class142.field2269 = var3[4];
        }
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(IBI)I")
    public static final int method4209(int arg0, byte arg1, int arg2) {
        field10442++;
        if (arg1 != -56) {
            field10443 = null;
        }
        if (arg2 == -2) {
            return 12345678;
        } else if (arg2 == -1) {
            if (arg0 < 2) {
                arg0 = 2;
            } else if (arg0 > 126) {
                arg0 = 126;
            }
            return arg0;
        } else {
            int var3 = (arg2 & 0x7F) * arg0 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg2 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(BI[BI)V")
    public final void method4210(byte arg0, int arg1, byte[] arg2, int arg3) {
        this.field10446.method678(arg3 * this.field10434.method3666(-67, arg1), 20218, arg1, arg2);
        field10441++;
        this.method4207((byte) 40, arg3, this.field10446);
        if (arg0 <= 78) {
            this.method4204((byte) -77);
        }
    }

    @OriginalMember(owner = "client!wga", name = "<init>", descriptor = "(Lrda;Ljl;Lmu;IIIII)V")
    public class750(class663 arg0, class274 arg1, class304 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field10434 = arg0;
        this.field10438 = arg6;
        this.field10445 = arg7;
        this.field10449 = arg1;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var25 = (var12 + var13) * arg2.field3992 + var11;
            for (int var26 = 0; var26 < var9; var26++) {
                short[] var27 = arg2.field4329[var25++];
                if (var27 != null) {
                    var10 += var27.length;
                }
            }
        }
        this.field10450 = var10;
        if (var10 <= 0) {
            this.field10435 = null;
        } else {
            class677 var14 = new class677(var10 * 2);
            if (this.field10434.field9021) {
                for (int var20 = 0; var20 < var9; var20++) {
                    int var21 = (var12 + var20) * arg2.field3992 + var11;
                    for (int var22 = 0; var22 < var9; var22++) {
                        short[] var23 = arg2.field4329[var21++];
                        if (var23 != null) {
                            for (int var24 = 0; var24 < var23.length; var24++) {
                                var14.method3831(1182, var23[var24] & 0xFFFF);
                            }
                        }
                    }
                }
            } else {
                for (int var15 = 0; var15 < var9; var15++) {
                    int var16 = (var12 + var15) * arg2.field3992 + var11;
                    for (int var17 = 0; var17 < var9; var17++) {
                        short[] var18 = arg2.field4329[var16++];
                        if (var18 != null) {
                            for (int var19 = 0; var19 < var18.length; var19++) {
                                var14.method3819(var18[var19] & 0xFFFF, 125);
                            }
                        }
                    }
                }
            }
            this.field10436 = this.field10434.method3627(5123, (byte) -85, var14.field9399, var14.field9419, false);
            this.field10446 = new class190(this.field10434, 5123, null, 1);
        }
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field10448[var0] = class251.method1534(var0, (byte) 99);
        }
    }
}
