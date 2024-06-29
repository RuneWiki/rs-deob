import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public abstract class class196 {

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "Lnm;")
    private class277 field2657;

    @OriginalMember(owner = "client!tc", name = "n", descriptor = "Len;")
    private class174 field2664;

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "Z")
    public static boolean field2658 = true;

    @OriginalMember(owner = "client!tc", name = "r", descriptor = "[I")
    public static int[] field2668 = new int[] { 6144, 8192, 10240, 4096, 12288, 2048, 0, 14336 };

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "I")
    public static int field2651;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "I")
    public static int field2652;

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "I")
    public static int field2653;

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "I")
    public static int field2654;

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "I")
    public static int field2655;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "I")
    public static int field2656;

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "I")
    public static int field2659;

    @OriginalMember(owner = "client!tc", name = "j", descriptor = "I")
    public static int field2660;

    @OriginalMember(owner = "client!tc", name = "k", descriptor = "I")
    public static int field2661;

    @OriginalMember(owner = "client!tc", name = "l", descriptor = "I")
    public static int field2662;

    @OriginalMember(owner = "client!tc", name = "m", descriptor = "I")
    public static int field2663;

    @OriginalMember(owner = "client!tc", name = "o", descriptor = "I")
    public static int field2665;

    @OriginalMember(owner = "client!tc", name = "p", descriptor = "I")
    public static int field2666;

    @OriginalMember(owner = "client!tc", name = "q", descriptor = "I")
    public static int field2667;

    @OriginalMember(owner = "client!tc", name = "s", descriptor = "I")
    public static int field2669;

    @OriginalMember(owner = "client!tc", name = "t", descriptor = "I")
    public static int field2670;

    @OriginalMember(owner = "client!tc", name = "u", descriptor = "I")
    public static int field2671;

    @OriginalMember(owner = "client!tc", name = "w", descriptor = "I")
    public static int field2673;

    @OriginalMember(owner = "client!tc", name = "x", descriptor = "I")
    public static int field2674;

    @OriginalMember(owner = "client!tc", name = "y", descriptor = "I")
    public static int field2675;

    @OriginalMember(owner = "client!tc", name = "v", descriptor = "Lkh;")
    public static class11 field2672;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIILhm;Ljava/lang/String;III[IIIII[Lkh;I)I")
    public final int method1241(int arg0, int arg1, int arg2, int arg3, class121 arg4, String arg5, int arg6, int arg7, int arg8, int[] arg9, int arg10, int arg11, int arg12, int arg13, class11[] arg14, int arg15) {
        field2654++;
        if (arg5 == null) {
            return 0;
        }
        this.method1252(arg15, arg7, 0);
        if (arg8 == 0) {
            arg8 = this.field2657.field3903;
        }
        if (arg6 < 91) {
            this.method1242((class121) null, (class11[]) null, (int[]) null, (byte) -63, 66, -29, (String) null, -81, -64);
        }
        int[] var17;
        if (arg1 < this.field2657.field3912 + this.field2657.field3906 + arg8 && arg1 < arg8 + arg8) {
            var17 = null;
        } else {
            var17 = new int[] { arg12 };
        }
        int var18 = this.field2657.method1752(var17, arg5, class444.field6480, arg14, -86);
        if (arg3 == 3 && var18 == 1) {
            arg3 = 1;
        }
        int var19;
        if (arg3 == 0) {
            var19 = this.field2657.field3912 + arg2;
        } else if (arg3 == 1) {
            var19 = (arg1 - (var18 - 1) * arg8 - this.field2657.field3912 - this.field2657.field3906) / 2 + this.field2657.field3912 + arg2;
        } else if (arg3 == 2) {
            var19 = arg1 + arg2 - ((var18 - 1) * arg8) - this.field2657.field3906;
        } else {
            int var20 = (arg1 - this.field2657.field3912 - this.field2657.field3906 - ((var18 + -1) * arg8)) / (var18 + 1);
            if (var20 < 0) {
                var20 = 0;
            }
            arg8 += var20;
            var19 = this.field2657.field3912 + arg2 + var20;
        }
        for (int var21 = 0; var21 < var18; var21++) {
            if (arg11 == 0) {
                this.method1242(arg4, arg14, arg9, (byte) -70, arg0, arg13, class444.field6480[var21], arg10, var19);
            } else if (arg11 == 1) {
                this.method1242(arg4, arg14, arg9, (byte) -70, arg0, arg13, class444.field6480[var21], arg10 + ((arg12 - this.field2657.method1748(class444.field6480[var21], 101)) / 2), var19);
            } else if (arg11 == 2) {
                this.method1242(arg4, arg14, arg9, (byte) -70, arg0, arg13, class444.field6480[var21], arg12 + arg10 - this.field2657.method1748(class444.field6480[var21], -124), var19);
            } else if ((var18 - 1) == var21) {
                this.method1242(arg4, arg14, arg9, (byte) -70, arg0, arg13, class444.field6480[var21], arg10, var19);
            } else {
                this.method1259(class444.field6480[var21], arg12, 127);
                this.method1242(arg4, arg14, arg9, (byte) -70, arg0, arg13, class444.field6480[var21], arg10, var19);
                class294.field4216 = 0;
            }
            var19 += arg8;
        }
        return var18;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lhm;[Lkh;[IBIILjava/lang/String;II)V")
    private final void method1242(class121 arg0, class11[] arg1, int[] arg2, byte arg3, int arg4, int arg5, String arg6, int arg7, int arg8) {
        int var10 = arg8 - this.field2657.field3903;
        field2659++;
        if (arg3 != -70) {
            this.field2657 = null;
        }
        int var11 = -1;
        int var12 = -1;
        int var13 = arg6.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class38.method229((byte) -98, arg6.charAt(var14)) & 0xFF);
            if (var15 == '<') {
                var11 = var14;
            } else {
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
                                    int var17 = class99.method531(var16.substring(4), (byte) -43);
                                    class11 var18 = arg1[var17];
                                    int var19 = arg2 == null ? var18.method47() : arg2[var17];
                                    if ((class10.field116 & 0xFF000000) == -16777216) {
                                        var18.method40(arg7, this.field2657.field3903 + var10 - var19, 0, 0, 1);
                                    } else {
                                        var18.method40(arg7, this.field2657.field3903 + var10 - var19, 1, class10.field116 & 0xFF000000 | 0xFFFFFF, 1);
                                    }
                                    arg7 += arg1[var17].method52();
                                    var12 = -1;
                                } catch (Exception var21) {
                                }
                            } else {
                                this.method1254(var16, 116);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var11 == -1) {
                    if (var12 != -1) {
                        arg7 += this.field2657.method1746(-7221, var12, var15);
                    }
                    if (var15 == ' ') {
                        if (class294.field4216 > 0) {
                            class186.field2538 += class294.field4216;
                            arg7 += class186.field2538 >> 8;
                            class186.field2538 &= 0xFF;
                        }
                    } else if (arg0 == null) {
                        if ((class162.field2283 & 0xFF000000) != 0) {
                            this.method281(var15, arg7 + 1, var10 + 1, class162.field2283, true);
                        }
                        this.method281(var15, arg7, var10, class10.field116, false);
                    } else {
                        if ((class162.field2283 & 0xFF000000) != 0) {
                            this.method278(var15, arg7 + 1, var10 + 1, class162.field2283, true, arg0, arg4, arg5);
                        }
                        this.method278(var15, arg7, var10, class10.field116, false, arg0, arg4, arg5);
                    }
                    int var20 = this.field2657.method1744(var15, (byte) 45);
                    if (class261.field3604 != -1) {
                        this.field2664.method1146(class261.field3604, (byte) 60, var10 + ((int) ((double) this.field2657.field3903 * 0.7D)), var20, arg7);
                    }
                    if (class149.field2092 != -1) {
                        this.field2664.method1146(class149.field2092, (byte) 60, this.field2657.field3903 + var10 + 1, var20, arg7);
                    }
                    var12 = var15;
                    arg7 += var20;
                }
            }
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIILjava/lang/String;II)V")
    public final void method1243(int arg0, int arg1, int arg2, int arg3, String arg4, int arg5, int arg6) {
        field2667++;
        if (arg4 == null) {
            return;
        }
        this.method1252(arg6, arg2, arg3);
        int var8 = arg4.length();
        int[] var9 = new int[var8];
        for (int var10 = 0; var10 < var8; var10++) {
            var9[var10] = (int) (Math.sin((double) arg5 / 5.0D + (double) var10 / 2.0D) * 5.0D);
        }
        this.method1256(arg4, -109, arg0 - (this.field2657.method1748(arg4, arg3 - 114) / 2), arg1, (int[]) null, (int[]) null, var9, (class11[]) null);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I[IIIIIIILjava/lang/String;[Lkh;II[IILjava/util/Random;)I")
    public final int method1244(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, String arg8, class11[] arg9, int arg10, int arg11, int[] arg12, int arg13, Random arg14) {
        field2666++;
        if (arg8 == null) {
            return 0;
        }
        arg14.setSeed((long) arg10);
        int var16 = (arg14.nextInt() & 0x1F) + 192;
        this.method1252(var16 << 24 | arg2 & 0xFFFFFF, arg13 & 0xFFFFFF | var16 << 24, arg0 ^ arg0);
        int var17 = arg8.length();
        int[] var18 = new int[var17];
        int var19 = 0;
        for (int var20 = 0; var20 < var17; var20++) {
            var18[var20] = var19;
            if ((arg14.nextInt() & 0x3) == 0) {
                var19++;
            }
        }
        int var21 = arg11;
        int var22 = arg7 + this.field2657.field3912;
        if (arg6 == 1) {
            var22 += (arg3 - this.field2657.field3912 - this.field2657.field3906) / 2;
        } else if (arg6 == 2) {
            var22 = arg3 + arg7 - this.field2657.field3906;
        }
        int var23 = -1;
        if (arg4 == 1) {
            var23 = this.field2657.method1748(arg8, -57) + var19;
            var21 = (arg5 - var23) / 2 + arg11;
        } else if (arg4 == 2) {
            var23 = var19 + this.field2657.method1748(arg8, -65);
            var21 = arg5 + arg11 - var23;
        }
        this.method1256(arg8, arg0 ^ 0xFFFFFF64, var21, var22, var18, arg1, (int[]) null, arg9);
        if (arg12 != null) {
            if (var23 == -1) {
                var23 = var19 + this.field2657.method1748(arg8, -122);
            }
            arg12[1] = var22 - this.field2657.field3912;
            arg12[3] = this.field2657.field3912 + this.field2657.field3906;
            arg12[2] = var23;
            arg12[0] = var21;
        }
        return var19;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IILjava/lang/String;ZII)V")
    public final void method1245(int arg0, int arg1, String arg2, boolean arg3, int arg4, int arg5) {
        if (!arg3) {
            this.field2664 = null;
        }
        field2675++;
        if (arg2 != null) {
            this.method1252(arg0, arg4, 0);
            this.method1242((class121) null, (class11[]) null, (int[]) null, (byte) -70, 0, 0, arg2, arg5, arg1);
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILjava/lang/String;IIIIII)V")
    public final void method1246(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2653++;
        if (arg1 == null) {
            return;
        }
        this.method1252(arg6, arg3, 0);
        double var9 = 7.0D - (double) arg0 / 8.0D;
        if (var9 < 0.0D) {
            var9 = 0.0D;
        }
        int var11 = arg1.length();
        int[] var12 = new int[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = (int) (var9 * Math.sin((double) var13 / 1.5D + (double) arg5));
        }
        this.method1256(arg1, -89, arg4 - this.field2657.method1748(arg1, -82) / arg7, arg2, (int[]) null, (int[]) null, var12, (class11[]) null);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILjava/util/Random;[Lkh;Ljava/lang/String;III[III)I")
    public final int method1247(int arg0, Random arg1, class11[] arg2, String arg3, int arg4, int arg5, int arg6, int[] arg7, int arg8, int arg9) {
        field2661++;
        if (arg3 == null) {
            return 0;
        }
        arg1.setSeed((long) arg8);
        int var11 = (arg1.nextInt() & 0x1F) + 192;
        this.method1252(var11 << 24 | arg6 & 0xFFFFFF, arg5 & 0xFFFFFF | var11 << 24, 0);
        int var12 = arg3.length();
        int[] var13 = new int[var12];
        int var14 = -36 / ((79 - arg0) / 44);
        int var15 = 0;
        for (int var16 = 0; var16 < var12; var16++) {
            var13[var16] = var15;
            if ((arg1.nextInt() & 0x3) == 0) {
                var15++;
            }
        }
        this.method1256(arg3, -76, arg9, arg4, var13, arg7, (int[]) null, arg2);
        return var15;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Ljava/lang/String;II[IIII[Lkh;)V")
    public final void method1248(String arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, class11[] arg7) {
        field2670++;
        if (arg0 == null) {
            return;
        }
        this.method1252(arg1, arg2, 0);
        this.method1242((class121) null, arg7, arg3, (byte) -70, 0, 0, arg0, arg6, arg5);
        if (arg4 <= 91) {
            field2658 = false;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V")
    public static final void method1249(int arg0) {
        field2669++;
        if (arg0 < 27) {
            method1260(-101, -40);
        }
        class348 var1 = class385.method2464(15, 1302, 0);
        var1.method2214((byte) 121);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)V")
    public static void method1250(byte arg0) {
        field2668 = null;
        if (arg0 <= 100) {
            method1249(-15);
        }
        field2672 = null;
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(Len;Lnm;)V")
    public class196(class174 arg0, class277 arg1) {
        this.field2657 = arg1;
        this.field2664 = arg0;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IBIIILjava/lang/String;)V")
    public final void method1251(int arg0, byte arg1, int arg2, int arg3, int arg4, String arg5) {
        field2674++;
        int var7 = 127 / ((-arg1 - 41) / 56);
        if (arg5 != null) {
            this.method1252(arg0, arg3, 0);
            this.method1242((class121) null, (class11[]) null, (int[]) null, (byte) -70, 0, 0, arg5, arg2 - this.field2657.method1748(arg5, 97), arg4);
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(III)V")
    private final void method1252(int arg0, int arg1, int arg2) {
        field2655++;
        class294.field4216 = arg2;
        class6.field71 = arg1;
        class10.field116 = arg1;
        class186.field2538 = 0;
        class261.field3604 = -1;
        if (arg0 == -1) {
            arg0 = 0;
        }
        class149.field2092 = -1;
        class48.field559 = arg0;
        class162.field2283 = arg0;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIILjava/lang/String;II)V")
    public final void method1253(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5) {
        field2663++;
        if (arg3 == null) {
            return;
        }
        this.method1252(arg2, arg4, 0);
        if (arg0 < 117) {
            this.field2664 = null;
        }
        this.method1242((class121) null, (class11[]) null, (int[]) null, (byte) -70, 0, 0, arg3, arg5 - (this.field2657.method1748(arg3, -83) / 2), arg1);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(CIIIZ)V")
    public abstract void method281(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Ljava/lang/String;I)V")
    private final void method1254(String arg0, int arg1) {
        try {
            if (arg0.startsWith("col=")) {
                class10.field116 = class10.field116 & 0xFF000000 | class97.method521(2, 16, arg0.substring(4)) & 0xFFFFFF;
            } else if (arg0.equals("/col")) {
                class10.field116 = class10.field116 & 0xFF000000 | class6.field71 & 0xFFFFFF;
            }
            if (arg1 <= 63) {
                this.method1254((String) null, -14);
            }
            if (arg0.startsWith("argb=")) {
                class10.field116 = class97.method521(2, 16, arg0.substring(5));
            } else if (arg0.equals("/argb")) {
                class10.field116 = class6.field71;
            } else if (arg0.startsWith("str=")) {
                class261.field3604 = class97.method521(2, 16, arg0.substring(4)) | 0xFF000000;
            } else if (arg0.equals("str")) {
                class261.field3604 = -8388608;
            } else if (arg0.equals("/str")) {
                class261.field3604 = -1;
            } else if (arg0.startsWith("u=")) {
                class149.field2092 = class97.method521(2, 16, arg0.substring(2)) | 0xFF000000;
            } else if (arg0.equals("u")) {
                class149.field2092 = -16777216;
            } else if (arg0.equals("/u")) {
                class149.field2092 = -1;
            } else if (arg0.equalsIgnoreCase("shad=-1")) {
                class162.field2283 = 0;
            } else if (arg0.startsWith("shad=")) {
                class162.field2283 = class97.method521(2, 16, arg0.substring(5)) | 0xFF000000;
            } else if (arg0.equals("shad")) {
                class162.field2283 = -16777216;
            } else if (arg0.equals("/shad")) {
                class162.field2283 = class48.field559;
            } else if (arg0.equals("br")) {
                this.method1252(class48.field559, class6.field71, 0);
            }
        } catch (Exception var3) {
        }
        field2652++;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "([IILjava/lang/String;[Lkh;IIII)V")
    public final void method1255(int[] arg0, int arg1, String arg2, class11[] arg3, int arg4, int arg5, int arg6, int arg7) {
        field2656++;
        if (arg2 == null) {
            return;
        }
        this.method1252(arg1, arg4, 0);
        this.method1242((class121) null, arg3, arg0, (byte) -70, 0, 0, arg2, arg7 - (this.field2657.method1748(arg2, -100) / 2), arg5);
        if (arg6 < 102) {
            this.method1248((String) null, -81, 104, (int[]) null, -71, 101, 105, (class11[]) null);
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Ljava/lang/String;III[I[I[I[Lkh;)V")
    private final void method1256(String arg0, int arg1, int arg2, int arg3, int[] arg4, int[] arg5, int[] arg6, class11[] arg7) {
        field2671++;
        int var9 = arg3 - this.field2657.field3903;
        int var10 = -1;
        int var11 = -1;
        if (arg1 > -47) {
            this.field2664 = null;
        }
        int var12 = 0;
        int var13 = arg0.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class38.method229((byte) -98, arg0.charAt(var14)) & 0xFF);
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
                                    if (arg4 == null) {
                                        var17 = 0;
                                    } else {
                                        var17 = arg4[var12];
                                    }
                                    int var18;
                                    if (arg6 == null) {
                                        var18 = 0;
                                    } else {
                                        var18 = arg6[var12];
                                    }
                                    var12++;
                                    int var19 = class99.method531(var16.substring(4), (byte) -91);
                                    class11 var20 = arg7[var19];
                                    int var21 = arg5 == null ? var20.method47() : arg5[var19];
                                    var20.method40(arg2 + var17, this.field2657.field3903 + var9 - (-var18 + var21), 0, 0, 1);
                                    arg2 += arg7[var19].method52();
                                    var11 = -1;
                                } catch (Exception var25) {
                                }
                            } else {
                                this.method1254(var16, 106);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var10 == -1) {
                    if (var11 != -1) {
                        arg2 += this.field2657.method1746(-7221, var11, var15);
                    }
                    int var22;
                    if (arg4 == null) {
                        var22 = 0;
                    } else {
                        var22 = arg4[var12];
                    }
                    int var23;
                    if (arg6 == null) {
                        var23 = 0;
                    } else {
                        var23 = arg6[var12];
                    }
                    if (var15 != ' ') {
                        if ((class162.field2283 & 0xFF000000) != 0) {
                            this.method281(var15, arg2 + var22 + 1, var9 + 1 - -var23, class162.field2283, true);
                        }
                        this.method281(var15, arg2 + var22, var9 - -var23, class10.field116, false);
                    } else if (class294.field4216 > 0) {
                        class186.field2538 += class294.field4216;
                        arg2 += class186.field2538 >> 8;
                        class186.field2538 &= 0xFF;
                    }
                    var12++;
                    int var24 = this.field2657.method1744(var15, (byte) 45);
                    if (class261.field3604 != -1) {
                        this.field2664.method1146(class261.field3604, (byte) 60, (int) ((double) this.field2657.field3903 * 0.7D) + var9, var24, arg2);
                    }
                    if (class149.field2092 != -1) {
                        this.field2664.method1146(class149.field2092, (byte) 60, this.field2657.field3903 + var9, var24, arg2);
                    }
                    arg2 += var24;
                    var11 = var15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IZLjava/lang/String;IIII)V")
    public final void method1257(int arg0, boolean arg1, String arg2, int arg3, int arg4, int arg5, int arg6) {
        field2665++;
        if (arg1) {
            field2668 = null;
        }
        if (arg2 == null) {
            return;
        }
        this.method1252(arg4, arg5, 0);
        int var8 = arg2.length();
        int[] var9 = new int[var8];
        int[] var10 = new int[var8];
        for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = (int) (Math.sin((double) arg0 / 5.0D + (double) var11 / 5.0D) * 5.0D);
            var10[var11] = (int) (Math.sin((double) arg0 / 5.0D + (double) var11 / 3.0D) * 5.0D);
        }
        this.method1256(arg2, -97, arg6 - this.field2657.method1748(arg2, 102) / 2, arg3, var9, (int[]) null, var10, (class11[]) null);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "([Lkh;ILjava/lang/String;IIII[I)V")
    public final void method1258(class11[] arg0, int arg1, String arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7) {
        field2651++;
        if (arg4 == 4 && arg2 != null) {
            this.method1252(arg5, arg1, 0);
            this.method1242((class121) null, arg0, arg7, (byte) -70, 0, 0, arg2, arg6 - this.field2657.method1748(arg2, -60), arg3);
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Ljava/lang/String;II)V")
    private final void method1259(String arg0, int arg1, int arg2) {
        field2660++;
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
        if (arg2 <= 126) {
            this.method1241(-110, 89, -66, 53, (class121) null, (String) null, 127, -53, -97, (int[]) null, 49, -110, 66, -5, (class11[]) null, -50);
        }
        if (var4 > 0) {
            class294.field4216 = (arg1 - this.field2657.method1748(arg0, -70) << 8) / var4;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(CIIIZLhm;II)V")
    public abstract void method278(char arg0, int arg1, int arg2, int arg3, boolean arg4, class121 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(II)Lng;")
    public static final class190 method1260(int arg0, int arg1) {
        field2662++;
        class190 var2 = (class190) class428.field6220.method2049(-89, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class392.field5735.method361(4, 101, arg0);
        int var4 = -38 / ((21 - arg1) / 56);
        class190 var5 = new class190();
        if (var3 != null) {
            var5.method1217(arg0, 127, new class211(var3));
        }
        var5.method1216((byte) -124, arg0);
        class428.field6220.method2046((long) arg0, 0, var5);
        return var5;
    }
}
