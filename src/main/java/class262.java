import java.util.Calendar;
import java.util.Random;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public abstract class class262 {

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "Ldd;")
    private class166 field3875;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "Lqa;")
    private class167 field3868;

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "[B")
    public static byte[] field3877 = new byte[2048];

    @OriginalMember(owner = "client!ra", name = "m", descriptor = "Ljava/util/Calendar;")
    public static Calendar field3880 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "I")
    public static int field3869;

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "I")
    public static int field3870;

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "I")
    public static int field3871;

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "I")
    public static int field3872;

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "I")
    public static int field3873;

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "I")
    public static int field3874;

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "I")
    public static int field3876;

    @OriginalMember(owner = "client!ra", name = "k", descriptor = "I")
    public static int field3878;

    @OriginalMember(owner = "client!ra", name = "l", descriptor = "I")
    public static int field3879;

    @OriginalMember(owner = "client!ra", name = "n", descriptor = "I")
    public static int field3881;

    @OriginalMember(owner = "client!ra", name = "o", descriptor = "I")
    public static int field3882;

    @OriginalMember(owner = "client!ra", name = "p", descriptor = "I")
    public static int field3883;

    @OriginalMember(owner = "client!ra", name = "r", descriptor = "I")
    public static int field3885;

    @OriginalMember(owner = "client!ra", name = "s", descriptor = "I")
    public static int field3886;

    @OriginalMember(owner = "client!ra", name = "t", descriptor = "I")
    public static int field3887;

    @OriginalMember(owner = "client!ra", name = "u", descriptor = "I")
    public static int field3888;

    @OriginalMember(owner = "client!ra", name = "v", descriptor = "I")
    public static int field3889;

    @OriginalMember(owner = "client!ra", name = "w", descriptor = "I")
    public static int field3890;

    @OriginalMember(owner = "client!ra", name = "q", descriptor = "Ldda;")
    public static class597 field3884;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIZLjava/lang/String;II)V")
    public final void method1665(int arg0, int arg1, boolean arg2, String arg3, int arg4, int arg5) {
        field3888++;
        if (arg3 == null) {
            return;
        }
        this.method1672(arg4, (byte) 124, arg0);
        this.method1682(0, null, 0, true, null, arg1 - (this.field3875.method1053((byte) -78, arg3) / 2), null, arg5, arg3);
        if (arg2) {
            this.method529((char) 65448, 15, 29, 30, true, null, 91, -79);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "([Lha;IIBLpa;IIIIIIILjava/lang/String;I[III)I")
    public final int method1666(class116[] arg0, int arg1, int arg2, byte arg3, class594 arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, String arg12, int arg13, int[] arg14, int arg15, int arg16) {
        field3876++;
        if (arg12 == null) {
            return 0;
        }
        this.method1672(arg1, (byte) 123, arg6);
        if (arg8 == 0) {
            arg8 = this.field3875.field2250;
        }
        int[] var18;
        if (arg7 < this.field3875.field2256 + this.field3875.field2253 + arg8 && arg8 + arg8 > arg7) {
            var18 = null;
        } else {
            var18 = new int[] { arg5 };
        }
        int var19 = this.field3875.method1052(class543.field8111, (byte) -112, arg0, var18, arg12);
        if (arg16 == -1) {
            arg16 = arg7 / arg8;
            if (arg16 <= 0) {
                arg16 = 1;
            }
        }
        if (arg16 > 0 && var19 >= arg16) {
            var19 = arg16;
            class543.field8111[arg16 - 1] = this.field3875.method1050((byte) 100, arg5, arg0, class543.field8111[arg16 - 1]);
        }
        if (arg11 == 3 && var19 == 1) {
            arg11 = 1;
        }
        int var20;
        if (arg11 == 0) {
            var20 = this.field3875.field2256 + arg13;
        } else if (arg11 == 1) {
            var20 = (arg7 - ((var19 - 1) * arg8) - this.field3875.field2253 - this.field3875.field2256) / 2 + arg13 + this.field3875.field2256;
        } else if (arg11 == 2) {
            var20 = arg7 + arg13 - this.field3875.field2253 - ((var19 - 1) * arg8);
        } else {
            int var21 = (arg7 - ((var19 - 1) * arg8) - this.field3875.field2253 - this.field3875.field2256) / (var19 + 1);
            if (var21 < 0) {
                var21 = 0;
            }
            var20 = this.field3875.field2256 + var21 + arg13;
            arg8 += var21;
        }
        for (int var22 = 0; var22 < var19; var22++) {
            if (arg10 == 0) {
                this.method1682(arg9, arg4, arg2, true, arg0, arg15, arg14, var20, class543.field8111[var22]);
            } else if (arg10 == 1) {
                this.method1682(arg9, arg4, arg2, true, arg0, arg15 + (arg5 - this.field3875.method1053((byte) 33, class543.field8111[var22])) / 2, arg14, var20, class543.field8111[var22]);
            } else if (arg10 == 2) {
                this.method1682(arg9, arg4, arg2, true, arg0, arg15 + arg5 - this.field3875.method1053((byte) -105, class543.field8111[var22]), arg14, var20, class543.field8111[var22]);
            } else if ((var19 - 1) == var22) {
                this.method1682(arg9, arg4, arg2, true, arg0, arg15, arg14, var20, class543.field8111[var22]);
            } else {
                this.method1675(class543.field8111[var22], (byte) -124, arg5);
                this.method1682(arg9, arg4, arg2, true, arg0, arg15, arg14, var20, class543.field8111[var22]);
                class70.field821 = 0;
            }
            var20 += arg8;
        }
        if (arg3 >= -51) {
            this.method1676(-86, null, 96, (byte) 37, 1, -58, 76, 31);
        }
        return var19;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "([ILjava/lang/String;[I[Lha;II[II)V")
    private final void method1667(int[] arg0, String arg1, int[] arg2, class116[] arg3, int arg4, int arg5, int[] arg6, int arg7) {
        field3870++;
        int var9 = arg4 - this.field3875.field2250;
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        int var13 = arg1.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class644.method3724(arg1.charAt(var14), -111) & 0xFF);
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
                                    if (arg2 == null) {
                                        var17 = 0;
                                    } else {
                                        var17 = arg2[var12];
                                    }
                                    int var18;
                                    if (arg0 == null) {
                                        var18 = 0;
                                    } else {
                                        var18 = arg0[var12];
                                    }
                                    var12++;
                                    int var19 = class233.method1518(var16.substring(4), (byte) -122);
                                    class116 var20 = arg3[var19];
                                    int var21 = arg6 == null ? var20.method714() : arg6[var19];
                                    var20.method237(arg5 + var17, this.field3875.field2250 + var9 + -var21 + var18, 1, 0, 1);
                                    var11 = -1;
                                    arg5 += arg3[var19].method722();
                                } catch (Exception var25) {
                                }
                            } else {
                                this.method1674((byte) -77, var16);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var10 == -1) {
                    if (var11 != -1) {
                        arg5 += this.field3875.method1054(var15, 125, var11);
                    }
                    int var22;
                    if (arg2 == null) {
                        var22 = 0;
                    } else {
                        var22 = arg2[var12];
                    }
                    int var23;
                    if (arg0 == null) {
                        var23 = 0;
                    } else {
                        var23 = arg0[var12];
                    }
                    var12++;
                    if (var15 != ' ') {
                        if ((class561.field8321 & 0xFF000000) != 0) {
                            this.method528(var15, arg5 + var22 + 1, var23 + 1 + var9, class561.field8321, true);
                        }
                        this.method528(var15, arg5 + var22, var9 + var23, class444.field6481, false);
                    } else if (class70.field821 > 0) {
                        class587.field8719 += class70.field821;
                        arg5 += class587.field8719 >> 8;
                        class587.field8719 &= 0xFF;
                    }
                    int var24 = this.field3875.method1057(var15, 127);
                    if (class631.field9222 != -1) {
                        this.field3868.method1068(1, class631.field9222, (int) ((double) this.field3875.field2250 * 0.7D) + var9, arg5, var24);
                    }
                    if (class106.field1332 != -1) {
                        this.field3868.method1068(1, class106.field1332, var9 + this.field3875.field2250, arg5, var24);
                    }
                    arg5 += var24;
                    var11 = var15;
                }
            }
        }
        if (arg7 <= 25) {
            this.method1680(null, false, -65, 125, null, -62, 75, 116, -12, 102, -80, 36, null, null, null);
        }
    }

    @OriginalMember(owner = "client!ra", name = "HA", descriptor = "(CIIIZ)V")
    public abstract void method528(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIIILjava/lang/String;B)V")
    public final void method1668(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5, byte arg6) {
        field3878++;
        if (arg5 == null) {
            return;
        }
        this.method1672(arg4, (byte) 126, arg0);
        int var8 = arg5.length();
        int[] var9 = new int[var8];
        if (arg6 > 35) {
            for (int var10 = 0; var10 < var8; var10++) {
                var9[var10] = (int) (Math.sin((double) arg2 / 5.0D + (double) var10 / 2.0D) * 5.0D);
            }
            this.method1667(var9, arg5, null, null, arg3, arg1 - this.field3875.method1053((byte) -115, arg5) / 2, null, 117);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ljava/lang/String;I[Lha;I[IIILjava/util/Random;II)I")
    public final int method1669(String arg0, int arg1, class116[] arg2, int arg3, int[] arg4, int arg5, int arg6, Random arg7, int arg8, int arg9) {
        field3872++;
        if (arg0 == null) {
            return 0;
        }
        arg7.setSeed((long) arg9);
        int var11 = (arg7.nextInt() & 0x1F) + 192;
        this.method1672(arg6 & 0xFFFFFF | var11 << 24, (byte) 127, arg3 & 0xFFFFFF | var11 << 24);
        int var12 = arg0.length();
        if (arg5 > -77) {
            field3880 = null;
        }
        int[] var13 = new int[var12];
        int var14 = 0;
        for (int var15 = 0; var15 < var12; var15++) {
            var13[var15] = var14;
            if ((arg7.nextInt() & 0x3) == 0) {
                var14++;
            }
        }
        this.method1667(null, arg0, var13, arg2, arg8, arg1, arg4, 45);
        return var14;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ljava/lang/String;IIIII)V")
    public final void method1670(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3881++;
        if (arg0 == null) {
            return;
        }
        this.method1672(arg2, (byte) 127, arg4);
        this.method1682(0, null, 0, true, null, arg5 - this.field3875.method1053((byte) 110, arg0), null, arg1, arg0);
        if (arg3 != 13891) {
            this.method1671(null, 55, 8, -96, 125, 86, -32);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ljava/lang/String;IIIIII)V")
    public final void method1671(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3885++;
        if (arg0 == null) {
            return;
        }
        this.method1672(arg3, (byte) 125, arg1);
        int var8 = arg0.length();
        int[] var9 = new int[var8];
        int[] var10 = new int[var8];
        for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = (int) (Math.sin((double) arg6 / 5.0D + (double) var11 / 5.0D) * 5.0D);
            var10[var11] = (int) (Math.sin((double) arg6 / 5.0D + (double) var11 / 3.0D) * 5.0D);
        }
        this.method1667(var10, arg0, var9, null, arg5, arg4 - (this.field3875.method1053((byte) 95, arg0) / 2), null, 36);
        if (arg2 != 27917) {
            field3880 = null;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IBI)V")
    private final void method1672(int arg0, byte arg1, int arg2) {
        class106.field1332 = -1;
        class631.field9222 = -1;
        class587.field8719 = 0;
        if (arg0 == -1) {
            arg0 = 0;
        }
        field3887++;
        class70.field821 = 0;
        if (arg1 >= 121) {
            class314.field4724 = arg2;
            class444.field6481 = arg2;
            class155.field1989 = arg0;
            class561.field8321 = arg0;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILqa;)V")
    public static final void method1673(int arg0, class167 arg1) {
        arg1.method1022(0, 0, class522.field7735, 350);
        field3874++;
        arg1.method980(0, 0, class522.field7735, 350, class283.field4192 << 24 | 0x332277, 1);
        int var2 = 350 / class203.field3031;
        if (class174.field2410 > 0) {
            int var3 = 346 - class203.field3031 - 4;
            int var4 = var2 * var3 / (var2 - (1 - class174.field2410));
            int var5 = 4;
            if (class174.field2410 > 1) {
                var5 += (class174.field2410 - class549.field8179 - 1) * (var3 - var4) / (class174.field2410 - 1);
            }
            arg1.method980(class522.field7735 - 16, var5, 12, var4, class283.field4192 << 24 | 0x332277, 2);
            for (int var6 = class549.field8179; var6 < (class549.field8179 + var2) && class174.field2410 > var6; var6++) {
                String[] var7 = class317.method1994(8, '\b', class59.field709[var6]);
                int var8 = (class522.field7735 - 24) / var7.length;
                for (int var9 = 0; var9 < var7.length; var9++) {
                    int var10 = (var8 * var9) + 8;
                    arg1.method1022(var10, 0, var8 + var10 - 8, 350);
                    class259.field3800.method1683(-1, -16777216, var7[var9], var10, 350 - class519.field7716.field2253 - ((var6 - class549.field8179) * class203.field3031) - class580.field8545 - 2, arg0 + 19945);
                }
            }
        }
        arg1.method1022(arg0, 0, class522.field7735, 350);
        arg1.method1068(1, -1, 350 - class580.field8545, 0, class522.field7735);
        class179.field2757.method1683(-1, -16777216, "--> " + class545.field8138, 10, 350 - class511.field7585.field2253 - 1, 19945);
        if (!class85.field989) {
            return;
        }
        int var11 = -1;
        if ((class576.field8505 % 30) > 15) {
            var11 = 16777215;
        }
        arg1.method1069(12, var11, 339 - class511.field7585.field2253, class511.field7585.method1053((byte) -61, "--> " + class545.field8138.substring(0, class393.field5722)) + 10, 1);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(BLjava/lang/String;)V")
    private final void method1674(byte arg0, String arg1) {
        try {
            if (arg1.startsWith("col=")) {
                class444.field6481 = class444.field6481 & 0xFF000000 | class598.method3493(16, (byte) -18, arg1.substring(4)) & 0xFFFFFF;
            } else if (arg1.equals("/col")) {
                class444.field6481 = class444.field6481 & 0xFF000000 | class314.field4724 & 0xFFFFFF;
            }
            if (arg1.startsWith("argb=")) {
                class444.field6481 = class598.method3493(16, (byte) 104, arg1.substring(5));
            } else if (arg1.equals("/argb")) {
                class444.field6481 = class314.field4724;
            } else if (arg1.startsWith("str=")) {
                class631.field9222 = class444.field6481 & 0xFF000000 | class598.method3493(16, (byte) -12, arg1.substring(4));
            } else if (arg1.equals("str")) {
                class631.field9222 = class444.field6481 & 0xFF000000 | 0x800000;
            } else if (arg1.equals("/str")) {
                class631.field9222 = -1;
            } else if (arg1.startsWith("u=")) {
                class106.field1332 = class444.field6481 & 0xFF000000 | class598.method3493(16, (byte) 119, arg1.substring(2));
            } else if (arg1.equals("u")) {
                class106.field1332 = class444.field6481 & 0xFF000000;
            } else if (arg1.equals("/u")) {
                class106.field1332 = -1;
            } else if (arg1.equalsIgnoreCase("shad=-1")) {
                class561.field8321 = 0;
            } else if (arg1.startsWith("shad=")) {
                class561.field8321 = class444.field6481 & 0xFF000000 | class598.method3493(16, (byte) 127, arg1.substring(5));
            } else if (arg1.equals("shad")) {
                class561.field8321 = class444.field6481 & 0xFF000000;
            } else if (arg1.equals("/shad")) {
                class561.field8321 = class155.field1989;
            } else if (arg1.equals("br")) {
                this.method1672(class155.field1989, (byte) 124, class314.field4724);
            }
        } catch (Exception var3) {
        }
        if (arg0 > -16) {
            this.method1683(-112, -127, null, 62, -128, -67);
        }
        field3879++;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ljava/lang/String;BI)V")
    private final void method1675(String arg0, byte arg1, int arg2) {
        field3871++;
        int var4 = 0;
        boolean var5 = false;
        int var6 = 0;
        if (arg1 != -124) {
            method1677(-44);
        }
        while (arg0.length() > var6) {
            char var7 = arg0.charAt(var6);
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
            class70.field821 = (arg2 - this.field3875.method1053((byte) 50, arg0) << 8) / var4;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILjava/lang/String;IBIIII)V")
    public final void method1676(int arg0, String arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        field3873++;
        if (arg1 == null) {
            return;
        }
        this.method1672(arg5, (byte) 125, arg4);
        double var9 = 7.0D - ((double) arg6 / 8.0D);
        if (var9 < 0.0D) {
            var9 = 0.0D;
        }
        int var11 = arg1.length();
        int[] var12 = new int[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = (int) (Math.sin((double) var13 / 1.5D + (double) arg7) * var9);
        }
        if (arg3 > -79) {
            field3880 = null;
        }
        this.method1667(var12, arg1, null, null, arg0, arg2 - (this.field3875.method1053((byte) 60, arg1) / 2), null, 37);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V")
    public static void method1677(int arg0) {
        field3884 = null;
        field3880 = null;
        if (arg0 != 8) {
            field3880 = null;
        }
        field3877 = null;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "([Lha;BIIIILjava/lang/String;[I)V")
    public final void method1678(class116[] arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, String arg6, int[] arg7) {
        field3883++;
        if (arg6 != null) {
            this.method1672(arg3, (byte) 127, arg2);
            this.method1682(0, null, 0, true, arg0, arg4, arg7, arg5, arg6);
            int var9 = 47 % ((20 - arg1) / 41);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(II[IIIILjava/lang/String;IIILpa;I[Lha;III)I")
    public final int method1679(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, String arg6, int arg7, int arg8, int arg9, class594 arg10, int arg11, class116[] arg12, int arg13, int arg14, int arg15) {
        field3882++;
        return arg8 == 30478 ? this.method1666(arg12, arg11, arg3, (byte) -96, arg10, arg5, arg13, arg0, arg9, arg15, arg4, arg14, arg6, arg1, arg2, arg7, 0) : 78;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "([IZIILjava/util/Random;IIIIIIILjava/lang/String;[I[Lha;)I")
    public final int method1680(int[] arg0, boolean arg1, int arg2, int arg3, Random arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, String arg12, int[] arg13, class116[] arg14) {
        field3869++;
        if (arg12 == null) {
            return 0;
        }
        if (!arg1) {
            this.method1683(56, 113, null, 7, -66, 88);
        }
        arg4.setSeed((long) arg9);
        int var16 = (arg4.nextInt() & 0x1F) + 192;
        this.method1672(arg6 & 0xFFFFFF | var16 << 24, (byte) 123, arg5 & 0xFFFFFF | var16 << 24);
        int var17 = arg12.length();
        int[] var18 = new int[var17];
        int var19 = 0;
        for (int var20 = 0; var20 < var17; var20++) {
            var18[var20] = var19;
            if ((arg4.nextInt() & 0x3) == 0) {
                var19++;
            }
        }
        int var21 = arg11;
        int var22 = this.field3875.field2256 + arg2;
        int var23 = -1;
        if (arg3 == 1) {
            var22 += (arg10 - this.field3875.field2253 - this.field3875.field2256) / 2;
        } else if (arg3 == 2) {
            var22 = arg2 + arg10 - this.field3875.field2253;
        }
        if (arg8 == 1) {
            var23 = this.field3875.method1053((byte) 28, arg12) + var19;
            var21 = (arg7 - var23) / 2 + arg11;
        } else if (arg8 == 2) {
            var23 = var19 + this.field3875.method1053((byte) 49, arg12);
            var21 = arg7 + arg11 - var23;
        }
        this.method1667(null, arg12, var18, arg14, var22, var21, arg13, 68);
        if (arg0 != null) {
            if (var23 == -1) {
                var23 = var19 + this.field3875.method1053((byte) 61, arg12);
            }
            arg0[0] = var21;
            arg0[3] = this.field3875.field2256 + this.field3875.field2253;
            arg0[1] = var22 - this.field3875.field2256;
            arg0[2] = var23;
        }
        return var19;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lqa;B)V")
    public static final void method1681(class167 arg0, byte arg1) {
        field3890++;
        if (class117.field1529 != class239.field3493.field3457) {
            int var2 = 71 / ((arg1 - 16) / 60);
            if (class526.field7777 != null && class302.method1869(class239.field3493.field3457, arg0, (byte) 52)) {
                class117.field1529 = class239.field3493.field3457;
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(CIIIZLpa;II)V")
    public abstract void method529(char arg0, int arg1, int arg2, int arg3, boolean arg4, class594 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Lqa;Ldd;)V")
    public class262(class167 arg0, class166 arg1) {
        this.field3875 = arg1;
        this.field3868 = arg0;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILpa;IZ[Lha;I[IILjava/lang/String;)V")
    private final void method1682(int arg0, class594 arg1, int arg2, boolean arg3, class116[] arg4, int arg5, int[] arg6, int arg7, String arg8) {
        field3886++;
        int var10 = arg7 - this.field3875.field2250;
        int var11 = -1;
        int var12 = -1;
        if (!arg3) {
            return;
        }
        int var13 = arg8.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class644.method3724(arg8.charAt(var14), -114) & 0xFF);
            if (var15 == '<') {
                var11 = var14;
            } else {
                if (var15 == '>' && var11 != -1) {
                    String var16 = arg8.substring(var11 + 1, var14);
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
                                    int var17 = class233.method1518(var16.substring(4), (byte) -123);
                                    class116 var18 = arg4[var17];
                                    int var19 = arg6 == null ? var18.method714() : arg6[var17];
                                    if ((class444.field6481 & 0xFF000000) == -16777216) {
                                        var18.method237(arg5, var10 + this.field3875.field2250 - var19, 1, 0, 1);
                                    } else {
                                        var18.method237(arg5, this.field3875.field2250 + var10 - var19, 0, class444.field6481 & 0xFF000000 | 0xFFFFFF, 1);
                                    }
                                    var12 = -1;
                                    arg5 += arg4[var17].method722();
                                } catch (Exception var21) {
                                }
                            } else {
                                this.method1674((byte) -46, var16);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var11 == -1) {
                    if (var12 != -1) {
                        arg5 += this.field3875.method1054(var15, -20, var12);
                    }
                    if (var15 == ' ') {
                        if (class70.field821 > 0) {
                            class587.field8719 += class70.field821;
                            arg5 += class587.field8719 >> 8;
                            class587.field8719 &= 0xFF;
                        }
                    } else if (arg1 == null) {
                        if ((class561.field8321 & 0xFF000000) != 0) {
                            this.method528(var15, arg5 + 1, var10 + 1, class561.field8321, true);
                        }
                        this.method528(var15, arg5, var10, class444.field6481, false);
                    } else {
                        if ((class561.field8321 & 0xFF000000) != 0) {
                            this.method529(var15, arg5 + 1, var10 + 1, class561.field8321, true, arg1, arg0, arg2);
                        }
                        this.method529(var15, arg5, var10, class444.field6481, false, arg1, arg0, arg2);
                    }
                    int var20 = this.field3875.method1057(var15, 127);
                    if (class631.field9222 != -1) {
                        this.field3868.method1068(1, class631.field9222, (int) ((double) this.field3875.field2250 * 0.7D) + var10, arg5, var20);
                    }
                    if (class106.field1332 != -1) {
                        this.field3868.method1068(1, class106.field1332, this.field3875.field2250 + var10 + 1, arg5, var20);
                    }
                    var12 = var15;
                    arg5 += var20;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IILjava/lang/String;III)V")
    public final void method1683(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5) {
        if (arg5 != 19945) {
            return;
        }
        field3889++;
        if (arg2 != null) {
            this.method1672(arg1, (byte) 125, arg0);
            this.method1682(0, null, 0, true, null, arg3, null, arg4, arg2);
        }
    }
}
