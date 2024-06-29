import java.awt.Canvas;
import java.lang.reflect.Constructor;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public abstract class class213 {

    @OriginalMember(owner = "client!dr", name = "i", descriptor = "Lnr;")
    private class437 field3020;

    @OriginalMember(owner = "client!dr", name = "m", descriptor = "Lfi;")
    private class165 field3024;

    @OriginalMember(owner = "client!dr", name = "x", descriptor = "Ljava/lang/String;")
    public static String field3035 = "flash1:";

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "I")
    public static int field3012;

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "I")
    public static int field3013;

    @OriginalMember(owner = "client!dr", name = "c", descriptor = "I")
    public static int field3014;

    @OriginalMember(owner = "client!dr", name = "d", descriptor = "I")
    public static int field3015;

    @OriginalMember(owner = "client!dr", name = "f", descriptor = "I")
    public static int field3017;

    @OriginalMember(owner = "client!dr", name = "g", descriptor = "I")
    public static int field3018;

    @OriginalMember(owner = "client!dr", name = "h", descriptor = "I")
    public static int field3019;

    @OriginalMember(owner = "client!dr", name = "j", descriptor = "I")
    public static int field3021;

    @OriginalMember(owner = "client!dr", name = "k", descriptor = "I")
    public static int field3022;

    @OriginalMember(owner = "client!dr", name = "l", descriptor = "I")
    public static int field3023;

    @OriginalMember(owner = "client!dr", name = "n", descriptor = "I")
    public static int field3025;

    @OriginalMember(owner = "client!dr", name = "o", descriptor = "I")
    public static int field3026;

    @OriginalMember(owner = "client!dr", name = "p", descriptor = "I")
    public static int field3027;

    @OriginalMember(owner = "client!dr", name = "q", descriptor = "I")
    public static int field3028;

    @OriginalMember(owner = "client!dr", name = "r", descriptor = "I")
    public static int field3029;

    @OriginalMember(owner = "client!dr", name = "s", descriptor = "I")
    public static int field3030;

    @OriginalMember(owner = "client!dr", name = "t", descriptor = "I")
    public static int field3031;

    @OriginalMember(owner = "client!dr", name = "u", descriptor = "I")
    public static int field3032;

    @OriginalMember(owner = "client!dr", name = "v", descriptor = "I")
    public static int field3033;

    @OriginalMember(owner = "client!dr", name = "w", descriptor = "I")
    public static int field3034;

    @OriginalMember(owner = "client!dr", name = "y", descriptor = "I")
    public static int field3036;

    @OriginalMember(owner = "client!dr", name = "z", descriptor = "I")
    public static int field3037;

    @OriginalMember(owner = "client!dr", name = "e", descriptor = "Lqa;")
    public static class243 field3016;

    // $FF: synthetic field
    @OriginalMember(owner = "client!dr", name = "A", descriptor = "Ljava/lang/Class;")
    public static Class field3038;

    // $FF: synthetic field
    @OriginalMember(owner = "client!dr", name = "B", descriptor = "Ljava/lang/Class;")
    public static Class field3039;

    // $FF: synthetic field
    @OriginalMember(owner = "client!dr", name = "C", descriptor = "Ljava/lang/Class;")
    public static Class field3040;

    // $FF: synthetic method
    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1336(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(ILjava/lang/String;IIIII)V", line = 3)
    public final void method1315(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3028++;
        if (arg1 == null) {
            return;
        }
        this.method1326(arg6, arg3, 0);
        int var8 = arg1.length();
        int[] var9 = new int[var8];
        int[] var10 = new int[var8];
        for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = (int) (Math.sin((double) arg5 / 5.0D + (double) var11 / 5.0D) * 5.0D);
            var10[var11] = (int) (Math.sin((double) arg5 / 5.0D + (double) var11 / 3.0D) * 5.0D);
        }
        this.method1316(arg0, arg1, arg2 - (this.field3024.method1029((byte) -35, arg1) / arg4), var9, var10, (class243[]) null, true, (int[]) null);
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(ILjava/lang/String;I[I[I[Lqa;Z[I)V", line = 34)
    private final void method1316(int arg0, String arg1, int arg2, int[] arg3, int[] arg4, class243[] arg5, boolean arg6, int[] arg7) {
        field3037++;
        int var9 = arg0 - this.field3024.field2156;
        int var10 = -1;
        if (!arg6) {
            this.method1321((String) null, 50);
        }
        int var11 = -1;
        int var12 = 0;
        int var13 = arg1.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (method1331(arg1.charAt(var14), arg6) & 0xFF);
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
                                    if (arg4 == null) {
                                        var18 = 0;
                                    } else {
                                        var18 = arg4[var12];
                                    }
                                    var12++;
                                    int var19 = class15.method105(var16.substring(4), (byte) 20);
                                    class243 var20 = arg5[var19];
                                    int var21 = arg7 == null ? var20.method1091() : arg7[var19];
                                    var20.method35(arg2 + var17, this.field3024.field2156 + var9 - var21 - -var18, 0, 0, 1);
                                    arg2 += arg5[var19].method1088();
                                    var11 = -1;
                                } catch (Exception var25) {
                                }
                            } else {
                                this.method1321(var16, -2033);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var10 == -1) {
                    if (var11 != -1) {
                        arg2 += this.field3024.method1021(var15, false, var11);
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
                    if (var15 != ' ') {
                        if ((class272.field3985 & 0xFF000000) != 0) {
                            this.method320(var15, arg2 + var22 + 1, var9 - -1 + var23, class272.field3985, true);
                        }
                        this.method320(var15, arg2 + var22, var9 + var23, class337.field4975, false);
                    } else if (class123.field1647 > 0) {
                        class307.field4387 += class123.field1647;
                        arg2 += class307.field4387 >> 8;
                        class307.field4387 &= 0xFF;
                    }
                    var12++;
                    int var24 = this.field3024.method1018(var15, 87);
                    if (class191.field2659 != -1) {
                        this.field3020.method2769(arg2, class191.field2659, (byte) -102, var24, (int) ((double) this.field3024.field2156 * 0.7D) + var9);
                    }
                    if (class57.field827 != -1) {
                        this.field3020.method2769(arg2, class57.field827, (byte) -108, var24, this.field3024.field2156 + var9);
                    }
                    arg2 += var24;
                    var11 = var15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(IZIIILjava/lang/String;II)V", line = 196)
    public final void method1317(int arg0, boolean arg1, int arg2, int arg3, int arg4, String arg5, int arg6, int arg7) {
        field3031++;
        if (arg1) {
            field3021 = -126;
        }
        if (arg5 == null) {
            return;
        }
        this.method1326(arg2, arg4, 0);
        double var9 = 7.0D - (double) arg3 / 8.0D;
        if (var9 < 0.0D) {
            var9 = 0.0D;
        }
        int var11 = arg5.length();
        int[] var12 = new int[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = (int) (Math.sin((double) var13 / 1.5D + (double) arg7) * var9);
        }
        this.method1316(arg6, arg5, arg0 - this.field3024.method1029((byte) -37, arg5) / 2, (int[]) null, var12, (class243[]) null, !arg1, (int[]) null);
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(BILjava/lang/String;III)V", line = 230)
    public final void method1318(byte arg0, int arg1, String arg2, int arg3, int arg4, int arg5) {
        field3027++;
        if (arg2 != null) {
            this.method1326(arg1, arg3, 0);
            if (arg0 > 63) {
                this.method1332(arg5, 0, (class243[]) null, (class449) null, arg4 - (this.field3024.method1029((byte) 76, arg2) / 2), 0, 0, arg2, (int[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(ILjava/lang/String;IIII)V", line = 246)
    public final void method1319(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        field3023++;
        if (arg1 != null) {
            this.method1326(arg5, arg2, arg0 ^ arg0);
            this.method1332(arg3, 0, (class243[]) null, (class449) null, arg4, 0, 0, arg1, (int[]) null);
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIIILjava/lang/String;ILjava/util/Random;[IIIIII[I[Lqa;)I", line = 259)
    public final int method1320(int arg0, int arg1, int arg2, int arg3, String arg4, int arg5, Random arg6, int[] arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int[] arg13, class243[] arg14) {
        field3012++;
        if (arg4 == null) {
            return 0;
        }
        arg6.setSeed((long) arg11);
        int var16 = (arg6.nextInt() & 0x1F) + 192;
        this.method1326(var16 << 24 | arg10 & 0xFFFFFF, arg12 & 0xFFFFFF | var16 << 24, arg8 ^ arg8);
        int var17 = arg4.length();
        int[] var18 = new int[var17];
        int var19 = 0;
        for (int var20 = 0; var20 < var17; var20++) {
            var18[var20] = var19;
            if ((arg6.nextInt() & 0x3) == 0) {
                var19++;
            }
        }
        int var21 = arg2;
        int var22 = arg5 + this.field3024.field2152;
        int var23 = -1;
        if (arg1 == 1) {
            var22 += (arg0 - this.field3024.field2152 - this.field3024.field2146) / 2;
        } else if (arg1 == 2) {
            var22 = arg0 + arg5 - this.field3024.field2146;
        }
        if (arg9 == 1) {
            var23 = var19 + this.field3024.method1029((byte) 74, arg4);
            var21 = (arg3 - var23) / 2 + arg2;
        } else if (arg9 == 2) {
            var23 = var19 + this.field3024.method1029((byte) 100, arg4);
            var21 = arg3 + arg2 - var23;
        }
        this.method1316(var22, arg4, var21, var18, (int[]) null, arg14, true, arg13);
        if (arg7 != null) {
            if (var23 == -1) {
                var23 = this.field3024.method1029((byte) 88, arg4) + var19;
            }
            arg7[3] = this.field3024.field2152 + this.field3024.field2146;
            arg7[0] = var21;
            arg7[2] = var23;
            arg7[1] = var22 - this.field3024.field2152;
        }
        return var19;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 332)
    private final void method1321(String arg0, int arg1) {
        field3030++;
        try {
            if (arg0.startsWith("col=")) {
                class337.field4975 = class337.field4975 & 0xFF000000 | class273.method1750(16, arg0.substring(4), 14006) & 0xFFFFFF;
            } else if (arg0.equals("/col")) {
                class337.field4975 = class337.field4975 & 0xFF000000 | class449.field6566 & 0xFFFFFF;
            }
            if (arg0.startsWith("argb=")) {
                class337.field4975 = class273.method1750(16, arg0.substring(5), 14006);
            } else if (arg0.equals("/argb")) {
                class337.field4975 = class449.field6566;
            } else if (arg0.startsWith("str=")) {
                class191.field2659 = class273.method1750(16, arg0.substring(4), 14006) | 0xFF000000;
            } else if (arg0.equals("str")) {
                class191.field2659 = -8388608;
            } else if (arg0.equals("/str")) {
                class191.field2659 = -1;
            } else if (arg0.startsWith("u=")) {
                class57.field827 = class273.method1750(16, arg0.substring(2), 14006) | 0xFF000000;
            } else if (arg0.equals("u")) {
                class57.field827 = -16777216;
            } else if (arg0.equals("/u")) {
                class57.field827 = -1;
            } else if (arg0.equalsIgnoreCase("shad=-1")) {
                class272.field3985 = 0;
            } else if (arg0.startsWith("shad=")) {
                class272.field3985 = class273.method1750(16, arg0.substring(5), 14006) | 0xFF000000;
            } else if (arg0.equals("shad")) {
                class272.field3985 = -16777216;
            } else if (arg0.equals("/shad")) {
                class272.field3985 = class79.field1078;
            } else if (arg0.equals("br")) {
                this.method1326(class79.field1078, class449.field6566, 0);
            }
            if (arg1 != -2033) {
                this.field3020 = null;
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(Lro;B)Z", line = 406)
    public static final boolean method1322(class249 arg0, byte arg1) {
        if (arg1 <= 54) {
            return true;
        }
        field3015++;
        if (arg0.field3551 == null) {
            return false;
        }
        for (int var2 = 0; var2 < arg0.field3551.length; var2++) {
            int var3 = class10.method77(73, var2, arg0);
            int var4 = arg0.field3574[var2];
            if (arg0.field3551[var2] == 2) {
                if (var3 >= var4) {
                    return false;
                }
            } else if (arg0.field3551[var2] == 3) {
                if (var4 >= var3) {
                    return false;
                }
            } else if (arg0.field3551[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "([ILsn;IIIIIIIIILjava/lang/String;[Lqa;III)I", line = 465)
    public final int method1323(int[] arg0, class449 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, String arg11, class243[] arg12, int arg13, int arg14, int arg15) {
        field3033++;
        if (arg11 == null) {
            return 0;
        }
        this.method1326(arg5, arg7, arg10 ^ arg10);
        if (arg9 == 0) {
            arg9 = this.field3024.field2156;
        }
        int[] var17;
        if (arg8 < this.field3024.field2152 + this.field3024.field2146 + arg9 && arg8 < (arg9 + arg9)) {
            var17 = null;
        } else {
            var17 = new int[] { arg14 };
        }
        int var18 = this.field3024.method1028(var17, -67, arg11, class26.field470, arg12);
        if (arg3 == 3 && var18 == 1) {
            arg3 = 1;
        }
        int var19;
        if (arg3 == 0) {
            var19 = this.field3024.field2152 + arg4;
        } else if (arg3 == 1) {
            var19 = (arg8 - (this.field3024.field2152 - (-this.field3024.field2146 - (var18 - 1) * arg9))) / 2 + this.field3024.field2152 + arg4;
        } else if (arg3 == 2) {
            var19 = arg4 + arg8 - this.field3024.field2146 - ((var18 + -1) * arg9);
        } else {
            int var20 = (arg8 - ((var18 - 1) * arg9) - this.field3024.field2146 - this.field3024.field2152) / (var18 + 1);
            if (var20 < 0) {
                var20 = 0;
            }
            arg9 += var20;
            var19 = this.field3024.field2152 + arg4 + var20;
        }
        for (int var21 = 0; var21 < var18; var21++) {
            if (arg15 == 0) {
                this.method1332(var19, arg6, arg12, arg1, arg13, 0, arg2, class26.field470[var21], arg0);
            } else if (arg15 == 1) {
                this.method1332(var19, arg6, arg12, arg1, arg13 + (arg14 - this.field3024.method1029((byte) 113, class26.field470[var21])) / 2, 0, arg2, class26.field470[var21], arg0);
            } else if (arg15 == 2) {
                this.method1332(var19, arg6, arg12, arg1, arg13 + arg14 - this.field3024.method1029((byte) -34, class26.field470[var21]), arg10 + -23008, arg2, class26.field470[var21], arg0);
            } else if (var18 - 1 == var21) {
                this.method1332(var19, arg6, arg12, arg1, arg13, 0, arg2, class26.field470[var21], arg0);
            } else {
                this.method1324(arg14, true, class26.field470[var21]);
                this.method1332(var19, arg6, arg12, arg1, arg13, 0, arg2, class26.field470[var21], arg0);
                class123.field1647 = 0;
            }
            var19 += arg9;
        }
        return var18;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(IZLjava/lang/String;)V", line = 558)
    private final void method1324(int arg0, boolean arg1, String arg2) {
        field3036++;
        int var4 = 0;
        if (!arg1) {
            this.method1319(-114, (String) null, 2, -122, -59, 25);
        }
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
            class123.field1647 = (arg0 - this.field3024.method1029((byte) 101, arg2) << 8) / var4;
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(B)V", line = 597)
    public static void method1325(byte arg0) {
        field3035 = null;
        if (arg0 != -19) {
            method1325((byte) -33);
        }
        field3016 = null;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(III)V", line = 613)
    private final void method1326(int arg0, int arg1, int arg2) {
        class57.field827 = -1;
        class123.field1647 = 0;
        class191.field2659 = -1;
        field3026++;
        class307.field4387 = arg2;
        class449.field6566 = arg1;
        class337.field4975 = arg1;
        if (arg0 == -1) {
            arg0 = 0;
        }
        class79.field1078 = arg0;
        class272.field3985 = arg0;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(IILfl;Ljava/awt/Canvas;ILud;)Lnr;", line = 629)
    public static final class437 method1327(int arg0, int arg1, class386 arg2, Canvas arg3, int arg4, class2 arg5) {
        field3019++;
        int var6 = -46 % ((arg0 + 36) / 56);
        try {
            Class var7 = Class.forName("ih");
            Constructor var8 = var7.getConstructor(field3038 == null ? (field3038 = method1336("java.awt.Canvas")) : field3038, field3039 == null ? (field3039 = method1336("fl")) : field3039, Integer.TYPE, Integer.TYPE, field3040 == null ? (field3040 = method1336("ud")) : field3040);
            return (class437) var8.newInstance(arg3, arg2, Integer.valueOf(arg1), new Integer(arg4), arg5);
        } catch (Exception var9) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(IBILjava/lang/String;II)V", line = 653)
    public final void method1328(int arg0, byte arg1, int arg2, String arg3, int arg4, int arg5) {
        field3034++;
        if (arg3 != null && arg1 < -66) {
            this.method1326(arg0, arg4, 0);
            this.method1332(arg5, 0, (class243[]) null, (class449) null, arg2 - this.field3024.method1029((byte) -91, arg3), 0, 0, arg3, (int[]) null);
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(Ljava/util/Random;IZII[Lqa;IILjava/lang/String;[I)I", line = 668)
    public final int method1329(Random arg0, int arg1, boolean arg2, int arg3, int arg4, class243[] arg5, int arg6, int arg7, String arg8, int[] arg9) {
        field3032++;
        if (arg8 == null) {
            return 0;
        }
        arg0.setSeed((long) arg3);
        int var11 = (arg0.nextInt() & 0x1F) + 192;
        this.method1326(var11 << 24 | arg6 & 0xFFFFFF, var11 << 24 | arg1 & 0xFFFFFF, 0);
        int var12 = arg8.length();
        int[] var13 = new int[var12];
        int var14 = 0;
        for (int var15 = 0; var15 < var12; var15++) {
            var13[var15] = var14;
            if ((arg0.nextInt() & 0x3) == 0) {
                var14++;
            }
        }
        this.method1316(arg7, arg8, arg4, var13, (int[]) null, arg5, arg2, arg9);
        return var14;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIIIIILjava/lang/String;)V", line = 705)
    public final void method1330(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, String arg6) {
        field3029++;
        if (arg6 == null) {
            return;
        }
        this.method1326(arg4, arg1, arg5 - 237);
        int var8 = arg6.length();
        int[] var9 = new int[var8];
        if (arg5 != 237) {
            field3021 = -105;
        }
        for (int var10 = 0; var10 < var8; var10++) {
            var9[var10] = (int) (Math.sin((double) arg2 / 5.0D + (double) var10 / 2.0D) * 5.0D);
        }
        this.method1316(arg0, arg6, arg3 - (this.field3024.method1029((byte) 117, arg6) / 2), (int[]) null, var9, (class243[]) null, true, (int[]) null);
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(CZ)B", line = 734)
    public static final byte method1331(char arg0, boolean arg1) {
        field3014++;
        byte var2;
        if (arg0 > '\u0000' && arg0 < '\u0080' || arg0 >= ' ' && arg0 <= 'ÿ') {
            var2 = (byte) arg0;
        } else if (arg0 == '€') {
            var2 = -128;
        } else if (arg0 == '‚') {
            var2 = -126;
        } else if (arg0 == 'ƒ') {
            var2 = -125;
        } else if (arg0 == '„') {
            var2 = -124;
        } else if (arg0 == '…') {
            var2 = -123;
        } else if (arg0 == '†') {
            var2 = -122;
        } else if (arg0 == '‡') {
            var2 = -121;
        } else if (arg0 == 'ˆ') {
            var2 = -120;
        } else if (arg0 == '‰') {
            var2 = -119;
        } else if (arg0 == 'Š') {
            var2 = -118;
        } else if (arg0 == '‹') {
            var2 = -117;
        } else if (arg0 == 'Œ') {
            var2 = -116;
        } else if (arg0 == 'Ž') {
            var2 = -114;
        } else if (arg0 == '‘') {
            var2 = -111;
        } else if (arg0 == '’') {
            var2 = -110;
        } else if (arg0 == '“') {
            var2 = -109;
        } else if (arg0 == '”') {
            var2 = -108;
        } else if (arg0 == '•') {
            var2 = -107;
        } else if (arg0 == '–') {
            var2 = -106;
        } else if (arg0 == '—') {
            var2 = -105;
        } else if (arg0 == '˜') {
            var2 = -104;
        } else if (arg0 == '™') {
            var2 = -103;
        } else if (arg0 == 'š') {
            var2 = -102;
        } else if (arg0 == '›') {
            var2 = -101;
        } else if (arg0 == 'œ') {
            var2 = -100;
        } else if (arg0 == 'ž') {
            var2 = -98;
        } else if (arg0 == 'Ÿ') {
            var2 = -97;
        } else {
            var2 = 63;
        }
        if (!arg1) {
            method1322((class249) null, (byte) -12);
        }
        return var2;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(II[Lqa;Lsn;IIILjava/lang/String;[I)V", line = 862)
    private final void method1332(int arg0, int arg1, class243[] arg2, class449 arg3, int arg4, int arg5, int arg6, String arg7, int[] arg8) {
        int var10 = arg0 - this.field3024.field2156;
        field3018++;
        int var11 = -1;
        int var12 = -1;
        int var13 = arg7.length();
        for (int var14 = arg5; var14 < var13; var14++) {
            char var15 = (char) (method1331(arg7.charAt(var14), true) & 0xFF);
            if (var15 == '<') {
                var11 = var14;
            } else {
                if (var15 == '>' && var11 != -1) {
                    String var16 = arg7.substring(var11 + 1, var14);
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
                                    int var17 = class15.method105(var16.substring(4), (byte) 20);
                                    class243 var18 = arg2[var17];
                                    int var19 = arg8 == null ? var18.method1091() : arg8[var17];
                                    if ((class337.field4975 & 0xFF000000) == -16777216) {
                                        var18.method35(arg4, this.field3024.field2156 + var10 - var19, 0, 0, 1);
                                    } else {
                                        var18.method35(arg4, this.field3024.field2156 + var10 - var19, 1, class337.field4975 & 0xFF000000 | 0xFFFFFF, 1);
                                    }
                                    arg4 += arg2[var17].method1088();
                                    var12 = -1;
                                } catch (Exception var21) {
                                }
                            } else {
                                this.method1321(var16, -2033);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var11 == -1) {
                    if (var12 != -1) {
                        arg4 += this.field3024.method1021(var15, false, var12);
                    }
                    if (var15 == ' ') {
                        if (class123.field1647 > 0) {
                            class307.field4387 += class123.field1647;
                            arg4 += class307.field4387 >> 8;
                            class307.field4387 &= 0xFF;
                        }
                    } else if (arg3 == null) {
                        if ((class272.field3985 & 0xFF000000) != 0) {
                            this.method320(var15, arg4 + 1, var10 + 1, class272.field3985, true);
                        }
                        this.method320(var15, arg4, var10, class337.field4975, false);
                    } else {
                        if ((class272.field3985 & 0xFF000000) != 0) {
                            this.method322(var15, arg4 + 1, var10 + 1, class272.field3985, true, arg3, arg1, arg6);
                        }
                        this.method322(var15, arg4, var10, class337.field4975, false, arg3, arg1, arg6);
                    }
                    int var20 = this.field3024.method1018(var15, arg5 + 96);
                    if (class191.field2659 != -1) {
                        this.field3020.method2769(arg4, class191.field2659, (byte) -95, var20, (int) ((double) this.field3024.field2156 * 0.7D) + var10);
                    }
                    if (class57.field827 != -1) {
                        this.field3020.method2769(arg4, class57.field827, (byte) -106, var20, this.field3024.field2156 + var10 + 1);
                    }
                    arg4 += var20;
                    var12 = var15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dr", name = "<init>", descriptor = "(Lnr;Lfi;)V", line = 1016)
    public class213(class437 arg0, class165 arg1) {
        this.field3020 = arg0;
        this.field3024 = arg1;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(B[Lqa;II[IILjava/lang/String;I)V", line = 1032)
    public final void method1333(byte arg0, class243[] arg1, int arg2, int arg3, int[] arg4, int arg5, String arg6, int arg7) {
        field3025++;
        if (arg6 == null) {
            return;
        }
        if (arg0 != -103) {
            method1322((class249) null, (byte) -96);
        }
        this.method1326(arg5, arg2, arg0 + 103);
        this.method1332(arg7, 0, arg1, (class449) null, arg3 - (this.field3024.method1029((byte) 89, arg6) / 2), 0, 0, arg6, arg4);
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(Ljava/lang/String;[IIBIII[Lqa;)V", line = 1050)
    public final void method1334(String arg0, int[] arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, class243[] arg7) {
        field3017++;
        if (arg0 != null) {
            this.method1326(arg5, arg6, 0);
            this.method1332(arg2, 0, arg7, (class449) null, arg4 - this.field3024.method1029((byte) -127, arg0), 0, 0, arg0, arg1);
            int var9 = 2 / ((-arg3 - 19) / 61);
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(IILjava/lang/String;[Lqa;[IIII)V", line = 1073)
    public final void method1335(int arg0, int arg1, String arg2, class243[] arg3, int[] arg4, int arg5, int arg6, int arg7) {
        field3022++;
        if (arg2 == null) {
            return;
        }
        this.method1326(arg6, arg0, 0);
        this.method1332(arg7, 0, arg3, (class449) null, arg5, 0, 0, arg2, arg4);
        if (arg1 != 4712) {
            this.field3024 = null;
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(CIIIZLsn;II)V")
    public abstract void method322(char arg0, int arg1, int arg2, int arg3, boolean arg4, class449 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(CIIIZ)V")
    public abstract void method320(char arg0, int arg1, int arg2, int arg3, boolean arg4);
}
