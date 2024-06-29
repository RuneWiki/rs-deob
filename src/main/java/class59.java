import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public abstract class class59 {

    @OriginalMember(owner = "client!da", name = "i", descriptor = "Lfp;")
    private class323 field1101;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "Lha;")
    private class58 field1093;

    @OriginalMember(owner = "client!da", name = "s", descriptor = "Lsn;")
    public static class628 field1111 = new class628();

    @OriginalMember(owner = "client!da", name = "b", descriptor = "I")
    public static int field1094;

    @OriginalMember(owner = "client!da", name = "c", descriptor = "I")
    public static int field1095;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "I")
    public static int field1096;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "I")
    public static int field1097;

    @OriginalMember(owner = "client!da", name = "f", descriptor = "I")
    public static int field1098;

    @OriginalMember(owner = "client!da", name = "g", descriptor = "I")
    public static int field1099;

    @OriginalMember(owner = "client!da", name = "h", descriptor = "I")
    public static int field1100;

    @OriginalMember(owner = "client!da", name = "j", descriptor = "I")
    public static int field1102;

    @OriginalMember(owner = "client!da", name = "k", descriptor = "I")
    public static int field1103;

    @OriginalMember(owner = "client!da", name = "l", descriptor = "I")
    public static int field1104;

    @OriginalMember(owner = "client!da", name = "m", descriptor = "I")
    public static int field1105;

    @OriginalMember(owner = "client!da", name = "n", descriptor = "I")
    public static int field1106;

    @OriginalMember(owner = "client!da", name = "o", descriptor = "I")
    public static int field1107;

    @OriginalMember(owner = "client!da", name = "p", descriptor = "I")
    public static int field1108;

    @OriginalMember(owner = "client!da", name = "q", descriptor = "I")
    public static int field1109;

    @OriginalMember(owner = "client!da", name = "r", descriptor = "I")
    public static int field1110;

    @OriginalMember(owner = "client!da", name = "t", descriptor = "I")
    public static int field1112;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(III[IIILaa;IIIILjava/lang/String;III[Lkr;)I", line = 4)
    public final int method648(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, class484 arg6, int arg7, int arg8, int arg9, int arg10, String arg11, int arg12, int arg13, int arg14, class743[] arg15) {
        if (arg7 != 12673) {
            this.method654(118, 68, -62, 65, null, null, 38, null, null, 105, null, 51, 22, 53, -128);
        }
        field1106++;
        return this.method658(arg2, arg0, arg3, arg8, arg1, arg15, true, arg10, arg13, arg5, arg12, arg4, arg11, arg6, arg9, 0, arg14);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(III)V", line = 21)
    private final void method649(int arg0, int arg1, int arg2) {
        class49.field704 = 0;
        field1103++;
        class377.field5266 = -1;
        class363.field5081 = 0;
        if (arg0 == arg2) {
            arg0 = 0;
        }
        class386.field5387 = -1;
        class590.field8290 = arg1;
        class80.field1493 = arg1;
        class252.field3602 = arg0;
        class534.field7546 = arg0;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/util/Random;IILjava/lang/String;IZ[II[Lkr;I)I", line = 41)
    public final int method650(Random arg0, int arg1, int arg2, String arg3, int arg4, boolean arg5, int[] arg6, int arg7, class743[] arg8, int arg9) {
        if (!arg5) {
            this.field1101 = null;
        }
        field1096++;
        if (arg3 == null) {
            return 0;
        }
        arg0.setSeed((long) arg1);
        int var11 = (arg0.nextInt() & 0x1F) + 192;
        this.method649(var11 << 24 | arg7 & 0xFFFFFF, var11 << 24 | arg2 & 0xFFFFFF, -1);
        int var12 = arg3.length();
        int[] var13 = new int[var12];
        int var14 = 0;
        for (int var15 = 0; var15 < var12; var15++) {
            var13[var15] = var14;
            if ((arg0.nextInt() & 0x3) == 0) {
                var14++;
            }
        }
        this.method659(arg8, var13, arg9, arg4, null, -64, arg3, arg6);
        return var14;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IILjava/lang/String;IBI)V", line = 81)
    public final void method651(int arg0, int arg1, String arg2, int arg3, byte arg4, int arg5) {
        int var7 = -12 / ((62 - arg4) / 53);
        field1108++;
        if (arg2 != null) {
            this.method649(arg5, arg3, -1);
            this.method655(arg1, null, arg2, (byte) -118, 0, null, 0, arg0 - (this.field1101.method2075(false, arg2) / 2), null);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIILjava/lang/String;III)V", line = 96)
    public final void method652(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5, int arg6) {
        field1099++;
        if (arg3 == null) {
            return;
        }
        this.method649(arg1, arg0, -1);
        int var8 = arg3.length();
        int[] var9 = new int[var8];
        for (int var10 = 0; var10 < var8; var10++) {
            var9[var10] = (int) (Math.sin((double) arg4 / 5.0D + (double) var10 / 2.0D) * 5.0D);
        }
        if (arg2 < 120) {
            this.method651(100, 92, null, 69, (byte) -35, 56);
        }
        this.method659(null, null, arg6 - (this.field1101.method2075(false, arg3) / 2), arg5, var9, -86, arg3, null);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IILjava/lang/String;)V", line = 122)
    private final void method653(int arg0, int arg1, String arg2) {
        field1104++;
        int var4 = 0;
        boolean var5 = false;
        for (int var6 = arg0; arg2.length() > var6; var6++) {
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
            class363.field5081 = (arg1 - this.field1101.method2075(false, arg2) << 8) / var4;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIILjava/lang/String;[II[I[Lkr;ILjava/util/Random;IIII)I", line = 160)
    public final int method654(int arg0, int arg1, int arg2, int arg3, String arg4, int[] arg5, int arg6, int[] arg7, class743[] arg8, int arg9, Random arg10, int arg11, int arg12, int arg13, int arg14) {
        field1095++;
        if (arg4 == null) {
            return 0;
        }
        arg10.setSeed((long) arg1);
        int var16 = (arg10.nextInt() & 0x1F) + 192;
        this.method649(arg12 & 0xFFFFFF | var16 << 24, arg6 & 0xFFFFFF | var16 << 24, -1);
        int var17 = arg4.length();
        int[] var18 = new int[var17];
        int var19 = 0;
        for (int var20 = 0; var20 < var17; var20++) {
            var18[var20] = var19;
            if ((arg10.nextInt() & 0x3) == 0) {
                var19++;
            }
        }
        if (arg11 != 4323) {
            return 6;
        }
        int var21 = arg0;
        int var22 = this.field1101.field4594 + arg3;
        int var23 = -1;
        if (arg14 == 1) {
            var22 += (arg9 - this.field1101.field4594 - this.field1101.field4586) / 2;
        } else if (arg14 == 2) {
            var22 = arg3 + arg9 - this.field1101.field4586;
        }
        if (arg13 == 1) {
            var23 = this.field1101.method2075(false, arg4) + var19;
            var21 = (arg2 - var23) / 2 + arg0;
        } else if (arg13 == 2) {
            var23 = var19 + this.field1101.method2075(false, arg4);
            var21 = arg2 + arg0 - var23;
        }
        this.method659(arg8, var18, var21, var22, null, arg11 - 4371, arg4, arg5);
        if (arg7 != null) {
            if (var23 == -1) {
                var23 = this.field1101.method2075(false, arg4) + var19;
            }
            arg7[0] = var21;
            arg7[1] = var22 - this.field1101.field4594;
            arg7[2] = var23;
            arg7[3] = this.field1101.field4594 + this.field1101.field4586;
        }
        return var19;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I[ILjava/lang/String;BILaa;II[Lkr;)V", line = 237)
    private final void method655(int arg0, int[] arg1, String arg2, byte arg3, int arg4, class484 arg5, int arg6, int arg7, class743[] arg8) {
        int var10 = arg0 - this.field1101.field4601;
        field1109++;
        int var11 = -1;
        int var12 = -1;
        int var13 = arg2.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class240.method1617(16697, arg2.charAt(var14)) & 0xFF);
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
                                    int var17 = class547.method3226((byte) -9, var16.substring(4));
                                    class743 var18 = arg8[var17];
                                    int var19 = arg1 == null ? var18.method83() : arg1[var17];
                                    if ((class80.field1493 & 0xFF000000) == -16777216) {
                                        var18.method86(arg7, var10 + this.field1101.field4601 - var19, 1, 0, 1);
                                    } else {
                                        var18.method86(arg7, this.field1101.field4601 + var10 - var19, 0, class80.field1493 & 0xFF000000 | 0xFFFFFF, 1);
                                    }
                                    arg7 += arg8[var17].method82();
                                    var12 = -1;
                                } catch (Exception var21) {
                                }
                            } else {
                                this.method656((byte) -72, var16);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var11 == -1) {
                    if (var12 != -1) {
                        arg7 += this.field1101.method2069(var12, var15, 8448);
                    }
                    if (var15 == ' ') {
                        if (class363.field5081 > 0) {
                            class49.field704 += class363.field5081;
                            arg7 += class49.field704 >> 8;
                            class49.field704 &= 0xFF;
                        }
                    } else if (arg5 == null) {
                        if ((class534.field7546 & 0xFF000000) != 0) {
                            this.method104(var15, arg7 + 1, var10 + 1, class534.field7546, true);
                        }
                        this.method104(var15, arg7, var10, class80.field1493, false);
                    } else {
                        if ((class534.field7546 & 0xFF000000) != 0) {
                            this.method106(var15, arg7 + 1, var10 + 1, class534.field7546, true, arg5, arg6, arg4);
                        }
                        this.method106(var15, arg7, var10, class80.field1493, false, arg5, arg6, arg4);
                    }
                    int var20 = this.field1101.method2071(true, var15);
                    if (class386.field5387 != -1) {
                        this.field1093.method525((int) ((double) this.field1101.field4601 * 0.7D) + var10, var20, class386.field5387, -3482, arg7);
                    }
                    if (class377.field5266 != -1) {
                        this.field1093.method525(var10 + this.field1101.field4601 + 1, var20, class377.field5266, -3482, arg7);
                    }
                    arg7 += var20;
                    var12 = var15;
                }
            }
        }
        if (arg3 >= -51) {
            field1111 = null;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BLjava/lang/String;)V", line = 387)
    private final void method656(byte arg0, String arg1) {
        field1105++;
        try {
            if (arg1.startsWith("col=")) {
                class80.field1493 = class80.field1493 & 0xFF000000 | class81.method794(false, 16, arg1.substring(4)) & 0xFFFFFF;
            } else if (arg1.equals("/col")) {
                class80.field1493 = class590.field8290 & 0xFFFFFF | class80.field1493 & 0xFF000000;
            }
            if (arg0 > -8) {
                this.field1101 = null;
            }
            if (arg1.startsWith("argb=")) {
                class80.field1493 = class81.method794(false, 16, arg1.substring(5));
            } else if (arg1.equals("/argb")) {
                class80.field1493 = class590.field8290;
            } else if (arg1.startsWith("str=")) {
                class386.field5387 = class80.field1493 & 0xFF000000 | class81.method794(false, 16, arg1.substring(4));
            } else if (arg1.equals("str")) {
                class386.field5387 = class80.field1493 & 0xFF000000 | 0x800000;
            } else if (arg1.equals("/str")) {
                class386.field5387 = -1;
            } else if (arg1.startsWith("u=")) {
                class377.field5266 = class80.field1493 & 0xFF000000 | class81.method794(false, 16, arg1.substring(2));
            } else if (arg1.equals("u")) {
                class377.field5266 = class80.field1493 & 0xFF000000;
            } else if (arg1.equals("/u")) {
                class377.field5266 = -1;
            } else if (arg1.equalsIgnoreCase("shad=-1")) {
                class534.field7546 = 0;
            } else if (arg1.startsWith("shad=")) {
                class534.field7546 = class80.field1493 & 0xFF000000 | class81.method794(false, 16, arg1.substring(5));
            } else if (arg1.equals("shad")) {
                class534.field7546 = class80.field1493 & 0xFF000000;
            } else if (arg1.equals("/shad")) {
                class534.field7546 = class252.field3602;
            } else if (arg1.equals("br")) {
                this.method649(class252.field3602, class590.field8290, -1);
                return;
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V", line = 461)
    public static void method657(int arg0) {
        if (arg0 >= -61) {
            field1111 = null;
        }
        field1111 = null;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II[III[Lkr;ZIIIIILjava/lang/String;Laa;III)I", line = 475)
    public final int method658(int arg0, int arg1, int[] arg2, int arg3, int arg4, class743[] arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11, String arg12, class484 arg13, int arg14, int arg15, int arg16) {
        if (!arg6) {
            return -37;
        }
        field1098++;
        if (arg12 == null) {
            return 0;
        }
        this.method649(arg3, arg7, -1);
        if (arg1 == 0) {
            arg1 = this.field1101.field4601;
        }
        int[] var18;
        if (arg9 < (this.field1101.field4594 + this.field1101.field4586 + arg1) && arg9 < arg1 + arg1) {
            var18 = null;
        } else {
            var18 = new int[] { arg14 };
        }
        int var19 = this.field1101.method2070(123, arg5, var18, class247.field3465, arg12);
        if (arg15 == -1) {
            arg15 = arg9 / arg1;
            if (arg15 <= 0) {
                arg15 = 1;
            }
        }
        if (arg15 > 0 && arg15 <= var19) {
            class247.field3465[arg15 - 1] = this.field1101.method2078(arg14, arg5, 1, class247.field3465[arg15 - 1]);
            var19 = arg15;
        }
        if (arg8 == 3 && var19 == 1) {
            arg8 = 1;
        }
        int var21;
        if (arg8 == 0) {
            var21 = this.field1101.field4594 + arg11;
        } else if (arg8 == 1) {
            var21 = (arg9 - this.field1101.field4586 - this.field1101.field4594 - ((var19 + -1) * arg1)) / 2 + this.field1101.field4594 + arg11;
        } else if (arg8 == 2) {
            var21 = arg9 + arg11 - ((var19 + -1) * arg1 + this.field1101.field4586);
        } else {
            int var20 = (arg9 - ((var19 - 1) * arg1) - this.field1101.field4586 - this.field1101.field4594) / (var19 + 1);
            if (var20 < 0) {
                var20 = 0;
            }
            var21 = arg11 + var20 + this.field1101.field4594;
            arg1 += var20;
        }
        for (int var22 = 0; var22 < var19; var22++) {
            if (arg10 == 0) {
                this.method655(var21, arg2, class247.field3465[var22], (byte) -77, arg16, arg13, arg4, arg0, arg5);
            } else if (arg10 == 1) {
                this.method655(var21, arg2, class247.field3465[var22], (byte) -104, arg16, arg13, arg4, (arg14 - this.field1101.method2075(false, class247.field3465[var22])) / 2 + arg0, arg5);
            } else if (arg10 == 2) {
                this.method655(var21, arg2, class247.field3465[var22], (byte) -87, arg16, arg13, arg4, arg0 + arg14 - this.field1101.method2075(false, class247.field3465[var22]), arg5);
            } else if (var19 - 1 == var22) {
                this.method655(var21, arg2, class247.field3465[var22], (byte) -126, arg16, arg13, arg4, arg0, arg5);
            } else {
                this.method653(0, arg14, class247.field3465[var22]);
                this.method655(var21, arg2, class247.field3465[var22], (byte) -66, arg16, arg13, arg4, arg0, arg5);
                class363.field5081 = 0;
            }
            var21 += arg1;
        }
        return var19;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([Lkr;[III[IILjava/lang/String;[I)V", line = 574)
    private final void method659(class743[] arg0, int[] arg1, int arg2, int arg3, int[] arg4, int arg5, String arg6, int[] arg7) {
        field1107++;
        int var9 = arg3 - this.field1101.field4601;
        int var10 = -1;
        int var11 = -1;
        if (arg5 >= -1) {
            this.field1093 = null;
        }
        int var12 = 0;
        int var13 = arg6.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class240.method1617(16697, arg6.charAt(var14)) & 0xFF);
            if (var15 == '<') {
                var10 = var14;
            } else {
                if (var15 == '>' && var10 != -1) {
                    String var16 = arg6.substring(var10 + 1, var14);
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
                                    if (arg1 == null) {
                                        var17 = 0;
                                    } else {
                                        var17 = arg1[var12];
                                    }
                                    int var18;
                                    if (arg4 == null) {
                                        var18 = 0;
                                    } else {
                                        var18 = arg4[var12];
                                    }
                                    var12++;
                                    int var19 = class547.method3226((byte) 107, var16.substring(4));
                                    class743 var20 = arg0[var19];
                                    int var21 = arg7 == null ? var20.method83() : arg7[var19];
                                    var20.method86(arg2 + var17, var9 - (-var18 + var21) + this.field1101.field4601, 1, 0, 1);
                                    arg2 += arg0[var19].method82();
                                    var11 = -1;
                                } catch (Exception var25) {
                                }
                            } else {
                                this.method656((byte) -17, var16);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var10 == -1) {
                    if (var11 != -1) {
                        arg2 += this.field1101.method2069(var11, var15, 8448);
                    }
                    int var22;
                    if (arg1 == null) {
                        var22 = 0;
                    } else {
                        var22 = arg1[var12];
                    }
                    int var23;
                    if (arg4 == null) {
                        var23 = 0;
                    } else {
                        var23 = arg4[var12];
                    }
                    var12++;
                    if (var15 != ' ') {
                        if ((class534.field7546 & 0xFF000000) != 0) {
                            this.method104(var15, arg2 - (-var22 - 1), var9 + 1 + var23, class534.field7546, true);
                        }
                        this.method104(var15, arg2 + var22, var9 + var23, class80.field1493, false);
                    } else if (class363.field5081 > 0) {
                        class49.field704 += class363.field5081;
                        arg2 += class49.field704 >> 8;
                        class49.field704 &= 0xFF;
                    }
                    int var24 = this.field1101.method2071(true, var15);
                    if (class386.field5387 != -1) {
                        this.field1093.method525((int) ((double) this.field1101.field4601 * 0.7D) + var9, var24, class386.field5387, -3482, arg2);
                    }
                    if (class377.field5266 != -1) {
                        this.field1093.method525(this.field1101.field4601 + var9, var24, class377.field5266, -3482, arg2);
                    }
                    var11 = var15;
                    arg2 += var24;
                }
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIBIILjava/lang/String;I)V", line = 743)
    public final void method660(int arg0, int arg1, byte arg2, int arg3, int arg4, String arg5, int arg6) {
        field1110++;
        if (arg5 == null) {
            return;
        }
        this.method649(arg4, arg0, -1);
        int var8 = arg5.length();
        int[] var9 = new int[var8];
        int[] var10 = new int[var8];
        if (arg2 != -5) {
            this.field1093 = null;
        }
        for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = (int) (Math.sin((double) arg1 / 5.0D + (double) var11 / 5.0D) * 5.0D);
            var10[var11] = (int) (Math.sin((double) arg1 / 5.0D + (double) var11 / 3.0D) * 5.0D);
        }
        this.method659(null, var9, arg3 - (this.field1101.method2075(false, arg5) / 2), arg6, var10, -68, arg5, null);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIBIIIILjava/lang/String;)V", line = 774)
    public final void method661(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, String arg7) {
        field1102++;
        if (arg7 == null) {
            return;
        }
        this.method649(arg0, arg3, -1);
        double var9 = 7.0D - (double) arg5 / 8.0D;
        if (var9 < 0.0D) {
            var9 = 0.0D;
        }
        int var11 = arg7.length();
        int[] var12 = new int[var11];
        if (arg2 < 85) {
            this.field1101 = null;
        }
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = (int) (Math.sin((double) var13 / 1.5D + (double) arg6) * var9);
        }
        this.method659(null, null, arg4 - (this.field1101.method2075(false, arg7) / 2), arg1, var12, -78, arg7, null);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIILjava/lang/String;IB)V", line = 807)
    public final void method662(int arg0, int arg1, int arg2, String arg3, int arg4, byte arg5) {
        if (arg5 < 46) {
            this.method649(-113, 122, -118);
        }
        field1112++;
        if (arg3 != null) {
            this.method649(arg1, arg2, -1);
            this.method655(arg4, null, arg3, (byte) -69, 0, null, 0, arg0 - this.field1101.method2075(false, arg3), null);
        }
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(I)Lvr;", line = 830)
    public static final class135 method663(int arg0) {
        field1097++;
        class135 var1 = class215.method1499((byte) 64);
        var1.field2114 = 0;
        var1.field2106 = null;
        var1.field2109 = new class452(5000);
        return arg0 < 118 ? null : var1;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIILjava/lang/String;[Lkr;[II)V", line = 846)
    public final void method664(int arg0, int arg1, int arg2, int arg3, String arg4, class743[] arg5, int[] arg6, int arg7) {
        field1094++;
        if (arg4 == null) {
            return;
        }
        this.method649(arg1, arg0, -1);
        this.method655(arg3, arg6, arg4, (byte) -124, 0, null, 0, arg2, arg5);
        if (arg7 <= 116) {
            this.method104((char) 65451, 96, 39, -50, false);
        }
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Lha;Lfp;)V", line = 864)
    public class59(class58 arg0, class323 arg1) {
        this.field1101 = arg1;
        this.field1093 = arg0;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/lang/String;IIII)V", line = 878)
    public final void method665(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        field1100++;
        if (arg4 == -16777216 && arg1 != null) {
            this.method649(arg2, arg5, arg4 ^ 0xFFFFFF);
            this.method655(arg0, null, arg1, (byte) -109, 0, null, 0, arg3, null);
        }
    }

    @OriginalMember(owner = "client!da", name = "fa", descriptor = "(CIIIZ)V")
    public abstract void method104(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(CIIIZLaa;II)V")
    public abstract void method106(char arg0, int arg1, int arg2, int arg3, boolean arg4, class484 arg5, int arg6, int arg7);
}
