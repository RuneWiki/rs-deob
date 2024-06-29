import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public abstract class class269 {

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "Lgg;")
    private class119 field4047;

    @OriginalMember(owner = "client!ba", name = "t", descriptor = "Lqa;")
    private class167 field4059;

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "Lqv;")
    public static class316 field4046 = new class316(110, -2);

    @OriginalMember(owner = "client!ba", name = "r", descriptor = "I")
    public static int field4057 = 0;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "I")
    public static int field4040;

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "I")
    public static int field4042;

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "I")
    public static int field4043;

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "I")
    public static int field4044;

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "I")
    public static int field4045;

    @OriginalMember(owner = "client!ba", name = "i", descriptor = "I")
    public static int field4048;

    @OriginalMember(owner = "client!ba", name = "j", descriptor = "I")
    public static int field4049;

    @OriginalMember(owner = "client!ba", name = "k", descriptor = "I")
    public static int field4050;

    @OriginalMember(owner = "client!ba", name = "l", descriptor = "I")
    public static int field4051;

    @OriginalMember(owner = "client!ba", name = "m", descriptor = "I")
    public static int field4052;

    @OriginalMember(owner = "client!ba", name = "n", descriptor = "I")
    public static int field4053;

    @OriginalMember(owner = "client!ba", name = "o", descriptor = "I")
    public static int field4054;

    @OriginalMember(owner = "client!ba", name = "p", descriptor = "I")
    public static int field4055;

    @OriginalMember(owner = "client!ba", name = "q", descriptor = "I")
    public static int field4056;

    @OriginalMember(owner = "client!ba", name = "s", descriptor = "I")
    public static int field4058;

    @OriginalMember(owner = "client!ba", name = "u", descriptor = "I")
    public static int field4060;

    @OriginalMember(owner = "client!ba", name = "v", descriptor = "I")
    public static int field4061;

    @OriginalMember(owner = "client!ba", name = "w", descriptor = "I")
    public static int field4062;

    @OriginalMember(owner = "client!ba", name = "x", descriptor = "I")
    public static int field4063;

    @OriginalMember(owner = "client!ba", name = "y", descriptor = "I")
    public static int field4064;

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "Lqv;")
    public static class316 field4041;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(CIIIZLi;II)V")
    public abstract void method403(char arg0, int arg1, int arg2, int arg3, boolean arg4, class31 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)V")
    public static final void method1731(int arg0) {
        class511 var1 = class53.field980;
        synchronized (class53.field980) {
            class53.field980.method2990((byte) -55);
        }
        if (arg0 != 0) {
            field4057 = -23;
        }
        field4058++;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(III)V")
    private final void method1732(int arg0, int arg1, int arg2) {
        class405.field5760 = 0;
        class177.field2640 = -1;
        field4063++;
        class302.field4483 = arg0;
        class460.field6664 = arg0;
        if (arg2 == -1) {
            arg2 = 0;
        }
        if (arg1 == 16777215) {
            class21.field226 = 0;
            class410.field5801 = -1;
            class88.field1428 = arg2;
            class53.field985 = arg2;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Ljava/lang/String;IBIII)V")
    public final void method1733(String arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        field4054++;
        if (arg0 == null) {
            return;
        }
        this.method1732(arg4, 16777215, arg1);
        this.method1745(0, null, null, arg3, -99, null, 0, arg5 - this.field4047.method875(arg0, (byte) 5), arg0);
        if (arg2 != 114) {
            method1737(117);
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Ljava/lang/String;[Laa;IZI[I[I[I)V")
    private final void method1734(String arg0, class343[] arg1, int arg2, boolean arg3, int arg4, int[] arg5, int[] arg6, int[] arg7) {
        if (arg3) {
            this.method1743(null, 126, -115, -99, 106, (byte) -14);
        }
        int var9 = arg4 - this.field4047.field1860;
        field4062++;
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        int var13 = arg0.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class297.method1912(arg0.charAt(var14), -7718) & 0xFF);
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
                                    if (arg6 == null) {
                                        var17 = 0;
                                    } else {
                                        var17 = arg6[var12];
                                    }
                                    int var18;
                                    if (arg7 == null) {
                                        var18 = 0;
                                    } else {
                                        var18 = arg7[var12];
                                    }
                                    var12++;
                                    int var19 = class292.method1880(83, var16.substring(4));
                                    class343 var20 = arg1[var19];
                                    int var21 = arg5 == null ? var20.method374() : arg5[var19];
                                    var20.method370(arg2 + var17, this.field4047.field1860 - (var21 - var18) + var9, 1, 0, 1);
                                    var11 = -1;
                                    arg2 += arg1[var19].method376();
                                } catch (Exception var25) {
                                }
                            } else {
                                this.method1749((byte) 125, var16);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var10 == -1) {
                    if (var11 != -1) {
                        arg2 += this.field4047.method873(var15, -118, var11);
                    }
                    int var22;
                    if (arg6 == null) {
                        var22 = 0;
                    } else {
                        var22 = arg6[var12];
                    }
                    int var23;
                    if (arg7 == null) {
                        var23 = 0;
                    } else {
                        var23 = arg7[var12];
                    }
                    if (var15 != ' ') {
                        if ((class53.field985 & 0xFF000000) != 0) {
                            this.method406(var15, arg2 + var22 + 1, var9 + var23 + 1, class53.field985, true);
                        }
                        this.method406(var15, arg2 + var22, var9 + var23, class460.field6664, false);
                    } else if (class405.field5760 > 0) {
                        class21.field226 += class405.field5760;
                        arg2 += class21.field226 >> 8;
                        class21.field226 &= 0xFF;
                    }
                    var12++;
                    int var24 = this.field4047.method876(var15, 255);
                    if (class410.field5801 != -1) {
                        this.field4059.method1191((int) ((double) this.field4047.field1860 * 0.7D) + var9, class410.field5801, -256, arg2, var24);
                    }
                    if (class177.field2640 != -1) {
                        this.field4059.method1191(this.field4047.field1860 + var9, class177.field2640, -256, arg2, var24);
                    }
                    var11 = var15;
                    arg2 += var24;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIILjava/lang/String;II)V")
    public final void method1735(int arg0, int arg1, int arg2, int arg3, String arg4, int arg5, int arg6) {
        field4060++;
        if (arg4 == null) {
            return;
        }
        this.method1732(arg5, 16777215, arg2);
        int var8 = arg4.length();
        int[] var9 = new int[var8];
        int[] var10 = new int[var8];
        for (int var11 = arg3; var11 < var8; var11++) {
            var9[var11] = (int) (Math.sin((double) arg6 / 5.0D + (double) var11 / 5.0D) * 5.0D);
            var10[var11] = (int) (Math.sin((double) arg6 / 5.0D + (double) var11 / 3.0D) * 5.0D);
        }
        this.method1734(arg4, null, arg0 - this.field4047.method875(arg4, (byte) 5) / 2, false, arg1, null, var9, var10);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIIII[ILjava/util/Random;[ILjava/lang/String;[Laa;IIBI)I")
    public final int method1736(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, Random arg7, int[] arg8, String arg9, class343[] arg10, int arg11, int arg12, byte arg13, int arg14) {
        field4064++;
        if (arg9 == null) {
            return 0;
        }
        arg7.setSeed((long) arg4);
        int var16 = (arg7.nextInt() & 0x1F) + 192;
        this.method1732(var16 << 24 | arg12 & 0xFFFFFF, 16777215, var16 << 24 | arg0 & 0xFFFFFF);
        int var17 = -104 % ((arg13 + 49) / 49);
        int var18 = arg9.length();
        int[] var19 = new int[var18];
        int var20 = 0;
        for (int var21 = 0; var21 < var18; var21++) {
            var19[var21] = var20;
            if ((arg7.nextInt() & 0x3) == 0) {
                var20++;
            }
        }
        int var22 = arg11;
        int var23 = this.field4047.field1854 + arg5;
        if (arg1 == 1) {
            var23 += (arg2 - this.field4047.field1863 - this.field4047.field1854) / 2;
        } else if (arg1 == 2) {
            var23 = arg5 + arg2 - this.field4047.field1863;
        }
        int var24 = -1;
        if (arg14 == 1) {
            var24 = var20 + this.field4047.method875(arg9, (byte) 5);
            var22 = (arg3 - var24) / 2 + arg11;
        } else if (arg14 == 2) {
            var24 = this.field4047.method875(arg9, (byte) 5) + var20;
            var22 = arg3 + arg11 - var24;
        }
        this.method1734(arg9, arg10, var22, false, var23, arg6, var19, null);
        if (arg8 != null) {
            if (var24 == -1) {
                var24 = var20 + this.field4047.method875(arg9, (byte) 5);
            }
            arg8[0] = var22;
            arg8[3] = this.field4047.field1854 + this.field4047.field1863;
            arg8[1] = var23 - this.field4047.field1854;
            arg8[2] = var24;
        }
        return var20;
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(I)V")
    public static final void method1737(int arg0) {
        for (class102 var1 = (class102) class25.field358.method908(85); var1 != null; var1 = (class102) class25.field358.method908(94)) {
            class487.method2868(-1588359036, var1);
        }
        field4040++;
        int var2;
        int var3;
        if (class220.field3371.method1048(class74.field1211, 53)) {
            var2 = 0;
            var3 = 3;
        } else {
            var3 = class10.field95;
            var2 = class10.field95;
        }
        client.method1393();
        if (arg0 < 106) {
            return;
        }
        for (int var4 = var2; var4 <= var3; var4++) {
            client.method1384();
            client.method1387(var4);
            client.method1373(var4);
        }
        client.method1389();
        client.method1396();
    }

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "(CIIIZ)V")
    public abstract void method406(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "([Laa;BILjava/lang/String;II[II)V")
    public final void method1738(class343[] arg0, byte arg1, int arg2, String arg3, int arg4, int arg5, int[] arg6, int arg7) {
        if (arg1 != 19) {
            this.method1750(20, -110, -66, 65, 80, 68, null);
        }
        field4051++;
        if (arg3 != null) {
            this.method1732(arg2, arg1 ^ 0xFFFFEC, arg5);
            this.method1745(0, null, arg6, arg7, 86, arg0, 0, arg4, arg3);
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Ljava/lang/String;BI)V")
    private final void method1739(String arg0, byte arg1, int arg2) {
        field4048++;
        if (arg1 != -103) {
            field4057 = -64;
        }
        int var4 = 0;
        boolean var5 = false;
        for (int var6 = 0; var6 < arg0.length(); var6++) {
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
            class405.field5760 = (arg2 - this.field4047.method875(arg0, (byte) 5) << 8) / var4;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ZIIII)Lsw;")
    public static final class541 method1740(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field4052++;
        class541 var5 = new class541();
        var5.field7956 = arg2;
        var5.field7955 = arg1;
        class220.field3370.method2292((long) arg4, var5, (byte) -128);
        class390.method2354((byte) -100, arg1);
        if (arg3 != -1) {
            field4061 = 48;
        }
        class198 var6 = class154.method1087(arg4, 2);
        if (var6 != null) {
            class284.method1832(-17067, var6);
        }
        if (class65.field1112 != null) {
            class284.method1832(arg3 ^ 0x42AA, class65.field1112);
            class65.field1112 = null;
        }
        class194.method1318(8);
        if (var6 != null) {
            class518.method3011(var6, -115, !arg0);
        }
        if (!arg0) {
            class281.method1815(arg1);
        }
        if (!arg0 && class188.field2765 != -1) {
            class504.method2943(class188.field2765, (byte) -119, 1);
        }
        return var5;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IILjava/lang/String;IIIII)V")
    public final void method1741(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4055++;
        if (arg2 == null) {
            return;
        }
        this.method1732(arg7, 16777215, arg5);
        double var9 = 7.0D - (double) arg0 / 8.0D;
        if (var9 < 0.0D) {
            var9 = 0.0D;
        }
        int var11 = arg2.length();
        int[] var12 = new int[var11];
        for (int var13 = arg3; var13 < var11; var13++) {
            var12[var13] = (int) (var9 * Math.sin((double) var13 / 1.5D + (double) arg4));
        }
        this.method1734(arg2, null, arg6 - (this.field4047.method875(arg2, (byte) 5) / 2), false, arg1, null, null, var12);
    }

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(Lqa;Lgg;)V")
    public class269(class167 arg0, class119 arg1) {
        this.field4047 = arg1;
        this.field4059 = arg0;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIIIIIILi;I[IIIILjava/lang/String;[Laa;)I")
    public final int method1742(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class31 arg8, int arg9, int[] arg10, int arg11, int arg12, int arg13, String arg14, class343[] arg15) {
        if (arg12 == 0) {
            field4053++;
            return this.method1747(arg0, arg9, 0, arg3, arg7, arg10, arg8, 0, arg1, arg14, arg5, arg4, arg2, arg11, arg6, arg15, arg13);
        } else {
            return 78;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Ljava/lang/String;IIIIB)V")
    public final void method1743(String arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        field4049++;
        int var7 = 96 % ((arg5 - 63) / 46);
        if (arg0 != null) {
            this.method1732(arg4, 16777215, arg2);
            this.method1745(0, null, null, arg3, -97, null, 0, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Ljava/lang/String;III[Laa;IILjava/util/Random;I[I)I")
    public final int method1744(String arg0, int arg1, int arg2, int arg3, class343[] arg4, int arg5, int arg6, Random arg7, int arg8, int[] arg9) {
        if (arg8 != 19281) {
            method1748((byte) 76);
        }
        field4043++;
        if (arg0 == null) {
            return 0;
        }
        arg7.setSeed((long) arg2);
        int var11 = (arg7.nextInt() & 0x1F) + 192;
        this.method1732(var11 << 24 | arg5 & 0xFFFFFF, 16777215, arg3 & 0xFFFFFF | var11 << 24);
        int var12 = arg0.length();
        int[] var13 = new int[var12];
        int var14 = 0;
        for (int var15 = 0; var15 < var12; var15++) {
            var13[var15] = var14;
            if ((arg7.nextInt() & 0x3) == 0) {
                var14++;
            }
        }
        this.method1734(arg0, arg4, arg1, false, arg6, arg9, var13, null);
        return var14;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILi;[III[Laa;IILjava/lang/String;)V")
    private final void method1745(int arg0, class31 arg1, int[] arg2, int arg3, int arg4, class343[] arg5, int arg6, int arg7, String arg8) {
        int var10 = -112 / ((arg4 + 41) / 43);
        int var11 = arg3 - this.field4047.field1860;
        field4056++;
        int var12 = -1;
        int var13 = -1;
        int var14 = arg8.length();
        for (int var15 = 0; var15 < var14; var15++) {
            char var16 = (char) (class297.method1912(arg8.charAt(var15), -7718) & 0xFF);
            if (var16 == '<') {
                var12 = var15;
            } else {
                if (var16 == '>' && var12 != -1) {
                    String var17 = arg8.substring(var12 + 1, var15);
                    var12 = -1;
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
                                    int var18 = class292.method1880(111, var17.substring(4));
                                    class343 var19 = arg5[var18];
                                    int var20 = arg2 == null ? var19.method374() : arg2[var18];
                                    if ((class460.field6664 & 0xFF000000) == -16777216) {
                                        var19.method370(arg7, this.field4047.field1860 + var11 - var20, 1, 0, 1);
                                    } else {
                                        var19.method370(arg7, var11 + this.field4047.field1860 - var20, 0, class460.field6664 & 0xFF000000 | 0xFFFFFF, 1);
                                    }
                                    var13 = -1;
                                    arg7 += arg5[var18].method376();
                                } catch (Exception var22) {
                                }
                            } else {
                                this.method1749((byte) 96, var17);
                            }
                            continue;
                        }
                        var16 = '®';
                    }
                }
                if (var12 == -1) {
                    if (var13 != -1) {
                        arg7 += this.field4047.method873(var16, -113, var13);
                    }
                    if (var16 == ' ') {
                        if (class405.field5760 > 0) {
                            class21.field226 += class405.field5760;
                            arg7 += class21.field226 >> 8;
                            class21.field226 &= 0xFF;
                        }
                    } else if (arg1 == null) {
                        if ((class53.field985 & 0xFF000000) != 0) {
                            this.method406(var16, arg7 + 1, var11 - -1, class53.field985, true);
                        }
                        this.method406(var16, arg7, var11, class460.field6664, false);
                    } else {
                        if ((class53.field985 & 0xFF000000) != 0) {
                            this.method403(var16, arg7 + 1, var11 - -1, class53.field985, true, arg1, arg0, arg6);
                        }
                        this.method403(var16, arg7, var11, class460.field6664, false, arg1, arg0, arg6);
                    }
                    int var21 = this.field4047.method876(var16, 255);
                    if (class410.field5801 != -1) {
                        this.field4059.method1191((int) ((double) this.field4047.field1860 * 0.7D) + var11, class410.field5801, -256, arg7, var21);
                    }
                    if (class177.field2640 != -1) {
                        this.field4059.method1191(var11 + this.field4047.field1860 + 1, class177.field2640, -256, arg7, var21);
                    }
                    arg7 += var21;
                    var13 = var16;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ZIIILjava/lang/String;I)V")
    public final void method1746(boolean arg0, int arg1, int arg2, int arg3, String arg4, int arg5) {
        field4044++;
        if (arg4 == null) {
            return;
        }
        this.method1732(arg1, 16777215, arg5);
        this.method1745(0, null, null, arg3, -87, null, 0, arg2 - (this.field4047.method875(arg4, (byte) 5) / 2), arg4);
        if (arg0) {
            field4061 = 106;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIII[ILi;IILjava/lang/String;IIIII[Laa;I)I")
    public final int method1747(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, class31 arg6, int arg7, int arg8, String arg9, int arg10, int arg11, int arg12, int arg13, int arg14, class343[] arg15, int arg16) {
        field4045++;
        if (arg9 == null) {
            return 0;
        }
        this.method1732(arg1, 16777215, arg8);
        if (arg0 == 0) {
            arg0 = this.field4047.field1860;
        }
        int[] var18;
        if (arg4 < this.field4047.field1863 + this.field4047.field1854 + arg0 && arg0 + arg0 > arg4) {
            var18 = null;
        } else {
            var18 = new int[] { arg13 };
        }
        int var19 = this.field4047.method870(var18, 8611, arg9, class319.field4738, arg15);
        if (arg7 == -1) {
            arg7 = arg4 / arg0;
            if (arg7 <= 0) {
                arg7 = 1;
            }
        }
        if (arg7 > 0 && var19 >= arg7) {
            var19 = arg7;
            class319.field4738[arg7 - 1] = this.field4047.method868(arg13, class319.field4738[arg7 - 1], (byte) 40, arg15);
        }
        if (arg3 == 3 && var19 == 1) {
            arg3 = 1;
        }
        int var20;
        if (arg3 == 0) {
            var20 = this.field4047.field1854 + arg11;
        } else if (arg3 == 1) {
            var20 = (arg4 - this.field4047.field1854 - (var19 + -1) * arg0 - this.field4047.field1863) / 2 + arg11 + this.field4047.field1854;
        } else if (arg3 == 2) {
            var20 = arg4 + arg11 - this.field4047.field1863 - ((var19 - 1) * arg0);
        } else {
            int var21 = (arg4 - ((var19 - 1) * arg0) - this.field4047.field1863 - this.field4047.field1854) / (var19 + 1);
            if (var21 < 0) {
                var21 = 0;
            }
            arg0 += var21;
            var20 = this.field4047.field1854 + arg11 + var21;
        }
        for (int var22 = 0; var22 < var19; var22++) {
            if (arg16 == 0) {
                this.method1745(arg14, arg6, arg5, var20, 37, arg15, arg10, arg12, class319.field4738[var22]);
            } else if (arg16 == 1) {
                this.method1745(arg14, arg6, arg5, var20, -117, arg15, arg10, arg12 + (arg13 - this.field4047.method875(class319.field4738[var22], (byte) 5)) / 2, class319.field4738[var22]);
            } else if (arg16 == 2) {
                this.method1745(arg14, arg6, arg5, var20, 93, arg15, arg10, arg12 + arg13 - this.field4047.method875(class319.field4738[var22], (byte) 5), class319.field4738[var22]);
            } else if ((var19 - 1) == var22) {
                this.method1745(arg14, arg6, arg5, var20, -112, arg15, arg10, arg12, class319.field4738[var22]);
            } else {
                this.method1739(class319.field4738[var22], (byte) -103, arg13);
                this.method1745(arg14, arg6, arg5, var20, -104, arg15, arg10, arg12, class319.field4738[var22]);
                class405.field5760 = 0;
            }
            var20 += arg0;
        }
        if (arg2 != 0) {
            this.method1745(30, null, null, 61, 25, null, 92, -13, null);
        }
        return var19;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(B)V")
    public static void method1748(byte arg0) {
        field4041 = null;
        field4046 = null;
        if (arg0 != -44) {
            field4046 = null;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(BLjava/lang/String;)V")
    private final void method1749(byte arg0, String arg1) {
        try {
            int var3 = 72 % ((-arg0 - 56) / 62);
            if (arg1.startsWith("col=")) {
                class460.field6664 = class460.field6664 & 0xFF000000 | class470.method2783(16, arg1.substring(4), (byte) -101) & 0xFFFFFF;
            } else if (arg1.equals("/col")) {
                class460.field6664 = class302.field4483 & 0xFFFFFF | class460.field6664 & 0xFF000000;
            }
            if (arg1.startsWith("argb=")) {
                class460.field6664 = class470.method2783(16, arg1.substring(5), (byte) -106);
            } else if (arg1.equals("/argb")) {
                class460.field6664 = class302.field4483;
            } else if (arg1.startsWith("str=")) {
                class410.field5801 = class460.field6664 & 0xFF000000 | class470.method2783(16, arg1.substring(4), (byte) -109);
            } else if (arg1.equals("str")) {
                class410.field5801 = class460.field6664 & 0xFF000000 | 0x800000;
            } else if (arg1.equals("/str")) {
                class410.field5801 = -1;
            } else if (arg1.startsWith("u=")) {
                class177.field2640 = class460.field6664 & 0xFF000000 | class470.method2783(16, arg1.substring(2), (byte) -112);
            } else if (arg1.equals("u")) {
                class177.field2640 = class460.field6664 & 0xFF000000;
            } else if (arg1.equals("/u")) {
                class177.field2640 = -1;
            } else if (arg1.equalsIgnoreCase("shad=-1")) {
                class53.field985 = 0;
            } else if (arg1.startsWith("shad=")) {
                class53.field985 = class460.field6664 & 0xFF000000 | class470.method2783(16, arg1.substring(5), (byte) -127);
            } else if (arg1.equals("shad")) {
                class53.field985 = class460.field6664 & 0xFF000000;
            } else if (arg1.equals("/shad")) {
                class53.field985 = class88.field1428;
            } else if (arg1.equals("br")) {
                this.method1732(class302.field4483, 16777215, class88.field1428);
            }
        } catch (Exception var4) {
        }
        field4042++;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIIIILjava/lang/String;)V")
    public final void method1750(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, String arg6) {
        field4050++;
        if (arg6 == null) {
            return;
        }
        this.method1732(arg0, 16777215, arg1);
        if (arg4 <= 16) {
            field4057 = -54;
        }
        int var8 = arg6.length();
        int[] var9 = new int[var8];
        for (int var10 = 0; var10 < var8; var10++) {
            var9[var10] = (int) (Math.sin((double) arg5 / 5.0D + (double) var10 / 2.0D) * 5.0D);
        }
        this.method1734(arg6, null, arg2 - (this.field4047.method875(arg6, (byte) 5) / 2), false, arg3, null, null, var9);
    }
}
