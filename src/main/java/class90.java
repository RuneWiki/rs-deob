import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public abstract class class90 {

    @OriginalMember(owner = "client!ra", name = "o", descriptor = "Lqa;")
    private class206 field1113;

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "Lfc;")
    private class216 field1108;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "I")
    public static int field1099;

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "I")
    public static int field1100;

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "I")
    public static int field1101;

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "I")
    public static int field1102;

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "I")
    public static int field1103;

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "I")
    public static int field1104;

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "I")
    public static int field1105;

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "I")
    public static int field1106;

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "I")
    public static int field1107;

    @OriginalMember(owner = "client!ra", name = "k", descriptor = "I")
    public static int field1109;

    @OriginalMember(owner = "client!ra", name = "l", descriptor = "I")
    public static int field1110;

    @OriginalMember(owner = "client!ra", name = "m", descriptor = "I")
    public static int field1111;

    @OriginalMember(owner = "client!ra", name = "n", descriptor = "I")
    public static int field1112;

    @OriginalMember(owner = "client!ra", name = "q", descriptor = "I")
    public static int field1115;

    @OriginalMember(owner = "client!ra", name = "r", descriptor = "I")
    public static int field1116;

    @OriginalMember(owner = "client!ra", name = "s", descriptor = "I")
    public static int field1117;

    @OriginalMember(owner = "client!ra", name = "t", descriptor = "I")
    public static int field1118;

    @OriginalMember(owner = "client!ra", name = "u", descriptor = "I")
    public static int field1119;

    @OriginalMember(owner = "client!ra", name = "p", descriptor = "[Lsa;")
    public static class174[] field1114;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILjava/lang/String;IIII)V", line = 5)
    public final void method534(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        field1104++;
        if (arg1 == null) {
            return;
        }
        this.method545(arg2, -1, arg4);
        this.method542((byte) 95, arg3, arg1, null, arg5 - this.field1108.method1241(arg1, (byte) 0) / 2, 0, null, null, 0);
        if (arg0 != 11740) {
            field1101 = -64;
        }
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(ILjava/lang/String;IIII)V", line = 22)
    public final void method535(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        field1102++;
        if (arg1 != null) {
            this.method545(arg2, -1, arg3);
            this.method542((byte) 127, arg5, arg1, null, arg4 - this.field1108.method1241(arg1, (byte) 0), arg0, null, null, 0);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILjava/lang/String;[Lha;IIII[I)V", line = 37)
    public final void method536(int arg0, String arg1, class52[] arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7) {
        field1105++;
        if (arg1 == null) {
            return;
        }
        if (arg0 != 28664) {
            method552(87);
        }
        this.method545(arg3, -1, arg6);
        this.method542((byte) 103, arg4, arg1, null, arg5, 0, arg2, arg7, 0);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIIIILjava/lang/String;)V", line = 53)
    public final void method537(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, String arg6) {
        field1106++;
        if (arg6 == null) {
            return;
        }
        this.method545(arg5, -1, arg4);
        int var8 = arg6.length();
        int[] var9 = new int[var8];
        if (arg1 == 5) {
            for (int var10 = 0; var10 < var8; var10++) {
                var9[var10] = (int) (Math.sin((double) arg3 / 5.0D + (double) var10 / 2.0D) * 5.0D);
            }
            this.method546(null, arg2 - (this.field1108.method1241(arg6, (byte) 0) / 2), arg0, 0, null, var9, null, arg6);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIILjava/lang/String;II)V", line = 82)
    public final void method538(int arg0, int arg1, int arg2, int arg3, String arg4, int arg5, int arg6) {
        field1099++;
        if (arg4 == null) {
            return;
        }
        this.method545(arg6, -1, arg5);
        int var8 = arg4.length();
        int[] var9 = new int[var8];
        int[] var10 = new int[var8];
        if (arg3 != 6294) {
            field1119 = 53;
        }
        for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = (int) (Math.sin((double) arg2 / 5.0D + (double) var11 / 5.0D) * 5.0D);
            var10[var11] = (int) (Math.sin((double) arg2 / 5.0D + (double) var11 / 3.0D) * 5.0D);
        }
        this.method546(null, arg0 - (this.field1108.method1241(arg4, (byte) 0) / 2), arg1, 0, var9, var10, null, arg4);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILjava/lang/String;)V", line = 115)
    private final void method539(int arg0, String arg1) {
        field1116++;
        try {
            if (arg0 == -5253) {
                if (arg1.startsWith("col=")) {
                    class88.field1071 = class88.field1071 & 0xFF000000 | class46.method243(-127, arg1.substring(4), 16) & 0xFFFFFF;
                } else if (arg1.equals("/col")) {
                    class88.field1071 = class88.field1071 & 0xFF000000 | class152.field1814 & 0xFFFFFF;
                }
                if (arg1.startsWith("argb=")) {
                    class88.field1071 = class46.method243(-124, arg1.substring(5), 16);
                } else if (arg1.equals("/argb")) {
                    class88.field1071 = class152.field1814;
                } else if (arg1.startsWith("str=")) {
                    class585.field8498 = class88.field1071 & 0xFF000000 | class46.method243(-125, arg1.substring(4), 16);
                } else if (arg1.equals("str")) {
                    class585.field8498 = class88.field1071 & 0xFF000000 | 0x800000;
                } else if (arg1.equals("/str")) {
                    class585.field8498 = -1;
                } else if (arg1.startsWith("u=")) {
                    class328.field4279 = class88.field1071 & 0xFF000000 | class46.method243(-125, arg1.substring(2), 16);
                } else if (arg1.equals("u")) {
                    class328.field4279 = class88.field1071 & 0xFF000000;
                } else if (arg1.equals("/u")) {
                    class328.field4279 = -1;
                } else if (arg1.equalsIgnoreCase("shad=-1")) {
                    class376.field5016 = 0;
                } else if (arg1.startsWith("shad=")) {
                    class376.field5016 = class88.field1071 & 0xFF000000 | class46.method243(-123, arg1.substring(5), 16);
                } else if (arg1.equals("shad")) {
                    class376.field5016 = class88.field1071 & 0xFF000000;
                } else if (arg1.equals("/shad")) {
                    class376.field5016 = class535.field7508;
                    return;
                } else if (arg1.equals("br")) {
                    this.method545(class535.field7508, -1, class152.field1814);
                    return;
                }
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IILjava/lang/String;IIZ)V", line = 195)
    public final void method540(int arg0, int arg1, String arg2, int arg3, int arg4, boolean arg5) {
        field1115++;
        if (arg2 == null) {
            return;
        }
        this.method545(arg4, -1, arg0);
        if (arg5) {
            field1101 = 0;
        }
        this.method542((byte) 110, arg1, arg2, null, arg3, 0, null, null, 0);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(BILjava/lang/String;Lpa;II[Lha;[II)V", line = 213)
    private final void method542(byte arg0, int arg1, String arg2, class309 arg3, int arg4, int arg5, class52[] arg6, int[] arg7, int arg8) {
        int var10 = arg1 - this.field1108.field2632;
        if (arg0 <= 91) {
            this.method543('&', 102, -47, 80, true, null, 106, 72);
        }
        field1107++;
        int var11 = -1;
        int var12 = -1;
        int var13 = arg2.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class313.method1736(arg2.charAt(var14), (byte) -110) & 0xFF);
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
                                    int var17 = class232.method1325(var16.substring(4), 0);
                                    class52 var18 = arg6[var17];
                                    int var19 = arg7 == null ? var18.method286() : arg7[var17];
                                    if ((class88.field1071 & 0xFF000000) == -16777216) {
                                        var18.method3(arg4, var10 + this.field1108.field2632 - var19, 1, 0, 1);
                                    } else {
                                        var18.method3(arg4, this.field1108.field2632 + var10 - var19, 0, class88.field1071 & 0xFF000000 | 0xFFFFFF, 1);
                                    }
                                    arg4 += arg6[var17].method292();
                                    var12 = -1;
                                } catch (Exception var21) {
                                }
                            } else {
                                this.method539(-5253, var16);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var11 == -1) {
                    if (var12 != -1) {
                        arg4 += this.field1108.method1236(var15, (byte) -105, var12);
                    }
                    if (var15 == ' ') {
                        if (class81.field977 > 0) {
                            class274.field3570 += class81.field977;
                            arg4 += class274.field3570 >> 8;
                            class274.field3570 &= 0xFF;
                        }
                    } else if (arg3 == null) {
                        if ((class376.field5016 & 0xFF000000) != 0) {
                            this.method541(var15, arg4 + 1, var10 + 1, class376.field5016, true);
                        }
                        this.method541(var15, arg4, var10, class88.field1071, false);
                    } else {
                        if ((class376.field5016 & 0xFF000000) != 0) {
                            this.method543(var15, arg4 + 1, var10 + 1, class376.field5016, true, arg3, arg8, arg5);
                        }
                        this.method543(var15, arg4, var10, class88.field1071, false, arg3, arg8, arg5);
                    }
                    int var20 = this.field1108.method1240(255, var15);
                    if (class585.field8498 != -1) {
                        this.field1113.method1115(var20, class585.field8498, (int) ((double) this.field1108.field2632 * 0.7D) + var10, arg4, true);
                    }
                    if (class328.field4279 != -1) {
                        this.field1113.method1115(var20, class328.field4279, this.field1108.field2632 + var10 + 1, arg4, true);
                    }
                    arg4 += var20;
                    var12 = var15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "([II[Lha;Ljava/lang/String;IILjava/util/Random;III)I", line = 369)
    public final int method544(int[] arg0, int arg1, class52[] arg2, String arg3, int arg4, int arg5, Random arg6, int arg7, int arg8, int arg9) {
        field1110++;
        if (arg3 == null) {
            return 0;
        }
        arg6.setSeed((long) arg8);
        int var11 = (arg6.nextInt() & 0x1F) + 192;
        this.method545(arg1 & 0xFFFFFF | var11 << 24, -1, var11 << 24 | arg9 & 0xFFFFFF);
        int var12 = arg3.length();
        int var13 = -78 % ((25 - arg5) / 62);
        int[] var14 = new int[var12];
        int var15 = 0;
        for (int var16 = 0; var16 < var12; var16++) {
            var14[var16] = var15;
            if ((arg6.nextInt() & 0x3) == 0) {
                var15++;
            }
        }
        this.method546(arg2, arg4, arg7, 0, var14, null, arg0, arg3);
        return var15;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(III)V", line = 407)
    private final void method545(int arg0, int arg1, int arg2) {
        class274.field3570 = 0;
        field1111++;
        if (arg0 == arg1) {
            arg0 = 0;
        }
        class152.field1814 = arg2;
        class88.field1071 = arg2;
        class585.field8498 = -1;
        class328.field4279 = -1;
        class81.field977 = 0;
        class535.field7508 = arg0;
        class376.field5016 = arg0;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "([Lha;III[I[I[ILjava/lang/String;)V", line = 427)
    private final void method546(class52[] arg0, int arg1, int arg2, int arg3, int[] arg4, int[] arg5, int[] arg6, String arg7) {
        field1118++;
        int var9 = arg2 - this.field1108.field2632;
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        int var13 = arg7.length();
        for (int var14 = arg3; var14 < var13; var14++) {
            char var15 = (char) (class313.method1736(arg7.charAt(var14), (byte) -110) & 0xFF);
            if (var15 == '<') {
                var10 = var14;
            } else {
                if (var15 == '>' && var10 != -1) {
                    String var16 = arg7.substring(var10 + 1, var14);
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
                                    if (arg5 == null) {
                                        var18 = 0;
                                    } else {
                                        var18 = arg5[var12];
                                    }
                                    var12++;
                                    int var19 = class232.method1325(var16.substring(4), 0);
                                    class52 var20 = arg0[var19];
                                    int var21 = arg6 == null ? var20.method286() : arg6[var19];
                                    var20.method3(arg1 + var17, this.field1108.field2632 + var9 + -var21 - -var18, 1, 0, 1);
                                    var11 = -1;
                                    arg1 += arg0[var19].method292();
                                } catch (Exception var25) {
                                }
                            } else {
                                this.method539(arg3 - 5253, var16);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var10 == -1) {
                    if (var11 != -1) {
                        arg1 += this.field1108.method1236(var15, (byte) -105, var11);
                    }
                    int var22;
                    if (arg4 == null) {
                        var22 = 0;
                    } else {
                        var22 = arg4[var12];
                    }
                    int var23;
                    if (arg5 == null) {
                        var23 = 0;
                    } else {
                        var23 = arg5[var12];
                    }
                    var12++;
                    if (var15 != ' ') {
                        if ((class376.field5016 & 0xFF000000) != 0) {
                            this.method541(var15, arg1 - (-var22 - 1), var9 + var23 - -1, class376.field5016, true);
                        }
                        this.method541(var15, arg1 + var22, var9 + var23, class88.field1071, false);
                    } else if (class81.field977 > 0) {
                        class274.field3570 += class81.field977;
                        arg1 += class274.field3570 >> 8;
                        class274.field3570 &= 0xFF;
                    }
                    int var24 = this.field1108.method1240(255, var15);
                    if (class585.field8498 != -1) {
                        this.field1113.method1115(var24, class585.field8498, (int) ((double) this.field1108.field2632 * 0.7D) + var9, arg1, true);
                    }
                    if (class328.field4279 != -1) {
                        this.field1113.method1115(var24, class328.field4279, this.field1108.field2632 + var9, arg1, true);
                    }
                    var11 = var15;
                    arg1 += var24;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILjava/lang/String;IBI[I[IIIIII[Lha;Ljava/util/Random;I)I", line = 587)
    public final int method547(int arg0, String arg1, int arg2, byte arg3, int arg4, int[] arg5, int[] arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class52[] arg12, Random arg13, int arg14) {
        field1103++;
        if (arg1 == null) {
            return 0;
        }
        arg13.setSeed((long) arg4);
        int var16 = (arg13.nextInt() & 0x1F) + 192;
        this.method545(arg10 & 0xFFFFFF | var16 << 24, -1, var16 << 24 | arg8 & 0xFFFFFF);
        int var17 = arg1.length();
        int[] var18 = new int[var17];
        int var19 = 0;
        for (int var20 = 0; var20 < var17; var20++) {
            var18[var20] = var19;
            if ((arg13.nextInt() & 0x3) == 0) {
                var19++;
            }
        }
        if (arg3 != 11) {
            field1114 = null;
        }
        int var21 = arg0;
        int var22 = arg7 + this.field1108.field2634;
        if (arg9 == 1) {
            var22 += (arg11 - this.field1108.field2634 - this.field1108.field2624) / 2;
        } else if (arg9 == 2) {
            var22 = arg7 + arg11 - this.field1108.field2624;
        }
        int var23 = -1;
        if (arg2 == 1) {
            var23 = this.field1108.method1241(arg1, (byte) 0) + var19;
            var21 = (arg14 - var23) / 2 + arg0;
        } else if (arg2 == 2) {
            var23 = this.field1108.method1241(arg1, (byte) 0) + var19;
            var21 = arg14 + arg0 - var23;
        }
        this.method546(arg12, var21, var22, 0, var18, null, arg5, arg1);
        if (arg6 != null) {
            if (var23 == -1) {
                var23 = this.field1108.method1241(arg1, (byte) 0) + var19;
            }
            arg6[2] = var23;
            arg6[1] = var22 - this.field1108.field2634;
            arg6[0] = var21;
            arg6[3] = this.field1108.field2634 + this.field1108.field2624;
        }
        return var19;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ljava/lang/String;IIIIIII)V", line = 667)
    public final void method548(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1117++;
        if (arg0 == null) {
            return;
        }
        this.method545(arg1, -1, arg6);
        double var9 = 7.0D - (double) arg3 / 8.0D;
        if (var9 < 0.0D) {
            var9 = 0.0D;
        }
        int var11 = arg0.length();
        int var12 = 41 / ((arg4 - 76) / 46);
        int[] var13 = new int[var11];
        for (int var14 = 0; var14 < var11; var14++) {
            var13[var14] = (int) (var9 * Math.sin((double) var14 / 1.5D + (double) arg7));
        }
        this.method546(null, arg2 - this.field1108.method1241(arg0, (byte) 0) / 2, arg5, 0, null, var13, null, arg0);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lpa;I[Lha;IIIIILjava/lang/String;II[IIIIII)I", line = 700)
    public final int method549(class309 arg0, int arg1, class52[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, String arg8, int arg9, int arg10, int[] arg11, int arg12, int arg13, int arg14, int arg15, int arg16) {
        field1100++;
        if (arg8 == null) {
            return 0;
        }
        this.method545(arg4, -1, arg16);
        if (arg6 == 0) {
            arg6 = this.field1108.field2632;
        }
        int[] var18;
        if ((this.field1108.field2634 + this.field1108.field2624 + arg6) > arg7 && (arg6 + arg6) > arg7) {
            var18 = null;
        } else {
            var18 = new int[] { arg14 };
        }
        if (arg13 == -1) {
            arg13 = arg7 / arg6;
            if (arg13 <= 0) {
                arg13 = 1;
            }
        }
        int var19 = this.field1108.method1242(arg8, class326.field4162, arg2, (byte) 50, var18);
        if (arg13 > 0 && arg13 <= var19) {
            var19 = arg13;
            class326.field4162[arg13 - 1] = this.field1108.method1243(114, class326.field4162[arg13 - 1], arg2, arg14);
        }
        if (arg3 != 6832) {
            field1114 = null;
        }
        if (arg12 == 3 && var19 == 1) {
            arg12 = 1;
        }
        int var20;
        if (arg12 == 0) {
            var20 = arg5 + this.field1108.field2634;
        } else if (arg12 == 1) {
            var20 = arg5 + ((arg7 - this.field1108.field2624 - this.field1108.field2634 - ((var19 - 1) * arg6)) / 2) + this.field1108.field2634;
        } else if (arg12 == 2) {
            var20 = arg5 + arg7 - ((var19 + -1) * arg6) - this.field1108.field2624;
        } else {
            int var21 = (arg7 - this.field1108.field2634 - (this.field1108.field2624 + ((var19 - 1) * arg6))) / (var19 + 1);
            if (var21 < 0) {
                var21 = 0;
            }
            var20 = this.field1108.field2634 + var21 + arg5;
            arg6 += var21;
        }
        for (int var22 = 0; var22 < var19; var22++) {
            if (arg15 == 0) {
                this.method542((byte) 97, var20, class326.field4162[var22], arg0, arg9, arg1, arg2, arg11, arg10);
            } else if (arg15 == 1) {
                this.method542((byte) 114, var20, class326.field4162[var22], arg0, arg9 + (arg14 - this.field1108.method1241(class326.field4162[var22], (byte) 0)) / 2, arg1, arg2, arg11, arg10);
            } else if (arg15 == 2) {
                this.method542((byte) 121, var20, class326.field4162[var22], arg0, arg9 + arg14 - this.field1108.method1241(class326.field4162[var22], (byte) 0), arg1, arg2, arg11, arg10);
            } else if ((var19 - 1) == var22) {
                this.method542((byte) 113, var20, class326.field4162[var22], arg0, arg9, arg1, arg2, arg11, arg10);
            } else {
                this.method551(class326.field4162[var22], arg14, (byte) 104);
                this.method542((byte) 106, var20, class326.field4162[var22], arg0, arg9, arg1, arg2, arg11, arg10);
                class81.field977 = 0;
            }
            var20 += arg6;
        }
        return var19;
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Lqa;Lfc;)V", line = 800)
    public class90(class206 arg0, class216 arg1) {
        this.field1113 = arg0;
        this.field1108 = arg1;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "([Lha;I[IILpa;Ljava/lang/String;IIIZIIIIII)I", line = 809)
    public final int method550(class52[] arg0, int arg1, int[] arg2, int arg3, class309 arg4, String arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
        field1112++;
        if (!arg9) {
            this.field1113 = null;
        }
        return this.method549(arg4, arg7, arg0, 6832, arg10, arg1, arg14, arg6, arg5, arg12, arg8, arg2, arg15, 0, arg11, arg3, arg13);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ljava/lang/String;IB)V", line = 822)
    private final void method551(String arg0, int arg1, byte arg2) {
        field1109++;
        int var4 = 6 % ((arg2 - 8) / 54);
        int var5 = 0;
        boolean var6 = false;
        for (int var7 = 0; arg0.length() > var7; var7++) {
            char var8 = arg0.charAt(var7);
            if (var8 == '<') {
                var6 = true;
            } else if (var8 == '>') {
                var6 = false;
            } else if (!var6 && var8 == ' ') {
                var5++;
            }
        }
        if (var5 > 0) {
            class81.field977 = (arg1 - this.field1108.method1241(arg0, (byte) 0) << 8) / var5;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V", line = 864)
    public static void method552(int arg0) {
        field1114 = null;
        if (arg0 >= -6) {
            method552(-59);
        }
    }

    @OriginalMember(owner = "client!ra", name = "HA", descriptor = "(CIIIZ)V")
    public abstract void method541(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(CIIIZLpa;II)V")
    public abstract void method543(char arg0, int arg1, int arg2, int arg3, boolean arg4, class309 arg5, int arg6, int arg7);
}
