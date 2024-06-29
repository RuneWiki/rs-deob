import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public abstract class class199 {

    @OriginalMember(owner = "client!am", name = "e", descriptor = "Lvc;")
    private class89 field2936;

    @OriginalMember(owner = "client!am", name = "r", descriptor = "Lkg;")
    private class194 field2949;

    @OriginalMember(owner = "client!am", name = "p", descriptor = "Z")
    public static boolean field2947 = false;

    @OriginalMember(owner = "client!am", name = "t", descriptor = "Z")
    public static boolean field2951 = true;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "I")
    public static int field2932;

    @OriginalMember(owner = "client!am", name = "b", descriptor = "I")
    public static int field2933;

    @OriginalMember(owner = "client!am", name = "c", descriptor = "I")
    public static int field2934;

    @OriginalMember(owner = "client!am", name = "d", descriptor = "I")
    public static int field2935;

    @OriginalMember(owner = "client!am", name = "f", descriptor = "I")
    public static int field2937;

    @OriginalMember(owner = "client!am", name = "g", descriptor = "I")
    public static int field2938;

    @OriginalMember(owner = "client!am", name = "h", descriptor = "I")
    public static int field2939;

    @OriginalMember(owner = "client!am", name = "i", descriptor = "I")
    public static int field2940;

    @OriginalMember(owner = "client!am", name = "j", descriptor = "I")
    public static int field2941;

    @OriginalMember(owner = "client!am", name = "k", descriptor = "I")
    public static int field2942;

    @OriginalMember(owner = "client!am", name = "l", descriptor = "I")
    public static int field2943;

    @OriginalMember(owner = "client!am", name = "m", descriptor = "I")
    public static int field2944;

    @OriginalMember(owner = "client!am", name = "n", descriptor = "I")
    public static int field2945;

    @OriginalMember(owner = "client!am", name = "o", descriptor = "I")
    public static int field2946;

    @OriginalMember(owner = "client!am", name = "q", descriptor = "I")
    public static int field2948;

    @OriginalMember(owner = "client!am", name = "s", descriptor = "I")
    public static int field2950;

    @OriginalMember(owner = "client!am", name = "u", descriptor = "I")
    public static int field2952;

    @OriginalMember(owner = "client!am", name = "v", descriptor = "I")
    public static int field2953;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(ILjava/lang/String;IILjava/util/Random;[II[Lrn;II)I", line = 3)
    public final int method1374(int arg0, String arg1, int arg2, int arg3, Random arg4, int[] arg5, int arg6, class417[] arg7, int arg8, int arg9) {
        field2942++;
        if (arg1 == null) {
            return 0;
        }
        arg4.setSeed((long) arg8);
        int var11 = (arg4.nextInt() & 0x1F) + 192;
        this.method1388(var11 << 24 | arg0 & 0xFFFFFF, 0, var11 << 24 | arg9 & 0xFFFFFF);
        int var12 = arg1.length();
        int[] var13 = new int[var12];
        int var14 = 0;
        for (int var15 = 0; var15 < var12; var15++) {
            var13[var15] = var14;
            if ((arg4.nextInt() & 0x3) == 0) {
                var14++;
            }
        }
        if (arg3 != 1671) {
            field2951 = true;
        }
        this.method1379((int[]) null, arg2, arg7, -81, var13, arg1, arg5, arg6);
        return var14;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(BILjava/lang/String;)V", line = 48)
    private final void method1375(byte arg0, int arg1, String arg2) {
        field2935++;
        if (arg0 <= 14) {
            this.method1379((int[]) null, 98, (class417[]) null, 65, (int[]) null, (String) null, (int[]) null, -54);
        }
        int var4 = 0;
        boolean var5 = false;
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
            class122.field1662 = (arg1 - this.field2949.method1354((byte) -114, arg2) << 8) / var4;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(BIIILjava/lang/String;[Lrn;Loj;[II)V", line = 89)
    private final void method1376(byte arg0, int arg1, int arg2, int arg3, String arg4, class417[] arg5, class405 arg6, int[] arg7, int arg8) {
        int var10 = arg1 - this.field2949.field2890;
        field2945++;
        int var11 = -1;
        int var12 = -1;
        if (arg0 != 28) {
            this.method1379((int[]) null, -90, (class417[]) null, -101, (int[]) null, (String) null, (int[]) null, -8);
        }
        int var13 = arg4.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class187.method1324((byte) 110, arg4.charAt(var14)) & 0xFF);
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
                                    int var17 = class270.method1827(var16.substring(4), false);
                                    class417 var18 = arg5[var17];
                                    int var19 = arg7 == null ? var18.method1295() : arg7[var17];
                                    if ((class184.field2768 & 0xFF000000) == -16777216) {
                                        var18.method722(arg3, var10 + this.field2949.field2890 - var19, 0, 0, 1);
                                    } else {
                                        var18.method722(arg3, this.field2949.field2890 + var10 - var19, 1, class184.field2768 & 0xFF000000 | 0xFFFFFF, 1);
                                    }
                                    arg3 += arg5[var17].method1294();
                                    var12 = -1;
                                } catch (Exception var21) {
                                }
                            } else {
                                this.method1386(var16, arg0 ^ 0xFF00001C);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var11 == -1) {
                    if (var12 != -1) {
                        arg3 += this.field2949.method1355(var15, var12, (byte) 123);
                    }
                    if (var15 == ' ') {
                        if (class122.field1662 > 0) {
                            class200.field2958 += class122.field1662;
                            arg3 += class200.field2958 >> 8;
                            class200.field2958 &= 0xFF;
                        }
                    } else if (arg6 == null) {
                        if ((class243.field3536 & 0xFF000000) != 0) {
                            this.method1298(var15, arg3 + 1, var10 - -1, class243.field3536, true);
                        }
                        this.method1298(var15, arg3, var10, class184.field2768, false);
                    } else {
                        if ((class243.field3536 & 0xFF000000) != 0) {
                            this.method1299(var15, arg3 + 1, var10 + 1, class243.field3536, true, arg6, arg2, arg8);
                        }
                        this.method1299(var15, arg3, var10, class184.field2768, false, arg6, arg2, arg8);
                    }
                    int var20 = this.field2949.method1356(var15, 215);
                    if (class219.field3179 != -1) {
                        this.field2936.method743(var20, (int) ((double) this.field2949.field2890 * 0.7D) + var10, (byte) -127, arg3, class219.field3179);
                    }
                    if (class222.field3210 != -1) {
                        this.field2936.method743(var20, var10 + this.field2949.field2890 + 1, (byte) -127, arg3, class222.field3210);
                    }
                    arg3 += var20;
                    var12 = var15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(I[Lrn;[IILjava/util/Random;IIII[ILjava/lang/String;ZIII)I", line = 247)
    public final int method1377(int arg0, class417[] arg1, int[] arg2, int arg3, Random arg4, int arg5, int arg6, int arg7, int arg8, int[] arg9, String arg10, boolean arg11, int arg12, int arg13, int arg14) {
        field2941++;
        if (arg10 == null) {
            return 0;
        }
        arg4.setSeed((long) arg8);
        int var16 = (arg4.nextInt() & 0x1F) + 192;
        if (arg11) {
            this.method1379((int[]) null, 33, (class417[]) null, 20, (int[]) null, (String) null, (int[]) null, -74);
        }
        this.method1388(arg5 & 0xFFFFFF | var16 << 24, 0, var16 << 24 | arg3 & 0xFFFFFF);
        int var17 = arg10.length();
        int[] var18 = new int[var17];
        int var19 = 0;
        for (int var20 = 0; var20 < var17; var20++) {
            var18[var20] = var19;
            if ((arg4.nextInt() & 0x3) == 0) {
                var19++;
            }
        }
        int var21 = arg12;
        int var22 = this.field2949.field2888 + arg14;
        int var23 = -1;
        if (arg6 == 1) {
            var22 += (arg0 - this.field2949.field2883 - this.field2949.field2888) / 2;
        } else if (arg6 == 2) {
            var22 = arg14 + arg0 - this.field2949.field2883;
        }
        if (arg7 == 1) {
            var23 = var19 + this.field2949.method1354((byte) -106, arg10);
            var21 = (arg13 - var23) / 2 + arg12;
        } else if (arg7 == 2) {
            var23 = var19 + this.field2949.method1354((byte) -107, arg10);
            var21 = arg13 + arg12 - var23;
        }
        this.method1379((int[]) null, var21, arg1, -82, var18, arg10, arg9, var22);
        if (arg2 != null) {
            if (var23 == -1) {
                var23 = var19 + this.field2949.method1354((byte) -59, arg10);
            }
            arg2[0] = var21;
            arg2[2] = var23;
            arg2[1] = var22 - this.field2949.field2888;
            arg2[3] = this.field2949.field2888 + this.field2949.field2883;
        }
        return var19;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(I[IIIIBILjava/lang/String;Loj;II[Lrn;IIII)I", line = 325)
    public final int method1378(int arg0, int[] arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, String arg7, class405 arg8, int arg9, int arg10, class417[] arg11, int arg12, int arg13, int arg14, int arg15) {
        field2943++;
        if (arg7 == null) {
            return 0;
        }
        this.method1388(arg2, 0, arg13);
        if (arg6 == 0) {
            arg6 = this.field2949.field2890;
        }
        if (arg5 != -104) {
            this.field2949 = null;
        }
        int[] var17;
        if ((this.field2949.field2888 + this.field2949.field2883 + arg6) > arg0 && arg0 < arg6 + arg6) {
            var17 = null;
        } else {
            var17 = new int[] { arg10 };
        }
        int var18 = this.field2949.method1353(var17, class410.field5615, arg11, (byte) 92, arg7);
        if (arg9 == 3 && var18 == 1) {
            arg9 = 1;
        }
        int var19;
        if (arg9 == 0) {
            var19 = arg4 + this.field2949.field2888;
        } else if (arg9 == 1) {
            var19 = (arg0 - ((var18 - 1) * arg6) - this.field2949.field2883 - this.field2949.field2888) / 2 + this.field2949.field2888 + arg4;
        } else if (arg9 == 2) {
            var19 = arg0 + arg4 - ((var18 + -1) * arg6) - this.field2949.field2883;
        } else {
            int var20 = (arg0 - ((var18 - 1) * arg6) - this.field2949.field2883 - this.field2949.field2888) / (var18 + 1);
            if (var20 < 0) {
                var20 = 0;
            }
            arg6 += var20;
            var19 = arg4 + var20 + this.field2949.field2888;
        }
        for (int var21 = 0; var21 < var18; var21++) {
            if (arg12 == 0) {
                this.method1376((byte) 28, var19, arg15, arg14, class410.field5615[var21], arg11, arg8, arg1, arg3);
            } else if (arg12 == 1) {
                this.method1376((byte) 28, var19, arg15, (arg10 - this.field2949.method1354((byte) -56, class410.field5615[var21])) / 2 + arg14, class410.field5615[var21], arg11, arg8, arg1, arg3);
            } else if (arg12 == 2) {
                this.method1376((byte) 28, var19, arg15, (arg14 + arg10) - this.field2949.method1354((byte) -64, class410.field5615[var21]), class410.field5615[var21], arg11, arg8, arg1, arg3);
            } else if ((var18 - 1) == var21) {
                this.method1376((byte) 28, var19, arg15, arg14, class410.field5615[var21], arg11, arg8, arg1, arg3);
            } else {
                this.method1375((byte) 41, arg10, class410.field5615[var21]);
                this.method1376((byte) 28, var19, arg15, arg14, class410.field5615[var21], arg11, arg8, arg1, arg3);
                class122.field1662 = 0;
            }
            var19 += arg6;
        }
        return var18;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "([II[Lrn;I[ILjava/lang/String;[II)V", line = 411)
    private final void method1379(int[] arg0, int arg1, class417[] arg2, int arg3, int[] arg4, String arg5, int[] arg6, int arg7) {
        field2932++;
        int var9 = arg7 - this.field2949.field2890;
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        int var13 = arg5.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class187.method1324((byte) 110, arg5.charAt(var14)) & 0xFF);
            if (var15 == '<') {
                var10 = var14;
            } else {
                if (var15 == '>' && var10 != -1) {
                    String var16 = arg5.substring(var10 + 1, var14);
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
                                    if (arg0 == null) {
                                        var18 = 0;
                                    } else {
                                        var18 = arg0[var12];
                                    }
                                    var12++;
                                    int var19 = class270.method1827(var16.substring(4), false);
                                    class417 var20 = arg2[var19];
                                    int var21 = arg6 == null ? var20.method1295() : arg6[var19];
                                    var20.method722(arg1 + var17, this.field2949.field2890 + var9 - var21 + var18, 0, 0, 1);
                                    var11 = -1;
                                    arg1 += arg2[var19].method1294();
                                } catch (Exception var25) {
                                }
                            } else {
                                this.method1386(var16, -16777216);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var10 == -1) {
                    if (var11 != -1) {
                        arg1 += this.field2949.method1355(var15, var11, (byte) 102);
                    }
                    int var22;
                    if (arg4 == null) {
                        var22 = 0;
                    } else {
                        var22 = arg4[var12];
                    }
                    int var23;
                    if (arg0 == null) {
                        var23 = 0;
                    } else {
                        var23 = arg0[var12];
                    }
                    var12++;
                    if (var15 != ' ') {
                        if ((class243.field3536 & 0xFF000000) != 0) {
                            this.method1298(var15, arg1 + var22 + 1, var9 + 1 + var23, class243.field3536, true);
                        }
                        this.method1298(var15, arg1 + var22, var9 - -var23, class184.field2768, false);
                    } else if (class122.field1662 > 0) {
                        class200.field2958 += class122.field1662;
                        arg1 += class200.field2958 >> 8;
                        class200.field2958 &= 0xFF;
                    }
                    int var24 = this.field2949.method1356(var15, 215);
                    if (class219.field3179 != -1) {
                        this.field2936.method743(var24, (int) ((double) this.field2949.field2890 * 0.7D) + var9, (byte) -127, arg1, class219.field3179);
                    }
                    if (class222.field3210 != -1) {
                        this.field2936.method743(var24, var9 + this.field2949.field2890, (byte) -127, arg1, class222.field3210);
                    }
                    var11 = var15;
                    arg1 += var24;
                }
            }
        }
        if (arg3 >= -80) {
            this.method1377(-90, (class417[]) null, (int[]) null, 6, (Random) null, -24, -58, 28, -6, (int[]) null, (String) null, true, -109, 43, 53);
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IILjava/lang/String;III)V", line = 579)
    public final void method1380(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5) {
        int var7 = -24 % ((arg5 - 18) / 57);
        field2940++;
        if (arg2 != null) {
            this.method1388(arg4, 0, arg3);
            this.method1376((byte) 28, arg1, 0, arg0 - this.field2949.method1354((byte) -121, arg2), arg2, (class417[]) null, (class405) null, (int[]) null, 0);
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IZIIIIILjava/lang/String;)V", line = 594)
    public final void method1381(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, String arg7) {
        field2948++;
        if (arg7 == null) {
            return;
        }
        this.method1388(arg3, 0, arg6);
        double var9 = 7.0D - ((double) arg4 / 8.0D);
        if (var9 < 0.0D) {
            var9 = 0.0D;
        }
        int var11 = arg7.length();
        if (!arg1) {
            this.method1298((char) 65414, 22, 42, 90, true);
        }
        int[] var12 = new int[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = (int) (var9 * Math.sin((double) var13 / 1.5D + (double) arg5));
        }
        this.method1379(var12, arg0 - (this.field2949.method1354((byte) -87, arg7) / 2), (class417[]) null, -128, (int[]) null, arg7, (int[]) null, arg2);
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IBLjava/lang/String;IIII)V", line = 627)
    public final void method1382(int arg0, byte arg1, String arg2, int arg3, int arg4, int arg5, int arg6) {
        field2939++;
        if (arg2 == null) {
            return;
        }
        this.method1388(arg4, 0, arg0);
        int var8 = arg2.length();
        int var9 = 105 / ((-arg1 - 72) / 38);
        int[] var10 = new int[var8];
        int[] var11 = new int[var8];
        for (int var12 = 0; var12 < var8; var12++) {
            var10[var12] = (int) (Math.sin((double) arg5 / 5.0D + (double) var12 / 5.0D) * 5.0D);
            var11[var12] = (int) (Math.sin((double) arg5 / 5.0D + (double) var12 / 3.0D) * 5.0D);
        }
        this.method1379(var11, arg6 - (this.field2949.method1354((byte) -106, arg2) / 2), (class417[]) null, -108, var10, arg2, (int[]) null, arg3);
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IZILjava/lang/String;II)V", line = 661)
    public final void method1383(int arg0, boolean arg1, int arg2, String arg3, int arg4, int arg5) {
        field2938++;
        if (arg3 == null) {
            return;
        }
        this.method1388(arg0, 0, arg4);
        this.method1376((byte) 28, arg2, 0, arg5, arg3, (class417[]) null, (class405) null, (int[]) null, 0);
        if (arg1) {
            this.method1386((String) null, 105);
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(ZIZIZBLjava/lang/String;JLjava/lang/String;II)V", line = 676)
    public static final void method1384(boolean arg0, int arg1, boolean arg2, int arg3, boolean arg4, byte arg5, String arg6, long arg7, String arg8, int arg9, int arg10) {
        field2952++;
        int[] var12 = new int[4];
        for (int var13 = 0; var13 < 3; var13++) {
            var12[var13] = (int) (Math.random() * 9.9999999E7D);
        }
        class161 var14 = new class161(128);
        var14.method1180((byte) -110, 10);
        var14.method1173((arg0 ? 1 : 0) | (arg4 ? 2 : 0) | (arg2 ? 4 : 0), (byte) 121);
        var14.method1190(arg7, (byte) -55);
        if (arg5 > -55) {
            field2947 = true;
        }
        var14.method1177(var12[0], -119);
        var14.method1184((byte) -107, arg6);
        var14.method1177(var12[1], -94);
        var14.method1173(class96.field1351, (byte) 124);
        var14.method1180((byte) -110, arg3);
        var14.method1180((byte) -110, arg9);
        var14.method1177(var12[2], -35);
        var14.method1173(arg1, (byte) 124);
        var14.method1173(arg10, (byte) 117);
        var14.method1177(var12[3], -97);
        var14.method1169(class280.field4017, class51.field746, 124);
        class161 var15 = new class161(350);
        var15.method1184((byte) -97, arg8);
        int var16 = 8 - (class345.method2147(arg8, (byte) 110) % 8);
        for (int var17 = 0; var17 < var16; var17++) {
            var15.method1180((byte) -110, (int) (Math.random() * 255.0D));
        }
        var15.method1189(true, var12);
        class311.field4403.field2298 = 0;
        class311.field4403.method1180((byte) -110, class433.field6130.field60);
        class311.field4403.method1173(2 - (-var14.field2298 - var15.field2298), (byte) 122);
        class311.field4403.method1173(573, (byte) 118);
        class311.field4403.method1166(var14.field2262, 0, var14.field2298, false);
        class311.field4403.method1166(var15.field2262, 0, var15.field2298, false);
        class196.field2908 = 0;
        class39.field530 = -3;
        class67.field973 = 0;
        class181.field2729 = 1;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Ljava/lang/String;IIIII)V", line = 734)
    public final void method1385(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 != 1453761640) {
            return;
        }
        field2950++;
        if (arg0 != null) {
            this.method1388(arg1, 0, arg2);
            this.method1376((byte) 28, arg3, 0, arg4 - (this.field2949.method1354((byte) -65, arg0) / 2), arg0, (class417[]) null, (class405) null, (int[]) null, 0);
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 753)
    private final void method1386(String arg0, int arg1) {
        if (arg1 != -16777216) {
            return;
        }
        field2944++;
        try {
            if (arg0.startsWith("col=")) {
                class184.field2768 = class184.field2768 & 0xFF000000 | class83.method706(16, arg0.substring(4), (byte) -7) & 0xFFFFFF;
            } else if (arg0.equals("/col")) {
                class184.field2768 = class184.field2768 & 0xFF000000 | class182.field2750 & 0xFFFFFF;
            }
            if (arg0.startsWith("argb=")) {
                class184.field2768 = class83.method706(16, arg0.substring(5), (byte) -7);
            } else if (arg0.equals("/argb")) {
                class184.field2768 = class182.field2750;
            } else if (arg0.startsWith("str=")) {
                class219.field3179 = class83.method706(16, arg0.substring(4), (byte) -7) | 0xFF000000;
            } else if (arg0.equals("str")) {
                class219.field3179 = -8388608;
            } else if (arg0.equals("/str")) {
                class219.field3179 = -1;
            } else if (arg0.startsWith("u=")) {
                class222.field3210 = class83.method706(16, arg0.substring(2), (byte) -7) | 0xFF000000;
            } else if (arg0.equals("u")) {
                class222.field3210 = -16777216;
            } else if (arg0.equals("/u")) {
                class222.field3210 = -1;
            } else if (arg0.equalsIgnoreCase("shad=-1")) {
                class243.field3536 = 0;
            } else if (arg0.startsWith("shad=")) {
                class243.field3536 = class83.method706(16, arg0.substring(5), (byte) -7) | 0xFF000000;
                return;
            } else if (arg0.equals("shad")) {
                class243.field3536 = -16777216;
                return;
            } else if (arg0.equals("/shad")) {
                class243.field3536 = class361.field4973;
                return;
            } else if (arg0.equals("br")) {
                this.method1388(class182.field2750, 0, class361.field4973);
                return;
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IIZLjava/lang/String;III)V", line = 833)
    public final void method1387(int arg0, int arg1, boolean arg2, String arg3, int arg4, int arg5, int arg6) {
        field2934++;
        if (arg3 == null) {
            return;
        }
        this.method1388(arg6, 0, arg0);
        int var8 = arg3.length();
        int[] var9 = new int[var8];
        for (int var10 = 0; var10 < var8; var10++) {
            var9[var10] = (int) (Math.sin((double) arg5 / 5.0D + (double) var10 / 2.0D) * 5.0D);
        }
        this.method1379(var9, arg1 - (this.field2949.method1354((byte) -89, arg3) / 2), (class417[]) null, -104, (int[]) null, arg3, (int[]) null, arg4);
        if (!arg2) {
            this.method1380(-34, 4, (String) null, -81, -85, 68);
        }
    }

    @OriginalMember(owner = "client!am", name = "<init>", descriptor = "(Lvc;Lkg;)V", line = 860)
    public class199(class89 arg0, class194 arg1) {
        this.field2936 = arg0;
        this.field2949 = arg1;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(III)V", line = 869)
    private final void method1388(int arg0, int arg1, int arg2) {
        if (arg2 == -1) {
            arg2 = 0;
        }
        class200.field2958 = arg1;
        field2953++;
        class219.field3179 = -1;
        class122.field1662 = 0;
        class182.field2750 = arg0;
        class184.field2768 = arg0;
        class222.field3210 = -1;
        class361.field4973 = arg2;
        class243.field3536 = arg2;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(II)V", line = 890)
    public static final void method1389(int arg0, int arg1) {
        class183 var2 = null;
        for (int var3 = arg0; var3 < arg1; var3++) {
            class241 var4 = class190.field2858[var3];
            if (var4 != null) {
                for (int var5 = 0; var5 < class97.field1374; var5++) {
                    for (int var6 = 0; var6 < class310.field4401; var6++) {
                        var2 = var4.method586(var6, var5, var2);
                        if (var2 != null) {
                            int var7 = var6 << class380.field5232;
                            int var8 = var5 << class380.field5232;
                            for (int var9 = var3 - 1; var9 >= 0; var9--) {
                                class241 var10 = class190.field2858[var9];
                                if (var10 != null) {
                                    int var11 = var4.method591(var6, var5) - var10.method591(var6, var5);
                                    int var12 = var4.method591(var6 + 1, var5) - var10.method591(var6 + 1, var5);
                                    int var13 = var4.method591(var6 + 1, var5 + 1) - var10.method591(var6 + 1, var5 + 1);
                                    int var14 = var4.method591(var6, var5 + 1) - var10.method591(var6, var5 + 1);
                                    var10.method582(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(ILjava/lang/String;I[II[Lrn;II)V", line = 957)
    public final void method1390(int arg0, String arg1, int arg2, int[] arg3, int arg4, class417[] arg5, int arg6, int arg7) {
        field2937++;
        if (arg1 == null) {
            return;
        }
        if (arg0 != 16777215) {
            this.method1299('B', 54, 105, -37, true, (class405) null, 27, -42);
        }
        this.method1388(arg7, 0, arg4);
        this.method1376((byte) 28, arg2, 0, arg6, arg1, arg5, (class405) null, arg3, 0);
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(CIIIZLoj;II)V")
    public abstract void method1299(char arg0, int arg1, int arg2, int arg3, boolean arg4, class405 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(CIIIZ)V")
    public abstract void method1298(char arg0, int arg1, int arg2, int arg3, boolean arg4);
}
